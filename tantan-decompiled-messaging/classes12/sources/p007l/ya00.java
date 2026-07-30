package p007l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.data.Channel;
import com.p000p1.mobile.putong.data.DetectCategoryType;
import com.p000p1.mobile.putong.data.FollowshipStatus;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.data.Music;
import com.p000p1.mobile.putong.data.StickerInfo;
import com.p000p1.mobile.putong.data.TopicMomentIdBox;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.CommentInfo;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentMessage;
import com.p000p1.mobile.putong.feed.data.RawFeed;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailFrag;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.app.c;
import com.tantanapp.common.data.CopyObject;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import l.d30;
import l.e30;
import l.e51;
import l.j760;
import l.jq2;
import l.mkd0;
import l.mqi0;
import l.osi0;
import l.qib0;
import l.t100;
import l.tpd0;
import l.uqd0;
import l.vwb;
import l.w9j;
import l.x9j;
import l.xaj0;
import l.zpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ya00 extends jq2<ec00> {

    /* JADX INFO: renamed from: K */
    public static zpd0 f15332K = new zpd0("change_greet_selection_box_last_time_" + FeedModule.m1139F().userId(), 0L);

    /* JADX INFO: renamed from: A */
    public String f15333A;

    /* JADX INFO: renamed from: B */
    public boolean f15334B;

    /* JADX INFO: renamed from: C */
    public boolean f15335C;

    /* JADX INFO: renamed from: D */
    public uqd0 f15336D;

    /* JADX INFO: renamed from: E */
    public zpd0 f15337E;

    /* JADX INFO: renamed from: F */
    public tpd0 f15338F;

    /* JADX INFO: renamed from: G */
    public boolean f15339G;

    /* JADX INFO: renamed from: H */
    public List<String> f15340H;

    /* JADX INFO: renamed from: I */
    public StickerInfo f15341I;

    /* JADX INFO: renamed from: J */
    public boolean f15342J;

    /* JADX INFO: renamed from: a */
    public MomentDetailFrag f15343a;

    /* JADX INFO: renamed from: b */
    public Act f15344b;

    /* JADX INFO: renamed from: c */
    public List<e30<Boolean>> f15345c;

    /* JADX INFO: renamed from: d */
    public hx60 f15346d;

    /* JADX INFO: renamed from: e */
    public Moment f15347e;

    /* JADX INFO: renamed from: f */
    public RawFeed f15348f;

    /* JADX INFO: renamed from: g */
    public List<MomentMessage> f15349g;

    /* JADX INFO: renamed from: h */
    public List<StickerInfo> f15350h;

    /* JADX INFO: renamed from: i */
    public Links f15351i;

    /* JADX INFO: renamed from: j */
    public String f15352j;

    /* JADX INFO: renamed from: k */
    public String f15353k;

    /* JADX INFO: renamed from: l */
    public MomentMessage f15354l;

    /* JADX INFO: renamed from: m */
    public String f15355m;

    /* JADX INFO: renamed from: n */
    public String f15356n;

    /* JADX INFO: renamed from: o */
    public String f15357o;

    /* JADX INFO: renamed from: p */
    public String f15358p;

    /* JADX INFO: renamed from: q */
    public boolean f15359q;

    /* JADX INFO: renamed from: r */
    public int f15360r;

    /* JADX INFO: renamed from: s */
    public boolean f15361s;

    /* JADX INFO: renamed from: t */
    public boolean f15362t;

    /* JADX INFO: renamed from: u */
    public boolean f15363u;

    /* JADX INFO: renamed from: v */
    public final String f15364v;

    /* JADX INFO: renamed from: w */
    public boolean f15365w;

    /* JADX INFO: renamed from: x */
    public boolean f15366x;

    /* JADX INFO: renamed from: y */
    public String f15367y;

    /* JADX INFO: renamed from: z */
    public boolean f15368z;

    public ya00(MomentDetailFrag momentDetailFrag) {
        super(momentDetailFrag);
        this.f15345c = new ArrayList();
        this.f15349g = new LinkedList();
        this.f15350h = new LinkedList();
        this.f15356n = "";
        this.f15360r = 0;
        this.f15362t = true;
        this.f15363u = false;
        this.f15336D = new uqd0("show_tips_moment_ids_" + FeedModule.m1139F().userId(), "");
        this.f15337E = new zpd0("show_tips_last_time_" + FeedModule.m1139F().userId(), 0L);
        this.f15338F = new tpd0("show_tips_last_count_" + FeedModule.m1139F().userId(), 0);
        this.f15340H = new ArrayList();
        this.f15341I = null;
        this.f15342J = false;
        this.f15343a = momentDetailFrag;
        this.f15344b = momentDetailFrag.act();
        Bundle arguments = momentDetailFrag.getArguments();
        this.f15352j = arguments.getString("from");
        this.f15353k = arguments.getString("enterPage");
        this.f15357o = arguments.getString("momentId");
        this.f15362t = arguments.getBoolean("autoPlay", true);
        this.f15358p = arguments.getString("momentOwner");
        this.f15359q = arguments.getBoolean("isHideComment", false);
        this.f15360r = arguments.getInt("initMediaIndex", 0);
        this.f15365w = arguments.getBoolean("canGreeting", false);
        this.f15366x = momentDetailFrag.getArguments().getBoolean("start_home_card");
        this.f15364v = arguments.getString("momentValue");
        this.f15367y = arguments.getString("msg_id");
        this.f15368z = arguments.getBoolean("showInput", false);
        Serializable serializable = arguments.getSerializable("rawFeed");
        if (serializable instanceof RawFeed) {
            this.f15348f = (RawFeed) serializable;
        }
        this.f15333A = arguments.getString("clickedMsgId");
    }

    /* JADX INFO: renamed from: I1 */
    private List<MomentMessage> m17006I1(List<MomentMessage> list) {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f15347e.messages.ids) {
            MomentMessage momentMessage = (MomentMessage) vwb.r(list, new w9j() { // from class: l.ga00
                public final Object call(Object obj) {
                    return Boolean.valueOf(str.equals(((CopyObject) ((MomentMessage) obj)).id));
                }
            });
            if (NullChecker.a(momentMessage)) {
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
    private void m17007J1(Moment moment, Music music) {
        if (music == null || vwb.J(moment.media) || !(moment.media.get(0) instanceof Video)) {
            return;
        }
        ((Video) moment.media.get(0)).music = music;
    }

    /* JADX INFO: renamed from: L0 */
    private String m17008L0() {
        String strM15563a = vs0.m15563a(this.f15347e, this.f15346d.mo10741m(FeedModule.m1139F().userId()).name);
        User userMo10741m = this.f15346d.mo10741m(this.f15355m);
        List<String> listM14041g = s7i.m14041g(((ec00) ((jq2) this).viewModel).f7314p.getPaint(), m17048P0(), strM15563a, vs0.m15563a(this.f15347e, userMo10741m == null ? "" : userMo10741m.name), new x9j() { // from class: l.ea00
            public final Object call(Object obj, Object obj2) {
                return this.f7263a.m17009N0((String) obj, (String) obj2);
            }
        });
        return m17009N0(listM14041g.get(0), listM14041g.get(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public String m17009N0(String str, String str2) {
        return str + this.f15343a.getString(R$string.f482a3) + str2 + ": ";
    }

    /* JADX INFO: renamed from: Q0 */
    private void m17010Q0(final String str) {
        qib0.Z.Q(str, "p_user_passive_show_nearby").subscribe(mkd0.H(new e30() { // from class: l.la00
            public final void call(Object obj) {
                this.f9969a.m17052V0(str, (Boolean) obj);
            }
        }, new e30() { // from class: l.ma00
            public final void call(Object obj) {
                ya00.m17016f0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public /* synthetic */ void m17011W0(c cVar) {
        List<TopicMomentIdBox> list;
        if (cVar != c.i) {
            if (cVar == c.m) {
                this.f15345c = null;
            }
        } else if (((ec00) ((jq2) this).viewModel).m9787g0()) {
            j760 j760VarA = j760.a("qa_optional", (NullChecker.a(this.f15347e) && this.f15347e.shareMyVote) ? "1" : "0");
            Moment moment = this.f15347e;
            p6j0.m12915e("e_moment", "p_user_moment_interactions_details_view", j760VarA, j760.a("topic_id", (moment == null || (list = moment.topics) == null || list.size() == 0) ? "" : this.f15347e.topics.get(0).f285id), j760.a("moment_id", this.f15357o), j760.a("owner_id", this.f15358p), j760.a("moment_distance", Long.valueOf(vqg.m15477G(this.f15347e))), j760.a("moment_create_time", Long.valueOf(vqg.m15475F(this.f15347e))), j760.a("owner_active_time", Long.valueOf(vqg.m15495S(FeedModule.f316d.m16628e8(this.f15358p)))), j760.a("moment_type", zi60.m17436w().m17467y(this.f15347e)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public /* synthetic */ void m17012X0(Boolean bool) {
        this.f15339G = bool.booleanValue();
        if (nkg.m12209G()) {
            ((ec00) ((jq2) this).viewModel).m9784e1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public /* synthetic */ void m17013Y0(Bundle bundle) {
        ((ec00) ((jq2) this).viewModel).m9781c0();
        ((ec00) ((jq2) this).viewModel).m9758P();
        this.f15346d.mo5610o();
        ((ec00) ((jq2) this).viewModel).m9774Y(this.f15346d);
        if (!TextUtils.isEmpty(this.f15367y) && !this.f15367y.equals("0")) {
            ((c370) this.f15346d).m9079Q(this.f15367y);
        }
        if (nkg.m12210H() || nkg.m12209G()) {
            vqg.m15467B(this.f15344b, this.f15358p, new e30() { // from class: l.sa00
                public final void call(Object obj) {
                    this.f12850a.m17012X0((Boolean) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public /* synthetic */ void m17014a1() {
        ((ec00) ((jq2) this).viewModel).m9760Q();
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m17016f0(Throwable th) {
    }

    /* JADX INFO: renamed from: t1 */
    private void m17031t1(Moment moment) {
        ((ec00) ((jq2) this).viewModel).m9772W0(!TEnum.equals(moment.status(), "normal"));
        if (!moment.media.isEmpty() && moment.media.size() == 1 && (moment.media.get(0) instanceof Video) && this.f15362t) {
            this.f15362t = true;
        }
        new HashMap().put(((DbObject) moment).id, Integer.valueOf(this.f15360r));
        ((ec00) ((jq2) this).viewModel).m9773X0(this.f15346d, this.f15352j);
    }

    /* JADX INFO: renamed from: B1 */
    public final void m17036B1(MomentMessage momentMessage, boolean z, Throwable th, String str) {
        String str2;
        boolean zIsChildComment = momentMessage.isChildComment();
        if (TEnum.equals(momentMessage.messageType, "sticker")) {
            str2 = "gif";
        } else {
            str2 = TEnum.equals(momentMessage.messageType, "picture") ? "picture" : "text";
        }
        p6j0.m12916f("e_comment_send", "p_user_moment_interactions_details_view", p6j0.C2456a.m12922g("moment_id", ((DbObject) this.f15347e).id), p6j0.C2456a.m12922g("owner_id", this.f15347e.owner), p6j0.C2456a.m12922g("comment_id", str), p6j0.C2456a.m12922g("comment_type", str2), p6j0.C2456a.m12922g("comment_user_id", FeedModule.m1139F().userId()), p6j0.C2456a.m12922g("comment_state", z ? "success" : "fail"), p6j0.C2456a.m12922g("comment_detail", zIsChildComment ? "reply" : "comment"), th == null ? null : p6j0.C2456a.m12922g("error", th.toString()));
    }

    /* JADX INFO: renamed from: C1 */
    public void m17037C1(Act act, String str, String str2, String str3) {
        if (this.f15342J) {
            str = str + "【图片评论】";
        }
        FeedModule.m1140H().Vk(act, str, str2, str3, str2, Channel.get(Channel.comment_forward), new e30() { // from class: l.ia00
            public final void call(Object obj) {
                this.f8970a.m17065m1((Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D1 */
    public void m17038D1(String str) {
        if (this.f15340H.contains(str)) {
            return;
        }
        this.f15340H.add(str);
    }

    /* JADX INFO: renamed from: E1 */
    public String m17039E1(MomentMessage momentMessage, String str) {
        if (!NullChecker.a(momentMessage)) {
            return act().getString(R$string.f463X2);
        }
        this.f15354l = momentMessage;
        this.f15355m = momentMessage.owner;
        this.f15356n = str;
        return m17008L0();
    }

    /* JADX INFO: renamed from: F1 */
    public boolean m17040F1() {
        return ((Long) f15332K.get()).longValue() != 0 && a5i.m8412l(((Long) f15332K.get()).longValue(), mqi0.o());
    }

    /* JADX INFO: renamed from: G0 */
    public void m17041G0(e30<Boolean> e30Var) {
        this.f15345c.add(e30Var);
    }

    /* JADX INFO: renamed from: H0 */
    public boolean m17042H0() {
        if (!NullChecker.a(this.f15347e)) {
            return true;
        }
        User userM16628e8 = FeedModule.f316d.m16628e8(this.f15347e.owner);
        if (this.f15347e.owner.equals(FeedModule.m1139F().userId())) {
            return false;
        }
        if (NullChecker.a(userM16628e8) && NullChecker.a(userM16628e8.localFollowship)) {
            return (TEnum.equals(userM16628e8.localFollowship.state, "matched") || TEnum.equals(userM16628e8.localFollowship.state, FollowshipStatus.following)) ? false : true;
        }
        return true;
    }

    /* JADX INFO: renamed from: H1 */
    public void m17043H1(List<MomentMessage> list) {
        this.f15349g.clear();
        this.f15349g.addAll(list);
    }

    /* JADX INFO: renamed from: I0 */
    public boolean m17044I0() {
        if (nkg.m12227Y() || !m17042H0()) {
            return false;
        }
        if (m17051U0()) {
            return true;
        }
        if (((Integer) this.f15338F.get()).intValue() == 3) {
            return false;
        }
        for (String str : ((String) this.f15336D.get()).split(",")) {
            if (str.equals(this.f15357o)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: J0 */
    public final void m17045J0() {
        Moment moment;
        if (this.f15334B || (moment = this.f15347e) == null || vwb.J(moment.media) || !NullChecker.a(this.f15345c)) {
            return;
        }
        this.f15334B = true;
        this.f15335C = true;
        Iterator<e30<Boolean>> it = this.f15345c.iterator();
        while (it.hasNext()) {
            it.next().call(Boolean.valueOf(this.f15347e.media.get(0) instanceof Video));
        }
    }

    /* JADX INFO: renamed from: L1 */
    public void m17046L1() {
        if (this.f15357o == null) {
            return;
        }
        if (m17051U0()) {
            this.f15337E.put(Long.valueOf(mqi0.o()));
            this.f15338F.put(1);
            this.f15336D.put(this.f15357o);
            return;
        }
        this.f15338F.put(Integer.valueOf(((Integer) this.f15338F.get()).intValue() + 1));
        this.f15336D.put(((String) this.f15336D.get()) + "," + this.f15357o);
    }

    /* JADX INFO: renamed from: O0 */
    public Moment m17047O0() {
        return this.f15346d.mo10752y(this.f15357o);
    }

    /* JADX INFO: renamed from: P0 */
    public float m17048P0() {
        return t100.d(24.0f) + ((ec00) ((jq2) this).viewModel).f7316r.getMeasuredWidth();
    }

    /* JADX INFO: renamed from: R0 */
    public void m17049R0() {
        c370 c370Var = new c370(this.f15343a, this.f15358p, this.f15357o, this.f15359q, this.f15352j);
        this.f15346d = c370Var;
        Moment momentMo10752y = c370Var.mo10752y(this.f15357o);
        this.f15347e = momentMo10752y;
        if (NullChecker.a(momentMo10752y)) {
            this.f15347e.momentValue = this.f15364v;
        }
        if (NullChecker.a(this.f15347e)) {
            m17031t1(this.f15347e);
        }
    }

    /* JADX INFO: renamed from: S0 */
    public boolean m17050S0() {
        if (!NullChecker.a(vwb.r(vqg.f14276i, new w9j() { // from class: l.ra00
            public final Object call(Object obj) {
                return this.f12570a.m17054b1((String) obj);
            }
        }))) {
            return this.f15339G;
        }
        this.f15339G = false;
        return false;
    }

    /* JADX INFO: renamed from: U0 */
    public final boolean m17051U0() {
        return ((Long) this.f15337E.get()).longValue() == 0 || !a5i.m8412l(((Long) this.f15337E.get()).longValue(), mqi0.o());
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m17052V0(String str, Boolean bool) {
        if (bool.booleanValue()) {
            v1h.m15207J0(act(), str);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m17053a0() {
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.z900
            public final void call(Object obj) {
                this.f15664a.m17011W0((c) obj);
            }
        }));
        creates(new e30() { // from class: l.ka00
            public final void call(Object obj) {
                this.f9652a.m17013Y0((Bundle) obj);
            }
        }, new d30() { // from class: l.qa00
            public final void call() {
                this.f12173a.m17014a1();
            }
        });
    }

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ Boolean m17054b1(String str) {
        return Boolean.valueOf(TextUtils.equals(str, this.f15358p));
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ Boolean m17055c1(MomentMessage momentMessage) {
        return Boolean.valueOf(!this.f15349g.contains(momentMessage));
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ Boolean m17056d1(MomentMessage momentMessage) {
        return Boolean.valueOf(this.f15333A.equals(((CopyObject) momentMessage).id));
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m17057e1(MomentMessage momentMessage) {
        ((ec00) ((jq2) this).viewModel).m9789h1(momentMessage, this.f15333A);
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m17058f1() {
        ((ec00) ((jq2) this).viewModel).m9775Y0(t100.Q);
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m17059g1() {
        ((ec00) ((jq2) this).viewModel).m9786f1();
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m17060h1(String str, final MomentMessage momentMessage, final d30 d30Var) {
        duringCreated(this.f15346d.mo10737i(str, momentMessage)).subscribe(mkd0.H(new e30() { // from class: l.oa00
            public final void call(Object obj) {
                this.f11398a.m17061i1(d30Var, momentMessage, (MomentMessage) obj);
            }
        }, new e30() { // from class: l.pa00
            public final void call(Object obj) {
                this.f11741a.m17062j1(momentMessage, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i1 */
    public final /* synthetic */ void m17061i1(d30 d30Var, MomentMessage momentMessage, MomentMessage momentMessage2) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
        this.f15355m = null;
        this.f15354l = null;
        if (NullChecker.b(this.f15347e)) {
            m17036B1(momentMessage, true, null, ((CopyObject) momentMessage2).id);
        }
    }

    /* JADX INFO: renamed from: j1 */
    public final /* synthetic */ void m17062j1(MomentMessage momentMessage, Throwable th) {
        if (NullChecker.b(this.f15347e)) {
            m17036B1(momentMessage, false, th, "");
        }
        if (momentMessage.isChildComment()) {
            ((ec00) ((jq2) this).viewModel).m9762R(momentMessage);
        }
        if (this.f15349g.contains(momentMessage)) {
            this.f15349g.remove(momentMessage);
            ((ec00) ((jq2) this).viewModel).m9757O0(this.f15349g);
        }
        App.d.k(th);
        t2h.m14425e(th);
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ void m17063k1(String str, String str2, d30 d30Var, StickerInfo stickerInfo) {
        if (TextUtils.isEmpty(((DbObject) stickerInfo).id)) {
            return;
        }
        m17075z1(str, str2, d30Var, stickerInfo);
    }

    /* JADX INFO: renamed from: l1 */
    public final /* synthetic */ void m17064l1(MomentMessage momentMessage, d30 d30Var) {
        m17073v1(this.f15358p, momentMessage, d30Var);
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ void m17065m1(Boolean bool) {
        if (act() != null) {
            Act act = act();
            Objects.requireNonNull(act);
            if (act.isDestroyed()) {
                return;
            }
            Act act2 = act();
            Objects.requireNonNull(act2);
            if (!act2.isFinishing() && bool.booleanValue()) {
                PhotoAlbumFeedFrag.m5438l5(this.f15358p, false);
                if (NullChecker.a(this.f15347e)) {
                    this.f15347e.showGreetView = false;
                }
                this.f15339G = false;
                vqg.f14276i.add(this.f15358p);
            }
        }
    }

    /* JADX INFO: renamed from: n1 */
    public void m17066n1() {
        ((ec00) ((jq2) this).viewModel).m9759P0(this.f15349g, this.f15350h);
    }

    /* JADX INFO: renamed from: o1 */
    public void m17067o1(final MomentMessage momentMessage) {
        String str = momentMessage.moment;
        if (str == null || !str.equals(this.f15357o)) {
            return;
        }
        MomentMessage momentMessage2 = (MomentMessage) vwb.r(this.f15349g, new w9j() { // from class: l.da00
            public final Object call(Object obj) {
                return Boolean.valueOf(((CopyObject) momentMessage).id.equals(((CopyObject) ((MomentMessage) obj)).id));
            }
        });
        if (NullChecker.a(momentMessage2)) {
            this.f15349g.remove(momentMessage2);
        }
        momentMessage.isNewComment = true;
        this.f15349g.add(0, momentMessage);
        ((ec00) ((jq2) this).viewModel).m9759P0(this.f15349g, this.f15350h);
    }

    /* JADX INFO: renamed from: p1 */
    public void m17068p1(final MomentMessage momentMessage) {
        if (momentMessage.moment.equals(this.f15357o)) {
            int iG = vwb.G(this.f15349g, new w9j() { // from class: l.ta00
                public final Object call(Object obj) {
                    return Boolean.valueOf(((CopyObject) momentMessage).id.equals(((CopyObject) ((MomentMessage) obj)).id));
                }
            });
            if (iG != -1) {
                this.f15349g.remove(iG);
                ((ec00) ((jq2) this).viewModel).m9765S0(momentMessage);
            }
            ((ec00) ((jq2) this).viewModel).m9757O0(this.f15349g);
        }
    }

    /* JADX INFO: renamed from: q1 */
    public void m17069q1(xaj0<Links, List<MomentMessage>, List<StickerInfo>> xaj0Var) {
        this.f15351i = (Links) xaj0Var.a;
        if (NullChecker.a(xaj0Var.b)) {
            this.f15349g.addAll(vwb.n((Collection) xaj0Var.b, new w9j() { // from class: l.fa00
                public final Object call(Object obj) {
                    return this.f8046a.m17055c1((MomentMessage) obj);
                }
            }));
            if (!vwb.J((Collection) xaj0Var.c)) {
                this.f15350h.addAll((Collection) xaj0Var.c);
            }
            ((ec00) ((jq2) this).viewModel).m9759P0(this.f15349g, this.f15350h);
        }
    }

    /* JADX INFO: renamed from: r1 */
    public void m17070r1(j760<List<StickerInfo>, List<MomentMessage>> j760Var) {
        if (vwb.J((Collection) j760Var.b)) {
            return;
        }
        List<MomentMessage> arrayList = new ArrayList<>();
        Iterator it = ((List) j760Var.b).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            final MomentMessage momentMessage = (MomentMessage) it.next();
            if (!momentMessage.isChildComment()) {
                boolean zJ = vwb.J(this.f15349g);
                List<MomentMessage> list = this.f15349g;
                if (!zJ) {
                    this.f15349g.remove((MomentMessage) vwb.r(list, new w9j() { // from class: l.ua00
                        public final Object call(Object obj) {
                            return Boolean.valueOf(((CopyObject) momentMessage).id.equals(((CopyObject) ((MomentMessage) obj)).id));
                        }
                    }));
                    this.f15349g.add(0, momentMessage);
                    ((List) j760Var.b).remove(momentMessage);
                    arrayList = ((ec00) ((jq2) this).viewModel).m9768U(((CopyObject) momentMessage).id);
                    break;
                }
                list.add(0, momentMessage);
                ((List) j760Var.b).remove(momentMessage);
                break;
            }
        }
        for (int size = (arrayList != null ? arrayList.size() : 0) - 1; size >= 0; size--) {
            MomentMessage momentMessage2 = arrayList.get(size);
            this.f15349g.remove(momentMessage2);
            ((ec00) ((jq2) this).viewModel).m9765S0(momentMessage2);
        }
        this.f15349g.addAll((Collection) j760Var.b);
        if (!TextUtils.isEmpty(this.f15367y)) {
            ((ec00) ((jq2) this).viewModel).m9777Z0(((List) j760Var.b).size() + 1);
        }
        boolean zJ2 = vwb.J(this.f15350h);
        Object obj = j760Var.a;
        if (zJ2) {
            if (!vwb.J((Collection) obj)) {
                this.f15350h.addAll((Collection) j760Var.a);
            }
        } else if (!vwb.J((Collection) obj)) {
            for (final StickerInfo stickerInfo : (List) j760Var.a) {
                StickerInfo stickerInfo2 = (StickerInfo) vwb.r(this.f15350h, new w9j() { // from class: l.va00
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(((DbObject) stickerInfo).id.equals(((DbObject) ((StickerInfo) obj2)).id));
                    }
                });
                if (stickerInfo2 != null) {
                    this.f15350h.remove(stickerInfo2);
                }
                this.f15350h.add(stickerInfo);
            }
        }
        ((ec00) ((jq2) this).viewModel).m9759P0(this.f15349g, this.f15350h);
    }

    /* JADX INFO: renamed from: s1 */
    public void m17071s1(xaj0<Moment, j760<List<StickerInfo>, List<MomentMessage>>, j760<Music, RawFeed>> xaj0Var) {
        if (((ec00) ((jq2) this).viewModel).m9769U0(xaj0Var)) {
            Object obj = xaj0Var.c;
            if (((j760) obj).b != null) {
                this.f15348f = (RawFeed) ((j760) obj).b;
            }
            Moment moment = this.f15347e;
            if (moment == null) {
                Object obj2 = xaj0Var.a;
                this.f15347e = (Moment) obj2;
                ((ec00) ((jq2) this).viewModel).m9763R0((Moment) obj2);
                m17007J1(this.f15347e, (Music) ((j760) xaj0Var.c).a);
                m17031t1(this.f15347e);
            } else {
                m17007J1(moment, (Music) ((j760) obj).a);
                Object obj3 = xaj0Var.a;
                this.f15347e = (Moment) obj3;
                ((ec00) ((jq2) this).viewModel).m9763R0((Moment) obj3);
                ((ec00) ((jq2) this).viewModel).m9773X0(this.f15346d, this.f15352j);
            }
            Object obj4 = xaj0Var.a;
            this.f15351i = ((Moment) obj4).messages.links;
            ((ec00) ((jq2) this).viewModel).m9761Q0(((Moment) obj4).messages.links);
            if (vwb.J(this.f15349g)) {
                this.f15349g.clear();
                this.f15349g.addAll(m17006I1((List) ((j760) xaj0Var.b).b));
            } else {
                for (final MomentMessage momentMessage : m17006I1((List) ((j760) xaj0Var.b).b)) {
                    if (vwb.r(this.f15349g, new w9j() { // from class: l.wa00
                        public final Object call(Object obj5) {
                            return Boolean.valueOf(((CopyObject) momentMessage).id.equals(((CopyObject) ((MomentMessage) obj5)).id));
                        }
                    }) == null) {
                        this.f15349g.add(momentMessage);
                    }
                }
            }
            if (NullChecker.a(((j760) xaj0Var.b).a)) {
                this.f15350h.addAll((Collection) ((j760) xaj0Var.b).a);
            }
            ((ec00) ((jq2) this).viewModel).m9759P0(this.f15349g, this.f15350h);
            if (NullChecker.a(((j760) xaj0Var.c).b)) {
                this.f15365w = ((RawFeed) ((j760) xaj0Var.c).b).canGreeting;
            }
            m17045J0();
            if (TextUtils.isEmpty(this.f15333A)) {
                if (this.f15368z) {
                    e51.I(this.f15343a, new Runnable() { // from class: l.ca00
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f6579a.m17059g1();
                        }
                    }, 20L);
                }
            } else {
                final MomentMessage momentMessage2 = (MomentMessage) vwb.r(this.f15349g, new w9j() { // from class: l.xa00
                    public final Object call(Object obj5) {
                        return this.f14818a.m17056d1((MomentMessage) obj5);
                    }
                });
                if (!NullChecker.a(momentMessage2)) {
                    osi0.g("评论已删除");
                } else {
                    e51.I(this.f15343a, new Runnable() { // from class: l.aa00
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f5676a.m17057e1(momentMessage2);
                        }
                    }, 20L);
                    e51.I(this.f15343a, new Runnable() { // from class: l.ba00
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f6200a.m17058f1();
                        }
                    }, 500L);
                }
            }
        }
    }

    /* JADX INFO: renamed from: u1 */
    public void m17072u1() {
        ((ec00) ((jq2) this).viewModel).m9773X0(this.f15346d, this.f15352j);
    }

    /* JADX INFO: renamed from: v1 */
    public void m17073v1(final String str, final MomentMessage momentMessage, final d30 d30Var) {
        vqg.m15531o(this.f15344b, momentMessage.value, DetectCategoryType.get("comment"), "comment", "p_user_moment_interactions_details_view", new d30() { // from class: l.na00
            public final void call() {
                this.f10722a.m17060h1(str, momentMessage, d30Var);
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public void m17074x1(final String str, final String str2, final d30 d30Var) {
        Object objQh = FeedModule.m1140H().qh(((ec00) ((jq2) this).viewModel).f7296S);
        if (objQh instanceof StickerInfo) {
            StickerInfo stickerInfo = (StickerInfo) objQh;
            if (TextUtils.isEmpty(((DbObject) stickerInfo).id)) {
                FeedModule.m1140H().Fc(this.f15344b, stickerInfo, new e30() { // from class: l.ha00
                    public final void call(Object obj) {
                        this.f8655a.m17063k1(str, str2, d30Var, (StickerInfo) obj);
                    }
                });
                return;
            }
        }
        m17075z1(str, str2, d30Var, objQh);
    }

    /* JADX INFO: renamed from: z1 */
    public void m17075z1(String str, String str2, final d30 d30Var, Object obj) {
        final MomentMessage momentMessage = new MomentMessage();
        momentMessage.value = str;
        momentMessage.moment = this.f15357o;
        momentMessage.owner = FeedModule.m1139F().userId();
        momentMessage.api_only_otherUser = this.f15355m;
        zi60.m17436w();
        momentMessage.momentShowFromType = zi60.m17435D(this.f15352j);
        CommentInfo commentInfoNew_ = CommentInfo.new_();
        commentInfoNew_.parentMessageId = this.f15356n;
        if (NullChecker.a(this.f15354l)) {
            commentInfoNew_.replyMessageId = ((CopyObject) this.f15354l).id;
        }
        this.f15356n = "";
        momentMessage.commentInfo = commentInfoNew_;
        if (!TextUtils.isEmpty(commentInfoNew_.parentMessageId) && NullChecker.a(this.f15354l)) {
            momentMessage.replyCommentId = ((CopyObject) this.f15354l).id;
        }
        if (!vwb.J(this.f15340H)) {
            for (int i = 0; i < this.f15340H.size(); i++) {
                str2 = str2.replace(this.f15340H.get(i), "");
            }
        }
        this.f15341I = null;
        this.f15342J = false;
        this.f15340H.clear();
        if (qib0.Z.K(str2)) {
            v1h.m15189A0(this.f15344b, new d30() { // from class: l.ja00
                public final void call() {
                    this.f9291a.m17064l1(momentMessage, d30Var);
                }
            }, false);
        } else {
            m17073v1(this.f15358p, momentMessage, d30Var);
            m17010Q0(str2);
        }
    }

    public void destroy() {
    }
}
