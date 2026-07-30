package p149l;

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
public final class g1s0 {

    /* JADX INFO: renamed from: a */
    public final bzr0 f100199a;

    /* JADX INFO: renamed from: b */
    public final int f100200b;

    /* JADX INFO: renamed from: c */
    public String f100201c;

    /* JADX INFO: renamed from: d */
    public final int f100202d;

    public g1s0(int i, int i2, int i3) {
        this.f100200b = i;
        i2 = (i2 > 64 || i2 < 0) ? 64 : i2;
        if (i3 <= 0) {
            this.f100202d = 1;
        } else {
            this.f100202d = i3;
        }
        this.f100199a = new e1s0(i2);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0094  */
    /* JADX INFO: renamed from: a */
    public final String m124087a(ArrayList arrayList, ArrayList arrayList2) {
        Collections.sort(arrayList2, new f1s0(this));
        HashSet hashSet = new HashSet();
        loop0: for (int i = 0; i < arrayList2.size(); i++) {
            String[] strArrSplit = Normalizer.normalize((CharSequence) arrayList.get(((azr0) arrayList2.get(i)).m99728e()), Normalizer.Form.NFKC).toLowerCase(Locale.US).split(SignParameters.NEW_LINE);
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
                            this.f100201c = string;
                            str = string;
                        }
                    }
                    String[] strArrM123919b = fzr0.m123919b(str, true);
                    if (strArrM123919b.length >= this.f100202d) {
                        for (int i5 = 0; i5 < strArrM123919b.length; i5++) {
                            String strConcat = "";
                            for (int i6 = 0; i6 < this.f100202d; i6++) {
                                int i7 = i5 + i6;
                                if (i7 >= strArrM123919b.length) {
                                    break;
                                }
                                if (i6 > 0) {
                                    strConcat = strConcat.concat(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                                }
                                strConcat = strConcat.concat(String.valueOf(strArrM123919b[i7]));
                            }
                            hashSet.add(strConcat);
                            if (hashSet.size() >= this.f100200b) {
                                break loop0;
                            }
                        }
                        if (hashSet.size() >= this.f100200b) {
                            break loop0;
                        }
                    }
                }
            }
        }
        dzr0 dzr0Var = new dzr0();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                dzr0Var.f88505b.write(this.f100199a.mo104643b((String) it.next()));
            } catch (IOException e) {
                x2t0.m206867e("Error while writing hash to byteStream", e);
            }
        }
        return dzr0Var.toString();
    }
}
