package p153l;

import androidx.datastore.preferences.core.MutablePreferences;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0002\n\u0007B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H¦\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00010\tH&¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m88121d2 = {"Ll/hq80;", "", "<init>", "()V", p7f.GPS_DIRECTION_TRUE, "Ll/hq80$a;", Constants.KEY_KEY, "b", "(Ll/hq80$a;)Ljava/lang/Object;", "", "a", "()Ljava/util/Map;", "Landroidx/datastore/preferences/core/MutablePreferences;", "c", "()Landroidx/datastore/preferences/core/MutablePreferences;", Constants.INAPP_DATA_TAG, "()Ll/hq80;", "datastore-preferences-core"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
public abstract class hq80 {

    /* JADX INFO: renamed from: l.hq80$a */
    @Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0012"}, m88121d2 = {"Ll/hq80$a;", p7f.GPS_DIRECTION_TRUE, "", "", AuthenticationTokenClaims.JSON_KEY_NAME, "<init>", "(Ljava/lang/String;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "datastore-preferences-core"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
    public static final class C17536a<T> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String name;

        public C17536a(@NotNull String str) {
            str.getClass();
            this.name = str;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public boolean equals(@Nullable Object other) {
            if (other instanceof C17536a) {
                return Intrinsics.m88377d(this.name, ((C17536a) other).name);
            }
            return false;
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        @NotNull
        public String toString() {
            return this.name;
        }
    }

    /* JADX INFO: renamed from: l.hq80$b */
    @Metadata(m88120d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006R\u001a\u0010\u000b\u001a\u00028\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\f"}, m88121d2 = {"Ll/hq80$b;", p7f.GPS_DIRECTION_TRUE, "", "Ll/hq80$a;", "a", "Ll/hq80$a;", "()Ll/hq80$a;", Constants.KEY_KEY, "b", "Ljava/lang/Object;", "()Ljava/lang/Object;", "value", "datastore-preferences-core"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
    public static final class C17537b<T> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final C17536a<T> key;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final T value;

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C17536a<T> m136607a() {
            return this.key;
        }

        /* JADX INFO: renamed from: b */
        public final T m136608b() {
            return this.value;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public abstract Map<C17536a<?>, Object> mo1480a();

    @Nullable
    /* JADX INFO: renamed from: b */
    public abstract <T> T mo1481b(@NotNull C17536a<T> key);

    @NotNull
    /* JADX INFO: renamed from: c */
    public final MutablePreferences m136604c() {
        return new MutablePreferences(MapsKt.toMutableMap(mo1480a()), false);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final hq80 m136605d() {
        return new MutablePreferences(MapsKt.toMutableMap(mo1480a()), true);
    }
}
