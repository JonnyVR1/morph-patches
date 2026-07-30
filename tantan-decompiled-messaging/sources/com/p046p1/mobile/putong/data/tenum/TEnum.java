package com.p046p1.mobile.putong.data.tenum;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public class TEnum implements Comparable<TEnum>, Serializable {

    @NonNull
    protected String name;
    private final int ordinal;

    public TEnum(String str, int i) {
        this.name = str;
        this.ordinal = i;
    }

    @Override // java.lang.Comparable
    public int compareTo(TEnum tEnum) {
        return this.name.compareTo(tEnum.name());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.name.equals(((TEnum) obj).name);
    }

    public int hashCode() {
        return Objects.hash(this.name);
    }

    @Deprecated
    public String name() {
        return toString();
    }

    @Deprecated
    public int ordinal() {
        return this.ordinal;
    }

    @NonNull
    public String toString() {
        return this.name;
    }

    public static <T extends TEnum> boolean equals(T t, String str) {
        if (t == null) {
            return false;
        }
        return TextUtils.equals(t.toString(), str);
    }

    public static <T extends TEnum> boolean equals(T t, T t2) {
        if (t == t2) {
            return true;
        }
        if (t == null || t2 == null) {
            return false;
        }
        return TextUtils.equals(t.toString(), t2.toString());
    }
}
