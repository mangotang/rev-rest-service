package org.snb.rev;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by steven on 7/30/16.
 */
@RestController
public class ReverserController {

    @RequestMapping(value = "/reversed-strings/{str}", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
    public String reverse(@PathVariable(value="str") final String str) {

        final String reversedWord = (new StringBuilder(str)).reverse().toString();

        return reversedWord;
    }
}
