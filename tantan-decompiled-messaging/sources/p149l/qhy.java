package p149l;

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
import p147v.VListCell;
import p147v.VMenuBar;

/* JADX INFO: loaded from: classes8.dex */
public class qhy {

    /* JADX INFO: renamed from: A */
    public l5j0 f154541A;

    /* JADX INFO: renamed from: B */
    public VMenuBar f154542B;

    /* JADX INFO: renamed from: C */
    public RecyclerView f154543C;

    /* JADX INFO: renamed from: D */
    public ViewStub f154544D;

    /* JADX INFO: renamed from: E */
    public ViewStub f154545E;

    /* JADX INFO: renamed from: F */
    public View f154546F;

    /* JADX INFO: renamed from: G */
    public View f154547G;

    /* JADX INFO: renamed from: H */
    public boolean f154548H;

    /* JADX INFO: renamed from: I */
    public boolean f154549I;

    /* JADX INFO: renamed from: J */
    public boolean f154550J;

    /* JADX INFO: renamed from: K */
    public int f154551K;

    /* JADX INFO: renamed from: L */
    public int f154552L;

    /* JADX INFO: renamed from: M */
    public float f154553M;

    /* JADX INFO: renamed from: N */
    public View f154554N;

    /* JADX INFO: renamed from: O */
    public FrameLayout f154555O;

    /* JADX INFO: renamed from: P */
    public int f154556P;

    /* JADX INFO: renamed from: Q */
    public ConstraintLayout f154557Q;

    /* JADX INFO: renamed from: R */
    public View f154558R;

    /* JADX INFO: renamed from: S */
    public View f154559S;

    /* JADX INFO: renamed from: T */
    public BottomSheetBehavior f154560T;

    /* JADX INFO: renamed from: U */
    public int f154561U;

    /* JADX INFO: renamed from: V */
    public int f154562V;

    /* JADX INFO: renamed from: a */
    public CharSequence f154563a;

    /* JADX INFO: renamed from: b */
    public int f154564b;

    /* JADX INFO: renamed from: c */
    public CharSequence f154565c;

    /* JADX INFO: renamed from: d */
    public CharSequence f154566d;

    /* JADX INFO: renamed from: e */
    public int f154567e;

    /* JADX INFO: renamed from: f */
    public float f154568f;

    /* JADX INFO: renamed from: g */
    public int f154569g;

    /* JADX INFO: renamed from: h */
    public int f154570h;

    /* JADX INFO: renamed from: i */
    public int f154571i;

    /* JADX INFO: renamed from: j */
    public boolean f154572j;

    /* JADX INFO: renamed from: k */
    public boolean f154573k;

    /* JADX INFO: renamed from: l */
    public int f154574l;

    /* JADX INFO: renamed from: m */
    public int f154575m;

    /* JADX INFO: renamed from: n */
    public int f154576n;

    /* JADX INFO: renamed from: o */
    public int f154577o;

    /* JADX INFO: renamed from: p */
    public View.OnClickListener f154578p;

    /* JADX INFO: renamed from: q */
    public View.OnClickListener f154579q;

    /* JADX INFO: renamed from: r */
    public View.OnClickListener f154580r;

    /* JADX INFO: renamed from: s */
    public DialogInterface.OnCancelListener f154581s;

    /* JADX INFO: renamed from: t */
    public DialogInterface.OnShowListener f154582t;

    /* JADX INFO: renamed from: u */
    public DialogInterface.OnDismissListener f154583u;

    /* JADX INFO: renamed from: v */
    public boolean f154584v;

    /* JADX INFO: renamed from: w */
    public List<VListCell.C22545a> f154585w;

    /* JADX INFO: renamed from: x */
    public RecyclerView.Adapter f154586x;

    /* JADX INFO: renamed from: y */
    public RecyclerView.AbstractC0577o f154587y;

    /* JADX INFO: renamed from: z */
    public Context f154588z;

    /* JADX INFO: renamed from: l.qhy$a */
    public static class C19502a {

        /* JADX INFO: renamed from: A */
        public List<VListCell.C22545a> f154589A;

        /* JADX INFO: renamed from: B */
        public boolean f154590B;

        /* JADX INFO: renamed from: C */
        public boolean f154591C;

        /* JADX INFO: renamed from: D */
        public boolean f154592D;

        /* JADX INFO: renamed from: G */
        public Context f154595G;

        /* JADX INFO: renamed from: H */
        public int f154596H;

        /* JADX INFO: renamed from: K */
        public View f154599K;

        /* JADX INFO: renamed from: L */
        public View f154600L;

        /* JADX INFO: renamed from: a */
        public CharSequence f154601a;

        /* JADX INFO: renamed from: c */
        public CharSequence f154603c;

        /* JADX INFO: renamed from: d */
        public CharSequence f154604d;

        /* JADX INFO: renamed from: e */
        public int f154605e;

        /* JADX INFO: renamed from: f */
        public float f154606f;

        /* JADX INFO: renamed from: g */
        public int f154607g;

        /* JADX INFO: renamed from: j */
        public int f154610j;

        /* JADX INFO: renamed from: k */
        public View f154611k;

        /* JADX INFO: renamed from: n */
        public int f154614n;

        /* JADX INFO: renamed from: o */
        public int f154615o;

        /* JADX INFO: renamed from: r */
        public View.OnClickListener f154618r;

        /* JADX INFO: renamed from: s */
        public View.OnClickListener f154619s;

        /* JADX INFO: renamed from: t */
        public View.OnClickListener f154620t;

        /* JADX INFO: renamed from: u */
        public DialogInterface.OnCancelListener f154621u;

        /* JADX INFO: renamed from: v */
        public DialogInterface.OnShowListener f154622v;

        /* JADX INFO: renamed from: w */
        public DialogInterface.OnDismissListener f154623w;

        /* JADX INFO: renamed from: y */
        public RecyclerView.Adapter f154625y;

        /* JADX INFO: renamed from: z */
        public RecyclerView.AbstractC0577o f154626z;

        /* JADX INFO: renamed from: b */
        public int f154602b = -1;

        /* JADX INFO: renamed from: h */
        public int f154608h = -1;

        /* JADX INFO: renamed from: i */
        public int f154609i = -1;

        /* JADX INFO: renamed from: l */
        public boolean f154612l = true;

        /* JADX INFO: renamed from: m */
        public boolean f154613m = true;

        /* JADX INFO: renamed from: p */
        public int f154616p = -1;

        /* JADX INFO: renamed from: q */
        public int f154617q = -1;

        /* JADX INFO: renamed from: x */
        public boolean f154624x = true;

        /* JADX INFO: renamed from: E */
        public int f154593E = -1;

        /* JADX INFO: renamed from: F */
        public float f154594F = -1.0f;

        /* JADX INFO: renamed from: I */
        public int f154597I = -1;

        /* JADX INFO: renamed from: J */
        public int f154598J = -1;

        public C19502a(Context context) {
            this.f154595G = context;
        }

        /* JADX INFO: renamed from: G */
        public static /* bridge */ /* synthetic */ InterfaceC19504c m174621G(C19502a c19502a) {
            c19502a.getClass();
            return null;
        }

        /* JADX INFO: renamed from: N */
        public qhy m174654N() {
            return new qhy(this);
        }

        /* JADX INFO: renamed from: O */
        public C19502a m174655O(RecyclerView.Adapter adapter) {
            this.f154625y = adapter;
            return this;
        }

        /* JADX INFO: renamed from: P */
        public C19502a m174656P(View view) {
            return m174657Q(false, view);
        }

        /* JADX INFO: renamed from: Q */
        public C19502a m174657Q(boolean z, View view) {
            this.f154599K = view;
            this.f154590B = z;
            return this;
        }

        /* JADX INFO: renamed from: R */
        public C19502a m174658R(int i) {
            this.f154593E = i;
            return this;
        }

        /* JADX INFO: renamed from: S */
        public C19502a m174659S(@LayoutRes int i) {
            return m174660T(false, i);
        }

        /* JADX INFO: renamed from: T */
        public C19502a m174660T(boolean z, @LayoutRes int i) {
            this.f154614n = i;
            this.f154590B = z;
            return this;
        }

        /* JADX INFO: renamed from: U */
        public C19502a m174661U(float f) {
            this.f154594F = f;
            return this;
        }

        /* JADX INFO: renamed from: V */
        public C19502a m174662V(RecyclerView.AbstractC0577o abstractC0577o) {
            this.f154626z = abstractC0577o;
            return this;
        }

        /* JADX INFO: renamed from: W */
        public C19502a m174663W(View.OnClickListener onClickListener) {
            this.f154618r = onClickListener;
            return this;
        }

        /* JADX INFO: renamed from: X */
        public C19502a m174664X(@DrawableRes int i) {
            this.f154608h = i;
            return this;
        }

        /* JADX INFO: renamed from: Y */
        public C19502a m174665Y(View.OnClickListener onClickListener) {
            this.f154619s = onClickListener;
            return this;
        }

        /* JADX INFO: renamed from: Z */
        public C19502a m174666Z(@StringRes int i) {
            this.f154604d = this.f154595G.getString(i);
            return this;
        }

        /* JADX INFO: renamed from: a0 */
        public C19502a m174667a0(CharSequence charSequence) {
            this.f154604d = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: b0 */
        public C19502a m174668b0(@ColorInt int i) {
            this.f154605e = i;
            return this;
        }

        /* JADX INFO: renamed from: c0 */
        public C19502a m174669c0(int i) {
            this.f154607g = i;
            return this;
        }

        /* JADX INFO: renamed from: d0 */
        public C19502a m174670d0(float f) {
            this.f154606f = f;
            return this;
        }

        /* JADX INFO: renamed from: e0 */
        public C19502a m174671e0(@StringRes int i) {
            this.f154601a = this.f154595G.getString(i);
            return this;
        }

        /* JADX INFO: renamed from: f0 */
        public C19502a m174672f0(CharSequence charSequence) {
            this.f154601a = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: g0 */
        public C19502a m174673g0(DialogInterface.OnDismissListener onDismissListener) {
            this.f154623w = onDismissListener;
            return this;
        }

        /* JADX INFO: renamed from: h0 */
        public C19502a m174674h0(int i) {
            this.f154616p = i;
            return this;
        }

        /* JADX INFO: renamed from: i0 */
        public C19502a m174675i0(int i) {
            this.f154617q = i;
            return this;
        }

        /* JADX INFO: renamed from: j0 */
        public C19502a m174676j0(boolean z) {
            this.f154624x = z;
            return this;
        }
    }

    /* JADX INFO: renamed from: l.qhy$b */
    public static class C19503b extends RecyclerView.AbstractC0566d0 {

        /* JADX INFO: renamed from: a */
        public final VListCell f154627a;

        public C19503b(@NonNull View view) {
            super(view);
            this.f154627a = (VListCell) view;
        }

        /* JADX INFO: renamed from: b */
        public void m174678b(VListCell.C22545a c22545a) {
            this.f154627a.setTitle(c22545a.f209159a);
            this.f154627a.setSubTitle(c22545a.f209160b);
            this.f154627a.setDescribe(c22545a.f209161c);
            this.f154627a.setLeftLargeImage(c22545a.f209162d);
            this.f154627a.setLeftSmallImage(c22545a.f209163e);
            this.f154627a.setRightLayoutRes(c22545a.f209164f);
        }
    }

    /* JADX INFO: renamed from: l.qhy$c */
    public interface InterfaceC19504c {
    }

    public qhy(C19502a c19502a) {
        this.f154552L = -1;
        this.f154553M = -1.0f;
        this.f154563a = c19502a.f154601a;
        this.f154564b = c19502a.f154602b;
        this.f154565c = c19502a.f154603c;
        this.f154566d = c19502a.f154604d;
        this.f154567e = c19502a.f154605e;
        this.f154568f = c19502a.f154606f;
        this.f154569g = c19502a.f154607g;
        this.f154570h = c19502a.f154608h;
        this.f154571i = c19502a.f154609i;
        this.f154572j = c19502a.f154612l;
        this.f154573k = c19502a.f154613m;
        this.f154574l = c19502a.f154614n;
        this.f154575m = c19502a.f154615o;
        this.f154577o = c19502a.f154616p;
        this.f154576n = c19502a.f154617q;
        this.f154578p = c19502a.f154618r;
        this.f154579q = c19502a.f154619s;
        this.f154580r = c19502a.f154620t;
        this.f154581s = c19502a.f154621u;
        this.f154582t = c19502a.f154622v;
        this.f154583u = c19502a.f154623w;
        C19502a.m174621G(c19502a);
        this.f154584v = c19502a.f154624x;
        this.f154585w = c19502a.f154589A;
        this.f154586x = c19502a.f154625y;
        this.f154587y = c19502a.f154626z;
        this.f154548H = c19502a.f154590B;
        this.f154549I = c19502a.f154591C;
        this.f154550J = c19502a.f154592D;
        this.f154551K = c19502a.f154610j;
        this.f154554N = c19502a.f154611k;
        this.f154552L = c19502a.f154593E;
        this.f154553M = c19502a.f154594F;
        this.f154556P = c19502a.f154596H;
        this.f154558R = c19502a.f154599K;
        this.f154559S = c19502a.f154600L;
        this.f154561U = c19502a.f154597I;
        this.f154562V = c19502a.f154598J;
        this.f154588z = c19502a.f154595G;
    }

    /* JADX INFO: renamed from: b */
    public void m174609b() {
        l5j0 l5j0Var = this.f154541A;
        if (l5j0Var != null && l5j0Var.isShowing()) {
            this.f154541A.dismiss();
        }
    }

    /* JADX INFO: renamed from: c */
    public <V extends View> V m174610c(@IdRes int i) {
        m174613f();
        return (V) this.f154555O.findViewById(i);
    }

    /* JADX INFO: renamed from: d */
    public boolean m174611d() {
        l5j0 l5j0Var = this.f154541A;
        if (l5j0Var == null) {
            return false;
        }
        return l5j0Var.isShowing();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m174612e(DialogInterface dialogInterface) {
        int height;
        int height2;
        int i = t100.m186889c().heightPixels;
        int i2 = this.f154552L;
        if (i2 > 0) {
            this.f154560T.setPeekHeight(i2);
        } else {
            float f = this.f154553M;
            if (f > 0.0f) {
                this.f154560T.setPeekHeight((int) (i * f));
            } else if (this.f154550J) {
                this.f154560T.setPeekHeight(i);
            }
        }
        if (this.f154543C.getVisibility() == 0) {
            View view = this.f154546F;
            if (view == null) {
                height = this.f154576n;
                if (height <= -1) {
                    height = t100.f167266o;
                }
            } else {
                height = this.f154548H ? 0 : view.getHeight();
            }
            View view2 = this.f154547G;
            if (view2 == null) {
                height2 = this.f154577o;
                if (height2 <= -1) {
                    height2 = t100.f167230E;
                }
            } else {
                height2 = this.f154549I ? 0 : view2.getHeight();
            }
            this.f154543C.setPadding(0, height, 0, height2);
            if (this.f154586x.getItemCount() > 6) {
                this.f154543C.scrollToPosition(0);
            }
        }
        if (this.f154548H) {
            this.f154546F.setElevation(2.0f);
        }
        if (this.f154549I) {
            this.f154547G.setElevation(2.0f);
        }
        DialogInterface.OnShowListener onShowListener = this.f154582t;
        if (onShowListener != null) {
            onShowListener.onShow(dialogInterface);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m174613f() {
        if (this.f154541A == null) {
            this.f154541A = new l5j0(this.f154588z, this.f154556P);
            ComponentCallbacks2 componentCallbacks2M208326D = xdl0.m208326D(this.f154588z);
            if (!(componentCallbacks2M208326D instanceof d0e)) {
                upk0.m194883a("MenuSheet`s Host do not implement DialogLifeTracer");
                return;
            }
            this.f154541A.m148651w((d0e) componentCallbacks2M208326D);
            this.f154541A.setContentView(b6c0.f73790p);
            this.f154541A.setCancelable(this.f154572j);
            this.f154541A.setCanceledOnTouchOutside(this.f154573k);
            this.f154541A.setOnCancelListener(this.f154581s);
            this.f154541A.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.phy
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    this.f149065a.m174612e(dialogInterface);
                }
            });
            this.f154541A.setOnDismissListener(this.f154583u);
            FrameLayout frameLayout = (FrameLayout) this.f154541A.getDelegate().mo302g(p4c0.f147063E);
            this.f154555O = frameLayout;
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            this.f154560T = bottomSheetBehaviorFrom;
            bottomSheetBehaviorFrom.setState(3);
            this.f154560T.setSkipCollapsed(true);
            if (this.f154550J) {
                this.f154555O.getLayoutParams().height = -1;
            } else if (this.f154552L > 0) {
                this.f154555O.getLayoutParams().height = this.f154552L;
            } else if (this.f154553M > 0.0f) {
                this.f154555O.getLayoutParams().height = (int) (t100.m186889c().heightPixels * this.f154553M);
            }
            this.f154555O.setBackgroundResource(u2c0.f173454w);
            this.f154541A.getWindow().setDimAmount(0.3f);
            this.f154542B = (VMenuBar) this.f154541A.findViewById(p4c0.f147121i0);
            this.f154557Q = (ConstraintLayout) this.f154541A.findViewById(p4c0.f147154z);
            this.f154544D = (ViewStub) this.f154541A.findViewById(p4c0.f147085P);
            this.f154545E = (ViewStub) this.f154541A.findViewById(p4c0.f147079M);
            this.f154543C = (RecyclerView) this.f154541A.findViewById(p4c0.f147055A);
            this.f154542B.setLeftTextView(this.f154565c);
            this.f154542B.setCenterTextView(this.f154563a);
            this.f154542B.setRightTextView(this.f154566d);
            this.f154542B.setRightTextColor(this.f154567e);
            this.f154542B.setRightTextSize(this.f154568f);
            this.f154542B.setRightTextMarginEnd(this.f154569g);
            this.f154542B.setLeftImage(this.f154570h);
            this.f154542B.setCenterImage(this.f154564b);
            this.f154542B.setRightImage(this.f154571i);
            this.f154542B.m223131i0(this.f154584v);
            this.f154542B.setLeftRegionClick(this.f154578p);
            this.f154542B.setCenterRegionClick(this.f154580r);
            this.f154542B.setRightRegionClick(this.f154579q);
            this.f154542B.setCenterCustomLayoutRes(this.f154551K);
            this.f154542B.setCenterCustomView(this.f154554N);
            int i = this.f154574l;
            if (i > 0 && this.f154558R != null) {
                upk0.m194883a("Only One Header can exist");
                return;
            }
            if (i > 0) {
                this.f154544D.setLayoutResource(i);
                this.f154546F = this.f154544D.inflate();
            }
            if (this.f154558R != null) {
                Constraints.C0221a c0221a = new Constraints.C0221a(-1, -2);
                c0221a.f1243d = 0;
                c0221a.f1247f = 0;
                c0221a.f1251h = 0;
                this.f154557Q.addView(this.f154558R, 0, c0221a);
                this.f154546F = this.f154558R;
            }
            int i2 = this.f154575m;
            if (i2 > 0 && this.f154559S != null) {
                upk0.m194883a("Only One Footer can exist");
                return;
            }
            if (i2 > 0) {
                this.f154545E.setLayoutResource(i2);
                this.f154547G = this.f154545E.inflate();
            }
            if (this.f154559S != null) {
                Constraints.C0221a c0221a2 = new Constraints.C0221a(-1, -2);
                c0221a2.f1243d = 0;
                c0221a2.f1247f = 0;
                c0221a2.f1257k = 0;
                this.f154557Q.addView(this.f154559S, 2, c0221a2);
                this.f154547G = this.f154559S;
            }
            if (!vwb.m200296J(this.f154585w)) {
                this.f154586x = new C19505d(this.f154585w, null);
                this.f154543C.setLayoutManager(new LinearLayoutManager(this.f154588z));
                this.f154543C.setAdapter(this.f154586x);
                this.f154543C.setVisibility(0);
            } else if (this.f154586x != null) {
                RecyclerView.AbstractC0577o abstractC0577o = this.f154587y;
                if (abstractC0577o == null) {
                    upk0.m194883a("Adapter and LayoutManager must init simultaneously");
                    return;
                }
                this.f154543C.setLayoutManager(abstractC0577o);
                this.f154543C.setAdapter(this.f154586x);
                this.f154543C.setVisibility(0);
                ConstraintLayout.C0220a c0220a = (ConstraintLayout.C0220a) this.f154543C.getLayoutParams();
                ((ViewGroup.MarginLayoutParams) c0220a).leftMargin = 0;
                ((ViewGroup.MarginLayoutParams) c0220a).rightMargin = 0;
            } else {
                this.f154543C.setVisibility(8);
            }
            if (this.f154543C.getVisibility() != 8) {
                if (this.f154561U > 0 || this.f154562V > 0) {
                    ConstraintLayout.C0220a c0220a2 = (ConstraintLayout.C0220a) this.f154543C.getLayoutParams();
                    ((ViewGroup.MarginLayoutParams) c0220a2).leftMargin = this.f154561U;
                    ((ViewGroup.MarginLayoutParams) c0220a2).rightMargin = this.f154562V;
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m174614g() {
        m174613f();
        this.f154541A.show();
    }

    /* JADX INFO: renamed from: l.qhy$d */
    public static class C19505d extends RecyclerView.Adapter<C19503b> {

        /* JADX INFO: renamed from: a */
        public List<VListCell.C22545a> f154628a;

        public C19505d(List<VListCell.C22545a> list, InterfaceC19504c interfaceC19504c) {
            this.f154628a = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NonNull @NotNull C19503b c19503b, final int i) {
            c19503b.m174678b(this.f154628a.get(i));
            c19503b.f154627a.setOnClickListener(new View.OnClickListener() { // from class: l.rhy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f159500a.m174680z(i, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public C19503b onCreateViewHolder(@NonNull @NotNull ViewGroup viewGroup, int i) {
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(b6c0.f73780f, (ViewGroup) null);
            ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, -2);
            } else {
                layoutParams.width = -1;
            }
            viewInflate.setLayoutParams(layoutParams);
            return new C19503b(viewInflate);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            List<VListCell.C22545a> list = this.f154628a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: z */
        public /* synthetic */ void m174680z(int i, View view) {
        }
    }
}
