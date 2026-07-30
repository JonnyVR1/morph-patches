package p153l;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.Device;
import com.sina.weibo.sdk.constant.WBConstants;
import java.net.URLEncoder;
import java.util.HashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000.C0799b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, m88121d2 = {"Ll/q0e;", "", "<init>", "()V", "", "content", "", "g", "(Ljava/lang/String;)Z", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/content/Context;", "mContext", "", "f", "(Landroid/content/Context;)J", "context", "e", "(Landroid/content/Context;)Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "a", "HelloFoundation_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class q0e {
    public static final q0e INSTANCE = new q0e();

    private q0e() {
    }

    /* JADX INFO: renamed from: d */
    private final String m174689d(String content) {
        try {
            return URLEncoder.encode(content, "UTF-8");
        } catch (Exception unused) {
            return "momo";
        }
    }

    /* JADX INFO: renamed from: g */
    private final boolean m174690g(String content) {
        if (!TextUtils.isEmpty(content)) {
            if (content != null) {
                char[] charArray = content.toCharArray();
                charArray.getClass();
                for (char c : charArray) {
                    if (c <= 31 || c >= 127) {
                        return true;
                    }
                }
            } else {
                C0799b.m4641a("null cannot be cast to non-null type java.lang.String");
            }
        }
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final String m174691a() {
        if (!TextUtils.isEmpty(ej2.f94243b)) {
            return ej2.f94243b;
        }
        String str = Build.MANUFACTURER;
        if (TextUtils.isEmpty(str)) {
            str = "unknow manufacturer";
        }
        str.getClass();
        return m174690g(str) ? m174689d(str) : str;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final String m174692b() {
        if (!TextUtils.isEmpty(ej2.f94242a)) {
            return ej2.f94242a;
        }
        String strM174689d = Build.MODEL;
        HashMap map = new HashMap();
        strM174689d.getClass();
        map.put(Device.TYPE, strM174689d);
        if (TextUtils.isEmpty(strM174689d)) {
            return "unknown";
        }
        if (m174690g(strM174689d)) {
            strM174689d = m174689d(strM174689d);
        }
        ej2.f94242a = strM174689d;
        return strM174689d;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final String m174693c() {
        try {
            if (TextUtils.isEmpty(ej2.f94244c)) {
                ej2.f94244c = Build.VERSION.RELEASE;
                HashMap map = new HashMap();
                String str = ej2.f94244c;
                str.getClass();
                map.put(WBConstants.AUTH_PARAMS_VERSION, str);
            }
        } catch (Throwable th) {
            Log.e("getName", "", th);
        }
        return ej2.f94244c;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final String m174694e(@NotNull Context context) {
        context.getClass();
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            str.getClass();
            return str;
        } catch (Throwable th) {
            Log.e("getName", "", th);
            return "";
        }
    }

    /* JADX INFO: renamed from: f */
    public final long m174695f(@NotNull Context mContext) {
        mContext.getClass();
        try {
            PackageInfo packageInfo = mContext.getPackageManager().getPackageInfo(mContext.getPackageName(), 0);
            if (packageInfo != null) {
                return Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
            }
            return 0L;
        } catch (Throwable th) {
            Log.e("getName", "", th);
            return 0L;
        }
    }
}
