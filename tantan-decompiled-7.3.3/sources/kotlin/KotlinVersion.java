package kotlin;

import com.clevertap.android.sdk.Constants;
import com.sina.weibo.sdk.constant.WBConstants;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.f2r;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001eB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0017\u001a\u0004\b\u0018\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0019\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0012R\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017¨\u0006\u001f"}, m88121d2 = {"Lkotlin/KotlinVersion;", "", "", "major", "minor", "patch", "<init>", "(III)V", "(II)V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "(Lkotlin/KotlinVersion;)I", "b", "(III)I", "I", "getMajor", "getMinor", "c", "getPatch", Constants.INAPP_DATA_TAG, WBConstants.AUTH_PARAMS_VERSION, "Companion", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class KotlinVersion implements Comparable<KotlinVersion> {

    /* JADX INFO: renamed from: e */
    @JvmField
    @NotNull
    public static final KotlinVersion f64056e = f2r.m123648a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int major;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int minor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int patch;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int version;

    public KotlinVersion(int i, int i2, int i3) {
        this.major = i;
        this.minor = i2;
        this.patch = i3;
        this.version = m88116b(i, i2, i3);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull KotlinVersion other) {
        other.getClass();
        return this.version - other.version;
    }

    /* JADX INFO: renamed from: b */
    public final int m88116b(int major, int minor, int patch) {
        if (major >= 0 && major < 256 && minor >= 0 && minor < 256 && patch >= 0 && patch < 256) {
            return (major << 16) + (minor << 8) + patch;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + major + '.' + minor + '.' + patch).toString());
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        KotlinVersion kotlinVersion = other instanceof KotlinVersion ? (KotlinVersion) other : null;
        return kotlinVersion != null && this.version == kotlinVersion.version;
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public int getVersion() {
        return this.version;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.major);
        sb.append('.');
        sb.append(this.minor);
        sb.append('.');
        sb.append(this.patch);
        return sb.toString();
    }

    public KotlinVersion(int i, int i2) {
        this(i, i2, 0);
    }
}
