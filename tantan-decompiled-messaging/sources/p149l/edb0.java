package p149l;

import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.putong.api.ABManager;

/* JADX INFO: loaded from: classes9.dex */
public final class edb0 implements ABManager.InterfaceC4678d {
    /* JADX INFO: renamed from: c */
    public static boolean m115794c() {
        return AuthenticationTokenClaims.JSON_KEY_EXP.equalsIgnoreCase(ABManager.m29350i0("push_largepic"));
    }

    /* JADX INFO: renamed from: d */
    public static boolean m115795d() {
        return !"__control".equalsIgnoreCase(ABManager.m29350i0("message_vivopush2"));
    }

    @Override // com.p046p1.mobile.putong.api.ABManager.InterfaceC4678d
    /* JADX INFO: renamed from: a */
    public void mo29393a() {
    }

    @Override // com.p046p1.mobile.putong.api.ABManager.InterfaceC4678d
    /* JADX INFO: renamed from: b */
    public void mo29394b() {
    }
}
