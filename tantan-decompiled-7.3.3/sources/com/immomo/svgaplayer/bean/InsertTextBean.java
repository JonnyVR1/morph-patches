package com.immomo.svgaplayer.bean;

import android.graphics.Color;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88119bv = {1, 0, 2}, m88120d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002BC\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t¢\u0006\u0002\u0010\u000eJ\u0010\u0010.\u001a\u00020\u000b2\u0006\u0010/\u001a\u000200H\u0002J\u0006\u00101\u001a\u000202J\u0006\u0010\u000f\u001a\u000203J\u0006\u00104\u001a\u00020\u0000R\u001a\u0010\f\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0014\"\u0004\b\u001d\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\u001a\u0010\r\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0010\"\u0004\b!\u0010\u0012R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0010\"\u0004\b#\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00065"}, m88121d2 = {"Lcom/immomo/svgaplayer/bean/InsertTextBean;", "Lcom/immomo/svgaplayer/bean/BaseInsertBean;", "()V", Constants.KEY_KEY, "", "text", "textSize", "", "textColor", "", "singleLine", "", "ellipsize", "textAlignType", "(Ljava/lang/String;Ljava/lang/String;FIZII)V", "getEllipsize", "()I", "setEllipsize", "(I)V", "isBold", "()Z", "setBold", "(Z)V", "richText", "getRichText", "()Ljava/lang/String;", "setRichText", "(Ljava/lang/String;)V", "getSingleLine", "setSingleLine", "getText", "setText", "getTextAlignType", "setTextAlignType", "getTextColor", "setTextColor", "getTextSize", "()F", "setTextSize", "(F)V", "typeFace", "Landroid/graphics/Typeface;", "getTypeFace", "()Landroid/graphics/Typeface;", "setTypeFace", "(Landroid/graphics/Typeface;)V", "couldAffectRtl", "c", "", "getAlignType", "Landroid/text/Layout$Alignment;", "Landroid/text/TextUtils$TruncateAt;", "removeInterestingChars", "svgalibrary_release"}, m88122k = 1, m88123mv = {1, 1, 10})
public final class InsertTextBean extends BaseInsertBean {
    private int ellipsize;
    private boolean isBold;

    @NotNull
    private String richText;
    private boolean singleLine;

    @NotNull
    private String text;
    private int textAlignType;
    private int textColor;
    private float textSize;

    @Nullable
    private Typeface typeFace;

    @JvmOverloads
    public InsertTextBean(@NotNull String str, @NotNull String str2, float f, int i, boolean z, int i2, int i3) {
        str.getClass();
        str2.getClass();
        this.text = "";
        this.richText = "";
        this.textColor = Color.parseColor("#ffffff");
        setKey(str);
        this.text = str2;
        this.textSize = f;
        this.textColor = i;
        this.singleLine = z;
        this.ellipsize = i2;
        this.textAlignType = i3;
    }

    private final boolean couldAffectRtl(char c) {
        if ((1424 <= c && c <= 2303) || c == 8206 || c == 8207) {
            return true;
        }
        if (8234 <= c && c <= 8238) {
            return true;
        }
        if (8294 <= c && c <= 8297) {
            return true;
        }
        if (55296 <= c && c <= 57343) {
            return true;
        }
        if (64285 > c || c > 65023) {
            return 65136 <= c && c <= 65278;
        }
        return true;
    }

    @NotNull
    public final Layout.Alignment getAlignType() {
        int i = this.textAlignType;
        if (i != 0) {
            return i != 1 ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    @NotNull
    /* JADX INFO: renamed from: getEllipsize, reason: collision with other method in class */
    public final TextUtils.TruncateAt m225058getEllipsize() {
        int i = this.ellipsize;
        if (i == 0) {
            return TextUtils.TruncateAt.END;
        }
        if (i != 1) {
            return i != 2 ? TextUtils.TruncateAt.END : TextUtils.TruncateAt.MIDDLE;
        }
        return TextUtils.TruncateAt.START;
    }

    @NotNull
    public final String getRichText() {
        return this.richText;
    }

    public final boolean getSingleLine() {
        return this.singleLine;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public final int getTextAlignType() {
        return this.textAlignType;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final float getTextSize() {
        return this.textSize;
    }

    @Nullable
    public final Typeface getTypeFace() {
        return this.typeFace;
    }

    /* JADX INFO: renamed from: isBold, reason: from getter */
    public final boolean getIsBold() {
        return this.isBold;
    }

    @NotNull
    public final InsertTextBean removeInterestingChars() {
        char[] cArr = new char[this.text.length()];
        String str = this.text;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\n' || cCharAt == '\t' || couldAffectRtl(cCharAt)) {
                cArr[i] = ' ';
            } else {
                cArr[i] = cCharAt;
            }
        }
        this.text = new String(cArr);
        return this;
    }

    public final void setBold(boolean z) {
        this.isBold = z;
    }

    public final void setEllipsize(int i) {
        this.ellipsize = i;
    }

    public final void setRichText(@NotNull String str) {
        str.getClass();
        this.richText = str;
    }

    public final void setSingleLine(boolean z) {
        this.singleLine = z;
    }

    public final void setText(@NotNull String str) {
        str.getClass();
        this.text = str;
    }

    public final void setTextAlignType(int i) {
        this.textAlignType = i;
    }

    public final void setTextColor(int i) {
        this.textColor = i;
    }

    public final void setTextSize(float f) {
        this.textSize = f;
    }

    public final void setTypeFace(@Nullable Typeface typeface) {
        this.typeFace = typeface;
    }

    public final int getEllipsize() {
        return this.ellipsize;
    }

    @JvmOverloads
    public InsertTextBean(@NotNull String str, @NotNull String str2, float f, int i, boolean z, int i2) {
        this(str, str2, f, i, z, i2, 0, 64, null);
    }

    public InsertTextBean() {
        this.text = "";
        this.richText = "";
        this.textColor = Color.parseColor("#ffffff");
    }

    @JvmOverloads
    public InsertTextBean(@NotNull String str, @NotNull String str2, float f, int i, int i2) {
        this(str, str2, f, i, false, i2, 0, 80, null);
    }

    @JvmOverloads
    public /* synthetic */ InsertTextBean(String str, String str2, float f, int i, boolean z, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, f, i, (i4 & 16) != 0 ? false : z, i2, (i4 & 64) != 0 ? 1 : i3);
    }
}
