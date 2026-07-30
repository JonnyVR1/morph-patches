package p149l;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzcjw;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class oeu0 {

    /* JADX INFO: renamed from: a */
    public final fku0 f143581a;

    /* JADX INFO: renamed from: b */
    public final kiu0 f143582b;

    /* JADX INFO: renamed from: c */
    public ViewTreeObserver.OnScrollChangedListener f143583c = null;

    public oeu0(fku0 fku0Var, kiu0 kiu0Var) {
        this.f143581a = fku0Var;
        this.f143582b = kiu0Var;
    }

    /* JADX INFO: renamed from: f */
    public static final int m164022f(Context context, String str, int i) {
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        exr0.m118703b();
        return i2t0.m134096z(context, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final View m164023a(@NonNull final View view, @NonNull final WindowManager windowManager) throws zzcjw {
        q9t0 q9t0VarM121894a = this.f143581a.m121894a(zzq.m12253H(), null, null);
        View view2 = (View) q9t0VarM121894a;
        view2.setVisibility(4);
        view2.setContentDescription("policy_validator");
        q9t0VarM121894a.mo13693j0("/sendMessageToSdk", new vgs0() { // from class: l.ieu0
            @Override // p149l.vgs0
            /* JADX INFO: renamed from: a */
            public final void mo12863a(Object obj, Map map) {
                this.f112926a.m164024b((q9t0) obj, map);
            }
        });
        q9t0VarM121894a.mo13693j0("/hideValidatorOverlay", new vgs0() { // from class: l.jeu0
            @Override // p149l.vgs0
            /* JADX INFO: renamed from: a */
            public final void mo12863a(Object obj, Map map) {
                this.f117607a.m164025c(windowManager, view, (q9t0) obj, map);
            }
        });
        q9t0VarM121894a.mo13693j0("/open", new ghs0(null, null, null, null, null, null));
        this.f143582b.m146145j(new WeakReference(q9t0VarM121894a), "/loadNativeAdPolicyViolations", new vgs0() { // from class: l.keu0
            @Override // p149l.vgs0
            /* JADX INFO: renamed from: a */
            public final void mo12863a(Object obj, Map map) {
                this.f122871a.m164027e(view, windowManager, (q9t0) obj, map);
            }
        });
        this.f143582b.m146145j(new WeakReference(q9t0VarM121894a), "/showValidatorOverlay", new vgs0() { // from class: l.leu0
            @Override // p149l.vgs0
            /* JADX INFO: renamed from: a */
            public final void mo12863a(Object obj, Map map) {
                x2t0.m206864b("Show native ad policy validator overlay.");
                ((q9t0) obj).zzF().setVisibility(0);
            }
        });
        return (View) q9t0VarM121894a;
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m164024b(q9t0 q9t0Var, Map map) {
        this.f143582b.m146142g("sendMessageToNativeJs", map);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m164025c(WindowManager windowManager, View view, q9t0 q9t0Var, Map map) {
        x2t0.m206864b("Hide native ad policy validator overlay.");
        q9t0Var.zzF().setVisibility(8);
        if (q9t0Var.zzF().getWindowToken() != null) {
            windowManager.removeView(q9t0Var.zzF());
        }
        q9t0Var.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.f143583c == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(this.f143583c);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m164026d(Map map, boolean z, int i, String str, String str2) {
        HashMap map2 = new HashMap();
        map2.put("messageType", "validatorHtmlLoaded");
        map2.put("id", (String) map.get("id"));
        this.f143582b.m146142g("sendMessageToNativeJs", map2);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m164027e(final View view, final WindowManager windowManager, q9t0 q9t0Var, final Map map) {
        final q9t0 q9t0Var2;
        q9t0Var.zzN().zzB(new fbt0() { // from class: l.neu0
            @Override // p149l.fbt0
            /* JADX INFO: renamed from: a */
            public final void mo96131a(boolean z, int i, String str, String str2) {
                this.f138654a.m164026d(map, z, i, str, str2);
            }
        });
        if (map == null) {
            return;
        }
        Context context = view.getContext();
        int iM164022f = m164022f(context, (String) map.get("validator_width"), ((Integer) d1s0.m109677c().m144697a(m7s0.f132104V7)).intValue());
        int iM164022f2 = m164022f(context, (String) map.get("validator_height"), ((Integer) d1s0.m109677c().m144697a(m7s0.f132116W7)).intValue());
        int iM164022f3 = m164022f(context, (String) map.get("validator_x"), 0);
        int iM164022f4 = m164022f(context, (String) map.get("validator_y"), 0);
        q9t0Var.mo13656G(rbt0.m178693b(iM164022f, iM164022f2));
        try {
            q9t0Var.mo13661L().getSettings().setUseWideViewPort(((Boolean) d1s0.m109677c().m144697a(m7s0.f132128X7)).booleanValue());
            q9t0Var.mo13661L().getSettings().setLoadWithOverviewMode(((Boolean) d1s0.m109677c().m144697a(m7s0.f132140Y7)).booleanValue());
        } catch (NullPointerException unused) {
        }
        final WindowManager.LayoutParams layoutParamsM211185b = xus0.m211185b();
        layoutParamsM211185b.x = iM164022f3;
        layoutParamsM211185b.y = iM164022f4;
        windowManager.updateViewLayout(q9t0Var.zzF(), layoutParamsM211185b);
        final String str = (String) map.get(Constants.KEY_ORIENTATION);
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            final int i = (("1".equals(str) || "2".equals(str)) ? rect.bottom : rect.top) - iM164022f4;
            q9t0Var2 = q9t0Var;
            this.f143583c = new ViewTreeObserver.OnScrollChangedListener() { // from class: l.meu0
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    Rect rect2 = new Rect();
                    if (view.getGlobalVisibleRect(rect2)) {
                        q9t0 q9t0Var3 = q9t0Var2;
                        if (q9t0Var3.zzF().getWindowToken() == null) {
                            return;
                        }
                        int i2 = i;
                        WindowManager.LayoutParams layoutParams = layoutParamsM211185b;
                        String str2 = str;
                        if ("1".equals(str2) || "2".equals(str2)) {
                            layoutParams.y = rect2.bottom - i2;
                        } else {
                            layoutParams.y = rect2.top - i2;
                        }
                        windowManager.updateViewLayout(q9t0Var3.zzF(), layoutParams);
                    }
                }
            };
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnScrollChangedListener(this.f143583c);
            }
        } else {
            q9t0Var2 = q9t0Var;
        }
        String str2 = (String) map.get("overlay_url");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        q9t0Var2.loadUrl(str2);
    }
}
