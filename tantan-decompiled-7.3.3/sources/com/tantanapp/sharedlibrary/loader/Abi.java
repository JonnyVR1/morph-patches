package com.tantanapp.sharedlibrary.loader;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m88121d2 = {"Lcom/tantanapp/sharedlibrary/loader/Abi;", "", "id", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "ARM_32", "ARM_64", "loader_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public enum Abi {
    ARM_32("armeabi-v7a"),
    ARM_64("arm64-v8a");


    @NotNull
    private final String id;

    Abi(String str) {
        this.id = str;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }
}
