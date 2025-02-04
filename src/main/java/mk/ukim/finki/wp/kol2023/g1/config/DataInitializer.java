package mk.ukim.finki.wp.kol2023.g1.config;


/*import jakarta.annotation.PostConstruct;
import mk.ukim.finki.wp.kol2023.g1.model.PlayerPosition;
import mk.ukim.finki.wp.kol2023.g1.service.TeamService;
import mk.ukim.finki.wp.kol2023.g1.service.PlayerService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class DataInitializer {

    private final TeamService teamService;
    private final PlayerService playerService;

    public DataInitializer(TeamService teamService, PlayerService playerService) {
        this.teamService = teamService;
        this.playerService = playerService;
    }

    private PlayerPosition randomizePosition(int i) {
        if(i % 3 == 0) return PlayerPosition.G;
        else if(i % 3 == 1) return PlayerPosition.F;
        return PlayerPosition.C;
    }

    @PostConstruct
    @Transactional // Ensure transactional consistency
    public void initData() {
        // Create teams
        for (int i = 1; i < 6; i++) {
            this.teamService.create("Team: " + i);
        }

        // Create players and assign them to teams
        for (int i = 1; i < 11; i++) {
            this.playerService.create(
                    "Player: " + i,
                    "Bio: " + i,
                    20.9 * i,
                    this.randomizePosition(i),
                    this.teamService.listAll().get((i - 1) % 5).getId()
            );
        }
    }
}
*/