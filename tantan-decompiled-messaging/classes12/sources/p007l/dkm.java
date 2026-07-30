package p007l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.data.DetectCategoryType;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.data.Music;
import com.p000p1.mobile.putong.data.StickerInfo;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.CommentInfo;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentMessage;
import com.p000p1.mobile.putong.feed.data.RawFeed;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.tantanapp.common.data.CopyObject;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import l.d30;
import l.e30;
import l.j760;
import l.jq2;
import l.mkd0;
import l.qib0;
import l.t100;
import l.vwb;
import l.w9j;
import l.x9j;
import l.xaj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class dkm extends jq2<mkm> {

    /* JADX INFO: renamed from: a */
    public final Act f6970a;

    /* JADX INFO: renamed from: b */
    public hx60 f6971b;

    /* JADX INFO: renamed from: c */
    public Moment f6972c;

    /* JADX INFO: renamed from: d */
    public List<MomentMessage> f6973d;

    /* JADX INFO: renamed from: e */
    public List<StickerInfo> f6974e;

    /* JADX INFO: renamed from: f */
    public Links f6975f;

    /* JADX INFO: renamed from: g */
    public MomentMessage f6976g;

    /* JADX INFO: renamed from: h */
    public String f6977h;

    /* JADX INFO: renamed from: i */
    public String f6978i;

    /* JADX INFO: renamed from: j */
    public String f6979j;

    /* JADX INFO: renamed from: k */
    public String f6980k;

    /* JADX INFO: renamed from: l */
    public boolean f6981l;

    /* JADX INFO: renamed from: m */
    public boolean f6982m;

    /* JADX INFO: renamed from: n */
    public boolean f6983n;

    /* JADX INFO: renamed from: o */
    public boolean f6984o;

    /* JADX INFO: renamed from: p */
    public String f6985p;

    public dkm(Act act) {
        super(act);
        this.f6973d = new LinkedList();
        this.f6974e = new LinkedList();
        this.f6978i = "";
        this.f6983n = true;
        this.f6984o = false;
        this.f6985p = null;
        this.f6970a = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public /* synthetic */ void m9421D0(Bundle bundle) {
        ((mkm) ((jq2) this).viewModel).m11971x();
        ((mkm) ((jq2) this).viewModel).m11965p();
        this.f6971b.mo5610o();
        ((mkm) ((jq2) this).viewModel).m11968u(this.f6971b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public /* synthetic */ void m9422E0() {
        ((mkm) ((jq2) this).viewModel).m11966q();
    }

    /* JADX INFO: renamed from: X0 */
    private void m9423X0(MomentMessage momentMessage, boolean z, Throwable th) {
        p6j0.m12916f("e_comment_send", "p_immersion_comment_page", p6j0.C2456a.m12922g("moment_id", ((DbObject) this.f6972c).id), p6j0.C2456a.m12922g("owner_id", this.f6972c.owner), p6j0.C2456a.m12922g("comment_user_id", FeedModule.m1139F().userId()), p6j0.C2456a.m12922g("comment_state", z ? "success" : "fail"), p6j0.C2456a.m12922g("comment_detail", momentMessage.isChildComment() ? "reply" : "comment"), th == null ? null : p6j0.C2456a.m12922g("error", th.toString()));
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m9432m0(Throwable th) {
    }

    /* JADX INFO: renamed from: y0 */
    private void m9437y0(final String str) {
        qib0.Z.Q(str, "p_user_passive_show_nearby").subscribe(mkd0.H(new e30() { // from class: l.ckm
            public final void call(Object obj) {
                this.f6666a.m9440C0(str, (Boolean) obj);
            }
        }, new e30() { // from class: l.rjm
            public final void call(Object obj) {
                dkm.m9432m0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: A0 */
    public void m9438A0() {
        ((mkm) ((jq2) this).viewModel).m11972y();
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m9440C0(String str, Boolean bool) {
        if (bool.booleanValue()) {
            v1h.m15207J0(this.f6970a, str);
        }
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ Boolean m9441F0(MomentMessage momentMessage) {
        return Boolean.valueOf(!this.f6973d.contains(momentMessage));
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m9442G0(d30 d30Var, MomentMessage momentMessage, MomentMessage momentMessage2) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
        this.f6977h = null;
        this.f6976g = null;
        if (NullChecker.b(this.f6972c)) {
            m9423X0(momentMessage, true, null);
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m9443H0(MomentMessage momentMessage, Throwable th) {
        if (NullChecker.b(this.f6972c)) {
            m9423X0(momentMessage, false, th);
        }
        if (momentMessage.isChildComment()) {
            ((mkm) ((jq2) this).viewModel).m11967s(momentMessage);
        }
        if (this.f6973d.contains(momentMessage)) {
            this.f6973d.remove(momentMessage);
            ((mkm) ((jq2) this).viewModel).m11950J(this.f6973d, this.f6974e);
        }
        App.d.k(th);
        t2h.m14425e(th);
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m9444I0(String str, final MomentMessage momentMessage, final d30 d30Var) {
        this.f6970a.duringCreated(this.f6971b.mo10737i(str, momentMessage)).subscribe(mkd0.H(new e30() { // from class: l.sjm
            public final void call(Object obj) {
                this.f12969a.m9442G0(d30Var, momentMessage, (MomentMessage) obj);
            }
        }, new e30() { // from class: l.tjm
            public final void call(Object obj) {
                this.f13319a.m9443H0(momentMessage, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m9445J0(MomentMessage momentMessage, d30 d30Var) {
        m9454V0(this.f6980k, momentMessage, d30Var);
    }

    /* JADX INFO: renamed from: L0 */
    public void m9446L0() {
        ((mkm) ((jq2) this).viewModel).m11950J(this.f6973d, this.f6974e);
    }

    /* JADX INFO: renamed from: N0 */
    public void m9447N0(final MomentMessage momentMessage) {
        if (momentMessage.moment.equals(this.f6979j)) {
            MomentMessage momentMessage2 = (MomentMessage) vwb.r(this.f6973d, new w9j() { // from class: l.zjm
                public final Object call(Object obj) {
                    return Boolean.valueOf(((CopyObject) momentMessage).id.equals(((CopyObject) ((MomentMessage) obj)).id));
                }
            });
            if (NullChecker.a(momentMessage2)) {
                this.f6973d.remove(momentMessage2);
            }
            momentMessage.isNewComment = true;
            this.f6973d.add(0, momentMessage);
            ((mkm) ((jq2) this).viewModel).m11949I(this.f6973d);
        }
    }

    /* JADX INFO: renamed from: O0 */
    public void m9448O0(final MomentMessage momentMessage) {
        if (momentMessage.moment.equals(this.f6979j)) {
            int iG = vwb.G(this.f6973d, new w9j() { // from class: l.akm
                public final Object call(Object obj) {
                    return Boolean.valueOf(((CopyObject) momentMessage).id.equals(((CopyObject) ((MomentMessage) obj)).id));
                }
            });
            if (iG != -1) {
                this.f6973d.remove(iG);
                ((mkm) ((jq2) this).viewModel).m11953M(momentMessage);
            }
            ((mkm) ((jq2) this).viewModel).m11949I(this.f6973d);
        }
    }

    /* JADX INFO: renamed from: P0 */
    public void m9449P0(xaj0<Links, List<MomentMessage>, List<StickerInfo>> xaj0Var) {
        ((mkm) ((jq2) this).viewModel).m11951K((Links) xaj0Var.a);
        this.f6975f = (Links) xaj0Var.a;
        if (NullChecker.a(xaj0Var.b)) {
            this.f6973d.addAll(vwb.n((Collection) xaj0Var.b, new w9j() { // from class: l.xjm
                public final Object call(Object obj) {
                    return this.f15024a.m9441F0((MomentMessage) obj);
                }
            }));
            if (!vwb.J((Collection) xaj0Var.c)) {
                this.f6974e.addAll((Collection) xaj0Var.c);
            }
            ((mkm) ((jq2) this).viewModel).m11950J(this.f6973d, this.f6974e);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public void m9450Q0() {
        ((mkm) ((jq2) this).viewModel).m11954N();
    }

    /* JADX INFO: renamed from: R0 */
    public void m9451R0(xaj0<Moment, j760<List<StickerInfo>, List<MomentMessage>>, j760<Music, RawFeed>> xaj0Var) {
        if (((mkm) ((jq2) this).viewModel).m11955O(xaj0Var)) {
            Moment moment = this.f6972c;
            if (moment == null) {
                Object obj = xaj0Var.a;
                this.f6972c = (Moment) obj;
                ((mkm) ((jq2) this).viewModel).m11952L((Moment) obj);
                m9461d1(this.f6972c, (Music) ((j760) xaj0Var.c).a);
                m9453U0(this.f6972c);
            } else {
                m9461d1(moment, (Music) ((j760) xaj0Var.c).a);
                Object obj2 = xaj0Var.a;
                this.f6972c = (Moment) obj2;
                ((mkm) ((jq2) this).viewModel).m11952L((Moment) obj2);
            }
            Object obj3 = xaj0Var.a;
            this.f6975f = ((Moment) obj3).messages.links;
            ((mkm) ((jq2) this).viewModel).m11951K(((Moment) obj3).messages.links);
            this.f6973d.clear();
            this.f6973d.addAll(m9460c1((List) ((j760) xaj0Var.b).b));
            if (NullChecker.a(((j760) xaj0Var.b).a)) {
                this.f6974e.addAll((Collection) ((j760) xaj0Var.b).a);
            }
            ((mkm) ((jq2) this).viewModel).m11950J(this.f6973d, this.f6974e);
        }
    }

    /* JADX INFO: renamed from: S0 */
    public void m9452S0(Throwable th) {
        ((mkm) ((jq2) this).viewModel).m11956P(th);
    }

    /* JADX INFO: renamed from: U0 */
    public final void m9453U0(Moment moment) {
        ((mkm) ((jq2) this).viewModel).m11957Q(!TEnum.equals(moment.status(), "normal"));
        if (!moment.media.isEmpty() && moment.media.size() == 1 && (moment.media.get(0) instanceof Video) && this.f6983n) {
            this.f6983n = true;
        }
    }

    /* JADX INFO: renamed from: V0 */
    public void m9454V0(final String str, final MomentMessage momentMessage, final d30 d30Var) {
        vqg.m15531o(this.f6970a, momentMessage.value, DetectCategoryType.get("comment"), "comment", "p_immersion_comment_page", new d30() { // from class: l.bkm
            public final void call() {
                this.f6358a.m9444I0(str, momentMessage, d30Var);
            }
        });
    }

    /* JADX INFO: renamed from: W0 */
    public void m9455W0(String str, String str2, final d30 d30Var) {
        final MomentMessage momentMessage = new MomentMessage();
        momentMessage.value = str;
        momentMessage.moment = this.f6979j;
        momentMessage.owner = FeedModule.m1139F().userId();
        momentMessage.api_only_otherUser = this.f6977h;
        momentMessage.isCommentFromKanKan = true;
        CommentInfo commentInfoNew_ = CommentInfo.new_();
        String str3 = this.f6978i;
        commentInfoNew_.parentMessageId = str3;
        this.f6978i = "";
        momentMessage.commentInfo = commentInfoNew_;
        if (!TextUtils.isEmpty(str3) && NullChecker.a(this.f6976g)) {
            momentMessage.replyCommentId = ((CopyObject) this.f6976g).id;
        }
        if (qib0.Z.K(str2)) {
            v1h.m15189A0(this.f6970a, new d30() { // from class: l.yjm
                public final void call() {
                    this.f15458a.m9445J0(momentMessage, d30Var);
                }
            }, false);
        } else {
            m9454V0(this.f6980k, momentMessage, d30Var);
            m9437y0(str2);
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public String m9456Y0(MomentMessage momentMessage, String str) {
        if (!NullChecker.a(momentMessage)) {
            return this.f6970a.getString(R$string.f463X2);
        }
        this.f6976g = momentMessage;
        this.f6977h = momentMessage.owner;
        this.f6978i = str;
        return m9463s0();
    }

    /* JADX INFO: renamed from: a0 */
    public void m9457a0() {
        creates(new e30() { // from class: l.qjm
            public final void call(Object obj) {
                this.f12258a.m9421D0((Bundle) obj);
            }
        }, new d30() { // from class: l.ujm
            public final void call() {
                this.f13843a.m9422E0();
            }
        });
    }

    /* JADX INFO: renamed from: a1 */
    public void m9458a1(MomentMessage momentMessage, String str) {
        ((mkm) ((jq2) this).viewModel).m11959S(momentMessage, str);
    }

    /* JADX INFO: renamed from: b1 */
    public void m9459b1(List<MomentMessage> list) {
        this.f6973d.clear();
        this.f6973d.addAll(list);
    }

    /* JADX INFO: renamed from: c1 */
    public final List<MomentMessage> m9460c1(List<MomentMessage> list) {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f6972c.messages.ids) {
            MomentMessage momentMessage = (MomentMessage) vwb.r(list, new w9j() { // from class: l.wjm
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

    /* JADX INFO: renamed from: d1 */
    public final void m9461d1(Moment moment, Music music) {
        if (music == null || vwb.J(moment.media) || !(moment.media.get(0) instanceof Video)) {
            return;
        }
        ((Video) moment.media.get(0)).music = music;
    }

    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public void m9439C(mkm mkmVar) {
        super.C(mkmVar);
    }

    /* JADX INFO: renamed from: s0 */
    public final String m9463s0() {
        String strM15563a = vs0.m15563a(this.f6972c, this.f6971b.mo10741m(FeedModule.m1139F().userId()).name);
        User userMo10741m = this.f6971b.mo10741m(this.f6977h);
        List<String> listM14041g = s7i.m14041g(((mkm) ((jq2) this).viewModel).f10495k.getPaint(), m9466x0(), strM15563a, vs0.m15563a(this.f6972c, userMo10741m == null ? "" : userMo10741m.name), new x9j() { // from class: l.vjm
            public final Object call(Object obj, Object obj2) {
                return this.f14181a.m9464t0((String) obj, (String) obj2);
            }
        });
        return m9464t0(listM14041g.get(0), listM14041g.get(1));
    }

    /* JADX INFO: renamed from: t0 */
    public final String m9464t0(String str, String str2) {
        return str + this.f6970a.getString(R$string.f482a3) + str2 + ": ";
    }

    /* JADX INFO: renamed from: u0 */
    public Moment m9465u0() {
        return this.f6971b.mo10752y(this.f6979j);
    }

    /* JADX INFO: renamed from: x0 */
    public float m9466x0() {
        return t100.d(24.0f) + ((mkm) ((jq2) this).viewModel).f10496l.getMeasuredWidth();
    }

    /* JADX INFO: renamed from: z0 */
    public void m9467z0() {
        wkm wkmVar = new wkm(this.f6970a, this, this.f6980k, this.f6979j);
        this.f6971b = wkmVar;
        Moment momentMo10752y = wkmVar.mo10752y(this.f6979j);
        this.f6972c = momentMo10752y;
        if (NullChecker.a(momentMo10752y)) {
            Moment moment = this.f6972c;
            moment.momentValue = this.f6985p;
            m9453U0(moment);
        }
    }

    public void destroy() {
    }
}
