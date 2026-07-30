package p153l;

import android.view.View;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.p051p1.mobile.putong.live.base.apibean.LiveCardTrackData;
import com.p051p1.mobile.putong.live.base.apibean.PaginationBean;
import com.p051p1.mobile.putong.live.external.internal.live.square.fragments.videochat.LiveVideoChatFrag;
import com.p051p1.mobile.putong.live.external.internal.live.square.fragments.videochat.LiveVideoChatSquareBean;
import com.p051p1.mobile.putong.live.external.internal.live.square.fragments.videochat.dialog.LiveVideoChatRandomDialog;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class rwu extends cyr<ywu> {
    public static final String TAG = "VoiceInternalPage";
    private hk4 cardContext;
    private List<r6s> cardList;
    private final LiveVideoChatFrag frag;
    private boolean hasCheckDialog;
    private final nus info;
    private boolean loadingNext;
    private PaginationBean pagination;
    private kcg0 timerSubs;

    public rwu(LiveVideoChatFrag liveVideoChatFrag, nus nusVar) {
        super(liveVideoChatFrag);
        this.cardList = new ArrayList();
        this.info = nusVar;
        this.frag = liveVideoChatFrag;
        this.cardContext = new hk4(liveVideoChatFrag);
    }

    /* JADX INFO: renamed from: E2 */
    private void m183463E2() {
        duringCreated(jwu.m147243R()).subscribe(dhw.m115826e(new y20() { // from class: l.owu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f149571a.m183475v2((LiveVideoChatSquareBean) obj);
            }
        }, new y20() { // from class: l.pwu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f154444a.m183478z2((Throwable) obj);
            }
        }));
        if (this.hasCheckDialog) {
            return;
        }
        this.hasCheckDialog = true;
        cwk0.m112926c(this.frag.act(), this.frag.m70321k5());
    }

    /* JADX INFO: renamed from: A2 */
    public final /* synthetic */ void m183467A2(Long l2) {
        m183463E2();
    }

    /* JADX INFO: renamed from: B2 */
    public void m183468B2() {
        if (!BaseLiveBean.hasNextPage(this.pagination) || this.loadingNext) {
            return;
        }
        this.loadingNext = true;
    }

    /* JADX INFO: renamed from: C2 */
    public void m183469C2(boolean z, int i, long j) {
        if (z && i == 2) {
            ((ywu) this.viewModel).m217652z(((gm3) tbs.m190077m(itd0.f116821c)).f104918h, this.frag.mo70233b5());
        }
        if (z) {
            ((gm3) tbs.m190077m(itd0.f116821c)).f104919i.onNext(Boolean.FALSE);
        }
        if (z && this.hasCheckDialog && this.frag.mo70233b5()) {
            cwk0.m112926c(this.frag.act(), this.frag.m70321k5());
        }
        m183474u2(z, j);
    }

    /* JADX INFO: renamed from: D2 */
    public void m183470D2() {
        m183463E2();
        this.frag.m71996Z4().LiveVideoChatEvent.refreshVideoChat().m199277p();
    }

    /* JADX INFO: renamed from: F2 */
    public void m183471F2() {
        i4g0.m138520r("e_live_video_quickchat_random_button", "p_live_video_quickchat");
        ((LiveVideoChatRandomDialog) View.inflate(this.info.m164819a(), xec0.f193833X0, null)).m70332k(this.info.m164819a());
    }

    /* JADX INFO: renamed from: H2 */
    public void m183472H2() {
        psd0.m173633z(this.timerSubs);
        this.timerSubs = duringCreated(C22421c.interval(1L, TimeUnit.MINUTES)).subscribe(dhw.m115825d(new y20() { // from class: l.qwu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f159969a.m183467A2((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I2 */
    public void m183473I2() {
        i4g0.m138520r("e_live_video_quickchat_start", "p_live_video_quickchat");
        jwk0.m147167a(this.frag.act());
    }

    /* JADX INFO: renamed from: u2 */
    public final void m183474u2(boolean z, long j) {
        if (z) {
            if (((ywu) this.viewModel).m217648v()) {
                m183463E2();
            } else if (j < 0 || j > ((long) tbs.f172989b.m203732sb()) * 1000) {
                m183463E2();
            }
        }
    }

    /* JADX INFO: renamed from: v2 */
    public final void m183475v2(LiveVideoChatSquareBean liveVideoChatSquareBean) {
        m183476w2(liveVideoChatSquareBean);
        this.pagination = liveVideoChatSquareBean.getPagination();
        liveVideoChatSquareBean.hasNextPage();
        if (liveVideoChatSquareBean.getCardList() == null) {
            liveVideoChatSquareBean.setCardList(new ArrayList());
        }
        this.cardList.clear();
        this.cardList.addAll(liveVideoChatSquareBean.getCardList());
        ((ywu) this.viewModel).m217650x(e4s.m119474b(this.cardContext, liveVideoChatSquareBean.getCardList()), liveVideoChatSquareBean.hasNextPage(), true);
        ((ywu) this.viewModel).m217643l();
    }

    /* JADX INFO: renamed from: w2 */
    public final void m183476w2(LiveVideoChatSquareBean liveVideoChatSquareBean) {
        int i = 0;
        for (int i2 = 0; i2 < liveVideoChatSquareBean.getCardList().size(); i2++) {
            r6s r6sVar = liveVideoChatSquareBean.getCardList().get(i2);
            if (r6sVar.m180020d() == 11) {
                lwu lwuVarM180031o = r6sVar.m180031o();
                LiveCardTrackData liveCardTrackData = new LiveCardTrackData();
                liveCardTrackData.put(FirebaseAnalytics.Param.INDEX, Integer.valueOf(i2 - i));
                liveCardTrackData.put("anchorId", lwuVarM180031o.m156101a());
                liveCardTrackData.setPageId("p_live_video_quickchat");
                liveCardTrackData.setModuleId("e_live_video_quickchat_room_enter");
                lwuVarM180031o.m156113m(liveCardTrackData);
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: y2 */
    public void m183477y2() {
        tbs.f172993f.m143720v(false);
    }

    /* JADX INFO: renamed from: z2 */
    public final /* synthetic */ void m183478z2(Throwable th) {
        th.toString();
        ((ywu) this.viewModel).m217651y();
        ((ywu) this.viewModel).m217643l();
    }
}
