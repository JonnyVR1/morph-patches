package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.p058ui.notifications.SysnotifListener;
import com.p051p1.mobile.putong.data.Channel;
import com.p051p1.mobile.putong.data.DetectCategoryType;
import com.p051p1.mobile.putong.data.FollowshipStatus;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.Music;
import com.p051p1.mobile.putong.data.StickerInfo;
import com.p051p1.mobile.putong.data.TopicMomentIdBox;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.CommentInfo;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentMessage;
import com.p051p1.mobile.putong.feed.data.RawFeed;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailFrag;
import com.tantanapp.common.utils.NullChecker;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes13.dex */
public class hj00 extends ar2<nk00> {

    /* JADX INFO: renamed from: K */
    public static byd0 f110108K = new byd0("change_greet_selection_box_last_time_" + FeedModule.m61405F().userId(), 0L);

    /* JADX INFO: renamed from: A */
    public String f110109A;

    /* JADX INFO: renamed from: B */
    public boolean f110110B;

    /* JADX INFO: renamed from: C */
    public boolean f110111C;

    /* JADX INFO: renamed from: D */
    public wyd0 f110112D;

    /* JADX INFO: renamed from: E */
    public byd0 f110113E;

    /* JADX INFO: renamed from: F */
    public vxd0 f110114F;

    /* JADX INFO: renamed from: G */
    public boolean f110115G;

    /* JADX INFO: renamed from: H */
    public List<String> f110116H;

    /* JADX INFO: renamed from: I */
    public StickerInfo f110117I;

    /* JADX INFO: renamed from: J */
    public boolean f110118J;

    /* JADX INFO: renamed from: a */
    public MomentDetailFrag f110119a;

    /* JADX INFO: renamed from: b */
    public Act f110120b;

    /* JADX INFO: renamed from: c */
    public List<y20<Boolean>> f110121c;

    /* JADX INFO: renamed from: d */
    public n570 f110122d;

    /* JADX INFO: renamed from: e */
    public Moment f110123e;

    /* JADX INFO: renamed from: f */
    public RawFeed f110124f;

    /* JADX INFO: renamed from: g */
    public List<MomentMessage> f110125g;

    /* JADX INFO: renamed from: h */
    public List<StickerInfo> f110126h;

    /* JADX INFO: renamed from: i */
    public Links f110127i;

    /* JADX INFO: renamed from: j */
    public String f110128j;

    /* JADX INFO: renamed from: k */
    public String f110129k;

    /* JADX INFO: renamed from: l */
    public MomentMessage f110130l;

    /* JADX INFO: renamed from: m */
    public String f110131m;

    /* JADX INFO: renamed from: n */
    public String f110132n;

    /* JADX INFO: renamed from: o */
    public String f110133o;

    /* JADX INFO: renamed from: p */
    public String f110134p;

    /* JADX INFO: renamed from: q */
    public boolean f110135q;

    /* JADX INFO: renamed from: r */
    public int f110136r;

    /* JADX INFO: renamed from: s */
    public boolean f110137s;

    /* JADX INFO: renamed from: t */
    public boolean f110138t;

    /* JADX INFO: renamed from: u */
    public boolean f110139u;

    /* JADX INFO: renamed from: v */
    public final String f110140v;

    /* JADX INFO: renamed from: w */
    public boolean f110141w;

    /* JADX INFO: renamed from: x */
    public boolean f110142x;

    /* JADX INFO: renamed from: y */
    public String f110143y;

    /* JADX INFO: renamed from: z */
    public boolean f110144z;

    public hj00(MomentDetailFrag momentDetailFrag) {
        super(momentDetailFrag);
        this.f110121c = new ArrayList();
        this.f110125g = new LinkedList();
        this.f110126h = new LinkedList();
        this.f110132n = "";
        this.f110136r = 0;
        this.f110138t = true;
        this.f110139u = false;
        this.f110112D = new wyd0("show_tips_moment_ids_" + FeedModule.m61405F().userId(), "");
        this.f110113E = new byd0("show_tips_last_time_" + FeedModule.m61405F().userId(), 0L);
        this.f110114F = new vxd0("show_tips_last_count_" + FeedModule.m61405F().userId(), 0);
        this.f110116H = new ArrayList();
        this.f110117I = null;
        this.f110118J = false;
        this.f110119a = momentDetailFrag;
        this.f110120b = momentDetailFrag.act();
        Bundle arguments = momentDetailFrag.getArguments();
        this.f110128j = arguments.getString("from");
        this.f110129k = arguments.getString("enterPage");
        this.f110133o = arguments.getString("momentId");
        this.f110138t = arguments.getBoolean("autoPlay", true);
        this.f110134p = arguments.getString("momentOwner");
        this.f110135q = arguments.getBoolean("isHideComment", false);
        this.f110136r = arguments.getInt("initMediaIndex", 0);
        this.f110141w = arguments.getBoolean("canGreeting", false);
        this.f110142x = momentDetailFrag.getArguments().getBoolean("start_home_card");
        this.f110140v = arguments.getString("momentValue");
        this.f110143y = arguments.getString("msg_id");
        this.f110144z = arguments.getBoolean("showInput", false);
        Serializable serializable = arguments.getSerializable("rawFeed");
        if (serializable instanceof RawFeed) {
            this.f110124f = (RawFeed) serializable;
        }
        this.f110109A = arguments.getString("clickedMsgId");
    }

    /* JADX INFO: renamed from: I1 */
    private List<MomentMessage> m135249I1(List<MomentMessage> list) {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f110123e.messages.ids) {
            MomentMessage momentMessage = (MomentMessage) jyb.m147529r(list, new qcj() { // from class: l.pi00
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(str.equals(((MomentMessage) obj).f56856id));
                }
            });
            if (NullChecker.m82486a(momentMessage)) {
                list.remove(momentMessage);
                arrayList.add(momentMessage);
            }
        }
        arrayList.addAll(list);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((MomentMessage) it.next()).isNewComment = false;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: J1 */
    private void m135250J1(Moment moment, Music music) {
        if (music == null || jyb.m147479J(moment.media) || !(moment.media.get(0) instanceof Video)) {
            return;
        }
        ((Video) moment.media.get(0)).music = music;
    }

    /* JADX INFO: renamed from: L0 */
    private String m135251L0() {
        String strM100007a = at0.m100007a(this.f110123e, this.f110122d.mo137270m(FeedModule.m61405F().userId()).name);
        User userMo137270m = this.f110122d.mo137270m(this.f110131m);
        List<String> listM134066g = h9i.m134066g(((nk00) this.viewModel).f142410p.getPaint(), m135291P0(), strM100007a, at0.m100007a(this.f110123e, userMo137270m == null ? "" : userMo137270m.name), new rcj() { // from class: l.ni00
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return this.f142083a.m135252N0((String) obj, (String) obj2);
            }
        });
        return m135252N0(listM134066g.get(0), listM134066g.get(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public String m135252N0(String str, String str2) {
        return str + this.f110119a.getString(R$string.f39869a3) + str2 + ": ";
    }

    /* JADX INFO: renamed from: Q0 */
    private void m135253Q0(final String str) {
        uqb0.f180394Z.m95960Q(str, "p_user_passive_show_nearby").subscribe(psd0.m173597H(new y20() { // from class: l.ui00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f179070a.m135295V0(str, (Boolean) obj);
            }
        }, new y20() { // from class: l.vi00
            @Override // p153l.y20
            public final void call(Object obj) {
                hj00.m135259f0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public /* synthetic */ void m135254W0(C4470c c4470c) {
        List<TopicMomentIdBox> list;
        if (c4470c != C4470c.f16267i) {
            if (c4470c == C4470c.f16271m) {
                this.f110121c = null;
            }
        } else if (((nk00) this.viewModel).m163567g0()) {
            pf60 pf60VarM172085a = pf60.m172085a("qa_optional", (NullChecker.m82486a(this.f110123e) && this.f110123e.shareMyVote) ? "1" : "0");
            Moment moment = this.f110123e;
            tfj0.m190942e("e_moment", "p_user_moment_interactions_details_view", pf60VarM172085a, pf60.m172085a("topic_id", (moment == null || (list = moment.topics) == null || list.size() == 0) ? "" : this.f110123e.topics.get(0).f39672id), pf60.m172085a("moment_id", this.f110133o), pf60.m172085a("owner_id", this.f110134p), pf60.m172085a("moment_distance", Long.valueOf(ksg.m151166G(this.f110123e))), pf60.m172085a("moment_create_time", Long.valueOf(ksg.m151164F(this.f110123e))), pf60.m172085a("owner_active_time", Long.valueOf(ksg.m151184S(FeedModule.f39703d.m145688e8(this.f110134p)))), pf60.m172085a("moment_type", er60.m122104w().m122135y(this.f110123e)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public /* synthetic */ void m135255X0(Boolean bool) {
        this.f110115G = bool.booleanValue();
        if (cmg.m111179G()) {
            ((nk00) this.viewModel).m163564e1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public /* synthetic */ void m135256Y0(Bundle bundle) {
        ((nk00) this.viewModel).m163561c0();
        ((nk00) this.viewModel).m163538P();
        this.f110122d.mo65702o();
        ((nk00) this.viewModel).m163554Y(this.f110122d);
        if (!TextUtils.isEmpty(this.f110143y) && !this.f110143y.equals("0")) {
            ((ib70) this.f110122d).m139297Q(this.f110143y);
        }
        if (cmg.m111180H() || cmg.m111179G()) {
            ksg.m151156B(this.f110120b, this.f110134p, new y20() { // from class: l.bj00
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f76951a.m135255X0((Boolean) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public /* synthetic */ void m135257a1() {
        ((nk00) this.viewModel).m163540Q();
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m135259f0(Throwable th) {
    }

    /* JADX INFO: renamed from: t1 */
    private void m135274t1(Moment moment) {
        ((nk00) this.viewModel).m163552W0(!TEnum.equals(moment.status(), "normal"));
        if (!moment.media.isEmpty() && moment.media.size() == 1 && (moment.media.get(0) instanceof Video) && this.f110138t) {
            this.f110138t = true;
        }
        new HashMap().put(moment.f56859id, Integer.valueOf(this.f110136r));
        ((nk00) this.viewModel).m163553X0(this.f110122d, this.f110128j);
    }

    /* JADX INFO: renamed from: B1 */
    public final void m135279B1(MomentMessage momentMessage, boolean z, Throwable th, String str) {
        String str2;
        boolean zIsChildComment = momentMessage.isChildComment();
        if (TEnum.equals(momentMessage.messageType, "sticker")) {
            str2 = "gif";
        } else {
            str2 = TEnum.equals(momentMessage.messageType, "picture") ? "picture" : "text";
        }
        tfj0.m190943f("e_comment_send", "p_user_moment_interactions_details_view", tfj0.C20302a.m190949g("moment_id", this.f110123e.f56859id), tfj0.C20302a.m190949g("owner_id", this.f110123e.owner), tfj0.C20302a.m190949g("comment_id", str), tfj0.C20302a.m190949g("comment_type", str2), tfj0.C20302a.m190949g("comment_user_id", FeedModule.m61405F().userId()), tfj0.C20302a.m190949g("comment_state", z ? "success" : "fail"), tfj0.C20302a.m190949g("comment_detail", zIsChildComment ? SysnotifListener.ACTION_REPLY : "comment"), th == null ? null : tfj0.C20302a.m190949g("error", th.toString()));
    }

    /* JADX INFO: renamed from: C1 */
    public void m135280C1(Act act, String str, String str2, String str3) {
        if (this.f110118J) {
            str = str + "【图片评论】";
        }
        FeedModule.m61406H().mo31733Vk(act, str, str2, str3, str2, Channel.get(Channel.comment_forward), new y20() { // from class: l.ri00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f163329a.m135307m1((Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D1 */
    public void m135281D1(String str) {
        if (this.f110116H.contains(str)) {
            return;
        }
        this.f110116H.add(str);
    }

    /* JADX INFO: renamed from: E1 */
    public String m135282E1(MomentMessage momentMessage, String str) {
        if (!NullChecker.m82486a(momentMessage)) {
            return act().getString(R$string.f39850X2);
        }
        this.f110130l = momentMessage;
        this.f110131m = momentMessage.owner;
        this.f110132n = str;
        return m135251L0();
    }

    /* JADX INFO: renamed from: F1 */
    public boolean m135283F1() {
        return f110108K.get().longValue() != 0 && p6i.m170903l(f110108K.get().longValue(), pzi0.m174454o());
    }

    /* JADX INFO: renamed from: G0 */
    public void m135284G0(y20<Boolean> y20Var) {
        this.f110121c.add(y20Var);
    }

    /* JADX INFO: renamed from: H0 */
    public boolean m135285H0() {
        if (!NullChecker.m82486a(this.f110123e)) {
            return true;
        }
        User userM145688e8 = FeedModule.f39703d.m145688e8(this.f110123e.owner);
        if (this.f110123e.owner.equals(FeedModule.m61405F().userId())) {
            return false;
        }
        if (NullChecker.m82486a(userM145688e8) && NullChecker.m82486a(userM145688e8.localFollowship)) {
            return (TEnum.equals(userM145688e8.localFollowship.state, "matched") || TEnum.equals(userM145688e8.localFollowship.state, FollowshipStatus.following)) ? false : true;
        }
        return true;
    }

    /* JADX INFO: renamed from: H1 */
    public void m135286H1(List<MomentMessage> list) {
        this.f110125g.clear();
        this.f110125g.addAll(list);
    }

    /* JADX INFO: renamed from: I0 */
    public boolean m135287I0() {
        if (cmg.m111197Y() || !m135285H0()) {
            return false;
        }
        if (m135294U0()) {
            return true;
        }
        if (this.f110114F.get().intValue() == 3) {
            return false;
        }
        for (String str : this.f110112D.get().split(Constants.SEPARATOR_COMMA)) {
            if (str.equals(this.f110133o)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: J0 */
    public final void m135288J0() {
        Moment moment;
        if (this.f110110B || (moment = this.f110123e) == null || jyb.m147479J(moment.media) || !NullChecker.m82486a(this.f110121c)) {
            return;
        }
        this.f110110B = true;
        this.f110111C = true;
        Iterator<y20<Boolean>> it = this.f110121c.iterator();
        while (it.hasNext()) {
            it.next().call(Boolean.valueOf(this.f110123e.media.get(0) instanceof Video));
        }
    }

    /* JADX INFO: renamed from: L1 */
    public void m135289L1() {
        if (this.f110133o == null) {
            return;
        }
        if (m135294U0()) {
            this.f110113E.put(Long.valueOf(pzi0.m174454o()));
            this.f110114F.put(1);
            this.f110112D.put(this.f110133o);
            return;
        }
        this.f110114F.put(Integer.valueOf(this.f110114F.get().intValue() + 1));
        this.f110112D.put(this.f110112D.get() + Constants.SEPARATOR_COMMA + this.f110133o);
    }

    /* JADX INFO: renamed from: O0 */
    public Moment m135290O0() {
        return this.f110122d.mo137272y(this.f110133o);
    }

    /* JADX INFO: renamed from: P0 */
    public float m135291P0() {
        return qa00.m175859d(24.0f) + ((nk00) this.viewModel).f142412r.getMeasuredWidth();
    }

    /* JADX INFO: renamed from: R0 */
    public void m135292R0() {
        ib70 ib70Var = new ib70(this.f110119a, this.f110134p, this.f110133o, this.f110135q, this.f110128j);
        this.f110122d = ib70Var;
        Moment momentMo137272y = ib70Var.mo137272y(this.f110133o);
        this.f110123e = momentMo137272y;
        if (NullChecker.m82486a(momentMo137272y)) {
            this.f110123e.momentValue = this.f110140v;
        }
        if (NullChecker.m82486a(this.f110123e)) {
            m135274t1(this.f110123e);
        }
    }

    /* JADX INFO: renamed from: S0 */
    public boolean m135293S0() {
        if (!NullChecker.m82486a(jyb.m147529r(ksg.f128568i, new qcj() { // from class: l.aj00
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f71613a.m135296b1((String) obj);
            }
        }))) {
            return this.f110115G;
        }
        this.f110115G = false;
        return false;
    }

    /* JADX INFO: renamed from: U0 */
    public final boolean m135294U0() {
        return this.f110113E.get().longValue() == 0 || !p6i.m170903l(this.f110113E.get().longValue(), pzi0.m174454o());
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m135295V0(String str, Boolean bool) {
        if (bool.booleanValue()) {
            k3h.m148045J0(act(), str);
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.ii00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f115042a.m135254W0((C4470c) obj);
            }
        }));
        creates(new y20() { // from class: l.ti00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f174437a.m135256Y0((Bundle) obj);
            }
        }, new x20() { // from class: l.zi00
            @Override // p153l.x20
            public final void call() {
                this.f204487a.m135257a1();
            }
        });
    }

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ Boolean m135296b1(String str) {
        return Boolean.valueOf(TextUtils.equals(str, this.f110134p));
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ Boolean m135297c1(MomentMessage momentMessage) {
        return Boolean.valueOf(!this.f110125g.contains(momentMessage));
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ Boolean m135298d1(MomentMessage momentMessage) {
        return Boolean.valueOf(this.f110109A.equals(momentMessage.f56856id));
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m135299e1(MomentMessage momentMessage) {
        ((nk00) this.viewModel).m163569h1(momentMessage, this.f110109A);
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m135300f1() {
        ((nk00) this.viewModel).m163555Y0(qa00.f156304Q);
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m135301g1() {
        ((nk00) this.viewModel).m163566f1();
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m135302h1(String str, final MomentMessage momentMessage, final x20 x20Var) {
        duringCreated(this.f110122d.mo137267i(str, momentMessage)).subscribe(psd0.m173597H(new y20() { // from class: l.xi00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f194426a.m135303i1(x20Var, momentMessage, (MomentMessage) obj);
            }
        }, new y20() { // from class: l.yi00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f200005a.m135304j1(momentMessage, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i1 */
    public final /* synthetic */ void m135303i1(x20 x20Var, MomentMessage momentMessage, MomentMessage momentMessage2) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
        this.f110131m = null;
        this.f110130l = null;
        if (NullChecker.m82487b(this.f110123e)) {
            m135279B1(momentMessage, true, null, momentMessage2.f56856id);
        }
    }

    /* JADX INFO: renamed from: j1 */
    public final /* synthetic */ void m135304j1(MomentMessage momentMessage, Throwable th) {
        if (NullChecker.m82487b(this.f110123e)) {
            m135279B1(momentMessage, false, th, "");
        }
        if (momentMessage.isChildComment()) {
            ((nk00) this.viewModel).m163542R(momentMessage);
        }
        if (this.f110125g.contains(momentMessage)) {
            this.f110125g.remove(momentMessage);
            ((nk00) this.viewModel).m163537O0(this.f110125g);
        }
        App.f16087d.m21432k(th);
        i4h.m138536e(th);
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ void m135305k1(String str, String str2, x20 x20Var, StickerInfo stickerInfo) {
        if (TextUtils.isEmpty(stickerInfo.f56859id)) {
            return;
        }
        m135317z1(str, str2, x20Var, stickerInfo);
    }

    /* JADX INFO: renamed from: l1 */
    public final /* synthetic */ void m135306l1(MomentMessage momentMessage, x20 x20Var) {
        m135315v1(this.f110134p, momentMessage, x20Var);
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ void m135307m1(Boolean bool) {
        if (act() != null) {
            Act act = act();
            Objects.requireNonNull(act);
            if (act.isDestroyed()) {
                return;
            }
            Act act2 = act();
            Objects.requireNonNull(act2);
            if (!act2.isFinishing() && bool.booleanValue()) {
                PhotoAlbumFeedFrag.m65547l5(this.f110134p, false);
                if (NullChecker.m82486a(this.f110123e)) {
                    this.f110123e.showGreetView = false;
                }
                this.f110115G = false;
                ksg.f128568i.add(this.f110134p);
            }
        }
    }

    /* JADX INFO: renamed from: n1 */
    public void m135308n1() {
        ((nk00) this.viewModel).m163539P0(this.f110125g, this.f110126h);
    }

    /* JADX INFO: renamed from: o1 */
    public void m135309o1(final MomentMessage momentMessage) {
        String str = momentMessage.moment;
        if (str == null || !str.equals(this.f110133o)) {
            return;
        }
        MomentMessage momentMessage2 = (MomentMessage) jyb.m147529r(this.f110125g, new qcj() { // from class: l.mi00
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(momentMessage.f56856id.equals(((MomentMessage) obj).f56856id));
            }
        });
        if (NullChecker.m82486a(momentMessage2)) {
            this.f110125g.remove(momentMessage2);
        }
        momentMessage.isNewComment = true;
        this.f110125g.add(0, momentMessage);
        ((nk00) this.viewModel).m163539P0(this.f110125g, this.f110126h);
    }

    /* JADX INFO: renamed from: p1 */
    public void m135310p1(final MomentMessage momentMessage) {
        if (momentMessage.moment.equals(this.f110133o)) {
            int iM147476G = jyb.m147476G(this.f110125g, new qcj() { // from class: l.cj00
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(momentMessage.f56856id.equals(((MomentMessage) obj).f56856id));
                }
            });
            if (iM147476G != -1) {
                this.f110125g.remove(iM147476G);
                ((nk00) this.viewModel).m163545S0(momentMessage);
            }
            ((nk00) this.viewModel).m163537O0(this.f110125g);
        }
    }

    /* JADX INFO: renamed from: q1 */
    public void m135311q1(bkj0<Links, List<MomentMessage>, List<StickerInfo>> bkj0Var) {
        this.f110127i = bkj0Var.f77081a;
        if (NullChecker.m82486a(bkj0Var.f77082b)) {
            this.f110125g.addAll(jyb.m147522n(bkj0Var.f77082b, new qcj() { // from class: l.oi00
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f147506a.m135297c1((MomentMessage) obj);
                }
            }));
            if (!jyb.m147479J(bkj0Var.f77083c)) {
                this.f110126h.addAll(bkj0Var.f77083c);
            }
            ((nk00) this.viewModel).m163539P0(this.f110125g, this.f110126h);
        }
    }

    /* JADX INFO: renamed from: r1 */
    public void m135312r1(pf60<List<StickerInfo>, List<MomentMessage>> pf60Var) {
        if (jyb.m147479J(pf60Var.f152157b)) {
            return;
        }
        List<MomentMessage> arrayList = new ArrayList<>();
        Iterator<MomentMessage> it = pf60Var.f152157b.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            final MomentMessage next = it.next();
            if (!next.isChildComment()) {
                boolean zM147479J = jyb.m147479J(this.f110125g);
                List<MomentMessage> list = this.f110125g;
                if (!zM147479J) {
                    this.f110125g.remove((MomentMessage) jyb.m147529r(list, new qcj() { // from class: l.dj00
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return Boolean.valueOf(next.f56856id.equals(((MomentMessage) obj).f56856id));
                        }
                    }));
                    this.f110125g.add(0, next);
                    pf60Var.f152157b.remove(next);
                    arrayList = ((nk00) this.viewModel).m163548U(next.f56856id);
                    break;
                }
                list.add(0, next);
                pf60Var.f152157b.remove(next);
                break;
            }
        }
        for (int size = (arrayList != null ? arrayList.size() : 0) - 1; size >= 0; size--) {
            MomentMessage momentMessage = arrayList.get(size);
            this.f110125g.remove(momentMessage);
            ((nk00) this.viewModel).m163545S0(momentMessage);
        }
        this.f110125g.addAll(pf60Var.f152157b);
        if (!TextUtils.isEmpty(this.f110143y)) {
            ((nk00) this.viewModel).m163557Z0(pf60Var.f152157b.size() + 1);
        }
        boolean zM147479J2 = jyb.m147479J(this.f110126h);
        List<StickerInfo> list2 = pf60Var.f152156a;
        if (zM147479J2) {
            if (!jyb.m147479J(list2)) {
                this.f110126h.addAll(pf60Var.f152156a);
            }
        } else if (!jyb.m147479J(list2)) {
            for (final StickerInfo stickerInfo : pf60Var.f152156a) {
                StickerInfo stickerInfo2 = (StickerInfo) jyb.m147529r(this.f110126h, new qcj() { // from class: l.ej00
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(stickerInfo.f56859id.equals(((StickerInfo) obj).f56859id));
                    }
                });
                if (stickerInfo2 != null) {
                    this.f110126h.remove(stickerInfo2);
                }
                this.f110126h.add(stickerInfo);
            }
        }
        ((nk00) this.viewModel).m163539P0(this.f110125g, this.f110126h);
    }

    /* JADX INFO: renamed from: s1 */
    public void m135313s1(bkj0<Moment, pf60<List<StickerInfo>, List<MomentMessage>>, pf60<Music, RawFeed>> bkj0Var) {
        if (((nk00) this.viewModel).m163549U0(bkj0Var)) {
            pf60<Music, RawFeed> pf60Var = bkj0Var.f77083c;
            if (pf60Var.f152157b != null) {
                this.f110124f = pf60Var.f152157b;
            }
            Moment moment = this.f110123e;
            if (moment == null) {
                Moment moment2 = bkj0Var.f77081a;
                this.f110123e = moment2;
                ((nk00) this.viewModel).m163543R0(moment2);
                m135250J1(this.f110123e, bkj0Var.f77083c.f152156a);
                m135274t1(this.f110123e);
            } else {
                m135250J1(moment, pf60Var.f152156a);
                Moment moment3 = bkj0Var.f77081a;
                this.f110123e = moment3;
                ((nk00) this.viewModel).m163543R0(moment3);
                ((nk00) this.viewModel).m163553X0(this.f110122d, this.f110128j);
            }
            Moment moment4 = bkj0Var.f77081a;
            this.f110127i = moment4.messages.links;
            ((nk00) this.viewModel).m163541Q0(moment4.messages.links);
            if (jyb.m147479J(this.f110125g)) {
                this.f110125g.clear();
                this.f110125g.addAll(m135249I1(bkj0Var.f77082b.f152157b));
            } else {
                for (final MomentMessage momentMessage : m135249I1(bkj0Var.f77082b.f152157b)) {
                    if (jyb.m147529r(this.f110125g, new qcj() { // from class: l.fj00
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return Boolean.valueOf(momentMessage.f56856id.equals(((MomentMessage) obj).f56856id));
                        }
                    }) == null) {
                        this.f110125g.add(momentMessage);
                    }
                }
            }
            if (NullChecker.m82486a(bkj0Var.f77082b.f152156a)) {
                this.f110126h.addAll(bkj0Var.f77082b.f152156a);
            }
            ((nk00) this.viewModel).m163539P0(this.f110125g, this.f110126h);
            if (NullChecker.m82486a(bkj0Var.f77083c.f152157b)) {
                this.f110141w = bkj0Var.f77083c.f152157b.canGreeting;
            }
            m135288J0();
            if (TextUtils.isEmpty(this.f110109A)) {
                if (this.f110144z) {
                    l51.m152889I(this.f110119a, new Runnable() { // from class: l.li00
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f132170a.m135301g1();
                        }
                    }, 20L);
                }
            } else {
                final MomentMessage momentMessage2 = (MomentMessage) jyb.m147529r(this.f110125g, new qcj() { // from class: l.gj00
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return this.f104544a.m135298d1((MomentMessage) obj);
                    }
                });
                if (!NullChecker.m82486a(momentMessage2)) {
                    r1j0.m179420g("评论已删除");
                } else {
                    l51.m152889I(this.f110119a, new Runnable() { // from class: l.ji00
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f121031a.m135299e1(momentMessage2);
                        }
                    }, 20L);
                    l51.m152889I(this.f110119a, new Runnable() { // from class: l.ki00
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f126954a.m135300f1();
                        }
                    }, 500L);
                }
            }
        }
    }

    /* JADX INFO: renamed from: u1 */
    public void m135314u1() {
        ((nk00) this.viewModel).m163553X0(this.f110122d, this.f110128j);
    }

    /* JADX INFO: renamed from: v1 */
    public void m135315v1(final String str, final MomentMessage momentMessage, final x20 x20Var) {
        ksg.m151220o(this.f110120b, momentMessage.value, DetectCategoryType.get("comment"), "comment", "p_user_moment_interactions_details_view", new x20() { // from class: l.wi00
            @Override // p153l.x20
            public final void call() {
                this.f189327a.m135302h1(str, momentMessage, x20Var);
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public void m135316x1(final String str, final String str2, final x20 x20Var) {
        Object objMo31815qh = FeedModule.m61406H().mo31815qh(((nk00) this.viewModel).f142392S);
        if (objMo31815qh instanceof StickerInfo) {
            StickerInfo stickerInfo = (StickerInfo) objMo31815qh;
            if (TextUtils.isEmpty(stickerInfo.f56859id)) {
                FeedModule.m61406H().mo31689Fc(this.f110120b, stickerInfo, new y20() { // from class: l.qi00
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f157789a.m135305k1(str, str2, x20Var, (StickerInfo) obj);
                    }
                });
                return;
            }
        }
        m135317z1(str, str2, x20Var, objMo31815qh);
    }

    /* JADX INFO: renamed from: z1 */
    public void m135317z1(String str, String str2, final x20 x20Var, Object obj) {
        final MomentMessage momentMessage = new MomentMessage();
        momentMessage.value = str;
        momentMessage.moment = this.f110133o;
        momentMessage.owner = FeedModule.m61405F().userId();
        momentMessage.api_only_otherUser = this.f110131m;
        er60.m122104w();
        momentMessage.momentShowFromType = er60.m122103D(this.f110128j);
        CommentInfo commentInfoNew_ = CommentInfo.new_();
        commentInfoNew_.parentMessageId = this.f110132n;
        if (NullChecker.m82486a(this.f110130l)) {
            commentInfoNew_.replyMessageId = this.f110130l.f56856id;
        }
        this.f110132n = "";
        momentMessage.commentInfo = commentInfoNew_;
        if (!TextUtils.isEmpty(commentInfoNew_.parentMessageId) && NullChecker.m82486a(this.f110130l)) {
            momentMessage.replyCommentId = this.f110130l.f56856id;
        }
        if (!jyb.m147479J(this.f110116H)) {
            for (int i = 0; i < this.f110116H.size(); i++) {
                str2 = str2.replace(this.f110116H.get(i), "");
            }
        }
        this.f110117I = null;
        this.f110118J = false;
        this.f110116H.clear();
        if (uqb0.f180394Z.m95954K(str2)) {
            k3h.m148027A0(this.f110120b, new x20() { // from class: l.si00
                @Override // p153l.x20
                public final void call() {
                    this.f168783a.m135306l1(momentMessage, x20Var);
                }
            }, false);
        } else {
            m135315v1(this.f110134p, momentMessage, x20Var);
            m135253Q0(str2);
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
