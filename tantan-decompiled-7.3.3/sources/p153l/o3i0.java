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
import com.p051p1.mobile.putong.core.p058ui.result.TanTanCoinItem;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes12.dex */
public class o3i0 extends jic0<Privilege> {

    /* JADX INFO: renamed from: c */
    public PutongFrag f144837c;

    /* JADX INFO: renamed from: d */
    public List<Privilege> f144838d;

    public o3i0(PutongFrag putongFrag, List<Privilege> list, boolean z) {
        this.f144837c = putongFrag;
        this.f144838d = list;
        C22421c<R> map = CoreModule.f18264c.m32486n3().map(new qcj() { // from class: l.h3i0
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
        mo68557c(putongFrag, psd0.m173631x(map, c22421cM116596o9, c22421cM156793t3, c22421cM146424v3, c22421cM146424v4, c22421cMo34606um, c22421cMo34606um2, C22421c.just(uxj0Var), C22421c.just(uxj0Var), new ycj() { // from class: l.i3i0
            @Override // p153l.ycj
            /* JADX INFO: renamed from: a */
            public final Object mo138300a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
                return jyb.m147507f0((List) obj, (User) obj2, (Optional) obj3, obj4, obj5, obj6, (String) obj7, (uxj0) obj8, (uxj0) obj9);
            }
        })).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.j3i0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118187a.m165856J((ArrayList) obj);
            }
        }));
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        if (jyb.m147479J(this.f144838d)) {
            return 0;
        }
        return this.f144838d.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return this.f144837c.mo21577H2().inflate(rec0.f162576l2, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, Privilege privilege, int i, int i2) {
        ((TanTanCoinItem) view).m55974x(this.f144837c, privilege);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public Privilege getItem(int i) {
        if (jyb.m147479J(this.f144838d)) {
            return null;
        }
        return this.f144838d.get(i);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m165856J(ArrayList arrayList) {
        notifyDataSetChanged();
    }
}
