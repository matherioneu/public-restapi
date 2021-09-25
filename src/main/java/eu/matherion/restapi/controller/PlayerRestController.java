package eu.matherion.restapi.controller;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import eu.matherion.restapi.model.Player;
import eu.matherion.restapi.model.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class PlayerRestController {

    private final PlayerRepository playerRepository;

    public PlayerRestController(@Autowired PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @GetMapping("")
    public ResponseEntity<String> index() {
        return ResponseEntity.ok("API is running.");
    }

    @GetMapping("/player/{name}")
    public ResponseEntity<Player> players(@PathVariable(name = "name") String name) {
        return ResponseEntity.ok(playerRepository.findByNickname(name));
    }
}
