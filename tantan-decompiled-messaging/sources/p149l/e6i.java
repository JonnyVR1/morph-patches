package p149l;

import android.animation.Animator;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.Location;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.LiveCircleExtInfo;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.RawFeed;
import com.p046p1.mobile.putong.feed.helper.exception.FeedGPException;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedtop.PhotoAlbumTopView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.p046p1.mobile.putong.feed.newui.topic.topicaggregation.TopicAggregationAct;
import com.p046p1.mobile.putong.feed.newui.view.FeedUserSexAndAgeView;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import org.json.JSONObject;
import p147v.VDraweeView;
import p147v.VFrame;

/* JADX INFO: loaded from: classes12.dex */
public class e6i extends w5i<wlh> {

    /* JADX INFO: renamed from: t */
    public static String f89576t;

    /* JADX INFO: renamed from: s */
    public q5i f89577s;

    /* JADX INFO: renamed from: l.e6i$b */
    public class C16548b extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SVGAnimationView f89581a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ PhotoAlbumTopView f89582b;

        public C16548b(SVGAnimationView sVGAnimationView, PhotoAlbumTopView photoAlbumTopView) {
            this.f89581a = sVGAnimationView;
            this.f89582b = photoAlbumTopView;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m115064a(SVGAnimationView sVGAnimationView, PhotoAlbumTopView photoAlbumTopView) {
            sVGAnimationView.setVisibility(8);
            photoAlbumTopView.removeView(sVGAnimationView);
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            Animator animatorM103743p = bt0.m103743p(this.f89581a, "alpha", 0L, 250L, new LinearInterpolator(), 1.0f, 0.0f);
            final SVGAnimationView sVGAnimationView = this.f89581a;
            final PhotoAlbumTopView photoAlbumTopView = this.f89582b;
            bt0.m103733f(animatorM103743p, new Runnable() { // from class: l.f6i
                @Override // java.lang.Runnable
                public final void run() {
                    e6i.C16548b.m115064a(sVGAnimationView, photoAlbumTopView);
                }
            });
            animatorM103743p.start();
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
        }
    }

    public e6i(wlh wlhVar, xa70 xa70Var) {
        super(wlhVar, xa70Var);
        if (nkg.m159862S()) {
            m115046a0();
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m115025G(boolean z) {
        if (this.f184684a.f191692d) {
            xdl0.m208344M(((wlh) this.f184700q).f186948w, false);
        } else {
            FeedUserSexAndAgeView feedUserSexAndAgeView = (FeedUserSexAndAgeView) View.inflate(m201624o(), o6c0.f142212i3, null);
            feedUserSexAndAgeView.m66375d(this.f184684a.f191694f, 4, 4);
            ((wlh) this.f184700q).f186948w.removeAllViews();
            ((wlh) this.f184700q).f186948w.addView(feedUserSexAndAgeView);
            xdl0.m208344M(((wlh) this.f184700q).f186948w, true);
            xdl0.m208327D0(-2, ((wlh) this.f184700q).f186945t);
            if (this.f184684a.f191691c) {
                xdl0.m208344M(feedUserSexAndAgeView, nkg.m159872c());
            }
        }
        xdl0.m208344M(((wlh) this.f184700q).f186909G, false);
    }

    /* JADX INFO: renamed from: H */
    public final void m115026H(boolean z) {
        if ((nkg.m159868Y() || nkg.m159904s()) && !z) {
            if ((xdl0.m208349O0(((wlh) this.f184700q).f186913K) && xdl0.m208349O0(((wlh) this.f184700q).f186917O)) || (xdl0.m208349O0(((wlh) this.f184700q).f186913K) && xdl0.m208349O0(((wlh) this.f184700q).f186919Q))) {
                xdl0.m208344M(((wlh) this.f184700q).f186916N, true);
            } else {
                xdl0.m208344M(((wlh) this.f184700q).f186916N, false);
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m115027I(boolean z) {
        User user = this.f184684a.f191694f;
        if (user == null || user.isMe() || z || this.f184684a.f191694f.isTeamAccount()) {
            xdl0.m208344M(((wlh) this.f184700q).f186913K, false);
            return;
        }
        if (!TextUtils.equals(this.f184684a.f191690b, "from_like") && !fm20.m122109B(this.f184684a.f191690b)) {
            xdl0.m208344M(((wlh) this.f184700q).f186913K, false);
            return;
        }
        if (!NullChecker.m81303a(this.f184684a.f191699k) || TextUtils.isEmpty(this.f184684a.f191699k.relationshipName)) {
            xdl0.m208344M(((wlh) this.f184700q).f186913K, false);
            return;
        }
        xdl0.m208344M(((wlh) this.f184700q).f186913K, true);
        ((wlh) this.f184700q).f186915M.setText(this.f184684a.f191699k.relationshipName);
        qib0.f154691G.m102331L0(((wlh) this.f184700q).f186914L, this.f184684a.f191699k.relationshipIconUrl);
    }

    /* JADX INFO: renamed from: J */
    public final void m115028J(boolean z) {
        String strM133876p;
        User user;
        Location location;
        RawFeed rawFeed;
        if (NullChecker.m81303a(m201632x().location)) {
            strM133876p = vqg.m199575v(m201632x().location);
        } else {
            strM133876p = (!m115035Q(m201632x()) || (user = this.f184684a.f191694f) == null || (location = user.location) == null) ? "" : i0g0.m133876p(location.distance, true);
        }
        if (((fm20.m122110C(this.f184684a.f191690b) && !z) || (nkg.m159844C() && vqg.m199534a0(this.f184684a.f191690b))) && ((rawFeed = this.f184684a.f191699k) == null || (strM133876p = rawFeed.locationName) == null)) {
            strM133876p = "";
        }
        ((wlh) this.f184700q).f186919Q.setText(TextUtils.isEmpty(strM133876p) ? "" : strM133876p);
        xdl0.m208344M(((wlh) this.f184700q).f186919Q, !TextUtils.isEmpty(strM133876p));
        if (("topic_latest".equals(this.f184684a.f191690b) || "topic_recommend".equals(this.f184684a.f191690b) || "from_group_detail_recommend".equals(this.f184684a.f191690b) || "from_group_detail_new".equals(this.f184684a.f191690b) || ((nkg.m159904s() && (("from_discover_discussion".equals(this.f184684a.f191690b) && !fm20.m122114G()) || (("from_discover_dating".equals(this.f184684a.f191690b) && !fm20.m122111D()) || (("from_activity_tab_one".equals(this.f184684a.f191690b) && !fm20.m122111D()) || ("from_activity_tab_two".equals(this.f184684a.f191690b) && !fm20.m122111D()))))) || "from_poi_aggregation".equals(this.f184684a.f191690b))) && !z) {
            xdl0.m208344M(((wlh) this.f184700q).f186919Q, false);
            this.f184684a.f191703o.f79383a = true;
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m115029K(boolean z) {
        if (xdl0.m208349O0(((wlh) this.f184700q).f186919Q) && xdl0.m208349O0(((wlh) this.f184700q).f186917O)) {
            xdl0.m208344M(((wlh) this.f184700q).f186918P, true);
        } else {
            xdl0.m208344M(((wlh) this.f184700q).f186918P, false);
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m115030L() {
        if (!sti.m185957c() || !TEnum.equals(m201632x().settings.visibility, "selfOnly")) {
            xdl0.m208344M(((wlh) this.f184700q).f186912J, false);
            return;
        }
        if (f89576t == null) {
            f89576t = n8i.m158500g(((wlh) this.f184700q).f186912J, t100.m186890d(2.0f));
        }
        ((wlh) this.f184700q).f186912J.setText(m201624o().getString(R$string.f39093k5) + f89576t + "·" + f89576t);
        xdl0.m208344M(((wlh) this.f184700q).f186912J, true);
    }

    /* JADX INFO: renamed from: M */
    public final void m115031M(boolean z) {
        String strM95041q;
        if (((nkg.m159847D0() && "from_nearby_falls_feed".equals(this.f184684a.f191690b)) || "topic_recommend".equals(this.f184684a.f191690b) || "from_group_detail_recommend".equals(this.f184684a.f191690b) || ("from_discover_discussion".equals(this.f184684a.f191690b) && m201632x().getRecommendTime() != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && !z)) && djh.m112037b()) {
            strM95041q = ((double) System.currentTimeMillis()) < m201632x().getRecommendTime() ? "1秒以前推荐" : vqg.m199500C0(m201632x().getRecommendTime());
        } else {
            strM95041q = a5i.m95041q(m201632x().createdTime);
        }
        if (("from_discover_dating".equals(this.f184684a.f191690b) && !z) || (("from_activity_tab_one".equals(this.f184684a.f191690b) && !z) || (("from_activity_tab_two".equals(this.f184684a.f191690b) && !z) || ((nkg.m159844C() && vqg.m199534a0(this.f184684a.f191690b)) || ("from_poi_aggregation".equals(this.f184684a.f191690b) && !z))))) {
            strM95041q = vqg.m199509H((long) m201632x().createdTime, this.f184684a.f191694f.getLastActiveTimeMillis());
        }
        if (nkg.m159904s() && (("from_discover_discussion".equals(this.f184684a.f191690b) && !fm20.m122116I()) || (("from_discover_dating".equals(this.f184684a.f191690b) && !fm20.m122113F()) || (("from_activity_tab_one".equals(this.f184684a.f191690b) && !fm20.m122113F()) || ("from_activity_tab_two".equals(this.f184684a.f191690b) && !fm20.m122113F()))))) {
            strM95041q = "";
        }
        if (nkg.m159918z() && TextUtils.equals(this.f184684a.f191690b, "from_discover_discussion") && NullChecker.m81303a(this.f184684a.f191699k) && !TextUtils.isEmpty(this.f184684a.f191699k.recommendReason)) {
            strM95041q = this.f184684a.f191699k.recommendReason;
        }
        ((wlh) this.f184700q).f186917O.setText(strM95041q != null ? strM95041q : "");
        xdl0.m208344M(((wlh) this.f184700q).f186917O, !TextUtils.isEmpty(strM95041q));
    }

    /* JADX INFO: renamed from: N */
    public final BubbleInfo m115032N() {
        if (!NullChecker.m81303a(this.f184684a.f191689a) || !NullChecker.m81303a(this.f184684a.f191698j) || !this.f184684a.f191698j.m133308p()) {
            return null;
        }
        xa70 xa70Var = this.f184684a;
        RawFeed rawFeedM130721c = xa70Var.f191698j.f109833b.m130721c(xa70Var.f191689a.f56011id);
        if (rawFeedM130721c == null) {
            return null;
        }
        return (BubbleInfo) vwb.m200346r(rawFeedM130721c.states, new w9j() { // from class: l.d6i
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f84625a.m115040V((BubbleInfo) obj);
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public final void m115033O() {
        if ((m201624o() instanceof TopicAggregationAct) && NullChecker.m81303a(((wlh) this.f184700q).f186922T) && !vwb.m200296J(m201632x().labels) && !TextUtils.isEmpty(m201632x().labels.get(0).display)) {
            ((wlh) this.f184700q).f186921S.setVisibility(0);
            ((wlh) this.f184700q).f186922T.setText(m201632x().labels.get(0).display);
            final int iMeasureText = (int) (((wlh) this.f184700q).f186922T.getPaint().measureText((String) ((wlh) this.f184700q).f186922T.getText()) + t100.m186890d(8.0f));
            xdl0.m208353Q0(((wlh) this.f184700q).f186922T, new e30() { // from class: l.b6i
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f73820a.m115041W(iMeasureText, (int[]) obj);
                }
            });
            xdl0.m208374f0(((wlh) this.f184700q).f186931f, 0);
            return;
        }
        if (NullChecker.m81303a(((wlh) this.f184700q).f186931f)) {
            ((wlh) this.f184700q).f186921S.setVisibility(4);
            xdl0.m208374f0(((wlh) this.f184700q).f186931f, t100.m186890d(0.0f));
            List<Double> list = this.f184684a.f191694f.profile.extensions.headFrame.expiredTime;
            if (vwb.m200296J(list) || list.get(0).doubleValue() <= mqi0.m155944o() || vwb.m200296J(this.f184684a.f191694f.profile.extensions.headFrame.url) || !(m201624o() instanceof MomentDetailAct)) {
                return;
            }
            xdl0.m208374f0(((wlh) this.f184700q).f186931f, t100.m186890d(2.0f));
        }
    }

    /* JADX INFO: renamed from: P */
    public final boolean m115034P() {
        return (this.f184684a.f191690b.equals("from_discover_discussion") || this.f184684a.f191690b.equals("from_discover_dating") || this.f184684a.f191690b.equals("from_nearby_focus")) && !this.f184684a.f191691c;
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m115035Q(Moment moment) {
        return moment.isLive || moment.isVoiceLive;
    }

    /* JADX INFO: renamed from: R */
    public final boolean m115036R(BubbleInfo bubbleInfo) {
        if (bubbleInfo == null || !bubbleInfo.checkStateTimeIsValid()) {
            return false;
        }
        if (((m201624o() instanceof TopicAggregationAct) && NullChecker.m81303a(((wlh) this.f184700q).f186922T) && !vwb.m200296J(m201632x().labels) && !TextUtils.isEmpty(m201632x().labels.get(0).display)) || m201632x().hasHeadFrame) {
            return false;
        }
        xa70 xa70Var = this.f184684a;
        return xa70Var.f191691c || !f5i.m119503b(xa70Var, xa70Var.f191689a) || (m201624o() instanceof TopicAggregationAct);
    }

    /* JADX INFO: renamed from: S */
    public final boolean m115037S(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("like_relation_fuction");
            if (!TextUtils.isEmpty(strM79302F)) {
                String strOptString = new JSONObject(strM79302F).optString("likeButton");
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
    public final boolean m115038T(String str) {
        String str2;
        if ("from_like".equals(this.f184684a.f191690b)) {
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
        return m115037S(str2);
    }

    /* JADX INFO: renamed from: U */
    public final Pair<Boolean, String> m115039U(xa70 xa70Var) {
        if (this.f184684a.f191691c) {
            return new Pair<>(Boolean.FALSE, null);
        }
        User user = xa70Var.f191694f;
        if (user == null || User.isMatched(user)) {
            return new Pair<>(Boolean.FALSE, null);
        }
        if (vqg.m199578w0()) {
            return ((nkg.m159910v() || nkg.m159912w()) && fm20.m122109B(xa70Var.f191690b) && NullChecker.m81303a(xa70Var.f191699k) && !TextUtils.isEmpty(xa70Var.f191699k.relationshipName) && xa70Var.f191699k.relationshipName.contains("喜欢了你")) ? new Pair<>(Boolean.TRUE, vqg.m199580x0()) : new Pair<>(Boolean.FALSE, null);
        }
        return new Pair<>(Boolean.FALSE, null);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ Boolean m115040V(BubbleInfo bubbleInfo) {
        return Boolean.valueOf(TextUtils.equals(this.f184684a.f191694f.f56011id, bubbleInfo.owner.f38803id));
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m115041W(int i, int[] iArr) {
        if (m201632x().labels == null || m201632x().labels.size() <= 0) {
            return;
        }
        ((wlh) this.f184700q).f186922T.setBackground(new red0(Color.parseColor(m201632x().labels.get(0).bgColor), t100.m186890d(5.0f), Math.max(iArr[0], i), iArr[1]));
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m115042X(BubbleInfo bubbleInfo) {
        if (bubbleInfo == null) {
            return;
        }
        xdl0.m208344M(this.f184698o, true);
        if (!NullChecker.m81303a(bubbleInfo.emotion) || TextUtils.isEmpty(bubbleInfo.emotion.emojiUrl)) {
            return;
        }
        bkb0 bkb0Var = qib0.f154691G;
        VDraweeView vDraweeView = this.f184699p;
        String str = bubbleInfo.emotion.emojiUrl;
        int i = t100.f167264m;
        bkb0Var.m102325I0(vDraweeView, str, i, i);
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m115043Y(String str) {
        if ((TextUtils.equals(this.f184684a.f191690b, "from_nearby_focus") || TextUtils.equals(this.f184684a.f191690b, "from_like") || TextUtils.equals(this.f184684a.f191690b, "from_discover_discussion") || TextUtils.equals(this.f184684a.f191690b, "from_discover_dating")) && TextUtils.equals(this.f184684a.f191689a.f56011id, str)) {
            xa70 xa70Var = this.f184684a;
            T t = this.f184700q;
            m115058i0(xa70Var, ((wlh) t).f186939n, ((wlh) t).f186926a);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m115044Z() {
        User user;
        xa70 xa70Var = this.f184684a;
        if (xa70Var.f191695g == null || (user = xa70Var.f191694f) == null || TextUtils.isEmpty(user.f56011id)) {
            return;
        }
        xa70 xa70Var2 = this.f184684a;
        xa70Var2.f191695g.duringCreated(FeedModule.f38855d.m209461g8(xa70Var2.f191694f.f56011id)).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.a6i
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f67771a.m115042X((BubbleInfo) obj);
            }
        }));
    }

    @Override // p149l.g6i
    /* JADX INFO: renamed from: a */
    public void mo115045a() {
        if (xdl0.m208349O0(((wlh) this.f184700q).f186908F)) {
            ((wlh) this.f184700q).f186908F.m64426j();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m115046a0() {
        User user;
        xa70 xa70Var = this.f184684a;
        if (xa70Var.f191695g == null || (user = xa70Var.f191694f) == null || TextUtils.isEmpty(user.f56011id)) {
            return;
        }
        this.f184684a.f191695g.duringCreated(FeedModule.f38855d.f193082z1).subscribe(mkd0.m154955G(new e30() { // from class: l.c6i
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f79546a.m115043Y((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b0 */
    public final void m115047b0() {
        xa70 xa70Var = this.f184684a;
        if (xa70Var.f191691c) {
            xdl0.m208344M(((wlh) this.f184700q).f186923U, false);
            return;
        }
        if (!NullChecker.m81303a(xa70Var.f191699k) || !NullChecker.m81303a(this.f184684a.f191699k.interaction) || TextUtils.isEmpty(this.f184684a.f191699k.interaction.text)) {
            xdl0.m208344M(((wlh) this.f184700q).f186923U, false);
            return;
        }
        xdl0.m208360X(((wlh) this.f184700q).f186931f, t100.m186890d(25.0f));
        xdl0.m208344M(((wlh) this.f184700q).f186923U, true);
        ((wlh) this.f184700q).f186925W.setText(this.f184684a.f191699k.interaction.text);
        qib0.f154691G.m102331L0(((wlh) this.f184700q).f186924V, this.f184684a.f191699k.interaction.icon);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m115048c0() {
        xa70 xa70Var = this.f184684a;
        if (!xa70Var.f191691c && TextUtils.equals(xa70Var.f191690b, "from_like") && NullChecker.m81303a(this.f184684a.f191699k)) {
            xa70 xa70Var2 = this.f184684a;
            if (xa70Var2.f191699k.showLikeSplitLine) {
                xdl0.m208360X(((wlh) this.f184700q).f186927b, t100.m186890d(xa70Var2.f191696h == 0 ? 3.0f : 15.0f));
                xdl0.m208357U(((wlh) this.f184700q).f186927b, t100.m186890d(this.f184684a.f191696h == 0 ? 10.0f : 21.0f));
                ((wlh) this.f184700q).f186928c.getPaint().setFakeBoldText(true);
                xdl0.m208344M(((wlh) this.f184700q).f186927b, true);
                ((wlh) this.f184700q).f186928c.setText(this.f184684a.f191696h == 0 ? "喜欢的人新动态会出现在这里" : "喜欢的人近期动态都看完了");
                ((wlh) this.f184700q).f186929d.setText(this.f184684a.f191696h == 0 ? "为你推荐了一些可能喜欢的动态" : "为你推荐更多可能喜欢的动态");
                return;
            }
        }
        xdl0.m208360X(((wlh) this.f184700q).f186930e, t100.m186890d(0.0f));
        xdl0.m208344M(((wlh) this.f184700q).f186927b, false);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m115049d0() {
        if (NullChecker.m81303a(((wlh) this.f184700q).f186934i) && m115034P()) {
            ((wlh) this.f184700q).f186934i.setVisibility(8);
            List<Double> list = this.f184684a.f191694f.profile.extensions.tailFrame.expiredTime;
            if (vwb.m200296J(list) || list.get(0).doubleValue() <= mqi0.m155944o() || vwb.m200296J(this.f184684a.f191694f.profile.extensions.tailFrame.url)) {
                return;
            }
            ((wlh) this.f184700q).f186934i.setVisibility(0);
            qib0.f154691G.m102331L0(((wlh) this.f184700q).f186934i, this.f184684a.f191694f.profile.extensions.tailFrame.url.get(0));
            m201632x().setHasHeadFrame(true);
        }
    }

    @Override // p149l.w5i, p149l.g6i
    /* JADX INFO: renamed from: e */
    public void mo115050e() {
        super.mo115050e();
        if (NullChecker.m81303a(this.f184684a.f191699k) && this.f184684a.f191699k.isRoamHighlight) {
            this.f184685b.setVisibility(0);
            return;
        }
        Pair<Boolean, String> pairM115039U = m115039U(this.f184684a);
        if (this.f184684a.f191691c || ((!nkg.m159854K() && "topic_recommend".equals(this.f184684a.f191690b)) || ((Boolean) pairM115039U.first).booleanValue() || ((!nkg.m159858O() && "from_group_detail_recommend".equals(this.f184684a.f191690b)) || ((!nkg.m159858O() && "from_group_detail_new".equals(this.f184684a.f191690b)) || ((nkg.m159858O() && vqg.m199526T(this.f184684a.f191690b)) || ((nkg.m159854K() && m115038T(this.f184684a.f191690b)) || "from_live_square_tab".equals(this.f184684a.f191690b) || (("from_nearby_online".equals(this.f184684a.f191690b) || "from_poi_aggregation".equals(this.f184684a.f191690b)) && nkg.m159896o()))))))) {
            if (this.f89577s == null) {
                this.f89577s = new q5i();
            }
            q5i q5iVar = this.f89577s;
            xa70 xa70Var = this.f184684a;
            T t = this.f184700q;
            q5iVar.m173024s(xa70Var, ((wlh) t).f186935j, ((wlh) t).f186936k, (String) pairM115039U.second, ((wlh) t).f186926a);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m115051e0() {
        boolean zNeedShowFrame = this.f184684a.f191694f.needShowFrame();
        T t = this.f184700q;
        if (zNeedShowFrame) {
            ((wlh) t).f186943r.m222887x(this.f184684a.f191694f.headFrameUrl(), 1);
            m201632x().setHasHeadFrame(true);
            return;
        }
        if (!NullChecker.m81303a(((wlh) t).f186943r)) {
            FeedGPException.reportMomentDetailTopViewExc(this.f184684a.f191690b);
            return;
        }
        ((wlh) this.f184700q).f186943r.setVisibility(8);
        List<Double> list = this.f184684a.f191694f.profile.extensions.headFrame.expiredTime;
        if (vwb.m200296J(list) || list.get(0).doubleValue() <= mqi0.m155944o() || vwb.m200296J(this.f184684a.f191694f.profile.extensions.headFrame.url)) {
            return;
        }
        ((wlh) this.f184700q).f186943r.setVisibility(0);
        qib0.f154691G.m102331L0(((wlh) this.f184700q).f186943r, this.f184684a.f191694f.profile.extensions.headFrame.url.get(0));
        m201632x().setHasHeadFrame(true);
    }

    @Override // p149l.w5i, p149l.g6i
    /* JADX INFO: renamed from: f */
    public void mo115052f() {
        super.mo115052f();
    }

    /* JADX INFO: renamed from: f0 */
    public final void m115053f0() {
        User user = this.f184684a.f191694f;
        if (user == null || TextUtils.isEmpty(user.f56011id)) {
            return;
        }
        BubbleInfo bubbleInfoM115032N = m115032N();
        boolean zM115036R = m115036R(bubbleInfoM115032N);
        xdl0.m208344M(this.f184698o, zM115036R);
        if (zM115036R && NullChecker.m81303a(bubbleInfoM115032N.emotion) && !TextUtils.isEmpty(bubbleInfoM115032N.emotion.emojiUrl)) {
            bkb0 bkb0Var = qib0.f154691G;
            VDraweeView vDraweeView = this.f184699p;
            String str = bubbleInfoM115032N.emotion.emojiUrl;
            int i = t100.f167264m;
            bkb0Var.m102325I0(vDraweeView, str, i, i);
        }
    }

    @Override // p149l.g6i
    /* JADX INFO: renamed from: g */
    public void mo115054g(xa70 xa70Var) {
        xdl0.m208344M(((wlh) this.f184700q).f186940o, true);
        xdl0.m208344M(((wlh) this.f184700q).f186943r, true);
        xdl0.m208344M(((wlh) this.f184700q).f186944s, false);
        xdl0.m208344M(((wlh) this.f184700q).f186947v, true);
        xdl0.m208344M(((wlh) this.f184700q).f186934i, m115034P());
    }

    /* JADX INFO: renamed from: g0 */
    public final void m115055g0(boolean z) {
        ((wlh) this.f184700q).f186908F.setVisibility(8);
    }

    @Override // p149l.w5i, p149l.g6i
    /* JADX INFO: renamed from: h */
    public void mo115056h() {
        super.mo115056h();
        if (xdl0.m208349O0(((wlh) this.f184700q).f186944s)) {
            return;
        }
        qib0.f154713b0.f139231b.showUserVerificationLogo(m201624o(), this.f184684a.f191694f, ((wlh) this.f184700q).f186947v);
        VFrame vFrame = (VFrame) ((wlh) this.f184700q).f186947v.getParent();
        if (!NullChecker.m81303a(vFrame) || xdl0.m208349O0(((wlh) this.f184700q).f186947v)) {
            xdl0.m208370d0(vFrame, t100.m186890d(2.0f));
        } else {
            xdl0.m208370d0(vFrame, 0);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m115057h0() {
        xa70 xa70Var;
        Moment moment;
        xa70 xa70Var2 = this.f184684a;
        if (xa70Var2 == null || !"from_live_square_tab".equals(xa70Var2.f191690b) || (moment = (xa70Var = this.f184684a).f191689a) == null || moment.liveCircleExtInfo == null || xa70Var.f191691c) {
            xdl0.m208344M(((wlh) this.f184700q).f186906D, false);
            return;
        }
        rzt rztVarMo67273mg = FeedModule.m60223M().mo67273mg();
        VDraweeView vDraweeView = ((wlh) this.f184700q).f186906D;
        LiveCircleExtInfo liveCircleExtInfo = this.f184684a.f191689a.liveCircleExtInfo;
        rztVarMo67273mg.mo181765a(vDraweeView, liveCircleExtInfo.coverUrl, liveCircleExtInfo.grade);
    }

    /* JADX INFO: renamed from: i0 */
    public void m115058i0(xa70 xa70Var, View view, PhotoAlbumTopView photoAlbumTopView) {
        SVGAnimationView sVGAnimationViewM104315a = bxh.m104315a(xa70Var.f191695g, photoAlbumTopView, view, t100.m186890d(15.0f), -t100.m186890d(3.0f), 40.0f, 52.0f);
        if (photoAlbumTopView.getTag() != null) {
            photoAlbumTopView.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener) photoAlbumTopView.getTag());
        }
        ViewOnAttachStateChangeListenerC16547a viewOnAttachStateChangeListenerC16547a = new ViewOnAttachStateChangeListenerC16547a(sVGAnimationViewM104315a, photoAlbumTopView);
        photoAlbumTopView.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC16547a);
        photoAlbumTopView.setTag(viewOnAttachStateChangeListenerC16547a);
        sVGAnimationViewM104315a.setVisibility(0);
        SVGALoader.with(xa70Var.f191695g).from("https://auto.tancdn.com/v1/raw/2fe249b8-00f2-4002-b7d5-b7116c6c754013.pdf").autoPlay(false).repeatCount(1).animListener(new C16548b(sVGAnimationViewM104315a, photoAlbumTopView)).into(sVGAnimationViewM104315a);
        sVGAnimationViewM104315a.startAnimation();
    }

    @Override // p149l.w5i, p149l.g6i
    /* JADX INFO: renamed from: j */
    public void mo115059j() {
        super.mo115059j();
        m115025G(this.f184684a.f191691c);
        m115027I(this.f184684a.f191691c);
        m115031M(this.f184684a.f191691c);
        m115026H(this.f184684a.f191691c);
        m115028J(this.f184684a.f191691c);
        m115029K(this.f184684a.f191691c);
        m115051e0();
        m115049d0();
        m115030L();
        m115057h0();
        m115055g0(this.f184684a.f191691c);
        m115047b0();
        if (nkg.m159889k0()) {
            if (this.f184684a.f191691c) {
                m115044Z();
            } else {
                m115053f0();
            }
        }
        m115048c0();
    }

    @Override // p149l.g6i
    /* JADX INFO: renamed from: k */
    public void mo115060k(xa70 xa70Var) {
        super.mo115060k(xa70Var);
        d5i d5iVar = this.f184684a.f191701m;
        if (d5iVar == null || !d5iVar.m110060d()) {
            m115033O();
        }
    }

    @Override // p149l.w5i
    /* JADX INFO: renamed from: p */
    public void mo115061p() {
        T t = this.f184700q;
        this.f184685b = ((wlh) t).f186937l;
        this.f184686c = ((wlh) t).f186935j;
        this.f184687d = ((wlh) t).f186936k;
        this.f184688e = ((wlh) t).f186938m;
        this.f184689f = ((wlh) t).f186940o;
        this.f184690g = ((wlh) t).f186947v;
        this.f184691h = ((wlh) t).f186945t;
        this.f184692i = ((wlh) t).f186946u;
        this.f184693j = ((wlh) t).f186949x;
        this.f184694k = ((wlh) t).f186950y;
        this.f184695l = ((wlh) t).f186903A;
        this.f184696m = ((wlh) t).f186920R;
        this.f184697n = ((wlh) t).f186951z;
        this.f184698o = ((wlh) t).f186941p;
        this.f184699p = ((wlh) t).f186942q;
    }

    @Override // p149l.w5i
    /* JADX INFO: renamed from: y */
    public void mo115062y() {
        super.mo115062y();
        ((wlh) this.f184700q).f186943r.setVisibility(8);
        ((wlh) this.f184700q).f186934i.setVisibility(8);
    }

    @Override // p149l.w5i
    /* JADX INFO: renamed from: z */
    public void mo115063z() {
        super.mo115063z();
        m201625q(((wlh) this.f184700q).f186939n);
    }

    /* JADX INFO: renamed from: l.e6i$a */
    public class ViewOnAttachStateChangeListenerC16547a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SVGAnimationView f89578a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ PhotoAlbumTopView f89579b;

        public ViewOnAttachStateChangeListenerC16547a(SVGAnimationView sVGAnimationView, PhotoAlbumTopView photoAlbumTopView) {
            this.f89578a = sVGAnimationView;
            this.f89579b = photoAlbumTopView;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (NullChecker.m81303a(this.f89578a)) {
                this.f89578a.stopAnimation(false);
                this.f89579b.removeView(this.f89578a);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
