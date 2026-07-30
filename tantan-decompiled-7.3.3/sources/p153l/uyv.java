package p153l;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;

/* JADX INFO: loaded from: classes13.dex */
public class uyv {
    /* JADX INFO: renamed from: a */
    public static String m198711a(nyv nyvVar) {
        StringBuilder sb = new StringBuilder();
        String strReplace = nyvVar.f144358c.replace("-", "_").replace("[", "").replace(Constants.AES_SUFFIX, Constants.SEPARATOR_COMMA);
        if (strReplace.endsWith(Constants.SEPARATOR_COMMA)) {
            strReplace = strReplace.substring(0, strReplace.length() - 1);
        }
        sb.append(strReplace);
        sb.append("(-s-)");
        for (String str : nyvVar.f144356a) {
            sb.append("[");
            sb.append(str);
            sb.append(Constants.AES_SUFFIX);
        }
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        sb.append(nyvVar.f144357b);
        return sb.toString().replace("\r", MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR).replace(SignParameters.NEW_LINE, MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
    }
}
