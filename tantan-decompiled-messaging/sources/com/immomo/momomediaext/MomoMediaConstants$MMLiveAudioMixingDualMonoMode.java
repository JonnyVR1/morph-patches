package com.immomo.momomediaext;

/* JADX INFO: loaded from: classes7.dex */
public enum MomoMediaConstants$MMLiveAudioMixingDualMonoMode {
    MMLiveAudioMixingDualMonoAuto(0),
    MMLiveAudioMixingDualMonoL(1),
    MMLiveAudioMixingDualMonoR(2),
    MMLiveAudioMixingDualMonoMix(3);

    private int value;

    MomoMediaConstants$MMLiveAudioMixingDualMonoMode(int i) {
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }
}
