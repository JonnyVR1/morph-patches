package p009l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.core.data.Greeting;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageType;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.Converter;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.roj0;
import l.rw6;
import l.vwb;
import p009l.oj2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class nj2<V extends oj2<?>> extends jq2<V> {

    /* JADX INFO: renamed from: a */
    public String f17493a;

    public nj2(mcr mcrVar) {
        super(mcrVar);
        this.f17493a = URLEncoder.encode(Converter.dateToApiTimeString(mqi0.m18550o()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m18887p0(Bundle bundle) {
        ((oj2) ((jq2) this).viewModel).mo16556r();
        if (((Boolean) CoreModule.c.r0.R.get()).booleanValue()) {
            return;
        }
        ((oj2) ((jq2) this).viewModel).mo16552i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m18888q0(Boolean bool) {
        ((oj2) ((jq2) this).viewModel).mo16551f(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m18889r0(Throwable th) {
        ((oj2) ((jq2) this).viewModel).mo16551f(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m18890s0(c cVar) {
        if (cVar == c.i) {
            mo15713z0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m18891u0(roj0 roj0Var) {
        if (((oj2) ((jq2) this).viewModel).f18073a.m386Z1()) {
            CoreModule.c.r0.h5();
        } else {
            CoreModule.c.r0.i5();
        }
    }

    /* JADX INFO: renamed from: A0 */
    public abstract void mo15704A0(boolean z);

    /* JADX INFO: renamed from: C0 */
    public abstract void mo15705C0();

    /* JADX INFO: renamed from: a0 */
    public void mo15712a0() {
        creates(new e30() { // from class: l.fj2
            public final void call(Object obj) {
                this.f13051a.m18887p0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.c.r0.n5()).subscribe(mkd0.H(new e30() { // from class: l.gj2
            public final void call(Object obj) {
                this.f13593a.m18888q0((Boolean) obj);
            }
        }, new e30() { // from class: l.hj2
            public final void call(Object obj) {
                this.f14142a.m18889r0((Throwable) obj);
            }
        }));
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.ij2
            public final void call(Object obj) {
                this.f14660a.m18890s0((c) obj);
            }
        }));
        duringCreated(CoreModule.c.r0.q0).subscribe(mkd0.G(new e30() { // from class: l.jj2
            public final void call(Object obj) {
                this.f15190a.m18895t0((Boolean) obj);
            }
        }));
        duringCreated(((oj2) ((jq2) this).viewModel).f18073a.m386Z1() ? CoreModule.c.r0.z6() : CoreModule.c.r0.C6()).subscribe(mkd0.H(new e30() { // from class: l.kj2
            public final void call(Object obj) {
                this.f15725a.m18891u0((roj0) obj);
            }
        }, new e30() { // from class: l.lj2
            public final void call(Object obj) {
                this.f16182a.m18896x0((Throwable) obj);
            }
        }));
        duringCreated(((oj2) ((jq2) this).viewModel).f18073a.m386Z1() ? CoreModule.c.r0.o0 : CoreModule.c.r0.n0).subscribe(mkd0.G(new e30() { // from class: l.mj2
            public final void call(Object obj) {
                this.f16962a.m18897y0((Greeting) obj);
            }
        }));
        mo15704A0(true);
    }

    /* JADX INFO: renamed from: n0 */
    public List<fxq> m18893n0(List<Greeting> list, List<Message> list2) {
        ArrayList arrayList = new ArrayList();
        if (!vwb.J(list)) {
            for (Greeting greeting : list) {
                fxq fxqVar = new fxq();
                fxqVar.m14629x(greeting.id);
                fxqVar.m14608O(greeting.otherUser);
                User userPa = CoreModule.c.e0.Pa(greeting.otherUser);
                if (NullChecker.a(userPa)) {
                    fxqVar.m14602I(rw6.b(userPa).profileSmall().formatted());
                    fxqVar.m14605L(greeting.latestTime);
                    fxqVar.m14609P(userPa.name);
                    fxqVar.m14610Q(userPa.gender);
                    fxqVar.m14630y(userPa.isIdAndPicBothVerified());
                    fxqVar.m14600F(userPa.isPicVerificationVerified());
                    fxqVar.m14607N(userPa.age.intValue());
                    boolean z = false;
                    fxqVar.m14599C(!userPa.isHideIconFromSVipWithMe() && userPa.isODiamond());
                    fxqVar.m14601H(!userPa.isHideIconFromSVipWithMe() && userPa.isPlatinum());
                    if (!userPa.isHideIconFromSVipWithMe() && userPa.isSupremePartner()) {
                        z = true;
                    }
                    fxqVar.m14604K(z);
                }
                fxqVar.m14603J(greeting.status);
                fxqVar.m14628w(greeting);
                fxqVar.m14606M(greeting.messages.unread);
                for (Message message : list2) {
                    if (((DbObject) message).id.equals(greeting.messages.latestId)) {
                        if (message.messageType() != MessageType.get("chat_gift")) {
                            if (message.messageType() != MessageType.get("picture")) {
                                Boolean bool = message.recalled;
                                if (bool != null && bool.booleanValue()) {
                                    fxqVar.m14598B(CoreModule.b.getResources().getString(R.string.K4));
                                    break;
                                }
                                fxqVar.m14598B(message.value);
                                break;
                            }
                            fxqVar.m14598B(CoreModule.b.getResources().getString(R.string.q4));
                            break;
                        }
                        fxqVar.m14598B(CoreModule.o.d().Ac(message).toString());
                        break;
                    }
                }
                if (!TextUtils.isEmpty(greeting.moment.id)) {
                    CoreMomentInfo coreMomentInfoMh = CoreModule.N().Mh(greeting.moment.id, CoreMomentInfo.JSON_ADAPTER);
                    if (NullChecker.a(coreMomentInfoMh)) {
                        fxqVar.m14631z(coreMomentInfoMh.value);
                        fxqVar.m14597A(coreMomentInfoMh.media);
                    }
                }
                arrayList.add(fxqVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o0 */
    public List<fxq> m18894o0(q860<Greeting> q860Var, List<Message> list) {
        return m18893n0(q860Var.f19068a, list);
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m18895t0(Boolean bool) {
        if (bool.booleanValue()) {
            mo15713z0();
        } else {
            m18892m0();
            mo15713z0();
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m18896x0(Throwable th) {
        if (((oj2) ((jq2) this).viewModel).f18073a.m386Z1()) {
            CoreModule.c.r0.h5();
        } else {
            CoreModule.c.r0.i5();
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m18897y0(Greeting greeting) {
        if (((oj2) ((jq2) this).viewModel).f18076d.booleanValue()) {
            List<fxq> listMo16548b = ((oj2) ((jq2) this).viewModel).mo16548b();
            for (int i = 0; i < listMo16548b.size(); i++) {
                fxq fxqVar = listMo16548b.get(i);
                if (TextUtils.equals(fxqVar.m14613f(), greeting.id)) {
                    fxqVar.m14606M(0);
                    ((oj2) ((jq2) this).viewModel).mo16549d();
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: z0 */
    public abstract void mo15713z0();

    public void destroy() {
    }

    /* JADX INFO: renamed from: m0 */
    public void m18892m0() {
    }
}
