package p153l;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.heytap.mcssdk.mode.CommandMessage;
import com.momo.pub.MomoPipelineModuleRegister;
import com.p051p1.mobile.putong.data.BannerFrequencyType;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\rJ\u000f\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u0017J\u000f\u0010\u001b\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001b\u0010\u0017J\u0017\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b \u0010\u001eJ\u000f\u0010!\u001a\u00020\u000eH\u0016¢\u0006\u0004\b!\u0010\u0017J\u000f\u0010\"\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\"\u0010\u0017J\u0017\u0010#\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u000eH\u0016¢\u0006\u0004\b#\u0010\u001eJ\u0017\u0010&\u001a\u00020\t2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J!\u0010,\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\t2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u001f\u00104\u001a\u00020\t2\u0006\u00102\u001a\u00020\u000e2\u0006\u00103\u001a\u00020\u000eH\u0016¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\t2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b6\u00101J\u0017\u00107\u001a\u00020\t2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b7\u00101J\u0017\u00109\u001a\u00020\t2\u0006\u00108\u001a\u00020\u000eH\u0016¢\u0006\u0004\b9\u0010\u001eJ\u0017\u0010:\u001a\u00020\t2\u0006\u00108\u001a\u00020\u000eH\u0016¢\u0006\u0004\b:\u0010\u001eJ\u0017\u0010<\u001a\u00020\t2\u0006\u0010;\u001a\u00020\u000eH\u0016¢\u0006\u0004\b<\u0010\u001eJ\u0017\u0010?\u001a\u00020\t2\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010B\u001a\u00020\t2\u0006\u0010A\u001a\u00020\u000eH\u0016¢\u0006\u0004\bB\u0010\u001eJ\u0019\u0010E\u001a\u00020\t2\b\u0010D\u001a\u0004\u0018\u00010CH\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020\t2\u0006\u0010G\u001a\u00020\u0012H\u0016¢\u0006\u0004\bH\u0010IJ\u0017\u0010J\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u000eH\u0016¢\u0006\u0004\bJ\u0010\u001eJ\u0017\u0010K\u001a\u00020\t2\u0006\u0010G\u001a\u00020\u0012H\u0016¢\u0006\u0004\bK\u0010IJ\u0017\u0010N\u001a\u00020\t2\u0006\u0010M\u001a\u00020LH\u0016¢\u0006\u0004\bN\u0010OJ\u0017\u0010P\u001a\u00020\t2\u0006\u0010M\u001a\u00020LH\u0016¢\u0006\u0004\bP\u0010OJ\u0017\u0010R\u001a\u00020\t2\u0006\u0010Q\u001a\u00020\u000eH\u0016¢\u0006\u0004\bR\u0010\u001eJ\u0017\u0010S\u001a\u00020\t2\u0006\u0010G\u001a\u00020\u0012H\u0016¢\u0006\u0004\bS\u0010IJ\u0017\u0010T\u001a\u00020\t2\u0006\u0010G\u001a\u00020\u0012H\u0016¢\u0006\u0004\bT\u0010IJ\u001f\u0010X\u001a\u00020\t2\u000e\u0010W\u001a\n\u0012\u0004\u0012\u00020V\u0018\u00010UH\u0016¢\u0006\u0004\bX\u0010YJ\u0017\u0010[\u001a\u00020\t2\u0006\u0010Z\u001a\u00020LH\u0016¢\u0006\u0004\b[\u0010OJ\u0011\u0010]\u001a\u0004\u0018\u00010\\H\u0016¢\u0006\u0004\b]\u0010^J\u0017\u0010`\u001a\u00020\t2\u0006\u0010_\u001a\u00020\\H\u0016¢\u0006\u0004\b`\u0010aJ\u0011\u0010c\u001a\u0004\u0018\u00010bH\u0016¢\u0006\u0004\bc\u0010dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010eR\u0018\u0010h\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010gR\u001c\u0010l\u001a\n j*\u0004\u0018\u00010i0i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010kR\"\u0010o\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010<\u001a\u0004\bm\u0010\u0019\"\u0004\bn\u0010IR\u001a\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00070p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010q¨\u0006s"}, m88121d2 = {"Ll/fb4;", "Ll/fql;", "Ll/esl;", "Lcom/momo/pub/MomoPipelineModuleRegister;", "register", "<init>", "(Lcom/momo/pub/MomoPipelineModuleRegister;)V", "Ljava/lang/Runnable;", "runnable", "", "L", "(Ljava/lang/Runnable;)V", "Q", "()V", "", "cameraID", "", "surface", "", "c0", "(ILjava/lang/Object;)Z", "d0", "e0", "()I", "P", "()Z", "c", Constants.INAPP_DATA_TAG, FirebaseAnalytics.Param.LEVEL, "b", "(I)V", BannerFrequencyType.interval, "m", "h", "g", "setExposureCompensation", "Ll/ib4$l;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "U", "(Ll/ib4$l;)V", "Ll/ylg;", CommandMessage.PARAMS, "Ll/yuf;", "callback", "M", "(Ll/ylg;Ll/yuf;)V", "Ll/erf0;", "size", "Y", "(Ll/erf0;)V", "width", "height", "f0", "(II)V", "a0", p7f.GPS_MEASUREMENT_INTERRUPTED, "fps", "n", p7f.LATITUDE_SOUTH, BLiveGiftItem.TYPE_ROTATION, "Z", "Ll/jt2;", "filter", RXScreenCaptureService.KEY_INDEX, "(Ll/jt2;)V", "frameSkip", BLiveStormDanmakuGiftResourceType.f45294s, "Ll/nx3;", Constants.KEY_CONFIG, "R", "(Ll/nx3;)V", "open", "j", "(Z)V", "u", "e", "", "value", "f", "(F)V", BLiveStormDanmakuGiftResourceType.f45292l, "warpType", "b0", "w", "k", "", "", "path", "W", "(Ljava/util/List;)V", "scaleFactor", "X", "Ll/v94;", "N", "()Ll/v94;", "parameters", p7f.GPS_DIRECTION_TRUE, "(Ll/v94;)V", "Ll/z5m;", "a", "()Ll/z5m;", "Lcom/momo/pub/MomoPipelineModuleRegister;", "Ll/cql;", "Ll/cql;", "cameraInputPipeline", "Ll/row;", "kotlin.jvm.PlatformType", "Ll/row;", "mrConfig", BloodType.f39576O, "setCameraCreate", "isCameraCreate", "Ljava/util/LinkedList;", "Ljava/util/LinkedList;", "actionCaches", "momomediaext_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class fb4 implements fql, esl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MomoPipelineModuleRegister register;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private cql cameraInputPipeline;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final row mrConfig;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean isCameraCreate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final LinkedList<Runnable> actionCaches;

    public fb4(@NotNull MomoPipelineModuleRegister momoPipelineModuleRegister) {
        momoPipelineModuleRegister.getClass();
        this.register = momoPipelineModuleRegister;
        this.mrConfig = row.m182447k();
        this.actionCaches = new LinkedList<>();
    }

    /* JADX INFO: renamed from: A */
    public static void m124814A(fb4 fb4Var, boolean z) {
        fb4Var.getClass();
        cql cqlVar = fb4Var.cameraInputPipeline;
        if (cqlVar != null) {
            cqlVar.mo111935S(z);
        }
    }

    /* JADX INFO: renamed from: B */
    public static void m124815B(fb4 fb4Var, int i) {
        fb4Var.getClass();
        cql cqlVar = fb4Var.cameraInputPipeline;
        if (cqlVar != null) {
            cqlVar.mo111938b(i);
        }
    }

    /* JADX INFO: renamed from: C */
    public static void m124816C(fb4 fb4Var, int i) {
        fb4Var.getClass();
        cql cqlVar = fb4Var.cameraInputPipeline;
        if (cqlVar != null) {
            cqlVar.mo111957y1(i);
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m124817D(fb4 fb4Var, int i) {
        fb4Var.getClass();
        cql cqlVar = fb4Var.cameraInputPipeline;
        if (cqlVar != null) {
            cqlVar.setExposureCompensation(i);
        }
    }

    /* JADX INFO: renamed from: E */
    public static void m124818E(fb4 fb4Var, ib4.InterfaceC17689l interfaceC17689l) {
        fb4Var.getClass();
        interfaceC17689l.getClass();
        cql cqlVar = fb4Var.cameraInputPipeline;
        if (cqlVar != null) {
            cqlVar.mo111933Q(interfaceC17689l);
        }
    }

    /* JADX INFO: renamed from: F */
    public static void m124819F(List list, fb4 fb4Var) {
        cql cqlVar;
        fb4Var.getClass();
        if (list == null || !(!list.isEmpty()) || (cqlVar = fb4Var.cameraInputPipeline) == null) {
            return;
        }
        cqlVar.mo111948l(list);
    }

    /* JADX INFO: renamed from: G */
    public static void m124820G(fb4 fb4Var, int i) {
        fb4Var.getClass();
        cql cqlVar = fb4Var.cameraInputPipeline;
        if (cqlVar != null) {
            cqlVar.mo111949m(i);
        }
    }

    /* JADX INFO: renamed from: H */
    public static void m124821H(fb4 fb4Var, int i, int i2) {
        fb4Var.getClass();
        cql cqlVar = fb4Var.cameraInputPipeline;
        if (cqlVar != null) {
            cqlVar.mo111937Z0(i, i2);
        }
    }

    /* JADX INFO: renamed from: I */
    public static void m124822I(fb4 fb4Var, jt2 jt2Var) {
        fb4Var.getClass();
        jt2Var.getClass();
        cql cqlVar = fb4Var.cameraInputPipeline;
        if (cqlVar != null) {
            cqlVar.mo111946j(jt2Var);
        }
    }

    /* JADX INFO: renamed from: J */
    public static void m124823J(fb4 fb4Var, boolean z) {
        fb4Var.getClass();
        cql cqlVar = fb4Var.cameraInputPipeline;
        if (cqlVar != null) {
            cqlVar.mo111947k(z);
        }
    }

    /* JADX INFO: renamed from: K */
    public static void m124824K(fb4 fb4Var, float f) {
        fb4Var.getClass();
        cql cqlVar = fb4Var.cameraInputPipeline;
        if (cqlVar != null) {
            cqlVar.mo111932P(f);
        }
        cql cqlVar2 = fb4Var.cameraInputPipeline;
        v94 v94VarMo111959z1 = cqlVar2 != null ? cqlVar2.mo111959z1() : null;
        if (v94VarMo111959z1 != null) {
            v94VarMo111959z1.m200373C(f);
        }
        if (v94VarMo111959z1 != null) {
            v94VarMo111959z1.m200395s(false);
        }
        cql cqlVar3 = fb4Var.cameraInputPipeline;
        cqlVar3.getClass();
        cqlVar3.mo111945i1(v94VarMo111959z1);
    }

    /* JADX INFO: renamed from: L */
    private final void m124825L(Runnable runnable) {
        if (this.cameraInputPipeline == null) {
            this.actionCaches.add(runnable);
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: Q */
    private final void m124826Q() {
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
    public static void m124827o(fb4 fb4Var, boolean z) {
        fb4Var.getClass();
        cql cqlVar = fb4Var.cameraInputPipeline;
        if (cqlVar != null) {
            cqlVar.mo111955w(z);
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m124828p(fb4 fb4Var, v94 v94Var) {
        fb4Var.getClass();
        v94Var.getClass();
        cql cqlVar = fb4Var.cameraInputPipeline;
        if (cqlVar == null) {
            return;
        }
        cqlVar.mo111945i1(v94Var);
    }

    /* JADX INFO: renamed from: q */
    public static void m124829q(fb4 fb4Var, nx3 nx3Var) {
        fb4Var.getClass();
        cql cqlVar = fb4Var.cameraInputPipeline;
        if (cqlVar != null) {
            cqlVar.mo111934R(nx3Var);
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m124830r(fb4 fb4Var, float f) {
        fb4Var.getClass();
        cql cqlVar = fb4Var.cameraInputPipeline;
        if (cqlVar != null) {
            cqlVar.mo111954v(f);
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m124831t(fb4 fb4Var, int i) {
        fb4Var.getClass();
        cql cqlVar = fb4Var.cameraInputPipeline;
        if (cqlVar != null) {
            cqlVar.setWarpType(i);
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m124832v(fb4 fb4Var, int i) {
        fb4Var.getClass();
        cql cqlVar = fb4Var.cameraInputPipeline;
        if (cqlVar != null) {
            cqlVar.mo111953u(i);
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m124833x(fb4 fb4Var, float f) {
        fb4Var.getClass();
        cql cqlVar = fb4Var.cameraInputPipeline;
        if (cqlVar != null) {
            cqlVar.mo111950q(f);
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m124834y(fb4 fb4Var, int i) {
        fb4Var.getClass();
        cql cqlVar = fb4Var.cameraInputPipeline;
        if (cqlVar != null) {
            cqlVar.mo111952s(i);
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m124835z(fb4 fb4Var, boolean z) {
        fb4Var.getClass();
        cql cqlVar = fb4Var.cameraInputPipeline;
        if (cqlVar != null) {
            cqlVar.mo111936T(z);
        }
    }

    /* JADX INFO: renamed from: M */
    public void m124836M(@Nullable ylg params, @NotNull yuf callback) {
        callback.getClass();
        cql cqlVar = this.cameraInputPipeline;
        if (cqlVar != null) {
            cqlVar.mo139270s1(params, callback);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: N */
    public v94 m124837N() {
        cql cqlVar = this.cameraInputPipeline;
        if (cqlVar != null) {
            return cqlVar.mo111959z1();
        }
        return null;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final boolean getIsCameraCreate() {
        return this.isCameraCreate;
    }

    /* JADX INFO: renamed from: P */
    public boolean m124839P() {
        cql cqlVar = this.cameraInputPipeline;
        if (cqlVar != null) {
            return cqlVar.mo111941e();
        }
        return false;
    }

    /* JADX INFO: renamed from: R */
    public void m124840R(@Nullable final nx3 config) {
        m124825L(new Runnable() { // from class: l.na4
            @Override // java.lang.Runnable
            public final void run() {
                fb4.m124829q(this.f140974a, config);
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public void m124841S(int fps) {
        this.mrConfig.m182460M(fps);
    }

    /* JADX INFO: renamed from: T */
    public void m124842T(@NotNull final v94 parameters) {
        parameters.getClass();
        m124825L(new Runnable() { // from class: l.eb4
            @Override // java.lang.Runnable
            public final void run() {
                fb4.m124828p(this.f92828a, parameters);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public void m124843U(@NotNull final ib4.InterfaceC17689l listener) {
        listener.getClass();
        m124825L(new Runnable() { // from class: l.ya4
            @Override // java.lang.Runnable
            public final void run() {
                fb4.m124818E(this.f198150a, listener);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public void m124844V(@NotNull erf0 size) {
        size.getClass();
        this.mrConfig.m182479r(size);
    }

    /* JADX INFO: renamed from: W */
    public void m124845W(@Nullable final List<String> path) {
        m124825L(new Runnable() { // from class: l.za4
            @Override // java.lang.Runnable
            public final void run() {
                fb4.m124819F(path, this);
            }
        });
    }

    /* JADX INFO: renamed from: X */
    public void m124846X(final float scaleFactor) {
        m124825L(new Runnable() { // from class: l.qa4
            @Override // java.lang.Runnable
            public final void run() {
                fb4.m124824K(this.f156343a, scaleFactor);
            }
        });
    }

    /* JADX INFO: renamed from: Y */
    public void m124847Y(@NotNull erf0 size) {
        size.getClass();
        this.mrConfig.m182455H(size);
    }

    /* JADX INFO: renamed from: Z */
    public void m124848Z(int rotation) {
        this.mrConfig.m182461N(rotation);
    }

    @Override // p153l.esl
    @Nullable
    /* JADX INFO: renamed from: a */
    public z5m mo122372a() {
        cql cqlVar = this.cameraInputPipeline;
        if (cqlVar != null) {
            return cqlVar.mo109167a();
        }
        return null;
    }

    /* JADX INFO: renamed from: a0 */
    public void m124849a0(@NotNull erf0 size) {
        size.getClass();
        this.mrConfig.m182462O(size);
    }

    @Override // p153l.fql
    /* JADX INFO: renamed from: b */
    public void mo124850b(final int level) {
        m124825L(new Runnable() { // from class: l.la4
            @Override // java.lang.Runnable
            public final void run() {
                fb4.m124815B(this.f130652a, level);
            }
        });
    }

    /* JADX INFO: renamed from: b0 */
    public void m124851b0(final int warpType) {
        m124825L(new Runnable() { // from class: l.oa4
            @Override // java.lang.Runnable
            public final void run() {
                fb4.m124831t(this.f145657a, warpType);
            }
        });
    }

    @Override // p153l.fql
    /* JADX INFO: renamed from: c */
    public int mo124852c() {
        cql cqlVar = this.cameraInputPipeline;
        if (cqlVar != null) {
            return cqlVar.mo111939c();
        }
        return 0;
    }

    /* JADX INFO: renamed from: c0 */
    public boolean m124853c0(int cameraID, @NotNull Object surface) {
        surface.getClass();
        if (this.cameraInputPipeline != null && this.isCameraCreate) {
            b7y.m102882c().m102888g("CameraModule", "startPreview render");
            cql cqlVar = this.cameraInputPipeline;
            if (cqlVar != null) {
                cqlVar.mo136016K();
            }
            cql cqlVar2 = this.cameraInputPipeline;
            if (cqlVar2 != null) {
                cqlVar2.mo136013A(surface);
            }
            return false;
        }
        row rowVar = this.mrConfig;
        if (cameraID == 0) {
            rowVar.m182478q(0);
        } else {
            rowVar.m182478q(1);
        }
        b7y.m102882c().m102888g("CameraModule", "startPreview camera");
        this.cameraInputPipeline = this.register.mo21144E(this.mrConfig, new qv40());
        mo124860m(1);
        m124845W(cnw.m111544c());
        cql cqlVar3 = this.cameraInputPipeline;
        if (cqlVar3 != null) {
            cqlVar3.mo136017i(surface);
        }
        m124826Q();
        this.isCameraCreate = true;
        return true;
    }

    @Override // p153l.fql
    /* JADX INFO: renamed from: d */
    public int mo124854d() {
        cql cqlVar = this.cameraInputPipeline;
        if (cqlVar != null) {
            return cqlVar.mo111940d();
        }
        return 0;
    }

    /* JADX INFO: renamed from: d0 */
    public void m124855d0() {
        cql cqlVar = this.cameraInputPipeline;
        if (cqlVar != null) {
            b7y.m102882c().m102888g("CameraModule", "stopPreview camera");
            cqlVar.mo109166G();
            cqlVar.mo111951r();
            this.register.mo21141B(cqlVar);
        }
        this.cameraInputPipeline = null;
        this.isCameraCreate = false;
    }

    @Override // p153l.esl
    /* JADX INFO: renamed from: e */
    public void mo122373e(final boolean open) {
        m124825L(new Runnable() { // from class: l.ab4
            @Override // java.lang.Runnable
            public final void run() {
                fb4.m124835z(this.f69197a, open);
            }
        });
    }

    /* JADX INFO: renamed from: e0 */
    public int m124856e0() {
        cql cqlVar = this.cameraInputPipeline;
        if (cqlVar != null) {
            cqlVar.mo111929B0(this.mrConfig);
        }
        boolean zM124839P = m124839P();
        row rowVar = this.mrConfig;
        if (zM124839P) {
            rowVar.m182478q(1);
            return 1;
        }
        rowVar.m182478q(0);
        return 0;
    }

    @Override // p153l.esl
    /* JADX INFO: renamed from: f */
    public void mo122374f(final float value) {
        m124825L(new Runnable() { // from class: l.va4
            @Override // java.lang.Runnable
            public final void run() {
                fb4.m124830r(this.f183064a, value);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public void m124857f0(final int width, final int height) {
        m124825L(new Runnable() { // from class: l.cb4
            @Override // java.lang.Runnable
            public final void run() {
                fb4.m124821H(this.f80701a, width, height);
            }
        });
    }

    @Override // p153l.fql
    /* JADX INFO: renamed from: g */
    public int mo124858g() {
        cql cqlVar = this.cameraInputPipeline;
        if (cqlVar != null) {
            return cqlVar.mo111942g();
        }
        return 0;
    }

    @Override // p153l.fql
    /* JADX INFO: renamed from: h */
    public int mo124859h() {
        cql cqlVar = this.cameraInputPipeline;
        if (cqlVar != null) {
            return cqlVar.mo111943h();
        }
        return 0;
    }

    @Override // p153l.esl
    /* JADX INFO: renamed from: i */
    public void mo122375i(@NotNull final jt2 filter) {
        filter.getClass();
        m124825L(new Runnable() { // from class: l.bb4
            @Override // java.lang.Runnable
            public final void run() {
                fb4.m124822I(this.f75771a, filter);
            }
        });
    }

    @Override // p153l.esl
    /* JADX INFO: renamed from: j */
    public void mo122376j(final boolean open) {
        m124825L(new Runnable() { // from class: l.pa4
            @Override // java.lang.Runnable
            public final void run() {
                fb4.m124814A(this.f151241a, open);
            }
        });
    }

    @Override // p153l.esl
    /* JADX INFO: renamed from: k */
    public void mo122377k(final boolean open) {
        m124825L(new Runnable() { // from class: l.xa4
            @Override // java.lang.Runnable
            public final void run() {
                fb4.m124823J(this.f192987a, open);
            }
        });
    }

    @Override // p153l.esl
    /* JADX INFO: renamed from: l */
    public void mo122378l(final float value) {
        m124825L(new Runnable() { // from class: l.ua4
            @Override // java.lang.Runnable
            public final void run() {
                fb4.m124833x(this.f178177a, value);
            }
        });
    }

    @Override // p153l.fql
    /* JADX INFO: renamed from: m */
    public void mo124860m(final int interval) {
        m124825L(new Runnable() { // from class: l.wa4
            @Override // java.lang.Runnable
            public final void run() {
                fb4.m124820G(this.f188085a, interval);
            }
        });
    }

    @Override // p153l.fql
    /* JADX INFO: renamed from: n */
    public void mo124861n(final int fps) {
        m124825L(new Runnable() { // from class: l.ra4
            @Override // java.lang.Runnable
            public final void run() {
                fb4.m124816C(this.f161895a, fps);
            }
        });
    }

    @Override // p153l.esl
    /* JADX INFO: renamed from: s */
    public void mo122379s(final int frameSkip) {
        m124825L(new Runnable() { // from class: l.db4
            @Override // java.lang.Runnable
            public final void run() {
                fb4.m124834y(this.f85963a, frameSkip);
            }
        });
    }

    @Override // p153l.fql
    public void setExposureCompensation(final int level) {
        m124825L(new Runnable() { // from class: l.ta4
            @Override // java.lang.Runnable
            public final void run() {
                fb4.m124817D(this.f172687a, level);
            }
        });
    }

    @Override // p153l.esl
    /* JADX INFO: renamed from: u */
    public void mo122380u(final int interval) {
        m124825L(new Runnable() { // from class: l.ma4
            @Override // java.lang.Runnable
            public final void run() {
                fb4.m124832v(this.f135468a, interval);
            }
        });
    }

    @Override // p153l.esl
    /* JADX INFO: renamed from: w */
    public void mo122381w(final boolean open) {
        m124825L(new Runnable() { // from class: l.sa4
            @Override // java.lang.Runnable
            public final void run() {
                fb4.m124827o(this.f167003a, open);
            }
        });
    }
}
