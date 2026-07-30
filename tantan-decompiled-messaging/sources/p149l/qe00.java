package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.core.p053ui.notifications.SysnotifListener;
import com.p046p1.mobile.putong.data.PartialIdList;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentMessage;
import com.p046p1.mobile.putong.feed.p060ui.moments.MomentDetailAct;
import com.p046p1.mobile.putong.feed.p060ui.moments.MomentView;
import com.tantanapp.common.network.ApiExcep;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes12.dex */
public class qe00 extends jq2<af00> {

    /* JADX INFO: renamed from: a */
    public MomentDetailAct f153983a;

    /* JADX INFO: renamed from: b */
    public String f153984b;

    /* JADX INFO: renamed from: c */
    public String f153985c;

    /* JADX INFO: renamed from: d */
    public boolean f153986d;

    /* JADX INFO: renamed from: e */
    public boolean f153987e;

    /* JADX INFO: renamed from: f */
    public boolean f153988f;

    public qe00(MomentDetailAct momentDetailAct) {
        super(momentDetailAct);
        this.f153983a = momentDetailAct;
    }

    /* JADX INFO: renamed from: W0 */
    private void m174134W0(MomentMessage momentMessage, boolean z, Throwable th) {
        p6j0.m167672f("e_comment_send", "p_user_moment_interactions_details_view", p6j0.C19147a.m167678g("moment_id", this.f153984b), p6j0.C19147a.m167678g("owner_id", this.f153985c), p6j0.C19147a.m167678g("comment_user_id", FeedModule.m60221F().userId()), p6j0.C19147a.m167678g("comment_state", z ? "success" : "fail"), p6j0.C19147a.m167678g("comment_detail", momentMessage.isChildComment() ? SysnotifListener.ACTION_REPLY : "comment"), th == null ? null : p6j0.C19147a.m167678g("error", th.toString()));
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ C22306c m174145o0(int i, PartialIdList partialIdList) {
        return partialIdList.ids.size() <= i ? C22306c.just(null) : ijb0.m136559W(partialIdList.ids.get(i));
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ C22306c m174154A0() {
        return ijb0.m136559W(this.f153985c);
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ C22306c m174155C0(final int i) {
        return FeedModule.f38854c.m60707W3(this.f153984b).map(new w9j() { // from class: l.yd00
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((Moment) obj).likes;
            }
        }).switchMap(new w9j() { // from class: l.zd00
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return qe00.m174145o0(i, (PartialIdList) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m174156D0(int i, User user) {
        ((af00) this.viewModel).m96171F(user, i);
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ C22306c m174157E0() {
        return FeedModule.f38854c.m60718c3(this.f153984b);
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m174158F0(q860 q860Var) {
        ((af00) this.viewModel).m96168B(q860Var);
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ C22306c m174159G0() {
        return ijb0.m136559W(this.f153985c);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m174160H0(User user) {
        ((af00) this.viewModel).m96170E(user);
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ C22306c m174161I0(User user) {
        return ijb0.m136561a(this.f153985c);
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m174162J0(roj0 roj0Var) {
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m174163L0(roj0 roj0Var) {
        if (this.f153988f) {
            this.f153988f = false;
            ((af00) this.viewModel).m96182z();
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m174164N0(Throwable th) {
        yij0.m214926D(th);
        if (th instanceof ApiExcep.Client.NotFound) {
            act().lambda$debugItems$19();
        }
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m174165O0(Bundle bundle) {
        ((af00) this.viewModel).init();
        FeedModule.f38854c.m60751s4(this.f153985c, this.f153984b).subscribe(mkd0.m154956H(new e30() { // from class: l.ae00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f68980a.m174163L0((roj0) obj);
            }
        }, new e30() { // from class: l.be00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f75092a.m174164N0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ C22306c m174166P0() {
        return FeedModule.f38854c.m60707W3(this.f153984b);
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m174167Q0(Moment moment) {
        ((af00) this.viewModel).m96169C(moment);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m174168R0(MomentMessage momentMessage, MomentMessage momentMessage2) {
        m174134W0(momentMessage, true, null);
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m174169S0(MomentMessage momentMessage, Throwable th) {
        m174134W0(momentMessage, false, th);
    }

    /* JADX INFO: renamed from: U0 */
    public void m174170U0(String str, String str2, boolean z, boolean z2) {
        this.f153984b = str;
        this.f153985c = str2;
        this.f153986d = z;
        this.f153988f = z2;
        this.f153987e = str2.equals(FeedModule.m60221F().userId());
    }

    /* JADX INFO: renamed from: V0 */
    public void m174171V0(String str) {
        ((af00) this.viewModel).m96173l();
        final MomentMessage momentMessage = new MomentMessage();
        momentMessage.value = str;
        momentMessage.moment = this.f153984b;
        duringCreated(FeedModule.f38854c.m60716b3(this.f153985c, momentMessage)).subscribe(mkd0.m154956H(new e30() { // from class: l.ce00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f80425a.m174168R0(momentMessage, (MomentMessage) obj);
            }
        }, new e30() { // from class: l.de00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f85691a.m174169S0(momentMessage, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X0 */
    public List<Object> m174172X0() {
        return vwb.m200324f0("moment id", this.f153984b, ag3.f69254c);
    }

    /* JADX INFO: renamed from: z0 */
    public void m174173z0() {
        duringCreated(new v9j() { // from class: l.td00
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f169488a.m174154A0();
            }
        }, false).filter(new w9j() { // from class: l.je00
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((User) obj).verifications.anchor.verified);
            }
        }).flatMap(new w9j() { // from class: l.ke00
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f122649a.m174161I0((User) obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.le00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f127628a.m174162J0((roj0) obj);
            }
        }));
        creates(new e30() { // from class: l.me00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f133333a.m174165O0((Bundle) obj);
            }
        });
        duringCreated(new v9j() { // from class: l.ne00
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f138571a.m174166P0();
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.oe00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f143258a.m174167Q0((Moment) obj);
            }
        }));
        for (final int i = 0; i < MomentView.f43765T0; i++) {
            act().duringCreated(new v9j() { // from class: l.vd00
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return this.f181006a.m174155C0(i);
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.wd00
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f185748a.m174156D0(i, (User) obj);
                }
            }));
        }
        duringCreated(new v9j() { // from class: l.xd00
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f192289a.m174157E0();
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.ee00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f90658a.m174158F0((q860) obj);
            }
        }));
        duringCreated(new v9j() { // from class: l.ge00
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f102142a.m174159G0();
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.ie00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f112701a.m174160H0((User) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
