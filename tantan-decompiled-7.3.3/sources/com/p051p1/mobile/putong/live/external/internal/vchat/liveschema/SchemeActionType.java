package com.p051p1.mobile.putong.live.external.internal.vchat.liveschema;

import p153l.gpj;
import p153l.p2e0;
import p153l.twk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public abstract class SchemeActionType {
    private static final /* synthetic */ SchemeActionType[] $VALUES = $values();
    public static final SchemeActionType ACTION_SHOW_GIFT_DIALOG;
    public static final SchemeActionType ACTION_SHOW_H5;
    private String action;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.liveschema.SchemeActionType$1 */
    public final enum C126741 extends SchemeActionType {
        private C126741(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.external.internal.vchat.liveschema.SchemeActionType
        public p2e0 getSchemaAction() {
            return new twk();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.liveschema.SchemeActionType$2 */
    public final enum C126752 extends SchemeActionType {
        private C126752(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p051p1.mobile.putong.live.external.internal.vchat.liveschema.SchemeActionType
        public p2e0 getSchemaAction() {
            return new gpj();
        }
    }

    private static /* synthetic */ SchemeActionType[] $values() {
        return new SchemeActionType[]{ACTION_SHOW_H5, ACTION_SHOW_GIFT_DIALOG};
    }

    static {
        ACTION_SHOW_H5 = new C126741("ACTION_SHOW_H5", 0, "showH5");
        ACTION_SHOW_GIFT_DIALOG = new C126752("ACTION_SHOW_GIFT_DIALOG", 1, "showGiftDialog");
    }

    private SchemeActionType(String str, int i, String str2) {
        super(str, i);
        this.action = str2;
    }

    public static SchemeActionType valueOf(String str) {
        return (SchemeActionType) Enum.valueOf(SchemeActionType.class, str);
    }

    public static SchemeActionType[] values() {
        return (SchemeActionType[]) $VALUES.clone();
    }

    public String getAction() {
        return this.action;
    }

    public abstract p2e0 getSchemaAction();
}
