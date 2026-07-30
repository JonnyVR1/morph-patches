package com.clevertap.android.sdk.inapp.images;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87233k = 3, m87234mv = {2, 0, 0}, m87236xi = 48)
public /* synthetic */ class FileResourceProvider$fetchFile$1 extends FunctionReferenceImpl implements Function1<String, byte[]> {
    public FileResourceProvider$fetchFile$1(Object obj) {
        super(1, obj, FileResourceProvider.class, "cachedFileInBytes", "cachedFileInBytes(Ljava/lang/String;)[B", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final byte[] invoke(String str) {
        return ((FileResourceProvider) this.receiver).m6492e(str);
    }
}
