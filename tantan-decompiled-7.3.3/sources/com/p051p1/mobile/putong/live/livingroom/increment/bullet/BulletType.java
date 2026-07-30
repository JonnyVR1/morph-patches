package com.p051p1.mobile.putong.live.livingroom.increment.bullet;

import p153l.yec0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public abstract class BulletType {
    private static final /* synthetic */ BulletType[] $VALUES = $values();
    public static final BulletType CALL_BULLET;
    public static final BulletType DEFAULT_BULLET_STYLE;
    public static final BulletType PK_BULLET;
    public static final BulletType SPECIAL_BULLET_STYLE;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.bullet.BulletType$1 */
    public final enum C129461 extends BulletType {
        private C129461(String str, int i) {
            super(str, i);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.increment.bullet.BulletType
        public int getLayoutId() {
            return yec0.f199238s0;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.bullet.BulletType$2 */
    public final enum C129472 extends BulletType {
        private C129472(String str, int i) {
            super(str, i);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.increment.bullet.BulletType
        public int getLayoutId() {
            return yec0.f198889Q5;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.bullet.BulletType$3 */
    public final enum C129483 extends BulletType {
        private C129483(String str, int i) {
            super(str, i);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.increment.bullet.BulletType
        public int getLayoutId() {
            return yec0.f199238s0;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.bullet.BulletType$4 */
    public final enum C129494 extends BulletType {
        private C129494(String str, int i) {
            super(str, i);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.increment.bullet.BulletType
        public int getLayoutId() {
            return yec0.f199238s0;
        }
    }

    private static /* synthetic */ BulletType[] $values() {
        return new BulletType[]{DEFAULT_BULLET_STYLE, SPECIAL_BULLET_STYLE, PK_BULLET, CALL_BULLET};
    }

    static {
        DEFAULT_BULLET_STYLE = new C129461("DEFAULT_BULLET_STYLE", 0);
        SPECIAL_BULLET_STYLE = new C129472("SPECIAL_BULLET_STYLE", 1);
        PK_BULLET = new C129483("PK_BULLET", 2);
        CALL_BULLET = new C129494("CALL_BULLET", 3);
    }

    public static BulletType valueOf(String str) {
        return (BulletType) Enum.valueOf(BulletType.class, str);
    }

    public static BulletType[] values() {
        return (BulletType[]) $VALUES.clone();
    }

    public abstract int getLayoutId();

    private BulletType(String str, int i) {
        super(str, i);
    }
}
