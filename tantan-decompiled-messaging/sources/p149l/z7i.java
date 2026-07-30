package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.tantanapp.common.utils.NullChecker;
import p147v.VImage;

/* JADX INFO: loaded from: classes12.dex */
public class z7i extends Dialog {

    /* JADX INFO: renamed from: a */
    public Act f202017a;

    /* JADX INFO: renamed from: b */
    public VImage f202018b;

    /* JADX INFO: renamed from: c */
    public VImage f202019c;

    /* JADX INFO: renamed from: d */
    public TextView f202020d;

    /* JADX INFO: renamed from: e */
    public TextView f202021e;

    /* JADX INFO: renamed from: f */
    public ConstraintLayout f202022f;

    /* JADX INFO: renamed from: g */
    public VImage f202023g;

    /* JADX INFO: renamed from: h */
    public VImage f202024h;

    /* JADX INFO: renamed from: i */
    public VImage f202025i;

    /* JADX INFO: renamed from: j */
    public TextView f202026j;

    /* JADX INFO: renamed from: k */
    public TextView f202027k;

    /* JADX INFO: renamed from: l */
    public cwf0 f202028l;

    /* JADX INFO: renamed from: m */
    public d30 f202029m;

    /* JADX INFO: renamed from: n */
    public User f202030n;

    /* JADX INFO: renamed from: o */
    public VImage f202031o;

    /* JADX INFO: renamed from: p */
    public VImage f202032p;

    /* JADX INFO: renamed from: q */
    public VImage f202033q;

    /* JADX INFO: renamed from: r */
    public e30<Boolean> f202034r;

    public z7i(Act act, String str, User user, d30 d30Var, e30<Boolean> e30Var) {
        super(act, a8c0.f68025n);
        this.f202017a = act;
        this.f202029m = d30Var;
        this.f202034r = e30Var;
        this.f202030n = user;
        this.f202028l = i0e.m133794c(str, z7i.class.getName());
        m217481h();
        m217482i(str);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        this.f202028l.m109035k();
        this.f202028l.m109034j();
    }

    /* JADX INFO: renamed from: g */
    public final void m217480g() {
        User userMe_ = FeedModule.m60222H().me_();
        if (userMe_ == null || !userMe_.isFemale()) {
            this.f202023g.setImageResource(f3c0.f94403Q0);
            this.f202024h.setImageResource(f3c0.f94417S0);
            this.f202025i.setImageResource(f3c0.f94410R0);
        }
        int iM208412y0 = xdl0.m208412y0();
        int iM186890d = ((iM208412y0 - (t100.m186890d(40.0f) * 2)) - (t100.m186890d(8.0f) * 2)) / 3;
        final int iM186890d2 = (t100.m186890d(124.0f) * iM186890d) / t100.m186890d(93.0f);
        xdl0.m208327D0(iM186890d, this.f202023g, this.f202024h, this.f202025i);
        vwb.m200354z(vwb.m200324f0(this.f202023g, this.f202024h, this.f202025i), new e30() { // from class: l.x7i
            @Override // p149l.e30
            public final void call(Object obj) {
                xdl0.m208325C0((VImage) obj, iM186890d2);
            }
        });
        final int iM186890d3 = (iM208412y0 * t100.m186890d(24.0f)) / t100.m186890d(375.0f);
        xdl0.m208327D0(iM186890d3, this.f202031o, this.f202032p, this.f202033q);
        vwb.m200354z(vwb.m200324f0(this.f202031o, this.f202032p, this.f202033q), new e30() { // from class: l.y7i
            @Override // p149l.e30
            public final void call(Object obj) {
                xdl0.m208325C0((VImage) obj, iM186890d3);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final void m217481h() {
        setContentView(LayoutInflater.from(this.f202017a).inflate(o6c0.f142251o0, (ViewGroup) null));
        Window window = getWindow();
        window.setGravity(80);
        Display defaultDisplay = this.f202017a.getWindowManager().getDefaultDisplay();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = defaultDisplay.getWidth();
        attributes.windowAnimations = a8c0.f68030s;
        window.setAttributes(attributes);
        setCanceledOnTouchOutside(true);
    }

    /* JADX INFO: renamed from: i */
    public final void m217482i(final String str) {
        this.f202018b = (VImage) findViewById(b5c0.f73618w);
        this.f202019c = (VImage) findViewById(b5c0.f73562f0);
        this.f202020d = (TextView) findViewById(b5c0.f73525U1);
        this.f202021e = (TextView) findViewById(b5c0.f73554d0);
        this.f202022f = (ConstraintLayout) findViewById(b5c0.f73558e0);
        this.f202023g = (VImage) findViewById(b5c0.f73566g0);
        this.f202024h = (VImage) findViewById(b5c0.f73586l0);
        this.f202025i = (VImage) findViewById(b5c0.f73582k0);
        this.f202026j = (TextView) findViewById(b5c0.f73469C);
        this.f202027k = (TextView) findViewById(b5c0.f73572h2);
        this.f202031o = (VImage) findViewById(b5c0.f73570h0);
        this.f202032p = (VImage) findViewById(b5c0.f73578j0);
        this.f202033q = (VImage) findViewById(b5c0.f73574i0);
        if (TextUtils.equals(str, "p_fake_nearby_moment_popup")) {
            User userMe_ = FeedModule.m60222H().me_();
            boolean z = userMe_ != null && userMe_.isFemale();
            TextView textView = this.f202020d;
            StringBuilder sb = new StringBuilder("上传真实头像，让");
            sb.append(z ? "他" : "她");
            sb.append("们优先看到你的动态");
            textView.setText(sb.toString());
        } else {
            StringBuilder sb2 = new StringBuilder("上传真实头像，让");
            User user = this.f202030n;
            sb2.append((user == null || !user.isFemale()) ? "他" : "她");
            sb2.append("优先看到你的评论");
            this.f202020d.setText(sb2.toString());
        }
        m217480g();
        xdl0.m208329E0(this.f202018b, new View.OnClickListener() { // from class: l.t7i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f168740a.m217483j(str, view);
            }
        });
        xdl0.m208329E0(this.f202026j, new View.OnClickListener() { // from class: l.u7i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f175007a.m217484k(str, view);
            }
        });
        xdl0.m208329E0(this.f202027k, new View.OnClickListener() { // from class: l.v7i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f180389a.m217486m(str, view);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m217483j(String str, View view) {
        zvf0.m220396r("e_fake_nearby_comments_close_button", str);
        dismiss();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m217484k(String str, View view) {
        zvf0.m220396r("e_fake_nearby_comments_publish_button", str);
        if (NullChecker.m81303a(this.f202029m)) {
            this.f202029m.call();
        }
        dismiss();
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m217485l(Boolean bool) {
        if (NullChecker.m81303a(this.f202034r)) {
            this.f202034r.call(bool);
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m217486m(String str, View view) {
        zvf0.m220396r("e_fake_nearby_comments_avatar_button", str);
        FeedModule.m60222H().mo30826up(this.f202017a, new e30() { // from class: l.w7i
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f185056a.m217485l((Boolean) obj);
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
        this.f202028l.m109033i();
        this.f202028l.m109036l();
    }
}
