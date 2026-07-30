package com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.text.Html;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentAdditionalData;
import com.p000p1.mobile.putong.feed.data.MomentShareInfo;
import com.p000p1.mobile.putong.feed.data.RawFeed;
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.p000p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.p000p1.mobile.putong.feed.newui.photoalbum.poi.aggregation.FeedPoiAggregationAct;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.FeedMediaRepeatHintView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.FeedSharelinkView;
import com.p000p1.mobile.putong.feed.newui.preview.act.PhotoAlbumFeedPreviewAct;
import com.p000p1.mobile.putong.feed.newui.topic.qatopic.QATopicAggregationActivity;
import com.p000p1.mobile.putong.feed.newui.topic.topicaggregation.TopicAggregationAct;
import com.p000p1.mobile.putong.feed.newui.videoflow.FeedVideoFlowAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.newui.view.VExpandableTextContainer;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import l.e30;
import l.j760;
import l.t100;
import l.vwb;
import l.xdl0;
import p007l.a870;
import p007l.a9i;
import p007l.csg;
import p007l.e1c0;
import p007l.hx60;
import p007l.kjb0;
import p007l.mug;
import p007l.n8i;
import p007l.nkg;
import p007l.o6c0;
import p007l.osg;
import p007l.p6j0;
import p007l.ptm;
import p007l.qmf0;
import p007l.vqg;
import p007l.z5i;
import p007l.zi60;
import v.VFrame;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedCenterView extends VFrame {

    /* JADX INFO: renamed from: A */
    public boolean f3346A;

    /* JADX INFO: renamed from: a */
    public View f3347a;

    /* JADX INFO: renamed from: b */
    public VLinear f3348b;

    /* JADX INFO: renamed from: c */
    public TextView f3349c;

    /* JADX INFO: renamed from: d */
    public VText f3350d;

    /* JADX INFO: renamed from: e */
    public View f3351e;

    /* JADX INFO: renamed from: f */
    public VExpandableTextContainer f3352f;

    /* JADX INFO: renamed from: g */
    public VText f3353g;

    /* JADX INFO: renamed from: h */
    public View f3354h;

    /* JADX INFO: renamed from: i */
    public Moment f3355i;

    /* JADX INFO: renamed from: j */
    public RawFeed f3356j;

    /* JADX INFO: renamed from: k */
    public String f3357k;

    /* JADX INFO: renamed from: l */
    public boolean f3358l;

    /* JADX INFO: renamed from: m */
    public boolean f3359m;

    /* JADX INFO: renamed from: n */
    public boolean f3360n;

    /* JADX INFO: renamed from: o */
    public int f3361o;

    /* JADX INFO: renamed from: p */
    public boolean f3362p;

    /* JADX INFO: renamed from: q */
    public int f3363q;

    /* JADX INFO: renamed from: r */
    public int f3364r;

    /* JADX INFO: renamed from: s */
    public hx60 f3365s;

    /* JADX INFO: renamed from: t */
    public PhotoAlbumBaseFrag f3366t;

    /* JADX INFO: renamed from: u */
    public int f3367u;

    /* JADX INFO: renamed from: v */
    public HashMap<String, Boolean> f3368v;

    /* JADX INFO: renamed from: w */
    public LinearLayout f3369w;

    /* JADX INFO: renamed from: x */
    public FeedSharelinkView f3370x;

    /* JADX INFO: renamed from: y */
    public FeedMediaRepeatHintView f3371y;

    /* JADX INFO: renamed from: z */
    public boolean f3372z;

    public FeedCenterView(Context context) {
        super(context);
        this.f3355i = null;
        this.f3356j = null;
        this.f3357k = "";
        this.f3358l = false;
        this.f3361o = -1;
        this.f3362p = false;
        this.f3372z = true;
    }

    /* JADX INFO: renamed from: L */
    private void m5721L(View view) {
        xdl0.E0(view, new View.OnClickListener() { // from class: l.atg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f5843a.m5736P(view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ boolean m5722Q(View view) {
        m5743a0();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m5723R(View view) {
        if (NullChecker.a(view)) {
            m5721L(view);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m5729B() {
        String textFoldPageId = getTextFoldPageId();
        if (TextUtils.isEmpty(this.f3355i.simpleActivity.name) || TextUtils.isEmpty(textFoldPageId)) {
            return;
        }
        p6j0.m12913c("e_activity_moment", textFoldPageId, vwb.Y("activity_id", this.f3355i.simpleActivity.f696id), vwb.Y("activity_name", this.f3355i.simpleActivity.name), vwb.Y("moment_show_type", "text_and_url"), vwb.Y("moments_user_id", this.f3355i.owner));
    }

    /* JADX INFO: renamed from: C */
    public void mo5691C() {
    }

    /* JADX INFO: renamed from: E */
    public CharSequence m5730E(String str) {
        return !TextUtils.isEmpty(str) ? qmf0.m13586a(str) : this.f3355i.value;
    }

    /* JADX INFO: renamed from: F */
    public void m5731F() {
        VLinear vLinear = this.f3371y;
        if (vLinear == null) {
            return;
        }
        xdl0.M(vLinear, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    public void mo5700G() {
        if (this.f3369w == null) {
            return;
        }
        View viewInflate = LayoutInflater.from(getContext()).inflate(o6c0.f11238j3, (ViewGroup) this.f3369w, false);
        if (viewInflate instanceof FeedSharelinkView) {
            this.f3370x = (FeedSharelinkView) viewInflate;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, t100.I);
            layoutParams.topMargin = t100.h;
            this.f3369w.addView(this.f3370x, layoutParams);
            xdl0.M(this.f3370x, false);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m5732K() {
        this.f3352f.Q(new VExpandableTextContainer.e() { // from class: l.ctg
            /* JADX INFO: renamed from: a */
            public final void m9242a(boolean z) {
                this.f6728a.m5735O(z);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public boolean m5733M() {
        boolean z = "from_discover_discussion".equals(this.f3357k) || "from_discover_dating".equals(this.f3357k) || "from_nearby_falls_feed".equals(this.f3357k);
        if (act() instanceof MomentDetailAct) {
            return z && act().f3529d;
        }
        if (act().getClass().getName().contains("NewMainAct")) {
            return z;
        }
        return false;
    }

    /* JADX INFO: renamed from: N */
    public final List<Integer> m5734N() {
        RawFeed rawFeed = this.f3356j;
        if (rawFeed == null || vwb.J(rawFeed.duplicateImgs)) {
            return vwb.f0(new Integer[0]);
        }
        Moment moment = this.f3355i;
        if (moment == null || vwb.J(moment.media)) {
            return vwb.f0(new Integer[0]);
        }
        if (this.f3355i.media.get(0) instanceof Video) {
            return vwb.f0(new Integer[0]);
        }
        User userM16628e8 = FeedModule.f316d.m16628e8(this.f3355i.owner);
        if (NullChecker.a(userM16628e8) && userM16628e8.isMe()) {
            return vwb.f0(new Integer[0]);
        }
        int size = this.f3355i.media.size();
        Moment moment2 = this.f3355i;
        List<Media> listSubList = size <= 9 ? moment2.media : moment2.media.subList(0, 9);
        ArrayList arrayListF0 = vwb.f0(new Integer[0]);
        for (int i = 0; i < this.f3356j.duplicateImgs.size(); i++) {
            String str = this.f3356j.duplicateImgs.get(i);
            if (!TextUtils.isEmpty(str)) {
                for (int i2 = 0; i2 < listSubList.size(); i2++) {
                    String str2 = listSubList.get(i2).url;
                    if (!TextUtils.isEmpty(str2)) {
                        String[] strArrSplit = str2.split("/");
                        if (strArrSplit.length >= 1 && TextUtils.equals(str, strArrSplit[strArrSplit.length - 1])) {
                            arrayListF0.add(Integer.valueOf(i2));
                        }
                    }
                }
            }
        }
        return arrayListF0;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m5736P(View view) {
        if (this.f3355i == null) {
            return;
        }
        m5746e0(0, false);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m5737S(SpannableStringBuilder spannableStringBuilder, URLSpan[] uRLSpanArr, Moment moment, View view) {
        act().startActivity(kjb0.m11458j(act(), spannableStringBuilder.toString(), uRLSpanArr[0].getURL()));
        m5729B();
        if (TextUtils.isEmpty(moment.simpleActivity.name)) {
            p6j0.m12913c("e_campaign_quiz", getTextFoldPageId(), vwb.Y("moment_id", ((DbObject) moment).id), vwb.Y("moment_type", zi60.m17436w().m17467y(moment)), vwb.Y("actor_user_id", moment.owner));
        }
    }

    /* JADX INFO: renamed from: T */
    public boolean m5738T(hx60 hx60Var, int i, Moment moment, String str, HashMap<String, Boolean> map, int i2, boolean z, int i3, HashMap<String, Boolean> map2, boolean z2, boolean z3, RawFeed rawFeed, boolean z4) {
        this.f3360n = z3;
        this.f3359m = z2;
        this.f3357k = str;
        this.f3362p = z;
        this.f3363q = i2;
        this.f3365s = hx60Var;
        this.f3364r = i3;
        this.f3368v = map2;
        this.f3361o = i;
        this.f3356j = rawFeed;
        this.f3346A = z4;
        boolean z5 = (this.f3355i == null && NullChecker.b(moment) && !((DbObject) moment).id.startsWith("fake_id_")) || (NullChecker.b(this.f3355i) && NullChecker.b(moment) && !((DbObject) this.f3355i).id.equals(((DbObject) moment).id) && !((DbObject) moment).id.startsWith("fake_id_"));
        this.f3355i = moment;
        mo5692Z(i, moment, map);
        m5752z(str);
        return z5;
    }

    /* JADX INFO: renamed from: V */
    public final void m5739V() {
        this.f3352f.getTextView().setTextColor(act().getResources().getColor(e1c0.f7169z));
        this.f3352f.K(act().getResources().getColor(e1c0.f7154n));
        m5752z(this.f3357k);
        this.f3352f.invalidate();
        this.f3352f.getTextView().setTextSize(2, 15.0f);
        this.f3352f.P(t100.d(2.0f), 1.0f);
    }

    /* JADX INFO: renamed from: W */
    public void m5740W() {
        VLinear vLinear = this.f3371y;
        if (vLinear == null) {
            return;
        }
        xdl0.M(vLinear, false);
        xdl0.M(this.f3371y, !vwb.J(this.f3355i.mediaRepeatIndexList));
        this.f3371y.m6243Q();
    }

    /* JADX INFO: renamed from: X */
    public void m5741X(VText vText, final Moment moment) {
        if (TextUtils.isEmpty(moment.hyperlink)) {
            xdl0.M(vText, false);
            return;
        }
        xdl0.M(vText, true);
        Spanned spannedFromHtml = Html.fromHtml(moment.hyperlink);
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannedFromHtml);
        final URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannedFromHtml.length(), URLSpan.class);
        vText.setText(spannableStringBuilder.toString());
        if (uRLSpanArr == null || uRLSpanArr.length <= 0) {
            return;
        }
        xdl0.E0(vText, new View.OnClickListener() { // from class: l.btg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6427a.m5737S(spannableStringBuilder, uRLSpanArr, moment, view);
            }
        });
    }

    /* JADX INFO: renamed from: Y */
    public void m5742Y(Moment moment) {
        MomentAdditionalData momentAdditionalData;
        MomentShareInfo momentShareInfo;
        if (this.f3370x == null) {
            return;
        }
        if (moment == null || (momentAdditionalData = moment.additionalData) == null || (momentShareInfo = momentAdditionalData.share) == null || momentShareInfo.isMomentShareEmpty()) {
            xdl0.M(this.f3370x, false);
        } else {
            xdl0.M(this.f3370x, true);
            this.f3370x.m6334f(moment.additionalData.share, getTextFoldPageId(), ((DbObject) moment).id, moment.owner);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z */
    public void mo5692Z(int i, Moment moment, HashMap<String, Boolean> map) {
        if (nkg.m12204C0() && vwb.J(this.f3355i.mediaRepeatIndexList)) {
            this.f3355i.mediaRepeatIndexList = m5734N();
            FeedModule.f316d.m16759wd(this.f3355i);
        }
        if (!TextUtils.isEmpty(moment.feedTime) && i == 2 && NullChecker.a(this.f3348b)) {
            xdl0.M(this.f3348b, true);
            boolean zEquals = moment.feedTime.equals(FeedModule.f313a.getString(R$string.f537i2));
            VText vText = this.f3350d;
            if (zEquals) {
                xdl0.M(vText, false);
                this.f3349c.setText(moment.feedTime);
                TextView textView = this.f3349c;
                textView.setTextSize(n8i.m12112f(textView, t100.d(50.0f), moment.feedTime, 18.0f));
                TextPaint paint = this.f3349c.getPaint();
                if (paint != null) {
                    paint.setFakeBoldText(true);
                }
            } else {
                xdl0.M(vText, true);
                String[] strArrSplit = moment.feedTime.split("/");
                this.f3349c.setTextSize(26.0f);
                this.f3349c.setText(strArrSplit[0]);
                this.f3350d.setText(strArrSplit[1]);
                TextPaint paint2 = this.f3349c.getPaint();
                if (paint2 != null) {
                    paint2.setFakeBoldText(false);
                }
            }
            if (this.f3364r == 0) {
                int iD = t100.d(28.0f);
                if (nkg.m12225W() && "from_mine_tab_album".equals(this.f3357k)) {
                    iD = t100.d(12.0f);
                }
                if ("from_profile_album".equals(this.f3357k)) {
                    iD = t100.d(22.0f);
                }
                xdl0.X(this.f3348b, iD);
                xdl0.X(this.f3351e, iD);
            } else {
                xdl0.X(this.f3351e, this.f3367u + t100.d(6.0f));
                xdl0.X(this.f3348b, this.f3367u + t100.d(6.0f));
            }
        } else {
            xdl0.X(this.f3351e, this.f3367u);
            if (NullChecker.a(this.f3348b) && ((act() instanceof PhotoAlbumFeedAct) || "from_profile_album".equals(this.f3357k) || "from_mine_tab_album".equals(this.f3357k))) {
                xdl0.M(this.f3348b, false);
                xdl0.X(this.f3351e, this.f3367u + t100.d(9.0f));
            }
        }
        xdl0.f0(this, act() instanceof MomentDetailAct ? t100.d(8.0f) : 0);
        m5732K();
    }

    /* JADX INFO: renamed from: a0 */
    public final void m5743a0() {
        boolean z;
        if (NullChecker.a(this.f3352f) && NullChecker.a(this.f3355i)) {
            if ((act() instanceof TopicAggregationAct) || (act() instanceof QATopicAggregationActivity) || (act() instanceof FeedPoiAggregationAct)) {
                int[] iArr = new int[2];
                this.f3352f.getLocationOnScreen(iArr);
                Point point = new Point();
                int iD = (iArr[1] - t100.d(58.0f)) + t100.d(2.0f);
                int iF0 = xdl0.F0() + xdl0.C(act()) + t100.d(54.0f);
                if (act() instanceof FeedPoiAggregationAct) {
                    iF0 = xdl0.F0() + t100.d(44.0f);
                }
                int i = iArr[1];
                if (i < iF0) {
                    point.y = i + this.f3352f.getHeight();
                    z = false;
                } else {
                    point.y = iD;
                    z = true;
                }
                int iD2 = t100.d(act() instanceof QATopicAggregationActivity ? 52.0f : 64.0f);
                VText textView = this.f3352f.getTextView();
                String str = this.f3355i.value;
                point.x = ((textView.getWidth() / 2) + iD2) - t100.d(35.0f);
                if (textView.getLineCount() == 1) {
                    point.x = ((int) (iD2 + (Layout.getDesiredWidth(str, 0, str.length(), textView.getPaint()) / 2.0f))) - t100.d(35.0f);
                }
                mug.m12035a().m12036b(act(), point, this.f3352f, str, z);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Act act() {
        return getContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b0 */
    public void m5744b0(boolean z) {
        xdl0.M(this.f3354h, z);
        if (z) {
            this.f3351e.setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), t100.d(20.0f));
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m5745c0(int i) {
        m5746e0(i, true);
    }

    /* JADX INFO: renamed from: e0 */
    public void m5746e0(int i, boolean z) {
        Moment moment = this.f3355i;
        if (moment.isLive) {
            csg.m9237b(act(), this.f3357k, this.f3355i, this.f3363q, this.f3362p, this.f3365s);
            return;
        }
        if (moment.isVoiceLive) {
            if (moment.momentVoiceLiveInfos == null) {
                csg.m9240e(act(), this.f3357k, this.f3355i, this.f3363q, this.f3362p, this.f3365s);
                return;
            } else {
                osg.m12855k(moment, this.f3363q, z5i.m17228u(this.f3357k), z5i.m17227t(this.f3357k), "content");
                csg.m9239d(act(), this.f3357k, this.f3355i, this.f3363q, this.f3362p, this.f3365s);
                return;
            }
        }
        if (!z) {
            m5747f0(i);
            if (this.f3346A) {
                ptm.m13221d().m13223e(act(), this.f3366t, this.f3357k, this.f3355i, "click", this.f3356j);
                return;
            }
            return;
        }
        if (nkg.m12218P() && (this instanceof FeedCenterVideoView) && m5733M()) {
            m5749h0();
            return;
        }
        m5748g0(this.f3355i, i, this.f3359m, this.f3360n);
        if (this.f3346A) {
            ptm.m13221d().m13223e(act(), this.f3366t, this.f3357k, this.f3355i, "preview", this.f3356j);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f0 */
    public void m5747f0(int i) {
        MomentDetailAct.C2150a c2150aM5937g = MomentDetailAct.C2150a.m5931a(getContext()).m5933c(this.f3359m).m5936f(this.f3357k).m5943m(((DbObject) this.f3355i).id).m5940j(this.f3360n).m5944n(this.f3355i.owner).m5937g(i);
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f3366t;
        String string = "";
        MomentDetailAct.C2150a c2150aM5950t = c2150aM5937g.m5948r((photoAlbumBaseFrag == null || photoAlbumBaseFrag.getArguments() == null) ? "" : this.f3366t.getArguments().getString("keyOriginFrom")).m5950t(true);
        PhotoAlbumBaseFrag photoAlbumBaseFrag2 = this.f3366t;
        if (photoAlbumBaseFrag2 != null && photoAlbumBaseFrag2.getArguments() != null) {
            string = this.f3366t.getArguments().getString("keyHideNeedMatchUid");
        }
        Intent intentM5932b = c2150aM5950t.m5947q(string).m5938h(act().getClass().getName().contains("NewMainAct")).m5945o(this.f3355i.momentValue).m5949s(this.f3356j).m5932b();
        if (intentM5932b == null) {
            return;
        }
        act().startActivity(intentM5932b);
    }

    /* JADX INFO: renamed from: g0 */
    public void m5748g0(Moment moment, int i, boolean z, boolean z2) {
        String str = vqg.m15502Z(moment) ? moment.thirdShareSource.sourceId : ((DbObject) moment).id;
        this.f3359m = z;
        this.f3360n = z2;
        if (!FeedModule.f316d.f14982i0.containsKey(((DbObject) moment).id)) {
            FeedModule.f316d.f14982i0.put(((DbObject) moment).id, moment);
        }
        act().startActivityWithCustomTransition(PhotoAlbumFeedPreviewAct.m6408Z1(act(), str, i, true, this.f3357k, z, z2, this.f3361o), new a870());
        osg.m12845a(this, moment, this.f3357k, this.f3362p, this.f3358l);
    }

    public String getTextFoldPageId() {
        return act() instanceof MomentDetailAct ? "p_user_moment_interactions_details_view" : vqg.m15485K(this.f3357k, this.f3362p);
    }

    /* JADX INFO: renamed from: h0 */
    public void m5749h0() {
        m5750j0(this.f3355i);
    }

    /* JADX INFO: renamed from: j0 */
    public void m5750j0(Moment moment) {
        act().startActivityWithCustomTransition(FeedVideoFlowAct.C2220a.m7352a(act()).m7356e(vqg.m15502Z(moment) ? moment.thirdShareSource.sourceId : ((DbObject) moment).id).m7354c(this.f3357k).m7355d(this.f3360n).m7353b(), new a9i());
        osg.m12845a(this, moment, this.f3357k, this.f3362p, this.f3358l);
    }

    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public void m5735O(boolean z) {
        if (this.f3355i == null) {
            return;
        }
        if (z) {
            p6j0.m12913c("e_text_fold", getTextFoldPageId(), vqg.m15519i(this.f3357k, j760.a("moment_id", ((DbObject) this.f3355i).id), j760.a("owner_id", this.f3355i.owner), j760.a("show_state", "show_more")));
        } else {
            p6j0.m12913c("e_text_fold", getTextFoldPageId(), vqg.m15519i(this.f3357k, j760.a("moment_id", ((DbObject) this.f3355i).id), j760.a("owner_id", this.f3355i.owner), j760.a("show_state", "show_less")));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        mo5691C();
        mo5696r();
        mo5700G();
        this.f3352f.getTextView().setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ysg
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f15497a.m5722Q(view);
            }
        });
        vwb.z(vwb.f0(new View[]{this.f3352f.getTextView(), this.f3353g, this.f3347a}), new e30() { // from class: l.zsg
            public final void call(Object obj) {
                this.f15852a.m5723R((View) obj);
            }
        });
        this.f3367u = ((FrameLayout.LayoutParams) this.f3351e.getLayoutParams()).topMargin;
        m5739V();
    }

    /* JADX INFO: renamed from: r */
    public void mo5696r() {
    }

    public void setCurrentFrag(PhotoAlbumBaseFrag photoAlbumBaseFrag) {
        this.f3366t = photoAlbumBaseFrag;
    }

    /* JADX INFO: renamed from: z */
    public void m5752z(String str) {
        this.f3352f.setLineLimit((!(act() instanceof MomentDetailAct) || "from_moment_detail_album".equals(str)) ? 4 : Integer.MAX_VALUE);
    }

    public FeedCenterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3355i = null;
        this.f3356j = null;
        this.f3357k = "";
        this.f3358l = false;
        this.f3361o = -1;
        this.f3362p = false;
        this.f3372z = true;
    }

    public FeedCenterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3355i = null;
        this.f3356j = null;
        this.f3357k = "";
        this.f3358l = false;
        this.f3361o = -1;
        this.f3362p = false;
        this.f3372z = true;
    }
}
