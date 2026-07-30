package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class x40 {

    /* JADX INFO: renamed from: a */
    @NonNull
    private final ConstraintLayout f192319a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final TextView f192320b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f192321c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f192322d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ConstraintLayout f192323e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final WebView f192324f;

    private x40(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ConstraintLayout constraintLayout2, @NonNull WebView webView) {
        this.f192319a = constraintLayout;
        this.f192320b = textView;
        this.f192321c = imageView;
        this.f192322d = imageView2;
        this.f192323e = constraintLayout2;
        this.f192324f = webView;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static x40 m209293a(@NonNull View view) {
        int i = pcc0.f151561o;
        TextView textView = (TextView) view.findViewById(i);
        if (textView != null) {
            i = pcc0.f151562p;
            ImageView imageView = (ImageView) view.findViewById(i);
            if (imageView != null) {
                i = pcc0.f151563q;
                ImageView imageView2 = (ImageView) view.findViewById(i);
                if (imageView2 != null) {
                    i = pcc0.f151564r;
                    ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(i);
                    if (constraintLayout != null) {
                        i = pcc0.f151570x;
                        WebView webView = (WebView) view.findViewById(i);
                        if (webView != null) {
                            return new x40((ConstraintLayout) view, textView, imageView, imageView2, constraintLayout, webView);
                        }
                    }
                }
            }
        }
        mnd0.m159157a("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static x40 m209294c(@NonNull LayoutInflater layoutInflater) {
        return m209295d(layoutInflater, null, false);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static x40 m209295d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(bec0.f76362b, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return m209293a(viewInflate);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public ConstraintLayout m209296b() {
        return this.f192319a;
    }
}
