package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class zzbwh {
    @NotNull
    public static final zzbwc zza(@NotNull zzbwq zzbwqVar) {
        zzbwqVar.getClass();
        return new zzbwk(zzbwqVar);
    }

    @NotNull
    public static final zzbwd zzb(@NotNull zzbws zzbwsVar) {
        zzbwsVar.getClass();
        return new zzbwl(zzbwsVar);
    }

    @NotNull
    public static final zzbwq zzc(@NotNull Socket socket) throws IOException {
        int i = zzbwi.zza;
        socket.getClass();
        zzbwr zzbwrVar = new zzbwr(socket);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.getClass();
        return new zzbvx(zzbwrVar, new zzbwj(outputStream, zzbwrVar));
    }

    @NotNull
    public static final zzbws zzd(@NotNull Socket socket) throws IOException {
        int i = zzbwi.zza;
        socket.getClass();
        zzbwr zzbwrVar = new zzbwr(socket);
        InputStream inputStream = socket.getInputStream();
        inputStream.getClass();
        return new zzbvy(zzbwrVar, new zzbwg(inputStream, zzbwrVar));
    }
}
