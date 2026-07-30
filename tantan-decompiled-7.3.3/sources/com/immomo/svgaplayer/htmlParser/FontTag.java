package com.immomo.svgaplayer.htmlParser;

import android.content.Context;
import android.graphics.Color;
import android.text.Editable;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import com.clevertap.android.sdk.Constants;
import com.momo.mcamera.mask.Sticker;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xml.sax.Attributes;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88119bv = {1, 0, 2}, m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\f\r\u000eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001a\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\u000f"}, m88121d2 = {"Lcom/immomo/svgaplayer/htmlParser/FontTag;", "Lcom/immomo/svgaplayer/htmlParser/HtmlTag;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "endHandleTag", "", "text", "Landroid/text/Editable;", "startHandleTag", "attributes", "Lorg/xml/sax/Attributes;", "FontColor", "FontFace", "FontSize", "svgalibrary_release"}, m88122k = 1, m88123mv = {1, 1, 10})
public final class FontTag extends HtmlTag {

    @Metadata(m88119bv = {1, 0, 2}, m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m88121d2 = {"Lcom/immomo/svgaplayer/htmlParser/FontTag$FontSize;", "", "size", "", "(I)V", "getSize", "()I", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "", "svgalibrary_release"}, m88122k = 1, m88123mv = {1, 1, 10})
    public static final /* data */ class FontSize {
        private final int size;

        public FontSize(int i) {
            this.size = i;
        }

        @NotNull
        public static /* bridge */ /* synthetic */ FontSize copy$default(FontSize fontSize, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = fontSize.size;
            }
            return fontSize.copy(i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getSize() {
            return this.size;
        }

        @NotNull
        public final FontSize copy(int size) {
            return new FontSize(size);
        }

        public boolean equals(Object other) {
            if (this != other) {
                return (other instanceof FontSize) && this.size == ((FontSize) other).size;
            }
            return true;
        }

        public final int getSize() {
            return this.size;
        }

        public int hashCode() {
            return this.size;
        }

        public String toString() {
            return "FontSize(size=" + this.size + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontTag(@NotNull Context context) {
        super(context);
        context.getClass();
    }

    @Override // com.immomo.svgaplayer.htmlParser.HtmlTag
    public void endHandleTag(@NotNull Editable text) {
        text.getClass();
        FontFace fontFace = (FontFace) getLast(text, FontFace.class);
        if (fontFace != null && !TextUtils.isEmpty(fontFace.getFace())) {
            end(text, FontFace.class, new TypefaceSpan(fontFace.getFace()));
        }
        FontColor fontColor = (FontColor) getLast(text, FontColor.class);
        if (fontColor != null && !TextUtils.isEmpty(fontColor.getColor())) {
            end(text, FontColor.class, new ForegroundColorSpan(Color.parseColor(fontColor.getColor())));
        }
        FontSize fontSize = (FontSize) getLast(text, FontSize.class);
        if (fontSize == null || fontSize.getSize() <= 0) {
            return;
        }
        end(text, FontSize.class, new AbsoluteSizeSpan(fontSize.getSize()));
    }

    @Override // com.immomo.svgaplayer.htmlParser.HtmlTag
    public void startHandleTag(@NotNull Editable text, @Nullable Attributes attributes) {
        text.getClass();
        String value = attributes != null ? attributes.getValue("", Sticker.LAYER_TYPE_FACE) : null;
        String value2 = attributes != null ? attributes.getValue("", "color") : null;
        String value3 = attributes != null ? attributes.getValue("", "size") : null;
        if (!TextUtils.isEmpty(value)) {
            start(text, new FontFace(value));
        }
        if (!TextUtils.isEmpty(value2)) {
            start(text, new FontColor(value2));
        }
        if (TextUtils.isEmpty(value3)) {
            return;
        }
        if (value3 == null) {
            Intrinsics.m88386m();
        }
        start(text, new FontSize(Integer.parseInt(value3)));
    }

    @Metadata(m88119bv = {1, 0, 2}, m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m88121d2 = {"Lcom/immomo/svgaplayer/htmlParser/FontTag$FontColor;", "", "color", "", "(Ljava/lang/String;)V", "getColor", "()Ljava/lang/String;", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "svgalibrary_release"}, m88122k = 1, m88123mv = {1, 1, 10})
    public static final /* data */ class FontColor {

        @Nullable
        private final String color;

        public /* synthetic */ FontColor(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }

        @NotNull
        public static /* bridge */ /* synthetic */ FontColor copy$default(FontColor fontColor, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fontColor.color;
            }
            return fontColor.copy(str);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        @NotNull
        public final FontColor copy(@Nullable String color) {
            return new FontColor(color);
        }

        public boolean equals(Object other) {
            if (this != other) {
                return (other instanceof FontColor) && Intrinsics.m88377d(this.color, ((FontColor) other).color);
            }
            return true;
        }

        @Nullable
        public final String getColor() {
            return this.color;
        }

        public int hashCode() {
            String str = this.color;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "FontColor(color=" + this.color + ")";
        }

        public FontColor(@Nullable String str) {
            this.color = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public FontColor() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @Metadata(m88119bv = {1, 0, 2}, m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m88121d2 = {"Lcom/immomo/svgaplayer/htmlParser/FontTag$FontFace;", "", Sticker.LAYER_TYPE_FACE, "", "(Ljava/lang/String;)V", "getFace", "()Ljava/lang/String;", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "svgalibrary_release"}, m88122k = 1, m88123mv = {1, 1, 10})
    public static final /* data */ class FontFace {

        @Nullable
        private final String face;

        public /* synthetic */ FontFace(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }

        @NotNull
        public static /* bridge */ /* synthetic */ FontFace copy$default(FontFace fontFace, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fontFace.face;
            }
            return fontFace.copy(str);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getFace() {
            return this.face;
        }

        @NotNull
        public final FontFace copy(@Nullable String face2) {
            return new FontFace(face2);
        }

        public boolean equals(Object other) {
            if (this != other) {
                return (other instanceof FontFace) && Intrinsics.m88377d(this.face, ((FontFace) other).face);
            }
            return true;
        }

        @Nullable
        public final String getFace() {
            return this.face;
        }

        public int hashCode() {
            String str = this.face;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "FontFace(face=" + this.face + ")";
        }

        public FontFace(@Nullable String str) {
            this.face = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public FontFace() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }
}
