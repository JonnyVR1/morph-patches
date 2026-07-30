package p153l;

import android.annotation.SuppressLint;
import android.content.pm.PackageManager;
import com.p051p1.mobile.android.app.Act;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Ll/ek50;", "", "<init>", "()V", "", "type", "", "b", "(I)Ljava/lang/String;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "packageNames", "a", "(Lcom/p1/mobile/android/app/Act;[Ljava/lang/String;)Ljava/lang/String;", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SuppressLint({"StaticFieldLeak"})
public final class ek50 {

    @NotNull
    public static final ek50 INSTANCE = new ek50();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m121031a(@NotNull Act act, @NotNull String[] packageNames) {
        act.getClass();
        packageNames.getClass();
        PackageManager packageManager = act.getPackageManager();
        StringBuilder sb = new StringBuilder();
        for (String str : packageNames) {
            try {
                packageManager.getApplicationInfo(str, 0);
                sb.append("1");
            } catch (PackageManager.NameNotFoundException unused) {
                sb.append("0");
            }
        }
        return sb.toString();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m121032b(int type) {
        if (type == 1) {
            return "cpt";
        }
        if (type != 2) {
            return type != 3 ? "unknown" : "internal";
        }
        return "cpm";
    }
}
