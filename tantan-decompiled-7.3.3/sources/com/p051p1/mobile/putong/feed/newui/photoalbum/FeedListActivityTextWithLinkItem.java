package com.p051p1.mobile.putong.feed.newui.photoalbum;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkDlgWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.p106mm.opensdk.constants.ConstantsAPI;
import java.util.List;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;
import p153l.bnl0;
import p153l.cai;
import p153l.er60;
import p153l.jyb;
import p153l.ksg;
import p153l.lch;
import p153l.nae0;
import p153l.pf60;
import p153l.pu20;
import p153l.qa00;
import p153l.tfj0;
import p153l.uqb0;

/* JADX INFO: loaded from: classes13.dex */
public class FeedListActivityTextWithLinkItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FeedListActivityTextWithLinkItem f41671a;

    /* JADX INFO: renamed from: b */
    public VLinear f41672b;

    /* JADX INFO: renamed from: c */
    public TextView f41673c;

    /* JADX INFO: renamed from: d */
    public VText f41674d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f41675e;

    /* JADX INFO: renamed from: f */
    public VText f41676f;

    /* JADX INFO: renamed from: g */
    public VText f41677g;

    /* JADX INFO: renamed from: h */
    public VRelative f41678h;

    /* JADX INFO: renamed from: i */
    public int f41679i;

    /* JADX INFO: renamed from: j */
    public Moment f41680j;

    /* JADX INFO: renamed from: k */
    public String f41681k;

    /* JADX INFO: renamed from: l */
    public String f41682l;

    /* JADX INFO: renamed from: m */
    public int f41683m;

    /* JADX INFO: renamed from: n */
    public boolean f41684n;

    /* JADX INFO: renamed from: o */
    public int f41685o;

    public FeedListActivityTextWithLinkItem(Context context) {
        super(context);
        this.f41684n = true;
    }

    /* JADX INFO: renamed from: d */
    public final void m64260d(View view) {
        lch.m153683a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public Act m64261e() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: f */
    public final void m64262f() {
        this.f41676f.setText(this.f41680j.value);
        bnl0.m105524M(this.f41677g, !TextUtils.isEmpty(this.f41680j.hyperlink));
        m64269m(this.f41680j.media);
        bnl0.m105509E0(this.f41671a, new View.OnClickListener() { // from class: l.ich
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f114410a.m64264h(view);
            }
        });
        bnl0.m105509E0(this.f41677g, new View.OnClickListener() { // from class: l.jch
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120059a.m64265i(view);
            }
        });
        bnl0.m105509E0(this.f41678h, new View.OnClickListener() { // from class: l.kch
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f125063a.m64266j(view);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final void m64263g() {
        pf60[] pf60VarArrM151172J = {pf60.m172085a("moment_id", this.f41680j.f56859id), pf60.m172085a("owner_id", this.f41680j.owner), pf60.m172085a("order", Integer.valueOf(this.f41683m)), pf60.m172085a("moment_type", er60.m122104w().m122135y(this.f41680j)), pf60.m172085a("moment_distance", Long.valueOf(ksg.m151166G(this.f41680j))), pf60.m172085a("moment_create_time", Long.valueOf(ksg.m151164F(this.f41680j))), pf60.m172085a("owner_active_time", Long.valueOf(ksg.m151184S(FeedModule.f39703d.m145688e8(this.f41680j.owner))))};
        if (NullChecker.m82486a(this.f41680j.simpleActivity) && !TextUtils.isEmpty(this.f41680j.simpleActivity.f40083id)) {
            pf60VarArrM151172J = ksg.m151172J(pf60.m172085a(ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID, this.f41680j.simpleActivity.f40083id), pf60VarArrM151172J);
        }
        tfj0.m190940c("e_moment", this.f41682l, pf60VarArrM151172J);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m64264h(View view) {
        Intent intentM66018b;
        if (this.f41684n && (intentM66018b = MomentDetailAct.C11469a.m66017a(getContext()).m66022f(this.f41681k).m66029m(this.f41680j.f56859id).m66030n(this.f41680j.owner).m66036t(true).m66031o(this.f41680j.momentValue).m66018b()) != null) {
            m64261e().startActivity(intentM66018b);
            m64263g();
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m64265i(View view) {
        Spanned spannedFromHtml = Html.fromHtml(this.f41680j.hyperlink);
        URLSpan[] uRLSpanArr = (URLSpan[]) new SpannableStringBuilder(spannedFromHtml).getSpans(0, spannedFromHtml.length(), URLSpan.class);
        nae0.m162083m(m64261e(), Uri.parse("tantan://webview?url=" + uRLSpanArr[0].getURL()));
        m64263g();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m64266j(View view) {
        tfj0.m190940c("e_worldcup_moment_pic", this.f41682l, new pf60[0]);
        String strM173807b = null;
        String str = (NullChecker.m82486a(this.f41680j) && NullChecker.m82486a(this.f41680j.simpleActivity)) ? this.f41680j.simpleActivity.url : null;
        if (TextUtils.isEmpty(str)) {
            if (NullChecker.m82486a(this.f41680j) && NullChecker.m82486a(this.f41680j.simpleActivity)) {
                strM173807b = pu20.m173807b(this.f41680j.simpleActivity.f40083id);
            }
            str = strM173807b;
        }
        if (!TextUtils.isEmpty(str)) {
            m64267k(bnl0.m105508E(this), str);
        }
        m64263g();
    }

    /* JADX INFO: renamed from: k */
    public final void m64267k(Activity activity, String str) {
        if (activity == null || TextUtils.isEmpty(str)) {
            return;
        }
        Intent intentM81411Y1 = MkDlgWebViewAct.m81411Y1(activity, "", str);
        intentM81411Y1.putExtra("hideNavigationBar", true);
        intentM81411Y1.putExtra("skipLoading", true);
        intentM81411Y1.putExtra("transparent_status_bar", true);
        intentM81411Y1.putExtra("webviewColor", "transparent");
        intentM81411Y1.putExtra("hideNotch", true);
        activity.startActivity(intentM81411Y1);
    }

    /* JADX INFO: renamed from: l */
    public void m64268l(int i, Moment moment, String str, int i2, String str2) {
        this.f41681k = str;
        this.f41679i = i;
        this.f41680j = moment;
        this.f41683m = i2;
        this.f41682l = str2;
        m64262f();
        int iM175859d = 0;
        if (TextUtils.isEmpty(moment.feedTime) || i != 2) {
            bnl0.m105524M(this.f41672b, false);
            bnl0.m105540X(this.f41675e, this.f41685o);
        } else {
            bnl0.m105524M(this.f41672b, true);
            boolean zEquals = moment.feedTime.equals(FeedModule.f39700a.getString(R$string.f39924i2));
            VText vText = this.f41674d;
            if (zEquals) {
                bnl0.m105524M(vText, false);
                this.f41673c.setText(moment.feedTime);
                TextView textView = this.f41673c;
                textView.setTextSize(cai.m108498f(textView, qa00.m175859d(55.0f), moment.feedTime, 17.0f));
            } else {
                bnl0.m105524M(vText, true);
                String[] strArrSplit = moment.feedTime.split("/");
                this.f41673c.setTextSize(20.0f);
                this.f41673c.setText(strArrSplit[0]);
                this.f41674d.setText(strArrSplit[1]);
            }
            if (i2 == 0) {
                bnl0.m105540X(this.f41673c, qa00.m175859d(24.0f));
                bnl0.m105540X(this.f41674d, qa00.m175859d(24.0f));
                bnl0.m105540X(this.f41675e, qa00.m175859d(28.0f));
            } else {
                bnl0.m105540X(this.f41675e, this.f41685o);
                bnl0.m105540X(this.f41673c, -qa00.m175859d(4.0f));
                bnl0.m105540X(this.f41674d, -qa00.m175859d(4.0f));
            }
        }
        if (i == 2) {
            iM175859d = qa00.m175859d(16.0f);
        } else if (m64261e() instanceof MomentDetailAct) {
            iM175859d = qa00.m175859d(8.0f);
        }
        bnl0.m105554f0(this, iM175859d);
    }

    /* JADX INFO: renamed from: m */
    public final void m64269m(List<Media> list) {
        if (jyb.m147479J(list)) {
            bnl0.m105524M(this.f41671a, false);
            return;
        }
        Media media = list.get(0);
        Picture picture = media instanceof Picture ? (Picture) media : null;
        if (NullChecker.m82487b(picture)) {
            VDraweeView vDraweeView = (VDraweeView) this.f41678h.getChildAt(0);
            if (!TEnum.equals(picture.status, "raw") && !TextUtils.isEmpty(picture.url)) {
                uqb0.f180374G.m127125Q0(vDraweeView, picture.calculatedWidth(bnl0.m105592y0() - qa00.m175859d(80.0f)));
                vDraweeView.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture.url));
            }
            vDraweeView.getHierarchy().m207045H(RoundingParams.m8303c(qa00.m175859d(10.0f)).m8323w(RoundingParams.RoundingMethod.BITMAP_ONLY));
        }
    }

    /* JADX INFO: renamed from: n */
    public void m64270n(int i) {
        bnl0.m105505C0(this.f41678h, (int) (i * 0.63728815f));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m64260d(this);
        this.f41685o = ((FrameLayout.LayoutParams) this.f41675e.getLayoutParams()).topMargin;
        m64270n(bnl0.m105592y0() - qa00.m175859d(80.0f));
    }

    public void setNeedInnerClick(boolean z) {
        this.f41684n = z;
    }

    public FeedListActivityTextWithLinkItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41684n = true;
    }

    public FeedListActivityTextWithLinkItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41684n = true;
    }
}
