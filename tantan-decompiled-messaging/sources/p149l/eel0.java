package p149l;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class eel0 {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static ViewGroup m115983a(@Nullable View view) {
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
    public static ycl0 m115984b(@NonNull View view) {
        return m115985c(m115983a(view));
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static ycl0 m115985c(@Nullable View view) {
        if (view == null) {
            return null;
        }
        return new wcl0(view);
    }
}
