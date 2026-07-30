package p149l;

import android.os.Bundle;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.newui.home.marrymode.C8030a;
import com.p046p1.mobile.putong.core.newui.messages.marriage.MarriageMsgAct;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.ConversationCounter;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class g1x extends jq2<C8030a> {

    /* JADX INFO: renamed from: l.g1x$a */
    public class C16977a implements e30<Bundle> {
        public C16977a() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Bundle bundle) {
            ((C8030a) g1x.this.viewModel).m38781m(true);
            g1x.this.m124119G0();
        }
    }

    /* JADX INFO: renamed from: l.g1x$b */
    public class C16978b implements e30<C4319c> {
        public C16978b() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(C4319c c4319c) {
            if (c4319c == C4319c.f15548i) {
                ((C8030a) g1x.this.viewModel).m38771B(((C8030a) g1x.this.viewModel).f23299p.getType());
            } else if (c4319c == C4319c.f15549j) {
                ((C8030a) g1x.this.viewModel).m38775e();
            }
        }
    }

    /* JADX INFO: renamed from: l.g1x$c */
    public class C16979c implements w9j<ConversationCounter, Integer> {
        public C16979c() {
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call(ConversationCounter conversationCounter) {
            return Integer.valueOf(conversationCounter.messages.unReadOnlyMarriage);
        }
    }

    /* JADX INFO: renamed from: l.g1x$d */
    public class C16980d implements e30<Envelope> {
        public C16980d() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Envelope envelope) {
            if (g1x.this.viewModel != null) {
                ((C8030a) g1x.this.viewModel).f23280H.m132487l(Boolean.FALSE);
                List<User> list = ((CommonData) envelope.data.getModuleData(CommonData.class)).users;
                if (g1x.this.viewModel != null) {
                    List<User> listM162197f = o0x.m162197f(list);
                    boolean zM200296J = vwb.m200296J(listM162197f);
                    g1x g1xVar = g1x.this;
                    if (zM200296J) {
                        ((C8030a) g1xVar.viewModel).m38789w();
                    } else {
                        ((C8030a) g1xVar.viewModel).m38784q(listM162197f);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.g1x$e */
    public class C16981e implements e30<Throwable> {
        public C16981e() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            if (g1x.this.viewModel != null) {
                ((C8030a) g1x.this.viewModel).f23280H.m132487l(Boolean.FALSE);
                if (th instanceof TantanException.Client.TantanForbidden) {
                    int i = ((TantanException.Client.TantanForbidden) th).code;
                    if (i == 40302) {
                        ((C8030a) g1x.this.viewModel).m38789w();
                        return;
                    } else if (i == 40303) {
                        ((C8030a) g1x.this.viewModel).m38788v();
                        return;
                    } else if (i == 40304) {
                        osi0.m165783g("婚恋资料未通过审核");
                    }
                }
                ((C8030a) g1x.this.viewModel).m38786s();
            }
        }
    }

    /* JADX INFO: renamed from: l.g1x$f */
    public class C16982f implements w9j<Boolean, C22306c<roj0>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ User f100227a;

        public C16982f(User user) {
            this.f100227a = user;
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C22306c<roj0> call(Boolean bool) {
            if (bool.booleanValue()) {
                return CoreModule.f17545c.f19642f0.m32902ap(this.f100227a.f56011id);
            }
            upk0.m194883a("");
            return null;
        }
    }

    public g1x(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public /* synthetic */ void m124095J0(String str) {
        Picture picture = new Picture();
        picture.url = str;
        qib0.f154691G.m102312B0(((C8030a) this.viewModel).m38778j(), picture.profile480());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public /* synthetic */ void m124096L0(roj0 roj0Var) {
        m124119G0();
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m124104l0(Throwable th) {
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m124105m0(Throwable th) {
    }

    /* JADX INFO: renamed from: E0 */
    public boolean m124117E0() {
        return o0x.m162201j() && !xma.m210044G3();
    }

    /* JADX INFO: renamed from: F0 */
    public void m124118F0(User user) {
        if (user == null) {
            return;
        }
        CoreModule.f17545c.f19663m0.m31034O8(user.f56011id);
    }

    /* JADX INFO: renamed from: G0 */
    public void m124119G0() {
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((C8030a) v2).m38787u();
        }
        duringCreated(CoreModule.f17545c.f19663m0.m31062V8()).subscribe(mkd0.m154956H(new C16980d(), new C16981e()));
    }

    /* JADX INFO: renamed from: H0 */
    public void m124120H0() {
        o0x.m162214w(act(), "marriage_mode_entrance");
    }

    /* JADX INFO: renamed from: I0 */
    public void m124121I0() {
        act().startActivity(MarriageMsgAct.m42489Z1(act()));
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m124122N0(Integer num) {
        ((C8030a) this.viewModel).m38791y(num.intValue());
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m124123O0(User user, d30 d30Var, roj0 roj0Var) {
        act().progressDismiss();
        act().startActivity(MessagesAct.m48940e2(act(), user.f56011id, 39, new j760[0]));
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m124124P0(Throwable th) {
        act().progressDismiss();
        if (th instanceof TantanException.Client.TantanForbidden) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            int i = tantanForbidden.code;
            String str = tantanForbidden.message;
            if (i == 40399) {
                osi0.m165783g(str);
            }
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public void m124125Q0(final User user, final d30 d30Var) {
        if (user == null) {
            return;
        }
        ((C8030a) this.viewModel).getAct().progress(R$string.f17842J5);
        duringCreated((C22306c) CoreModule.f17545c.f19639e0.m169568za(user.f56011id).flatMap(new C16982f(user))).subscribe(mkd0.m154956H(new e30() { // from class: l.x0x
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f189000a.m124123O0(user, d30Var, (roj0) obj);
            }
        }, new e30() { // from class: l.y0x
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f195364a.m124124P0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R0 */
    public void m124126R0(User user) {
        CoreModule.f17545c.f19663m0.m31038P8(user.f56011id);
    }

    /* JADX INFO: renamed from: S0 */
    public void m124127S0() {
        CoreModule.f17554l.m94651a().mo33567q6(act(), "p_marriage_home,e_chat_next_pull,click", null);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new C16977a());
        duringCreated(CoreModule.f17545c.f19639e0.m169523o9().filter(new w9j() { // from class: l.z0x
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((User) obj).hasPic());
            }
        }).map(new w9j() { // from class: l.a1x
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((User) obj).m60124fp().url;
            }
        }).distinctUntilChanged()).subscribe(mkd0.m154956H(new e30() { // from class: l.b1x
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f72637a.m124095J0((String) obj);
            }
        }, new e30() { // from class: l.c1x
            @Override // p149l.e30
            public final void call(Object obj) {
                g1x.m124105m0((Throwable) obj);
            }
        }));
        duringCreated(((C8030a) this.viewModel).f23309z.lifecycle()).subscribe(mkd0.m154956H(new C16978b(), new e30() { // from class: l.d1x
            @Override // p149l.e30
            public final void call(Object obj) {
                g1x.m124104l0((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19663m0.f19406e0).subscribe(mkd0.m154955G(new e30() { // from class: l.e1x
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f88855a.m124096L0((roj0) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19642f0.m32773Qe()).map(new C16979c()).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.f1x
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f94121a.m124122N0((Integer) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
