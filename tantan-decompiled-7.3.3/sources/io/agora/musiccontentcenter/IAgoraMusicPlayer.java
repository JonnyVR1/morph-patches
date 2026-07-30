package io.agora.musiccontentcenter;

import io.agora.mediaplayer.IMediaPlayer;

/* JADX INFO: loaded from: classes2.dex */
public interface IAgoraMusicPlayer extends IMediaPlayer {

    public enum MusicPlayMode {
        MUSIC_PLAY_MODE_ORIGINAL(0),
        MUSIC_PLAY_MODE_ACCOMPANY(1),
        MUSIC_PLAY_MODE_LEAD_SING(2);

        private final int value;

        MusicPlayMode(int i) {
            this.value = i;
        }

        public static MusicPlayMode valueOf(int i) {
            if (i == 0) {
                return MUSIC_PLAY_MODE_ORIGINAL;
            }
            if (i == 1) {
                return MUSIC_PLAY_MODE_ACCOMPANY;
            }
            if (i != 2) {
                return null;
            }
            return MUSIC_PLAY_MODE_LEAD_SING;
        }

        public int getValue() {
            return this.value;
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    @Deprecated
    int destroy();

    @Override // io.agora.mediaplayer.IMediaPlayer
    String getPlaySrc();

    int open(long j, long j2);

    @Override // io.agora.mediaplayer.IMediaPlayer
    int open(String str, long j);

    int setPlayMode(MusicPlayMode musicPlayMode);

    @Override // io.agora.mediaplayer.IMediaPlayer
    int stop();
}
