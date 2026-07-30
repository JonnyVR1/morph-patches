package com.google.android.datatransport;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.mnd0;

/* JADX INFO: loaded from: classes6.dex */
public final class Encoding {
    private final String name;

    private Encoding(@NonNull String str) {
        if (str != null) {
            this.name = str;
        } else {
            mnd0.m159157a("name is null");
            throw null;
        }
    }

    /* JADX INFO: renamed from: of */
    public static Encoding m9346of(@NonNull String str) {
        return new Encoding(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Encoding) {
            return this.name.equals(((Encoding) obj).name);
        }
        return false;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode() ^ 1000003;
    }

    @NonNull
    public String toString() {
        return "Encoding{name=\"" + this.name + "\"}";
    }
}
