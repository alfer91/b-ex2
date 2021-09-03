package org.zerock.bex2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.bex2.entity.Memo;

public interface MemoRepository extends JpaRepository<Memo, Long> {
}
