package com.p000p1.mobile.putong.live.livingroom.increment.bullet;

import p002l.t6c0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class BulletType {
    private static final /* synthetic */ BulletType[] $VALUES = $values();
    public static final BulletType CALL_BULLET;
    public static final BulletType DEFAULT_BULLET_STYLE;
    public static final BulletType PK_BULLET;
    public static final BulletType SPECIAL_BULLET_STYLE;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.bullet.BulletType$1 */
    public final enum C03721 extends BulletType {
        private C03721(String str, int i) {
            super(str, i);
        }

        @Override // com.p000p1.mobile.putong.live.livingroom.increment.bullet.BulletType
        public int getLayoutId() {
            return t6c0.f20002s0;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.bullet.BulletType$2 */
    public final enum C03732 extends BulletType {
        private C03732(String str, int i) {
            super(str, i);
        }

        @Override // com.p000p1.mobile.putong.live.livingroom.increment.bullet.BulletType
        public int getLayoutId() {
            return t6c0.f19653Q5;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.bullet.BulletType$3 */
    public final enum C03743 extends BulletType {
        private C03743(String str, int i) {
            super(str, i);
        }

        @Override // com.p000p1.mobile.putong.live.livingroom.increment.bullet.BulletType
        public int getLayoutId() {
            return t6c0.f20002s0;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.bullet.BulletType$4 */
    public final enum C03754 extends BulletType {
        private C03754(String str, int i) {
            super(str, i);
        }

        @Override // com.p000p1.mobile.putong.live.livingroom.increment.bullet.BulletType
        public int getLayoutId() {
            return t6c0.f20002s0;
        }
    }

    private static /* synthetic */ BulletType[] $values() {
        return new BulletType[]{DEFAULT_BULLET_STYLE, SPECIAL_BULLET_STYLE, PK_BULLET, CALL_BULLET};
    }

    static {
        DEFAULT_BULLET_STYLE = new C03721("DEFAULT_BULLET_STYLE", 0);
        SPECIAL_BULLET_STYLE = new C03732("SPECIAL_BULLET_STYLE", 1);
        PK_BULLET = new C03743("PK_BULLET", 2);
        CALL_BULLET = new C03754("CALL_BULLET", 3);
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
