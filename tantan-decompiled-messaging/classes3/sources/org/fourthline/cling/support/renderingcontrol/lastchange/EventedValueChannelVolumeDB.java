package org.fourthline.cling.support.renderingcontrol.lastchange;

import java.util.Map;
import org.fourthline.cling.model.types.Datatype;
import org.fourthline.cling.model.types.InvalidValueException;
import org.fourthline.cling.model.types.UnsignedIntegerTwoBytes;
import org.fourthline.cling.model.types.UnsignedIntegerTwoBytesDatatype;
import org.fourthline.cling.support.lastchange.EventedValue;
import org.fourthline.cling.support.model.Channel;
import org.fourthline.cling.support.shared.AbstractMap;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class EventedValueChannelVolumeDB extends EventedValue<ChannelVolumeDB> {
    public EventedValueChannelVolumeDB(ChannelVolumeDB channelVolumeDB) {
        super(channelVolumeDB);
    }

    @Override // org.fourthline.cling.support.lastchange.EventedValue
    public Map.Entry<String, String>[] getAttributes() {
        return new Map.Entry[]{new AbstractMap.SimpleEntry("val", new UnsignedIntegerTwoBytesDatatype().getString(new UnsignedIntegerTwoBytes(getValue().getVolumeDB().intValue()))), new AbstractMap.SimpleEntry("channel", getValue().getChannel().name())};
    }

    @Override // org.fourthline.cling.support.lastchange.EventedValue
    public Datatype getDatatype() {
        return null;
    }

    @Override // org.fourthline.cling.support.lastchange.EventedValue
    public String toString() {
        return getValue().toString();
    }

    @Override // org.fourthline.cling.support.lastchange.EventedValue
    /* JADX INFO: renamed from: valueOf, reason: avoid collision after fix types in other method */
    public ChannelVolumeDB valueOf2(Map.Entry<String, String>[] entryArr) throws InvalidValueException {
        Channel channelValueOf = null;
        Integer numValueOf = null;
        for (Map.Entry<String, String> entry : entryArr) {
            if (entry.getKey().equals("channel")) {
                channelValueOf = Channel.valueOf(entry.getValue());
            }
            if (entry.getKey().equals("val")) {
                numValueOf = Integer.valueOf(new UnsignedIntegerTwoBytesDatatype().valueOf(entry.getValue()).getValue().intValue());
            }
        }
        if (channelValueOf == null || numValueOf == null) {
            return null;
        }
        return new ChannelVolumeDB(channelValueOf, numValueOf);
    }

    public EventedValueChannelVolumeDB(Map.Entry<String, String>[] entryArr) {
        super(entryArr);
    }

    @Override // org.fourthline.cling.support.lastchange.EventedValue
    public /* bridge */ /* synthetic */ ChannelVolumeDB valueOf(Map.Entry[] entryArr) throws InvalidValueException {
        return valueOf2((Map.Entry<String, String>[]) entryArr);
    }
}
