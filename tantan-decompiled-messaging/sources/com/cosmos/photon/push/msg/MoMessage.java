package com.cosmos.photon.push.msg;

import com.immomo.push.p040pb.Msg;
import com.immomo.push.p040pb.MsgV2;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class MoMessage implements Serializable {
    private static final long serialVersionUID = 7678206078948390275L;
    public HashMap<String, String> data;

    /* JADX INFO: renamed from: id */
    public String f5809id;
    public int logType = -1;
    public String text;
    public long time;
    public String toPkg;
    public int type;

    public static MoMessage create(Msg msg) {
        MoMessage moMessage = new MoMessage();
        moMessage.f5809id = msg.getId();
        moMessage.toPkg = msg.getToPkg();
        moMessage.type = msg.getType();
        moMessage.time = msg.getTime();
        moMessage.text = msg.getText();
        moMessage.data = msg.getDataMap() == null ? null : new HashMap<>(msg.getDataMap());
        getLogType(moMessage);
        return moMessage;
    }

    private static void getLogType(MoMessage moMessage) {
        HashMap<String, String> map = moMessage.data;
        if (map != null) {
            try {
                moMessage.logType = Integer.valueOf(map.get("ins_log")).intValue();
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }

    public String toString() {
        return "MoMessage{id='" + this.f5809id + "', toPkg='" + this.toPkg + "', time=" + this.time + ", type=" + this.type + ", text='" + this.text + "'}";
    }

    public static MoMessage create(MsgV2 msgV2) {
        MoMessage moMessage = new MoMessage();
        moMessage.f5809id = msgV2.getId();
        moMessage.toPkg = msgV2.getToPkg();
        moMessage.type = msgV2.getType();
        moMessage.time = msgV2.getTime();
        moMessage.text = msgV2.getText();
        moMessage.data = msgV2.getDataMap() == null ? null : new HashMap<>(msgV2.getDataMap());
        getLogType(moMessage);
        return moMessage;
    }
}
