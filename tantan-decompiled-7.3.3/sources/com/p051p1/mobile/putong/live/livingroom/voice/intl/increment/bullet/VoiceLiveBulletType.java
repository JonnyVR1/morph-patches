package com.p051p1.mobile.putong.live.livingroom.voice.intl.increment.bullet;

import p153l.yec0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public abstract class VoiceLiveBulletType {
    private static final /* synthetic */ VoiceLiveBulletType[] $VALUES = $values();
    public static final VoiceLiveBulletType DEFAULT_BULLET_STYLE;
    public static final VoiceLiveBulletType SPECIAL_BULLET_STYLE;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.increment.bullet.VoiceLiveBulletType$1 */
    public final enum C131861 extends VoiceLiveBulletType {
        private C131861(String str, int i) {
            super(str, i);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.voice.intl.increment.bullet.VoiceLiveBulletType
        public int getLayoutId() {
            return yec0.f199285v8;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.increment.bullet.VoiceLiveBulletType$2 */
    public final enum C131872 extends VoiceLiveBulletType {
        private C131872(String str, int i) {
            super(str, i);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.voice.intl.increment.bullet.VoiceLiveBulletType
        public int getLayoutId() {
            return yec0.f199170ma;
        }
    }

    private static /* synthetic */ VoiceLiveBulletType[] $values() {
        return new VoiceLiveBulletType[]{DEFAULT_BULLET_STYLE, SPECIAL_BULLET_STYLE};
    }

    static {
        DEFAULT_BULLET_STYLE = new C131861("DEFAULT_BULLET_STYLE", 0);
        SPECIAL_BULLET_STYLE = new C131872("SPECIAL_BULLET_STYLE", 1);
    }

    public static VoiceLiveBulletType valueOf(String str) {
        return (VoiceLiveBulletType) Enum.valueOf(VoiceLiveBulletType.class, str);
    }

    public static VoiceLiveBulletType[] values() {
        return (VoiceLiveBulletType[]) $VALUES.clone();
    }

    public abstract int getLayoutId();

    private VoiceLiveBulletType(String str, int i) {
        super(str, i);
    }
}
