package p003l;

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
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.ui.VText_Bold;
import com.tantanapp.common.utils.NullChecker;
import l.cwf0;
import l.i0e;
import l.i5c0;
import l.l5j0;
import l.n3c0;
import l.ngm;
import l.qib0;
import l.qqf0;
import l.v7c0;
import l.x2c0;
import l.xdl0;
import l.ym2;
import l.zch0;
import l.zvf0;
import v.VDraweeView;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class v5l extends l5j0 {

    /* JADX INFO: renamed from: f */
    public VLinear f7865f;

    /* JADX INFO: renamed from: g */
    public VImage f7866g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f7867h;

    /* JADX INFO: renamed from: i */
    public VText_Bold f7868i;

    /* JADX INFO: renamed from: j */
    public VText f7869j;

    /* JADX INFO: renamed from: k */
    public VText_Bold f7870k;

    /* JADX INFO: renamed from: l */
    public final Act f7871l;

    /* JADX INFO: renamed from: m */
    public cwf0 f7872m;

    /* JADX INFO: renamed from: n */
    public final Runnable f7873n;

    /* JADX INFO: renamed from: o */
    public final String f7874o;

    /* JADX INFO: renamed from: p */
    public final String f7875p;

    /* JADX INFO: renamed from: q */
    public final String f7876q;

    /* JADX INFO: renamed from: r */
    public final int f7877r;

    /* JADX INFO: renamed from: s */
    public final String f7878s;

    /* JADX INFO: renamed from: t */
    public final String f7879t;

    /* JADX INFO: renamed from: u */
    public final String f7880u;

    /* JADX INFO: renamed from: v */
    public final String f7881v;

    /* JADX INFO: renamed from: l.v5l$a */
    public class C3445a extends ym2 {
        public C3445a() {
        }

        /* JADX INFO: renamed from: h */
        public void m9822h(String str, ngm ngmVar, Animatable animatable) {
            super.h(str, ngmVar, animatable);
            xdl0.D0(ngmVar.getWidth(), new View[]{v5l.this.f7867h});
            xdl0.C0(v5l.this.f7867h, ngmVar.getHeight());
        }
    }

    /* JADX INFO: renamed from: l.v5l$c */
    public static class C3447c {

        /* JADX INFO: renamed from: a */
        public final Act f7885a;

        /* JADX INFO: renamed from: b */
        public String f7886b;

        /* JADX INFO: renamed from: c */
        public String f7887c;

        /* JADX INFO: renamed from: d */
        public String f7888d;

        /* JADX INFO: renamed from: e */
        public int f7889e;

        /* JADX INFO: renamed from: f */
        public String f7890f;

        /* JADX INFO: renamed from: g */
        public String f7891g;

        /* JADX INFO: renamed from: h */
        public Runnable f7892h;

        /* JADX INFO: renamed from: i */
        public String f7893i;

        /* JADX INFO: renamed from: j */
        public String f7894j;

        public C3447c(Act act) {
            this.f7885a = act;
        }

        /* JADX INFO: renamed from: k */
        public v5l m9833k() {
            return new v5l(this);
        }

        /* JADX INFO: renamed from: l */
        public C3447c m9834l(Runnable runnable) {
            this.f7892h = runnable;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C3447c m9835m(String str) {
            this.f7891g = str;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C3447c m9836n(String str) {
            this.f7890f = str;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public C3447c m9837o(String str) {
            this.f7894j = str;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C3447c m9838p(String str) {
            this.f7888d = str;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C3447c m9839q(String str) {
            this.f7893i = str;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C3447c m9840r(String str) {
            this.f7887c = str;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C3447c m9841s(String str) {
            this.f7886b = str;
            return this;
        }
    }

    public v5l(C3447c c3447c) {
        super(c3447c.f7885a, v7c0.c);
        this.f7871l = c3447c.f7885a;
        this.f7874o = c3447c.f7886b;
        this.f7875p = c3447c.f7887c;
        this.f7876q = c3447c.f7888d;
        this.f7877r = c3447c.f7889e;
        this.f7878s = c3447c.f7890f;
        this.f7879t = c3447c.f7891g;
        this.f7873n = c3447c.f7892h;
        this.f7880u = c3447c.f7893i;
        this.f7881v = c3447c.f7894j;
        setCancelable(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    private void m9811E() {
        Window window = getWindow();
        this.f7865f.post(new Runnable() { // from class: l.s5l
            @Override // java.lang.Runnable
            public final void run() {
                this.f7283a.m9813G();
            }
        });
        getBehavior().setState(3);
        if (NullChecker.a(window)) {
            window.setLayout(-1, -1);
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(i5c0.p);
            frameLayout.setBackgroundResource(n3c0.a0);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C3446b(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: renamed from: F */
    private void m9812F() {
        setContentView(m9821D(LayoutInflater.from(this.f7871l), null));
        v(new qqf0());
        xdl0.E0(this.f7866g, new View.OnClickListener() { // from class: l.t5l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7511a.m9814H(view);
            }
        });
        xdl0.E0(this.f7870k, new View.OnClickListener() { // from class: l.u5l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7669a.m9815I(view);
            }
        });
        this.f7868i.setText(this.f7874o);
        this.f7869j.setText(this.f7875p);
        String str = this.f7876q;
        if (str != null) {
            qib0.G.M0(this.f7867h, str, new C3445a());
        } else {
            int i = this.f7877r;
            if (i != 0) {
                this.f7867h.setImageResource(i);
            }
        }
        this.f7870k.setText(this.f7878s);
        try {
            Drawable drawable = App.e.getDrawable(x2c0.P4);
            if (NullChecker.a(drawable)) {
                drawable.setColorFilter(Color.parseColor(this.f7879t), PorterDuff.Mode.SRC_ATOP);
                this.f7870k.setBackground(drawable);
            }
        } catch (IllegalArgumentException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m9813G() {
        getBehavior().setPeekHeight(this.f7865f.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m9814H(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m9815I(View view) {
        if (NullChecker.a(this.f7873n)) {
            this.f7873n.run();
        }
        if (!TextUtils.isEmpty(this.f7881v) && !TextUtils.isEmpty(this.f7880u)) {
            zvf0.r(this.f7881v, this.f7880u);
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m9816J(DialogInterface dialogInterface) {
        i0e.e(this.f7872m);
        zch0.a().j(false, "HomeCommonBottomSheetDialog_" + this.f7880u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m9817K(DialogInterface dialogInterface) {
        zch0.a().j(true, "HomeCommonBottomSheetDialog_" + this.f7880u);
    }

    /* JADX INFO: renamed from: D */
    public View m9821D(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return x5l.m10646b(this, layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        super/*com.google.android.material.bottomsheet.BottomSheetDialog*/.onCreate(bundle);
        m9812F();
        if (!TextUtils.isEmpty(this.f7880u)) {
            cwf0 cwf0VarC = i0e.c(this.f7880u, Dialog.class.getName());
            this.f7872m = cwf0VarC;
            i0e.f(cwf0VarC);
        }
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.q5l
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f6973a.m9816J(dialogInterface);
            }
        });
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.r5l
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f7129a.m9817K(dialogInterface);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void show() {
        super/*android.app.Dialog*/.show();
        m9811E();
    }

    /* JADX INFO: renamed from: l.v5l$b */
    public class C3446b extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f7883a;

        public C3446b(BottomSheetBehavior bottomSheetBehavior) {
            this.f7883a = bottomSheetBehavior;
        }

        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f7883a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                v5l.this.dismiss();
            }
        }

        public void onSlide(@NonNull View view, float f) {
        }
    }
}
