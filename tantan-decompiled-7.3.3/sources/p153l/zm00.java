package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.core.p058ui.notifications.SysnotifListener;
import com.p051p1.mobile.putong.data.PartialIdList;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentMessage;
import com.p051p1.mobile.putong.feed.p065ui.moments.MomentDetailAct;
import com.p051p1.mobile.putong.feed.p065ui.moments.MomentView;
import com.tantanapp.common.network.ApiExcep;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes13.dex */
public class zm00 extends ar2<jn00> {

    /* JADX INFO: renamed from: a */
    public MomentDetailAct f205021a;

    /* JADX INFO: renamed from: b */
    public String f205022b;

    /* JADX INFO: renamed from: c */
    public String f205023c;

    /* JADX INFO: renamed from: d */
    public boolean f205024d;

    /* JADX INFO: renamed from: e */
    public boolean f205025e;

    /* JADX INFO: renamed from: f */
    public boolean f205026f;

    public zm00(MomentDetailAct momentDetailAct) {
        super(momentDetailAct);
        this.f205021a = momentDetailAct;
    }

    /* JADX INFO: renamed from: W0 */
    private void m220307W0(MomentMessage momentMessage, boolean z, Throwable th) {
        tfj0.m190943f("e_comment_send", "p_user_moment_interactions_details_view", tfj0.C20302a.m190949g("moment_id", this.f205022b), tfj0.C20302a.m190949g("owner_id", this.f205023c), tfj0.C20302a.m190949g("comment_user_id", FeedModule.m61405F().userId()), tfj0.C20302a.m190949g("comment_state", z ? "success" : "fail"), tfj0.C20302a.m190949g("comment_detail", momentMessage.isChildComment() ? SysnotifListener.ACTION_REPLY : "comment"), th == null ? null : tfj0.C20302a.m190949g("error", th.toString()));
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ C22421c m220318o0(int i, PartialIdList partialIdList) {
        return partialIdList.ids.size() <= i ? C22421c.just(null) : mrb0.m159645W(partialIdList.ids.get(i));
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ C22421c m220327A0() {
        return mrb0.m159645W(this.f205023c);
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ C22421c m220328C0(final int i) {
        return FeedModule.f39702c.m61891W3(this.f205022b).map(new qcj() { // from class: l.hm00
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((Moment) obj).likes;
            }
        }).switchMap(new qcj() { // from class: l.im00
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return zm00.m220318o0(i, (PartialIdList) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m220329D0(int i, User user) {
        ((jn00) this.viewModel).m146194F(user, i);
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ C22421c m220330E0() {
        return FeedModule.f39702c.m61902c3(this.f205022b);
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m220331F0(vg60 vg60Var) {
        ((jn00) this.viewModel).m146191B(vg60Var);
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ C22421c m220332G0() {
        return mrb0.m159645W(this.f205023c);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m220333H0(User user) {
        ((jn00) this.viewModel).m146193E(user);
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ C22421c m220334I0(User user) {
        return mrb0.m159647a(this.f205023c);
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m220335J0(uxj0 uxj0Var) {
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m220336L0(uxj0 uxj0Var) {
        if (this.f205026f) {
            this.f205026f = false;
            ((jn00) this.viewModel).m146205z();
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m220337N0(Throwable th) {
        bsj0.m106246D(th);
        if (th instanceof ApiExcep.Client.NotFound) {
            act().lambda$debugItems$19();
        }
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m220338O0(Bundle bundle) {
        ((jn00) this.viewModel).init();
        FeedModule.f39702c.m61935s4(this.f205023c, this.f205022b).subscribe(psd0.m173597H(new y20() { // from class: l.jm00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f121633a.m220336L0((uxj0) obj);
            }
        }, new y20() { // from class: l.km00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f127424a.m220337N0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ C22421c m220339P0() {
        return FeedModule.f39702c.m61891W3(this.f205022b);
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m220340Q0(Moment moment) {
        ((jn00) this.viewModel).m146192C(moment);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m220341R0(MomentMessage momentMessage, MomentMessage momentMessage2) {
        m220307W0(momentMessage, true, null);
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m220342S0(MomentMessage momentMessage, Throwable th) {
        m220307W0(momentMessage, false, th);
    }

    /* JADX INFO: renamed from: U0 */
    public void m220343U0(String str, String str2, boolean z, boolean z2) {
        this.f205022b = str;
        this.f205023c = str2;
        this.f205024d = z;
        this.f205026f = z2;
        this.f205025e = str2.equals(FeedModule.m61405F().userId());
    }

    /* JADX INFO: renamed from: V0 */
    public void m220344V0(String str) {
        ((jn00) this.viewModel).m146196l();
        final MomentMessage momentMessage = new MomentMessage();
        momentMessage.value = str;
        momentMessage.moment = this.f205022b;
        duringCreated(FeedModule.f39702c.m61900b3(this.f205023c, momentMessage)).subscribe(psd0.m173597H(new y20() { // from class: l.lm00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f132621a.m220341R0(momentMessage, (MomentMessage) obj);
            }
        }, new y20() { // from class: l.mm00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f137463a.m220342S0(momentMessage, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X0 */
    public List<Object> m220345X0() {
        return jyb.m147507f0("moment id", this.f205022b, og3.f147188c);
    }

    /* JADX INFO: renamed from: z0 */
    public void m220346z0() {
        duringCreated(new pcj() { // from class: l.cm00
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f82503a.m220327A0();
            }
        }, false).filter(new qcj() { // from class: l.sm00
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((User) obj).verifications.anchor.verified);
            }
        }).flatMap(new qcj() { // from class: l.tm00
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f174874a.m220334I0((User) obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.um00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f179592a.m220335J0((uxj0) obj);
            }
        }));
        creates(new y20() { // from class: l.vm00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f184657a.m220338O0((Bundle) obj);
            }
        });
        duringCreated(new pcj() { // from class: l.wm00
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f189757a.m220339P0();
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.xm00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f195039a.m220340Q0((Moment) obj);
            }
        }));
        for (final int i = 0; i < MomentView.f44613T0; i++) {
            act().duringCreated(new pcj() { // from class: l.em00
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return this.f94602a.m220328C0(i);
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.fm00
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f99706a.m220329D0(i, (User) obj);
                }
            }));
        }
        duringCreated(new pcj() { // from class: l.gm00
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f104905a.m220330E0();
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.nm00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f142611a.m220331F0((vg60) obj);
            }
        }));
        duringCreated(new pcj() { // from class: l.pm00
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f153114a.m220332G0();
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.rm00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f163817a.m220333H0((User) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
