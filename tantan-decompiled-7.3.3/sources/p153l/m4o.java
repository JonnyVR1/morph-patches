package p153l;

import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.feedbase.IntlLiveSquareFeedBaseFrag;
import com.p051p1.mobile.putong.live.external.square.api.LiveSquareBannerBean;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m88121d2 = {"Ll/m4o;", "", "Lcom/p1/mobile/putong/live/external/intl/livesquare/fragments/feedbase/IntlLiveSquareFeedBaseFrag;", "baseFrag", "<init>", "(Lcom/p1/mobile/putong/live/external/intl/livesquare/fragments/feedbase/IntlLiveSquareFeedBaseFrag;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveSuggestLive;", "live", "", "modelPosition", "Ll/y8o;", "c", "(Lcom/p1/mobile/putong/live/base/data/BLiveSuggestLive;I)Ll/y8o;", "Lcom/p1/mobile/putong/live/external/square/api/LiveSquareBannerBean;", "banner", "Ll/e2o;", "b", "(Lcom/p1/mobile/putong/live/external/square/api/LiveSquareBannerBean;)Ll/e2o;", "a", "Lcom/p1/mobile/putong/live/external/intl/livesquare/fragments/feedbase/IntlLiveSquareFeedBaseFrag;", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class m4o {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final IntlLiveSquareFeedBaseFrag<?> baseFrag;

    public m4o(@NotNull IntlLiveSquareFeedBaseFrag<?> intlLiveSquareFeedBaseFrag) {
        intlLiveSquareFeedBaseFrag.getClass();
        this.baseFrag = intlLiveSquareFeedBaseFrag;
    }

    /* JADX INFO: renamed from: d */
    public static final void m157045d(y8o y8oVar, m4o m4oVar, BLiveSuggestLive bLiveSuggestLive, View view) {
        y8oVar.mo214755Q();
        IntlLiveSquareFeedBaseFrag<?> intlLiveSquareFeedBaseFrag = m4oVar.baseFrag;
        intlLiveSquareFeedBaseFrag.f46477O.mo147982R2(bLiveSuggestLive, intlLiveSquareFeedBaseFrag.tabInfo.name, bLiveSuggestLive.recommendInfo.category, null);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final e2o m157046b(@NotNull LiveSquareBannerBean banner) {
        banner.getClass();
        IntlLiveSquareFeedBaseFrag<?> intlLiveSquareFeedBaseFrag = this.baseFrag;
        e2o e2oVar = new e2o(intlLiveSquareFeedBaseFrag.layoutColumnNum, banner, intlLiveSquareFeedBaseFrag);
        e2oVar.m119128a0(this.baseFrag);
        e2oVar.m114919J(banner.rowIndex);
        e2oVar.m113882B(this.baseFrag.pageId());
        return e2oVar;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final y8o m157047c(@NotNull final BLiveSuggestLive live, int modelPosition) {
        live.getClass();
        final y8o y8oVar = new y8o(live, this.baseFrag.m71244D5(), this.baseFrag.layoutColumnNum, modelPosition);
        y8oVar.mo113881A(new View.OnClickListener() { // from class: l.l4o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                m4o.m157045d(y8oVar, this, live, view);
            }
        });
        y8oVar.m113882B(this.baseFrag.pageId());
        return y8oVar;
    }
}
