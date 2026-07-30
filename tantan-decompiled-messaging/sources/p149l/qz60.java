package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.FollowshipStatus;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.PartialIdList;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.GroupIdBox;
import com.p046p1.mobile.putong.feed.data.LiveCircleExtInfo;
import com.p046p1.mobile.putong.feed.data.LiveCircleExtTag;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentMessage;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumBottomView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumFeedBaseFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedbottom.insert.FeedInteractiveView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public class qz60 extends zy60 {

    /* JADX INFO: renamed from: f0 */
    public static final float f156996f0 = xdl0.m208412y0() * 0.6f;

    /* JADX INFO: renamed from: Z */
    public View f156998Z;

    /* JADX INFO: renamed from: a0 */
    public View f156999a0;

    /* JADX INFO: renamed from: b0 */
    public User f157000b0;

    /* JADX INFO: renamed from: c0 */
    public PhotoAlbumBottomView f157001c0;

    /* JADX INFO: renamed from: d0 */
    public FeedInteractiveView f157002d0;

    /* JADX INFO: renamed from: Y */
    public int f156997Y = 0;

    /* JADX INFO: renamed from: e0 */
    public boolean f157003e0 = false;

    /* JADX INFO: renamed from: L0 */
    public static boolean m177123L0(List<TopicMoment> list) {
        return list != null && list.size() > 0 && TextUtils.equals(list.get(0).topicType, "topic_group");
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m177124j0(PhotoAlbumBottomView photoAlbumBottomView) {
        FeedModule.f38855d.f193061p0.m132487l(photoAlbumBottomView.f41094K);
        photoAlbumBottomView.act().duringCreated(photoAlbumBottomView.f41105T.m133301B(photoAlbumBottomView.f41094K, vqg.m199515K(photoAlbumBottomView.f41101P, photoAlbumBottomView.f41103R))).subscribe(mkd0.m154956H(new e30() { // from class: l.oz60
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151595y("操作成功，将减少此类动态的推荐");
            }
        }, new e30() { // from class: l.pz60
            @Override // p149l.e30
            public final void call(Object obj) {
                qz60.m177136v0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m177125k0(PhotoAlbumBottomView photoAlbumBottomView, View view) {
        if (NullChecker.m81303a(photoAlbumBottomView.f41089H0) && NullChecker.m81303a(photoAlbumBottomView.f41094K)) {
            photoAlbumBottomView.f41089H0.call(new j760<>(photoAlbumBottomView.f41094K.f56011id, Boolean.FALSE));
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m177126l0(Throwable th) {
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m177127m0(boolean z, Followship followship) {
        if (z) {
            return;
        }
        lsi0.m151593w(R$string.f39028b3);
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m177128n0(Throwable th) {
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ void m177129o0(boolean z, Followship followship) {
        if (z) {
            return;
        }
        lsi0.m151593w(R$string.f38934M0);
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m177132r0(PhotoAlbumBottomView photoAlbumBottomView, View view) {
        zvf0.m220396r("e_emoji_comment", vqg.m199515K(photoAlbumBottomView.f41101P, false));
        if (NullChecker.m81303a(photoAlbumBottomView.f41089H0) && NullChecker.m81303a(photoAlbumBottomView.f41094K)) {
            photoAlbumBottomView.f41089H0.call(new j760<>(photoAlbumBottomView.f41094K.f56011id, Boolean.TRUE));
        }
    }

    /* JADX INFO: renamed from: v0 */
    public static /* synthetic */ void m177136v0(Throwable th) {
    }

    /* JADX INFO: renamed from: A0 */
    public View m177139A0(PhotoAlbumBottomView photoAlbumBottomView) {
        PartialIdList partialIdListM130720b;
        MomentMessage momentMessage;
        hx60 hx60Var = photoAlbumBottomView.f41105T;
        if (hx60Var == null || !hx60Var.m133308p() || (partialIdListM130720b = photoAlbumBottomView.f41105T.f109833b.m130720b(photoAlbumBottomView.f41094K.f56011id)) == null || vwb.m200296J(partialIdListM130720b.expouseIds) || (momentMessage = FeedModule.f38855d.f192990H0.get(partialIdListM130720b.expouseIds.get(0))) == null) {
            return null;
        }
        return new cqg.C16212a(photoAlbumBottomView.act(), momentMessage, this.f205645g).m108273l(photoAlbumBottomView.f41105T).m108271j(photoAlbumBottomView.f41094K).m108272k(vqg.m199515K(photoAlbumBottomView.f41101P, photoAlbumBottomView.f41103R)).m108270i(photoAlbumBottomView.f41101P).m108269h();
    }

    /* JADX INFO: renamed from: B0 */
    public View m177140B0(PhotoAlbumBottomView photoAlbumBottomView) {
        Moment moment;
        LiveCircleExtInfo liveCircleExtInfo;
        List<TopicMoment> topicList = photoAlbumBottomView.f41094K.getTopicList();
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m81303a(topicList)) {
            arrayList.addAll(topicList);
        }
        GroupIdBox groupIdBox = photoAlbumBottomView.f41094K.group;
        if (!TextUtils.isEmpty(groupIdBox.f39223id) && !m177123L0(arrayList) && vqg.m199569s(photoAlbumBottomView.f41101P)) {
            TopicMoment topicMoment = new TopicMoment();
            topicMoment.setEnterGroup(true);
            topicMoment.name = "来自" + groupIdBox.name + "圈子";
            topicMoment.f39247id = groupIdBox.f39223id;
            topicMoment.topicType = "topic_group";
            topicMoment.momentId = photoAlbumBottomView.f41094K.f56011id;
            arrayList.add(0, topicMoment);
        }
        if (TextUtils.equals(photoAlbumBottomView.f41101P, "from_live_square_tab")) {
            arrayList.clear();
        }
        if (TextUtils.equals(photoAlbumBottomView.f41101P, "from_live_square_tab") && (moment = photoAlbumBottomView.f41094K) != null && (liveCircleExtInfo = moment.liveCircleExtInfo) != null && !liveCircleExtInfo.tags.isEmpty()) {
            for (LiveCircleExtTag liveCircleExtTag : photoAlbumBottomView.f41094K.liveCircleExtInfo.tags) {
                TopicMoment topicMoment2 = new TopicMoment();
                topicMoment2.setEnterGroup(false);
                topicMoment2.name = liveCircleExtTag.tagName;
                topicMoment2.topicType = "live_square";
                topicMoment2.icon = liveCircleExtTag.tagUrl;
                arrayList.add(topicMoment2);
            }
        }
        View viewM113062h = new dqg.C16433a(photoAlbumBottomView.act(), arrayList, this.f205645g).m113064j(vqg.m199515K(photoAlbumBottomView.f41101P, photoAlbumBottomView.f41103R)).m113063i(photoAlbumBottomView.f41101P).m113062h();
        if (NullChecker.m81303a(viewM113062h) && NullChecker.m81303a(viewM113062h.getLayoutParams())) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewM113062h.getLayoutParams();
            xdl0.m208360X(viewM113062h, (nkg.m159845C0() && NullChecker.m81303a(photoAlbumBottomView.f41094K) && !vwb.m200296J(photoAlbumBottomView.f41094K.mediaRepeatIndexList)) ? marginLayoutParams.topMargin - t100.m186890d(4.0f) : marginLayoutParams.topMargin);
        }
        m177168y0();
        return viewM113062h;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ec  */
    /* JADX INFO: renamed from: C0 */
    public final void m177141C0(boolean z) {
        boolean zM177158T0;
        ImageView imageView;
        boolean z2 = true;
        if (!m177152N0(z)) {
            if (m177153O0()) {
                this.f205623I.setText(FeedModule.m60222H().mo30742a().mo165300I5() ? "抢先告白" : this.f157001c0.act().getString(R$string.f38958Q0));
                this.f205622H.setImageResource(f3c0.f94541i4);
                ViewGroup.LayoutParams layoutParams = this.f205621G.getLayoutParams();
                layoutParams.width = t100.m186890d(FeedModule.m60222H().mo30742a().mo165300I5() ? 83.0f : 78.0f);
                this.f205621G.setLayoutParams(layoutParams);
                if (!xdl0.m208349O0(this.f205621G)) {
                    xdl0.m208344M(this.f205621G, true);
                }
                s7i.m182488b(this.f205618D, this.f205621G, this.f205619E, this.f205620F);
                m177161W0();
            } else {
                xdl0.m208344M(this.f205621G, false);
                s7i.m182489c(this.f205618D, this.f205619E, this.f205620F);
            }
            s7i.m182490d(this.f205662x, this.f205618D, this.f205664z, this.f205617C, this.f205616B, this.f157001c0.f41101P);
            zM177158T0 = m177158T0();
            imageView = this.f205626L;
            if (zM177158T0) {
                s7i.m182491e(imageView);
            } else {
                s7i.m182496j(imageView);
            }
            if (FeedModule.m60222H().mo30742a().mo165300I5() || !z2) {
            }
            this.f205622H.setImageResource(f3c0.f94446W1);
            return;
        }
        if (!xdl0.m208349O0(this.f205621G)) {
            xdl0.m208344M(this.f205621G, true);
        }
        s7i.m182488b(this.f205618D, this.f205621G, this.f205619E, this.f205620F);
        m177161W0();
        this.f205623I.setText(this.f157001c0.act().getString(R$string.f39114n5));
        this.f205622H.setImageResource(f3c0.f94525g4);
        ViewGroup.LayoutParams layoutParams2 = this.f205621G.getLayoutParams();
        layoutParams2.width = t100.m186890d(64.0f);
        this.f205621G.setLayoutParams(layoutParams2);
        z2 = false;
        s7i.m182490d(this.f205662x, this.f205618D, this.f205664z, this.f205617C, this.f205616B, this.f157001c0.f41101P);
        zM177158T0 = m177158T0();
        imageView = this.f205626L;
        if (zM177158T0) {
            s7i.m182491e(imageView);
        } else {
            s7i.m182496j(imageView);
        }
        if (FeedModule.m60222H().mo30742a().mo165300I5()) {
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final void m177142D0(Moment moment) {
        if (!TextUtils.equals(this.f157001c0.f41101P, "from_live_square_tab") || moment == null || moment.liveCircleExtInfo == null) {
            return;
        }
        xdl0.m208344M(this.f205621G, true);
        int i = moment.liveCircleExtInfo.views;
        TextView textView = this.f205623I;
        if (i > 0) {
            textView.setText(i0g0.m133867h0(i));
        } else {
            textView.setText("1");
        }
        this.f205622H.setImageResource(f3c0.f94565l4);
        ViewGroup.LayoutParams layoutParams = this.f205621G.getLayoutParams();
        layoutParams.width = t100.m186890d(78.0f);
        this.f205621G.setLayoutParams(layoutParams);
        if (!xdl0.m208349O0(this.f205621G)) {
            xdl0.m208344M(this.f205621G, true);
        }
        s7i.m182488b(this.f205618D, this.f205621G, this.f205619E, this.f205620F);
    }

    /* JADX INFO: renamed from: E0 */
    public String m177143E0(boolean z, boolean z2) {
        String strM177147I0 = m177147I0(z);
        String strM177146H0 = m177146H0(z2);
        PhotoAlbumBottomView photoAlbumBottomView = this.f157001c0;
        p6j0.m167669c(strM177146H0, strM177147I0, vqg.m199549i(photoAlbumBottomView.f41101P, m177148J0(photoAlbumBottomView.f41094K)));
        return strM177147I0;
    }

    /* JADX INFO: renamed from: F0 */
    public void m177144F0(PhotoAlbumBottomView photoAlbumBottomView) {
        if (vwi.m200390U(photoAlbumBottomView.f41094K, new kz60(this), photoAlbumBottomView.f41101P) && m177145G0().equals(FeedModule.f38852a.getResources().getString(R$string.f38966R2))) {
            p6j0.m167671e(MatchScData.ModuleId.mid_e_follow, m177147I0(false), vqg.m199549i(photoAlbumBottomView.f41101P, m177148J0(photoAlbumBottomView.f41094K)));
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final String m177145G0() {
        if (NullChecker.m81303a(this.f157000b0.localFollowship)) {
            FollowshipStatus followshipStatus = this.f157000b0.localFollowship.state;
            if (TEnum.equals(followshipStatus, FollowshipStatus.following) || TEnum.equals(followshipStatus, "matched")) {
                return this.f157001c0.act().getResources().getString(R$string.f39024b);
            }
        }
        return FeedModule.f38852a.getResources().getString(R$string.f38966R2);
    }

    /* JADX INFO: renamed from: H0 */
    public final String m177146H0(boolean z) {
        return z ? MatchScData.ModuleId.mid_e_follow : "e_cancelfollow";
    }

    /* JADX INFO: renamed from: I0 */
    public final String m177147I0(boolean z) {
        String strM122121d;
        if (!z && "from_discover_discussion".equals(this.f157001c0.f41101P)) {
            strM122121d = "p_discover_discussion";
        } else if (!z && "from_discover_dating".equals(this.f157001c0.f41101P)) {
            strM122121d = "p_discover_dating";
        } else if (z || !"from_activity_tab_one".equals(this.f157001c0.f41101P)) {
            strM122121d = (z || !"from_activity_tab_two".equals(this.f157001c0.f41101P)) ? "" : fm20.m122121d("from_activity_tab_two");
        } else {
            strM122121d = fm20.m122121d("from_activity_tab_one");
        }
        if ("from_group_detail_recommend".equals(this.f157001c0.f41101P) || "from_group_detail_new".equals(this.f157001c0.f41101P)) {
            strM122121d = "p_circle_detail";
        }
        return (TextUtils.isEmpty(strM122121d) && NullChecker.m81303a(this.f157001c0.act())) ? this.f157001c0.act().pageId() : strM122121d;
    }

    /* JADX INFO: renamed from: J0 */
    public final j760[] m177148J0(Moment moment) {
        if (!NullChecker.m81303a(moment)) {
            return new j760[0];
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new j760("owner_id", moment.owner));
        arrayList.add(new j760("liveId", moment.isLive ? moment.live.f38767id : ""));
        arrayList.add(new j760("moment_id", moment.isLive ? "" : moment.f56011id));
        arrayList.add(new j760("moment_type", moment.isLive ? "live" : zi60.m218961w().m218992y(moment)));
        arrayList.add(new j760("receiver_user_id", moment.owner));
        return (j760[]) arrayList.toArray(new j760[0]);
    }

    /* JADX INFO: renamed from: K0 */
    public final boolean m177149K0(String str) {
        return "topic_recommend".equals(str) || "qa_recommend".equals(str) || "from_group_detail_recommend".equals(str) || "from_group_detail_new".equals(str);
    }

    /* JADX INFO: renamed from: M0 */
    public final boolean m177150M0() {
        ab70.C15567a c15567a = ab70.m95586a().m95587b().get(this.f157001c0.f41101P);
        return (!NullChecker.m81303a(c15567a) || !c15567a.f68629a || m177149K0(this.f157001c0.f41101P) || this.f157001c0.f41094K.owner.equals(FeedModule.m60221F().userId()) || (NullChecker.m81303a(this.f157000b0.localRelationship) && TEnum.equals(this.f157000b0.localRelationship.state, "matched"))) ? false : true;
    }

    @Override // p149l.zy60, p149l.AbstractC20577v4
    /* JADX INFO: renamed from: N */
    public void mo177151N(boolean z) {
        this.f157003e0 = z;
    }

    /* JADX INFO: renamed from: N0 */
    public boolean m177152N0(boolean z) {
        return (!nkg.m159904s() || ((!"from_discover_discussion".equals(this.f157001c0.f41101P) || fm20.m122115H()) && ((!"from_discover_dating".equals(this.f157001c0.f41101P) || fm20.m122112E()) && ((!"from_activity_tab_one".equals(this.f157001c0.f41101P) || fm20.m122112E()) && (!"from_activity_tab_two".equals(this.f157001c0.f41101P) || fm20.m122112E()))))) && nkg.m159904s() && z && sti.f166359c.get().booleanValue() && !vqg.m199560n0(this.f157000b0) && fm20.m122110C(this.f157001c0.f41101P);
    }

    /* JADX INFO: renamed from: O0 */
    public boolean m177153O0() {
        if (nkg.m159904s() && ((!"from_discover_discussion".equals(this.f157001c0.f41101P) || fm20.m122115H()) && ((!"from_discover_dating".equals(this.f157001c0.f41101P) || fm20.m122112E()) && ((!"from_activity_tab_one".equals(this.f157001c0.f41101P) || fm20.m122112E()) && "from_activity_tab_two".equals(this.f157001c0.f41101P))))) {
            fm20.m122112E();
        }
        return false;
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m177154P0(String str, final boolean z) {
        FeedModule.f38855d.m209502m7(FeedModule.m60221F().userId(), this.f157000b0, false, str).subscribe(mkd0.m154956H(new e30() { // from class: l.fz60
            @Override // p149l.e30
            public final void call(Object obj) {
                qz60.m177129o0(z, (Followship) obj);
            }
        }, new e30() { // from class: l.gz60
            @Override // p149l.e30
            public final void call(Object obj) {
                qz60.m177128n0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m177155Q0(FollowshipStatus followshipStatus) {
        m177159U0(followshipStatus, false);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m177156R0(final PhotoAlbumBottomView photoAlbumBottomView, View view) {
        User user = this.f157000b0;
        if (user == null) {
            lsi0.m151580j("user is null error!");
            return;
        }
        final FollowshipStatus followshipStatus = NullChecker.m81303a(user.localFollowship) ? this.f157000b0.localFollowship.state : null;
        Moment moment = photoAlbumBottomView.f41094K;
        v9j v9jVar = new v9j() { // from class: l.jz60
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f120352a.m177145G0();
            }
        };
        kz60 kz60Var = new kz60(this);
        d30 d30Var = new d30() { // from class: l.lz60
            @Override // p149l.d30
            public final void call() {
                this.f130635a.m177155Q0(followshipStatus);
            }
        };
        hx60 controller = photoAlbumBottomView.getController();
        Objects.requireNonNull(controller);
        vwi.m200388S(moment, v9jVar, kz60Var, d30Var, new ic00(controller), photoAlbumBottomView.getController().mo133306m(photoAlbumBottomView.f41094K.owner), photoAlbumBottomView.act(), photoAlbumBottomView.f41101P, false, new d30() { // from class: l.mz60
            @Override // p149l.d30
            public final void call() {
                qz60.m177124j0(photoAlbumBottomView);
            }
        });
        m177144F0(photoAlbumBottomView);
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m177157S0(View view) {
        boolean z = xdl0.m208349O0(this.f205628N) && TextUtils.equals(this.f205630P.getText().toString(), "通过动态打招呼，更容易得到回复");
        if (TextUtils.equals(this.f205623I.getText().toString(), this.f157001c0.act().getString(R$string.f38958Q0)) || TextUtils.equals(this.f205623I.getText().toString(), "抢先告白")) {
            zi60.m218961w().m218987s(this.f157001c0.f41094K, m177147I0(false), true, z);
            FeedModule.f38854c.m60724f3(this.f157001c0.act(), this.f157000b0, this.f157001c0.f41094K, m177147I0(false), this.f157001c0.f41104S);
        } else {
            zi60.m218961w().m218987s(this.f157001c0.f41094K, m177147I0(false), false, z);
            if (NullChecker.m81303a(this.f157000b0)) {
                this.f157001c0.act().startActivity(kjb0.m146192c(this.f157001c0.act(), this.f157000b0.f56011id, false, false));
            }
        }
    }

    /* JADX INFO: renamed from: T0 */
    public boolean m177158T0() {
        return !this.f157001c0.f41094K.isLive;
    }

    /* JADX INFO: renamed from: U0 */
    public final void m177159U0(FollowshipStatus followshipStatus, final boolean z) {
        if (NullChecker.m81303a(followshipStatus) && (TEnum.equals(followshipStatus, FollowshipStatus.following) || TEnum.equals(followshipStatus, "matched"))) {
            final String strM177143E0 = m177143E0(z, false);
            v1h.m196628v0(this.f157001c0.act(), FeedModule.f38852a.getResources().getString(R$string.f39183z), new d30() { // from class: l.cz60
                @Override // p149l.d30
                public final void call() {
                    this.f83061a.m177154P0(strM177143E0, z);
                }
            });
            return;
        }
        String strM177143E1 = m177143E0(z, true);
        User user = this.f157000b0;
        if (user.profile.moments.hidePublicMoments && !User.isMatched(user)) {
            lsi0.m151593w(R$string.f39129q);
            return;
        }
        xia xiaVar = FeedModule.f38855d;
        String strUserId = FeedModule.m60221F().userId();
        User user2 = this.f157000b0;
        Moment moment = this.f157001c0.f41094K;
        boolean z2 = moment.isLive;
        xiaVar.m209509n7(strUserId, user2, true, z2 ? "liveMomentNearby" : "", z2 ? moment.live.f38767id : "", strM177143E1).subscribe(mkd0.m154956H(new e30() { // from class: l.dz60
            @Override // p149l.e30
            public final void call(Object obj) {
                qz60.m177127m0(z, (Followship) obj);
            }
        }, new e30() { // from class: l.ez60
            @Override // p149l.e30
            public final void call(Object obj) {
                qz60.m177126l0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V0 */
    public boolean m177160V0(String str) {
        return TextUtils.equals(str, "from_discover_dating") || TextUtils.equals(str, "from_nearby_focus") || TextUtils.equals(str, "from_like");
    }

    /* JADX INFO: renamed from: W0 */
    public void m177161W0() {
        vqg.m199508G0(this.f205621G, new View.OnClickListener() { // from class: l.nz60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f141188a.m177157S0(view);
            }
        });
    }

    @Override // p149l.zy60, p149l.zll
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public boolean mo177163b(final PhotoAlbumBottomView photoAlbumBottomView) {
        boolean zMo177163b = super.mo177163b(photoAlbumBottomView);
        m220898U(this.f205626L, (vqg.m199528V(photoAlbumBottomView.f41094K) || photoAlbumBottomView.f41094K.isLive) ? false : true);
        if (u2h.m191497f() && NullChecker.m81303a(photoAlbumBottomView.f41094K) && !TextUtils.equals(photoAlbumBottomView.f41094K.owner, FeedModule.m60221F().userId()) && (TextUtils.equals(photoAlbumBottomView.f41101P, "from_discover_dating") || TextUtils.equals(photoAlbumBottomView.f41101P, "from_nearby_falls_feed") || TextUtils.equals(photoAlbumBottomView.f41101P, "from_album") || TextUtils.equals(photoAlbumBottomView.f41101P, "from_discover_discussion") || TextUtils.equals(photoAlbumBottomView.f41101P, "from_nearby_focus") || TextUtils.equals(photoAlbumBottomView.f41101P, "from_like") || TextUtils.equals(photoAlbumBottomView.f41101P, "from_activity_tab_one") || TextUtils.equals(photoAlbumBottomView.f41101P, "from_activity_tab_two"))) {
            this.f205626L.setImageResource(f3c0.f94449W4);
        }
        this.f205626L.setOnClickListener(new View.OnClickListener() { // from class: l.iz60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f115532a.m177156R0(photoAlbumBottomView, view);
            }
        });
        return zMo177163b;
    }

    @Override // p149l.zy60, p149l.zll
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public boolean mo177162a(final PhotoAlbumBottomView photoAlbumBottomView) {
        this.f157001c0 = photoAlbumBottomView;
        boolean zMo177162a = super.mo177162a(photoAlbumBottomView);
        this.f205645g.removeAllViews();
        View viewM177139A0 = m177139A0(photoAlbumBottomView);
        this.f156998Z = viewM177139A0;
        if (viewM177139A0 == null && ((!nkg.m159895n0() || !photoAlbumBottomView.f41094K.shareMyVote) && !photoAlbumBottomView.f41093J0)) {
            m177140B0(photoAlbumBottomView);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f205645g.getLayoutParams();
            if (marginLayoutParams.bottomMargin != 0) {
                marginLayoutParams.bottomMargin = 0;
                this.f205645g.setLayoutParams(marginLayoutParams);
            }
        }
        User user = this.f157000b0;
        if (user == null || !vqg.m199560n0(user)) {
            this.f156999a0 = m177169z0(photoAlbumBottomView);
        }
        if (NullChecker.m81303a(this.f156999a0)) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f205645g.getLayoutParams();
            if (marginLayoutParams2.bottomMargin == 0) {
                marginLayoutParams2.bottomMargin = -t100.f167258g;
                this.f205645g.setLayoutParams(marginLayoutParams2);
            }
        } else if (NullChecker.m81303a(this.f156998Z)) {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.f205645g.getLayoutParams();
            if (marginLayoutParams3.bottomMargin == 0) {
                marginLayoutParams3.bottomMargin = -t100.f167259h;
                this.f205645g.setLayoutParams(marginLayoutParams3);
            }
        }
        User userMo133306m = photoAlbumBottomView.getController().mo133306m(photoAlbumBottomView.f41094K.owner);
        this.f157000b0 = userMo133306m;
        m177141C0(NullChecker.m81303a(userMo133306m) && vqg.m199527U(FeedModule.m60222H().mo30741Zj(this.f157000b0.f56011id)));
        this.f205619E.setImageTintList(null);
        this.f205664z.setImageTintList(null);
        this.f205622H.setImageTintList(null);
        this.f205626L.setImageTintList(null);
        m177142D0(photoAlbumBottomView.f41094K);
        boolean zM63461p0 = photoAlbumBottomView.m63461p0();
        ConstraintLayout constraintLayout = this.f205628N;
        if (zM63461p0) {
            xdl0.m208344M(constraintLayout, false);
            if (NullChecker.m81303a(photoAlbumBottomView.f41090I)) {
                PutongFrag putongFrag = photoAlbumBottomView.f41090I;
                if (putongFrag instanceof PhotoAlbumFeedBaseFrag) {
                    PhotoAlbumFeedBaseFrag photoAlbumFeedBaseFrag = (PhotoAlbumFeedBaseFrag) putongFrag;
                    if (NullChecker.m81303a(photoAlbumFeedBaseFrag.f41455D) && NullChecker.m81303a(photoAlbumBottomView.f41094K) && photoAlbumFeedBaseFrag.f41455D.containsKey(photoAlbumBottomView.f41094K.f56011id)) {
                        xdl0.m208344M(this.f205628N, photoAlbumFeedBaseFrag.f41455D.get(photoAlbumBottomView.f41094K.f56011id).booleanValue());
                    }
                }
            }
            qib0.f154691G.m102341Q0(this.f205629O, FeedModule.m60222H().me_().m60124fp().profileSmall());
            this.f205630P.setOnClickListener(new View.OnClickListener() { // from class: l.bz60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    qz60.m177125k0(photoAlbumBottomView, view);
                }
            });
            xdl0.m208329E0(this.f205631Q, new View.OnClickListener() { // from class: l.hz60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    qz60.m177132r0(photoAlbumBottomView, view);
                }
            });
        } else {
            xdl0.m208344M(constraintLayout, false);
        }
        if (nkg.m159854K() && m177160V0(photoAlbumBottomView.f41101P)) {
            xdl0.m208344M(this.f205641c, photoAlbumBottomView.f41094K.showGreetView);
            if (photoAlbumBottomView.f41094K.showGreetView) {
                if (TextUtils.isEmpty(this.f205643e.getText().toString())) {
                    this.f205643e.setText(vqg.m199579x());
                }
                vs0.m199799e(photoAlbumBottomView.f41094K, this.f205642d, FeedModule.m60222H().me_());
            }
        }
        return zMo177162a;
    }

    @Override // p149l.zy60
    /* JADX INFO: renamed from: g0 */
    public void mo177166g0(PhotoAlbumBottomView photoAlbumBottomView) {
        super.mo177166g0(photoAlbumBottomView);
    }

    @Override // p149l.zy60, p149l.AbstractC20577v4
    /* JADX INFO: renamed from: o */
    public View mo177167o() {
        return this.f205624J;
    }

    /* JADX INFO: renamed from: y0 */
    public final void m177168y0() {
        if (this.f157002d0 == null) {
            this.f157002d0 = new FeedInteractiveView(this.f205645g.getContext());
        }
        FeedInteractiveView feedInteractiveView = this.f157002d0;
        Act act = this.f157001c0.act();
        PhotoAlbumBottomView photoAlbumBottomView = this.f157001c0;
        Moment moment = photoAlbumBottomView.f41094K;
        String str = photoAlbumBottomView.f41101P;
        feedInteractiveView.m64570P(act, moment, str, vqg.m199515K(str, photoAlbumBottomView.f41103R), false, t100.f167261j);
        if (this.f157002d0.getChildCount() > 0) {
            this.f205645g.addView(this.f157002d0);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public View m177169z0(PhotoAlbumBottomView photoAlbumBottomView) {
        hx60 hx60Var;
        if (!photoAlbumBottomView.m63440Z1(photoAlbumBottomView.f41101P)) {
            return null;
        }
        if ((yih.m214909l().m214914i() || photoAlbumBottomView.f41094K.attitudes.count > 0) && (hx60Var = photoAlbumBottomView.f41105T) != null && hx60Var.m133308p()) {
            return new bqg.C15943a(photoAlbumBottomView.act(), this.f205645g).m103379k(photoAlbumBottomView.f41105T).m103377i(photoAlbumBottomView.f41094K).m103378j(vqg.m199515K(photoAlbumBottomView.f41101P, photoAlbumBottomView.f41103R)).m103375g();
        }
        return null;
    }
}
