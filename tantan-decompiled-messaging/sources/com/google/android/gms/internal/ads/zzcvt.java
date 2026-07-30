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
import p149l.exr0;
import p149l.f4t0;
import p149l.i2t0;
import p149l.kxv0;
import p149l.lxv0;
import p149l.vny0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes6.dex */
public final class zzcvt extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a */
    public final Context f10224a;

    /* JADX INFO: renamed from: b */
    public View f10225b;

    private zzcvt(Context context) {
        super(context);
        this.f10224a = context;
    }

    /* JADX INFO: renamed from: a */
    public static zzcvt m13745a(Context context, View view, kxv0 kxv0Var) {
        Resources resources;
        DisplayMetrics displayMetrics;
        zzcvt zzcvtVar = new zzcvt(context);
        if (!kxv0Var.f125225v.isEmpty() && (resources = zzcvtVar.f10224a.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            lxv0 lxv0Var = (lxv0) kxv0Var.f125225v.get(0);
            float f = lxv0Var.f130445a;
            float f2 = displayMetrics.density;
            zzcvtVar.setLayoutParams(new FrameLayout.LayoutParams((int) (f * f2), (int) (lxv0Var.f130446b * f2)));
        }
        zzcvtVar.f10225b = view;
        zzcvtVar.addView(view);
        vny0.m199088z();
        f4t0.m119425b(zzcvtVar, zzcvtVar);
        vny0.m199088z();
        f4t0.m119424a(zzcvtVar, zzcvtVar);
        JSONObject jSONObject = kxv0Var.f125200i0;
        RelativeLayout relativeLayout = new RelativeLayout(zzcvtVar.f10224a);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("header");
        if (jSONObjectOptJSONObject != null) {
            zzcvtVar.m13747c(jSONObjectOptJSONObject, relativeLayout, 10);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("footer");
        if (jSONObjectOptJSONObject2 != null) {
            zzcvtVar.m13747c(jSONObjectOptJSONObject2, relativeLayout, 12);
        }
        zzcvtVar.addView(relativeLayout);
        return zzcvtVar;
    }

    /* JADX INFO: renamed from: b */
    public final int m13746b(double d) {
        exr0.m118703b();
        return i2t0.m134096z(this.f10224a, (int) d);
    }

    /* JADX INFO: renamed from: c */
    public final void m13747c(JSONObject jSONObject, RelativeLayout relativeLayout, int i) {
        TextView textView = new TextView(this.f10224a);
        textView.setTextColor(-1);
        textView.setBackgroundColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int iM13746b = m13746b(jSONObject.optDouble("padding", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        textView.setPadding(0, iM13746b, 0, iM13746b);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, m13746b(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.f10225b.setY(-iArr[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.f10225b.setY(-iArr[1]);
    }
}
