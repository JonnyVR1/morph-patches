package p149l;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes6.dex */
public final class yvy0 {

    /* JADX INFO: renamed from: a */
    public final a80[] f200301a;

    /* JADX INFO: renamed from: b */
    public final String f200302b;

    public yvy0(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, u8c0.f175111a);
        String string = typedArrayObtainAttributes.getString(u8c0.f175112b);
        String string2 = typedArrayObtainAttributes.getString(u8c0.f175113c);
        boolean zIsEmpty = TextUtils.isEmpty(string);
        boolean zIsEmpty2 = TextUtils.isEmpty(string2);
        if (!zIsEmpty && zIsEmpty2) {
            this.f200301a = m216245c(string);
        } else {
            if (!zIsEmpty || zIsEmpty2) {
                if (zIsEmpty) {
                    typedArrayObtainAttributes.recycle();
                    ig3.m135964a("Required XML attribute \"adSize\" was missing.");
                    throw null;
                }
                typedArrayObtainAttributes.recycle();
                ig3.m135964a("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
                throw null;
            }
            this.f200301a = m216245c(string2);
        }
        String string3 = typedArrayObtainAttributes.getString(u8c0.f175114d);
        this.f200302b = string3;
        typedArrayObtainAttributes.recycle();
        if (TextUtils.isEmpty(string3)) {
            ig3.m135964a("Required XML attribute \"adUnitId\" was missing.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static a80[] m216245c(String str) {
        String[] strArrSplit = str.split("\\s*,\\s*");
        int length = strArrSplit.length;
        a80[] a80VarArr = new a80[length];
        for (int i = 0; i < strArrSplit.length; i++) {
            String strTrim = strArrSplit[i].trim();
            if (strTrim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] strArrSplit2 = strTrim.split("[xX]");
                strArrSplit2[0] = strArrSplit2[0].trim();
                strArrSplit2[1] = strArrSplit2[1].trim();
                try {
                    a80VarArr[i] = new a80("FULL_WIDTH".equals(strArrSplit2[0]) ? -1 : Integer.parseInt(strArrSplit2[0]), "AUTO_HEIGHT".equals(strArrSplit2[1]) ? -2 : Integer.parseInt(strArrSplit2[1]));
                } catch (NumberFormatException unused) {
                    ig3.m135964a("Could not parse XML attribute \"adSize\": ".concat(strTrim));
                    return null;
                }
            } else if ("BANNER".equals(strTrim)) {
                a80VarArr[i] = a80.f67968i;
            } else if ("LARGE_BANNER".equals(strTrim)) {
                a80VarArr[i] = a80.f67970k;
            } else if ("FULL_BANNER".equals(strTrim)) {
                a80VarArr[i] = a80.f67969j;
            } else if ("LEADERBOARD".equals(strTrim)) {
                a80VarArr[i] = a80.f67971l;
            } else if ("MEDIUM_RECTANGLE".equals(strTrim)) {
                a80VarArr[i] = a80.f67972m;
            } else if ("SMART_BANNER".equals(strTrim)) {
                a80VarArr[i] = a80.f67974o;
            } else if ("WIDE_SKYSCRAPER".equals(strTrim)) {
                a80VarArr[i] = a80.f67973n;
            } else if ("FLUID".equals(strTrim)) {
                a80VarArr[i] = a80.f67975p;
            } else {
                if (!"ICON".equals(strTrim)) {
                    ig3.m135964a("Could not parse XML attribute \"adSize\": ".concat(strTrim));
                    return null;
                }
                a80VarArr[i] = a80.f67978s;
            }
        }
        if (length != 0) {
            return a80VarArr;
        }
        ig3.m135964a("Could not parse XML attribute \"adSize\": ".concat(str));
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final String m216246a() {
        return this.f200302b;
    }

    /* JADX INFO: renamed from: b */
    public final a80[] m216247b(boolean z) {
        if (z || this.f200301a.length == 1) {
            return this.f200301a;
        }
        ig3.m135964a("The adSizes XML attribute is only allowed on PublisherAdViews.");
        return null;
    }
}
