package p007l;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.cwf0;
import l.i0e;
import l.j760;
import l.p4c0;
import l.qib0;
import l.t100;
import l.vwb;
import l.xdl0;
import v.VButton;
import v.VDraweeView;
import v.VImage;
import v.VRelative;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class j9h extends BottomSheetDialog {

    /* JADX INFO: renamed from: a */
    public VImage f9268a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f9269b;

    /* JADX INFO: renamed from: c */
    public TextView f9270c;

    /* JADX INFO: renamed from: d */
    public TextView f9271d;

    /* JADX INFO: renamed from: e */
    public VButton f9272e;

    /* JADX INFO: renamed from: f */
    public VRelative f9273f;

    /* JADX INFO: renamed from: g */
    public TextView f9274g;

    /* JADX INFO: renamed from: h */
    public RecyclerView f9275h;

    /* JADX INFO: renamed from: i */
    public Runnable f9276i;

    /* JADX INFO: renamed from: j */
    public Act f9277j;

    /* JADX INFO: renamed from: k */
    public Runnable f9278k;

    /* JADX INFO: renamed from: l */
    public boolean f9279l;

    /* JADX INFO: renamed from: m */
    public y4h f9280m;

    /* JADX INFO: renamed from: n */
    public BottomSheetBehavior f9281n;

    /* JADX INFO: renamed from: o */
    public cwf0 f9282o;

    /* JADX INFO: renamed from: p */
    public cwf0 f9283p;

    /* JADX INFO: renamed from: q */
    public boolean f9284q;

    /* JADX INFO: renamed from: r */
    public BottomSheetBehavior.BottomSheetCallback f9285r;

    /* JADX INFO: renamed from: l.j9h$b */
    public class C2401b extends LinearLayoutManager {
        public C2401b(Context context) {
            super(context);
        }

        public boolean canScrollVertically() {
            return false;
        }
    }

    public j9h(@NonNull Act act, @StyleRes int i) {
        super(act, i);
        this.f9284q = true;
        this.f9285r = new C2402c();
        m11110w(act);
    }

    /* JADX INFO: renamed from: v */
    private void m11109v() {
        xdl0.E0(this.f9268a, new View.OnClickListener() { // from class: l.g9h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8398a.m11111x(view);
            }
        });
        xdl0.E0(this.f9272e, new View.OnClickListener() { // from class: l.h9h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8639a.m11121y(view);
            }
        });
        xdl0.E0(this.f9274g, new View.OnClickListener() { // from class: l.i9h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8968a.m11122z(view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w */
    private void m11110w(Act act) {
        this.f9277j = act;
        this.f9283p = i0e.c("p_circle_joined_popup", Dialog.class.getName());
        this.f9282o = i0e.c("p_circle_detail_join_popup", Dialog.class.getName());
        setContentView(o6c0.f11154X0);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        attributes.gravity = 17;
        getWindow().setAttributes(attributes);
        this.f9268a = findViewById(b5c0.f6110z1);
        this.f9269b = findViewById(b5c0.f6004U);
        this.f9270c = (TextView) findViewById(b5c0.f5944A);
        this.f9271d = (TextView) findViewById(b5c0.f5982M1);
        this.f9272e = findViewById(b5c0.f6098v1);
        this.f9273f = findViewById(b5c0.f5945A0);
        this.f9274g = (TextView) findViewById(b5c0.f6015X1);
        this.f9275h = findViewById(b5c0.f6001T);
        m11114D();
        xdl0.M(this.f9271d, !this.f9284q);
        xdl0.M(this.f9272e, !this.f9284q);
        xdl0.M(this.f9273f, !this.f9279l && this.f9284q);
        xdl0.M(this.f9275h, !this.f9279l && this.f9284q);
        m11109v();
        qib0.G.I0(this.f9269b, FeedModule.m1140H().me_().m1042fp().url, t100.d(56.0f), t100.d(56.0f));
        m11112A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m11111x(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: C */
    public j9h m11113C(Runnable runnable) {
        this.f9276i = runnable;
        return this;
    }

    /* JADX INFO: renamed from: D */
    public void m11114D() {
        this.f9280m = new y4h(this.f9277j, new C2400a(), "p_circle_joined_popup");
        C2401b c2401b = new C2401b(this.f9277j);
        c2401b.setOrientation(1);
        this.f9275h.setLayoutManager(c2401b);
        this.f9275h.setAdapter(this.f9280m);
    }

    /* JADX INFO: renamed from: E */
    public void m11115E(List<User> list) {
        boolean z = false;
        xdl0.M(this.f9273f, (this.f9279l || vwb.J(list)) ? false : true);
        RecyclerView recyclerView = this.f9275h;
        if (!this.f9279l && !vwb.J(list)) {
            z = true;
        }
        xdl0.M(recyclerView, z);
        this.f9280m.m16932M(list);
    }

    /* JADX INFO: renamed from: F */
    public j9h m11116F(String str) {
        qib0.G.L0(this.f9269b, str);
        return this;
    }

    /* JADX INFO: renamed from: G */
    public j9h m11117G(boolean z) {
        this.f9279l = z;
        if (z) {
            xdl0.U(this.f9270c, t100.d(26.0f));
        }
        return this;
    }

    /* JADX INFO: renamed from: H */
    public j9h m11118H(boolean z) {
        this.f9284q = z;
        xdl0.M(this.f9271d, !z);
        xdl0.M(this.f9272e, !z);
        boolean z2 = false;
        xdl0.M(this.f9273f, !this.f9279l && z);
        RecyclerView recyclerView = this.f9275h;
        if (!this.f9279l && z) {
            z2 = true;
        }
        xdl0.M(recyclerView, z2);
        if (!z) {
            p6j0.m12915e("e_moment_post", "p_circle_detail_join_popup", j760.a("album_post_source", "circle_ popup"));
        }
        return this;
    }

    /* JADX INFO: renamed from: I */
    public j9h m11119I(Runnable runnable) {
        this.f9278k = runnable;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void dismiss() {
        super/*android.app.Dialog*/.dismiss();
        cwf0 cwf0Var = this.f9283p;
        if (cwf0Var != null && this.f9284q) {
            cwf0Var.k();
            this.f9283p.j();
            return;
        }
        cwf0 cwf0Var2 = this.f9282o;
        if (cwf0Var2 != null) {
            cwf0Var2.k();
            this.f9282o.j();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void show() {
        super/*android.app.Dialog*/.show();
        FrameLayout frameLayout = (FrameLayout) findViewById(p4c0.E);
        this.f9281n = BottomSheetBehavior.from(frameLayout);
        frameLayout.setBackground(this.f9277j.getResources().getDrawable(f3c0.f7644K0));
        this.f9281n.setState(3);
        this.f9281n.setBottomSheetCallback(this.f9285r);
        cwf0 cwf0Var = this.f9283p;
        if (cwf0Var != null && this.f9284q) {
            cwf0Var.i();
            this.f9283p.l();
            return;
        }
        cwf0 cwf0Var2 = this.f9282o;
        if (cwf0Var2 != null) {
            cwf0Var2.i();
            this.f9282o.l();
        }
    }

    /* JADX INFO: renamed from: u */
    public j9h m11120u(CharSequence charSequence) {
        this.f9270c.setText(charSequence);
        return this;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m11121y(View view) {
        if (NullChecker.a(this.f9276i)) {
            this.f9276i.run();
        }
        dismiss();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m11122z(View view) {
        if (NullChecker.a(this.f9278k)) {
            this.f9278k.run();
        }
        dismiss();
    }

    /* JADX INFO: renamed from: A */
    public void m11112A() {
    }

    /* JADX INFO: renamed from: l.j9h$c */
    public class C2402c extends BottomSheetBehavior.BottomSheetCallback {
        public C2402c() {
        }

        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                j9h.this.f9281n.setState(3);
            }
        }

        public void onSlide(@NonNull View view, float f) {
        }
    }

    /* JADX INFO: renamed from: l.j9h$a */
    public class C2400a extends l80<User> {
        public C2400a() {
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo2866j(User user, int i) {
            p6j0.m12915e("e_circle_friends", "p_circle_joined_popup", j760.a("user_id", ((DbObject) user).id));
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo2867l(User user, int i, long j) {
        }
    }
}
