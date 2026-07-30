package p003l;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class eel0 {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static ViewGroup m3820a(@Nullable View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static ycl0 m3821b(@NonNull View view) {
        return m3822c(m3820a(view));
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static ycl0 m3822c(@Nullable View view) {
        if (view == null) {
            return null;
        }
        return new wcl0(view);
    }
}
