package com.immomo.svgaplayer.bean;

import android.text.Layout;
import android.text.TextPaint;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87230bv = {1, 0, 2}, m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"Lcom/immomo/svgaplayer/bean/StaticLayoutBean;", "", "text", "", "paint", "Landroid/text/TextPaint;", "alignment", "Landroid/text/Layout$Alignment;", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;Landroid/text/Layout$Alignment;)V", "getAlignment", "()Landroid/text/Layout$Alignment;", "getPaint", "()Landroid/text/TextPaint;", "getText", "()Ljava/lang/CharSequence;", "svgalibrary_release"}, m87233k = 1, m87234mv = {1, 1, 10})
public final class StaticLayoutBean {

    @NotNull
    private final Layout.Alignment alignment;

    @NotNull
    private final TextPaint paint;

    @NotNull
    private final CharSequence text;

    public StaticLayoutBean(@NotNull CharSequence charSequence, @NotNull TextPaint textPaint, @NotNull Layout.Alignment alignment) {
        charSequence.getClass();
        textPaint.getClass();
        alignment.getClass();
        this.text = charSequence;
        this.paint = textPaint;
        this.alignment = alignment;
    }

    @NotNull
    public final Layout.Alignment getAlignment() {
        return this.alignment;
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
