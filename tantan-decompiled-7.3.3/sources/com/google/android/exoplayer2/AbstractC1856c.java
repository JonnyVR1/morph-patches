package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.api.Api;
import com.google.common.collect.ImmutableList;
import java.util.List;
import p153l.bmk0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.c */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class AbstractC1856c implements InterfaceC2026t {

    /* JADX INFO: renamed from: a */
    public final AbstractC1857c0.d f7325a = new AbstractC1857c0.d();

    /* JADX INFO: renamed from: a */
    public final int m9757a() {
        int repeatMode = getRepeatMode();
        if (repeatMode == 1) {
            return 0;
        }
        return repeatMode;
    }

    public final void addMediaItem(int i, C1944n c1944n) {
        addMediaItems(i, ImmutableList.m15740of(c1944n));
    }

    public final void addMediaItems(List<C1944n> list) {
        addMediaItems(Api.BaseClientBuilder.API_PRIORITY_OTHER, list);
    }

    /* JADX INFO: renamed from: b */
    public final void m9758b(int i) {
        mo9759c(getCurrentMediaItemIndex(), -9223372036854775807L, i, true);
    }

    @VisibleForTesting(otherwise = 4)
    /* JADX INFO: renamed from: c */
    public abstract void mo9759c(int i, long j, int i2, boolean z);

    public final boolean canAdvertiseSession() {
        return true;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public final void clearMediaItems() {
        removeMediaItems(0, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* JADX INFO: renamed from: d */
    public final void m9760d(long j, int i) {
        mo9759c(getCurrentMediaItemIndex(), j, i, false);
    }

    /* JADX INFO: renamed from: e */
    public final void m9761e(int i, int i2) {
        mo9759c(i, -9223372036854775807L, i2, false);
    }

    /* JADX INFO: renamed from: f */
    public final void m9762f(int i) {
        int nextMediaItemIndex = getNextMediaItemIndex();
        if (nextMediaItemIndex == -1) {
            return;
        }
        if (nextMediaItemIndex == getCurrentMediaItemIndex()) {
            m9758b(i);
        } else {
            m9761e(nextMediaItemIndex, i);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m9763g(long j, int i) {
        long currentPosition = getCurrentPosition() + j;
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        m9760d(Math.max(currentPosition, 0L), i);
    }

    public final int getBufferedPercentage() {
        long bufferedPosition = getBufferedPosition();
        long duration = getDuration();
        if (bufferedPosition == -9223372036854775807L || duration == -9223372036854775807L) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        return bmk0.m105162q((int) ((bufferedPosition * 100) / duration), 0, 100);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public final long getContentDuration() {
        AbstractC1857c0 currentTimeline = getCurrentTimeline();
        if (currentTimeline.m9776u()) {
            return -9223372036854775807L;
        }
        return currentTimeline.m9774r(getCurrentMediaItemIndex(), this.f7325a).m9806f();
    }

    public final long getCurrentLiveOffset() {
        AbstractC1857c0 currentTimeline = getCurrentTimeline();
        if (currentTimeline.m9776u() || currentTimeline.m9774r(getCurrentMediaItemIndex(), this.f7325a).f7370f == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (this.f7325a.m9803c() - this.f7325a.f7370f) - getContentPosition();
    }

    @Nullable
    public final Object getCurrentManifest() {
        AbstractC1857c0 currentTimeline = getCurrentTimeline();
        if (currentTimeline.m9776u()) {
            return null;
        }
        return currentTimeline.m9774r(getCurrentMediaItemIndex(), this.f7325a).f7368d;
    }

    @Nullable
    public final C1944n getCurrentMediaItem() {
        AbstractC1857c0 currentTimeline = getCurrentTimeline();
        if (currentTimeline.m9776u()) {
            return null;
        }
        return currentTimeline.m9774r(getCurrentMediaItemIndex(), this.f7325a).f7367c;
    }

    @Deprecated
    public final int getCurrentWindowIndex() {
        return getCurrentMediaItemIndex();
    }

    public final C1944n getMediaItemAt(int i) {
        return getCurrentTimeline().m9774r(i, this.f7325a).f7367c;
    }

    public final int getMediaItemCount() {
        return getCurrentTimeline().mo9775t();
    }

    public final int getNextMediaItemIndex() {
        AbstractC1857c0 currentTimeline = getCurrentTimeline();
        if (currentTimeline.m9776u()) {
            return -1;
        }
        return currentTimeline.mo9452i(getCurrentMediaItemIndex(), m9757a(), getShuffleModeEnabled());
    }

    @Deprecated
    public final int getNextWindowIndex() {
        return getNextMediaItemIndex();
    }

    public final int getPreviousMediaItemIndex() {
        AbstractC1857c0 currentTimeline = getCurrentTimeline();
        if (currentTimeline.m9776u()) {
            return -1;
        }
        return currentTimeline.mo9455p(getCurrentMediaItemIndex(), m9757a(), getShuffleModeEnabled());
    }

    @Deprecated
    public final int getPreviousWindowIndex() {
        return getPreviousMediaItemIndex();
    }

    /* JADX INFO: renamed from: h */
    public final void m9764h(int i) {
        int previousMediaItemIndex = getPreviousMediaItemIndex();
        if (previousMediaItemIndex == -1) {
            return;
        }
        if (previousMediaItemIndex == getCurrentMediaItemIndex()) {
            m9758b(i);
        } else {
            m9761e(previousMediaItemIndex, i);
        }
    }

    @Deprecated
    public final boolean hasNext() {
        return hasNextMediaItem();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public final boolean hasNextMediaItem() {
        return getNextMediaItemIndex() != -1;
    }

    @Deprecated
    public final boolean hasNextWindow() {
        return hasNextMediaItem();
    }

    @Deprecated
    public final boolean hasPrevious() {
        return hasPreviousMediaItem();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public final boolean hasPreviousMediaItem() {
        return getPreviousMediaItemIndex() != -1;
    }

    @Deprecated
    public final boolean hasPreviousWindow() {
        return hasPreviousMediaItem();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public final boolean isCommandAvailable(int i) {
        return getAvailableCommands().m11799c(i);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public final boolean isCurrentMediaItemDynamic() {
        AbstractC1857c0 currentTimeline = getCurrentTimeline();
        return !currentTimeline.m9776u() && currentTimeline.m9774r(getCurrentMediaItemIndex(), this.f7325a).f7373i;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public final boolean isCurrentMediaItemLive() {
        AbstractC1857c0 currentTimeline = getCurrentTimeline();
        return !currentTimeline.m9776u() && currentTimeline.m9774r(getCurrentMediaItemIndex(), this.f7325a).m9808h();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public final boolean isCurrentMediaItemSeekable() {
        AbstractC1857c0 currentTimeline = getCurrentTimeline();
        return !currentTimeline.m9776u() && currentTimeline.m9774r(getCurrentMediaItemIndex(), this.f7325a).f7372h;
    }

    @Deprecated
    public final boolean isCurrentWindowDynamic() {
        return isCurrentMediaItemDynamic();
    }

    @Deprecated
    public final boolean isCurrentWindowLive() {
        return isCurrentMediaItemLive();
    }

    @Deprecated
    public final boolean isCurrentWindowSeekable() {
        return isCurrentMediaItemSeekable();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public final boolean isPlaying() {
        return getPlaybackState() == 3 && getPlayWhenReady() && getPlaybackSuppressionReason() == 0;
    }

    public final void moveMediaItem(int i, int i2) {
        if (i != i2) {
            moveMediaItems(i, i + 1, i2);
        }
    }

    @Deprecated
    public final void next() {
        seekToNextMediaItem();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public final void pause() {
        setPlayWhenReady(false);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public final void play() {
        setPlayWhenReady(true);
    }

    @Deprecated
    public final void previous() {
        seekToPreviousMediaItem();
    }

    public final void removeMediaItem(int i) {
        removeMediaItems(i, i + 1);
    }

    public final void replaceMediaItem(int i, C1944n c1944n) {
        replaceMediaItems(i, i + 1, ImmutableList.m15740of(c1944n));
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public final void seekBack() {
        m9763g(-getSeekBackIncrement(), 11);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public final void seekForward() {
        m9763g(getSeekForwardIncrement(), 12);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public final void seekTo(int i, long j) {
        mo9759c(i, j, 10, false);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public final void seekToDefaultPosition() {
        m9761e(getCurrentMediaItemIndex(), 4);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public final void seekToNext() {
        if (getCurrentTimeline().m9776u() || isPlayingAd()) {
            return;
        }
        if (hasNextMediaItem()) {
            m9762f(9);
        } else if (isCurrentMediaItemLive() && isCurrentMediaItemDynamic()) {
            m9761e(getCurrentMediaItemIndex(), 9);
        }
    }

    public final void seekToNextMediaItem() {
        m9762f(8);
    }

    @Deprecated
    public final void seekToNextWindow() {
        seekToNextMediaItem();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public final void seekToPrevious() {
        if (getCurrentTimeline().m9776u() || isPlayingAd()) {
            return;
        }
        boolean zHasPreviousMediaItem = hasPreviousMediaItem();
        if (isCurrentMediaItemLive() && !isCurrentMediaItemSeekable()) {
            if (zHasPreviousMediaItem) {
                m9764h(7);
            }
        } else if (!zHasPreviousMediaItem || getCurrentPosition() > getMaxSeekToPreviousPosition()) {
            m9760d(0L, 7);
        } else {
            m9764h(7);
        }
    }

    public final void seekToPreviousMediaItem() {
        m9764h(6);
    }

    @Deprecated
    public final void seekToPreviousWindow() {
        seekToPreviousMediaItem();
    }

    public final void setMediaItem(C1944n c1944n, long j) {
        setMediaItems(ImmutableList.m15740of(c1944n), 0, j);
    }

    public final void setMediaItems(List<C1944n> list) {
        setMediaItems(list, true);
    }

    public final void setPlaybackSpeed(float f) {
        setPlaybackParameters(getPlaybackParameters().m10952c(f));
    }

    public final void addMediaItem(C1944n c1944n) {
        addMediaItems(ImmutableList.m15740of(c1944n));
    }

    public final void seekToDefaultPosition(int i) {
        m9761e(i, 10);
    }

    public final void setMediaItem(C1944n c1944n) {
        setMediaItems(ImmutableList.m15740of(c1944n));
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    public final void seekTo(long j) {
        m9760d(j, 5);
    }

    public final void setMediaItem(C1944n c1944n, boolean z) {
        setMediaItems(ImmutableList.m15740of(c1944n), z);
    }
}
