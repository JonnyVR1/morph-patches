package com.google.mlkit.p033nl.languageid.bundled.internal;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.p033nl.languageid.IdentifiedLanguage;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import p149l.a7r;
import p149l.y6r;

/* JADX INFO: loaded from: classes7.dex */
public class ThickLanguageIdentifier implements a7r {
    private static boolean zba;
    private final Context zbb;
    private long zbc;

    public ThickLanguageIdentifier(Context context, y6r y6rVar) {
        this.zbb = context;
    }

    @VisibleForTesting
    @WorkerThread
    /* JADX INFO: renamed from: b */
    public static synchronized void m16881b() throws MlKitException {
        if (zba) {
            return;
        }
        try {
            System.loadLibrary("language_id_l2c_jni");
            zba = true;
        } catch (UnsatisfiedLinkError e) {
            throw new MlKitException("Couldn't load language identification library.", 13, e);
        }
    }

    private native void nativeDestroy(long j);

    private native IdentifiedLanguage[] nativeIdentifyPossibleLanguages(long j, byte[] bArr, float f);

    private native long nativeInitFromBuffer(MappedByteBuffer mappedByteBuffer, long j);

    @Override // p149l.a7r
    @NonNull
    @WorkerThread
    /* JADX INFO: renamed from: a */
    public final List mo16882a(@NonNull String str, float f) {
        Preconditions.checkState(this.zbc != 0);
        IdentifiedLanguage[] identifiedLanguageArrNativeIdentifyPossibleLanguages = nativeIdentifyPossibleLanguages(this.zbc, str.getBytes(StandardCharsets.UTF_8), f);
        ArrayList arrayList = new ArrayList();
        for (IdentifiedLanguage identifiedLanguage : identifiedLanguageArrNativeIdentifyPossibleLanguages) {
            arrayList.add(new IdentifiedLanguage(identifiedLanguage.m16880b(), identifiedLanguage.m16879a()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:? A[Catch: IOException -> 0x004f, SYNTHETIC, TRY_LEAVE, TryCatch #3 {IOException -> 0x004f, blocks: (B:7:0x0013, B:13:0x004b, B:34:0x0074, B:33:0x0071, B:30:0x006c, B:8:0x001f, B:12:0x0048, B:28:0x0069, B:27:0x0066, B:24:0x0061, B:9:0x002c, B:19:0x0055, B:20:0x005c), top: B:42:0x0013, inners: #0, #1 }] */
    @Override // p149l.a7r
    @WorkerThread
    public final void init() throws MlKitException {
        Preconditions.checkState(this.zbc == 0);
        m16881b();
        try {
            AssetFileDescriptor assetFileDescriptorOpenFd = this.zbb.getAssets().openFd("tflite_langid.tflite.jpg");
            try {
                FileChannel channel = new FileInputStream(assetFileDescriptorOpenFd.getFileDescriptor()).getChannel();
                try {
                    long jNativeInitFromBuffer = nativeInitFromBuffer(channel.map(FileChannel.MapMode.READ_ONLY, assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getDeclaredLength()), assetFileDescriptorOpenFd.getDeclaredLength());
                    this.zbc = jNativeInitFromBuffer;
                    if (jNativeInitFromBuffer == 0) {
                        throw new MlKitException("Couldn't load language identification model", 13);
                    }
                    channel.close();
                    assetFileDescriptorOpenFd.close();
                    return;
                } catch (Throwable th) {
                    if (channel == null) {
                        throw th;
                    }
                    try {
                        channel.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                    throw new MlKitException("Couldn't open language identification model file", 13, e);
                }
            } catch (Throwable th3) {
                if (assetFileDescriptorOpenFd != null) {
                    throw th3;
                }
                try {
                    assetFileDescriptorOpenFd.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
            if (assetFileDescriptorOpenFd != null) {
                throw th3;
            }
            assetFileDescriptorOpenFd.close();
            throw th3;
        } catch (IOException e) {
            throw new MlKitException("Couldn't open language identification model file", 13, e);
        }
    }

    @Override // p149l.a7r
    @WorkerThread
    public final void release() {
        long j = this.zbc;
        if (j == 0) {
            return;
        }
        nativeDestroy(j);
        this.zbc = 0L;
    }
}
