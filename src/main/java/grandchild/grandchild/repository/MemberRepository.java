package grandchild.grandchild.repository;

import grandchild.grandchild.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
