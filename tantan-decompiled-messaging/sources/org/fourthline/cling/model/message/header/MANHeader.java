package org.fourthline.cling.model.message.header;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p149l.kow;

/* JADX INFO: loaded from: classes3.dex */
public class MANHeader extends UpnpHeader<String> {
    public String namespace;
    public static final Pattern PATTERN = Pattern.compile("\"(.+?)\"(;.+?)??");
    public static final Pattern NAMESPACE_PATTERN = Pattern.compile(";\\s?ns\\s?=\\s?([0-9]{2})");

    public MANHeader(String str) {
        setValue(str);
    }

    public String getNamespace() {
        return this.namespace;
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        if (getValue() == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder("\"");
        sb.append(getValue());
        sb.append("\"");
        if (getNamespace() != null) {
            sb.append("; ns=");
            sb.append(getNamespace());
        }
        return sb.toString();
    }

    public void setNamespace(String str) {
        this.namespace = str;
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) throws InvalidHeaderException {
        Matcher matcher = PATTERN.matcher(str);
        if (!matcher.matches()) {
            kow.m146757a("Invalid MAN header value: ", str);
            return;
        }
        setValue(matcher.group(1));
        if (matcher.group(2) != null) {
            Matcher matcher2 = NAMESPACE_PATTERN.matcher(matcher.group(2));
            if (matcher2.matches()) {
                setNamespace(matcher2.group(1));
            } else {
                kow.m146757a("Invalid namespace in MAN header value: ", str);
            }
        }
    }

    public MANHeader() {
    }

    public MANHeader(String str, String str2) {
        this(str);
        this.namespace = str2;
    }
}
