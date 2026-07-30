package org.eclipse.jetty.servlet;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ServletMapping {
    private boolean _default;
    private String[] _pathSpecs;
    private String _servletName;

    public void dump(Appendable appendable, String str) throws IOException {
        appendable.append(String.valueOf(this)).append("\n");
    }

    public String[] getPathSpecs() {
        return this._pathSpecs;
    }

    public String getServletName() {
        return this._servletName;
    }

    public boolean isDefault() {
        return this._default;
    }

    public void setDefault(boolean z) {
        this._default = z;
    }

    public void setPathSpec(String str) {
        this._pathSpecs = new String[]{str};
    }

    public void setPathSpecs(String[] strArr) {
        this._pathSpecs = strArr;
    }

    public void setServletName(String str) {
        this._servletName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = this._pathSpecs;
        sb.append(strArr == null ? "[]" : Arrays.asList(strArr).toString());
        sb.append("=>");
        sb.append(this._servletName);
        return sb.toString();
    }
}
