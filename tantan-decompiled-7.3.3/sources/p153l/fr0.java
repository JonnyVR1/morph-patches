package p153l;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\n\u0018\u0000 \u001a2\u00020\u0001:\u0001\rB\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018¨\u0006\u001b"}, m88121d2 = {"Ll/fr0;", "Ll/by3;", "", "imageId", "", "deepEquals", "<init>", "(IZ)V", "Landroid/net/Uri;", "uri", "c", "(Landroid/net/Uri;)Z", "", "a", "()Ljava/lang/String;", "b", "()Z", "", "o", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Z", "Ljava/lang/String;", "animationUriString", "Companion", "animated-base_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class fr0 implements by3 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean deepEquals;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String animationUriString;

    @JvmOverloads
    public fr0(int i, boolean z) {
        this.deepEquals = z;
        this.animationUriString = "anim://" + i;
    }

    @Override // p153l.by3
    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public String getAnimationUriString() {
        return this.animationUriString;
    }

    @Override // p153l.by3
    /* JADX INFO: renamed from: b */
    public boolean mo106962b() {
        return false;
    }

    @Override // p153l.by3
    /* JADX INFO: renamed from: c */
    public boolean mo106963c(@NotNull Uri uri) {
        uri.getClass();
        String string = uri.toString();
        string.getClass();
        return C15493d.m94374J(string, this.animationUriString, false, 2, null);
    }

    @Override // p153l.by3
    public boolean equals(@Nullable Object o) {
        if (!this.deepEquals) {
            return this == o;
        }
        if (this == o) {
            return true;
        }
        if (o == null || !Intrinsics.m88377d(fr0.class, o.getClass())) {
            return false;
        }
        return Intrinsics.m88377d(this.animationUriString, ((fr0) o).animationUriString);
    }

    @Override // p153l.by3
    public int hashCode() {
        return !this.deepEquals ? super.hashCode() : this.animationUriString.hashCode();
    }
}
