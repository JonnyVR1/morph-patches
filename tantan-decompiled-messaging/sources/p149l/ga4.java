package p149l;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.heytap.mcssdk.mode.CommandMessage;
import com.momo.pub.MomoPipelineModuleRegister;
import com.p046p1.mobile.putong.data.BannerFrequencyType;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\rJ\u000f\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u0017J\u000f\u0010\u001b\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001b\u0010\u0017J\u0017\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b \u0010\u001eJ\u000f\u0010!\u001a\u00020\u000eH\u0016¢\u0006\u0004\b!\u0010\u0017J\u000f\u0010\"\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\"\u0010\u0017J\u0017\u0010#\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u000eH\u0016¢\u0006\u0004\b#\u0010\u001eJ\u0017\u0010&\u001a\u00020\t2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J!\u0010,\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\t2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u001f\u00104\u001a\u00020\t2\u0006\u00102\u001a\u00020\u000e2\u0006\u00103\u001a\u00020\u000eH\u0016¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\t2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b6\u00101J\u0017\u00107\u001a\u00020\t2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b7\u00101J\u0017\u00109\u001a\u00020\t2\u0006\u00108\u001a\u00020\u000eH\u0016¢\u0006\u0004\b9\u0010\u001eJ\u0017\u0010:\u001a\u00020\t2\u0006\u00108\u001a\u00020\u000eH\u0016¢\u0006\u0004\b:\u0010\u001eJ\u0017\u0010<\u001a\u00020\t2\u0006\u0010;\u001a\u00020\u000eH\u0016¢\u0006\u0004\b<\u0010\u001eJ\u0017\u0010?\u001a\u00020\t2\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010B\u001a\u00020\t2\u0006\u0010A\u001a\u00020\u000eH\u0016¢\u0006\u0004\bB\u0010\u001eJ\u0019\u0010E\u001a\u00020\t2\b\u0010D\u001a\u0004\u0018\u00010CH\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020\t2\u0006\u0010G\u001a\u00020\u0012H\u0016¢\u0006\u0004\bH\u0010IJ\u0017\u0010J\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u000eH\u0016¢\u0006\u0004\bJ\u0010\u001eJ\u0017\u0010K\u001a\u00020\t2\u0006\u0010G\u001a\u00020\u0012H\u0016¢\u0006\u0004\bK\u0010IJ\u0017\u0010N\u001a\u00020\t2\u0006\u0010M\u001a\u00020LH\u0016¢\u0006\u0004\bN\u0010OJ\u0017\u0010P\u001a\u00020\t2\u0006\u0010M\u001a\u00020LH\u0016¢\u0006\u0004\bP\u0010OJ\u0017\u0010R\u001a\u00020\t2\u0006\u0010Q\u001a\u00020\u000eH\u0016¢\u0006\u0004\bR\u0010\u001eJ\u0017\u0010S\u001a\u00020\t2\u0006\u0010G\u001a\u00020\u0012H\u0016¢\u0006\u0004\bS\u0010IJ\u0017\u0010T\u001a\u00020\t2\u0006\u0010G\u001a\u00020\u0012H\u0016¢\u0006\u0004\bT\u0010IJ\u001f\u0010X\u001a\u00020\t2\u000e\u0010W\u001a\n\u0012\u0004\u0012\u00020V\u0018\u00010UH\u0016¢\u0006\u0004\bX\u0010YJ\u0017\u0010[\u001a\u00020\t2\u0006\u0010Z\u001a\u00020LH\u0016¢\u0006\u0004\b[\u0010OJ\u0011\u0010]\u001a\u0004\u0018\u00010\\H\u0016¢\u0006\u0004\b]\u0010^J\u0017\u0010`\u001a\u00020\t2\u0006\u0010_\u001a\u00020\\H\u0016¢\u0006\u0004\b`\u0010aJ\u0011\u0010c\u001a\u0004\u0018\u00010bH\u0016¢\u0006\u0004\bc\u0010dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010eR\u0018\u0010h\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010gR\u001c\u0010l\u001a\n j*\u0004\u0018\u00010i0i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010kR\"\u0010o\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010<\u001a\u0004\bm\u0010\u0019\"\u0004\bn\u0010IR\u001a\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00070p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010q¨\u0006s"}, m87232d2 = {"Ll/ga4;", "Ll/unl;", "Ll/rpl;", "Lcom/momo/pub/MomoPipelineModuleRegister;", "register", "<init>", "(Lcom/momo/pub/MomoPipelineModuleRegister;)V", "Ljava/lang/Runnable;", "runnable", "", "L", "(Ljava/lang/Runnable;)V", "Q", "()V", "", "cameraID", "", "surface", "", "c0", "(ILjava/lang/Object;)Z", "d0", "e0", "()I", "P", "()Z", "c", Constants.INAPP_DATA_TAG, FirebaseAnalytics.Param.LEVEL, "b", "(I)V", BannerFrequencyType.interval, "m", "h", "g", "setExposureCompensation", "Ll/ja4$l;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "U", "(Ll/ja4$l;)V", "Ll/jkg;", CommandMessage.PARAMS, "Ll/ktf;", "callback", "M", "(Ll/jkg;Ll/ktf;)V", "Ll/vif0;", "size", "Y", "(Ll/vif0;)V", "width", "height", "f0", "(II)V", "a0", j6f.GPS_MEASUREMENT_INTERRUPTED, "fps", "n", j6f.LATITUDE_SOUTH, BLiveGiftItem.TYPE_ROTATION, "Z", "Ll/ts2;", "filter", RXScreenCaptureService.KEY_INDEX, "(Ll/ts2;)V", "frameSkip", BLiveStormDanmakuGiftResourceType.f44446s, "Ll/ow3;", Constants.KEY_CONFIG, "R", "(Ll/ow3;)V", "open", "j", "(Z)V", "u", "e", "", "value", "f", "(F)V", BLiveStormDanmakuGiftResourceType.f44444l, "warpType", "b0", "w", "k", "", "", "path", "W", "(Ljava/util/List;)V", "scaleFactor", "X", "Ll/w84;", "N", "()Ll/w84;", "parameters", j6f.GPS_DIRECTION_TRUE, "(Ll/w84;)V", "Ll/i3m;", "a", "()Ll/i3m;", "Lcom/momo/pub/MomoPipelineModuleRegister;", "Ll/rnl;", "Ll/rnl;", "cameraInputPipeline", "Ll/slw;", "kotlin.jvm.PlatformType", "Ll/slw;", "mrConfig", BloodType.f38728O, "setCameraCreate", "isCameraCreate", "Ljava/util/LinkedList;", "Ljava/util/LinkedList;", "actionCaches", "momomediaext_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class ga4 implements unl, rpl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MomoPipelineModuleRegister register;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private rnl cameraInputPipeline;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final slw mrConfig;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean isCameraCreate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final LinkedList<Runnable> actionCaches;

    public ga4(@NotNull MomoPipelineModuleRegister momoPipelineModuleRegister) {
        momoPipelineModuleRegister.getClass();
        this.register = momoPipelineModuleRegister;
        this.mrConfig = slw.m184856k();
        this.actionCaches = new LinkedList<>();
    }

    /* JADX INFO: renamed from: A */
    public static void m124861A(ga4 ga4Var, boolean z) {
        ga4Var.getClass();
        rnl rnlVar = ga4Var.cameraInputPipeline;
        if (rnlVar != null) {
            rnlVar.mo180079S(z);
        }
    }

    /* JADX INFO: renamed from: B */
    public static void m124862B(ga4 ga4Var, int i) {
        ga4Var.getClass();
        rnl rnlVar = ga4Var.cameraInputPipeline;
        if (rnlVar != null) {
            rnlVar.mo180082b(i);
        }
    }

    /* JADX INFO: renamed from: C */
    public static void m124863C(ga4 ga4Var, int i) {
        ga4Var.getClass();
        rnl rnlVar = ga4Var.cameraInputPipeline;
        if (rnlVar != null) {
            rnlVar.mo180101y1(i);
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m124864D(ga4 ga4Var, int i) {
        ga4Var.getClass();
        rnl rnlVar = ga4Var.cameraInputPipeline;
        if (rnlVar != null) {
            rnlVar.setExposureCompensation(i);
        }
    }

    /* JADX INFO: renamed from: E */
    public static void m124865E(ga4 ga4Var, ja4.InterfaceC17734l interfaceC17734l) {
        ga4Var.getClass();
        interfaceC17734l.getClass();
        rnl rnlVar = ga4Var.cameraInputPipeline;
        if (rnlVar != null) {
            rnlVar.mo180077Q(interfaceC17734l);
        }
    }

    /* JADX INFO: renamed from: F */
    public static void m124866F(List list, ga4 ga4Var) {
        rnl rnlVar;
        ga4Var.getClass();
        if (list == null || !(!list.isEmpty()) || (rnlVar = ga4Var.cameraInputPipeline) == null) {
            return;
        }
        rnlVar.mo180092l(list);
    }

    /* JADX INFO: renamed from: G */
    public static void m124867G(ga4 ga4Var, int i) {
        ga4Var.getClass();
        rnl rnlVar = ga4Var.cameraInputPipeline;
        if (rnlVar != null) {
            rnlVar.mo180093m(i);
        }
    }

    /* JADX INFO: renamed from: H */
    public static void m124868H(ga4 ga4Var, int i, int i2) {
        ga4Var.getClass();
        rnl rnlVar = ga4Var.cameraInputPipeline;
        if (rnlVar != null) {
            rnlVar.mo180081Z0(i, i2);
        }
    }

    /* JADX INFO: renamed from: I */
    public static void m124869I(ga4 ga4Var, ts2 ts2Var) {
        ga4Var.getClass();
        ts2Var.getClass();
        rnl rnlVar = ga4Var.cameraInputPipeline;
        if (rnlVar != null) {
            rnlVar.mo180090j(ts2Var);
        }
    }

    /* JADX INFO: renamed from: J */
    public static void m124870J(ga4 ga4Var, boolean z) {
        ga4Var.getClass();
        rnl rnlVar = ga4Var.cameraInputPipeline;
        if (rnlVar != null) {
            rnlVar.mo180091k(z);
        }
    }

    /* JADX INFO: renamed from: K */
    public static void m124871K(ga4 ga4Var, float f) {
        ga4Var.getClass();
        rnl rnlVar = ga4Var.cameraInputPipeline;
        if (rnlVar != null) {
            rnlVar.mo180076P(f);
        }
        rnl rnlVar2 = ga4Var.cameraInputPipeline;
        w84 w84VarMo180103z1 = rnlVar2 != null ? rnlVar2.mo180103z1() : null;
        if (w84VarMo180103z1 != null) {
            w84VarMo180103z1.m202102C(f);
        }
        if (w84VarMo180103z1 != null) {
            w84VarMo180103z1.m202124s(false);
        }
        rnl rnlVar3 = ga4Var.cameraInputPipeline;
        rnlVar3.getClass();
        rnlVar3.mo180089i1(w84VarMo180103z1);
    }

    /* JADX INFO: renamed from: L */
    private final void m124872L(Runnable runnable) {
        if (this.cameraInputPipeline == null) {
            this.actionCaches.add(runnable);
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: Q */
    private final void m124873Q() {
        synchronized (this.actionCaches) {
            while (!this.actionCaches.isEmpty()) {
                try {
                    Runnable runnablePoll = this.actionCaches.poll();
                    if (runnablePoll != null) {
                        runnablePoll.run();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m124874o(ga4 ga4Var, boolean z) {
        ga4Var.getClass();
        rnl rnlVar = ga4Var.cameraInputPipeline;
        if (rnlVar != null) {
            rnlVar.mo180099w(z);
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m124875p(ga4 ga4Var, w84 w84Var) {
        ga4Var.getClass();
        w84Var.getClass();
        rnl rnlVar = ga4Var.cameraInputPipeline;
        if (rnlVar == null) {
            return;
        }
        rnlVar.mo180089i1(w84Var);
    }

    /* JADX INFO: renamed from: q */
    public static void m124876q(ga4 ga4Var, ow3 ow3Var) {
        ga4Var.getClass();
        rnl rnlVar = ga4Var.cameraInputPipeline;
        if (rnlVar != null) {
            rnlVar.mo180078R(ow3Var);
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m124877r(ga4 ga4Var, float f) {
        ga4Var.getClass();
        rnl rnlVar = ga4Var.cameraInputPipeline;
        if (rnlVar != null) {
            rnlVar.mo180098v(f);
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m124878t(ga4 ga4Var, int i) {
        ga4Var.getClass();
        rnl rnlVar = ga4Var.cameraInputPipeline;
        if (rnlVar != null) {
            rnlVar.setWarpType(i);
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m124879v(ga4 ga4Var, int i) {
        ga4Var.getClass();
        rnl rnlVar = ga4Var.cameraInputPipeline;
        if (rnlVar != null) {
            rnlVar.mo180097u(i);
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m124880x(ga4 ga4Var, float f) {
        ga4Var.getClass();
        rnl rnlVar = ga4Var.cameraInputPipeline;
        if (rnlVar != null) {
            rnlVar.mo180094q(f);
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m124881y(ga4 ga4Var, int i) {
        ga4Var.getClass();
        rnl rnlVar = ga4Var.cameraInputPipeline;
        if (rnlVar != null) {
            rnlVar.mo180096s(i);
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m124882z(ga4 ga4Var, boolean z) {
        ga4Var.getClass();
        rnl rnlVar = ga4Var.cameraInputPipeline;
        if (rnlVar != null) {
            rnlVar.mo180080T(z);
        }
    }

    /* JADX INFO: renamed from: M */
    public void m124883M(@Nullable jkg params, @NotNull ktf callback) {
        callback.getClass();
        rnl rnlVar = this.cameraInputPipeline;
        if (rnlVar != null) {
            rnlVar.mo140670s1(params, callback);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: N */
    public w84 m124884N() {
        rnl rnlVar = this.cameraInputPipeline;
        if (rnlVar != null) {
            return rnlVar.mo180103z1();
        }
        return null;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final boolean getIsCameraCreate() {
        return this.isCameraCreate;
    }

    /* JADX INFO: renamed from: P */
    public boolean m124886P() {
        rnl rnlVar = this.cameraInputPipeline;
        if (rnlVar != null) {
            return rnlVar.mo180085e();
        }
        return false;
    }

    /* JADX INFO: renamed from: R */
    public void m124887R(@Nullable final ow3 config) {
        m124872L(new Runnable() { // from class: l.o94
            @Override // java.lang.Runnable
            public final void run() {
                ga4.m124876q(this.f142691a, config);
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public void m124888S(int fps) {
        this.mrConfig.m184869M(fps);
    }

    /* JADX INFO: renamed from: T */
    public void m124889T(@NotNull final w84 parameters) {
        parameters.getClass();
        m124872L(new Runnable() { // from class: l.fa4
            @Override // java.lang.Runnable
            public final void run() {
                ga4.m124875p(this.f96559a, parameters);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public void m124890U(@NotNull final ja4.InterfaceC17734l listener) {
        listener.getClass();
        m124872L(new Runnable() { // from class: l.z94
            @Override // java.lang.Runnable
            public final void run() {
                ga4.m124865E(this.f202266a, listener);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public void m124891V(@NotNull vif0 size) {
        size.getClass();
        this.mrConfig.m184888r(size);
    }

    /* JADX INFO: renamed from: W */
    public void m124892W(@Nullable final List<String> path) {
        m124872L(new Runnable() { // from class: l.aa4
            @Override // java.lang.Runnable
            public final void run() {
                ga4.m124866F(path, this);
            }
        });
    }

    /* JADX INFO: renamed from: X */
    public void m124893X(final float scaleFactor) {
        m124872L(new Runnable() { // from class: l.r94
            @Override // java.lang.Runnable
            public final void run() {
                ga4.m124871K(this.f158275a, scaleFactor);
            }
        });
    }

    /* JADX INFO: renamed from: Y */
    public void m124894Y(@NotNull vif0 size) {
        size.getClass();
        this.mrConfig.m184864H(size);
    }

    /* JADX INFO: renamed from: Z */
    public void m124895Z(int rotation) {
        this.mrConfig.m184870N(rotation);
    }

    @Override // p149l.rpl
    @Nullable
    /* JADX INFO: renamed from: a */
    public i3m mo124896a() {
        rnl rnlVar = this.cameraInputPipeline;
        if (rnlVar != null) {
            return rnlVar.mo103860a();
        }
        return null;
    }

    /* JADX INFO: renamed from: a0 */
    public void m124897a0(@NotNull vif0 size) {
        size.getClass();
        this.mrConfig.m184871O(size);
    }

    @Override // p149l.unl
    /* JADX INFO: renamed from: b */
    public void mo124898b(final int level) {
        m124872L(new Runnable() { // from class: l.m94
            @Override // java.lang.Runnable
            public final void run() {
                ga4.m124862B(this.f132661a, level);
            }
        });
    }

    /* JADX INFO: renamed from: b0 */
    public void m124899b0(final int warpType) {
        m124872L(new Runnable() { // from class: l.p94
            @Override // java.lang.Runnable
            public final void run() {
                ga4.m124878t(this.f147669a, warpType);
            }
        });
    }

    @Override // p149l.unl
    /* JADX INFO: renamed from: c */
    public int mo124900c() {
        rnl rnlVar = this.cameraInputPipeline;
        if (rnlVar != null) {
            return rnlVar.mo180083c();
        }
        return 0;
    }

    /* JADX INFO: renamed from: c0 */
    public boolean m124901c0(int cameraID, @NotNull Object surface) {
        surface.getClass();
        if (this.cameraInputPipeline != null && this.isCameraCreate) {
            eyx.m118802c().m118808g("CameraModule", "startPreview render");
            rnl rnlVar = this.cameraInputPipeline;
            if (rnlVar != null) {
                rnlVar.mo97707K();
            }
            rnl rnlVar2 = this.cameraInputPipeline;
            if (rnlVar2 != null) {
                rnlVar2.mo97703A(surface);
            }
            return false;
        }
        slw slwVar = this.mrConfig;
        if (cameraID == 0) {
            slwVar.m184887q(0);
        } else {
            slwVar.m184887q(1);
        }
        eyx.m118802c().m118808g("CameraModule", "startPreview camera");
        this.cameraInputPipeline = this.register.mo20145E(this.mrConfig, new cn40());
        mo124914m(1);
        m124892W(dkw.m112276c());
        rnl rnlVar3 = this.cameraInputPipeline;
        if (rnlVar3 != null) {
            rnlVar3.mo97708i(surface);
        }
        m124873Q();
        this.isCameraCreate = true;
        return true;
    }

    @Override // p149l.unl
    /* JADX INFO: renamed from: d */
    public int mo124902d() {
        rnl rnlVar = this.cameraInputPipeline;
        if (rnlVar != null) {
            return rnlVar.mo180084d();
        }
        return 0;
    }

    /* JADX INFO: renamed from: d0 */
    public void m124903d0() {
        rnl rnlVar = this.cameraInputPipeline;
        if (rnlVar != null) {
            eyx.m118802c().m118808g("CameraModule", "stopPreview camera");
            rnlVar.mo97705G();
            rnlVar.mo180095r();
            this.register.mo20142B(rnlVar);
        }
        this.cameraInputPipeline = null;
        this.isCameraCreate = false;
    }

    @Override // p149l.rpl
    /* JADX INFO: renamed from: e */
    public void mo124904e(final boolean open) {
        m124872L(new Runnable() { // from class: l.ba4
            @Override // java.lang.Runnable
            public final void run() {
                ga4.m124882z(this.f74648a, open);
            }
        });
    }

    /* JADX INFO: renamed from: e0 */
    public int m124905e0() {
        rnl rnlVar = this.cameraInputPipeline;
        if (rnlVar != null) {
            rnlVar.mo180073B0(this.mrConfig);
        }
        boolean zM124886P = m124886P();
        slw slwVar = this.mrConfig;
        if (zM124886P) {
            slwVar.m184887q(1);
            return 1;
        }
        slwVar.m184887q(0);
        return 0;
    }

    @Override // p149l.rpl
    /* JADX INFO: renamed from: f */
    public void mo124906f(final float value) {
        m124872L(new Runnable() { // from class: l.w94
            @Override // java.lang.Runnable
            public final void run() {
                ga4.m124877r(this.f185292a, value);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public void m124907f0(final int width, final int height) {
        m124872L(new Runnable() { // from class: l.da4
            @Override // java.lang.Runnable
            public final void run() {
                ga4.m124868H(this.f85188a, width, height);
            }
        });
    }

    @Override // p149l.unl
    /* JADX INFO: renamed from: g */
    public int mo124908g() {
        rnl rnlVar = this.cameraInputPipeline;
        if (rnlVar != null) {
            return rnlVar.mo180086g();
        }
        return 0;
    }

    @Override // p149l.unl
    /* JADX INFO: renamed from: h */
    public int mo124909h() {
        rnl rnlVar = this.cameraInputPipeline;
        if (rnlVar != null) {
            return rnlVar.mo180087h();
        }
        return 0;
    }

    @Override // p149l.rpl
    /* JADX INFO: renamed from: i */
    public void mo124910i(@NotNull final ts2 filter) {
        filter.getClass();
        m124872L(new Runnable() { // from class: l.ca4
            @Override // java.lang.Runnable
            public final void run() {
                ga4.m124869I(this.f79999a, filter);
            }
        });
    }

    @Override // p149l.rpl
    /* JADX INFO: renamed from: j */
    public void mo124911j(final boolean open) {
        m124872L(new Runnable() { // from class: l.q94
            @Override // java.lang.Runnable
            public final void run() {
                ga4.m124861A(this.f153367a, open);
            }
        });
    }

    @Override // p149l.rpl
    /* JADX INFO: renamed from: k */
    public void mo124912k(final boolean open) {
        m124872L(new Runnable() { // from class: l.y94
            @Override // java.lang.Runnable
            public final void run() {
                ga4.m124870J(this.f196931a, open);
            }
        });
    }

    @Override // p149l.rpl
    /* JADX INFO: renamed from: l */
    public void mo124913l(final float value) {
        m124872L(new Runnable() { // from class: l.v94
            @Override // java.lang.Runnable
            public final void run() {
                ga4.m124880x(this.f180608a, value);
            }
        });
    }

    @Override // p149l.unl
    /* JADX INFO: renamed from: m */
    public void mo124914m(final int interval) {
        m124872L(new Runnable() { // from class: l.x94
            @Override // java.lang.Runnable
            public final void run() {
                ga4.m124867G(this.f191573a, interval);
            }
        });
    }

    @Override // p149l.unl
    /* JADX INFO: renamed from: n */
    public void mo124915n(final int fps) {
        m124872L(new Runnable() { // from class: l.s94
            @Override // java.lang.Runnable
            public final void run() {
                ga4.m124863C(this.f163136a, fps);
            }
        });
    }

    @Override // p149l.rpl
    /* JADX INFO: renamed from: s */
    public void mo124916s(final int frameSkip) {
        m124872L(new Runnable() { // from class: l.ea4
            @Override // java.lang.Runnable
            public final void run() {
                ga4.m124881y(this.f90169a, frameSkip);
            }
        });
    }

    @Override // p149l.unl
    public void setExposureCompensation(final int level) {
        m124872L(new Runnable() { // from class: l.u94
            @Override // java.lang.Runnable
            public final void run() {
                ga4.m124864D(this.f175190a, level);
            }
        });
    }

    @Override // p149l.rpl
    /* JADX INFO: renamed from: u */
    public void mo124917u(final int interval) {
        m124872L(new Runnable() { // from class: l.n94
            @Override // java.lang.Runnable
            public final void run() {
                ga4.m124879v(this.f137719a, interval);
            }
        });
    }

    @Override // p149l.rpl
    /* JADX INFO: renamed from: w */
    public void mo124918w(final boolean open) {
        m124872L(new Runnable() { // from class: l.t94
            @Override // java.lang.Runnable
            public final void run() {
                ga4.m124874o(this.f168988a, open);
            }
        });
    }
}
