package kotlin.reflect.jvm.internal.impl.name;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.l9r;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class FqNamesUtilKt {

    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f65481a;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.BEGINNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.AFTER_DOT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[State.MIDDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f65481a = iArr;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static final <V> V m91070a(@NotNull FqName fqName, @NotNull Map<FqName, ? extends V> map) {
        Object next;
        fqName.getClass();
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<FqName, ? extends V> entry : map.entrySet()) {
            FqName key = entry.getKey();
            if (Intrinsics.m87488d(fqName, key) || m91071b(fqName, key)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            return null;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int length = m91076g((FqName) ((Map.Entry) next).getKey(), fqName).m91046a().length();
                do {
                    Object next2 = it.next();
                    int length2 = m91076g((FqName) ((Map.Entry) next2).getKey(), fqName).m91046a().length();
                    if (length > length2) {
                        next = next2;
                        length = length2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry2 = (Map.Entry) next;
        if (entry2 != null) {
            return (V) entry2.getValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m91071b(@NotNull FqName fqName, @NotNull FqName fqName2) {
        fqName.getClass();
        fqName2.getClass();
        return Intrinsics.m87488d(m91075f(fqName), fqName2);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m91072c(String str, String str2) {
        return C15386d.m93483J(str, str2, false, 2, null) && str.charAt(str2.length()) == '.';
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m91073d(@NotNull FqName fqName, @NotNull FqName fqName2) {
        fqName.getClass();
        fqName2.getClass();
        if (Intrinsics.m87488d(fqName, fqName2) || fqName2.m91048c()) {
            return true;
        }
        return m91072c(fqName.m91046a(), fqName2.m91046a());
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m91074e(@Nullable String str) {
        if (str == null) {
            return false;
        }
        State state = State.BEGINNING;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            int i2 = WhenMappings.f65481a[state.ordinal()];
            if (i2 == 1 || i2 == 2) {
                if (!Character.isJavaIdentifierStart(cCharAt)) {
                    return false;
                }
                state = State.MIDDLE;
            } else {
                if (i2 != 3) {
                    l9r.m149037a();
                    return false;
                }
                if (cCharAt == '.') {
                    state = State.AFTER_DOT;
                } else if (!Character.isJavaIdentifierPart(cCharAt)) {
                    return false;
                }
            }
        }
        return state != State.AFTER_DOT;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static final FqName m91075f(@NotNull FqName fqName) {
        fqName.getClass();
        if (fqName.m91048c()) {
            return null;
        }
        return fqName.m91049d();
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final FqName m91076g(@NotNull FqName fqName, @NotNull FqName fqName2) {
        fqName.getClass();
        fqName2.getClass();
        if (!m91073d(fqName, fqName2) || fqName2.m91048c()) {
            return fqName;
        }
        return Intrinsics.m87488d(fqName, fqName2) ? FqName.f65472c : new FqName(fqName.m91046a().substring(fqName2.m91046a().length() + 1));
    }
}
