package p002l;

import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p1.mobile.putong.live.base.data.BLiveChatJailedType;
import com.p1.mobile.putong.live.base.data.BLiveChatMangerSettings;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Objects;
import l.e30;
import l.ffw;
import l.lsi0;
import l.w9j;
import l.ypv;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ny4 extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    public final by4 f16304i;

    /* JADX INFO: renamed from: j */
    public BLiveChatMangerSettings f16305j;

    public ny4(bsm<? extends ho2> bsmVar) {
        super(bsmVar);
        this.f16304i = new by4(this);
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ void m19150K3(Throwable th) {
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m19158T3(BLiveChatMangerSettings bLiveChatMangerSettings) {
        this.f22037f.progressDismiss();
        if (!NullChecker.a(bLiveChatMangerSettings)) {
            lsi0.w(R$string.f3084Wc);
            return;
        }
        this.f16305j = bLiveChatMangerSettings;
        lsi0.w(R$string.f3105Xc);
        this.f22037f.hideInput(this.f16304i.f8413h);
        this.f16304i.m10671n();
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m19159U3(Throwable th) {
        TantanException.Client.CoreService coreService;
        int i;
        this.f22037f.progressDismiss();
        if ((th instanceof TantanException.Client.CoreService) && ((i = (coreService = (TantanException.Client.CoreService) th).code) == 44101 || i == 44102 || i == 44103 || i == 44104)) {
            lsi0.y(coreService.metaMessage);
        } else {
            lsi0.w(R$string.f3084Wc);
        }
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m19160V3(BLiveChatMangerSettings bLiveChatMangerSettings) {
        this.f16305j = bLiveChatMangerSettings;
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ BLiveChatMangerSettings m19161W3(BLiveChatMangerSettings bLiveChatMangerSettings) {
        this.f16305j = bLiveChatMangerSettings;
        return bLiveChatMangerSettings;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ c m19162X3(BLiveButtonType bLiveButtonType) {
        return NullChecker.a(this.f16305j) ? c.just(this.f16305j) : LivingNormalApiProvider.m4568D4(m25547E2().m17239o()).map(new w9j() { // from class: l.ly4
            public final Object call(Object obj) {
                return this.f15120a.m19161W3((BLiveChatMangerSettings) obj);
            }
        }).onErrorReturn(new w9j() { // from class: l.my4
            public final Object call(Object obj) {
                return BLiveChatMangerSettings.new_();
            }
        });
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m19163Y3(com.p1.mobile.android.app.c cVar) {
        if (cVar == com.p1.mobile.android.app.c.k) {
            this.f16304i.m10673p();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: Z3 */
    public void m19164Z3(BLiveChatJailedType bLiveChatJailedType, List<String> list) {
        this.f22037f.progress(ypv.e.getString(R$string.f3126Yc));
        duringCreated(LivingNormalApiProvider.m4588F6(m25547E2().m17239o(), bLiveChatJailedType, list)).subscribe(ffw.e(new e30() { // from class: l.dy4
            public final void call(Object obj) {
                this.f9479a.m19158T3((BLiveChatMangerSettings) obj);
            }
        }, new e30() { // from class: l.ey4
            public final void call(Object obj) {
                this.f10046a.m19159U3((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: t */
    public void m19165t() {
        super.t();
        duringCreated(LivingNormalApiProvider.m4568D4(m25547E2().m17239o())).subscribe(ffw.e(new e30() { // from class: l.fy4
            public final void call(Object obj) {
                this.f10682a.m19160V3((BLiveChatMangerSettings) obj);
            }
        }, new e30() { // from class: l.gy4
            public final void call(Object obj) {
                ny4.m19150K3((Throwable) obj);
            }
        }));
        c cVarDuringCreated = duringCreated(((c) m25548F2().BottomEvent.showDialog().g()).filter(new w9j() { // from class: l.hy4
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals((BLiveButtonType) obj, "chatManager"));
            }
        }).flatMap(new w9j() { // from class: l.iy4
            public final Object call(Object obj) {
                return this.f13477a.m19162X3((BLiveButtonType) obj);
            }
        }));
        final by4 by4Var = this.f16304i;
        Objects.requireNonNull(by4Var);
        cVarDuringCreated.subscribe(ffw.h(new e30() { // from class: l.jy4
            public final void call(Object obj) {
                by4Var.m10667E((BLiveChatMangerSettings) obj);
            }
        }));
        lifecycle().subscribe(ffw.d(new e30() { // from class: l.ky4
            public final void call(Object obj) {
                this.f14581a.m19163Y3((com.p1.mobile.android.app.c) obj);
            }
        }));
    }
}
