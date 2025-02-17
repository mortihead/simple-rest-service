package ru.ibs.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import ru.ibs.entity.Car;
import ru.ibs.repository.CarRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class CarService {

    private final CarRepository carRepository;
    private static final Logger eventLogger = LogManager.getLogger("DatabaseLogger");

    public List<Car> findAll() {
        log.info("=> find all");
        eventLogger.info("Find all start");
        List<Car> result = carRepository.findAll();
        eventLogger.info("Find all success");
        return result;
    }

    public Optional<Car> findById(Integer id) {
        Optional<Car> result = carRepository.findById(id);
        if (result.isPresent()) {
            eventLogger.info("Find car by id {} success!", id);
        } else {
            eventLogger.warn("Find car by id {} fail!", id);
        }
        return result;
    }

    public Car save(Car car) {
        return carRepository.save(car);
    }

    public void deleteById(Integer id) {
        carRepository.deleteById(id);
    }
}