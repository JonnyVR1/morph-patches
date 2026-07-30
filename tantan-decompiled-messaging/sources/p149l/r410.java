package p149l;

import android.text.TextUtils;
import android.util.Pair;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
public class r410 extends i410<yl40> {

    /* JADX INFO: renamed from: k */
    public final HashMap<String, Pair<String, c4g0>> f157629k;

    public r410(bsm<yl40> bsmVar, j510<yl40> j510Var) {
        super(bsmVar, j510Var);
        this.f157629k = new HashMap<>();
    }

    /* JADX INFO: renamed from: T3 */
    public static /* synthetic */ C22306c m177755T3(BLiveMultiCall bLiveMultiCall) {
        return bLiveMultiCall.isAway ? LivingNormalApiProvider.m71436d4(bLiveMultiCall.f44400id) : C22306c.just(bLiveMultiCall);
    }

    @Override // p149l.i410
    /* JADX INFO: renamed from: M3 */
    public void mo134318M3(u5t u5tVar) {
        super.mo134318M3(u5tVar);
        BLiveMultiCall bLiveMultiCallM191876b = u5tVar.m191876b();
        m206028F2().MultiCallEvent.updateMultiCall().mo172463j(bLiveMultiCallM191876b);
        if (vg10.m198312d(bLiveMultiCallM191876b) || vg10.m198311c(bLiveMultiCallM191876b)) {
            m177766e4(bLiveMultiCallM191876b.userId);
        } else if (vg10.m198309a(bLiveMultiCallM191876b)) {
            m177760Y3(bLiveMultiCallM191876b);
        }
    }

    @Override // p149l.i410
    /* JADX INFO: renamed from: O3 */
    public void mo134320O3(String str) {
        yi10.m214879a("onMemberJoinSdkSuccess , userId=" + str);
        Pair<String, c4g0> pair = this.f157629k.get(str);
        if (pair == null) {
            return;
        }
        yi10.m214879a("onMemberJoinSdkSuccess and user's call exist");
        final String str2 = (String) pair.first;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        duringCreated(LivingNormalApiProvider.m71384X6(str2)).flatMap(new w9j() { // from class: l.o410
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return r410.m177755T3((BLiveMultiCall) obj);
            }
        }).doOnError(new e30() { // from class: l.p410
            @Override // p149l.e30
            public final void call(Object obj) {
                yi10.m214879a("report failed callId:" + str2);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.q410
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f152533a.m177767f4((BLiveMultiCall) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y3 */
    public void m177760Y3(final BLiveMultiCall bLiveMultiCall) {
        if (!this.f157629k.containsKey(bLiveMultiCall.userId)) {
            this.f157629k.put(bLiveMultiCall.userId, new Pair<>(bLiveMultiCall.f44400id, m129299H3(((yl40) m206027E2()).m132135h2(60, TimeUnit.SECONDS)).take(1).filter(new w9j() { // from class: l.k410
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f120927a.m177761Z3(bLiveMultiCall, (Long) obj);
                }
            }).subscribe(ffw.m121194e(new e30() { // from class: l.l410
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f125961a.m177762a4(bLiveMultiCall, (Long) obj);
                }
            }, new e30() { // from class: l.m410
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f131216a.m177763b4(bLiveMultiCall, (Throwable) obj);
                }
            }))));
            yi10.m214879a("add watchdog ,userId=" + bLiveMultiCall.userId);
        }
        this.f111398i.put(bLiveMultiCall.userId, bLiveMultiCall);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ Boolean m177761Z3(BLiveMultiCall bLiveMultiCall, Long l2) {
        return Boolean.valueOf(this.f111399j.m139800b4().m100371q(bLiveMultiCall.f44400id) == null);
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m177762a4(BLiveMultiCall bLiveMultiCall, Long l2) {
        m177765d4(bLiveMultiCall);
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m177763b4(BLiveMultiCall bLiveMultiCall, Throwable th) {
        yi10.m214879a("user timer connecting failed ,userId=" + bLiveMultiCall.userId);
        m177766e4(bLiveMultiCall.userId);
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m177764c4(BLiveMultiCall bLiveMultiCall, BLiveMultiCall bLiveMultiCall2) {
        m206028F2().MultiCallEvent.updateMultiCall().mo172463j(bLiveMultiCall2);
        this.f111399j.m139820v4(bLiveMultiCall);
    }

    /* JADX INFO: renamed from: d4 */
    public final void m177765d4(final BLiveMultiCall bLiveMultiCall) {
        m177766e4(bLiveMultiCall.userId);
        yi10.m214879a("ConnectFailed ,userId=" + bLiveMultiCall.userId);
        r610.m177991Z(this, bLiveMultiCall.f44400id);
        duringCreated(LivingNormalApiProvider.m71447e6(bLiveMultiCall.f44400id, "time-out")).subscribe(ffw.m121197h(new e30() { // from class: l.n410
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f137036a.m177764c4(bLiveMultiCall, (BLiveMultiCall) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e4 */
    public final void m177766e4(String str) {
        yi10.m214879a("remove watchdog ,userId=" + str);
        Pair<String, c4g0> pair = this.f157629k.get(str);
        if (pair == null) {
            return;
        }
        mkd0.m154992z((c4g0) pair.second);
        this.f157629k.remove(str);
        yi10.m214879a("remove watchdog success");
    }

    /* JADX INFO: renamed from: f4 */
    public final void m177767f4(BLiveMultiCall bLiveMultiCall) {
        yi10.m214879a("reportSuccess callId:" + bLiveMultiCall.f44400id);
        BLiveMultiCall bLiveMultiCallM100371q = this.f111399j.m139800b4().m100371q(bLiveMultiCall.f44400id);
        j510<D> j510Var = this.f111399j;
        if (bLiveMultiCallM100371q == null) {
            j510Var.m139798Z3(bLiveMultiCall);
        } else {
            j510Var.m139822x4(bLiveMultiCall);
        }
        m177766e4(bLiveMultiCall.userId);
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        vwb.m200354z(this.f157629k.values(), new e30() { // from class: l.j410
            @Override // p149l.e30
            public final void call(Object obj) {
                mkd0.m154992z((c4g0) ((Pair) obj).second);
            }
        });
        this.f157629k.clear();
    }

    @Override // p149l.i410, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
    }
}
