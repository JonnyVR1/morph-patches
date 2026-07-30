package p153l;

import com.p051p1.mobile.putong.core.data.Permissions;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\t\u0018\u0000 \u00122\u00020\u0001:\u0001\u000bB#\b\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0016\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\tR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011¨\u0006\u0013"}, m88121d2 = {"Ll/o0w;", "", "", "", Permissions.TYPE, "nonce", "<init>", "(Ljava/util/Collection;Ljava/lang/String;)V", "codeVerifier", "(Ljava/util/Collection;Ljava/lang/String;Ljava/lang/String;)V", "", "a", "Ljava/util/Set;", "c", "()Ljava/util/Set;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "Companion", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
public final class o0w {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Set<String> permissions;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String nonce;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final String codeVerifier;

    public o0w(@Nullable Collection<String> collection, @NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        if (!(gu40.m132272a(str) && kc60.m149105d(str2))) {
            wg3.m206174a("Failed requirement.");
            throw null;
        }
        HashSet hashSet = collection != null ? new HashSet(collection) : new HashSet();
        hashSet.add("openid");
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        setUnmodifiableSet.getClass();
        this.permissions = setUnmodifiableSet;
        this.nonce = str;
        this.codeVerifier = str2;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCodeVerifier() {
        return this.codeVerifier;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getNonce() {
        return this.nonce;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Set<String> m165551c() {
        return this.permissions;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public o0w(@Nullable Collection<String> collection, @NotNull String str) {
        this(collection, str, kc60.m149104c());
        str.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ o0w(Collection collection, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            str = UUID.randomUUID().toString();
            str.getClass();
        }
        this(collection, str);
    }
}
