package com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentAdditionalData;
import com.p051p1.mobile.putong.feed.data.MomentShareInfo;
import com.p051p1.mobile.putong.feed.data.RawFeed;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.p051p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.p051p1.mobile.putong.feed.newui.photoalbum.poi.aggregation.FeedPoiAggregationAct;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.FeedMediaRepeatHintView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.FeedSharelinkView;
import com.p051p1.mobile.putong.feed.newui.preview.act.PhotoAlbumFeedPreviewAct;
import com.p051p1.mobile.putong.feed.newui.topic.qatopic.QATopicAggregationActivity;
import com.p051p1.mobile.putong.feed.newui.topic.topicaggregation.TopicAggregationAct;
import com.p051p1.mobile.putong.feed.newui.videoflow.FeedVideoFlowAct;
import com.p051p1.mobile.putong.newui.view.VExpandableTextContainer;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.p106mm.opensdk.constants.ConstantsAPI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.bwg;
import p153l.cai;
import p153l.cmg;
import p153l.dug;
import p153l.er60;
import p153l.gg70;
import p153l.jyb;
import p153l.k9c0;
import p153l.ksg;
import p153l.n570;
import p153l.o7i;
import p153l.orb0;
import p153l.pai;
import p153l.pf60;
import p153l.qa00;
import p153l.qvm;
import p153l.rtg;
import p153l.tec0;
import p153l.tfj0;
import p153l.y20;
import p153l.zuf0;

/* JADX INFO: loaded from: classes13.dex */
public class FeedCenterView extends VFrame {

    /* JADX INFO: renamed from: A */
    public boolean f42733A;

    /* JADX INFO: renamed from: a */
    public View f42734a;

    /* JADX INFO: renamed from: b */
    public VLinear f42735b;

    /* JADX INFO: renamed from: c */
    public TextView f42736c;

    /* JADX INFO: renamed from: d */
    public VText f42737d;

    /* JADX INFO: renamed from: e */
    public View f42738e;

    /* JADX INFO: renamed from: f */
    public VExpandableTextContainer f42739f;

    /* JADX INFO: renamed from: g */
    public VText f42740g;

    /* JADX INFO: renamed from: h */
    public View f42741h;

    /* JADX INFO: renamed from: i */
    public Moment f42742i;

    /* JADX INFO: renamed from: j */
    public RawFeed f42743j;

    /* JADX INFO: renamed from: k */
    public String f42744k;

    /* JADX INFO: renamed from: l */
    public boolean f42745l;

    /* JADX INFO: renamed from: m */
    public boolean f42746m;

    /* JADX INFO: renamed from: n */
    public boolean f42747n;

    /* JADX INFO: renamed from: o */
    public int f42748o;

    /* JADX INFO: renamed from: p */
    public boolean f42749p;

    /* JADX INFO: renamed from: q */
    public int f42750q;

    /* JADX INFO: renamed from: r */
    public int f42751r;

    /* JADX INFO: renamed from: s */
    public n570 f42752s;

    /* JADX INFO: renamed from: t */
    public PhotoAlbumBaseFrag f42753t;

    /* JADX INFO: renamed from: u */
    public int f42754u;

    /* JADX INFO: renamed from: v */
    public HashMap<String, Boolean> f42755v;

    /* JADX INFO: renamed from: w */
    public LinearLayout f42756w;

    /* JADX INFO: renamed from: x */
    public FeedSharelinkView f42757x;

    /* JADX INFO: renamed from: y */
    public FeedMediaRepeatHintView f42758y;

    /* JADX INFO: renamed from: z */
    public boolean f42759z;

    public FeedCenterView(Context context) {
        super(context);
        this.f42742i = null;
        this.f42743j = null;
        this.f42744k = "";
        this.f42745l = false;
        this.f42748o = -1;
        this.f42749p = false;
        this.f42759z = true;
    }

    /* JADX INFO: renamed from: L */
    private void m65810L(View view) {
        bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.pug
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f154184a.m65825P(view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ boolean m65811Q(View view) {
        m65832a0();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m65812R(View view) {
        if (NullChecker.m82486a(view)) {
            m65810L(view);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m65818B() {
        String textFoldPageId = getTextFoldPageId();
        if (TextUtils.isEmpty(this.f42742i.simpleActivity.name) || TextUtils.isEmpty(textFoldPageId)) {
            return;
        }
        tfj0.m190940c("e_activity_moment", textFoldPageId, jyb.m147494Y(ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID, this.f42742i.simpleActivity.f40083id), jyb.m147494Y("activity_name", this.f42742i.simpleActivity.name), jyb.m147494Y("moment_show_type", "text_and_url"), jyb.m147494Y("moments_user_id", this.f42742i.owner));
    }

    /* JADX INFO: renamed from: C */
    public void mo65780C() {
    }

    /* JADX INFO: renamed from: E */
    public CharSequence m65819E(String str) {
        return !TextUtils.isEmpty(str) ? zuf0.m221643a(str) : this.f42742i.value;
    }

    /* JADX INFO: renamed from: F */
    public void m65820F() {
        FeedMediaRepeatHintView feedMediaRepeatHintView = this.f42758y;
        if (feedMediaRepeatHintView == null) {
            return;
        }
        bnl0.m105524M(feedMediaRepeatHintView, false);
    }

    /* JADX INFO: renamed from: G */
    public void mo65789G() {
        if (this.f42756w == null) {
            return;
        }
        View viewInflate = LayoutInflater.from(getContext()).inflate(tec0.f173688j3, (ViewGroup) this.f42756w, false);
        if (viewInflate instanceof FeedSharelinkView) {
            this.f42757x = (FeedSharelinkView) viewInflate;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, qa00.f156296I);
            layoutParams.topMargin = qa00.f156321h;
            this.f42756w.addView(this.f42757x, layoutParams);
            bnl0.m105524M(this.f42757x, false);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m65821K() {
        this.f42739f.m80388Q(new VExpandableTextContainer.InterfaceC13253e() { // from class: l.rug
            @Override // com.p051p1.mobile.putong.newui.view.VExpandableTextContainer.InterfaceC13253e
            /* JADX INFO: renamed from: a */
            public final void mo80399a(boolean z) {
                this.f164917a.m65824O(z);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public boolean m65822M() {
        boolean z = "from_discover_discussion".equals(this.f42744k) || "from_discover_dating".equals(this.f42744k) || "from_nearby_falls_feed".equals(this.f42744k);
        if (act() instanceof MomentDetailAct) {
            return z && ((MomentDetailAct) act()).f42916d;
        }
        if (act().getClass().getName().contains("NewMainAct")) {
            return z;
        }
        return false;
    }

    /* JADX INFO: renamed from: N */
    public final List<Integer> m65823N() {
        RawFeed rawFeed = this.f42743j;
        if (rawFeed == null || jyb.m147479J(rawFeed.duplicateImgs)) {
            return jyb.m147507f0(new Integer[0]);
        }
        Moment moment = this.f42742i;
        if (moment == null || jyb.m147479J(moment.media)) {
            return jyb.m147507f0(new Integer[0]);
        }
        if (this.f42742i.media.get(0) instanceof Video) {
            return jyb.m147507f0(new Integer[0]);
        }
        User userM145688e8 = FeedModule.f39703d.m145688e8(this.f42742i.owner);
        if (NullChecker.m82486a(userM145688e8) && userM145688e8.isMe()) {
            return jyb.m147507f0(new Integer[0]);
        }
        int size = this.f42742i.media.size();
        Moment moment2 = this.f42742i;
        List<Media> listSubList = size <= 9 ? moment2.media : moment2.media.subList(0, 9);
        ArrayList arrayListM147507f0 = jyb.m147507f0(new Integer[0]);
        for (int i = 0; i < this.f42743j.duplicateImgs.size(); i++) {
            String str = this.f42743j.duplicateImgs.get(i);
            if (!TextUtils.isEmpty(str)) {
                for (int i2 = 0; i2 < listSubList.size(); i2++) {
                    String str2 = listSubList.get(i2).url;
                    if (!TextUtils.isEmpty(str2)) {
                        String[] strArrSplit = str2.split("/");
                        if (strArrSplit.length >= 1 && TextUtils.equals(str, strArrSplit[strArrSplit.length - 1])) {
                            arrayListM147507f0.add(Integer.valueOf(i2));
                        }
                    }
                }
            }
        }
        return arrayListM147507f0;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m65825P(View view) {
        if (this.f42742i == null) {
            return;
        }
        m65835e0(0, false);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m65826S(SpannableStringBuilder spannableStringBuilder, URLSpan[] uRLSpanArr, Moment moment, View view) {
        act().startActivity(orb0.m168893j(act(), spannableStringBuilder.toString(), uRLSpanArr[0].getURL()));
        m65818B();
        if (TextUtils.isEmpty(moment.simpleActivity.name)) {
            tfj0.m190940c("e_campaign_quiz", getTextFoldPageId(), jyb.m147494Y("moment_id", moment.f56859id), jyb.m147494Y("moment_type", er60.m122104w().m122135y(moment)), jyb.m147494Y("actor_user_id", moment.owner));
        }
    }

    /* JADX INFO: renamed from: T */
    public boolean m65827T(n570 n570Var, int i, Moment moment, String str, HashMap<String, Boolean> map, int i2, boolean z, int i3, HashMap<String, Boolean> map2, boolean z2, boolean z3, RawFeed rawFeed, boolean z4) {
        this.f42747n = z3;
        this.f42746m = z2;
        this.f42744k = str;
        this.f42749p = z;
        this.f42750q = i2;
        this.f42752s = n570Var;
        this.f42751r = i3;
        this.f42755v = map2;
        this.f42748o = i;
        this.f42743j = rawFeed;
        this.f42733A = z4;
        boolean z5 = (this.f42742i == null && NullChecker.m82487b(moment) && !moment.f56859id.startsWith("fake_id_")) || (NullChecker.m82487b(this.f42742i) && NullChecker.m82487b(moment) && !this.f42742i.f56859id.equals(moment.f56859id) && !moment.f56859id.startsWith("fake_id_"));
        this.f42742i = moment;
        mo65781Z(i, moment, map);
        m65841z(str);
        return z5;
    }

    /* JADX INFO: renamed from: V */
    public final void m65828V() {
        this.f42739f.getTextView().setTextColor(act().getResources().getColor(k9c0.f124536z));
        this.f42739f.m80382K(act().getResources().getColor(k9c0.f124521n));
        m65841z(this.f42744k);
        this.f42739f.invalidate();
        this.f42739f.getTextView().setTextSize(2, 15.0f);
        this.f42739f.m80387P(qa00.m175859d(2.0f), 1.0f);
    }

    /* JADX INFO: renamed from: W */
    public void m65829W() {
        FeedMediaRepeatHintView feedMediaRepeatHintView = this.f42758y;
        if (feedMediaRepeatHintView == null) {
            return;
        }
        bnl0.m105524M(feedMediaRepeatHintView, false);
        bnl0.m105524M(this.f42758y, !jyb.m147479J(this.f42742i.mediaRepeatIndexList));
        this.f42758y.m66325Q();
    }

    /* JADX INFO: renamed from: X */
    public void m65830X(VText vText, final Moment moment) {
        if (TextUtils.isEmpty(moment.hyperlink)) {
            bnl0.m105524M(vText, false);
            return;
        }
        bnl0.m105524M(vText, true);
        Spanned spannedFromHtml = Html.fromHtml(moment.hyperlink);
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannedFromHtml);
        final URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannedFromHtml.length(), URLSpan.class);
        vText.setText(spannableStringBuilder.toString());
        if (uRLSpanArr == null || uRLSpanArr.length <= 0) {
            return;
        }
        bnl0.m105509E0(vText, new View.OnClickListener() { // from class: l.qug
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f159569a.m65826S(spannableStringBuilder, uRLSpanArr, moment, view);
            }
        });
    }

    /* JADX INFO: renamed from: Y */
    public void m65831Y(Moment moment) {
        MomentAdditionalData momentAdditionalData;
        MomentShareInfo momentShareInfo;
        if (this.f42757x == null) {
            return;
        }
        if (moment == null || (momentAdditionalData = moment.additionalData) == null || (momentShareInfo = momentAdditionalData.share) == null || momentShareInfo.isMomentShareEmpty()) {
            bnl0.m105524M(this.f42757x, false);
        } else {
            bnl0.m105524M(this.f42757x, true);
            this.f42757x.m66416f(moment.additionalData.share, getTextFoldPageId(), moment.f56859id, moment.owner);
        }
    }

    /* JADX INFO: renamed from: Z */
    public void mo65781Z(int i, Moment moment, HashMap<String, Boolean> map) {
        if (cmg.m111174C0() && jyb.m147479J(this.f42742i.mediaRepeatIndexList)) {
            this.f42742i.mediaRepeatIndexList = m65823N();
            FeedModule.f39703d.m145819wd(this.f42742i);
        }
        if (!TextUtils.isEmpty(moment.feedTime) && i == 2 && NullChecker.m82486a(this.f42735b)) {
            bnl0.m105524M(this.f42735b, true);
            boolean zEquals = moment.feedTime.equals(FeedModule.f39700a.getString(R$string.f39924i2));
            VText vText = this.f42737d;
            if (zEquals) {
                bnl0.m105524M(vText, false);
                this.f42736c.setText(moment.feedTime);
                TextView textView = this.f42736c;
                textView.setTextSize(cai.m108498f(textView, qa00.m175859d(50.0f), moment.feedTime, 18.0f));
                TextPaint paint = this.f42736c.getPaint();
                if (paint != null) {
                    paint.setFakeBoldText(true);
                }
            } else {
                bnl0.m105524M(vText, true);
                String[] strArrSplit = moment.feedTime.split("/");
                this.f42736c.setTextSize(26.0f);
                this.f42736c.setText(strArrSplit[0]);
                this.f42737d.setText(strArrSplit[1]);
                TextPaint paint2 = this.f42736c.getPaint();
                if (paint2 != null) {
                    paint2.setFakeBoldText(false);
                }
            }
            if (this.f42751r == 0) {
                int iM175859d = qa00.m175859d(28.0f);
                if (cmg.m111195W() && "from_mine_tab_album".equals(this.f42744k)) {
                    iM175859d = qa00.m175859d(12.0f);
                }
                if ("from_profile_album".equals(this.f42744k)) {
                    iM175859d = qa00.m175859d(22.0f);
                }
                bnl0.m105540X(this.f42735b, iM175859d);
                bnl0.m105540X(this.f42738e, iM175859d);
            } else {
                bnl0.m105540X(this.f42738e, this.f42754u + qa00.m175859d(6.0f));
                bnl0.m105540X(this.f42735b, this.f42754u + qa00.m175859d(6.0f));
            }
        } else {
            bnl0.m105540X(this.f42738e, this.f42754u);
            if (NullChecker.m82486a(this.f42735b) && ((act() instanceof PhotoAlbumFeedAct) || "from_profile_album".equals(this.f42744k) || "from_mine_tab_album".equals(this.f42744k))) {
                bnl0.m105524M(this.f42735b, false);
                bnl0.m105540X(this.f42738e, this.f42754u + qa00.m175859d(9.0f));
            }
        }
        bnl0.m105554f0(this, act() instanceof MomentDetailAct ? qa00.m175859d(8.0f) : 0);
        m65821K();
    }

    /* JADX INFO: renamed from: a0 */
    public final void m65832a0() {
        boolean z;
        if (NullChecker.m82486a(this.f42739f) && NullChecker.m82486a(this.f42742i)) {
            if ((act() instanceof TopicAggregationAct) || (act() instanceof QATopicAggregationActivity) || (act() instanceof FeedPoiAggregationAct)) {
                int[] iArr = new int[2];
                this.f42739f.getLocationOnScreen(iArr);
                Point point = new Point();
                int iM175859d = (iArr[1] - qa00.m175859d(58.0f)) + qa00.m175859d(2.0f);
                int iM105511F0 = bnl0.m105511F0() + bnl0.m105504C(act()) + qa00.m175859d(54.0f);
                if (act() instanceof FeedPoiAggregationAct) {
                    iM105511F0 = bnl0.m105511F0() + qa00.m175859d(44.0f);
                }
                int i = iArr[1];
                if (i < iM105511F0) {
                    point.y = i + this.f42739f.getHeight();
                    z = false;
                } else {
                    point.y = iM175859d;
                    z = true;
                }
                int iM175859d2 = qa00.m175859d(act() instanceof QATopicAggregationActivity ? 52.0f : 64.0f);
                VText textView = this.f42739f.getTextView();
                String str = this.f42742i.value;
                point.x = ((textView.getWidth() / 2) + iM175859d2) - qa00.m175859d(35.0f);
                if (textView.getLineCount() == 1) {
                    point.x = ((int) (iM175859d2 + (Layout.getDesiredWidth(str, 0, str.length(), textView.getPaint()) / 2.0f))) - qa00.m175859d(35.0f);
                }
                bwg.m106691a().m106692b(act(), point, this.f42739f, str, z);
            }
        }
    }

    public Act act() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: b0 */
    public void m65833b0(boolean z) {
        bnl0.m105524M(this.f42741h, z);
        if (z) {
            this.f42738e.setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), qa00.m175859d(20.0f));
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m65834c0(int i) {
        m65835e0(i, true);
    }

    /* JADX INFO: renamed from: e0 */
    public void m65835e0(int i, boolean z) {
        Moment moment = this.f42742i;
        if (moment.isLive) {
            rtg.m183116b(act(), this.f42744k, this.f42742i, this.f42750q, this.f42749p, this.f42752s);
            return;
        }
        if (moment.isVoiceLive) {
            if (moment.momentVoiceLiveInfos == null) {
                rtg.m183119e(act(), this.f42744k, this.f42742i, this.f42750q, this.f42749p, this.f42752s);
                return;
            } else {
                dug.m118145k(moment, this.f42750q, o7i.m166350u(this.f42744k), o7i.m166349t(this.f42744k), "content");
                rtg.m183118d(act(), this.f42744k, this.f42742i, this.f42750q, this.f42749p, this.f42752s);
                return;
            }
        }
        if (!z) {
            m65836f0(i);
            if (this.f42733A) {
                qvm.m178365d().m178367e(act(), this.f42753t, this.f42744k, this.f42742i, "click", this.f42743j);
                return;
            }
            return;
        }
        if (cmg.m111188P() && (this instanceof FeedCenterVideoView) && m65822M()) {
            m65838h0();
            return;
        }
        m65837g0(this.f42742i, i, this.f42746m, this.f42747n);
        if (this.f42733A) {
            qvm.m178365d().m178367e(act(), this.f42753t, this.f42744k, this.f42742i, "preview", this.f42743j);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m65836f0(int i) {
        MomentDetailAct.C11469a c11469aM66023g = MomentDetailAct.C11469a.m66017a(getContext()).m66019c(this.f42746m).m66022f(this.f42744k).m66029m(this.f42742i.f56859id).m66026j(this.f42747n).m66030n(this.f42742i.owner).m66023g(i);
        PhotoAlbumBaseFrag photoAlbumBaseFrag = this.f42753t;
        String string = "";
        MomentDetailAct.C11469a c11469aM66036t = c11469aM66023g.m66034r((photoAlbumBaseFrag == null || photoAlbumBaseFrag.getArguments() == null) ? "" : this.f42753t.getArguments().getString("keyOriginFrom")).m66036t(true);
        PhotoAlbumBaseFrag photoAlbumBaseFrag2 = this.f42753t;
        if (photoAlbumBaseFrag2 != null && photoAlbumBaseFrag2.getArguments() != null) {
            string = this.f42753t.getArguments().getString("keyHideNeedMatchUid");
        }
        Intent intentM66018b = c11469aM66036t.m66033q(string).m66024h(act().getClass().getName().contains("NewMainAct")).m66031o(this.f42742i.momentValue).m66035s(this.f42743j).m66018b();
        if (intentM66018b == null) {
            return;
        }
        act().startActivity(intentM66018b);
    }

    /* JADX INFO: renamed from: g0 */
    public void m65837g0(Moment moment, int i, boolean z, boolean z2) {
        String str = ksg.m151191Z(moment) ? moment.thirdShareSource.sourceId : moment.f56859id;
        this.f42746m = z;
        this.f42747n = z2;
        if (!FeedModule.f39703d.f121357i0.containsKey(moment.f56859id)) {
            FeedModule.f39703d.f121357i0.put(moment.f56859id, moment);
        }
        act().startActivityWithCustomTransition(PhotoAlbumFeedPreviewAct.m66490a2(act(), str, i, true, this.f42744k, z, z2, this.f42748o), new gg70());
        dug.m118135a(this, moment, this.f42744k, this.f42749p, this.f42745l);
    }

    public String getTextFoldPageId() {
        return act() instanceof MomentDetailAct ? "p_user_moment_interactions_details_view" : ksg.m151174K(this.f42744k, this.f42749p);
    }

    /* JADX INFO: renamed from: h0 */
    public void m65838h0() {
        m65839j0(this.f42742i);
    }

    /* JADX INFO: renamed from: j0 */
    public void m65839j0(Moment moment) {
        act().startActivityWithCustomTransition(FeedVideoFlowAct.C11539a.m67377a(act()).m67381e(ksg.m151191Z(moment) ? moment.thirdShareSource.sourceId : moment.f56859id).m67379c(this.f42744k).m67380d(this.f42747n).m67378b(), new pai());
        dug.m118135a(this, moment, this.f42744k, this.f42749p, this.f42745l);
    }

    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public void m65824O(boolean z) {
        if (this.f42742i == null) {
            return;
        }
        if (z) {
            tfj0.m190940c("e_text_fold", getTextFoldPageId(), ksg.m151208i(this.f42744k, pf60.m172085a("moment_id", this.f42742i.f56859id), pf60.m172085a("owner_id", this.f42742i.owner), pf60.m172085a("show_state", "show_more")));
        } else {
            tfj0.m190940c("e_text_fold", getTextFoldPageId(), ksg.m151208i(this.f42744k, pf60.m172085a("moment_id", this.f42742i.f56859id), pf60.m172085a("owner_id", this.f42742i.owner), pf60.m172085a("show_state", "show_less")));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        mo65780C();
        mo65785r();
        mo65789G();
        this.f42739f.getTextView().setOnLongClickListener(new View.OnLongClickListener() { // from class: l.nug
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f143713a.m65811Q(view);
            }
        });
        jyb.m147537z(jyb.m147507f0(this.f42739f.getTextView(), this.f42740g, this.f42734a), new y20() { // from class: l.oug
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f149149a.m65812R((View) obj);
            }
        });
        this.f42754u = ((FrameLayout.LayoutParams) this.f42738e.getLayoutParams()).topMargin;
        m65828V();
    }

    /* JADX INFO: renamed from: r */
    public void mo65785r() {
    }

    public void setCurrentFrag(PhotoAlbumBaseFrag photoAlbumBaseFrag) {
        this.f42753t = photoAlbumBaseFrag;
    }

    /* JADX INFO: renamed from: z */
    public void m65841z(String str) {
        this.f42739f.setLineLimit((!(act() instanceof MomentDetailAct) || "from_moment_detail_album".equals(str)) ? 4 : Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public FeedCenterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42742i = null;
        this.f42743j = null;
        this.f42744k = "";
        this.f42745l = false;
        this.f42748o = -1;
        this.f42749p = false;
        this.f42759z = true;
    }

    public FeedCenterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f42742i = null;
        this.f42743j = null;
        this.f42744k = "";
        this.f42745l = false;
        this.f42748o = -1;
        this.f42749p = false;
        this.f42759z = true;
    }
}
