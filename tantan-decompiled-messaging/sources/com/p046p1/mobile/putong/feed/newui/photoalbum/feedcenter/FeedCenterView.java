package com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter;

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
import com.google.android.gms.common.api.Api;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentAdditionalData;
import com.p046p1.mobile.putong.feed.data.MomentShareInfo;
import com.p046p1.mobile.putong.feed.data.RawFeed;
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.p046p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.p046p1.mobile.putong.feed.newui.photoalbum.poi.aggregation.FeedPoiAggregationAct;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.FeedMediaRepeatHintView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.FeedSharelinkView;
import com.p046p1.mobile.putong.feed.newui.preview.act.PhotoAlbumFeedPreviewAct;
import com.p046p1.mobile.putong.feed.newui.topic.qatopic.QATopicAggregationActivity;
import com.p046p1.mobile.putong.feed.newui.topic.topicaggregation.TopicAggregationAct;
import com.p046p1.mobile.putong.feed.newui.videoflow.FeedVideoFlowAct;
import com.p046p1.mobile.putong.newui.view.VExpandableTextContainer;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.p101mm.opensdk.constants.ConstantsAPI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VText;
import p149l.a870;
import p149l.a9i;
import p149l.csg;
import p149l.e1c0;
import p149l.e30;
import p149l.hx60;
import p149l.j760;
import p149l.kjb0;
import p149l.mug;
import p149l.n8i;
import p149l.nkg;
import p149l.o6c0;
import p149l.osg;
import p149l.p6j0;
import p149l.ptm;
import p149l.qmf0;
import p149l.t100;
import p149l.vqg;
import p149l.vwb;
import p149l.xdl0;
import p149l.z5i;
import p149l.zi60;

/* JADX INFO: loaded from: classes12.dex */
public class FeedCenterView extends VFrame {

    /* JADX INFO: renamed from: A */
    public boolean f41885A;

    /* JADX INFO: renamed from: a */
    public View f41886a;

    /* JADX INFO: renamed from: b */
    public VLinear f41887b;

    /* JADX INFO: renamed from: c */
    public TextView f41888c;

    /* JADX INFO: renamed from: d */
    public VText f41889d;

    /* JADX INFO: renamed from: e */
    public View f41890e;

    /* JADX INFO: renamed from: f */
    public VExpandableTextContainer f41891f;

    /* JADX INFO: renamed from: g */
    public VText f41892g;

    /* JADX INFO: renamed from: h */
    public View f41893h;

    /* JADX INFO: renamed from: i */
    public Moment f41894i;

    /* JADX INFO: renamed from: j */
    public RawFeed f41895j;

    /* JADX INFO: renamed from: k */
    public String f41896k;

    /* JADX INFO: renamed from: l */
    public boolean f41897l;

    /* JADX INFO: renamed from: m */
    public boolean f41898m;

    /* JADX INFO: renamed from: n */
    public boolean f41899n;

    /* JADX INFO: renamed from: o */
    public int f41900o;

    /* JADX INFO: renamed from: p */
    public boolean f41901p;

    /* JADX INFO: renamed from: q */
    public int f41902q;

    /* JADX INFO: renamed from: r */
    public int f41903r;

    /* JADX INFO: renamed from: s */
    public hx60 f41904s;

    /* JADX INFO: renamed from: t */
    public PhotoAlbumBaseFrag f41905t;

    /* JADX INFO: renamed from: u */
    public int f41906u;

    /* JADX INFO: renamed from: v */
    public HashMap<String, Boolean> f41907v;

    /* JADX INFO: renamed from: w */
    public LinearLayout f41908w;

    /* JADX INFO: renamed from: x */
    public FeedSharelinkView f41909x;

    /* JADX INFO: renamed from: y */
    public FeedMediaRepeatHintView f41910y;

    /* JADX INFO: renamed from: z */
    public boolean f41911z;

    public FeedCenterView(Context context) {
        super(context);
        this.f41894i = null;
        this.f41895j = null;
        this.f41896k = "";
        this.f41897l = false;
        this.f41900o = -1;
        this.f41901p = false;
        this.f41911z = true;
    }

    /* JADX INFO: renamed from: L */
    private void m64627L(View view) {
        xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.atg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f71608a.m64642P(view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ boolean m64628Q(View view) {
        m64649a0();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m64629R(View view) {
        if (NullChecker.m81303a(view)) {
            m64627L(view);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m64635B() {
        String textFoldPageId = getTextFoldPageId();
        if (TextUtils.isEmpty(this.f41894i.simpleActivity.name) || TextUtils.isEmpty(textFoldPageId)) {
            return;
        }
        p6j0.m167669c("e_activity_moment", textFoldPageId, vwb.m200311Y(ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID, this.f41894i.simpleActivity.f39235id), vwb.m200311Y("activity_name", this.f41894i.simpleActivity.name), vwb.m200311Y("moment_show_type", "text_and_url"), vwb.m200311Y("moments_user_id", this.f41894i.owner));
    }

    /* JADX INFO: renamed from: C */
    public void mo64597C() {
    }

    /* JADX INFO: renamed from: E */
    public CharSequence m64636E(String str) {
        return !TextUtils.isEmpty(str) ? qmf0.m175568a(str) : this.f41894i.value;
    }

    /* JADX INFO: renamed from: F */
    public void m64637F() {
        FeedMediaRepeatHintView feedMediaRepeatHintView = this.f41910y;
        if (feedMediaRepeatHintView == null) {
            return;
        }
        xdl0.m208344M(feedMediaRepeatHintView, false);
    }

    /* JADX INFO: renamed from: G */
    public void mo64606G() {
        if (this.f41908w == null) {
            return;
        }
        View viewInflate = LayoutInflater.from(getContext()).inflate(o6c0.f142219j3, (ViewGroup) this.f41908w, false);
        if (viewInflate instanceof FeedSharelinkView) {
            this.f41909x = (FeedSharelinkView) viewInflate;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, t100.f167234I);
            layoutParams.topMargin = t100.f167259h;
            this.f41908w.addView(this.f41909x, layoutParams);
            xdl0.m208344M(this.f41909x, false);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m64638K() {
        this.f41891f.m79205Q(new VExpandableTextContainer.InterfaceC13090e() { // from class: l.ctg
            @Override // com.p046p1.mobile.putong.newui.view.VExpandableTextContainer.InterfaceC13090e
            /* JADX INFO: renamed from: a */
            public final void mo79216a(boolean z) {
                this.f82480a.m64641O(z);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public boolean m64639M() {
        boolean z = "from_discover_discussion".equals(this.f41896k) || "from_discover_dating".equals(this.f41896k) || "from_nearby_falls_feed".equals(this.f41896k);
        if (act() instanceof MomentDetailAct) {
            return z && ((MomentDetailAct) act()).f42068d;
        }
        if (act().getClass().getName().contains("NewMainAct")) {
            return z;
        }
        return false;
    }

    /* JADX INFO: renamed from: N */
    public final List<Integer> m64640N() {
        RawFeed rawFeed = this.f41895j;
        if (rawFeed == null || vwb.m200296J(rawFeed.duplicateImgs)) {
            return vwb.m200324f0(new Integer[0]);
        }
        Moment moment = this.f41894i;
        if (moment == null || vwb.m200296J(moment.media)) {
            return vwb.m200324f0(new Integer[0]);
        }
        if (this.f41894i.media.get(0) instanceof Video) {
            return vwb.m200324f0(new Integer[0]);
        }
        User userM209447e8 = FeedModule.f38855d.m209447e8(this.f41894i.owner);
        if (NullChecker.m81303a(userM209447e8) && userM209447e8.isMe()) {
            return vwb.m200324f0(new Integer[0]);
        }
        int size = this.f41894i.media.size();
        Moment moment2 = this.f41894i;
        List<Media> listSubList = size <= 9 ? moment2.media : moment2.media.subList(0, 9);
        ArrayList arrayListM200324f0 = vwb.m200324f0(new Integer[0]);
        for (int i = 0; i < this.f41895j.duplicateImgs.size(); i++) {
            String str = this.f41895j.duplicateImgs.get(i);
            if (!TextUtils.isEmpty(str)) {
                for (int i2 = 0; i2 < listSubList.size(); i2++) {
                    String str2 = listSubList.get(i2).url;
                    if (!TextUtils.isEmpty(str2)) {
                        String[] strArrSplit = str2.split("/");
                        if (strArrSplit.length >= 1 && TextUtils.equals(str, strArrSplit[strArrSplit.length - 1])) {
                            arrayListM200324f0.add(Integer.valueOf(i2));
                        }
                    }
                }
            }
        }
        return arrayListM200324f0;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m64642P(View view) {
        if (this.f41894i == null) {
            return;
        }
        m64652e0(0, false);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m64643S(SpannableStringBuilder spannableStringBuilder, URLSpan[] uRLSpanArr, Moment moment, View view) {
        act().startActivity(kjb0.m146199j(act(), spannableStringBuilder.toString(), uRLSpanArr[0].getURL()));
        m64635B();
        if (TextUtils.isEmpty(moment.simpleActivity.name)) {
            p6j0.m167669c("e_campaign_quiz", getTextFoldPageId(), vwb.m200311Y("moment_id", moment.f56011id), vwb.m200311Y("moment_type", zi60.m218961w().m218992y(moment)), vwb.m200311Y("actor_user_id", moment.owner));
        }
    }

    /* JADX INFO: renamed from: T */
    public boolean m64644T(hx60 hx60Var, int i, Moment moment, String str, HashMap<String, Boolean> map, int i2, boolean z, int i3, HashMap<String, Boolean> map2, boolean z2, boolean z3, RawFeed rawFeed, boolean z4) {
        this.f41899n = z3;
        this.f41898m = z2;
        this.f41896k = str;
        this.f41901p = z;
        this.f41902q = i2;
        this.f41904s = hx60Var;
        this.f41903r = i3;
        this.f41907v = map2;
        this.f41900o = i;
        this.f41895j = rawFeed;
        this.f41885A = z4;
        boolean z5 = (this.f41894i == null && NullChecker.m81304b(moment) && !moment.f56011id.startsWith("fake_id_")) || (NullChecker.m81304b(this.f41894i) && NullChecker.m81304b(moment) && !this.f41894i.f56011id.equals(moment.f56011id) && !moment.f56011id.startsWith("fake_id_"));
        this.f41894i = moment;
        mo64598Z(i, moment, map);
        m64658z(str);
        return z5;
    }

    /* JADX INFO: renamed from: V */
    public final void m64645V() {
        this.f41891f.getTextView().setTextColor(act().getResources().getColor(e1c0.f88813z));
        this.f41891f.m79199K(act().getResources().getColor(e1c0.f88798n));
        m64658z(this.f41896k);
        this.f41891f.invalidate();
        this.f41891f.getTextView().setTextSize(2, 15.0f);
        this.f41891f.m79204P(t100.m186890d(2.0f), 1.0f);
    }

    /* JADX INFO: renamed from: W */
    public void m64646W() {
        FeedMediaRepeatHintView feedMediaRepeatHintView = this.f41910y;
        if (feedMediaRepeatHintView == null) {
            return;
        }
        xdl0.m208344M(feedMediaRepeatHintView, false);
        xdl0.m208344M(this.f41910y, !vwb.m200296J(this.f41894i.mediaRepeatIndexList));
        this.f41910y.m65142Q();
    }

    /* JADX INFO: renamed from: X */
    public void m64647X(VText vText, final Moment moment) {
        if (TextUtils.isEmpty(moment.hyperlink)) {
            xdl0.m208344M(vText, false);
            return;
        }
        xdl0.m208344M(vText, true);
        Spanned spannedFromHtml = Html.fromHtml(moment.hyperlink);
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannedFromHtml);
        final URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannedFromHtml.length(), URLSpan.class);
        vText.setText(spannableStringBuilder.toString());
        if (uRLSpanArr == null || uRLSpanArr.length <= 0) {
            return;
        }
        xdl0.m208329E0(vText, new View.OnClickListener() { // from class: l.btg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f77218a.m64643S(spannableStringBuilder, uRLSpanArr, moment, view);
            }
        });
    }

    /* JADX INFO: renamed from: Y */
    public void m64648Y(Moment moment) {
        MomentAdditionalData momentAdditionalData;
        MomentShareInfo momentShareInfo;
        if (this.f41909x == null) {
            return;
        }
        if (moment == null || (momentAdditionalData = moment.additionalData) == null || (momentShareInfo = momentAdditionalData.share) == null || momentShareInfo.isMomentShareEmpty()) {
            xdl0.m208344M(this.f41909x, false);
        } else {
            xdl0.m208344M(this.f41909x, true);
            this.f41909x.m65233f(moment.additionalData.share, getTextFoldPageId(), moment.f56011id, moment.owner);
        }
    }

    /* JADX INFO: renamed from: Z */
    public void mo64598Z(int i, Moment moment, HashMap<String, Boolean> map) {
        if (nkg.m159845C0() && vwb.m200296J(this.f41894i.mediaRepeatIndexList)) {
            this.f41894i.mediaRepeatIndexList = m64640N();
            FeedModule.f38855d.m209578wd(this.f41894i);
        }
        if (!TextUtils.isEmpty(moment.feedTime) && i == 2 && NullChecker.m81303a(this.f41887b)) {
            xdl0.m208344M(this.f41887b, true);
            boolean zEquals = moment.feedTime.equals(FeedModule.f38852a.getString(R$string.f39076i2));
            VText vText = this.f41889d;
            if (zEquals) {
                xdl0.m208344M(vText, false);
                this.f41888c.setText(moment.feedTime);
                TextView textView = this.f41888c;
                textView.setTextSize(n8i.m158499f(textView, t100.m186890d(50.0f), moment.feedTime, 18.0f));
                TextPaint paint = this.f41888c.getPaint();
                if (paint != null) {
                    paint.setFakeBoldText(true);
                }
            } else {
                xdl0.m208344M(vText, true);
                String[] strArrSplit = moment.feedTime.split("/");
                this.f41888c.setTextSize(26.0f);
                this.f41888c.setText(strArrSplit[0]);
                this.f41889d.setText(strArrSplit[1]);
                TextPaint paint2 = this.f41888c.getPaint();
                if (paint2 != null) {
                    paint2.setFakeBoldText(false);
                }
            }
            if (this.f41903r == 0) {
                int iM186890d = t100.m186890d(28.0f);
                if (nkg.m159866W() && "from_mine_tab_album".equals(this.f41896k)) {
                    iM186890d = t100.m186890d(12.0f);
                }
                if ("from_profile_album".equals(this.f41896k)) {
                    iM186890d = t100.m186890d(22.0f);
                }
                xdl0.m208360X(this.f41887b, iM186890d);
                xdl0.m208360X(this.f41890e, iM186890d);
            } else {
                xdl0.m208360X(this.f41890e, this.f41906u + t100.m186890d(6.0f));
                xdl0.m208360X(this.f41887b, this.f41906u + t100.m186890d(6.0f));
            }
        } else {
            xdl0.m208360X(this.f41890e, this.f41906u);
            if (NullChecker.m81303a(this.f41887b) && ((act() instanceof PhotoAlbumFeedAct) || "from_profile_album".equals(this.f41896k) || "from_mine_tab_album".equals(this.f41896k))) {
                xdl0.m208344M(this.f41887b, false);
                xdl0.m208360X(this.f41890e, this.f41906u + t100.m186890d(9.0f));
            }
        }
        xdl0.m208374f0(this, act() instanceof MomentDetailAct ? t100.m186890d(8.0f) : 0);
        m64638K();
    }

    /* JADX INFO: renamed from: a0 */
    public final void m64649a0() {
        boolean z;
        if (NullChecker.m81303a(this.f41891f) && NullChecker.m81303a(this.f41894i)) {
            if ((act() instanceof TopicAggregationAct) || (act() instanceof QATopicAggregationActivity) || (act() instanceof FeedPoiAggregationAct)) {
                int[] iArr = new int[2];
                this.f41891f.getLocationOnScreen(iArr);
                Point point = new Point();
                int iM186890d = (iArr[1] - t100.m186890d(58.0f)) + t100.m186890d(2.0f);
                int iM208331F0 = xdl0.m208331F0() + xdl0.m208324C(act()) + t100.m186890d(54.0f);
                if (act() instanceof FeedPoiAggregationAct) {
                    iM208331F0 = xdl0.m208331F0() + t100.m186890d(44.0f);
                }
                int i = iArr[1];
                if (i < iM208331F0) {
                    point.y = i + this.f41891f.getHeight();
                    z = false;
                } else {
                    point.y = iM186890d;
                    z = true;
                }
                int iM186890d2 = t100.m186890d(act() instanceof QATopicAggregationActivity ? 52.0f : 64.0f);
                VText textView = this.f41891f.getTextView();
                String str = this.f41894i.value;
                point.x = ((textView.getWidth() / 2) + iM186890d2) - t100.m186890d(35.0f);
                if (textView.getLineCount() == 1) {
                    point.x = ((int) (iM186890d2 + (Layout.getDesiredWidth(str, 0, str.length(), textView.getPaint()) / 2.0f))) - t100.m186890d(35.0f);
                }
                mug.m156390a().m156391b(act(), point, this.f41891f, str, z);
            }
        }
    }

    public Act act() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: b0 */
    public void m64650b0(boolean z) {
        xdl0.m208344M(this.f41893h, z);
        if (z) {
            this.f41890e.setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), t100.m186890d(20.0f));
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m64651c0(int i) {
        m64652e0(i, true);
    }

    /* JADX INFO: renamed from: e0 */
    public void m64652e0(int i, boolean z) {
        Moment moment = this.f41894i;
        if (moment.isLive) {
            csg.m108506b(act(), this.f41896k, this.f41894i, this.f41902q, this.f41901p, this.f41904s);
            return;
        }
        if (moment.isVoiceLive) {
            if (moment.momentVoiceLiveInfos == null) {
                csg.m108509e(act(), this.f41896k, this.f41894i, this.f41902q, this.f41901p, this.f41904s);
                return;
            } else {
                osg.m165776k(moment, this.f41902q, z5i.m217340u(this.f41896k), z5i.m217339t(this.f41896k), "content");
                csg.m108508d(act(), this.f41896k, this.f41894i, this.f41902q, this.f41901p, this.f41904s);
                return;
            }
        }
        if (!z) {
            m64653f0(i);
            if (this.f41885A) {
                ptm.m171352d().m171354e(act(), this.f41905t, this.f41896k, this.f41894i, "click", this.f41895j);
                return;
            }
            return;
        }
        if (nkg.m159859P() && (this instanceof FeedCenterVideoView) && m64639M()) {
            m64655h0();
            return;
        }
        m64654g0(this.f41894i, i, this.f41898m, this.f41899n);
        if (this.f41885A) {
            ptm.m171352d().m171354e(act(), this.f41905t, this.f41896k, this.f41894i, "preview", this.f41895j);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m64653f0(int i) {
        MomentDetailAct.C11306a c11306aM64840g = MomentDetailAct.C11306a.m64834a(getContext()).m64836c(this.f41898m).m64839f(this.f41896k).m64846m(this.f41894i.f56011id).m64843j(this.f41899n).m64847n(this.f41894i.owner).m64840g(i);
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f41905t;
        String string = "";
        MomentDetailAct.C11306a c11306aM64853t = c11306aM64840g.m64851r((photoAlbumBaseFrag == null || photoAlbumBaseFrag.getArguments() == null) ? "" : this.f41905t.getArguments().getString("keyOriginFrom")).m64853t(true);
        PhotoAlbumBaseFrag photoAlbumBaseFrag2 = this.f41905t;
        if (photoAlbumBaseFrag2 != null && photoAlbumBaseFrag2.getArguments() != null) {
            string = this.f41905t.getArguments().getString("keyHideNeedMatchUid");
        }
        Intent intentM64835b = c11306aM64853t.m64850q(string).m64841h(act().getClass().getName().contains("NewMainAct")).m64848o(this.f41894i.momentValue).m64852s(this.f41895j).m64835b();
        if (intentM64835b == null) {
            return;
        }
        act().startActivity(intentM64835b);
    }

    /* JADX INFO: renamed from: g0 */
    public void m64654g0(Moment moment, int i, boolean z, boolean z2) {
        String str = vqg.m199532Z(moment) ? moment.thirdShareSource.sourceId : moment.f56011id;
        this.f41898m = z;
        this.f41899n = z2;
        if (!FeedModule.f38855d.f193047i0.containsKey(moment.f56011id)) {
            FeedModule.f38855d.f193047i0.put(moment.f56011id, moment);
        }
        act().startActivityWithCustomTransition(PhotoAlbumFeedPreviewAct.m65307Z1(act(), str, i, true, this.f41896k, z, z2, this.f41900o), new a870());
        osg.m165766a(this, moment, this.f41896k, this.f41901p, this.f41897l);
    }

    public String getTextFoldPageId() {
        return act() instanceof MomentDetailAct ? "p_user_moment_interactions_details_view" : vqg.m199515K(this.f41896k, this.f41901p);
    }

    /* JADX INFO: renamed from: h0 */
    public void m64655h0() {
        m64656j0(this.f41894i);
    }

    /* JADX INFO: renamed from: j0 */
    public void m64656j0(Moment moment) {
        act().startActivityWithCustomTransition(FeedVideoFlowAct.C11376a.m66194a(act()).m66198e(vqg.m199532Z(moment) ? moment.thirdShareSource.sourceId : moment.f56011id).m66196c(this.f41896k).m66197d(this.f41899n).m66195b(), new a9i());
        osg.m165766a(this, moment, this.f41896k, this.f41901p, this.f41897l);
    }

    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public void m64641O(boolean z) {
        if (this.f41894i == null) {
            return;
        }
        if (z) {
            p6j0.m167669c("e_text_fold", getTextFoldPageId(), vqg.m199549i(this.f41896k, j760.m140076a("moment_id", this.f41894i.f56011id), j760.m140076a("owner_id", this.f41894i.owner), j760.m140076a("show_state", "show_more")));
        } else {
            p6j0.m167669c("e_text_fold", getTextFoldPageId(), vqg.m199549i(this.f41896k, j760.m140076a("moment_id", this.f41894i.f56011id), j760.m140076a("owner_id", this.f41894i.owner), j760.m140076a("show_state", "show_less")));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        mo64597C();
        mo64602r();
        mo64606G();
        this.f41891f.getTextView().setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ysg
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f199767a.m64628Q(view);
            }
        });
        vwb.m200354z(vwb.m200324f0(this.f41891f.getTextView(), this.f41892g, this.f41886a), new e30() { // from class: l.zsg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204593a.m64629R((View) obj);
            }
        });
        this.f41906u = ((FrameLayout.LayoutParams) this.f41890e.getLayoutParams()).topMargin;
        m64645V();
    }

    /* JADX INFO: renamed from: r */
    public void mo64602r() {
    }

    public void setCurrentFrag(PhotoAlbumBaseFrag photoAlbumBaseFrag) {
        this.f41905t = photoAlbumBaseFrag;
    }

    /* JADX INFO: renamed from: z */
    public void m64658z(String str) {
        this.f41891f.setLineLimit((!(act() instanceof MomentDetailAct) || "from_moment_detail_album".equals(str)) ? 4 : Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public FeedCenterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41894i = null;
        this.f41895j = null;
        this.f41896k = "";
        this.f41897l = false;
        this.f41900o = -1;
        this.f41901p = false;
        this.f41911z = true;
    }

    public FeedCenterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41894i = null;
        this.f41895j = null;
        this.f41896k = "";
        this.f41897l = false;
        this.f41900o = -1;
        this.f41901p = false;
        this.f41911z = true;
    }
}
