package com.geega.bsc.id.common.network;

import java.io.IOException;
import java.nio.channels.ScatteringByteChannel;

/**
 * This interface models the in-progress reading of data from a channel to a source identified by an integer id
 */
public interface Receive {

    /**
     * The numeric id of the source from which we are receiving data.
     */
    public String source();

    /**
     * Are we done receiving data?
     */
    public boolean complete();

    /**
     * Read bytes into this receive from the given channel
     * @param channel The channel to read from
     * @return The number of bytes read
     * @throws IOException If the reading fails
     */
    public long readFrom(ScatteringByteChannel channel) throws IOException;

}