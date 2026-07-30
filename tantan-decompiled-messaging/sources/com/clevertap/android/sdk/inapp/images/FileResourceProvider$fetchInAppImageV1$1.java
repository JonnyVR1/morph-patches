package com.clevertap.android.sdk.inapp.images;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87233k = 3, m87234mv = {2, 0, 0}, m87236xi = 48)
public /* synthetic */ class FileResourceProvider$fetchInAppImageV1$1 extends FunctionReferenceImpl implements Function1<String, Bitmap> {
    public FileResourceProvider$fetchInAppImageV1$1(Object obj) {
        super(1, obj, FileResourceProvider.class, "cachedInAppImageV1", "cachedInAppImageV1(Ljava/lang/String;)Landroid/graphics/Bitmap;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Bitmap invoke(String str) {
        return ((FileResourceProvider) this.receiver).m6496i(str);
    }
}
