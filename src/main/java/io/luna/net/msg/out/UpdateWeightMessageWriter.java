package io.luna.net.msg.out;

import io.luna.game.model.mobile.Player;
import io.luna.net.codec.ByteMessage;
import io.luna.net.msg.MessageWriter;

/**
 * An {@link MessageWriter} implementation that sends the weight value to the client.
 *
 * @author lare96 <http://github.org/lare96>
 */
public final class UpdateWeightMessageWriter extends MessageWriter {

    /**
     * The weight value to send.
     */
    private final double weight;

    /**
     * Creates new {@link UpdateWeightMessageWriter}.
     *
     * @param weight The weight value to send.
     */
    public UpdateWeightMessageWriter(double weight) {
        this.weight = weight;
    }

    @Override
    public ByteMessage write(Player player) {
        ByteMessage msg = ByteMessage.message(174);
        msg.putShort((int) weight);
        return msg;
    }
}