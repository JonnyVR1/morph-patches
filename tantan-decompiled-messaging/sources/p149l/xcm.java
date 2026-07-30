package p149l;

import android.content.Context;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.CleverTapInstanceConfig;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class xcm {
    /* JADX INFO: renamed from: a */
    public static wcm m208126a(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, ork0 ork0Var) {
        wyv wyvVar = new wyv(context, cleverTapInstanceConfig);
        wcm karVar = wyvVar.m206224i() ? new kar(cleverTapInstanceConfig) : new ov5(cleverTapInstanceConfig, wyvVar, ork0Var);
        cleverTapInstanceConfig.log("ON_USER_LOGIN", "Repo provider: ".concat(karVar.getClass().getSimpleName()));
        return karVar;
    }
}
