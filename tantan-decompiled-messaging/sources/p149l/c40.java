package p149l;

import android.R;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p147v.VLine;
import p147v.VLinear;
import p147v.VListCell;
import p147v.VText;

/* JADX INFO: loaded from: classes8.dex */
public class c40 {

    /* JADX INFO: renamed from: A */
    public int f79051A;

    /* JADX INFO: renamed from: B */
    public int f79052B;

    /* JADX INFO: renamed from: C */
    public int f79053C;

    /* JADX INFO: renamed from: D */
    public int f79054D;

    /* JADX INFO: renamed from: E */
    public Typeface f79055E;

    /* JADX INFO: renamed from: F */
    public Typeface f79056F;

    /* JADX INFO: renamed from: G */
    public Typeface f79057G;

    /* JADX INFO: renamed from: H */
    public Typeface f79058H;

    /* JADX INFO: renamed from: I */
    public int f79059I;

    /* JADX INFO: renamed from: J */
    public int f79060J;

    /* JADX INFO: renamed from: K */
    public Typeface f79061K;

    /* JADX INFO: renamed from: L */
    public Typeface f79062L;

    /* JADX INFO: renamed from: M */
    public int[] f79063M;

    /* JADX INFO: renamed from: N */
    public int[] f79064N;

    /* JADX INFO: renamed from: O */
    public int[] f79065O;

    /* JADX INFO: renamed from: P */
    public int[] f79066P;

    /* JADX INFO: renamed from: Q */
    public View f79067Q;

    /* JADX INFO: renamed from: a */
    public CharSequence f79068a;

    /* JADX INFO: renamed from: b */
    public CharSequence f79069b;

    /* JADX INFO: renamed from: c */
    public CharSequence f79070c;

    /* JADX INFO: renamed from: d */
    public CharSequence f79071d;

    /* JADX INFO: renamed from: e */
    public List<VListCell.C22545a> f79072e;

    /* JADX INFO: renamed from: f */
    public Context f79073f;

    /* JADX INFO: renamed from: g */
    public boolean f79074g;

    /* JADX INFO: renamed from: h */
    public boolean f79075h;

    /* JADX INFO: renamed from: i */
    public DialogInterface.OnCancelListener f79076i;

    /* JADX INFO: renamed from: j */
    public DialogInterface.OnShowListener f79077j;

    /* JADX INFO: renamed from: k */
    public DialogInterface.OnDismissListener f79078k;

    /* JADX INFO: renamed from: l */
    public View.OnClickListener f79079l;

    /* JADX INFO: renamed from: m */
    public View.OnClickListener f79080m;

    /* JADX INFO: renamed from: n */
    public l5j0 f79081n;

    /* JADX INFO: renamed from: o */
    public VText f79082o;

    /* JADX INFO: renamed from: p */
    public VText f79083p;

    /* JADX INFO: renamed from: q */
    public VText f79084q;

    /* JADX INFO: renamed from: r */
    public VText f79085r;

    /* JADX INFO: renamed from: s */
    public VLine f79086s;

    /* JADX INFO: renamed from: t */
    public VLine f79087t;

    /* JADX INFO: renamed from: u */
    public RecyclerView f79088u;

    /* JADX INFO: renamed from: v */
    public VLinear f79089v;

    /* JADX INFO: renamed from: w */
    public VLinear f79090w;

    /* JADX INFO: renamed from: x */
    public C16056a f79091x;

    /* JADX INFO: renamed from: y */
    public InterfaceC16059d f79092y;

    /* JADX INFO: renamed from: z */
    public int f79093z;

    /* JADX INFO: renamed from: l.c40$a */
    public static class C16056a extends RecyclerView.Adapter<C16058c> {

        /* JADX INFO: renamed from: a */
        public Context f79094a;

        /* JADX INFO: renamed from: b */
        public List<VListCell.C22545a> f79095b;

        /* JADX INFO: renamed from: c */
        public InterfaceC16059d f79096c;

        /* JADX INFO: renamed from: d */
        public int f79097d;

        /* JADX INFO: renamed from: e */
        public boolean f79098e;

        /* JADX INFO: renamed from: f */
        public int f79099f;

        /* JADX INFO: renamed from: g */
        public int f79100g;

        /* JADX INFO: renamed from: h */
        public Typeface f79101h;

        /* JADX INFO: renamed from: i */
        public Typeface f79102i;

        /* JADX INFO: renamed from: j */
        public SparseIntArray f79103j;

        /* JADX INFO: renamed from: k */
        public SparseIntArray f79104k;

        /* JADX INFO: renamed from: l */
        public int f79105l;

        /* JADX INFO: renamed from: m */
        public int f79106m;

        public C16056a(Context context, List<VListCell.C22545a> list, InterfaceC16059d interfaceC16059d, int i, int i2, int i3, Typeface typeface, Typeface typeface2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
            this.f79094a = context;
            this.f79095b = list;
            this.f79096c = interfaceC16059d;
            boolean z = i != 0;
            this.f79098e = z;
            this.f79097d = z ? i : b6c0.f73780f;
            this.f79099f = i2;
            this.f79100g = i3;
            this.f79101h = typeface;
            this.f79102i = typeface2;
            if (iArr2 != null) {
                this.f79103j = new SparseIntArray(list.size());
                for (int i4 = 0; i4 < iArr2.length; i4++) {
                    this.f79103j.put(iArr2[i4], context.getResources().getColor(iArr[i4]));
                }
            }
            if (iArr4 != null) {
                this.f79104k = new SparseIntArray(list.size());
                for (int i5 = 0; i5 < iArr4.length; i5++) {
                    this.f79104k.put(iArr4[i5], context.getResources().getColor(iArr3[i5]));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: z */
        public /* synthetic */ void m105119z(int i, View view) {
            InterfaceC16059d interfaceC16059d = this.f79096c;
            if (interfaceC16059d != null) {
                interfaceC16059d.mo41896a((VListCell) view, this.f79095b.get(i), i);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NonNull @NotNull C16058c c16058c, final int i) {
            c16058c.m105172b(this.f79095b.get(i));
            SparseIntArray sparseIntArray = this.f79103j;
            if (sparseIntArray == null || sparseIntArray.indexOfKey(i) < 0) {
                c16058c.f79138a.setTitleColor(this.f79105l);
            } else {
                c16058c.f79138a.setTitleColor(this.f79103j.get(i));
            }
            SparseIntArray sparseIntArray2 = this.f79104k;
            if (sparseIntArray2 == null || sparseIntArray2.indexOfKey(i) < 0) {
                c16058c.f79138a.setSubTitleColor(this.f79106m);
            } else {
                c16058c.f79138a.setSubTitleColor(this.f79104k.get(i));
            }
            c16058c.f79138a.setOnClickListener(new View.OnClickListener() { // from class: l.b40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f73276a.m105119z(i, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public C16058c onCreateViewHolder(@NonNull @NotNull ViewGroup viewGroup, int i) {
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.f79097d, (ViewGroup) null);
            VListCell vListCell = (VListCell) viewInflate;
            this.f79105l = vListCell.getTitleColor();
            this.f79106m = vListCell.getSubTitleColor();
            ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, -2);
            }
            viewInflate.setLayoutParams(layoutParams);
            if (!this.f79098e) {
                int i2 = this.f79099f;
                if (i2 == Integer.MAX_VALUE) {
                    vListCell.setTitleColor(this.f79094a.getResources().getColor(t0c0.f167151c));
                } else {
                    vListCell.setTitleColor(i2);
                }
                int i3 = this.f79100g;
                if (i3 == Integer.MAX_VALUE) {
                    vListCell.setSubTitleColor(this.f79094a.getResources().getColor(t0c0.f167151c));
                } else {
                    vListCell.setSubTitleColor(i3);
                }
                Typeface typeface = this.f79101h;
                if (typeface == null) {
                    vListCell.m223076c(eqh0.m117752c(3), 1);
                } else {
                    vListCell.setTitleTypeface(typeface);
                }
                Typeface typeface2 = this.f79102i;
                if (typeface2 != null) {
                    vListCell.setSubTitleTypeface(typeface2);
                }
            }
            return new C16058c(viewInflate);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            List<VListCell.C22545a> list = this.f79095b;
            if (list == null) {
                return 0;
            }
            return list.size();
        }
    }

    /* JADX INFO: renamed from: l.c40$b */
    public static class C16057b {

        /* JADX INFO: renamed from: A */
        public View.OnClickListener f79107A;

        /* JADX INFO: renamed from: B */
        public View.OnClickListener f79108B;

        /* JADX INFO: renamed from: C */
        public InterfaceC16059d f79109C;

        /* JADX INFO: renamed from: D */
        public List<VListCell.C22545a> f79110D;

        /* JADX INFO: renamed from: E */
        public Context f79111E;

        /* JADX INFO: renamed from: a */
        public CharSequence f79112a;

        /* JADX INFO: renamed from: b */
        public CharSequence f79113b;

        /* JADX INFO: renamed from: c */
        public CharSequence f79114c;

        /* JADX INFO: renamed from: d */
        public CharSequence f79115d;

        /* JADX INFO: renamed from: i */
        public Typeface f79120i;

        /* JADX INFO: renamed from: j */
        public Typeface f79121j;

        /* JADX INFO: renamed from: k */
        public Typeface f79122k;

        /* JADX INFO: renamed from: l */
        public Typeface f79123l;

        /* JADX INFO: renamed from: p */
        public Typeface f79127p;

        /* JADX INFO: renamed from: q */
        public int f79128q;

        /* JADX INFO: renamed from: t */
        public int[] f79131t;

        /* JADX INFO: renamed from: u */
        public int[] f79132u;

        /* JADX INFO: renamed from: v */
        public int[] f79133v;

        /* JADX INFO: renamed from: w */
        public int[] f79134w;

        /* JADX INFO: renamed from: x */
        public DialogInterface.OnCancelListener f79135x;

        /* JADX INFO: renamed from: y */
        public DialogInterface.OnShowListener f79136y;

        /* JADX INFO: renamed from: z */
        public DialogInterface.OnDismissListener f79137z;

        /* JADX INFO: renamed from: e */
        public int f79116e = Api.BaseClientBuilder.API_PRIORITY_OTHER;

        /* JADX INFO: renamed from: f */
        public int f79117f = Api.BaseClientBuilder.API_PRIORITY_OTHER;

        /* JADX INFO: renamed from: g */
        public int f79118g = Api.BaseClientBuilder.API_PRIORITY_OTHER;

        /* JADX INFO: renamed from: h */
        public int f79119h = Api.BaseClientBuilder.API_PRIORITY_OTHER;

        /* JADX INFO: renamed from: m */
        public int f79124m = Api.BaseClientBuilder.API_PRIORITY_OTHER;

        /* JADX INFO: renamed from: n */
        public int f79125n = Api.BaseClientBuilder.API_PRIORITY_OTHER;

        /* JADX INFO: renamed from: o */
        public Typeface f79126o = Typeface.DEFAULT;

        /* JADX INFO: renamed from: r */
        public boolean f79129r = true;

        /* JADX INFO: renamed from: s */
        public boolean f79130s = true;

        public C16057b(Context context) {
            this.f79111E = context;
        }

        /* JADX INFO: renamed from: F */
        public c40 m105153F() {
            return new c40(this);
        }

        /* JADX INFO: renamed from: G */
        public C16057b m105154G(boolean z) {
            this.f79130s = z;
            return this;
        }

        /* JADX INFO: renamed from: H */
        public C16057b m105155H(@StringRes int i) {
            this.f79114c = this.f79111E.getString(i);
            return this;
        }

        /* JADX INFO: renamed from: I */
        public C16057b m105156I(CharSequence charSequence) {
            this.f79114c = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: J */
        public C16057b m105157J(int i) {
            this.f79118g = i;
            return this;
        }

        /* JADX INFO: renamed from: K */
        public C16057b m105158K(@StringRes int i) {
            this.f79113b = this.f79111E.getString(i);
            return this;
        }

        /* JADX INFO: renamed from: L */
        public C16057b m105159L(CharSequence charSequence) {
            this.f79113b = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: M */
        public C16057b m105160M(@StringRes int i) {
            this.f79112a = this.f79111E.getString(i);
            return this;
        }

        /* JADX INFO: renamed from: N */
        public C16057b m105161N(CharSequence charSequence) {
            this.f79112a = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: O */
        public C16057b m105162O(int i) {
            this.f79128q = i;
            return this;
        }

        /* JADX INFO: renamed from: P */
        public C16057b m105163P(Typeface typeface) {
            this.f79126o = typeface;
            return this;
        }

        /* JADX INFO: renamed from: Q */
        public C16057b m105164Q(List<CharSequence> list) {
            ArrayList arrayList = new ArrayList();
            Iterator<CharSequence> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new VListCell.C22545a(it.next()));
            }
            this.f79110D = arrayList;
            return this;
        }

        /* JADX INFO: renamed from: R */
        public C16057b m105165R(int[] iArr, int[] iArr2) {
            if (iArr2 == null || iArr == null || iArr2.length != iArr.length) {
                upk0.m194883a("header title Color And Pos must be matched!");
                return null;
            }
            this.f79131t = iArr2;
            this.f79132u = iArr;
            return this;
        }

        /* JADX INFO: renamed from: S */
        public C16057b m105166S(DialogInterface.OnCancelListener onCancelListener) {
            this.f79135x = onCancelListener;
            return this;
        }

        /* JADX INFO: renamed from: T */
        public C16057b m105167T(DialogInterface.OnDismissListener onDismissListener) {
            this.f79137z = onDismissListener;
            return this;
        }

        /* JADX INFO: renamed from: U */
        public C16057b m105168U(View.OnClickListener onClickListener) {
            this.f79108B = onClickListener;
            return this;
        }

        /* JADX INFO: renamed from: V */
        public C16057b m105169V(InterfaceC16059d interfaceC16059d) {
            this.f79109C = interfaceC16059d;
            return this;
        }

        /* JADX INFO: renamed from: W */
        public C16057b m105170W(DialogInterface.OnShowListener onShowListener) {
            this.f79136y = onShowListener;
            return this;
        }
    }

    /* JADX INFO: renamed from: l.c40$c */
    public static class C16058c extends RecyclerView.AbstractC0566d0 {

        /* JADX INFO: renamed from: a */
        public final VListCell f79138a;

        public C16058c(@NonNull View view) {
            super(view);
            this.f79138a = (VListCell) view;
        }

        /* JADX INFO: renamed from: b */
        public void m105172b(VListCell.C22545a c22545a) {
            this.f79138a.setTitle(c22545a.f209159a);
            this.f79138a.setSubTitle(c22545a.f209160b);
            this.f79138a.setDescribe(c22545a.f209161c);
            this.f79138a.setLeftLargeImage(c22545a.f209162d);
            this.f79138a.setLeftSmallImage(c22545a.f209163e);
            this.f79138a.setRightLayoutRes(c22545a.f209164f);
        }
    }

    /* JADX INFO: renamed from: l.c40$d */
    public interface InterfaceC16059d {
        /* JADX INFO: renamed from: a */
        void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i);
    }

    public c40(C16057b c16057b) {
        this.f79068a = c16057b.f79112a;
        this.f79069b = c16057b.f79113b;
        this.f79070c = c16057b.f79114c;
        this.f79071d = c16057b.f79115d;
        this.f79072e = c16057b.f79110D;
        this.f79073f = c16057b.f79111E;
        this.f79074g = c16057b.f79129r;
        this.f79075h = c16057b.f79130s;
        this.f79076i = c16057b.f79135x;
        this.f79077j = c16057b.f79136y;
        this.f79078k = c16057b.f79137z;
        this.f79079l = c16057b.f79107A;
        this.f79080m = c16057b.f79108B;
        this.f79092y = c16057b.f79109C;
        this.f79093z = c16057b.f79116e;
        this.f79051A = c16057b.f79117f;
        this.f79052B = c16057b.f79118g;
        this.f79053C = c16057b.f79119h;
        this.f79054D = c16057b.f79128q;
        this.f79055E = c16057b.f79120i;
        this.f79056F = c16057b.f79121j;
        this.f79057G = c16057b.f79122k;
        this.f79058H = c16057b.f79123l;
        this.f79061K = c16057b.f79126o;
        this.f79062L = c16057b.f79127p;
        this.f79063M = c16057b.f79131t;
        this.f79065O = c16057b.f79133v;
        this.f79064N = c16057b.f79132u;
        this.f79066P = c16057b.f79134w;
        this.f79059I = c16057b.f79124m;
        this.f79060J = c16057b.f79125n;
    }

    /* JADX INFO: renamed from: b */
    public void m105113b() {
        l5j0 l5j0Var = this.f79081n;
        if (l5j0Var != null && l5j0Var.isShowing()) {
            this.f79081n.dismiss();
        }
    }

    /* JADX INFO: renamed from: c */
    public View m105114c() {
        return this.f79067Q;
    }

    /* JADX INFO: renamed from: d */
    public boolean m105115d() {
        l5j0 l5j0Var = this.f79081n;
        if (l5j0Var == null) {
            return false;
        }
        return l5j0Var.isShowing();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m105116e(DialogInterface dialogInterface) {
        this.f79088u.setPadding(0, (this.f79089v.getVisibility() == 0 ? this.f79089v.getHeight() : 0) + (this.f79086s.getVisibility() == 0 ? t100.f167259h + t100.f167255d : 0), 0, (this.f79090w.getVisibility() == 0 ? this.f79090w.getHeight() : 0) + (this.f79087t.getVisibility() == 0 ? (t100.f167259h * 3) + t100.f167255d : 0));
        C16056a c16056a = this.f79091x;
        if (c16056a != null && c16056a.getItemCount() > 6) {
            this.f79088u.scrollToPosition(0);
        }
        DialogInterface.OnShowListener onShowListener = this.f79077j;
        if (onShowListener != null) {
            onShowListener.onShow(dialogInterface);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m105117f() {
        boolean z;
        boolean z2;
        this.f79081n = new l5j0(this.f79073f);
        ComponentCallbacks2 componentCallbacks2M208326D = xdl0.m208326D(this.f79073f);
        if (!(componentCallbacks2M208326D instanceof d0e)) {
            upk0.m194883a("ActionSheet`s Host do not implement DialogLifeTracer");
            return;
        }
        this.f79081n.m148651w((d0e) componentCallbacks2M208326D);
        this.f79081n.setContentView(b6c0.f73779e);
        this.f79081n.setCancelable(this.f79074g);
        this.f79081n.setCanceledOnTouchOutside(this.f79075h);
        this.f79081n.setOnCancelListener(this.f79076i);
        this.f79081n.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.a40
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f67432a.m105116e(dialogInterface);
            }
        });
        this.f79081n.setOnDismissListener(this.f79078k);
        View viewMo302g = this.f79081n.getDelegate().mo302g(p4c0.f147063E);
        this.f79067Q = viewMo302g;
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(viewMo302g);
        bottomSheetBehaviorFrom.setState(3);
        boolean z3 = true;
        bottomSheetBehaviorFrom.setSkipCollapsed(true);
        this.f79067Q.setBackgroundColor(this.f79073f.getResources().getColor(R.color.transparent));
        this.f79081n.getWindow().setDimAmount(0.3f);
        VText vText = (VText) this.f79081n.findViewById(p4c0.f147089R);
        this.f79082o = vText;
        int i = this.f79093z;
        if (i != Integer.MAX_VALUE) {
            vText.setTextColor(i);
        }
        Typeface typeface = this.f79055E;
        VText vText2 = this.f79082o;
        if (typeface != null) {
            vText2.setTypeface(typeface);
        } else {
            vText2.setTypeface(vText2.getTypeface(), 1);
        }
        VText vText3 = (VText) this.f79081n.findViewById(p4c0.f147087Q);
        this.f79083p = vText3;
        int i2 = this.f79051A;
        if (i2 != Integer.MAX_VALUE) {
            vText3.setTextColor(i2);
        }
        Typeface typeface2 = this.f79056F;
        if (typeface2 != null) {
            this.f79083p.setTypeface(typeface2);
        }
        VText vText4 = (VText) this.f79081n.findViewById(p4c0.f147083O);
        this.f79084q = vText4;
        int i3 = this.f79052B;
        if (i3 != Integer.MAX_VALUE) {
            vText4.setTextColor(i3);
        }
        Typeface typeface3 = this.f79057G;
        VText vText5 = this.f79084q;
        if (typeface3 != null) {
            vText5.setTypeface(typeface3);
        } else {
            vText5.setTypeface(this.f79082o.getTypeface(), 1);
        }
        VText vText6 = (VText) this.f79081n.findViewById(p4c0.f147081N);
        this.f79085r = vText6;
        int i4 = this.f79053C;
        if (i4 != Integer.MAX_VALUE) {
            vText6.setTextColor(i4);
        }
        Typeface typeface4 = this.f79058H;
        if (typeface4 != null) {
            this.f79085r.setTypeface(typeface4);
        }
        this.f79086s = (VLine) this.f79081n.findViewById(p4c0.f147100W0);
        this.f79087t = (VLine) this.f79081n.findViewById(p4c0.f147122j);
        this.f79089v = (VLinear) this.f79081n.findViewById(p4c0.f147085P);
        this.f79090w = (VLinear) this.f79081n.findViewById(p4c0.f147079M);
        this.f79088u = (RecyclerView) this.f79081n.findViewById(p4c0.f147055A);
        View.OnClickListener onClickListener = this.f79079l;
        if (onClickListener != null) {
            this.f79089v.setOnClickListener(onClickListener);
        }
        View.OnClickListener onClickListener2 = this.f79080m;
        if (onClickListener2 != null) {
            this.f79090w.setOnClickListener(onClickListener2);
        }
        boolean zIsEmpty = TextUtils.isEmpty(this.f79068a);
        VText vText7 = this.f79082o;
        if (zIsEmpty) {
            vText7.setVisibility(8);
            z = false;
        } else {
            vText7.setText(this.f79068a);
            z = true;
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f79069b);
        VText vText8 = this.f79083p;
        if (zIsEmpty2) {
            vText8.setVisibility(8);
        } else {
            vText8.setText(this.f79069b);
            this.f79083p.setVisibility(0);
            if (TextUtils.isEmpty(this.f79068a)) {
                ((LinearLayout.LayoutParams) this.f79083p.getLayoutParams()).topMargin = 0;
            }
            z = true;
        }
        if (!z) {
            this.f79089v.setVisibility(8);
            this.f79086s.setVisibility(8);
        }
        boolean zIsEmpty3 = TextUtils.isEmpty(this.f79070c);
        VText vText9 = this.f79084q;
        if (zIsEmpty3) {
            vText9.setVisibility(8);
            z2 = false;
        } else {
            vText9.setText(this.f79070c);
            z2 = true;
        }
        boolean zIsEmpty4 = TextUtils.isEmpty(this.f79071d);
        VText vText10 = this.f79085r;
        if (zIsEmpty4) {
            vText10.setVisibility(8);
            z3 = z2;
        } else {
            vText10.setText(this.f79071d);
            this.f79085r.setVisibility(0);
        }
        if (!z3) {
            this.f79090w.setVisibility(8);
            this.f79087t.setVisibility(8);
        }
        if (!vwb.m200296J(this.f79072e)) {
            this.f79091x = new C16056a(this.f79073f, this.f79072e, this.f79092y, this.f79054D, this.f79059I, this.f79060J, this.f79061K, this.f79062L, this.f79063M, this.f79064N, this.f79065O, this.f79066P);
            this.f79088u.setLayoutManager(new LinearLayoutManager(this.f79073f));
            this.f79088u.setAdapter(this.f79091x);
        }
        this.f79081n.show();
    }
}
