package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.liveright.liveRight;
import com.p046p1.mobile.putong.live.base.data.BLiveTopChatMessage;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.common.chat.topchat.TopChatView;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import p133rx.C22306c;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class jui0<T extends ho2> extends h4t<T, TopChatView> {
    public jui0(bsm<T> bsmVar, TopChatView topChatView) {
        super(bsmVar);
        mo51532C(topChatView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N3 */
    public /* synthetic */ void m143312N3(Boolean bool) {
        ((TopChatView) this.viewModel).m72789I0(!bool.booleanValue());
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m143313M3(BLiveTopChatMessage bLiveTopChatMessage) {
        boolean zIsEmpty = TextUtils.isEmpty(bLiveTopChatMessage.content);
        V v2 = this.viewModel;
        if (zIsEmpty) {
            ((TopChatView) v2).m72785D0(null);
        } else {
            ((TopChatView) v2).m72799z0(bLiveTopChatMessage);
        }
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m143314O3(liveRight.TopChatUpdateNotice topChatUpdateNotice) {
        long randomDelaySeconds = topChatUpdateNotice.getRandomDelaySeconds();
        e51.m114743H(m104249C0(), new Runnable() { // from class: l.hui0
            @Override // java.lang.Runnable
            public final void run() {
                this.f109568a.m143315P3();
            }
        }, (randomDelaySeconds >= 4 || randomDelaySeconds < 0) ? 3000L : randomDelaySeconds * 1000);
    }

    /* JADX INFO: renamed from: P3 */
    public void m143315P3() {
        duringCreated((C22306c<T>) LivingNormalApiProvider.m71411a6(m206027E2().m149818o())).subscribe(ffw.m121193d(new e30() { // from class: l.iui0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115027a.m143313M3((BLiveTopChatMessage) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r3v4, types: [l.ho2] */
    /* JADX INFO: renamed from: R3 */
    public void m143316R3(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m206028F2().OpenUserCardDialogEvent.show().mo172463j(UserCardData.builder(100).userId(str).setFromIdentity(bqq.m103386a(this, m206027E2().m132146l0().f56011id, str, 100)).setTo(bqq.m103389d(this, m206027E2().m132146l0().f56011id, str, 100)).setScene("live").setSource("chat").trackFrom("liveRoom").build());
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m143315P3();
        duringCreated((C22306c<T>) m206028F2().MultiCallEvent.topViewVisible().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.fui0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99342a.m143312N3((Boolean) obj);
            }
        }));
        duringCreated(m206027E2().m132160q1().f170517z0).subscribe(ffw.m121197h(new e30() { // from class: l.gui0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f104397a.m143314O3((liveRight.TopChatUpdateNotice) obj);
            }
        }));
    }
}
