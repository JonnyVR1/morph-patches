package com.facebook.imagepipeline.decoder;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.n0f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0006\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB%\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Lcom/facebook/imagepipeline/decoder/DecodeException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "message", "Ll/n0f;", "encodedImage", "<init>", "(Ljava/lang/String;Ll/n0f;)V", "", Constants.KEY_T, "(Ljava/lang/String;Ljava/lang/Throwable;Ll/n0f;)V", "Ll/n0f;", "getEncodedImage", "()Ll/n0f;", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class DecodeException extends RuntimeException {

    @NotNull
    private final n0f encodedImage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DecodeException(@Nullable String str, @NotNull n0f n0fVar) {
        super(str);
        n0fVar.getClass();
        this.encodedImage = n0fVar;
    }

    @NotNull
    public final n0f getEncodedImage() {
        return this.encodedImage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DecodeException(@Nullable String str, @Nullable Throwable th, @NotNull n0f n0fVar) {
        super(str, th);
        n0fVar.getClass();
        this.encodedImage = n0fVar;
    }
}
