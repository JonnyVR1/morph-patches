package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.google.common.base.Optional;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.BoostStatus;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.core.p053ui.wallet.TanTanCoinItem2;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class fvh0 extends dac0<Privilege> {

    /* JADX INFO: renamed from: c */
    public PutongFrag f99446c;

    /* JADX INFO: renamed from: d */
    public List<Privilege> f99447d;

    public fvh0(PutongFrag putongFrag, List<Privilege> list, boolean z) {
        this.f99446c = putongFrag;
        this.f99447d = list;
        C22306c<R> map = CoreModule.f17545c.m31483n3().map(new w9j() { // from class: l.cvh0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((Counter) obj).boostLimits;
            }
        });
        C22306c<User> c22306cM169523o9 = CoreModule.f17545c.f19639e0.m169523o9();
        C22306c<Optional<BoostStatus>> c22306cM139281t3 = CoreModule.f17545c.f19576J0.m139281t3();
        C22306c<UserPrivilege> c22306cM210111u3 = z ? CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("quickchatNumber")) : C22306c.just(roj0.f160388a);
        C22306c<UserPrivilege> c22306cM210111u4 = z ? CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("quickchatPeek")) : C22306c.just(roj0.f160388a);
        C22306c<String> c22306cMo33603um = z ? CoreModule.m29935P().m94651a().mo33603um() : C22306c.just(roj0.f160388a);
        C22306c<String> c22306cMo33603um2 = CoreModule.m29935P().m94651a().mo33603um();
        roj0 roj0Var = roj0.f160388a;
        mo67374c(putongFrag, mkd0.m154990x(map, c22306cM169523o9, c22306cM139281t3, c22306cM210111u3, c22306cM210111u4, c22306cMo33603um, c22306cMo33603um2, C22306c.just(roj0Var), C22306c.just(roj0Var), new eaj() { // from class: l.dvh0
            @Override // p149l.eaj
            /* JADX INFO: renamed from: a */
            public final Object mo99191a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
                return vwb.m200324f0((List) obj, (User) obj2, (Optional) obj3, obj4, obj5, obj6, (String) obj7, (roj0) obj8, (roj0) obj9);
            }
        })).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.evh0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93338a.m123303J((ArrayList) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m123303J(ArrayList arrayList) {
        notifyDataSetChanged();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        if (vwb.m200296J(this.f99447d)) {
            return 0;
        }
        return this.f99447d.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return this.f99446c.mo20578H2().inflate(m6c0.f131620m2, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, Privilege privilege, int i, int i2) {
        ((TanTanCoinItem2) view).m58113H0(this.f99446c, privilege);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public Privilege getItem(int i) {
        if (vwb.m200296J(this.f99447d)) {
            return null;
        }
        return this.f99447d.get(i);
    }
}
