package p153l;

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
public final class e1v0 {
    /* JADX INFO: renamed from: a */
    public static final void m119025a(Context context, ViewGroup viewGroup, AdView adView) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setTag("layout");
        m119030f(linearLayout, -1, -1);
        linearLayout.setGravity(17);
        linearLayout.addView(adView);
        adView.setTag("ad_view");
        viewGroup.addView(linearLayout);
    }

    /* JADX INFO: renamed from: b */
    public static final void m119026b(Context context, ViewGroup viewGroup, md20 md20Var) {
        NativeAdView nativeAdView = new NativeAdView(context);
        nativeAdView.setTag("ad_view_tag");
        m119030f(nativeAdView, -1, -1);
        viewGroup.addView(nativeAdView);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setTag("layout_tag");
        linearLayout.setOrientation(1);
        m119030f(linearLayout, -1, -1);
        linearLayout.setBackgroundColor(-1);
        nativeAdView.addView(linearLayout);
        Resources resourcesM120261e = bxy0.m106933q().m120261e();
        linearLayout.addView(m119027c(context, resourcesM120261e == null ? "Headline" : resourcesM120261e.getString(R$string.f9694b), "headline_header_tag"));
        View viewM119028d = m119028d(context, epw0.m121874c(md20Var.mo128558d()), "headline_tag");
        nativeAdView.setHeadlineView(viewM119028d);
        linearLayout.addView(viewM119028d);
        linearLayout.addView(m119027c(context, resourcesM120261e == null ? "Body" : resourcesM120261e.getString(R$string.f9693a), "body_header_tag"));
        View viewM119028d2 = m119028d(context, epw0.m121874c(md20Var.mo128556b()), "body_tag");
        nativeAdView.setBodyView(viewM119028d2);
        linearLayout.addView(viewM119028d2);
        linearLayout.addView(m119027c(context, resourcesM120261e == null ? "Media View" : resourcesM120261e.getString(R$string.f9695c), "media_view_header_tag"));
        MediaView mediaView = new MediaView(context);
        mediaView.setTag("media_view_tag");
        nativeAdView.setMediaView(mediaView);
        linearLayout.addView(mediaView);
        nativeAdView.setNativeAd(md20Var);
    }

    /* JADX INFO: renamed from: c */
    public static TextView m119027c(Context context, String str, String str2) {
        return m119029e(context, str, R.style.TextAppearance.Small, -9210245, 0.0f, str2);
    }

    /* JADX INFO: renamed from: d */
    public static TextView m119028d(Context context, String str, String str2) {
        return m119029e(context, str, R.style.TextAppearance.Medium, RoundedDrawable.DEFAULT_BORDER_COLOR, 12.0f, str2);
    }

    /* JADX INFO: renamed from: e */
    public static TextView m119029e(Context context, String str, int i, int i2, float f, String str2) {
        TextView textView = new TextView(context);
        textView.setTag(str2);
        m119030f(textView, -2, -2);
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
    public static void m119030f(View view, int i, int i2) {
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
