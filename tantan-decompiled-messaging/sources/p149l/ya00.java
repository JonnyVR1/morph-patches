package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.p053ui.notifications.SysnotifListener;
import com.p046p1.mobile.putong.data.Channel;
import com.p046p1.mobile.putong.data.DetectCategoryType;
import com.p046p1.mobile.putong.data.FollowshipStatus;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.Music;
import com.p046p1.mobile.putong.data.StickerInfo;
import com.p046p1.mobile.putong.data.TopicMomentIdBox;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.CommentInfo;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentMessage;
import com.p046p1.mobile.putong.feed.data.RawFeed;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailFrag;
import com.tantanapp.common.utils.NullChecker;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public class ya00 extends jq2<ec00> {

    /* JADX INFO: renamed from: K */
    public static zpd0 f197098K = new zpd0("change_greet_selection_box_last_time_" + FeedModule.m60221F().userId(), 0L);

    /* JADX INFO: renamed from: A */
    public String f197099A;

    /* JADX INFO: renamed from: B */
    public boolean f197100B;

    /* JADX INFO: renamed from: C */
    public boolean f197101C;

    /* JADX INFO: renamed from: D */
    public uqd0 f197102D;

    /* JADX INFO: renamed from: E */
    public zpd0 f197103E;

    /* JADX INFO: renamed from: F */
    public tpd0 f197104F;

    /* JADX INFO: renamed from: G */
    public boolean f197105G;

    /* JADX INFO: renamed from: H */
    public List<String> f197106H;

    /* JADX INFO: renamed from: I */
    public StickerInfo f197107I;

    /* JADX INFO: renamed from: J */
    public boolean f197108J;

    /* JADX INFO: renamed from: a */
    public MomentDetailFrag f197109a;

    /* JADX INFO: renamed from: b */
    public Act f197110b;

    /* JADX INFO: renamed from: c */
    public List<e30<Boolean>> f197111c;

    /* JADX INFO: renamed from: d */
    public hx60 f197112d;

    /* JADX INFO: renamed from: e */
    public Moment f197113e;

    /* JADX INFO: renamed from: f */
    public RawFeed f197114f;

    /* JADX INFO: renamed from: g */
    public List<MomentMessage> f197115g;

    /* JADX INFO: renamed from: h */
    public List<StickerInfo> f197116h;

    /* JADX INFO: renamed from: i */
    public Links f197117i;

    /* JADX INFO: renamed from: j */
    public String f197118j;

    /* JADX INFO: renamed from: k */
    public String f197119k;

    /* JADX INFO: renamed from: l */
    public MomentMessage f197120l;

    /* JADX INFO: renamed from: m */
    public String f197121m;

    /* JADX INFO: renamed from: n */
    public String f197122n;

    /* JADX INFO: renamed from: o */
    public String f197123o;

    /* JADX INFO: renamed from: p */
    public String f197124p;

    /* JADX INFO: renamed from: q */
    public boolean f197125q;

    /* JADX INFO: renamed from: r */
    public int f197126r;

    /* JADX INFO: renamed from: s */
    public boolean f197127s;

    /* JADX INFO: renamed from: t */
    public boolean f197128t;

    /* JADX INFO: renamed from: u */
    public boolean f197129u;

    /* JADX INFO: renamed from: v */
    public final String f197130v;

    /* JADX INFO: renamed from: w */
    public boolean f197131w;

    /* JADX INFO: renamed from: x */
    public boolean f197132x;

    /* JADX INFO: renamed from: y */
    public String f197133y;

    /* JADX INFO: renamed from: z */
    public boolean f197134z;

    public ya00(MomentDetailFrag momentDetailFrag) {
        super(momentDetailFrag);
        this.f197111c = new ArrayList();
        this.f197115g = new LinkedList();
        this.f197116h = new LinkedList();
        this.f197122n = "";
        this.f197126r = 0;
        this.f197128t = true;
        this.f197129u = false;
        this.f197102D = new uqd0("show_tips_moment_ids_" + FeedModule.m60221F().userId(), "");
        this.f197103E = new zpd0("show_tips_last_time_" + FeedModule.m60221F().userId(), 0L);
        this.f197104F = new tpd0("show_tips_last_count_" + FeedModule.m60221F().userId(), 0);
        this.f197106H = new ArrayList();
        this.f197107I = null;
        this.f197108J = false;
        this.f197109a = momentDetailFrag;
        this.f197110b = momentDetailFrag.act();
        Bundle arguments = momentDetailFrag.getArguments();
        this.f197118j = arguments.getString("from");
        this.f197119k = arguments.getString("enterPage");
        this.f197123o = arguments.getString("momentId");
        this.f197128t = arguments.getBoolean("autoPlay", true);
        this.f197124p = arguments.getString("momentOwner");
        this.f197125q = arguments.getBoolean("isHideComment", false);
        this.f197126r = arguments.getInt("initMediaIndex", 0);
        this.f197131w = arguments.getBoolean("canGreeting", false);
        this.f197132x = momentDetailFrag.getArguments().getBoolean("start_home_card");
        this.f197130v = arguments.getString("momentValue");
        this.f197133y = arguments.getString("msg_id");
        this.f197134z = arguments.getBoolean("showInput", false);
        Serializable serializable = arguments.getSerializable("rawFeed");
        if (serializable instanceof RawFeed) {
            this.f197114f = (RawFeed) serializable;
        }
        this.f197099A = arguments.getString("clickedMsgId");
    }

    /* JADX INFO: renamed from: I1 */
    private List<MomentMessage> m213716I1(List<MomentMessage> list) {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f197113e.messages.ids) {
            MomentMessage momentMessage = (MomentMessage) vwb.m200346r(list, new w9j() { // from class: l.ga00
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(str.equals(((MomentMessage) obj).f56008id));
                }
            });
            if (NullChecker.m81303a(momentMessage)) {
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
    private void m213717J1(Moment moment, Music music) {
        if (music == null || vwb.m200296J(moment.media) || !(moment.media.get(0) instanceof Video)) {
            return;
        }
        ((Video) moment.media.get(0)).music = music;
    }

    /* JADX INFO: renamed from: L0 */
    private String m213718L0() {
        String strM199795a = vs0.m199795a(this.f197113e, this.f197112d.mo133306m(FeedModule.m60221F().userId()).name);
        User userMo133306m = this.f197112d.mo133306m(this.f197121m);
        List<String> listM182493g = s7i.m182493g(((ec00) this.viewModel).f90438p.getPaint(), m213758P0(), strM199795a, vs0.m199795a(this.f197113e, userMo133306m == null ? "" : userMo133306m.name), new x9j() { // from class: l.ea00
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return this.f90164a.m213719N0((String) obj, (String) obj2);
            }
        });
        return m213719N0(listM182493g.get(0), listM182493g.get(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public String m213719N0(String str, String str2) {
        return str + this.f197109a.getString(R$string.f39021a3) + str2 + ": ";
    }

    /* JADX INFO: renamed from: Q0 */
    private void m213720Q0(final String str) {
        qib0.f154711Z.m119131Q(str, "p_user_passive_show_nearby").subscribe(mkd0.m154956H(new e30() { // from class: l.la00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f127156a.m213762V0(str, (Boolean) obj);
            }
        }, new e30() { // from class: l.ma00
            @Override // p149l.e30
            public final void call(Object obj) {
                ya00.m213726f0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public /* synthetic */ void m213721W0(C4319c c4319c) {
        List<TopicMomentIdBox> list;
        if (c4319c != C4319c.f15548i) {
            if (c4319c == C4319c.f15552m) {
                this.f197111c = null;
            }
        } else if (((ec00) this.viewModel).m115618g0()) {
            j760 j760VarM140076a = j760.m140076a("qa_optional", (NullChecker.m81303a(this.f197113e) && this.f197113e.shareMyVote) ? "1" : "0");
            Moment moment = this.f197113e;
            p6j0.m167671e("e_moment", "p_user_moment_interactions_details_view", j760VarM140076a, j760.m140076a("topic_id", (moment == null || (list = moment.topics) == null || list.size() == 0) ? "" : this.f197113e.topics.get(0).f38824id), j760.m140076a("moment_id", this.f197123o), j760.m140076a("owner_id", this.f197124p), j760.m140076a("moment_distance", Long.valueOf(vqg.m199507G(this.f197113e))), j760.m140076a("moment_create_time", Long.valueOf(vqg.m199505F(this.f197113e))), j760.m140076a("owner_active_time", Long.valueOf(vqg.m199525S(FeedModule.f38855d.m209447e8(this.f197124p)))), j760.m140076a("moment_type", zi60.m218961w().m218992y(this.f197113e)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public /* synthetic */ void m213722X0(Boolean bool) {
        this.f197105G = bool.booleanValue();
        if (nkg.m159850G()) {
            ((ec00) this.viewModel).m115615e1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public /* synthetic */ void m213723Y0(Bundle bundle) {
        ((ec00) this.viewModel).m115612c0();
        ((ec00) this.viewModel).m115589P();
        this.f197112d.mo64519o();
        ((ec00) this.viewModel).m115605Y(this.f197112d);
        if (!TextUtils.isEmpty(this.f197133y) && !this.f197133y.equals("0")) {
            ((c370) this.f197112d).m104986Q(this.f197133y);
        }
        if (nkg.m159851H() || nkg.m159850G()) {
            vqg.m199497B(this.f197110b, this.f197124p, new e30() { // from class: l.sa00
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f163251a.m213722X0((Boolean) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public /* synthetic */ void m213724a1() {
        ((ec00) this.viewModel).m115591Q();
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m213726f0(Throwable th) {
    }

    /* JADX INFO: renamed from: t1 */
    private void m213741t1(Moment moment) {
        ((ec00) this.viewModel).m115603W0(!TEnum.equals(moment.status(), "normal"));
        if (!moment.media.isEmpty() && moment.media.size() == 1 && (moment.media.get(0) instanceof Video) && this.f197128t) {
            this.f197128t = true;
        }
        new HashMap().put(moment.f56011id, Integer.valueOf(this.f197126r));
        ((ec00) this.viewModel).m115604X0(this.f197112d, this.f197118j);
    }

    /* JADX INFO: renamed from: B1 */
    public final void m213746B1(MomentMessage momentMessage, boolean z, Throwable th, String str) {
        String str2;
        boolean zIsChildComment = momentMessage.isChildComment();
        if (TEnum.equals(momentMessage.messageType, "sticker")) {
            str2 = "gif";
        } else {
            str2 = TEnum.equals(momentMessage.messageType, "picture") ? "picture" : "text";
        }
        p6j0.m167672f("e_comment_send", "p_user_moment_interactions_details_view", p6j0.C19147a.m167678g("moment_id", this.f197113e.f56011id), p6j0.C19147a.m167678g("owner_id", this.f197113e.owner), p6j0.C19147a.m167678g("comment_id", str), p6j0.C19147a.m167678g("comment_type", str2), p6j0.C19147a.m167678g("comment_user_id", FeedModule.m60221F().userId()), p6j0.C19147a.m167678g("comment_state", z ? "success" : "fail"), p6j0.C19147a.m167678g("comment_detail", zIsChildComment ? SysnotifListener.ACTION_REPLY : "comment"), th == null ? null : p6j0.C19147a.m167678g("error", th.toString()));
    }

    /* JADX INFO: renamed from: C1 */
    public void m213747C1(Act act, String str, String str2, String str3) {
        if (this.f197108J) {
            str = str + "【图片评论】";
        }
        FeedModule.m60222H().mo30730Vk(act, str, str2, str3, str2, Channel.get(Channel.comment_forward), new e30() { // from class: l.ia00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f112273a.m213774m1((Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D1 */
    public void m213748D1(String str) {
        if (this.f197106H.contains(str)) {
            return;
        }
        this.f197106H.add(str);
    }

    /* JADX INFO: renamed from: E1 */
    public String m213749E1(MomentMessage momentMessage, String str) {
        if (!NullChecker.m81303a(momentMessage)) {
            return act().getString(R$string.f39002X2);
        }
        this.f197120l = momentMessage;
        this.f197121m = momentMessage.owner;
        this.f197122n = str;
        return m213718L0();
    }

    /* JADX INFO: renamed from: F1 */
    public boolean m213750F1() {
        return f197098K.get().longValue() != 0 && a5i.m95036l(f197098K.get().longValue(), mqi0.m155944o());
    }

    /* JADX INFO: renamed from: G0 */
    public void m213751G0(e30<Boolean> e30Var) {
        this.f197111c.add(e30Var);
    }

    /* JADX INFO: renamed from: H0 */
    public boolean m213752H0() {
        if (!NullChecker.m81303a(this.f197113e)) {
            return true;
        }
        User userM209447e8 = FeedModule.f38855d.m209447e8(this.f197113e.owner);
        if (this.f197113e.owner.equals(FeedModule.m60221F().userId())) {
            return false;
        }
        if (NullChecker.m81303a(userM209447e8) && NullChecker.m81303a(userM209447e8.localFollowship)) {
            return (TEnum.equals(userM209447e8.localFollowship.state, "matched") || TEnum.equals(userM209447e8.localFollowship.state, FollowshipStatus.following)) ? false : true;
        }
        return true;
    }

    /* JADX INFO: renamed from: H1 */
    public void m213753H1(List<MomentMessage> list) {
        this.f197115g.clear();
        this.f197115g.addAll(list);
    }

    /* JADX INFO: renamed from: I0 */
    public boolean m213754I0() {
        if (nkg.m159868Y() || !m213752H0()) {
            return false;
        }
        if (m213761U0()) {
            return true;
        }
        if (this.f197104F.get().intValue() == 3) {
            return false;
        }
        for (String str : this.f197102D.get().split(Constants.SEPARATOR_COMMA)) {
            if (str.equals(this.f197123o)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: J0 */
    public final void m213755J0() {
        Moment moment;
        if (this.f197100B || (moment = this.f197113e) == null || vwb.m200296J(moment.media) || !NullChecker.m81303a(this.f197111c)) {
            return;
        }
        this.f197100B = true;
        this.f197101C = true;
        Iterator<e30<Boolean>> it = this.f197111c.iterator();
        while (it.hasNext()) {
            it.next().call(Boolean.valueOf(this.f197113e.media.get(0) instanceof Video));
        }
    }

    /* JADX INFO: renamed from: L1 */
    public void m213756L1() {
        if (this.f197123o == null) {
            return;
        }
        if (m213761U0()) {
            this.f197103E.put(Long.valueOf(mqi0.m155944o()));
            this.f197104F.put(1);
            this.f197102D.put(this.f197123o);
            return;
        }
        this.f197104F.put(Integer.valueOf(this.f197104F.get().intValue() + 1));
        this.f197102D.put(this.f197102D.get() + Constants.SEPARATOR_COMMA + this.f197123o);
    }

    /* JADX INFO: renamed from: O0 */
    public Moment m213757O0() {
        return this.f197112d.mo133317y(this.f197123o);
    }

    /* JADX INFO: renamed from: P0 */
    public float m213758P0() {
        return t100.m186890d(24.0f) + ((ec00) this.viewModel).f90440r.getMeasuredWidth();
    }

    /* JADX INFO: renamed from: R0 */
    public void m213759R0() {
        c370 c370Var = new c370(this.f197109a, this.f197124p, this.f197123o, this.f197125q, this.f197118j);
        this.f197112d = c370Var;
        Moment momentMo133317y = c370Var.mo133317y(this.f197123o);
        this.f197113e = momentMo133317y;
        if (NullChecker.m81303a(momentMo133317y)) {
            this.f197113e.momentValue = this.f197130v;
        }
        if (NullChecker.m81303a(this.f197113e)) {
            m213741t1(this.f197113e);
        }
    }

    /* JADX INFO: renamed from: S0 */
    public boolean m213760S0() {
        if (!NullChecker.m81303a(vwb.m200346r(vqg.f182645i, new w9j() { // from class: l.ra00
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f158468a.m213763b1((String) obj);
            }
        }))) {
            return this.f197105G;
        }
        this.f197105G = false;
        return false;
    }

    /* JADX INFO: renamed from: U0 */
    public final boolean m213761U0() {
        return this.f197103E.get().longValue() == 0 || !a5i.m95036l(this.f197103E.get().longValue(), mqi0.m155944o());
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m213762V0(String str, Boolean bool) {
        if (bool.booleanValue()) {
            v1h.m196568J0(act(), str);
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.z900
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202262a.m213721W0((C4319c) obj);
            }
        }));
        creates(new e30() { // from class: l.ka00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f122084a.m213723Y0((Bundle) obj);
            }
        }, new d30() { // from class: l.qa00
            @Override // p149l.d30
            public final void call() {
                this.f153494a.m213724a1();
            }
        });
    }

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ Boolean m213763b1(String str) {
        return Boolean.valueOf(TextUtils.equals(str, this.f197124p));
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ Boolean m213764c1(MomentMessage momentMessage) {
        return Boolean.valueOf(!this.f197115g.contains(momentMessage));
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ Boolean m213765d1(MomentMessage momentMessage) {
        return Boolean.valueOf(this.f197099A.equals(momentMessage.f56008id));
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m213766e1(MomentMessage momentMessage) {
        ((ec00) this.viewModel).m115620h1(momentMessage, this.f197099A);
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m213767f1() {
        ((ec00) this.viewModel).m115606Y0(t100.f167242Q);
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m213768g1() {
        ((ec00) this.viewModel).m115617f1();
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m213769h1(String str, final MomentMessage momentMessage, final d30 d30Var) {
        duringCreated(this.f197112d.mo133302i(str, momentMessage)).subscribe(mkd0.m154956H(new e30() { // from class: l.oa00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f142767a.m213770i1(d30Var, momentMessage, (MomentMessage) obj);
            }
        }, new e30() { // from class: l.pa00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f147833a.m213771j1(momentMessage, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i1 */
    public final /* synthetic */ void m213770i1(d30 d30Var, MomentMessage momentMessage, MomentMessage momentMessage2) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
        this.f197121m = null;
        this.f197120l = null;
        if (NullChecker.m81304b(this.f197113e)) {
            m213746B1(momentMessage, true, null, momentMessage2.f56008id);
        }
    }

    /* JADX INFO: renamed from: j1 */
    public final /* synthetic */ void m213771j1(MomentMessage momentMessage, Throwable th) {
        if (NullChecker.m81304b(this.f197113e)) {
            m213746B1(momentMessage, false, th, "");
        }
        if (momentMessage.isChildComment()) {
            ((ec00) this.viewModel).m115593R(momentMessage);
        }
        if (this.f197115g.contains(momentMessage)) {
            this.f197115g.remove(momentMessage);
            ((ec00) this.viewModel).m115588O0(this.f197115g);
        }
        App.f15368d.m20433k(th);
        t2h.m186974e(th);
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ void m213772k1(String str, String str2, d30 d30Var, StickerInfo stickerInfo) {
        if (TextUtils.isEmpty(stickerInfo.f56011id)) {
            return;
        }
        m213784z1(str, str2, d30Var, stickerInfo);
    }

    /* JADX INFO: renamed from: l1 */
    public final /* synthetic */ void m213773l1(MomentMessage momentMessage, d30 d30Var) {
        m213782v1(this.f197124p, momentMessage, d30Var);
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ void m213774m1(Boolean bool) {
        if (act() != null) {
            Act act = act();
            Objects.requireNonNull(act);
            if (act.isDestroyed()) {
                return;
            }
            Act act2 = act();
            Objects.requireNonNull(act2);
            if (!act2.isFinishing() && bool.booleanValue()) {
                PhotoAlbumFeedFrag.m64364l5(this.f197124p, false);
                if (NullChecker.m81303a(this.f197113e)) {
                    this.f197113e.showGreetView = false;
                }
                this.f197105G = false;
                vqg.f182645i.add(this.f197124p);
            }
        }
    }

    /* JADX INFO: renamed from: n1 */
    public void m213775n1() {
        ((ec00) this.viewModel).m115590P0(this.f197115g, this.f197116h);
    }

    /* JADX INFO: renamed from: o1 */
    public void m213776o1(final MomentMessage momentMessage) {
        String str = momentMessage.moment;
        if (str == null || !str.equals(this.f197123o)) {
            return;
        }
        MomentMessage momentMessage2 = (MomentMessage) vwb.m200346r(this.f197115g, new w9j() { // from class: l.da00
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(momentMessage.f56008id.equals(((MomentMessage) obj).f56008id));
            }
        });
        if (NullChecker.m81303a(momentMessage2)) {
            this.f197115g.remove(momentMessage2);
        }
        momentMessage.isNewComment = true;
        this.f197115g.add(0, momentMessage);
        ((ec00) this.viewModel).m115590P0(this.f197115g, this.f197116h);
    }

    /* JADX INFO: renamed from: p1 */
    public void m213777p1(final MomentMessage momentMessage) {
        if (momentMessage.moment.equals(this.f197123o)) {
            int iM200293G = vwb.m200293G(this.f197115g, new w9j() { // from class: l.ta00
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(momentMessage.f56008id.equals(((MomentMessage) obj).f56008id));
                }
            });
            if (iM200293G != -1) {
                this.f197115g.remove(iM200293G);
                ((ec00) this.viewModel).m115596S0(momentMessage);
            }
            ((ec00) this.viewModel).m115588O0(this.f197115g);
        }
    }

    /* JADX INFO: renamed from: q1 */
    public void m213778q1(xaj0<Links, List<MomentMessage>, List<StickerInfo>> xaj0Var) {
        this.f197117i = xaj0Var.f191751a;
        if (NullChecker.m81303a(xaj0Var.f191752b)) {
            this.f197115g.addAll(vwb.m200339n(xaj0Var.f191752b, new w9j() { // from class: l.fa00
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f96550a.m213764c1((MomentMessage) obj);
                }
            }));
            if (!vwb.m200296J(xaj0Var.f191753c)) {
                this.f197116h.addAll(xaj0Var.f191753c);
            }
            ((ec00) this.viewModel).m115590P0(this.f197115g, this.f197116h);
        }
    }

    /* JADX INFO: renamed from: r1 */
    public void m213779r1(j760<List<StickerInfo>, List<MomentMessage>> j760Var) {
        if (vwb.m200296J(j760Var.f116565b)) {
            return;
        }
        List<MomentMessage> arrayList = new ArrayList<>();
        Iterator<MomentMessage> it = j760Var.f116565b.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            final MomentMessage next = it.next();
            if (!next.isChildComment()) {
                boolean zM200296J = vwb.m200296J(this.f197115g);
                List<MomentMessage> list = this.f197115g;
                if (!zM200296J) {
                    this.f197115g.remove((MomentMessage) vwb.m200346r(list, new w9j() { // from class: l.ua00
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return Boolean.valueOf(next.f56008id.equals(((MomentMessage) obj).f56008id));
                        }
                    }));
                    this.f197115g.add(0, next);
                    j760Var.f116565b.remove(next);
                    arrayList = ((ec00) this.viewModel).m115599U(next.f56008id);
                    break;
                }
                list.add(0, next);
                j760Var.f116565b.remove(next);
                break;
            }
        }
        for (int size = (arrayList != null ? arrayList.size() : 0) - 1; size >= 0; size--) {
            MomentMessage momentMessage = arrayList.get(size);
            this.f197115g.remove(momentMessage);
            ((ec00) this.viewModel).m115596S0(momentMessage);
        }
        this.f197115g.addAll(j760Var.f116565b);
        if (!TextUtils.isEmpty(this.f197133y)) {
            ((ec00) this.viewModel).m115608Z0(j760Var.f116565b.size() + 1);
        }
        boolean zM200296J2 = vwb.m200296J(this.f197116h);
        List<StickerInfo> list2 = j760Var.f116564a;
        if (zM200296J2) {
            if (!vwb.m200296J(list2)) {
                this.f197116h.addAll(j760Var.f116564a);
            }
        } else if (!vwb.m200296J(list2)) {
            for (final StickerInfo stickerInfo : j760Var.f116564a) {
                StickerInfo stickerInfo2 = (StickerInfo) vwb.m200346r(this.f197116h, new w9j() { // from class: l.va00
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(stickerInfo.f56011id.equals(((StickerInfo) obj).f56011id));
                    }
                });
                if (stickerInfo2 != null) {
                    this.f197116h.remove(stickerInfo2);
                }
                this.f197116h.add(stickerInfo);
            }
        }
        ((ec00) this.viewModel).m115590P0(this.f197115g, this.f197116h);
    }

    /* JADX INFO: renamed from: s1 */
    public void m213780s1(xaj0<Moment, j760<List<StickerInfo>, List<MomentMessage>>, j760<Music, RawFeed>> xaj0Var) {
        if (((ec00) this.viewModel).m115600U0(xaj0Var)) {
            j760<Music, RawFeed> j760Var = xaj0Var.f191753c;
            if (j760Var.f116565b != null) {
                this.f197114f = j760Var.f116565b;
            }
            Moment moment = this.f197113e;
            if (moment == null) {
                Moment moment2 = xaj0Var.f191751a;
                this.f197113e = moment2;
                ((ec00) this.viewModel).m115594R0(moment2);
                m213717J1(this.f197113e, xaj0Var.f191753c.f116564a);
                m213741t1(this.f197113e);
            } else {
                m213717J1(moment, j760Var.f116564a);
                Moment moment3 = xaj0Var.f191751a;
                this.f197113e = moment3;
                ((ec00) this.viewModel).m115594R0(moment3);
                ((ec00) this.viewModel).m115604X0(this.f197112d, this.f197118j);
            }
            Moment moment4 = xaj0Var.f191751a;
            this.f197117i = moment4.messages.links;
            ((ec00) this.viewModel).m115592Q0(moment4.messages.links);
            if (vwb.m200296J(this.f197115g)) {
                this.f197115g.clear();
                this.f197115g.addAll(m213716I1(xaj0Var.f191752b.f116565b));
            } else {
                for (final MomentMessage momentMessage : m213716I1(xaj0Var.f191752b.f116565b)) {
                    if (vwb.m200346r(this.f197115g, new w9j() { // from class: l.wa00
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return Boolean.valueOf(momentMessage.f56008id.equals(((MomentMessage) obj).f56008id));
                        }
                    }) == null) {
                        this.f197115g.add(momentMessage);
                    }
                }
            }
            if (NullChecker.m81303a(xaj0Var.f191752b.f116564a)) {
                this.f197116h.addAll(xaj0Var.f191752b.f116564a);
            }
            ((ec00) this.viewModel).m115590P0(this.f197115g, this.f197116h);
            if (NullChecker.m81303a(xaj0Var.f191753c.f116565b)) {
                this.f197131w = xaj0Var.f191753c.f116565b.canGreeting;
            }
            m213755J0();
            if (TextUtils.isEmpty(this.f197099A)) {
                if (this.f197134z) {
                    e51.m114744I(this.f197109a, new Runnable() { // from class: l.ca00
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f79995a.m213768g1();
                        }
                    }, 20L);
                }
            } else {
                final MomentMessage momentMessage2 = (MomentMessage) vwb.m200346r(this.f197115g, new w9j() { // from class: l.xa00
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return this.f191673a.m213765d1((MomentMessage) obj);
                    }
                });
                if (!NullChecker.m81303a(momentMessage2)) {
                    osi0.m165783g("评论已删除");
                } else {
                    e51.m114744I(this.f197109a, new Runnable() { // from class: l.aa00
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f68256a.m213766e1(momentMessage2);
                        }
                    }, 20L);
                    e51.m114744I(this.f197109a, new Runnable() { // from class: l.ba00
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f74645a.m213767f1();
                        }
                    }, 500L);
                }
            }
        }
    }

    /* JADX INFO: renamed from: u1 */
    public void m213781u1() {
        ((ec00) this.viewModel).m115604X0(this.f197112d, this.f197118j);
    }

    /* JADX INFO: renamed from: v1 */
    public void m213782v1(final String str, final MomentMessage momentMessage, final d30 d30Var) {
        vqg.m199561o(this.f197110b, momentMessage.value, DetectCategoryType.get("comment"), "comment", "p_user_moment_interactions_details_view", new d30() { // from class: l.na00
            @Override // p149l.d30
            public final void call() {
                this.f137852a.m213769h1(str, momentMessage, d30Var);
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public void m213783x1(final String str, final String str2, final d30 d30Var) {
        Object objMo30812qh = FeedModule.m60222H().mo30812qh(((ec00) this.viewModel).f90420S);
        if (objMo30812qh instanceof StickerInfo) {
            StickerInfo stickerInfo = (StickerInfo) objMo30812qh;
            if (TextUtils.isEmpty(stickerInfo.f56011id)) {
                FeedModule.m60222H().mo30686Fc(this.f197110b, stickerInfo, new e30() { // from class: l.ha00
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f106702a.m213772k1(str, str2, d30Var, (StickerInfo) obj);
                    }
                });
                return;
            }
        }
        m213784z1(str, str2, d30Var, objMo30812qh);
    }

    /* JADX INFO: renamed from: z1 */
    public void m213784z1(String str, String str2, final d30 d30Var, Object obj) {
        final MomentMessage momentMessage = new MomentMessage();
        momentMessage.value = str;
        momentMessage.moment = this.f197123o;
        momentMessage.owner = FeedModule.m60221F().userId();
        momentMessage.api_only_otherUser = this.f197121m;
        zi60.m218961w();
        momentMessage.momentShowFromType = zi60.m218960D(this.f197118j);
        CommentInfo commentInfoNew_ = CommentInfo.new_();
        commentInfoNew_.parentMessageId = this.f197122n;
        if (NullChecker.m81303a(this.f197120l)) {
            commentInfoNew_.replyMessageId = this.f197120l.f56008id;
        }
        this.f197122n = "";
        momentMessage.commentInfo = commentInfoNew_;
        if (!TextUtils.isEmpty(commentInfoNew_.parentMessageId) && NullChecker.m81303a(this.f197120l)) {
            momentMessage.replyCommentId = this.f197120l.f56008id;
        }
        if (!vwb.m200296J(this.f197106H)) {
            for (int i = 0; i < this.f197106H.size(); i++) {
                str2 = str2.replace(this.f197106H.get(i), "");
            }
        }
        this.f197107I = null;
        this.f197108J = false;
        this.f197106H.clear();
        if (qib0.f154711Z.m119125K(str2)) {
            v1h.m196550A0(this.f197110b, new d30() { // from class: l.ja00
                @Override // p149l.d30
                public final void call() {
                    this.f116994a.m213773l1(momentMessage, d30Var);
                }
            }, false);
        } else {
            m213782v1(this.f197124p, momentMessage, d30Var);
            m213720Q0(str2);
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
