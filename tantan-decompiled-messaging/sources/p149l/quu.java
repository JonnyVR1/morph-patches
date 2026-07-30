package p149l;

import android.view.View;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.p046p1.mobile.putong.live.base.apibean.LiveCardTrackData;
import com.p046p1.mobile.putong.live.base.apibean.PaginationBean;
import com.p046p1.mobile.putong.live.external.internal.live.square.fragments.videochat.LiveVideoChatFrag;
import com.p046p1.mobile.putong.live.external.internal.live.square.fragments.videochat.LiveVideoChatSquareBean;
import com.p046p1.mobile.putong.live.external.internal.live.square.fragments.videochat.dialog.LiveVideoChatRandomDialog;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
public class quu extends bwr<xuu> {
    public static final String TAG = "VoiceInternalPage";
    private ij4 cardContext;
    private List<q4s> cardList;
    private final LiveVideoChatFrag frag;
    private boolean hasCheckDialog;
    private final mss info;
    private boolean loadingNext;
    private PaginationBean pagination;
    private c4g0 timerSubs;

    public quu(LiveVideoChatFrag liveVideoChatFrag, mss mssVar) {
        super(liveVideoChatFrag);
        this.cardList = new ArrayList();
        this.info = mssVar;
        this.frag = liveVideoChatFrag;
        this.cardContext = new ij4(liveVideoChatFrag);
    }

    /* JADX INFO: renamed from: E2 */
    private void m176637E2() {
        duringCreated(iuu.m138457R()).subscribe(ffw.m121194e(new e30() { // from class: l.nuu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f140653a.m176649v2((LiveVideoChatSquareBean) obj);
            }
        }, new e30() { // from class: l.ouu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f145737a.m176652z2((Throwable) obj);
            }
        }));
        if (this.hasCheckDialog) {
            return;
        }
        this.hasCheckDialog = true;
        wmk0.m203992c(this.frag.act(), this.frag.m69138k5());
    }

    /* JADX INFO: renamed from: A2 */
    public final /* synthetic */ void m176641A2(Long l2) {
        m176637E2();
    }

    /* JADX INFO: renamed from: B2 */
    public void m176642B2() {
        if (!BaseLiveBean.hasNextPage(this.pagination) || this.loadingNext) {
            return;
        }
        this.loadingNext = true;
    }

    /* JADX INFO: renamed from: C2 */
    public void m176643C2(boolean z, int i, long j) {
        if (z && i == 2) {
            ((xuu) this.viewModel).m211219z(((hl3) s9s.m182763m(gld0.f103313c)).f108315h, this.frag.mo69050b5());
        }
        if (z) {
            ((hl3) s9s.m182763m(gld0.f103313c)).f108316i.onNext(Boolean.FALSE);
        }
        if (z && this.hasCheckDialog && this.frag.mo69050b5()) {
            wmk0.m203992c(this.frag.act(), this.frag.m69138k5());
        }
        m176648u2(z, j);
    }

    /* JADX INFO: renamed from: D2 */
    public void m176644D2() {
        m176637E2();
        this.frag.m70813Z4().LiveVideoChatEvent.refreshVideoChat().m172467p();
    }

    /* JADX INFO: renamed from: F2 */
    public void m176645F2() {
        zvf0.m220396r("e_live_video_quickchat_random_button", "p_live_video_quickchat");
        ((LiveVideoChatRandomDialog) View.inflate(this.info.m156171a(), s6c0.f162719X0, null)).m69149k(this.info.m156171a());
    }

    /* JADX INFO: renamed from: H2 */
    public void m176646H2() {
        mkd0.m154992z(this.timerSubs);
        this.timerSubs = duringCreated(C22306c.interval(1L, TimeUnit.MINUTES)).subscribe(ffw.m121193d(new e30() { // from class: l.puu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f151356a.m176641A2((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I2 */
    public void m176647I2() {
        zvf0.m220396r("e_live_video_quickchat_start", "p_live_video_quickchat");
        dnk0.m112642a(this.frag.act());
    }

    /* JADX INFO: renamed from: u2 */
    public final void m176648u2(boolean z, long j) {
        if (z) {
            if (((xuu) this.viewModel).m211215v()) {
                m176637E2();
            } else if (j < 0 || j > ((long) s9s.f163228b.m195945sb()) * 1000) {
                m176637E2();
            }
        }
    }

    /* JADX INFO: renamed from: v2 */
    public final void m176649v2(LiveVideoChatSquareBean liveVideoChatSquareBean) {
        m176650w2(liveVideoChatSquareBean);
        this.pagination = liveVideoChatSquareBean.getPagination();
        liveVideoChatSquareBean.hasNextPage();
        if (liveVideoChatSquareBean.getCardList() == null) {
            liveVideoChatSquareBean.setCardList(new ArrayList());
        }
        this.cardList.clear();
        this.cardList.addAll(liveVideoChatSquareBean.getCardList());
        ((xuu) this.viewModel).m211217x(d2s.m109829b(this.cardContext, liveVideoChatSquareBean.getCardList()), liveVideoChatSquareBean.hasNextPage(), true);
        ((xuu) this.viewModel).m211210l();
    }

    /* JADX INFO: renamed from: w2 */
    public final void m176650w2(LiveVideoChatSquareBean liveVideoChatSquareBean) {
        int i = 0;
        for (int i2 = 0; i2 < liveVideoChatSquareBean.getCardList().size(); i2++) {
            q4s q4sVar = liveVideoChatSquareBean.getCardList().get(i2);
            if (q4sVar.m172955d() == 11) {
                kuu kuuVarM172966o = q4sVar.m172966o();
                LiveCardTrackData liveCardTrackData = new LiveCardTrackData();
                liveCardTrackData.put(FirebaseAnalytics.Param.INDEX, Integer.valueOf(i2 - i));
                liveCardTrackData.put("anchorId", kuuVarM172966o.m147304a());
                liveCardTrackData.setPageId("p_live_video_quickchat");
                liveCardTrackData.setModuleId("e_live_video_quickchat_room_enter");
                kuuVarM172966o.m147316m(liveCardTrackData);
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: y2 */
    public void m176651y2() {
        s9s.f163232f.m134389v(false);
    }

    /* JADX INFO: renamed from: z2 */
    public final /* synthetic */ void m176652z2(Throwable th) {
        th.toString();
        ((xuu) this.viewModel).m211218y();
        ((xuu) this.viewModel).m211210l();
    }
}
