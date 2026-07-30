package p007l;

import android.graphics.Bitmap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001\rB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u001c\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\r\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\"\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u0017\u0010\u001f\"\u0004\b \u0010!R\"\u0010(\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010$\u001a\u0004\b\u0012\u0010%\"\u0004\b&\u0010'¨\u0006*"}, d2 = {"Ll/std0;", "", "", "id", "path", "Landroid/graphics/Bitmap;", "bitmap", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "", "g", "()V", "e", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "getPath", "c", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "", "d", "J", "()J", "setDuration", "(J)V", "duration", "Ll/w7j0;", "Ll/w7j0;", "()Ll/w7j0;", "f", "(Ll/w7j0;)V", "transition", "", "I", "()I", "setTexId", "(I)V", "texId", "Companion", "android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class std0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String path;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Bitmap bitmap;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public long duration;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public w7j0 transition;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int texId;

    public std0(@NotNull String str, @NotNull String str2, @NotNull Bitmap bitmap) {
        str.getClass();
        str2.getClass();
        bitmap.getClass();
        this.id = str;
        this.path = str2;
        this.bitmap = bitmap;
        this.duration = 2000L;
        this.transition = b9j0.INSTANCE.m8612a();
        this.texId = -1;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getTexId() {
        return this.texId;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final w7j0 getTransition() {
        return this.transition;
    }

    /* JADX INFO: renamed from: e */
    public final void m10721e() {
        int i = this.texId;
        if (i != -1) {
            ocj.INSTANCE.m10192d(i);
            this.texId = -1;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m10722f(@NotNull w7j0 w7j0Var) {
        w7j0Var.getClass();
        this.transition = w7j0Var;
    }

    /* JADX INFO: renamed from: g */
    public final void m10723g() {
        if (this.texId == -1) {
            this.texId = ocj.INSTANCE.m10194f();
        }
        ocj.INSTANCE.m10197i(3553, 0, this.bitmap, 0);
    }
}
