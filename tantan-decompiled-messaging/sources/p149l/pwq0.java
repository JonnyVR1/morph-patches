package p149l;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.EnumC14720d;

/* JADX INFO: loaded from: classes2.dex */
public class pwq0 {
    /* JADX INFO: renamed from: a */
    public static InterfaceC20816w7 m171763a(Context context, EnumC14720d enumC14720d) {
        return m171764b(context, enumC14720d);
    }

    /* JADX INFO: renamed from: b */
    private static InterfaceC20816w7 m171764b(Context context, EnumC14720d enumC14720d) {
        otq0.C19042b c19042bM165966c = otq0.m165966c(enumC14720d);
        if (c19042bM165966c == null || TextUtils.isEmpty(c19042bM165966c.f145615a) || TextUtils.isEmpty(c19042bM165966c.f145616b)) {
            return null;
        }
        return (InterfaceC20816w7) ikq0.m136884g(c19042bM165966c.f145615a, c19042bM165966c.f145616b, context);
    }
}
