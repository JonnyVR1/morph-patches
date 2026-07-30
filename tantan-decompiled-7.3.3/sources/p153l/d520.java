package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.R$string;
import com.p051p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.external.module.api.MyRoomInProfileApi;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class d520 extends ar2<m520> {

    /* JADX INFO: renamed from: a */
    public final String f85092a;

    /* JADX INFO: renamed from: b */
    public final String f85093b;

    /* JADX INFO: renamed from: c */
    public Boolean f85094c;

    /* JADX INFO: renamed from: d */
    public final MyRoomInProfileApi f85095d;

    /* JADX INFO: renamed from: e */
    public i420 f85096e;

    public d520(ner nerVar, String str, String str2) {
        super(nerVar);
        this.f85095d = new MyRoomInProfileApi();
        this.f85092a = str;
        this.f85093b = str2;
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        duringCreated(wya0.m208478b().m208479a()).filter(new qcj() { // from class: l.y420
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Boolean) obj) != null);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.z420
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f202893a.m114253j0((Boolean) obj);
            }
        }));
        duringCreated(C22421c.zip(mbs.m157872p0(this.f85092a), this.f85095d.getMyRoomInProfile(this.f85092a), new rcj() { // from class: l.a520
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return jyb.m147494Y((User) obj, (List) obj2);
            }
        })).take(1).observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.b520
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f75014a.m114254k0((pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i0 */
    public void m114252i0(boolean z) {
        if (NullChecker.m82486a(this.f85094c) && this.f85094c.booleanValue() == z) {
            return;
        }
        this.f85094c = Boolean.valueOf(z);
        ((m520) this.viewModel).m157090e(this.f85096e, z);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m114253j0(Boolean bool) {
        ((m520) this.viewModel).m157091f(bool.booleanValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m114254k0(pf60 pf60Var) {
        m114256m0((List) pf60Var.f152157b, mbs.m157870o0().equals(this.f85092a));
    }

    /* JADX INFO: renamed from: l0 */
    public final void m114255l0(i420 i420Var) {
        if (mbs.m157821G().mo68436Zo().mo136897a()) {
            o1j0.m165649w(R$string.f44948C1);
            return;
        }
        boolean zM138391f = i420Var.m138391f();
        gfj0.m130078f(i420Var, zM138391f, this.f85093b);
        if (!TextUtils.equals(i420Var.m138388c().f56859id, mbs.m157870o0())) {
            act().startActivity(tbs.f172993f.m143704f(act(), AudienceStartData.getBuilder().m68776D(i420Var.m138386a()).m68799z(this.f85092a).m68787O("my_room_in_profile").m68794u()));
        } else if (zM138391f) {
            iqn0.m141677e(act(), AnchorStartData.getBuilder().m68746n("my_room_in_profile").m68743k());
        } else {
            tbs.f172993f.m143699a(act(), AnchorStartData.getBuilder().m68745m(false).m68746n("my_room_in_profile").m68743k());
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m114256m0(List<i420> list, boolean z) {
        if (jyb.m147479J(list)) {
            return;
        }
        bnl0.m105524M(((m520) this.viewModel).f134855a, true);
        i420 i420Var = list.get(0);
        i420 i420Var2 = list.size() > 1 ? list.get(1) : null;
        this.f85096e = i420Var;
        ((m520) this.viewModel).m157092j(i420Var, i420Var2, this.f85094c, new y20() { // from class: l.c520
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f79752a.m114255l0((i420) obj);
            }
        }, z);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
