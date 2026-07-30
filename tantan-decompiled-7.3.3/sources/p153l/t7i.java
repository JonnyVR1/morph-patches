package p153l;

import android.animation.Animator;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.Location;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.LiveCircleExtInfo;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.RawFeed;
import com.p051p1.mobile.putong.feed.helper.exception.FeedGPException;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedtop.PhotoAlbumTopView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.p051p1.mobile.putong.feed.newui.topic.topicaggregation.TopicAggregationAct;
import com.p051p1.mobile.putong.feed.newui.view.FeedUserSexAndAgeView;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import org.json.JSONObject;
import p151v.VDraweeView;
import p151v.VFrame;

/* JADX INFO: loaded from: classes13.dex */
public class t7i extends l7i<lnh> {

    /* JADX INFO: renamed from: t */
    public static String f172431t;

    /* JADX INFO: renamed from: s */
    public f7i f172432s;

    /* JADX INFO: renamed from: l.t7i$b */
    public class C20253b extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SVGAnimationView f172436a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ PhotoAlbumTopView f172437b;

        public C20253b(SVGAnimationView sVGAnimationView, PhotoAlbumTopView photoAlbumTopView) {
            this.f172436a = sVGAnimationView;
            this.f172437b = photoAlbumTopView;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m189610a(SVGAnimationView sVGAnimationView, PhotoAlbumTopView photoAlbumTopView) {
            sVGAnimationView.setVisibility(8);
            photoAlbumTopView.removeView(sVGAnimationView);
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            Animator animatorM132170p = gt0.m132170p(this.f172436a, "alpha", 0L, 250L, new LinearInterpolator(), 1.0f, 0.0f);
            final SVGAnimationView sVGAnimationView = this.f172436a;
            final PhotoAlbumTopView photoAlbumTopView = this.f172437b;
            gt0.m132160f(animatorM132170p, new Runnable() { // from class: l.u7i
                @Override // java.lang.Runnable
                public final void run() {
                    t7i.C20253b.m189610a(sVGAnimationView, photoAlbumTopView);
                }
            });
            animatorM132170p.start();
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
        }
    }

    public t7i(lnh lnhVar, dj70 dj70Var) {
        super(lnhVar, dj70Var);
        if (cmg.m111191S()) {
            m189600a0();
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m189579G(boolean z) {
        if (this.f130347a.f88794d) {
            bnl0.m105524M(((lnh) this.f130363q).f132820w, false);
        } else {
            FeedUserSexAndAgeView feedUserSexAndAgeView = (FeedUserSexAndAgeView) View.inflate(m153130o(), tec0.f173681i3, null);
            feedUserSexAndAgeView.m67558d(this.f130347a.f88796f, 4, 4);
            ((lnh) this.f130363q).f132820w.removeAllViews();
            ((lnh) this.f130363q).f132820w.addView(feedUserSexAndAgeView);
            bnl0.m105524M(((lnh) this.f130363q).f132820w, true);
            bnl0.m105507D0(-2, ((lnh) this.f130363q).f132817t);
            if (this.f130347a.f88793c) {
                bnl0.m105524M(feedUserSexAndAgeView, cmg.m111201c());
            }
        }
        bnl0.m105524M(((lnh) this.f130363q).f132781G, false);
    }

    /* JADX INFO: renamed from: H */
    public final void m189580H(boolean z) {
        if ((cmg.m111197Y() || cmg.m111233s()) && !z) {
            if ((bnl0.m105529O0(((lnh) this.f130363q).f132785K) && bnl0.m105529O0(((lnh) this.f130363q).f132789O)) || (bnl0.m105529O0(((lnh) this.f130363q).f132785K) && bnl0.m105529O0(((lnh) this.f130363q).f132791Q))) {
                bnl0.m105524M(((lnh) this.f130363q).f132788N, true);
            } else {
                bnl0.m105524M(((lnh) this.f130363q).f132788N, false);
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m189581I(boolean z) {
        User user = this.f130347a.f88796f;
        if (user == null || user.isMe() || z || this.f130347a.f88796f.isTeamAccount()) {
            bnl0.m105524M(((lnh) this.f130363q).f132785K, false);
            return;
        }
        if (!TextUtils.equals(this.f130347a.f88792b, "from_like") && !pu20.m173797B(this.f130347a.f88792b)) {
            bnl0.m105524M(((lnh) this.f130363q).f132785K, false);
            return;
        }
        if (!NullChecker.m82486a(this.f130347a.f88801k) || TextUtils.isEmpty(this.f130347a.f88801k.relationshipName)) {
            bnl0.m105524M(((lnh) this.f130363q).f132785K, false);
            return;
        }
        bnl0.m105524M(((lnh) this.f130363q).f132785K, true);
        ((lnh) this.f130363q).f132787M.setText(this.f130347a.f88801k.relationshipName);
        uqb0.f180374G.m127115L0(((lnh) this.f130363q).f132786L, this.f130347a.f88801k.relationshipIconUrl);
    }

    /* JADX INFO: renamed from: J */
    public final void m189582J(boolean z) {
        String strM175811p;
        User user;
        Location location;
        RawFeed rawFeed;
        if (NullChecker.m82486a(m153139x().location)) {
            strM175811p = ksg.m151234v(m153139x().location);
        } else {
            strM175811p = (!m189589Q(m153139x()) || (user = this.f130347a.f88796f) == null || (location = user.location) == null) ? "" : q8g0.m175811p(location.distance, true);
        }
        if (((pu20.m173798C(this.f130347a.f88792b) && !z) || (cmg.m111173C() && ksg.m151193a0(this.f130347a.f88792b))) && ((rawFeed = this.f130347a.f88801k) == null || (strM175811p = rawFeed.locationName) == null)) {
            strM175811p = "";
        }
        ((lnh) this.f130363q).f132791Q.setText(TextUtils.isEmpty(strM175811p) ? "" : strM175811p);
        bnl0.m105524M(((lnh) this.f130363q).f132791Q, !TextUtils.isEmpty(strM175811p));
        if (("topic_latest".equals(this.f130347a.f88792b) || "topic_recommend".equals(this.f130347a.f88792b) || "from_group_detail_recommend".equals(this.f130347a.f88792b) || "from_group_detail_new".equals(this.f130347a.f88792b) || ((cmg.m111233s() && (("from_discover_discussion".equals(this.f130347a.f88792b) && !pu20.m173802G()) || (("from_discover_dating".equals(this.f130347a.f88792b) && !pu20.m173799D()) || (("from_activity_tab_one".equals(this.f130347a.f88792b) && !pu20.m173799D()) || ("from_activity_tab_two".equals(this.f130347a.f88792b) && !pu20.m173799D()))))) || "from_poi_aggregation".equals(this.f130347a.f88792b))) && !z) {
            bnl0.m105524M(((lnh) this.f130363q).f132791Q, false);
            this.f130347a.f88805o.f161475a = true;
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m189583K(boolean z) {
        if (bnl0.m105529O0(((lnh) this.f130363q).f132791Q) && bnl0.m105529O0(((lnh) this.f130363q).f132789O)) {
            bnl0.m105524M(((lnh) this.f130363q).f132790P, true);
        } else {
            bnl0.m105524M(((lnh) this.f130363q).f132790P, false);
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m189584L() {
        if (!owi.m169567c() || !TEnum.equals(m153139x().settings.visibility, "selfOnly")) {
            bnl0.m105524M(((lnh) this.f130363q).f132784J, false);
            return;
        }
        if (f172431t == null) {
            f172431t = cai.m108499g(((lnh) this.f130363q).f132784J, qa00.m175859d(2.0f));
        }
        ((lnh) this.f130363q).f132784J.setText(m153130o().getString(R$string.f39941k5) + f172431t + "·" + f172431t);
        bnl0.m105524M(((lnh) this.f130363q).f132784J, true);
    }

    /* JADX INFO: renamed from: M */
    public final void m189585M(boolean z) {
        String strM170908q;
        if (((cmg.m111176D0() && "from_nearby_falls_feed".equals(this.f130347a.f88792b)) || "topic_recommend".equals(this.f130347a.f88792b) || "from_group_detail_recommend".equals(this.f130347a.f88792b) || ("from_discover_discussion".equals(this.f130347a.f88792b) && m153139x().getRecommendTime() != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && !z)) && skh.m186450b()) {
            strM170908q = ((double) System.currentTimeMillis()) < m153139x().getRecommendTime() ? "1秒以前推荐" : ksg.m151159C0(m153139x().getRecommendTime());
        } else {
            strM170908q = p6i.m170908q(m153139x().createdTime);
        }
        if (("from_discover_dating".equals(this.f130347a.f88792b) && !z) || (("from_activity_tab_one".equals(this.f130347a.f88792b) && !z) || (("from_activity_tab_two".equals(this.f130347a.f88792b) && !z) || ((cmg.m111173C() && ksg.m151193a0(this.f130347a.f88792b)) || ("from_poi_aggregation".equals(this.f130347a.f88792b) && !z))))) {
            strM170908q = ksg.m151168H((long) m153139x().createdTime, this.f130347a.f88796f.getLastActiveTimeMillis());
        }
        if (cmg.m111233s() && (("from_discover_discussion".equals(this.f130347a.f88792b) && !pu20.m173804I()) || (("from_discover_dating".equals(this.f130347a.f88792b) && !pu20.m173801F()) || (("from_activity_tab_one".equals(this.f130347a.f88792b) && !pu20.m173801F()) || ("from_activity_tab_two".equals(this.f130347a.f88792b) && !pu20.m173801F()))))) {
            strM170908q = "";
        }
        if (cmg.m111247z() && TextUtils.equals(this.f130347a.f88792b, "from_discover_discussion") && NullChecker.m82486a(this.f130347a.f88801k) && !TextUtils.isEmpty(this.f130347a.f88801k.recommendReason)) {
            strM170908q = this.f130347a.f88801k.recommendReason;
        }
        ((lnh) this.f130363q).f132789O.setText(strM170908q != null ? strM170908q : "");
        bnl0.m105524M(((lnh) this.f130363q).f132789O, !TextUtils.isEmpty(strM170908q));
    }

    /* JADX INFO: renamed from: N */
    public final BubbleInfo m189586N() {
        if (!NullChecker.m82486a(this.f130347a.f88791a) || !NullChecker.m82486a(this.f130347a.f88800j) || !this.f130347a.f88800j.m161687p()) {
            return null;
        }
        dj70 dj70Var = this.f130347a;
        RawFeed rawFeedM177160c = dj70Var.f88800j.f140315b.m177160c(dj70Var.f88791a.f56859id);
        if (rawFeedM177160c == null) {
            return null;
        }
        return (BubbleInfo) jyb.m147529r(rawFeedM177160c.states, new qcj() { // from class: l.s7i
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f166690a.m189594V((BubbleInfo) obj);
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public final void m189587O() {
        if ((m153130o() instanceof TopicAggregationAct) && NullChecker.m82486a(((lnh) this.f130363q).f132794T) && !jyb.m147479J(m153139x().labels) && !TextUtils.isEmpty(m153139x().labels.get(0).display)) {
            ((lnh) this.f130363q).f132793S.setVisibility(0);
            ((lnh) this.f130363q).f132794T.setText(m153139x().labels.get(0).display);
            final int iMeasureText = (int) (((lnh) this.f130363q).f132794T.getPaint().measureText((String) ((lnh) this.f130363q).f132794T.getText()) + qa00.m175859d(8.0f));
            bnl0.m105533Q0(((lnh) this.f130363q).f132794T, new y20() { // from class: l.q7i
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f155962a.m189595W(iMeasureText, (int[]) obj);
                }
            });
            bnl0.m105554f0(((lnh) this.f130363q).f132803f, 0);
            return;
        }
        if (NullChecker.m82486a(((lnh) this.f130363q).f132803f)) {
            ((lnh) this.f130363q).f132793S.setVisibility(4);
            bnl0.m105554f0(((lnh) this.f130363q).f132803f, qa00.m175859d(0.0f));
            List<Double> list = this.f130347a.f88796f.profile.extensions.headFrame.expiredTime;
            if (jyb.m147479J(list) || list.get(0).doubleValue() <= pzi0.m174454o() || jyb.m147479J(this.f130347a.f88796f.profile.extensions.headFrame.url) || !(m153130o() instanceof MomentDetailAct)) {
                return;
            }
            bnl0.m105554f0(((lnh) this.f130363q).f132803f, qa00.m175859d(2.0f));
        }
    }

    /* JADX INFO: renamed from: P */
    public final boolean m189588P() {
        return (this.f130347a.f88792b.equals("from_discover_discussion") || this.f130347a.f88792b.equals("from_discover_dating") || this.f130347a.f88792b.equals("from_nearby_focus")) && !this.f130347a.f88793c;
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m189589Q(Moment moment) {
        return moment.isLive || moment.isVoiceLive;
    }

    /* JADX INFO: renamed from: R */
    public final boolean m189590R(BubbleInfo bubbleInfo) {
        if (bubbleInfo == null || !bubbleInfo.checkStateTimeIsValid()) {
            return false;
        }
        if (((m153130o() instanceof TopicAggregationAct) && NullChecker.m82486a(((lnh) this.f130363q).f132794T) && !jyb.m147479J(m153139x().labels) && !TextUtils.isEmpty(m153139x().labels.get(0).display)) || m153139x().hasHeadFrame) {
            return false;
        }
        dj70 dj70Var = this.f130347a;
        return dj70Var.f88793c || !u6i.m194709b(dj70Var, dj70Var.f88791a) || (m153130o() instanceof TopicAggregationAct);
    }

    /* JADX INFO: renamed from: S */
    public final boolean m189591S(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("like_relation_fuction");
            if (!TextUtils.isEmpty(strM80485F)) {
                String strOptString = new JSONObject(strM80485F).optString("likeButton");
                if (TextUtils.isEmpty(strOptString)) {
                    return false;
                }
                return new JSONObject(strOptString).optBoolean(str, false);
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m189592T(String str) {
        String str2;
        if ("from_like".equals(this.f130347a.f88792b)) {
            return true;
        }
        str.getClass();
        switch (str) {
            case "from_discover_discussion":
                str2 = "discussion";
                break;
            case "topic_recommend":
            case "topic_latest":
                str2 = "topic";
                break;
            case "from_discover_dating":
                str2 = "nearby";
                break;
            case "from_nearby_focus":
                str2 = "follow";
                break;
            default:
                str2 = null;
                break;
        }
        return m189591S(str2);
    }

    /* JADX INFO: renamed from: U */
    public final Pair<Boolean, String> m189593U(dj70 dj70Var) {
        if (this.f130347a.f88793c) {
            return new Pair<>(Boolean.FALSE, null);
        }
        User user = dj70Var.f88796f;
        if (user == null || User.isMatched(user)) {
            return new Pair<>(Boolean.FALSE, null);
        }
        if (ksg.m151237w0()) {
            return ((cmg.m111239v() || cmg.m111241w()) && pu20.m173797B(dj70Var.f88792b) && NullChecker.m82486a(dj70Var.f88801k) && !TextUtils.isEmpty(dj70Var.f88801k.relationshipName) && dj70Var.f88801k.relationshipName.contains("喜欢了你")) ? new Pair<>(Boolean.TRUE, ksg.m151239x0()) : new Pair<>(Boolean.FALSE, null);
        }
        return new Pair<>(Boolean.FALSE, null);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ Boolean m189594V(BubbleInfo bubbleInfo) {
        return Boolean.valueOf(TextUtils.equals(this.f130347a.f88796f.f56859id, bubbleInfo.owner.f39651id));
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m189595W(int i, int[] iArr) {
        if (m153139x().labels == null || m153139x().labels.size() <= 0) {
            return;
        }
        ((lnh) this.f130363q).f132794T.setBackground(new tmd0(Color.parseColor(m153139x().labels.get(0).bgColor), qa00.m175859d(5.0f), Math.max(iArr[0], i), iArr[1]));
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m189596X(BubbleInfo bubbleInfo) {
        if (bubbleInfo == null) {
            return;
        }
        bnl0.m105524M(this.f130361o, true);
        if (!NullChecker.m82486a(bubbleInfo.emotion) || TextUtils.isEmpty(bubbleInfo.emotion.emojiUrl)) {
            return;
        }
        fsb0 fsb0Var = uqb0.f180374G;
        VDraweeView vDraweeView = this.f130362p;
        String str = bubbleInfo.emotion.emojiUrl;
        int i = qa00.f156326m;
        fsb0Var.m127109I0(vDraweeView, str, i, i);
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m189597Y(String str) {
        if ((TextUtils.equals(this.f130347a.f88792b, "from_nearby_focus") || TextUtils.equals(this.f130347a.f88792b, "from_like") || TextUtils.equals(this.f130347a.f88792b, "from_discover_discussion") || TextUtils.equals(this.f130347a.f88792b, "from_discover_dating")) && TextUtils.equals(this.f130347a.f88791a.f56859id, str)) {
            dj70 dj70Var = this.f130347a;
            T t = this.f130363q;
            m189608i0(dj70Var, ((lnh) t).f132811n, ((lnh) t).f132798a);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m189598Z() {
        User user;
        dj70 dj70Var = this.f130347a;
        if (dj70Var.f88797g == null || (user = dj70Var.f88796f) == null || TextUtils.isEmpty(user.f56859id)) {
            return;
        }
        dj70 dj70Var2 = this.f130347a;
        dj70Var2.f88797g.duringCreated(FeedModule.f39703d.m145702g8(dj70Var2.f88796f.f56859id)).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.p7i
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f150939a.m189596X((BubbleInfo) obj);
            }
        }));
    }

    @Override // p153l.v7i
    /* JADX INFO: renamed from: a */
    public void mo189599a() {
        if (bnl0.m105529O0(((lnh) this.f130363q).f132780F)) {
            ((lnh) this.f130363q).f132780F.m65609j();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m189600a0() {
        User user;
        dj70 dj70Var = this.f130347a;
        if (dj70Var.f88797g == null || (user = dj70Var.f88796f) == null || TextUtils.isEmpty(user.f56859id)) {
            return;
        }
        this.f130347a.f88797g.duringCreated(FeedModule.f39703d.f121392z1).subscribe(psd0.m173596G(new y20() { // from class: l.r7i
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161618a.m189597Y((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b0 */
    public final void m189601b0() {
        dj70 dj70Var = this.f130347a;
        if (dj70Var.f88793c) {
            bnl0.m105524M(((lnh) this.f130363q).f132795U, false);
            return;
        }
        if (!NullChecker.m82486a(dj70Var.f88801k) || !NullChecker.m82486a(this.f130347a.f88801k.interaction) || TextUtils.isEmpty(this.f130347a.f88801k.interaction.text)) {
            bnl0.m105524M(((lnh) this.f130363q).f132795U, false);
            return;
        }
        bnl0.m105540X(((lnh) this.f130363q).f132803f, qa00.m175859d(25.0f));
        bnl0.m105524M(((lnh) this.f130363q).f132795U, true);
        ((lnh) this.f130363q).f132797W.setText(this.f130347a.f88801k.interaction.text);
        uqb0.f180374G.m127115L0(((lnh) this.f130363q).f132796V, this.f130347a.f88801k.interaction.icon);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m189602c0() {
        dj70 dj70Var = this.f130347a;
        if (!dj70Var.f88793c && TextUtils.equals(dj70Var.f88792b, "from_like") && NullChecker.m82486a(this.f130347a.f88801k)) {
            dj70 dj70Var2 = this.f130347a;
            if (dj70Var2.f88801k.showLikeSplitLine) {
                bnl0.m105540X(((lnh) this.f130363q).f132799b, qa00.m175859d(dj70Var2.f88798h == 0 ? 3.0f : 15.0f));
                bnl0.m105537U(((lnh) this.f130363q).f132799b, qa00.m175859d(this.f130347a.f88798h == 0 ? 10.0f : 21.0f));
                ((lnh) this.f130363q).f132800c.getPaint().setFakeBoldText(true);
                bnl0.m105524M(((lnh) this.f130363q).f132799b, true);
                ((lnh) this.f130363q).f132800c.setText(this.f130347a.f88798h == 0 ? "喜欢的人新动态会出现在这里" : "喜欢的人近期动态都看完了");
                ((lnh) this.f130363q).f132801d.setText(this.f130347a.f88798h == 0 ? "为你推荐了一些可能喜欢的动态" : "为你推荐更多可能喜欢的动态");
                return;
            }
        }
        bnl0.m105540X(((lnh) this.f130363q).f132802e, qa00.m175859d(0.0f));
        bnl0.m105524M(((lnh) this.f130363q).f132799b, false);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m189603d0() {
        if (NullChecker.m82486a(((lnh) this.f130363q).f132806i) && m189588P()) {
            ((lnh) this.f130363q).f132806i.setVisibility(8);
            List<Double> list = this.f130347a.f88796f.profile.extensions.tailFrame.expiredTime;
            if (jyb.m147479J(list) || list.get(0).doubleValue() <= pzi0.m174454o() || jyb.m147479J(this.f130347a.f88796f.profile.extensions.tailFrame.url)) {
                return;
            }
            ((lnh) this.f130363q).f132806i.setVisibility(0);
            uqb0.f180374G.m127115L0(((lnh) this.f130363q).f132806i, this.f130347a.f88796f.profile.extensions.tailFrame.url.get(0));
            m153139x().setHasHeadFrame(true);
        }
    }

    @Override // p153l.l7i, p153l.v7i
    /* JADX INFO: renamed from: e */
    public void mo153129e() {
        super.mo153129e();
        if (NullChecker.m82486a(this.f130347a.f88801k) && this.f130347a.f88801k.isRoamHighlight) {
            this.f130348b.setVisibility(0);
            return;
        }
        Pair<Boolean, String> pairM189593U = m189593U(this.f130347a);
        if (this.f130347a.f88793c || ((!cmg.m111183K() && "topic_recommend".equals(this.f130347a.f88792b)) || ((Boolean) pairM189593U.first).booleanValue() || ((!cmg.m111187O() && "from_group_detail_recommend".equals(this.f130347a.f88792b)) || ((!cmg.m111187O() && "from_group_detail_new".equals(this.f130347a.f88792b)) || ((cmg.m111187O() && ksg.m151185T(this.f130347a.f88792b)) || ((cmg.m111183K() && m189592T(this.f130347a.f88792b)) || "from_live_square_tab".equals(this.f130347a.f88792b) || (("from_nearby_online".equals(this.f130347a.f88792b) || "from_poi_aggregation".equals(this.f130347a.f88792b)) && cmg.m111225o()))))))) {
            if (this.f172432s == null) {
                this.f172432s = new f7i();
            }
            f7i f7iVar = this.f172432s;
            dj70 dj70Var = this.f130347a;
            T t = this.f130363q;
            f7iVar.m124459s(dj70Var, ((lnh) t).f132807j, ((lnh) t).f132808k, (String) pairM189593U.second, ((lnh) t).f132798a);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m189604e0() {
        boolean zNeedShowFrame = this.f130347a.f88796f.needShowFrame();
        T t = this.f130363q;
        if (zNeedShowFrame) {
            ((lnh) t).f132815r.m224133x(this.f130347a.f88796f.headFrameUrl(), 1);
            m153139x().setHasHeadFrame(true);
            return;
        }
        if (!NullChecker.m82486a(((lnh) t).f132815r)) {
            FeedGPException.reportMomentDetailTopViewExc(this.f130347a.f88792b);
            return;
        }
        ((lnh) this.f130363q).f132815r.setVisibility(8);
        List<Double> list = this.f130347a.f88796f.profile.extensions.headFrame.expiredTime;
        if (jyb.m147479J(list) || list.get(0).doubleValue() <= pzi0.m174454o() || jyb.m147479J(this.f130347a.f88796f.profile.extensions.headFrame.url)) {
            return;
        }
        ((lnh) this.f130363q).f132815r.setVisibility(0);
        uqb0.f180374G.m127115L0(((lnh) this.f130363q).f132815r, this.f130347a.f88796f.profile.extensions.headFrame.url.get(0));
        m153139x().setHasHeadFrame(true);
    }

    @Override // p153l.l7i, p153l.v7i
    /* JADX INFO: renamed from: f */
    public void mo96460f() {
        super.mo96460f();
    }

    /* JADX INFO: renamed from: f0 */
    public final void m189605f0() {
        User user = this.f130347a.f88796f;
        if (user == null || TextUtils.isEmpty(user.f56859id)) {
            return;
        }
        BubbleInfo bubbleInfoM189586N = m189586N();
        boolean zM189590R = m189590R(bubbleInfoM189586N);
        bnl0.m105524M(this.f130361o, zM189590R);
        if (zM189590R && NullChecker.m82486a(bubbleInfoM189586N.emotion) && !TextUtils.isEmpty(bubbleInfoM189586N.emotion.emojiUrl)) {
            fsb0 fsb0Var = uqb0.f180374G;
            VDraweeView vDraweeView = this.f130362p;
            String str = bubbleInfoM189586N.emotion.emojiUrl;
            int i = qa00.f156326m;
            fsb0Var.m127109I0(vDraweeView, str, i, i);
        }
    }

    @Override // p153l.v7i
    /* JADX INFO: renamed from: g */
    public void mo124337g(dj70 dj70Var) {
        bnl0.m105524M(((lnh) this.f130363q).f132812o, true);
        bnl0.m105524M(((lnh) this.f130363q).f132815r, true);
        bnl0.m105524M(((lnh) this.f130363q).f132816s, false);
        bnl0.m105524M(((lnh) this.f130363q).f132819v, true);
        bnl0.m105524M(((lnh) this.f130363q).f132806i, m189588P());
    }

    /* JADX INFO: renamed from: g0 */
    public final void m189606g0(boolean z) {
        ((lnh) this.f130363q).f132780F.setVisibility(8);
    }

    @Override // p153l.l7i, p153l.v7i
    /* JADX INFO: renamed from: h */
    public void mo96461h() {
        super.mo96461h();
        if (bnl0.m105529O0(((lnh) this.f130363q).f132816s)) {
            return;
        }
        uqb0.f180396b0.f170325b.showUserVerificationLogo(m153130o(), this.f130347a.f88796f, ((lnh) this.f130363q).f132819v);
        VFrame vFrame = (VFrame) ((lnh) this.f130363q).f132819v.getParent();
        if (!NullChecker.m82486a(vFrame) || bnl0.m105529O0(((lnh) this.f130363q).f132819v)) {
            bnl0.m105550d0(vFrame, qa00.m175859d(2.0f));
        } else {
            bnl0.m105550d0(vFrame, 0);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m189607h0() {
        dj70 dj70Var;
        Moment moment;
        dj70 dj70Var2 = this.f130347a;
        if (dj70Var2 == null || !"from_live_square_tab".equals(dj70Var2.f88792b) || (moment = (dj70Var = this.f130347a).f88791a) == null || moment.liveCircleExtInfo == null || dj70Var.f88793c) {
            bnl0.m105524M(((lnh) this.f130363q).f132778D, false);
            return;
        }
        s1u s1uVarMo68456mg = FeedModule.m61407M().mo68456mg();
        VDraweeView vDraweeView = ((lnh) this.f130363q).f132778D;
        LiveCircleExtInfo liveCircleExtInfo = this.f130347a.f88791a.liveCircleExtInfo;
        s1uVarMo68456mg.mo184061a(vDraweeView, liveCircleExtInfo.coverUrl, liveCircleExtInfo.grade);
    }

    /* JADX INFO: renamed from: i0 */
    public void m189608i0(dj70 dj70Var, View view, PhotoAlbumTopView photoAlbumTopView) {
        SVGAnimationView sVGAnimationViewM178649a = qyh.m178649a(dj70Var.f88797g, photoAlbumTopView, view, qa00.m175859d(15.0f), -qa00.m175859d(3.0f), 40.0f, 52.0f);
        if (photoAlbumTopView.getTag() != null) {
            photoAlbumTopView.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener) photoAlbumTopView.getTag());
        }
        ViewOnAttachStateChangeListenerC20252a viewOnAttachStateChangeListenerC20252a = new ViewOnAttachStateChangeListenerC20252a(sVGAnimationViewM178649a, photoAlbumTopView);
        photoAlbumTopView.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC20252a);
        photoAlbumTopView.setTag(viewOnAttachStateChangeListenerC20252a);
        sVGAnimationViewM178649a.setVisibility(0);
        SVGALoader.with(dj70Var.f88797g).from("https://auto.tancdn.com/v1/raw/2fe249b8-00f2-4002-b7d5-b7116c6c754013.pdf").autoPlay(false).repeatCount(1).animListener(new C20253b(sVGAnimationViewM178649a, photoAlbumTopView)).into(sVGAnimationViewM178649a);
        sVGAnimationViewM178649a.startAnimation();
    }

    @Override // p153l.l7i, p153l.v7i
    /* JADX INFO: renamed from: j */
    public void mo96462j() {
        super.mo96462j();
        m189579G(this.f130347a.f88793c);
        m189581I(this.f130347a.f88793c);
        m189585M(this.f130347a.f88793c);
        m189580H(this.f130347a.f88793c);
        m189582J(this.f130347a.f88793c);
        m189583K(this.f130347a.f88793c);
        m189604e0();
        m189603d0();
        m189584L();
        m189607h0();
        m189606g0(this.f130347a.f88793c);
        m189601b0();
        if (cmg.m111218k0()) {
            if (this.f130347a.f88793c) {
                m189598Z();
            } else {
                m189605f0();
            }
        }
        m189602c0();
    }

    @Override // p153l.v7i
    /* JADX INFO: renamed from: k */
    public void mo189609k(dj70 dj70Var) {
        super.mo189609k(dj70Var);
        s6i s6iVar = this.f130347a.f88803m;
        if (s6iVar == null || !s6iVar.m184914d()) {
            m189587O();
        }
    }

    @Override // p153l.l7i
    /* JADX INFO: renamed from: p */
    public void mo153131p() {
        T t = this.f130363q;
        this.f130348b = ((lnh) t).f132809l;
        this.f130349c = ((lnh) t).f132807j;
        this.f130350d = ((lnh) t).f132808k;
        this.f130351e = ((lnh) t).f132810m;
        this.f130352f = ((lnh) t).f132812o;
        this.f130353g = ((lnh) t).f132819v;
        this.f130354h = ((lnh) t).f132817t;
        this.f130355i = ((lnh) t).f132818u;
        this.f130356j = ((lnh) t).f132821x;
        this.f130357k = ((lnh) t).f132822y;
        this.f130358l = ((lnh) t).f132775A;
        this.f130359m = ((lnh) t).f132792R;
        this.f130360n = ((lnh) t).f132823z;
        this.f130361o = ((lnh) t).f132813p;
        this.f130362p = ((lnh) t).f132814q;
    }

    @Override // p153l.l7i
    /* JADX INFO: renamed from: y */
    public void mo153140y() {
        super.mo153140y();
        ((lnh) this.f130363q).f132815r.setVisibility(8);
        ((lnh) this.f130363q).f132806i.setVisibility(8);
    }

    @Override // p153l.l7i
    /* JADX INFO: renamed from: z */
    public void mo153141z() {
        super.mo153141z();
        m153132q(((lnh) this.f130363q).f132811n);
    }

    /* JADX INFO: renamed from: l.t7i$a */
    public class ViewOnAttachStateChangeListenerC20252a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SVGAnimationView f172433a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ PhotoAlbumTopView f172434b;

        public ViewOnAttachStateChangeListenerC20252a(SVGAnimationView sVGAnimationView, PhotoAlbumTopView photoAlbumTopView) {
            this.f172433a = sVGAnimationView;
            this.f172434b = photoAlbumTopView;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (NullChecker.m82486a(this.f172433a)) {
                this.f172433a.stopAnimation(false);
                this.f172434b.removeView(this.f172433a);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
