package com.p046p1.mobile.putong.live.livingroom.voice.call.motion;

import android.text.TextUtils;
import com.google.android.gms.common.api.Api;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy;
import p149l.c8m;
import p149l.d4n0;
import p149l.guo0;
import p149l.h6n0;
import p149l.iuo0;
import p149l.mcn0;
import p149l.ocn0;
import p149l.q4o0;
import p149l.qcn0;
import p149l.rwn0;
import p149l.vwb;
import p149l.w9j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public abstract class VoicePlayStrategy {
    private static final /* synthetic */ VoicePlayStrategy[] $VALUES = $values();
    public static final VoicePlayStrategy ALL_DEPUTY;
    public static final VoicePlayStrategy BOTTOM_EIGHT_DEPUTY;
    public static final VoicePlayStrategy BOTTOM_NINE_DEPUTY;
    public static final VoicePlayStrategy BOTTOM_TEN_DEPUTY;
    public static final VoicePlayStrategy EIGHT_DEPUTY;
    public static final VoicePlayStrategy FIVE_DEPUTY;
    public static final VoicePlayStrategy NINE_DEPUTY;
    public static final VoicePlayStrategy TEN_DEPUTY;
    public static final VoicePlayStrategy THREE_DEPUTY;
    private String type;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy$1 */
    public final enum C129951 extends VoicePlayStrategy {
        private C129951(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy
        public int getDeputyCount() {
            return 8;
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy
        public c8m getPlayStrategyView() {
            return new d4n0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy$2 */
    public final enum C129962 extends VoicePlayStrategy {
        private C129962(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy
        public int getDeputyCount() {
            return 9;
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy
        public c8m getPlayStrategyView() {
            return new q4o0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy$3 */
    public final enum C129973 extends VoicePlayStrategy {
        private C129973(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy
        public int getDeputyCount() {
            return 10;
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy
        public c8m getPlayStrategyView() {
            return new guo0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy$4 */
    public final enum C129984 extends VoicePlayStrategy {
        private C129984(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy
        public int getDeputyCount() {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy
        public c8m getPlayStrategyView() {
            return new rwn0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy$5 */
    public final enum C129995 extends VoicePlayStrategy {
        private C129995(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy
        public int getDeputyCount() {
            return 8;
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy
        public c8m getPlayStrategyView() {
            return new mcn0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy$6 */
    public final enum C130006 extends VoicePlayStrategy {
        private C130006(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy
        public int getDeputyCount() {
            return 9;
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy
        public c8m getPlayStrategyView() {
            return new ocn0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy$7 */
    public final enum C130017 extends VoicePlayStrategy {
        private C130017(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy
        public int getDeputyCount() {
            return 10;
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy
        public c8m getPlayStrategyView() {
            return new qcn0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy$8 */
    public final enum C130028 extends VoicePlayStrategy {
        private C130028(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy
        public int getDeputyCount() {
            return 3;
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy
        public c8m getPlayStrategyView() {
            return new iuo0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy$9 */
    public final enum C130039 extends VoicePlayStrategy {
        private C130039(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy
        public int getDeputyCount() {
            return 5;
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy
        public c8m getPlayStrategyView() {
            return new h6n0();
        }
    }

    private static /* synthetic */ VoicePlayStrategy[] $values() {
        return new VoicePlayStrategy[]{EIGHT_DEPUTY, NINE_DEPUTY, TEN_DEPUTY, ALL_DEPUTY, BOTTOM_EIGHT_DEPUTY, BOTTOM_NINE_DEPUTY, BOTTOM_TEN_DEPUTY, THREE_DEPUTY, FIVE_DEPUTY};
    }

    static {
        EIGHT_DEPUTY = new C129951("EIGHT_DEPUTY", 0, BLiveVoice.EIGHT_DEPUTY_STRATEGY);
        NINE_DEPUTY = new C129962("NINE_DEPUTY", 1, BLiveVoice.NINE_DEPUTY_STRATEGY);
        TEN_DEPUTY = new C129973("TEN_DEPUTY", 2, BLiveVoice.TEN_DEPUTY_STRATEGY);
        ALL_DEPUTY = new C129984("ALL_DEPUTY", 3, BLiveVoice.ALL_DEPUTY_STRATEGY);
        BOTTOM_EIGHT_DEPUTY = new C129995("BOTTOM_EIGHT_DEPUTY", 4, BLiveVoice.BOTTOM_EIGHT_DEPUTY_STRATEGY);
        BOTTOM_NINE_DEPUTY = new C130006("BOTTOM_NINE_DEPUTY", 5, BLiveVoice.BOTTOM_NINE_DEPUTY_STRATEGY);
        BOTTOM_TEN_DEPUTY = new C130017("BOTTOM_TEN_DEPUTY", 6, BLiveVoice.BOTTOM_TEN_DEPUTY_STRATEGY);
        THREE_DEPUTY = new C130028("THREE_DEPUTY", 7, BLiveVoice.THREE_DEPUTY_STRATEGY);
        FIVE_DEPUTY = new C130039("FIVE_DEPUTY", 8, BLiveVoice.FIVE_DEPUTY_STRATEGY);
    }

    private VoicePlayStrategy(String str, int i, String str2) {
        super(str, i);
        this.type = str2;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Boolean m77942a(String str, VoicePlayStrategy voicePlayStrategy) {
        return TextUtils.equals(voicePlayStrategy.type, str) ? Boolean.TRUE : Boolean.FALSE;
    }

    public static VoicePlayStrategy getStrategy(final String str) {
        VoicePlayStrategy voicePlayStrategy = (VoicePlayStrategy) vwb.m200347s(values(), new w9j() { // from class: l.a8o0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VoicePlayStrategy.m77942a(str, (VoicePlayStrategy) obj);
            }
        });
        return voicePlayStrategy == null ? NINE_DEPUTY : voicePlayStrategy;
    }

    public static VoicePlayStrategy valueOf(String str) {
        return (VoicePlayStrategy) Enum.valueOf(VoicePlayStrategy.class, str);
    }

    public static VoicePlayStrategy[] values() {
        return (VoicePlayStrategy[]) $VALUES.clone();
    }

    public abstract int getDeputyCount();

    public abstract c8m getPlayStrategyView();

    public String getType() {
        return this.type;
    }
}
