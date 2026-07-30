package com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects;

import android.content.Context;
import p153l.bnl0;
import p153l.hac0;
import p153l.qa00;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public abstract class EffectsDanmakuEvent$Page {
    private static final /* synthetic */ EffectsDanmakuEvent$Page[] $VALUES = $values();
    public static final EffectsDanmakuEvent$Page STORM;
    public static final EffectsDanmakuEvent$Page STORM_RULE;
    private static int sMaxHeight;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.EffectsDanmakuEvent$Page$1 */
    public final enum C129021 extends EffectsDanmakuEvent$Page {
        private C129021(String str, int i) {
            super(str, i);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.EffectsDanmakuEvent$Page
        public int getHeight() {
            return (int) ((((bnl0.m105592y0() - (qa00.f156322i * 2)) / 3.5416667f) - qa00.m175859d(96.0f)) + qa00.m175859d(376.0f));
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.EffectsDanmakuEvent$Page
        public int getWidth() {
            return 0;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.EffectsDanmakuEvent$Page$2 */
    public final enum C129032 extends EffectsDanmakuEvent$Page {
        private C129032(String str, int i) {
            super(str, i);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.EffectsDanmakuEvent$Page
        public int getHeight() {
            return (int) ((((bnl0.m105592y0() - (qa00.f156322i * 2)) / 3.5416667f) - qa00.m175859d(96.0f)) + qa00.m175859d(376.0f));
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.EffectsDanmakuEvent$Page
        public int getWidth() {
            return 0;
        }
    }

    private static /* synthetic */ EffectsDanmakuEvent$Page[] $values() {
        return new EffectsDanmakuEvent$Page[]{STORM, STORM_RULE};
    }

    static {
        STORM = new C129021("STORM", 0);
        STORM_RULE = new C129032("STORM_RULE", 1);
    }

    public static int getMaxHeight(Context context) {
        if (sMaxHeight == 0) {
            sMaxHeight = context.getResources().getDimensionPixelOffset(hac0.f108489a);
            for (EffectsDanmakuEvent$Page effectsDanmakuEvent$Page : values()) {
                if (sMaxHeight < effectsDanmakuEvent$Page.getHeight()) {
                    sMaxHeight = effectsDanmakuEvent$Page.getHeight();
                }
            }
        }
        return sMaxHeight;
    }

    public static EffectsDanmakuEvent$Page valueOf(String str) {
        return (EffectsDanmakuEvent$Page) Enum.valueOf(EffectsDanmakuEvent$Page.class, str);
    }

    public static EffectsDanmakuEvent$Page[] values() {
        return (EffectsDanmakuEvent$Page[]) $VALUES.clone();
    }

    public abstract /* synthetic */ int getHeight();

    public abstract /* synthetic */ int getWidth();

    private EffectsDanmakuEvent$Page(String str, int i) {
        super(str, i);
    }
}
