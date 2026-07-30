package p153l;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.GiftWallRankInfo;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class wwj {

    /* JADX INFO: renamed from: a */
    public VLinear f191287a;

    /* JADX INFO: renamed from: b */
    public VLinear f191288b;

    /* JADX INFO: renamed from: c */
    public VFrame f191289c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f191290d;

    /* JADX INFO: renamed from: e */
    public VText f191291e;

    /* JADX INFO: renamed from: f */
    public VText f191292f;

    /* JADX INFO: renamed from: g */
    public VText f191293g;

    /* JADX INFO: renamed from: h */
    public VText f191294h;

    /* JADX INFO: renamed from: i */
    public VText f191295i;

    /* JADX INFO: renamed from: j */
    public VText f191296j;

    /* JADX INFO: renamed from: k */
    public VImage f191297k;

    /* JADX INFO: renamed from: l */
    public Act f191298l;

    /* JADX INFO: renamed from: m */
    public View f191299m;

    /* JADX INFO: renamed from: n */
    public Dialog f191300n;

    /* JADX INFO: renamed from: o */
    public GiftWallRankInfo f191301o;

    /* JADX INFO: renamed from: p */
    public String f191302p;

    public wwj(Act act, GiftWallRankInfo giftWallRankInfo, String str) {
        this.f191298l = act;
        this.f191301o = giftWallRankInfo;
        this.f191302p = str;
    }

    /* JADX INFO: renamed from: e */
    public View m208251e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return xwj.m213353b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m208252f(View view) {
        this.f191300n.cancel();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m208253g(Bitmap bitmap) {
        i4g0.m138520r("e_presentwall_poster_save", this.f191302p);
        if (i1k.m138112i(this.f191298l, "", bitmap)) {
            o1j0.m165636j("图片已保存到相册");
        }
        this.f191300n.dismiss();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m208254h(View view) {
        final Bitmap bitmapM138109f = i1k.m138109f(this.f191289c);
        i1k.m138107d(this.f191298l, new x20() { // from class: l.vwj
            @Override // p153l.x20
            public final void call() {
                this.f186144a.m208253g(bitmapM138109f);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m208255i(View view) {
        i4g0.m138520r("e_presentwall_poster_share", this.f191302p);
        i1k.m138113j(i1k.m138109f(this.f191289c), false);
        this.f191300n.dismiss();
    }

    /* JADX INFO: renamed from: j */
    public final void m208256j(String str) {
        Paint paint = new Paint();
        paint.setTextSize(qa00.m175861f(20));
        if (paint.measureText(str) > qa00.m175859d(210.0f)) {
            this.f191292f.setTextSize(17.0f);
            this.f191293g.setTextSize(17.0f);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m208257k() {
        this.f191294h.setText(String.format("累计收到礼物%s个", i1k.m138110g(this.f191301o.totalGiftAmount)));
        bkj0<String, String, String> bkj0VarM138111h = i1k.m138111h(this.f191301o);
        StringBuilder sb = new StringBuilder(bkj0VarM138111h.f77081a);
        if (TextUtils.isEmpty(bkj0VarM138111h.f77082b)) {
            this.f191292f.setText(bkj0VarM138111h.f77081a);
        } else {
            sb.append(bkj0VarM138111h.f77082b);
            this.f191292f.setText(bkj0VarM138111h.f77081a + bkj0VarM138111h.f77082b);
        }
        this.f191293g.setText(bkj0VarM138111h.f77083c);
        sb.append(bkj0VarM138111h.f77083c);
        m208256j(sb.toString());
    }

    /* JADX INFO: renamed from: l */
    public void m208258l() {
        this.f191299m = m208251e(this.f191298l.getLayoutInflater(), null);
        uqb0.f180374G.m127115L0(this.f191290d, CoreModule.f18264c.f20381e0.m116600p9().m61308fp().profileSmall().formatted());
        this.f191300n = this.f191298l.dialog().m21519P(this.f191299m, false).m21495B(false).m21515L(cgc0.f81651g).m21567z0();
        this.f191291e.setText(CoreModule.f18264c.f20381e0.m116600p9().name);
        i1k.m138108e(this.f191288b, qa00.m175859d(10.0f));
        bnl0.m105509E0(this.f191297k, new View.OnClickListener() { // from class: l.swj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f170979a.m208252f(view);
            }
        });
        bnl0.m105509E0(this.f191296j, new View.OnClickListener() { // from class: l.twj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f176401a.m208254h(view);
            }
        });
        bnl0.m105509E0(this.f191295i, new View.OnClickListener() { // from class: l.uwj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f181303a.m208255i(view);
            }
        });
        if (NullChecker.m82486a(this.f191301o)) {
            m208257k();
        }
        i4g0.m138526x("e_presentwall_poster", this.f191302p);
    }
}
