package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import java.io.IOException;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1064a<T> {

    /* JADX INFO: renamed from: com.bumptech.glide.load.data.a$a */
    public interface a<T> {
        @NonNull
        /* JADX INFO: renamed from: a */
        Class<T> mo5371a();

        @NonNull
        /* JADX INFO: renamed from: b */
        InterfaceC1064a<T> mo5372b(@NonNull T t);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    T mo5369a() throws IOException;

    void cleanup();
}
