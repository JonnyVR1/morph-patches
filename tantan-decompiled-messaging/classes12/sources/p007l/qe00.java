package p007l;

import android.os.Bundle;
import com.p000p1.mobile.putong.data.PartialIdList;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentMessage;
import com.p000p1.mobile.putong.feed.p005ui.moments.MomentDetailAct;
import com.p000p1.mobile.putong.feed.p005ui.moments.MomentView;
import com.tantanapp.common.network.ApiExcep;
import java.util.List;
import l.ag3;
import l.e30;
import l.jq2;
import l.mkd0;
import l.q860;
import l.roj0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.yij0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class qe00 extends jq2<af00> {

    /* JADX INFO: renamed from: a */
    public MomentDetailAct f12210a;

    /* JADX INFO: renamed from: b */
    public String f12211b;

    /* JADX INFO: renamed from: c */
    public String f12212c;

    /* JADX INFO: renamed from: d */
    public boolean f12213d;

    /* JADX INFO: renamed from: e */
    public boolean f12214e;

    /* JADX INFO: renamed from: f */
    public boolean f12215f;

    public qe00(MomentDetailAct momentDetailAct) {
        super(momentDetailAct);
        this.f12210a = momentDetailAct;
    }

    /* JADX INFO: renamed from: W0 */
    private void m13506W0(MomentMessage momentMessage, boolean z, Throwable th) {
        p6j0.m12916f("e_comment_send", "p_user_moment_interactions_details_view", p6j0.C2456a.m12922g("moment_id", this.f12211b), p6j0.C2456a.m12922g("owner_id", this.f12212c), p6j0.C2456a.m12922g("comment_user_id", FeedModule.m1139F().userId()), p6j0.C2456a.m12922g("comment_state", z ? "success" : "fail"), p6j0.C2456a.m12922g("comment_detail", momentMessage.isChildComment() ? "reply" : "comment"), th == null ? null : p6j0.C2456a.m12922g("error", th.toString()));
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ c m13517o0(int i, PartialIdList partialIdList) {
        return partialIdList.ids.size() <= i ? c.just((Object) null) : ijb0.m10912W(partialIdList.ids.get(i));
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ c m13526A0() {
        return ijb0.m10912W(this.f12212c);
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ c m13527C0(final int i) {
        return FeedModule.f315c.m1633W3(this.f12211b).map(new w9j() { // from class: l.yd00
            public final Object call(Object obj) {
                return ((Moment) obj).likes;
            }
        }).switchMap(new w9j() { // from class: l.zd00
            public final Object call(Object obj) {
                return qe00.m13517o0(i, (PartialIdList) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m13528D0(int i, User user) {
        ((af00) ((jq2) this).viewModel).m8524F(user, i);
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ c m13529E0() {
        return FeedModule.f315c.m1644c3(this.f12211b);
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m13530F0(q860 q860Var) {
        ((af00) ((jq2) this).viewModel).m8520B(q860Var);
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ c m13531G0() {
        return ijb0.m10912W(this.f12212c);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m13532H0(User user) {
        ((af00) ((jq2) this).viewModel).m8523E(user);
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ c m13533I0(User user) {
        return ijb0.m10914a(this.f12212c);
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m13534J0(roj0 roj0Var) {
        act().finish();
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m13535L0(roj0 roj0Var) {
        if (this.f12215f) {
            this.f12215f = false;
            ((af00) ((jq2) this).viewModel).m8536z();
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m13536N0(Throwable th) {
        yij0.D(th);
        if (th instanceof ApiExcep.Client.NotFound) {
            act().finish();
        }
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m13537O0(Bundle bundle) {
        ((af00) ((jq2) this).viewModel).init();
        FeedModule.f315c.m1677s4(this.f12212c, this.f12211b).subscribe(mkd0.H(new e30() { // from class: l.ae00
            public final void call(Object obj) {
                this.f5714a.m13535L0((roj0) obj);
            }
        }, new e30() { // from class: l.be00
            public final void call(Object obj) {
                this.f6274a.m13536N0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ c m13538P0() {
        return FeedModule.f315c.m1633W3(this.f12211b);
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m13539Q0(Moment moment) {
        ((af00) ((jq2) this).viewModel).m8521C(moment);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m13540R0(MomentMessage momentMessage, MomentMessage momentMessage2) {
        m13506W0(momentMessage, true, null);
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m13541S0(MomentMessage momentMessage, Throwable th) {
        m13506W0(momentMessage, false, th);
    }

    /* JADX INFO: renamed from: U0 */
    public void m13542U0(String str, String str2, boolean z, boolean z2) {
        this.f12211b = str;
        this.f12212c = str2;
        this.f12213d = z;
        this.f12215f = z2;
        this.f12214e = str2.equals(FeedModule.m1139F().userId());
    }

    /* JADX INFO: renamed from: V0 */
    public void m13543V0(String str) {
        ((af00) ((jq2) this).viewModel).m8527l();
        final MomentMessage momentMessage = new MomentMessage();
        momentMessage.value = str;
        momentMessage.moment = this.f12211b;
        duringCreated(FeedModule.f315c.m1642b3(this.f12212c, momentMessage)).subscribe(mkd0.H(new e30() { // from class: l.ce00
            public final void call(Object obj) {
                this.f6611a.m13540R0(momentMessage, (MomentMessage) obj);
            }
        }, new e30() { // from class: l.de00
            public final void call(Object obj) {
                this.f6900a.m13541S0(momentMessage, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X0 */
    public List<Object> m13544X0() {
        return vwb.f0(new Object[]{"moment id", this.f12211b, ag3.c});
    }

    /* JADX INFO: renamed from: z0 */
    public void m13545z0() {
        duringCreated(new v9j() { // from class: l.td00
            public final Object call() {
                return this.f13260a.m13526A0();
            }
        }, false).filter(new w9j() { // from class: l.je00
            public final Object call(Object obj) {
                return Boolean.valueOf(!((User) obj).verifications.anchor.verified);
            }
        }).flatMap(new w9j() { // from class: l.ke00
            public final Object call(Object obj) {
                return this.f9687a.m13533I0((User) obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.le00
            public final void call(Object obj) {
                this.f10007a.m13534J0((roj0) obj);
            }
        }));
        creates(new e30() { // from class: l.me00
            public final void call(Object obj) {
                this.f10435a.m13537O0((Bundle) obj);
            }
        });
        duringCreated(new v9j() { // from class: l.ne00
            public final Object call() {
                return this.f10754a.m13538P0();
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.oe00
            public final void call(Object obj) {
                this.f11437a.m13539Q0((Moment) obj);
            }
        }));
        for (final int i = 0; i < MomentView.f5226T0; i++) {
            act().duringCreated(new v9j() { // from class: l.vd00
                public final Object call() {
                    return this.f14145a.m13527C0(i);
                }
            }).subscribe(mkd0.G(new e30() { // from class: l.wd00
                public final void call(Object obj) {
                    this.f14508a.m13528D0(i, (User) obj);
                }
            }));
        }
        duringCreated(new v9j() { // from class: l.xd00
            public final Object call() {
                return this.f14868a.m13529E0();
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.ee00
            public final void call(Object obj) {
                this.f7333a.m13530F0((q860) obj);
            }
        }));
        duringCreated(new v9j() { // from class: l.ge00
            public final Object call() {
                return this.f8428a.m13531G0();
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.ie00
            public final void call(Object obj) {
                this.f8997a.m13532H0((User) obj);
            }
        }));
    }

    public void destroy() {
    }
}
