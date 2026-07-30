package com.p046p1.mobile.putong.live.external.internal.vchat.liveschema;

import p149l.duk;
import p149l.lud0;
import p149l.qmj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public abstract class SchemeActionType {
    private static final /* synthetic */ SchemeActionType[] $VALUES = $values();
    public static final SchemeActionType ACTION_SHOW_GIFT_DIALOG;
    public static final SchemeActionType ACTION_SHOW_H5;
    private String action;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.liveschema.SchemeActionType$1 */
    public final enum C125111 extends SchemeActionType {
        private C125111(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.external.internal.vchat.liveschema.SchemeActionType
        public lud0 getSchemaAction() {
            return new duk();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.liveschema.SchemeActionType$2 */
    public final enum C125122 extends SchemeActionType {
        private C125122(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.p046p1.mobile.putong.live.external.internal.vchat.liveschema.SchemeActionType
        public lud0 getSchemaAction() {
            return new qmj();
        }
    }

    private static /* synthetic */ SchemeActionType[] $values() {
        return new SchemeActionType[]{ACTION_SHOW_H5, ACTION_SHOW_GIFT_DIALOG};
    }

    static {
        ACTION_SHOW_H5 = new C125111("ACTION_SHOW_H5", 0, "showH5");
        ACTION_SHOW_GIFT_DIALOG = new C125122("ACTION_SHOW_GIFT_DIALOG", 1, "showGiftDialog");
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

    public abstract lud0 getSchemaAction();
}
