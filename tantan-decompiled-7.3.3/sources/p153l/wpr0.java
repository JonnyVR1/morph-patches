package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes6.dex */
public final class wpr0 {

    /* JADX INFO: renamed from: a */
    public final int f190339a;

    /* JADX INFO: renamed from: b */
    public final int f190340b;

    /* JADX INFO: renamed from: c */
    public final int f190341c;

    /* JADX INFO: renamed from: d */
    public final int f190342d;

    /* JADX INFO: renamed from: e */
    public final int f190343e;

    public wpr0(int i, int i2, int i3, int i4, int i5) {
        this.f190339a = i;
        this.f190340b = i2;
        this.f190341c = i3;
        this.f190342d = i4;
        this.f190343e = i5;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Nullable
    /* JADX INFO: renamed from: a */
    public static wpr0 m207497a(String str) {
        lev0.m153956d(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), Constants.SEPARATOR_COMMA);
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        while (true) {
            int length = strArrSplit.length;
            if (i >= length) {
                if (i2 == -1 || i3 == -1 || i5 == -1) {
                    return null;
                }
                return new wpr0(i2, i3, i4, i5, length);
            }
            String strM207228a = wnw0.m207228a(strArrSplit[i].trim());
            switch (strM207228a.hashCode()) {
                case 100571:
                    if (strM207228a.equals("end")) {
                        i3 = i;
                    }
                    break;
                case 3556653:
                    if (strM207228a.equals("text")) {
                        i5 = i;
                    }
                    break;
                case 109757538:
                    if (strM207228a.equals("start")) {
                        i2 = i;
                    }
                    break;
                case 109780401:
                    if (strM207228a.equals("style")) {
                        i4 = i;
                    }
                    break;
            }
            i++;
        }
    }
}
