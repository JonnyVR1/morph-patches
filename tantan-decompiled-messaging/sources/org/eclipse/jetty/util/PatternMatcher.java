package org.eclipse.jetty.util;

import com.clevertap.android.sdk.Constants;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PatternMatcher {
    public void match(Pattern pattern, URI[] uriArr, boolean z) throws Exception {
        if (uriArr != null) {
            String[] strArrSplit = pattern == null ? null : pattern.pattern().split(Constants.SEPARATOR_COMMA);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; strArrSplit != null && i < strArrSplit.length; i++) {
                arrayList.add(Pattern.compile(strArrSplit[i]));
            }
            if (arrayList.isEmpty()) {
                arrayList.add(pattern);
            }
            if (arrayList.isEmpty()) {
                matchPatterns(null, uriArr, z);
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                matchPatterns((Pattern) it.next(), uriArr, z);
            }
        }
    }

    public void matchPatterns(Pattern pattern, URI[] uriArr, boolean z) throws Exception {
        for (int i = 0; i < uriArr.length; i++) {
            String string = uriArr[i].toString();
            if ((pattern == null && z) || (pattern != null && pattern.matcher(string).matches())) {
                matched(uriArr[i]);
            }
        }
    }

    public abstract void matched(URI uri) throws Exception;
}
