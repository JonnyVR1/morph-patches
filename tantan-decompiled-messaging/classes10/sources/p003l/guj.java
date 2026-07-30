package p003l;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.data.GiftWallRankInfo;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.lsi0;
import l.qib0;
import l.t100;
import l.xaj0;
import l.xdl0;
import l.zvf0;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class guj {

    /* JADX INFO: renamed from: a */
    public VLinear f4724a;

    /* JADX INFO: renamed from: b */
    public VLinear f4725b;

    /* JADX INFO: renamed from: c */
    public VFrame f4726c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f4727d;

    /* JADX INFO: renamed from: e */
    public VText f4728e;

    /* JADX INFO: renamed from: f */
    public VText f4729f;

    /* JADX INFO: renamed from: g */
    public VText f4730g;

    /* JADX INFO: renamed from: h */
    public VText f4731h;

    /* JADX INFO: renamed from: i */
    public VText f4732i;

    /* JADX INFO: renamed from: j */
    public VText f4733j;

    /* JADX INFO: renamed from: k */
    public VImage f4734k;

    /* JADX INFO: renamed from: l */
    public Act f4735l;

    /* JADX INFO: renamed from: m */
    public View f4736m;

    /* JADX INFO: renamed from: n */
    public Dialog f4737n;

    /* JADX INFO: renamed from: o */
    public GiftWallRankInfo f4738o;

    /* JADX INFO: renamed from: p */
    public String f4739p;

    public guj(Act act, GiftWallRankInfo giftWallRankInfo, String str) {
        this.f4735l = act;
        this.f4738o = giftWallRankInfo;
        this.f4739p = str;
    }

    /* JADX INFO: renamed from: e */
    public View m6817e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return huj.m7080b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m6818f(View view) {
        this.f4737n.cancel();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m6819g(Bitmap bitmap) {
        zvf0.r("e_presentwall_poster_save", this.f4739p);
        if (syj.m9513i(this.f4735l, "", bitmap)) {
            lsi0.j("图片已保存到相册");
        }
        this.f4737n.dismiss();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m6820h(View view) {
        final Bitmap bitmapM9510f = syj.m9510f(this.f4726c);
        syj.m9508d(this.f4735l, new d30() { // from class: l.fuj
            public final void call() {
                this.f4513a.m6819g(bitmapM9510f);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m6821i(View view) {
        zvf0.r("e_presentwall_poster_share", this.f4739p);
        syj.m9514j(syj.m9510f(this.f4726c), false);
        this.f4737n.dismiss();
    }

    /* JADX INFO: renamed from: j */
    public final void m6822j(String str) {
        Paint paint = new Paint();
        paint.setTextSize(t100.f(20));
        if (paint.measureText(str) > t100.d(210.0f)) {
            this.f4729f.setTextSize(17.0f);
            this.f4730g.setTextSize(17.0f);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m6823k() {
        this.f4731h.setText(String.format("累计收到礼物%s个", syj.m9511g(this.f4738o.totalGiftAmount)));
        xaj0<String, String, String> xaj0VarM9512h = syj.m9512h(this.f4738o);
        StringBuilder sb = new StringBuilder((String) xaj0VarM9512h.a);
        if (TextUtils.isEmpty((CharSequence) xaj0VarM9512h.b)) {
            this.f4729f.setText((CharSequence) xaj0VarM9512h.a);
        } else {
            sb.append((String) xaj0VarM9512h.b);
            this.f4729f.setText(((String) xaj0VarM9512h.a) + ((String) xaj0VarM9512h.b));
        }
        this.f4730g.setText((CharSequence) xaj0VarM9512h.c);
        sb.append((String) xaj0VarM9512h.c);
        m6822j(sb.toString());
    }

    /* JADX INFO: renamed from: l */
    public void m6824l() {
        this.f4736m = m6817e(this.f4735l.getLayoutInflater(), null);
        qib0.G.L0(this.f4727d, CoreModule.c.e0.p9().fp().profileSmall().formatted());
        this.f4737n = this.f4735l.dialog().P(this.f4736m, false).B(false).L(x7c0.f8380g).z0();
        this.f4728e.setText(CoreModule.c.e0.p9().name);
        syj.m9509e(this.f4725b, t100.d(10.0f));
        xdl0.E0(this.f4734k, new View.OnClickListener() { // from class: l.cuj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4084a.m6818f(view);
            }
        });
        xdl0.E0(this.f4733j, new View.OnClickListener() { // from class: l.duj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4232a.m6820h(view);
            }
        });
        xdl0.E0(this.f4732i, new View.OnClickListener() { // from class: l.euj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4342a.m6821i(view);
            }
        });
        if (NullChecker.a(this.f4738o)) {
            m6823k();
        }
        zvf0.x("e_presentwall_poster", this.f4739p);
    }
}
