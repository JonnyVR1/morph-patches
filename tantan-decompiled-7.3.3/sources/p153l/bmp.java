package p153l;

import android.R;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.List;
import p151v.AutoVDraweeView;
import p151v.VFrame;

/* JADX INFO: loaded from: classes4.dex */
public class bmp {

    /* JADX INFO: renamed from: a */
    public VFrame f77358a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f77359b;

    /* JADX INFO: renamed from: c */
    public AutoVDraweeView f77360c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f77361d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f77362e;

    /* JADX INFO: renamed from: f */
    public pej0 f77363f;

    /* JADX INFO: renamed from: g */
    public final Act f77364g;

    /* JADX INFO: renamed from: h */
    public String f77365h;

    /* JADX INFO: renamed from: i */
    public boolean f77366i;

    /* JADX INFO: renamed from: j */
    public List<C8928d> f77367j;

    /* JADX INFO: renamed from: k */
    public z20<C8928d, Boolean> f77368k;

    /* JADX INFO: renamed from: l */
    public l4g0 f77369l;

    /* JADX INFO: renamed from: m */
    public x20 f77370m;

    /* JADX INFO: renamed from: n */
    public x20 f77371n;

    /* JADX INFO: renamed from: p */
    public ylp f77373p;

    /* JADX INFO: renamed from: q */
    public fmp f77374q;

    /* JADX INFO: renamed from: r */
    public boolean f77375r;

    /* JADX INFO: renamed from: o */
    public boolean f77372o = true;

    /* JADX INFO: renamed from: s */
    public PurchaseType f77376s = PurchaseType.TYPE_ULTRA_PREMIUM;

    /* JADX INFO: renamed from: t */
    public final DialogInterface.OnDismissListener f77377t = new DialogInterfaceOnDismissListenerC16051a();

    /* JADX INFO: renamed from: u */
    public final DialogInterface.OnCancelListener f77378u = new DialogInterfaceOnCancelListenerC16052b();

    /* JADX INFO: renamed from: v */
    public final y20<Integer> f77379v = new y20() { // from class: l.amp
        @Override // p153l.y20
        public final void call(Object obj) {
            this.f72242a.m105229n((Integer) obj);
        }
    };

    /* JADX INFO: renamed from: l.bmp$a */
    public class DialogInterfaceOnDismissListenerC16051a implements DialogInterface.OnDismissListener {
        public DialogInterfaceOnDismissListenerC16051a() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            bmp bmpVar = bmp.this;
            if (bmpVar.f77372o && NullChecker.m82486a(bmpVar.f77371n)) {
                bmp.this.f77371n.call();
            }
            CoreModule.m30933P().m143405a().mo34311E9();
            w1e.m204401e(bmp.this.f77369l);
            bmp.this.m105223C();
        }
    }

    /* JADX INFO: renamed from: l.bmp$b */
    public class DialogInterfaceOnCancelListenerC16052b implements DialogInterface.OnCancelListener {
        public DialogInterfaceOnCancelListenerC16052b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (NullChecker.m82486a(bmp.this.f77370m)) {
                bmp.this.f77370m.call();
            }
        }
    }

    /* JADX INFO: renamed from: l.bmp$c */
    public class ViewTreeObserverOnGlobalLayoutListenerC16053c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f77382a;

        public ViewTreeObserverOnGlobalLayoutListenerC16053c(BottomSheetBehavior bottomSheetBehavior) {
            this.f77382a = bottomSheetBehavior;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f77382a.setPeekHeight(bmp.this.f77358a.getHeight());
            bmp.this.f77358a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: l.bmp$d */
    public static /* synthetic */ class C16054d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f77384a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f77384a = iArr;
            try {
                iArr[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f77384a[PurchaseType.TYPE_ULTRA_PREMIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: l.bmp$e */
    public static class DialogInterfaceOnCancelListenerC16055e implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final WeakReference<bmp> f77385a;

        public DialogInterfaceOnCancelListenerC16055e(bmp bmpVar) {
            this.f77385a = new WeakReference<>(bmpVar);
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            bmp bmpVar = this.f77385a.get();
            if (bmpVar == null || bmpVar.m105227l() == null) {
                return;
            }
            bmpVar.f77378u.onCancel(dialogInterface);
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            bmp bmpVar = this.f77385a.get();
            if (bmpVar == null || bmpVar.m105227l() == null) {
                return;
            }
            bmpVar.f77377t.onDismiss(dialogInterface);
        }
    }

    /* JADX INFO: renamed from: l.bmp$f */
    public static class C16056f {

        /* JADX INFO: renamed from: a */
        public final Act f77386a;

        /* JADX INFO: renamed from: b */
        public PurchaseType f77387b;

        /* JADX INFO: renamed from: c */
        public String f77388c;

        /* JADX INFO: renamed from: d */
        public boolean f77389d;

        /* JADX INFO: renamed from: e */
        public z20<C8928d, Boolean> f77390e;

        /* JADX INFO: renamed from: f */
        public List<C8928d> f77391f;

        /* JADX INFO: renamed from: g */
        public x20 f77392g;

        /* JADX INFO: renamed from: h */
        public x20 f77393h;

        public C16056f(Act act) {
            this.f77386a = act;
        }

        /* JADX INFO: renamed from: a */
        public bmp m105242a() {
            bmp bmpVar = new bmp(this.f77386a);
            bmpVar.m105235t(this.f77388c);
            bmpVar.m105237v(this.f77392g);
            bmpVar.m105241z(this.f77387b);
            if (!wib0.m206573q(this.f77387b) || gta.m132210e().m132214d().mo34913qq()) {
                bmpVar.m105236u(this.f77389d);
            } else {
                bmpVar.m105236u(false);
            }
            bmpVar.m105239x(this.f77391f);
            bmpVar.m105234s(this.f77390e);
            bmpVar.m105238w(this.f77393h);
            return bmpVar;
        }

        /* JADX INFO: renamed from: b */
        public C16056f m105243b(z20<C8928d, Boolean> z20Var) {
            this.f77390e = z20Var;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C16056f m105244c(String str) {
            this.f77388c = str;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C16056f m105245d(boolean z) {
            this.f77389d = z;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C16056f m105246e(List<C8928d> list) {
            this.f77391f = list;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C16056f m105247f(PurchaseType purchaseType) {
            this.f77387b = purchaseType;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public bmp m105248g() {
            bmp bmpVarM105242a = m105242a();
            bmpVarM105242a.m105221A();
            return bmpVarM105242a;
        }
    }

    public bmp(Act act) {
        this.f77364g = act;
    }

    /* JADX INFO: renamed from: A */
    public final void m105221A() {
        if (jyb.m147479J(this.f77367j)) {
            return;
        }
        this.f77363f = new pej0(this.f77364g, dgc0.f88282g);
        View viewInflate = LayoutInflater.from(this.f77364g).inflate(rec0.f162540d3, (ViewGroup) null);
        m105224i(viewInflate);
        this.f77363f.setContentView(viewInflate);
        DialogInterfaceOnCancelListenerC16055e dialogInterfaceOnCancelListenerC16055e = new DialogInterfaceOnCancelListenerC16055e(this);
        this.f77363f.setOnDismissListener(dialogInterfaceOnCancelListenerC16055e);
        this.f77363f.setOnCancelListener(dialogInterfaceOnCancelListenerC16055e);
        this.f77375r = m105228m();
        this.f77369l = w1e.m204399c("p_select_upgrade_duration_pop", getClass().getName());
        m105230o();
        this.f77363f.show();
        m105232q();
    }

    /* JADX INFO: renamed from: B */
    public final void m105222B(List<C8928d> list) {
        w1e.m204402f(this.f77369l);
    }

    /* JADX INFO: renamed from: C */
    public void m105223C() {
        if (NullChecker.m82486a(this.f77374q)) {
            this.f77374q.m126320c();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m105224i(View view) {
        cmp.m111298a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public void m105225j() {
        pej0 pej0Var = this.f77363f;
        if (pej0Var == null || !pej0Var.isShowing()) {
            return;
        }
        this.f77363f.dismiss();
    }

    /* JADX INFO: renamed from: k */
    public final void m105226k() {
        Window window = this.f77363f.getWindow();
        if (NullChecker.m82486a(window)) {
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from((FrameLayout) window.findViewById(R.id.content).findViewById(fdc0.f98450y));
            bottomSheetBehaviorFrom.setHideable(false);
            bottomSheetBehaviorFrom.setState(3);
            this.f77358a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC16053c(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: renamed from: l */
    public pej0 m105227l() {
        return this.f77363f;
    }

    /* JADX INFO: renamed from: m */
    public boolean m105228m() {
        return bnl0.m105588w0() <= 1280;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m105229n(Integer num) {
        if (NullChecker.m82486a(this.f77363f)) {
            if (num.intValue() == -1) {
                this.f77363f.hide();
                return;
            }
            if (num.intValue() == 0 || num.intValue() == 2) {
                if (num.intValue() == 2) {
                    m105240y(false);
                }
                this.f77363f.dismiss();
            } else if (num.intValue() == 1) {
                this.f77363f.show();
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m105230o() {
        String str;
        String str2;
        bnl0.m105524M(this.f77359b, true);
        bnl0.m105524M(this.f77360c, true);
        int i = C16054d.f77384a[this.f77376s.ordinal()];
        String str3 = "";
        if (i != 1) {
            if (i != 2) {
                str = "";
            } else if (this.f77366i) {
                str2 = "https://auto.tancdn.com/v1/images/eyJpZCI6IjM1NkU0NUNEMDU2MzRGODdBQzgxQUNFMDQ5MjRFNjM5IiwidyI6NzUwLCJoIjoxMjY0LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MCwicHQiOjIwMjUwODE4MTd9.png";
                str3 = str2;
                str = "";
            } else {
                this.f77359b.setBackgroundResource(jbc0.f119173C2);
                str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkI5RTc1OUUwMDhDNTQ1QTE5RjM5MDJDQjQyODc4NDI5IiwidyI6NzUwLCJoIjo4MDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMjM3MDE3NzkwLCJwdCI6MjAyNTA4MTgxN30.png";
            }
        } else if (this.f77366i) {
            str2 = "https://auto.tancdn.com/v1/images/eyJpZCI6IjNCQTY4MzM3OUY3QzQxNTA5ODg2MTIwNzQ2MDhEMkUwIiwidyI6NzUwLCJoIjoxMjY0LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NDI5NDk2NzM2MCwicHQiOjIwMjUwODE4MTd9.png";
            str3 = str2;
            str = "";
        } else {
            this.f77359b.setBackgroundResource(jbc0.f119173C2);
            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkQ2MUE2MTkzNzIwRDQ5RERBMEM3MEMwQ0FEMDRCMTIyIiwidyI6NzUwLCJoIjo4MDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3ODMsInB0IjoyMDI1MDgxODE3fQ.png";
        }
        this.f77359b.setImageUrl(str3);
        this.f77360c.setImageUrl(str);
        m105231p();
        m105233r();
    }

    /* JADX INFO: renamed from: p */
    public final void m105231p() {
        ylp ylpVar = new ylp(this.f77364g);
        this.f77373p = ylpVar;
        View viewM216615c = ylpVar.m216615c(this.f77364g, this.f77361d);
        if (NullChecker.m82486a(viewM216615c)) {
            this.f77373p.m216618f(this.f77379v);
            this.f77373p.m216616d(this.f77364g, this.f77376s, this.f77366i);
            this.f77361d.addView(viewM216615c, new LinearLayout.LayoutParams(-1, -2));
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m105232q() {
        if (jyb.m147479J(this.f77367j)) {
            return;
        }
        m105222B(this.f77367j);
        if (NullChecker.m82487b(this.f77367j)) {
            this.f77374q.m126321d(this.f77367j, this.f77368k, this.f77379v);
        }
        m105226k();
    }

    /* JADX INFO: renamed from: r */
    public final void m105233r() {
        fmp fmpVar = new fmp(this.f77364g, this.f77376s, this.f77366i);
        this.f77374q = fmpVar;
        View viewM126319b = fmpVar.m126319b(this.f77362e, this.f77375r);
        if (NullChecker.m82486a(viewM126319b)) {
            this.f77362e.addView(viewM126319b, new LinearLayout.LayoutParams(-1, -2));
        }
    }

    /* JADX INFO: renamed from: s */
    public void m105234s(z20<C8928d, Boolean> z20Var) {
        this.f77368k = z20Var;
    }

    /* JADX INFO: renamed from: t */
    public final void m105235t(String str) {
        this.f77365h = str;
    }

    /* JADX INFO: renamed from: u */
    public void m105236u(boolean z) {
        this.f77366i = z;
    }

    /* JADX INFO: renamed from: v */
    public void m105237v(x20 x20Var) {
        this.f77370m = x20Var;
    }

    /* JADX INFO: renamed from: w */
    public void m105238w(x20 x20Var) {
        this.f77371n = x20Var;
    }

    /* JADX INFO: renamed from: x */
    public void m105239x(List<C8928d> list) {
        this.f77367j = list;
    }

    /* JADX INFO: renamed from: y */
    public void m105240y(boolean z) {
        this.f77372o = z;
    }

    /* JADX INFO: renamed from: z */
    public void m105241z(PurchaseType purchaseType) {
        this.f77376s = purchaseType;
    }
}
