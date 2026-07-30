package com.p051p1.mobile.putong.live.livingroom.voice.call.motion;

import android.text.TextUtils;
import com.google.android.gms.common.api.Api;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy;
import p153l.hdn0;
import p153l.jyb;
import p153l.k3p0;
import p153l.lfn0;
import p153l.m3p0;
import p153l.qcj;
import p153l.qln0;
import p153l.sam;
import p153l.sln0;
import p153l.udo0;
import p153l.uln0;
import p153l.v5o0;

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
    public final enum C131581 extends VoicePlayStrategy {
        private C131581(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy
        public int getDeputyCount() {
            return 8;
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy
        public sam getPlayStrategyView() {
            return new hdn0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy$2 */
    public final enum C131592 extends VoicePlayStrategy {
        private C131592(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy
        public int getDeputyCount() {
            return 9;
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy
        public sam getPlayStrategyView() {
            return new udo0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy$3 */
    public final enum C131603 extends VoicePlayStrategy {
        private C131603(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy
        public int getDeputyCount() {
            return 10;
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy
        public sam getPlayStrategyView() {
            return new k3p0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy$4 */
    public final enum C131614 extends VoicePlayStrategy {
        private C131614(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy
        public int getDeputyCount() {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy
        public sam getPlayStrategyView() {
            return new v5o0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy$5 */
    public final enum C131625 extends VoicePlayStrategy {
        private C131625(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy
        public int getDeputyCount() {
            return 8;
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy
        public sam getPlayStrategyView() {
            return new qln0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy$6 */
    public final enum C131636 extends VoicePlayStrategy {
        private C131636(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy
        public int getDeputyCount() {
            return 9;
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy
        public sam getPlayStrategyView() {
            return new sln0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy$7 */
    public final enum C131647 extends VoicePlayStrategy {
        private C131647(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy
        public int getDeputyCount() {
            return 10;
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy
        public sam getPlayStrategyView() {
            return new uln0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy$8 */
    public final enum C131658 extends VoicePlayStrategy {
        private C131658(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy
        public int getDeputyCount() {
            return 3;
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy
        public sam getPlayStrategyView() {
            return new m3p0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy$9 */
    public final enum C131669 extends VoicePlayStrategy {
        private C131669(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy
        public int getDeputyCount() {
            return 5;
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.voice.call.motion.VoicePlayStrategy
        public sam getPlayStrategyView() {
            return new lfn0();
        }
    }

    private static /* synthetic */ VoicePlayStrategy[] $values() {
        return new VoicePlayStrategy[]{EIGHT_DEPUTY, NINE_DEPUTY, TEN_DEPUTY, ALL_DEPUTY, BOTTOM_EIGHT_DEPUTY, BOTTOM_NINE_DEPUTY, BOTTOM_TEN_DEPUTY, THREE_DEPUTY, FIVE_DEPUTY};
    }

    static {
        EIGHT_DEPUTY = new C131581("EIGHT_DEPUTY", 0, BLiveVoice.EIGHT_DEPUTY_STRATEGY);
        NINE_DEPUTY = new C131592("NINE_DEPUTY", 1, BLiveVoice.NINE_DEPUTY_STRATEGY);
        TEN_DEPUTY = new C131603("TEN_DEPUTY", 2, BLiveVoice.TEN_DEPUTY_STRATEGY);
        ALL_DEPUTY = new C131614("ALL_DEPUTY", 3, BLiveVoice.ALL_DEPUTY_STRATEGY);
        BOTTOM_EIGHT_DEPUTY = new C131625("BOTTOM_EIGHT_DEPUTY", 4, BLiveVoice.BOTTOM_EIGHT_DEPUTY_STRATEGY);
        BOTTOM_NINE_DEPUTY = new C131636("BOTTOM_NINE_DEPUTY", 5, BLiveVoice.BOTTOM_NINE_DEPUTY_STRATEGY);
        BOTTOM_TEN_DEPUTY = new C131647("BOTTOM_TEN_DEPUTY", 6, BLiveVoice.BOTTOM_TEN_DEPUTY_STRATEGY);
        THREE_DEPUTY = new C131658("THREE_DEPUTY", 7, BLiveVoice.THREE_DEPUTY_STRATEGY);
        FIVE_DEPUTY = new C131669("FIVE_DEPUTY", 8, BLiveVoice.FIVE_DEPUTY_STRATEGY);
    }

    private VoicePlayStrategy(String str, int i, String str2) {
        super(str, i);
        this.type = str2;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Boolean m79125a(String str, VoicePlayStrategy voicePlayStrategy) {
        return TextUtils.equals(voicePlayStrategy.type, str) ? Boolean.TRUE : Boolean.FALSE;
    }

    public static VoicePlayStrategy getStrategy(final String str) {
        VoicePlayStrategy voicePlayStrategy = (VoicePlayStrategy) jyb.m147530s(values(), new qcj() { // from class: l.eho0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VoicePlayStrategy.m79125a(str, (VoicePlayStrategy) obj);
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

    public abstract sam getPlayStrategyView();

    public String getType() {
        return this.type;
    }
}
