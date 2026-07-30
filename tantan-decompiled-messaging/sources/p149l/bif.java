package p149l;

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
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.ExpSetInfoProgressView;
import p147v.AutoVDraweeView;
import p147v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class bif implements s7m<whf> {

    /* JADX INFO: renamed from: a */
    public whf f75735a;

    /* JADX INFO: renamed from: b */
    public ImageView f75736b;

    /* JADX INFO: renamed from: c */
    public TextView f75737c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f75738d;

    /* JADX INFO: renamed from: e */
    public Context f75739e;

    /* JADX INFO: renamed from: f */
    public AutoVDraweeView f75740f;

    /* JADX INFO: renamed from: g */
    public VImage f75741g;

    /* JADX INFO: renamed from: h */
    public VImage f75742h;

    /* JADX INFO: renamed from: i */
    public VImage f75743i;

    /* JADX INFO: renamed from: j */
    public ExpSetInfoProgressView f75744j;

    /* JADX INFO: renamed from: k */
    public View f75745k;

    /* JADX INFO: renamed from: l */
    public TextView f75746l;

    /* JADX INFO: renamed from: m */
    public TextView f75747m;

    /* JADX INFO: renamed from: n */
    public TextView f75748n;

    /* JADX INFO: renamed from: o */
    public ScrollView f75749o;

    public bif(Context context) {
        this.f75739e = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m102014j(View view) {
        this.f75735a.m203207s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m102015k(View view) {
        this.f75735a.m203206r0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m102016l(View view) {
        this.f75735a.m203205q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m102017m(View view) {
        this.f75735a.m203203o0();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f75739e;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(whf whfVar) {
        this.f75735a = whfVar;
    }

    /* JADX INFO: renamed from: f */
    public void m102019f() {
        this.f75747m.setText("");
        this.f75746l.setText("");
    }

    /* JADX INFO: renamed from: i */
    public boolean m102020i() {
        return this.f75745k != null;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95381H2, (ViewGroup) null, false);
        this.f75745k = viewInflate.findViewById(u4c0.f174429q6);
        this.f75736b = (ImageView) viewInflate.findViewById(u4c0.f173752C1);
        this.f75744j = (ExpSetInfoProgressView) viewInflate.findViewById(u4c0.f174412p6);
        this.f75738d = (FrameLayout) viewInflate.findViewById(u4c0.f174395o6);
        this.f75737c = (TextView) viewInflate.findViewById(u4c0.f174268ge);
        this.f75747m = (TextView) viewInflate.findViewById(u4c0.f174352le);
        this.f75746l = (TextView) viewInflate.findViewById(u4c0.f174100Wc);
        this.f75740f = (AutoVDraweeView) viewInflate.findViewById(u4c0.f174420pe);
        this.f75741g = (VImage) viewInflate.findViewById(u4c0.f173829Ga);
        this.f75742h = (VImage) viewInflate.findViewById(u4c0.f174367mc);
        this.f75743i = (VImage) viewInflate.findViewById(u4c0.f173871J1);
        this.f75748n = (TextView) viewInflate.findViewById(u4c0.f174559y0);
        this.f75749o = (ScrollView) viewInflate.findViewById(u4c0.f174000Qb);
        return viewInflate;
    }

    /* JADX INFO: renamed from: n */
    public void m102021n() {
        this.f75749o.scrollTo(0, 0);
    }

    /* JADX INFO: renamed from: p */
    public void m102022p(String str) {
        xdl0.m208344M(this.f75748n, !TextUtils.isEmpty(str));
        this.f75748n.setText(str);
    }

    /* JADX INFO: renamed from: q */
    public void m102023q(boolean z) {
        xdl0.m208344M(this.f75743i, z);
    }

    /* JADX INFO: renamed from: r */
    public void m102024r() {
        xdl0.m208329E0(this.f75742h, new View.OnClickListener() { // from class: l.xhf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192883a.m102014j(view);
            }
        });
        xdl0.m208329E0(this.f75741g, new View.OnClickListener() { // from class: l.yhf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f198338a.m102015k(view);
            }
        });
        xdl0.m208329E0(this.f75743i, new View.OnClickListener() { // from class: l.zhf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203165a.m102016l(view);
            }
        });
        xdl0.m208329E0(this.f75736b, new View.OnClickListener() { // from class: l.aif
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f69980a.m102017m(view);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public void m102025s(String str) {
        this.f75740f.setImageUrl(str);
    }

    /* JADX INFO: renamed from: u */
    public void m102026u(boolean z) {
        this.f75741g.setEnabled(z);
    }

    /* JADX INFO: renamed from: v */
    public void m102027v(boolean z) {
        this.f75742h.setEnabled(z);
    }

    /* JADX INFO: renamed from: w */
    public void m102028w(String str) {
        xdl0.m208344M(this.f75746l, !TextUtils.isEmpty(str));
        this.f75746l.setText(str);
    }

    /* JADX INFO: renamed from: x */
    public void m102029x(String str) {
        this.f75737c.setText(str);
    }

    /* JADX INFO: renamed from: y */
    public void m102030y(String str) {
        xdl0.m208344M(this.f75747m, !TextUtils.isEmpty(str));
        this.f75747m.setText(str);
    }

    /* JADX INFO: renamed from: z */
    public void m102031z(int i, int i2) {
        this.f75744j.m51241d(i2, i);
        if (xdl0.m208349O0(this.f75744j)) {
            return;
        }
        xdl0.m208344M(this.f75744j, true);
        this.f75744j.setAlpha(0.0f);
        bt0.m103744q(this.f75744j, "alpha", 1.0f).setDuration(180L).start();
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
