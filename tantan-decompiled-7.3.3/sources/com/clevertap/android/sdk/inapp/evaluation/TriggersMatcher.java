package com.clevertap.android.sdk.inapp.evaluation;

import android.location.Location;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.Utils;
import com.p051p1.mobile.putong.core.data.Trigger;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import kotlin.ranges.C15274a;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.C15492c;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p153l.akj0;
import p153l.duv;
import p153l.kx3;
import p153l.nbr;
import p153l.pjj0;
import p153l.rjj0;
import p153l.u3f;
import p153l.vjj0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ%\u0010\u0014\u001a\u00020\b2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0017\u001a\u00020\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00112\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0019\u0010\u000fJ\u001f\u0010\u001a\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010!\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"J'\u0010&\u001a\u00020\b2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020%2\u0006\u0010 \u001a\u00020%H\u0001¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0001¢\u0006\u0004\b(\u0010)J'\u0010+\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010*\u001a\u00020\bH\u0001¢\u0006\u0004\b+\u0010,J\u001f\u0010-\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0001¢\u0006\u0004\b-\u0010)J\u001f\u0010.\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0001¢\u0006\u0004\b.\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010/¨\u00060"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/evaluation/TriggersMatcher;", "", "Ll/duv;", "localDataStore", "<init>", "(Ll/duv;)V", "Ll/pjj0;", Trigger.TYPE, "", "k", "(Ll/pjj0;)Z", "triggerAdapter", "Ll/u3f;", NotificationCompat.CATEGORY_EVENT, "m", "(Ll/pjj0;Ll/u3f;)Z", RXScreenCaptureService.KEY_INDEX, "", "list", "elementToCheckForEquality", "c", "(Ljava/util/List;Ljava/lang/Object;)Z", Constants.INAPP_WHEN_TRIGGERS, "j", "(Ljava/util/List;Ll/u3f;)Z", "h", BLiveStormDanmakuGiftResourceType.f45292l, "(Ll/u3f;Ll/pjj0;)Z", "Lcom/clevertap/android/sdk/inapp/evaluation/TriggerOperator;", "op", "Ll/akj0;", "expected", "actual", Constants.INAPP_DATA_TAG, "(Lcom/clevertap/android/sdk/inapp/evaluation/TriggerOperator;Ll/akj0;Ll/akj0;)Z", "", Constants.KEY_RADIUS, "Landroid/location/Location;", "e", "(DLandroid/location/Location;Landroid/location/Location;)Z", "f", "(Ll/akj0;Ll/akj0;)Z", "isLessThan", "g", "(Ll/akj0;Ll/akj0;Z)Z", "a", "b", "Ll/duv;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class TriggersMatcher {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final duv localDataStore;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.evaluation.TriggersMatcher$a */
    @Metadata(m88122k = 3, m88123mv = {2, 0, 0}, m88125xi = 48)
    public /* synthetic */ class C1255a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f5130a;

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
            f5130a = iArr;
        }
    }

    public TriggersMatcher(@NotNull duv duvVar) {
        duvVar.getClass();
        this.localDataStore = duvVar;
    }

    /* JADX INFO: renamed from: c */
    private final boolean m6420c(List<?> list, Object elementToCheckForEquality) {
        if (elementToCheckForEquality instanceof String) {
            List<?> list2 = list;
            Sequence<String> sequenceM94172A = SequencesKt___SequencesKt.m94172A(CollectionsKt.asSequence(list2), new Function1<Object, Boolean>() { // from class: com.clevertap.android.sdk.inapp.evaluation.TriggersMatcher$checkGivenElementEqualsAnyElementInList$$inlined$filterIsInstance$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(Object obj) {
                    return Boolean.valueOf(obj instanceof String);
                }
            });
            sequenceM94172A.getClass();
            for (String str : sequenceM94172A) {
                String lowerCase = StringsKt.m94324Z0((String) elementToCheckForEquality).toString().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                if (Intrinsics.m88377d(str, lowerCase)) {
                    return true;
                }
            }
            Sequence sequenceM94172A2 = SequencesKt___SequencesKt.m94172A(CollectionsKt.asSequence(list2), new Function1<Object, Boolean>() { // from class: com.clevertap.android.sdk.inapp.evaluation.TriggersMatcher$checkGivenElementEqualsAnyElementInList$$inlined$filterIsInstance$2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(Object obj) {
                    return Boolean.valueOf(obj instanceof Number);
                }
            });
            sequenceM94172A2.getClass();
            Iterator it = sequenceM94172A2.iterator();
            while (it.hasNext()) {
                double dDoubleValue = ((Number) it.next()).doubleValue();
                String lowerCase2 = StringsKt.m94324Z0((String) elementToCheckForEquality).toString().toLowerCase(Locale.ROOT);
                lowerCase2.getClass();
                if (Intrinsics.m88374a(dDoubleValue, C15492c.m94363m(lowerCase2))) {
                    return true;
                }
            }
            return false;
        }
        if (!(elementToCheckForEquality instanceof Number)) {
            if (elementToCheckForEquality instanceof Boolean) {
                Sequence sequenceM94172A3 = SequencesKt___SequencesKt.m94172A(CollectionsKt.asSequence(list), new Function1<Object, Boolean>() { // from class: com.clevertap.android.sdk.inapp.evaluation.TriggersMatcher$checkGivenElementEqualsAnyElementInList$$inlined$filterIsInstance$5
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function1
                    public final Boolean invoke(Object obj) {
                        return Boolean.valueOf(obj instanceof String);
                    }
                });
                sequenceM94172A3.getClass();
                Iterator it2 = sequenceM94172A3.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.m88377d((String) it2.next(), String.valueOf(((Boolean) elementToCheckForEquality).booleanValue()))) {
                        return true;
                    }
                }
            }
            return false;
        }
        double dDoubleValue2 = ((Number) elementToCheckForEquality).doubleValue();
        List<?> list3 = list;
        Sequence sequenceM94172A4 = SequencesKt___SequencesKt.m94172A(CollectionsKt.asSequence(list3), new Function1<Object, Boolean>() { // from class: com.clevertap.android.sdk.inapp.evaluation.TriggersMatcher$checkGivenElementEqualsAnyElementInList$$inlined$filterIsInstance$3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof Number);
            }
        });
        sequenceM94172A4.getClass();
        Iterator it3 = sequenceM94172A4.iterator();
        while (it3.hasNext()) {
            if (((Number) it3.next()).doubleValue() == dDoubleValue2) {
                return true;
            }
        }
        Sequence sequenceM94172A5 = SequencesKt___SequencesKt.m94172A(CollectionsKt.asSequence(list3), new Function1<Object, Boolean>() { // from class: com.clevertap.android.sdk.inapp.evaluation.TriggersMatcher$checkGivenElementEqualsAnyElementInList$$inlined$filterIsInstance$4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof String);
            }
        });
        sequenceM94172A5.getClass();
        Iterator it4 = sequenceM94172A5.iterator();
        while (it4.hasNext()) {
            String lowerCase3 = StringsKt.m94324Z0((String) it4.next()).toString().toLowerCase(Locale.ROOT);
            lowerCase3.getClass();
            if (Intrinsics.m88375b(C15492c.m94363m(lowerCase3), dDoubleValue2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    private final boolean m6421i(pjj0 trigger, u3f event) {
        IntRange intRangeM88496l = C15274a.m88496l(0, trigger.m172499e());
        ArrayList<rjj0> arrayList = new ArrayList();
        Iterator<Integer> it = intRangeM88496l.iterator();
        while (it.hasNext()) {
            rjj0 rjj0VarM172502h = trigger.m172502h(((IntIterator) it).nextInt());
            if (rjj0VarM172502h != null) {
                arrayList.add(rjj0VarM172502h);
            }
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        for (rjj0 rjj0Var : arrayList) {
            List<akj0> listM194366e = event.m194366e(rjj0Var.getPropertyName());
            if (!(listM194366e instanceof Collection) || !listM194366e.isEmpty()) {
                Iterator<T> it2 = listM194366e.iterator();
                while (it2.hasNext()) {
                    if (m6426d(rjj0Var.getOp(), rjj0Var.getValue(), (akj0) it2.next())) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @WorkerThread
    /* JADX INFO: renamed from: k */
    private final boolean m6422k(pjj0 trigger) {
        if (!trigger.getFirstTimeOnly()) {
            return true;
        }
        String profileAttrName = trigger.getProfileAttrName();
        if (profileAttrName == null) {
            profileAttrName = trigger.getEventName();
        }
        return this.localDataStore.m118217z(profileAttrName);
    }

    /* JADX INFO: renamed from: m */
    private final boolean m6423m(pjj0 triggerAdapter, u3f event) {
        IntRange intRangeM88496l = C15274a.m88496l(0, triggerAdapter.m172501g());
        ArrayList<rjj0> arrayList = new ArrayList();
        Iterator<Integer> it = intRangeM88496l.iterator();
        while (it.hasNext()) {
            rjj0 rjj0VarM172503i = triggerAdapter.m172503i(((IntIterator) it).nextInt());
            if (rjj0VarM172503i != null) {
                arrayList.add(rjj0VarM172503i);
            }
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        for (rjj0 rjj0Var : arrayList) {
            if (!m6426d(rjj0Var.getOp(), rjj0Var.getValue(), event.m194368g(rjj0Var.getPropertyName()))) {
                return false;
            }
        }
        return true;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: a */
    public final boolean m6424a(@NotNull akj0 expected, @NotNull akj0 actual) {
        expected.getClass();
        actual.getClass();
        if (actual.getStringValue() != null && expected.getStringValue() != null) {
            String stringValueCleaned = actual.getStringValueCleaned();
            stringValueCleaned.getClass();
            String stringValueCleaned2 = expected.getStringValueCleaned();
            stringValueCleaned2.getClass();
            return StringsKt.m94303P(stringValueCleaned, stringValueCleaned2, false, 2, null);
        }
        if (expected.m98567b() && actual.getStringValue() != null) {
            List<?> listM98569d = expected.m98569d();
            listM98569d.getClass();
            Sequence<String> sequenceM94172A = SequencesKt___SequencesKt.m94172A(SequencesKt___SequencesKt.m94177F(CollectionsKt.asSequence(listM98569d)), new Function1<Object, Boolean>() { // from class: com.clevertap.android.sdk.inapp.evaluation.TriggersMatcher$actualContainsExpected$$inlined$filterIsInstance$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(Object obj) {
                    return Boolean.valueOf(obj instanceof String);
                }
            });
            sequenceM94172A.getClass();
            for (String str : sequenceM94172A) {
                String stringValueCleaned3 = actual.getStringValueCleaned();
                stringValueCleaned3.getClass();
                if (StringsKt.m94303P(stringValueCleaned3, str, false, 2, null)) {
                    return true;
                }
            }
            return false;
        }
        if (!expected.m98567b() || !actual.m98567b()) {
            if (!actual.m98567b() || expected.getStringValue() == null) {
                return false;
            }
            List<?> listM98569d2 = actual.m98569d();
            listM98569d2.getClass();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM98569d2) {
                if (obj instanceof String) {
                    arrayList.add(obj);
                }
            }
            return CollectionsKt.contains(CollectionsKt.toSet(arrayList), expected.getStringValueCleaned());
        }
        List<?> listM98569d3 = actual.m98569d();
        listM98569d3.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : listM98569d3) {
            if (obj2 instanceof String) {
                arrayList2.add(obj2);
            }
        }
        Set set = CollectionsKt.toSet(arrayList2);
        List<?> listM98569d4 = expected.m98569d();
        listM98569d4.getClass();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : listM98569d4) {
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
    public final boolean m6425b(@NotNull akj0 expected, @NotNull akj0 actual) {
        List listTake;
        double dDoubleValue;
        expected.getClass();
        actual.getClass();
        List<?> listM98568c = expected.m98568c();
        if (listM98568c != null) {
            if (listM98568c.size() < 2) {
                listM98568c = null;
            }
            if (listM98568c != null && (listTake = CollectionsKt.take(listM98568c, 2)) != null) {
                List list = listTake;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (Object obj : list) {
                    arrayList.add(obj instanceof String ? C15492c.m94363m((String) obj) : obj instanceof Number ? Double.valueOf(((Number) obj).doubleValue()) : null);
                }
                if (arrayList.contains(null)) {
                    return false;
                }
                Number numberValue = actual.getNumberValue();
                if (numberValue != null) {
                    dDoubleValue = numberValue.doubleValue();
                } else {
                    String stringValue = actual.getStringValue();
                    Double dM94363m = stringValue != null ? C15492c.m94363m(stringValue) : null;
                    if (dM94363m != null) {
                        dDoubleValue = dM94363m.doubleValue();
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
    public final boolean m6426d(@NotNull TriggerOperator op, @NotNull akj0 expected, @NotNull akj0 actual) {
        op.getClass();
        expected.getClass();
        actual.getClass();
        if (actual.getValue() == null) {
            return op == TriggerOperator.NotSet;
        }
        switch (C1255a.f5130a[op.ordinal()]) {
            case 1:
                return true;
            case 2:
                return m6429g(expected, actual, true);
            case 3:
                return m6429g(expected, actual, false);
            case 4:
                return m6428f(expected, actual);
            case 5:
                return !m6428f(expected, actual);
            case 6:
                return m6425b(expected, actual);
            case 7:
                return m6424a(expected, actual);
            case 8:
                return !m6424a(expected, actual);
            default:
                nbr.m162172a();
            case 9:
                return false;
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: e */
    public final boolean m6427e(double radius, @NotNull Location expected, @NotNull Location actual) {
        expected.getClass();
        actual.getClass();
        return Utils.m5978u(expected, actual) <= radius;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: f */
    public final boolean m6428f(@NotNull akj0 expected, @NotNull akj0 actual) {
        Double dM94363m;
        double dDoubleValue;
        expected.getClass();
        actual.getClass();
        if (expected.m98567b() && actual.m98567b()) {
            List<?> listM98569d = expected.m98569d();
            listM98569d.getClass();
            HashSet hashSet = CollectionsKt.toHashSet(listM98569d);
            List<?> listM98569d2 = actual.m98569d();
            listM98569d2.getClass();
            return Intrinsics.m88377d(hashSet, CollectionsKt.toHashSet(listM98569d2));
        }
        if (actual.m98567b()) {
            List<?> listM98569d3 = actual.m98569d();
            listM98569d3.getClass();
            return m6420c(listM98569d3, expected.getValue());
        }
        if (expected.m98567b()) {
            List<?> listM98569d4 = expected.m98569d();
            listM98569d4.getClass();
            return m6420c(listM98569d4, actual.getValue());
        }
        if (expected.getNumberValue() != null) {
            Number numberValue = actual.getNumberValue();
            if (numberValue == null) {
                String stringValueCleaned = actual.getStringValueCleaned();
                Double dM94363m2 = stringValueCleaned != null ? C15492c.m94363m(stringValueCleaned) : null;
                if (dM94363m2 != null) {
                    dDoubleValue = dM94363m2.doubleValue();
                }
            }
            dDoubleValue = numberValue.doubleValue();
            Number numberValue2 = expected.getNumberValue();
            numberValue2.getClass();
            return numberValue2.doubleValue() == dDoubleValue;
        }
        if (actual.getNumberValue() == null) {
            if (actual.getStringValue() != null) {
                return Intrinsics.m88377d(expected.getStringValueCleaned(), actual.getStringValueCleaned());
            }
            return false;
        }
        String stringValueCleaned2 = expected.getStringValueCleaned();
        if (stringValueCleaned2 != null && (dM94363m = C15492c.m94363m(stringValueCleaned2)) != null) {
            double dDoubleValue2 = dM94363m.doubleValue();
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
    public final boolean m6429g(@NotNull akj0 expected, @NotNull akj0 actual, boolean isLessThan) {
        double dDoubleValue;
        double dDoubleValue2;
        Object objFirstOrNull;
        Double dValueOf;
        expected.getClass();
        actual.getClass();
        Number numberValue = actual.getNumberValue();
        if (numberValue == null) {
            String stringValue = actual.getStringValue();
            Double dM94363m = stringValue != null ? C15492c.m94363m(stringValue) : null;
            if (dM94363m != null) {
                dDoubleValue = dM94363m.doubleValue();
            }
        }
        dDoubleValue = numberValue.doubleValue();
        List<?> listM98568c = expected.m98568c();
        if (listM98568c != null && (objFirstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) listM98568c)) != null) {
            if (objFirstOrNull instanceof String) {
                dValueOf = C15492c.m94363m((String) objFirstOrNull);
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
            Double dM94363m2 = stringValue2 != null ? C15492c.m94363m(stringValue2) : null;
            if (dM94363m2 != null) {
                dDoubleValue2 = dM94363m2.doubleValue();
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
    public final boolean m6430h(@NotNull pjj0 trigger, @NotNull u3f event) {
        trigger.getClass();
        event.getClass();
        if ((!Utils.m5958a(event.getEventName(), trigger.getEventName()) && (event.getProfileAttrName() == null || !Utils.m5958a(event.getProfileAttrName(), trigger.getProfileAttrName()))) || !m6423m(trigger, event) || !m6422k(trigger)) {
            return false;
        }
        if (!event.m194370i() || m6421i(trigger, event)) {
            return trigger.m172498d() <= 0 || m6432l(event, trigger);
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m6431j(@NotNull List<pjj0> whenTriggers, @NotNull u3f event) {
        whenTriggers.getClass();
        event.getClass();
        List<pjj0> list = whenTriggers;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (m6430h((pjj0) it.next(), event)) {
                return true;
            }
        }
        return false;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: l */
    public final boolean m6432l(@NotNull u3f event, @NotNull pjj0 trigger) {
        event.getClass();
        trigger.getClass();
        if (event.getUserLocation() != null && kx3.m151799t(event.getUserLocation())) {
            int iM172498d = trigger.m172498d();
            for (int i = 0; i < iM172498d; i++) {
                vjj0 vjj0VarM172495a = trigger.m172495a(i);
                Location location = new Location("");
                vjj0VarM172495a.getClass();
                location.setLatitude(vjj0VarM172495a.getLatitude());
                location.setLongitude(vjj0VarM172495a.getLongitude());
                try {
                    if (m6427e(vjj0VarM172495a.getCom.clevertap.android.sdk.Constants.KEY_RADIUS java.lang.String(), location, event.getUserLocation())) {
                        return true;
                    }
                } catch (Exception e) {
                    Logger.m5919d("Error matching GeoRadius triggers for event named " + event.getEventName() + ". Reason: " + e.getLocalizedMessage());
                }
            }
        }
        return false;
    }
}
