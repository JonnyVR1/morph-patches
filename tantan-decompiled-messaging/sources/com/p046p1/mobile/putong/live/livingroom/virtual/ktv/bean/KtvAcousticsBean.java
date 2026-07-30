package com.p046p1.mobile.putong.live.livingroom.virtual.ktv.bean;

import androidx.annotation.DrawableRes;
import com.immomo.momomediaext.MomoMediaConstants$MMLiveAudioEffectPreset;
import java.util.ArrayList;
import p149l.i3c0;
import p149l.vwb;

/* JADX INFO: loaded from: classes5.dex */
public class KtvAcousticsBean {
    public boolean isSelected = false;
    public String name;

    @DrawableRes
    public int pic;
    public int preset;
    public static int ROOM_ACOUSTICS_KTV = MomoMediaConstants$MMLiveAudioEffectPreset.MMLiveAudioEffectPresetRoomAcousticsKTV.getValue();
    public static int ROOM_ACOUSTICS_VOCAL_CONCERT = MomoMediaConstants$MMLiveAudioEffectPreset.MMLiveAudioEffectPresetRoomAcousVocalConcer.getValue();
    public static int ROOM_ACOUSTICS_STUDIO = MomoMediaConstants$MMLiveAudioEffectPreset.MMLiveAudioEffectPresetRoomAcousStudio.getValue();
    public static int ROOM_ACOUSTICS_PHONOGRAPH = MomoMediaConstants$MMLiveAudioEffectPreset.MMLiveAudioEffectPresetRoomAcousPhonograph.getValue();
    public static int ROOM_ACOUSTICS_VIRTUAL_STEREO = MomoMediaConstants$MMLiveAudioEffectPreset.MMLiveAudioEffectPresetRoomAcousVirtualStereo.getValue();
    public static KtvAcousticsBean KTV = new KtvAcousticsBean(ROOM_ACOUSTICS_KTV, "KTV", i3c0.f110949b);
    public static KtvAcousticsBean VOCAL_CONCERT = new KtvAcousticsBean(ROOM_ACOUSTICS_VOCAL_CONCERT, "演唱会", i3c0.f110997f);
    public static KtvAcousticsBean STUDIO = new KtvAcousticsBean(ROOM_ACOUSTICS_STUDIO, "录音棚", i3c0.f110973d);
    public static KtvAcousticsBean PHONOGRAPH = new KtvAcousticsBean(ROOM_ACOUSTICS_PHONOGRAPH, "留声机", i3c0.f110961c);
    public static KtvAcousticsBean VIRTUAL_STEREO = new KtvAcousticsBean(ROOM_ACOUSTICS_VIRTUAL_STEREO, "虚拟立体声", i3c0.f110985e);

    public KtvAcousticsBean(int i, String str, @DrawableRes int i2) {
        this.preset = i;
        this.name = str;
        this.pic = i2;
    }

    public static ArrayList<KtvAcousticsBean> getKtvAcoustics() {
        return vwb.m200324f0(KTV, VOCAL_CONCERT, PHONOGRAPH, STUDIO, VIRTUAL_STEREO);
    }
}
