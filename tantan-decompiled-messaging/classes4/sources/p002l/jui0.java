package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p000p1.mobile.putong.live.livingroom.common.chat.topchat.TopChatView;
import com.p000p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p1.mobile.longlink.msg.liveright.liveRight;
import com.p1.mobile.putong.live.base.data.BLiveTopChatMessage;
import com.tantanapp.common.data.DbObject;
import l.bwr;
import l.e30;
import l.e51;
import l.ffw;
import l.s7m;
import p002l.ho2;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class jui0<T extends ho2> extends h4t<T, TopChatView> {
    public jui0(bsm<T> bsmVar, TopChatView topChatView) {
        super(bsmVar);
        C(topChatView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N3 */
    public /* synthetic */ void m16262N3(Boolean bool) {
        ((TopChatView) ((bwr) this).viewModel).m6297I0(!bool.booleanValue());
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m16263M3(BLiveTopChatMessage bLiveTopChatMessage) {
        boolean zIsEmpty = TextUtils.isEmpty(bLiveTopChatMessage.content);
        s7m s7mVar = ((bwr) this).viewModel;
        if (zIsEmpty) {
            ((TopChatView) s7mVar).m6293D0(null);
        } else {
            ((TopChatView) s7mVar).m6308z0(bLiveTopChatMessage);
        }
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m16264O3(liveRight.TopChatUpdateNotice topChatUpdateNotice) {
        long randomDelaySeconds = topChatUpdateNotice.getRandomDelaySeconds();
        e51.H(C0(), new Runnable() { // from class: l.hui0
            @Override // java.lang.Runnable
            public final void run() {
                this.f12273a.m16265P3();
            }
        }, (randomDelaySeconds >= 4 || randomDelaySeconds < 0) ? 3000L : randomDelaySeconds * 1000);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: P3 */
    public void m16265P3() {
        duringCreated(LivingNormalApiProvider.m4777a6(m25547E2().m17239o())).subscribe(ffw.d(new e30() { // from class: l.iui0
            public final void call(Object obj) {
                this.f13418a.m16263M3((BLiveTopChatMessage) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r3v4, types: [l.ho2] */
    /* JADX INFO: renamed from: R3 */
    public void m16266R3(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m25548F2().OpenUserCardDialogEvent.show().j(UserCardData.builder(100).userId(str).setFromIdentity(bqq.m10554a(this, ((DbObject) m25547E2().m14582l0()).id, str, 100)).setTo(bqq.m10557d(this, ((DbObject) m25547E2().m14582l0()).id, str, 100)).setScene("live").setSource("chat").trackFrom("liveRoom").build());
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [l.ho2] */
    /* JADX INFO: renamed from: t */
    public void m16267t() {
        super.t();
        m16265P3();
        duringCreated((c) m25548F2().MultiCallEvent.topViewVisible().g()).subscribe(ffw.d(new e30() { // from class: l.fui0
            public final void call(Object obj) {
                this.f10639a.m16262N3((Boolean) obj);
            }
        }));
        duringCreated(m25547E2().m14596q1().z0).subscribe(ffw.h(new e30() { // from class: l.gui0
            public final void call(Object obj) {
                this.f11631a.m16264O3((liveRight.TopChatUpdateNotice) obj);
            }
        }));
    }
}
