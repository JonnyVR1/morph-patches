package p153l;

import com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.followTab.IntlLiveFollowView;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m88121d2 = {"Ll/twn;", "Ll/d3q;", "Lcom/p1/mobile/putong/live/external/intl/livesquare/fragments/followTab/IntlLiveFollowView;", "Ll/i5o;", "presenter", "<init>", "(Ll/i5o;)V", "", "o", "()I", "itemView", "", "H", "(Lcom/p1/mobile/putong/live/external/intl/livesquare/fragments/followTab/IntlLiveFollowView;)V", "a", "Ll/i5o;", "getPresenter", "()Ll/i5o;", "Ll/mvn;", "b", "Ll/mvn;", "getLiveActivitiesInfo", "()Ll/mvn;", "I", "(Ll/mvn;)V", "liveActivitiesInfo", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class twn extends d3q<IntlLiveFollowView> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final i5o presenter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public mvn liveActivitiesInfo;

    public twn(@NotNull i5o i5oVar) {
        i5oVar.getClass();
        this.presenter = i5oVar;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo71749u(@NotNull IntlLiveFollowView itemView) {
        itemView.getClass();
        super.mo71749u(itemView);
        mvn mvnVar = this.liveActivitiesInfo;
        if (mvnVar != null) {
            itemView.m71267d(this.presenter, mvnVar);
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m193355I(@Nullable mvn mvnVar) {
        this.liveActivitiesInfo = mvnVar;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return xec0.f193781G;
    }
}
