package com.example.Assignment.Service;

import com.example.Assignment.Model.Task;
import com.example.Assignment.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService
{
    @Autowired
    private TaskRepository taskRepository;
    public List<Task> findAll() {
        return taskRepository.findAll();
    }
    public Task findById(int theId) {
        Optional<Task> result = taskRepository.findById(theId);

        Task theEmployee = null;

        if (result.isPresent()) {
            theEmployee = result.get();
        }
        else {
            // we didn't find the employee
            throw new RuntimeException("Did not find employee id - " + theId);
        }

        return theEmployee;
    }


    public Task save(Task theEmployee) {
        return taskRepository.save(theEmployee);
    }


    public void deleteById(int theId) {
        taskRepository.deleteById(theId);
    }
}
