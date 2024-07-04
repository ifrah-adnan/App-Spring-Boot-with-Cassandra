package adnan.springboot_cassandra.repositories;

import adnan.springboot_cassandra.entities.User;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * @author Dell Latitude 5420
 * IFRAH ADNAN
 **/
@Repository
public interface UserRepositorie extends CassandraRepository<User, UUID> {
}
