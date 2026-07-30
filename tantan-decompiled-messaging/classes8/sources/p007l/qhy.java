package p007l;

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
import com.google.android.material.bottomsheet.BottomSheetDialog;
import java.util.List;
import l.t100;
import l.upk0;
import l.vwb;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import v.VListCell;
import v.VMenuBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class qhy {

    /* JADX INFO: renamed from: A */
    public l5j0 f3867A;

    /* JADX INFO: renamed from: B */
    public VMenuBar f3868B;

    /* JADX INFO: renamed from: C */
    public RecyclerView f3869C;

    /* JADX INFO: renamed from: D */
    public ViewStub f3870D;

    /* JADX INFO: renamed from: E */
    public ViewStub f3871E;

    /* JADX INFO: renamed from: F */
    public View f3872F;

    /* JADX INFO: renamed from: G */
    public View f3873G;

    /* JADX INFO: renamed from: H */
    public boolean f3874H;

    /* JADX INFO: renamed from: I */
    public boolean f3875I;

    /* JADX INFO: renamed from: J */
    public boolean f3876J;

    /* JADX INFO: renamed from: K */
    public int f3877K;

    /* JADX INFO: renamed from: L */
    public int f3878L;

    /* JADX INFO: renamed from: M */
    public float f3879M;

    /* JADX INFO: renamed from: N */
    public View f3880N;

    /* JADX INFO: renamed from: O */
    public FrameLayout f3881O;

    /* JADX INFO: renamed from: P */
    public int f3882P;

    /* JADX INFO: renamed from: Q */
    public ConstraintLayout f3883Q;

    /* JADX INFO: renamed from: R */
    public View f3884R;

    /* JADX INFO: renamed from: S */
    public View f3885S;

    /* JADX INFO: renamed from: T */
    public BottomSheetBehavior f3886T;

    /* JADX INFO: renamed from: U */
    public int f3887U;

    /* JADX INFO: renamed from: V */
    public int f3888V;

    /* JADX INFO: renamed from: a */
    public CharSequence f3889a;

    /* JADX INFO: renamed from: b */
    public int f3890b;

    /* JADX INFO: renamed from: c */
    public CharSequence f3891c;

    /* JADX INFO: renamed from: d */
    public CharSequence f3892d;

    /* JADX INFO: renamed from: e */
    public int f3893e;

    /* JADX INFO: renamed from: f */
    public float f3894f;

    /* JADX INFO: renamed from: g */
    public int f3895g;

    /* JADX INFO: renamed from: h */
    public int f3896h;

    /* JADX INFO: renamed from: i */
    public int f3897i;

    /* JADX INFO: renamed from: j */
    public boolean f3898j;

    /* JADX INFO: renamed from: k */
    public boolean f3899k;

    /* JADX INFO: renamed from: l */
    public int f3900l;

    /* JADX INFO: renamed from: m */
    public int f3901m;

    /* JADX INFO: renamed from: n */
    public int f3902n;

    /* JADX INFO: renamed from: o */
    public int f3903o;

    /* JADX INFO: renamed from: p */
    public View.OnClickListener f3904p;

    /* JADX INFO: renamed from: q */
    public View.OnClickListener f3905q;

    /* JADX INFO: renamed from: r */
    public View.OnClickListener f3906r;

    /* JADX INFO: renamed from: s */
    public DialogInterface.OnCancelListener f3907s;

    /* JADX INFO: renamed from: t */
    public DialogInterface.OnShowListener f3908t;

    /* JADX INFO: renamed from: u */
    public DialogInterface.OnDismissListener f3909u;

    /* JADX INFO: renamed from: v */
    public boolean f3910v;

    /* JADX INFO: renamed from: w */
    public List<VListCell.a> f3911w;

    /* JADX INFO: renamed from: x */
    public RecyclerView.Adapter f3912x;

    /* JADX INFO: renamed from: y */
    public RecyclerView.o f3913y;

    /* JADX INFO: renamed from: z */
    public Context f3914z;

    /* JADX INFO: renamed from: l.qhy$a */
    public static class C0669a {

        /* JADX INFO: renamed from: A */
        public List<VListCell.a> f3915A;

        /* JADX INFO: renamed from: B */
        public boolean f3916B;

        /* JADX INFO: renamed from: C */
        public boolean f3917C;

        /* JADX INFO: renamed from: D */
        public boolean f3918D;

        /* JADX INFO: renamed from: G */
        public Context f3921G;

        /* JADX INFO: renamed from: H */
        public int f3922H;

        /* JADX INFO: renamed from: K */
        public View f3925K;

        /* JADX INFO: renamed from: L */
        public View f3926L;

        /* JADX INFO: renamed from: a */
        public CharSequence f3927a;

        /* JADX INFO: renamed from: c */
        public CharSequence f3929c;

        /* JADX INFO: renamed from: d */
        public CharSequence f3930d;

        /* JADX INFO: renamed from: e */
        public int f3931e;

        /* JADX INFO: renamed from: f */
        public float f3932f;

        /* JADX INFO: renamed from: g */
        public int f3933g;

        /* JADX INFO: renamed from: j */
        public int f3936j;

        /* JADX INFO: renamed from: k */
        public View f3937k;

        /* JADX INFO: renamed from: n */
        public int f3940n;

        /* JADX INFO: renamed from: o */
        public int f3941o;

        /* JADX INFO: renamed from: r */
        public View.OnClickListener f3944r;

        /* JADX INFO: renamed from: s */
        public View.OnClickListener f3945s;

        /* JADX INFO: renamed from: t */
        public View.OnClickListener f3946t;

        /* JADX INFO: renamed from: u */
        public DialogInterface.OnCancelListener f3947u;

        /* JADX INFO: renamed from: v */
        public DialogInterface.OnShowListener f3948v;

        /* JADX INFO: renamed from: w */
        public DialogInterface.OnDismissListener f3949w;

        /* JADX INFO: renamed from: y */
        public RecyclerView.Adapter f3951y;

        /* JADX INFO: renamed from: z */
        public RecyclerView.o f3952z;

        /* JADX INFO: renamed from: b */
        public int f3928b = -1;

        /* JADX INFO: renamed from: h */
        public int f3934h = -1;

        /* JADX INFO: renamed from: i */
        public int f3935i = -1;

        /* JADX INFO: renamed from: l */
        public boolean f3938l = true;

        /* JADX INFO: renamed from: m */
        public boolean f3939m = true;

        /* JADX INFO: renamed from: p */
        public int f3942p = -1;

        /* JADX INFO: renamed from: q */
        public int f3943q = -1;

        /* JADX INFO: renamed from: x */
        public boolean f3950x = true;

        /* JADX INFO: renamed from: E */
        public int f3919E = -1;

        /* JADX INFO: renamed from: F */
        public float f3920F = -1.0f;

        /* JADX INFO: renamed from: I */
        public int f3923I = -1;

        /* JADX INFO: renamed from: J */
        public int f3924J = -1;

        public C0669a(Context context) {
            this.f3921G = context;
        }

        /* JADX INFO: renamed from: G */
        public static /* bridge */ /* synthetic */ InterfaceC0671c m10368G(C0669a c0669a) {
            c0669a.getClass();
            return null;
        }

        /* JADX INFO: renamed from: N */
        public qhy m10401N() {
            return new qhy(this);
        }

        /* JADX INFO: renamed from: O */
        public C0669a m10402O(RecyclerView.Adapter adapter) {
            this.f3951y = adapter;
            return this;
        }

        /* JADX INFO: renamed from: P */
        public C0669a m10403P(View view) {
            return m10404Q(false, view);
        }

        /* JADX INFO: renamed from: Q */
        public C0669a m10404Q(boolean z, View view) {
            this.f3925K = view;
            this.f3916B = z;
            return this;
        }

        /* JADX INFO: renamed from: R */
        public C0669a m10405R(int i) {
            this.f3919E = i;
            return this;
        }

        /* JADX INFO: renamed from: S */
        public C0669a m10406S(@LayoutRes int i) {
            return m10407T(false, i);
        }

        /* JADX INFO: renamed from: T */
        public C0669a m10407T(boolean z, @LayoutRes int i) {
            this.f3940n = i;
            this.f3916B = z;
            return this;
        }

        /* JADX INFO: renamed from: U */
        public C0669a m10408U(float f) {
            this.f3920F = f;
            return this;
        }

        /* JADX INFO: renamed from: V */
        public C0669a m10409V(RecyclerView.o oVar) {
            this.f3952z = oVar;
            return this;
        }

        /* JADX INFO: renamed from: W */
        public C0669a m10410W(View.OnClickListener onClickListener) {
            this.f3944r = onClickListener;
            return this;
        }

        /* JADX INFO: renamed from: X */
        public C0669a m10411X(@DrawableRes int i) {
            this.f3934h = i;
            return this;
        }

        /* JADX INFO: renamed from: Y */
        public C0669a m10412Y(View.OnClickListener onClickListener) {
            this.f3945s = onClickListener;
            return this;
        }

        /* JADX INFO: renamed from: Z */
        public C0669a m10413Z(@StringRes int i) {
            this.f3930d = this.f3921G.getString(i);
            return this;
        }

        /* JADX INFO: renamed from: a0 */
        public C0669a m10414a0(CharSequence charSequence) {
            this.f3930d = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: b0 */
        public C0669a m10415b0(@ColorInt int i) {
            this.f3931e = i;
            return this;
        }

        /* JADX INFO: renamed from: c0 */
        public C0669a m10416c0(int i) {
            this.f3933g = i;
            return this;
        }

        /* JADX INFO: renamed from: d0 */
        public C0669a m10417d0(float f) {
            this.f3932f = f;
            return this;
        }

        /* JADX INFO: renamed from: e0 */
        public C0669a m10418e0(@StringRes int i) {
            this.f3927a = this.f3921G.getString(i);
            return this;
        }

        /* JADX INFO: renamed from: f0 */
        public C0669a m10419f0(CharSequence charSequence) {
            this.f3927a = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: g0 */
        public C0669a m10420g0(DialogInterface.OnDismissListener onDismissListener) {
            this.f3949w = onDismissListener;
            return this;
        }

        /* JADX INFO: renamed from: h0 */
        public C0669a m10421h0(int i) {
            this.f3942p = i;
            return this;
        }

        /* JADX INFO: renamed from: i0 */
        public C0669a m10422i0(int i) {
            this.f3943q = i;
            return this;
        }

        /* JADX INFO: renamed from: j0 */
        public C0669a m10423j0(boolean z) {
            this.f3950x = z;
            return this;
        }
    }

    /* JADX INFO: renamed from: l.qhy$b */
    public static class C0670b extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a */
        public final VListCell f3953a;

        public C0670b(@NonNull View view) {
            super(view);
            this.f3953a = (VListCell) view;
        }

        /* JADX INFO: renamed from: b */
        public void m10425b(VListCell.a aVar) {
            this.f3953a.setTitle(aVar.a);
            this.f3953a.setSubTitle(aVar.b);
            this.f3953a.setDescribe(aVar.c);
            this.f3953a.setLeftLargeImage(aVar.d);
            this.f3953a.setLeftSmallImage(aVar.e);
            this.f3953a.setRightLayoutRes(aVar.f);
        }
    }

    /* JADX INFO: renamed from: l.qhy$c */
    public interface InterfaceC0671c {
    }

    public qhy(C0669a c0669a) {
        this.f3878L = -1;
        this.f3879M = -1.0f;
        this.f3889a = c0669a.f3927a;
        this.f3890b = c0669a.f3928b;
        this.f3891c = c0669a.f3929c;
        this.f3892d = c0669a.f3930d;
        this.f3893e = c0669a.f3931e;
        this.f3894f = c0669a.f3932f;
        this.f3895g = c0669a.f3933g;
        this.f3896h = c0669a.f3934h;
        this.f3897i = c0669a.f3935i;
        this.f3898j = c0669a.f3938l;
        this.f3899k = c0669a.f3939m;
        this.f3900l = c0669a.f3940n;
        this.f3901m = c0669a.f3941o;
        this.f3903o = c0669a.f3942p;
        this.f3902n = c0669a.f3943q;
        this.f3904p = c0669a.f3944r;
        this.f3905q = c0669a.f3945s;
        this.f3906r = c0669a.f3946t;
        this.f3907s = c0669a.f3947u;
        this.f3908t = c0669a.f3948v;
        this.f3909u = c0669a.f3949w;
        C0669a.m10368G(c0669a);
        this.f3910v = c0669a.f3950x;
        this.f3911w = c0669a.f3915A;
        this.f3912x = c0669a.f3951y;
        this.f3913y = c0669a.f3952z;
        this.f3874H = c0669a.f3916B;
        this.f3875I = c0669a.f3917C;
        this.f3876J = c0669a.f3918D;
        this.f3877K = c0669a.f3936j;
        this.f3880N = c0669a.f3937k;
        this.f3878L = c0669a.f3919E;
        this.f3879M = c0669a.f3920F;
        this.f3882P = c0669a.f3922H;
        this.f3884R = c0669a.f3925K;
        this.f3885S = c0669a.f3926L;
        this.f3887U = c0669a.f3923I;
        this.f3888V = c0669a.f3924J;
        this.f3914z = c0669a.f3921G;
    }

    /* JADX INFO: renamed from: b */
    public void m10356b() {
        BottomSheetDialog bottomSheetDialog = this.f3867A;
        if (bottomSheetDialog != null && bottomSheetDialog.isShowing()) {
            this.f3867A.dismiss();
        }
    }

    /* JADX INFO: renamed from: c */
    public <V extends View> V m10357c(@IdRes int i) {
        m10360f();
        return (V) this.f3881O.findViewById(i);
    }

    /* JADX INFO: renamed from: d */
    public boolean m10358d() {
        BottomSheetDialog bottomSheetDialog = this.f3867A;
        if (bottomSheetDialog == null) {
            return false;
        }
        return bottomSheetDialog.isShowing();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m10359e(DialogInterface dialogInterface) {
        int height;
        int height2;
        int i = t100.c().heightPixels;
        int i2 = this.f3878L;
        if (i2 > 0) {
            this.f3886T.setPeekHeight(i2);
        } else {
            float f = this.f3879M;
            if (f > 0.0f) {
                this.f3886T.setPeekHeight((int) (i * f));
            } else if (this.f3876J) {
                this.f3886T.setPeekHeight(i);
            }
        }
        if (this.f3869C.getVisibility() == 0) {
            View view = this.f3872F;
            if (view == null) {
                height = this.f3902n;
                if (height <= -1) {
                    height = t100.o;
                }
            } else {
                height = this.f3874H ? 0 : view.getHeight();
            }
            View view2 = this.f3873G;
            if (view2 == null) {
                height2 = this.f3903o;
                if (height2 <= -1) {
                    height2 = t100.E;
                }
            } else {
                height2 = this.f3875I ? 0 : view2.getHeight();
            }
            this.f3869C.setPadding(0, height, 0, height2);
            if (this.f3912x.getItemCount() > 6) {
                this.f3869C.scrollToPosition(0);
            }
        }
        if (this.f3874H) {
            this.f3872F.setElevation(2.0f);
        }
        if (this.f3875I) {
            this.f3873G.setElevation(2.0f);
        }
        DialogInterface.OnShowListener onShowListener = this.f3908t;
        if (onShowListener != null) {
            onShowListener.onShow(dialogInterface);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m10360f() {
        if (this.f3867A == null) {
            this.f3867A = new l5j0(this.f3914z, this.f3882P);
            ComponentCallbacks2 componentCallbacks2D = xdl0.D(this.f3914z);
            if (!(componentCallbacks2D instanceof d0e)) {
                upk0.a("MenuSheet`s Host do not implement DialogLifeTracer");
                return;
            }
            this.f3867A.m9807w((d0e) componentCallbacks2D);
            this.f3867A.setContentView(b6c0.f1930p);
            this.f3867A.setCancelable(this.f3898j);
            this.f3867A.setCanceledOnTouchOutside(this.f3899k);
            this.f3867A.setOnCancelListener(this.f3907s);
            this.f3867A.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.phy
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    this.f3739a.m10359e(dialogInterface);
                }
            });
            this.f3867A.setOnDismissListener(this.f3909u);
            FrameLayout frameLayout = (FrameLayout) this.f3867A.getDelegate().g(p4c0.f3611E);
            this.f3881O = frameLayout;
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            this.f3886T = bottomSheetBehaviorFrom;
            bottomSheetBehaviorFrom.setState(3);
            this.f3886T.setSkipCollapsed(true);
            if (this.f3876J) {
                this.f3881O.getLayoutParams().height = -1;
            } else if (this.f3878L > 0) {
                this.f3881O.getLayoutParams().height = this.f3878L;
            } else if (this.f3879M > 0.0f) {
                this.f3881O.getLayoutParams().height = (int) (t100.c().heightPixels * this.f3879M);
            }
            this.f3881O.setBackgroundResource(u2c0.f4822w);
            this.f3867A.getWindow().setDimAmount(0.3f);
            this.f3868B = this.f3867A.findViewById(p4c0.f3669i0);
            this.f3883Q = this.f3867A.findViewById(p4c0.f3702z);
            this.f3870D = (ViewStub) this.f3867A.findViewById(p4c0.f3633P);
            this.f3871E = (ViewStub) this.f3867A.findViewById(p4c0.f3627M);
            this.f3869C = this.f3867A.findViewById(p4c0.f3603A);
            this.f3868B.setLeftTextView(this.f3891c);
            this.f3868B.setCenterTextView(this.f3889a);
            this.f3868B.setRightTextView(this.f3892d);
            this.f3868B.setRightTextColor(this.f3893e);
            this.f3868B.setRightTextSize(this.f3894f);
            this.f3868B.setRightTextMarginEnd(this.f3895g);
            this.f3868B.setLeftImage(this.f3896h);
            this.f3868B.setCenterImage(this.f3890b);
            this.f3868B.setRightImage(this.f3897i);
            this.f3868B.i0(this.f3910v);
            this.f3868B.setLeftRegionClick(this.f3904p);
            this.f3868B.setCenterRegionClick(this.f3906r);
            this.f3868B.setRightRegionClick(this.f3905q);
            this.f3868B.setCenterCustomLayoutRes(this.f3877K);
            this.f3868B.setCenterCustomView(this.f3880N);
            int i = this.f3900l;
            if (i > 0 && this.f3884R != null) {
                upk0.a("Only One Header can exist");
                return;
            }
            if (i > 0) {
                this.f3870D.setLayoutResource(i);
                this.f3872F = this.f3870D.inflate();
            }
            if (this.f3884R != null) {
                Constraints.a aVar = new Constraints.a(-1, -2);
                ((ConstraintLayout.a) aVar).d = 0;
                ((ConstraintLayout.a) aVar).f = 0;
                ((ConstraintLayout.a) aVar).h = 0;
                this.f3883Q.addView(this.f3884R, 0, aVar);
                this.f3872F = this.f3884R;
            }
            int i2 = this.f3901m;
            if (i2 > 0 && this.f3885S != null) {
                upk0.a("Only One Footer can exist");
                return;
            }
            if (i2 > 0) {
                this.f3871E.setLayoutResource(i2);
                this.f3873G = this.f3871E.inflate();
            }
            if (this.f3885S != null) {
                Constraints.a aVar2 = new Constraints.a(-1, -2);
                ((ConstraintLayout.a) aVar2).d = 0;
                ((ConstraintLayout.a) aVar2).f = 0;
                ((ConstraintLayout.a) aVar2).k = 0;
                this.f3883Q.addView(this.f3885S, 2, aVar2);
                this.f3873G = this.f3885S;
            }
            if (!vwb.J(this.f3911w)) {
                this.f3912x = new C0672d(this.f3911w, null);
                this.f3869C.setLayoutManager(new LinearLayoutManager(this.f3914z));
                this.f3869C.setAdapter(this.f3912x);
                this.f3869C.setVisibility(0);
            } else if (this.f3912x != null) {
                RecyclerView.o oVar = this.f3913y;
                if (oVar == null) {
                    upk0.a("Adapter and LayoutManager must init simultaneously");
                    return;
                }
                this.f3869C.setLayoutManager(oVar);
                this.f3869C.setAdapter(this.f3912x);
                this.f3869C.setVisibility(0);
                ConstraintLayout.a layoutParams = this.f3869C.getLayoutParams();
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = 0;
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = 0;
            } else {
                this.f3869C.setVisibility(8);
            }
            if (this.f3869C.getVisibility() != 8) {
                if (this.f3887U > 0 || this.f3888V > 0) {
                    ConstraintLayout.a layoutParams2 = this.f3869C.getLayoutParams();
                    ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = this.f3887U;
                    ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = this.f3888V;
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m10361g() {
        m10360f();
        this.f3867A.show();
    }

    /* JADX INFO: renamed from: l.qhy$d */
    public static class C0672d extends RecyclerView.Adapter<C0670b> {

        /* JADX INFO: renamed from: a */
        public List<VListCell.a> f3954a;

        public C0672d(List<VListCell.a> list, InterfaceC0671c interfaceC0671c) {
            this.f3954a = list;
        }

        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NonNull @NotNull C0670b c0670b, final int i) {
            c0670b.m10425b(this.f3954a.get(i));
            c0670b.f3953a.setOnClickListener(new View.OnClickListener() { // from class: l.rhy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f4078a.m10427z(i, view);
                }
            });
        }

        @NotNull
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public C0670b onCreateViewHolder(@NonNull @NotNull ViewGroup viewGroup, int i) {
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(b6c0.f1920f, (ViewGroup) null);
            ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, -2);
            } else {
                layoutParams.width = -1;
            }
            viewInflate.setLayoutParams(layoutParams);
            return new C0670b(viewInflate);
        }

        public int getItemCount() {
            List<VListCell.a> list = this.f3954a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: z */
        public /* synthetic */ void m10427z(int i, View view) {
        }
    }
}
