package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class l8l extends pej0 {

    /* JADX INFO: renamed from: f */
    public VLinear f130468f;

    /* JADX INFO: renamed from: g */
    public VImage f130469g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f130470h;

    /* JADX INFO: renamed from: i */
    public VText_Bold f130471i;

    /* JADX INFO: renamed from: j */
    public VText f130472j;

    /* JADX INFO: renamed from: k */
    public VText_Bold f130473k;

    /* JADX INFO: renamed from: l */
    public final Act f130474l;

    /* JADX INFO: renamed from: m */
    public l4g0 f130475m;

    /* JADX INFO: renamed from: n */
    public final Runnable f130476n;

    /* JADX INFO: renamed from: o */
    public final String f130477o;

    /* JADX INFO: renamed from: p */
    public final String f130478p;

    /* JADX INFO: renamed from: q */
    public final String f130479q;

    /* JADX INFO: renamed from: r */
    public final int f130480r;

    /* JADX INFO: renamed from: s */
    public final String f130481s;

    /* JADX INFO: renamed from: t */
    public final String f130482t;

    /* JADX INFO: renamed from: u */
    public final String f130483u;

    /* JADX INFO: renamed from: v */
    public final String f130484v;

    /* JADX INFO: renamed from: l.l8l$a */
    public class C18364a extends fn2 {
        public C18364a() {
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: h */
        public void mo40111h(String str, qim qimVar, Animatable animatable) {
            super.mo40111h(str, qimVar, animatable);
            bnl0.m105507D0(qimVar.getWidth(), l8l.this.f130470h);
            bnl0.m105505C0(l8l.this.f130470h, qimVar.getHeight());
        }
    }

    /* JADX INFO: renamed from: l.l8l$c */
    public static class C18366c {

        /* JADX INFO: renamed from: a */
        public final Act f130488a;

        /* JADX INFO: renamed from: b */
        public String f130489b;

        /* JADX INFO: renamed from: c */
        public String f130490c;

        /* JADX INFO: renamed from: d */
        public String f130491d;

        /* JADX INFO: renamed from: e */
        public int f130492e;

        /* JADX INFO: renamed from: f */
        public String f130493f;

        /* JADX INFO: renamed from: g */
        public String f130494g;

        /* JADX INFO: renamed from: h */
        public Runnable f130495h;

        /* JADX INFO: renamed from: i */
        public String f130496i;

        /* JADX INFO: renamed from: j */
        public String f130497j;

        public C18366c(Act act) {
            this.f130488a = act;
        }

        /* JADX INFO: renamed from: k */
        public l8l m153279k() {
            return new l8l(this);
        }

        /* JADX INFO: renamed from: l */
        public C18366c m153280l(Runnable runnable) {
            this.f130495h = runnable;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C18366c m153281m(String str) {
            this.f130494g = str;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C18366c m153282n(String str) {
            this.f130493f = str;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public C18366c m153283o(String str) {
            this.f130497j = str;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C18366c m153284p(String str) {
            this.f130491d = str;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C18366c m153285q(String str) {
            this.f130496i = str;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C18366c m153286r(String str) {
            this.f130490c = str;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C18366c m153287s(String str) {
            this.f130489b = str;
            return this;
        }
    }

    public l8l(C18366c c18366c) {
        super(c18366c.f130488a, agc0.f71117c);
        this.f130474l = c18366c.f130488a;
        this.f130477o = c18366c.f130489b;
        this.f130478p = c18366c.f130490c;
        this.f130479q = c18366c.f130491d;
        this.f130480r = c18366c.f130492e;
        this.f130481s = c18366c.f130493f;
        this.f130482t = c18366c.f130494g;
        this.f130476n = c18366c.f130495h;
        this.f130483u = c18366c.f130496i;
        this.f130484v = c18366c.f130497j;
        setCancelable(false);
    }

    /* JADX INFO: renamed from: E */
    private void m153258E() {
        Window window = getWindow();
        this.f130468f.post(new Runnable() { // from class: l.i8l
            @Override // java.lang.Runnable
            public final void run() {
                this.f113355a.m153260G();
            }
        });
        getBehavior().setState(3);
        if (NullChecker.m82486a(window)) {
            window.setLayout(-1, -1);
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content).findViewById(odc0.f146877p);
            frameLayout.setBackgroundResource(tbc0.f172878a0);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            bottomSheetBehaviorFrom.setBottomSheetCallback(new C18365b(bottomSheetBehaviorFrom));
        }
    }

    /* JADX INFO: renamed from: F */
    private void m153259F() {
        setContentView(m153268D(LayoutInflater.from(this.f130474l), null));
        m172033v(new zyf0());
        bnl0.m105509E0(this.f130469g, new View.OnClickListener() { // from class: l.j8l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f118787a.m153261H(view);
            }
        });
        bnl0.m105509E0(this.f130473k, new View.OnClickListener() { // from class: l.k8l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f124390a.m153262I(view);
            }
        });
        this.f130471i.setText(this.f130477o);
        this.f130472j.setText(this.f130478p);
        String str = this.f130479q;
        if (str != null) {
            uqb0.f180374G.m127117M0(this.f130470h, str, new C18364a());
        } else {
            int i = this.f130480r;
            if (i != 0) {
                this.f130470h.setImageResource(i);
            }
        }
        this.f130473k.setText(this.f130481s);
        try {
            Drawable drawable = App.f16088e.getDrawable(dbc0.f86493Q4);
            if (NullChecker.m82486a(drawable)) {
                drawable.setColorFilter(Color.parseColor(this.f130482t), PorterDuff.Mode.SRC_ATOP);
                this.f130473k.setBackground(drawable);
            }
        } catch (IllegalArgumentException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m153260G() {
        getBehavior().setPeekHeight(this.f130468f.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m153261H(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m153262I(View view) {
        if (NullChecker.m82486a(this.f130476n)) {
            this.f130476n.run();
        }
        if (!TextUtils.isEmpty(this.f130484v) && !TextUtils.isEmpty(this.f130483u)) {
            i4g0.m138520r(this.f130484v, this.f130483u);
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m153263J(DialogInterface dialogInterface) {
        w1e.m204401e(this.f130475m);
        hlh0.m135741a().m135750j(false, "HomeCommonBottomSheetDialog_" + this.f130483u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m153264K(DialogInterface dialogInterface) {
        hlh0.m135741a().m135750j(true, "HomeCommonBottomSheetDialog_" + this.f130483u);
    }

    /* JADX INFO: renamed from: D */
    public View m153268D(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return n8l.m161942b(this, layoutInflater, viewGroup);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, p153l.nu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m153259F();
        if (!TextUtils.isEmpty(this.f130483u)) {
            l4g0 l4g0VarM204399c = w1e.m204399c(this.f130483u, Dialog.class.getName());
            this.f130475m = l4g0VarM204399c;
            w1e.m204402f(l4g0VarM204399c);
        }
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.g8l
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f102693a.m153263J(dialogInterface);
            }
        });
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.h8l
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f108249a.m153264K(dialogInterface);
            }
        });
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        m153258E();
    }

    /* JADX INFO: renamed from: l.l8l$b */
    public class C18365b extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BottomSheetBehavior f130486a;

        public C18365b(BottomSheetBehavior bottomSheetBehavior) {
            this.f130486a = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1 || i == 4) {
                this.f130486a.setState(3);
            } else {
                if (i != 5) {
                    return;
                }
                l8l.this.dismiss();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}
