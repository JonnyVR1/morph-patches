package p153l;

import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.base.data.BLiveChatJailedType;
import com.p051p1.mobile.putong.live.base.data.BLiveChatMangerSettings;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Objects;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class mz4 extends qct<oo2> {

    /* JADX INFO: renamed from: i */
    public final az4 f139476i;

    /* JADX INFO: renamed from: j */
    public BLiveChatMangerSettings f139477j;

    public mz4(dum<? extends oo2> dumVar) {
        super(dumVar);
        this.f139476i = new az4(this);
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ void m160879K3(Throwable th) {
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m160887T3(BLiveChatMangerSettings bLiveChatMangerSettings) {
        this.f196919f.progressDismiss();
        if (!NullChecker.m82486a(bLiveChatMangerSettings)) {
            o1j0.m165649w(R$string.f47890Wc);
            return;
        }
        this.f139477j = bLiveChatMangerSettings;
        o1j0.m165649w(R$string.f47911Xc);
        this.f196919f.hideInput(this.f139476i.f74081h);
        this.f139476i.m100995n();
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m160888U3(Throwable th) {
        TantanException.Client.CoreService coreService;
        int i;
        this.f196919f.progressDismiss();
        if ((th instanceof TantanException.Client.CoreService) && ((i = (coreService = (TantanException.Client.CoreService) th).code) == 44101 || i == 44102 || i == 44103 || i == 44104)) {
            o1j0.m165651y(coreService.metaMessage);
        } else {
            o1j0.m165649w(R$string.f47890Wc);
        }
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m160889V3(BLiveChatMangerSettings bLiveChatMangerSettings) {
        this.f139477j = bLiveChatMangerSettings;
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ BLiveChatMangerSettings m160890W3(BLiveChatMangerSettings bLiveChatMangerSettings) {
        this.f139477j = bLiveChatMangerSettings;
        return bLiveChatMangerSettings;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ C22421c m160891X3(BLiveButtonType bLiveButtonType) {
        return NullChecker.m82486a(this.f139477j) ? C22421c.just(this.f139477j) : LivingNormalApiProvider.m72385D4(m213810E2().m202194o()).map(new qcj() { // from class: l.kz4
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f129383a.m160890W3((BLiveChatMangerSettings) obj);
            }
        }).onErrorReturn(new qcj() { // from class: l.lz4
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return BLiveChatMangerSettings.new_();
            }
        });
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m160892Y3(C4470c c4470c) {
        if (c4470c == C4470c.f16269k) {
            this.f139476i.m100997p();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: Z3 */
    public void m160893Z3(BLiveChatJailedType bLiveChatJailedType, List<String> list) {
        this.f196919f.progress(zrv.f205803e.getString(R$string.f47932Yc));
        duringCreated(LivingNormalApiProvider.m72405F6(m213810E2().m202194o(), bLiveChatJailedType, list)).subscribe(dhw.m115826e(new y20() { // from class: l.cz4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f84421a.m160887T3((BLiveChatMangerSettings) obj);
            }
        }, new y20() { // from class: l.dz4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91322a.m160888U3((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(LivingNormalApiProvider.m72385D4(m213810E2().m202194o())).subscribe(dhw.m115826e(new y20() { // from class: l.ez4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96558a.m160889V3((BLiveChatMangerSettings) obj);
            }
        }, new y20() { // from class: l.fz4
            @Override // p153l.y20
            public final void call(Object obj) {
                mz4.m160879K3((Throwable) obj);
            }
        }));
        C22421c<T> c22421cDuringCreated = duringCreated((C22421c) m213811F2().BottomEvent.showDialog().m199270g().filter(new qcj() { // from class: l.gz4
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals((BLiveButtonType) obj, BLiveButtonType.chatManager));
            }
        }).flatMap(new qcj() { // from class: l.hz4
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f112192a.m160891X3((BLiveButtonType) obj);
            }
        }));
        final az4 az4Var = this.f139476i;
        Objects.requireNonNull(az4Var);
        c22421cDuringCreated.subscribe(dhw.m115829h(new y20() { // from class: l.iz4
            @Override // p153l.y20
            public final void call(Object obj) {
                az4Var.m100991E((BLiveChatMangerSettings) obj);
            }
        }));
        lifecycle().subscribe(dhw.m115825d(new y20() { // from class: l.jz4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123223a.m160892Y3((C4470c) obj);
            }
        }));
    }
}
