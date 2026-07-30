package com.google.firebase.remoteconfig.internal;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;
import com.meituan.robust.Constants;
import p153l.gzi0;
import p153l.wg3;

/* JADX INFO: loaded from: classes7.dex */
public class FirebaseRemoteConfigValueImpl implements FirebaseRemoteConfigValue {
    private static final String ILLEGAL_ARGUMENT_STRING_FORMAT = "[Value: %s] cannot be converted to a %s.";
    private final int source;
    private final String value;

    public FirebaseRemoteConfigValueImpl(String str, int i) {
        this.value = str;
        this.source = i;
    }

    private String asTrimmedString() {
        return asString().trim();
    }

    private void throwIfNullValue() {
        if (this.value != null) {
            return;
        }
        wg3.m206174a("Value is null, and cannot be converted to the desired type.");
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public boolean asBoolean() throws IllegalArgumentException {
        if (this.source == 0) {
            return false;
        }
        String strAsTrimmedString = asTrimmedString();
        if (ConfigGetParameterHandler.TRUE_REGEX.matcher(strAsTrimmedString).matches()) {
            return true;
        }
        if (ConfigGetParameterHandler.FALSE_REGEX.matcher(strAsTrimmedString).matches()) {
            return false;
        }
        gzi0.m133102a(ILLEGAL_ARGUMENT_STRING_FORMAT, new Object[]{strAsTrimmedString, Constants.BOOLEAN});
        return false;
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public byte[] asByteArray() {
        return this.source == 0 ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_BYTE_ARRAY : this.value.getBytes(ConfigGetParameterHandler.FRC_BYTE_ARRAY_ENCODING);
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public double asDouble() {
        if (this.source == 0) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        String strAsTrimmedString = asTrimmedString();
        try {
            return Double.valueOf(strAsTrimmedString).doubleValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format(ILLEGAL_ARGUMENT_STRING_FORMAT, strAsTrimmedString, Constants.DOUBLE), e);
        }
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public long asLong() {
        if (this.source == 0) {
            return 0L;
        }
        String strAsTrimmedString = asTrimmedString();
        try {
            return Long.valueOf(strAsTrimmedString).longValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format(ILLEGAL_ARGUMENT_STRING_FORMAT, strAsTrimmedString, Constants.LONG), e);
        }
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public String asString() {
        if (this.source == 0) {
            return "";
        }
        throwIfNullValue();
        return this.value;
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigValue
    public int getSource() {
        return this.source;
    }
}
