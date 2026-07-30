package com.vivo.push.model;

/* JADX INFO: renamed from: com.vivo.push.model.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C14766a {

    /* JADX INFO: renamed from: a */
    private String f61905a;

    /* JADX INFO: renamed from: b */
    private String f61906b;

    public C14766a(String str, String str2) {
        this.f61905a = str;
        this.f61906b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m86088a() {
        return this.f61905a;
    }

    /* JADX INFO: renamed from: b */
    public final String m86089b() {
        return this.f61906b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C14766a.class != obj.getClass()) {
            return false;
        }
        String str = this.f61905a;
        String str2 = ((C14766a) obj).f61905a;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f61905a;
        return (str == null ? 0 : str.hashCode()) + 31;
    }

    public final String toString() {
        return "ConfigItem{mKey='" + this.f61905a + "', mValue='" + this.f61906b + "'}";
    }
}
