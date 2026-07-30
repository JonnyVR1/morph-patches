package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.FollowshipStatus;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.PartialIdList;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.GroupIdBox;
import com.p051p1.mobile.putong.feed.data.LiveCircleExtInfo;
import com.p051p1.mobile.putong.feed.data.LiveCircleExtTag;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentMessage;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumBottomView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert.FeedInteractiveView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes13.dex */
public class w770 extends f770 {

    /* JADX INFO: renamed from: f0 */
    public static final float f187712f0 = bnl0.m105592y0() * 0.6f;

    /* JADX INFO: renamed from: Z */
    public View f187714Z;

    /* JADX INFO: renamed from: a0 */
    public View f187715a0;

    /* JADX INFO: renamed from: b0 */
    public User f187716b0;

    /* JADX INFO: renamed from: c0 */
    public PhotoAlbumBottomView f187717c0;

    /* JADX INFO: renamed from: d0 */
    public FeedInteractiveView f187718d0;

    /* JADX INFO: renamed from: Y */
    public int f187713Y = 0;

    /* JADX INFO: renamed from: e0 */
    public boolean f187719e0 = false;

    /* JADX INFO: renamed from: L0 */
    public static boolean m205235L0(List<TopicMoment> list) {
        return list != null && list.size() > 0 && TextUtils.equals(list.get(0).topicType, "topic_group");
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m205236j0(PhotoAlbumBottomView photoAlbumBottomView) {
        FeedModule.f39703d.f121371p0.m137019l(photoAlbumBottomView.f41942K);
        photoAlbumBottomView.act().duringCreated(photoAlbumBottomView.f41953T.m161685B(photoAlbumBottomView.f41942K, ksg.m151174K(photoAlbumBottomView.f41949P, photoAlbumBottomView.f41951R))).subscribe(psd0.m173597H(new y20() { // from class: l.u770
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165651y("操作成功，将减少此类动态的推荐");
            }
        }, new y20() { // from class: l.v770
            @Override // p153l.y20
            public final void call(Object obj) {
                w770.m205248v0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m205237k0(PhotoAlbumBottomView photoAlbumBottomView, View view) {
        if (NullChecker.m82486a(photoAlbumBottomView.f41937H0) && NullChecker.m82486a(photoAlbumBottomView.f41942K)) {
            photoAlbumBottomView.f41937H0.call(new pf60<>(photoAlbumBottomView.f41942K.f56859id, Boolean.FALSE));
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m205238l0(Throwable th) {
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m205239m0(boolean z, Followship followship) {
        if (z) {
            return;
        }
        o1j0.m165649w(R$string.f39876b3);
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m205240n0(Throwable th) {
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ void m205241o0(boolean z, Followship followship) {
        if (z) {
            return;
        }
        o1j0.m165649w(R$string.f39782M0);
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m205244r0(PhotoAlbumBottomView photoAlbumBottomView, View view) {
        i4g0.m138520r("e_emoji_comment", ksg.m151174K(photoAlbumBottomView.f41949P, false));
        if (NullChecker.m82486a(photoAlbumBottomView.f41937H0) && NullChecker.m82486a(photoAlbumBottomView.f41942K)) {
            photoAlbumBottomView.f41937H0.call(new pf60<>(photoAlbumBottomView.f41942K.f56859id, Boolean.TRUE));
        }
    }

    /* JADX INFO: renamed from: v0 */
    public static /* synthetic */ void m205248v0(Throwable th) {
    }

    /* JADX INFO: renamed from: A0 */
    public View m205251A0(PhotoAlbumBottomView photoAlbumBottomView) {
        PartialIdList partialIdListM177159b;
        MomentMessage momentMessage;
        n570 n570Var = photoAlbumBottomView.f41953T;
        if (n570Var == null || !n570Var.m161687p() || (partialIdListM177159b = photoAlbumBottomView.f41953T.f140315b.m177159b(photoAlbumBottomView.f41942K.f56859id)) == null || jyb.m147479J(partialIdListM177159b.expouseIds) || (momentMessage = FeedModule.f39703d.f121300H0.get(partialIdListM177159b.expouseIds.get(0))) == null) {
            return null;
        }
        return new rrg.C19902a(photoAlbumBottomView.act(), momentMessage, this.f97520g).m182784l(photoAlbumBottomView.f41953T).m182782j(photoAlbumBottomView.f41942K).m182783k(ksg.m151174K(photoAlbumBottomView.f41949P, photoAlbumBottomView.f41951R)).m182781i(photoAlbumBottomView.f41949P).m182780h();
    }

    /* JADX INFO: renamed from: B0 */
    public View m205252B0(PhotoAlbumBottomView photoAlbumBottomView) {
        Moment moment;
        LiveCircleExtInfo liveCircleExtInfo;
        List<TopicMoment> topicList = photoAlbumBottomView.f41942K.getTopicList();
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m82486a(topicList)) {
            arrayList.addAll(topicList);
        }
        GroupIdBox groupIdBox = photoAlbumBottomView.f41942K.group;
        if (!TextUtils.isEmpty(groupIdBox.f40071id) && !m205235L0(arrayList) && ksg.m151228s(photoAlbumBottomView.f41949P)) {
            TopicMoment topicMoment = new TopicMoment();
            topicMoment.setEnterGroup(true);
            topicMoment.name = "来自" + groupIdBox.name + "圈子";
            topicMoment.f40095id = groupIdBox.f40071id;
            topicMoment.topicType = "topic_group";
            topicMoment.momentId = photoAlbumBottomView.f41942K.f56859id;
            arrayList.add(0, topicMoment);
        }
        if (TextUtils.equals(photoAlbumBottomView.f41949P, "from_live_square_tab")) {
            arrayList.clear();
        }
        if (TextUtils.equals(photoAlbumBottomView.f41949P, "from_live_square_tab") && (moment = photoAlbumBottomView.f41942K) != null && (liveCircleExtInfo = moment.liveCircleExtInfo) != null && !liveCircleExtInfo.tags.isEmpty()) {
            for (LiveCircleExtTag liveCircleExtTag : photoAlbumBottomView.f41942K.liveCircleExtInfo.tags) {
                TopicMoment topicMoment2 = new TopicMoment();
                topicMoment2.setEnterGroup(false);
                topicMoment2.name = liveCircleExtTag.tagName;
                topicMoment2.topicType = "live_square";
                topicMoment2.icon = liveCircleExtTag.tagUrl;
                arrayList.add(topicMoment2);
            }
        }
        View viewM187611h = new srg.C20137a(photoAlbumBottomView.act(), arrayList, this.f97520g).m187613j(ksg.m151174K(photoAlbumBottomView.f41949P, photoAlbumBottomView.f41951R)).m187612i(photoAlbumBottomView.f41949P).m187611h();
        if (NullChecker.m82486a(viewM187611h) && NullChecker.m82486a(viewM187611h.getLayoutParams())) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewM187611h.getLayoutParams();
            bnl0.m105540X(viewM187611h, (cmg.m111174C0() && NullChecker.m82486a(photoAlbumBottomView.f41942K) && !jyb.m147479J(photoAlbumBottomView.f41942K.mediaRepeatIndexList)) ? marginLayoutParams.topMargin - qa00.m175859d(4.0f) : marginLayoutParams.topMargin);
        }
        m205273y0();
        return viewM187611h;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ec  */
    /* JADX INFO: renamed from: C0 */
    public final void m205253C0(boolean z) {
        boolean zM205269T0;
        ImageView imageView;
        boolean z2 = true;
        if (!m205263N0(z)) {
            if (m205264O0()) {
                this.f97498I.setText(FeedModule.m61406H().mo31745a().mo192243I5() ? "抢先告白" : this.f187717c0.act().getString(R$string.f39806Q0));
                this.f97497H.setImageResource(lbc0.f131059i4);
                ViewGroup.LayoutParams layoutParams = this.f97496G.getLayoutParams();
                layoutParams.width = qa00.m175859d(FeedModule.m61406H().mo31745a().mo192243I5() ? 83.0f : 78.0f);
                this.f97496G.setLayoutParams(layoutParams);
                if (!bnl0.m105529O0(this.f97496G)) {
                    bnl0.m105524M(this.f97496G, true);
                }
                h9i.m134061b(this.f97493D, this.f97496G, this.f97494E, this.f97495F);
                m205272W0();
            } else {
                bnl0.m105524M(this.f97496G, false);
                h9i.m134062c(this.f97493D, this.f97494E, this.f97495F);
            }
            h9i.m134063d(this.f97537x, this.f97493D, this.f97539z, this.f97492C, this.f97491B, this.f187717c0.f41949P);
            zM205269T0 = m205269T0();
            imageView = this.f97501L;
            if (zM205269T0) {
                h9i.m134064e(imageView);
            } else {
                h9i.m134069j(imageView);
            }
            if (FeedModule.m61406H().mo31745a().mo192243I5() || !z2) {
            }
            this.f97497H.setImageResource(lbc0.f130964W1);
            return;
        }
        if (!bnl0.m105529O0(this.f97496G)) {
            bnl0.m105524M(this.f97496G, true);
        }
        h9i.m134061b(this.f97493D, this.f97496G, this.f97494E, this.f97495F);
        m205272W0();
        this.f97498I.setText(this.f187717c0.act().getString(R$string.f39962n5));
        this.f97497H.setImageResource(lbc0.f131043g4);
        ViewGroup.LayoutParams layoutParams2 = this.f97496G.getLayoutParams();
        layoutParams2.width = qa00.m175859d(64.0f);
        this.f97496G.setLayoutParams(layoutParams2);
        z2 = false;
        h9i.m134063d(this.f97537x, this.f97493D, this.f97539z, this.f97492C, this.f97491B, this.f187717c0.f41949P);
        zM205269T0 = m205269T0();
        imageView = this.f97501L;
        if (zM205269T0) {
            h9i.m134064e(imageView);
        } else {
            h9i.m134069j(imageView);
        }
        if (FeedModule.m61406H().mo31745a().mo192243I5()) {
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final void m205254D0(Moment moment) {
        if (!TextUtils.equals(this.f187717c0.f41949P, "from_live_square_tab") || moment == null || moment.liveCircleExtInfo == null) {
            return;
        }
        bnl0.m105524M(this.f97496G, true);
        int i = moment.liveCircleExtInfo.views;
        TextView textView = this.f97498I;
        if (i > 0) {
            textView.setText(q8g0.m175802h0(i));
        } else {
            textView.setText("1");
        }
        this.f97497H.setImageResource(lbc0.f131083l4);
        ViewGroup.LayoutParams layoutParams = this.f97496G.getLayoutParams();
        layoutParams.width = qa00.m175859d(78.0f);
        this.f97496G.setLayoutParams(layoutParams);
        if (!bnl0.m105529O0(this.f97496G)) {
            bnl0.m105524M(this.f97496G, true);
        }
        h9i.m134061b(this.f97493D, this.f97496G, this.f97494E, this.f97495F);
    }

    /* JADX INFO: renamed from: E0 */
    public String m205255E0(boolean z, boolean z2) {
        String strM205259I0 = m205259I0(z);
        String strM205258H0 = m205258H0(z2);
        PhotoAlbumBottomView photoAlbumBottomView = this.f187717c0;
        tfj0.m190940c(strM205258H0, strM205259I0, ksg.m151208i(photoAlbumBottomView.f41949P, m205260J0(photoAlbumBottomView.f41942K)));
        return strM205259I0;
    }

    /* JADX INFO: renamed from: F0 */
    public void m205256F0(PhotoAlbumBottomView photoAlbumBottomView) {
        if (rzi.m183774U(photoAlbumBottomView.f41942K, new q770(this), photoAlbumBottomView.f41949P) && m205257G0().equals(FeedModule.f39700a.getResources().getString(R$string.f39814R2))) {
            tfj0.m190942e(MatchScData.ModuleId.mid_e_follow, m205259I0(false), ksg.m151208i(photoAlbumBottomView.f41949P, m205260J0(photoAlbumBottomView.f41942K)));
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final String m205257G0() {
        if (NullChecker.m82486a(this.f187716b0.localFollowship)) {
            FollowshipStatus followshipStatus = this.f187716b0.localFollowship.state;
            if (TEnum.equals(followshipStatus, FollowshipStatus.following) || TEnum.equals(followshipStatus, "matched")) {
                return this.f187717c0.act().getResources().getString(R$string.f39872b);
            }
        }
        return FeedModule.f39700a.getResources().getString(R$string.f39814R2);
    }

    /* JADX INFO: renamed from: H0 */
    public final String m205258H0(boolean z) {
        return z ? MatchScData.ModuleId.mid_e_follow : "e_cancelfollow";
    }

    /* JADX INFO: renamed from: I0 */
    public final String m205259I0(boolean z) {
        String strM173809d;
        if (!z && "from_discover_discussion".equals(this.f187717c0.f41949P)) {
            strM173809d = "p_discover_discussion";
        } else if (!z && "from_discover_dating".equals(this.f187717c0.f41949P)) {
            strM173809d = "p_discover_dating";
        } else if (z || !"from_activity_tab_one".equals(this.f187717c0.f41949P)) {
            strM173809d = (z || !"from_activity_tab_two".equals(this.f187717c0.f41949P)) ? "" : pu20.m173809d("from_activity_tab_two");
        } else {
            strM173809d = pu20.m173809d("from_activity_tab_one");
        }
        if ("from_group_detail_recommend".equals(this.f187717c0.f41949P) || "from_group_detail_new".equals(this.f187717c0.f41949P)) {
            strM173809d = "p_circle_detail";
        }
        return (TextUtils.isEmpty(strM173809d) && NullChecker.m82486a(this.f187717c0.act())) ? this.f187717c0.act().pageId() : strM173809d;
    }

    /* JADX INFO: renamed from: J0 */
    public final pf60[] m205260J0(Moment moment) {
        if (!NullChecker.m82486a(moment)) {
            return new pf60[0];
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new pf60("owner_id", moment.owner));
        arrayList.add(new pf60("liveId", moment.isLive ? moment.live.f39615id : ""));
        arrayList.add(new pf60("moment_id", moment.isLive ? "" : moment.f56859id));
        arrayList.add(new pf60("moment_type", moment.isLive ? "live" : er60.m122104w().m122135y(moment)));
        arrayList.add(new pf60("receiver_user_id", moment.owner));
        return (pf60[]) arrayList.toArray(new pf60[0]);
    }

    /* JADX INFO: renamed from: K0 */
    public final boolean m205261K0(String str) {
        return "topic_recommend".equals(str) || "qa_recommend".equals(str) || "from_group_detail_recommend".equals(str) || "from_group_detail_new".equals(str);
    }

    /* JADX INFO: renamed from: M0 */
    public final boolean m205262M0() {
        gj70.C17230a c17230a = gj70.m130463a().m130464b().get(this.f187717c0.f41949P);
        return (!NullChecker.m82486a(c17230a) || !c17230a.f104609a || m205261K0(this.f187717c0.f41949P) || this.f187717c0.f41942K.owner.equals(FeedModule.m61405F().userId()) || (NullChecker.m82486a(this.f187716b0.localRelationship) && TEnum.equals(this.f187716b0.localRelationship.state, "matched"))) ? false : true;
    }

    @Override // p153l.f770, p153l.AbstractC20228t4
    /* JADX INFO: renamed from: N */
    public void mo124390N(boolean z) {
        this.f187719e0 = z;
    }

    /* JADX INFO: renamed from: N0 */
    public boolean m205263N0(boolean z) {
        return (!cmg.m111233s() || ((!"from_discover_discussion".equals(this.f187717c0.f41949P) || pu20.m173803H()) && ((!"from_discover_dating".equals(this.f187717c0.f41949P) || pu20.m173800E()) && ((!"from_activity_tab_one".equals(this.f187717c0.f41949P) || pu20.m173800E()) && (!"from_activity_tab_two".equals(this.f187717c0.f41949P) || pu20.m173800E()))))) && cmg.m111233s() && z && owi.f149484c.get().booleanValue() && !ksg.m151219n0(this.f187716b0) && pu20.m173798C(this.f187717c0.f41949P);
    }

    /* JADX INFO: renamed from: O0 */
    public boolean m205264O0() {
        if (cmg.m111233s() && ((!"from_discover_discussion".equals(this.f187717c0.f41949P) || pu20.m173803H()) && ((!"from_discover_dating".equals(this.f187717c0.f41949P) || pu20.m173800E()) && ((!"from_activity_tab_one".equals(this.f187717c0.f41949P) || pu20.m173800E()) && "from_activity_tab_two".equals(this.f187717c0.f41949P))))) {
            pu20.m173800E();
        }
        return false;
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m205265P0(String str, final boolean z) {
        FeedModule.f39703d.m145743m7(FeedModule.m61405F().userId(), this.f187716b0, false, str).subscribe(psd0.m173597H(new y20() { // from class: l.l770
            @Override // p153l.y20
            public final void call(Object obj) {
                w770.m205241o0(z, (Followship) obj);
            }
        }, new y20() { // from class: l.m770
            @Override // p153l.y20
            public final void call(Object obj) {
                w770.m205240n0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m205266Q0(FollowshipStatus followshipStatus) {
        m205270U0(followshipStatus, false);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m205267R0(final PhotoAlbumBottomView photoAlbumBottomView, View view) {
        User user = this.f187716b0;
        if (user == null) {
            o1j0.m165636j("user is null error!");
            return;
        }
        final FollowshipStatus followshipStatus = NullChecker.m82486a(user.localFollowship) ? this.f187716b0.localFollowship.state : null;
        Moment moment = photoAlbumBottomView.f41942K;
        pcj pcjVar = new pcj() { // from class: l.p770
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f150902a.m205257G0();
            }
        };
        q770 q770Var = new q770(this);
        x20 x20Var = new x20() { // from class: l.r770
            @Override // p153l.x20
            public final void call() {
                this.f161585a.m205266Q0(followshipStatus);
            }
        };
        n570 controller = photoAlbumBottomView.getController();
        Objects.requireNonNull(controller);
        rzi.m183772S(moment, pcjVar, q770Var, x20Var, new rk00(controller), photoAlbumBottomView.getController().mo137270m(photoAlbumBottomView.f41942K.owner), photoAlbumBottomView.act(), photoAlbumBottomView.f41949P, false, new x20() { // from class: l.s770
            @Override // p153l.x20
            public final void call() {
                w770.m205236j0(photoAlbumBottomView);
            }
        });
        m205256F0(photoAlbumBottomView);
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m205268S0(View view) {
        boolean z = bnl0.m105529O0(this.f97503N) && TextUtils.equals(this.f97505P.getText().toString(), "通过动态打招呼，更容易得到回复");
        if (TextUtils.equals(this.f97498I.getText().toString(), this.f187717c0.act().getString(R$string.f39806Q0)) || TextUtils.equals(this.f97498I.getText().toString(), "抢先告白")) {
            er60.m122104w().m122130s(this.f187717c0.f41942K, m205259I0(false), true, z);
            FeedModule.f39702c.m61908f3(this.f187717c0.act(), this.f187716b0, this.f187717c0.f41942K, m205259I0(false), this.f187717c0.f41952S);
        } else {
            er60.m122104w().m122130s(this.f187717c0.f41942K, m205259I0(false), false, z);
            if (NullChecker.m82486a(this.f187716b0)) {
                this.f187717c0.act().startActivity(orb0.m168886c(this.f187717c0.act(), this.f187716b0.f56859id, false, false));
            }
        }
    }

    /* JADX INFO: renamed from: T0 */
    public boolean m205269T0() {
        return !this.f187717c0.f41942K.isLive;
    }

    /* JADX INFO: renamed from: U0 */
    public final void m205270U0(FollowshipStatus followshipStatus, final boolean z) {
        if (NullChecker.m82486a(followshipStatus) && (TEnum.equals(followshipStatus, FollowshipStatus.following) || TEnum.equals(followshipStatus, "matched"))) {
            final String strM205255E0 = m205255E0(z, false);
            k3h.m148105v0(this.f187717c0.act(), FeedModule.f39700a.getResources().getString(R$string.f40031z), new x20() { // from class: l.i770
                @Override // p153l.x20
                public final void call() {
                    this.f113240a.m205265P0(strM205255E0, z);
                }
            });
            return;
        }
        String strM205255E1 = m205255E0(z, true);
        User user = this.f187716b0;
        if (user.profile.moments.hidePublicMoments && !User.isMatched(user)) {
            o1j0.m165649w(R$string.f39977q);
            return;
        }
        jka jkaVar = FeedModule.f39703d;
        String strUserId = FeedModule.m61405F().userId();
        User user2 = this.f187716b0;
        Moment moment = this.f187717c0.f41942K;
        boolean z2 = moment.isLive;
        jkaVar.m145750n7(strUserId, user2, true, z2 ? "liveMomentNearby" : "", z2 ? moment.live.f39615id : "", strM205255E1).subscribe(psd0.m173597H(new y20() { // from class: l.j770
            @Override // p153l.y20
            public final void call(Object obj) {
                w770.m205239m0(z, (Followship) obj);
            }
        }, new y20() { // from class: l.k770
            @Override // p153l.y20
            public final void call(Object obj) {
                w770.m205238l0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V0 */
    public boolean m205271V0(String str) {
        return TextUtils.equals(str, "from_discover_dating") || TextUtils.equals(str, "from_nearby_focus") || TextUtils.equals(str, "from_like");
    }

    /* JADX INFO: renamed from: W0 */
    public void m205272W0() {
        ksg.m151167G0(this.f97496G, new View.OnClickListener() { // from class: l.t770
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f172405a.m205268S0(view);
            }
        });
    }

    @Override // p153l.f770, p153l.lol
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public boolean mo124400b(final PhotoAlbumBottomView photoAlbumBottomView) {
        boolean zMo124400b = super.mo124400b(photoAlbumBottomView);
        m124392U(this.f97501L, (ksg.m151187V(photoAlbumBottomView.f41942K) || photoAlbumBottomView.f41942K.isLive) ? false : true);
        if (j4h.m143422f() && NullChecker.m82486a(photoAlbumBottomView.f41942K) && !TextUtils.equals(photoAlbumBottomView.f41942K.owner, FeedModule.m61405F().userId()) && (TextUtils.equals(photoAlbumBottomView.f41949P, "from_discover_dating") || TextUtils.equals(photoAlbumBottomView.f41949P, "from_nearby_falls_feed") || TextUtils.equals(photoAlbumBottomView.f41949P, "from_album") || TextUtils.equals(photoAlbumBottomView.f41949P, "from_discover_discussion") || TextUtils.equals(photoAlbumBottomView.f41949P, "from_nearby_focus") || TextUtils.equals(photoAlbumBottomView.f41949P, "from_like") || TextUtils.equals(photoAlbumBottomView.f41949P, "from_activity_tab_one") || TextUtils.equals(photoAlbumBottomView.f41949P, "from_activity_tab_two"))) {
            this.f97501L.setImageResource(lbc0.f130967W4);
        }
        this.f97501L.setOnClickListener(new View.OnClickListener() { // from class: l.o770
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f145238a.m205267R0(photoAlbumBottomView, view);
            }
        });
        return zMo124400b;
    }

    @Override // p153l.f770, p153l.lol
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public boolean mo124398a(final PhotoAlbumBottomView photoAlbumBottomView) {
        this.f187717c0 = photoAlbumBottomView;
        boolean zMo124398a = super.mo124398a(photoAlbumBottomView);
        this.f97520g.removeAllViews();
        View viewM205251A0 = m205251A0(photoAlbumBottomView);
        this.f187714Z = viewM205251A0;
        if (viewM205251A0 == null && ((!cmg.m111224n0() || !photoAlbumBottomView.f41942K.shareMyVote) && !photoAlbumBottomView.f41941J0)) {
            m205252B0(photoAlbumBottomView);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f97520g.getLayoutParams();
            if (marginLayoutParams.bottomMargin != 0) {
                marginLayoutParams.bottomMargin = 0;
                this.f97520g.setLayoutParams(marginLayoutParams);
            }
        }
        User user = this.f187716b0;
        if (user == null || !ksg.m151219n0(user)) {
            this.f187715a0 = m205274z0(photoAlbumBottomView);
        }
        if (NullChecker.m82486a(this.f187715a0)) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f97520g.getLayoutParams();
            if (marginLayoutParams2.bottomMargin == 0) {
                marginLayoutParams2.bottomMargin = -qa00.f156320g;
                this.f97520g.setLayoutParams(marginLayoutParams2);
            }
        } else if (NullChecker.m82486a(this.f187714Z)) {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.f97520g.getLayoutParams();
            if (marginLayoutParams3.bottomMargin == 0) {
                marginLayoutParams3.bottomMargin = -qa00.f156321h;
                this.f97520g.setLayoutParams(marginLayoutParams3);
            }
        }
        User userMo137270m = photoAlbumBottomView.getController().mo137270m(photoAlbumBottomView.f41942K.owner);
        this.f187716b0 = userMo137270m;
        m205253C0(NullChecker.m82486a(userMo137270m) && ksg.m151186U(FeedModule.m61406H().mo31744Zj(this.f187716b0.f56859id)));
        this.f97494E.setImageTintList(null);
        this.f97539z.setImageTintList(null);
        this.f97497H.setImageTintList(null);
        this.f97501L.setImageTintList(null);
        m205254D0(photoAlbumBottomView.f41942K);
        boolean zM64644p0 = photoAlbumBottomView.m64644p0();
        ConstraintLayout constraintLayout = this.f97503N;
        if (zM64644p0) {
            bnl0.m105524M(constraintLayout, false);
            if (NullChecker.m82486a(photoAlbumBottomView.f41938I)) {
                PutongFrag putongFrag = photoAlbumBottomView.f41938I;
                if (putongFrag instanceof PhotoAlbumFeedBaseFrag) {
                    PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFrag = (PhotoAlbumFeedBaseFrag) putongFrag;
                    if (NullChecker.m82486a(photoAlbumFeedBaseFrag.f42303D) && NullChecker.m82486a(photoAlbumBottomView.f41942K) && photoAlbumFeedBaseFrag.f42303D.containsKey(photoAlbumBottomView.f41942K.f56859id)) {
                        bnl0.m105524M(this.f97503N, photoAlbumFeedBaseFrag.f42303D.get(photoAlbumBottomView.f41942K.f56859id).booleanValue());
                    }
                }
            }
            uqb0.f180374G.m127125Q0(this.f97504O, FeedModule.m61406H().me_().m61308fp().profileSmall());
            this.f97505P.setOnClickListener(new View.OnClickListener() { // from class: l.h770
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    w770.m205237k0(photoAlbumBottomView, view);
                }
            });
            bnl0.m105509E0(this.f97506Q, new View.OnClickListener() { // from class: l.n770
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    w770.m205244r0(photoAlbumBottomView, view);
                }
            });
        } else {
            bnl0.m105524M(constraintLayout, false);
        }
        if (cmg.m111183K() && m205271V0(photoAlbumBottomView.f41949P)) {
            bnl0.m105524M(this.f97516c, photoAlbumBottomView.f41942K.showGreetView);
            if (photoAlbumBottomView.f41942K.showGreetView) {
                if (TextUtils.isEmpty(this.f97518e.getText().toString())) {
                    this.f97518e.setText(ksg.m151238x());
                }
                at0.m100011e(photoAlbumBottomView.f41942K, this.f97517d, FeedModule.m61406H().me_());
            }
        }
        return zMo124398a;
    }

    @Override // p153l.f770
    /* JADX INFO: renamed from: g0 */
    public void mo124411g0(PhotoAlbumBottomView photoAlbumBottomView) {
        super.mo124411g0(photoAlbumBottomView);
    }

    @Override // p153l.f770, p153l.AbstractC20228t4
    /* JADX INFO: renamed from: o */
    public View mo124421o() {
        return this.f97499J;
    }

    /* JADX INFO: renamed from: y0 */
    public final void m205273y0() {
        if (this.f187718d0 == null) {
            this.f187718d0 = new FeedInteractiveView(this.f97520g.getContext());
        }
        FeedInteractiveView feedInteractiveView = this.f187718d0;
        Act act = this.f187717c0.act();
        PhotoAlbumBottomView photoAlbumBottomView = this.f187717c0;
        Moment moment = photoAlbumBottomView.f41942K;
        String str = photoAlbumBottomView.f41949P;
        feedInteractiveView.m65753P(act, moment, str, ksg.m151174K(str, photoAlbumBottomView.f41951R), false, qa00.f156323j);
        if (this.f187718d0.getChildCount() > 0) {
            this.f97520g.addView(this.f187718d0);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public View m205274z0(PhotoAlbumBottomView photoAlbumBottomView) {
        n570 n570Var;
        if (!photoAlbumBottomView.m64623Z1(photoAlbumBottomView.f41949P)) {
            return null;
        }
        if ((nkh.m163608l().m163613i() || photoAlbumBottomView.f41942K.attitudes.count > 0) && (n570Var = photoAlbumBottomView.f41953T) != null && n570Var.m161687p()) {
            return new qrg.C19633a(photoAlbumBottomView.act(), this.f97520g).m177557k(photoAlbumBottomView.f41953T).m177555i(photoAlbumBottomView.f41942K).m177556j(ksg.m151174K(photoAlbumBottomView.f41949P, photoAlbumBottomView.f41951R)).m177553g();
        }
        return null;
    }
}
