package p153l;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes.dex */
public abstract class o5j {
    @NonNull
    @Deprecated
    /* JADX INFO: renamed from: b */
    public Fragment m166152b(@NonNull Context context, @NonNull String str, @Nullable Bundle bundle) {
        return Fragment.instantiate(context, str, bundle);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public abstract View mo2459c(@IdRes int i);

    /* JADX INFO: renamed from: d */
    public abstract boolean mo2460d();
}
