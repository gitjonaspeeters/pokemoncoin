package PokemonCoin.RestAPI.Repo;


import PokemonCoin.RestAPI.Model.Pokemoncoin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoinRepo extends JpaRepository<Pokemoncoin, Long> {
}
