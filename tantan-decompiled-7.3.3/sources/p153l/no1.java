package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveFanBase;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.AvatarView;
import p137rx.Notification;

/* JADX INFO: loaded from: classes4.dex */
public class no1 extends in1<ou40> {
    public no1(dum dumVar, AvatarView avatarView) {
        super(dumVar, avatarView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.in1
    /* JADX INFO: renamed from: a4 */
    public boolean mo141021a4() {
        return q0j.m174711b(((ou40) m213810E2()).m168532l0(), ((ou40) m213810E2()).m168551u0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.in1
    /* JADX INFO: renamed from: b4 */
    public boolean mo141022b4() {
        return ((ou40) m213810E2()).mo168486V0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.in1
    /* JADX INFO: renamed from: l4 */
    public void mo141029l4(int i) {
        super.mo141029l4(i);
        if (i == 3) {
            v5g v5gVarM168546r0 = ((ou40) m213810E2()).m168546r0();
            if (v5gVarM168546r0 != null) {
                if (v5gVarM168546r0.m199847c(uqb0.f180396b0.f170324a.userId())) {
                    m213811F2().FansClubEvent.showFansClubDialog().mo199273j(Boolean.TRUE);
                } else {
                    m213811F2().FansClubEntryEvent.openEntry().mo199273j(Boolean.TRUE);
                }
                BLiveFanBase bLiveFanBaseM199846b = v5gVarM168546r0.m199846b();
                if (bLiveFanBaseM199846b != null) {
                    m164021z4(bLiveFanBaseM199846b.f45211id);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 2) {
            User userM168532l0 = ((ou40) m213810E2()).m168532l0();
            if (userM168532l0 != null) {
                tfs.C20303a c20303aM190974d = tfs.m190969k().m190978h(userM168532l0.f56859id).m190975e("liveRoom_topleft").m190974d(userM168532l0.f56859id);
                BLive bLiveMo122892l = ((ou40) m213810E2()).m118363A2().mo122892l();
                if (bLiveMo122892l != null) {
                    c20303aM190974d.m190976f(bLiveMo122892l.f45171id).m190977g(bLiveMo122892l.state);
                }
                afu.m97554c(mo78457R2(), c20303aM190974d.m190971a());
            }
            ((ou40) m213810E2()).m168511e0(false, mo78457R2(), "liveRoom_topleft", new x20() { // from class: l.io1
                @Override // p153l.x20
                public final void call() {
                    this.f116066a.m164015t4();
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.in1
    /* JADX INFO: renamed from: n4 */
    public void mo141031n4(String str) {
        yo1.m216974k((dw40) m213810E2(), mo78457R2(), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.in1, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(((jfv) zrv.m221194l(htd0.f111520b)).m144720g()).subscribe(dhw.m115825d(new y20() { // from class: l.jo1
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f121931a.m164018w4((User) obj);
            }
        }));
        duringCreated(((ou40) m213810E2()).m168549t0()).subscribe(dhw.m115825d(new y20() { // from class: l.ko1
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f127664a.m164019x4((Followship) obj);
            }
        }));
        m164020y4();
    }

    /* JADX INFO: renamed from: t4 */
    public final void m164015t4() {
        if (wft.m206159b(2)) {
            o1j0.m165649w(R$string.f47672M4);
        } else {
            o1j0.m165649w(R$string.f47651L4);
        }
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m164016u4(Integer num) {
        ((AvatarView) this.viewModel).m73276B(num.intValue() > 0);
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m164017v4(Notification notification) {
        ((AvatarView) this.viewModel).m73276B(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m164018w4(User user) {
        if (TextUtils.equals(((ou40) m213810E2()).m168532l0().f56859id, user.f56859id)) {
            ((ou40) m213810E2()).m168482U(user.localFollowship);
        }
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m164019x4(Followship followship) {
        m141030m4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y4 */
    public final void m164020y4() {
        BLiveFanBase bLiveFanBaseM199846b;
        if (!mo141022b4() || (bLiveFanBaseM199846b = ((ou40) m213810E2()).m168546r0().m199846b()) == null) {
            return;
        }
        duringCreated(LivingNormalApiProvider.m72484O4(bLiveFanBaseM199846b.f45211id)).subscribe(dhw.m115829h(new y20() { // from class: l.lo1
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f132869a.m164016u4((Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z4 */
    public final void m164021z4(String str) {
        duringCreated(LivingNormalApiProvider.m72549V6(str)).materialize().subscribe(dhw.m115825d(new y20() { // from class: l.mo1
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f137766a.m164017v4((Notification) obj);
            }
        }));
    }
}
