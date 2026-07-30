package com.tantanapp.sharedlibrary.loader.internal;

import com.clevertap.android.sdk.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p122io.ByteStreamsKt;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;
import p153l.tu2;
import p153l.yki;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u000e\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\r\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0015\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0015\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, m88121d2 = {"Ljava/io/File;", "", "e", "(Ljava/io/File;)V", "f", "(Ljava/io/File;)Ljava/io/File;", "", Constants.INAPP_DATA_TAG, "(Ljava/io/File;)Ljava/lang/String;", "md5", "", "a", "(Ljava/io/File;Ljava/lang/String;)Z", "dir", "g", "(Ljava/io/File;Ljava/lang/String;)V", "msg", "c", "(Ljava/lang/String;)V", "b", "loader_release"}, m88122k = 2, m88123mv = {1, 8, 0}, m88125xi = 48)
@SourceDebugExtension
public final class UtilKt {
    /* JADX INFO: renamed from: a */
    public static final boolean m82703a(@NotNull File file, @NotNull String str) {
        file.getClass();
        str.getClass();
        String strM82706d = file.isFile() ? m82706d(file) : null;
        if (strM82706d == null) {
            return false;
        }
        m82705c("File.checkMd5: file=" + file + ",fileMd5=" + strM82706d + ",expectMd5=" + str);
        return C15493d.m94381x(str, strM82706d, true);
    }

    /* JADX INFO: renamed from: b */
    public static final void m82704b(@NotNull String str) {
        str.getClass();
        tu2.m192703a("[SharedLibraryLoader]", str);
    }

    /* JADX INFO: renamed from: c */
    public static final void m82705c(@NotNull String str) {
        str.getClass();
        m82704b(str);
    }

    /* JADX INFO: renamed from: d */
    public static final String m82706d(File file) throws NoSuchAlgorithmException, IOException {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] bArr = new byte[8192];
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            int i = fileInputStream.read(bArr);
            if (i == -1) {
                byte[] bArrDigest = messageDigest.digest();
                bArrDigest.getClass();
                return ArraysKt.joinToString$default(bArrDigest, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) new Function1<Byte, CharSequence>() { // from class: com.tantanapp.sharedlibrary.loader.internal.UtilKt$md5$2
                    @NotNull
                    public final CharSequence invoke(byte b) {
                        return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ CharSequence invoke(Byte b) {
                        return invoke(b.byteValue());
                    }
                }, 30, (Object) null);
            }
            messageDigest.update(bArr, 0, i);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m82707e(@NotNull File file) {
        Object objValueOf;
        file.getClass();
        try {
            Result.Companion companion = Result.INSTANCE;
            if (file.exists()) {
                if (file.isDirectory()) {
                    objValueOf = Boolean.valueOf(yki.m216470r(file));
                } else {
                    objValueOf = file.isFile() ? Boolean.valueOf(file.delete()) : Unit.INSTANCE;
                }
                Result.m225066constructorimpl(objValueOf);
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m225066constructorimpl(ResultKt.m88127a(th));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final File m82708f(@NotNull File file) {
        file.getClass();
        try {
            Result.Companion companion = Result.INSTANCE;
            if (!file.exists()) {
                file.mkdirs();
            }
            Result.m225066constructorimpl(Unit.INSTANCE);
            return file;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m225066constructorimpl(ResultKt.m88127a(th));
            return file;
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m82709g(@NotNull File file, @NotNull String str) throws IOException {
        file.getClass();
        str.getClass();
        ZipFile zipFile = new ZipFile(file);
        Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
        enumerationEntries.getClass();
        Iterator it = CollectionsKt.iterator(enumerationEntries);
        while (it.hasNext()) {
            ZipEntry zipEntry = (ZipEntry) it.next();
            if (zipEntry.isDirectory()) {
                new File(str, zipEntry.getName()).mkdirs();
            } else {
                File file2 = new File(str, zipEntry.getName());
                File parentFile = file2.getParentFile();
                if (parentFile != null && !parentFile.exists()) {
                    parentFile.mkdirs();
                }
                InputStream inputStream = zipFile.getInputStream(zipEntry);
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                inputStream.getClass();
                ByteStreamsKt.m88291b(inputStream, fileOutputStream, 0, 2, null);
                fileOutputStream.close();
                inputStream.close();
            }
        }
        zipFile.close();
    }
}
