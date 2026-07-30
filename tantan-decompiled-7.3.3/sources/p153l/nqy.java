package p153l;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p151v.VListCell;
import p151v.VMenuBar;

/* JADX INFO: loaded from: classes8.dex */
public class nqy {

    /* JADX INFO: renamed from: A */
    public pej0 f143267A;

    /* JADX INFO: renamed from: B */
    public VMenuBar f143268B;

    /* JADX INFO: renamed from: C */
    public RecyclerView f143269C;

    /* JADX INFO: renamed from: D */
    public ViewStub f143270D;

    /* JADX INFO: renamed from: E */
    public ViewStub f143271E;

    /* JADX INFO: renamed from: F */
    public View f143272F;

    /* JADX INFO: renamed from: G */
    public View f143273G;

    /* JADX INFO: renamed from: H */
    public boolean f143274H;

    /* JADX INFO: renamed from: I */
    public boolean f143275I;

    /* JADX INFO: renamed from: J */
    public boolean f143276J;

    /* JADX INFO: renamed from: K */
    public int f143277K;

    /* JADX INFO: renamed from: L */
    public int f143278L;

    /* JADX INFO: renamed from: M */
    public float f143279M;

    /* JADX INFO: renamed from: N */
    public View f143280N;

    /* JADX INFO: renamed from: O */
    public FrameLayout f143281O;

    /* JADX INFO: renamed from: P */
    public int f143282P;

    /* JADX INFO: renamed from: Q */
    public ConstraintLayout f143283Q;

    /* JADX INFO: renamed from: R */
    public View f143284R;

    /* JADX INFO: renamed from: S */
    public View f143285S;

    /* JADX INFO: renamed from: T */
    public BottomSheetBehavior f143286T;

    /* JADX INFO: renamed from: U */
    public int f143287U;

    /* JADX INFO: renamed from: V */
    public int f143288V;

    /* JADX INFO: renamed from: a */
    public CharSequence f143289a;

    /* JADX INFO: renamed from: b */
    public int f143290b;

    /* JADX INFO: renamed from: c */
    public CharSequence f143291c;

    /* JADX INFO: renamed from: d */
    public CharSequence f143292d;

    /* JADX INFO: renamed from: e */
    public int f143293e;

    /* JADX INFO: renamed from: f */
    public float f143294f;

    /* JADX INFO: renamed from: g */
    public int f143295g;

    /* JADX INFO: renamed from: h */
    public int f143296h;

    /* JADX INFO: renamed from: i */
    public int f143297i;

    /* JADX INFO: renamed from: j */
    public boolean f143298j;

    /* JADX INFO: renamed from: k */
    public boolean f143299k;

    /* JADX INFO: renamed from: l */
    public int f143300l;

    /* JADX INFO: renamed from: m */
    public int f143301m;

    /* JADX INFO: renamed from: n */
    public int f143302n;

    /* JADX INFO: renamed from: o */
    public int f143303o;

    /* JADX INFO: renamed from: p */
    public View.OnClickListener f143304p;

    /* JADX INFO: renamed from: q */
    public View.OnClickListener f143305q;

    /* JADX INFO: renamed from: r */
    public View.OnClickListener f143306r;

    /* JADX INFO: renamed from: s */
    public DialogInterface.OnCancelListener f143307s;

    /* JADX INFO: renamed from: t */
    public DialogInterface.OnShowListener f143308t;

    /* JADX INFO: renamed from: u */
    public DialogInterface.OnDismissListener f143309u;

    /* JADX INFO: renamed from: v */
    public boolean f143310v;

    /* JADX INFO: renamed from: w */
    public List<VListCell.C22660a> f143311w;

    /* JADX INFO: renamed from: x */
    public RecyclerView.Adapter f143312x;

    /* JADX INFO: renamed from: y */
    public RecyclerView.AbstractC0579o f143313y;

    /* JADX INFO: renamed from: z */
    public Context f143314z;

    /* JADX INFO: renamed from: l.nqy$a */
    public static class C18929a {

        /* JADX INFO: renamed from: A */
        public List<VListCell.C22660a> f143315A;

        /* JADX INFO: renamed from: B */
        public boolean f143316B;

        /* JADX INFO: renamed from: C */
        public boolean f143317C;

        /* JADX INFO: renamed from: D */
        public boolean f143318D;

        /* JADX INFO: renamed from: G */
        public Context f143321G;

        /* JADX INFO: renamed from: H */
        public int f143322H;

        /* JADX INFO: renamed from: K */
        public View f143325K;

        /* JADX INFO: renamed from: L */
        public View f143326L;

        /* JADX INFO: renamed from: a */
        public CharSequence f143327a;

        /* JADX INFO: renamed from: c */
        public CharSequence f143329c;

        /* JADX INFO: renamed from: d */
        public CharSequence f143330d;

        /* JADX INFO: renamed from: e */
        public int f143331e;

        /* JADX INFO: renamed from: f */
        public float f143332f;

        /* JADX INFO: renamed from: g */
        public int f143333g;

        /* JADX INFO: renamed from: j */
        public int f143336j;

        /* JADX INFO: renamed from: k */
        public View f143337k;

        /* JADX INFO: renamed from: n */
        public int f143340n;

        /* JADX INFO: renamed from: o */
        public int f143341o;

        /* JADX INFO: renamed from: r */
        public View.OnClickListener f143344r;

        /* JADX INFO: renamed from: s */
        public View.OnClickListener f143345s;

        /* JADX INFO: renamed from: t */
        public View.OnClickListener f143346t;

        /* JADX INFO: renamed from: u */
        public DialogInterface.OnCancelListener f143347u;

        /* JADX INFO: renamed from: v */
        public DialogInterface.OnShowListener f143348v;

        /* JADX INFO: renamed from: w */
        public DialogInterface.OnDismissListener f143349w;

        /* JADX INFO: renamed from: y */
        public RecyclerView.Adapter f143351y;

        /* JADX INFO: renamed from: z */
        public RecyclerView.AbstractC0579o f143352z;

        /* JADX INFO: renamed from: b */
        public int f143328b = -1;

        /* JADX INFO: renamed from: h */
        public int f143334h = -1;

        /* JADX INFO: renamed from: i */
        public int f143335i = -1;

        /* JADX INFO: renamed from: l */
        public boolean f143338l = true;

        /* JADX INFO: renamed from: m */
        public boolean f143339m = true;

        /* JADX INFO: renamed from: p */
        public int f143342p = -1;

        /* JADX INFO: renamed from: q */
        public int f143343q = -1;

        /* JADX INFO: renamed from: x */
        public boolean f143350x = true;

        /* JADX INFO: renamed from: E */
        public int f143319E = -1;

        /* JADX INFO: renamed from: F */
        public float f143320F = -1.0f;

        /* JADX INFO: renamed from: I */
        public int f143323I = -1;

        /* JADX INFO: renamed from: J */
        public int f143324J = -1;

        public C18929a(Context context) {
            this.f143321G = context;
        }

        /* JADX INFO: renamed from: G */
        public static /* bridge */ /* synthetic */ InterfaceC18931c m164374G(C18929a c18929a) {
            c18929a.getClass();
            return null;
        }

        /* JADX INFO: renamed from: N */
        public nqy m164407N() {
            return new nqy(this);
        }

        /* JADX INFO: renamed from: O */
        public C18929a m164408O(RecyclerView.Adapter adapter) {
            this.f143351y = adapter;
            return this;
        }

        /* JADX INFO: renamed from: P */
        public C18929a m164409P(View view) {
            return m164410Q(false, view);
        }

        /* JADX INFO: renamed from: Q */
        public C18929a m164410Q(boolean z, View view) {
            this.f143325K = view;
            this.f143316B = z;
            return this;
        }

        /* JADX INFO: renamed from: R */
        public C18929a m164411R(int i) {
            this.f143319E = i;
            return this;
        }

        /* JADX INFO: renamed from: S */
        public C18929a m164412S(@LayoutRes int i) {
            return m164413T(false, i);
        }

        /* JADX INFO: renamed from: T */
        public C18929a m164413T(boolean z, @LayoutRes int i) {
            this.f143340n = i;
            this.f143316B = z;
            return this;
        }

        /* JADX INFO: renamed from: U */
        public C18929a m164414U(float f) {
            this.f143320F = f;
            return this;
        }

        /* JADX INFO: renamed from: V */
        public C18929a m164415V(RecyclerView.AbstractC0579o abstractC0579o) {
            this.f143352z = abstractC0579o;
            return this;
        }

        /* JADX INFO: renamed from: W */
        public C18929a m164416W(View.OnClickListener onClickListener) {
            this.f143344r = onClickListener;
            return this;
        }

        /* JADX INFO: renamed from: X */
        public C18929a m164417X(@DrawableRes int i) {
            this.f143334h = i;
            return this;
        }

        /* JADX INFO: renamed from: Y */
        public C18929a m164418Y(View.OnClickListener onClickListener) {
            this.f143345s = onClickListener;
            return this;
        }

        /* JADX INFO: renamed from: Z */
        public C18929a m164419Z(@StringRes int i) {
            this.f143330d = this.f143321G.getString(i);
            return this;
        }

        /* JADX INFO: renamed from: a0 */
        public C18929a m164420a0(CharSequence charSequence) {
            this.f143330d = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: b0 */
        public C18929a m164421b0(@ColorInt int i) {
            this.f143331e = i;
            return this;
        }

        /* JADX INFO: renamed from: c0 */
        public C18929a m164422c0(int i) {
            this.f143333g = i;
            return this;
        }

        /* JADX INFO: renamed from: d0 */
        public C18929a m164423d0(float f) {
            this.f143332f = f;
            return this;
        }

        /* JADX INFO: renamed from: e0 */
        public C18929a m164424e0(@StringRes int i) {
            this.f143327a = this.f143321G.getString(i);
            return this;
        }

        /* JADX INFO: renamed from: f0 */
        public C18929a m164425f0(CharSequence charSequence) {
            this.f143327a = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: g0 */
        public C18929a m164426g0(DialogInterface.OnDismissListener onDismissListener) {
            this.f143349w = onDismissListener;
            return this;
        }

        /* JADX INFO: renamed from: h0 */
        public C18929a m164427h0(int i) {
            this.f143342p = i;
            return this;
        }

        /* JADX INFO: renamed from: i0 */
        public C18929a m164428i0(int i) {
            this.f143343q = i;
            return this;
        }

        /* JADX INFO: renamed from: j0 */
        public C18929a m164429j0(boolean z) {
            this.f143350x = z;
            return this;
        }
    }

    /* JADX INFO: renamed from: l.nqy$b */
    public static class C18930b extends RecyclerView.AbstractC0569e0 {

        /* JADX INFO: renamed from: a */
        public final VListCell f143353a;

        public C18930b(@NonNull View view) {
            super(view);
            this.f143353a = (VListCell) view;
        }

        /* JADX INFO: renamed from: b */
        public void m164431b(VListCell.C22660a c22660a) {
            this.f143353a.setTitle(c22660a.f210081a);
            this.f143353a.setSubTitle(c22660a.f210082b);
            this.f143353a.setDescribe(c22660a.f210083c);
            this.f143353a.setLeftLargeImage(c22660a.f210084d);
            this.f143353a.setLeftSmallImage(c22660a.f210085e);
            this.f143353a.setRightLayoutRes(c22660a.f210086f);
        }
    }

    /* JADX INFO: renamed from: l.nqy$c */
    public interface InterfaceC18931c {
    }

    public nqy(C18929a c18929a) {
        this.f143278L = -1;
        this.f143279M = -1.0f;
        this.f143289a = c18929a.f143327a;
        this.f143290b = c18929a.f143328b;
        this.f143291c = c18929a.f143329c;
        this.f143292d = c18929a.f143330d;
        this.f143293e = c18929a.f143331e;
        this.f143294f = c18929a.f143332f;
        this.f143295g = c18929a.f143333g;
        this.f143296h = c18929a.f143334h;
        this.f143297i = c18929a.f143335i;
        this.f143298j = c18929a.f143338l;
        this.f143299k = c18929a.f143339m;
        this.f143300l = c18929a.f143340n;
        this.f143301m = c18929a.f143341o;
        this.f143303o = c18929a.f143342p;
        this.f143302n = c18929a.f143343q;
        this.f143304p = c18929a.f143344r;
        this.f143305q = c18929a.f143345s;
        this.f143306r = c18929a.f143346t;
        this.f143307s = c18929a.f143347u;
        this.f143308t = c18929a.f143348v;
        this.f143309u = c18929a.f143349w;
        C18929a.m164374G(c18929a);
        this.f143310v = c18929a.f143350x;
        this.f143311w = c18929a.f143315A;
        this.f143312x = c18929a.f143351y;
        this.f143313y = c18929a.f143352z;
        this.f143274H = c18929a.f143316B;
        this.f143275I = c18929a.f143317C;
        this.f143276J = c18929a.f143318D;
        this.f143277K = c18929a.f143336j;
        this.f143280N = c18929a.f143337k;
        this.f143278L = c18929a.f143319E;
        this.f143279M = c18929a.f143320F;
        this.f143282P = c18929a.f143322H;
        this.f143284R = c18929a.f143325K;
        this.f143285S = c18929a.f143326L;
        this.f143287U = c18929a.f143323I;
        this.f143288V = c18929a.f143324J;
        this.f143314z = c18929a.f143321G;
    }

    /* JADX INFO: renamed from: b */
    public void m164362b() {
        pej0 pej0Var = this.f143267A;
        if (pej0Var != null && pej0Var.isShowing()) {
            this.f143267A.dismiss();
        }
    }

    /* JADX INFO: renamed from: c */
    public <V extends View> V m164363c(@IdRes int i) {
        m164366f();
        return (V) this.f143281O.findViewById(i);
    }

    /* JADX INFO: renamed from: d */
    public boolean m164364d() {
        pej0 pej0Var = this.f143267A;
        if (pej0Var == null) {
            return false;
        }
        return pej0Var.isShowing();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m164365e(DialogInterface dialogInterface) {
        int height;
        int height2;
        int i = qa00.m175858c().heightPixels;
        int i2 = this.f143278L;
        if (i2 > 0) {
            this.f143286T.setPeekHeight(i2);
        } else {
            float f = this.f143279M;
            if (f > 0.0f) {
                this.f143286T.setPeekHeight((int) (i * f));
            } else if (this.f143276J) {
                this.f143286T.setPeekHeight(i);
            }
        }
        if (this.f143269C.getVisibility() == 0) {
            View view = this.f143272F;
            if (view == null) {
                height = this.f143302n;
                if (height <= -1) {
                    height = qa00.f156328o;
                }
            } else {
                height = this.f143274H ? 0 : view.getHeight();
            }
            View view2 = this.f143273G;
            if (view2 == null) {
                height2 = this.f143303o;
                if (height2 <= -1) {
                    height2 = qa00.f156292E;
                }
            } else {
                height2 = this.f143275I ? 0 : view2.getHeight();
            }
            this.f143269C.setPadding(0, height, 0, height2);
            if (this.f143312x.getItemCount() > 6) {
                this.f143269C.scrollToPosition(0);
            }
        }
        if (this.f143274H) {
            this.f143272F.setElevation(2.0f);
        }
        if (this.f143275I) {
            this.f143273G.setElevation(2.0f);
        }
        DialogInterface.OnShowListener onShowListener = this.f143308t;
        if (onShowListener != null) {
            onShowListener.onShow(dialogInterface);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m164366f() {
        if (this.f143267A == null) {
            this.f143267A = new pej0(this.f143314z, this.f143282P);
            ComponentCallbacks2 componentCallbacks2M105506D = bnl0.m105506D(this.f143314z);
            if (!(componentCallbacks2M105506D instanceof r1e)) {
                azk0.m101074a("MenuSheet`s Host do not implement DialogLifeTracer");
                return;
            }
            this.f143267A.m172034w((r1e) componentCallbacks2M105506D);
            this.f143267A.setContentView(gec0.f103803p);
            this.f143267A.setCancelable(this.f143298j);
            this.f143267A.setCanceledOnTouchOutside(this.f143299k);
            this.f143267A.setOnCancelListener(this.f143307s);
            this.f143267A.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.mqy
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    this.f138283a.m164365e(dialogInterface);
                }
            });
            this.f143267A.setOnDismissListener(this.f143309u);
            FrameLayout frameLayout = (FrameLayout) this.f143267A.getDelegate().mo303g(vcc0.f183363E);
            this.f143281O = frameLayout;
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            this.f143286T = bottomSheetBehaviorFrom;
            bottomSheetBehaviorFrom.setState(3);
            this.f143286T.setSkipCollapsed(true);
            if (this.f143276J) {
                this.f143281O.getLayoutParams().height = -1;
            } else if (this.f143278L > 0) {
                this.f143281O.getLayoutParams().height = this.f143278L;
            } else if (this.f143279M > 0.0f) {
                this.f143281O.getLayoutParams().height = (int) (qa00.m175858c().heightPixels * this.f143279M);
            }
            this.f143281O.setBackgroundResource(abc0.f69574w);
            this.f143267A.getWindow().setDimAmount(0.3f);
            this.f143268B = (VMenuBar) this.f143267A.findViewById(vcc0.f183421i0);
            this.f143283Q = (ConstraintLayout) this.f143267A.findViewById(vcc0.f183454z);
            this.f143270D = (ViewStub) this.f143267A.findViewById(vcc0.f183385P);
            this.f143271E = (ViewStub) this.f143267A.findViewById(vcc0.f183379M);
            this.f143269C = (RecyclerView) this.f143267A.findViewById(vcc0.f183355A);
            this.f143268B.setLeftTextView(this.f143291c);
            this.f143268B.setCenterTextView(this.f143289a);
            this.f143268B.setRightTextView(this.f143292d);
            this.f143268B.setRightTextColor(this.f143293e);
            this.f143268B.setRightTextSize(this.f143294f);
            this.f143268B.setRightTextMarginEnd(this.f143295g);
            this.f143268B.setLeftImage(this.f143296h);
            this.f143268B.setCenterImage(this.f143290b);
            this.f143268B.setRightImage(this.f143297i);
            this.f143268B.m224377i0(this.f143310v);
            this.f143268B.setLeftRegionClick(this.f143304p);
            this.f143268B.setCenterRegionClick(this.f143306r);
            this.f143268B.setRightRegionClick(this.f143305q);
            this.f143268B.setCenterCustomLayoutRes(this.f143277K);
            this.f143268B.setCenterCustomView(this.f143280N);
            int i = this.f143300l;
            if (i > 0 && this.f143284R != null) {
                azk0.m101074a("Only One Header can exist");
                return;
            }
            if (i > 0) {
                this.f143270D.setLayoutResource(i);
                this.f143272F = this.f143270D.inflate();
            }
            if (this.f143284R != null) {
                Constraints.C0222a c0222a = new Constraints.C0222a(-1, -2);
                c0222a.f1243d = 0;
                c0222a.f1247f = 0;
                c0222a.f1251h = 0;
                this.f143283Q.addView(this.f143284R, 0, c0222a);
                this.f143272F = this.f143284R;
            }
            int i2 = this.f143301m;
            if (i2 > 0 && this.f143285S != null) {
                azk0.m101074a("Only One Footer can exist");
                return;
            }
            if (i2 > 0) {
                this.f143271E.setLayoutResource(i2);
                this.f143273G = this.f143271E.inflate();
            }
            if (this.f143285S != null) {
                Constraints.C0222a c0222a2 = new Constraints.C0222a(-1, -2);
                c0222a2.f1243d = 0;
                c0222a2.f1247f = 0;
                c0222a2.f1257k = 0;
                this.f143283Q.addView(this.f143285S, 2, c0222a2);
                this.f143273G = this.f143285S;
            }
            if (!jyb.m147479J(this.f143311w)) {
                this.f143312x = new C18932d(this.f143311w, null);
                this.f143269C.setLayoutManager(new LinearLayoutManager(this.f143314z));
                this.f143269C.setAdapter(this.f143312x);
                this.f143269C.setVisibility(0);
            } else if (this.f143312x != null) {
                RecyclerView.AbstractC0579o abstractC0579o = this.f143313y;
                if (abstractC0579o == null) {
                    azk0.m101074a("Adapter and LayoutManager must init simultaneously");
                    return;
                }
                this.f143269C.setLayoutManager(abstractC0579o);
                this.f143269C.setAdapter(this.f143312x);
                this.f143269C.setVisibility(0);
                ConstraintLayout.C0221a c0221a = (ConstraintLayout.C0221a) this.f143269C.getLayoutParams();
                ((ViewGroup.MarginLayoutParams) c0221a).leftMargin = 0;
                ((ViewGroup.MarginLayoutParams) c0221a).rightMargin = 0;
            } else {
                this.f143269C.setVisibility(8);
            }
            if (this.f143269C.getVisibility() != 8) {
                if (this.f143287U > 0 || this.f143288V > 0) {
                    ConstraintLayout.C0221a c0221a2 = (ConstraintLayout.C0221a) this.f143269C.getLayoutParams();
                    ((ViewGroup.MarginLayoutParams) c0221a2).leftMargin = this.f143287U;
                    ((ViewGroup.MarginLayoutParams) c0221a2).rightMargin = this.f143288V;
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m164367g() {
        m164366f();
        this.f143267A.show();
    }

    /* JADX INFO: renamed from: l.nqy$d */
    public static class C18932d extends RecyclerView.Adapter<C18930b> {

        /* JADX INFO: renamed from: a */
        public List<VListCell.C22660a> f143354a;

        public C18932d(List<VListCell.C22660a> list, InterfaceC18931c interfaceC18931c) {
            this.f143354a = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NonNull @NotNull C18930b c18930b, final int i) {
            c18930b.m164431b(this.f143354a.get(i));
            c18930b.f143353a.setOnClickListener(new View.OnClickListener() { // from class: l.oqy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f148655a.m164433z(i, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public C18930b onCreateViewHolder(@NonNull @NotNull ViewGroup viewGroup, int i) {
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(gec0.f103793f, (ViewGroup) null);
            ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, -2);
            } else {
                layoutParams.width = -1;
            }
            viewInflate.setLayoutParams(layoutParams);
            return new C18930b(viewInflate);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            List<VListCell.C22660a> list = this.f143354a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: z */
        public /* synthetic */ void m164433z(int i, View view) {
        }
    }
}
