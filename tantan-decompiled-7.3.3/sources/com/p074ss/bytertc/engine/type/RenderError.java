package com.p074ss.bytertc.engine.type;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public enum RenderError {
    RENDER_ERROR_OK(0),
    RENDER_ERROR_USING_INTERNAL_SURFACE(-1),
    RENDER_ERROR_USING_SOFTWARE_DECODER(-2);

    private int value;

    RenderError(int i) {
        this.value = i;
    }

    @CalledByNative
    public static RenderError fromId(int i) {
        for (RenderError renderError : values()) {
            if (renderError.value() == i) {
                return renderError;
            }
        }
        return RENDER_ERROR_OK;
    }

    public int value() {
        return this.value;
    }
}
