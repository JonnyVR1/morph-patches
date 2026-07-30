package p007l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.data.Followship;
import com.p000p1.mobile.putong.data.FollowshipStatus;
import com.p000p1.mobile.putong.data.MatchScData;
import com.p000p1.mobile.putong.data.PartialIdList;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.GroupIdBox;
import com.p000p1.mobile.putong.feed.data.LiveCircleExtInfo;
import com.p000p1.mobile.putong.feed.data.LiveCircleExtTag;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentMessage;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumBottomView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert.FeedInteractiveView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongFrag;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import l.d30;
import l.e30;
import l.i0g0;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.qib0;
import l.t100;
import l.v9j;
import l.vwb;
import l.xdl0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class qz60 extends zy60 {

    /* JADX INFO: renamed from: f0 */
    public static final float f12421f0 = xdl0.y0() * 0.6f;

    /* JADX INFO: renamed from: Z */
    public View f12423Z;

    /* JADX INFO: renamed from: a0 */
    public View f12424a0;

    /* JADX INFO: renamed from: b0 */
    public User f12425b0;

    /* JADX INFO: renamed from: c0 */
    public PhotoAlbumBottomView f12426c0;

    /* JADX INFO: renamed from: d0 */
    public FeedInteractiveView f12427d0;

    /* JADX INFO: renamed from: Y */
    public int f12422Y = 0;

    /* JADX INFO: renamed from: e0 */
    public boolean f12428e0 = false;

    /* JADX INFO: renamed from: L0 */
    public static boolean m13755L0(List<TopicMoment> list) {
        return list != null && list.size() > 0 && TextUtils.equals(list.get(0).topicType, "topic_group");
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m13756j0(PhotoAlbumBottomView photoAlbumBottomView) {
        FeedModule.f316d.f14996p0.onNext(photoAlbumBottomView.f2555K);
        photoAlbumBottomView.act().duringCreated(photoAlbumBottomView.f2566T.m10736B(photoAlbumBottomView.f2555K, vqg.m15485K(photoAlbumBottomView.f2562P, photoAlbumBottomView.f2564R))).subscribe(mkd0.H(new e30() { // from class: l.oz60
            public final void call(Object obj) {
                lsi0.y("操作成功，将减少此类动态的推荐");
            }
        }, new e30() { // from class: l.pz60
            public final void call(Object obj) {
                qz60.m13768v0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m13757k0(PhotoAlbumBottomView photoAlbumBottomView, View view) {
        if (NullChecker.a(photoAlbumBottomView.f2550H0) && NullChecker.a(photoAlbumBottomView.f2555K)) {
            photoAlbumBottomView.f2550H0.call(new j760(((DbObject) photoAlbumBottomView.f2555K).id, Boolean.FALSE));
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m13758l0(Throwable th) {
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m13759m0(boolean z, Followship followship) {
        if (z) {
            return;
        }
        lsi0.w(R$string.f489b3);
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m13760n0(Throwable th) {
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ void m13761o0(boolean z, Followship followship) {
        if (z) {
            return;
        }
        lsi0.w(R$string.f395M0);
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m13764r0(PhotoAlbumBottomView photoAlbumBottomView, View view) {
        zvf0.r("e_emoji_comment", vqg.m15485K(photoAlbumBottomView.f2562P, false));
        if (NullChecker.a(photoAlbumBottomView.f2550H0) && NullChecker.a(photoAlbumBottomView.f2555K)) {
            photoAlbumBottomView.f2550H0.call(new j760(((DbObject) photoAlbumBottomView.f2555K).id, Boolean.TRUE));
        }
    }

    /* JADX INFO: renamed from: v0 */
    public static /* synthetic */ void m13768v0(Throwable th) {
    }

    /* JADX INFO: renamed from: A0 */
    public View m13771A0(PhotoAlbumBottomView photoAlbumBottomView) {
        PartialIdList partialIdListM10601b;
        MomentMessage momentMessage;
        hx60 hx60Var = photoAlbumBottomView.f2566T;
        if (hx60Var == null || !hx60Var.m10743p() || (partialIdListM10601b = photoAlbumBottomView.f2566T.f8835b.m10601b(((DbObject) photoAlbumBottomView.f2555K).id)) == null || vwb.J(partialIdListM10601b.expouseIds) || (momentMessage = FeedModule.f316d.f14925H0.get(partialIdListM10601b.expouseIds.get(0))) == null) {
            return null;
        }
        return new cqg.C2356a(photoAlbumBottomView.act(), momentMessage, this.f15935g).m9224l(photoAlbumBottomView.f2566T).m9222j(photoAlbumBottomView.f2555K).m9223k(vqg.m15485K(photoAlbumBottomView.f2562P, photoAlbumBottomView.f2564R)).m9221i(photoAlbumBottomView.f2562P).m9220h();
    }

    /* JADX INFO: renamed from: B0 */
    public View m13772B0(PhotoAlbumBottomView photoAlbumBottomView) {
        Moment moment;
        LiveCircleExtInfo liveCircleExtInfo;
        List<TopicMoment> topicList = photoAlbumBottomView.f2555K.getTopicList();
        ArrayList arrayList = new ArrayList();
        if (NullChecker.a(topicList)) {
            arrayList.addAll(topicList);
        }
        GroupIdBox groupIdBox = photoAlbumBottomView.f2555K.group;
        if (!TextUtils.isEmpty(groupIdBox.f684id) && !m13755L0(arrayList) && vqg.m15539s(photoAlbumBottomView.f2562P)) {
            TopicMoment topicMoment = new TopicMoment();
            topicMoment.setEnterGroup(true);
            topicMoment.name = "来自" + groupIdBox.name + "圈子";
            topicMoment.f708id = groupIdBox.f684id;
            topicMoment.topicType = "topic_group";
            topicMoment.momentId = ((DbObject) photoAlbumBottomView.f2555K).id;
            arrayList.add(0, topicMoment);
        }
        if (TextUtils.equals(photoAlbumBottomView.f2562P, "from_live_square_tab")) {
            arrayList.clear();
        }
        if (TextUtils.equals(photoAlbumBottomView.f2562P, "from_live_square_tab") && (moment = photoAlbumBottomView.f2555K) != null && (liveCircleExtInfo = moment.liveCircleExtInfo) != null && !liveCircleExtInfo.tags.isEmpty()) {
            for (LiveCircleExtTag liveCircleExtTag : photoAlbumBottomView.f2555K.liveCircleExtInfo.tags) {
                TopicMoment topicMoment2 = new TopicMoment();
                topicMoment2.setEnterGroup(false);
                topicMoment2.name = liveCircleExtTag.tagName;
                topicMoment2.topicType = "live_square";
                topicMoment2.icon = liveCircleExtTag.tagUrl;
                arrayList.add(topicMoment2);
            }
        }
        View viewM9560h = new dqg.C2364a(photoAlbumBottomView.act(), arrayList, this.f15935g).m9562j(vqg.m15485K(photoAlbumBottomView.f2562P, photoAlbumBottomView.f2564R)).m9561i(photoAlbumBottomView.f2562P).m9560h();
        if (NullChecker.a(viewM9560h) && NullChecker.a(viewM9560h.getLayoutParams())) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewM9560h.getLayoutParams();
            xdl0.X(viewM9560h, (nkg.m12204C0() && NullChecker.a(photoAlbumBottomView.f2555K) && !vwb.J(photoAlbumBottomView.f2555K.mediaRepeatIndexList)) ? marginLayoutParams.topMargin - t100.d(4.0f) : marginLayoutParams.topMargin);
        }
        m13800y0();
        return viewM9560h;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ec  */
    /* JADX INFO: renamed from: C0 */
    public final void m13773C0(boolean z) {
        boolean zM13790T0;
        ImageView imageView;
        boolean z2 = true;
        if (!m13784N0(z)) {
            if (m13785O0()) {
                this.f15913I.setText(FeedModule.m1140H().a().I5() ? "抢先告白" : this.f12426c0.act().getString(R$string.f419Q0));
                this.f15912H.setImageResource(f3c0.f7824i4);
                ViewGroup.LayoutParams layoutParams = this.f15911G.getLayoutParams();
                layoutParams.width = t100.d(FeedModule.m1140H().a().I5() ? 83.0f : 78.0f);
                this.f15911G.setLayoutParams(layoutParams);
                if (!xdl0.O0(this.f15911G)) {
                    xdl0.M(this.f15911G, true);
                }
                s7i.m14036b(this.f15908D, this.f15911G, this.f15909E, this.f15910F);
                m13793W0();
            } else {
                xdl0.M(this.f15911G, false);
                s7i.m14037c(this.f15908D, this.f15909E, this.f15910F);
            }
            s7i.m14038d(this.f15952x, this.f15908D, this.f15954z, this.f15907C, this.f15906B, this.f12426c0.f2562P);
            zM13790T0 = m13790T0();
            imageView = this.f15916L;
            if (zM13790T0) {
                s7i.m14039e(imageView);
            } else {
                s7i.m14044j(imageView);
            }
            if (FeedModule.m1140H().a().I5() || !z2) {
            }
            this.f15912H.setImageResource(f3c0.f7729W1);
            return;
        }
        if (!xdl0.O0(this.f15911G)) {
            xdl0.M(this.f15911G, true);
        }
        s7i.m14036b(this.f15908D, this.f15911G, this.f15909E, this.f15910F);
        m13793W0();
        this.f15913I.setText(this.f12426c0.act().getString(R$string.f575n5));
        this.f15912H.setImageResource(f3c0.f7808g4);
        ViewGroup.LayoutParams layoutParams2 = this.f15911G.getLayoutParams();
        layoutParams2.width = t100.d(64.0f);
        this.f15911G.setLayoutParams(layoutParams2);
        z2 = false;
        s7i.m14038d(this.f15952x, this.f15908D, this.f15954z, this.f15907C, this.f15906B, this.f12426c0.f2562P);
        zM13790T0 = m13790T0();
        imageView = this.f15916L;
        if (zM13790T0) {
            s7i.m14039e(imageView);
        } else {
            s7i.m14044j(imageView);
        }
        if (FeedModule.m1140H().a().I5()) {
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final void m13774D0(Moment moment) {
        if (!TextUtils.equals(this.f12426c0.f2562P, "from_live_square_tab") || moment == null || moment.liveCircleExtInfo == null) {
            return;
        }
        xdl0.M(this.f15911G, true);
        int i = moment.liveCircleExtInfo.views;
        TextView textView = this.f15913I;
        if (i > 0) {
            textView.setText(i0g0.h0(i));
        } else {
            textView.setText("1");
        }
        this.f15912H.setImageResource(f3c0.f7848l4);
        ViewGroup.LayoutParams layoutParams = this.f15911G.getLayoutParams();
        layoutParams.width = t100.d(78.0f);
        this.f15911G.setLayoutParams(layoutParams);
        if (!xdl0.O0(this.f15911G)) {
            xdl0.M(this.f15911G, true);
        }
        s7i.m14036b(this.f15908D, this.f15911G, this.f15909E, this.f15910F);
    }

    /* JADX INFO: renamed from: E0 */
    public String m13775E0(boolean z, boolean z2) {
        String strM13779I0 = m13779I0(z);
        String strM13778H0 = m13778H0(z2);
        PhotoAlbumBottomView photoAlbumBottomView = this.f12426c0;
        p6j0.m12913c(strM13778H0, strM13779I0, vqg.m15519i(photoAlbumBottomView.f2562P, m13780J0(photoAlbumBottomView.f2555K)));
        return strM13779I0;
    }

    /* JADX INFO: renamed from: F0 */
    public void m13776F0(PhotoAlbumBottomView photoAlbumBottomView) {
        if (vwi.m15606U(photoAlbumBottomView.f2555K, new kz60(this), photoAlbumBottomView.f2562P) && m13777G0().equals(FeedModule.f313a.getResources().getString(R$string.f427R2))) {
            p6j0.m12915e(MatchScData.ModuleId.mid_e_follow, m13779I0(false), vqg.m15519i(photoAlbumBottomView.f2562P, m13780J0(photoAlbumBottomView.f2555K)));
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final String m13777G0() {
        if (NullChecker.a(this.f12425b0.localFollowship)) {
            FollowshipStatus followshipStatus = this.f12425b0.localFollowship.state;
            if (TEnum.equals(followshipStatus, FollowshipStatus.following) || TEnum.equals(followshipStatus, "matched")) {
                return this.f12426c0.act().getResources().getString(R$string.f485b);
            }
        }
        return FeedModule.f313a.getResources().getString(R$string.f427R2);
    }

    /* JADX INFO: renamed from: H0 */
    public final String m13778H0(boolean z) {
        return z ? MatchScData.ModuleId.mid_e_follow : "e_cancelfollow";
    }

    /* JADX INFO: renamed from: I0 */
    public final String m13779I0(boolean z) {
        String strM10224d;
        if (!z && "from_discover_discussion".equals(this.f12426c0.f2562P)) {
            strM10224d = "p_discover_discussion";
        } else if (!z && "from_discover_dating".equals(this.f12426c0.f2562P)) {
            strM10224d = "p_discover_dating";
        } else if (z || !"from_activity_tab_one".equals(this.f12426c0.f2562P)) {
            strM10224d = (z || !"from_activity_tab_two".equals(this.f12426c0.f2562P)) ? "" : fm20.m10224d("from_activity_tab_two");
        } else {
            strM10224d = fm20.m10224d("from_activity_tab_one");
        }
        if ("from_group_detail_recommend".equals(this.f12426c0.f2562P) || "from_group_detail_new".equals(this.f12426c0.f2562P)) {
            strM10224d = "p_circle_detail";
        }
        return (TextUtils.isEmpty(strM10224d) && NullChecker.a(this.f12426c0.act())) ? this.f12426c0.act().pageId() : strM10224d;
    }

    /* JADX INFO: renamed from: J0 */
    public final j760[] m13780J0(Moment moment) {
        if (!NullChecker.a(moment)) {
            return new j760[0];
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new j760("owner_id", moment.owner));
        arrayList.add(new j760("liveId", moment.isLive ? moment.live.f228id : ""));
        arrayList.add(new j760("moment_id", moment.isLive ? "" : ((DbObject) moment).id));
        arrayList.add(new j760("moment_type", moment.isLive ? "live" : zi60.m17436w().m17467y(moment)));
        arrayList.add(new j760("receiver_user_id", moment.owner));
        return (j760[]) arrayList.toArray(new j760[0]);
    }

    /* JADX INFO: renamed from: K0 */
    public final boolean m13781K0(String str) {
        return "topic_recommend".equals(str) || "qa_recommend".equals(str) || "from_group_detail_recommend".equals(str) || "from_group_detail_new".equals(str);
    }

    /* JADX INFO: renamed from: M0 */
    public final boolean m13782M0() {
        ab70.C2321a c2321a = ab70.m8476a().m8477b().get(this.f12426c0.f2562P);
        return (!NullChecker.a(c2321a) || !c2321a.f5692a || m13781K0(this.f12426c0.f2562P) || this.f12426c0.f2555K.owner.equals(FeedModule.m1139F().userId()) || (NullChecker.a(this.f12425b0.localRelationship) && TEnum.equals(this.f12425b0.localRelationship.state, "matched"))) ? false : true;
    }

    @Override // p007l.zy60, p007l.AbstractC2520v4
    /* JADX INFO: renamed from: N */
    public void mo13783N(boolean z) {
        this.f12428e0 = z;
    }

    /* JADX INFO: renamed from: N0 */
    public boolean m13784N0(boolean z) {
        return (!nkg.m12263s() || ((!"from_discover_discussion".equals(this.f12426c0.f2562P) || fm20.m10218H()) && ((!"from_discover_dating".equals(this.f12426c0.f2562P) || fm20.m10215E()) && ((!"from_activity_tab_one".equals(this.f12426c0.f2562P) || fm20.m10215E()) && (!"from_activity_tab_two".equals(this.f12426c0.f2562P) || fm20.m10215E()))))) && nkg.m12263s() && z && ((Boolean) sti.f13077c.get()).booleanValue() && !vqg.m15530n0(this.f12425b0) && fm20.m10213C(this.f12426c0.f2562P);
    }

    /* JADX INFO: renamed from: O0 */
    public boolean m13785O0() {
        if (nkg.m12263s() && ((!"from_discover_discussion".equals(this.f12426c0.f2562P) || fm20.m10218H()) && ((!"from_discover_dating".equals(this.f12426c0.f2562P) || fm20.m10215E()) && ((!"from_activity_tab_one".equals(this.f12426c0.f2562P) || fm20.m10215E()) && "from_activity_tab_two".equals(this.f12426c0.f2562P))))) {
            fm20.m10215E();
        }
        return false;
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m13786P0(String str, final boolean z) {
        FeedModule.f316d.m16683m7(FeedModule.m1139F().userId(), this.f12425b0, false, str).subscribe(mkd0.H(new e30() { // from class: l.fz60
            public final void call(Object obj) {
                qz60.m13761o0(z, (Followship) obj);
            }
        }, new e30() { // from class: l.gz60
            public final void call(Object obj) {
                qz60.m13760n0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m13787Q0(FollowshipStatus followshipStatus) {
        m13791U0(followshipStatus, false);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m13788R0(final PhotoAlbumBottomView photoAlbumBottomView, View view) {
        User user = this.f12425b0;
        if (user == null) {
            lsi0.j("user is null error!");
            return;
        }
        final FollowshipStatus followshipStatus = NullChecker.a(user.localFollowship) ? this.f12425b0.localFollowship.state : null;
        Moment moment = photoAlbumBottomView.f2555K;
        v9j v9jVar = new v9j() { // from class: l.jz60
            public final Object call() {
                return this.f9555a.m13777G0();
            }
        };
        kz60 kz60Var = new kz60(this);
        d30 d30Var = new d30() { // from class: l.lz60
            public final void call() {
                this.f10166a.m13787Q0(followshipStatus);
            }
        };
        hx60 controller = photoAlbumBottomView.getController();
        Objects.requireNonNull(controller);
        vwi.m15604S(moment, v9jVar, kz60Var, d30Var, new ic00(controller), photoAlbumBottomView.getController().mo10741m(photoAlbumBottomView.f2555K.owner), photoAlbumBottomView.act(), photoAlbumBottomView.f2562P, false, new d30() { // from class: l.mz60
            public final void call() {
                qz60.m13756j0(photoAlbumBottomView);
            }
        });
        m13776F0(photoAlbumBottomView);
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m13789S0(View view) {
        boolean z = xdl0.O0(this.f15918N) && TextUtils.equals(this.f15920P.getText().toString(), "通过动态打招呼，更容易得到回复");
        if (TextUtils.equals(this.f15913I.getText().toString(), this.f12426c0.act().getString(R$string.f419Q0)) || TextUtils.equals(this.f15913I.getText().toString(), "抢先告白")) {
            zi60.m17436w().m17462s(this.f12426c0.f2555K, m13779I0(false), true, z);
            FeedModule.f315c.m1650f3(this.f12426c0.act(), this.f12425b0, this.f12426c0.f2555K, m13779I0(false), this.f12426c0.f2565S);
        } else {
            zi60.m17436w().m17462s(this.f12426c0.f2555K, m13779I0(false), false, z);
            if (NullChecker.a(this.f12425b0)) {
                this.f12426c0.act().startActivity(kjb0.m11451c(this.f12426c0.act(), ((DbObject) this.f12425b0).id, false, false));
            }
        }
    }

    /* JADX INFO: renamed from: T0 */
    public boolean m13790T0() {
        return !this.f12426c0.f2555K.isLive;
    }

    /* JADX INFO: renamed from: U0 */
    public final void m13791U0(FollowshipStatus followshipStatus, final boolean z) {
        if (NullChecker.a(followshipStatus) && (TEnum.equals(followshipStatus, FollowshipStatus.following) || TEnum.equals(followshipStatus, "matched"))) {
            final String strM13775E0 = m13775E0(z, false);
            v1h.m15267v0(this.f12426c0.act(), FeedModule.f313a.getResources().getString(R$string.f644z), new d30() { // from class: l.cz60
                public final void call() {
                    this.f6751a.m13786P0(strM13775E0, z);
                }
            });
            return;
        }
        String strM13775E1 = m13775E0(z, true);
        User user = this.f12425b0;
        if (user.profile.moments.hidePublicMoments && !User.isMatched(user)) {
            lsi0.w(R$string.f590q);
            return;
        }
        xia xiaVar = FeedModule.f316d;
        String strUserId = FeedModule.m1139F().userId();
        User user2 = this.f12425b0;
        Moment moment = this.f12426c0.f2555K;
        boolean z2 = moment.isLive;
        xiaVar.m16690n7(strUserId, user2, true, z2 ? "liveMomentNearby" : "", z2 ? moment.live.f228id : "", strM13775E1).subscribe(mkd0.H(new e30() { // from class: l.dz60
            public final void call(Object obj) {
                qz60.m13759m0(z, (Followship) obj);
            }
        }, new e30() { // from class: l.ez60
            public final void call(Object obj) {
                qz60.m13758l0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V0 */
    public boolean m13792V0(String str) {
        return TextUtils.equals(str, "from_discover_dating") || TextUtils.equals(str, "from_nearby_focus") || TextUtils.equals(str, "from_like");
    }

    /* JADX INFO: renamed from: W0 */
    public void m13793W0() {
        vqg.m15478G0(this.f15911G, new View.OnClickListener() { // from class: l.nz60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10944a.m13789S0(view);
            }
        });
    }

    @Override // p007l.zy60, p007l.zll
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public boolean mo13795b(final PhotoAlbumBottomView photoAlbumBottomView) {
        boolean zMo13795b = super.mo13795b(photoAlbumBottomView);
        m17583U(this.f15916L, (vqg.m15498V(photoAlbumBottomView.f2555K) || photoAlbumBottomView.f2555K.isLive) ? false : true);
        if (u2h.m14721f() && NullChecker.a(photoAlbumBottomView.f2555K) && !TextUtils.equals(photoAlbumBottomView.f2555K.owner, FeedModule.m1139F().userId()) && (TextUtils.equals(photoAlbumBottomView.f2562P, "from_discover_dating") || TextUtils.equals(photoAlbumBottomView.f2562P, "from_nearby_falls_feed") || TextUtils.equals(photoAlbumBottomView.f2562P, "from_album") || TextUtils.equals(photoAlbumBottomView.f2562P, "from_discover_discussion") || TextUtils.equals(photoAlbumBottomView.f2562P, "from_nearby_focus") || TextUtils.equals(photoAlbumBottomView.f2562P, "from_like") || TextUtils.equals(photoAlbumBottomView.f2562P, "from_activity_tab_one") || TextUtils.equals(photoAlbumBottomView.f2562P, "from_activity_tab_two"))) {
            this.f15916L.setImageResource(f3c0.f7732W4);
        }
        this.f15916L.setOnClickListener(new View.OnClickListener() { // from class: l.iz60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9164a.m13788R0(photoAlbumBottomView, view);
            }
        });
        return zMo13795b;
    }

    @Override // p007l.zy60, p007l.zll
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public boolean mo13794a(final PhotoAlbumBottomView photoAlbumBottomView) {
        this.f12426c0 = photoAlbumBottomView;
        boolean zMo13794a = super.mo13794a(photoAlbumBottomView);
        this.f15935g.removeAllViews();
        View viewM13771A0 = m13771A0(photoAlbumBottomView);
        this.f12423Z = viewM13771A0;
        if (viewM13771A0 == null && ((!nkg.m12254n0() || !photoAlbumBottomView.f2555K.shareMyVote) && !photoAlbumBottomView.f2554J0)) {
            m13772B0(photoAlbumBottomView);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f15935g.getLayoutParams();
            if (marginLayoutParams.bottomMargin != 0) {
                marginLayoutParams.bottomMargin = 0;
                this.f15935g.setLayoutParams(marginLayoutParams);
            }
        }
        User user = this.f12425b0;
        if (user == null || !vqg.m15530n0(user)) {
            this.f12424a0 = m13801z0(photoAlbumBottomView);
        }
        if (NullChecker.a(this.f12424a0)) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f15935g.getLayoutParams();
            if (marginLayoutParams2.bottomMargin == 0) {
                marginLayoutParams2.bottomMargin = -t100.g;
                this.f15935g.setLayoutParams(marginLayoutParams2);
            }
        } else if (NullChecker.a(this.f12423Z)) {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.f15935g.getLayoutParams();
            if (marginLayoutParams3.bottomMargin == 0) {
                marginLayoutParams3.bottomMargin = -t100.h;
                this.f15935g.setLayoutParams(marginLayoutParams3);
            }
        }
        User userMo10741m = photoAlbumBottomView.getController().mo10741m(photoAlbumBottomView.f2555K.owner);
        this.f12425b0 = userMo10741m;
        m13773C0(NullChecker.a(userMo10741m) && vqg.m15497U(FeedModule.m1140H().Zj(((DbObject) this.f12425b0).id)));
        this.f15909E.setImageTintList(null);
        this.f15954z.setImageTintList(null);
        this.f15912H.setImageTintList(null);
        this.f15916L.setImageTintList(null);
        m13774D0(photoAlbumBottomView.f2555K);
        boolean zM4478p0 = photoAlbumBottomView.m4478p0();
        ConstraintLayout constraintLayout = this.f15918N;
        if (zM4478p0) {
            xdl0.M(constraintLayout, false);
            if (NullChecker.a(photoAlbumBottomView.f2551I)) {
                PutongFrag putongFrag = photoAlbumBottomView.f2551I;
                if (putongFrag instanceof PhotoAlbumFeedBaseFrag) {
                    PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFrag = (PhotoAlbumFeedBaseFrag) putongFrag;
                    if (NullChecker.a(photoAlbumFeedBaseFrag.f2916D) && NullChecker.a(photoAlbumBottomView.f2555K) && photoAlbumFeedBaseFrag.f2916D.containsKey(((DbObject) photoAlbumBottomView.f2555K).id)) {
                        xdl0.M(this.f15918N, photoAlbumFeedBaseFrag.f2916D.get(((DbObject) photoAlbumBottomView.f2555K).id).booleanValue());
                    }
                }
            }
            qib0.G.Q0(this.f15919O, FeedModule.m1140H().me_().m1042fp().profileSmall());
            this.f15920P.setOnClickListener(new View.OnClickListener() { // from class: l.bz60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    qz60.m13757k0(photoAlbumBottomView, view);
                }
            });
            xdl0.E0(this.f15921Q, new View.OnClickListener() { // from class: l.hz60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    qz60.m13764r0(photoAlbumBottomView, view);
                }
            });
        } else {
            xdl0.M(constraintLayout, false);
        }
        if (nkg.m12213K() && m13792V0(photoAlbumBottomView.f2562P)) {
            xdl0.M(this.f15931c, photoAlbumBottomView.f2555K.showGreetView);
            if (photoAlbumBottomView.f2555K.showGreetView) {
                if (TextUtils.isEmpty(this.f15933e.getText().toString())) {
                    this.f15933e.setText(vqg.m15549x());
                }
                vs0.m15567e(photoAlbumBottomView.f2555K, this.f15932d, FeedModule.m1140H().me_());
            }
        }
        return zMo13794a;
    }

    @Override // p007l.zy60
    /* JADX INFO: renamed from: g0 */
    public void mo13798g0(PhotoAlbumBottomView photoAlbumBottomView) {
        super.mo13798g0(photoAlbumBottomView);
    }

    @Override // p007l.zy60, p007l.AbstractC2520v4
    /* JADX INFO: renamed from: o */
    public View mo13799o() {
        return this.f15914J;
    }

    /* JADX INFO: renamed from: y0 */
    public final void m13800y0() {
        if (this.f12427d0 == null) {
            this.f12427d0 = new FeedInteractiveView(this.f15935g.getContext());
        }
        FeedInteractiveView feedInteractiveView = this.f12427d0;
        Act act = this.f12426c0.act();
        PhotoAlbumBottomView photoAlbumBottomView = this.f12426c0;
        Moment moment = photoAlbumBottomView.f2555K;
        String str = photoAlbumBottomView.f2562P;
        feedInteractiveView.m5664P(act, moment, str, vqg.m15485K(str, photoAlbumBottomView.f2564R), false, t100.j);
        if (this.f12427d0.getChildCount() > 0) {
            this.f15935g.addView(this.f12427d0);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public View m13801z0(PhotoAlbumBottomView photoAlbumBottomView) {
        hx60 hx60Var;
        if (!photoAlbumBottomView.m4457Z1(photoAlbumBottomView.f2562P)) {
            return null;
        }
        if ((yih.m17138l().m17143i() || photoAlbumBottomView.f2555K.attitudes.count > 0) && (hx60Var = photoAlbumBottomView.f2566T) != null && hx60Var.m10743p()) {
            return new bqg.C2345a(photoAlbumBottomView.act(), this.f15935g).m9021k(photoAlbumBottomView.f2566T).m9019i(photoAlbumBottomView.f2555K).m9020j(vqg.m15485K(photoAlbumBottomView.f2562P, photoAlbumBottomView.f2564R)).m9017g();
        }
        return null;
    }
}
