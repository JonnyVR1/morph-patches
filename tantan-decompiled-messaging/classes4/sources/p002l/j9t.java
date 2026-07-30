package p002l;

import com.p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class j9t {
    /* JADX INFO: renamed from: a */
    public liveAuthMessageNew.Msg m15779a(byte[] bArr) {
        try {
            return liveAuthMessageNew.Msgs.parseFrom(bArr).getMsgs(0);
        } catch (Exception unused) {
            return null;
        }
    }
}
