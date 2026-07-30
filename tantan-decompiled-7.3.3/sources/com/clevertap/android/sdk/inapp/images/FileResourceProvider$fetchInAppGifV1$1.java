package com.clevertap.android.sdk.inapp.images;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88122k = 3, m88123mv = {2, 0, 0}, m88125xi = 48)
public /* synthetic */ class FileResourceProvider$fetchInAppGifV1$1 extends FunctionReferenceImpl implements Function1<String, byte[]> {
    public FileResourceProvider$fetchInAppGifV1$1(Object obj) {
        super(1, obj, FileResourceProvider.class, "cachedInAppGifV1", "cachedInAppGifV1(Ljava/lang/String;)[B", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final byte[] invoke(String str) {
        return ((FileResourceProvider) this.receiver).m6549h(str);
    }
}
