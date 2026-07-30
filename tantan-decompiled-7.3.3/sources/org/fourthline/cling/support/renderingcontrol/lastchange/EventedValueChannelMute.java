package org.fourthline.cling.support.renderingcontrol.lastchange;

import java.util.Map;
import org.fourthline.cling.model.types.BooleanDatatype;
import org.fourthline.cling.model.types.Datatype;
import org.fourthline.cling.model.types.InvalidValueException;
import org.fourthline.cling.support.lastchange.EventedValue;
import org.fourthline.cling.support.model.Channel;
import org.fourthline.cling.support.shared.AbstractMap;

/* JADX INFO: loaded from: classes3.dex */
public class EventedValueChannelMute extends EventedValue<ChannelMute> {
    public EventedValueChannelMute(ChannelMute channelMute) {
        super(channelMute);
    }

    @Override // org.fourthline.cling.support.lastchange.EventedValue
    public Map.Entry<String, String>[] getAttributes() {
        return new Map.Entry[]{new AbstractMap.SimpleEntry("val", new BooleanDatatype().getString(getValue().getMute())), new AbstractMap.SimpleEntry("channel", getValue().getChannel().name())};
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
    public ChannelMute valueOf2(Map.Entry<String, String>[] entryArr) throws InvalidValueException {
        Channel channelValueOf = null;
        Boolean boolValueOf = null;
        for (Map.Entry<String, String> entry : entryArr) {
            if (entry.getKey().equals("channel")) {
                channelValueOf = Channel.valueOf(entry.getValue());
            }
            if (entry.getKey().equals("val")) {
                boolValueOf = new BooleanDatatype().valueOf(entry.getValue());
            }
        }
        if (channelValueOf == null || boolValueOf == null) {
            return null;
        }
        return new ChannelMute(channelValueOf, boolValueOf);
    }

    public EventedValueChannelMute(Map.Entry<String, String>[] entryArr) {
        super(entryArr);
    }

    @Override // org.fourthline.cling.support.lastchange.EventedValue
    public /* bridge */ /* synthetic */ ChannelMute valueOf(Map.Entry[] entryArr) throws InvalidValueException {
        return valueOf2((Map.Entry<String, String>[]) entryArr);
    }
}
