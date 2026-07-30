package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.R$string;
import com.p046p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.external.module.api.LiveVerificationApi;

/* JADX INFO: loaded from: classes13.dex */
public class urm {

    /* JADX INFO: renamed from: a */
    public final bs5 f177847a;

    /* JADX INFO: renamed from: l.urm$a */
    public static class C20490a {

        /* JADX INFO: renamed from: a */
        public static final urm f177848a = new urm();
    }

    public urm() {
        this.f177847a = new bs5();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m195081c(Act act, BLiveEnvelope bLiveEnvelope) {
        gkh0.m126627j("[live]verification", "Ind verification patched,start live");
        s9s.f163232f.m134368a(act, AnchorStartData.getBuilder().m67562m(false).m67563n(AnchorStartData.ANCHOR_SOURCE_P_LIVE).m67560k());
        LiveVerificationApi.requestLiveVerification();
    }

    /* JADX INFO: renamed from: e */
    public static urm m195083e() {
        return C20490a.f177848a;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m195084f(Act act, Boolean bool) {
        if (LiveVerificationApi.noVerificationInfo()) {
            return;
        }
        gkh0.m126627j("[live]verification", "Ind verification refreshed");
        m195087i(act);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m195085g(Act act, Boolean bool) {
        gkh0.m126627j("[live]verification", "Ind startLive bind Phone result =" + bool);
        if (bool.booleanValue()) {
            m195087i(act);
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m195086h() {
        Settings settings;
        User userM149047J = l9s.m149047J();
        if (userM149047J == null || (settings = userM149047J.settings) == null) {
            return true;
        }
        return lor.m150802g() && !(!TextUtils.isEmpty(settings.phoneNumber.number) || !TextUtils.isEmpty(userM149047J.settings.linkedPhoneNumber.number));
    }

    /* JADX INFO: renamed from: i */
    public final void m195087i(final Act act) {
        if (LiveVerificationApi.noVerificationInfo()) {
            gkh0.m126627j("[live]verification", "Ind verification no verification info,pull it first");
            LiveVerificationApi.requestLiveVerification(new e30() { // from class: l.rrm
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f160756a.m195084f(act, (Boolean) obj);
                }
            });
        } else if (l9s.m149044G().getLiveVerification().mo103895a()) {
            gkh0.m126627j("[live]verification", "Ind verification passed,start live");
            s9s.f163232f.m134368a(act, AnchorStartData.getBuilder().m67562m(false).m67563n(AnchorStartData.ANCHOR_SOURCE_P_LIVE).m67560k());
        } else {
            this.f177847a.m103655a(act.duringCreated(LiveVerificationApi.patchUserAsPersonalAnchor()).subscribe(ffw.m121194e(new e30() { // from class: l.srm
                @Override // p149l.e30
                public final void call(Object obj) {
                    urm.m195081c(act, (BLiveEnvelope) obj);
                }
            }, new e30() { // from class: l.trm
                @Override // p149l.e30
                public final void call(Object obj) {
                    lsi0.m151578h(R$string.f44164f);
                }
            })));
        }
    }

    /* JADX INFO: renamed from: j */
    public void m195088j(final Act act) {
        this.f177847a.m103657c();
        if (!m195086h()) {
            m195087i(act);
            return;
        }
        gkh0.m126627j("[live]verification", "Ind startLive need bind Phone");
        this.f177847a.m103655a(act.duringCreated(l9s.m149071d0(act, act.getString(R$string.f44191o))).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.qrm
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f156004a.m195085g(act, (Boolean) obj);
            }
        })));
    }
}
