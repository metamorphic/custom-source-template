package cxp.ingest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by markmo on 12/07/2015.
 */
public class LineSplitter {

    public List<String> process(String line) throws Exception {
        if (line == null || line.isEmpty()) return new ArrayList<>();
        return Arrays.asList(line.split("\\s+"));
    }
}
