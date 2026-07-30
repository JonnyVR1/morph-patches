package p153l;

import android.os.Bundle;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.newui.home.marrymode.C8181a;
import com.p051p1.mobile.putong.core.newui.messages.marriage.MarriageMsgAct;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.ConversationCounter;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes11.dex */
public class f4x extends ar2<C8181a> {

    /* JADX INFO: renamed from: l.f4x$a */
    public class C16892a implements y20<Bundle> {
        public C16892a() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Bundle bundle) {
            ((C8181a) f4x.this.viewModel).m39784m(true);
            f4x.this.m124074G0();
        }
    }

    /* JADX INFO: renamed from: l.f4x$b */
    public class C16893b implements y20<C4470c> {
        public C16893b() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(C4470c c4470c) {
            if (c4470c == C4470c.f16267i) {
                ((C8181a) f4x.this.viewModel).m39774B(((C8181a) f4x.this.viewModel).f24041p.getType());
            } else if (c4470c == C4470c.f16268j) {
                ((C8181a) f4x.this.viewModel).m39778e();
            }
        }
    }

    /* JADX INFO: renamed from: l.f4x$c */
    public class C16894c implements qcj<ConversationCounter, Integer> {
        public C16894c() {
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call(ConversationCounter conversationCounter) {
            return Integer.valueOf(conversationCounter.messages.unReadOnlyMarriage);
        }
    }

    /* JADX INFO: renamed from: l.f4x$d */
    public class C16895d implements y20<Envelope> {
        public C16895d() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Envelope envelope) {
            if (f4x.this.viewModel != null) {
                ((C8181a) f4x.this.viewModel).f24022H.m137019l(Boolean.FALSE);
                List<User> list = ((CommonData) envelope.data.getModuleData(CommonData.class)).users;
                if (f4x.this.viewModel != null) {
                    List<User> listM161365f = n3x.m161365f(list);
                    boolean zM147479J = jyb.m147479J(listM161365f);
                    f4x f4xVar = f4x.this;
                    if (zM147479J) {
                        ((C8181a) f4xVar.viewModel).m39792w();
                    } else {
                        ((C8181a) f4xVar.viewModel).m39787q(listM161365f);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.f4x$e */
    public class C16896e implements y20<Throwable> {
        public C16896e() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            if (f4x.this.viewModel != null) {
                ((C8181a) f4x.this.viewModel).f24022H.m137019l(Boolean.FALSE);
                if (th instanceof TantanException.Client.TantanForbidden) {
                    int i = ((TantanException.Client.TantanForbidden) th).code;
                    if (i == 40302) {
                        ((C8181a) f4x.this.viewModel).m39792w();
                        return;
                    } else if (i == 40303) {
                        ((C8181a) f4x.this.viewModel).m39791v();
                        return;
                    } else if (i == 40304) {
                        r1j0.m179420g("婚恋资料未通过审核");
                    }
                }
                ((C8181a) f4x.this.viewModel).m39789s();
            }
        }
    }

    /* JADX INFO: renamed from: l.f4x$f */
    public class C16897f implements qcj<Boolean, C22421c<uxj0>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ User f97161a;

        public C16897f(User user) {
            this.f97161a = user;
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C22421c<uxj0> call(Boolean bool) {
            if (bool.booleanValue()) {
                return CoreModule.f18264c.f20384f0.m33905ap(this.f97161a.f56859id);
            }
            azk0.m101074a("");
            return null;
        }
    }

    public f4x(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public /* synthetic */ void m124050J0(String str) {
        Picture picture = new Picture();
        picture.url = str;
        uqb0.f180374G.m127096B0(((C8181a) this.viewModel).m39781j(), picture.profile480());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public /* synthetic */ void m124051L0(uxj0 uxj0Var) {
        m124074G0();
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m124059l0(Throwable th) {
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m124060m0(Throwable th) {
    }

    /* JADX INFO: renamed from: E0 */
    public boolean m124072E0() {
        return n3x.m161369j() && !joa.m146358H3();
    }

    /* JADX INFO: renamed from: F0 */
    public void m124073F0(User user) {
        if (user == null) {
            return;
        }
        CoreModule.f18264c.f20405m0.m32037O8(user.f56859id);
    }

    /* JADX INFO: renamed from: G0 */
    public void m124074G0() {
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((C8181a) v2).m39790u();
        }
        duringCreated(CoreModule.f18264c.f20405m0.m32065V8()).subscribe(psd0.m173597H(new C16895d(), new C16896e()));
    }

    /* JADX INFO: renamed from: H0 */
    public void m124075H0() {
        n3x.m161382w(act(), "marriage_mode_entrance");
    }

    /* JADX INFO: renamed from: I0 */
    public void m124076I0() {
        act().startActivity(MarriageMsgAct.m43500a2(act()));
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m124077N0(Integer num) {
        ((C8181a) this.viewModel).m39794y(num.intValue());
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m124078O0(User user, x20 x20Var, uxj0 uxj0Var) {
        act().progressDismiss();
        act().startActivity(MessagesAct.m50123g2(act(), user.f56859id, 39, new pf60[0]));
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m124079P0(Throwable th) {
        act().progressDismiss();
        if (th instanceof TantanException.Client.TantanForbidden) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            int i = tantanForbidden.code;
            String str = tantanForbidden.message;
            if (i == 40399) {
                r1j0.m179420g(str);
            }
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public void m124080Q0(final User user, final x20 x20Var) {
        if (user == null) {
            return;
        }
        ((C8181a) this.viewModel).getAct().progress(R$string.f18632L5);
        duringCreated((C22421c) CoreModule.f18264c.f20381e0.m116641za(user.f56859id).flatMap(new C16897f(user))).subscribe(psd0.m173597H(new y20() { // from class: l.w3x
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f187177a.m124078O0(user, x20Var, (uxj0) obj);
            }
        }, new y20() { // from class: l.x3x
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f192309a.m124079P0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R0 */
    public void m124081R0(User user) {
        CoreModule.f18264c.f20405m0.m32041P8(user.f56859id);
    }

    /* JADX INFO: renamed from: S0 */
    public void m124082S0() {
        CoreModule.f18273l.m143405a().mo34570q6(act(), "p_marriage_home,e_chat_next_pull,click", null);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new C16892a());
        duringCreated(CoreModule.f18264c.f20381e0.m116596o9().filter(new qcj() { // from class: l.y3x
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((User) obj).hasPic());
            }
        }).map(new qcj() { // from class: l.z3x
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((User) obj).m61308fp().url;
            }
        }).distinctUntilChanged()).subscribe(psd0.m173597H(new y20() { // from class: l.a4x
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f68457a.m124050J0((String) obj);
            }
        }, new y20() { // from class: l.b4x
            @Override // p153l.y20
            public final void call(Object obj) {
                f4x.m124060m0((Throwable) obj);
            }
        }));
        duringCreated(((C8181a) this.viewModel).f24051z.lifecycle()).subscribe(psd0.m173597H(new C16893b(), new y20() { // from class: l.c4x
            @Override // p153l.y20
            public final void call(Object obj) {
                f4x.m124059l0((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20405m0.f20148e0).subscribe(psd0.m173596G(new y20() { // from class: l.d4x
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85083a.m124051L0((uxj0) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20384f0.m33776Qe()).map(new C16894c()).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.e4x
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f92163a.m124077N0((Integer) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
