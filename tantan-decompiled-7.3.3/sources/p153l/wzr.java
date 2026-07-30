package p153l;

import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveExtraData;
import com.p051p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u001f\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m88121d2 = {"Ll/wzr;", "Ll/y8s;", "Ll/oo2;", "Ll/izr;", "Ll/dum;", BaseSei.INFO, "<init>", "(Ll/dum;)V", "Lcom/p1/mobile/putong/data/User;", "user", "", "c4", "(Lcom/p1/mobile/putong/data/User;)V", Constants.KEY_T, "()V", "i4", "Ll/yzr;", "model", "g4", "(Ll/yzr;)V", "h4", "f4", "", "userId", "userName", "e4", "(Ljava/lang/String;Ljava/lang/String;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class wzr extends y8s<oo2, izr> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wzr(@NotNull dum<? extends oo2> dumVar) {
        super(dumVar);
        dumVar.getClass();
    }

    /* JADX INFO: renamed from: S3 */
    public static void m208748S3(wzr wzrVar, yzr yzrVar, BLiveEnvelope bLiveEnvelope) {
        o1j0.m165649w(R$string.f48379t0);
        ((izr) wzrVar.viewModel).m142845S(yzrVar);
    }

    /* JADX INFO: renamed from: T3 */
    public static void m208749T3(wzr wzrVar, vxj0 vxj0Var) {
        wzrVar.m208764i4();
    }

    /* JADX INFO: renamed from: U3 */
    public static void m208750U3(wzr wzrVar, User user) {
        wzrVar.m208758c4(user);
    }

    /* JADX INFO: renamed from: W3 */
    public static void m208752W3(String str, BLiveEnvelope bLiveEnvelope) {
        String strM209911u = xau.m209911u(R$string.f48357s0, str);
        xzr xzrVar = xzr.INSTANCE;
        strM209911u.getClass();
        o1j0.m165651y(xzrVar.m213805a(strM209911u, str, -1).toString());
    }

    /* JADX INFO: renamed from: X3 */
    public static void m208753X3(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            o1j0.m165651y(((TantanException.Client.CoreService) th).metaMessage);
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public static void m208754Y3(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            o1j0.m165651y(((TantanException.Client.CoreService) th).metaMessage);
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public static void m208755Z3(wzr wzrVar, BLiveExtraResponse bLiveExtraResponse) {
        izr izrVar = (izr) wzrVar.viewModel;
        BLiveExtraData bLiveExtraData = bLiveExtraResponse.data;
        bLiveExtraData.getClass();
        izrVar.m142847U(bLiveExtraData);
    }

    /* JADX INFO: renamed from: a4 */
    public static void m208756a4(wzr wzrVar, yzr yzrVar, View view) {
        wzrVar.m208761f4(yzrVar);
    }

    /* JADX INFO: renamed from: b4 */
    public static void m208757b4(wzr wzrVar, Throwable th) {
        ((izr) wzrVar.viewModel).m142846T();
    }

    /* JADX INFO: renamed from: c4 */
    private final void m208758c4(final User user) {
        if (user != null) {
            final String strM209906p = xau.m209906p(user.name, 6);
            String strM209911u = xau.m209911u(R$string.f48401u0, strM209906p);
            xzr xzrVar = xzr.INSTANCE;
            strM209911u.getClass();
            strM209906p.getClass();
            new th0.C20312a(this.f196919f).m191160s(xau.m209910t(R$string.f48423v0)).m191151j(xzrVar.m213805a(strM209911u, strM209906p, n3d0.m161277a(n9c0.f140791R))).m191158q(R$string.f48271o2).m191156o(new View.OnClickListener() { // from class: l.ozr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    wzr.m208759d4(this.f149947a, user, strM209906p, view);
                }
            }).m191157p(n9c0.f140818d).m191147f(act().getString(R$string.f48510z)).m191142a().m191141g();
        }
    }

    /* JADX INFO: renamed from: d4 */
    public static final void m208759d4(wzr wzrVar, User user, String str, View view) {
        String str2 = user.f56859id;
        str2.getClass();
        str.getClass();
        wzrVar.m208760e4(str2, str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: e4 */
    public final void m208760e4(String userId, final String userName) {
        duringCreated(LivingNormalApiProvider.m72807y3(m213810E2().m202194o(), userId)).subscribe(dhw.m115826e(new y20() { // from class: l.rzr
            @Override // p153l.y20
            public final void call(Object obj) {
                wzr.m208752W3(userName, (BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.szr
            @Override // p153l.y20
            public final void call(Object obj) {
                wzr.m208754Y3((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: f4 */
    public final void m208761f4(final yzr model) {
        duringCreated(LivingNormalApiProvider.m72540U6(m213810E2().m202194o(), model.getCom.p1.mobile.putong.core.data.Item.TYPE java.lang.String().f45186id)).subscribe(dhw.m115826e(new y20() { // from class: l.uzr
            @Override // p153l.y20
            public final void call(Object obj) {
                wzr.m208748S3(this.f181804a, model, (BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.vzr
            @Override // p153l.y20
            public final void call(Object obj) {
                wzr.m208753X3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g4 */
    public final void m208762g4(@NotNull final yzr model) {
        model.getClass();
        String strM209906p = xau.m209906p(model.getCom.p1.mobile.putong.core.data.Item.TYPE java.lang.String().userName, 6);
        String strM209911u = xau.m209911u(R$string.f48445w0, strM209906p);
        xzr xzrVar = xzr.INSTANCE;
        strM209911u.getClass();
        strM209906p.getClass();
        new th0.C20312a(this.f196919f).m191160s(xau.m209910t(R$string.f48467x0)).m191151j(xzrVar.m213805a(strM209911u, strM209906p, n3d0.m161277a(n9c0.f140791R))).m191158q(R$string.f48271o2).m191156o(new View.OnClickListener() { // from class: l.tzr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wzr.m208756a4(this.f176798a, model, view);
            }
        }).m191157p(n9c0.f140818d).m191147f(act().getString(R$string.f48510z)).m191142a().m191141g();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: h4 */
    public final void m208763h4() {
        duringCreated(LivingNormalApiProvider.m72412G4(m213810E2().m202194o())).subscribe(dhw.m115826e(new y20() { // from class: l.pzr
            @Override // p153l.y20
            public final void call(Object obj) {
                wzr.m208755Z3(this.f154961a, (BLiveExtraResponse) obj);
            }
        }, new y20() { // from class: l.qzr
            @Override // p153l.y20
            public final void call(Object obj) {
                wzr.m208757b4(this.f160293a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i4 */
    public final void m208764i4() {
        if (this.viewModel == 0) {
            Act act = this.f196919f;
            act.getClass();
            izr izrVar = new izr(act, this);
            this.viewModel = izrVar;
            izrVar.mo22064i1(this);
        }
        ((izr) this.viewModel).m73017E();
        m208763h4();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().LiveBlackListEvent.showBlackListDialog().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.mzr
            @Override // p153l.y20
            public final void call(Object obj) {
                wzr.m208749T3(this.f139550a, (vxj0) obj);
            }
        }));
        duringCreated(m213811F2().LiveBlackListEvent.addBlackListDialog().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.nzr
            @Override // p153l.y20
            public final void call(Object obj) {
                wzr.m208750U3(this.f144469a, (User) obj);
            }
        }));
    }
}
