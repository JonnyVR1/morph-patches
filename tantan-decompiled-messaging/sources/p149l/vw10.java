package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.R$string;
import com.p046p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.external.module.api.MyRoomInProfileApi;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
public class vw10 extends jq2<ex10> {

    /* JADX INFO: renamed from: a */
    public final String f183292a;

    /* JADX INFO: renamed from: b */
    public final String f183293b;

    /* JADX INFO: renamed from: c */
    public Boolean f183294c;

    /* JADX INFO: renamed from: d */
    public final MyRoomInProfileApi f183295d;

    /* JADX INFO: renamed from: e */
    public aw10 f183296e;

    public vw10(mcr mcrVar, String str, String str2) {
        super(mcrVar);
        this.f183295d = new MyRoomInProfileApi();
        this.f183292a = str;
        this.f183293b = str2;
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        duringCreated(sqa0.m185475b().m185476a()).filter(new w9j() { // from class: l.qw10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Boolean) obj) != null);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.rw10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f161295a.m200273j0((Boolean) obj);
            }
        }));
        duringCreated(C22306c.zip(l9s.m149095p0(this.f183292a), this.f183295d.getMyRoomInProfile(this.f183292a), new x9j() { // from class: l.sw10
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return vwb.m200311Y((User) obj, (List) obj2);
            }
        })).take(1).observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.tw10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f172357a.m200274k0((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i0 */
    public void m200272i0(boolean z) {
        if (NullChecker.m81303a(this.f183294c) && this.f183294c.booleanValue() == z) {
            return;
        }
        this.f183294c = Boolean.valueOf(z);
        ((ex10) this.viewModel).m118536e(this.f183296e, z);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m200273j0(Boolean bool) {
        ((ex10) this.viewModel).m118537f(bool.booleanValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m200274k0(j760 j760Var) {
        m200276m0((List) j760Var.f116565b, l9s.m149093o0().equals(this.f183292a));
    }

    /* JADX INFO: renamed from: l0 */
    public final void m200275l0(aw10 aw10Var) {
        if (l9s.m149044G().mo67253Zo().mo111890a()) {
            lsi0.m151593w(R$string.f44100C1);
            return;
        }
        boolean zM99228f = aw10Var.m99228f();
        c6j0.m105480f(aw10Var, zM99228f, this.f183293b);
        if (!TextUtils.equals(aw10Var.m99225c().f56011id, l9s.m149093o0())) {
            act().startActivity(s9s.f163232f.m134373f(act(), AudienceStartData.getBuilder().m67593D(aw10Var.m99223a()).m67616z(this.f183292a).m67604O("my_room_in_profile").m67611u()));
        } else if (zM99228f) {
            ehn0.m116502e(act(), AnchorStartData.getBuilder().m67563n("my_room_in_profile").m67560k());
        } else {
            s9s.f163232f.m134368a(act(), AnchorStartData.getBuilder().m67562m(false).m67563n("my_room_in_profile").m67560k());
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m200276m0(List<aw10> list, boolean z) {
        if (vwb.m200296J(list)) {
            return;
        }
        xdl0.m208344M(((ex10) this.viewModel).f93565a, true);
        aw10 aw10Var = list.get(0);
        aw10 aw10Var2 = list.size() > 1 ? list.get(1) : null;
        this.f183296e = aw10Var;
        ((ex10) this.viewModel).m118538j(aw10Var, aw10Var2, this.f183294c, new e30() { // from class: l.uw10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f178582a.m200275l0((aw10) obj);
            }
        }, z);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
