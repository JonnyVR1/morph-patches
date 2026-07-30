package p149l;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.impl.R$string;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAdView;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes6.dex */
public final class yru0 {
    /* JADX INFO: renamed from: a */
    public static final void m215858a(Context context, ViewGroup viewGroup, AdView adView) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setTag("layout");
        m215863f(linearLayout, -1, -1);
        linearLayout.setGravity(17);
        linearLayout.addView(adView);
        adView.setTag("ad_view");
        viewGroup.addView(linearLayout);
    }

    /* JADX INFO: renamed from: b */
    public static final void m215859b(Context context, ViewGroup viewGroup, e520 e520Var) {
        NativeAdView nativeAdView = new NativeAdView(context);
        nativeAdView.setTag("ad_view_tag");
        m215863f(nativeAdView, -1, -1);
        viewGroup.addView(nativeAdView);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setTag("layout_tag");
        linearLayout.setOrientation(1);
        m215863f(linearLayout, -1, -1);
        linearLayout.setBackgroundColor(-1);
        nativeAdView.addView(linearLayout);
        Resources resourcesM212276e = vny0.m199079q().m212276e();
        linearLayout.addView(m215860c(context, resourcesM212276e == null ? "Headline" : resourcesM212276e.getString(R$string.f9657b), "headline_header_tag"));
        View viewM215861d = m215861d(context, yfw0.m214595c(e520Var.mo98606d()), "headline_tag");
        nativeAdView.setHeadlineView(viewM215861d);
        linearLayout.addView(viewM215861d);
        linearLayout.addView(m215860c(context, resourcesM212276e == null ? "Body" : resourcesM212276e.getString(R$string.f9656a), "body_header_tag"));
        View viewM215861d2 = m215861d(context, yfw0.m214595c(e520Var.mo98604b()), "body_tag");
        nativeAdView.setBodyView(viewM215861d2);
        linearLayout.addView(viewM215861d2);
        linearLayout.addView(m215860c(context, resourcesM212276e == null ? "Media View" : resourcesM212276e.getString(R$string.f9658c), "media_view_header_tag"));
        MediaView mediaView = new MediaView(context);
        mediaView.setTag("media_view_tag");
        nativeAdView.setMediaView(mediaView);
        linearLayout.addView(mediaView);
        nativeAdView.setNativeAd(e520Var);
    }

    /* JADX INFO: renamed from: c */
    public static TextView m215860c(Context context, String str, String str2) {
        return m215862e(context, str, R.style.TextAppearance.Small, -9210245, 0.0f, str2);
    }

    /* JADX INFO: renamed from: d */
    public static TextView m215861d(Context context, String str, String str2) {
        return m215862e(context, str, R.style.TextAppearance.Medium, RoundedDrawable.DEFAULT_BORDER_COLOR, 12.0f, str2);
    }

    /* JADX INFO: renamed from: e */
    public static TextView m215862e(Context context, String str, int i, int i2, float f, String str2) {
        TextView textView = new TextView(context);
        textView.setTag(str2);
        m215863f(textView, -2, -2);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.bottomMargin = (int) TypedValue.applyDimension(1, f, textView.getResources().getDisplayMetrics());
        textView.setLayoutParams(marginLayoutParams);
        textView.setTextAppearance(context, i);
        textView.setTextColor(i2);
        textView.setText(str);
        return textView;
    }

    /* JADX INFO: renamed from: f */
    public static void m215863f(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(layoutParams);
        layoutParams2.height = i;
        layoutParams2.width = i2;
        view.setLayoutParams(layoutParams2);
    }
}
