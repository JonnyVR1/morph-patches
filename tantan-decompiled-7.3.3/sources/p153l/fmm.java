package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.p058ui.notifications.SysnotifListener;
import com.p051p1.mobile.putong.data.DetectCategoryType;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.Music;
import com.p051p1.mobile.putong.data.StickerInfo;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.CommentInfo;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentMessage;
import com.p051p1.mobile.putong.feed.data.RawFeed;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class fmm extends ar2<omm> {

    /* JADX INFO: renamed from: a */
    public final Act f99797a;

    /* JADX INFO: renamed from: b */
    public n570 f99798b;

    /* JADX INFO: renamed from: c */
    public Moment f99799c;

    /* JADX INFO: renamed from: d */
    public List<MomentMessage> f99800d;

    /* JADX INFO: renamed from: e */
    public List<StickerInfo> f99801e;

    /* JADX INFO: renamed from: f */
    public Links f99802f;

    /* JADX INFO: renamed from: g */
    public MomentMessage f99803g;

    /* JADX INFO: renamed from: h */
    public String f99804h;

    /* JADX INFO: renamed from: i */
    public String f99805i;

    /* JADX INFO: renamed from: j */
    public String f99806j;

    /* JADX INFO: renamed from: k */
    public String f99807k;

    /* JADX INFO: renamed from: l */
    public boolean f99808l;

    /* JADX INFO: renamed from: m */
    public boolean f99809m;

    /* JADX INFO: renamed from: n */
    public boolean f99810n;

    /* JADX INFO: renamed from: o */
    public boolean f99811o;

    /* JADX INFO: renamed from: p */
    public String f99812p;

    public fmm(Act act) {
        super(act);
        this.f99800d = new LinkedList();
        this.f99801e = new LinkedList();
        this.f99805i = "";
        this.f99810n = true;
        this.f99811o = false;
        this.f99812p = null;
        this.f99797a = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public /* synthetic */ void m126273D0(Bundle bundle) {
        ((omm) this.viewModel).m168273x();
        ((omm) this.viewModel).m168267p();
        this.f99798b.mo65702o();
        ((omm) this.viewModel).m168270u(this.f99798b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public /* synthetic */ void m126274E0() {
        ((omm) this.viewModel).m168268q();
    }

    /* JADX INFO: renamed from: X0 */
    private void m126275X0(MomentMessage momentMessage, boolean z, Throwable th) {
        tfj0.m190943f("e_comment_send", "p_immersion_comment_page", tfj0.C20302a.m190949g("moment_id", this.f99799c.f56859id), tfj0.C20302a.m190949g("owner_id", this.f99799c.owner), tfj0.C20302a.m190949g("comment_user_id", FeedModule.m61405F().userId()), tfj0.C20302a.m190949g("comment_state", z ? "success" : "fail"), tfj0.C20302a.m190949g("comment_detail", momentMessage.isChildComment() ? SysnotifListener.ACTION_REPLY : "comment"), th == null ? null : tfj0.C20302a.m190949g("error", th.toString()));
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m126284m0(Throwable th) {
    }

    /* JADX INFO: renamed from: y0 */
    private void m126289y0(final String str) {
        uqb0.f180394Z.m95960Q(str, "p_user_passive_show_nearby").subscribe(psd0.m173597H(new y20() { // from class: l.emm
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f94671a.m126291C0(str, (Boolean) obj);
            }
        }, new y20() { // from class: l.tlm
            @Override // p153l.y20
            public final void call(Object obj) {
                fmm.m126284m0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: A0 */
    public void m126290A0() {
        ((omm) this.viewModel).m168274y();
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m126291C0(String str, Boolean bool) {
        if (bool.booleanValue()) {
            k3h.m148045J0(this.f99797a, str);
        }
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ Boolean m126292F0(MomentMessage momentMessage) {
        return Boolean.valueOf(!this.f99800d.contains(momentMessage));
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m126293G0(x20 x20Var, MomentMessage momentMessage, MomentMessage momentMessage2) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
        this.f99804h = null;
        this.f99803g = null;
        if (NullChecker.m82487b(this.f99799c)) {
            m126275X0(momentMessage, true, null);
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m126294H0(MomentMessage momentMessage, Throwable th) {
        if (NullChecker.m82487b(this.f99799c)) {
            m126275X0(momentMessage, false, th);
        }
        if (momentMessage.isChildComment()) {
            ((omm) this.viewModel).m168269s(momentMessage);
        }
        if (this.f99800d.contains(momentMessage)) {
            this.f99800d.remove(momentMessage);
            ((omm) this.viewModel).m168253J(this.f99800d, this.f99801e);
        }
        App.f16087d.m21432k(th);
        i4h.m138536e(th);
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m126295I0(String str, final MomentMessage momentMessage, final x20 x20Var) {
        this.f99797a.duringCreated(this.f99798b.mo137267i(str, momentMessage)).subscribe(psd0.m173597H(new y20() { // from class: l.ulm
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f179520a.m126293G0(x20Var, momentMessage, (MomentMessage) obj);
            }
        }, new y20() { // from class: l.vlm
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f184615a.m126294H0(momentMessage, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m126296J0(MomentMessage momentMessage, x20 x20Var) {
        m126305V0(this.f99807k, momentMessage, x20Var);
    }

    /* JADX INFO: renamed from: L0 */
    public void m126297L0() {
        ((omm) this.viewModel).m168253J(this.f99800d, this.f99801e);
    }

    /* JADX INFO: renamed from: N0 */
    public void m126298N0(final MomentMessage momentMessage) {
        if (momentMessage.moment.equals(this.f99806j)) {
            MomentMessage momentMessage2 = (MomentMessage) jyb.m147529r(this.f99800d, new qcj() { // from class: l.bmm
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(momentMessage.f56856id.equals(((MomentMessage) obj).f56856id));
                }
            });
            if (NullChecker.m82486a(momentMessage2)) {
                this.f99800d.remove(momentMessage2);
            }
            momentMessage.isNewComment = true;
            this.f99800d.add(0, momentMessage);
            ((omm) this.viewModel).m168252I(this.f99800d);
        }
    }

    /* JADX INFO: renamed from: O0 */
    public void m126299O0(final MomentMessage momentMessage) {
        if (momentMessage.moment.equals(this.f99806j)) {
            int iM147476G = jyb.m147476G(this.f99800d, new qcj() { // from class: l.cmm
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(momentMessage.f56856id.equals(((MomentMessage) obj).f56856id));
                }
            });
            if (iM147476G != -1) {
                this.f99800d.remove(iM147476G);
                ((omm) this.viewModel).m168256M(momentMessage);
            }
            ((omm) this.viewModel).m168252I(this.f99800d);
        }
    }

    /* JADX INFO: renamed from: P0 */
    public void m126300P0(bkj0<Links, List<MomentMessage>, List<StickerInfo>> bkj0Var) {
        ((omm) this.viewModel).m168254K(bkj0Var.f77081a);
        this.f99802f = bkj0Var.f77081a;
        if (NullChecker.m82486a(bkj0Var.f77082b)) {
            this.f99800d.addAll(jyb.m147522n(bkj0Var.f77082b, new qcj() { // from class: l.zlm
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f204980a.m126292F0((MomentMessage) obj);
                }
            }));
            if (!jyb.m147479J(bkj0Var.f77083c)) {
                this.f99801e.addAll(bkj0Var.f77083c);
            }
            ((omm) this.viewModel).m168253J(this.f99800d, this.f99801e);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public void m126301Q0() {
        ((omm) this.viewModel).m168257N();
    }

    /* JADX INFO: renamed from: R0 */
    public void m126302R0(bkj0<Moment, pf60<List<StickerInfo>, List<MomentMessage>>, pf60<Music, RawFeed>> bkj0Var) {
        if (((omm) this.viewModel).m168258O(bkj0Var)) {
            Moment moment = this.f99799c;
            if (moment == null) {
                Moment moment2 = bkj0Var.f77081a;
                this.f99799c = moment2;
                ((omm) this.viewModel).m168255L(moment2);
                m126311d1(this.f99799c, bkj0Var.f77083c.f152156a);
                m126304U0(this.f99799c);
            } else {
                m126311d1(moment, bkj0Var.f77083c.f152156a);
                Moment moment3 = bkj0Var.f77081a;
                this.f99799c = moment3;
                ((omm) this.viewModel).m168255L(moment3);
            }
            Moment moment4 = bkj0Var.f77081a;
            this.f99802f = moment4.messages.links;
            ((omm) this.viewModel).m168254K(moment4.messages.links);
            this.f99800d.clear();
            this.f99800d.addAll(m126310c1(bkj0Var.f77082b.f152157b));
            if (NullChecker.m82486a(bkj0Var.f77082b.f152156a)) {
                this.f99801e.addAll(bkj0Var.f77082b.f152156a);
            }
            ((omm) this.viewModel).m168253J(this.f99800d, this.f99801e);
        }
    }

    /* JADX INFO: renamed from: S0 */
    public void m126303S0(Throwable th) {
        ((omm) this.viewModel).m168259P(th);
    }

    /* JADX INFO: renamed from: U0 */
    public final void m126304U0(Moment moment) {
        ((omm) this.viewModel).m168260Q(!TEnum.equals(moment.status(), "normal"));
        if (!moment.media.isEmpty() && moment.media.size() == 1 && (moment.media.get(0) instanceof Video) && this.f99810n) {
            this.f99810n = true;
        }
    }

    /* JADX INFO: renamed from: V0 */
    public void m126305V0(final String str, final MomentMessage momentMessage, final x20 x20Var) {
        ksg.m151220o(this.f99797a, momentMessage.value, DetectCategoryType.get("comment"), "comment", "p_immersion_comment_page", new x20() { // from class: l.dmm
            @Override // p153l.x20
            public final void call() {
                this.f89709a.m126295I0(str, momentMessage, x20Var);
            }
        });
    }

    /* JADX INFO: renamed from: W0 */
    public void m126306W0(String str, String str2, final x20 x20Var) {
        final MomentMessage momentMessage = new MomentMessage();
        momentMessage.value = str;
        momentMessage.moment = this.f99806j;
        momentMessage.owner = FeedModule.m61405F().userId();
        momentMessage.api_only_otherUser = this.f99804h;
        momentMessage.isCommentFromKanKan = true;
        CommentInfo commentInfoNew_ = CommentInfo.new_();
        String str3 = this.f99805i;
        commentInfoNew_.parentMessageId = str3;
        this.f99805i = "";
        momentMessage.commentInfo = commentInfoNew_;
        if (!TextUtils.isEmpty(str3) && NullChecker.m82486a(this.f99803g)) {
            momentMessage.replyCommentId = this.f99803g.f56856id;
        }
        if (uqb0.f180394Z.m95954K(str2)) {
            k3h.m148027A0(this.f99797a, new x20() { // from class: l.amm
                @Override // p153l.x20
                public final void call() {
                    this.f72232a.m126296J0(momentMessage, x20Var);
                }
            }, false);
        } else {
            m126305V0(this.f99807k, momentMessage, x20Var);
            m126289y0(str2);
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public String m126307Y0(MomentMessage momentMessage, String str) {
        if (!NullChecker.m82486a(momentMessage)) {
            return this.f99797a.getString(R$string.f39850X2);
        }
        this.f99803g = momentMessage;
        this.f99804h = momentMessage.owner;
        this.f99805i = str;
        return m126313s0();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.slm
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f169393a.m126273D0((Bundle) obj);
            }
        }, new x20() { // from class: l.wlm
            @Override // p153l.x20
            public final void call() {
                this.f189711a.m126274E0();
            }
        });
    }

    /* JADX INFO: renamed from: a1 */
    public void m126308a1(MomentMessage momentMessage, String str) {
        ((omm) this.viewModel).m168262S(momentMessage, str);
    }

    /* JADX INFO: renamed from: b1 */
    public void m126309b1(List<MomentMessage> list) {
        this.f99800d.clear();
        this.f99800d.addAll(list);
    }

    /* JADX INFO: renamed from: c1 */
    public final List<MomentMessage> m126310c1(List<MomentMessage> list) {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f99799c.messages.ids) {
            MomentMessage momentMessage = (MomentMessage) jyb.m147529r(list, new qcj() { // from class: l.ylm
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

    /* JADX INFO: renamed from: d1 */
    public final void m126311d1(Moment moment, Music music) {
        if (music == null || jyb.m147479J(moment.media) || !(moment.media.get(0) instanceof Video)) {
            return;
        }
        ((Video) moment.media.get(0)).music = music;
    }

    @Override // p153l.ar2, p153l.k3m
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public void mo52715C(omm ommVar) {
        super.mo52715C(ommVar);
    }

    /* JADX INFO: renamed from: s0 */
    public final String m126313s0() {
        String strM100007a = at0.m100007a(this.f99799c, this.f99798b.mo137270m(FeedModule.m61405F().userId()).name);
        User userMo137270m = this.f99798b.mo137270m(this.f99804h);
        List<String> listM134066g = h9i.m134066g(((omm) this.viewModel).f147963k.getPaint(), m126316x0(), strM100007a, at0.m100007a(this.f99799c, userMo137270m == null ? "" : userMo137270m.name), new rcj() { // from class: l.xlm
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return this.f195000a.m126314t0((String) obj, (String) obj2);
            }
        });
        return m126314t0(listM134066g.get(0), listM134066g.get(1));
    }

    /* JADX INFO: renamed from: t0 */
    public final String m126314t0(String str, String str2) {
        return str + this.f99797a.getString(R$string.f39869a3) + str2 + ": ";
    }

    /* JADX INFO: renamed from: u0 */
    public Moment m126315u0() {
        return this.f99798b.mo137272y(this.f99806j);
    }

    /* JADX INFO: renamed from: x0 */
    public float m126316x0() {
        return qa00.m175859d(24.0f) + ((omm) this.viewModel).f147964l.getMeasuredWidth();
    }

    /* JADX INFO: renamed from: z0 */
    public void m126317z0() {
        ymm ymmVar = new ymm(this.f99797a, this, this.f99807k, this.f99806j);
        this.f99798b = ymmVar;
        Moment momentMo137272y = ymmVar.mo137272y(this.f99806j);
        this.f99799c = momentMo137272y;
        if (NullChecker.m82486a(momentMo137272y)) {
            Moment moment = this.f99799c;
            moment.momentValue = this.f99812p;
            m126304U0(moment);
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
