package com.momo.xeengine.svgaplayer.bean;

import com.clevertap.android.sdk.Constants;
import com.momo.xeengine.svgaplayer.corner.BitmapFillet;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B+\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m88121d2 = {"Lcom/momo/xeengine/svgaplayer/bean/InsertImgBean;", "Lcom/momo/xeengine/svgaplayer/bean/BaseInsertBean;", "()V", Constants.KEY_KEY, "", "imgUrl", "isCircle", "", Constants.KEY_RADIUS, "", "(Ljava/lang/String;Ljava/lang/String;ZI)V", "corner", "Lcom/momo/xeengine/svgaplayer/corner/BitmapFillet$Corner;", "getCorner", "()Lcom/momo/xeengine/svgaplayer/corner/BitmapFillet$Corner;", "setCorner", "(Lcom/momo/xeengine/svgaplayer/corner/BitmapFillet$Corner;)V", "getImgUrl", "()Ljava/lang/String;", "setImgUrl", "(Ljava/lang/String;)V", "()Z", "setCircle", "(Z)V", "getRadius", "()I", "setRadius", "(I)V", "gift_player_release"}, m88122k = 1, m88123mv = {1, 1, 15})
public final class InsertImgBean extends BaseInsertBean {

    @NotNull
    private BitmapFillet.Corner corner;

    @NotNull
    private String imgUrl;
    private boolean isCircle;
    private int radius;

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
    public InsertImgBean(@NotNull String str, @NotNull String str2, boolean z) {
        this(str, str2, z, 0, 8, null);
    }

    public InsertImgBean() {
        this.imgUrl = "";
        this.corner = BitmapFillet.Corner.CORNER_NONE;
    }

    public /* synthetic */ InsertImgBean(String str, String str2, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? 0 : i);
    }

    @JvmOverloads
    public InsertImgBean(@NotNull String str, @NotNull String str2) {
        this(str, str2, false, 0, 12, null);
    }
}
