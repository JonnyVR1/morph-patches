package p153l;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public final class mas0 {

    /* JADX INFO: renamed from: a */
    public final h8s0 f135592a;

    /* JADX INFO: renamed from: b */
    public final int f135593b;

    /* JADX INFO: renamed from: c */
    public String f135594c;

    /* JADX INFO: renamed from: d */
    public final int f135595d;

    public mas0(int i, int i2, int i3) {
        this.f135593b = i;
        i2 = (i2 > 64 || i2 < 0) ? 64 : i2;
        if (i3 <= 0) {
            this.f135595d = 1;
        } else {
            this.f135595d = i3;
        }
        this.f135592a = new kas0(i2);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0094  */
    /* JADX INFO: renamed from: a */
    public final String m157749a(ArrayList arrayList, ArrayList arrayList2) {
        Collections.sort(arrayList2, new las0(this));
        HashSet hashSet = new HashSet();
        loop0: for (int i = 0; i < arrayList2.size(); i++) {
            String[] strArrSplit = Normalizer.normalize((CharSequence) arrayList.get(((g8s0) arrayList2.get(i)).m129459e()), Normalizer.Form.NFKC).toLowerCase(Locale.US).split(SignParameters.NEW_LINE);
            if (strArrSplit.length != 0) {
                for (String str : strArrSplit) {
                    if (str.contains("'")) {
                        StringBuilder sb = new StringBuilder(str);
                        int i2 = 1;
                        boolean z = false;
                        while (true) {
                            int i3 = i2 + 2;
                            if (i3 > sb.length()) {
                                break;
                            }
                            if (sb.charAt(i2) == '\'') {
                                if (sb.charAt(i2 - 1) != ' ') {
                                    int i4 = i2 + 1;
                                    if ((sb.charAt(i4) == 's' || sb.charAt(i4) == 'S') && (i3 == sb.length() || sb.charAt(i3) == ' ')) {
                                        sb.insert(i2, ' ');
                                        i2 = i3;
                                    } else {
                                        sb.setCharAt(i2, ' ');
                                    }
                                } else {
                                    sb.setCharAt(i2, ' ');
                                }
                                z = true;
                            }
                            i2++;
                        }
                        String string = z ? sb.toString() : null;
                        if (string != null) {
                            this.f135594c = string;
                            str = string;
                        }
                    }
                    String[] strArrM153299b = l8s0.m153299b(str, true);
                    if (strArrM153299b.length >= this.f135595d) {
                        for (int i5 = 0; i5 < strArrM153299b.length; i5++) {
                            String strConcat = "";
                            for (int i6 = 0; i6 < this.f135595d; i6++) {
                                int i7 = i5 + i6;
                                if (i7 >= strArrM153299b.length) {
                                    break;
                                }
                                if (i6 > 0) {
                                    strConcat = strConcat.concat(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                                }
                                strConcat = strConcat.concat(String.valueOf(strArrM153299b[i7]));
                            }
                            hashSet.add(strConcat);
                            if (hashSet.size() >= this.f135593b) {
                                break loop0;
                            }
                        }
                        if (hashSet.size() >= this.f135593b) {
                            break loop0;
                        }
                    }
                }
            }
        }
        j8s0 j8s0Var = new j8s0();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                j8s0Var.f118814b.write(this.f135592a.mo133954b((String) it.next()));
            } catch (IOException e) {
                dct0.m115296e("Error while writing hash to byteStream", e);
            }
        }
        return j8s0Var.toString();
    }
}
