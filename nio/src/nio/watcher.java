/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nio;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardWatchEventKinds.ENTRY_CREATE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_DELETE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_MODIFY;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

/**
 *
 * @author student
 */
public class watcher {
    public static void main(String[] args) throws IOException, InterruptedException {
    WatchService watcher = FileSystems.getDefault().newWatchService();
    Path dir =Paths.get("E:");
     dir.register(watcher, ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY);
        System.out.println("Watch Service registered for dir: " + dir.getFileName());
        while (true){
           WatchKey key;
            key = watcher.take();
            System.out.println(key);
            for (WatchEvent<?> event : key.pollEvents()) {
                WatchEvent.Kind<?> kind = event.kind();
                WatchEvent<Path> ev = (WatchEvent<Path>) event;
                Path fileName = ev.context();
                System.out.println(kind.name() + ": " + fileName);
            }
              boolean valid = key.reset();
            if (!valid) {
                break;
            }
        }
    }
}
