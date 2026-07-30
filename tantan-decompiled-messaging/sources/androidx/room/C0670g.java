package androidx.room;

import android.content.Context;
import androidx.annotation.RestrictTo;
import com.facebook.AuthenticationTokenClaims;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.text.C15386d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.b2s;
import p149l.ig3;
import p149l.j6f;
import p149l.o5d0;

/* JADX INFO: renamed from: androidx.room.g */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\b\b\u0000\u0010\u0004*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J?\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\b\b\u0000\u0010\u0004*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m87232d2 = {"Landroidx/room/g;", "", "<init>", "()V", j6f.GPS_DIRECTION_TRUE, b2s.C_ZONE, "Ljava/lang/Class;", "klass", "", "suffix", "b", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "Landroidx/room/RoomDatabase;", "Landroid/content/Context;", "context", "Landroidx/room/RoomDatabase$a;", "c", "(Landroid/content/Context;Ljava/lang/Class;)Landroidx/room/RoomDatabase$a;", AuthenticationTokenClaims.JSON_KEY_NAME, "a", "(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)Landroidx/room/RoomDatabase$a;", "room-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class C0670g {

    @NotNull
    public static final C0670g INSTANCE = new C0670g();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T extends RoomDatabase> RoomDatabase.C0655a<T> m3990a(@NotNull Context context, @NotNull Class<T> klass, @Nullable String name) {
        context.getClass();
        klass.getClass();
        if (!(name == null || StringsKt.m93438e0(name))) {
            return new RoomDatabase.C0655a<>(context, klass, name);
        }
        ig3.m135964a("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        return null;
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: b */
    public static final <T, C> T m3991b(@NotNull Class<C> klass, @NotNull String suffix) {
        String str;
        klass.getClass();
        suffix.getClass();
        Package r0 = klass.getPackage();
        r0.getClass();
        String name = r0.getName();
        String canonicalName = klass.getCanonicalName();
        canonicalName.getClass();
        name.getClass();
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        String str2 = C15386d.m93478E(canonicalName, '.', '_', false, 4, null) + suffix;
        try {
            if (name.length() == 0) {
                str = str2;
            } else {
                str = name + '.' + str2;
            }
            Class<?> cls = Class.forName(str, true, klass.getClassLoader());
            cls.getClass();
            return (T) cls.getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + klass.getCanonicalName() + ". " + str2 + " does not exist");
        } catch (IllegalAccessException unused2) {
            o5d0.m162778a("Cannot access the constructor ", klass.getCanonicalName());
            return null;
        } catch (InstantiationException unused3) {
            o5d0.m162778a("Failed to create an instance of ", klass.getCanonicalName());
            return null;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final <T extends RoomDatabase> RoomDatabase.C0655a<T> m3992c(@NotNull Context context, @NotNull Class<T> klass) {
        context.getClass();
        klass.getClass();
        return new RoomDatabase.C0655a<>(context, klass, null);
    }
}
