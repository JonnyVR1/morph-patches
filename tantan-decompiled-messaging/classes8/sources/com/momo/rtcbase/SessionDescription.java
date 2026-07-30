package com.momo.rtcbase;

import java.util.Locale;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class SessionDescription {
    public final String description;
    public final Type type;

    public enum Type {
        OFFER,
        PRANSWER,
        ANSWER;

        public String canonicalForm() {
            return name().toLowerCase(Locale.US);
        }
    }

    @CalledByNative
    public SessionDescription(Type type, String str) {
        this.type = type;
        this.description = str;
    }

    @CalledByNative
    public String getDescription() {
        return this.description;
    }

    @CalledByNative
    public String getTypeInCanonicalForm() {
        return this.type.canonicalForm();
    }
}
