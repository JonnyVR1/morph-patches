package p153l;

import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m88121d2 = {"Ll/unn0;", "Ll/qct;", "Ll/oo2;", "Ll/dum;", BaseSei.INFO, "<init>", "(Ll/dum;)V", "Lcom/p1/mobile/putong/data/User;", "user", "", "N3", "(Lcom/p1/mobile/putong/data/User;)V", "", "userId", "P3", "(Ljava/lang/String;)V", Constants.KEY_T, "()V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class unn0 extends qct<oo2> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public unn0(@NotNull dum<? extends oo2> dumVar) {
        super(dumVar);
        dumVar.getClass();
    }

    /* JADX INFO: renamed from: J3 */
    public static void m196880J3(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            o1j0.m165651y(((TantanException.Client.CoreService) th).metaMessage);
        }
    }

    /* JADX INFO: renamed from: K3 */
    public static void m196881K3(unn0 unn0Var, User user) {
        unn0Var.m196884N3(user);
    }

    /* JADX INFO: renamed from: M3 */
    public static void m196883M3(unn0 unn0Var, String str, BLiveEnvelope bLiveEnvelope) {
        unn0Var.m213811F2().VoiceBlackListEvent.updateBlackStatus().mo199273j(str);
        o1j0.m165651y(xau.m209910t(R$string.f47552Gf));
    }

    /* JADX INFO: renamed from: N3 */
    private final void m196884N3(final User user) {
        if (user != null) {
            String strM209906p = xau.m209906p(user.name, 12);
            String strM209911u = xau.m209911u(R$string.f47420Af, strM209906p);
            String strM209910t = xau.m209910t(R$string.f47530Ff);
            strM209906p.getClass();
            new th0.C20312a(this.f196919f).m191160s("").m191151j(xzr.INSTANCE.m213806b(strM209911u + strM209910t, strM209906p, n3d0.m161277a(n9c0.f140789Q))).m191158q(R$string.f47508Ef).m191156o(new View.OnClickListener() { // from class: l.rnn0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    unn0.m196885O3(this.f164088a, user, view);
                }
            }).m191157p(n9c0.f140818d).m191147f(xau.m209910t(R$string.f47486Df)).m191142a().m191141g();
        }
    }

    /* JADX INFO: renamed from: O3 */
    public static final void m196885O3(unn0 unn0Var, User user, View view) {
        String str = user.f56859id;
        str.getClass();
        unn0Var.m196886P3(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: P3 */
    private final void m196886P3(final String userId) {
        duringCreated(VoiceRoomApiProvider.addDeFriendWithUserId(m213810E2().m202194o(), userId)).subscribe(dhw.m115826e(new y20() { // from class: l.snn0
            @Override // p153l.y20
            public final void call(Object obj) {
                unn0.m196883M3(this.f169745a, userId, (BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.tnn0
            @Override // p153l.y20
            public final void call(Object obj) {
                unn0.m196880J3((Throwable) obj);
            }
        }));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().VoiceBlackListEvent.addBlackList().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.qnn0
            @Override // p153l.y20
            public final void call(Object obj) {
                unn0.m196881K3(this.f158508a, (User) obj);
            }
        }));
    }
}
