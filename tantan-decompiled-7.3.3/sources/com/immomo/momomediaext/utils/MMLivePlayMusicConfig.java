package com.immomo.momomediaext.utils;

/* JADX INFO: loaded from: classes7.dex */
public class MMLivePlayMusicConfig {
    public String musicUrl = "";
    public int repeatCount = 1;
    public MMLivePlayMusicType playMusicType = MMLivePlayMusicType.MMLivePlayMusicTypePlayoutAndPublish;

    public enum MMLivePlayMusicType {
        MMLivePlayMusicTypePlayout(0),
        MMLivePlayMusicTypePlayoutAndPublish(1);

        private int value;

        MMLivePlayMusicType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }
}
