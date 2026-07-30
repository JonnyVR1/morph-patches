package p153l;

import com.xiaomi.push.service.module.PushChannelRegion;

/* JADX INFO: loaded from: classes2.dex */
public class fmb0 {

    /* JADX INFO: renamed from: a */
    private PushChannelRegion f99760a = PushChannelRegion.China;

    /* JADX INFO: renamed from: b */
    private boolean f99761b = false;

    /* JADX INFO: renamed from: c */
    private boolean f99762c = false;

    /* JADX INFO: renamed from: d */
    private boolean f99763d = false;

    /* JADX INFO: renamed from: e */
    private boolean f99764e = false;

    /* JADX INFO: renamed from: a */
    public boolean m126215a() {
        return this.f99763d;
    }

    /* JADX INFO: renamed from: b */
    public boolean m126216b() {
        return this.f99762c;
    }

    /* JADX INFO: renamed from: c */
    public boolean m126217c() {
        return this.f99764e;
    }

    /* JADX INFO: renamed from: d */
    public boolean m126218d() {
        return this.f99761b;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("PushConfiguration{Region:");
        PushChannelRegion pushChannelRegion = this.f99760a;
        if (pushChannelRegion == null) {
            stringBuffer.append("null");
        } else {
            stringBuffer.append(pushChannelRegion.name());
        }
        stringBuffer.append(",mOpenHmsPush:" + this.f99761b);
        stringBuffer.append(",mOpenFCMPush:" + this.f99762c);
        stringBuffer.append(",mOpenCOSPush:" + this.f99763d);
        stringBuffer.append(",mOpenFTOSPush:" + this.f99764e);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
