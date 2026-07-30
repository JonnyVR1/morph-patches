package p153l;

import android.content.Context;
import com.p051p1.mobile.putong.data.AuthData;
import com.p051p1.mobile.putong.live.base.apibean.LiveGoAction;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes13.dex */
public class vxr {

    /* JADX INFO: renamed from: d */
    public static vxr f186293d;

    /* JADX INFO: renamed from: a */
    public dyr f186294a;

    /* JADX INFO: renamed from: b */
    public p6s f186295b;

    /* JADX INFO: renamed from: c */
    public Context f186296c;

    public vxr(Context context, dyr dyrVar, p6s p6sVar) {
        this.f186296c = context;
        this.f186294a = dyrVar;
        this.f186295b = p6sVar;
    }

    /* JADX INFO: renamed from: a */
    public static C22421c<AuthData> m203875a() {
        return m203880h().accessOutterToken();
    }

    /* JADX INFO: renamed from: d */
    public static p6s m203876d() {
        return m203878f().f186295b;
    }

    /* JADX INFO: renamed from: e */
    public static Context m203877e() {
        return m203878f().f186296c;
    }

    /* JADX INFO: renamed from: f */
    public static vxr m203878f() {
        return f186293d;
    }

    /* JADX INFO: renamed from: g */
    public static vwt m203879g() {
        return m203880h().mo118712b();
    }

    /* JADX INFO: renamed from: h */
    public static dyr m203880h() {
        return m203878f().m203886c();
    }

    /* JADX INFO: renamed from: i */
    public static void m203881i(Context context, LiveGoAction liveGoAction) {
        m203880h().mo118711a(context, liveGoAction);
    }

    /* JADX INFO: renamed from: j */
    public static void m203882j(Context context, dyr dyrVar, p6s p6sVar) {
        if (f186293d != null) {
            return;
        }
        f186293d = new vxr(context, dyrVar, p6sVar);
    }

    /* JADX INFO: renamed from: k */
    public static void m203883k() {
        m203880h().mo118713c();
    }

    /* JADX INFO: renamed from: l */
    public static String m203884l() {
        return m203880h().getUserId();
    }

    /* JADX INFO: renamed from: b */
    public void m203885b() {
        if (yw0.m217558a()) {
            return;
        }
        tdh0.m190630a();
    }

    /* JADX INFO: renamed from: c */
    public final dyr m203886c() {
        return this.f186294a;
    }
}
