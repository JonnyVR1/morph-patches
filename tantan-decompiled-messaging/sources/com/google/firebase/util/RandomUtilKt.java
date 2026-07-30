package com.google.firebase.util;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.ranges.C15167a;
import kotlin.ranges.IntRange;
import kotlin.text.C15390h;
import org.jetbrains.annotations.NotNull;
import p149l.jck0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0012\u0010\u0004\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003¨\u0006\b"}, m87232d2 = {"ALPHANUMERIC_ALPHABET", "", "getALPHANUMERIC_ALPHABET$annotations", "()V", "nextAlphanumericString", "Lkotlin/random/Random;", "length", "", "com.google.firebase-firebase-common"}, m87233k = 2, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class RandomUtilKt {

    @NotNull
    private static final String ALPHANUMERIC_ALPHABET = "23456789abcdefghjkmnpqrstvwxyz";

    private static /* synthetic */ void getALPHANUMERIC_ALPHABET$annotations() {
    }

    @NotNull
    public static final String nextAlphanumericString(@NotNull Random random, int i) {
        random.getClass();
        if (i < 0) {
            jck0.m140980a("invalid length: ", i);
            return null;
        }
        IntRange intRangeM87605k = C15167a.m87605k(0, i);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeM87605k, 10));
        Iterator<Integer> it = intRangeM87605k.iterator();
        while (it.hasNext()) {
            ((IntIterator) it).nextInt();
            arrayList.add(Character.valueOf(C15390h.m93496d1(ALPHANUMERIC_ALPHABET, random)));
        }
        return CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
    }
}
