package com.p046p1.mobile.putong.live.livingroom.increment.gift.anim;

import p149l.csl;
import p149l.qad0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public abstract class GiftItemAnimType {
    private static final /* synthetic */ GiftItemAnimType[] $VALUES = $values();
    public static final GiftItemAnimType roomOneTime;
    private String type;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.anim.GiftItemAnimType$1 */
    public final enum C127931 extends GiftItemAnimType {
        private C127931(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.increment.gift.anim.GiftItemAnimType
        public csl getController() {
            return new qad0();
        }
    }

    private static /* synthetic */ GiftItemAnimType[] $values() {
        return new GiftItemAnimType[]{roomOneTime};
    }

    static {
        String str = "roomOneTime";
        roomOneTime = new C127931(str, 0, str);
    }

    private GiftItemAnimType(String str, int i, String str2) {
        super(str, i);
        this.type = str2;
    }

    public static GiftItemAnimType valueOf(String str) {
        return (GiftItemAnimType) Enum.valueOf(GiftItemAnimType.class, str);
    }

    public static GiftItemAnimType[] values() {
        return (GiftItemAnimType[]) $VALUES.clone();
    }

    public abstract csl getController();
}
