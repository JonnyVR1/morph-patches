package com.p000p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Typeface;
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
import com.p000p1.mobile.putong.data.Dimension;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.MediaLocalStatus;
import com.p000p1.mobile.putong.data.Order;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.TopicMomentIdBox;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentMessageType;
import com.p000p1.mobile.putong.feed.data.RawFeed;
import com.p000p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.j760;
import l.qib0;
import l.t100;
import l.vwb;
import l.xck0;
import l.xdl0;
import p007l.bbh;
import p007l.cxh;
import p007l.f3c0;
import p007l.kjb0;
import p007l.n8i;
import p007l.p6j0;
import p007l.vqg;
import p007l.zi60;
import p007l.zrg;
import v.VDraweeView;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedListImageLinkItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FeedListImageLinkItem f2299a;

    /* JADX INFO: renamed from: b */
    public VLinear f2300b;

    /* JADX INFO: renamed from: c */
    public TextView f2301c;

    /* JADX INFO: renamed from: d */
    public VText f2302d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f2303e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f2304f;

    /* JADX INFO: renamed from: g */
    public VText f2305g;

    /* JADX INFO: renamed from: h */
    public VText f2306h;

    /* JADX INFO: renamed from: i */
    public int f2307i;

    /* JADX INFO: renamed from: j */
    public Moment f2308j;

    /* JADX INFO: renamed from: k */
    public RawFeed f2309k;

    /* JADX INFO: renamed from: l */
    public String f2310l;

    /* JADX INFO: renamed from: m */
    public int f2311m;

    /* JADX INFO: renamed from: n */
    public int f2312n;

    /* JADX INFO: renamed from: o */
    public boolean f2313o;

    /* JADX INFO: renamed from: p */
    public int f2314p;

    /* JADX INFO: renamed from: q */
    public String f2315q;

    public FeedListImageLinkItem(Context context) {
        super(context);
        this.f2312n = -1;
        this.f2313o = true;
    }

    /* JADX INFO: renamed from: c */
    public final void m4106c(View view) {
        bbh.m8780a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public Act m4107d() {
        return getContext();
    }

    /* JADX INFO: renamed from: e */
    public final void m4108e(float f) {
        int iY0 = xdl0.y0() - t100.d(104.0f);
        float f2 = iY0 * f;
        int iD = t100.d(24.0f) + iY0;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f2303e.getLayoutParams();
        marginLayoutParams.width = iD;
        marginLayoutParams.leftMargin = t100.d(this.f2312n == -1 ? 64.0f : 12.0f);
        this.f2303e.setLayoutParams(marginLayoutParams);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f2304f.getLayoutParams();
        marginLayoutParams2.width = iY0;
        marginLayoutParams2.height = (int) f2;
        this.f2304f.setLayoutParams(marginLayoutParams2);
    }

    /* JADX INFO: renamed from: f */
    public final void m4109f() {
        Picture picture;
        Dimension dimension;
        int i;
        m4113j();
        int iY0 = xdl0.y0() - t100.d(125.0f);
        List<Media> list = this.f2308j.media;
        if (list.size() > 0) {
            Media media = list.get(0);
            if (media instanceof Picture) {
                picture = (Picture) media;
            } else {
                picture = media instanceof Video ? ((Video) media).cover : null;
            }
            if (NullChecker.b(picture) && (i = (dimension = picture.size).width) > 0) {
                m4108e(dimension.height / i);
                Dimension dimension2 = picture.size;
                Point pointB = xck0.b(iY0, new Point(dimension2.width, dimension2.height));
                if (!TEnum.equals(picture.status, MediaLocalStatus.raw) && !TextUtils.isEmpty(picture.url)) {
                    qib0.G.Q0(this.f2304f, picture.calculatedWidth(pointB.x));
                }
            }
        }
        if (this.f2308j.hyperlink.contains("type=\"img\"")) {
            this.f2306h.setText(new SpannableStringBuilder(Html.fromHtml(this.f2308j.hyperlink)).toString());
            this.f2305g.setMaxLines(2);
            this.f2305g.setEllipsize(TextUtils.TruncateAt.END);
            p6j0.m12915e("e_moment_christmas", this.f2315q, j760.a("moments_user_id", this.f2308j.owner));
        } else {
            this.f2305g.setMaxLines(Integer.MAX_VALUE);
            this.f2306h.setText("点击查看");
        }
        this.f2303e.setOnClickListener(new View.OnClickListener() { // from class: l.zah
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15680a.m4114k(view);
            }
        });
        this.f2299a.setOnClickListener(new View.OnClickListener() { // from class: l.abh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5696a.m4115l(view);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final void m4110g() {
        if (!TextUtils.isEmpty(this.f2308j.simpleActivity.name)) {
            m4112i();
            m4111h();
        } else if (this.f2308j.hyperlink.contains("type=\"img\"")) {
            p6j0.m12913c("e_moment_christmas", this.f2315q, j760.a("moments_user_id", this.f2308j.owner));
        } else {
            m4111h();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m4111h() {
        String str = this.f2315q;
        j760 j760VarA = j760.a("qa_optional", this.f2308j.shareMyVote ? "1" : "0");
        List<TopicMomentIdBox> list = this.f2308j.topics;
        p6j0.m12913c("e_moment", str, j760VarA, j760.a("topic_id", (list == null || list.size() == 0) ? "" : this.f2308j.topics.get(0).f285id), j760.a("moment_id", ((DbObject) this.f2308j).id), j760.a("owner_id", this.f2308j.owner), j760.a(Order.TYPE, Integer.valueOf(this.f2311m)), j760.a("moment_type", zi60.m17436w().m17467y(this.f2308j)), j760.a("moment_distance", Long.valueOf(vqg.m15477G(this.f2308j))), j760.a("moment_create_time", Long.valueOf(vqg.m15475F(this.f2308j))), j760.a("owner_active_time", Long.valueOf(vqg.m15495S(FeedModule.f316d.m16628e8(this.f2308j.owner)))));
    }

    /* JADX INFO: renamed from: i */
    public final void m4112i() {
        if (TextUtils.isEmpty(this.f2308j.simpleActivity.name)) {
            return;
        }
        p6j0.m12913c("e_activity_moment", this.f2315q, vwb.Y("activity_id", this.f2308j.simpleActivity.f696id), vwb.Y("activity_name", this.f2308j.simpleActivity.name), vwb.Y("moment_show_type", MomentMessageType.card), vwb.Y("moments_user_id", this.f2308j.owner));
    }

    /* JADX INFO: renamed from: j */
    public final void m4113j() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f2308j.value);
        VText vText = this.f2305g;
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
        textView.setHeight(t100.d(14.0f));
        textView.setPadding(t100.d(4.0f), 0, t100.d(4.0f), 0);
        textView.setGravity(17);
        textView.setBackgroundResource(f3c0.f7939x);
        textView.setDrawingCacheEnabled(true);
        textView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        textView.layout(0, 0, textView.getMeasuredWidth(), textView.getMeasuredHeight());
        Bitmap drawingCache = textView.getDrawingCache();
        SpannableString spannableString = new SpannableString("   " + this.f2308j.value);
        spannableString.setSpan(new zrg(getContext(), drawingCache), 0, 1, 33);
        this.f2305g.setText(spannableString);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m4114k(View view) {
        m4110g();
        if (!TextUtils.isEmpty(this.f2308j.deeplink)) {
            cxh.m9252b(m4107d(), Uri.parse(this.f2308j.deeplink));
            return;
        }
        boolean zContains = this.f2308j.hyperlink.contains("type=\"img\"");
        Moment moment = this.f2308j;
        if (zContains) {
            Spanned spannedFromHtml = Html.fromHtml(moment.hyperlink);
            m4107d().startActivity(kjb0.m11458j(m4107d(), "", ((URLSpan[]) new SpannableStringBuilder(spannedFromHtml).getSpans(0, spannedFromHtml.length(), URLSpan.class))[0].getURL()));
        } else if (TextUtils.isEmpty(moment.landingPage) || !this.f2308j.landingPage.startsWith("tantan")) {
            m4107d().startActivity(kjb0.m11458j(m4107d(), m4107d().getResources().getString(R$string.f553k4), this.f2308j.landingPage));
        } else {
            cxh.m9252b(m4107d(), Uri.parse(this.f2308j.landingPage));
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m4115l(View view) {
        Intent intentM5932b;
        if (this.f2313o && (intentM5932b = MomentDetailAct.C2150a.m5931a(getContext()).m5936f(this.f2310l).m5943m(((DbObject) this.f2308j).id).m5944n(this.f2308j.owner).m5950t(true).m5945o(this.f2308j.momentValue).m5949s(this.f2309k).m5932b()) != null) {
            m4107d().startActivity(intentM5932b);
            m4111h();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m4116m(int i, Moment moment, String str, int i2, int i3, String str2) {
        this.f2312n = i3;
        m4117n(i, moment, str, i2, str2, null);
    }

    /* JADX INFO: renamed from: n */
    public void m4117n(int i, Moment moment, String str, int i2, String str2, RawFeed rawFeed) {
        this.f2310l = str;
        this.f2307i = i;
        this.f2308j = moment;
        this.f2309k = rawFeed;
        this.f2311m = i2;
        this.f2315q = str2;
        m4109f();
        int iD = 0;
        if (TextUtils.isEmpty(moment.feedTime) || i != 2) {
            xdl0.M(this.f2300b, false);
            xdl0.X(this.f2303e, this.f2314p);
        } else {
            xdl0.M(this.f2300b, true);
            boolean zEquals = moment.feedTime.equals(FeedModule.f313a.getString(R$string.f537i2));
            VText vText = this.f2302d;
            if (zEquals) {
                xdl0.M(vText, false);
                this.f2301c.setText(moment.feedTime);
                TextView textView = this.f2301c;
                textView.setTextSize(n8i.m12112f(textView, t100.d(55.0f), moment.feedTime, 17.0f));
            } else {
                xdl0.M(vText, true);
                String[] strArrSplit = moment.feedTime.split("/");
                this.f2301c.setTextSize(20.0f);
                this.f2301c.setText(strArrSplit[0]);
                this.f2302d.setText(strArrSplit[1]);
            }
            TextView textView2 = this.f2301c;
            if (i2 == 0) {
                xdl0.X(textView2, t100.d(24.0f));
                xdl0.X(this.f2302d, t100.d(24.0f));
                xdl0.X(this.f2303e, t100.d(28.0f));
            } else {
                xdl0.X(textView2, -t100.d(4.0f));
                xdl0.X(this.f2302d, -t100.d(4.0f));
                xdl0.X(this.f2303e, this.f2314p);
            }
        }
        if (i == 2) {
            iD = t100.d(16.0f);
        } else if (m4107d() instanceof MomentDetailAct) {
            iD = t100.d(8.0f);
        }
        xdl0.f0(this, iD);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m4106c(this);
        this.f2314p = ((FrameLayout.LayoutParams) this.f2303e.getLayoutParams()).topMargin;
        TextPaint paint = this.f2306h.getPaint();
        if (NullChecker.a(paint)) {
            paint.setFakeBoldText(true);
        }
        this.f2305g.setTypeface((Typeface) null, 1);
        this.f2306h.setTypeface((Typeface) null, 1);
    }

    public void setNeedInnerClick(boolean z) {
        this.f2313o = z;
    }

    public FeedListImageLinkItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2312n = -1;
        this.f2313o = true;
    }

    public FeedListImageLinkItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2312n = -1;
        this.f2313o = true;
    }
}
