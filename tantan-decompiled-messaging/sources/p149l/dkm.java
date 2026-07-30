package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.p053ui.notifications.SysnotifListener;
import com.p046p1.mobile.putong.data.DetectCategoryType;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.Music;
import com.p046p1.mobile.putong.data.StickerInfo;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.CommentInfo;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentMessage;
import com.p046p1.mobile.putong.feed.data.RawFeed;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class dkm extends jq2<mkm> {

    /* JADX INFO: renamed from: a */
    public final Act f86668a;

    /* JADX INFO: renamed from: b */
    public hx60 f86669b;

    /* JADX INFO: renamed from: c */
    public Moment f86670c;

    /* JADX INFO: renamed from: d */
    public List<MomentMessage> f86671d;

    /* JADX INFO: renamed from: e */
    public List<StickerInfo> f86672e;

    /* JADX INFO: renamed from: f */
    public Links f86673f;

    /* JADX INFO: renamed from: g */
    public MomentMessage f86674g;

    /* JADX INFO: renamed from: h */
    public String f86675h;

    /* JADX INFO: renamed from: i */
    public String f86676i;

    /* JADX INFO: renamed from: j */
    public String f86677j;

    /* JADX INFO: renamed from: k */
    public String f86678k;

    /* JADX INFO: renamed from: l */
    public boolean f86679l;

    /* JADX INFO: renamed from: m */
    public boolean f86680m;

    /* JADX INFO: renamed from: n */
    public boolean f86681n;

    /* JADX INFO: renamed from: o */
    public boolean f86682o;

    /* JADX INFO: renamed from: p */
    public String f86683p;

    public dkm(Act act) {
        super(act);
        this.f86671d = new LinkedList();
        this.f86672e = new LinkedList();
        this.f86676i = "";
        this.f86681n = true;
        this.f86682o = false;
        this.f86683p = null;
        this.f86668a = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public /* synthetic */ void m112225D0(Bundle bundle) {
        ((mkm) this.viewModel).m155056x();
        ((mkm) this.viewModel).m155050p();
        this.f86669b.mo64519o();
        ((mkm) this.viewModel).m155053u(this.f86669b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public /* synthetic */ void m112226E0() {
        ((mkm) this.viewModel).m155051q();
    }

    /* JADX INFO: renamed from: X0 */
    private void m112227X0(MomentMessage momentMessage, boolean z, Throwable th) {
        p6j0.m167672f("e_comment_send", "p_immersion_comment_page", p6j0.C19147a.m167678g("moment_id", this.f86670c.f56011id), p6j0.C19147a.m167678g("owner_id", this.f86670c.owner), p6j0.C19147a.m167678g("comment_user_id", FeedModule.m60221F().userId()), p6j0.C19147a.m167678g("comment_state", z ? "success" : "fail"), p6j0.C19147a.m167678g("comment_detail", momentMessage.isChildComment() ? SysnotifListener.ACTION_REPLY : "comment"), th == null ? null : p6j0.C19147a.m167678g("error", th.toString()));
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m112236m0(Throwable th) {
    }

    /* JADX INFO: renamed from: y0 */
    private void m112241y0(final String str) {
        qib0.f154711Z.m119131Q(str, "p_user_passive_show_nearby").subscribe(mkd0.m154956H(new e30() { // from class: l.ckm
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f81345a.m112243C0(str, (Boolean) obj);
            }
        }, new e30() { // from class: l.rjm
            @Override // p149l.e30
            public final void call(Object obj) {
                dkm.m112236m0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: A0 */
    public void m112242A0() {
        ((mkm) this.viewModel).m155057y();
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m112243C0(String str, Boolean bool) {
        if (bool.booleanValue()) {
            v1h.m196568J0(this.f86668a, str);
        }
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ Boolean m112244F0(MomentMessage momentMessage) {
        return Boolean.valueOf(!this.f86671d.contains(momentMessage));
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m112245G0(d30 d30Var, MomentMessage momentMessage, MomentMessage momentMessage2) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
        this.f86675h = null;
        this.f86674g = null;
        if (NullChecker.m81304b(this.f86670c)) {
            m112227X0(momentMessage, true, null);
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m112246H0(MomentMessage momentMessage, Throwable th) {
        if (NullChecker.m81304b(this.f86670c)) {
            m112227X0(momentMessage, false, th);
        }
        if (momentMessage.isChildComment()) {
            ((mkm) this.viewModel).m155052s(momentMessage);
        }
        if (this.f86671d.contains(momentMessage)) {
            this.f86671d.remove(momentMessage);
            ((mkm) this.viewModel).m155036J(this.f86671d, this.f86672e);
        }
        App.f15368d.m20433k(th);
        t2h.m186974e(th);
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m112247I0(String str, final MomentMessage momentMessage, final d30 d30Var) {
        this.f86668a.duringCreated(this.f86669b.mo133302i(str, momentMessage)).subscribe(mkd0.m154956H(new e30() { // from class: l.sjm
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f164859a.m112245G0(d30Var, momentMessage, (MomentMessage) obj);
            }
        }, new e30() { // from class: l.tjm
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f170764a.m112246H0(momentMessage, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m112248J0(MomentMessage momentMessage, d30 d30Var) {
        m112257V0(this.f86678k, momentMessage, d30Var);
    }

    /* JADX INFO: renamed from: L0 */
    public void m112249L0() {
        ((mkm) this.viewModel).m155036J(this.f86671d, this.f86672e);
    }

    /* JADX INFO: renamed from: N0 */
    public void m112250N0(final MomentMessage momentMessage) {
        if (momentMessage.moment.equals(this.f86677j)) {
            MomentMessage momentMessage2 = (MomentMessage) vwb.m200346r(this.f86671d, new w9j() { // from class: l.zjm
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(momentMessage.f56008id.equals(((MomentMessage) obj).f56008id));
                }
            });
            if (NullChecker.m81303a(momentMessage2)) {
                this.f86671d.remove(momentMessage2);
            }
            momentMessage.isNewComment = true;
            this.f86671d.add(0, momentMessage);
            ((mkm) this.viewModel).m155035I(this.f86671d);
        }
    }

    /* JADX INFO: renamed from: O0 */
    public void m112251O0(final MomentMessage momentMessage) {
        if (momentMessage.moment.equals(this.f86677j)) {
            int iM200293G = vwb.m200293G(this.f86671d, new w9j() { // from class: l.akm
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(momentMessage.f56008id.equals(((MomentMessage) obj).f56008id));
                }
            });
            if (iM200293G != -1) {
                this.f86671d.remove(iM200293G);
                ((mkm) this.viewModel).m155039M(momentMessage);
            }
            ((mkm) this.viewModel).m155035I(this.f86671d);
        }
    }

    /* JADX INFO: renamed from: P0 */
    public void m112252P0(xaj0<Links, List<MomentMessage>, List<StickerInfo>> xaj0Var) {
        ((mkm) this.viewModel).m155037K(xaj0Var.f191751a);
        this.f86673f = xaj0Var.f191751a;
        if (NullChecker.m81303a(xaj0Var.f191752b)) {
            this.f86671d.addAll(vwb.m200339n(xaj0Var.f191752b, new w9j() { // from class: l.xjm
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f193231a.m112244F0((MomentMessage) obj);
                }
            }));
            if (!vwb.m200296J(xaj0Var.f191753c)) {
                this.f86672e.addAll(xaj0Var.f191753c);
            }
            ((mkm) this.viewModel).m155036J(this.f86671d, this.f86672e);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public void m112253Q0() {
        ((mkm) this.viewModel).m155040N();
    }

    /* JADX INFO: renamed from: R0 */
    public void m112254R0(xaj0<Moment, j760<List<StickerInfo>, List<MomentMessage>>, j760<Music, RawFeed>> xaj0Var) {
        if (((mkm) this.viewModel).m155041O(xaj0Var)) {
            Moment moment = this.f86670c;
            if (moment == null) {
                Moment moment2 = xaj0Var.f191751a;
                this.f86670c = moment2;
                ((mkm) this.viewModel).m155038L(moment2);
                m112263d1(this.f86670c, xaj0Var.f191753c.f116564a);
                m112256U0(this.f86670c);
            } else {
                m112263d1(moment, xaj0Var.f191753c.f116564a);
                Moment moment3 = xaj0Var.f191751a;
                this.f86670c = moment3;
                ((mkm) this.viewModel).m155038L(moment3);
            }
            Moment moment4 = xaj0Var.f191751a;
            this.f86673f = moment4.messages.links;
            ((mkm) this.viewModel).m155037K(moment4.messages.links);
            this.f86671d.clear();
            this.f86671d.addAll(m112262c1(xaj0Var.f191752b.f116565b));
            if (NullChecker.m81303a(xaj0Var.f191752b.f116564a)) {
                this.f86672e.addAll(xaj0Var.f191752b.f116564a);
            }
            ((mkm) this.viewModel).m155036J(this.f86671d, this.f86672e);
        }
    }

    /* JADX INFO: renamed from: S0 */
    public void m112255S0(Throwable th) {
        ((mkm) this.viewModel).m155042P(th);
    }

    /* JADX INFO: renamed from: U0 */
    public final void m112256U0(Moment moment) {
        ((mkm) this.viewModel).m155043Q(!TEnum.equals(moment.status(), "normal"));
        if (!moment.media.isEmpty() && moment.media.size() == 1 && (moment.media.get(0) instanceof Video) && this.f86681n) {
            this.f86681n = true;
        }
    }

    /* JADX INFO: renamed from: V0 */
    public void m112257V0(final String str, final MomentMessage momentMessage, final d30 d30Var) {
        vqg.m199561o(this.f86668a, momentMessage.value, DetectCategoryType.get("comment"), "comment", "p_immersion_comment_page", new d30() { // from class: l.bkm
            @Override // p149l.d30
            public final void call() {
                this.f76055a.m112247I0(str, momentMessage, d30Var);
            }
        });
    }

    /* JADX INFO: renamed from: W0 */
    public void m112258W0(String str, String str2, final d30 d30Var) {
        final MomentMessage momentMessage = new MomentMessage();
        momentMessage.value = str;
        momentMessage.moment = this.f86677j;
        momentMessage.owner = FeedModule.m60221F().userId();
        momentMessage.api_only_otherUser = this.f86675h;
        momentMessage.isCommentFromKanKan = true;
        CommentInfo commentInfoNew_ = CommentInfo.new_();
        String str3 = this.f86676i;
        commentInfoNew_.parentMessageId = str3;
        this.f86676i = "";
        momentMessage.commentInfo = commentInfoNew_;
        if (!TextUtils.isEmpty(str3) && NullChecker.m81303a(this.f86674g)) {
            momentMessage.replyCommentId = this.f86674g.f56008id;
        }
        if (qib0.f154711Z.m119125K(str2)) {
            v1h.m196550A0(this.f86668a, new d30() { // from class: l.yjm
                @Override // p149l.d30
                public final void call() {
                    this.f198641a.m112248J0(momentMessage, d30Var);
                }
            }, false);
        } else {
            m112257V0(this.f86678k, momentMessage, d30Var);
            m112241y0(str2);
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public String m112259Y0(MomentMessage momentMessage, String str) {
        if (!NullChecker.m81303a(momentMessage)) {
            return this.f86668a.getString(R$string.f39002X2);
        }
        this.f86674g = momentMessage;
        this.f86675h = momentMessage.owner;
        this.f86676i = str;
        return m112265s0();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.qjm
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f154952a.m112225D0((Bundle) obj);
            }
        }, new d30() { // from class: l.ujm
            @Override // p149l.d30
            public final void call() {
                this.f176781a.m112226E0();
            }
        });
    }

    /* JADX INFO: renamed from: a1 */
    public void m112260a1(MomentMessage momentMessage, String str) {
        ((mkm) this.viewModel).m155045S(momentMessage, str);
    }

    /* JADX INFO: renamed from: b1 */
    public void m112261b1(List<MomentMessage> list) {
        this.f86671d.clear();
        this.f86671d.addAll(list);
    }

    /* JADX INFO: renamed from: c1 */
    public final List<MomentMessage> m112262c1(List<MomentMessage> list) {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f86670c.messages.ids) {
            MomentMessage momentMessage = (MomentMessage) vwb.m200346r(list, new w9j() { // from class: l.wjm
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

    /* JADX INFO: renamed from: d1 */
    public final void m112263d1(Moment moment, Music music) {
        if (music == null || vwb.m200296J(moment.media) || !(moment.media.get(0) instanceof Video)) {
            return;
        }
        ((Video) moment.media.get(0)).music = music;
    }

    @Override // p149l.jq2, p149l.q0m
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public void mo51532C(mkm mkmVar) {
        super.mo51532C(mkmVar);
    }

    /* JADX INFO: renamed from: s0 */
    public final String m112265s0() {
        String strM199795a = vs0.m199795a(this.f86670c, this.f86669b.mo133306m(FeedModule.m60221F().userId()).name);
        User userMo133306m = this.f86669b.mo133306m(this.f86675h);
        List<String> listM182493g = s7i.m182493g(((mkm) this.viewModel).f134346k.getPaint(), m112268x0(), strM199795a, vs0.m199795a(this.f86670c, userMo133306m == null ? "" : userMo133306m.name), new x9j() { // from class: l.vjm
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return this.f181739a.m112266t0((String) obj, (String) obj2);
            }
        });
        return m112266t0(listM182493g.get(0), listM182493g.get(1));
    }

    /* JADX INFO: renamed from: t0 */
    public final String m112266t0(String str, String str2) {
        return str + this.f86668a.getString(R$string.f39021a3) + str2 + ": ";
    }

    /* JADX INFO: renamed from: u0 */
    public Moment m112267u0() {
        return this.f86669b.mo133317y(this.f86677j);
    }

    /* JADX INFO: renamed from: x0 */
    public float m112268x0() {
        return t100.m186890d(24.0f) + ((mkm) this.viewModel).f134347l.getMeasuredWidth();
    }

    /* JADX INFO: renamed from: z0 */
    public void m112269z0() {
        wkm wkmVar = new wkm(this.f86668a, this, this.f86678k, this.f86677j);
        this.f86669b = wkmVar;
        Moment momentMo133317y = wkmVar.mo133317y(this.f86677j);
        this.f86670c = momentMo133317y;
        if (NullChecker.m81303a(momentMo133317y)) {
            Moment moment = this.f86670c;
            moment.momentValue = this.f86683p;
            m112256U0(moment);
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
