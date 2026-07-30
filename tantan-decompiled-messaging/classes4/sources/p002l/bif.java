package p002l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.ExpSetInfoProgressView;
import l.bt0;
import l.f6c0;
import l.s7m;
import l.u4c0;
import l.xdl0;
import v.AutoVDraweeView;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class bif implements s7m<whf> {

    /* JADX INFO: renamed from: a */
    public whf f8153a;

    /* JADX INFO: renamed from: b */
    public ImageView f8154b;

    /* JADX INFO: renamed from: c */
    public TextView f8155c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f8156d;

    /* JADX INFO: renamed from: e */
    public Context f8157e;

    /* JADX INFO: renamed from: f */
    public AutoVDraweeView f8158f;

    /* JADX INFO: renamed from: g */
    public VImage f8159g;

    /* JADX INFO: renamed from: h */
    public VImage f8160h;

    /* JADX INFO: renamed from: i */
    public VImage f8161i;

    /* JADX INFO: renamed from: j */
    public ExpSetInfoProgressView f8162j;

    /* JADX INFO: renamed from: k */
    public View f8163k;

    /* JADX INFO: renamed from: l */
    public TextView f8164l;

    /* JADX INFO: renamed from: m */
    public TextView f8165m;

    /* JADX INFO: renamed from: n */
    public TextView f8166n;

    /* JADX INFO: renamed from: o */
    public ScrollView f8167o;

    public bif(Context context) {
        this.f8157e = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m10353j(View view) {
        this.f8153a.m24657s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m10354k(View view) {
        this.f8153a.m24656r0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m10355l(View view) {
        this.f8153a.m24655q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m10356m(View view) {
        this.f8153a.m24653o0();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m10357C0() {
        return this.f8157e;
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void m10361i1(whf whfVar) {
        this.f8153a = whfVar;
    }

    /* JADX INFO: renamed from: f */
    public void m10359f() {
        this.f8165m.setText("");
        this.f8164l.setText("");
    }

    /* JADX INFO: renamed from: i */
    public boolean m10360i() {
        return this.f8163k != null;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.H2, (ViewGroup) null, false);
        this.f8163k = viewInflate.findViewById(u4c0.q6);
        this.f8154b = (ImageView) viewInflate.findViewById(u4c0.C1);
        this.f8162j = (ExpSetInfoProgressView) viewInflate.findViewById(u4c0.p6);
        this.f8156d = (FrameLayout) viewInflate.findViewById(u4c0.o6);
        this.f8155c = (TextView) viewInflate.findViewById(u4c0.ge);
        this.f8165m = (TextView) viewInflate.findViewById(u4c0.le);
        this.f8164l = (TextView) viewInflate.findViewById(u4c0.Wc);
        this.f8158f = viewInflate.findViewById(u4c0.pe);
        this.f8159g = viewInflate.findViewById(u4c0.Ga);
        this.f8160h = viewInflate.findViewById(u4c0.mc);
        this.f8161i = viewInflate.findViewById(u4c0.J1);
        this.f8166n = (TextView) viewInflate.findViewById(u4c0.y0);
        this.f8167o = (ScrollView) viewInflate.findViewById(u4c0.Qb);
        return viewInflate;
    }

    /* JADX INFO: renamed from: n */
    public void m10362n() {
        this.f8167o.scrollTo(0, 0);
    }

    /* JADX INFO: renamed from: p */
    public void m10363p(String str) {
        xdl0.M(this.f8166n, !TextUtils.isEmpty(str));
        this.f8166n.setText(str);
    }

    /* JADX INFO: renamed from: q */
    public void m10364q(boolean z) {
        xdl0.M(this.f8161i, z);
    }

    /* JADX INFO: renamed from: r */
    public void m10365r() {
        xdl0.E0(this.f8160h, new View.OnClickListener() { // from class: l.xhf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22283a.m10353j(view);
            }
        });
        xdl0.E0(this.f8159g, new View.OnClickListener() { // from class: l.yhf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22886a.m10354k(view);
            }
        });
        xdl0.E0(this.f8161i, new View.OnClickListener() { // from class: l.zhf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23426a.m10355l(view);
            }
        });
        xdl0.E0(this.f8154b, new View.OnClickListener() { // from class: l.aif
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7642a.m10356m(view);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public void m10366s(String str) {
        this.f8158f.setImageUrl(str);
    }

    /* JADX INFO: renamed from: u */
    public void m10367u(boolean z) {
        this.f8159g.setEnabled(z);
    }

    /* JADX INFO: renamed from: v */
    public void m10368v(boolean z) {
        this.f8160h.setEnabled(z);
    }

    /* JADX INFO: renamed from: w */
    public void m10369w(String str) {
        xdl0.M(this.f8164l, !TextUtils.isEmpty(str));
        this.f8164l.setText(str);
    }

    /* JADX INFO: renamed from: x */
    public void m10370x(String str) {
        this.f8155c.setText(str);
    }

    /* JADX INFO: renamed from: y */
    public void m10371y(String str) {
        xdl0.M(this.f8165m, !TextUtils.isEmpty(str));
        this.f8165m.setText(str);
    }

    /* JADX INFO: renamed from: z */
    public void m10372z(int i, int i2) {
        this.f8162j.m1696d(i2, i);
        if (xdl0.O0(this.f8162j)) {
            return;
        }
        xdl0.M(this.f8162j, true);
        this.f8162j.setAlpha(0.0f);
        bt0.q(this.f8162j, "alpha", new float[]{1.0f}).setDuration(180L).start();
    }

    public void destroy() {
    }
}
