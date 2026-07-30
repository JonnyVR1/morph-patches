package org.eclipse.jetty.http;

import java.io.UnsupportedEncodingException;
import org.eclipse.jetty.util.MultiMap;
import org.eclipse.jetty.util.StringUtil;
import org.eclipse.jetty.util.TypeUtil;
import org.eclipse.jetty.util.URIUtil;
import org.eclipse.jetty.util.UrlEncoded;
import org.eclipse.jetty.util.Utf8StringBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class EncodedHttpURI extends HttpURI {
    private final String _encoding;

    public EncodedHttpURI(String str) {
        this._encoding = str;
    }

    @Override // org.eclipse.jetty.http.HttpURI
    public void decodeQueryTo(MultiMap multiMap) {
        int i = this._query;
        int i2 = this._fragment;
        if (i == i2) {
            return;
        }
        UrlEncoded.decodeTo(StringUtil.toString(this._raw, i + 1, (i2 - i) - 1, this._encoding), multiMap, this._encoding);
    }

    @Override // org.eclipse.jetty.http.HttpURI
    public String getAuthority() {
        int i = this._authority;
        int i2 = this._path;
        if (i == i2) {
            return null;
        }
        return StringUtil.toString(this._raw, i, i2 - i, this._encoding);
    }

    @Override // org.eclipse.jetty.http.HttpURI
    public String getCompletePath() {
        int i = this._path;
        int i2 = this._end;
        if (i == i2) {
            return null;
        }
        return StringUtil.toString(this._raw, i, i2 - i, this._encoding);
    }

    @Override // org.eclipse.jetty.http.HttpURI
    public String getDecodedPath() {
        int i = this._path;
        int i2 = this._param;
        if (i == i2) {
            return null;
        }
        return URIUtil.decodePath(this._raw, i, i2 - i);
    }

    @Override // org.eclipse.jetty.http.HttpURI
    public String getFragment() {
        int i = this._fragment;
        int i2 = this._end;
        if (i == i2) {
            return null;
        }
        return StringUtil.toString(this._raw, i + 1, (i2 - i) - 1, this._encoding);
    }

    @Override // org.eclipse.jetty.http.HttpURI
    public String getHost() {
        int i = this._host;
        int i2 = this._port;
        if (i == i2) {
            return null;
        }
        return StringUtil.toString(this._raw, i, i2 - i, this._encoding);
    }

    @Override // org.eclipse.jetty.http.HttpURI
    public String getParam() {
        int i = this._param;
        int i2 = this._query;
        if (i == i2) {
            return null;
        }
        return StringUtil.toString(this._raw, i + 1, (i2 - i) - 1, this._encoding);
    }

    @Override // org.eclipse.jetty.http.HttpURI
    public String getPath() {
        int i = this._path;
        int i2 = this._param;
        if (i == i2) {
            return null;
        }
        return StringUtil.toString(this._raw, i, i2 - i, this._encoding);
    }

    @Override // org.eclipse.jetty.http.HttpURI
    public String getPathAndParam() {
        int i = this._path;
        int i2 = this._query;
        if (i == i2) {
            return null;
        }
        return StringUtil.toString(this._raw, i, i2 - i, this._encoding);
    }

    @Override // org.eclipse.jetty.http.HttpURI
    public int getPort() {
        int i = this._port;
        int i2 = this._path;
        if (i == i2) {
            return -1;
        }
        return TypeUtil.parseInt(this._raw, i + 1, (i2 - i) - 1, 10);
    }

    @Override // org.eclipse.jetty.http.HttpURI
    public String getQuery() {
        int i = this._query;
        int i2 = this._fragment;
        if (i == i2) {
            return null;
        }
        return StringUtil.toString(this._raw, i + 1, (i2 - i) - 1, this._encoding);
    }

    @Override // org.eclipse.jetty.http.HttpURI
    public String getScheme() {
        int i = this._scheme;
        int i2 = this._authority;
        if (i == i2) {
            return null;
        }
        int i3 = i2 - i;
        if (i3 == 5) {
            byte[] bArr = this._raw;
            if (bArr[i] == 104 && bArr[i + 1] == 116 && bArr[i + 2] == 116 && bArr[i + 3] == 112) {
                return "http";
            }
        }
        if (i3 == 6) {
            byte[] bArr2 = this._raw;
            if (bArr2[i] == 104 && bArr2[i + 1] == 116 && bArr2[i + 2] == 116 && bArr2[i + 3] == 112 && bArr2[i + 4] == 115) {
                return "https";
            }
        }
        return StringUtil.toString(this._raw, i, (i2 - i) - 1, this._encoding);
    }

    @Override // org.eclipse.jetty.http.HttpURI
    public boolean hasQuery() {
        return this._fragment > this._query;
    }

    @Override // org.eclipse.jetty.http.HttpURI
    public String toString() {
        if (this._rawString == null) {
            byte[] bArr = this._raw;
            int i = this._scheme;
            this._rawString = StringUtil.toString(bArr, i, this._end - i, this._encoding);
        }
        return this._rawString;
    }

    public void writeTo(Utf8StringBuffer utf8StringBuffer) {
        utf8StringBuffer.getStringBuffer().append(toString());
    }

    @Override // org.eclipse.jetty.http.HttpURI
    public void decodeQueryTo(MultiMap multiMap, String str) throws UnsupportedEncodingException {
        int i = this._query;
        int i2 = this._fragment;
        if (i == i2) {
            return;
        }
        if (str == null) {
            str = this._encoding;
        }
        UrlEncoded.decodeTo(StringUtil.toString(this._raw, i + 1, (i2 - i) - 1, str), multiMap, str);
    }
}
