package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class psf0 {

    /* JADX INFO: renamed from: a */
    public final int f151004a;

    /* JADX INFO: renamed from: b */
    public final int f151005b;

    /* JADX INFO: renamed from: c */
    public final int f151006c;

    /* JADX INFO: renamed from: d */
    public final int f151007d;

    /* JADX INFO: renamed from: e */
    public final int f151008e;

    public psf0(int i, int i2, int i3, int i4, int i5) {
        this.f151004a = i;
        this.f151005b = i2;
        this.f151006c = i3;
        this.f151007d = i4;
        this.f151008e = i5;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static psf0 m171137a(String str) {
        p11.m167007a(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), Constants.SEPARATOR_COMMA);
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < strArrSplit.length; i5++) {
            String strM99804e = b11.m99804e(strArrSplit[i5].trim());
            strM99804e.getClass();
            switch (strM99804e) {
                case "end":
                    i2 = i5;
                    break;
                case "text":
                    i4 = i5;
                    break;
                case "start":
                    i = i5;
                    break;
                case "style":
                    i3 = i5;
                    break;
            }
        }
        if (i == -1 || i2 == -1 || i4 == -1) {
            return null;
        }
        return new psf0(i, i2, i3, i4, strArrSplit.length);
    }
}
