package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.messages.base.MedialItemType;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public class hyq {

    /* JADX INFO: renamed from: a */
    public boolean f110132a = false;

    /* JADX INFO: renamed from: b */
    public String f110133b;

    /* JADX INFO: renamed from: c */
    public int f110134c;

    /* JADX INFO: renamed from: d */
    public ekx f110135d;

    /* JADX INFO: renamed from: e */
    public MedialItemType f110136e;

    /* JADX INFO: renamed from: f */
    public String f110137f;

    /* JADX INFO: renamed from: g */
    public C22306c<Boolean> f110138g;

    public hyq(int i, int i2, MedialItemType medialItemType) {
        this.f110134c = i;
        this.f110133b = CoreModule.f17544b.getString(i2);
        this.f110136e = medialItemType;
    }

    /* JADX INFO: renamed from: a */
    public MedialItemType m133620a() {
        return this.f110136e;
    }

    /* JADX INFO: renamed from: b */
    public void m133621b(ekx ekxVar) {
        this.f110135d = ekxVar;
    }

    /* JADX INFO: renamed from: c */
    public hyq m133622c(boolean z) {
        this.f110132a = z;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public hyq m133623d(String str) {
        this.f110137f = str;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public hyq m133624e(C22306c<Boolean> c22306c) {
        this.f110138g = c22306c;
        return this;
    }

    public hyq(int i, String str, MedialItemType medialItemType) {
        this.f110134c = i;
        this.f110133b = str;
        this.f110136e = medialItemType;
    }
}
