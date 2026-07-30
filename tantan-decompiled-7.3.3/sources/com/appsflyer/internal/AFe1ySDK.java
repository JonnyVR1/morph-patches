package com.appsflyer.internal;

import com.google.android.exoplayer2.PlaybackException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFe1ySDK {
    @Nullable
    public static final Pair<Integer, Integer> AFAdRevenueData(@NotNull String str) {
        String value;
        String value2;
        String value3;
        String value4;
        String value5;
        String value6;
        str.getClass();
        MatchResult matchResultMatchEntire = new Regex("(\\d+).(\\d+).(\\d+)-(\\d+).(\\d+).(\\d+)").matchEntire(str);
        if (matchResultMatchEntire != null) {
            MatchGroup matchGroup = matchResultMatchEntire.mo94254b().get(1);
            Integer intOrNull = (matchGroup == null || (value6 = matchGroup.getValue()) == null) ? null : StringsKt.toIntOrNull(value6);
            MatchGroup matchGroup2 = matchResultMatchEntire.mo94254b().get(2);
            Integer intOrNull2 = (matchGroup2 == null || (value5 = matchGroup2.getValue()) == null) ? null : StringsKt.toIntOrNull(value5);
            MatchGroup matchGroup3 = matchResultMatchEntire.mo94254b().get(3);
            Integer intOrNull3 = (matchGroup3 == null || (value4 = matchGroup3.getValue()) == null) ? null : StringsKt.toIntOrNull(value4);
            MatchGroup matchGroup4 = matchResultMatchEntire.mo94254b().get(4);
            Integer intOrNull4 = (matchGroup4 == null || (value3 = matchGroup4.getValue()) == null) ? null : StringsKt.toIntOrNull(value3);
            MatchGroup matchGroup5 = matchResultMatchEntire.mo94254b().get(5);
            Integer intOrNull5 = (matchGroup5 == null || (value2 = matchGroup5.getValue()) == null) ? null : StringsKt.toIntOrNull(value2);
            MatchGroup matchGroup6 = matchResultMatchEntire.mo94254b().get(6);
            Integer intOrNull6 = (matchGroup6 == null || (value = matchGroup6.getValue()) == null) ? null : StringsKt.toIntOrNull(value);
            Integer num = intOrNull6;
            if (getMonetizationNetwork(intOrNull, intOrNull2, intOrNull3, intOrNull4, intOrNull5, intOrNull6)) {
                intOrNull.getClass();
                int iIntValue = intOrNull.intValue() * PlaybackException.CUSTOM_ERROR_CODE_BASE;
                intOrNull2.getClass();
                int iIntValue2 = iIntValue + (intOrNull2.intValue() * 1000);
                intOrNull3.getClass();
                Integer numValueOf = Integer.valueOf(iIntValue2 + intOrNull3.intValue());
                intOrNull4.getClass();
                int iIntValue3 = intOrNull4.intValue() * PlaybackException.CUSTOM_ERROR_CODE_BASE;
                intOrNull5.getClass();
                int iIntValue4 = iIntValue3 + (intOrNull5.intValue() * 1000);
                num.getClass();
                return TuplesKt.m88129a(numValueOf, Integer.valueOf(iIntValue4 + num.intValue()));
            }
        }
        return null;
    }

    private static boolean getMonetizationNetwork(@NotNull Object... objArr) {
        objArr.getClass();
        return !ArraysKt.contains(objArr, (Object) null);
    }

    @Nullable
    public static final Pair<Integer, Integer> getRevenue(@NotNull String str) {
        String value;
        String value2;
        String value3;
        str.getClass();
        MatchResult matchResultMatchEntire = new Regex("^(\\d+).(\\+)$|^(\\d+).(\\d+).(\\+)$").matchEntire(str);
        if (matchResultMatchEntire != null) {
            MatchGroup matchGroup = matchResultMatchEntire.mo94254b().get(1);
            Integer intOrNull = (matchGroup == null || (value3 = matchGroup.getValue()) == null) ? null : StringsKt.toIntOrNull(value3);
            MatchGroup matchGroup2 = matchResultMatchEntire.mo94254b().get(3);
            Integer intOrNull2 = (matchGroup2 == null || (value2 = matchGroup2.getValue()) == null) ? null : StringsKt.toIntOrNull(value2);
            MatchGroup matchGroup3 = matchResultMatchEntire.mo94254b().get(4);
            Integer intOrNull3 = (matchGroup3 == null || (value = matchGroup3.getValue()) == null) ? null : StringsKt.toIntOrNull(value);
            if (intOrNull != null) {
                return TuplesKt.m88129a(Integer.valueOf(intOrNull.intValue() * PlaybackException.CUSTOM_ERROR_CODE_BASE), Integer.valueOf(((intOrNull.intValue() + 1) * PlaybackException.CUSTOM_ERROR_CODE_BASE) - 1));
            }
            if (intOrNull2 != null && intOrNull3 != null) {
                return TuplesKt.m88129a(Integer.valueOf((intOrNull2.intValue() * PlaybackException.CUSTOM_ERROR_CODE_BASE) + (intOrNull3.intValue() * 1000)), Integer.valueOf(((intOrNull2.intValue() * PlaybackException.CUSTOM_ERROR_CODE_BASE) + ((intOrNull3.intValue() + 1) * 1000)) - 1));
            }
        }
        return null;
    }

    public static final String getRevenue(String str, String str2) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str2);
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        bytes.getClass();
        byte[] bArrDigest = messageDigest.digest(bytes);
        bArrDigest.getClass();
        String strConcat = "";
        for (byte b : bArrDigest) {
            strConcat = strConcat.concat(String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1)));
        }
        return strConcat;
    }
}
