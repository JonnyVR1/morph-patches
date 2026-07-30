package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.google.common.base.Optional;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.BoostStatus;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.core.p058ui.wallet.TanTanCoinItem2;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes12.dex */
public class n3i0 extends jic0<Privilege> {

    /* JADX INFO: renamed from: c */
    public PutongFrag f140003c;

    /* JADX INFO: renamed from: d */
    public List<Privilege> f140004d;

    public n3i0(PutongFrag putongFrag, List<Privilege> list, boolean z) {
        this.f140003c = putongFrag;
        this.f140004d = list;
        C22421c<R> map = CoreModule.f18264c.m32486n3().map(new qcj() { // from class: l.k3i0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((Counter) obj).boostLimits;
            }
        });
        C22421c<User> c22421cM116596o9 = CoreModule.f18264c.f20381e0.m116596o9();
        C22421c<Optional<BoostStatus>> c22421cM156793t3 = CoreModule.f18264c.f20318J0.m156793t3();
        C22421c<UserPrivilege> c22421cM146424v3 = z ? CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("quickchatNumber")) : C22421c.just(uxj0.f181467a);
        C22421c<UserPrivilege> c22421cM146424v4 = z ? CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("quickchatPeek")) : C22421c.just(uxj0.f181467a);
        C22421c<String> c22421cMo34606um = z ? CoreModule.m30933P().m143405a().mo34606um() : C22421c.just(uxj0.f181467a);
        C22421c<String> c22421cMo34606um2 = CoreModule.m30933P().m143405a().mo34606um();
        uxj0 uxj0Var = uxj0.f181467a;
        mo68557c(putongFrag, psd0.m173631x(map, c22421cM116596o9, c22421cM156793t3, c22421cM146424v3, c22421cM146424v4, c22421cMo34606um, c22421cMo34606um2, C22421c.just(uxj0Var), C22421c.just(uxj0Var), new ycj() { // from class: l.l3i0
            @Override // p153l.ycj
            /* JADX INFO: renamed from: a */
            public final Object mo138300a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
                return jyb.m147507f0((List) obj, (User) obj2, (Optional) obj3, obj4, obj5, obj6, (String) obj7, (uxj0) obj8, (uxj0) obj9);
            }
        })).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.m3i0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134670a.m161314J((ArrayList) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m161314J(ArrayList arrayList) {
        notifyDataSetChanged();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        if (jyb.m147479J(this.f140004d)) {
            return 0;
        }
        return this.f140004d.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return this.f140003c.mo21577H2().inflate(rec0.f162580m2, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, Privilege privilege, int i, int i2) {
        ((TanTanCoinItem2) view).m59296H0(this.f140003c, privilege);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public Privilege getItem(int i) {
        if (jyb.m147479J(this.f140004d)) {
            return null;
        }
        return this.f140004d.get(i);
    }
}
