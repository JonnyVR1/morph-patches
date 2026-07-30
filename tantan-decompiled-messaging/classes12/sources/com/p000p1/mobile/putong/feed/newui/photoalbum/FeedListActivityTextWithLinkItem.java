package com.p000p1.mobile.putong.feed.newui.photoalbum;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.drawee.generic.RoundingParams;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.MediaLocalStatus;
import com.p000p1.mobile.putong.data.Order;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.ui.webview.mk.MkDlgWebViewAct;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.j2e0;
import l.j760;
import l.qib0;
import l.t100;
import l.vwb;
import l.xdl0;
import p007l.fm20;
import p007l.n8i;
import p007l.p6j0;
import p007l.vqg;
import p007l.wah;
import p007l.zi60;
import v.VDraweeView;
import v.VLinear;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedListActivityTextWithLinkItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FeedListActivityTextWithLinkItem f2284a;

    /* JADX INFO: renamed from: b */
    public VLinear f2285b;

    /* JADX INFO: renamed from: c */
    public TextView f2286c;

    /* JADX INFO: renamed from: d */
    public VText f2287d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f2288e;

    /* JADX INFO: renamed from: f */
    public VText f2289f;

    /* JADX INFO: renamed from: g */
    public VText f2290g;

    /* JADX INFO: renamed from: h */
    public VRelative f2291h;

    /* JADX INFO: renamed from: i */
    public int f2292i;

    /* JADX INFO: renamed from: j */
    public Moment f2293j;

    /* JADX INFO: renamed from: k */
    public String f2294k;

    /* JADX INFO: renamed from: l */
    public String f2295l;

    /* JADX INFO: renamed from: m */
    public int f2296m;

    /* JADX INFO: renamed from: n */
    public boolean f2297n;

    /* JADX INFO: renamed from: o */
    public int f2298o;

    public FeedListActivityTextWithLinkItem(Context context) {
        super(context);
        this.f2297n = true;
    }

    /* JADX INFO: renamed from: d */
    public final void m4093d(View view) {
        wah.m15766a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public Act m4094e() {
        return getContext();
    }

    /* JADX INFO: renamed from: f */
    public final void m4095f() {
        this.f2289f.setText(this.f2293j.value);
        xdl0.M(this.f2290g, !TextUtils.isEmpty(this.f2293j.hyperlink));
        m4102m(this.f2293j.media);
        xdl0.E0(this.f2284a, new View.OnClickListener() { // from class: l.tah
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13247a.m4097h(view);
            }
        });
        xdl0.E0(this.f2290g, new View.OnClickListener() { // from class: l.uah
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13791a.m4098i(view);
            }
        });
        xdl0.E0(this.f2291h, new View.OnClickListener() { // from class: l.vah
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14127a.m4099j(view);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final void m4096g() {
        j760[] j760VarArrM15483J = {j760.a("moment_id", ((DbObject) this.f2293j).id), j760.a("owner_id", this.f2293j.owner), j760.a(Order.TYPE, Integer.valueOf(this.f2296m)), j760.a("moment_type", zi60.m17436w().m17467y(this.f2293j)), j760.a("moment_distance", Long.valueOf(vqg.m15477G(this.f2293j))), j760.a("moment_create_time", Long.valueOf(vqg.m15475F(this.f2293j))), j760.a("owner_active_time", Long.valueOf(vqg.m15495S(FeedModule.f316d.m16628e8(this.f2293j.owner))))};
        if (NullChecker.a(this.f2293j.simpleActivity) && !TextUtils.isEmpty(this.f2293j.simpleActivity.f696id)) {
            j760VarArrM15483J = vqg.m15483J(j760.a("activity_id", this.f2293j.simpleActivity.f696id), j760VarArrM15483J);
        }
        p6j0.m12913c("e_moment", this.f2295l, j760VarArrM15483J);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m4097h(View view) {
        Intent intentM5932b;
        if (this.f2297n && (intentM5932b = MomentDetailAct.C2150a.m5931a(getContext()).m5936f(this.f2294k).m5943m(((DbObject) this.f2293j).id).m5944n(this.f2293j.owner).m5950t(true).m5945o(this.f2293j.momentValue).m5932b()) != null) {
            m4094e().startActivity(intentM5932b);
            m4096g();
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m4098i(View view) {
        Spanned spannedFromHtml = Html.fromHtml(this.f2293j.hyperlink);
        URLSpan[] uRLSpanArr = (URLSpan[]) new SpannableStringBuilder(spannedFromHtml).getSpans(0, spannedFromHtml.length(), URLSpan.class);
        j2e0.m(m4094e(), Uri.parse("tantan://webview?url=" + uRLSpanArr[0].getURL()));
        m4096g();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m4099j(View view) {
        p6j0.m12913c("e_worldcup_moment_pic", this.f2295l, new j760[0]);
        String strM10222b = null;
        String str = (NullChecker.a(this.f2293j) && NullChecker.a(this.f2293j.simpleActivity)) ? this.f2293j.simpleActivity.url : null;
        if (TextUtils.isEmpty(str)) {
            if (NullChecker.a(this.f2293j) && NullChecker.a(this.f2293j.simpleActivity)) {
                strM10222b = fm20.m10222b(this.f2293j.simpleActivity.f696id);
            }
            str = strM10222b;
        }
        if (!TextUtils.isEmpty(str)) {
            m4100k(xdl0.E(this), str);
        }
        m4096g();
    }

    /* JADX INFO: renamed from: k */
    public final void m4100k(Activity activity, String str) {
        if (activity == null || TextUtils.isEmpty(str)) {
            return;
        }
        Intent intentX1 = MkDlgWebViewAct.X1(activity, "", str);
        intentX1.putExtra("hideNavigationBar", true);
        intentX1.putExtra("skipLoading", true);
        intentX1.putExtra("transparent_status_bar", true);
        intentX1.putExtra("webviewColor", "transparent");
        intentX1.putExtra("hideNotch", true);
        activity.startActivity(intentX1);
    }

    /* JADX INFO: renamed from: l */
    public void m4101l(int i, Moment moment, String str, int i2, String str2) {
        this.f2294k = str;
        this.f2292i = i;
        this.f2293j = moment;
        this.f2296m = i2;
        this.f2295l = str2;
        m4095f();
        int iD = 0;
        if (TextUtils.isEmpty(moment.feedTime) || i != 2) {
            xdl0.M(this.f2285b, false);
            xdl0.X(this.f2288e, this.f2298o);
        } else {
            xdl0.M(this.f2285b, true);
            boolean zEquals = moment.feedTime.equals(FeedModule.f313a.getString(R$string.f537i2));
            VText vText = this.f2287d;
            if (zEquals) {
                xdl0.M(vText, false);
                this.f2286c.setText(moment.feedTime);
                TextView textView = this.f2286c;
                textView.setTextSize(n8i.m12112f(textView, t100.d(55.0f), moment.feedTime, 17.0f));
            } else {
                xdl0.M(vText, true);
                String[] strArrSplit = moment.feedTime.split("/");
                this.f2286c.setTextSize(20.0f);
                this.f2286c.setText(strArrSplit[0]);
                this.f2287d.setText(strArrSplit[1]);
            }
            if (i2 == 0) {
                xdl0.X(this.f2286c, t100.d(24.0f));
                xdl0.X(this.f2287d, t100.d(24.0f));
                xdl0.X(this.f2288e, t100.d(28.0f));
            } else {
                xdl0.X(this.f2288e, this.f2298o);
                xdl0.X(this.f2286c, -t100.d(4.0f));
                xdl0.X(this.f2287d, -t100.d(4.0f));
            }
        }
        if (i == 2) {
            iD = t100.d(16.0f);
        } else if (m4094e() instanceof MomentDetailAct) {
            iD = t100.d(8.0f);
        }
        xdl0.f0(this, iD);
    }

    /* JADX INFO: renamed from: m */
    public final void m4102m(List<Media> list) {
        if (vwb.J(list)) {
            xdl0.M(this.f2284a, false);
            return;
        }
        Media media = list.get(0);
        Picture picture = media instanceof Picture ? (Picture) media : null;
        if (NullChecker.b(picture)) {
            VDraweeView childAt = this.f2291h.getChildAt(0);
            if (!TEnum.equals(picture.status, MediaLocalStatus.raw) && !TextUtils.isEmpty(picture.url)) {
                qib0.G.Q0(childAt, picture.calculatedWidth(xdl0.y0() - t100.d(80.0f)));
                childAt.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture.url));
            }
            childAt.getHierarchy().H(RoundingParams.c(t100.d(10.0f)).w(RoundingParams.RoundingMethod.BITMAP_ONLY));
        }
    }

    /* JADX INFO: renamed from: n */
    public void m4103n(int i) {
        xdl0.C0(this.f2291h, (int) (i * 0.63728815f));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m4093d(this);
        this.f2298o = ((FrameLayout.LayoutParams) this.f2288e.getLayoutParams()).topMargin;
        m4103n(xdl0.y0() - t100.d(80.0f));
    }

    public void setNeedInnerClick(boolean z) {
        this.f2297n = z;
    }

    public FeedListActivityTextWithLinkItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2297n = true;
    }

    public FeedListActivityTextWithLinkItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2297n = true;
    }
}
