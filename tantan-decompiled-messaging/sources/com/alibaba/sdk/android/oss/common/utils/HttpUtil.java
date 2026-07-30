package com.alibaba.sdk.android.oss.common.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes.dex */
public class HttpUtil {
    private static final String[] ENCODED_CHARACTERS_WITH_SLASHES = {Marker.ANY_NON_NULL_MARKER, "*", "%7E", "%2F"};
    private static final String[] ENCODED_CHARACTERS_WITH_SLASHES_REPLACEMENTS = {"%20", "%2A", "~", "/"};
    private static final String[] ENCODED_CHARACTERS_WITHOUT_SLASHES = {Marker.ANY_NON_NULL_MARKER, "*", "%7E"};
    private static final String[] ENCODED_CHARACTERS_WITHOUT_SLASHES_REPLACEMENTS = {"%20", "%2A", "~"};

    public static String paramToQueryString(Map<String, String> map, String str) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!z) {
                sb.append("&");
            }
            sb.append(urlEncode(key, str));
            if (value != null) {
                sb.append("=");
                sb.append(urlEncode(value, str));
            }
            z = false;
        }
        return sb.toString();
    }

    public static String urlEncode(String str, String str2) {
        if (str == null) {
            return "";
        }
        try {
            return URLEncoder.encode(str, str2).replace(Marker.ANY_NON_NULL_MARKER, "%20").replace("*", "%2A").replace("%7E", "~").replace("%2F", "/");
        } catch (Exception e) {
            throw new IllegalArgumentException("failed to encode url!", e);
        }
    }

    public static String urlEncode(String str, boolean z) {
        if (str == null) {
            return "";
        }
        try {
            String strEncode = URLEncoder.encode(str, "utf-8");
            if (!z) {
                return StringUtils.replaceEach(strEncode, ENCODED_CHARACTERS_WITHOUT_SLASHES, ENCODED_CHARACTERS_WITHOUT_SLASHES_REPLACEMENTS);
            }
            return StringUtils.replaceEach(strEncode, ENCODED_CHARACTERS_WITH_SLASHES, ENCODED_CHARACTERS_WITH_SLASHES_REPLACEMENTS);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException("FailedToEncodeUri", e);
        }
    }
}
