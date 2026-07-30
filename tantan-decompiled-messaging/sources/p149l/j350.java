package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p046p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import com.p046p1.mobile.putong.live.livingroom.officialshow.avatar.OfficialShowAvatarView;
import p133rx.C22306c;
import p149l.pn40;

/* JADX INFO: loaded from: classes4.dex */
public class j350<D extends pn40> extends h4t<D, OfficialShowAvatarView> {

    /* JADX INFO: renamed from: i */
    public String f116001i;

    public j350(bsm bsmVar, OfficialShowAvatarView officialShowAvatarView) {
        super(bsmVar);
        this.f116001i = "";
        mo51532C(officialShowAvatarView);
    }

    /* JADX INFO: renamed from: P3 */
    public static /* synthetic */ BLiveEnvelope m139522P3(Throwable th) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W3 */
    public /* synthetic */ void m139527W3(KeyboardEventData keyboardEventData) {
        ((OfficialShowAvatarView) this.viewModel).m75391m(!keyboardEventData.m71825b());
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated((C22306c) m206028F2().KeyboardEvent.show().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.y250
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f195492a.m139527W3((KeyboardEventData) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V3 */
    public boolean m139528V3() {
        return uxi.m196182c(m206027E2().m132146l0(), m206027E2().m132167u0());
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m139529X3(BLive bLive) {
        m139538g4();
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ C22306c m139530Y3(User user) {
        String str = user.f56011id;
        this.f116001i = str;
        String strM149814k = m206027E2().m149814k();
        String str2 = user.f56011id;
        return LivingNormalApiProvider.m71583t7(str, strM149814k, str2, str2, "live", "live", m206027E2().m149818o(), m206027E2().m132146l0().f56011id);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ BLiveUserMask m139531Z3(BLiveEnvelope bLiveEnvelope) {
        return e1t.m114442d(bLiveEnvelope, this.f116001i);
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ Boolean m139532a4(BLiveUserMask bLiveUserMask) {
        return Boolean.valueOf(m206027E2().m132146l0() != null);
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m139533b4(BLiveUserMask bLiveUserMask) {
        ((OfficialShowAvatarView) this.viewModel).m75393p(m206027E2().m132146l0(), bLiveUserMask);
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m139534c4(User user) {
        if (TextUtils.equals(m206027E2().m132146l0().f56011id, user.f56011id)) {
            m206027E2().m132096U(user.localFollowship);
        }
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m139535d4(Followship followship) {
        m139538g4();
    }

    /* JADX INFO: renamed from: e4 */
    public void m139536e4() {
        if (m206027E2().m132146l0() != null) {
            m206028F2().OfficialShowCardEvent.show().mo172463j(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: f4 */
    public void m139537f4() {
        User userM132146l0 = m206027E2().m132146l0();
        if (userM132146l0 != null) {
            sds.C19911a c19911aM183545d = sds.m183540k().m183549h(userM132146l0.f56011id).m183546e("liveRoom_topleft").m183545d(userM132146l0.f56011id);
            BLive bLiveM175585c = m206027E2().m170393A2().mo165470l();
            if (bLiveM175585c != null) {
                c19911aM183545d.m183547f(bLiveM175585c.f44323id).m183548g(bLiveM175585c.state);
            }
            zcu.m218088c(mo77274R2(), c19911aM183545d.m183542a());
        }
        m206027E2().m132125e0(false, mo77274R2(), "liveRoom_topleft", new d30() { // from class: l.z250
            @Override // p149l.d30
            public final void call() {
                lsi0.m151595y("订阅成功");
            }
        });
    }

    /* JADX INFO: renamed from: g4 */
    public final void m139538g4() {
        boolean zM139528V3 = m139528V3();
        V v2 = this.viewModel;
        if (zM139528V3) {
            ((OfficialShowAvatarView) v2).m75390l(false);
        } else {
            ((OfficialShowAvatarView) v2).m75390l(true);
        }
    }

    /* JADX INFO: renamed from: h4 */
    public void m139539h4(String str) {
        ro1.m180231k(m206027E2(), mo77274R2(), str);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        ((OfficialShowAvatarView) this.viewModel).m75391m(!m206031K2().m182469l(LiveDialogEnum.CHAT_INPUT));
        duringCreated(m206027E2().m170393A2().m175586d()).subscribe(ffw.m121197h(new e30() { // from class: l.a350
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f67329a.m139529X3((BLive) obj);
            }
        }));
        duringCreated(m206027E2().m132133h0().filter(new w9j() { // from class: l.b350
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((User) obj) != null);
            }
        }).flatMap(new w9j() { // from class: l.c350
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f78437a.m139530Y3((User) obj);
            }
        }).onErrorReturn(new w9j() { // from class: l.d350
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return j350.m139522P3((Throwable) obj);
            }
        }).map(new w9j() { // from class: l.e350
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f88991a.m139531Z3((BLiveEnvelope) obj);
            }
        })).filter(new w9j() { // from class: l.f350
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f94247a.m139532a4((BLiveUserMask) obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.g350
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f100354a.m139533b4((BLiveUserMask) obj);
            }
        }));
        duringCreated(((idv) ypv.m215673l(fld0.f98147b)).m135635g()).subscribe(ffw.m121193d(new e30() { // from class: l.h350
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105577a.m139534c4((User) obj);
            }
        }));
        duringCreated(m206027E2().m132165t0()).subscribe(ffw.m121193d(new e30() { // from class: l.i350
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f110609a.m139535d4((Followship) obj);
            }
        }));
    }
}
