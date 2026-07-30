package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.R$string;
import com.p051p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.external.module.api.LiveVerificationApi;

/* JADX INFO: loaded from: classes9.dex */
public class wtm {

    /* JADX INFO: renamed from: a */
    public final ft5 f190795a;

    /* JADX INFO: renamed from: l.wtm$a */
    public static class C21178a {

        /* JADX INFO: renamed from: a */
        public static final wtm f190796a = new wtm();
    }

    public wtm() {
        this.f190795a = new ft5();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m207897c(Act act, BLiveEnvelope bLiveEnvelope) {
        nsh0.m164608j("[live]verification", "Ind verification patched,start live");
        tbs.f172993f.m143699a(act, AnchorStartData.getBuilder().m68745m(false).m68746n(AnchorStartData.ANCHOR_SOURCE_P_LIVE).m68743k());
        LiveVerificationApi.requestLiveVerification();
    }

    /* JADX INFO: renamed from: e */
    public static wtm m207899e() {
        return C21178a.f190796a;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m207900f(Act act, Boolean bool) {
        if (LiveVerificationApi.noVerificationInfo()) {
            return;
        }
        nsh0.m164608j("[live]verification", "Ind verification refreshed");
        m207903i(act);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m207901g(Act act, Boolean bool) {
        nsh0.m164608j("[live]verification", "Ind startLive bind Phone result =" + bool);
        if (bool.booleanValue()) {
            m207903i(act);
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m207902h() {
        Settings settings;
        User userM157824J = mbs.m157824J();
        if (userM157824J == null || (settings = userM157824J.settings) == null) {
            return true;
        }
        return mqr.m159587g() && !(!TextUtils.isEmpty(settings.phoneNumber.number) || !TextUtils.isEmpty(userM157824J.settings.linkedPhoneNumber.number));
    }

    /* JADX INFO: renamed from: i */
    public final void m207903i(final Act act) {
        if (LiveVerificationApi.noVerificationInfo()) {
            nsh0.m164608j("[live]verification", "Ind verification no verification info,pull it first");
            LiveVerificationApi.requestLiveVerification(new y20() { // from class: l.ttm
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f176082a.m207900f(act, (Boolean) obj);
                }
            });
        } else if (mbs.m157821G().getLiveVerification().mo112873a()) {
            nsh0.m164608j("[live]verification", "Ind verification passed,start live");
            tbs.f172993f.m143699a(act, AnchorStartData.getBuilder().m68745m(false).m68746n(AnchorStartData.ANCHOR_SOURCE_P_LIVE).m68743k());
        } else {
            this.f190795a.m127297a(act.duringCreated(LiveVerificationApi.patchUserAsPersonalAnchor()).subscribe(dhw.m115826e(new y20() { // from class: l.utm
                @Override // p153l.y20
                public final void call(Object obj) {
                    wtm.m207897c(act, (BLiveEnvelope) obj);
                }
            }, new y20() { // from class: l.vtm
                @Override // p153l.y20
                public final void call(Object obj) {
                    o1j0.m165634h(R$string.f45012f);
                }
            })));
        }
    }

    /* JADX INFO: renamed from: j */
    public void m207904j(final Act act) {
        this.f190795a.m127299c();
        if (!m207902h()) {
            m207903i(act);
            return;
        }
        nsh0.m164608j("[live]verification", "Ind startLive need bind Phone");
        this.f190795a.m127297a(act.duringCreated(mbs.m157848d0(act, act.getString(R$string.f45039o))).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.stm
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f170589a.m207901g(act, (Boolean) obj);
            }
        })));
    }
}
