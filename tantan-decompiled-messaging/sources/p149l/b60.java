package p149l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class b60<I, O> {

    /* JADX INFO: renamed from: l.b60$a */
    public static final class C15813a<T> {

        /* JADX INFO: renamed from: a */
        @SuppressLint({"UnknownNullness"})
        public final T f73725a;

        public C15813a(@SuppressLint({"UnknownNullness"}) T t) {
            this.f73725a = t;
        }

        @SuppressLint({"UnknownNullness"})
        /* JADX INFO: renamed from: a */
        public T m100347a() {
            return this.f73725a;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public abstract Intent mo2617a(@NonNull Context context, @SuppressLint({"UnknownNullness"}) I i);

    @Nullable
    /* JADX INFO: renamed from: b */
    public C15813a<O> mo100346b(@NonNull Context context, @SuppressLint({"UnknownNullness"}) I i) {
        return null;
    }

    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: c */
    public abstract O mo2618c(int i, @Nullable Intent intent);
}
