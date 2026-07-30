package com.google.android.datatransport.cct;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.EncodedDestination;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import p153l.wg3;

/* JADX INFO: loaded from: classes6.dex */
public final class CCTDestination implements EncodedDestination {
    private static final String DEFAULT_API_KEY;
    static final String DEFAULT_END_POINT;
    static final String DESTINATION_NAME = "cct";
    private static final String EXTRAS_DELIMITER = "\\";
    private static final String EXTRAS_VERSION_MARKER = "1$";
    public static final CCTDestination INSTANCE;
    static final String LEGACY_END_POINT;
    public static final CCTDestination LEGACY_INSTANCE;
    private static final Set<Encoding> SUPPORTED_ENCODINGS;

    @Nullable
    private final String apiKey;

    @NonNull
    private final String endPoint;

    static {
        String strMergeStrings = StringMerger.mergeStrings("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        DEFAULT_END_POINT = strMergeStrings;
        String strMergeStrings2 = StringMerger.mergeStrings("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        LEGACY_END_POINT = strMergeStrings2;
        String strMergeStrings3 = StringMerger.mergeStrings("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        DEFAULT_API_KEY = strMergeStrings3;
        SUPPORTED_ENCODINGS = Collections.unmodifiableSet(new HashSet(Arrays.asList(Encoding.m9346of("proto"), Encoding.m9346of("json"))));
        INSTANCE = new CCTDestination(strMergeStrings, null);
        LEGACY_INSTANCE = new CCTDestination(strMergeStrings2, strMergeStrings3);
    }

    public CCTDestination(@NonNull String str, @Nullable String str2) {
        this.endPoint = str;
        this.apiKey = str2;
    }

    @NonNull
    public static String decodeExtras(@NonNull byte[] bArr) {
        return new String(bArr, Charset.forName("UTF-8"));
    }

    @NonNull
    public static byte[] encodeString(@NonNull String str) {
        return str.getBytes(Charset.forName("UTF-8"));
    }

    @NonNull
    public static CCTDestination fromByteArray(@NonNull byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith(EXTRAS_VERSION_MARKER)) {
            wg3.m206174a("Version marker missing from extras");
            return null;
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote(EXTRAS_DELIMITER), 2);
        if (strArrSplit.length != 2) {
            wg3.m206174a("Extra is not a valid encoded LegacyFlgDestination");
            return null;
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            wg3.m206174a("Missing endpoint in CCTDestination extras");
            return null;
        }
        String str3 = strArrSplit[1];
        return new CCTDestination(str2, str3.isEmpty() ? null : str3);
    }

    @Nullable
    public byte[] asByteArray() {
        String str = this.apiKey;
        if (str == null && this.endPoint == null) {
            return null;
        }
        String str2 = this.endPoint;
        if (str == null) {
            str = "";
        }
        return String.format("%s%s%s%s", EXTRAS_VERSION_MARKER, str2, EXTRAS_DELIMITER, str).getBytes(Charset.forName("UTF-8"));
    }

    @Nullable
    public String getAPIKey() {
        return this.apiKey;
    }

    @NonNull
    public String getEndPoint() {
        return this.endPoint;
    }

    @Override // com.google.android.datatransport.runtime.Destination
    @Nullable
    public byte[] getExtras() {
        return asByteArray();
    }

    @Override // com.google.android.datatransport.runtime.Destination
    @NonNull
    public String getName() {
        return DESTINATION_NAME;
    }

    @Override // com.google.android.datatransport.runtime.EncodedDestination
    public Set<Encoding> getSupportedEncodings() {
        return SUPPORTED_ENCODINGS;
    }
}
