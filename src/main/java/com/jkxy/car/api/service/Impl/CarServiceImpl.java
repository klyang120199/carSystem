package com.jkxy.car.api.service.Impl;

import com.jkxy.car.api.dao.CarDao;
import com.jkxy.car.api.pojo.Car;
import com.jkxy.car.api.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("carService")
public class CarServiceImpl implements CarService {
    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> findAll() {
        return carDao.findAll();
    }

    @Override
    public Car findById(int id) {
        return carDao.findById(id);
    }

    @Override
    public List<Car> findByCarName(String carName) {
        return carDao.findByCarName(carName);
    }

    @Override
    public void deleteById(int id) {
        carDao.deleteById(id);
    }

    @Override
    public void updateById(Car car) {
        carDao.updateById(car);
    }

    @Override
    public void insertCar(Car car) {
        carDao.insertCar(car);
    }

    @Override
    public void buyCar(Car car) throws Exception{
        int num = carDao.buyCar(car);
        if (num == 0) {
            throw new Exception("库存不足，请购买其他种类车辆！");
        }
    }

    @Override
    public List<Car> searchByCarName(Car car) {
        if (car.getBeginNum() != 0) {
            car.setBeginNum(car.getBeginNum()-1);
        }
        return carDao.searchByCarName(car);
    }
}
