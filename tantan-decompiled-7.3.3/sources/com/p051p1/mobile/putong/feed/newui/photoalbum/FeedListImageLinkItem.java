package com.p051p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.net.Uri;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.api.Api;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.TopicMomentIdBox;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.RawFeed;
import com.p051p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.p106mm.opensdk.constants.ConstantsAPI;
import java.util.List;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.cai;
import p153l.dmk0;
import p153l.er60;
import p153l.jyb;
import p153l.ksg;
import p153l.lbc0;
import p153l.orb0;
import p153l.otg;
import p153l.pf60;
import p153l.qa00;
import p153l.qch;
import p153l.ryh;
import p153l.tfj0;
import p153l.uqb0;

/* JADX INFO: loaded from: classes13.dex */
public class FeedListImageLinkItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FeedListImageLinkItem f41686a;

    /* JADX INFO: renamed from: b */
    public VLinear f41687b;

    /* JADX INFO: renamed from: c */
    public TextView f41688c;

    /* JADX INFO: renamed from: d */
    public VText f41689d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f41690e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f41691f;

    /* JADX INFO: renamed from: g */
    public VText f41692g;

    /* JADX INFO: renamed from: h */
    public VText f41693h;

    /* JADX INFO: renamed from: i */
    public int f41694i;

    /* JADX INFO: renamed from: j */
    public Moment f41695j;

    /* JADX INFO: renamed from: k */
    public RawFeed f41696k;

    /* JADX INFO: renamed from: l */
    public String f41697l;

    /* JADX INFO: renamed from: m */
    public int f41698m;

    /* JADX INFO: renamed from: n */
    public int f41699n;

    /* JADX INFO: renamed from: o */
    public boolean f41700o;

    /* JADX INFO: renamed from: p */
    public int f41701p;

    /* JADX INFO: renamed from: q */
    public String f41702q;

    public FeedListImageLinkItem(Context context) {
        super(context);
        this.f41699n = -1;
        this.f41700o = true;
    }

    /* JADX INFO: renamed from: c */
    public final void m64273c(View view) {
        qch.m176123a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public Act m64274d() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: e */
    public final void m64275e(float f) {
        int iM105592y0 = bnl0.m105592y0() - qa00.m175859d(104.0f);
        float f2 = iM105592y0 * f;
        int iM175859d = qa00.m175859d(24.0f) + iM105592y0;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f41690e.getLayoutParams();
        marginLayoutParams.width = iM175859d;
        marginLayoutParams.leftMargin = qa00.m175859d(this.f41699n == -1 ? 64.0f : 12.0f);
        this.f41690e.setLayoutParams(marginLayoutParams);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f41691f.getLayoutParams();
        marginLayoutParams2.width = iM105592y0;
        marginLayoutParams2.height = (int) f2;
        this.f41691f.setLayoutParams(marginLayoutParams2);
    }

    /* JADX INFO: renamed from: f */
    public final void m64276f() {
        Picture picture;
        Dimension dimension;
        int i;
        m64280j();
        int iM105592y0 = bnl0.m105592y0() - qa00.m175859d(125.0f);
        List<Media> list = this.f41695j.media;
        if (list.size() > 0) {
            Media media = list.get(0);
            if (media instanceof Picture) {
                picture = (Picture) media;
            } else {
                picture = media instanceof Video ? ((Video) media).cover : null;
            }
            if (NullChecker.m82487b(picture) && (i = (dimension = picture.size).width) > 0) {
                m64275e(dimension.height / i);
                Dimension dimension2 = picture.size;
                Point pointM116963b = dmk0.m116963b(iM105592y0, new Point(dimension2.width, dimension2.height));
                if (!TEnum.equals(picture.status, "raw") && !TextUtils.isEmpty(picture.url)) {
                    uqb0.f180374G.m127125Q0(this.f41691f, picture.calculatedWidth(pointM116963b.x));
                }
            }
        }
        if (this.f41695j.hyperlink.contains("type=\"img\"")) {
            this.f41693h.setText(new SpannableStringBuilder(Html.fromHtml(this.f41695j.hyperlink)).toString());
            this.f41692g.setMaxLines(2);
            this.f41692g.setEllipsize(TextUtils.TruncateAt.END);
            tfj0.m190942e("e_moment_christmas", this.f41702q, pf60.m172085a("moments_user_id", this.f41695j.owner));
        } else {
            this.f41692g.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
            this.f41693h.setText("点击查看");
        }
        this.f41690e.setOnClickListener(new View.OnClickListener() { // from class: l.och
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f146706a.m64281k(view);
            }
        });
        this.f41686a.setOnClickListener(new View.OnClickListener() { // from class: l.pch
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f151575a.m64282l(view);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final void m64277g() {
        if (!TextUtils.isEmpty(this.f41695j.simpleActivity.name)) {
            m64279i();
            m64278h();
        } else if (this.f41695j.hyperlink.contains("type=\"img\"")) {
            tfj0.m190940c("e_moment_christmas", this.f41702q, pf60.m172085a("moments_user_id", this.f41695j.owner));
        } else {
            m64278h();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m64278h() {
        String str = this.f41702q;
        pf60 pf60VarM172085a = pf60.m172085a("qa_optional", this.f41695j.shareMyVote ? "1" : "0");
        List<TopicMomentIdBox> list = this.f41695j.topics;
        tfj0.m190940c("e_moment", str, pf60VarM172085a, pf60.m172085a("topic_id", (list == null || list.size() == 0) ? "" : this.f41695j.topics.get(0).f39672id), pf60.m172085a("moment_id", this.f41695j.f56859id), pf60.m172085a("owner_id", this.f41695j.owner), pf60.m172085a("order", Integer.valueOf(this.f41698m)), pf60.m172085a("moment_type", er60.m122104w().m122135y(this.f41695j)), pf60.m172085a("moment_distance", Long.valueOf(ksg.m151166G(this.f41695j))), pf60.m172085a("moment_create_time", Long.valueOf(ksg.m151164F(this.f41695j))), pf60.m172085a("owner_active_time", Long.valueOf(ksg.m151184S(FeedModule.f39703d.m145688e8(this.f41695j.owner)))));
    }

    /* JADX INFO: renamed from: i */
    public final void m64279i() {
        if (TextUtils.isEmpty(this.f41695j.simpleActivity.name)) {
            return;
        }
        tfj0.m190940c("e_activity_moment", this.f41702q, jyb.m147494Y(ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID, this.f41695j.simpleActivity.f40083id), jyb.m147494Y("activity_name", this.f41695j.simpleActivity.name), jyb.m147494Y("moment_show_type", "card"), jyb.m147494Y("moments_user_id", this.f41695j.owner));
    }

    /* JADX INFO: renamed from: j */
    public final void m64280j() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f41695j.value);
        VText vText = this.f41692g;
        if (zIsEmpty) {
            vText.setVisibility(8);
            return;
        }
        vText.setVisibility(0);
        TextView textView = new TextView(getContext());
        textView.setText("活动");
        textView.setTextSize(10.0f);
        textView.getPaint().setFakeBoldText(true);
        textView.setTextColor(Color.parseColor("#ffffff"));
        textView.setHeight(qa00.m175859d(14.0f));
        textView.setPadding(qa00.m175859d(4.0f), 0, qa00.m175859d(4.0f), 0);
        textView.setGravity(17);
        textView.setBackgroundResource(lbc0.f131174x);
        textView.setDrawingCacheEnabled(true);
        textView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        textView.layout(0, 0, textView.getMeasuredWidth(), textView.getMeasuredHeight());
        Bitmap drawingCache = textView.getDrawingCache();
        SpannableString spannableString = new SpannableString("   " + this.f41695j.value);
        spannableString.setSpan(new otg(getContext(), drawingCache), 0, 1, 33);
        this.f41692g.setText(spannableString);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m64281k(View view) {
        m64277g();
        if (!TextUtils.isEmpty(this.f41695j.deeplink)) {
            ryh.m183607b(m64274d(), Uri.parse(this.f41695j.deeplink));
            return;
        }
        boolean zContains = this.f41695j.hyperlink.contains("type=\"img\"");
        Moment moment = this.f41695j;
        if (zContains) {
            Spanned spannedFromHtml = Html.fromHtml(moment.hyperlink);
            m64274d().startActivity(orb0.m168893j(m64274d(), "", ((URLSpan[]) new SpannableStringBuilder(spannedFromHtml).getSpans(0, spannedFromHtml.length(), URLSpan.class))[0].getURL()));
        } else if (TextUtils.isEmpty(moment.landingPage) || !this.f41695j.landingPage.startsWith("tantan")) {
            m64274d().startActivity(orb0.m168893j(m64274d(), m64274d().getResources().getString(R$string.f39940k4), this.f41695j.landingPage));
        } else {
            ryh.m183607b(m64274d(), Uri.parse(this.f41695j.landingPage));
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m64282l(View view) {
        Intent intentM66018b;
        if (this.f41700o && (intentM66018b = MomentDetailAct.C11469a.m66017a(getContext()).m66022f(this.f41697l).m66029m(this.f41695j.f56859id).m66030n(this.f41695j.owner).m66036t(true).m66031o(this.f41695j.momentValue).m66035s(this.f41696k).m66018b()) != null) {
            m64274d().startActivity(intentM66018b);
            m64278h();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m64283m(int i, Moment moment, String str, int i2, int i3, String str2) {
        this.f41699n = i3;
        m64284n(i, moment, str, i2, str2, null);
    }

    /* JADX INFO: renamed from: n */
    public void m64284n(int i, Moment moment, String str, int i2, String str2, RawFeed rawFeed) {
        this.f41697l = str;
        this.f41694i = i;
        this.f41695j = moment;
        this.f41696k = rawFeed;
        this.f41698m = i2;
        this.f41702q = str2;
        m64276f();
        int iM175859d = 0;
        if (TextUtils.isEmpty(moment.feedTime) || i != 2) {
            bnl0.m105524M(this.f41687b, false);
            bnl0.m105540X(this.f41690e, this.f41701p);
        } else {
            bnl0.m105524M(this.f41687b, true);
            boolean zEquals = moment.feedTime.equals(FeedModule.f39700a.getString(R$string.f39924i2));
            VText vText = this.f41689d;
            if (zEquals) {
                bnl0.m105524M(vText, false);
                this.f41688c.setText(moment.feedTime);
                TextView textView = this.f41688c;
                textView.setTextSize(cai.m108498f(textView, qa00.m175859d(55.0f), moment.feedTime, 17.0f));
            } else {
                bnl0.m105524M(vText, true);
                String[] strArrSplit = moment.feedTime.split("/");
                this.f41688c.setTextSize(20.0f);
                this.f41688c.setText(strArrSplit[0]);
                this.f41689d.setText(strArrSplit[1]);
            }
            TextView textView2 = this.f41688c;
            if (i2 == 0) {
                bnl0.m105540X(textView2, qa00.m175859d(24.0f));
                bnl0.m105540X(this.f41689d, qa00.m175859d(24.0f));
                bnl0.m105540X(this.f41690e, qa00.m175859d(28.0f));
            } else {
                bnl0.m105540X(textView2, -qa00.m175859d(4.0f));
                bnl0.m105540X(this.f41689d, -qa00.m175859d(4.0f));
                bnl0.m105540X(this.f41690e, this.f41701p);
            }
        }
        if (i == 2) {
            iM175859d = qa00.m175859d(16.0f);
        } else if (m64274d() instanceof MomentDetailAct) {
            iM175859d = qa00.m175859d(8.0f);
        }
        bnl0.m105554f0(this, iM175859d);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m64273c(this);
        this.f41701p = ((FrameLayout.LayoutParams) this.f41690e.getLayoutParams()).topMargin;
        TextPaint paint = this.f41693h.getPaint();
        if (NullChecker.m82486a(paint)) {
            paint.setFakeBoldText(true);
        }
        this.f41692g.setTypeface(null, 1);
        this.f41693h.setTypeface(null, 1);
    }

    public void setNeedInnerClick(boolean z) {
        this.f41700o = z;
    }

    public FeedListImageLinkItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41699n = -1;
        this.f41700o = true;
    }

    public FeedListImageLinkItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41699n = -1;
        this.f41700o = true;
    }
}
