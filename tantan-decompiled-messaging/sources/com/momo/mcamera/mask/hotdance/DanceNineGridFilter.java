package com.momo.mcamera.mask.hotdance;

import p149l.ydk;

/* JADX INFO: loaded from: classes7.dex */
public class DanceNineGridFilter extends ydk {
    private final DynamicNineGridFilter dynamicNineGridFilter;
    private final TextureChangeFilter textureChangeFilter;

    public DanceNineGridFilter() {
        TextureChangeFilter textureChangeFilter = new TextureChangeFilter();
        this.textureChangeFilter = textureChangeFilter;
        DynamicNineGridFilter dynamicNineGridFilter = new DynamicNineGridFilter();
        this.dynamicNineGridFilter = dynamicNineGridFilter;
        textureChangeFilter.addTarget(dynamicNineGridFilter);
        dynamicNineGridFilter.addTarget(this);
        registerInitialFilter(textureChangeFilter);
        registerTerminalFilter(dynamicNineGridFilter);
    }

    public void clear() {
        DynamicNineGridFilter dynamicNineGridFilter = this.dynamicNineGridFilter;
        if (dynamicNineGridFilter != null) {
            dynamicNineGridFilter.clear();
        }
    }

    public void onMusicBeatDetect(int i) {
        DynamicNineGridFilter dynamicNineGridFilter = this.dynamicNineGridFilter;
        if (dynamicNineGridFilter != null) {
            dynamicNineGridFilter.onMusicBeatDetect(i);
        }
    }
}
