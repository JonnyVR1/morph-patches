package p149l;

import androidx.core.app.NotificationCompat;
import com.google.common.base.Optional;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.AcceleratePairingStatus;
import com.p046p1.mobile.putong.core.data.BoostResultEntry;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.CrashHelper;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0011¢\u0006\u0004\b\u001a\u0010\u0016J3\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\b\b\u0002\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u0010\u001c\u001a\u00020\u00112\b\b\u0002\u0010\u001d\u001a\u00020\u000bH\u0007¢\u0006\u0004\b \u0010!J\u0013\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0004\b\"\u0010#J\u001b\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u001e2\u0006\u0010$\u001a\u00020\u0017¢\u0006\u0004\b&\u0010'J\u0019\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060(0\u001e¢\u0006\u0004\b)\u0010#J\r\u0010+\u001a\u00020*¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\b¢\u0006\u0004\b-\u0010.R\"\u00103\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u0016\"\u0004\b2\u0010\u0014R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0017\u0010=\u001a\u0002088\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010C\u001a\u00020>8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010F\u001a\u00020>8\u0006¢\u0006\f\n\u0004\bD\u0010@\u001a\u0004\bE\u0010BRp\u0010K\u001a^\u0012(\u0012&\u0012\f\u0012\n H*\u0004\u0018\u00010\u00060\u0006 H*\u0012\u0012\f\u0012\n H*\u0004\u0018\u00010\u00060\u0006\u0018\u00010(0( H*.\u0012(\u0012&\u0012\f\u0012\n H*\u0004\u0018\u00010\u00060\u0006 H*\u0012\u0012\f\u0012\n H*\u0004\u0018\u00010\u00060\u0006\u0018\u00010(0(\u0018\u00010G0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR;\u0010O\u001a&\u0012\f\u0012\n H*\u0004\u0018\u00010\u001f0\u001f H*\u0012\u0012\f\u0012\n H*\u0004\u0018\u00010\u001f0\u001f\u0018\u00010G0G8\u0006¢\u0006\f\n\u0004\bL\u0010J\u001a\u0004\bM\u0010N¨\u0006P"}, m87232d2 = {"Ll/av6;", "Ll/ax6;", "Lcom/p1/mobile/putong/core/api/c;", "api", "<init>", "(Lcom/p1/mobile/putong/core/api/c;)V", "Lcom/p1/mobile/putong/core/data/AcceleratePairingStatus;", NotificationCompat.CATEGORY_STATUS, "", "J3", "(Lcom/p1/mobile/putong/core/data/AcceleratePairingStatus;)V", "", "param", "n3", "(Ljava/lang/String;)Ljava/lang/String;", "m3", "()Ljava/lang/String;", "", "show", "I3", "(Z)V", "r3", "()Z", "", "q3", "()J", "t3", "isFreeUse", "isAfterFreeUse", "freeUseRecordId", "Lrx/c;", "Ll/roj0;", "D3", "(ZZLjava/lang/String;)Lrx/c;", "y3", "()Lrx/c;", "lastMillisecond", "Lcom/p1/mobile/putong/core/data/BoostResultEntry;", "u3", "(J)Lrx/c;", "Lcom/google/common/base/Optional;", "o3", "", "p3", "()I", "H3", "()V", "R", "Z", "getNeedShowAcceleratePairingProgressDialog", "C3", "needShowAcceleratePairingProgressDialog", "Ll/hpd0;", j6f.LATITUDE_SOUTH, "Ll/hpd0;", "acceleratePairingConfirmDialogShown", "Ll/uqd0;", j6f.GPS_DIRECTION_TRUE, "Ll/uqd0;", "getLastAcceleratePairingId", "()Ll/uqd0;", "lastAcceleratePairingId", "Ll/zpd0;", "U", "Ll/zpd0;", "getLastAcceleratePairedId", "()Ll/zpd0;", "lastAcceleratePairedId", j6f.GPS_MEASUREMENT_INTERRUPTED, "getLastClickConfirmDialogCheckTime", "lastClickConfirmDialogCheckTime", "Lrx/subjects/a;", "kotlin.jvm.PlatformType", "W", "Lrx/subjects/a;", "acceleratePairingStatusBs", "X", "s3", "()Lrx/subjects/a;", "rightGuideBs", "b_core_base"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class av6 extends ax6 {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public boolean needShowAcceleratePairingProgressDialog;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @NotNull
    public final hpd0 acceleratePairingConfirmDialogShown;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @NotNull
    public final uqd0 lastAcceleratePairingId;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    @NotNull
    public final zpd0 lastAcceleratePairedId;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    @NotNull
    public final zpd0 lastClickConfirmDialogCheckTime;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public final C22392a<Optional<AcceleratePairingStatus>> acceleratePairingStatusBs;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public final C22392a<roj0> rightGuideBs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av6(@NotNull C4732c c4732c) {
        super(c4732c);
        c4732c.getClass();
        this.acceleratePairingConfirmDialogShown = new hpd0("accelerate_pairing_confirm_dialog_shown_" + CoreModule.m29931H().userId(), Boolean.FALSE);
        this.lastAcceleratePairingId = new uqd0("last_accelerate_pairing_id_" + CoreModule.m29931H().userId(), "");
        this.lastAcceleratePairedId = new zpd0("last_finished_accelerate_pairing_id_" + CoreModule.m29931H().userId(), 0L);
        this.lastClickConfirmDialogCheckTime = new zpd0("last_click_confirm_dialog_check_time" + CoreModule.m29931H().userId(), 0L);
        this.acceleratePairingStatusBs = C22392a.m221513c(Optional.absent());
        this.rightGuideBs = C22392a.m221512b();
    }

    /* JADX INFO: renamed from: A3 */
    public static final roj0 m99115A3(av6 av6Var, Envelope envelope) {
        envelope.getClass();
        AcceleratePairingStatus acceleratePairingStatus = ((CoreData) envelope.getModuleData(CoreData.class)).acceleratePairing;
        av6Var.acceleratePairingStatusBs.m132487l(Optional.fromNullable(acceleratePairingStatus));
        av6Var.m99140J3(acceleratePairingStatus);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: B3 */
    public static final roj0 m99116B3(Function1 function1, Object obj) {
        return (roj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: E3 */
    public static final stc0 m99117E3(av6 av6Var, JSONObject jSONObject) {
        return C4728a.f19494P.auth().m185898q(av6Var.m99141m3()).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
    }

    /* JADX INFO: renamed from: F3 */
    public static final roj0 m99118F3(av6 av6Var, Envelope envelope) {
        envelope.getClass();
        AcceleratePairingStatus acceleratePairingStatus = ((CoreData) envelope.getModuleData(CoreData.class)).acceleratePairing;
        if (acceleratePairingStatus != null) {
            av6Var.acceleratePairingStatusBs.m132487l(Optional.m15413of(acceleratePairingStatus));
            av6Var.m99140J3(acceleratePairingStatus);
        }
        CoreModule.m29935P().m94654e().mo34967Fq();
        CoreModule.f17545c.f19555C0.m210115x4();
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: G3 */
    public static final roj0 m99119G3(Function1 function1, Object obj) {
        return (roj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: b3 */
    public static C22306c m99121b3(final av6 av6Var, final long j) {
        C22306c<Envelope> c22306cObserveOn = ia20.m135121e(new v9j() { // from class: l.wu6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return av6.m99132v3(this.f188088a, j);
            }
        }).observeOn(jo0.m142408a());
        final Function1 function1 = new Function1() { // from class: l.xu6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return av6.m99133w3((Envelope) obj);
            }
        };
        return c22306cObserveOn.map(new w9j() { // from class: l.yu6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return av6.m99134x3(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: k3 */
    public static C22306c m99130k3(final av6 av6Var) {
        C22306c<Envelope> c22306cM135117a = ia20.m135117a(new v9j() { // from class: l.ru6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return av6.m99135z3(this.f161035a);
            }
        });
        final Function1 function1 = new Function1() { // from class: l.su6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return av6.m99115A3(this.f166452a, (Envelope) obj);
            }
        };
        return c22306cM135117a.map(new w9j() { // from class: l.tu6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return av6.m99116B3(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: l3 */
    public static C22306c m99131l3(final av6 av6Var, final JSONObject jSONObject) {
        C22306c<Envelope> c22306cObserveOn = ia20.m135121e(new v9j() { // from class: l.zu6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return av6.m99117E3(this.f204826a, jSONObject);
            }
        }).observeOn(jo0.m142408a());
        final Function1 function1 = new Function1() { // from class: l.pu6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return av6.m99118F3(this.f151252a, (Envelope) obj);
            }
        };
        return c22306cObserveOn.map(new w9j() { // from class: l.qu6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return av6.m99119G3(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: v3 */
    public static final stc0 m99132v3(av6 av6Var, long j) {
        String strM99142n3 = av6Var.m99142n3("latestTimestamp=" + j);
        if (strM99142n3 != null) {
            return C4728a.f19494P.auth().m185898q(strM99142n3).m185883b();
        }
        return null;
    }

    /* JADX INFO: renamed from: w3 */
    public static final BoostResultEntry m99133w3(Envelope envelope) {
        envelope.getClass();
        return ((CoreData) envelope.getModuleData(CoreData.class)).boostResultEntry;
    }

    /* JADX INFO: renamed from: x3 */
    public static final BoostResultEntry m99134x3(Function1 function1, Object obj) {
        return (BoostResultEntry) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: z3 */
    public static final stc0 m99135z3(av6 av6Var) {
        return C4728a.f19494P.auth().m185898q(av6Var.m99141m3()).m185883b();
    }

    /* JADX INFO: renamed from: C3 */
    public final void m99136C3(boolean z) {
        this.needShowAcceleratePairingProgressDialog = z;
    }

    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: D3 */
    public final C22306c<roj0> m99137D3(boolean isFreeUse, boolean isAfterFreeUse, @NotNull String freeUseRecordId) {
        freeUseRecordId.getClass();
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("freeUse", isFreeUse);
            jSONObject.put("afterFreeUse", isAfterFreeUse);
            jSONObject.put("freeUseRecordId", freeUseRecordId);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        C22306c<roj0> c22306cScheduled = this.f72126Q.scheduled("post_accelerate_pairing_start", -1, new v9j() { // from class: l.vu6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return av6.m99131l3(this.f183030a, jSONObject);
            }
        });
        c22306cScheduled.getClass();
        return c22306cScheduled;
    }

    /* JADX INFO: renamed from: H3 */
    public final void m99138H3() {
        this.needShowAcceleratePairingProgressDialog = false;
        if (this.acceleratePairingStatusBs.m221515e().isPresent()) {
            AcceleratePairingStatus acceleratePairingStatusMo223809clone = this.acceleratePairingStatusBs.m221515e().get().mo223809clone();
            acceleratePairingStatusMo223809clone.getClass();
            acceleratePairingStatusMo223809clone.active = false;
            zpd0 zpd0Var = this.lastAcceleratePairedId;
            String str = acceleratePairingStatusMo223809clone.f20339id;
            zpd0Var.put(str != null ? Long.valueOf(Long.parseLong(str)) : null);
            this.lastAcceleratePairingId.clear();
            this.acceleratePairingStatusBs.m132487l(Optional.m15413of(acceleratePairingStatusMo223809clone));
        }
    }

    /* JADX INFO: renamed from: I3 */
    public final void m99139I3(boolean show) {
        this.lastClickConfirmDialogCheckTime.put(Long.valueOf(mqi0.m155944o()));
        this.acceleratePairingConfirmDialogShown.put(Boolean.valueOf(show));
    }

    /* JADX INFO: renamed from: J3 */
    public final void m99140J3(AcceleratePairingStatus status) {
        if (status == null || !status.active) {
            return;
        }
        this.lastAcceleratePairingId.put(status.f20339id + "::" + ((long) status.endTime));
    }

    /* JADX INFO: renamed from: m3 */
    public final String m99141m3() {
        String strM31200G = C4728a.m31200G("/accelerate-pairing");
        strM31200G.getClass();
        return strM31200G;
    }

    /* JADX INFO: renamed from: n3 */
    public final String m99142n3(String param) {
        String strM31200G = C4728a.m31200G("/accelerate-pairing/result/entry?" + param);
        strM31200G.getClass();
        return strM31200G;
    }

    @NotNull
    /* JADX INFO: renamed from: o3 */
    public final C22306c<Optional<AcceleratePairingStatus>> m99143o3() {
        C22306c<Optional<AcceleratePairingStatus>> c22306cAsObservable = this.acceleratePairingStatusBs.asObservable();
        c22306cAsObservable.getClass();
        return c22306cAsObservable;
    }

    /* JADX INFO: renamed from: p3 */
    public final int m99144p3() {
        if (this.acceleratePairingStatusBs.m221515e().isPresent()) {
            return this.acceleratePairingStatusBs.m221515e().get().duration;
        }
        return 0;
    }

    /* JADX INFO: renamed from: q3 */
    public final long m99145q3() {
        if (this.acceleratePairingStatusBs.m221515e().isPresent()) {
            return (long) this.acceleratePairingStatusBs.m221515e().get().endTime;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: r3 */
    public final boolean m99146r3() {
        if (this.lastClickConfirmDialogCheckTime.get().longValue() >= 0) {
            Long l2 = this.lastClickConfirmDialogCheckTime.get();
            l2.getClass();
            if (mqi0.m155952w(l2.longValue(), 720)) {
                return false;
            }
        }
        Boolean bool = this.acceleratePairingConfirmDialogShown.get();
        bool.getClass();
        return bool.booleanValue();
    }

    /* JADX INFO: renamed from: s3 */
    public final C22392a<roj0> m99147s3() {
        return this.rightGuideBs;
    }

    /* JADX INFO: renamed from: t3 */
    public final boolean m99148t3() {
        return this.acceleratePairingStatusBs.m221515e().isPresent() && this.acceleratePairingStatusBs.m221515e().get().active;
    }

    @NotNull
    /* JADX INFO: renamed from: u3 */
    public final C22306c<BoostResultEntry> m99149u3(final long lastMillisecond) {
        C22306c<BoostResultEntry> c22306cScheduled = this.f72126Q.scheduled("refresh_accelerate_pairing_active_result", 0, new v9j() { // from class: l.uu6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return av6.m99121b3(this.f178320a, lastMillisecond);
            }
        });
        c22306cScheduled.getClass();
        return c22306cScheduled;
    }

    @NotNull
    /* JADX INFO: renamed from: y3 */
    public final C22306c<roj0> m99150y3() {
        C22306c<roj0> c22306cScheduled = this.f72126Q.scheduled("query_accelerate_pairing_status", 0, new v9j() { // from class: l.ou6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return av6.m99130k3(this.f145670a);
            }
        });
        c22306cScheduled.getClass();
        return c22306cScheduled;
    }
}
