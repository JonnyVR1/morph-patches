package p007l;

import android.animation.Animator;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.p000p1.mobile.putong.data.BubbleInfo;
import com.p000p1.mobile.putong.data.Location;
import com.p000p1.mobile.putong.data.SchemeKey;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.LiveCircleExtInfo;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.RawFeed;
import com.p000p1.mobile.putong.feed.helper.exception.FeedGPException;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedtop.PhotoAlbumTopView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.p000p1.mobile.putong.feed.newui.topic.topicaggregation.TopicAggregationAct;
import com.p000p1.mobile.putong.feed.newui.view.FeedUserSexAndAgeView;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.bkb0;
import l.bt0;
import l.e30;
import l.i0g0;
import l.mkd0;
import l.mqi0;
import l.qib0;
import l.rzt;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import org.json.JSONObject;
import v.VDraweeView;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class e6i extends w5i<wlh> {

    /* JADX INFO: renamed from: t */
    public static String f7232t;

    /* JADX INFO: renamed from: s */
    public q5i f7233s;

    /* JADX INFO: renamed from: l.e6i$b */
    public class C2368b extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SVGAnimationView f7237a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ PhotoAlbumTopView f7238b;

        public C2368b(SVGAnimationView sVGAnimationView, PhotoAlbumTopView photoAlbumTopView) {
            this.f7237a = sVGAnimationView;
            this.f7238b = photoAlbumTopView;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m9681a(SVGAnimationView sVGAnimationView, PhotoAlbumTopView photoAlbumTopView) {
            sVGAnimationView.setVisibility(8);
            photoAlbumTopView.removeView(sVGAnimationView);
        }

        public void onFinished() {
            super.onFinished();
            Animator animatorP = bt0.p(this.f7237a, "alpha", 0L, 250L, new LinearInterpolator(), new float[]{1.0f, 0.0f});
            final SVGAnimationView sVGAnimationView = this.f7237a;
            final PhotoAlbumTopView photoAlbumTopView = this.f7238b;
            bt0.f(animatorP, new Runnable() { // from class: l.f6i
                @Override // java.lang.Runnable
                public final void run() {
                    e6i.C2368b.m9681a(sVGAnimationView, photoAlbumTopView);
                }
            });
            animatorP.start();
        }

        public void onStart() {
            super.onStart();
        }
    }

    public e6i(wlh wlhVar, xa70 xa70Var) {
        super(wlhVar, xa70Var);
        if (nkg.m12221S()) {
            m9663a0();
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m9642G(boolean z) {
        if (this.f14413a.f14823d) {
            xdl0.M(((wlh) this.f14429q).f14614w, false);
        } else {
            FeedUserSexAndAgeView feedUserSexAndAgeView = (FeedUserSexAndAgeView) View.inflate(m15699o(), o6c0.f11231i3, null);
            feedUserSexAndAgeView.m7540d(this.f14413a.f14825f, 4, 4);
            ((wlh) this.f14429q).f14614w.removeAllViews();
            ((wlh) this.f14429q).f14614w.addView(feedUserSexAndAgeView);
            xdl0.M(((wlh) this.f14429q).f14614w, true);
            xdl0.D0(-2, new View[]{((wlh) this.f14429q).f14611t});
            if (this.f14413a.f14822c) {
                xdl0.M(feedUserSexAndAgeView, nkg.m12231c());
            }
        }
        xdl0.M(((wlh) this.f14429q).f14575G, false);
    }

    /* JADX INFO: renamed from: H */
    public final void m9643H(boolean z) {
        if ((nkg.m12227Y() || nkg.m12263s()) && !z) {
            if ((xdl0.O0(((wlh) this.f14429q).f14579K) && xdl0.O0(((wlh) this.f14429q).f14583O)) || (xdl0.O0(((wlh) this.f14429q).f14579K) && xdl0.O0(((wlh) this.f14429q).f14585Q))) {
                xdl0.M(((wlh) this.f14429q).f14582N, true);
            } else {
                xdl0.M(((wlh) this.f14429q).f14582N, false);
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m9644I(boolean z) {
        User user = this.f14413a.f14825f;
        if (user == null || user.isMe() || z || this.f14413a.f14825f.isTeamAccount()) {
            xdl0.M(((wlh) this.f14429q).f14579K, false);
            return;
        }
        if (!TextUtils.equals(this.f14413a.f14821b, "from_like") && !fm20.m10212B(this.f14413a.f14821b)) {
            xdl0.M(((wlh) this.f14429q).f14579K, false);
            return;
        }
        if (!NullChecker.a(this.f14413a.f14830k) || TextUtils.isEmpty(this.f14413a.f14830k.relationshipName)) {
            xdl0.M(((wlh) this.f14429q).f14579K, false);
            return;
        }
        xdl0.M(((wlh) this.f14429q).f14579K, true);
        ((wlh) this.f14429q).f14581M.setText(this.f14413a.f14830k.relationshipName);
        qib0.G.L0(((wlh) this.f14429q).f14580L, this.f14413a.f14830k.relationshipIconUrl);
    }

    /* JADX INFO: renamed from: J */
    public final void m9645J(boolean z) {
        String strP;
        User user;
        Location location;
        RawFeed rawFeed;
        if (NullChecker.a(m15707x().location)) {
            strP = vqg.m15545v(m15707x().location);
        } else {
            strP = (!m9652Q(m15707x()) || (user = this.f14413a.f14825f) == null || (location = user.location) == null) ? "" : i0g0.p(location.distance, true);
        }
        if (((fm20.m10213C(this.f14413a.f14821b) && !z) || (nkg.m12203C() && vqg.m15504a0(this.f14413a.f14821b))) && ((rawFeed = this.f14413a.f14830k) == null || (strP = rawFeed.locationName) == null)) {
            strP = "";
        }
        ((wlh) this.f14429q).f14585Q.setText(TextUtils.isEmpty(strP) ? "" : strP);
        xdl0.M(((wlh) this.f14429q).f14585Q, !TextUtils.isEmpty(strP));
        if (("topic_latest".equals(this.f14413a.f14821b) || "topic_recommend".equals(this.f14413a.f14821b) || "from_group_detail_recommend".equals(this.f14413a.f14821b) || "from_group_detail_new".equals(this.f14413a.f14821b) || ((nkg.m12263s() && (("from_discover_discussion".equals(this.f14413a.f14821b) && !fm20.m10217G()) || (("from_discover_dating".equals(this.f14413a.f14821b) && !fm20.m10214D()) || (("from_activity_tab_one".equals(this.f14413a.f14821b) && !fm20.m10214D()) || ("from_activity_tab_two".equals(this.f14413a.f14821b) && !fm20.m10214D()))))) || "from_poi_aggregation".equals(this.f14413a.f14821b))) && !z) {
            xdl0.M(((wlh) this.f14429q).f14585Q, false);
            this.f14413a.f14834o.f6542a = true;
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m9646K(boolean z) {
        if (xdl0.O0(((wlh) this.f14429q).f14585Q) && xdl0.O0(((wlh) this.f14429q).f14583O)) {
            xdl0.M(((wlh) this.f14429q).f14584P, true);
        } else {
            xdl0.M(((wlh) this.f14429q).f14584P, false);
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m9647L() {
        if (!sti.m14317c() || !TEnum.equals(m15707x().settings.visibility, "selfOnly")) {
            xdl0.M(((wlh) this.f14429q).f14578J, false);
            return;
        }
        if (f7232t == null) {
            f7232t = n8i.m12113g(((wlh) this.f14429q).f14578J, t100.d(2.0f));
        }
        ((wlh) this.f14429q).f14578J.setText(m15699o().getString(R$string.f554k5) + f7232t + "·" + f7232t);
        xdl0.M(((wlh) this.f14429q).f14578J, true);
    }

    /* JADX INFO: renamed from: M */
    public final void m9648M(boolean z) {
        String strM8417q;
        if (((nkg.m12206D0() && "from_nearby_falls_feed".equals(this.f14413a.f14821b)) || "topic_recommend".equals(this.f14413a.f14821b) || "from_group_detail_recommend".equals(this.f14413a.f14821b) || ("from_discover_discussion".equals(this.f14413a.f14821b) && m15707x().getRecommendTime() != 0.0d && !z)) && djh.m9420b()) {
            strM8417q = ((double) System.currentTimeMillis()) < m15707x().getRecommendTime() ? "1秒以前推荐" : vqg.m15470C0(m15707x().getRecommendTime());
        } else {
            strM8417q = a5i.m8417q(m15707x().createdTime);
        }
        if (("from_discover_dating".equals(this.f14413a.f14821b) && !z) || (("from_activity_tab_one".equals(this.f14413a.f14821b) && !z) || (("from_activity_tab_two".equals(this.f14413a.f14821b) && !z) || ((nkg.m12203C() && vqg.m15504a0(this.f14413a.f14821b)) || ("from_poi_aggregation".equals(this.f14413a.f14821b) && !z))))) {
            strM8417q = vqg.m15479H((long) m15707x().createdTime, this.f14413a.f14825f.getLastActiveTimeMillis());
        }
        if (nkg.m12263s() && (("from_discover_discussion".equals(this.f14413a.f14821b) && !fm20.m10219I()) || (("from_discover_dating".equals(this.f14413a.f14821b) && !fm20.m10216F()) || (("from_activity_tab_one".equals(this.f14413a.f14821b) && !fm20.m10216F()) || ("from_activity_tab_two".equals(this.f14413a.f14821b) && !fm20.m10216F()))))) {
            strM8417q = "";
        }
        if (nkg.m12277z() && TextUtils.equals(this.f14413a.f14821b, "from_discover_discussion") && NullChecker.a(this.f14413a.f14830k) && !TextUtils.isEmpty(this.f14413a.f14830k.recommendReason)) {
            strM8417q = this.f14413a.f14830k.recommendReason;
        }
        ((wlh) this.f14429q).f14583O.setText(strM8417q != null ? strM8417q : "");
        xdl0.M(((wlh) this.f14429q).f14583O, !TextUtils.isEmpty(strM8417q));
    }

    /* JADX INFO: renamed from: N */
    public final BubbleInfo m9649N() {
        if (!NullChecker.a(this.f14413a.f14820a) || !NullChecker.a(this.f14413a.f14829j) || !this.f14413a.f14829j.m10743p()) {
            return null;
        }
        xa70 xa70Var = this.f14413a;
        RawFeed rawFeedM10602c = xa70Var.f14829j.f8835b.m10602c(((DbObject) xa70Var.f14820a).id);
        if (rawFeedM10602c == null) {
            return null;
        }
        return (BubbleInfo) vwb.r(rawFeedM10602c.states, new w9j() { // from class: l.d6i
            public final Object call(Object obj) {
                return this.f6854a.m9657V((BubbleInfo) obj);
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public final void m9650O() {
        if ((m15699o() instanceof TopicAggregationAct) && NullChecker.a(((wlh) this.f14429q).f14588T) && !vwb.J(m15707x().labels) && !TextUtils.isEmpty(m15707x().labels.get(0).display)) {
            ((wlh) this.f14429q).f14587S.setVisibility(0);
            ((wlh) this.f14429q).f14588T.setText(m15707x().labels.get(0).display);
            final int iMeasureText = (int) (((wlh) this.f14429q).f14588T.getPaint().measureText((String) ((wlh) this.f14429q).f14588T.getText()) + t100.d(8.0f));
            xdl0.Q0(((wlh) this.f14429q).f14588T, new e30() { // from class: l.b6i
                public final void call(Object obj) {
                    this.f6119a.m9658W(iMeasureText, (int[]) obj);
                }
            });
            xdl0.f0(((wlh) this.f14429q).f14597f, 0);
            return;
        }
        if (NullChecker.a(((wlh) this.f14429q).f14597f)) {
            ((wlh) this.f14429q).f14587S.setVisibility(4);
            xdl0.f0(((wlh) this.f14429q).f14597f, t100.d(0.0f));
            List<Double> list = this.f14413a.f14825f.profile.extensions.headFrame.expiredTime;
            if (vwb.J(list) || list.get(0).doubleValue() <= mqi0.o() || vwb.J(this.f14413a.f14825f.profile.extensions.headFrame.url) || !(m15699o() instanceof MomentDetailAct)) {
                return;
            }
            xdl0.f0(((wlh) this.f14429q).f14597f, t100.d(2.0f));
        }
    }

    /* JADX INFO: renamed from: P */
    public final boolean m9651P() {
        return (this.f14413a.f14821b.equals("from_discover_discussion") || this.f14413a.f14821b.equals("from_discover_dating") || this.f14413a.f14821b.equals("from_nearby_focus")) && !this.f14413a.f14822c;
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m9652Q(Moment moment) {
        return moment.isLive || moment.isVoiceLive;
    }

    /* JADX INFO: renamed from: R */
    public final boolean m9653R(BubbleInfo bubbleInfo) {
        if (bubbleInfo == null || !bubbleInfo.checkStateTimeIsValid()) {
            return false;
        }
        if (((m15699o() instanceof TopicAggregationAct) && NullChecker.a(((wlh) this.f14429q).f14588T) && !vwb.J(m15707x().labels) && !TextUtils.isEmpty(m15707x().labels.get(0).display)) || m15707x().hasHeadFrame) {
            return false;
        }
        xa70 xa70Var = this.f14413a;
        return xa70Var.f14822c || !f5i.m10064b(xa70Var, xa70Var.f14820a) || (m15699o() instanceof TopicAggregationAct);
    }

    /* JADX INFO: renamed from: S */
    public final boolean m9654S(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            String strF = RemoteConfig.x().F("like_relation_fuction");
            if (!TextUtils.isEmpty(strF)) {
                String strOptString = new JSONObject(strF).optString("likeButton");
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
    public final boolean m9655T(String str) {
        String str2;
        if ("from_like".equals(this.f14413a.f14821b)) {
            return true;
        }
        str.getClass();
        switch (str) {
            case "from_discover_discussion":
                str2 = "discussion";
                break;
            case "topic_recommend":
            case "topic_latest":
                str2 = SchemeKey.topic;
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
        return m9654S(str2);
    }

    /* JADX INFO: renamed from: U */
    public final Pair<Boolean, String> m9656U(xa70 xa70Var) {
        if (this.f14413a.f14822c) {
            return new Pair<>(Boolean.FALSE, null);
        }
        User user = xa70Var.f14825f;
        if (user == null || User.isMatched(user)) {
            return new Pair<>(Boolean.FALSE, null);
        }
        if (vqg.m15548w0()) {
            return ((nkg.m12269v() || nkg.m12271w()) && fm20.m10212B(xa70Var.f14821b) && NullChecker.a(xa70Var.f14830k) && !TextUtils.isEmpty(xa70Var.f14830k.relationshipName) && xa70Var.f14830k.relationshipName.contains("喜欢了你")) ? new Pair<>(Boolean.TRUE, vqg.m15550x0()) : new Pair<>(Boolean.FALSE, null);
        }
        return new Pair<>(Boolean.FALSE, null);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ Boolean m9657V(BubbleInfo bubbleInfo) {
        return Boolean.valueOf(TextUtils.equals(((DbObject) this.f14413a.f14825f).id, bubbleInfo.owner.f264id));
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m9658W(int i, int[] iArr) {
        if (m15707x().labels == null || m15707x().labels.size() <= 0) {
            return;
        }
        ((wlh) this.f14429q).f14588T.setBackground(new red0(Color.parseColor(m15707x().labels.get(0).bgColor), t100.d(5.0f), Math.max(iArr[0], i), iArr[1]));
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m9659X(BubbleInfo bubbleInfo) {
        if (bubbleInfo == null) {
            return;
        }
        xdl0.M(this.f14427o, true);
        if (!NullChecker.a(bubbleInfo.emotion) || TextUtils.isEmpty(bubbleInfo.emotion.emojiUrl)) {
            return;
        }
        bkb0 bkb0Var = qib0.G;
        VDraweeView vDraweeView = this.f14428p;
        String str = bubbleInfo.emotion.emojiUrl;
        int i = t100.m;
        bkb0Var.I0(vDraweeView, str, i, i);
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m9660Y(String str) {
        if ((TextUtils.equals(this.f14413a.f14821b, "from_nearby_focus") || TextUtils.equals(this.f14413a.f14821b, "from_like") || TextUtils.equals(this.f14413a.f14821b, "from_discover_discussion") || TextUtils.equals(this.f14413a.f14821b, "from_discover_dating")) && TextUtils.equals(((DbObject) this.f14413a.f14820a).id, str)) {
            xa70 xa70Var = this.f14413a;
            T t = this.f14429q;
            m9675i0(xa70Var, ((wlh) t).f14605n, ((wlh) t).f14592a);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m9661Z() {
        User user;
        xa70 xa70Var = this.f14413a;
        if (xa70Var.f14826g == null || (user = xa70Var.f14825f) == null || TextUtils.isEmpty(((DbObject) user).id)) {
            return;
        }
        xa70 xa70Var2 = this.f14413a;
        xa70Var2.f14826g.duringCreated(FeedModule.f316d.m16642g8(((DbObject) xa70Var2.f14825f).id)).take(1).subscribe(mkd0.G(new e30() { // from class: l.a6i
            public final void call(Object obj) {
                this.f5594a.m9659X((BubbleInfo) obj);
            }
        }));
    }

    @Override // p007l.g6i
    /* JADX INFO: renamed from: a */
    public void mo9662a() {
        if (xdl0.O0(((wlh) this.f14429q).f14574F)) {
            ((wlh) this.f14429q).f14574F.m5510j();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m9663a0() {
        User user;
        xa70 xa70Var = this.f14413a;
        if (xa70Var.f14826g == null || (user = xa70Var.f14825f) == null || TextUtils.isEmpty(((DbObject) user).id)) {
            return;
        }
        this.f14413a.f14826g.duringCreated(FeedModule.f316d.f15017z1).subscribe(mkd0.G(new e30() { // from class: l.c6i
            public final void call(Object obj) {
                this.f6550a.m9660Y((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b0 */
    public final void m9664b0() {
        xa70 xa70Var = this.f14413a;
        if (xa70Var.f14822c) {
            xdl0.M(((wlh) this.f14429q).f14589U, false);
            return;
        }
        if (!NullChecker.a(xa70Var.f14830k) || !NullChecker.a(this.f14413a.f14830k.interaction) || TextUtils.isEmpty(this.f14413a.f14830k.interaction.text)) {
            xdl0.M(((wlh) this.f14429q).f14589U, false);
            return;
        }
        xdl0.X(((wlh) this.f14429q).f14597f, t100.d(25.0f));
        xdl0.M(((wlh) this.f14429q).f14589U, true);
        ((wlh) this.f14429q).f14591W.setText(this.f14413a.f14830k.interaction.text);
        qib0.G.L0(((wlh) this.f14429q).f14590V, this.f14413a.f14830k.interaction.icon);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m9665c0() {
        xa70 xa70Var = this.f14413a;
        if (!xa70Var.f14822c && TextUtils.equals(xa70Var.f14821b, "from_like") && NullChecker.a(this.f14413a.f14830k)) {
            xa70 xa70Var2 = this.f14413a;
            if (xa70Var2.f14830k.showLikeSplitLine) {
                xdl0.X(((wlh) this.f14429q).f14593b, t100.d(xa70Var2.f14827h == 0 ? 3.0f : 15.0f));
                xdl0.U(((wlh) this.f14429q).f14593b, t100.d(this.f14413a.f14827h == 0 ? 10.0f : 21.0f));
                ((wlh) this.f14429q).f14594c.getPaint().setFakeBoldText(true);
                xdl0.M(((wlh) this.f14429q).f14593b, true);
                ((wlh) this.f14429q).f14594c.setText(this.f14413a.f14827h == 0 ? "喜欢的人新动态会出现在这里" : "喜欢的人近期动态都看完了");
                ((wlh) this.f14429q).f14595d.setText(this.f14413a.f14827h == 0 ? "为你推荐了一些可能喜欢的动态" : "为你推荐更多可能喜欢的动态");
                return;
            }
        }
        xdl0.X(((wlh) this.f14429q).f14596e, t100.d(0.0f));
        xdl0.M(((wlh) this.f14429q).f14593b, false);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m9666d0() {
        if (NullChecker.a(((wlh) this.f14429q).f14600i) && m9651P()) {
            ((wlh) this.f14429q).f14600i.setVisibility(8);
            List<Double> list = this.f14413a.f14825f.profile.extensions.tailFrame.expiredTime;
            if (vwb.J(list) || list.get(0).doubleValue() <= mqi0.o() || vwb.J(this.f14413a.f14825f.profile.extensions.tailFrame.url)) {
                return;
            }
            ((wlh) this.f14429q).f14600i.setVisibility(0);
            qib0.G.L0(((wlh) this.f14429q).f14600i, this.f14413a.f14825f.profile.extensions.tailFrame.url.get(0));
            m15707x().setHasHeadFrame(true);
        }
    }

    @Override // p007l.w5i, p007l.g6i
    /* JADX INFO: renamed from: e */
    public void mo9667e() {
        super.mo9667e();
        if (NullChecker.a(this.f14413a.f14830k) && this.f14413a.f14830k.isRoamHighlight) {
            this.f14414b.setVisibility(0);
            return;
        }
        Pair<Boolean, String> pairM9656U = m9656U(this.f14413a);
        if (this.f14413a.f14822c || ((!nkg.m12213K() && "topic_recommend".equals(this.f14413a.f14821b)) || ((Boolean) pairM9656U.first).booleanValue() || ((!nkg.m12217O() && "from_group_detail_recommend".equals(this.f14413a.f14821b)) || ((!nkg.m12217O() && "from_group_detail_new".equals(this.f14413a.f14821b)) || ((nkg.m12217O() && vqg.m15496T(this.f14413a.f14821b)) || ((nkg.m12213K() && m9655T(this.f14413a.f14821b)) || "from_live_square_tab".equals(this.f14413a.f14821b) || (("from_nearby_online".equals(this.f14413a.f14821b) || "from_poi_aggregation".equals(this.f14413a.f14821b)) && nkg.m12255o()))))))) {
            if (this.f7233s == null) {
                this.f7233s = new q5i();
            }
            q5i q5iVar = this.f7233s;
            xa70 xa70Var = this.f14413a;
            T t = this.f14429q;
            q5iVar.m13407s(xa70Var, ((wlh) t).f14601j, ((wlh) t).f14602k, (String) pairM9656U.second, ((wlh) t).f14592a);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m9668e0() {
        boolean zNeedShowFrame = this.f14413a.f14825f.needShowFrame();
        T t = this.f14429q;
        if (zNeedShowFrame) {
            ((wlh) t).f14609r.x(this.f14413a.f14825f.headFrameUrl(), 1);
            m15707x().setHasHeadFrame(true);
            return;
        }
        if (!NullChecker.a(((wlh) t).f14609r)) {
            FeedGPException.reportMomentDetailTopViewExc(this.f14413a.f14821b);
            return;
        }
        ((wlh) this.f14429q).f14609r.setVisibility(8);
        List<Double> list = this.f14413a.f14825f.profile.extensions.headFrame.expiredTime;
        if (vwb.J(list) || list.get(0).doubleValue() <= mqi0.o() || vwb.J(this.f14413a.f14825f.profile.extensions.headFrame.url)) {
            return;
        }
        ((wlh) this.f14429q).f14609r.setVisibility(0);
        qib0.G.L0(((wlh) this.f14429q).f14609r, this.f14413a.f14825f.profile.extensions.headFrame.url.get(0));
        m15707x().setHasHeadFrame(true);
    }

    @Override // p007l.w5i, p007l.g6i
    /* JADX INFO: renamed from: f */
    public void mo9669f() {
        super.mo9669f();
    }

    /* JADX INFO: renamed from: f0 */
    public final void m9670f0() {
        User user = this.f14413a.f14825f;
        if (user == null || TextUtils.isEmpty(((DbObject) user).id)) {
            return;
        }
        BubbleInfo bubbleInfoM9649N = m9649N();
        boolean zM9653R = m9653R(bubbleInfoM9649N);
        xdl0.M(this.f14427o, zM9653R);
        if (zM9653R && NullChecker.a(bubbleInfoM9649N.emotion) && !TextUtils.isEmpty(bubbleInfoM9649N.emotion.emojiUrl)) {
            bkb0 bkb0Var = qib0.G;
            VDraweeView vDraweeView = this.f14428p;
            String str = bubbleInfoM9649N.emotion.emojiUrl;
            int i = t100.m;
            bkb0Var.I0(vDraweeView, str, i, i);
        }
    }

    @Override // p007l.g6i
    /* JADX INFO: renamed from: g */
    public void mo9671g(xa70 xa70Var) {
        xdl0.M(((wlh) this.f14429q).f14606o, true);
        xdl0.M(((wlh) this.f14429q).f14609r, true);
        xdl0.M(((wlh) this.f14429q).f14610s, false);
        xdl0.M(((wlh) this.f14429q).f14613v, true);
        xdl0.M(((wlh) this.f14429q).f14600i, m9651P());
    }

    /* JADX INFO: renamed from: g0 */
    public final void m9672g0(boolean z) {
        ((wlh) this.f14429q).f14574F.setVisibility(8);
    }

    @Override // p007l.w5i, p007l.g6i
    /* JADX INFO: renamed from: h */
    public void mo9673h() {
        super.mo9673h();
        if (xdl0.O0(((wlh) this.f14429q).f14610s)) {
            return;
        }
        qib0.b0.b.showUserVerificationLogo(m15699o(), this.f14413a.f14825f, ((wlh) this.f14429q).f14613v);
        VFrame parent = ((wlh) this.f14429q).f14613v.getParent();
        if (!NullChecker.a(parent) || xdl0.O0(((wlh) this.f14429q).f14613v)) {
            xdl0.d0(parent, t100.d(2.0f));
        } else {
            xdl0.d0(parent, 0);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m9674h0() {
        xa70 xa70Var;
        Moment moment;
        xa70 xa70Var2 = this.f14413a;
        if (xa70Var2 == null || !"from_live_square_tab".equals(xa70Var2.f14821b) || (moment = (xa70Var = this.f14413a).f14820a) == null || moment.liveCircleExtInfo == null || xa70Var.f14822c) {
            xdl0.M(((wlh) this.f14429q).f14572D, false);
            return;
        }
        rzt rztVarMg = FeedModule.m1141M().mg();
        VDraweeView vDraweeView = ((wlh) this.f14429q).f14572D;
        LiveCircleExtInfo liveCircleExtInfo = this.f14413a.f14820a.liveCircleExtInfo;
        rztVarMg.a(vDraweeView, liveCircleExtInfo.coverUrl, liveCircleExtInfo.grade);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i0 */
    public void m9675i0(xa70 xa70Var, View view, PhotoAlbumTopView photoAlbumTopView) {
        SVGAnimationView sVGAnimationViewM9055a = bxh.m9055a(xa70Var.f14826g, photoAlbumTopView, view, t100.d(15.0f), -t100.d(3.0f), 40.0f, 52.0f);
        if (photoAlbumTopView.getTag() != null) {
            photoAlbumTopView.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener) photoAlbumTopView.getTag());
        }
        ViewOnAttachStateChangeListenerC2367a viewOnAttachStateChangeListenerC2367a = new ViewOnAttachStateChangeListenerC2367a(sVGAnimationViewM9055a, photoAlbumTopView);
        photoAlbumTopView.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC2367a);
        photoAlbumTopView.setTag(viewOnAttachStateChangeListenerC2367a);
        sVGAnimationViewM9055a.setVisibility(0);
        SVGALoader.with(xa70Var.f14826g).from("https://auto.tancdn.com/v1/raw/2fe249b8-00f2-4002-b7d5-b7116c6c754013.pdf").autoPlay(false).repeatCount(1).animListener(new C2368b(sVGAnimationViewM9055a, photoAlbumTopView)).into(sVGAnimationViewM9055a);
        sVGAnimationViewM9055a.startAnimation();
    }

    @Override // p007l.w5i, p007l.g6i
    /* JADX INFO: renamed from: j */
    public void mo9676j() {
        super.mo9676j();
        m9642G(this.f14413a.f14822c);
        m9644I(this.f14413a.f14822c);
        m9648M(this.f14413a.f14822c);
        m9643H(this.f14413a.f14822c);
        m9645J(this.f14413a.f14822c);
        m9646K(this.f14413a.f14822c);
        m9668e0();
        m9666d0();
        m9647L();
        m9674h0();
        m9672g0(this.f14413a.f14822c);
        m9664b0();
        if (nkg.m12248k0()) {
            if (this.f14413a.f14822c) {
                m9661Z();
            } else {
                m9670f0();
            }
        }
        m9665c0();
    }

    @Override // p007l.g6i
    /* JADX INFO: renamed from: k */
    public void mo9677k(xa70 xa70Var) {
        super.mo9677k(xa70Var);
        d5i d5iVar = this.f14413a.f14832m;
        if (d5iVar == null || !d5iVar.m9309d()) {
            m9650O();
        }
    }

    @Override // p007l.w5i
    /* JADX INFO: renamed from: p */
    public void mo9678p() {
        T t = this.f14429q;
        this.f14414b = ((wlh) t).f14603l;
        this.f14415c = ((wlh) t).f14601j;
        this.f14416d = ((wlh) t).f14602k;
        this.f14417e = ((wlh) t).f14604m;
        this.f14418f = ((wlh) t).f14606o;
        this.f14419g = ((wlh) t).f14613v;
        this.f14420h = ((wlh) t).f14611t;
        this.f14421i = ((wlh) t).f14612u;
        this.f14422j = ((wlh) t).f14615x;
        this.f14423k = ((wlh) t).f14616y;
        this.f14424l = ((wlh) t).f14569A;
        this.f14425m = ((wlh) t).f14586R;
        this.f14426n = ((wlh) t).f14617z;
        this.f14427o = ((wlh) t).f14607p;
        this.f14428p = ((wlh) t).f14608q;
    }

    @Override // p007l.w5i
    /* JADX INFO: renamed from: y */
    public void mo9679y() {
        super.mo9679y();
        ((wlh) this.f14429q).f14609r.setVisibility(8);
        ((wlh) this.f14429q).f14600i.setVisibility(8);
    }

    @Override // p007l.w5i
    /* JADX INFO: renamed from: z */
    public void mo9680z() {
        super.mo9680z();
        m15700q(((wlh) this.f14429q).f14605n);
    }

    /* JADX INFO: renamed from: l.e6i$a */
    public class ViewOnAttachStateChangeListenerC2367a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SVGAnimationView f7234a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ PhotoAlbumTopView f7235b;

        public ViewOnAttachStateChangeListenerC2367a(SVGAnimationView sVGAnimationView, PhotoAlbumTopView photoAlbumTopView) {
            this.f7234a = sVGAnimationView;
            this.f7235b = photoAlbumTopView;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (NullChecker.a(this.f7234a)) {
                this.f7234a.stopAnimation(false);
                this.f7235b.removeView(this.f7234a);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
