package p153l;

import android.graphics.Bitmap;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001\rB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u001c\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\r\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\"\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u0017\u0010\u001f\"\u0004\b \u0010!R\"\u0010(\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010$\u001a\u0004\b\u0012\u0010%\"\u0004\b&\u0010'¨\u0006*"}, m88121d2 = {"Ll/u1e0;", "", "", "id", "path", "Landroid/graphics/Bitmap;", "bitmap", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "", "g", "()V", "e", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "getPath", "c", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "", Constants.INAPP_DATA_TAG, "J", "()J", "setDuration", "(J)V", BLiveOperationTitleShowType.duration, "Ll/ahj0;", "Ll/ahj0;", "()Ll/ahj0;", "f", "(Ll/ahj0;)V", "transition", "", "I", "()I", "setTexId", "(I)V", "texId", "Companion", "android_release"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class u1e0 {

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
    public ahj0 transition;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int texId;

    public u1e0(@NotNull String str, @NotNull String str2, @NotNull Bitmap bitmap) {
        str.getClass();
        str2.getClass();
        bitmap.getClass();
        this.id = str;
        this.path = str2;
        this.bitmap = bitmap;
        this.duration = 2000L;
        this.transition = fij0.INSTANCE.m125684a();
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
    public final ahj0 getTransition() {
        return this.transition;
    }

    /* JADX INFO: renamed from: e */
    public final void m193958e() {
        int i = this.texId;
        if (i != -1) {
            ifj.INSTANCE.m139733d(i);
            this.texId = -1;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m193959f(@NotNull ahj0 ahj0Var) {
        ahj0Var.getClass();
        this.transition = ahj0Var;
    }

    /* JADX INFO: renamed from: g */
    public final void m193960g() {
        if (this.texId == -1) {
            this.texId = ifj.INSTANCE.m139735f();
        }
        ifj.INSTANCE.m139738i(3553, 0, this.bitmap, 0);
    }
}
