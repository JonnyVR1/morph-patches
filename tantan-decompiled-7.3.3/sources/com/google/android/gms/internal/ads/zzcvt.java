package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import org.json.JSONObject;
import p153l.bxy0;
import p153l.k6s0;
import p153l.ldt0;
import p153l.obt0;
import p153l.q6w0;
import p153l.r6w0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes6.dex */
public final class zzcvt extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a */
    public final Context f10261a;

    /* JADX INFO: renamed from: b */
    public View f10262b;

    private zzcvt(Context context) {
        super(context);
        this.f10261a = context;
    }

    /* JADX INFO: renamed from: a */
    public static zzcvt m13799a(Context context, View view, q6w0 q6w0Var) {
        Resources resources;
        DisplayMetrics displayMetrics;
        zzcvt zzcvtVar = new zzcvt(context);
        if (!q6w0Var.f155915v.isEmpty() && (resources = zzcvtVar.f10261a.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            r6w0 r6w0Var = (r6w0) q6w0Var.f155915v.get(0);
            float f = r6w0Var.f161507a;
            float f2 = displayMetrics.density;
            zzcvtVar.setLayoutParams(new FrameLayout.LayoutParams((int) (f * f2), (int) (r6w0Var.f161508b * f2)));
        }
        zzcvtVar.f10262b = view;
        zzcvtVar.addView(view);
        bxy0.m106942z();
        ldt0.m153790b(zzcvtVar, zzcvtVar);
        bxy0.m106942z();
        ldt0.m153789a(zzcvtVar, zzcvtVar);
        JSONObject jSONObject = q6w0Var.f155890i0;
        RelativeLayout relativeLayout = new RelativeLayout(zzcvtVar.f10261a);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("header");
        if (jSONObjectOptJSONObject != null) {
            zzcvtVar.m13801c(jSONObjectOptJSONObject, relativeLayout, 10);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("footer");
        if (jSONObjectOptJSONObject2 != null) {
            zzcvtVar.m13801c(jSONObjectOptJSONObject2, relativeLayout, 12);
        }
        zzcvtVar.addView(relativeLayout);
        return zzcvtVar;
    }

    /* JADX INFO: renamed from: b */
    public final int m13800b(double d) {
        k6s0.m148569b();
        return obt0.m167049z(this.f10261a, (int) d);
    }

    /* JADX INFO: renamed from: c */
    public final void m13801c(JSONObject jSONObject, RelativeLayout relativeLayout, int i) {
        TextView textView = new TextView(this.f10261a);
        textView.setTextColor(-1);
        textView.setBackgroundColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int iM13800b = m13800b(jSONObject.optDouble("padding", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        textView.setPadding(0, iM13800b, 0, iM13800b);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, m13800b(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.f10262b.setY(-iArr[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.f10262b.setY(-iArr[1]);
    }
}
