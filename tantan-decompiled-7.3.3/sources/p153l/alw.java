package p153l;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ#\u0010\n\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\r¨\u0006\u000f"}, m88121d2 = {"Ll/alw;", "", "<init>", "()V", "", "nameSpaces", "bridgeName", "Ll/jxl;", "b", "(Ljava/lang/String;Ljava/lang/String;)Ll/jxl;", "a", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "callbackCache", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class alw {
    public static final alw INSTANCE = new alw();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final ConcurrentHashMap<String, jxl> callbackCache = new ConcurrentHashMap<>();

    private alw() {
    }

    /* JADX INFO: renamed from: a */
    private final String m98732a(String nameSpaces, String bridgeName) {
        return Intrinsics.m88385l(nameSpaces, bridgeName);
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final jxl m98733b(@Nullable String nameSpaces, @Nullable String bridgeName) {
        if (nameSpaces == null || bridgeName == null) {
            return null;
        }
        return callbackCache.get(INSTANCE.m98732a(nameSpaces, bridgeName));
    }
}
