package p153l;

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
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.ExpSetInfoProgressView;
import p151v.AutoVDraweeView;
import p151v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class hjf implements iam<cjf> {

    /* JADX INFO: renamed from: a */
    public cjf f110185a;

    /* JADX INFO: renamed from: b */
    public ImageView f110186b;

    /* JADX INFO: renamed from: c */
    public TextView f110187c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f110188d;

    /* JADX INFO: renamed from: e */
    public Context f110189e;

    /* JADX INFO: renamed from: f */
    public AutoVDraweeView f110190f;

    /* JADX INFO: renamed from: g */
    public VImage f110191g;

    /* JADX INFO: renamed from: h */
    public VImage f110192h;

    /* JADX INFO: renamed from: i */
    public VImage f110193i;

    /* JADX INFO: renamed from: j */
    public ExpSetInfoProgressView f110194j;

    /* JADX INFO: renamed from: k */
    public View f110195k;

    /* JADX INFO: renamed from: l */
    public TextView f110196l;

    /* JADX INFO: renamed from: m */
    public TextView f110197m;

    /* JADX INFO: renamed from: n */
    public TextView f110198n;

    /* JADX INFO: renamed from: o */
    public ScrollView f110199o;

    public hjf(Context context) {
        this.f110189e = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m135339j(View view) {
        this.f110185a.m110173s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m135340k(View view) {
        this.f110185a.m110172r0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m135341l(View view) {
        this.f110185a.m110171q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m135342m(View view) {
        this.f110185a.m110169o0();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f110189e;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(cjf cjfVar) {
        this.f110185a = cjfVar;
    }

    /* JADX INFO: renamed from: f */
    public void m135344f() {
        this.f110197m.setText("");
        this.f110196l.setText("");
    }

    /* JADX INFO: renamed from: i */
    public boolean m135345i() {
        return this.f110195k != null;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125435H2, (ViewGroup) null, false);
        this.f110195k = viewInflate.findViewById(adc0.f70554s6);
        this.f110186b = (ImageView) viewInflate.findViewById(adc0.f69840C1);
        this.f110194j = (ExpSetInfoProgressView) viewInflate.findViewById(adc0.f70537r6);
        this.f110188d = (FrameLayout) viewInflate.findViewById(adc0.f70520q6);
        this.f110187c = (TextView) viewInflate.findViewById(adc0.f70409je);
        this.f110197m = (TextView) viewInflate.findViewById(adc0.f70494oe);
        this.f110196l = (TextView) viewInflate.findViewById(adc0.f70223Yc);
        this.f110190f = (AutoVDraweeView) viewInflate.findViewById(adc0.f70562se);
        this.f110191g = (VImage) viewInflate.findViewById(adc0.f69951Ia);
        this.f110192h = (VImage) viewInflate.findViewById(adc0.f70492oc);
        this.f110193i = (VImage) viewInflate.findViewById(adc0.f69959J1);
        this.f110198n = (TextView) viewInflate.findViewById(adc0.f70650y0);
        this.f110199o = (ScrollView) viewInflate.findViewById(adc0.f70122Sb);
        return viewInflate;
    }

    /* JADX INFO: renamed from: n */
    public void m135346n() {
        this.f110199o.scrollTo(0, 0);
    }

    /* JADX INFO: renamed from: p */
    public void m135347p(String str) {
        bnl0.m105524M(this.f110198n, !TextUtils.isEmpty(str));
        this.f110198n.setText(str);
    }

    /* JADX INFO: renamed from: q */
    public void m135348q(boolean z) {
        bnl0.m105524M(this.f110193i, z);
    }

    /* JADX INFO: renamed from: r */
    public void m135349r() {
        bnl0.m105509E0(this.f110192h, new View.OnClickListener() { // from class: l.djf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f88840a.m135339j(view);
            }
        });
        bnl0.m105509E0(this.f110191g, new View.OnClickListener() { // from class: l.ejf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f94295a.m135340k(view);
            }
        });
        bnl0.m105509E0(this.f110193i, new View.OnClickListener() { // from class: l.fjf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99324a.m135341l(view);
            }
        });
        bnl0.m105509E0(this.f110186b, new View.OnClickListener() { // from class: l.gjf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f104628a.m135342m(view);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public void m135350s(String str) {
        this.f110190f.setImageUrl(str);
    }

    /* JADX INFO: renamed from: u */
    public void m135351u(boolean z) {
        this.f110191g.setEnabled(z);
    }

    /* JADX INFO: renamed from: v */
    public void m135352v(boolean z) {
        this.f110192h.setEnabled(z);
    }

    /* JADX INFO: renamed from: w */
    public void m135353w(String str) {
        bnl0.m105524M(this.f110196l, !TextUtils.isEmpty(str));
        this.f110196l.setText(str);
    }

    /* JADX INFO: renamed from: x */
    public void m135354x(String str) {
        this.f110187c.setText(str);
    }

    /* JADX INFO: renamed from: y */
    public void m135355y(String str) {
        bnl0.m105524M(this.f110197m, !TextUtils.isEmpty(str));
        this.f110197m.setText(str);
    }

    /* JADX INFO: renamed from: z */
    public void m135356z(int i, int i2) {
        this.f110194j.m52424d(i2, i);
        if (bnl0.m105529O0(this.f110194j)) {
            return;
        }
        bnl0.m105524M(this.f110194j, true);
        this.f110194j.setAlpha(0.0f);
        gt0.m132171q(this.f110194j, "alpha", 1.0f).setDuration(180L).start();
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
