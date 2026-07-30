package p149l;

import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1577c;
import com.facebook.internal.C1656d;
import com.facebook.internal.C1657e;
import com.facebook.internal.FetchedAppSettingsManager;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0003J)\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R&\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0015¨\u0006\u0017"}, m87232d2 = {"Ll/gd2;", "", "<init>", "()V", "", "a", "Landroid/os/Bundle;", "parameters", Constants.INAPP_DATA_TAG, "(Landroid/os/Bundle;)V", "b", "Lorg/json/JSONArray;", "paramValues", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "c", "(Lorg/json/JSONArray;)Ljava/util/HashSet;", "", "Z", "enabled", "Ljava/util/HashSet;", "bannedParamsConfig", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class gd2 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static boolean enabled;

    @NotNull
    public static final gd2 INSTANCE = new gd2();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static HashSet<String> bannedParamsConfig = new HashSet<>();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m125530a() {
        if (lsb.m151554d(gd2.class)) {
            return;
        }
        try {
            if (enabled) {
                return;
            }
            INSTANCE.m125532b();
            enabled = !bannedParamsConfig.isEmpty();
        } catch (Throwable th) {
            lsb.m151552b(th, gd2.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m125531d(@Nullable Bundle parameters) {
        if (lsb.m151554d(gd2.class)) {
            return;
        }
        try {
            if (enabled && parameters != null) {
                Iterator<T> it = bannedParamsConfig.iterator();
                while (it.hasNext()) {
                    parameters.remove((String) it.next());
                }
            }
        } catch (Throwable th) {
            lsb.m151552b(th, gd2.class);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m125532b() {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            C1656d c1656dM8693r = FetchedAppSettingsManager.m8693r(C1577c.m8048m(), false);
            if (c1656dM8693r == null) {
                return;
            }
            bannedParamsConfig = m125533c(c1656dM8693r.getBannedParams());
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: c */
    public final HashSet<String> m125533c(JSONArray paramValues) {
        try {
            if (lsb.m151554d(this)) {
                return null;
            }
            try {
                HashSet<String> hashSetM8848m = C1657e.m8848m(paramValues);
                return hashSetM8848m == null ? new HashSet<>() : hashSetM8848m;
            } catch (Exception unused) {
                return new HashSet<>();
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return null;
        }
    }
}
