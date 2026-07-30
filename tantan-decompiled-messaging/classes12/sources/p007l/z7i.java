package p007l;

import android.app.Dialog;
import android.text.TextUtils;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import l.cwf0;
import l.d30;
import l.e30;
import l.i0e;
import l.t100;
import l.vwb;
import l.xdl0;
import l.zvf0;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class z7i extends Dialog {

    /* JADX INFO: renamed from: a */
    public Act f15621a;

    /* JADX INFO: renamed from: b */
    public VImage f15622b;

    /* JADX INFO: renamed from: c */
    public VImage f15623c;

    /* JADX INFO: renamed from: d */
    public TextView f15624d;

    /* JADX INFO: renamed from: e */
    public TextView f15625e;

    /* JADX INFO: renamed from: f */
    public ConstraintLayout f15626f;

    /* JADX INFO: renamed from: g */
    public VImage f15627g;

    /* JADX INFO: renamed from: h */
    public VImage f15628h;

    /* JADX INFO: renamed from: i */
    public VImage f15629i;

    /* JADX INFO: renamed from: j */
    public TextView f15630j;

    /* JADX INFO: renamed from: k */
    public TextView f15631k;

    /* JADX INFO: renamed from: l */
    public cwf0 f15632l;

    /* JADX INFO: renamed from: m */
    public d30 f15633m;

    /* JADX INFO: renamed from: n */
    public User f15634n;

    /* JADX INFO: renamed from: o */
    public VImage f15635o;

    /* JADX INFO: renamed from: p */
    public VImage f15636p;

    /* JADX INFO: renamed from: q */
    public VImage f15637q;

    /* JADX INFO: renamed from: r */
    public e30<Boolean> f15638r;

    public z7i(Act act, String str, User user, d30 d30Var, e30<Boolean> e30Var) {
        super(act, a8c0.f5645n);
        this.f15621a = act;
        this.f15633m = d30Var;
        this.f15638r = e30Var;
        this.f15634n = user;
        this.f15632l = i0e.c(str, z7i.class.getName());
        m17261h();
        m17262i(str);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        this.f15632l.k();
        this.f15632l.j();
    }

    /* JADX INFO: renamed from: g */
    public final void m17260g() {
        User userMe_ = FeedModule.m1140H().me_();
        if (userMe_ == null || !userMe_.isFemale()) {
            this.f15627g.setImageResource(f3c0.f7686Q0);
            this.f15628h.setImageResource(f3c0.f7700S0);
            this.f15629i.setImageResource(f3c0.f7693R0);
        }
        int iY0 = xdl0.y0();
        int iD = ((iY0 - (t100.d(40.0f) * 2)) - (t100.d(8.0f) * 2)) / 3;
        final int iD2 = (t100.d(124.0f) * iD) / t100.d(93.0f);
        xdl0.D0(iD, new View[]{this.f15627g, this.f15628h, this.f15629i});
        vwb.z(vwb.f0(new VImage[]{this.f15627g, this.f15628h, this.f15629i}), new e30() { // from class: l.x7i
            public final void call(Object obj) {
                xdl0.C0((VImage) obj, iD2);
            }
        });
        final int iD3 = (iY0 * t100.d(24.0f)) / t100.d(375.0f);
        xdl0.D0(iD3, new View[]{this.f15635o, this.f15636p, this.f15637q});
        vwb.z(vwb.f0(new VImage[]{this.f15635o, this.f15636p, this.f15637q}), new e30() { // from class: l.y7i
            public final void call(Object obj) {
                xdl0.C0((VImage) obj, iD3);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final void m17261h() {
        setContentView(LayoutInflater.from(this.f15621a).inflate(o6c0.f11270o0, (ViewGroup) null));
        Window window = getWindow();
        window.setGravity(80);
        Display defaultDisplay = this.f15621a.getWindowManager().getDefaultDisplay();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = defaultDisplay.getWidth();
        attributes.windowAnimations = a8c0.f5650s;
        window.setAttributes(attributes);
        setCanceledOnTouchOutside(true);
    }

    /* JADX INFO: renamed from: i */
    public final void m17262i(final String str) {
        this.f15622b = findViewById(b5c0.f6099w);
        this.f15623c = findViewById(b5c0.f6043f0);
        this.f15624d = (TextView) findViewById(b5c0.f6006U1);
        this.f15625e = (TextView) findViewById(b5c0.f6035d0);
        this.f15626f = findViewById(b5c0.f6039e0);
        this.f15627g = findViewById(b5c0.f6047g0);
        this.f15628h = findViewById(b5c0.f6067l0);
        this.f15629i = findViewById(b5c0.f6063k0);
        this.f15630j = (TextView) findViewById(b5c0.f5950C);
        this.f15631k = (TextView) findViewById(b5c0.f6053h2);
        this.f15635o = findViewById(b5c0.f6051h0);
        this.f15636p = findViewById(b5c0.f6059j0);
        this.f15637q = findViewById(b5c0.f6055i0);
        if (TextUtils.equals(str, "p_fake_nearby_moment_popup")) {
            User userMe_ = FeedModule.m1140H().me_();
            boolean z = userMe_ != null && userMe_.isFemale();
            TextView textView = this.f15624d;
            StringBuilder sb = new StringBuilder("上传真实头像，让");
            sb.append(z ? "他" : "她");
            sb.append("们优先看到你的动态");
            textView.setText(sb.toString());
        } else {
            StringBuilder sb2 = new StringBuilder("上传真实头像，让");
            User user = this.f15634n;
            sb2.append((user == null || !user.isFemale()) ? "他" : "她");
            sb2.append("优先看到你的评论");
            this.f15624d.setText(sb2.toString());
        }
        m17260g();
        xdl0.E0(this.f15622b, new View.OnClickListener() { // from class: l.t7i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13213a.m17263j(str, view);
            }
        });
        xdl0.E0(this.f15630j, new View.OnClickListener() { // from class: l.u7i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13576a.m17264k(str, view);
            }
        });
        xdl0.E0(this.f15631k, new View.OnClickListener() { // from class: l.v7i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14083a.m17266m(str, view);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m17263j(String str, View view) {
        zvf0.r("e_fake_nearby_comments_close_button", str);
        dismiss();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m17264k(String str, View view) {
        zvf0.r("e_fake_nearby_comments_publish_button", str);
        if (NullChecker.a(this.f15633m)) {
            this.f15633m.call();
        }
        dismiss();
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m17265l(Boolean bool) {
        if (NullChecker.a(this.f15638r)) {
            this.f15638r.call(bool);
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m17266m(String str, View view) {
        zvf0.r("e_fake_nearby_comments_avatar_button", str);
        FeedModule.m1140H().up(this.f15621a, new e30() { // from class: l.w7i
            public final void call(Object obj) {
                this.f14438a.m17265l((Boolean) obj);
            }
        });
        dismiss();
    }

    @Override // android.app.Dialog
    public void onStop() {
        super.onStop();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        this.f15632l.i();
        this.f15632l.l();
    }
}
