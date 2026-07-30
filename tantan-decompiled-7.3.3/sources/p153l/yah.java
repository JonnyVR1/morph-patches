package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VRelative;

/* JADX INFO: loaded from: classes13.dex */
public class yah extends BottomSheetDialog {

    /* JADX INFO: renamed from: a */
    public VImage f198185a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f198186b;

    /* JADX INFO: renamed from: c */
    public TextView f198187c;

    /* JADX INFO: renamed from: d */
    public TextView f198188d;

    /* JADX INFO: renamed from: e */
    public VButton f198189e;

    /* JADX INFO: renamed from: f */
    public VRelative f198190f;

    /* JADX INFO: renamed from: g */
    public TextView f198191g;

    /* JADX INFO: renamed from: h */
    public RecyclerView f198192h;

    /* JADX INFO: renamed from: i */
    public Runnable f198193i;

    /* JADX INFO: renamed from: j */
    public Act f198194j;

    /* JADX INFO: renamed from: k */
    public Runnable f198195k;

    /* JADX INFO: renamed from: l */
    public boolean f198196l;

    /* JADX INFO: renamed from: m */
    public n6h f198197m;

    /* JADX INFO: renamed from: n */
    public BottomSheetBehavior f198198n;

    /* JADX INFO: renamed from: o */
    public l4g0 f198199o;

    /* JADX INFO: renamed from: p */
    public l4g0 f198200p;

    /* JADX INFO: renamed from: q */
    public boolean f198201q;

    /* JADX INFO: renamed from: r */
    public BottomSheetBehavior.BottomSheetCallback f198202r;

    /* JADX INFO: renamed from: l.yah$b */
    public class C21552b extends LinearLayoutManager {
        public C21552b(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0579o
        public boolean canScrollVertically() {
            return false;
        }
    }

    public yah(@NonNull Act act, @StyleRes int i) {
        super(act, i);
        this.f198201q = true;
        this.f198202r = new C21553c();
        m214874w(act);
    }

    /* JADX INFO: renamed from: v */
    private void m214873v() {
        bnl0.m105509E0(this.f198185a, new View.OnClickListener() { // from class: l.vah
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f183093a.m214875x(view);
            }
        });
        bnl0.m105509E0(this.f198189e, new View.OnClickListener() { // from class: l.wah
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188121a.m214885y(view);
            }
        });
        bnl0.m105509E0(this.f198191g, new View.OnClickListener() { // from class: l.xah
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f193041a.m214886z(view);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    private void m214874w(Act act) {
        this.f198194j = act;
        this.f198200p = w1e.m204399c("p_circle_joined_popup", Dialog.class.getName());
        this.f198199o = w1e.m204399c("p_circle_detail_join_popup", Dialog.class.getName());
        setContentView(tec0.f173604X0);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        attributes.gravity = 17;
        getWindow().setAttributes(attributes);
        this.f198185a = (VImage) findViewById(hdc0.f108982z1);
        this.f198186b = (VDraweeView) findViewById(hdc0.f108876U);
        this.f198187c = (TextView) findViewById(hdc0.f108816A);
        this.f198188d = (TextView) findViewById(hdc0.f108854M1);
        this.f198189e = (VButton) findViewById(hdc0.f108970v1);
        this.f198190f = (VRelative) findViewById(hdc0.f108817A0);
        this.f198191g = (TextView) findViewById(hdc0.f108887X1);
        this.f198192h = (RecyclerView) findViewById(hdc0.f108873T);
        m214878D();
        bnl0.m105524M(this.f198188d, !this.f198201q);
        bnl0.m105524M(this.f198189e, !this.f198201q);
        bnl0.m105524M(this.f198190f, !this.f198196l && this.f198201q);
        bnl0.m105524M(this.f198192h, !this.f198196l && this.f198201q);
        m214873v();
        uqb0.f180374G.m127109I0(this.f198186b, FeedModule.m61406H().me_().m61308fp().url, qa00.m175859d(56.0f), qa00.m175859d(56.0f));
        m214876A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m214875x(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: C */
    public yah m214877C(Runnable runnable) {
        this.f198193i = runnable;
        return this;
    }

    /* JADX INFO: renamed from: D */
    public void m214878D() {
        this.f198197m = new n6h(this.f198194j, new C21551a(), "p_circle_joined_popup");
        C21552b c21552b = new C21552b(this.f198194j);
        c21552b.setOrientation(1);
        this.f198192h.setLayoutManager(c21552b);
        this.f198192h.setAdapter(this.f198197m);
    }

    /* JADX INFO: renamed from: E */
    public void m214879E(List<User> list) {
        boolean z = false;
        bnl0.m105524M(this.f198190f, (this.f198196l || jyb.m147479J(list)) ? false : true);
        RecyclerView recyclerView = this.f198192h;
        if (!this.f198196l && !jyb.m147479J(list)) {
            z = true;
        }
        bnl0.m105524M(recyclerView, z);
        this.f198197m.m161792M(list);
    }

    /* JADX INFO: renamed from: F */
    public yah m214880F(String str) {
        uqb0.f180374G.m127115L0(this.f198186b, str);
        return this;
    }

    /* JADX INFO: renamed from: G */
    public yah m214881G(boolean z) {
        this.f198196l = z;
        if (z) {
            bnl0.m105537U(this.f198187c, qa00.m175859d(26.0f));
        }
        return this;
    }

    /* JADX INFO: renamed from: H */
    public yah m214882H(boolean z) {
        this.f198201q = z;
        bnl0.m105524M(this.f198188d, !z);
        bnl0.m105524M(this.f198189e, !z);
        boolean z2 = false;
        bnl0.m105524M(this.f198190f, !this.f198196l && z);
        RecyclerView recyclerView = this.f198192h;
        if (!this.f198196l && z) {
            z2 = true;
        }
        bnl0.m105524M(recyclerView, z2);
        if (!z) {
            tfj0.m190942e("e_moment_post", "p_circle_detail_join_popup", pf60.m172085a("album_post_source", "circle_ popup"));
        }
        return this;
    }

    /* JADX INFO: renamed from: I */
    public yah m214883I(Runnable runnable) {
        this.f198195k = runnable;
        return this;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        l4g0 l4g0Var = this.f198200p;
        if (l4g0Var != null && this.f198201q) {
            l4g0Var.m152776k();
            this.f198200p.m152775j();
            return;
        }
        l4g0 l4g0Var2 = this.f198199o;
        if (l4g0Var2 != null) {
            l4g0Var2.m152776k();
            this.f198199o.m152775j();
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        FrameLayout frameLayout = (FrameLayout) findViewById(vcc0.f183363E);
        this.f198198n = BottomSheetBehavior.from(frameLayout);
        frameLayout.setBackground(this.f198194j.getResources().getDrawable(lbc0.f130879K0));
        this.f198198n.setState(3);
        this.f198198n.setBottomSheetCallback(this.f198202r);
        l4g0 l4g0Var = this.f198200p;
        if (l4g0Var != null && this.f198201q) {
            l4g0Var.m152774i();
            this.f198200p.m152777l();
            return;
        }
        l4g0 l4g0Var2 = this.f198199o;
        if (l4g0Var2 != null) {
            l4g0Var2.m152774i();
            this.f198199o.m152777l();
        }
    }

    /* JADX INFO: renamed from: u */
    public yah m214884u(CharSequence charSequence) {
        this.f198187c.setText(charSequence);
        return this;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m214885y(View view) {
        if (NullChecker.m82486a(this.f198193i)) {
            this.f198193i.run();
        }
        dismiss();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m214886z(View view) {
        if (NullChecker.m82486a(this.f198195k)) {
            this.f198195k.run();
        }
        dismiss();
    }

    /* JADX INFO: renamed from: A */
    public void m214876A() {
    }

    /* JADX INFO: renamed from: l.yah$c */
    public class C21553c extends BottomSheetBehavior.BottomSheetCallback {
        public C21553c() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                yah.this.f198198n.setState(3);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }

    /* JADX INFO: renamed from: l.yah$a */
    public class C21551a extends h80<User> {
        public C21551a() {
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo56878j(User user, int i) {
            tfj0.m190942e("e_circle_friends", "p_circle_joined_popup", pf60.m172085a("user_id", user.f56859id));
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo59141l(User user, int i, long j) {
        }
    }
}
