package pl.joegreen.sergeants.simulator.viewer;

import pl.joegreen.sergeants.simulator.GameMap;

public interface ViewerWriter extends AutoCloseable{
    void write(GameMap gameMap);

    void close();
}
