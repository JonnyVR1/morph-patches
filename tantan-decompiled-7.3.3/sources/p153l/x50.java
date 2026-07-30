package p153l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class x50<I, O> {

    /* JADX INFO: renamed from: l.x50$a */
    public static final class C21254a<T> {

        /* JADX INFO: renamed from: a */
        @SuppressLint({"UnknownNullness"})
        public final T f192450a;

        public C21254a(@SuppressLint({"UnknownNullness"}) T t) {
            this.f192450a = t;
        }

        @SuppressLint({"UnknownNullness"})
        /* JADX INFO: renamed from: a */
        public T m209355a() {
            return this.f192450a;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public abstract Intent mo2618a(@NonNull Context context, @SuppressLint({"UnknownNullness"}) I i);

    @Nullable
    /* JADX INFO: renamed from: b */
    public C21254a<O> mo209354b(@NonNull Context context, @SuppressLint({"UnknownNullness"}) I i) {
        return null;
    }

    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: c */
    public abstract O mo2619c(int i, @Nullable Intent intent);
}
