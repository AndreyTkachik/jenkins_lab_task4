package org.example;

import java.util.*;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarGarageTest {

    @Test
    void TestAllCarsUniqueOwnersTest() {
        CarGarage carGarage = new CarGarage();
        Collection<Owner> owners = new HashSet<>();
        Car tmp_car = new Car(1,"A", "A", 1, 1, 1);
        Owner tmp_owner1 = new Owner("A", "A", 1, 1);
        owners.add(tmp_owner1);
        carGarage.addNewCar(tmp_car, tmp_owner1);
        tmp_car = new Car(15,"dfsfA", "Aadadadad", 120, 25, 1);
        carGarage.addNewCar(tmp_car, tmp_owner1);
        Collection<Owner> temp = carGarage.allCarsUniqueOwners();
        assertThat(temp).containsExactlyInAnyOrderElementsOf(owners);
    }

    @Test
    void TestTopThreeCarsByMaxVelocityTest() {
        CarGarage carGarage = new CarGarage();
        Collection<Car> cars = new ArrayList<>();
        Car tmp_car = new Car(1,"A", "A", 1, 1, 1);
        Owner tmp_owner = new Owner("A", "A", 1, 1);
        carGarage.addNewCar(tmp_car, tmp_owner);
        cars.add(tmp_car);
        tmp_car = new Car(222,"222A", "A", 200, 200, 114);
        tmp_owner = new Owner("A", "A", 1, 114);
        carGarage.addNewCar(tmp_car, tmp_owner);
        cars.add(tmp_car);
        assertThat(carGarage.topThreeCarsByMaxVelocity()).containsExactlyInAnyOrderElementsOf(cars);
    }

    @Test
    void TestAllCarsOfBrandTest() {
        CarGarage carGarage = new CarGarage();
        Collection<Car> cars = new HashSet<>();
        Car tmp_car = new Car(1,"A", "A", 1, 1, 1);
        Owner tmp_owner = new Owner("A", "A", 1, 1);
        carGarage.addNewCar(tmp_car, tmp_owner);
        tmp_car = new Car(2,"dfsfA", "sdfsdfA", 100, 145, 12);
        tmp_owner = new Owner("A1313", "A", 1, 12);
        cars.add(tmp_car);
        carGarage.addNewCar(tmp_car, tmp_owner);
        Collection<Car> temp = carGarage.allCarsOfBrand("dfsfA");
        assertThat(temp).containsExactlyInAnyOrderElementsOf(cars);
    }

    @Test
    void TestCarsWithPowerMoreThanTest() {
        Collection<Car> cars = new HashSet<>();
        CarGarage carGarage = new CarGarage();
        Car tmp_car = new Car(1,"A", "A", 1, 1, 1);
        Owner tmp_owner = new Owner("A", "A", 1, 1);
        carGarage.addNewCar(tmp_car, tmp_owner);
        tmp_car = new Car(2,"dfsfA", "sdfsdfA", 100, 145, 12);
        tmp_owner = new Owner("A1313", "A", 1, 12);
        cars.add(tmp_car);
        carGarage.addNewCar(tmp_car, tmp_owner);
        Collection<Car> temp = carGarage.carsWithPowerMoreThan(115);
        assertThat(temp).containsExactlyInAnyOrderElementsOf(cars);
    }

    @Test
    void TestAllCarsOfOwnerTest() {
        CarGarage carGarage = new CarGarage();
        Collection<Car> cars = new HashSet<>();
        Car tmp_car = new Car(1,"A", "A", 1, 1, 1);
        Owner tmp_owner = new Owner("A", "A", 1, 1);
        carGarage.addNewCar(tmp_car, tmp_owner);
        tmp_car = new Car(114,"A", "Aweq", 114, 111, 13);
        tmp_owner = new Owner("A54", "A", 1, 13);
        carGarage.addNewCar(tmp_car, tmp_owner);
        cars.add(tmp_car);
        Collection<Car> temp = carGarage.allCarsOfOwner(tmp_owner);
        assertThat(temp).containsExactlyInAnyOrderElementsOf(cars);
    }

    @Test
    void TestMeanOwnersAgeOfCarBrandTest() {
        CarGarage carGarage = new CarGarage();
        Car tmp_car = new Car(1,"A", "A", 1, 1, 1);
        Owner tmp_owner = new Owner("A", "A", 14, 1);
        carGarage.addNewCar(tmp_car, tmp_owner);
        tmp_car = new Car(15,"dfsfA", "Aadadadad", 120, 25, 1);
        tmp_owner = new Owner("A", "A", 14, 1);
        carGarage.addNewCar(tmp_car, tmp_owner);
        assertEquals(carGarage.meanOwnersAgeOfCarBrand("dfsfA"), 14);
    }

    @Test
    void TestMeanCarNumberForEachOwnerTest() {
        CarGarage carGarage = new CarGarage();
        Car tmp_car = new Car(1,"A", "A", 1, 1, 1);
        Owner tmp_owner = new Owner("A", "A", 1, 1);
        carGarage.addNewCar(tmp_car, tmp_owner);
        tmp_car = new Car(2,"dfsfA", "sdfsdfA", 100, 145, 12);
        tmp_owner = new Owner("A1313", "A", 1, 12);
        carGarage.addNewCar(tmp_car, tmp_owner);
        assertEquals(carGarage.meanCarNumberForEachOwner() ,1);
    }

    @Test
    void TestRemoveCarTest() {
        CarGarage carGarage = new CarGarage();
        Car tmp_car = new Car(1,"A", "A", 1, 1, 1);
        Owner tmp_owner = new Owner("A", "A", 1, 1);
        carGarage.addNewCar(tmp_car, tmp_owner);
        tmp_car = new Car(222,"222A", "A", 200, 200, 114);
        tmp_owner = new Owner("A", "A", 1, 114);
        carGarage.addNewCar(tmp_car, tmp_owner);
        assertEquals(carGarage.removeCar(222), tmp_car);
    }

    @Test
    void TestAddNewCarTest() {
        CarGarage carGarage1 = new CarGarage();
        CarGarage carGarage2 = new CarGarage();
        Car tmp_car = new Car(1,"A", "A", 1, 1, 1);
        Owner tmp_owner = new Owner("A", "A", 1, 1);
        carGarage1.addNewCar(tmp_car, tmp_owner);
        carGarage2.addNewCar(tmp_car, tmp_owner);
        tmp_car = new Car(2,"dfsfA", "sdfsdfA", 100, 145, 12);
        tmp_owner = new Owner("A1313", "A", 1, 12);
        carGarage1.addNewCar(tmp_car, tmp_owner);
        carGarage2.addNewCar(tmp_car, tmp_owner);
        assertThat(carGarage1.topThreeCarsByMaxVelocity())
                .containsExactlyInAnyOrderElementsOf(carGarage2.topThreeCarsByMaxVelocity());
    }
}