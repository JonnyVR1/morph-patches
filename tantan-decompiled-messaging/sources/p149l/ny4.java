package p149l;

import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p046p1.mobile.putong.live.base.data.BLiveChatJailedType;
import com.p046p1.mobile.putong.live.base.data.BLiveChatMangerSettings;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Objects;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class ny4 extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    public final by4 f141078i;

    /* JADX INFO: renamed from: j */
    public BLiveChatMangerSettings f141079j;

    public ny4(bsm<? extends ho2> bsmVar) {
        super(bsmVar);
        this.f141078i = new by4(this);
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ void m161967K3(Throwable th) {
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m161975T3(BLiveChatMangerSettings bLiveChatMangerSettings) {
        this.f188513f.progressDismiss();
        if (!NullChecker.m81303a(bLiveChatMangerSettings)) {
            lsi0.m151593w(R$string.f47042Wc);
            return;
        }
        this.f141079j = bLiveChatMangerSettings;
        lsi0.m151593w(R$string.f47063Xc);
        this.f188513f.hideInput(this.f141078i.f77860h);
        this.f141078i.m104414n();
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m161976U3(Throwable th) {
        TantanException.Client.CoreService coreService;
        int i;
        this.f188513f.progressDismiss();
        if ((th instanceof TantanException.Client.CoreService) && ((i = (coreService = (TantanException.Client.CoreService) th).code) == 44101 || i == 44102 || i == 44103 || i == 44104)) {
            lsi0.m151595y(coreService.metaMessage);
        } else {
            lsi0.m151593w(R$string.f47042Wc);
        }
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m161977V3(BLiveChatMangerSettings bLiveChatMangerSettings) {
        this.f141079j = bLiveChatMangerSettings;
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ BLiveChatMangerSettings m161978W3(BLiveChatMangerSettings bLiveChatMangerSettings) {
        this.f141079j = bLiveChatMangerSettings;
        return bLiveChatMangerSettings;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ C22306c m161979X3(BLiveButtonType bLiveButtonType) {
        return NullChecker.m81303a(this.f141079j) ? C22306c.just(this.f141079j) : LivingNormalApiProvider.m71202D4(m206027E2().m149818o()).map(new w9j() { // from class: l.ly4
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f130492a.m161978W3((BLiveChatMangerSettings) obj);
            }
        }).onErrorReturn(new w9j() { // from class: l.my4
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return BLiveChatMangerSettings.new_();
            }
        });
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m161980Y3(C4319c c4319c) {
        if (c4319c == C4319c.f15550k) {
            this.f141078i.m104416p();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: Z3 */
    public void m161981Z3(BLiveChatJailedType bLiveChatJailedType, List<String> list) {
        this.f188513f.progress(ypv.f199497e.getString(R$string.f47084Yc));
        duringCreated(LivingNormalApiProvider.m71222F6(m206027E2().m149818o(), bLiveChatJailedType, list)).subscribe(ffw.m121194e(new e30() { // from class: l.dy4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f88345a.m161975T3((BLiveChatMangerSettings) obj);
            }
        }, new e30() { // from class: l.ey4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93721a.m161976U3((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(LivingNormalApiProvider.m71202D4(m206027E2().m149818o())).subscribe(ffw.m121194e(new e30() { // from class: l.fy4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99831a.m161977V3((BLiveChatMangerSettings) obj);
            }
        }, new e30() { // from class: l.gy4
            @Override // p149l.e30
            public final void call(Object obj) {
                ny4.m161967K3((Throwable) obj);
            }
        }));
        C22306c<T> c22306cDuringCreated = duringCreated((C22306c) m206028F2().BottomEvent.showDialog().m172460g().filter(new w9j() { // from class: l.hy4
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals((BLiveButtonType) obj, BLiveButtonType.chatManager));
            }
        }).flatMap(new w9j() { // from class: l.iy4
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f115427a.m161979X3((BLiveButtonType) obj);
            }
        }));
        final by4 by4Var = this.f141078i;
        Objects.requireNonNull(by4Var);
        c22306cDuringCreated.subscribe(ffw.m121197h(new e30() { // from class: l.jy4
            @Override // p149l.e30
            public final void call(Object obj) {
                by4Var.m104410E((BLiveChatMangerSettings) obj);
            }
        }));
        lifecycle().subscribe(ffw.m121193d(new e30() { // from class: l.ky4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f125242a.m161980Y3((C4319c) obj);
            }
        }));
    }
}
