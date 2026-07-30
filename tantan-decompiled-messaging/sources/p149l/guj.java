package p149l;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.GiftWallRankInfo;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class guj {

    /* JADX INFO: renamed from: a */
    public VLinear f104398a;

    /* JADX INFO: renamed from: b */
    public VLinear f104399b;

    /* JADX INFO: renamed from: c */
    public VFrame f104400c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f104401d;

    /* JADX INFO: renamed from: e */
    public VText f104402e;

    /* JADX INFO: renamed from: f */
    public VText f104403f;

    /* JADX INFO: renamed from: g */
    public VText f104404g;

    /* JADX INFO: renamed from: h */
    public VText f104405h;

    /* JADX INFO: renamed from: i */
    public VText f104406i;

    /* JADX INFO: renamed from: j */
    public VText f104407j;

    /* JADX INFO: renamed from: k */
    public VImage f104408k;

    /* JADX INFO: renamed from: l */
    public Act f104409l;

    /* JADX INFO: renamed from: m */
    public View f104410m;

    /* JADX INFO: renamed from: n */
    public Dialog f104411n;

    /* JADX INFO: renamed from: o */
    public GiftWallRankInfo f104412o;

    /* JADX INFO: renamed from: p */
    public String f104413p;

    public guj(Act act, GiftWallRankInfo giftWallRankInfo, String str) {
        this.f104409l = act;
        this.f104412o = giftWallRankInfo;
        this.f104413p = str;
    }

    /* JADX INFO: renamed from: e */
    public View m128038e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return huj.m133114b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m128039f(View view) {
        this.f104411n.cancel();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m128040g(Bitmap bitmap) {
        zvf0.m220396r("e_presentwall_poster_save", this.f104413p);
        if (syj.m186680i(this.f104409l, "", bitmap)) {
            lsi0.m151580j("图片已保存到相册");
        }
        this.f104411n.dismiss();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m128041h(View view) {
        final Bitmap bitmapM186677f = syj.m186677f(this.f104400c);
        syj.m186675d(this.f104409l, new d30() { // from class: l.fuj
            @Override // p149l.d30
            public final void call() {
                this.f99343a.m128040g(bitmapM186677f);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m128042i(View view) {
        zvf0.m220396r("e_presentwall_poster_share", this.f104413p);
        syj.m186681j(syj.m186677f(this.f104400c), false);
        this.f104411n.dismiss();
    }

    /* JADX INFO: renamed from: j */
    public final void m128043j(String str) {
        Paint paint = new Paint();
        paint.setTextSize(t100.m186892f(20));
        if (paint.measureText(str) > t100.m186890d(210.0f)) {
            this.f104403f.setTextSize(17.0f);
            this.f104404g.setTextSize(17.0f);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m128044k() {
        this.f104405h.setText(String.format("累计收到礼物%s个", syj.m186678g(this.f104412o.totalGiftAmount)));
        xaj0<String, String, String> xaj0VarM186679h = syj.m186679h(this.f104412o);
        StringBuilder sb = new StringBuilder(xaj0VarM186679h.f191751a);
        if (TextUtils.isEmpty(xaj0VarM186679h.f191752b)) {
            this.f104403f.setText(xaj0VarM186679h.f191751a);
        } else {
            sb.append(xaj0VarM186679h.f191752b);
            this.f104403f.setText(xaj0VarM186679h.f191751a + xaj0VarM186679h.f191752b);
        }
        this.f104404g.setText(xaj0VarM186679h.f191753c);
        sb.append(xaj0VarM186679h.f191753c);
        m128043j(sb.toString());
    }

    /* JADX INFO: renamed from: l */
    public void m128045l() {
        this.f104410m = m128038e(this.f104409l.getLayoutInflater(), null);
        qib0.f154691G.m102331L0(this.f104401d, CoreModule.f17545c.f19639e0.m169527p9().m60124fp().profileSmall().formatted());
        this.f104411n = this.f104409l.dialog().m20520P(this.f104410m, false).m20496B(false).m20516L(x7c0.f191338g).m20568z0();
        this.f104402e.setText(CoreModule.f17545c.f19639e0.m169527p9().name);
        syj.m186676e(this.f104399b, t100.m186890d(10.0f));
        xdl0.m208329E0(this.f104408k, new View.OnClickListener() { // from class: l.cuj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f82573a.m128039f(view);
            }
        });
        xdl0.m208329E0(this.f104407j, new View.OnClickListener() { // from class: l.duj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f87985a.m128041h(view);
            }
        });
        xdl0.m208329E0(this.f104406i, new View.OnClickListener() { // from class: l.euj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f93242a.m128042i(view);
            }
        });
        if (NullChecker.m81303a(this.f104412o)) {
            m128044k();
        }
        zvf0.m220402x("e_presentwall_poster", this.f104413p);
    }
}
