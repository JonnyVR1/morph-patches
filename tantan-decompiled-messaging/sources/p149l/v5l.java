package p149l;

import android.R;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class v5l extends l5j0 {

    /* JADX INFO: renamed from: f */
    public VLinear f180064f;

    /* JADX INFO: renamed from: g */
    public VImage f180065g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f180066h;

    /* JADX INFO: renamed from: i */
    public VText_Bold f180067i;

    /* JADX INFO: renamed from: j */
    public VText f180068j;

    /* JADX INFO: renamed from: k */
    public VText_Bold f180069k;

    /* JADX INFO: renamed from: l */
    public final Act f180070l;

    /* JADX INFO: renamed from: m */
    public cwf0 f180071m;

    /* JADX INFO: renamed from: n */
    public final Runnable f180072n;

    /* JADX INFO: renamed from: o */
    public final String f180073o;

    /* JADX INFO: renamed from: p */
    public final String f180074p;

    /* JADX INFO: renamed from: q */
    public final String f180075q;

    /* JADX INFO: renamed from: r */
    public final int f180076r;

    /* JADX INFO: renamed from: s */
    public final String f180077s;

    /* JADX INFO: renamed from: t */
    public final String f180078t;

    /* JADX INFO: renamed from: u */
    public final String f180079u;

    /* JADX INFO: renamed from: v */
    public final String f180080v;

    /* JADX INFO: renamed from: l.v5l$a */
    public class C20581a extends ym2 {
        public C20581a() {
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: h */
        public void mo39108h(String str, ngm ngmVar, Animatable animatable) {
            super.mo39108h(str, ngmVar, animatable);
            xdl0.m208327D0(ngmVar.getWidth(), v5l.this.f180066h);
            xdl0.m208325C0(v5l.this.f180066h, ngmVar.getHeight());
        }
    }

    /* JADX INFO: renamed from: l.v5l$c */
    public static class C20583c {

        /* JADX INFO: renamed from: a */
        public final Act f180084a;

        /* JADX INFO: renamed from: b */
        public String f180085b;

        /* JADX INFO: renamed from: c */
        public String f180086c;

        /* JADX INFO: renamed from: d */
        public String f180087d;

        /* JADX INFO: renamed from: e */
        public int f180088e;

        /* JADX INFO: renamed from: f */
        public String f180089f;

        /* JADX INFO: renamed from: g */
        public String f180090g;

        /* JADX INFO: renamed from: h */
        public Runnable f180091h;

        /* JADX INFO: renamed from: i */
        public String f180092i;

        /* JADX INFO: renamed from: j */
        public String f180093j;

        public C20583c(Act act) {
            this.f180084a = act;
        }

        /* JADX INFO: renamed from: k */
        public v5l m197142k() {
            return new v5l(this);
        }

        /* JADX INFO: renamed from: l */
        public C20583c m197143l(Runnable runnable) {
            this.f180091h = runnable;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C20583c m197144m(String str) {
            this.f180090g = str;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C20583c m197145n(String str) {
            this.f180089f = str;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public C20583c m197146o(String str) {
            this.f180093j = str;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C20583c m197147p(String str) {
            this.f180087d = str;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C20583c m197148q(String str) {
            this.f180092i = str;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C20583c m197149r(String str) {
            this.f180086c = str;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C20583c m197150s(String str) {
            this.f180085b = str;
            return this;
        }
    }

    public v5l(C20583c c20583c) {
        super(c20583c.f180084a, v7c0.f180356c);
        this.f180070l = c20583c.f180084a;
        this.f180073o = c20583c.f180085b;
        this.f180074p = c20583c.f180086c;
        this.f180075q = c20583c.f180087d;
        this.f180076r = c20583c.f180088e;
        this.f180077s = c20583c.f180089f;
        this.f180078t = c20583c.f180090g;
        this.f180072n = c20583c.f180091h;
        this.f180079u = c20583c.f180092i;
        this.f180080v = c20583c.f180093j;
        setCancelable(false);
    }

    /* JADX INFO: renamed from: E */
    private void m197121E() {
        Window window = getWindow();
        this.f180064f.post(new Runnable() { // from class: l.s5l
            @Override // java.lang.Runnable
            public final void run() {
                this.f162558a.m197123G();
            }
        });
        getBehavior().setState(3);
        if (NullChecker.m81303a(window)) {
            window.setLayout(-1, -1);
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(i5c0.f111555p);
            frameLayout.setBackgroundResource(n3c0.f136963a0);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C20582b(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: renamed from: F */
    private void m197122F() {
        setContentView(m197131D(LayoutInflater.from(this.f180070l), null));
        m148650v(new qqf0());
        xdl0.m208329E0(this.f180065g, new View.OnClickListener() { // from class: l.t5l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f167834a.m197124H(view);
            }
        });
        xdl0.m208329E0(this.f180069k, new View.OnClickListener() { // from class: l.u5l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f174731a.m197125I(view);
            }
        });
        this.f180067i.setText(this.f180073o);
        this.f180068j.setText(this.f180074p);
        String str = this.f180075q;
        if (str != null) {
            qib0.f154691G.m102333M0(this.f180066h, str, new C20581a());
        } else {
            int i = this.f180076r;
            if (i != 0) {
                this.f180066h.setImageResource(i);
            }
        }
        this.f180069k.setText(this.f180077s);
        try {
            Drawable drawable = App.f15369e.getDrawable(x2c0.f189629P4);
            if (NullChecker.m81303a(drawable)) {
                drawable.setColorFilter(Color.parseColor(this.f180078t), PorterDuff.Mode.SRC_ATOP);
                this.f180069k.setBackground(drawable);
            }
        } catch (IllegalArgumentException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m197123G() {
        getBehavior().setPeekHeight(this.f180064f.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m197124H(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m197125I(View view) {
        if (NullChecker.m81303a(this.f180072n)) {
            this.f180072n.run();
        }
        if (!TextUtils.isEmpty(this.f180080v) && !TextUtils.isEmpty(this.f180079u)) {
            zvf0.m220396r(this.f180080v, this.f180079u);
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m197126J(DialogInterface dialogInterface) {
        i0e.m133796e(this.f180071m);
        zch0.m218024a().m218033j(false, "HomeCommonBottomSheetDialog_" + this.f180079u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m197127K(DialogInterface dialogInterface) {
        zch0.m218024a().m218033j(true, "HomeCommonBottomSheetDialog_" + this.f180079u);
    }

    /* JADX INFO: renamed from: D */
    public View m197131D(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return x5l.m207094b(this, layoutInflater, viewGroup);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, p149l.hu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m197122F();
        if (!TextUtils.isEmpty(this.f180079u)) {
            cwf0 cwf0VarM133794c = i0e.m133794c(this.f180079u, Dialog.class.getName());
            this.f180071m = cwf0VarM133794c;
            i0e.m133797f(cwf0VarM133794c);
        }
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.q5l
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f152784a.m197126J(dialogInterface);
            }
        });
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.r5l
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f157829a.m197127K(dialogInterface);
            }
        });
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        m197121E();
    }

    /* JADX INFO: renamed from: l.v5l$b */
    public class C20582b extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f180082a;

        public C20582b(BottomSheetBehavior bottomSheetBehavior) {
            this.f180082a = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f180082a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                v5l.this.dismiss();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}
