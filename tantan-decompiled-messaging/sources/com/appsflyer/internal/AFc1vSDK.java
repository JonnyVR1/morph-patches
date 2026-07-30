package com.appsflyer.internal;

import com.google.android.exoplayer2.PlaybackException;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1vSDK {
    public static final int getCurrencyIso4217Code(@NotNull String str) {
        String value;
        Integer intOrNull;
        String value2;
        Integer intOrNull2;
        String value3;
        Integer intOrNull3;
        str.getClass();
        MatchResult matchResultMatchEntire = new Regex("(\\d+).(\\d+).(\\d+).*").matchEntire(str);
        if (matchResultMatchEntire == null) {
            return -1;
        }
        MatchGroup matchGroup = matchResultMatchEntire.mo93363b().get(1);
        int iIntValue = 0;
        int iIntValue2 = ((matchGroup == null || (value3 = matchGroup.getValue()) == null || (intOrNull3 = StringsKt.toIntOrNull(value3)) == null) ? 0 : intOrNull3.intValue()) * PlaybackException.CUSTOM_ERROR_CODE_BASE;
        MatchGroup matchGroup2 = matchResultMatchEntire.mo93363b().get(2);
        int iIntValue3 = iIntValue2 + (((matchGroup2 == null || (value2 = matchGroup2.getValue()) == null || (intOrNull2 = StringsKt.toIntOrNull(value2)) == null) ? 0 : intOrNull2.intValue()) * 1000);
        MatchGroup matchGroup3 = matchResultMatchEntire.mo93363b().get(3);
        if (matchGroup3 != null && (value = matchGroup3.getValue()) != null && (intOrNull = StringsKt.toIntOrNull(value)) != null) {
            iIntValue = intOrNull.intValue();
        }
        return iIntValue3 + iIntValue;
    }
}
