package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.hellogroup.p036mk.business.p038ui.MKWebViewWrapper;

/* JADX INFO: loaded from: classes7.dex */
public final class j50 {

    /* JADX INFO: renamed from: a */
    @NonNull
    private final ConstraintLayout f118360a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ConstraintLayout f118361b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final MKWebViewWrapper f118362c;

    private j50(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull MKWebViewWrapper mKWebViewWrapper) {
        this.f118360a = constraintLayout;
        this.f118361b = constraintLayout2;
        this.f118362c = mKWebViewWrapper;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static j50 m143492a(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = pcc0.f151558l;
        MKWebViewWrapper mKWebViewWrapper = (MKWebViewWrapper) view.findViewById(i);
        if (mKWebViewWrapper != null) {
            return new j50((ConstraintLayout) view, constraintLayout, mKWebViewWrapper);
        }
        mnd0.m159157a("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static j50 m143493c(@NonNull LayoutInflater layoutInflater) {
        return m143494d(layoutInflater, null, false);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static j50 m143494d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(bec0.f76363c, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return m143492a(viewInflate);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public ConstraintLayout m143495b() {
        return this.f118360a;
    }
}
