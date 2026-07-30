package com.clevertap.android.sdk.inapp.images;

import com.clevertap.android.sdk.network.DownloadedBitmap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87233k = 3, m87234mv = {2, 0, 0}, m87236xi = 48)
public /* synthetic */ class FileResourceProvider$fetchFile$2 extends FunctionReferenceImpl implements Function1<DownloadedBitmap, Pair<? extends byte[], ? extends byte[]>> {
    public FileResourceProvider$fetchFile$2(Object obj) {
        super(1, obj, FileResourceProvider.class, "downloadedBytesFromApi", "downloadedBytesFromApi(Lcom/clevertap/android/sdk/network/DownloadedBitmap;)Lkotlin/Pair;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Pair<byte[], byte[]> invoke(DownloadedBitmap downloadedBitmap) {
        downloadedBitmap.getClass();
        return ((FileResourceProvider) this.receiver).m6486k(downloadedBitmap);
    }
}
