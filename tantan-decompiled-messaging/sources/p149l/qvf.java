package p149l;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import com.facebook.internal.C1657e;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR$\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u000bj\b\u0012\u0004\u0012\u00020\u0006`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\r¨\u0006\u000f"}, m87232d2 = {"Ll/qvf;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "", "a", "(Landroid/content/Context;Ljava/lang/String;)Z", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "Ljava/util/HashSet;", "validAppSignatureHashes", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class qvf {

    @NotNull
    public static final qvf INSTANCE = new qvf();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final HashSet<String> validAppSignatureHashes = SetsKt.hashSetOf("8a3c4b262d721acd49a4bf97d5213199c86fa2b9", "cc2751449a350f668590264ed76692694a80308a", "a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc", "df6b721c8b4d3b6eb44c861d4415007e5a35fc95", "9b8f518b086098de3d77736f9458a3d2f6f95a37", "2438bce1ddb7bd026d5ff89f598b3b5e5bb824b3", "c56fb7d591ba6704df047fd98f535372fea00211");

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final boolean m176697a(@NotNull Context context, @NotNull String packageName) {
        context.getClass();
        packageName.getClass();
        String str = Build.BRAND;
        int i = context.getApplicationInfo().flags;
        str.getClass();
        if (C15386d.m93483J(str, "generic", false, 2, null) && (i & 2) != 0) {
            return true;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 64);
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr != null) {
                signatureArr.getClass();
                if (signatureArr.length != 0) {
                    Signature[] signatureArr2 = packageInfo.signatures;
                    signatureArr2.getClass();
                    for (Signature signature : signatureArr2) {
                        HashSet<String> hashSet = validAppSignatureHashes;
                        byte[] byteArray = signature.toByteArray();
                        byteArray.getClass();
                        if (!CollectionsKt.contains(hashSet, C1657e.m8811D0(byteArray))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }
}
