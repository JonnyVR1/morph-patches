package p153l;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.product_config.C1327a;
import com.clevertap.android.sdk.product_config.CTProductConfigController;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class tw3 {
    @Deprecated
    /* JADX INFO: renamed from: a */
    public static CTProductConfigController m193342a(Context context, uzd uzdVar, CleverTapInstanceConfig cleverTapInstanceConfig, xe2 xe2Var, bu9 bu9Var, ch2 ch2Var) {
        String strM198762E = uzdVar.m198762E();
        ski skiVar = new ski(context, cleverTapInstanceConfig);
        return new CTProductConfigController(context, cleverTapInstanceConfig, xe2Var, bu9Var, ch2Var, new C1327a(strM198762E, cleverTapInstanceConfig, skiVar), skiVar);
    }
}
