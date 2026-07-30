package com.clevertap.android.sdk.inapp.evaluation;

import android.location.Location;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.Utils;
import com.p046p1.mobile.putong.core.data.Trigger;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15167a;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.C15385c;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p149l.csv;
import p149l.l9r;
import p149l.laj0;
import p149l.lw3;
import p149l.naj0;
import p149l.p2f;
import p149l.raj0;
import p149l.waj0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ%\u0010\u0014\u001a\u00020\b2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0017\u001a\u00020\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00112\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0019\u0010\u000fJ\u001f\u0010\u001a\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010!\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"J'\u0010&\u001a\u00020\b2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020%2\u0006\u0010 \u001a\u00020%H\u0001¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0001¢\u0006\u0004\b(\u0010)J'\u0010+\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010*\u001a\u00020\bH\u0001¢\u0006\u0004\b+\u0010,J\u001f\u0010-\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0001¢\u0006\u0004\b-\u0010)J\u001f\u0010.\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0001¢\u0006\u0004\b.\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010/¨\u00060"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/evaluation/TriggersMatcher;", "", "Ll/csv;", "localDataStore", "<init>", "(Ll/csv;)V", "Ll/laj0;", Trigger.TYPE, "", "k", "(Ll/laj0;)Z", "triggerAdapter", "Ll/p2f;", NotificationCompat.CATEGORY_EVENT, "m", "(Ll/laj0;Ll/p2f;)Z", RXScreenCaptureService.KEY_INDEX, "", "list", "elementToCheckForEquality", "c", "(Ljava/util/List;Ljava/lang/Object;)Z", Constants.INAPP_WHEN_TRIGGERS, "j", "(Ljava/util/List;Ll/p2f;)Z", "h", BLiveStormDanmakuGiftResourceType.f44444l, "(Ll/p2f;Ll/laj0;)Z", "Lcom/clevertap/android/sdk/inapp/evaluation/TriggerOperator;", "op", "Ll/waj0;", "expected", "actual", Constants.INAPP_DATA_TAG, "(Lcom/clevertap/android/sdk/inapp/evaluation/TriggerOperator;Ll/waj0;Ll/waj0;)Z", "", Constants.KEY_RADIUS, "Landroid/location/Location;", "e", "(DLandroid/location/Location;Landroid/location/Location;)Z", "f", "(Ll/waj0;Ll/waj0;)Z", "isLessThan", "g", "(Ll/waj0;Ll/waj0;Z)Z", "a", "b", "Ll/csv;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class TriggersMatcher {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final csv localDataStore;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.evaluation.TriggersMatcher$a */
    @Metadata(m87233k = 3, m87234mv = {2, 0, 0}, m87236xi = 48)
    public /* synthetic */ class C1232a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f5093a;

        static {
            int[] iArr = new int[TriggerOperator.values().length];
            try {
                iArr[TriggerOperator.Set.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TriggerOperator.LessThan.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TriggerOperator.GreaterThan.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TriggerOperator.Equals.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TriggerOperator.NotEquals.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TriggerOperator.Between.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TriggerOperator.Contains.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TriggerOperator.NotContains.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[TriggerOperator.NotSet.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f5093a = iArr;
        }
    }

    public TriggersMatcher(@NotNull csv csvVar) {
        csvVar.getClass();
        this.localDataStore = csvVar;
    }

    /* JADX INFO: renamed from: c */
    private final boolean m6366c(List<?> list, Object elementToCheckForEquality) {
        if (elementToCheckForEquality instanceof String) {
            List<?> list2 = list;
            Sequence<String> sequenceM93281A = SequencesKt___SequencesKt.m93281A(CollectionsKt.asSequence(list2), new Function1<Object, Boolean>() { // from class: com.clevertap.android.sdk.inapp.evaluation.TriggersMatcher$checkGivenElementEqualsAnyElementInList$$inlined$filterIsInstance$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(Object obj) {
                    return Boolean.valueOf(obj instanceof String);
                }
            });
            sequenceM93281A.getClass();
            for (String str : sequenceM93281A) {
                String lowerCase = StringsKt.m93433Z0((String) elementToCheckForEquality).toString().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                if (Intrinsics.m87488d(str, lowerCase)) {
                    return true;
                }
            }
            Sequence sequenceM93281A2 = SequencesKt___SequencesKt.m93281A(CollectionsKt.asSequence(list2), new Function1<Object, Boolean>() { // from class: com.clevertap.android.sdk.inapp.evaluation.TriggersMatcher$checkGivenElementEqualsAnyElementInList$$inlined$filterIsInstance$2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(Object obj) {
                    return Boolean.valueOf(obj instanceof Number);
                }
            });
            sequenceM93281A2.getClass();
            Iterator it = sequenceM93281A2.iterator();
            while (it.hasNext()) {
                double dDoubleValue = ((Number) it.next()).doubleValue();
                String lowerCase2 = StringsKt.m93433Z0((String) elementToCheckForEquality).toString().toLowerCase(Locale.ROOT);
                lowerCase2.getClass();
                if (Intrinsics.m87485a(dDoubleValue, C15385c.m93472m(lowerCase2))) {
                    return true;
                }
            }
            return false;
        }
        if (!(elementToCheckForEquality instanceof Number)) {
            if (elementToCheckForEquality instanceof Boolean) {
                Sequence sequenceM93281A3 = SequencesKt___SequencesKt.m93281A(CollectionsKt.asSequence(list), new Function1<Object, Boolean>() { // from class: com.clevertap.android.sdk.inapp.evaluation.TriggersMatcher$checkGivenElementEqualsAnyElementInList$$inlined$filterIsInstance$5
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function1
                    public final Boolean invoke(Object obj) {
                        return Boolean.valueOf(obj instanceof String);
                    }
                });
                sequenceM93281A3.getClass();
                Iterator it2 = sequenceM93281A3.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.m87488d((String) it2.next(), String.valueOf(((Boolean) elementToCheckForEquality).booleanValue()))) {
                        return true;
                    }
                }
            }
            return false;
        }
        double dDoubleValue2 = ((Number) elementToCheckForEquality).doubleValue();
        List<?> list3 = list;
        Sequence sequenceM93281A4 = SequencesKt___SequencesKt.m93281A(CollectionsKt.asSequence(list3), new Function1<Object, Boolean>() { // from class: com.clevertap.android.sdk.inapp.evaluation.TriggersMatcher$checkGivenElementEqualsAnyElementInList$$inlined$filterIsInstance$3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof Number);
            }
        });
        sequenceM93281A4.getClass();
        Iterator it3 = sequenceM93281A4.iterator();
        while (it3.hasNext()) {
            if (((Number) it3.next()).doubleValue() == dDoubleValue2) {
                return true;
            }
        }
        Sequence sequenceM93281A5 = SequencesKt___SequencesKt.m93281A(CollectionsKt.asSequence(list3), new Function1<Object, Boolean>() { // from class: com.clevertap.android.sdk.inapp.evaluation.TriggersMatcher$checkGivenElementEqualsAnyElementInList$$inlined$filterIsInstance$4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof String);
            }
        });
        sequenceM93281A5.getClass();
        Iterator it4 = sequenceM93281A5.iterator();
        while (it4.hasNext()) {
            String lowerCase3 = StringsKt.m93433Z0((String) it4.next()).toString().toLowerCase(Locale.ROOT);
            lowerCase3.getClass();
            if (Intrinsics.m87486b(C15385c.m93472m(lowerCase3), dDoubleValue2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    private final boolean m6367i(laj0 trigger, p2f event) {
        IntRange intRangeM87605k = C15167a.m87605k(0, trigger.m149166e());
        ArrayList<naj0> arrayList = new ArrayList();
        Iterator<Integer> it = intRangeM87605k.iterator();
        while (it.hasNext()) {
            naj0 naj0VarM149169h = trigger.m149169h(((IntIterator) it).nextInt());
            if (naj0VarM149169h != null) {
                arrayList.add(naj0VarM149169h);
            }
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        for (naj0 naj0Var : arrayList) {
            List<waj0> listM167166e = event.m167166e(naj0Var.getPropertyName());
            if (!(listM167166e instanceof Collection) || !listM167166e.isEmpty()) {
                Iterator<T> it2 = listM167166e.iterator();
                while (it2.hasNext()) {
                    if (m6372d(naj0Var.getOp(), naj0Var.getValue(), (waj0) it2.next())) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @WorkerThread
    /* JADX INFO: renamed from: k */
    private final boolean m6368k(laj0 trigger) {
        if (!trigger.getFirstTimeOnly()) {
            return true;
        }
        String profileAttrName = trigger.getProfileAttrName();
        if (profileAttrName == null) {
            profileAttrName = trigger.getEventName();
        }
        return this.localDataStore.m108601z(profileAttrName);
    }

    /* JADX INFO: renamed from: m */
    private final boolean m6369m(laj0 triggerAdapter, p2f event) {
        IntRange intRangeM87605k = C15167a.m87605k(0, triggerAdapter.m149168g());
        ArrayList<naj0> arrayList = new ArrayList();
        Iterator<Integer> it = intRangeM87605k.iterator();
        while (it.hasNext()) {
            naj0 naj0VarM149170i = triggerAdapter.m149170i(((IntIterator) it).nextInt());
            if (naj0VarM149170i != null) {
                arrayList.add(naj0VarM149170i);
            }
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        for (naj0 naj0Var : arrayList) {
            if (!m6372d(naj0Var.getOp(), naj0Var.getValue(), event.m167168g(naj0Var.getPropertyName()))) {
                return false;
            }
        }
        return true;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: a */
    public final boolean m6370a(@NotNull waj0 expected, @NotNull waj0 actual) {
        expected.getClass();
        actual.getClass();
        if (actual.getStringValue() != null && expected.getStringValue() != null) {
            String stringValueCleaned = actual.getStringValueCleaned();
            stringValueCleaned.getClass();
            String stringValueCleaned2 = expected.getStringValueCleaned();
            stringValueCleaned2.getClass();
            return StringsKt.m93412P(stringValueCleaned, stringValueCleaned2, false, 2, null);
        }
        if (expected.m202436b() && actual.getStringValue() != null) {
            List<?> listM202438d = expected.m202438d();
            listM202438d.getClass();
            Sequence<String> sequenceM93281A = SequencesKt___SequencesKt.m93281A(SequencesKt___SequencesKt.m93286F(CollectionsKt.asSequence(listM202438d)), new Function1<Object, Boolean>() { // from class: com.clevertap.android.sdk.inapp.evaluation.TriggersMatcher$actualContainsExpected$$inlined$filterIsInstance$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(Object obj) {
                    return Boolean.valueOf(obj instanceof String);
                }
            });
            sequenceM93281A.getClass();
            for (String str : sequenceM93281A) {
                String stringValueCleaned3 = actual.getStringValueCleaned();
                stringValueCleaned3.getClass();
                if (StringsKt.m93412P(stringValueCleaned3, str, false, 2, null)) {
                    return true;
                }
            }
            return false;
        }
        if (!expected.m202436b() || !actual.m202436b()) {
            if (!actual.m202436b() || expected.getStringValue() == null) {
                return false;
            }
            List<?> listM202438d2 = actual.m202438d();
            listM202438d2.getClass();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM202438d2) {
                if (obj instanceof String) {
                    arrayList.add(obj);
                }
            }
            return CollectionsKt.contains(CollectionsKt.toSet(arrayList), expected.getStringValueCleaned());
        }
        List<?> listM202438d3 = actual.m202438d();
        listM202438d3.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : listM202438d3) {
            if (obj2 instanceof String) {
                arrayList2.add(obj2);
            }
        }
        Set set = CollectionsKt.toSet(arrayList2);
        List<?> listM202438d4 = expected.m202438d();
        listM202438d4.getClass();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : listM202438d4) {
            if (obj3 instanceof String) {
                arrayList3.add(obj3);
            }
        }
        if (arrayList3.isEmpty()) {
            return false;
        }
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            if (set.contains((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: b */
    public final boolean m6371b(@NotNull waj0 expected, @NotNull waj0 actual) {
        List listTake;
        double dDoubleValue;
        expected.getClass();
        actual.getClass();
        List<?> listM202437c = expected.m202437c();
        if (listM202437c != null) {
            if (listM202437c.size() < 2) {
                listM202437c = null;
            }
            if (listM202437c != null && (listTake = CollectionsKt.take(listM202437c, 2)) != null) {
                List list = listTake;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (Object obj : list) {
                    arrayList.add(obj instanceof String ? C15385c.m93472m((String) obj) : obj instanceof Number ? Double.valueOf(((Number) obj).doubleValue()) : null);
                }
                if (arrayList.contains(null)) {
                    return false;
                }
                Number numberValue = actual.getNumberValue();
                if (numberValue != null) {
                    dDoubleValue = numberValue.doubleValue();
                } else {
                    String stringValue = actual.getStringValue();
                    Double dM93472m = stringValue != null ? C15385c.m93472m(stringValue) : null;
                    if (dM93472m != null) {
                        dDoubleValue = dM93472m.doubleValue();
                    }
                }
                Object obj2 = arrayList.get(0);
                obj2.getClass();
                double dDoubleValue2 = ((Number) obj2).doubleValue();
                Object obj3 = arrayList.get(1);
                obj3.getClass();
                if (dDoubleValue <= ((Number) obj3).doubleValue() && dDoubleValue2 <= dDoubleValue) {
                    return true;
                }
            }
        }
        return false;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: d */
    public final boolean m6372d(@NotNull TriggerOperator op, @NotNull waj0 expected, @NotNull waj0 actual) {
        op.getClass();
        expected.getClass();
        actual.getClass();
        if (actual.getValue() == null) {
            return op == TriggerOperator.NotSet;
        }
        switch (C1232a.f5093a[op.ordinal()]) {
            case 1:
                return true;
            case 2:
                return m6375g(expected, actual, true);
            case 3:
                return m6375g(expected, actual, false);
            case 4:
                return m6374f(expected, actual);
            case 5:
                return !m6374f(expected, actual);
            case 6:
                return m6371b(expected, actual);
            case 7:
                return m6370a(expected, actual);
            case 8:
                return !m6370a(expected, actual);
            default:
                l9r.m149037a();
            case 9:
                return false;
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: e */
    public final boolean m6373e(double radius, @NotNull Location expected, @NotNull Location actual) {
        expected.getClass();
        actual.getClass();
        return Utils.m5924u(expected, actual) <= radius;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: f */
    public final boolean m6374f(@NotNull waj0 expected, @NotNull waj0 actual) {
        Double dM93472m;
        double dDoubleValue;
        expected.getClass();
        actual.getClass();
        if (expected.m202436b() && actual.m202436b()) {
            List<?> listM202438d = expected.m202438d();
            listM202438d.getClass();
            HashSet hashSet = CollectionsKt.toHashSet(listM202438d);
            List<?> listM202438d2 = actual.m202438d();
            listM202438d2.getClass();
            return Intrinsics.m87488d(hashSet, CollectionsKt.toHashSet(listM202438d2));
        }
        if (actual.m202436b()) {
            List<?> listM202438d3 = actual.m202438d();
            listM202438d3.getClass();
            return m6366c(listM202438d3, expected.getValue());
        }
        if (expected.m202436b()) {
            List<?> listM202438d4 = expected.m202438d();
            listM202438d4.getClass();
            return m6366c(listM202438d4, actual.getValue());
        }
        if (expected.getNumberValue() != null) {
            Number numberValue = actual.getNumberValue();
            if (numberValue == null) {
                String stringValueCleaned = actual.getStringValueCleaned();
                Double dM93472m2 = stringValueCleaned != null ? C15385c.m93472m(stringValueCleaned) : null;
                if (dM93472m2 != null) {
                    dDoubleValue = dM93472m2.doubleValue();
                }
            }
            dDoubleValue = numberValue.doubleValue();
            Number numberValue2 = expected.getNumberValue();
            numberValue2.getClass();
            return numberValue2.doubleValue() == dDoubleValue;
        }
        if (actual.getNumberValue() == null) {
            if (actual.getStringValue() != null) {
                return Intrinsics.m87488d(expected.getStringValueCleaned(), actual.getStringValueCleaned());
            }
            return false;
        }
        String stringValueCleaned2 = expected.getStringValueCleaned();
        if (stringValueCleaned2 != null && (dM93472m = C15385c.m93472m(stringValueCleaned2)) != null) {
            double dDoubleValue2 = dM93472m.doubleValue();
            Number numberValue3 = actual.getNumberValue();
            numberValue3.getClass();
            if (numberValue3.doubleValue() == dDoubleValue2) {
                return true;
            }
        }
        return false;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: g */
    public final boolean m6375g(@NotNull waj0 expected, @NotNull waj0 actual, boolean isLessThan) {
        double dDoubleValue;
        double dDoubleValue2;
        Object objFirstOrNull;
        Double dValueOf;
        expected.getClass();
        actual.getClass();
        Number numberValue = actual.getNumberValue();
        if (numberValue == null) {
            String stringValue = actual.getStringValue();
            Double dM93472m = stringValue != null ? C15385c.m93472m(stringValue) : null;
            if (dM93472m != null) {
                dDoubleValue = dM93472m.doubleValue();
            }
        }
        dDoubleValue = numberValue.doubleValue();
        List<?> listM202437c = expected.m202437c();
        if (listM202437c != null && (objFirstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) listM202437c)) != null) {
            if (objFirstOrNull instanceof String) {
                dValueOf = C15385c.m93472m((String) objFirstOrNull);
            } else {
                dValueOf = objFirstOrNull instanceof Number ? Double.valueOf(((Number) objFirstOrNull).doubleValue()) : null;
            }
            if (dValueOf != null) {
                double dDoubleValue3 = dValueOf.doubleValue();
                if (isLessThan) {
                    return dDoubleValue < dDoubleValue3;
                }
                return dDoubleValue > dDoubleValue3;
            }
        }
        Number numberValue2 = expected.getNumberValue();
        if (numberValue2 == null) {
            String stringValue2 = expected.getStringValue();
            Double dM93472m2 = stringValue2 != null ? C15385c.m93472m(stringValue2) : null;
            if (dM93472m2 != null) {
                dDoubleValue2 = dM93472m2.doubleValue();
            }
        }
        dDoubleValue2 = numberValue2.doubleValue();
        if (isLessThan) {
            return dDoubleValue < dDoubleValue2;
        }
        return dDoubleValue > dDoubleValue2;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: h */
    public final boolean m6376h(@NotNull laj0 trigger, @NotNull p2f event) {
        trigger.getClass();
        event.getClass();
        if ((!Utils.m5904a(event.getEventName(), trigger.getEventName()) && (event.getProfileAttrName() == null || !Utils.m5904a(event.getProfileAttrName(), trigger.getProfileAttrName()))) || !m6369m(trigger, event) || !m6368k(trigger)) {
            return false;
        }
        if (!event.m167170i() || m6367i(trigger, event)) {
            return trigger.m149165d() <= 0 || m6378l(event, trigger);
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m6377j(@NotNull List<laj0> whenTriggers, @NotNull p2f event) {
        whenTriggers.getClass();
        event.getClass();
        List<laj0> list = whenTriggers;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (m6376h((laj0) it.next(), event)) {
                return true;
            }
        }
        return false;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: l */
    public final boolean m6378l(@NotNull p2f event, @NotNull laj0 trigger) {
        event.getClass();
        trigger.getClass();
        if (event.getUserLocation() != null && lw3.m151950t(event.getUserLocation())) {
            int iM149165d = trigger.m149165d();
            for (int i = 0; i < iM149165d; i++) {
                raj0 raj0VarM149162a = trigger.m149162a(i);
                Location location = new Location("");
                raj0VarM149162a.getClass();
                location.setLatitude(raj0VarM149162a.getLatitude());
                location.setLongitude(raj0VarM149162a.getLongitude());
                try {
                    if (m6373e(raj0VarM149162a.getCom.clevertap.android.sdk.Constants.KEY_RADIUS java.lang.String(), location, event.getUserLocation())) {
                        return true;
                    }
                } catch (Exception e) {
                    Logger.m5865d("Error matching GeoRadius triggers for event named " + event.getEventName() + ". Reason: " + e.getLocalizedMessage());
                }
            }
        }
        return false;
    }
}
