package com.vivo.push.model;

/* JADX INFO: renamed from: com.vivo.push.model.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C14618a {

    /* JADX INFO: renamed from: a */
    private String f61058a;

    /* JADX INFO: renamed from: b */
    private String f61059b;

    public C14618a(String str, String str2) {
        this.f61058a = str;
        this.f61059b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m84917a() {
        return this.f61058a;
    }

    /* JADX INFO: renamed from: b */
    public final String m84918b() {
        return this.f61059b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C14618a.class != obj.getClass()) {
            return false;
        }
        String str = this.f61058a;
        String str2 = ((C14618a) obj).f61058a;
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
        String str = this.f61058a;
        return (str == null ? 0 : str.hashCode()) + 31;
    }

    public final String toString() {
        return "ConfigItem{mKey='" + this.f61058a + "', mValue='" + this.f61059b + "'}";
    }
}
