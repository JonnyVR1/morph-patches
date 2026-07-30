package com.momo.mcamera.mask.hotdance;

import com.p046p1.mobile.putong.core.data.IntlMarketToken;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class HotDanceConfig {
    public static final int HOT_DANCE_FLASH_EFFECT = 0;
    public static final int HOT_DANCE_NONE = -1;
    public static final int HOT_DANCE_OFFSET_EFFECT = 5;
    public static final int HOT_DANCE_SCALE_COLOR_OFFSET_EFFECT = 4;
    public static final int HOT_DANCE_SCALE_FLASH_EFFECT = 3;
    public static final int HOT_DANCE_SCALE_FOUR_EFFECT = 1;
    public static final int HOT_DANCE_SCALE_ONE_EFFECT = 2;
    public static final int HOT_DANCE_SOUL_EFFECT = 7;
    public static final int HOT_DANCE_TRANSLATE_EFFECT = 6;
    private static final HashMap<String, Integer> map;

    static {
        HashMap<String, Integer> map2 = new HashMap<>();
        map = map2;
        map2.put(IntlMarketToken.flash, 0);
        map2.put("scale_four", 1);
        map2.put("scale_one", 2);
        map2.put("scale_flash", 3);
        map2.put("scale_color_offset", 4);
        map2.put(IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET, 5);
        map2.put("translate", 6);
        map2.put("soul", 7);
    }

    public static int unwrap(String str) {
        Integer num;
        HashMap<String, Integer> map2 = map;
        if (!map2.containsKey(str) || (num = map2.get(str)) == null) {
            return -1;
        }
        return num.intValue();
    }
}
