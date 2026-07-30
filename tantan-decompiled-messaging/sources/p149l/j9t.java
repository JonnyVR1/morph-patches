package p149l;

import com.p046p1.mobile.longlink.msg.liveConnector.liveAuthMessageNew;

/* JADX INFO: loaded from: classes4.dex */
public class j9t {
    /* JADX INFO: renamed from: a */
    public liveAuthMessageNew.Msg m140586a(byte[] bArr) {
        try {
            return liveAuthMessageNew.Msgs.parseFrom(bArr).getMsgs(0);
        } catch (Exception unused) {
            return null;
        }
    }
}
