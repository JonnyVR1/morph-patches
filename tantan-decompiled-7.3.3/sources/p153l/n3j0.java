package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.liveright.liveRight;
import com.p051p1.mobile.putong.live.base.data.BLiveTopChatMessage;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.common.chat.topchat.TopChatView;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import p137rx.C22421c;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class n3j0<T extends oo2> extends i6t<T, TopChatView> {
    public n3j0(dum<T> dumVar, TopChatView topChatView) {
        super(dumVar);
        mo52715C(topChatView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N3 */
    public /* synthetic */ void m161320N3(Boolean bool) {
        ((TopChatView) this.viewModel).m73972I0(!bool.booleanValue());
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m161321M3(BLiveTopChatMessage bLiveTopChatMessage) {
        boolean zIsEmpty = TextUtils.isEmpty(bLiveTopChatMessage.content);
        V v2 = this.viewModel;
        if (zIsEmpty) {
            ((TopChatView) v2).m73968D0(null);
        } else {
            ((TopChatView) v2).m73982z0(bLiveTopChatMessage);
        }
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m161322O3(liveRight.TopChatUpdateNotice topChatUpdateNotice) {
        long randomDelaySeconds = topChatUpdateNotice.getRandomDelaySeconds();
        l51.m152888H(m113230C0(), new Runnable() { // from class: l.l3j0
            @Override // java.lang.Runnable
            public final void run() {
                this.f129887a.m161323P3();
            }
        }, (randomDelaySeconds >= 4 || randomDelaySeconds < 0) ? 3000L : randomDelaySeconds * 1000);
    }

    /* JADX INFO: renamed from: P3 */
    public void m161323P3() {
        duringCreated((C22421c<T>) LivingNormalApiProvider.m72594a6(m213810E2().m202194o())).subscribe(dhw.m115825d(new y20() { // from class: l.m3j0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134672a.m161321M3((BLiveTopChatMessage) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r3v4, types: [l.oo2] */
    /* JADX INFO: renamed from: R3 */
    public void m161324R3(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m213811F2().OpenUserCardDialogEvent.show().mo199273j(UserCardData.builder(100).userId(str).setFromIdentity(csq.m112227a(this, m213810E2().m168532l0().f56859id, str, 100)).setTo(csq.m112230d(this, m213810E2().m168532l0().f56859id, str, 100)).setScene("live").setSource("chat").trackFrom("liveRoom").build());
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m161323P3();
        duringCreated((C22421c<T>) m213811F2().MultiCallEvent.topViewVisible().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.j3j0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118188a.m161320N3((Boolean) obj);
            }
        }));
        duringCreated(m213810E2().m168545q1().f71784z0).subscribe(dhw.m115829h(new y20() { // from class: l.k3j0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123720a.m161322O3((liveRight.TopChatUpdateNotice) obj);
            }
        }));
    }
}
