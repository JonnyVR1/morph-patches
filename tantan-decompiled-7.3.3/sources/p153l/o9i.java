package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.tantanapp.common.utils.NullChecker;
import p151v.VImage;

/* JADX INFO: loaded from: classes13.dex */
public class o9i extends Dialog {

    /* JADX INFO: renamed from: a */
    public Act f145579a;

    /* JADX INFO: renamed from: b */
    public VImage f145580b;

    /* JADX INFO: renamed from: c */
    public VImage f145581c;

    /* JADX INFO: renamed from: d */
    public TextView f145582d;

    /* JADX INFO: renamed from: e */
    public TextView f145583e;

    /* JADX INFO: renamed from: f */
    public ConstraintLayout f145584f;

    /* JADX INFO: renamed from: g */
    public VImage f145585g;

    /* JADX INFO: renamed from: h */
    public VImage f145586h;

    /* JADX INFO: renamed from: i */
    public VImage f145587i;

    /* JADX INFO: renamed from: j */
    public TextView f145588j;

    /* JADX INFO: renamed from: k */
    public TextView f145589k;

    /* JADX INFO: renamed from: l */
    public l4g0 f145590l;

    /* JADX INFO: renamed from: m */
    public x20 f145591m;

    /* JADX INFO: renamed from: n */
    public User f145592n;

    /* JADX INFO: renamed from: o */
    public VImage f145593o;

    /* JADX INFO: renamed from: p */
    public VImage f145594p;

    /* JADX INFO: renamed from: q */
    public VImage f145595q;

    /* JADX INFO: renamed from: r */
    public y20<Boolean> f145596r;

    public o9i(Act act, String str, User user, x20 x20Var, y20<Boolean> y20Var) {
        super(act, fgc0.f98911n);
        this.f145579a = act;
        this.f145591m = x20Var;
        this.f145596r = y20Var;
        this.f145592n = user;
        this.f145590l = w1e.m204399c(str, o9i.class.getName());
        m166736h();
        m166737i(str);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        this.f145590l.m152776k();
        this.f145590l.m152775j();
    }

    /* JADX INFO: renamed from: g */
    public final void m166735g() {
        User userMe_ = FeedModule.m61406H().me_();
        if (userMe_ == null || !userMe_.isFemale()) {
            this.f145585g.setImageResource(lbc0.f130921Q0);
            this.f145586h.setImageResource(lbc0.f130935S0);
            this.f145587i.setImageResource(lbc0.f130928R0);
        }
        int iM105592y0 = bnl0.m105592y0();
        int iM175859d = ((iM105592y0 - (qa00.m175859d(40.0f) * 2)) - (qa00.m175859d(8.0f) * 2)) / 3;
        final int iM175859d2 = (qa00.m175859d(124.0f) * iM175859d) / qa00.m175859d(93.0f);
        bnl0.m105507D0(iM175859d, this.f145585g, this.f145586h, this.f145587i);
        jyb.m147537z(jyb.m147507f0(this.f145585g, this.f145586h, this.f145587i), new y20() { // from class: l.m9i
            @Override // p153l.y20
            public final void call(Object obj) {
                bnl0.m105505C0((VImage) obj, iM175859d2);
            }
        });
        final int iM175859d3 = (iM105592y0 * qa00.m175859d(24.0f)) / qa00.m175859d(375.0f);
        bnl0.m105507D0(iM175859d3, this.f145593o, this.f145594p, this.f145595q);
        jyb.m147537z(jyb.m147507f0(this.f145593o, this.f145594p, this.f145595q), new y20() { // from class: l.n9i
            @Override // p153l.y20
            public final void call(Object obj) {
                bnl0.m105505C0((VImage) obj, iM175859d3);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final void m166736h() {
        setContentView(LayoutInflater.from(this.f145579a).inflate(tec0.f173720o0, (ViewGroup) null));
        Window window = getWindow();
        window.setGravity(80);
        Display defaultDisplay = this.f145579a.getWindowManager().getDefaultDisplay();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = defaultDisplay.getWidth();
        attributes.windowAnimations = fgc0.f98916s;
        window.setAttributes(attributes);
        setCanceledOnTouchOutside(true);
    }

    /* JADX INFO: renamed from: i */
    public final void m166737i(final String str) {
        this.f145580b = (VImage) findViewById(hdc0.f108971w);
        this.f145581c = (VImage) findViewById(hdc0.f108915f0);
        this.f145582d = (TextView) findViewById(hdc0.f108878U1);
        this.f145583e = (TextView) findViewById(hdc0.f108907d0);
        this.f145584f = (ConstraintLayout) findViewById(hdc0.f108911e0);
        this.f145585g = (VImage) findViewById(hdc0.f108919g0);
        this.f145586h = (VImage) findViewById(hdc0.f108939l0);
        this.f145587i = (VImage) findViewById(hdc0.f108935k0);
        this.f145588j = (TextView) findViewById(hdc0.f108822C);
        this.f145589k = (TextView) findViewById(hdc0.f108925h2);
        this.f145593o = (VImage) findViewById(hdc0.f108923h0);
        this.f145594p = (VImage) findViewById(hdc0.f108931j0);
        this.f145595q = (VImage) findViewById(hdc0.f108927i0);
        if (TextUtils.equals(str, "p_fake_nearby_moment_popup")) {
            User userMe_ = FeedModule.m61406H().me_();
            boolean z = userMe_ != null && userMe_.isFemale();
            TextView textView = this.f145582d;
            StringBuilder sb = new StringBuilder("上传真实头像，让");
            sb.append(z ? "他" : "她");
            sb.append("们优先看到你的动态");
            textView.setText(sb.toString());
        } else {
            StringBuilder sb2 = new StringBuilder("上传真实头像，让");
            User user = this.f145592n;
            sb2.append((user == null || !user.isFemale()) ? "他" : "她");
            sb2.append("优先看到你的评论");
            this.f145582d.setText(sb2.toString());
        }
        m166735g();
        bnl0.m105509E0(this.f145580b, new View.OnClickListener() { // from class: l.i9i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f113473a.m166738j(str, view);
            }
        });
        bnl0.m105509E0(this.f145588j, new View.OnClickListener() { // from class: l.j9i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f118882a.m166739k(str, view);
            }
        });
        bnl0.m105509E0(this.f145589k, new View.OnClickListener() { // from class: l.k9i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f124546a.m166741m(str, view);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m166738j(String str, View view) {
        i4g0.m138520r("e_fake_nearby_comments_close_button", str);
        dismiss();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m166739k(String str, View view) {
        i4g0.m138520r("e_fake_nearby_comments_publish_button", str);
        if (NullChecker.m82486a(this.f145591m)) {
            this.f145591m.call();
        }
        dismiss();
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m166740l(Boolean bool) {
        if (NullChecker.m82486a(this.f145596r)) {
            this.f145596r.call(bool);
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m166741m(String str, View view) {
        i4g0.m138520r("e_fake_nearby_comments_avatar_button", str);
        FeedModule.m61406H().mo31829up(this.f145579a, new y20() { // from class: l.l9i
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f130609a.m166740l((Boolean) obj);
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
        this.f145590l.m152774i();
        this.f145590l.m152777l();
    }
}
