package com.tantanapp.common.network;

import java.io.InputStream;

/* JADX INFO: loaded from: classes11.dex */
public interface Parser<T> {
    T parse(InputStream inputStream, String str);
}
