package p153l;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import androidx.browser.customtabs.CustomTabsService;
import com.facebook.C1600c;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\n\u0010\u0006R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\u000e"}, m88121d2 = {"Ll/szb;", "", "<init>", "()V", "", "b", "()Ljava/lang/String;", "developerDefinedRedirectURI", "c", "(Ljava/lang/String;)Ljava/lang/String;", "a", "", "[Ljava/lang/String;", "CHROME_PACKAGES", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
public final class szb {

    @NotNull
    public static final szb INSTANCE = new szb();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final String[] CHROME_PACKAGES = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final String m188633a() {
        if (ztb.m221490d(szb.class)) {
            return null;
        }
        try {
            Context contextM8101l = C1600c.m8101l();
            List<ResolveInfo> listQueryIntentServices = contextM8101l.getPackageManager().queryIntentServices(new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION), 0);
            listQueryIntentServices.getClass();
            HashSet hashSet = ArraysKt.toHashSet(CHROME_PACKAGES);
            Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
            while (it.hasNext()) {
                ServiceInfo serviceInfo = it.next().serviceInfo;
                if (serviceInfo != null && hashSet.contains(serviceInfo.packageName)) {
                    return serviceInfo.packageName;
                }
            }
            return null;
        } catch (Throwable th) {
            ztb.m221488b(th, szb.class);
            return null;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m188634b() {
        if (ztb.m221490d(szb.class)) {
            return null;
        }
        try {
            return Intrinsics.m88385l("fbconnect://cct.", C1600c.m8101l().getPackageName());
        } catch (Throwable th) {
            ztb.m221488b(th, szb.class);
            return null;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m188635c(@NotNull String developerDefinedRedirectURI) {
        if (ztb.m221490d(szb.class)) {
            return null;
        }
        try {
            developerDefinedRedirectURI.getClass();
            g0l0 g0l0Var = g0l0.INSTANCE;
            if (g0l0.m128433d(C1600c.m8101l(), developerDefinedRedirectURI)) {
                return developerDefinedRedirectURI;
            }
            return g0l0.m128433d(C1600c.m8101l(), m188634b()) ? m188634b() : "";
        } catch (Throwable th) {
            ztb.m221488b(th, szb.class);
            return null;
        }
    }
}
