package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.api.Api;
import com.google.common.collect.ImmutableList;
import java.util.List;
import p149l.vck0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.c */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class AbstractC1833c implements InterfaceC2003t {

    /* JADX INFO: renamed from: a */
    public final AbstractC1834c0.d f7288a = new AbstractC1834c0.d();

    /* JADX INFO: renamed from: a */
    public final int m9703a() {
        int repeatMode = getRepeatMode();
        if (repeatMode == 1) {
            return 0;
        }
        return repeatMode;
    }

    public final void addMediaItem(int i, C1921n c1921n) {
        addMediaItems(i, ImmutableList.m15686of(c1921n));
    }

    public final void addMediaItems(List<C1921n> list) {
        addMediaItems(Api.BaseClientBuilder.API_PRIORITY_OTHER, list);
    }

    /* JADX INFO: renamed from: b */
    public final void m9704b(int i) {
        mo9705c(getCurrentMediaItemIndex(), -9223372036854775807L, i, true);
    }

    @VisibleForTesting(otherwise = 4)
    /* JADX INFO: renamed from: c */
    public abstract void mo9705c(int i, long j, int i2, boolean z);

    public final boolean canAdvertiseSession() {
        return true;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public final void clearMediaItems() {
        removeMediaItems(0, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* JADX INFO: renamed from: d */
    public final void m9706d(long j, int i) {
        mo9705c(getCurrentMediaItemIndex(), j, i, false);
    }

    /* JADX INFO: renamed from: e */
    public final void m9707e(int i, int i2) {
        mo9705c(i, -9223372036854775807L, i2, false);
    }

    /* JADX INFO: renamed from: f */
    public final void m9708f(int i) {
        int nextMediaItemIndex = getNextMediaItemIndex();
        if (nextMediaItemIndex == -1) {
            return;
        }
        if (nextMediaItemIndex == getCurrentMediaItemIndex()) {
            m9704b(i);
        } else {
            m9707e(nextMediaItemIndex, i);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m9709g(long j, int i) {
        long currentPosition = getCurrentPosition() + j;
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        m9706d(Math.max(currentPosition, 0L), i);
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
        return vck0.m197884q((int) ((bufferedPosition * 100) / duration), 0, 100);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public final long getContentDuration() {
        AbstractC1834c0 currentTimeline = getCurrentTimeline();
        if (currentTimeline.m9722u()) {
            return -9223372036854775807L;
        }
        return currentTimeline.m9720r(getCurrentMediaItemIndex(), this.f7288a).m9752f();
    }

    public final long getCurrentLiveOffset() {
        AbstractC1834c0 currentTimeline = getCurrentTimeline();
        if (currentTimeline.m9722u() || currentTimeline.m9720r(getCurrentMediaItemIndex(), this.f7288a).f7333f == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (this.f7288a.m9749c() - this.f7288a.f7333f) - getContentPosition();
    }

    @Nullable
    public final Object getCurrentManifest() {
        AbstractC1834c0 currentTimeline = getCurrentTimeline();
        if (currentTimeline.m9722u()) {
            return null;
        }
        return currentTimeline.m9720r(getCurrentMediaItemIndex(), this.f7288a).f7331d;
    }

    @Nullable
    public final C1921n getCurrentMediaItem() {
        AbstractC1834c0 currentTimeline = getCurrentTimeline();
        if (currentTimeline.m9722u()) {
            return null;
        }
        return currentTimeline.m9720r(getCurrentMediaItemIndex(), this.f7288a).f7330c;
    }

    @Deprecated
    public final int getCurrentWindowIndex() {
        return getCurrentMediaItemIndex();
    }

    public final C1921n getMediaItemAt(int i) {
        return getCurrentTimeline().m9720r(i, this.f7288a).f7330c;
    }

    public final int getMediaItemCount() {
        return getCurrentTimeline().mo9721t();
    }

    public final int getNextMediaItemIndex() {
        AbstractC1834c0 currentTimeline = getCurrentTimeline();
        if (currentTimeline.m9722u()) {
            return -1;
        }
        return currentTimeline.mo9398i(getCurrentMediaItemIndex(), m9703a(), getShuffleModeEnabled());
    }

    @Deprecated
    public final int getNextWindowIndex() {
        return getNextMediaItemIndex();
    }

    public final int getPreviousMediaItemIndex() {
        AbstractC1834c0 currentTimeline = getCurrentTimeline();
        if (currentTimeline.m9722u()) {
            return -1;
        }
        return currentTimeline.mo9401p(getCurrentMediaItemIndex(), m9703a(), getShuffleModeEnabled());
    }

    @Deprecated
    public final int getPreviousWindowIndex() {
        return getPreviousMediaItemIndex();
    }

    /* JADX INFO: renamed from: h */
    public final void m9710h(int i) {
        int previousMediaItemIndex = getPreviousMediaItemIndex();
        if (previousMediaItemIndex == -1) {
            return;
        }
        if (previousMediaItemIndex == getCurrentMediaItemIndex()) {
            m9704b(i);
        } else {
            m9707e(previousMediaItemIndex, i);
        }
    }

    @Deprecated
    public final boolean hasNext() {
        return hasNextMediaItem();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
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

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public final boolean hasPreviousMediaItem() {
        return getPreviousMediaItemIndex() != -1;
    }

    @Deprecated
    public final boolean hasPreviousWindow() {
        return hasPreviousMediaItem();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public final boolean isCommandAvailable(int i) {
        return getAvailableCommands().m11745c(i);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public final boolean isCurrentMediaItemDynamic() {
        AbstractC1834c0 currentTimeline = getCurrentTimeline();
        return !currentTimeline.m9722u() && currentTimeline.m9720r(getCurrentMediaItemIndex(), this.f7288a).f7336i;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public final boolean isCurrentMediaItemLive() {
        AbstractC1834c0 currentTimeline = getCurrentTimeline();
        return !currentTimeline.m9722u() && currentTimeline.m9720r(getCurrentMediaItemIndex(), this.f7288a).m9754h();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public final boolean isCurrentMediaItemSeekable() {
        AbstractC1834c0 currentTimeline = getCurrentTimeline();
        return !currentTimeline.m9722u() && currentTimeline.m9720r(getCurrentMediaItemIndex(), this.f7288a).f7335h;
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

    @Override // com.google.android.exoplayer2.InterfaceC2003t
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

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public final void pause() {
        setPlayWhenReady(false);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
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

    public final void replaceMediaItem(int i, C1921n c1921n) {
        replaceMediaItems(i, i + 1, ImmutableList.m15686of(c1921n));
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public final void seekBack() {
        m9709g(-getSeekBackIncrement(), 11);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public final void seekForward() {
        m9709g(getSeekForwardIncrement(), 12);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public final void seekTo(int i, long j) {
        mo9705c(i, j, 10, false);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public final void seekToDefaultPosition() {
        m9707e(getCurrentMediaItemIndex(), 4);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public final void seekToNext() {
        if (getCurrentTimeline().m9722u() || isPlayingAd()) {
            return;
        }
        if (hasNextMediaItem()) {
            m9708f(9);
        } else if (isCurrentMediaItemLive() && isCurrentMediaItemDynamic()) {
            m9707e(getCurrentMediaItemIndex(), 9);
        }
    }

    public final void seekToNextMediaItem() {
        m9708f(8);
    }

    @Deprecated
    public final void seekToNextWindow() {
        seekToNextMediaItem();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public final void seekToPrevious() {
        if (getCurrentTimeline().m9722u() || isPlayingAd()) {
            return;
        }
        boolean zHasPreviousMediaItem = hasPreviousMediaItem();
        if (isCurrentMediaItemLive() && !isCurrentMediaItemSeekable()) {
            if (zHasPreviousMediaItem) {
                m9710h(7);
            }
        } else if (!zHasPreviousMediaItem || getCurrentPosition() > getMaxSeekToPreviousPosition()) {
            m9706d(0L, 7);
        } else {
            m9710h(7);
        }
    }

    public final void seekToPreviousMediaItem() {
        m9710h(6);
    }

    @Deprecated
    public final void seekToPreviousWindow() {
        seekToPreviousMediaItem();
    }

    public final void setMediaItem(C1921n c1921n, long j) {
        setMediaItems(ImmutableList.m15686of(c1921n), 0, j);
    }

    public final void setMediaItems(List<C1921n> list) {
        setMediaItems(list, true);
    }

    public final void setPlaybackSpeed(float f) {
        setPlaybackParameters(getPlaybackParameters().m10898c(f));
    }

    public final void addMediaItem(C1921n c1921n) {
        addMediaItems(ImmutableList.m15686of(c1921n));
    }

    public final void seekToDefaultPosition(int i) {
        m9707e(i, 10);
    }

    public final void setMediaItem(C1921n c1921n) {
        setMediaItems(ImmutableList.m15686of(c1921n));
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    public final void seekTo(long j) {
        m9706d(j, 5);
    }

    public final void setMediaItem(C1921n c1921n, boolean z) {
        setMediaItems(ImmutableList.m15686of(c1921n), z);
    }
}
