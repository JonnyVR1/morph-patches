package p003l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.data.CoreMomentInfo;
import com.p000p1.mobile.putong.core.data.Greeting;
import com.p000p1.mobile.putong.core.data.Message;
import com.p000p1.mobile.putong.core.message.R$string;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.Converter;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.fxq;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.mqi0;
import l.q860;
import l.vwb;
import p003l.k2n;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public abstract class j2n<V extends k2n<?>> extends jq2<V> {

    /* JADX INFO: renamed from: a */
    public String f5237a;

    public j2n(mcr mcrVar) {
        super(mcrVar);
        this.f5237a = URLEncoder.encode(Converter.dateToApiTimeString(mqi0.o()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m7324n0(Bundle bundle) {
        ((k2n) ((jq2) this).viewModel).m7489r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m7325o0(c cVar) {
        if (cVar == c.i) {
            mo5473r0();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void mo5464a0() {
        creates(new e30() { // from class: l.d2n
            public final void call(Object obj) {
                this.f4103a.m7324n0((Bundle) obj);
            }
        });
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.e2n
            public final void call(Object obj) {
                this.f4247a.m7325o0((c) obj);
            }
        }));
        duringCreated(CoreModule.c.r0.q0).subscribe(mkd0.G(new e30() { // from class: l.f2n
            public final void call(Object obj) {
                this.f4379a.m7328p0((Boolean) obj);
            }
        }));
        duringCreated(CoreModule.c.r0.C6()).subscribe(mkd0.H(new e30() { // from class: l.g2n
            public final void call(Object obj) {
                CoreModule.c.r0.i5();
            }
        }, new e30() { // from class: l.h2n
            public final void call(Object obj) {
                CoreModule.c.r0.i5();
            }
        }));
        duringCreated(CoreModule.c.r0.n0).subscribe(mkd0.G(new e30() { // from class: l.i2n
            public final void call(Object obj) {
                this.f4984a.m7329q0((Greeting) obj);
            }
        }));
        mo5474s0(true);
    }

    /* JADX INFO: renamed from: l0 */
    public List<fxq> m7326l0(List<Greeting> list, List<Message> list2) {
        ArrayList arrayList = new ArrayList();
        if (!vwb.J(list)) {
            for (Greeting greeting : list) {
                fxq fxqVar = new fxq();
                fxqVar.x(greeting.f63id);
                fxqVar.O(greeting.otherUser);
                User userPa = CoreModule.c.e0.Pa(greeting.otherUser);
                if (NullChecker.a(userPa)) {
                    fxqVar.I(rw6.m9196b(userPa).profileSmall().formatted());
                    fxqVar.L(greeting.latestTime);
                    fxqVar.P(userPa.name);
                    fxqVar.Q(userPa.gender);
                    fxqVar.y(userPa.isIdAndPicBothVerified());
                    fxqVar.F(userPa.isPicVerificationVerified());
                    fxqVar.N(userPa.age.intValue());
                    boolean z = false;
                    fxqVar.C(!userPa.isHideIconFromSVipWithMe() && userPa.isODiamond());
                    fxqVar.H(!userPa.isHideIconFromSVipWithMe() && userPa.isPlatinum());
                    if (!userPa.isHideIconFromSVipWithMe() && userPa.isSupremePartner()) {
                        z = true;
                    }
                    fxqVar.K(z);
                }
                fxqVar.J(greeting.status);
                fxqVar.w(greeting);
                fxqVar.M(greeting.messages.unread);
                for (Message message : list2) {
                    if (((DbObject) message).id.equals(greeting.messages.latestId)) {
                        Boolean bool = message.recalled;
                        if (bool != null && bool.booleanValue()) {
                            fxqVar.B(CoreModule.b.getResources().getString(R$string.f455K4));
                            break;
                        }
                        fxqVar.B(message.value);
                        break;
                    }
                }
                if (!TextUtils.isEmpty(greeting.moment.id)) {
                    CoreMomentInfo coreMomentInfoMh = CoreModule.N().Mh(greeting.moment.id, CoreMomentInfo.JSON_ADAPTER);
                    if (NullChecker.a(coreMomentInfoMh)) {
                        fxqVar.z(coreMomentInfoMh.value);
                        fxqVar.A(coreMomentInfoMh.media);
                    }
                }
                arrayList.add(fxqVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: m0 */
    public List<fxq> m7327m0(q860<Greeting> q860Var, List<Message> list) {
        return m7326l0(q860Var.a, list);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m7328p0(Boolean bool) {
        if (!bool.booleanValue()) {
            mo5472k0();
        }
        mo5473r0();
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m7329q0(Greeting greeting) {
        if (((k2n) ((jq2) this).viewModel).f5416c.booleanValue()) {
            List<fxq> listM7484b = ((k2n) ((jq2) this).viewModel).m7484b();
            if (NullChecker.a(listM7484b)) {
                for (int i = 0; i < listM7484b.size(); i++) {
                    fxq fxqVar = listM7484b.get(i);
                    if (TextUtils.equals(fxqVar.f(), greeting.f63id)) {
                        fxqVar.M(0);
                        ((k2n) ((jq2) this).viewModel).m7487e();
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: r0 */
    public abstract void mo5473r0();

    /* JADX INFO: renamed from: s0 */
    public abstract void mo5474s0(boolean z);

    /* JADX INFO: renamed from: t0 */
    public abstract void mo5475t0();

    public void destroy() {
    }

    /* JADX INFO: renamed from: k0 */
    public void mo5472k0() {
    }
}
