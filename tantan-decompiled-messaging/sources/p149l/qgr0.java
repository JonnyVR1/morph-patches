package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes6.dex */
public final class qgr0 {

    /* JADX INFO: renamed from: a */
    public final int f154370a;

    /* JADX INFO: renamed from: b */
    public final int f154371b;

    /* JADX INFO: renamed from: c */
    public final int f154372c;

    /* JADX INFO: renamed from: d */
    public final int f154373d;

    /* JADX INFO: renamed from: e */
    public final int f154374e;

    public qgr0(int i, int i2, int i3, int i4, int i5) {
        this.f154370a = i;
        this.f154371b = i2;
        this.f154372c = i3;
        this.f154373d = i4;
        this.f154374e = i5;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Nullable
    /* JADX INFO: renamed from: a */
    public static qgr0 m174455a(String str) {
        f5v0.m119533d(str.startsWith("Format:"));
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
                return new qgr0(i2, i3, i4, i5, length);
            }
            String strM174257a = qew0.m174257a(strArrSplit[i].trim());
            switch (strM174257a.hashCode()) {
                case 100571:
                    if (strM174257a.equals("end")) {
                        i3 = i;
                    }
                    break;
                case 3556653:
                    if (strM174257a.equals("text")) {
                        i5 = i;
                    }
                    break;
                case 109757538:
                    if (strM174257a.equals("start")) {
                        i2 = i;
                    }
                    break;
                case 109780401:
                    if (strM174257a.equals("style")) {
                        i4 = i;
                    }
                    break;
            }
            i++;
        }
    }
}
