package eu.matherion.restapi.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Integer> {

    Player findByNickname(String nickname);

}
