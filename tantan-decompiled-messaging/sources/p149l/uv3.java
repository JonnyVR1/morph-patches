package p149l;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.product_config.C1304a;
import com.clevertap.android.sdk.product_config.CTProductConfigController;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class uv3 {
    @Deprecated
    /* JADX INFO: renamed from: a */
    public static CTProductConfigController m196054a(Context context, hyd hydVar, CleverTapInstanceConfig cleverTapInstanceConfig, pe2 pe2Var, qs9 qs9Var, vg2 vg2Var) {
        String strM133539E = hydVar.m133539E();
        vhi vhiVar = new vhi(context, cleverTapInstanceConfig);
        return new CTProductConfigController(context, cleverTapInstanceConfig, pe2Var, qs9Var, vg2Var, new C1304a(strM133539E, cleverTapInstanceConfig, vhiVar), vhiVar);
    }
}
