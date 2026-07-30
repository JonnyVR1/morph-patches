package p153l;

import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.api.ABManager;

/* JADX INFO: loaded from: classes9.dex */
public final class ilb0 implements ABManager.InterfaceC4829d {
    /* JADX INFO: renamed from: c */
    public static boolean m140617c() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equalsIgnoreCase(ABManager.m30348i0("push_largepic"));
    }

    /* JADX INFO: renamed from: d */
    public static boolean m140618d() {
        return !"__control".equalsIgnoreCase(ABManager.m30348i0("message_vivopush2"));
    }

    @Override // com.p051p1.mobile.putong.api.ABManager.InterfaceC4829d
    /* JADX INFO: renamed from: a */
    public void mo30391a() {
    }

    @Override // com.p051p1.mobile.putong.api.ABManager.InterfaceC4829d
    /* JADX INFO: renamed from: b */
    public void mo30392b() {
    }
}
