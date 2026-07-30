package p007l;

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
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.eqh0;
import l.t100;
import l.upk0;
import l.vwb;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import v.VLine;
import v.VLinear;
import v.VListCell;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class c40 {

    /* JADX INFO: renamed from: A */
    public int f2359A;

    /* JADX INFO: renamed from: B */
    public int f2360B;

    /* JADX INFO: renamed from: C */
    public int f2361C;

    /* JADX INFO: renamed from: D */
    public int f2362D;

    /* JADX INFO: renamed from: E */
    public Typeface f2363E;

    /* JADX INFO: renamed from: F */
    public Typeface f2364F;

    /* JADX INFO: renamed from: G */
    public Typeface f2365G;

    /* JADX INFO: renamed from: H */
    public Typeface f2366H;

    /* JADX INFO: renamed from: I */
    public int f2367I;

    /* JADX INFO: renamed from: J */
    public int f2368J;

    /* JADX INFO: renamed from: K */
    public Typeface f2369K;

    /* JADX INFO: renamed from: L */
    public Typeface f2370L;

    /* JADX INFO: renamed from: M */
    public int[] f2371M;

    /* JADX INFO: renamed from: N */
    public int[] f2372N;

    /* JADX INFO: renamed from: O */
    public int[] f2373O;

    /* JADX INFO: renamed from: P */
    public int[] f2374P;

    /* JADX INFO: renamed from: Q */
    public View f2375Q;

    /* JADX INFO: renamed from: a */
    public CharSequence f2376a;

    /* JADX INFO: renamed from: b */
    public CharSequence f2377b;

    /* JADX INFO: renamed from: c */
    public CharSequence f2378c;

    /* JADX INFO: renamed from: d */
    public CharSequence f2379d;

    /* JADX INFO: renamed from: e */
    public List<VListCell.a> f2380e;

    /* JADX INFO: renamed from: f */
    public Context f2381f;

    /* JADX INFO: renamed from: g */
    public boolean f2382g;

    /* JADX INFO: renamed from: h */
    public boolean f2383h;

    /* JADX INFO: renamed from: i */
    public DialogInterface.OnCancelListener f2384i;

    /* JADX INFO: renamed from: j */
    public DialogInterface.OnShowListener f2385j;

    /* JADX INFO: renamed from: k */
    public DialogInterface.OnDismissListener f2386k;

    /* JADX INFO: renamed from: l */
    public View.OnClickListener f2387l;

    /* JADX INFO: renamed from: m */
    public View.OnClickListener f2388m;

    /* JADX INFO: renamed from: n */
    public l5j0 f2389n;

    /* JADX INFO: renamed from: o */
    public VText f2390o;

    /* JADX INFO: renamed from: p */
    public VText f2391p;

    /* JADX INFO: renamed from: q */
    public VText f2392q;

    /* JADX INFO: renamed from: r */
    public VText f2393r;

    /* JADX INFO: renamed from: s */
    public VLine f2394s;

    /* JADX INFO: renamed from: t */
    public VLine f2395t;

    /* JADX INFO: renamed from: u */
    public RecyclerView f2396u;

    /* JADX INFO: renamed from: v */
    public VLinear f2397v;

    /* JADX INFO: renamed from: w */
    public VLinear f2398w;

    /* JADX INFO: renamed from: x */
    public C0511a f2399x;

    /* JADX INFO: renamed from: y */
    public InterfaceC0514d f2400y;

    /* JADX INFO: renamed from: z */
    public int f2401z;

    /* JADX INFO: renamed from: l.c40$a */
    public static class C0511a extends RecyclerView.Adapter<C0513c> {

        /* JADX INFO: renamed from: a */
        public Context f2402a;

        /* JADX INFO: renamed from: b */
        public List<VListCell.a> f2403b;

        /* JADX INFO: renamed from: c */
        public InterfaceC0514d f2404c;

        /* JADX INFO: renamed from: d */
        public int f2405d;

        /* JADX INFO: renamed from: e */
        public boolean f2406e;

        /* JADX INFO: renamed from: f */
        public int f2407f;

        /* JADX INFO: renamed from: g */
        public int f2408g;

        /* JADX INFO: renamed from: h */
        public Typeface f2409h;

        /* JADX INFO: renamed from: i */
        public Typeface f2410i;

        /* JADX INFO: renamed from: j */
        public SparseIntArray f2411j;

        /* JADX INFO: renamed from: k */
        public SparseIntArray f2412k;

        /* JADX INFO: renamed from: l */
        public int f2413l;

        /* JADX INFO: renamed from: m */
        public int f2414m;

        public C0511a(Context context, List<VListCell.a> list, InterfaceC0514d interfaceC0514d, int i, int i2, int i3, Typeface typeface, Typeface typeface2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
            this.f2402a = context;
            this.f2403b = list;
            this.f2404c = interfaceC0514d;
            boolean z = i != 0;
            this.f2406e = z;
            this.f2405d = z ? i : b6c0.f1920f;
            this.f2407f = i2;
            this.f2408g = i3;
            this.f2409h = typeface;
            this.f2410i = typeface2;
            if (iArr2 != null) {
                this.f2411j = new SparseIntArray(list.size());
                for (int i4 = 0; i4 < iArr2.length; i4++) {
                    this.f2411j.put(iArr2[i4], context.getResources().getColor(iArr[i4]));
                }
            }
            if (iArr4 != null) {
                this.f2412k = new SparseIntArray(list.size());
                for (int i5 = 0; i5 < iArr4.length; i5++) {
                    this.f2412k.put(iArr4[i5], context.getResources().getColor(iArr3[i5]));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: z */
        public /* synthetic */ void m8722z(int i, View view) {
            InterfaceC0514d interfaceC0514d = this.f2404c;
            if (interfaceC0514d != null) {
                interfaceC0514d.m8776a((VListCell) view, this.f2403b.get(i), i);
            }
        }

        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NonNull @NotNull C0513c c0513c, final int i) {
            c0513c.m8775b(this.f2403b.get(i));
            SparseIntArray sparseIntArray = this.f2411j;
            if (sparseIntArray == null || sparseIntArray.indexOfKey(i) < 0) {
                c0513c.f2446a.setTitleColor(this.f2413l);
            } else {
                c0513c.f2446a.setTitleColor(this.f2411j.get(i));
            }
            SparseIntArray sparseIntArray2 = this.f2412k;
            if (sparseIntArray2 == null || sparseIntArray2.indexOfKey(i) < 0) {
                c0513c.f2446a.setSubTitleColor(this.f2414m);
            } else {
                c0513c.f2446a.setSubTitleColor(this.f2412k.get(i));
            }
            c0513c.f2446a.setOnClickListener(new View.OnClickListener() { // from class: l.b40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f1906a.m8722z(i, view);
                }
            });
        }

        @NotNull
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public C0513c onCreateViewHolder(@NonNull @NotNull ViewGroup viewGroup, int i) {
            VListCell vListCellInflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.f2405d, (ViewGroup) null);
            VListCell vListCell = vListCellInflate;
            this.f2413l = vListCell.getTitleColor();
            this.f2414m = vListCell.getSubTitleColor();
            ViewGroup.LayoutParams layoutParams = vListCellInflate.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, -2);
            }
            vListCellInflate.setLayoutParams(layoutParams);
            if (!this.f2406e) {
                int i2 = this.f2407f;
                if (i2 == Integer.MAX_VALUE) {
                    vListCell.setTitleColor(this.f2402a.getResources().getColor(t0c0.f4219c));
                } else {
                    vListCell.setTitleColor(i2);
                }
                int i3 = this.f2408g;
                if (i3 == Integer.MAX_VALUE) {
                    vListCell.setSubTitleColor(this.f2402a.getResources().getColor(t0c0.f4219c));
                } else {
                    vListCell.setSubTitleColor(i3);
                }
                Typeface typeface = this.f2409h;
                if (typeface == null) {
                    vListCell.c(eqh0.c(3), 1);
                } else {
                    vListCell.setTitleTypeface(typeface);
                }
                Typeface typeface2 = this.f2410i;
                if (typeface2 != null) {
                    vListCell.setSubTitleTypeface(typeface2);
                }
            }
            return new C0513c(vListCellInflate);
        }

        public int getItemCount() {
            List<VListCell.a> list = this.f2403b;
            if (list == null) {
                return 0;
            }
            return list.size();
        }
    }

    /* JADX INFO: renamed from: l.c40$b */
    public static class C0512b {

        /* JADX INFO: renamed from: A */
        public View.OnClickListener f2415A;

        /* JADX INFO: renamed from: B */
        public View.OnClickListener f2416B;

        /* JADX INFO: renamed from: C */
        public InterfaceC0514d f2417C;

        /* JADX INFO: renamed from: D */
        public List<VListCell.a> f2418D;

        /* JADX INFO: renamed from: E */
        public Context f2419E;

        /* JADX INFO: renamed from: a */
        public CharSequence f2420a;

        /* JADX INFO: renamed from: b */
        public CharSequence f2421b;

        /* JADX INFO: renamed from: c */
        public CharSequence f2422c;

        /* JADX INFO: renamed from: d */
        public CharSequence f2423d;

        /* JADX INFO: renamed from: i */
        public Typeface f2428i;

        /* JADX INFO: renamed from: j */
        public Typeface f2429j;

        /* JADX INFO: renamed from: k */
        public Typeface f2430k;

        /* JADX INFO: renamed from: l */
        public Typeface f2431l;

        /* JADX INFO: renamed from: p */
        public Typeface f2435p;

        /* JADX INFO: renamed from: q */
        public int f2436q;

        /* JADX INFO: renamed from: t */
        public int[] f2439t;

        /* JADX INFO: renamed from: u */
        public int[] f2440u;

        /* JADX INFO: renamed from: v */
        public int[] f2441v;

        /* JADX INFO: renamed from: w */
        public int[] f2442w;

        /* JADX INFO: renamed from: x */
        public DialogInterface.OnCancelListener f2443x;

        /* JADX INFO: renamed from: y */
        public DialogInterface.OnShowListener f2444y;

        /* JADX INFO: renamed from: z */
        public DialogInterface.OnDismissListener f2445z;

        /* JADX INFO: renamed from: e */
        public int f2424e = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: f */
        public int f2425f = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: g */
        public int f2426g = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: h */
        public int f2427h = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: m */
        public int f2432m = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: n */
        public int f2433n = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: o */
        public Typeface f2434o = Typeface.DEFAULT;

        /* JADX INFO: renamed from: r */
        public boolean f2437r = true;

        /* JADX INFO: renamed from: s */
        public boolean f2438s = true;

        public C0512b(Context context) {
            this.f2419E = context;
        }

        /* JADX INFO: renamed from: F */
        public c40 m8756F() {
            return new c40(this);
        }

        /* JADX INFO: renamed from: G */
        public C0512b m8757G(boolean z) {
            this.f2438s = z;
            return this;
        }

        /* JADX INFO: renamed from: H */
        public C0512b m8758H(@StringRes int i) {
            this.f2422c = this.f2419E.getString(i);
            return this;
        }

        /* JADX INFO: renamed from: I */
        public C0512b m8759I(CharSequence charSequence) {
            this.f2422c = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: J */
        public C0512b m8760J(int i) {
            this.f2426g = i;
            return this;
        }

        /* JADX INFO: renamed from: K */
        public C0512b m8761K(@StringRes int i) {
            this.f2421b = this.f2419E.getString(i);
            return this;
        }

        /* JADX INFO: renamed from: L */
        public C0512b m8762L(CharSequence charSequence) {
            this.f2421b = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: M */
        public C0512b m8763M(@StringRes int i) {
            this.f2420a = this.f2419E.getString(i);
            return this;
        }

        /* JADX INFO: renamed from: N */
        public C0512b m8764N(CharSequence charSequence) {
            this.f2420a = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: O */
        public C0512b m8765O(int i) {
            this.f2436q = i;
            return this;
        }

        /* JADX INFO: renamed from: P */
        public C0512b m8766P(Typeface typeface) {
            this.f2434o = typeface;
            return this;
        }

        /* JADX INFO: renamed from: Q */
        public C0512b m8767Q(List<CharSequence> list) {
            ArrayList arrayList = new ArrayList();
            Iterator<CharSequence> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new VListCell.a(it.next()));
            }
            this.f2418D = arrayList;
            return this;
        }

        /* JADX INFO: renamed from: R */
        public C0512b m8768R(int[] iArr, int[] iArr2) {
            if (iArr2 == null || iArr == null || iArr2.length != iArr.length) {
                upk0.a("header title Color And Pos must be matched!");
                return null;
            }
            this.f2439t = iArr2;
            this.f2440u = iArr;
            return this;
        }

        /* JADX INFO: renamed from: S */
        public C0512b m8769S(DialogInterface.OnCancelListener onCancelListener) {
            this.f2443x = onCancelListener;
            return this;
        }

        /* JADX INFO: renamed from: T */
        public C0512b m8770T(DialogInterface.OnDismissListener onDismissListener) {
            this.f2445z = onDismissListener;
            return this;
        }

        /* JADX INFO: renamed from: U */
        public C0512b m8771U(View.OnClickListener onClickListener) {
            this.f2416B = onClickListener;
            return this;
        }

        /* JADX INFO: renamed from: V */
        public C0512b m8772V(InterfaceC0514d interfaceC0514d) {
            this.f2417C = interfaceC0514d;
            return this;
        }

        /* JADX INFO: renamed from: W */
        public C0512b m8773W(DialogInterface.OnShowListener onShowListener) {
            this.f2444y = onShowListener;
            return this;
        }
    }

    /* JADX INFO: renamed from: l.c40$c */
    public static class C0513c extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a */
        public final VListCell f2446a;

        public C0513c(@NonNull View view) {
            super(view);
            this.f2446a = (VListCell) view;
        }

        /* JADX INFO: renamed from: b */
        public void m8775b(VListCell.a aVar) {
            this.f2446a.setTitle(aVar.a);
            this.f2446a.setSubTitle(aVar.b);
            this.f2446a.setDescribe(aVar.c);
            this.f2446a.setLeftLargeImage(aVar.d);
            this.f2446a.setLeftSmallImage(aVar.e);
            this.f2446a.setRightLayoutRes(aVar.f);
        }
    }

    /* JADX INFO: renamed from: l.c40$d */
    public interface InterfaceC0514d {
        /* JADX INFO: renamed from: a */
        void m8776a(VListCell vListCell, VListCell.a aVar, int i);
    }

    public c40(C0512b c0512b) {
        this.f2376a = c0512b.f2420a;
        this.f2377b = c0512b.f2421b;
        this.f2378c = c0512b.f2422c;
        this.f2379d = c0512b.f2423d;
        this.f2380e = c0512b.f2418D;
        this.f2381f = c0512b.f2419E;
        this.f2382g = c0512b.f2437r;
        this.f2383h = c0512b.f2438s;
        this.f2384i = c0512b.f2443x;
        this.f2385j = c0512b.f2444y;
        this.f2386k = c0512b.f2445z;
        this.f2387l = c0512b.f2415A;
        this.f2388m = c0512b.f2416B;
        this.f2400y = c0512b.f2417C;
        this.f2401z = c0512b.f2424e;
        this.f2359A = c0512b.f2425f;
        this.f2360B = c0512b.f2426g;
        this.f2361C = c0512b.f2427h;
        this.f2362D = c0512b.f2436q;
        this.f2363E = c0512b.f2428i;
        this.f2364F = c0512b.f2429j;
        this.f2365G = c0512b.f2430k;
        this.f2366H = c0512b.f2431l;
        this.f2369K = c0512b.f2434o;
        this.f2370L = c0512b.f2435p;
        this.f2371M = c0512b.f2439t;
        this.f2373O = c0512b.f2441v;
        this.f2372N = c0512b.f2440u;
        this.f2374P = c0512b.f2442w;
        this.f2367I = c0512b.f2432m;
        this.f2368J = c0512b.f2433n;
    }

    /* JADX INFO: renamed from: b */
    public void m8716b() {
        BottomSheetDialog bottomSheetDialog = this.f2389n;
        if (bottomSheetDialog != null && bottomSheetDialog.isShowing()) {
            this.f2389n.dismiss();
        }
    }

    /* JADX INFO: renamed from: c */
    public View m8717c() {
        return this.f2375Q;
    }

    /* JADX INFO: renamed from: d */
    public boolean m8718d() {
        BottomSheetDialog bottomSheetDialog = this.f2389n;
        if (bottomSheetDialog == null) {
            return false;
        }
        return bottomSheetDialog.isShowing();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m8719e(DialogInterface dialogInterface) {
        this.f2396u.setPadding(0, (this.f2397v.getVisibility() == 0 ? this.f2397v.getHeight() : 0) + (this.f2394s.getVisibility() == 0 ? t100.h + t100.d : 0), 0, (this.f2398w.getVisibility() == 0 ? this.f2398w.getHeight() : 0) + (this.f2395t.getVisibility() == 0 ? (t100.h * 3) + t100.d : 0));
        C0511a c0511a = this.f2399x;
        if (c0511a != null && c0511a.getItemCount() > 6) {
            this.f2396u.scrollToPosition(0);
        }
        DialogInterface.OnShowListener onShowListener = this.f2385j;
        if (onShowListener != null) {
            onShowListener.onShow(dialogInterface);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m8720f() {
        boolean z;
        boolean z2;
        this.f2389n = new l5j0(this.f2381f);
        ComponentCallbacks2 componentCallbacks2D = xdl0.D(this.f2381f);
        if (!(componentCallbacks2D instanceof d0e)) {
            upk0.a("ActionSheet`s Host do not implement DialogLifeTracer");
            return;
        }
        this.f2389n.m9807w((d0e) componentCallbacks2D);
        this.f2389n.setContentView(b6c0.f1919e);
        this.f2389n.setCancelable(this.f2382g);
        this.f2389n.setCanceledOnTouchOutside(this.f2383h);
        this.f2389n.setOnCancelListener(this.f2384i);
        this.f2389n.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.a40
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f1834a.m8719e(dialogInterface);
            }
        });
        this.f2389n.setOnDismissListener(this.f2386k);
        View viewG = this.f2389n.getDelegate().g(p4c0.f3611E);
        this.f2375Q = viewG;
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(viewG);
        bottomSheetBehaviorFrom.setState(3);
        boolean z3 = true;
        bottomSheetBehaviorFrom.setSkipCollapsed(true);
        this.f2375Q.setBackgroundColor(this.f2381f.getResources().getColor(R.color.transparent));
        this.f2389n.getWindow().setDimAmount(0.3f);
        VText vTextFindViewById = this.f2389n.findViewById(p4c0.f3637R);
        this.f2390o = vTextFindViewById;
        int i = this.f2401z;
        if (i != Integer.MAX_VALUE) {
            vTextFindViewById.setTextColor(i);
        }
        Typeface typeface = this.f2363E;
        VText vText = this.f2390o;
        if (typeface != null) {
            vText.setTypeface(typeface);
        } else {
            vText.setTypeface(vText.getTypeface(), 1);
        }
        VText vTextFindViewById2 = this.f2389n.findViewById(p4c0.f3635Q);
        this.f2391p = vTextFindViewById2;
        int i2 = this.f2359A;
        if (i2 != Integer.MAX_VALUE) {
            vTextFindViewById2.setTextColor(i2);
        }
        Typeface typeface2 = this.f2364F;
        if (typeface2 != null) {
            this.f2391p.setTypeface(typeface2);
        }
        VText vTextFindViewById3 = this.f2389n.findViewById(p4c0.f3631O);
        this.f2392q = vTextFindViewById3;
        int i3 = this.f2360B;
        if (i3 != Integer.MAX_VALUE) {
            vTextFindViewById3.setTextColor(i3);
        }
        Typeface typeface3 = this.f2365G;
        VText vText2 = this.f2392q;
        if (typeface3 != null) {
            vText2.setTypeface(typeface3);
        } else {
            vText2.setTypeface(this.f2390o.getTypeface(), 1);
        }
        VText vTextFindViewById4 = this.f2389n.findViewById(p4c0.f3629N);
        this.f2393r = vTextFindViewById4;
        int i4 = this.f2361C;
        if (i4 != Integer.MAX_VALUE) {
            vTextFindViewById4.setTextColor(i4);
        }
        Typeface typeface4 = this.f2366H;
        if (typeface4 != null) {
            this.f2393r.setTypeface(typeface4);
        }
        this.f2394s = this.f2389n.findViewById(p4c0.f3648W0);
        this.f2395t = this.f2389n.findViewById(p4c0.f3670j);
        this.f2397v = this.f2389n.findViewById(p4c0.f3633P);
        this.f2398w = this.f2389n.findViewById(p4c0.f3627M);
        this.f2396u = this.f2389n.findViewById(p4c0.f3603A);
        View.OnClickListener onClickListener = this.f2387l;
        if (onClickListener != null) {
            this.f2397v.setOnClickListener(onClickListener);
        }
        View.OnClickListener onClickListener2 = this.f2388m;
        if (onClickListener2 != null) {
            this.f2398w.setOnClickListener(onClickListener2);
        }
        boolean zIsEmpty = TextUtils.isEmpty(this.f2376a);
        VText vText3 = this.f2390o;
        if (zIsEmpty) {
            vText3.setVisibility(8);
            z = false;
        } else {
            vText3.setText(this.f2376a);
            z = true;
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f2377b);
        VText vText4 = this.f2391p;
        if (zIsEmpty2) {
            vText4.setVisibility(8);
        } else {
            vText4.setText(this.f2377b);
            this.f2391p.setVisibility(0);
            if (TextUtils.isEmpty(this.f2376a)) {
                ((LinearLayout.LayoutParams) this.f2391p.getLayoutParams()).topMargin = 0;
            }
            z = true;
        }
        if (!z) {
            this.f2397v.setVisibility(8);
            this.f2394s.setVisibility(8);
        }
        boolean zIsEmpty3 = TextUtils.isEmpty(this.f2378c);
        VText vText5 = this.f2392q;
        if (zIsEmpty3) {
            vText5.setVisibility(8);
            z2 = false;
        } else {
            vText5.setText(this.f2378c);
            z2 = true;
        }
        boolean zIsEmpty4 = TextUtils.isEmpty(this.f2379d);
        VText vText6 = this.f2393r;
        if (zIsEmpty4) {
            vText6.setVisibility(8);
            z3 = z2;
        } else {
            vText6.setText(this.f2379d);
            this.f2393r.setVisibility(0);
        }
        if (!z3) {
            this.f2398w.setVisibility(8);
            this.f2395t.setVisibility(8);
        }
        if (!vwb.J(this.f2380e)) {
            this.f2399x = new C0511a(this.f2381f, this.f2380e, this.f2400y, this.f2362D, this.f2367I, this.f2368J, this.f2369K, this.f2370L, this.f2371M, this.f2372N, this.f2373O, this.f2374P);
            this.f2396u.setLayoutManager(new LinearLayoutManager(this.f2381f));
            this.f2396u.setAdapter(this.f2399x);
        }
        this.f2389n.show();
    }
}
