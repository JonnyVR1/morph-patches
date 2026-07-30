package kotlin.reflect.jvm.internal.impl.name;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.nbr;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class FqNamesUtilKt {

    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f66155a;

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
            f66155a = iArr;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static final <V> V m91961a(@NotNull FqName fqName, @NotNull Map<FqName, ? extends V> map) {
        Object next;
        fqName.getClass();
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<FqName, ? extends V> entry : map.entrySet()) {
            FqName key = entry.getKey();
            if (Intrinsics.m88377d(fqName, key) || m91962b(fqName, key)) {
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
                int length = m91967g((FqName) ((Map.Entry) next).getKey(), fqName).m91937a().length();
                do {
                    Object next2 = it.next();
                    int length2 = m91967g((FqName) ((Map.Entry) next2).getKey(), fqName).m91937a().length();
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
    public static final boolean m91962b(@NotNull FqName fqName, @NotNull FqName fqName2) {
        fqName.getClass();
        fqName2.getClass();
        return Intrinsics.m88377d(m91966f(fqName), fqName2);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m91963c(String str, String str2) {
        return C15493d.m94374J(str, str2, false, 2, null) && str.charAt(str2.length()) == '.';
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m91964d(@NotNull FqName fqName, @NotNull FqName fqName2) {
        fqName.getClass();
        fqName2.getClass();
        if (Intrinsics.m88377d(fqName, fqName2) || fqName2.m91939c()) {
            return true;
        }
        return m91963c(fqName.m91937a(), fqName2.m91937a());
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m91965e(@Nullable String str) {
        if (str == null) {
            return false;
        }
        State state = State.BEGINNING;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            int i2 = WhenMappings.f66155a[state.ordinal()];
            if (i2 == 1 || i2 == 2) {
                if (!Character.isJavaIdentifierStart(cCharAt)) {
                    return false;
                }
                state = State.MIDDLE;
            } else {
                if (i2 != 3) {
                    nbr.m162172a();
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
    public static final FqName m91966f(@NotNull FqName fqName) {
        fqName.getClass();
        if (fqName.m91939c()) {
            return null;
        }
        return fqName.m91940d();
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final FqName m91967g(@NotNull FqName fqName, @NotNull FqName fqName2) {
        fqName.getClass();
        fqName2.getClass();
        if (!m91964d(fqName, fqName2) || fqName2.m91939c()) {
            return fqName;
        }
        return Intrinsics.m88377d(fqName, fqName2) ? FqName.f66146c : new FqName(fqName.m91937a().substring(fqName2.m91937a().length() + 1));
    }
}
