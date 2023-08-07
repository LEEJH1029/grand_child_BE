package grandchild.grandchild.controller;


import grandchild.grandchild.service.VideoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app/video")
@RequiredArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class VideoController {
    private final VideoService videoService;

    @GetMapping("/test")
    public ResponseEntity<String> test() {
        String result = "testd 33tffft성공";
        return ResponseEntity.ok(result);
    }

    @GetMapping("/testgitactions")
    public ResponseEntity<String> test2() {
        String result = "test complete";
        return ResponseEntity.ok(result);
    }
}
