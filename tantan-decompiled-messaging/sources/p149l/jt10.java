package p149l;

import com.clevertap.android.sdk.Constants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\b\u0000\u0012\u0018\u0010\u0005\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0017\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\bJ,\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u000b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m87232d2 = {"Ll/jt10;", "Ll/otb;", "", "Ll/otb$c;", "", "initialExtras", "<init>", "(Ljava/util/Map;)V", "(Ll/otb;)V", j6f.GPS_DIRECTION_TRUE, Constants.KEY_KEY, Constants.KEY_T, "", "c", "(Ll/otb$c;Ljava/lang/Object;)V", "a", "(Ll/otb$c;)Ljava/lang/Object;", "lifecycle-viewmodel_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class jt10 extends otb {
    public jt10(@NotNull Map<otb.InterfaceC19034c<?>, ? extends Object> map) {
        map.getClass();
        m165932b().putAll(map);
    }

    @Override // p149l.otb
    @Nullable
    /* JADX INFO: renamed from: a */
    public <T> T mo143070a(@NotNull otb.InterfaceC19034c<T> key) {
        key.getClass();
        return (T) m165932b().get(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final <T> void m143071c(@NotNull otb.InterfaceC19034c<T> key, T t) {
        key.getClass();
        m165932b().put(key, t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public jt10() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public jt10(@NotNull otb otbVar) {
        this((Map<otb.InterfaceC19034c<?>, ? extends Object>) otbVar.m165932b());
        otbVar.getClass();
    }

    public /* synthetic */ jt10(otb otbVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? otb.C19033b.INSTANCE : otbVar);
    }
}
