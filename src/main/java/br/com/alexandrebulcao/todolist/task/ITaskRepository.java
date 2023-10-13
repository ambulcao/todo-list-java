package br.com.alexandrebulcao.todolist.task;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.scheduling.config.Task;

public interface ITaskRepository extends JpaRepository<TaskModel, UUID> {
  
}
