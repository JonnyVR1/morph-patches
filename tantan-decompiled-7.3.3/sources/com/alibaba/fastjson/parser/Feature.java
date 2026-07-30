package com.alibaba.fastjson.parser;

/* JADX INFO: loaded from: classes.dex */
public enum Feature {
    AutoCloseSource,
    AllowComment,
    AllowUnQuotedFieldNames,
    AllowSingleQuotes,
    InternFieldNames,
    AllowISO8601DateFormat,
    AllowArbitraryCommas,
    UseBigDecimal,
    IgnoreNotMatch,
    SortFeidFastMatch,
    DisableASM,
    DisableCircularReferenceDetect,
    InitStringFieldAsEmpty,
    SupportArrayToBean,
    OrderedField,
    DisableSpecialKeyDetect,
    UseObjectArray,
    SupportNonPublicField,
    IgnoreAutoType,
    DisableFieldSmartMatch,
    SupportAutoType,
    NonStringKeyAsString,
    CustomMapDeserializer,
    ErrorOnEnumNotMatch;

    public final int mask = 1 << ordinal();

    Feature() {
    }

    public static int config(int i, Feature feature, boolean z) {
        return z ? i | feature.mask : i & (~feature.mask);
    }

    public static boolean isEnabled(int i, Feature feature) {
        return (i & feature.mask) != 0;
    }

    /* JADX INFO: renamed from: of */
    public static int m4811of(Feature[] featureArr) {
        if (featureArr == null) {
            return 0;
        }
        int i = 0;
        for (Feature feature : featureArr) {
            i |= feature.mask;
        }
        return i;
    }

    public final int getMask() {
        return this.mask;
    }
}
