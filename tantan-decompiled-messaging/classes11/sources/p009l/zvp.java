package p009l;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.webkit.WebView;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.common.R;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.d;
import l.lsi0;
import l.vwb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014¨\u0006\u0019"}, d2 = {"Ll/zvp;", "", "<init>", "()V", "Landroid/webkit/WebView;", "webView", "", "url", "Landroid/content/Context;", "context", "", "b", "(Landroid/webkit/WebView;Ljava/lang/String;Landroid/content/Context;)Z", "a", "(Ljava/lang/String;)Z", "", "d", "(Landroid/content/Context;Ljava/lang/String;)V", "c", "", "Ljava/util/List;", "PAY_PROTOCOLS", "Ljava/lang/String;", "HOSTNAME", "PURCHASE_PAGE_PROTOCOLS", "putong-common_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class zvp {

    @NotNull
    public static final zvp INSTANCE = new zvp();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final List<String> PAY_PROTOCOLS;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final String HOSTNAME;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final List<String> PURCHASE_PAGE_PROTOCOLS;

    static {
        ArrayList arrayListF0 = vwb.f0(new String[]{"boostappdeeplink", "kakaotalk://kakaopay/gka/enrollment?link_force_open", "android-app://jp.naver.line.android"});
        arrayListF0.getClass();
        PAY_PROTOCOLS = arrayListF0;
        String str = (juk.m17221e() ? "http" : "https") + "://intlweb." + (juk.m17221e() ? "staging2.p1staff" : "tantanapp") + ".com";
        HOSTNAME = str;
        ArrayList arrayListF1 = vwb.f0(new String[]{str + "/purchase/redirect", str + "/purchase/subRedirect"});
        arrayListF1.getClass();
        PURCHASE_PAGE_PROTOCOLS = arrayListF1;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m25984a(String url) {
        Iterator<String> it = PAY_PROTOCOLS.iterator();
        while (it.hasNext()) {
            if (d.J(url, it.next(), false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m25985b(@NotNull WebView webView, @NotNull String url, @NotNull Context context) {
        webView.getClass();
        url.getClass();
        context.getClass();
        if (d.J(url, "sms:", false, 2, (Object) null) || d.J(url, "smsto:", false, 2, (Object) null) || d.J(url, "geo:", false, 2, (Object) null) || d.J(url, "market:", false, 2, (Object) null)) {
            try {
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
            } catch (Exception e) {
                CrashHelper.c(new Exception("CWebViewClient shouldOverrideUrlLoading:" + e.getMessage(), e));
            }
            return true;
        }
        PackageManager packageManager = context.getPackageManager();
        packageManager.getClass();
        if (d.J(url, "intent:", false, 2, (Object) null)) {
            try {
                Intent uri = Intent.parseUri(url, 1);
                uri.getClass();
                if (uri.resolveActivity(context.getPackageManager()) != null) {
                    context.startActivity(uri);
                    return true;
                }
                String stringExtra = uri.getStringExtra("browser_fallback_url");
                if (stringExtra != null && !Intrinsics.d("play.google.com", Uri.parse(stringExtra).getHost())) {
                    webView.loadUrl(stringExtra);
                    return true;
                }
                Intent data = new Intent("android.intent.action.VIEW").setData(Uri.parse("market://details?id=" + uri.getPackage()));
                data.getClass();
                if (data.resolveActivity(packageManager) != null) {
                    context.startActivity(data);
                    return true;
                }
            } catch (Exception e2) {
                CrashHelper.c(e2);
            }
        }
        if (m25984a(url)) {
            m25987d(context, url);
            return true;
        }
        Iterator<T> it = PURCHASE_PAGE_PROTOCOLS.iterator();
        while (it.hasNext()) {
            if (d.J(url, (String) it.next(), false, 2, (Object) null) && (context instanceof PutongAct)) {
                ((PutongAct) context).finish();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final void m25986c(Context context, String url) {
        try {
            Intent uri = Intent.parseUri(url, 1);
            uri.setFlags(805306368);
            uri.addCategory("android.intent.category.BROWSABLE");
            uri.setComponent(null);
            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(uri, 65536);
            listQueryIntentActivities.getClass();
            if (listQueryIntentActivities.size() > 0) {
                context.startActivity(uri);
            }
        } catch (Exception unused) {
            lsi0.h(R.string.u0);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m25987d(Context context, String url) {
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse(url));
            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
            listQueryIntentActivities.getClass();
            if (listQueryIntentActivities.size() > 0) {
                context.startActivity(intent);
            } else {
                m25986c(context, url);
            }
        } catch (Exception e) {
            CrashHelper.c(e);
            lsi0.h(R.string.u0);
        }
    }
}
