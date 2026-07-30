package org.seamless.http;

import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.jetty.http.HttpHeaderValues;
import p153l.ypg0;

/* JADX INFO: loaded from: classes3.dex */
public class CacheControl {
    private int maxAge = -1;
    private int sharedMaxAge = -1;
    private boolean noCache = false;
    private List<String> noCacheFields = new ArrayList();
    private boolean privateFlag = false;
    private List<String> privateFields = new ArrayList();
    private boolean noStore = false;
    private boolean noTransform = true;
    private boolean mustRevalidate = false;
    private boolean proxyRevalidate = false;
    private Map<String, String> cacheExtensions = new HashMap();

    private StringBuilder append(String str, StringBuilder sb) {
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append(str);
        return sb;
    }

    public static CacheControl valueOf(String str) throws IllegalArgumentException {
        String strTrim;
        if (str == null) {
            return null;
        }
        CacheControl cacheControl = new CacheControl();
        for (String str2 : str.split(Constants.SEPARATOR_COMMA)) {
            String[] strArrSplit = str2.trim().split("=");
            String strTrim2 = strArrSplit[0].trim();
            if (strArrSplit.length > 1) {
                strTrim = strArrSplit[1].trim();
                if (strTrim.startsWith("\"")) {
                    strTrim = strTrim.substring(1);
                }
                if (strTrim.endsWith("\"")) {
                    strTrim = strTrim.substring(0, strTrim.length() - 1);
                }
            } else {
                strTrim = null;
            }
            String lowerCase = strTrim2.toLowerCase();
            if (HttpHeaderValues.NO_CACHE.equals(lowerCase)) {
                cacheControl.setNoCache(true);
                if (strTrim != null && !"".equals(strTrim)) {
                    cacheControl.getNoCacheFields().add(strTrim);
                }
            } else if ("private".equals(lowerCase)) {
                cacheControl.setPrivateFlag(true);
                if (strTrim != null && !"".equals(strTrim)) {
                    cacheControl.getPrivateFields().add(strTrim);
                }
            } else if ("no-store".equals(lowerCase)) {
                cacheControl.setNoStore(true);
            } else if ("max-age".equals(lowerCase)) {
                if (strTrim == null) {
                    ypg0.m217021a("CacheControl max-age header does not have a value: ", strTrim);
                    return null;
                }
                cacheControl.setMaxAge(Integer.valueOf(strTrim).intValue());
            } else if ("s-maxage".equals(lowerCase)) {
                if (strTrim == null) {
                    ypg0.m217021a("CacheControl s-maxage header does not have a value: ", strTrim);
                    return null;
                }
                cacheControl.setSharedMaxAge(Integer.valueOf(strTrim).intValue());
            } else if ("no-transform".equals(lowerCase)) {
                cacheControl.setNoTransform(true);
            } else if ("must-revalidate".equals(lowerCase)) {
                cacheControl.setMustRevalidate(true);
            } else if ("proxy-revalidate".equals(lowerCase)) {
                cacheControl.setProxyRevalidate(true);
            } else if (!"public".equals(lowerCase)) {
                if (strTrim == null) {
                    strTrim = "";
                }
                cacheControl.getCacheExtensions().put(strTrim2, strTrim);
            }
        }
        return cacheControl;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CacheControl cacheControl = (CacheControl) obj;
        return this.maxAge == cacheControl.maxAge && this.mustRevalidate == cacheControl.mustRevalidate && this.noCache == cacheControl.noCache && this.noStore == cacheControl.noStore && this.noTransform == cacheControl.noTransform && this.privateFlag == cacheControl.privateFlag && this.proxyRevalidate == cacheControl.proxyRevalidate && this.sharedMaxAge == cacheControl.sharedMaxAge && this.cacheExtensions.equals(cacheControl.cacheExtensions) && this.noCacheFields.equals(cacheControl.noCacheFields) && this.privateFields.equals(cacheControl.privateFields);
    }

    public Map<String, String> getCacheExtensions() {
        return this.cacheExtensions;
    }

    public int getMaxAge() {
        return this.maxAge;
    }

    public List<String> getNoCacheFields() {
        return this.noCacheFields;
    }

    public List<String> getPrivateFields() {
        return this.privateFields;
    }

    public int getSharedMaxAge() {
        return this.sharedMaxAge;
    }

    public int hashCode() {
        return (((((((((((((((((((this.maxAge * 31) + this.sharedMaxAge) * 31) + (this.noCache ? 1 : 0)) * 31) + this.noCacheFields.hashCode()) * 31) + (this.privateFlag ? 1 : 0)) * 31) + this.privateFields.hashCode()) * 31) + (this.noStore ? 1 : 0)) * 31) + (this.noTransform ? 1 : 0)) * 31) + (this.mustRevalidate ? 1 : 0)) * 31) + (this.proxyRevalidate ? 1 : 0)) * 31) + this.cacheExtensions.hashCode();
    }

    public boolean isMustRevalidate() {
        return this.mustRevalidate;
    }

    public boolean isNoCache() {
        return this.noCache;
    }

    public boolean isNoStore() {
        return this.noStore;
    }

    public boolean isNoTransform() {
        return this.noTransform;
    }

    public boolean isPrivateFlag() {
        return this.privateFlag;
    }

    public boolean isProxyRevalidate() {
        return this.proxyRevalidate;
    }

    public void setCacheExtensions(Map<String, String> map) {
        this.cacheExtensions = map;
    }

    public void setMaxAge(int i) {
        this.maxAge = i;
    }

    public void setMustRevalidate(boolean z) {
        this.mustRevalidate = z;
    }

    public void setNoCache(boolean z) {
        this.noCache = z;
    }

    public void setNoCacheFields(List<String> list) {
        this.noCacheFields = list;
    }

    public void setNoStore(boolean z) {
        this.noStore = z;
    }

    public void setNoTransform(boolean z) {
        this.noTransform = z;
    }

    public void setPrivateFields(List<String> list) {
        this.privateFields = list;
    }

    public void setPrivateFlag(boolean z) {
        this.privateFlag = z;
    }

    public void setProxyRevalidate(boolean z) {
        this.proxyRevalidate = z;
    }

    public void setSharedMaxAge(int i) {
        this.sharedMaxAge = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!isPrivateFlag()) {
            sb.append("public");
        }
        if (isMustRevalidate()) {
            append("must-revalidate", sb);
        }
        if (isNoTransform()) {
            append("no-transform", sb);
        }
        if (isNoStore()) {
            append("no-store", sb);
        }
        if (isProxyRevalidate()) {
            append("proxy-revalidate", sb);
        }
        if (getSharedMaxAge() > -1) {
            StringBuilder sbAppend = append("s-maxage", sb);
            sbAppend.append("=");
            sbAppend.append(getSharedMaxAge());
        }
        if (getMaxAge() > -1) {
            StringBuilder sbAppend2 = append("max-age", sb);
            sbAppend2.append("=");
            sbAppend2.append(getMaxAge());
        }
        if (isNoCache()) {
            if (getNoCacheFields().size() < 1) {
                append(HttpHeaderValues.NO_CACHE, sb);
            } else {
                for (String str : getNoCacheFields()) {
                    StringBuilder sbAppend3 = append(HttpHeaderValues.NO_CACHE, sb);
                    sbAppend3.append("=\"");
                    sbAppend3.append(str);
                    sbAppend3.append("\"");
                }
            }
        }
        if (isPrivateFlag()) {
            if (getPrivateFields().size() < 1) {
                append("private", sb);
            } else {
                for (String str2 : getPrivateFields()) {
                    StringBuilder sbAppend4 = append("private", sb);
                    sbAppend4.append("=\"");
                    sbAppend4.append(str2);
                    sbAppend4.append("\"");
                }
            }
        }
        for (String str3 : getCacheExtensions().keySet()) {
            String str4 = getCacheExtensions().get(str3);
            append(str3, sb);
            if (str4 != null && !"".equals(str4)) {
                sb.append("=\"");
                sb.append(str4);
                sb.append("\"");
            }
        }
        return sb.toString();
    }
}
