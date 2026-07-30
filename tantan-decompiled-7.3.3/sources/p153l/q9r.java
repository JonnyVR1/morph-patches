package p153l;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.hellogroup.p036mk.business.widget.MKSwipeRefreshLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class q9r {

    /* JADX INFO: renamed from: a */
    @NonNull
    private final View f156256a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final MKSwipeRefreshLayout f156257b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FrameLayout f156258c;

    private q9r(@NonNull View view, @NonNull MKSwipeRefreshLayout mKSwipeRefreshLayout, @NonNull FrameLayout frameLayout) {
        this.f156256a = view;
        this.f156257b = mKSwipeRefreshLayout;
        this.f156258c = frameLayout;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static q9r m175844a(@NonNull View view) {
        int i = pcc0.f151560n;
        MKSwipeRefreshLayout mKSwipeRefreshLayout = (MKSwipeRefreshLayout) view.findViewById(i);
        if (mKSwipeRefreshLayout != null) {
            i = pcc0.f151564r;
            FrameLayout frameLayout = (FrameLayout) view.findViewById(i);
            if (frameLayout != null) {
                return new q9r(view, mKSwipeRefreshLayout, frameLayout);
            }
        }
        mnd0.m159157a("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
