package p149l;

import com.p046p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.p046p1.mobile.putong.live.base.apibean.PaginationBean;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.search.LiveVoiceSearchDetail;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.search.LiveVoiceSuggestDetail;
import com.p046p1.mobile.putong.live.external.module.api.LiveVoiceInternalSquareApi;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class z9v extends bwr<hav> {
    private final ij4 cardContext;
    private PaginationBean guessLikePagination;
    private boolean loadingNext;
    private PaginationBean pagination;

    public z9v(mcr mcrVar) {
        super(mcrVar);
        this.cardContext = new ij4(mcrVar);
    }

    /* JADX INFO: renamed from: q2 */
    public static /* synthetic */ void m217691q2(Throwable th) {
    }

    /* JADX INFO: renamed from: s2 */
    public static /* synthetic */ void m217693s2(Throwable th) {
    }

    /* JADX INFO: renamed from: A2 */
    public final void m217697A2(LiveVoiceSearchDetail liveVoiceSearchDetail) {
        this.loadingNext = false;
        if (vwb.m200296J(liveVoiceSearchDetail.getCards())) {
            return;
        }
        this.pagination = liveVoiceSearchDetail.getPagination();
        ((hav) this.viewModel).m130217k(d2s.m109829b(this.cardContext, liveVoiceSearchDetail.getCards()), liveVoiceSearchDetail.hasNextPage(), true);
    }

    /* JADX INFO: renamed from: B2 */
    public void m217698B2(LiveVoiceSearchDetail liveVoiceSearchDetail) {
        if (vwb.m200296J(liveVoiceSearchDetail.getCards())) {
            m217703H2();
            return;
        }
        this.pagination = liveVoiceSearchDetail.getPagination();
        ((hav) this.viewModel).m130215B(d2s.m109829b(this.cardContext, liveVoiceSearchDetail.getCards()), liveVoiceSearchDetail.hasNextPage(), true);
    }

    /* JADX INFO: renamed from: D2 */
    public final /* synthetic */ void m217700D2(Throwable th) {
        ((hav) this.viewModel).m130214A();
    }

    /* JADX INFO: renamed from: E2 */
    public final /* synthetic */ void m217701E2(Throwable th) {
        this.loadingNext = false;
    }

    /* JADX INFO: renamed from: F2 */
    public void m217702F2() {
        if (!BaseLiveBean.hasNextPage(this.pagination) || this.loadingNext) {
            return;
        }
        this.loadingNext = true;
        duringCreated(LiveVoiceInternalSquareApi.getNextPageSearchResult(this.pagination.getProcessedNext())).subscribe(ffw.m121194e(new e30() { // from class: l.x9v
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f191656a.m217697A2((LiveVoiceSearchDetail) obj);
            }
        }, new e30() { // from class: l.y9v
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f196991a.m217701E2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H2 */
    public void m217703H2() {
        duringCreated(LiveVoiceInternalSquareApi.getGuessLikeData()).subscribe(ffw.m121194e(new s9v(this), new e30() { // from class: l.u9v
            @Override // p149l.e30
            public final void call(Object obj) {
                z9v.m217693s2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I2 */
    public void m217704I2() {
        if (BaseLiveBean.hasNextPage(this.guessLikePagination)) {
            duringCreated(LiveVoiceInternalSquareApi.getGuessLikeData(this.guessLikePagination.getProcessedNext())).subscribe(ffw.m121194e(new s9v(this), new e30() { // from class: l.t9v
                @Override // p149l.e30
                public final void call(Object obj) {
                    z9v.m217691q2((Throwable) obj);
                }
            }));
        } else {
            m217703H2();
        }
    }

    /* JADX INFO: renamed from: y2 */
    public void m217705y2(String str) {
        duringCreated(LiveVoiceInternalSquareApi.getSearchResult(str)).subscribe(ffw.m121194e(new e30() { // from class: l.v9v
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180678a.m217698B2((LiveVoiceSearchDetail) obj);
            }
        }, new e30() { // from class: l.w9v
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f185406a.m217700D2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z2 */
    public final void m217706z2(LiveVoiceSuggestDetail liveVoiceSuggestDetail) {
        this.guessLikePagination = liveVoiceSuggestDetail.getPagination();
        if (vwb.m200296J(liveVoiceSuggestDetail.getCards())) {
            ((hav) this.viewModel).m130225z(new ArrayList());
        } else {
            ((hav) this.viewModel).m130225z(d2s.m109829b(this.cardContext, liveVoiceSuggestDetail.getCards()));
        }
    }

    /* JADX INFO: renamed from: C2 */
    public void m217699C2() {
    }
}
