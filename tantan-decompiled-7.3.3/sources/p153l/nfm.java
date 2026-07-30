package p153l;

import android.content.Context;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.CleverTapInstanceConfig;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class nfm {
    /* JADX INFO: renamed from: a */
    public static mfm m162931a(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, u0l0 u0l0Var) {
        u0w u0wVar = new u0w(context, cleverTapInstanceConfig);
        mfm mcrVar = u0wVar.m193880i() ? new mcr(cleverTapInstanceConfig) : new tw5(cleverTapInstanceConfig, u0wVar, u0l0Var);
        cleverTapInstanceConfig.log("ON_USER_LOGIN", "Repo provider: ".concat(mcrVar.getClass().getSimpleName()));
        return mcrVar;
    }
}
