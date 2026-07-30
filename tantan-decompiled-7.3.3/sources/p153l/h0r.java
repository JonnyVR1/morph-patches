package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.messages.base.MedialItemType;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public class h0r {

    /* JADX INFO: renamed from: a */
    public boolean f107319a = false;

    /* JADX INFO: renamed from: b */
    public String f107320b;

    /* JADX INFO: renamed from: c */
    public int f107321c;

    /* JADX INFO: renamed from: d */
    public btx f107322d;

    /* JADX INFO: renamed from: e */
    public MedialItemType f107323e;

    /* JADX INFO: renamed from: f */
    public String f107324f;

    /* JADX INFO: renamed from: g */
    public C22421c<Boolean> f107325g;

    public h0r(int i, int i2, MedialItemType medialItemType) {
        this.f107321c = i;
        this.f107320b = CoreModule.f18263b.getString(i2);
        this.f107323e = medialItemType;
    }

    /* JADX INFO: renamed from: a */
    public MedialItemType m133190a() {
        return this.f107323e;
    }

    /* JADX INFO: renamed from: b */
    public void m133191b(btx btxVar) {
        this.f107322d = btxVar;
    }

    /* JADX INFO: renamed from: c */
    public h0r m133192c(boolean z) {
        this.f107319a = z;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public h0r m133193d(String str) {
        this.f107324f = str;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public h0r m133194e(C22421c<Boolean> c22421c) {
        this.f107325g = c22421c;
        return this;
    }

    public h0r(int i, String str, MedialItemType medialItemType) {
        this.f107321c = i;
        this.f107320b = str;
        this.f107323e = medialItemType;
    }
}
