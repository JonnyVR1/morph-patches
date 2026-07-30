package com.p046p1.mobile.putong.feed.newui.photoalbum;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.TopicMomentIdBox;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.RawFeed;
import com.p046p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.p101mm.opensdk.constants.ConstantsAPI;
import java.util.List;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.bbh;
import p149l.cxh;
import p149l.f3c0;
import p149l.j760;
import p149l.kjb0;
import p149l.n8i;
import p149l.p6j0;
import p149l.qib0;
import p149l.t100;
import p149l.vqg;
import p149l.vwb;
import p149l.xck0;
import p149l.xdl0;
import p149l.zi60;
import p149l.zrg;

/* JADX INFO: loaded from: classes12.dex */
public class FeedListImageLinkItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FeedListImageLinkItem f40838a;

    /* JADX INFO: renamed from: b */
    public VLinear f40839b;

    /* JADX INFO: renamed from: c */
    public TextView f40840c;

    /* JADX INFO: renamed from: d */
    public VText f40841d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f40842e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f40843f;

    /* JADX INFO: renamed from: g */
    public VText f40844g;

    /* JADX INFO: renamed from: h */
    public VText f40845h;

    /* JADX INFO: renamed from: i */
    public int f40846i;

    /* JADX INFO: renamed from: j */
    public Moment f40847j;

    /* JADX INFO: renamed from: k */
    public RawFeed f40848k;

    /* JADX INFO: renamed from: l */
    public String f40849l;

    /* JADX INFO: renamed from: m */
    public int f40850m;

    /* JADX INFO: renamed from: n */
    public int f40851n;

    /* JADX INFO: renamed from: o */
    public boolean f40852o;

    /* JADX INFO: renamed from: p */
    public int f40853p;

    /* JADX INFO: renamed from: q */
    public String f40854q;

    public FeedListImageLinkItem(Context context) {
        super(context);
        this.f40851n = -1;
        this.f40852o = true;
    }

    /* JADX INFO: renamed from: c */
    public final void m63090c(View view) {
        bbh.m100957a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public Act m63091d() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: e */
    public final void m63092e(float f) {
        int iM208412y0 = xdl0.m208412y0() - t100.m186890d(104.0f);
        float f2 = iM208412y0 * f;
        int iM186890d = t100.m186890d(24.0f) + iM208412y0;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f40842e.getLayoutParams();
        marginLayoutParams.width = iM186890d;
        marginLayoutParams.leftMargin = t100.m186890d(this.f40851n == -1 ? 64.0f : 12.0f);
        this.f40842e.setLayoutParams(marginLayoutParams);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f40843f.getLayoutParams();
        marginLayoutParams2.width = iM208412y0;
        marginLayoutParams2.height = (int) f2;
        this.f40843f.setLayoutParams(marginLayoutParams2);
    }

    /* JADX INFO: renamed from: f */
    public final void m63093f() {
        Picture picture;
        Dimension dimension;
        int i;
        m63097j();
        int iM208412y0 = xdl0.m208412y0() - t100.m186890d(125.0f);
        List<Media> list = this.f40847j.media;
        if (list.size() > 0) {
            Media media = list.get(0);
            if (media instanceof Picture) {
                picture = (Picture) media;
            } else {
                picture = media instanceof Video ? ((Video) media).cover : null;
            }
            if (NullChecker.m81304b(picture) && (i = (dimension = picture.size).width) > 0) {
                m63092e(dimension.height / i);
                Dimension dimension2 = picture.size;
                Point pointM208121b = xck0.m208121b(iM208412y0, new Point(dimension2.width, dimension2.height));
                if (!TEnum.equals(picture.status, "raw") && !TextUtils.isEmpty(picture.url)) {
                    qib0.f154691G.m102341Q0(this.f40843f, picture.calculatedWidth(pointM208121b.x));
                }
            }
        }
        if (this.f40847j.hyperlink.contains("type=\"img\"")) {
            this.f40845h.setText(new SpannableStringBuilder(Html.fromHtml(this.f40847j.hyperlink)).toString());
            this.f40844g.setMaxLines(2);
            this.f40844g.setEllipsize(TextUtils.TruncateAt.END);
            p6j0.m167671e("e_moment_christmas", this.f40854q, j760.m140076a("moments_user_id", this.f40847j.owner));
        } else {
            this.f40844g.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
            this.f40845h.setText("点击查看");
        }
        this.f40842e.setOnClickListener(new View.OnClickListener() { // from class: l.zah
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f202362a.m63098k(view);
            }
        });
        this.f40838a.setOnClickListener(new View.OnClickListener() { // from class: l.abh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f68667a.m63099l(view);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final void m63094g() {
        if (!TextUtils.isEmpty(this.f40847j.simpleActivity.name)) {
            m63096i();
            m63095h();
        } else if (this.f40847j.hyperlink.contains("type=\"img\"")) {
            p6j0.m167669c("e_moment_christmas", this.f40854q, j760.m140076a("moments_user_id", this.f40847j.owner));
        } else {
            m63095h();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m63095h() {
        String str = this.f40854q;
        j760 j760VarM140076a = j760.m140076a("qa_optional", this.f40847j.shareMyVote ? "1" : "0");
        List<TopicMomentIdBox> list = this.f40847j.topics;
        p6j0.m167669c("e_moment", str, j760VarM140076a, j760.m140076a("topic_id", (list == null || list.size() == 0) ? "" : this.f40847j.topics.get(0).f38824id), j760.m140076a("moment_id", this.f40847j.f56011id), j760.m140076a("owner_id", this.f40847j.owner), j760.m140076a("order", Integer.valueOf(this.f40850m)), j760.m140076a("moment_type", zi60.m218961w().m218992y(this.f40847j)), j760.m140076a("moment_distance", Long.valueOf(vqg.m199507G(this.f40847j))), j760.m140076a("moment_create_time", Long.valueOf(vqg.m199505F(this.f40847j))), j760.m140076a("owner_active_time", Long.valueOf(vqg.m199525S(FeedModule.f38855d.m209447e8(this.f40847j.owner)))));
    }

    /* JADX INFO: renamed from: i */
    public final void m63096i() {
        if (TextUtils.isEmpty(this.f40847j.simpleActivity.name)) {
            return;
        }
        p6j0.m167669c("e_activity_moment", this.f40854q, vwb.m200311Y(ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID, this.f40847j.simpleActivity.f39235id), vwb.m200311Y("activity_name", this.f40847j.simpleActivity.name), vwb.m200311Y("moment_show_type", "card"), vwb.m200311Y("moments_user_id", this.f40847j.owner));
    }

    /* JADX INFO: renamed from: j */
    public final void m63097j() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f40847j.value);
        VText vText = this.f40844g;
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
        textView.setHeight(t100.m186890d(14.0f));
        textView.setPadding(t100.m186890d(4.0f), 0, t100.m186890d(4.0f), 0);
        textView.setGravity(17);
        textView.setBackgroundResource(f3c0.f94656x);
        textView.setDrawingCacheEnabled(true);
        textView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        textView.layout(0, 0, textView.getMeasuredWidth(), textView.getMeasuredHeight());
        Bitmap drawingCache = textView.getDrawingCache();
        SpannableString spannableString = new SpannableString("   " + this.f40847j.value);
        spannableString.setSpan(new zrg(getContext(), drawingCache), 0, 1, 33);
        this.f40844g.setText(spannableString);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m63098k(View view) {
        m63094g();
        if (!TextUtils.isEmpty(this.f40847j.deeplink)) {
            cxh.m109100b(m63091d(), Uri.parse(this.f40847j.deeplink));
            return;
        }
        boolean zContains = this.f40847j.hyperlink.contains("type=\"img\"");
        Moment moment = this.f40847j;
        if (zContains) {
            Spanned spannedFromHtml = Html.fromHtml(moment.hyperlink);
            m63091d().startActivity(kjb0.m146199j(m63091d(), "", ((URLSpan[]) new SpannableStringBuilder(spannedFromHtml).getSpans(0, spannedFromHtml.length(), URLSpan.class))[0].getURL()));
        } else if (TextUtils.isEmpty(moment.landingPage) || !this.f40847j.landingPage.startsWith("tantan")) {
            m63091d().startActivity(kjb0.m146199j(m63091d(), m63091d().getResources().getString(R$string.f39092k4), this.f40847j.landingPage));
        } else {
            cxh.m109100b(m63091d(), Uri.parse(this.f40847j.landingPage));
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m63099l(View view) {
        Intent intentM64835b;
        if (this.f40852o && (intentM64835b = MomentDetailAct.C11306a.m64834a(getContext()).m64839f(this.f40849l).m64846m(this.f40847j.f56011id).m64847n(this.f40847j.owner).m64853t(true).m64848o(this.f40847j.momentValue).m64852s(this.f40848k).m64835b()) != null) {
            m63091d().startActivity(intentM64835b);
            m63095h();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m63100m(int i, Moment moment, String str, int i2, int i3, String str2) {
        this.f40851n = i3;
        m63101n(i, moment, str, i2, str2, null);
    }

    /* JADX INFO: renamed from: n */
    public void m63101n(int i, Moment moment, String str, int i2, String str2, RawFeed rawFeed) {
        this.f40849l = str;
        this.f40846i = i;
        this.f40847j = moment;
        this.f40848k = rawFeed;
        this.f40850m = i2;
        this.f40854q = str2;
        m63093f();
        int iM186890d = 0;
        if (TextUtils.isEmpty(moment.feedTime) || i != 2) {
            xdl0.m208344M(this.f40839b, false);
            xdl0.m208360X(this.f40842e, this.f40853p);
        } else {
            xdl0.m208344M(this.f40839b, true);
            boolean zEquals = moment.feedTime.equals(FeedModule.f38852a.getString(R$string.f39076i2));
            VText vText = this.f40841d;
            if (zEquals) {
                xdl0.m208344M(vText, false);
                this.f40840c.setText(moment.feedTime);
                TextView textView = this.f40840c;
                textView.setTextSize(n8i.m158499f(textView, t100.m186890d(55.0f), moment.feedTime, 17.0f));
            } else {
                xdl0.m208344M(vText, true);
                String[] strArrSplit = moment.feedTime.split("/");
                this.f40840c.setTextSize(20.0f);
                this.f40840c.setText(strArrSplit[0]);
                this.f40841d.setText(strArrSplit[1]);
            }
            TextView textView2 = this.f40840c;
            if (i2 == 0) {
                xdl0.m208360X(textView2, t100.m186890d(24.0f));
                xdl0.m208360X(this.f40841d, t100.m186890d(24.0f));
                xdl0.m208360X(this.f40842e, t100.m186890d(28.0f));
            } else {
                xdl0.m208360X(textView2, -t100.m186890d(4.0f));
                xdl0.m208360X(this.f40841d, -t100.m186890d(4.0f));
                xdl0.m208360X(this.f40842e, this.f40853p);
            }
        }
        if (i == 2) {
            iM186890d = t100.m186890d(16.0f);
        } else if (m63091d() instanceof MomentDetailAct) {
            iM186890d = t100.m186890d(8.0f);
        }
        xdl0.m208374f0(this, iM186890d);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m63090c(this);
        this.f40853p = ((FrameLayout.LayoutParams) this.f40842e.getLayoutParams()).topMargin;
        TextPaint paint = this.f40845h.getPaint();
        if (NullChecker.m81303a(paint)) {
            paint.setFakeBoldText(true);
        }
        this.f40844g.setTypeface(null, 1);
        this.f40845h.setTypeface(null, 1);
    }

    public void setNeedInnerClick(boolean z) {
        this.f40852o = z;
    }

    public FeedListImageLinkItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40851n = -1;
        this.f40852o = true;
    }

    public FeedListImageLinkItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40851n = -1;
        this.f40852o = true;
    }
}
