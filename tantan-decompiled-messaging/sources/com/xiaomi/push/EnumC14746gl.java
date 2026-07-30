package com.xiaomi.push;

/* JADX INFO: renamed from: com.xiaomi.push.gl */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14746gl {
    MISC_CONFIG(1),
    PLUGIN_CONFIG(2);


    /* JADX INFO: renamed from: a */
    private final int f62025a;

    EnumC14746gl(int i) {
        this.f62025a = i;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC14746gl m85647a(int i) {
        if (i == 1) {
            return MISC_CONFIG;
        }
        if (i != 2) {
            return null;
        }
        return PLUGIN_CONFIG;
    }

    /* JADX INFO: renamed from: a */
    public int m85648a() {
        return this.f62025a;
    }
}
