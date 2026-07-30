package com.immomo.svgaplayer.bean;

import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88119bv = {1, 0, 2}, m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m88121d2 = {"Lcom/immomo/svgaplayer/bean/BoringLayoutBean;", "", "text", "", "paint", "Landroid/text/TextPaint;", "alignment", "Landroid/text/Layout$Alignment;", "ellipsize", "Landroid/text/TextUtils$TruncateAt;", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;Landroid/text/Layout$Alignment;Landroid/text/TextUtils$TruncateAt;)V", "getAlignment", "()Landroid/text/Layout$Alignment;", "getEllipsize", "()Landroid/text/TextUtils$TruncateAt;", "getPaint", "()Landroid/text/TextPaint;", "getText", "()Ljava/lang/CharSequence;", "svgalibrary_release"}, m88122k = 1, m88123mv = {1, 1, 10})
public final class BoringLayoutBean {

    @NotNull
    private final Layout.Alignment alignment;

    @NotNull
    private final TextUtils.TruncateAt ellipsize;

    @NotNull
    private final TextPaint paint;

    @NotNull
    private final CharSequence text;

    public BoringLayoutBean(@NotNull CharSequence charSequence, @NotNull TextPaint textPaint, @NotNull Layout.Alignment alignment, @NotNull TextUtils.TruncateAt truncateAt) {
        charSequence.getClass();
        textPaint.getClass();
        alignment.getClass();
        truncateAt.getClass();
        this.text = charSequence;
        this.paint = textPaint;
        this.alignment = alignment;
        this.ellipsize = truncateAt;
    }

    @NotNull
    public final Layout.Alignment getAlignment() {
        return this.alignment;
    }

    @NotNull
    public final TextUtils.TruncateAt getEllipsize() {
        return this.ellipsize;
    }

    @NotNull
    public final TextPaint getPaint() {
        return this.paint;
    }

    @NotNull
    public final CharSequence getText() {
        return this.text;
    }
}
