package p149l;

import android.content.Context;
import com.p046p1.mobile.putong.data.AuthData;
import com.p046p1.mobile.putong.live.base.apibean.LiveGoAction;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
public class uvr {

    /* JADX INFO: renamed from: d */
    public static uvr f178553d;

    /* JADX INFO: renamed from: a */
    public cwr f178554a;

    /* JADX INFO: renamed from: b */
    public o4s f178555b;

    /* JADX INFO: renamed from: c */
    public Context f178556c;

    public uvr(Context context, cwr cwrVar, o4s o4sVar) {
        this.f178556c = context;
        this.f178554a = cwrVar;
        this.f178555b = o4sVar;
    }

    /* JADX INFO: renamed from: a */
    public static C22306c<AuthData> m196086a() {
        return m196091h().accessOutterToken();
    }

    /* JADX INFO: renamed from: d */
    public static o4s m196087d() {
        return m196089f().f178555b;
    }

    /* JADX INFO: renamed from: e */
    public static Context m196088e() {
        return m196089f().f178556c;
    }

    /* JADX INFO: renamed from: f */
    public static uvr m196089f() {
        return f178553d;
    }

    /* JADX INFO: renamed from: g */
    public static uut m196090g() {
        return m196091h().mo108258b();
    }

    /* JADX INFO: renamed from: h */
    public static cwr m196091h() {
        return m196089f().m196097c();
    }

    /* JADX INFO: renamed from: i */
    public static void m196092i(Context context, LiveGoAction liveGoAction) {
        m196091h().mo108257a(context, liveGoAction);
    }

    /* JADX INFO: renamed from: j */
    public static void m196093j(Context context, cwr cwrVar, o4s o4sVar) {
        if (f178553d != null) {
            return;
        }
        f178553d = new uvr(context, cwrVar, o4sVar);
    }

    /* JADX INFO: renamed from: k */
    public static void m196094k() {
        m196091h().mo108259c();
    }

    /* JADX INFO: renamed from: l */
    public static String m196095l() {
        return m196091h().getUserId();
    }

    /* JADX INFO: renamed from: b */
    public void m196096b() {
        if (rw0.m181367a()) {
            return;
        }
        l5h0.m148643a();
    }

    /* JADX INFO: renamed from: c */
    public final cwr m196097c() {
        return this.f178554a;
    }
}
