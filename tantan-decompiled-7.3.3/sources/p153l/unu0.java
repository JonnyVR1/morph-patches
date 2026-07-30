package p153l;

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
public final class unu0 {

    /* JADX INFO: renamed from: a */
    public final ltu0 f179984a;

    /* JADX INFO: renamed from: b */
    public final qru0 f179985b;

    /* JADX INFO: renamed from: c */
    public ViewTreeObserver.OnScrollChangedListener f179986c = null;

    public unu0(ltu0 ltu0Var, qru0 qru0Var) {
        this.f179984a = ltu0Var;
        this.f179985b = qru0Var;
    }

    /* JADX INFO: renamed from: f */
    public static final int m196950f(Context context, String str, int i) {
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        k6s0.m148569b();
        return obt0.m167049z(context, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final View m196951a(@NonNull final View view, @NonNull final WindowManager windowManager) throws zzcjw {
        wit0 wit0VarM155812a = this.f179984a.m155812a(zzq.m12307H(), null, null);
        View view2 = (View) wit0VarM155812a;
        view2.setVisibility(4);
        view2.setContentDescription("policy_validator");
        wit0VarM155812a.mo13747j0("/sendMessageToSdk", new bqs0() { // from class: l.onu0
            @Override // p153l.bqs0
            /* JADX INFO: renamed from: a */
            public final void mo12917a(Object obj, Map map) {
                this.f148225a.m196952b((wit0) obj, map);
            }
        });
        wit0VarM155812a.mo13747j0("/hideValidatorOverlay", new bqs0() { // from class: l.pnu0
            @Override // p153l.bqs0
            /* JADX INFO: renamed from: a */
            public final void mo12917a(Object obj, Map map) {
                this.f153332a.m196953c(windowManager, view, (wit0) obj, map);
            }
        });
        wit0VarM155812a.mo13747j0("/open", new mqs0(null, null, null, null, null, null));
        this.f179985b.m177708j(new WeakReference(wit0VarM155812a), "/loadNativeAdPolicyViolations", new bqs0() { // from class: l.qnu0
            @Override // p153l.bqs0
            /* JADX INFO: renamed from: a */
            public final void mo12917a(Object obj, Map map) {
                this.f158644a.m196955e(view, windowManager, (wit0) obj, map);
            }
        });
        this.f179985b.m177708j(new WeakReference(wit0VarM155812a), "/showValidatorOverlay", new bqs0() { // from class: l.rnu0
            @Override // p153l.bqs0
            /* JADX INFO: renamed from: a */
            public final void mo12917a(Object obj, Map map) {
                dct0.m115293b("Show native ad policy validator overlay.");
                ((wit0) obj).zzF().setVisibility(0);
            }
        });
        return (View) wit0VarM155812a;
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m196952b(wit0 wit0Var, Map map) {
        this.f179985b.m177705g("sendMessageToNativeJs", map);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m196953c(WindowManager windowManager, View view, wit0 wit0Var, Map map) {
        dct0.m115293b("Hide native ad policy validator overlay.");
        wit0Var.zzF().setVisibility(8);
        if (wit0Var.zzF().getWindowToken() != null) {
            windowManager.removeView(wit0Var.zzF());
        }
        wit0Var.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.f179986c == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(this.f179986c);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m196954d(Map map, boolean z, int i, String str, String str2) {
        HashMap map2 = new HashMap();
        map2.put("messageType", "validatorHtmlLoaded");
        map2.put("id", (String) map.get("id"));
        this.f179985b.m177705g("sendMessageToNativeJs", map2);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m196955e(final View view, final WindowManager windowManager, wit0 wit0Var, final Map map) {
        final wit0 wit0Var2;
        wit0Var.zzN().zzB(new lkt0() { // from class: l.tnu0
            @Override // p153l.lkt0
            /* JADX INFO: renamed from: a */
            public final void mo99557a(boolean z, int i, String str, String str2) {
                this.f175319a.m196954d(map, z, i, str, str2);
            }
        });
        if (map == null) {
            return;
        }
        Context context = view.getContext();
        int iM196950f = m196950f(context, (String) map.get("validator_width"), ((Integer) jas0.m144075c().m176505a(sgs0.f168175V7)).intValue());
        int iM196950f2 = m196950f(context, (String) map.get("validator_height"), ((Integer) jas0.m144075c().m176505a(sgs0.f168187W7)).intValue());
        int iM196950f3 = m196950f(context, (String) map.get("validator_x"), 0);
        int iM196950f4 = m196950f(context, (String) map.get("validator_y"), 0);
        wit0Var.mo13710G(xkt0.m211416b(iM196950f, iM196950f2));
        try {
            wit0Var.mo13715L().getSettings().setUseWideViewPort(((Boolean) jas0.m144075c().m176505a(sgs0.f168199X7)).booleanValue());
            wit0Var.mo13715L().getSettings().setLoadWithOverviewMode(((Boolean) jas0.m144075c().m176505a(sgs0.f168211Y7)).booleanValue());
        } catch (NullPointerException unused) {
        }
        final WindowManager.LayoutParams layoutParamsM114236b = d4t0.m114236b();
        layoutParamsM114236b.x = iM196950f3;
        layoutParamsM114236b.y = iM196950f4;
        windowManager.updateViewLayout(wit0Var.zzF(), layoutParamsM114236b);
        final String str = (String) map.get(Constants.KEY_ORIENTATION);
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            final int i = (("1".equals(str) || "2".equals(str)) ? rect.bottom : rect.top) - iM196950f4;
            wit0Var2 = wit0Var;
            this.f179986c = new ViewTreeObserver.OnScrollChangedListener() { // from class: l.snu0
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    Rect rect2 = new Rect();
                    if (view.getGlobalVisibleRect(rect2)) {
                        wit0 wit0Var3 = wit0Var2;
                        if (wit0Var3.zzF().getWindowToken() == null) {
                            return;
                        }
                        int i2 = i;
                        WindowManager.LayoutParams layoutParams = layoutParamsM114236b;
                        String str2 = str;
                        if ("1".equals(str2) || "2".equals(str2)) {
                            layoutParams.y = rect2.bottom - i2;
                        } else {
                            layoutParams.y = rect2.top - i2;
                        }
                        windowManager.updateViewLayout(wit0Var3.zzF(), layoutParams);
                    }
                }
            };
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnScrollChangedListener(this.f179986c);
            }
        } else {
            wit0Var2 = wit0Var;
        }
        String str2 = (String) map.get("overlay_url");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        wit0Var2.loadUrl(str2);
    }
}
