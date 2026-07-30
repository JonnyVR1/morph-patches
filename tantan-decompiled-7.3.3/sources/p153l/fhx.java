package p153l;

import com.google.android.gms.common.api.Api;
import kotlin.Metadata;
import kotlin.SinceKotlin;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0010\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"", "", "a", "(D)I", "", "b", "(F)I", "kotlin-stdlib"}, m88122k = 5, m88123mv = {2, 2, 0}, m88125xi = 49, m88126xs = "kotlin/math/MathKt")
public class fhx extends ehx {
    @SinceKotlin
    /* JADX INFO: renamed from: a */
    public static int m125608a(double d) {
        if (Double.isNaN(d)) {
            wg3.m206174a("Cannot round NaN value.");
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
    public static int m125609b(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        wg3.m206174a("Cannot round NaN value.");
        return 0;
    }
}
