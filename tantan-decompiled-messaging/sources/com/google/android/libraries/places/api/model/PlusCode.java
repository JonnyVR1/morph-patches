package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* JADX INFO: loaded from: classes7.dex */
public abstract class PlusCode implements Parcelable {

    public static abstract class Builder {
        @RecentlyNonNull
        public abstract PlusCode build();

        @RecentlyNullable
        public abstract String getCompoundCode();

        @RecentlyNullable
        public abstract String getGlobalCode();

        @RecentlyNonNull
        public abstract Builder setCompoundCode(@Nullable String str);

        @RecentlyNonNull
        public abstract Builder setGlobalCode(@Nullable String str);
    }

    @RecentlyNonNull
    public static Builder builder() {
        return new zzz();
    }

    @RecentlyNullable
    public abstract String getCompoundCode();

    @RecentlyNullable
    public abstract String getGlobalCode();
}
