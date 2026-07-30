package com.facebook.imagepipeline.decoder;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.jze;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0006\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB%\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"Lcom/facebook/imagepipeline/decoder/DecodeException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "message", "Ll/jze;", "encodedImage", "<init>", "(Ljava/lang/String;Ll/jze;)V", "", Constants.KEY_T, "(Ljava/lang/String;Ljava/lang/Throwable;Ll/jze;)V", "Ll/jze;", "getEncodedImage", "()Ll/jze;", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class DecodeException extends RuntimeException {

    @NotNull
    private final jze encodedImage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DecodeException(@Nullable String str, @NotNull jze jzeVar) {
        super(str);
        jzeVar.getClass();
        this.encodedImage = jzeVar;
    }

    @NotNull
    public final jze getEncodedImage() {
        return this.encodedImage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DecodeException(@Nullable String str, @Nullable Throwable th, @NotNull jze jzeVar) {
        super(str, th);
        jzeVar.getClass();
        this.encodedImage = jzeVar;
    }
}
