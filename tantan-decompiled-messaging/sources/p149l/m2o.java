package p149l;

import android.view.View;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.feedbase.IntlLiveSquareFeedBaseFrag;
import com.p046p1.mobile.putong.live.external.square.api.LiveSquareBannerBean;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m87232d2 = {"Ll/m2o;", "", "Lcom/p1/mobile/putong/live/external/intl/livesquare/fragments/feedbase/IntlLiveSquareFeedBaseFrag;", "baseFrag", "<init>", "(Lcom/p1/mobile/putong/live/external/intl/livesquare/fragments/feedbase/IntlLiveSquareFeedBaseFrag;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveSuggestLive;", "live", "", "modelPosition", "Ll/y6o;", "c", "(Lcom/p1/mobile/putong/live/base/data/BLiveSuggestLive;I)Ll/y6o;", "Lcom/p1/mobile/putong/live/external/square/api/LiveSquareBannerBean;", "banner", "Ll/e0o;", "b", "(Lcom/p1/mobile/putong/live/external/square/api/LiveSquareBannerBean;)Ll/e0o;", "a", "Lcom/p1/mobile/putong/live/external/intl/livesquare/fragments/feedbase/IntlLiveSquareFeedBaseFrag;", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class m2o {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final IntlLiveSquareFeedBaseFrag<?> baseFrag;

    public m2o(@NotNull IntlLiveSquareFeedBaseFrag<?> intlLiveSquareFeedBaseFrag) {
        intlLiveSquareFeedBaseFrag.getClass();
        this.baseFrag = intlLiveSquareFeedBaseFrag;
    }

    /* JADX INFO: renamed from: d */
    public static final void m152698d(y6o y6oVar, m2o m2oVar, BLiveSuggestLive bLiveSuggestLive, View view) {
        y6oVar.mo213152Q();
        IntlLiveSquareFeedBaseFrag<?> intlLiveSquareFeedBaseFrag = m2oVar.baseFrag;
        intlLiveSquareFeedBaseFrag.f45629O.mo144086R2(bLiveSuggestLive, intlLiveSquareFeedBaseFrag.tabInfo.name, bLiveSuggestLive.recommendInfo.category, null);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final e0o m152699b(@NotNull LiveSquareBannerBean banner) {
        banner.getClass();
        IntlLiveSquareFeedBaseFrag<?> intlLiveSquareFeedBaseFrag = this.baseFrag;
        e0o e0oVar = new e0o(intlLiveSquareFeedBaseFrag.layoutColumnNum, banner, intlLiveSquareFeedBaseFrag);
        e0oVar.m114312a0(this.baseFrag);
        e0oVar.m110184J(banner.rowIndex);
        e0oVar.m109663B(this.baseFrag.pageId());
        return e0oVar;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final y6o m152700c(@NotNull final BLiveSuggestLive live, int modelPosition) {
        live.getClass();
        final y6o y6oVar = new y6o(live, this.baseFrag.m70061D5(), this.baseFrag.layoutColumnNum, modelPosition);
        y6oVar.mo109662A(new View.OnClickListener() { // from class: l.l2o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                m2o.m152698d(y6oVar, this, live, view);
            }
        });
        y6oVar.m109663B(this.baseFrag.pageId());
        return y6oVar;
    }
}
