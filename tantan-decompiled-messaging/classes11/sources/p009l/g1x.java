package p009l;

import android.os.Bundle;
import com.p000p1.mobile.putong.core.newui.home.marrymode.C0194a;
import com.p000p1.mobile.putong.core.newui.messages.marriage.MarriageMsgAct;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.ConversationCounter;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import java.util.List;
import l.d30;
import l.e30;
import l.j760;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.osi0;
import l.qib0;
import l.roj0;
import l.s7m;
import l.upk0;
import l.vwb;
import l.w9j;
import l.xma;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class g1x extends jq2<C0194a> {

    /* JADX INFO: renamed from: l.g1x$a */
    public class C0904a implements e30<Bundle> {
        public C0904a() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Bundle bundle) {
            ((C0194a) ((jq2) g1x.this).viewModel).m2777m(true);
            g1x.this.m14747G0();
        }
    }

    /* JADX INFO: renamed from: l.g1x$b */
    public class C0905b implements e30<c> {
        public C0905b() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(c cVar) {
            if (cVar == c.i) {
                ((C0194a) ((jq2) g1x.this).viewModel).m2765B(((C0194a) ((jq2) g1x.this).viewModel).f2077p.getType());
            } else if (cVar == c.j) {
                ((C0194a) ((jq2) g1x.this).viewModel).m2770e();
            }
        }
    }

    /* JADX INFO: renamed from: l.g1x$c */
    public class C0906c implements w9j<ConversationCounter, Integer> {
        public C0906c() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call(ConversationCounter conversationCounter) {
            return Integer.valueOf(conversationCounter.messages.unReadOnlyMarriage);
        }
    }

    /* JADX INFO: renamed from: l.g1x$d */
    public class C0907d implements e30<Envelope> {
        public C0907d() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Envelope envelope) {
            if (((jq2) g1x.this).viewModel != null) {
                ((C0194a) ((jq2) g1x.this).viewModel).f2058H.onNext(Boolean.FALSE);
                List list = envelope.data.getModuleData(CommonData.class).users;
                if (((jq2) g1x.this).viewModel != null) {
                    List<User> listM19577f = o0x.m19577f(list);
                    boolean zJ = vwb.J(listM19577f);
                    g1x g1xVar = g1x.this;
                    if (zJ) {
                        ((C0194a) ((jq2) g1xVar).viewModel).m2785w();
                    } else {
                        ((C0194a) ((jq2) g1xVar).viewModel).m2780q(listM19577f);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.g1x$e */
    public class C0908e implements e30<Throwable> {
        public C0908e() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            if (((jq2) g1x.this).viewModel != null) {
                ((C0194a) ((jq2) g1x.this).viewModel).f2058H.onNext(Boolean.FALSE);
                if (th instanceof TantanException.Client.TantanForbidden) {
                    int i = ((TantanException.Client.TantanForbidden) th).code;
                    if (i == 40302) {
                        ((C0194a) ((jq2) g1x.this).viewModel).m2785w();
                        return;
                    } else if (i == 40303) {
                        ((C0194a) ((jq2) g1x.this).viewModel).m2784v();
                        return;
                    } else if (i == 40304) {
                        osi0.g("婚恋资料未通过审核");
                    }
                }
                ((C0194a) ((jq2) g1x.this).viewModel).m2782s();
            }
        }
    }

    /* JADX INFO: renamed from: l.g1x$f */
    public class C0909f implements w9j<Boolean, rx.c<roj0>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ User f13268a;

        public C0909f(User user) {
            this.f13268a = user;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<roj0> call(Boolean bool) {
            if (bool.booleanValue()) {
                return CoreModule.c.f0.ap(((DbObject) this.f13268a).id);
            }
            upk0.a("");
            return null;
        }
    }

    public g1x(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public /* synthetic */ void m14723J0(String str) {
        Picture picture = new Picture();
        ((Media) picture).url = str;
        qib0.G.B0(((C0194a) ((jq2) this).viewModel).m2774j(), picture.profile480());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public /* synthetic */ void m14724L0(roj0 roj0Var) {
        m14747G0();
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m14732l0(Throwable th) {
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m14733m0(Throwable th) {
    }

    /* JADX INFO: renamed from: E0 */
    public boolean m14745E0() {
        return o0x.m19581j() && !xma.G3();
    }

    /* JADX INFO: renamed from: F0 */
    public void m14746F0(User user) {
        if (user == null) {
            return;
        }
        CoreModule.c.m0.O8(((DbObject) user).id);
    }

    /* JADX INFO: renamed from: G0 */
    public void m14747G0() {
        s7m s7mVar = ((jq2) this).viewModel;
        if (s7mVar != null) {
            ((C0194a) s7mVar).m2783u();
        }
        duringCreated(CoreModule.c.m0.V8()).subscribe(mkd0.H(new C0907d(), new C0908e()));
    }

    /* JADX INFO: renamed from: H0 */
    public void m14748H0() {
        o0x.m19594w(act(), "marriage_mode_entrance");
    }

    /* JADX INFO: renamed from: I0 */
    public void m14749I0() {
        act().startActivity(MarriageMsgAct.m6644Z1(act()));
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m14750N0(Integer num) {
        ((C0194a) ((jq2) this).viewModel).m2787y(num.intValue());
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m14751O0(User user, d30 d30Var, roj0 roj0Var) {
        act().progressDismiss();
        act().startActivity(MessagesAct.e2(act(), ((DbObject) user).id, 39, new j760[0]));
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m14752P0(Throwable th) {
        act().progressDismiss();
        if (th instanceof TantanException.Client.TantanForbidden) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            int i = tantanForbidden.code;
            String str = tantanForbidden.message;
            if (i == 40399) {
                osi0.g(str);
            }
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public void m14753Q0(final User user, final d30 d30Var) {
        if (user == null) {
            return;
        }
        ((C0194a) ((jq2) this).viewModel).act().progress(R.string.J5);
        duringCreated(CoreModule.c.e0.za(((DbObject) user).id).flatMap(new C0909f(user))).subscribe(mkd0.H(new e30() { // from class: l.x0x
            public final void call(Object obj) {
                this.f22393a.m14751O0(user, d30Var, (roj0) obj);
            }
        }, new e30() { // from class: l.y0x
            public final void call(Object obj) {
                this.f22846a.m14752P0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R0 */
    public void m14754R0(User user) {
        CoreModule.c.m0.P8(((DbObject) user).id);
    }

    /* JADX INFO: renamed from: S0 */
    public void m14755S0() {
        CoreModule.l.a().q6(act(), "p_marriage_home,e_chat_next_pull,click", (e30) null);
    }

    /* JADX INFO: renamed from: a0 */
    public void m14756a0() {
        super.a0();
        creates(new C0904a());
        duringCreated(CoreModule.c.e0.o9().filter(new w9j() { // from class: l.z0x
            public final Object call(Object obj) {
                return Boolean.valueOf(((User) obj).hasPic());
            }
        }).map(new w9j() { // from class: l.a1x
            public final Object call(Object obj) {
                return ((Media) ((User) obj).fp()).url;
            }
        }).distinctUntilChanged()).subscribe(mkd0.H(new e30() { // from class: l.b1x
            public final void call(Object obj) {
                this.f9873a.m14723J0((String) obj);
            }
        }, new e30() { // from class: l.c1x
            public final void call(Object obj) {
                g1x.m14733m0((Throwable) obj);
            }
        }));
        duringCreated(((C0194a) ((jq2) this).viewModel).f2087z.lifecycle()).subscribe(mkd0.H(new C0905b(), new e30() { // from class: l.d1x
            public final void call(Object obj) {
                g1x.m14732l0((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.c.m0.e0).subscribe(mkd0.G(new e30() { // from class: l.e1x
            public final void call(Object obj) {
                this.f12150a.m14724L0((roj0) obj);
            }
        }));
        duringCreated(CoreModule.c.f0.Qe()).map(new C0906c()).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.f1x
            public final void call(Object obj) {
                this.f12751a.m14750N0((Integer) obj);
            }
        }));
    }

    public void destroy() {
    }
}
