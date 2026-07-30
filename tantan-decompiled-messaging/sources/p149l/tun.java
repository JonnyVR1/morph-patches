package p149l;

import com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.followTab.IntlLiveFollowView;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m87232d2 = {"Ll/tun;", "Ll/d1q;", "Lcom/p1/mobile/putong/live/external/intl/livesquare/fragments/followTab/IntlLiveFollowView;", "Ll/i3o;", "presenter", "<init>", "(Ll/i3o;)V", "", "o", "()I", "itemView", "", "H", "(Lcom/p1/mobile/putong/live/external/intl/livesquare/fragments/followTab/IntlLiveFollowView;)V", "a", "Ll/i3o;", "getPresenter", "()Ll/i3o;", "Ll/mtn;", "b", "Ll/mtn;", "getLiveActivitiesInfo", "()Ll/mtn;", "I", "(Ll/mtn;)V", "liveActivitiesInfo", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class tun extends d1q<IntlLiveFollowView> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final i3o presenter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public mtn liveActivitiesInfo;

    public tun(@NotNull i3o i3oVar) {
        i3oVar.getClass();
        this.presenter = i3oVar;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo70566u(@NotNull IntlLiveFollowView itemView) {
        itemView.getClass();
        super.mo70566u(itemView);
        mtn mtnVar = this.liveActivitiesInfo;
        if (mtnVar != null) {
            itemView.m70084d(this.presenter, mtnVar);
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m190714I(@Nullable mtn mtnVar) {
        this.liveActivitiesInfo = mtnVar;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return s6c0.f162667G;
    }
}
