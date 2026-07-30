package p153l;

import com.p051p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.p051p1.mobile.putong.live.base.apibean.PaginationBean;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.search.LiveVoiceSearchDetail;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.search.LiveVoiceSuggestDetail;
import com.p051p1.mobile.putong.live.external.module.api.LiveVoiceInternalSquareApi;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class acv extends cyr<icv> {
    private final hk4 cardContext;
    private PaginationBean guessLikePagination;
    private boolean loadingNext;
    private PaginationBean pagination;

    public acv(ner nerVar) {
        super(nerVar);
        this.cardContext = new hk4(nerVar);
    }

    /* JADX INFO: renamed from: q2 */
    public static /* synthetic */ void m96976q2(Throwable th) {
    }

    /* JADX INFO: renamed from: s2 */
    public static /* synthetic */ void m96978s2(Throwable th) {
    }

    /* JADX INFO: renamed from: A2 */
    public final void m96982A2(LiveVoiceSearchDetail liveVoiceSearchDetail) {
        this.loadingNext = false;
        if (jyb.m147479J(liveVoiceSearchDetail.getCards())) {
            return;
        }
        this.pagination = liveVoiceSearchDetail.getPagination();
        ((icv) this.viewModel).m139500k(e4s.m119474b(this.cardContext, liveVoiceSearchDetail.getCards()), liveVoiceSearchDetail.hasNextPage(), true);
    }

    /* JADX INFO: renamed from: B2 */
    public void m96983B2(LiveVoiceSearchDetail liveVoiceSearchDetail) {
        if (jyb.m147479J(liveVoiceSearchDetail.getCards())) {
            m96988H2();
            return;
        }
        this.pagination = liveVoiceSearchDetail.getPagination();
        ((icv) this.viewModel).m139498B(e4s.m119474b(this.cardContext, liveVoiceSearchDetail.getCards()), liveVoiceSearchDetail.hasNextPage(), true);
    }

    /* JADX INFO: renamed from: D2 */
    public final /* synthetic */ void m96985D2(Throwable th) {
        ((icv) this.viewModel).m139497A();
    }

    /* JADX INFO: renamed from: E2 */
    public final /* synthetic */ void m96986E2(Throwable th) {
        this.loadingNext = false;
    }

    /* JADX INFO: renamed from: F2 */
    public void m96987F2() {
        if (!BaseLiveBean.hasNextPage(this.pagination) || this.loadingNext) {
            return;
        }
        this.loadingNext = true;
        duringCreated(LiveVoiceInternalSquareApi.getNextPageSearchResult(this.pagination.getProcessedNext())).subscribe(dhw.m115826e(new y20() { // from class: l.ybv
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f198366a.m96982A2((LiveVoiceSearchDetail) obj);
            }
        }, new y20() { // from class: l.zbv
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203706a.m96986E2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H2 */
    public void m96988H2() {
        duringCreated(LiveVoiceInternalSquareApi.getGuessLikeData()).subscribe(dhw.m115826e(new tbv(this), new y20() { // from class: l.vbv
            @Override // p153l.y20
            public final void call(Object obj) {
                acv.m96978s2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I2 */
    public void m96989I2() {
        if (BaseLiveBean.hasNextPage(this.guessLikePagination)) {
            duringCreated(LiveVoiceInternalSquareApi.getGuessLikeData(this.guessLikePagination.getProcessedNext())).subscribe(dhw.m115826e(new tbv(this), new y20() { // from class: l.ubv
                @Override // p153l.y20
                public final void call(Object obj) {
                    acv.m96976q2((Throwable) obj);
                }
            }));
        } else {
            m96988H2();
        }
    }

    /* JADX INFO: renamed from: y2 */
    public void m96990y2(String str) {
        duringCreated(LiveVoiceInternalSquareApi.getSearchResult(str)).subscribe(dhw.m115826e(new y20() { // from class: l.wbv
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188279a.m96983B2((LiveVoiceSearchDetail) obj);
            }
        }, new y20() { // from class: l.xbv
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f193221a.m96985D2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z2 */
    public final void m96991z2(LiveVoiceSuggestDetail liveVoiceSuggestDetail) {
        this.guessLikePagination = liveVoiceSuggestDetail.getPagination();
        if (jyb.m147479J(liveVoiceSuggestDetail.getCards())) {
            ((icv) this.viewModel).m139508z(new ArrayList());
        } else {
            ((icv) this.viewModel).m139508z(e4s.m119474b(this.cardContext, liveVoiceSuggestDetail.getCards()));
        }
    }

    /* JADX INFO: renamed from: C2 */
    public void m96984C2() {
    }
}
