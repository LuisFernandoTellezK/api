package com.example.Tellez.Repository;

     import com.example.Tellez.Entity.Local;
     import org.springframework.data.jpa.repository.JpaRepository;
     import org.springframework.stereotype.Repository;

     @Repository
     public interface LocalRepository extends JpaRepository<Local, Long> {
     }