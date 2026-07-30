package p149l;

import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveExtraData;
import com.p046p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u001f\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m87232d2 = {"Ll/vxr;", "Ll/x6s;", "Ll/ho2;", "Ll/hxr;", "Ll/bsm;", BaseSei.INFO, "<init>", "(Ll/bsm;)V", "Lcom/p1/mobile/putong/data/User;", "user", "", "c4", "(Lcom/p1/mobile/putong/data/User;)V", Constants.KEY_T, "()V", "i4", "Ll/xxr;", "model", "g4", "(Ll/xxr;)V", "h4", "f4", "", "userId", "userName", "e4", "(Ljava/lang/String;Ljava/lang/String;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class vxr extends x6s<ho2, hxr> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxr(@NotNull bsm<? extends ho2> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
    }

    /* JADX INFO: renamed from: S3 */
    public static void m200578S3(vxr vxrVar, xxr xxrVar, BLiveEnvelope bLiveEnvelope) {
        lsi0.m151593w(R$string.f47531t0);
        ((hxr) vxrVar.viewModel).m133383S(xxrVar);
    }

    /* JADX INFO: renamed from: T3 */
    public static void m200579T3(vxr vxrVar, soj0 soj0Var) {
        vxrVar.m200594i4();
    }

    /* JADX INFO: renamed from: U3 */
    public static void m200580U3(vxr vxrVar, User user) {
        vxrVar.m200588c4(user);
    }

    /* JADX INFO: renamed from: W3 */
    public static void m200582W3(String str, BLiveEnvelope bLiveEnvelope) {
        String strM202218u = w8u.m202218u(R$string.f47509s0, str);
        wxr wxrVar = wxr.INSTANCE;
        strM202218u.getClass();
        lsi0.m151595y(wxrVar.m206024a(strM202218u, str, -1).toString());
    }

    /* JADX INFO: renamed from: X3 */
    public static void m200583X3(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            lsi0.m151595y(((TantanException.Client.CoreService) th).metaMessage);
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public static void m200584Y3(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            lsi0.m151595y(((TantanException.Client.CoreService) th).metaMessage);
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public static void m200585Z3(vxr vxrVar, BLiveExtraResponse bLiveExtraResponse) {
        hxr hxrVar = (hxr) vxrVar.viewModel;
        BLiveExtraData bLiveExtraData = bLiveExtraResponse.data;
        bLiveExtraData.getClass();
        hxrVar.m133385U(bLiveExtraData);
    }

    /* JADX INFO: renamed from: a4 */
    public static void m200586a4(vxr vxrVar, xxr xxrVar, View view) {
        vxrVar.m200591f4(xxrVar);
    }

    /* JADX INFO: renamed from: b4 */
    public static void m200587b4(vxr vxrVar, Throwable th) {
        ((hxr) vxrVar.viewModel).m133384T();
    }

    /* JADX INFO: renamed from: c4 */
    private final void m200588c4(final User user) {
        if (user != null) {
            final String strM202213p = w8u.m202213p(user.name, 6);
            String strM202218u = w8u.m202218u(R$string.f47553u0, strM202213p);
            wxr wxrVar = wxr.INSTANCE;
            strM202218u.getClass();
            strM202213p.getClass();
            new xh0.C21150a(this.f188513f).m208740s(w8u.m202217t(R$string.f47575v0)).m208731j(wxrVar.m206024a(strM202218u, strM202213p, kvc0.m147352a(h1c0.f105330R))).m208738q(R$string.f47423o2).m208736o(new View.OnClickListener() { // from class: l.nxr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    vxr.m200589d4(this.f141045a, user, strM202213p, view);
                }
            }).m208737p(h1c0.f105357d).m208727f(act().getString(R$string.f47662z)).m208722a().m208721g();
        }
    }

    /* JADX INFO: renamed from: d4 */
    public static final void m200589d4(vxr vxrVar, User user, String str, View view) {
        String str2 = user.f56011id;
        str2.getClass();
        str.getClass();
        vxrVar.m200590e4(str2, str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: e4 */
    public final void m200590e4(String userId, final String userName) {
        duringCreated(LivingNormalApiProvider.m71624y3(m206027E2().m149818o(), userId)).subscribe(ffw.m121194e(new e30() { // from class: l.qxr
            @Override // p149l.e30
            public final void call(Object obj) {
                vxr.m200582W3(userName, (BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.rxr
            @Override // p149l.e30
            public final void call(Object obj) {
                vxr.m200584Y3((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: f4 */
    public final void m200591f4(final xxr model) {
        duringCreated(LivingNormalApiProvider.m71357U6(m206027E2().m149818o(), model.getCom.p1.mobile.putong.core.data.Item.TYPE java.lang.String().f44338id)).subscribe(ffw.m121194e(new e30() { // from class: l.txr
            @Override // p149l.e30
            public final void call(Object obj) {
                vxr.m200578S3(this.f172528a, model, (BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.uxr
            @Override // p149l.e30
            public final void call(Object obj) {
                vxr.m200583X3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g4 */
    public final void m200592g4(@NotNull final xxr model) {
        model.getClass();
        String strM202213p = w8u.m202213p(model.getCom.p1.mobile.putong.core.data.Item.TYPE java.lang.String().userName, 6);
        String strM202218u = w8u.m202218u(R$string.f47597w0, strM202213p);
        wxr wxrVar = wxr.INSTANCE;
        strM202218u.getClass();
        strM202213p.getClass();
        new xh0.C21150a(this.f188513f).m208740s(w8u.m202217t(R$string.f47619x0)).m208731j(wxrVar.m206024a(strM202218u, strM202213p, kvc0.m147352a(h1c0.f105330R))).m208738q(R$string.f47423o2).m208736o(new View.OnClickListener() { // from class: l.sxr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vxr.m200586a4(this.f166816a, model, view);
            }
        }).m208737p(h1c0.f105357d).m208727f(act().getString(R$string.f47662z)).m208722a().m208721g();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: h4 */
    public final void m200593h4() {
        duringCreated(LivingNormalApiProvider.m71229G4(m206027E2().m149818o())).subscribe(ffw.m121194e(new e30() { // from class: l.oxr
            @Override // p149l.e30
            public final void call(Object obj) {
                vxr.m200585Z3(this.f146233a, (BLiveExtraResponse) obj);
            }
        }, new e30() { // from class: l.pxr
            @Override // p149l.e30
            public final void call(Object obj) {
                vxr.m200587b4(this.f151719a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i4 */
    public final void m200594i4() {
        if (this.viewModel == 0) {
            Act act = this.f188513f;
            act.getClass();
            hxr hxrVar = new hxr(act, this);
            this.viewModel = hxrVar;
            hxrVar.mo21065i1(this);
        }
        ((hxr) this.viewModel).m71834E();
        m200593h4();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().LiveBlackListEvent.showBlackListDialog().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.lxr
            @Override // p149l.e30
            public final void call(Object obj) {
                vxr.m200579T3(this.f130429a, (soj0) obj);
            }
        }));
        duringCreated(m206028F2().LiveBlackListEvent.addBlackListDialog().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.mxr
            @Override // p149l.e30
            public final void call(Object obj) {
                vxr.m200580U3(this.f136201a, (User) obj);
            }
        }));
    }
}
