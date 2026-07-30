package p003l;

import com.p000p1.mobile.putong.core.p001ui.messages.base.MedialItemType;
import com.p1.mobile.putong.core.CoreModule;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class hyq {

    /* JADX INFO: renamed from: a */
    public boolean f4303a = false;

    /* JADX INFO: renamed from: b */
    public String f4304b;

    /* JADX INFO: renamed from: c */
    public int f4305c;

    /* JADX INFO: renamed from: d */
    public ekx f4306d;

    /* JADX INFO: renamed from: e */
    public MedialItemType f4307e;

    /* JADX INFO: renamed from: f */
    public String f4308f;

    /* JADX INFO: renamed from: g */
    public C1099c<Boolean> f4309g;

    public hyq(int i, int i2, MedialItemType medialItemType) {
        this.f4305c = i;
        this.f4304b = CoreModule.b.getString(i2);
        this.f4307e = medialItemType;
    }

    /* JADX INFO: renamed from: a */
    public MedialItemType m5007a() {
        return this.f4307e;
    }

    /* JADX INFO: renamed from: b */
    public void m5008b(ekx ekxVar) {
        this.f4306d = ekxVar;
    }

    /* JADX INFO: renamed from: c */
    public hyq m5009c(boolean z) {
        this.f4303a = z;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public hyq m5010d(String str) {
        this.f4308f = str;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public hyq m5011e(C1099c<Boolean> c1099c) {
        this.f4309g = c1099c;
        return this;
    }

    public hyq(int i, String str, MedialItemType medialItemType) {
        this.f4305c = i;
        this.f4304b = str;
        this.f4307e = medialItemType;
    }
}
