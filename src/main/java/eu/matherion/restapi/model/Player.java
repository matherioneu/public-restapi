package eu.matherion.restapi.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@Getter
@Setter
@Entity(name = "matherion_player")
public class Player {

    @Id
    private String uuid;
    private String nickname;
    private int coins;
    @Column(name = "last_dailyreward")
    private int lastDailyReward;
    @Column(name = "common_crates")
    private int commonCrates;
    @Column(name = "uncommon_crates")
    private int uncommonCrates;
    @Column(name = "rare_crates")
    private int rareCrates;
    @Column(name = "legendary_crates")
    private int legendaryCrates;
    @Column(name = "summer_crates")
    private int summerCrates;
    @Column(name = "summer_heads")
    private String summerHeads;
}
