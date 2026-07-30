package p153l;

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
import p151v.VLine;
import p151v.VLinear;
import p151v.VListCell;
import p151v.VText;

/* JADX INFO: loaded from: classes8.dex */
public class w30 {

    /* JADX INFO: renamed from: A */
    public int f186963A;

    /* JADX INFO: renamed from: B */
    public int f186964B;

    /* JADX INFO: renamed from: C */
    public int f186965C;

    /* JADX INFO: renamed from: D */
    public int f186966D;

    /* JADX INFO: renamed from: E */
    public Typeface f186967E;

    /* JADX INFO: renamed from: F */
    public Typeface f186968F;

    /* JADX INFO: renamed from: G */
    public Typeface f186969G;

    /* JADX INFO: renamed from: H */
    public Typeface f186970H;

    /* JADX INFO: renamed from: I */
    public int f186971I;

    /* JADX INFO: renamed from: J */
    public int f186972J;

    /* JADX INFO: renamed from: K */
    public Typeface f186973K;

    /* JADX INFO: renamed from: L */
    public Typeface f186974L;

    /* JADX INFO: renamed from: M */
    public int[] f186975M;

    /* JADX INFO: renamed from: N */
    public int[] f186976N;

    /* JADX INFO: renamed from: O */
    public int[] f186977O;

    /* JADX INFO: renamed from: P */
    public int[] f186978P;

    /* JADX INFO: renamed from: Q */
    public View f186979Q;

    /* JADX INFO: renamed from: a */
    public CharSequence f186980a;

    /* JADX INFO: renamed from: b */
    public CharSequence f186981b;

    /* JADX INFO: renamed from: c */
    public CharSequence f186982c;

    /* JADX INFO: renamed from: d */
    public CharSequence f186983d;

    /* JADX INFO: renamed from: e */
    public List<VListCell.C22660a> f186984e;

    /* JADX INFO: renamed from: f */
    public Context f186985f;

    /* JADX INFO: renamed from: g */
    public boolean f186986g;

    /* JADX INFO: renamed from: h */
    public boolean f186987h;

    /* JADX INFO: renamed from: i */
    public DialogInterface.OnCancelListener f186988i;

    /* JADX INFO: renamed from: j */
    public DialogInterface.OnShowListener f186989j;

    /* JADX INFO: renamed from: k */
    public DialogInterface.OnDismissListener f186990k;

    /* JADX INFO: renamed from: l */
    public View.OnClickListener f186991l;

    /* JADX INFO: renamed from: m */
    public View.OnClickListener f186992m;

    /* JADX INFO: renamed from: n */
    public pej0 f186993n;

    /* JADX INFO: renamed from: o */
    public VText f186994o;

    /* JADX INFO: renamed from: p */
    public VText f186995p;

    /* JADX INFO: renamed from: q */
    public VText f186996q;

    /* JADX INFO: renamed from: r */
    public VText f186997r;

    /* JADX INFO: renamed from: s */
    public VLine f186998s;

    /* JADX INFO: renamed from: t */
    public VLine f186999t;

    /* JADX INFO: renamed from: u */
    public RecyclerView f187000u;

    /* JADX INFO: renamed from: v */
    public VLinear f187001v;

    /* JADX INFO: renamed from: w */
    public VLinear f187002w;

    /* JADX INFO: renamed from: x */
    public C21000a f187003x;

    /* JADX INFO: renamed from: y */
    public InterfaceC21003d f187004y;

    /* JADX INFO: renamed from: z */
    public int f187005z;

    /* JADX INFO: renamed from: l.w30$a */
    public static class C21000a extends RecyclerView.Adapter<C21002c> {

        /* JADX INFO: renamed from: a */
        public Context f187006a;

        /* JADX INFO: renamed from: b */
        public List<VListCell.C22660a> f187007b;

        /* JADX INFO: renamed from: c */
        public InterfaceC21003d f187008c;

        /* JADX INFO: renamed from: d */
        public int f187009d;

        /* JADX INFO: renamed from: e */
        public boolean f187010e;

        /* JADX INFO: renamed from: f */
        public int f187011f;

        /* JADX INFO: renamed from: g */
        public int f187012g;

        /* JADX INFO: renamed from: h */
        public Typeface f187013h;

        /* JADX INFO: renamed from: i */
        public Typeface f187014i;

        /* JADX INFO: renamed from: j */
        public SparseIntArray f187015j;

        /* JADX INFO: renamed from: k */
        public SparseIntArray f187016k;

        /* JADX INFO: renamed from: l */
        public int f187017l;

        /* JADX INFO: renamed from: m */
        public int f187018m;

        public C21000a(Context context, List<VListCell.C22660a> list, InterfaceC21003d interfaceC21003d, int i, int i2, int i3, Typeface typeface, Typeface typeface2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
            this.f187006a = context;
            this.f187007b = list;
            this.f187008c = interfaceC21003d;
            boolean z = i != 0;
            this.f187010e = z;
            this.f187009d = z ? i : gec0.f103793f;
            this.f187011f = i2;
            this.f187012g = i3;
            this.f187013h = typeface;
            this.f187014i = typeface2;
            if (iArr2 != null) {
                this.f187015j = new SparseIntArray(list.size());
                for (int i4 = 0; i4 < iArr2.length; i4++) {
                    this.f187015j.put(iArr2[i4], context.getResources().getColor(iArr[i4]));
                }
            }
            if (iArr4 != null) {
                this.f187016k = new SparseIntArray(list.size());
                for (int i5 = 0; i5 < iArr4.length; i5++) {
                    this.f187016k.put(iArr4[i5], context.getResources().getColor(iArr3[i5]));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: z */
        public /* synthetic */ void m204620z(int i, View view) {
            InterfaceC21003d interfaceC21003d = this.f187008c;
            if (interfaceC21003d != null) {
                interfaceC21003d.mo42907a((VListCell) view, this.f187007b.get(i), i);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NonNull @NotNull C21002c c21002c, final int i) {
            c21002c.m204673b(this.f187007b.get(i));
            SparseIntArray sparseIntArray = this.f187015j;
            if (sparseIntArray == null || sparseIntArray.indexOfKey(i) < 0) {
                c21002c.f187050a.setTitleColor(this.f187017l);
            } else {
                c21002c.f187050a.setTitleColor(this.f187015j.get(i));
            }
            SparseIntArray sparseIntArray2 = this.f187016k;
            if (sparseIntArray2 == null || sparseIntArray2.indexOfKey(i) < 0) {
                c21002c.f187050a.setSubTitleColor(this.f187018m);
            } else {
                c21002c.f187050a.setSubTitleColor(this.f187016k.get(i));
            }
            c21002c.f187050a.setOnClickListener(new View.OnClickListener() { // from class: l.v30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f182136a.m204620z(i, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public C21002c onCreateViewHolder(@NonNull @NotNull ViewGroup viewGroup, int i) {
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.f187009d, (ViewGroup) null);
            VListCell vListCell = (VListCell) viewInflate;
            this.f187017l = vListCell.getTitleColor();
            this.f187018m = vListCell.getSubTitleColor();
            ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, -2);
            }
            viewInflate.setLayoutParams(layoutParams);
            if (!this.f187010e) {
                int i2 = this.f187011f;
                if (i2 == Integer.MAX_VALUE) {
                    vListCell.setTitleColor(this.f187006a.getResources().getColor(z8c0.f203342c));
                } else {
                    vListCell.setTitleColor(i2);
                }
                int i3 = this.f187012g;
                if (i3 == Integer.MAX_VALUE) {
                    vListCell.setSubTitleColor(this.f187006a.getResources().getColor(z8c0.f203342c));
                } else {
                    vListCell.setSubTitleColor(i3);
                }
                Typeface typeface = this.f187013h;
                if (typeface == null) {
                    vListCell.m224322c(lyh0.m156283c(3), 1);
                } else {
                    vListCell.setTitleTypeface(typeface);
                }
                Typeface typeface2 = this.f187014i;
                if (typeface2 != null) {
                    vListCell.setSubTitleTypeface(typeface2);
                }
            }
            return new C21002c(viewInflate);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            List<VListCell.C22660a> list = this.f187007b;
            if (list == null) {
                return 0;
            }
            return list.size();
        }
    }

    /* JADX INFO: renamed from: l.w30$b */
    public static class C21001b {

        /* JADX INFO: renamed from: A */
        public View.OnClickListener f187019A;

        /* JADX INFO: renamed from: B */
        public View.OnClickListener f187020B;

        /* JADX INFO: renamed from: C */
        public InterfaceC21003d f187021C;

        /* JADX INFO: renamed from: D */
        public List<VListCell.C22660a> f187022D;

        /* JADX INFO: renamed from: E */
        public Context f187023E;

        /* JADX INFO: renamed from: a */
        public CharSequence f187024a;

        /* JADX INFO: renamed from: b */
        public CharSequence f187025b;

        /* JADX INFO: renamed from: c */
        public CharSequence f187026c;

        /* JADX INFO: renamed from: d */
        public CharSequence f187027d;

        /* JADX INFO: renamed from: i */
        public Typeface f187032i;

        /* JADX INFO: renamed from: j */
        public Typeface f187033j;

        /* JADX INFO: renamed from: k */
        public Typeface f187034k;

        /* JADX INFO: renamed from: l */
        public Typeface f187035l;

        /* JADX INFO: renamed from: p */
        public Typeface f187039p;

        /* JADX INFO: renamed from: q */
        public int f187040q;

        /* JADX INFO: renamed from: t */
        public int[] f187043t;

        /* JADX INFO: renamed from: u */
        public int[] f187044u;

        /* JADX INFO: renamed from: v */
        public int[] f187045v;

        /* JADX INFO: renamed from: w */
        public int[] f187046w;

        /* JADX INFO: renamed from: x */
        public DialogInterface.OnCancelListener f187047x;

        /* JADX INFO: renamed from: y */
        public DialogInterface.OnShowListener f187048y;

        /* JADX INFO: renamed from: z */
        public DialogInterface.OnDismissListener f187049z;

        /* JADX INFO: renamed from: e */
        public int f187028e = Api.BaseClientBuilder.API_PRIORITY_OTHER;

        /* JADX INFO: renamed from: f */
        public int f187029f = Api.BaseClientBuilder.API_PRIORITY_OTHER;

        /* JADX INFO: renamed from: g */
        public int f187030g = Api.BaseClientBuilder.API_PRIORITY_OTHER;

        /* JADX INFO: renamed from: h */
        public int f187031h = Api.BaseClientBuilder.API_PRIORITY_OTHER;

        /* JADX INFO: renamed from: m */
        public int f187036m = Api.BaseClientBuilder.API_PRIORITY_OTHER;

        /* JADX INFO: renamed from: n */
        public int f187037n = Api.BaseClientBuilder.API_PRIORITY_OTHER;

        /* JADX INFO: renamed from: o */
        public Typeface f187038o = Typeface.DEFAULT;

        /* JADX INFO: renamed from: r */
        public boolean f187041r = true;

        /* JADX INFO: renamed from: s */
        public boolean f187042s = true;

        public C21001b(Context context) {
            this.f187023E = context;
        }

        /* JADX INFO: renamed from: F */
        public w30 m204654F() {
            return new w30(this);
        }

        /* JADX INFO: renamed from: G */
        public C21001b m204655G(boolean z) {
            this.f187042s = z;
            return this;
        }

        /* JADX INFO: renamed from: H */
        public C21001b m204656H(@StringRes int i) {
            this.f187026c = this.f187023E.getString(i);
            return this;
        }

        /* JADX INFO: renamed from: I */
        public C21001b m204657I(CharSequence charSequence) {
            this.f187026c = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: J */
        public C21001b m204658J(int i) {
            this.f187030g = i;
            return this;
        }

        /* JADX INFO: renamed from: K */
        public C21001b m204659K(@StringRes int i) {
            this.f187025b = this.f187023E.getString(i);
            return this;
        }

        /* JADX INFO: renamed from: L */
        public C21001b m204660L(CharSequence charSequence) {
            this.f187025b = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: M */
        public C21001b m204661M(@StringRes int i) {
            this.f187024a = this.f187023E.getString(i);
            return this;
        }

        /* JADX INFO: renamed from: N */
        public C21001b m204662N(CharSequence charSequence) {
            this.f187024a = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: O */
        public C21001b m204663O(int i) {
            this.f187040q = i;
            return this;
        }

        /* JADX INFO: renamed from: P */
        public C21001b m204664P(Typeface typeface) {
            this.f187038o = typeface;
            return this;
        }

        /* JADX INFO: renamed from: Q */
        public C21001b m204665Q(List<CharSequence> list) {
            ArrayList arrayList = new ArrayList();
            Iterator<CharSequence> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new VListCell.C22660a(it.next()));
            }
            this.f187022D = arrayList;
            return this;
        }

        /* JADX INFO: renamed from: R */
        public C21001b m204666R(int[] iArr, int[] iArr2) {
            if (iArr2 == null || iArr == null || iArr2.length != iArr.length) {
                azk0.m101074a("header title Color And Pos must be matched!");
                return null;
            }
            this.f187043t = iArr2;
            this.f187044u = iArr;
            return this;
        }

        /* JADX INFO: renamed from: S */
        public C21001b m204667S(DialogInterface.OnCancelListener onCancelListener) {
            this.f187047x = onCancelListener;
            return this;
        }

        /* JADX INFO: renamed from: T */
        public C21001b m204668T(DialogInterface.OnDismissListener onDismissListener) {
            this.f187049z = onDismissListener;
            return this;
        }

        /* JADX INFO: renamed from: U */
        public C21001b m204669U(View.OnClickListener onClickListener) {
            this.f187020B = onClickListener;
            return this;
        }

        /* JADX INFO: renamed from: V */
        public C21001b m204670V(InterfaceC21003d interfaceC21003d) {
            this.f187021C = interfaceC21003d;
            return this;
        }

        /* JADX INFO: renamed from: W */
        public C21001b m204671W(DialogInterface.OnShowListener onShowListener) {
            this.f187048y = onShowListener;
            return this;
        }
    }

    /* JADX INFO: renamed from: l.w30$c */
    public static class C21002c extends RecyclerView.AbstractC0569e0 {

        /* JADX INFO: renamed from: a */
        public final VListCell f187050a;

        public C21002c(@NonNull View view) {
            super(view);
            this.f187050a = (VListCell) view;
        }

        /* JADX INFO: renamed from: b */
        public void m204673b(VListCell.C22660a c22660a) {
            this.f187050a.setTitle(c22660a.f210081a);
            this.f187050a.setSubTitle(c22660a.f210082b);
            this.f187050a.setDescribe(c22660a.f210083c);
            this.f187050a.setLeftLargeImage(c22660a.f210084d);
            this.f187050a.setLeftSmallImage(c22660a.f210085e);
            this.f187050a.setRightLayoutRes(c22660a.f210086f);
        }
    }

    /* JADX INFO: renamed from: l.w30$d */
    public interface InterfaceC21003d {
        /* JADX INFO: renamed from: a */
        void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i);
    }

    public w30(C21001b c21001b) {
        this.f186980a = c21001b.f187024a;
        this.f186981b = c21001b.f187025b;
        this.f186982c = c21001b.f187026c;
        this.f186983d = c21001b.f187027d;
        this.f186984e = c21001b.f187022D;
        this.f186985f = c21001b.f187023E;
        this.f186986g = c21001b.f187041r;
        this.f186987h = c21001b.f187042s;
        this.f186988i = c21001b.f187047x;
        this.f186989j = c21001b.f187048y;
        this.f186990k = c21001b.f187049z;
        this.f186991l = c21001b.f187019A;
        this.f186992m = c21001b.f187020B;
        this.f187004y = c21001b.f187021C;
        this.f187005z = c21001b.f187028e;
        this.f186963A = c21001b.f187029f;
        this.f186964B = c21001b.f187030g;
        this.f186965C = c21001b.f187031h;
        this.f186966D = c21001b.f187040q;
        this.f186967E = c21001b.f187032i;
        this.f186968F = c21001b.f187033j;
        this.f186969G = c21001b.f187034k;
        this.f186970H = c21001b.f187035l;
        this.f186973K = c21001b.f187038o;
        this.f186974L = c21001b.f187039p;
        this.f186975M = c21001b.f187043t;
        this.f186977O = c21001b.f187045v;
        this.f186976N = c21001b.f187044u;
        this.f186978P = c21001b.f187046w;
        this.f186971I = c21001b.f187036m;
        this.f186972J = c21001b.f187037n;
    }

    /* JADX INFO: renamed from: b */
    public void m204614b() {
        pej0 pej0Var = this.f186993n;
        if (pej0Var != null && pej0Var.isShowing()) {
            this.f186993n.dismiss();
        }
    }

    /* JADX INFO: renamed from: c */
    public View m204615c() {
        return this.f186979Q;
    }

    /* JADX INFO: renamed from: d */
    public boolean m204616d() {
        pej0 pej0Var = this.f186993n;
        if (pej0Var == null) {
            return false;
        }
        return pej0Var.isShowing();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m204617e(DialogInterface dialogInterface) {
        this.f187000u.setPadding(0, (this.f187001v.getVisibility() == 0 ? this.f187001v.getHeight() : 0) + (this.f186998s.getVisibility() == 0 ? qa00.f156321h + qa00.f156317d : 0), 0, (this.f187002w.getVisibility() == 0 ? this.f187002w.getHeight() : 0) + (this.f186999t.getVisibility() == 0 ? (qa00.f156321h * 3) + qa00.f156317d : 0));
        C21000a c21000a = this.f187003x;
        if (c21000a != null && c21000a.getItemCount() > 6) {
            this.f187000u.scrollToPosition(0);
        }
        DialogInterface.OnShowListener onShowListener = this.f186989j;
        if (onShowListener != null) {
            onShowListener.onShow(dialogInterface);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m204618f() {
        boolean z;
        boolean z2;
        this.f186993n = new pej0(this.f186985f);
        ComponentCallbacks2 componentCallbacks2M105506D = bnl0.m105506D(this.f186985f);
        if (!(componentCallbacks2M105506D instanceof r1e)) {
            azk0.m101074a("ActionSheet`s Host do not implement DialogLifeTracer");
            return;
        }
        this.f186993n.m172034w((r1e) componentCallbacks2M105506D);
        this.f186993n.setContentView(gec0.f103792e);
        this.f186993n.setCancelable(this.f186986g);
        this.f186993n.setCanceledOnTouchOutside(this.f186987h);
        this.f186993n.setOnCancelListener(this.f186988i);
        this.f186993n.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.u30
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f177274a.m204617e(dialogInterface);
            }
        });
        this.f186993n.setOnDismissListener(this.f186990k);
        View viewMo303g = this.f186993n.getDelegate().mo303g(vcc0.f183363E);
        this.f186979Q = viewMo303g;
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(viewMo303g);
        bottomSheetBehaviorFrom.setState(3);
        boolean z3 = true;
        bottomSheetBehaviorFrom.setSkipCollapsed(true);
        this.f186979Q.setBackgroundColor(this.f186985f.getResources().getColor(R.color.transparent));
        this.f186993n.getWindow().setDimAmount(0.3f);
        VText vText = (VText) this.f186993n.findViewById(vcc0.f183389R);
        this.f186994o = vText;
        int i = this.f187005z;
        if (i != Integer.MAX_VALUE) {
            vText.setTextColor(i);
        }
        Typeface typeface = this.f186967E;
        VText vText2 = this.f186994o;
        if (typeface != null) {
            vText2.setTypeface(typeface);
        } else {
            vText2.setTypeface(vText2.getTypeface(), 1);
        }
        VText vText3 = (VText) this.f186993n.findViewById(vcc0.f183387Q);
        this.f186995p = vText3;
        int i2 = this.f186963A;
        if (i2 != Integer.MAX_VALUE) {
            vText3.setTextColor(i2);
        }
        Typeface typeface2 = this.f186968F;
        if (typeface2 != null) {
            this.f186995p.setTypeface(typeface2);
        }
        VText vText4 = (VText) this.f186993n.findViewById(vcc0.f183383O);
        this.f186996q = vText4;
        int i3 = this.f186964B;
        if (i3 != Integer.MAX_VALUE) {
            vText4.setTextColor(i3);
        }
        Typeface typeface3 = this.f186969G;
        VText vText5 = this.f186996q;
        if (typeface3 != null) {
            vText5.setTypeface(typeface3);
        } else {
            vText5.setTypeface(this.f186994o.getTypeface(), 1);
        }
        VText vText6 = (VText) this.f186993n.findViewById(vcc0.f183381N);
        this.f186997r = vText6;
        int i4 = this.f186965C;
        if (i4 != Integer.MAX_VALUE) {
            vText6.setTextColor(i4);
        }
        Typeface typeface4 = this.f186970H;
        if (typeface4 != null) {
            this.f186997r.setTypeface(typeface4);
        }
        this.f186998s = (VLine) this.f186993n.findViewById(vcc0.f183400W0);
        this.f186999t = (VLine) this.f186993n.findViewById(vcc0.f183422j);
        this.f187001v = (VLinear) this.f186993n.findViewById(vcc0.f183385P);
        this.f187002w = (VLinear) this.f186993n.findViewById(vcc0.f183379M);
        this.f187000u = (RecyclerView) this.f186993n.findViewById(vcc0.f183355A);
        View.OnClickListener onClickListener = this.f186991l;
        if (onClickListener != null) {
            this.f187001v.setOnClickListener(onClickListener);
        }
        View.OnClickListener onClickListener2 = this.f186992m;
        if (onClickListener2 != null) {
            this.f187002w.setOnClickListener(onClickListener2);
        }
        boolean zIsEmpty = TextUtils.isEmpty(this.f186980a);
        VText vText7 = this.f186994o;
        if (zIsEmpty) {
            vText7.setVisibility(8);
            z = false;
        } else {
            vText7.setText(this.f186980a);
            z = true;
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f186981b);
        VText vText8 = this.f186995p;
        if (zIsEmpty2) {
            vText8.setVisibility(8);
        } else {
            vText8.setText(this.f186981b);
            this.f186995p.setVisibility(0);
            if (TextUtils.isEmpty(this.f186980a)) {
                ((LinearLayout.LayoutParams) this.f186995p.getLayoutParams()).topMargin = 0;
            }
            z = true;
        }
        if (!z) {
            this.f187001v.setVisibility(8);
            this.f186998s.setVisibility(8);
        }
        boolean zIsEmpty3 = TextUtils.isEmpty(this.f186982c);
        VText vText9 = this.f186996q;
        if (zIsEmpty3) {
            vText9.setVisibility(8);
            z2 = false;
        } else {
            vText9.setText(this.f186982c);
            z2 = true;
        }
        boolean zIsEmpty4 = TextUtils.isEmpty(this.f186983d);
        VText vText10 = this.f186997r;
        if (zIsEmpty4) {
            vText10.setVisibility(8);
            z3 = z2;
        } else {
            vText10.setText(this.f186983d);
            this.f186997r.setVisibility(0);
        }
        if (!z3) {
            this.f187002w.setVisibility(8);
            this.f186999t.setVisibility(8);
        }
        if (!jyb.m147479J(this.f186984e)) {
            this.f187003x = new C21000a(this.f186985f, this.f186984e, this.f187004y, this.f186966D, this.f186971I, this.f186972J, this.f186973K, this.f186974L, this.f186975M, this.f186976N, this.f186977O, this.f186978P);
            this.f187000u.setLayoutManager(new LinearLayoutManager(this.f186985f));
            this.f187000u.setAdapter(this.f187003x);
        }
        this.f186993n.show();
    }
}
