package p153l;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class inl0 {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static ViewGroup m141152a(@Nullable View view) {
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
    public static cml0 m141153b(@NonNull View view) {
        return m141154c(m141152a(view));
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static cml0 m141154c(@Nullable View view) {
        if (view == null) {
            return null;
        }
        return new aml0(view);
    }
}
