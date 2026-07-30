package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p051p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import com.p051p1.mobile.putong.live.livingroom.officialshow.avatar.OfficialShowAvatarView;
import p137rx.C22421c;
import p153l.dw40;

/* JADX INFO: loaded from: classes5.dex */
public class yb50<D extends dw40> extends i6t<D, OfficialShowAvatarView> {

    /* JADX INFO: renamed from: i */
    public String f198276i;

    public yb50(dum dumVar, OfficialShowAvatarView officialShowAvatarView) {
        super(dumVar);
        this.f198276i = "";
        mo52715C(officialShowAvatarView);
    }

    /* JADX INFO: renamed from: P3 */
    public static /* synthetic */ BLiveEnvelope m214998P3(Throwable th) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W3 */
    public /* synthetic */ void m215003W3(KeyboardEventData keyboardEventData) {
        ((OfficialShowAvatarView) this.viewModel).m76574m(!keyboardEventData.m73008b());
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated((C22421c) m213811F2().KeyboardEvent.show().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.nb50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f141073a.m215003W3((KeyboardEventData) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V3 */
    public boolean m215004V3() {
        return q0j.m174712c(m213810E2().m168532l0(), m213810E2().m168551u0());
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m215005X3(BLive bLive) {
        m215014g4();
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ C22421c m215006Y3(User user) {
        String str = user.f56859id;
        this.f198276i = str;
        String strM202191k = m213810E2().m202191k();
        String str2 = user.f56859id;
        return LivingNormalApiProvider.m72766t7(str, strM202191k, str2, str2, "live", "live", m213810E2().m202194o(), m213810E2().m168532l0().f56859id);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ BLiveUserMask m215007Z3(BLiveEnvelope bLiveEnvelope) {
        return f3t.m123803d(bLiveEnvelope, this.f198276i);
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ Boolean m215008a4(BLiveUserMask bLiveUserMask) {
        return Boolean.valueOf(m213810E2().m168532l0() != null);
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m215009b4(BLiveUserMask bLiveUserMask) {
        ((OfficialShowAvatarView) this.viewModel).m76576p(m213810E2().m168532l0(), bLiveUserMask);
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m215010c4(User user) {
        if (TextUtils.equals(m213810E2().m168532l0().f56859id, user.f56859id)) {
            m213810E2().m168482U(user.localFollowship);
        }
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m215011d4(Followship followship) {
        m215014g4();
    }

    /* JADX INFO: renamed from: e4 */
    public void m215012e4() {
        if (m213810E2().m168532l0() != null) {
            m213811F2().OfficialShowCardEvent.show().mo199273j(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: f4 */
    public void m215013f4() {
        User userM168532l0 = m213810E2().m168532l0();
        if (userM168532l0 != null) {
            tfs.C20303a c20303aM190974d = tfs.m190969k().m190978h(userM168532l0.f56859id).m190975e("liveRoom_topleft").m190974d(userM168532l0.f56859id);
            BLive bLiveM122887c = m213810E2().m118363A2().mo122892l();
            if (bLiveM122887c != null) {
                c20303aM190974d.m190976f(bLiveM122887c.f45171id).m190977g(bLiveM122887c.state);
            }
            afu.m97554c(mo78457R2(), c20303aM190974d.m190971a());
        }
        m213810E2().m168511e0(false, mo78457R2(), "liveRoom_topleft", new x20() { // from class: l.ob50
            @Override // p153l.x20
            public final void call() {
                o1j0.m165651y("订阅成功");
            }
        });
    }

    /* JADX INFO: renamed from: g4 */
    public final void m215014g4() {
        boolean zM215004V3 = m215004V3();
        V v2 = this.viewModel;
        if (zM215004V3) {
            ((OfficialShowAvatarView) v2).m76573l(false);
        } else {
            ((OfficialShowAvatarView) v2).m76573l(true);
        }
    }

    /* JADX INFO: renamed from: h4 */
    public void m215015h4(String str) {
        yo1.m216974k(m213810E2(), mo78457R2(), str);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        ((OfficialShowAvatarView) this.viewModel).m76574m(!m213814K2().m189705l(LiveDialogEnum.CHAT_INPUT));
        duringCreated(m213810E2().m118363A2().m122888d()).subscribe(dhw.m115829h(new y20() { // from class: l.pb50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f151347a.m215005X3((BLive) obj);
            }
        }));
        duringCreated(m213810E2().m168519h0().filter(new qcj() { // from class: l.qb50
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((User) obj) != null);
            }
        }).flatMap(new qcj() { // from class: l.rb50
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f161990a.m215006Y3((User) obj);
            }
        }).onErrorReturn(new qcj() { // from class: l.sb50
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return yb50.m214998P3((Throwable) obj);
            }
        }).map(new qcj() { // from class: l.tb50
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f172833a.m215007Z3((BLiveEnvelope) obj);
            }
        })).filter(new qcj() { // from class: l.ub50
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f178277a.m215008a4((BLiveUserMask) obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.vb50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f183208a.m215009b4((BLiveUserMask) obj);
            }
        }));
        duringCreated(((jfv) zrv.m221194l(htd0.f111520b)).m144720g()).subscribe(dhw.m115825d(new y20() { // from class: l.wb50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188204a.m215010c4((User) obj);
            }
        }));
        duringCreated(m213810E2().m168549t0()).subscribe(dhw.m115825d(new y20() { // from class: l.xb50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f193126a.m215011d4((Followship) obj);
            }
        }));
    }
}
