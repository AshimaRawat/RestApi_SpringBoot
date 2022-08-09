package CoolBlueAssignment.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import CoolBlueAssignment.Models.User;


public interface UserRepo extends JpaRepository<User, Integer> {
    
}
