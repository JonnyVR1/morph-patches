package com.p000p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects;

import android.content.Context;
import l.a2c0;
import l.t100;
import l.xdl0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class EffectsDanmakuEvent$Page {
    private static final /* synthetic */ EffectsDanmakuEvent$Page[] $VALUES = $values();
    public static final EffectsDanmakuEvent$Page STORM;
    public static final EffectsDanmakuEvent$Page STORM_RULE;
    private static int sMaxHeight;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.EffectsDanmakuEvent$Page$1 */
    public final enum C03281 extends EffectsDanmakuEvent$Page {
        private C03281(String str, int i) {
            super(str, i);
        }

        @Override // com.p000p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.EffectsDanmakuEvent$Page
        public int getHeight() {
            return (int) ((((xdl0.y0() - (t100.i * 2)) / 3.5416667f) - t100.d(96.0f)) + t100.d(376.0f));
        }

        @Override // com.p000p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.EffectsDanmakuEvent$Page
        public int getWidth() {
            return 0;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.EffectsDanmakuEvent$Page$2 */
    public final enum C03292 extends EffectsDanmakuEvent$Page {
        private C03292(String str, int i) {
            super(str, i);
        }

        @Override // com.p000p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.EffectsDanmakuEvent$Page
        public int getHeight() {
            return (int) ((((xdl0.y0() - (t100.i * 2)) / 3.5416667f) - t100.d(96.0f)) + t100.d(376.0f));
        }

        @Override // com.p000p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.EffectsDanmakuEvent$Page
        public int getWidth() {
            return 0;
        }
    }

    private static /* synthetic */ EffectsDanmakuEvent$Page[] $values() {
        return new EffectsDanmakuEvent$Page[]{STORM, STORM_RULE};
    }

    static {
        STORM = new C03281("STORM", 0);
        STORM_RULE = new C03292("STORM_RULE", 1);
    }

    public static int getMaxHeight(Context context) {
        if (sMaxHeight == 0) {
            sMaxHeight = context.getResources().getDimensionPixelOffset(a2c0.a);
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
