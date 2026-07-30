package com.p046p1.mobile.putong.live.livingroom.voice.intl.increment.bullet;

import p149l.t6c0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public abstract class VoiceLiveBulletType {
    private static final /* synthetic */ VoiceLiveBulletType[] $VALUES = $values();
    public static final VoiceLiveBulletType DEFAULT_BULLET_STYLE;
    public static final VoiceLiveBulletType SPECIAL_BULLET_STYLE;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.increment.bullet.VoiceLiveBulletType$1 */
    public final enum C130231 extends VoiceLiveBulletType {
        private C130231(String str, int i) {
            super(str, i);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.voice.intl.increment.bullet.VoiceLiveBulletType
        public int getLayoutId() {
            return t6c0.f168553v8;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.increment.bullet.VoiceLiveBulletType$2 */
    public final enum C130242 extends VoiceLiveBulletType {
        private C130242(String str, int i) {
            super(str, i);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.voice.intl.increment.bullet.VoiceLiveBulletType
        public int getLayoutId() {
            return t6c0.f168438ma;
        }
    }

    private static /* synthetic */ VoiceLiveBulletType[] $values() {
        return new VoiceLiveBulletType[]{DEFAULT_BULLET_STYLE, SPECIAL_BULLET_STYLE};
    }

    static {
        DEFAULT_BULLET_STYLE = new C130231("DEFAULT_BULLET_STYLE", 0);
        SPECIAL_BULLET_STYLE = new C130242("SPECIAL_BULLET_STYLE", 1);
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
