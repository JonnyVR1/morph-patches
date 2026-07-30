package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class HttpDataSource$InvalidResponseCodeException extends HttpDataSource$HttpDataSourceException {
    public final Map<String, List<String>> headerFields;
    public final byte[] responseBody;
    public final int responseCode;

    @Nullable
    public final String responseMessage;

    public HttpDataSource$InvalidResponseCodeException(int i, @Nullable String str, @Nullable IOException iOException, Map<String, List<String>> map, C2070a c2070a, byte[] bArr) {
        super("Response code: " + i, iOException, c2070a, 2004, 1);
        this.responseCode = i;
        this.responseMessage = str;
        this.headerFields = map;
        this.responseBody = bArr;
    }
}
