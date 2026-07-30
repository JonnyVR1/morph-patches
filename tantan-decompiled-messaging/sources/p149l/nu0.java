package p149l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedAPI"})
public final class nu0 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<TypedValue> f140556a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b */
    public static final WeakHashMap<Context, SparseArray<Object>> f140557b = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: c */
    public static final Object f140558c = new Object();

    /* JADX INFO: renamed from: a */
    public static ColorStateList m161423a(@NonNull Context context, @ColorRes int i) {
        return context.getColorStateList(i);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static Drawable m161424b(@NonNull Context context, @DrawableRes int i) {
        return swc0.m186132g().m186142i(context, i);
    }
}
