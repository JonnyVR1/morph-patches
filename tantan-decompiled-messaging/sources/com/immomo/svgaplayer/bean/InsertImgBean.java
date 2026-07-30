package com.immomo.svgaplayer.bean;

import android.graphics.Bitmap;
import com.clevertap.android.sdk.Constants;
import com.immomo.svgaplayer.corner.BitmapFillet;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87230bv = {1, 0, 2}, m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B+\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB3\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006#"}, m87232d2 = {"Lcom/immomo/svgaplayer/bean/InsertImgBean;", "Lcom/immomo/svgaplayer/bean/BaseInsertBean;", "()V", Constants.KEY_KEY, "", "imgUrl", "isCircle", "", Constants.KEY_RADIUS, "", "(Ljava/lang/String;Ljava/lang/String;ZI)V", "bitmap", "Landroid/graphics/Bitmap;", "(Ljava/lang/String;Ljava/lang/String;ZILandroid/graphics/Bitmap;)V", "getBitmap", "()Landroid/graphics/Bitmap;", "setBitmap", "(Landroid/graphics/Bitmap;)V", "corner", "Lcom/immomo/svgaplayer/corner/BitmapFillet$Corner;", "getCorner", "()Lcom/immomo/svgaplayer/corner/BitmapFillet$Corner;", "setCorner", "(Lcom/immomo/svgaplayer/corner/BitmapFillet$Corner;)V", "getImgUrl", "()Ljava/lang/String;", "setImgUrl", "(Ljava/lang/String;)V", "()Z", "setCircle", "(Z)V", "getRadius", "()I", "setRadius", "(I)V", "svgalibrary_release"}, m87233k = 1, m87234mv = {1, 1, 10})
public final class InsertImgBean extends BaseInsertBean {

    @Nullable
    private Bitmap bitmap;

    @NotNull
    private BitmapFillet.Corner corner;

    @NotNull
    private String imgUrl;
    private boolean isCircle;
    private int radius;

    @JvmOverloads
    public InsertImgBean(@NotNull String str, @NotNull String str2, boolean z, int i, @NotNull Bitmap bitmap) {
        str.getClass();
        str2.getClass();
        bitmap.getClass();
        this.imgUrl = "";
        this.corner = BitmapFillet.Corner.CORNER_NONE;
        setKey(str);
        this.imgUrl = str2;
        this.isCircle = z;
        this.radius = i;
        this.bitmap = bitmap;
    }

    @Nullable
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    @NotNull
    public final BitmapFillet.Corner getCorner() {
        return this.corner;
    }

    @NotNull
    public final String getImgUrl() {
        return this.imgUrl;
    }

    public final int getRadius() {
        return this.radius;
    }

    /* JADX INFO: renamed from: isCircle, reason: from getter */
    public final boolean getIsCircle() {
        return this.isCircle;
    }

    public final void setBitmap(@Nullable Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public final void setCircle(boolean z) {
        this.isCircle = z;
    }

    public final void setCorner(@NotNull BitmapFillet.Corner corner) {
        corner.getClass();
        this.corner = corner;
    }

    public final void setImgUrl(@NotNull String str) {
        str.getClass();
        this.imgUrl = str;
    }

    public final void setRadius(int i) {
        this.radius = i;
    }

    @JvmOverloads
    public InsertImgBean(@NotNull String str, @NotNull String str2, @NotNull Bitmap bitmap) {
        this(str, str2, false, 0, bitmap, 12, null);
    }

    @JvmOverloads
    public InsertImgBean(@NotNull String str, @NotNull String str2, boolean z) {
        this(str, str2, z, 0, 8, null);
    }

    @JvmOverloads
    public InsertImgBean(@NotNull String str, @NotNull String str2, boolean z, @NotNull Bitmap bitmap) {
        this(str, str2, z, 0, bitmap, 8, null);
    }

    public InsertImgBean() {
        this.imgUrl = "";
        this.corner = BitmapFillet.Corner.CORNER_NONE;
    }

    @JvmOverloads
    public /* synthetic */ InsertImgBean(String str, String str2, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? 0 : i);
    }

    @JvmOverloads
    public InsertImgBean(@NotNull String str, @NotNull String str2, boolean z, int i) {
        str.getClass();
        str2.getClass();
        this.imgUrl = "";
        this.corner = BitmapFillet.Corner.CORNER_NONE;
        setKey(str);
        this.imgUrl = str2;
        this.isCircle = z;
        this.radius = i;
    }

    @JvmOverloads
    public /* synthetic */ InsertImgBean(String str, String str2, boolean z, int i, Bitmap bitmap, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? 0 : i, bitmap);
    }

    @JvmOverloads
    public InsertImgBean(@NotNull String str, @NotNull String str2) {
        this(str, str2, false, 0, 12, null);
    }
}
