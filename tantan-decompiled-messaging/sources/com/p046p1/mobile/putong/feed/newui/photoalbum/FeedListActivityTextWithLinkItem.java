package com.p046p1.mobile.putong.feed.newui.photoalbum;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkDlgWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.p101mm.opensdk.constants.ConstantsAPI;
import java.util.List;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;
import p149l.fm20;
import p149l.j2e0;
import p149l.j760;
import p149l.n8i;
import p149l.p6j0;
import p149l.qib0;
import p149l.t100;
import p149l.vqg;
import p149l.vwb;
import p149l.wah;
import p149l.xdl0;
import p149l.zi60;

/* JADX INFO: loaded from: classes12.dex */
public class FeedListActivityTextWithLinkItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FeedListActivityTextWithLinkItem f40823a;

    /* JADX INFO: renamed from: b */
    public VLinear f40824b;

    /* JADX INFO: renamed from: c */
    public TextView f40825c;

    /* JADX INFO: renamed from: d */
    public VText f40826d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f40827e;

    /* JADX INFO: renamed from: f */
    public VText f40828f;

    /* JADX INFO: renamed from: g */
    public VText f40829g;

    /* JADX INFO: renamed from: h */
    public VRelative f40830h;

    /* JADX INFO: renamed from: i */
    public int f40831i;

    /* JADX INFO: renamed from: j */
    public Moment f40832j;

    /* JADX INFO: renamed from: k */
    public String f40833k;

    /* JADX INFO: renamed from: l */
    public String f40834l;

    /* JADX INFO: renamed from: m */
    public int f40835m;

    /* JADX INFO: renamed from: n */
    public boolean f40836n;

    /* JADX INFO: renamed from: o */
    public int f40837o;

    public FeedListActivityTextWithLinkItem(Context context) {
        super(context);
        this.f40836n = true;
    }

    /* JADX INFO: renamed from: d */
    public final void m63077d(View view) {
        wah.m202395a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public Act m63078e() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: f */
    public final void m63079f() {
        this.f40828f.setText(this.f40832j.value);
        xdl0.m208344M(this.f40829g, !TextUtils.isEmpty(this.f40832j.hyperlink));
        m63086m(this.f40832j.media);
        xdl0.m208329E0(this.f40823a, new View.OnClickListener() { // from class: l.tah
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f169118a.m63081h(view);
            }
        });
        xdl0.m208329E0(this.f40829g, new View.OnClickListener() { // from class: l.uah
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f175603a.m63082i(view);
            }
        });
        xdl0.m208329E0(this.f40830h, new View.OnClickListener() { // from class: l.vah
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f180735a.m63083j(view);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final void m63080g() {
        j760[] j760VarArrM199513J = {j760.m140076a("moment_id", this.f40832j.f56011id), j760.m140076a("owner_id", this.f40832j.owner), j760.m140076a("order", Integer.valueOf(this.f40835m)), j760.m140076a("moment_type", zi60.m218961w().m218992y(this.f40832j)), j760.m140076a("moment_distance", Long.valueOf(vqg.m199507G(this.f40832j))), j760.m140076a("moment_create_time", Long.valueOf(vqg.m199505F(this.f40832j))), j760.m140076a("owner_active_time", Long.valueOf(vqg.m199525S(FeedModule.f38855d.m209447e8(this.f40832j.owner))))};
        if (NullChecker.m81303a(this.f40832j.simpleActivity) && !TextUtils.isEmpty(this.f40832j.simpleActivity.f39235id)) {
            j760VarArrM199513J = vqg.m199513J(j760.m140076a(ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID, this.f40832j.simpleActivity.f39235id), j760VarArrM199513J);
        }
        p6j0.m167669c("e_moment", this.f40834l, j760VarArrM199513J);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m63081h(View view) {
        Intent intentM64835b;
        if (this.f40836n && (intentM64835b = MomentDetailAct.C11306a.m64834a(getContext()).m64839f(this.f40833k).m64846m(this.f40832j.f56011id).m64847n(this.f40832j.owner).m64853t(true).m64848o(this.f40832j.momentValue).m64835b()) != null) {
            m63078e().startActivity(intentM64835b);
            m63080g();
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m63082i(View view) {
        Spanned spannedFromHtml = Html.fromHtml(this.f40832j.hyperlink);
        URLSpan[] uRLSpanArr = (URLSpan[]) new SpannableStringBuilder(spannedFromHtml).getSpans(0, spannedFromHtml.length(), URLSpan.class);
        j2e0.m139446m(m63078e(), Uri.parse("tantan://webview?url=" + uRLSpanArr[0].getURL()));
        m63080g();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m63083j(View view) {
        p6j0.m167669c("e_worldcup_moment_pic", this.f40834l, new j760[0]);
        String strM122119b = null;
        String str = (NullChecker.m81303a(this.f40832j) && NullChecker.m81303a(this.f40832j.simpleActivity)) ? this.f40832j.simpleActivity.url : null;
        if (TextUtils.isEmpty(str)) {
            if (NullChecker.m81303a(this.f40832j) && NullChecker.m81303a(this.f40832j.simpleActivity)) {
                strM122119b = fm20.m122119b(this.f40832j.simpleActivity.f39235id);
            }
            str = strM122119b;
        }
        if (!TextUtils.isEmpty(str)) {
            m63084k(xdl0.m208328E(this), str);
        }
        m63080g();
    }

    /* JADX INFO: renamed from: k */
    public final void m63084k(Activity activity, String str) {
        if (activity == null || TextUtils.isEmpty(str)) {
            return;
        }
        Intent intentM80228X1 = MkDlgWebViewAct.m80228X1(activity, "", str);
        intentM80228X1.putExtra("hideNavigationBar", true);
        intentM80228X1.putExtra("skipLoading", true);
        intentM80228X1.putExtra("transparent_status_bar", true);
        intentM80228X1.putExtra("webviewColor", "transparent");
        intentM80228X1.putExtra("hideNotch", true);
        activity.startActivity(intentM80228X1);
    }

    /* JADX INFO: renamed from: l */
    public void m63085l(int i, Moment moment, String str, int i2, String str2) {
        this.f40833k = str;
        this.f40831i = i;
        this.f40832j = moment;
        this.f40835m = i2;
        this.f40834l = str2;
        m63079f();
        int iM186890d = 0;
        if (TextUtils.isEmpty(moment.feedTime) || i != 2) {
            xdl0.m208344M(this.f40824b, false);
            xdl0.m208360X(this.f40827e, this.f40837o);
        } else {
            xdl0.m208344M(this.f40824b, true);
            boolean zEquals = moment.feedTime.equals(FeedModule.f38852a.getString(R$string.f39076i2));
            VText vText = this.f40826d;
            if (zEquals) {
                xdl0.m208344M(vText, false);
                this.f40825c.setText(moment.feedTime);
                TextView textView = this.f40825c;
                textView.setTextSize(n8i.m158499f(textView, t100.m186890d(55.0f), moment.feedTime, 17.0f));
            } else {
                xdl0.m208344M(vText, true);
                String[] strArrSplit = moment.feedTime.split("/");
                this.f40825c.setTextSize(20.0f);
                this.f40825c.setText(strArrSplit[0]);
                this.f40826d.setText(strArrSplit[1]);
            }
            if (i2 == 0) {
                xdl0.m208360X(this.f40825c, t100.m186890d(24.0f));
                xdl0.m208360X(this.f40826d, t100.m186890d(24.0f));
                xdl0.m208360X(this.f40827e, t100.m186890d(28.0f));
            } else {
                xdl0.m208360X(this.f40827e, this.f40837o);
                xdl0.m208360X(this.f40825c, -t100.m186890d(4.0f));
                xdl0.m208360X(this.f40826d, -t100.m186890d(4.0f));
            }
        }
        if (i == 2) {
            iM186890d = t100.m186890d(16.0f);
        } else if (m63078e() instanceof MomentDetailAct) {
            iM186890d = t100.m186890d(8.0f);
        }
        xdl0.m208374f0(this, iM186890d);
    }

    /* JADX INFO: renamed from: m */
    public final void m63086m(List<Media> list) {
        if (vwb.m200296J(list)) {
            xdl0.m208344M(this.f40823a, false);
            return;
        }
        Media media = list.get(0);
        Picture picture = media instanceof Picture ? (Picture) media : null;
        if (NullChecker.m81304b(picture)) {
            VDraweeView vDraweeView = (VDraweeView) this.f40830h.getChildAt(0);
            if (!TEnum.equals(picture.status, "raw") && !TextUtils.isEmpty(picture.url)) {
                qib0.f154691G.m102341Q0(vDraweeView, picture.calculatedWidth(xdl0.m208412y0() - t100.m186890d(80.0f)));
                vDraweeView.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture.url));
            }
            vDraweeView.getHierarchy().m112053H(RoundingParams.m8249c(t100.m186890d(10.0f)).m8269w(RoundingParams.RoundingMethod.BITMAP_ONLY));
        }
    }

    /* JADX INFO: renamed from: n */
    public void m63087n(int i) {
        xdl0.m208325C0(this.f40830h, (int) (i * 0.63728815f));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m63077d(this);
        this.f40837o = ((FrameLayout.LayoutParams) this.f40827e.getLayoutParams()).topMargin;
        m63087n(xdl0.m208412y0() - t100.m186890d(80.0f));
    }

    public void setNeedInnerClick(boolean z) {
        this.f40836n = z;
    }

    public FeedListActivityTextWithLinkItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40836n = true;
    }

    public FeedListActivityTextWithLinkItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40836n = true;
    }
}
