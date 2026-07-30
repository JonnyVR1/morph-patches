package p149l;

import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m87232d2 = {"Ll/ezs;", "Ll/pat;", "Ll/ho2;", "Ll/bsm;", BaseSei.INFO, "<init>", "(Ll/bsm;)V", "", Constants.KEY_T, "()V", "Lcom/p1/mobile/putong/data/User;", "user", "N3", "(Lcom/p1/mobile/putong/data/User;)V", "", "userId", "P3", "(Ljava/lang/String;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class ezs extends pat<ho2> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezs(@NotNull bsm<? extends ho2> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
    }

    /* JADX INFO: renamed from: J3 */
    public static void m119011J3(ezs ezsVar, String str, BLiveEnvelope bLiveEnvelope) {
        ezsVar.m206028F2().LiveBlackListEvent.updateBlackStatus().mo172463j(str);
        lsi0.m151595y(w8u.m202217t(R$string.f46704Gf));
    }

    /* JADX INFO: renamed from: L3 */
    public static void m119013L3(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            lsi0.m151595y(((TantanException.Client.CoreService) th).metaMessage);
        }
    }

    /* JADX INFO: renamed from: M3 */
    public static void m119014M3(ezs ezsVar, User user) {
        ezsVar.m119016N3(user);
    }

    /* JADX INFO: renamed from: O3 */
    public static final void m119015O3(ezs ezsVar, User user, View view) {
        String str = user.f56011id;
        str.getClass();
        ezsVar.m119017P3(str);
    }

    /* JADX INFO: renamed from: N3 */
    public final void m119016N3(final User user) {
        if (user != null) {
            String strM202213p = w8u.m202213p(user.name, 12);
            String strM202218u = w8u.m202218u(R$string.f46572Af, strM202213p);
            String strM202217t = w8u.m202217t(R$string.f46682Ff);
            strM202213p.getClass();
            new xh0.C21150a(this.f188513f).m208740s("").m208731j(wxr.INSTANCE.m206025b(strM202218u + strM202217t, strM202213p, kvc0.m147352a(h1c0.f105328Q))).m208738q(R$string.f46660Ef).m208736o(new View.OnClickListener() { // from class: l.bzs
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ezs.m119015O3(this.f78055a, user, view);
                }
            }).m208737p(h1c0.f105357d).m208727f(w8u.m202217t(R$string.f46638Df)).m208722a().m208721g();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: P3 */
    public final void m119017P3(final String userId) {
        duringCreated(LivingNormalApiProvider.m71624y3(m206027E2().m149818o(), userId)).subscribe(ffw.m121194e(new e30() { // from class: l.czs
            @Override // p149l.e30
            public final void call(Object obj) {
                ezs.m119011J3(this.f83106a, userId, (BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.dzs
            @Override // p149l.e30
            public final void call(Object obj) {
                ezs.m119013L3((Throwable) obj);
            }
        }));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().LiveBlackListEvent.addBlackListDialog().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.azs
            @Override // p149l.e30
            public final void call(Object obj) {
                ezs.m119014M3(this.f72379a, (User) obj);
            }
        }));
    }
}
