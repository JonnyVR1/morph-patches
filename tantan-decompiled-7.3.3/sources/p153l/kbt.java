package p153l;

import com.p051p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew;

/* JADX INFO: loaded from: classes5.dex */
public class kbt {
    /* JADX INFO: renamed from: a */
    public liveAuthMessageNew.Msg m149077a(byte[] bArr) {
        try {
            return liveAuthMessageNew.Msgs.parseFrom(bArr).getMsgs(0);
        } catch (Exception unused) {
            return null;
        }
    }
}
