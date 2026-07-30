package p153l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.ImageView;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import com.bumptech.glide.C1059c;
import com.bumptech.glide.ComponentCallbacks2C1057a;
import com.bumptech.glide.Priority;
import com.bumptech.glide.request.C1130a;
import com.bumptech.glide.request.C1131b;
import com.bumptech.glide.request.RequestCoordinator;
import com.bumptech.glide.request.SingleRequest;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class a2d0<TranscodeType> extends lr2<a2d0<TranscodeType>> implements Cloneable {

    /* JADX INFO: renamed from: O */
    protected static final p2d0 f67951O = new p2d0().m155550e(d4e.f85035c).m155545Z(Priority.LOW).m155554g0(true);

    /* JADX INFO: renamed from: A */
    private final Context f67952A;

    /* JADX INFO: renamed from: B */
    private final m2d0 f67953B;

    /* JADX INFO: renamed from: C */
    private final Class<TranscodeType> f67954C;

    /* JADX INFO: renamed from: D */
    private final ComponentCallbacks2C1057a f67955D;

    /* JADX INFO: renamed from: E */
    private final C1059c f67956E;

    /* JADX INFO: renamed from: F */
    @NonNull
    private aij0<?, ? super TranscodeType> f67957F;

    /* JADX INFO: renamed from: G */
    @Nullable
    private Object f67958G;

    /* JADX INFO: renamed from: H */
    @Nullable
    private List<l2d0<TranscodeType>> f67959H;

    /* JADX INFO: renamed from: I */
    @Nullable
    private a2d0<TranscodeType> f67960I;

    /* JADX INFO: renamed from: J */
    @Nullable
    private a2d0<TranscodeType> f67961J;

    /* JADX INFO: renamed from: K */
    @Nullable
    private Float f67962K;

    /* JADX INFO: renamed from: L */
    private boolean f67963L = true;

    /* JADX INFO: renamed from: M */
    private boolean f67964M;

    /* JADX INFO: renamed from: N */
    private boolean f67965N;

    /* JADX INFO: renamed from: l.a2d0$a */
    public static /* synthetic */ class C15625a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f67966a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f67967b;

        static {
            int[] iArr = new int[Priority.values().length];
            f67967b = iArr;
            try {
                iArr[Priority.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f67967b[Priority.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f67967b[Priority.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f67967b[Priority.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f67966a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f67966a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f67966a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f67966a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f67966a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f67966a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f67966a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f67966a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    @SuppressLint({"CheckResult"})
    public a2d0(@NonNull ComponentCallbacks2C1057a componentCallbacks2C1057a, m2d0 m2d0Var, Class<TranscodeType> cls, Context context) {
        this.f67955D = componentCallbacks2C1057a;
        this.f67953B = m2d0Var;
        this.f67954C = cls;
        this.f67952A = context;
        this.f67957F = m2d0Var.m156818q(cls);
        this.f67956E = componentCallbacks2C1057a.m5333i();
        m95636t0(m2d0Var.m156816o());
        mo95645a(m2d0Var.m156817p());
    }

    @NonNull
    /* JADX INFO: renamed from: E0 */
    private a2d0<TranscodeType> m95630E0(@Nullable Object obj) {
        if (m155530D()) {
            return mo95646c().m95630E0(obj);
        }
        this.f67958G = obj;
        this.f67964M = true;
        return m155547c0();
    }

    /* JADX INFO: renamed from: F0 */
    private y1d0 m95631F0(Object obj, cli0<TranscodeType> cli0Var, l2d0<TranscodeType> l2d0Var, lr2<?> lr2Var, RequestCoordinator requestCoordinator, aij0<?, ? super TranscodeType> aij0Var, Priority priority, int i, int i2, Executor executor) {
        Context context = this.f67952A;
        C1059c c1059c = this.f67956E;
        return SingleRequest.m5690x(context, c1059c, obj, this.f67958G, this.f67954C, lr2Var, i, i2, priority, cli0Var, l2d0Var, this.f67959H, requestCoordinator, c1059c.m5347f(), aij0Var.m97997b(), executor);
    }

    /* JADX INFO: renamed from: o0 */
    private y1d0 m95632o0(cli0<TranscodeType> cli0Var, @Nullable l2d0<TranscodeType> l2d0Var, lr2<?> lr2Var, Executor executor) {
        return m95633p0(new Object(), cli0Var, l2d0Var, null, this.f67957F, lr2Var.m155572v(), lr2Var.m155569s(), lr2Var.m155568r(), lr2Var, executor);
    }

    /* JADX INFO: renamed from: p0 */
    private y1d0 m95633p0(Object obj, cli0<TranscodeType> cli0Var, @Nullable l2d0<TranscodeType> l2d0Var, @Nullable RequestCoordinator requestCoordinator, aij0<?, ? super TranscodeType> aij0Var, Priority priority, int i, int i2, lr2<?> lr2Var, Executor executor) {
        C1130a c1130a;
        if (this.f67961J != null) {
            c1130a = new C1130a(obj, requestCoordinator);
            requestCoordinator = c1130a;
        } else {
            c1130a = null;
        }
        y1d0 y1d0VarM95634q0 = m95634q0(obj, cli0Var, l2d0Var, requestCoordinator, aij0Var, priority, i, i2, lr2Var, executor);
        if (c1130a == null) {
            return y1d0VarM95634q0;
        }
        int iM155569s = this.f67961J.m155569s();
        int iM155568r = this.f67961J.m155568r();
        if (ylk0.m216597u(i, i2) && !this.f67961J.m155537Q()) {
            iM155569s = lr2Var.m155569s();
            iM155568r = lr2Var.m155568r();
        }
        int i3 = iM155568r;
        a2d0<TranscodeType> a2d0Var = this.f67961J;
        C1130a c1130a2 = c1130a;
        c1130a2.m5704n(y1d0VarM95634q0, a2d0Var.m95633p0(obj, cli0Var, l2d0Var, c1130a2, a2d0Var.f67957F, a2d0Var.m155572v(), iM155569s, i3, this.f67961J, executor));
        return c1130a2;
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
    /* JADX INFO: renamed from: q0 */
    private y1d0 m95634q0(Object obj, cli0<TranscodeType> cli0Var, l2d0<TranscodeType> l2d0Var, @Nullable RequestCoordinator requestCoordinator, aij0<?, ? super TranscodeType> aij0Var, Priority priority, int i, int i2, lr2<?> lr2Var, Executor executor) {
        a2d0<TranscodeType> a2d0Var = this.f67960I;
        if (a2d0Var == null) {
            if (this.f67962K == null) {
                return m95631F0(obj, cli0Var, l2d0Var, lr2Var, requestCoordinator, aij0Var, priority, i, i2, executor);
            }
            C1131b c1131b = new C1131b(obj, requestCoordinator);
            c1131b.m5708m(m95631F0(obj, cli0Var, l2d0Var, lr2Var, c1131b, aij0Var, priority, i, i2, executor), m95631F0(obj, cli0Var, l2d0Var, lr2Var.clone().m155553f0(this.f67962K.floatValue()), c1131b, aij0Var, m95635s0(priority), i, i2, executor));
            return c1131b;
        }
        if (this.f67965N) {
            wtq0.m207906a("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            return null;
        }
        aij0<?, ? super TranscodeType> aij0Var2 = a2d0Var.f67963L ? aij0Var : a2d0Var.f67957F;
        Priority priorityM155572v = a2d0Var.m155532G() ? this.f67960I.m155572v() : m95635s0(priority);
        int iM155569s = this.f67960I.m155569s();
        int iM155568r = this.f67960I.m155568r();
        if (ylk0.m216597u(i, i2) && !this.f67960I.m155537Q()) {
            iM155569s = lr2Var.m155569s();
            iM155568r = lr2Var.m155568r();
        }
        C1131b c1131b2 = new C1131b(obj, requestCoordinator);
        y1d0 y1d0VarM95631F0 = m95631F0(obj, cli0Var, l2d0Var, lr2Var, c1131b2, aij0Var, priority, i, i2, executor);
        this.f67965N = true;
        a2d0 a2d0Var2 = (a2d0<TranscodeType>) this.f67960I;
        y1d0 y1d0VarM95633p0 = a2d0Var2.m95633p0(obj, cli0Var, l2d0Var, c1131b2, aij0Var2, priorityM155572v, iM155569s, iM155568r, a2d0Var2, executor);
        this.f67965N = false;
        c1131b2.m5708m(y1d0VarM95631F0, y1d0VarM95633p0);
        return c1131b2;
    }

    @NonNull
    /* JADX INFO: renamed from: s0 */
    private Priority m95635s0(@NonNull Priority priority) {
        int i = C15625a.f67967b[priority.ordinal()];
        if (i == 1) {
            return Priority.NORMAL;
        }
        if (i == 2) {
            return Priority.HIGH;
        }
        if (i == 3 || i == 4) {
            return Priority.IMMEDIATE;
        }
        yg3.m215829a("unknown priority: ", m155572v());
        return null;
    }

    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: t0 */
    private void m95636t0(List<l2d0<Object>> list) {
        Iterator<l2d0<Object>> it = list.iterator();
        while (it.hasNext()) {
            m95647m0((l2d0) it.next());
        }
    }

    /* JADX INFO: renamed from: w0 */
    private <Y extends cli0<TranscodeType>> Y m95637w0(@NonNull Y y, @Nullable l2d0<TranscodeType> l2d0Var, lr2<?> lr2Var, Executor executor) {
        vn80.m201944d(y);
        if (!this.f67964M) {
            wg3.m206174a("You must call #load() before calling #into()");
            return null;
        }
        y1d0 y1d0VarM95632o0 = m95632o0(y, l2d0Var, lr2Var, executor);
        y1d0 y1d0VarMo95327c = y.mo95327c();
        if (y1d0VarM95632o0.mo5698g(y1d0VarMo95327c) && !m95638y0(lr2Var, y1d0VarMo95327c)) {
            if (!((y1d0) vn80.m201944d(y1d0VarMo95327c)).isRunning()) {
                y1d0VarMo95327c.mo5699j();
            }
            return y;
        }
        this.f67953B.m156815n(y);
        y.mo95328g(y1d0VarM95632o0);
        this.f67953B.m156827z(y, y1d0VarM95632o0);
        return y;
    }

    /* JADX INFO: renamed from: y0 */
    private boolean m95638y0(lr2<?> lr2Var, y1d0 y1d0Var) {
        return !lr2Var.m155531E() && y1d0Var.isComplete();
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: A0 */
    public a2d0<TranscodeType> m95639A0(@Nullable File file) {
        return m95630E0(file);
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: B0 */
    public a2d0<TranscodeType> m95640B0(@Nullable @DrawableRes @RawRes Integer num) {
        return m95630E0(num).mo95645a(p2d0.m170345o0(do0.m117088c(this.f67952A)));
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: C0 */
    public a2d0<TranscodeType> m95641C0(@Nullable Object obj) {
        return m95630E0(obj);
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: D0 */
    public a2d0<TranscodeType> m95642D0(@Nullable String str) {
        return m95630E0(str);
    }

    @NonNull
    /* JADX INFO: renamed from: G0 */
    public ndj<TranscodeType> m95643G0() {
        return m95644H0(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @NonNull
    /* JADX INFO: renamed from: H0 */
    public ndj<TranscodeType> m95644H0(int i, int i2) {
        e2d0 e2d0Var = new e2d0(i, i2);
        return (ndj) m95651v0(e2d0Var, e2d0Var, e7f.m119706a());
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: m0 */
    public a2d0<TranscodeType> m95647m0(@Nullable l2d0<TranscodeType> l2d0Var) {
        if (m155530D()) {
            return mo95646c().m95647m0(l2d0Var);
        }
        if (l2d0Var != null) {
            if (this.f67959H == null) {
                this.f67959H = new ArrayList();
            }
            this.f67959H.add(l2d0Var);
        }
        return m155547c0();
    }

    @Override // p153l.lr2
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public a2d0<TranscodeType> mo95645a(@NonNull lr2<?> lr2Var) {
        vn80.m201944d(lr2Var);
        return (a2d0) super.mo95645a(lr2Var);
    }

    @Override // p153l.lr2
    @CheckResult
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public a2d0<TranscodeType> clone() {
        a2d0<TranscodeType> a2d0Var = (a2d0) super.clone();
        a2d0Var.f67957F = a2d0Var.f67957F.clone();
        if (a2d0Var.f67959H != null) {
            a2d0Var.f67959H = new ArrayList(a2d0Var.f67959H);
        }
        a2d0<TranscodeType> a2d0Var2 = a2d0Var.f67960I;
        if (a2d0Var2 != null) {
            a2d0Var.f67960I = a2d0Var2.mo95646c();
        }
        a2d0<TranscodeType> a2d0Var3 = a2d0Var.f67961J;
        if (a2d0Var3 != null) {
            a2d0Var.f67961J = a2d0Var3.mo95646c();
        }
        return a2d0Var;
    }

    @NonNull
    /* JADX INFO: renamed from: u0 */
    public <Y extends cli0<TranscodeType>> Y m95650u0(@NonNull Y y) {
        return (Y) m95651v0(y, null, e7f.m119707b());
    }

    @NonNull
    /* JADX INFO: renamed from: v0 */
    public <Y extends cli0<TranscodeType>> Y m95651v0(@NonNull Y y, @Nullable l2d0<TranscodeType> l2d0Var, Executor executor) {
        return (Y) m95637w0(y, l2d0Var, this, executor);
    }

    @NonNull
    /* JADX INFO: renamed from: x0 */
    public mml0<ImageView, TranscodeType> m95652x0(@NonNull ImageView imageView) {
        lr2 lr2VarM155539S;
        ylk0.m216578b();
        vn80.m201944d(imageView);
        if (!m155536P() && m155534N() && imageView.getScaleType() != null) {
            switch (C15625a.f67966a[imageView.getScaleType().ordinal()]) {
                case 1:
                    lr2VarM155539S = clone().m155539S();
                    break;
                case 2:
                    lr2VarM155539S = clone().m155540T();
                    break;
                case 3:
                case 4:
                case 5:
                    lr2VarM155539S = clone().m155541U();
                    break;
                case 6:
                    lr2VarM155539S = clone().m155540T();
                    break;
                default:
                    lr2VarM155539S = this;
                    break;
            }
        } else {
            lr2VarM155539S = this;
        }
        return (mml0) m95637w0(this.f67956E.m5342a(imageView, this.f67954C), null, lr2VarM155539S, e7f.m119707b());
    }

    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: z0 */
    public a2d0<TranscodeType> m95653z0(@Nullable l2d0<TranscodeType> l2d0Var) {
        if (m155530D()) {
            return mo95646c().m95653z0(l2d0Var);
        }
        this.f67959H = null;
        return m95647m0(l2d0Var);
    }
}
