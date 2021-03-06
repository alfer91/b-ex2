package org.zerock.bex2.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.annotation.Commit;
import org.zerock.bex2.entity.Memo;

import javax.transaction.Transactional;
import java.util.List;

@SpringBootTest
class MemoRepositoryTest {

    @Autowired
    MemoRepository memoRepository;

    /*@Test
    public void testClass() {
        System.out.println(memoRepository.getClass().getName());
    }*/

    /*@Test
    public void testInsertDummies() {
        IntStream.rangeClosed(1,100).forEach(i -> {
            Memo memo = Memo.builder().memoText("Sample..."+i).build();
            memoRepository.save(memo);
        });
    }*/

    /*@Test
    public void testSelect() {

        //데이터베이스에 존재하는 mno
        Long mno = 100L;

        Optional<Memo> result = memoRepository.findById(mno);

        System.out.println("==============================");

        if(result.isPresent()) {
            Memo memo = result.get();
            System.out.println(memo);
        }
    }*/

    /*@Transactional
    @Test
    public void testSelect2() {

        Long mno = 100L;

        Memo memo = memoRepository.getOne(mno);

        System.out.println("===============================");
        System.out.println(memo);
    }*/

    /*@Test
    public void testUpdate() {

        Memo memo = Memo.builder().mno(100L).memoText("Update Text").build();

        System.out.println(memoRepository.save(memo));
    }*/

    /*@Test
    public void testDelete() {
        Long mno = 100L;

        memoRepository.deleteById(mno);
    }*/

    /*@Test
    public void testPageDefault() {

        //1페이지 10개
        Pageable pageable = PageRequest.of(0,10);

        Page<Memo> result = memoRepository.findAll(pageable);

        System.out.println(result);

        System.out.println("---------------------------------");

        System.out.println("Total Pages: " + result.getTotalPages()); // 총 몇 페이지

        System.out.println("Total Count: " + result.getTotalElements()); // 전체 개수

        System.out.println("Page Number: " + result.getNumber()); // 현재 페이지 번호 0부터 시작

        System.out.println("Page Size: " + result.getSize()); // 페이지당 데이터 개수

        System.out.println("has next page?: " + result.hasNext()); // 다음 페이지 존재 여부

        System.out.println("first page?: " + result.isFirst()); // 시작 페이지(0) 여부
    }*/

    /*@Test
    public void testSort() {

        Sort sort1 = Sort.by("mno").descending();
        Sort sort2 = Sort.by("memoText").ascending();
        Sort sortAll = sort1.and(sort2);

        Pageable pageable = PageRequest.of(0,10,sortAll);

        Page<Memo> result = memoRepository.findAll(pageable);

        result.get().forEach(memo -> {
            System.out.println(memo);
        });
    }*/

    /*@Test
    public void testQueryMethods() {
        List<Memo> list = memoRepository.
                findByMnoBetweenOrderByMnoDesc(70L,80L);

        for(Memo memo : list) {
            System.out.println(memo);
        }
    }*/

    /*@Test
    public void testQueryMethodWithPageable() {

        Pageable pageable = PageRequest.of(0, 10, Sort.by("mno").descending());

        Page<Memo> result = memoRepository.findByMnoBetween(10L,50L, pageable);

        result.get().forEach(memo -> System.out.println(memo));
    }*/

    /*@Commit
    @Transactional
    @Test
    public void testDeleteQueryMethods() {

        memoRepository.deleteMemoByMnoLessThan(10L);
    }*/

    @Test
    public void testQueryAnnotation() {
        /*List<Memo> list = memoRepository.getListDesc();

        list.forEach(memo -> System.out.println(memo));*/

        //memoRepository.updateMemoText(10L, "modify10");

        /*Memo memo = new Memo(10L, "modify2 10");
        memoRepository.updateMemoText2(memo);*/

        /*Pageable pageable = PageRequest.of(1, 10);
        Page<Memo> result = memoRepository.getListWithQuery(50L, pageable);
        result.get().forEach(memo -> System.out.println(memo));*/

        /*Pageable pageable = PageRequest.of(1, 10);
        Page<Object[]> result = memoRepository.getListWithQueryObject(40L, pageable);
        result.get().forEach(memo -> System.out.println(memo[0] + " " + memo[1] + " " + memo[2]));*/

        /*List<Object[]> list = memoRepository.getNativeResult();
        list.forEach(memo -> System.out.println(memo[0] + " " + memo[1]));*/

        List<Memo> list = memoRepository.getNativeResult2();
        list.forEach(memo -> System.out.println(memo));
    }
}