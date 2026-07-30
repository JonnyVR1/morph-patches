package p149l;

import android.content.Context;
import com.facebook.AuthenticationTokenClaims;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tantanapp.sharedlibrary.loader.internal.UtilKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J[\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000626\u0010\u000e\u001a2\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00040\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m87232d2 = {"Ll/rh80;", "", "<init>", "()V", "", "a", "Landroid/content/Context;", "context", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "oldVersion", "newVersion", "onSharedLibraryVersionChanged", "Lkotlin/Function0;", "onAppVersionChanged", "b", "(Landroid/content/Context;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "loader_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class rh80 {

    @NotNull
    public static final rh80 INSTANCE = new rh80();

    /* JADX INFO: renamed from: a */
    public final void m179339a() {
        fpd0.addSpName2MMKVSet("shared_library_loader");
    }

    /* JADX INFO: renamed from: b */
    public final void m179340b(@NotNull Context context, @NotNull Function2<? super Integer, ? super Integer, Unit> onSharedLibraryVersionChanged, @NotNull Function0<Unit> onAppVersionChanged) {
        context.getClass();
        onSharedLibraryVersionChanged.getClass();
        onAppVersionChanged.getClass();
        tpd0 tpd0Var = new tpd0(WBConstants.AUTH_PARAMS_VERSION, 0, true, "shared_library_loader");
        Integer num = tpd0Var.get();
        tpd0 tpd0Var2 = new tpd0("app_version", 0, true, "shared_library_loader");
        Integer num2 = tpd0Var2.get();
        int i = context.getApplicationContext().getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0).versionCode;
        UtilKt.m81522c("migrateVersion: oldSharedLibraryVersion=" + num + ",newSharedLibraryVersion=2,oldAppVersion=" + num2 + ",newAppVersion=" + i);
        num.getClass();
        if (num.intValue() < 2) {
            onSharedLibraryVersionChanged.invoke(num, 2);
            tpd0Var.put(2);
        }
        if (num2 != null && num2.intValue() == i) {
            return;
        }
        onAppVersionChanged.invoke();
        tpd0Var2.put(Integer.valueOf(i));
    }
}
