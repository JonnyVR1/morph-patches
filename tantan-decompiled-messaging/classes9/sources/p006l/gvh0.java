package p006l;

import android.view.View;
import android.view.ViewGroup;
import com.google.common.base.Optional;
import com.p000p1.mobile.putong.app.PutongFrag;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.result.TanTanCoinItem;
import com.p1.mobile.putong.core.data.BoostStatus;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.data.UserPrivilege;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.e30;
import l.eaj;
import l.m6c0;
import l.mkd0;
import l.roj0;
import l.vwb;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class gvh0 extends dac0<Privilege> {

    /* JADX INFO: renamed from: c */
    public PutongFrag f13534c;

    /* JADX INFO: renamed from: d */
    public List<Privilege> f13535d;

    public gvh0(PutongFrag putongFrag, List<Privilege> list, boolean z) {
        this.f13534c = putongFrag;
        this.f13535d = list;
        c map = CoreModule.f1534c.m3413n3().map(new w9j() { // from class: l.zuh0
            public final Object call(Object obj) {
                return ((Counter) obj).boostLimits;
            }
        });
        c<User> cVarM21486o9 = CoreModule.f1534c.f3628e0.m21486o9();
        c<Optional<BoostStatus>> cVarM17231t3 = CoreModule.f1534c.f3565J0.m17231t3();
        c<UserPrivilege> cVarM27419u3 = z ? CoreModule.f1534c.f3544C0.m27419u3(SummarizedPrivilegesId.get("quickchatNumber")) : c.just(roj0.a);
        c<UserPrivilege> cVarM27419u4 = z ? CoreModule.f1534c.f3544C0.m27419u3(SummarizedPrivilegesId.get("quickchatPeek")) : c.just(roj0.a);
        c<String> cVarM5540um = z ? CoreModule.m1854P().m11706a().m5540um() : c.just(roj0.a);
        c<String> cVarM5540um2 = CoreModule.m1854P().m11706a().m5540um();
        roj0 roj0Var = roj0.a;
        c(putongFrag, mkd0.x(map, cVarM21486o9, cVarM17231t3, cVarM27419u3, cVarM27419u4, cVarM5540um, cVarM5540um2, c.just(roj0Var), c.just(roj0Var), new eaj() { // from class: l.avh0
            /* JADX INFO: renamed from: a */
            public final Object m12299a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
                return vwb.f0(new Object[]{(List) obj, (User) obj2, (Optional) obj3, obj4, obj5, obj6, (String) obj7, (roj0) obj8, (roj0) obj9});
            }
        })).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.bvh0
            public final void call(Object obj) {
                this.f9108a.m16002J((ArrayList) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C */
    public int m15998C() {
        if (vwb.J(this.f13535d)) {
            return 0;
        }
        return this.f13535d.size();
    }

    /* JADX INFO: renamed from: D */
    public View m15999D(ViewGroup viewGroup, int i) {
        return this.f13534c.m1542H2().inflate(m6c0.l2, viewGroup, false);
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void m15997A(View view, Privilege privilege, int i, int i2) {
        ((TanTanCoinItem) view).m8149x(this.f13534c, privilege);
    }

    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public Privilege getItem(int i) {
        if (vwb.J(this.f13535d)) {
            return null;
        }
        return this.f13535d.get(i);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m16002J(ArrayList arrayList) {
        notifyDataSetChanged();
    }
}
