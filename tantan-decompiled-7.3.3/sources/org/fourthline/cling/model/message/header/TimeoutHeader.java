package org.fourthline.cling.model.message.header;

import com.google.android.gms.common.api.Api;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p153l.jrw;

/* JADX INFO: loaded from: classes3.dex */
public class TimeoutHeader extends UpnpHeader<Integer> {
    public static final Integer INFINITE_VALUE = Integer.valueOf(Api.BaseClientBuilder.API_PRIORITY_OTHER);
    public static final Pattern PATTERN = Pattern.compile("Second-(?:([0-9]+)|infinite)");

    public TimeoutHeader() {
        setValue(1800);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        StringBuilder sb = new StringBuilder("Second-");
        sb.append(getValue().equals(INFINITE_VALUE) ? "infinite" : getValue());
        return sb.toString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) throws InvalidHeaderException {
        Matcher matcher = PATTERN.matcher(str);
        if (!matcher.matches()) {
            jrw.m146822a("Can't parse timeout seconds integer from: ", str);
        } else if (matcher.group(1) != null) {
            setValue(Integer.valueOf(Integer.parseInt(matcher.group(1))));
        } else {
            setValue(INFINITE_VALUE);
        }
    }

    public TimeoutHeader(int i) {
        setValue(Integer.valueOf(i));
    }

    public TimeoutHeader(Integer num) {
        setValue(num);
    }
}
