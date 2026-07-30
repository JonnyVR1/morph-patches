package p002l;

import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveExtraData;
import com.p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.tantanapp.common.data.DbObject;
import kotlin.Metadata;
import l.bwr;
import l.e30;
import l.ffw;
import l.kvc0;
import l.lsi0;
import l.soj0;
import l.w8u;
import l.xh0;
import org.jetbrains.annotations.NotNull;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u001f\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Ll/vxr;", "Ll/x6s;", "Ll/ho2;", "Ll/hxr;", "Ll/bsm;", "info", "<init>", "(Ll/bsm;)V", "Lcom/p1/mobile/putong/data/User;", "user", "", "c4", "(Lcom/p1/mobile/putong/data/User;)V", "t", "()V", "i4", "Ll/xxr;", "model", "g4", "(Ll/xxr;)V", "h4", "f4", "", "userId", "userName", "e4", "(Ljava/lang/String;Ljava/lang/String;)V", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class vxr extends x6s<ho2, hxr> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxr(@NotNull bsm<? extends ho2> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
    }

    /* JADX INFO: renamed from: S3 */
    public static void m24203S3(vxr vxrVar, xxr xxrVar, BLiveEnvelope bLiveEnvelope) {
        lsi0.w(R$string.f3573t0);
        ((hxr) ((bwr) vxrVar).viewModel).m14919S(xxrVar);
    }

    /* JADX INFO: renamed from: T3 */
    public static void m24204T3(vxr vxrVar, soj0 soj0Var) {
        vxrVar.m24219i4();
    }

    /* JADX INFO: renamed from: U3 */
    public static void m24205U3(vxr vxrVar, User user) {
        vxrVar.m24213c4(user);
    }

    /* JADX INFO: renamed from: W3 */
    public static void m24207W3(String str, BLiveEnvelope bLiveEnvelope) {
        String strU = w8u.u(R$string.f3551s0, str);
        wxr wxrVar = wxr.INSTANCE;
        strU.getClass();
        lsi0.y(wxrVar.m25544a(strU, str, -1).toString());
    }

    /* JADX INFO: renamed from: X3 */
    public static void m24208X3(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            lsi0.y(((TantanException.Client.CoreService) th).metaMessage);
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public static void m24209Y3(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            lsi0.y(((TantanException.Client.CoreService) th).metaMessage);
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public static void m24210Z3(vxr vxrVar, BLiveExtraResponse bLiveExtraResponse) {
        hxr hxrVar = (hxr) ((bwr) vxrVar).viewModel;
        BLiveExtraData bLiveExtraData = bLiveExtraResponse.data;
        bLiveExtraData.getClass();
        hxrVar.m14921U(bLiveExtraData);
    }

    /* JADX INFO: renamed from: a4 */
    public static void m24211a4(vxr vxrVar, xxr xxrVar, View view) {
        vxrVar.m24216f4(xxrVar);
    }

    /* JADX INFO: renamed from: b4 */
    public static void m24212b4(vxr vxrVar, Throwable th) {
        ((hxr) ((bwr) vxrVar).viewModel).m14920T();
    }

    /* JADX INFO: renamed from: c4 */
    private final void m24213c4(final User user) {
        if (user != null) {
            final String strP = w8u.p(user.name, 6);
            String strU = w8u.u(R$string.f3595u0, strP);
            wxr wxrVar = wxr.INSTANCE;
            strU.getClass();
            strP.getClass();
            new xh0.a(this.f22037f).s(w8u.t(R$string.f3617v0)).j(wxrVar.m25544a(strU, strP, kvc0.a(h1c0.f11750R))).q(R$string.f3465o2).o(new View.OnClickListener() { // from class: l.nxr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    vxr.m24214d4(this.f16299a, user, strP, view);
                }
            }).p(h1c0.f11777d).f(act().getString(R$string.f3704z)).a().g();
        }
    }

    /* JADX INFO: renamed from: d4 */
    public static final void m24214d4(vxr vxrVar, User user, String str, View view) {
        String str2 = ((DbObject) user).id;
        str2.getClass();
        str.getClass();
        vxrVar.m24215e4(str2, str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: e4 */
    public final void m24215e4(String userId, final String userName) {
        duringCreated(LivingNormalApiProvider.m4990y3(m25547E2().m17239o(), userId)).subscribe(ffw.e(new e30() { // from class: l.qxr
            public final void call(Object obj) {
                vxr.m24207W3(userName, (BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.rxr
            public final void call(Object obj) {
                vxr.m24209Y3((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: f4 */
    public final void m24216f4(final xxr model) {
        duringCreated(LivingNormalApiProvider.m4723U6(m25547E2().m17239o(), model.getItem().id)).subscribe(ffw.e(new e30() { // from class: l.txr
            public final void call(Object obj) {
                vxr.m24203S3(this.f20420a, model, (BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.uxr
            public final void call(Object obj) {
                vxr.m24208X3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g4 */
    public final void m24217g4(@NotNull final xxr model) {
        model.getClass();
        String strP = w8u.p(model.getItem().userName, 6);
        String strU = w8u.u(R$string.f3639w0, strP);
        wxr wxrVar = wxr.INSTANCE;
        strU.getClass();
        strP.getClass();
        new xh0.a(this.f22037f).s(w8u.t(R$string.f3661x0)).j(wxrVar.m25544a(strU, strP, kvc0.a(h1c0.f11750R))).q(R$string.f3465o2).o(new View.OnClickListener() { // from class: l.sxr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vxr.m24211a4(this.f19320a, model, view);
            }
        }).p(h1c0.f11777d).f(act().getString(R$string.f3704z)).a().g();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: h4 */
    public final void m24218h4() {
        duringCreated(LivingNormalApiProvider.m4595G4(m25547E2().m17239o())).subscribe(ffw.e(new e30() { // from class: l.oxr
            public final void call(Object obj) {
                vxr.m24210Z3(this.f16891a, (BLiveExtraResponse) obj);
            }
        }, new e30() { // from class: l.pxr
            public final void call(Object obj) {
                vxr.m24212b4(this.f17716a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i4 */
    public final void m24219i4() {
        if (((bwr) this).viewModel == null) {
            Act act = this.f22037f;
            act.getClass();
            hxr hxrVar = new hxr(act, this);
            ((bwr) this).viewModel = hxrVar;
            hxrVar.mo5212i1(this);
        }
        ((hxr) ((bwr) this).viewModel).m5211E();
        m24218h4();
    }

    /* JADX INFO: renamed from: t */
    public void m24220t() {
        super.t();
        duringCreated((c) m25548F2().LiveBlackListEvent.showBlackListDialog().g()).subscribe(ffw.h(new e30() { // from class: l.lxr
            public final void call(Object obj) {
                vxr.m24204T3(this.f15117a, (soj0) obj);
            }
        }));
        duringCreated((c) m25548F2().LiveBlackListEvent.addBlackListDialog().g()).subscribe(ffw.h(new e30() { // from class: l.mxr
            public final void call(Object obj) {
                vxr.m24205U3(this.f15738a, (User) obj);
            }
        }));
    }
}
