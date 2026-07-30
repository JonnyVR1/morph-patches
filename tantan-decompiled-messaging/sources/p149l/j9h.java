package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VRelative;

/* JADX INFO: loaded from: classes12.dex */
public class j9h extends BottomSheetDialog {

    /* JADX INFO: renamed from: a */
    public VImage f116904a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f116905b;

    /* JADX INFO: renamed from: c */
    public TextView f116906c;

    /* JADX INFO: renamed from: d */
    public TextView f116907d;

    /* JADX INFO: renamed from: e */
    public VButton f116908e;

    /* JADX INFO: renamed from: f */
    public VRelative f116909f;

    /* JADX INFO: renamed from: g */
    public TextView f116910g;

    /* JADX INFO: renamed from: h */
    public RecyclerView f116911h;

    /* JADX INFO: renamed from: i */
    public Runnable f116912i;

    /* JADX INFO: renamed from: j */
    public Act f116913j;

    /* JADX INFO: renamed from: k */
    public Runnable f116914k;

    /* JADX INFO: renamed from: l */
    public boolean f116915l;

    /* JADX INFO: renamed from: m */
    public y4h f116916m;

    /* JADX INFO: renamed from: n */
    public BottomSheetBehavior f116917n;

    /* JADX INFO: renamed from: o */
    public cwf0 f116918o;

    /* JADX INFO: renamed from: p */
    public cwf0 f116919p;

    /* JADX INFO: renamed from: q */
    public boolean f116920q;

    /* JADX INFO: renamed from: r */
    public BottomSheetBehavior.BottomSheetCallback f116921r;

    /* JADX INFO: renamed from: l.j9h$b */
    public class C17719b extends LinearLayoutManager {
        public C17719b(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0577o
        public boolean canScrollVertically() {
            return false;
        }
    }

    public j9h(@NonNull Act act, @StyleRes int i) {
        super(act, i);
        this.f116920q = true;
        this.f116921r = new C17720c();
        m140555w(act);
    }

    /* JADX INFO: renamed from: v */
    private void m140554v() {
        xdl0.m208329E0(this.f116904a, new View.OnClickListener() { // from class: l.g9h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101564a.m140556x(view);
            }
        });
        xdl0.m208329E0(this.f116908e, new View.OnClickListener() { // from class: l.h9h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f106587a.m140566y(view);
            }
        });
        xdl0.m208329E0(this.f116910g, new View.OnClickListener() { // from class: l.i9h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f112219a.m140567z(view);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    private void m140555w(Act act) {
        this.f116913j = act;
        this.f116919p = i0e.m133794c("p_circle_joined_popup", Dialog.class.getName());
        this.f116918o = i0e.m133794c("p_circle_detail_join_popup", Dialog.class.getName());
        setContentView(o6c0.f142135X0);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        attributes.gravity = 17;
        getWindow().setAttributes(attributes);
        this.f116904a = (VImage) findViewById(b5c0.f73629z1);
        this.f116905b = (VDraweeView) findViewById(b5c0.f73523U);
        this.f116906c = (TextView) findViewById(b5c0.f73463A);
        this.f116907d = (TextView) findViewById(b5c0.f73501M1);
        this.f116908e = (VButton) findViewById(b5c0.f73617v1);
        this.f116909f = (VRelative) findViewById(b5c0.f73464A0);
        this.f116910g = (TextView) findViewById(b5c0.f73534X1);
        this.f116911h = (RecyclerView) findViewById(b5c0.f73520T);
        m140559D();
        xdl0.m208344M(this.f116907d, !this.f116920q);
        xdl0.m208344M(this.f116908e, !this.f116920q);
        xdl0.m208344M(this.f116909f, !this.f116915l && this.f116920q);
        xdl0.m208344M(this.f116911h, !this.f116915l && this.f116920q);
        m140554v();
        qib0.f154691G.m102325I0(this.f116905b, FeedModule.m60222H().me_().m60124fp().url, t100.m186890d(56.0f), t100.m186890d(56.0f));
        m140557A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m140556x(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: C */
    public j9h m140558C(Runnable runnable) {
        this.f116912i = runnable;
        return this;
    }

    /* JADX INFO: renamed from: D */
    public void m140559D() {
        this.f116916m = new y4h(this.f116913j, new C17718a(), "p_circle_joined_popup");
        C17719b c17719b = new C17719b(this.f116913j);
        c17719b.setOrientation(1);
        this.f116911h.setLayoutManager(c17719b);
        this.f116911h.setAdapter(this.f116916m);
    }

    /* JADX INFO: renamed from: E */
    public void m140560E(List<User> list) {
        boolean z = false;
        xdl0.m208344M(this.f116909f, (this.f116915l || vwb.m200296J(list)) ? false : true);
        RecyclerView recyclerView = this.f116911h;
        if (!this.f116915l && !vwb.m200296J(list)) {
            z = true;
        }
        xdl0.m208344M(recyclerView, z);
        this.f116916m.m212908M(list);
    }

    /* JADX INFO: renamed from: F */
    public j9h m140561F(String str) {
        qib0.f154691G.m102331L0(this.f116905b, str);
        return this;
    }

    /* JADX INFO: renamed from: G */
    public j9h m140562G(boolean z) {
        this.f116915l = z;
        if (z) {
            xdl0.m208357U(this.f116906c, t100.m186890d(26.0f));
        }
        return this;
    }

    /* JADX INFO: renamed from: H */
    public j9h m140563H(boolean z) {
        this.f116920q = z;
        xdl0.m208344M(this.f116907d, !z);
        xdl0.m208344M(this.f116908e, !z);
        boolean z2 = false;
        xdl0.m208344M(this.f116909f, !this.f116915l && z);
        RecyclerView recyclerView = this.f116911h;
        if (!this.f116915l && z) {
            z2 = true;
        }
        xdl0.m208344M(recyclerView, z2);
        if (!z) {
            p6j0.m167671e("e_moment_post", "p_circle_detail_join_popup", j760.m140076a("album_post_source", "circle_ popup"));
        }
        return this;
    }

    /* JADX INFO: renamed from: I */
    public j9h m140564I(Runnable runnable) {
        this.f116914k = runnable;
        return this;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        cwf0 cwf0Var = this.f116919p;
        if (cwf0Var != null && this.f116920q) {
            cwf0Var.m109035k();
            this.f116919p.m109034j();
            return;
        }
        cwf0 cwf0Var2 = this.f116918o;
        if (cwf0Var2 != null) {
            cwf0Var2.m109035k();
            this.f116918o.m109034j();
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        FrameLayout frameLayout = (FrameLayout) findViewById(p4c0.f147063E);
        this.f116917n = BottomSheetBehavior.from(frameLayout);
        frameLayout.setBackground(this.f116913j.getResources().getDrawable(f3c0.f94361K0));
        this.f116917n.setState(3);
        this.f116917n.setBottomSheetCallback(this.f116921r);
        cwf0 cwf0Var = this.f116919p;
        if (cwf0Var != null && this.f116920q) {
            cwf0Var.m109033i();
            this.f116919p.m109036l();
            return;
        }
        cwf0 cwf0Var2 = this.f116918o;
        if (cwf0Var2 != null) {
            cwf0Var2.m109033i();
            this.f116918o.m109036l();
        }
    }

    /* JADX INFO: renamed from: u */
    public j9h m140565u(CharSequence charSequence) {
        this.f116906c.setText(charSequence);
        return this;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m140566y(View view) {
        if (NullChecker.m81303a(this.f116912i)) {
            this.f116912i.run();
        }
        dismiss();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m140567z(View view) {
        if (NullChecker.m81303a(this.f116914k)) {
            this.f116914k.run();
        }
        dismiss();
    }

    /* JADX INFO: renamed from: A */
    public void m140557A() {
    }

    /* JADX INFO: renamed from: l.j9h$c */
    public class C17720c extends BottomSheetBehavior.BottomSheetCallback {
        public C17720c() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 1) {
                j9h.this.f116917n.setState(3);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }

    /* JADX INFO: renamed from: l.j9h$a */
    public class C17718a extends l80<User> {
        public C17718a() {
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo55695j(User user, int i) {
            p6j0.m167671e("e_circle_friends", "p_circle_joined_popup", j760.m140076a("user_id", user.f56011id));
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo57958l(User user, int i, long j) {
        }
    }
}
