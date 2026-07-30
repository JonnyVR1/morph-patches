package com.p069ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public enum AlphaLayout {
    TOP(0),
    BOTTOM(1),
    LEFT(2),
    RIGHT(3);

    private int value;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.data.AlphaLayout$1 */
    public static /* synthetic */ class C134051 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$AlphaLayout;

        static {
            int[] iArr = new int[AlphaLayout.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$AlphaLayout = iArr;
            try {
                iArr[AlphaLayout.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AlphaLayout[AlphaLayout.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AlphaLayout[AlphaLayout.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AlphaLayout[AlphaLayout.RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    AlphaLayout(int i) {
        this.value = i;
    }

    @CalledByNative
    public static AlphaLayout fromId(int i) {
        for (AlphaLayout alphaLayout : values()) {
            if (alphaLayout.value() == i) {
                return alphaLayout;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C134051.$SwitchMap$com$ss$bytertc$engine$data$AlphaLayout[ordinal()];
        if (i == 1) {
            return "TOP";
        }
        if (i == 2) {
            return "BOTTOM";
        }
        if (i != 3) {
            return i != 4 ? "" : "RIGHT";
        }
        return "LEFT";
    }

    public int value() {
        return this.value;
    }
}
