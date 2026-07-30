package p153l;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes6.dex */
public final class e5z0 {

    /* JADX INFO: renamed from: a */
    public final w70[] f92248a;

    /* JADX INFO: renamed from: b */
    public final String f92249b;

    public e5z0(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, zgc0.f204287a);
        String string = typedArrayObtainAttributes.getString(zgc0.f204288b);
        String string2 = typedArrayObtainAttributes.getString(zgc0.f204289c);
        boolean zIsEmpty = TextUtils.isEmpty(string);
        boolean zIsEmpty2 = TextUtils.isEmpty(string2);
        if (!zIsEmpty && zIsEmpty2) {
            this.f92248a = m119564c(string);
        } else {
            if (!zIsEmpty || zIsEmpty2) {
                if (zIsEmpty) {
                    typedArrayObtainAttributes.recycle();
                    wg3.m206174a("Required XML attribute \"adSize\" was missing.");
                    throw null;
                }
                typedArrayObtainAttributes.recycle();
                wg3.m206174a("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
                throw null;
            }
            this.f92248a = m119564c(string2);
        }
        String string3 = typedArrayObtainAttributes.getString(zgc0.f204290d);
        this.f92249b = string3;
        typedArrayObtainAttributes.recycle();
        if (TextUtils.isEmpty(string3)) {
            wg3.m206174a("Required XML attribute \"adUnitId\" was missing.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static w70[] m119564c(String str) {
        String[] strArrSplit = str.split("\\s*,\\s*");
        int length = strArrSplit.length;
        w70[] w70VarArr = new w70[length];
        for (int i = 0; i < strArrSplit.length; i++) {
            String strTrim = strArrSplit[i].trim();
            if (strTrim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] strArrSplit2 = strTrim.split("[xX]");
                strArrSplit2[0] = strArrSplit2[0].trim();
                strArrSplit2[1] = strArrSplit2[1].trim();
                try {
                    w70VarArr[i] = new w70("FULL_WIDTH".equals(strArrSplit2[0]) ? -1 : Integer.parseInt(strArrSplit2[0]), "AUTO_HEIGHT".equals(strArrSplit2[1]) ? -2 : Integer.parseInt(strArrSplit2[1]));
                } catch (NumberFormatException unused) {
                    wg3.m206174a("Could not parse XML attribute \"adSize\": ".concat(strTrim));
                    return null;
                }
            } else if ("BANNER".equals(strTrim)) {
                w70VarArr[i] = w70.f187681i;
            } else if ("LARGE_BANNER".equals(strTrim)) {
                w70VarArr[i] = w70.f187683k;
            } else if ("FULL_BANNER".equals(strTrim)) {
                w70VarArr[i] = w70.f187682j;
            } else if ("LEADERBOARD".equals(strTrim)) {
                w70VarArr[i] = w70.f187684l;
            } else if ("MEDIUM_RECTANGLE".equals(strTrim)) {
                w70VarArr[i] = w70.f187685m;
            } else if ("SMART_BANNER".equals(strTrim)) {
                w70VarArr[i] = w70.f187687o;
            } else if ("WIDE_SKYSCRAPER".equals(strTrim)) {
                w70VarArr[i] = w70.f187686n;
            } else if ("FLUID".equals(strTrim)) {
                w70VarArr[i] = w70.f187688p;
            } else {
                if (!"ICON".equals(strTrim)) {
                    wg3.m206174a("Could not parse XML attribute \"adSize\": ".concat(strTrim));
                    return null;
                }
                w70VarArr[i] = w70.f187691s;
            }
        }
        if (length != 0) {
            return w70VarArr;
        }
        wg3.m206174a("Could not parse XML attribute \"adSize\": ".concat(str));
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final String m119565a() {
        return this.f92249b;
    }

    /* JADX INFO: renamed from: b */
    public final w70[] m119566b(boolean z) {
        if (z || this.f92248a.length == 1) {
            return this.f92248a;
        }
        wg3.m206174a("The adSizes XML attribute is only allowed on PublisherAdViews.");
        return null;
    }
}
