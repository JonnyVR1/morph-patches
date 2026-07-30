package p149l;

import com.xiaomi.push.service.module.PushChannelRegion;

/* JADX INFO: loaded from: classes2.dex */
public class beb0 {

    /* JADX INFO: renamed from: a */
    private PushChannelRegion f75129a = PushChannelRegion.China;

    /* JADX INFO: renamed from: b */
    private boolean f75130b = false;

    /* JADX INFO: renamed from: c */
    private boolean f75131c = false;

    /* JADX INFO: renamed from: d */
    private boolean f75132d = false;

    /* JADX INFO: renamed from: e */
    private boolean f75133e = false;

    /* JADX INFO: renamed from: a */
    public boolean m101325a() {
        return this.f75132d;
    }

    /* JADX INFO: renamed from: b */
    public boolean m101326b() {
        return this.f75131c;
    }

    /* JADX INFO: renamed from: c */
    public boolean m101327c() {
        return this.f75133e;
    }

    /* JADX INFO: renamed from: d */
    public boolean m101328d() {
        return this.f75130b;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("PushConfiguration{Region:");
        PushChannelRegion pushChannelRegion = this.f75129a;
        if (pushChannelRegion == null) {
            stringBuffer.append("null");
        } else {
            stringBuffer.append(pushChannelRegion.name());
        }
        stringBuffer.append(",mOpenHmsPush:" + this.f75130b);
        stringBuffer.append(",mOpenFCMPush:" + this.f75131c);
        stringBuffer.append(",mOpenCOSPush:" + this.f75132d);
        stringBuffer.append(",mOpenFTOSPush:" + this.f75133e);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
