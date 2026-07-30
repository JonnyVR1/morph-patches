package p002l;

import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.tantanapp.common.data.DbObject;
import kotlin.Metadata;
import l.e30;
import l.ffw;
import l.kvc0;
import l.lsi0;
import l.w8u;
import l.xh0;
import org.jetbrains.annotations.NotNull;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ll/ezs;", "Ll/pat;", "Ll/ho2;", "Ll/bsm;", "info", "<init>", "(Ll/bsm;)V", "", "t", "()V", "Lcom/p1/mobile/putong/data/User;", "user", "N3", "(Lcom/p1/mobile/putong/data/User;)V", "", "userId", "P3", "(Ljava/lang/String;)V", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ezs extends pat<ho2> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezs(@NotNull bsm<? extends ho2> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
    }

    /* JADX INFO: renamed from: J3 */
    public static void m12875J3(ezs ezsVar, String str, BLiveEnvelope bLiveEnvelope) {
        ezsVar.m25548F2().LiveBlackListEvent.updateBlackStatus().j(str);
        lsi0.y(w8u.t(R$string.f2746Gf));
    }

    /* JADX INFO: renamed from: L3 */
    public static void m12877L3(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            lsi0.y(((TantanException.Client.CoreService) th).metaMessage);
        }
    }

    /* JADX INFO: renamed from: M3 */
    public static void m12878M3(ezs ezsVar, User user) {
        ezsVar.m12880N3(user);
    }

    /* JADX INFO: renamed from: O3 */
    public static final void m12879O3(ezs ezsVar, User user, View view) {
        String str = ((DbObject) user).id;
        str.getClass();
        ezsVar.m12881P3(str);
    }

    /* JADX INFO: renamed from: N3 */
    public final void m12880N3(final User user) {
        if (user != null) {
            String strP = w8u.p(user.name, 12);
            String strU = w8u.u(R$string.f2614Af, strP);
            String strT = w8u.t(R$string.f2724Ff);
            strP.getClass();
            new xh0.a(this.f22037f).s("").j(wxr.INSTANCE.m25545b(strU + strT, strP, kvc0.a(h1c0.f11748Q))).q(R$string.f2702Ef).o(new View.OnClickListener() { // from class: l.bzs
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ezs.m12879O3(this.f8430a, user, view);
                }
            }).p(h1c0.f11777d).f(w8u.t(R$string.f2680Df)).a().g();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: P3 */
    public final void m12881P3(final String userId) {
        duringCreated(LivingNormalApiProvider.m4990y3(m25547E2().m17239o(), userId)).subscribe(ffw.e(new e30() { // from class: l.czs
            public final void call(Object obj) {
                ezs.m12875J3(this.f9004a, userId, (BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.dzs
            public final void call(Object obj) {
                ezs.m12877L3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t */
    public void m12882t() {
        super.t();
        duringCreated((c) m25548F2().LiveBlackListEvent.addBlackListDialog().g()).subscribe(ffw.h(new e30() { // from class: l.azs
            public final void call(Object obj) {
                ezs.m12878M3(this.f7936a, (User) obj);
            }
        }));
    }
}
