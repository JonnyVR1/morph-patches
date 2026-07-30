package p153l;

import androidx.core.app.NotificationCompat;
import com.google.common.base.Optional;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.AcceleratePairingStatus;
import com.p051p1.mobile.putong.core.data.BoostResultEntry;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.CrashHelper;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0011¢\u0006\u0004\b\u001a\u0010\u0016J3\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\b\b\u0002\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u0010\u001c\u001a\u00020\u00112\b\b\u0002\u0010\u001d\u001a\u00020\u000bH\u0007¢\u0006\u0004\b \u0010!J\u0013\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0004\b\"\u0010#J\u001b\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u001e2\u0006\u0010$\u001a\u00020\u0017¢\u0006\u0004\b&\u0010'J\u0019\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060(0\u001e¢\u0006\u0004\b)\u0010#J\r\u0010+\u001a\u00020*¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\b¢\u0006\u0004\b-\u0010.R\"\u00103\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u0016\"\u0004\b2\u0010\u0014R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0017\u0010=\u001a\u0002088\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010C\u001a\u00020>8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010F\u001a\u00020>8\u0006¢\u0006\f\n\u0004\bD\u0010@\u001a\u0004\bE\u0010BRp\u0010K\u001a^\u0012(\u0012&\u0012\f\u0012\n H*\u0004\u0018\u00010\u00060\u0006 H*\u0012\u0012\f\u0012\n H*\u0004\u0018\u00010\u00060\u0006\u0018\u00010(0( H*.\u0012(\u0012&\u0012\f\u0012\n H*\u0004\u0018\u00010\u00060\u0006 H*\u0012\u0012\f\u0012\n H*\u0004\u0018\u00010\u00060\u0006\u0018\u00010(0(\u0018\u00010G0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR;\u0010O\u001a&\u0012\f\u0012\n H*\u0004\u0018\u00010\u001f0\u001f H*\u0012\u0012\f\u0012\n H*\u0004\u0018\u00010\u001f0\u001f\u0018\u00010G0G8\u0006¢\u0006\f\n\u0004\bL\u0010J\u001a\u0004\bM\u0010N¨\u0006P"}, m88121d2 = {"Ll/dw6;", "Ll/dy6;", "Lcom/p1/mobile/putong/core/api/c;", "api", "<init>", "(Lcom/p1/mobile/putong/core/api/c;)V", "Lcom/p1/mobile/putong/core/data/AcceleratePairingStatus;", NotificationCompat.CATEGORY_STATUS, "", "J3", "(Lcom/p1/mobile/putong/core/data/AcceleratePairingStatus;)V", "", "param", "n3", "(Ljava/lang/String;)Ljava/lang/String;", "m3", "()Ljava/lang/String;", "", "show", "I3", "(Z)V", "r3", "()Z", "", "q3", "()J", "t3", "isFreeUse", "isAfterFreeUse", "freeUseRecordId", "Lrx/c;", "Ll/uxj0;", "D3", "(ZZLjava/lang/String;)Lrx/c;", "y3", "()Lrx/c;", "lastMillisecond", "Lcom/p1/mobile/putong/core/data/BoostResultEntry;", "u3", "(J)Lrx/c;", "Lcom/google/common/base/Optional;", "o3", "", "p3", "()I", "H3", "()V", "R", "Z", "getNeedShowAcceleratePairingProgressDialog", "C3", "needShowAcceleratePairingProgressDialog", "Ll/jxd0;", p7f.LATITUDE_SOUTH, "Ll/jxd0;", "acceleratePairingConfirmDialogShown", "Ll/wyd0;", p7f.GPS_DIRECTION_TRUE, "Ll/wyd0;", "getLastAcceleratePairingId", "()Ll/wyd0;", "lastAcceleratePairingId", "Ll/byd0;", "U", "Ll/byd0;", "getLastAcceleratePairedId", "()Ll/byd0;", "lastAcceleratePairedId", p7f.GPS_MEASUREMENT_INTERRUPTED, "getLastClickConfirmDialogCheckTime", "lastClickConfirmDialogCheckTime", "Lrx/subjects/a;", "kotlin.jvm.PlatformType", "W", "Lrx/subjects/a;", "acceleratePairingStatusBs", "X", "s3", "()Lrx/subjects/a;", "rightGuideBs", "b_core_base"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class dw6 extends dy6 {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public boolean needShowAcceleratePairingProgressDialog;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @NotNull
    public final jxd0 acceleratePairingConfirmDialogShown;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @NotNull
    public final wyd0 lastAcceleratePairingId;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    @NotNull
    public final byd0 lastAcceleratePairedId;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    @NotNull
    public final byd0 lastClickConfirmDialogCheckTime;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public final C22507a<Optional<AcceleratePairingStatus>> acceleratePairingStatusBs;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    public final C22507a<uxj0> rightGuideBs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dw6(@NotNull C4883c c4883c) {
        super(c4883c);
        c4883c.getClass();
        this.acceleratePairingConfirmDialogShown = new jxd0("accelerate_pairing_confirm_dialog_shown_" + CoreModule.m30929H().userId(), Boolean.FALSE);
        this.lastAcceleratePairingId = new wyd0("last_accelerate_pairing_id_" + CoreModule.m30929H().userId(), "");
        this.lastAcceleratePairedId = new byd0("last_finished_accelerate_pairing_id_" + CoreModule.m30929H().userId(), 0L);
        this.lastClickConfirmDialogCheckTime = new byd0("last_click_confirm_dialog_check_time" + CoreModule.m30929H().userId(), 0L);
        this.acceleratePairingStatusBs = C22507a.m222759c(Optional.absent());
        this.rightGuideBs = C22507a.m222758b();
    }

    /* JADX INFO: renamed from: A3 */
    public static final uxj0 m118375A3(dw6 dw6Var, Envelope envelope) {
        envelope.getClass();
        AcceleratePairingStatus acceleratePairingStatus = ((CoreData) envelope.getModuleData(CoreData.class)).acceleratePairing;
        dw6Var.acceleratePairingStatusBs.m137019l(Optional.fromNullable(acceleratePairingStatus));
        dw6Var.m118400J3(acceleratePairingStatus);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: B3 */
    public static final uxj0 m118376B3(Function1 function1, Object obj) {
        return (uxj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: E3 */
    public static final x1d0 m118377E3(dw6 dw6Var, JSONObject jSONObject) {
        return C4879a.f20236P.auth().m209043q(dw6Var.m118401m3()).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
    }

    /* JADX INFO: renamed from: F3 */
    public static final uxj0 m118378F3(dw6 dw6Var, Envelope envelope) {
        envelope.getClass();
        AcceleratePairingStatus acceleratePairingStatus = ((CoreData) envelope.getModuleData(CoreData.class)).acceleratePairing;
        if (acceleratePairingStatus != null) {
            dw6Var.acceleratePairingStatusBs.m137019l(Optional.m15467of(acceleratePairingStatus));
            dw6Var.m118400J3(acceleratePairingStatus);
        }
        CoreModule.m30933P().m143408e().mo35970Fq();
        CoreModule.f18264c.f20297C0.m146428y4();
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: G3 */
    public static final uxj0 m118379G3(Function1 function1, Object obj) {
        return (uxj0) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: b3 */
    public static C22421c m118381b3(final dw6 dw6Var, final long j) {
        C22421c<Envelope> c22421cObserveOn = qi20.m176658e(new pcj() { // from class: l.zv6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dw6.m118392v3(this.f206187a, j);
            }
        }).observeOn(fo0.m126432a());
        final Function1 function1 = new Function1() { // from class: l.aw6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return dw6.m118393w3((Envelope) obj);
            }
        };
        return c22421cObserveOn.map(new qcj() { // from class: l.bw6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return dw6.m118394x3(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: k3 */
    public static C22421c m118390k3(final dw6 dw6Var) {
        C22421c<Envelope> c22421cM176654a = qi20.m176654a(new pcj() { // from class: l.uv6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dw6.m118395z3(this.f181124a);
            }
        });
        final Function1 function1 = new Function1() { // from class: l.vv6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return dw6.m118375A3(this.f185903a, (Envelope) obj);
            }
        };
        return c22421cM176654a.map(new qcj() { // from class: l.wv6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return dw6.m118376B3(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: l3 */
    public static C22421c m118391l3(final dw6 dw6Var, final JSONObject jSONObject) {
        C22421c<Envelope> c22421cObserveOn = qi20.m176658e(new pcj() { // from class: l.cw6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dw6.m118377E3(this.f84095a, jSONObject);
            }
        }).observeOn(fo0.m126432a());
        final Function1 function1 = new Function1() { // from class: l.sv6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return dw6.m118378F3(this.f170809a, (Envelope) obj);
            }
        };
        return c22421cObserveOn.map(new qcj() { // from class: l.tv6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return dw6.m118379G3(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: v3 */
    public static final x1d0 m118392v3(dw6 dw6Var, long j) {
        String strM118402n3 = dw6Var.m118402n3("latestTimestamp=" + j);
        if (strM118402n3 != null) {
            return C4879a.f20236P.auth().m209043q(strM118402n3).m209028b();
        }
        return null;
    }

    /* JADX INFO: renamed from: w3 */
    public static final BoostResultEntry m118393w3(Envelope envelope) {
        envelope.getClass();
        return ((CoreData) envelope.getModuleData(CoreData.class)).boostResultEntry;
    }

    /* JADX INFO: renamed from: x3 */
    public static final BoostResultEntry m118394x3(Function1 function1, Object obj) {
        return (BoostResultEntry) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: z3 */
    public static final x1d0 m118395z3(dw6 dw6Var) {
        return C4879a.f20236P.auth().m209043q(dw6Var.m118401m3()).m209028b();
    }

    /* JADX INFO: renamed from: C3 */
    public final void m118396C3(boolean z) {
        this.needShowAcceleratePairingProgressDialog = z;
    }

    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: D3 */
    public final C22421c<uxj0> m118397D3(boolean isFreeUse, boolean isAfterFreeUse, @NotNull String freeUseRecordId) {
        freeUseRecordId.getClass();
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("freeUse", isFreeUse);
            jSONObject.put("afterFreeUse", isAfterFreeUse);
            jSONObject.put("freeUseRecordId", freeUseRecordId);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        C22421c<uxj0> c22421cScheduled = this.f91137Q.scheduled("post_accelerate_pairing_start", -1, new pcj() { // from class: l.yv6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dw6.m118391l3(this.f201681a, jSONObject);
            }
        });
        c22421cScheduled.getClass();
        return c22421cScheduled;
    }

    /* JADX INFO: renamed from: H3 */
    public final void m118398H3() {
        this.needShowAcceleratePairingProgressDialog = false;
        if (this.acceleratePairingStatusBs.m222761e().isPresent()) {
            AcceleratePairingStatus acceleratePairingStatusMo225055clone = this.acceleratePairingStatusBs.m222761e().get().mo225055clone();
            acceleratePairingStatusMo225055clone.getClass();
            acceleratePairingStatusMo225055clone.active = false;
            byd0 byd0Var = this.lastAcceleratePairedId;
            String str = acceleratePairingStatusMo225055clone.f21081id;
            byd0Var.put(str != null ? Long.valueOf(Long.parseLong(str)) : null);
            this.lastAcceleratePairingId.clear();
            this.acceleratePairingStatusBs.m137019l(Optional.m15467of(acceleratePairingStatusMo225055clone));
        }
    }

    /* JADX INFO: renamed from: I3 */
    public final void m118399I3(boolean show) {
        this.lastClickConfirmDialogCheckTime.put(Long.valueOf(pzi0.m174454o()));
        this.acceleratePairingConfirmDialogShown.put(Boolean.valueOf(show));
    }

    /* JADX INFO: renamed from: J3 */
    public final void m118400J3(AcceleratePairingStatus status) {
        if (status == null || !status.active) {
            return;
        }
        this.lastAcceleratePairingId.put(status.f21081id + "::" + ((long) status.endTime));
    }

    /* JADX INFO: renamed from: m3 */
    public final String m118401m3() {
        String strM32203G = C4879a.m32203G("/accelerate-pairing");
        strM32203G.getClass();
        return strM32203G;
    }

    /* JADX INFO: renamed from: n3 */
    public final String m118402n3(String param) {
        String strM32203G = C4879a.m32203G("/accelerate-pairing/result/entry?" + param);
        strM32203G.getClass();
        return strM32203G;
    }

    @NotNull
    /* JADX INFO: renamed from: o3 */
    public final C22421c<Optional<AcceleratePairingStatus>> m118403o3() {
        C22421c<Optional<AcceleratePairingStatus>> c22421cAsObservable = this.acceleratePairingStatusBs.asObservable();
        c22421cAsObservable.getClass();
        return c22421cAsObservable;
    }

    /* JADX INFO: renamed from: p3 */
    public final int m118404p3() {
        if (this.acceleratePairingStatusBs.m222761e().isPresent()) {
            return this.acceleratePairingStatusBs.m222761e().get().duration;
        }
        return 0;
    }

    /* JADX INFO: renamed from: q3 */
    public final long m118405q3() {
        if (this.acceleratePairingStatusBs.m222761e().isPresent()) {
            return (long) this.acceleratePairingStatusBs.m222761e().get().endTime;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: r3 */
    public final boolean m118406r3() {
        if (this.lastClickConfirmDialogCheckTime.get().longValue() >= 0) {
            Long l2 = this.lastClickConfirmDialogCheckTime.get();
            l2.getClass();
            if (pzi0.m174462w(l2.longValue(), 720)) {
                return false;
            }
        }
        Boolean bool = this.acceleratePairingConfirmDialogShown.get();
        bool.getClass();
        return bool.booleanValue();
    }

    /* JADX INFO: renamed from: s3 */
    public final C22507a<uxj0> m118407s3() {
        return this.rightGuideBs;
    }

    /* JADX INFO: renamed from: t3 */
    public final boolean m118408t3() {
        return this.acceleratePairingStatusBs.m222761e().isPresent() && this.acceleratePairingStatusBs.m222761e().get().active;
    }

    @NotNull
    /* JADX INFO: renamed from: u3 */
    public final C22421c<BoostResultEntry> m118409u3(final long lastMillisecond) {
        C22421c<BoostResultEntry> c22421cScheduled = this.f91137Q.scheduled("refresh_accelerate_pairing_active_result", 0, new pcj() { // from class: l.xv6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dw6.m118381b3(this.f196352a, lastMillisecond);
            }
        });
        c22421cScheduled.getClass();
        return c22421cScheduled;
    }

    @NotNull
    /* JADX INFO: renamed from: y3 */
    public final C22421c<uxj0> m118410y3() {
        C22421c<uxj0> c22421cScheduled = this.f91137Q.scheduled("query_accelerate_pairing_status", 0, new pcj() { // from class: l.rv6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return dw6.m118390k3(this.f164985a);
            }
        });
        c22421cScheduled.getClass();
        return c22421cScheduled;
    }
}
