package p149l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.ImageView;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import com.bumptech.glide.C1055c;
import com.bumptech.glide.ComponentCallbacks2C1053a;
import com.bumptech.glide.Priority;
import com.bumptech.glide.request.C1107a;
import com.bumptech.glide.request.C1108b;
import com.bumptech.glide.request.RequestCoordinator;
import com.bumptech.glide.request.SingleRequest;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class vtc0<TranscodeType> extends vq2<vtc0<TranscodeType>> implements Cloneable {

    /* JADX INFO: renamed from: O */
    protected static final muc0 f182919O = new muc0().m199423e(p2e.f146847c).m199416Y(Priority.LOW).m199426f0(true);

    /* JADX INFO: renamed from: A */
    private final Context f182920A;

    /* JADX INFO: renamed from: B */
    private final juc0 f182921B;

    /* JADX INFO: renamed from: C */
    private final Class<TranscodeType> f182922C;

    /* JADX INFO: renamed from: D */
    private final ComponentCallbacks2C1053a f182923D;

    /* JADX INFO: renamed from: E */
    private final C1055c f182924E;

    /* JADX INFO: renamed from: F */
    @NonNull
    private w8j0<?, ? super TranscodeType> f182925F;

    /* JADX INFO: renamed from: G */
    @Nullable
    private Object f182926G;

    /* JADX INFO: renamed from: H */
    @Nullable
    private List<iuc0<TranscodeType>> f182927H;

    /* JADX INFO: renamed from: I */
    @Nullable
    private vtc0<TranscodeType> f182928I;

    /* JADX INFO: renamed from: J */
    @Nullable
    private vtc0<TranscodeType> f182929J;

    /* JADX INFO: renamed from: K */
    @Nullable
    private Float f182930K;

    /* JADX INFO: renamed from: L */
    private boolean f182931L = true;

    /* JADX INFO: renamed from: M */
    private boolean f182932M;

    /* JADX INFO: renamed from: N */
    private boolean f182933N;

    /* JADX INFO: renamed from: l.vtc0$a */
    public static /* synthetic */ class C20725a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f182934a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f182935b;

        static {
            int[] iArr = new int[Priority.values().length];
            f182935b = iArr;
            try {
                iArr[Priority.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f182935b[Priority.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f182935b[Priority.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f182935b[Priority.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f182934a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f182934a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f182934a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f182934a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f182934a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f182934a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f182934a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f182934a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    @SuppressLint({"CheckResult"})
    public vtc0(@NonNull ComponentCallbacks2C1053a componentCallbacks2C1053a, juc0 juc0Var, Class<TranscodeType> cls, Context context) {
        this.f182923D = componentCallbacks2C1053a;
        this.f182921B = juc0Var;
        this.f182922C = cls;
        this.f182920A = context;
        this.f182925F = juc0Var.m143273q(cls);
        this.f182924E = componentCallbacks2C1053a.m5324i();
        m199981s0(juc0Var.m143271o());
        mo199417a(juc0Var.m143272p());
    }

    @NonNull
    /* JADX INFO: renamed from: C0 */
    private vtc0<TranscodeType> m199975C0(@Nullable Object obj) {
        this.f182926G = obj;
        this.f182932M = true;
        return this;
    }

    /* JADX INFO: renamed from: D0 */
    private ttc0 m199976D0(Object obj, cci0<TranscodeType> cci0Var, iuc0<TranscodeType> iuc0Var, vq2<?> vq2Var, RequestCoordinator requestCoordinator, w8j0<?, ? super TranscodeType> w8j0Var, Priority priority, int i, int i2, Executor executor) {
        Context context = this.f182920A;
        C1055c c1055c = this.f182924E;
        return SingleRequest.m5635w(context, c1055c, obj, this.f182926G, this.f182922C, vq2Var, i, i2, priority, cci0Var, iuc0Var, this.f182927H, requestCoordinator, c1055c.m5338f(), w8j0Var.m202186b(), executor);
    }

    /* JADX INFO: renamed from: n0 */
    private ttc0 m199977n0(cci0<TranscodeType> cci0Var, @Nullable iuc0<TranscodeType> iuc0Var, vq2<?> vq2Var, Executor executor) {
        return m199978o0(new Object(), cci0Var, iuc0Var, null, this.f182925F, vq2Var.m199444v(), vq2Var.m199441s(), vq2Var.m199440r(), vq2Var, executor);
    }

    /* JADX INFO: renamed from: o0 */
    private ttc0 m199978o0(Object obj, cci0<TranscodeType> cci0Var, @Nullable iuc0<TranscodeType> iuc0Var, @Nullable RequestCoordinator requestCoordinator, w8j0<?, ? super TranscodeType> w8j0Var, Priority priority, int i, int i2, vq2<?> vq2Var, Executor executor) {
        C1107a c1107a;
        if (this.f182929J != null) {
            c1107a = new C1107a(obj, requestCoordinator);
            requestCoordinator = c1107a;
        } else {
            c1107a = null;
        }
        ttc0 ttc0VarM199979p0 = m199979p0(obj, cci0Var, iuc0Var, requestCoordinator, w8j0Var, priority, i, i2, vq2Var, executor);
        if (c1107a == null) {
            return ttc0VarM199979p0;
        }
        int iM199441s = this.f182929J.m199441s();
        int iM199440r = this.f182929J.m199440r();
        if (sck0.m183419s(i, i2) && !this.f182929J.m199408P()) {
            iM199441s = vq2Var.m199441s();
            iM199440r = vq2Var.m199440r();
        }
        int i3 = iM199440r;
        vtc0<TranscodeType> vtc0Var = this.f182929J;
        C1107a c1107a2 = c1107a;
        c1107a2.m5650n(ttc0VarM199979p0, vtc0Var.m199978o0(obj, cci0Var, iuc0Var, c1107a2, vtc0Var.f182925F, vtc0Var.m199444v(), iM199441s, i3, this.f182929J, executor));
        return c1107a2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: p0 */
    private ttc0 m199979p0(Object obj, cci0<TranscodeType> cci0Var, iuc0<TranscodeType> iuc0Var, @Nullable RequestCoordinator requestCoordinator, w8j0<?, ? super TranscodeType> w8j0Var, Priority priority, int i, int i2, vq2<?> vq2Var, Executor executor) {
        vtc0<TranscodeType> vtc0Var = this.f182928I;
        if (vtc0Var == null) {
            if (this.f182930K == null) {
                return m199976D0(obj, cci0Var, iuc0Var, vq2Var, requestCoordinator, w8j0Var, priority, i, i2, executor);
            }
            C1108b c1108b = new C1108b(obj, requestCoordinator);
            c1108b.m5654m(m199976D0(obj, cci0Var, iuc0Var, vq2Var, c1108b, w8j0Var, priority, i, i2, executor), m199976D0(obj, cci0Var, iuc0Var, vq2Var.clone().m199424e0(this.f182930K.floatValue()), c1108b, w8j0Var, m199980r0(priority), i, i2, executor));
            return c1108b;
        }
        if (this.f182933N) {
            qkq0.m175383a("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            return null;
        }
        w8j0<?, ? super TranscodeType> w8j0Var2 = vtc0Var.f182931L ? w8j0Var : vtc0Var.f182925F;
        Priority priorityM199444v = vtc0Var.m199403E() ? this.f182928I.m199444v() : m199980r0(priority);
        int iM199441s = this.f182928I.m199441s();
        int iM199440r = this.f182928I.m199440r();
        if (sck0.m183419s(i, i2) && !this.f182928I.m199408P()) {
            iM199441s = vq2Var.m199441s();
            iM199440r = vq2Var.m199440r();
        }
        C1108b c1108b2 = new C1108b(obj, requestCoordinator);
        ttc0 ttc0VarM199976D0 = m199976D0(obj, cci0Var, iuc0Var, vq2Var, c1108b2, w8j0Var, priority, i, i2, executor);
        this.f182933N = true;
        vtc0 vtc0Var2 = (vtc0<TranscodeType>) this.f182928I;
        ttc0 ttc0VarM199978o0 = vtc0Var2.m199978o0(obj, cci0Var, iuc0Var, c1108b2, w8j0Var2, priorityM199444v, iM199441s, iM199440r, vtc0Var2, executor);
        this.f182933N = false;
        c1108b2.m5654m(ttc0VarM199976D0, ttc0VarM199978o0);
        return c1108b2;
    }

    @NonNull
    /* JADX INFO: renamed from: r0 */
    private Priority m199980r0(@NonNull Priority priority) {
        int i = C20725a.f182935b[priority.ordinal()];
        if (i == 1) {
            return Priority.NORMAL;
        }
        if (i == 2) {
            return Priority.HIGH;
        }
        if (i == 3 || i == 4) {
            return Priority.IMMEDIATE;
        }
        kg3.m145878a("unknown priority: ", m199444v());
        return null;
    }

    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: s0 */
    private void m199981s0(List<iuc0<Object>> list) {
        Iterator<iuc0<Object>> it = list.iterator();
        while (it.hasNext()) {
            m199988l0((iuc0) it.next());
        }
    }

    /* JADX INFO: renamed from: v0 */
    private <Y extends cci0<TranscodeType>> Y m199982v0(@NonNull Y y, @Nullable iuc0<TranscodeType> iuc0Var, vq2<?> vq2Var, Executor executor) {
        qf80.m174276d(y);
        if (!this.f182932M) {
            ig3.m135964a("You must call #load() before calling #into()");
            return null;
        }
        ttc0 ttc0VarM199977n0 = m199977n0(y, iuc0Var, vq2Var, executor);
        ttc0 ttc0VarMo103909c = y.mo103909c();
        if (ttc0VarM199977n0.mo5644g(ttc0VarMo103909c) && !m199983x0(vq2Var, ttc0VarMo103909c)) {
            if (!((ttc0) qf80.m174276d(ttc0VarMo103909c)).isRunning()) {
                ttc0VarMo103909c.mo5645i();
            }
            return y;
        }
        this.f182921B.m143270n(y);
        y.mo103912g(ttc0VarM199977n0);
        this.f182921B.m143282z(y, ttc0VarM199977n0);
        return y;
    }

    /* JADX INFO: renamed from: x0 */
    private boolean m199983x0(vq2<?> vq2Var, ttc0 ttc0Var) {
        return !vq2Var.m199402D() && ttc0Var.isComplete();
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: A0 */
    public vtc0<TranscodeType> m199984A0(@Nullable Object obj) {
        return m199975C0(obj);
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: B0 */
    public vtc0<TranscodeType> m199985B0(@Nullable String str) {
        return m199975C0(str);
    }

    @NonNull
    /* JADX INFO: renamed from: E0 */
    public taj<TranscodeType> m199986E0() {
        return m199987F0(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @NonNull
    /* JADX INFO: renamed from: F0 */
    public taj<TranscodeType> m199987F0(int i, int i2) {
        buc0 buc0Var = new buc0(i, i2);
        return (taj) m199992u0(buc0Var, buc0Var, y5f.m212983a());
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: l0 */
    public vtc0<TranscodeType> m199988l0(@Nullable iuc0<TranscodeType> iuc0Var) {
        if (iuc0Var != null) {
            if (this.f182927H == null) {
                this.f182927H = new ArrayList();
            }
            this.f182927H.add(iuc0Var);
        }
        return this;
    }

    @Override // p149l.vq2
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public vtc0<TranscodeType> mo199417a(@NonNull vq2<?> vq2Var) {
        qf80.m174276d(vq2Var);
        return (vtc0) super.mo199417a(vq2Var);
    }

    @Override // p149l.vq2
    @CheckResult
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public vtc0<TranscodeType> clone() {
        vtc0<TranscodeType> vtc0Var = (vtc0) super.clone();
        vtc0Var.f182925F = vtc0Var.f182925F.clone();
        return vtc0Var;
    }

    @NonNull
    /* JADX INFO: renamed from: t0 */
    public <Y extends cci0<TranscodeType>> Y m199991t0(@NonNull Y y) {
        return (Y) m199992u0(y, null, y5f.m212984b());
    }

    @NonNull
    /* JADX INFO: renamed from: u0 */
    public <Y extends cci0<TranscodeType>> Y m199992u0(@NonNull Y y, @Nullable iuc0<TranscodeType> iuc0Var, Executor executor) {
        return (Y) m199982v0(y, iuc0Var, this, executor);
    }

    @NonNull
    /* JADX INFO: renamed from: w0 */
    public idl0<ImageView, TranscodeType> m199993w0(@NonNull ImageView imageView) {
        vq2 vq2VarM199410R;
        sck0.m183402b();
        qf80.m174276d(imageView);
        if (!m199407O() && m199405M() && imageView.getScaleType() != null) {
            switch (C20725a.f182934a[imageView.getScaleType().ordinal()]) {
                case 1:
                    vq2VarM199410R = clone().m199410R();
                    break;
                case 2:
                    vq2VarM199410R = clone().m199411S();
                    break;
                case 3:
                case 4:
                case 5:
                    vq2VarM199410R = clone().m199412T();
                    break;
                case 6:
                    vq2VarM199410R = clone().m199411S();
                    break;
                default:
                    vq2VarM199410R = this;
                    break;
            }
        } else {
            vq2VarM199410R = this;
        }
        return (idl0) m199982v0(this.f182924E.m5333a(imageView, this.f182922C), null, vq2VarM199410R, y5f.m212984b());
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: y0 */
    public vtc0<TranscodeType> m199994y0(@Nullable File file) {
        return m199975C0(file);
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: z0 */
    public vtc0<TranscodeType> m199995z0(@Nullable @DrawableRes @RawRes Integer num) {
        return m199975C0(num).mo199417a(muc0.m156389n0(ho0.m132034c(this.f182920A)));
    }
}
