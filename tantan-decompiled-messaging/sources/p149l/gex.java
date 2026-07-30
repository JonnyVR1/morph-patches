package p149l;

import com.google.android.gms.common.api.Api;
import kotlin.Metadata;
import kotlin.SinceKotlin;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0010\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"", "", "a", "(D)I", "", "b", "(F)I", "kotlin-stdlib"}, m87233k = 5, m87234mv = {2, 2, 0}, m87236xi = 49, m87237xs = "kotlin/math/MathKt")
public class gex extends fex {
    @SinceKotlin
    /* JADX INFO: renamed from: a */
    public static int m125858a(double d) {
        if (Double.isNaN(d)) {
            ig3.m135964a("Cannot round NaN value.");
            return 0;
        }
        if (d > 2.147483647E9d) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        if (d < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d);
    }

    @SinceKotlin
    /* JADX INFO: renamed from: b */
    public static int m125859b(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        ig3.m135964a("Cannot round NaN value.");
        return 0;
    }
}
