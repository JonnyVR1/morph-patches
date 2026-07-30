package p149l;

import android.net.NetworkInfo;
import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveCall;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveCallMessage;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
public class iy3 extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    public final q0s f115424i;

    /* JADX INFO: renamed from: j */
    public final ArrayList<z24> f115425j;

    /* JADX INFO: renamed from: k */
    public final HashMap<String, c4g0> f115426k;

    public iy3(bsm bsmVar, q0s q0sVar) {
        super(bsmVar);
        this.f115425j = new ArrayList<>();
        this.f115426k = new HashMap<>();
        this.f115424i = q0sVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e4 */
    public /* synthetic */ void m138939e4(Long l2) {
        m138940V3();
    }

    /* JADX INFO: renamed from: V3 */
    public final void m138940V3() {
        final q0s q0sVar = this.f115424i;
        Objects.requireNonNull(q0sVar);
        q0sVar.m162530Y3(new e30() { // from class: l.dy3
            @Override // p149l.e30
            public final void call(Object obj) {
                q0sVar.m201783e5((i0s) obj);
            }
        });
    }

    /* JADX INFO: renamed from: W3 */
    public boolean m138941W3(final Long l2) {
        z24 z24Var = (z24) vwb.m200346r(this.f115425j, new w9j() { // from class: l.fy3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((z24) obj).f201156a.user, String.valueOf(l2)));
            }
        });
        if (z24Var == null) {
            return false;
        }
        m138954k4(z24Var);
        m138956m4(z24Var.f201156a.f44342id);
        return true;
    }

    /* JADX INFO: renamed from: X3 */
    public void m138942X3(cud cudVar) {
        this.f115424i.m172350u4(false, !this.f115425j.isEmpty());
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m138943Y3(BLiveCall bLiveCall) {
        this.f115424i.mo162543m4(bLiveCall);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m138944Z3(z24 z24Var, BLiveCall bLiveCall) {
        z24Var.f201156a = bLiveCall;
        this.f115425j.remove(z24Var);
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ Boolean m138945a4(z24 z24Var, Long l2) {
        return Boolean.valueOf(this.f115424i.m162531Z3().m108760m().m133915i(z24Var.f201156a.f44342id) == null);
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ C22306c m138946b4(z24 z24Var, Long l2) {
        return duringCreated(LivingNormalApiProvider.m71456f6(z24Var.f201156a.f44342id, true, r14.f157231b));
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m138947c4(z24 z24Var, List list) {
        m138949f4(z24Var);
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m138948d4(NetworkInfo networkInfo) {
        m138940V3();
    }

    /* JADX INFO: renamed from: f4 */
    public final void m138949f4(z24 z24Var) {
        lsi0.m151595y(this.f188513f.getString(R$string.f46712H1, z24Var.f201157b.f111521b));
        h54.m129377d("anchor onConnectFailed callId" + z24Var.f201156a.f44342id);
        this.f115425j.remove(z24Var);
        this.f115424i.m172350u4(false, this.f115425j.isEmpty() ^ true);
        m138952i4(z24Var.f201156a);
    }

    /* JADX INFO: renamed from: g4 */
    public void m138950g4(final z24 z24Var) {
        h54.m129377d("onVoiceCallAgreed callId:" + z24Var.f201156a.f44342id);
        z24 z24Var2 = (z24) vwb.m200346r(this.f115425j, new w9j() { // from class: l.gy3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((z24) obj).f201156a.user, z24Var.f201156a.user));
            }
        });
        if (z24Var2 != null) {
            this.f115425j.remove(z24Var2);
        }
        this.f115425j.add(z24Var);
        m138955l4(z24Var);
        this.f115424i.m172350u4(true, !this.f115425j.isEmpty());
    }

    /* JADX INFO: renamed from: h4 */
    public void m138951h4(final LiveCallMessage liveCallMessage) {
        z24 z24Var;
        if (!liveCallMessage.m71823is(28) || (z24Var = (z24) vwb.m200346r(this.f115425j, new w9j() { // from class: l.ey3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(liveCallMessage.getCallId(), ((z24) obj).f201156a.f44342id));
            }
        })) == null) {
            return;
        }
        this.f115425j.remove(z24Var.f201156a);
        m138956m4(z24Var.f201156a.f44342id);
        m138952i4(z24Var.f201156a);
    }

    /* JADX INFO: renamed from: i4 */
    public final void m138952i4(BLiveCall bLiveCall) {
        m206028F2().CallEvent.removeCallCheck().mo172463j(bLiveCall);
    }

    /* JADX INFO: renamed from: j4 */
    public void m138953j4(BLiveCall bLiveCall) {
        h54.m129377d("report call video success id = " + bLiveCall.f44342id);
        C22306c<T> c22306cDuringCreated = duringCreated(LivingNormalApiProvider.m71393Y6(bLiveCall.f44342id, true, LivingNormalApiProvider.ConnectType.VIDEO_TYPE));
        e30 e30Var = new e30() { // from class: l.hy3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f110026a.m138943Y3((BLiveCall) obj);
            }
        };
        q0s q0sVar = this.f115424i;
        Objects.requireNonNull(q0sVar);
        c22306cDuringCreated.subscribe(ffw.m121194e(e30Var, new k0s(q0sVar)));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m138954k4(final z24 z24Var) {
        h54.m129377d("reportVoiceSuccess callId:" + z24Var.f201156a.f44342id);
        C22306c<T> c22306cDuringCreated = duringCreated(LivingNormalApiProvider.m71393Y6(z24Var.f201156a.f44342id, true, LivingNormalApiProvider.ConnectType.VOICE_TYPE));
        e30 e30Var = new e30() { // from class: l.yx3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f200563a.m138944Z3(z24Var, (BLiveCall) obj);
            }
        };
        q0s q0sVar = this.f115424i;
        Objects.requireNonNull(q0sVar);
        c22306cDuringCreated.subscribe(ffw.m121194e(e30Var, new k0s(q0sVar)));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2] */
    /* JADX INFO: renamed from: l4 */
    public final void m138955l4(final z24 z24Var) {
        h54.m129377d("startConnectWatchDog callId:" + z24Var.f201156a.f44342id);
        C22306c c22306cFlatMap = m129299H3(m206027E2().m132135h2(30, TimeUnit.SECONDS)).take(1).filter(new w9j() { // from class: l.vx3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f183413a.m138945a4(z24Var, (Long) obj);
            }
        }).flatMap(new w9j() { // from class: l.wx3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f188427a.m138946b4(z24Var, (Long) obj);
            }
        });
        e30 e30Var = new e30() { // from class: l.xx3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f194808a.m138947c4(z24Var, (List) obj);
            }
        };
        q0s q0sVar = this.f115424i;
        Objects.requireNonNull(q0sVar);
        this.f115426k.put(z24Var.f201156a.f44342id, c22306cFlatMap.subscribe(ffw.m121194e(e30Var, new k0s(q0sVar))));
    }

    /* JADX INFO: renamed from: m4 */
    public final void m138956m4(String str) {
        h54.m129377d("CallAnchorControlModule stop call timer id = " + str);
        mkd0.m154992z(this.f115426k.remove(str));
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f115425j.clear();
        this.f115426k.clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v11, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206027E2().m132160q1().m189101f()).subscribe(new e30() { // from class: l.ux3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f178699a.m138951h4((LiveCallMessage) obj);
            }
        });
        duringCreated(this.f115424i.m162532a4()).subscribe(ffw.m121193d(new e30() { // from class: l.zx3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f205373a.m138942X3((cud) obj);
            }
        }));
        duringCreated(ConnectivityReceiver.m81290m()).skip(1).filter(new w9j() { // from class: l.ay3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m81284g());
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.by3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f77851a.m138948d4((NetworkInfo) obj);
            }
        }));
        m129299H3(m206027E2().m132135h2(20, TimeUnit.SECONDS)).subscribe(ffw.m121193d(new e30() { // from class: l.cy3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f82919a.m138939e4((Long) obj);
            }
        }));
    }
}
