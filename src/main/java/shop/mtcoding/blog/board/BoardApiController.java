package shop.mtcoding.blog.board;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//  ajax 통신을 위한 Controller
@RestController
@RequiredArgsConstructor
public class BoardApiController {
    private final BoardRepository boardRepository;

    @GetMapping("/api/boards")  // 복수형을 많이 쓴다. 보드'들'줘~
    public ApiUtil<List<Board>>findAll(){
        List<Board> boardList = boardRepository.selectAll();
        return new ApiUtil<>(boardList);
    }
}