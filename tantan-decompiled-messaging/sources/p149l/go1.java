package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveFanBase;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.AvatarView;
import p133rx.Notification;

/* JADX INFO: loaded from: classes4.dex */
public class go1 extends bn1<am40> {
    public go1(bsm bsmVar, AvatarView avatarView) {
        super(bsmVar, avatarView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.bn1
    /* JADX INFO: renamed from: a4 */
    public boolean mo102733a4() {
        return uxi.m196181b(((am40) m206027E2()).m132146l0(), ((am40) m206027E2()).m132167u0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.bn1
    /* JADX INFO: renamed from: b4 */
    public boolean mo102734b4() {
        return ((am40) m206027E2()).mo132100V0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.bn1
    /* JADX INFO: renamed from: l4 */
    public void mo102741l4(int i) {
        super.mo102741l4(i);
        if (i == 3) {
            h4g h4gVarM132161r0 = ((am40) m206027E2()).m132161r0();
            if (h4gVarM132161r0 != null) {
                if (h4gVarM132161r0.m129238c(qib0.f154713b0.f139230a.userId())) {
                    m206028F2().FansClubEvent.showFansClubDialog().mo172463j(Boolean.TRUE);
                } else {
                    m206028F2().FansClubEntryEvent.openEntry().mo172463j(Boolean.TRUE);
                }
                BLiveFanBase bLiveFanBaseM129237b = h4gVarM132161r0.m129237b();
                if (bLiveFanBaseM129237b != null) {
                    m127222z4(bLiveFanBaseM129237b.f44363id);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 2) {
            User userM132146l0 = ((am40) m206027E2()).m132146l0();
            if (userM132146l0 != null) {
                sds.C19911a c19911aM183545d = sds.m183540k().m183549h(userM132146l0.f56011id).m183546e("liveRoom_topleft").m183545d(userM132146l0.f56011id);
                BLive bLiveMo165470l = ((am40) m206027E2()).m170393A2().mo165470l();
                if (bLiveMo165470l != null) {
                    c19911aM183545d.m183547f(bLiveMo165470l.f44323id).m183548g(bLiveMo165470l.state);
                }
                zcu.m218088c(mo77274R2(), c19911aM183545d.m183542a());
            }
            ((am40) m206027E2()).m132125e0(false, mo77274R2(), "liveRoom_topleft", new d30() { // from class: l.bo1
                @Override // p149l.d30
                public final void call() {
                    this.f76475a.m127216t4();
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.bn1
    /* JADX INFO: renamed from: n4 */
    public void mo102743n4(String str) {
        ro1.m180231k((pn40) m206027E2(), mo77274R2(), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.bn1, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(((idv) ypv.m215673l(fld0.f98147b)).m135635g()).subscribe(ffw.m121193d(new e30() { // from class: l.co1
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f81729a.m127219w4((User) obj);
            }
        }));
        duringCreated(((am40) m206027E2()).m132165t0()).subscribe(ffw.m121193d(new e30() { // from class: l.do1
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f87122a.m127220x4((Followship) obj);
            }
        }));
        m127221y4();
    }

    /* JADX INFO: renamed from: t4 */
    public final void m127216t4() {
        if (vdt.m198092b(2)) {
            lsi0.m151593w(R$string.f46824M4);
        } else {
            lsi0.m151593w(R$string.f46803L4);
        }
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m127217u4(Integer num) {
        ((AvatarView) this.viewModel).m72093B(num.intValue() > 0);
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m127218v4(Notification notification) {
        ((AvatarView) this.viewModel).m72093B(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m127219w4(User user) {
        if (TextUtils.equals(((am40) m206027E2()).m132146l0().f56011id, user.f56011id)) {
            ((am40) m206027E2()).m132096U(user.localFollowship);
        }
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m127220x4(Followship followship) {
        m102742m4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y4 */
    public final void m127221y4() {
        BLiveFanBase bLiveFanBaseM129237b;
        if (!mo102734b4() || (bLiveFanBaseM129237b = ((am40) m206027E2()).m132161r0().m129237b()) == null) {
            return;
        }
        duringCreated(LivingNormalApiProvider.m71301O4(bLiveFanBaseM129237b.f44363id)).subscribe(ffw.m121197h(new e30() { // from class: l.eo1
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f92414a.m127217u4((Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z4 */
    public final void m127222z4(String str) {
        duringCreated(LivingNormalApiProvider.m71366V6(str)).materialize().subscribe(ffw.m121193d(new e30() { // from class: l.fo1
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f98498a.m127218v4((Notification) obj);
            }
        }));
    }
}
