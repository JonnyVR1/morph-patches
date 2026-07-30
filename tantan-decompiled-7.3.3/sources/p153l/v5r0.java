package p153l;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.EnumC14868d;

/* JADX INFO: loaded from: classes2.dex */
public class v5r0 {
    /* JADX INFO: renamed from: a */
    public static InterfaceC19782r7 m199917a(Context context, EnumC14868d enumC14868d) {
        return m199918b(context, enumC14868d);
    }

    /* JADX INFO: renamed from: b */
    private static InterfaceC19782r7 m199918b(Context context, EnumC14868d enumC14868d) {
        u2r0.C20470b c20470bM194298c = u2r0.m194298c(enumC14868d);
        if (c20470bM194298c == null || TextUtils.isEmpty(c20470bM194298c.f177238a) || TextUtils.isEmpty(c20470bM194298c.f177239b)) {
            return null;
        }
        return (InterfaceC19782r7) otq0.m169169g(c20470bM194298c.f177238a, c20470bM194298c.f177239b, context);
    }
}
