package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.media.ExifInterface;
import android.net.Uri;
import android.util.Pair;
import androidx.annotation.VisibleForTesting;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;
import p153l.azi0;
import p153l.cl90;
import p153l.czi0;
import p153l.er2;
import p153l.fb5;
import p153l.fj80;
import p153l.gj80;
import p153l.huf;
import p153l.i4k0;
import p153l.j33;
import p153l.n0f;
import p153l.p7f;
import p153l.ppd;
import p153l.q3d0;
import p153l.uoq;
import p153l.v6e;
import p153l.wn80;
import p153l.yk90;
import p153l.z06;
import p153l.z3g0;

/* JADX INFO: loaded from: classes.dex */
public class LocalExifThumbnailProducer implements azi0<n0f> {

    /* JADX INFO: renamed from: a */
    public final Executor f6518a;

    /* JADX INFO: renamed from: b */
    public final fj80 f6519b;

    /* JADX INFO: renamed from: c */
    public final ContentResolver f6520c;

    @v6e
    public class Api24Utils {
        public Api24Utils() {
        }

        /* JADX INFO: renamed from: a */
        public ExifInterface m8544a(FileDescriptor fileDescriptor) throws IOException {
            return new ExifInterface(fileDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.LocalExifThumbnailProducer$a */
    public class C1648a extends z3g0<n0f> {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ImageRequest f6522f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1648a(z06 z06Var, cl90 cl90Var, yk90 yk90Var, String str, ImageRequest imageRequest) {
            super(z06Var, cl90Var, yk90Var, str);
            this.f6522f = imageRequest;
        }

        @Override // p153l.a4g0
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo8545b(n0f n0fVar) {
            n0f.m160959n(n0fVar);
        }

        @Override // p153l.z3g0
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Map<String, String> mo8547i(n0f n0fVar) {
            return ImmutableMap.m8202of("createdThumbnail", Boolean.toString(n0fVar != null));
        }

        @Override // p153l.a4g0
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public n0f mo8546c() throws Exception {
            ExifInterface exifInterfaceM8542g = LocalExifThumbnailProducer.this.m8542g(this.f6522f.m8639w());
            if (exifInterfaceM8542g == null || !exifInterfaceM8542g.hasThumbnail()) {
                return null;
            }
            return LocalExifThumbnailProducer.this.m8540e(LocalExifThumbnailProducer.this.f6519b.mo99565c((byte[]) wn80.m207182g(exifInterfaceM8542g.getThumbnail())), exifInterfaceM8542g);
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.LocalExifThumbnailProducer$b */
    public class C1649b extends er2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z3g0 f6524a;

        public C1649b(z3g0 z3g0Var) {
            this.f6524a = z3g0Var;
        }

        @Override // p153l.er2, p153l.zk90
        /* JADX INFO: renamed from: b */
        public void mo8551b() {
            this.f6524a.m95923a();
        }
    }

    public LocalExifThumbnailProducer(Executor executor, fj80 fj80Var, ContentResolver contentResolver) {
        this.f6518a = executor;
        this.f6519b = fj80Var;
        this.f6520c = contentResolver;
    }

    @Override // p153l.azi0
    /* JADX INFO: renamed from: a */
    public boolean mo8538a(q3d0 q3d0Var) {
        return czi0.m113342b(512, 512, q3d0Var);
    }

    @Override // p153l.wk90
    /* JADX INFO: renamed from: b */
    public void mo8539b(z06<n0f> z06Var, yk90 yk90Var) {
        cl90 cl90VarMo117675n = yk90Var.mo117675n();
        ImageRequest imageRequestMo117678t = yk90Var.mo117678t();
        yk90Var.mo117679u("local", "exif");
        C1648a c1648a = new C1648a(z06Var, cl90VarMo117675n, yk90Var, "LocalExifThumbnailProducer", imageRequestMo117678t);
        yk90Var.mo117677q(new C1649b(c1648a));
        this.f6518a.execute(c1648a);
    }

    /* JADX INFO: renamed from: e */
    public final n0f m8540e(PooledByteBuffer pooledByteBuffer, ExifInterface exifInterface) {
        Pair<Integer, Integer> pairM143306c = j33.m143306c(new gj80(pooledByteBuffer));
        int iM8543h = m8543h(exifInterface);
        int iIntValue = pairM143306c != null ? ((Integer) pairM143306c.first).intValue() : -1;
        int iIntValue2 = pairM143306c != null ? ((Integer) pairM143306c.second).intValue() : -1;
        fb5 fb5VarM124865S = fb5.m124865S(pooledByteBuffer);
        try {
            n0f n0fVar = new n0f((fb5<PooledByteBuffer>) fb5VarM124865S);
            fb5.m124874v(fb5VarM124865S);
            n0fVar.m160980n0(ppd.JPEG);
            n0fVar.m160981o0(iM8543h);
            n0fVar.m160985r0(iIntValue);
            n0fVar.m160979m0(iIntValue2);
            return n0fVar;
        } catch (Throwable th) {
            fb5.m124874v(fb5VarM124865S);
            throw th;
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: f */
    public boolean m8541f(String str) throws IOException {
        if (str == null) {
            return false;
        }
        File file = new File(str);
        return file.exists() && file.canRead();
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: g */
    public ExifInterface m8542g(Uri uri) {
        String strM138556e = i4k0.m138556e(this.f6520c, uri);
        if (strM138556e == null) {
            return null;
        }
        try {
            if (m8541f(strM138556e)) {
                return new ExifInterface(strM138556e);
            }
            AssetFileDescriptor assetFileDescriptorM138552a = i4k0.m138552a(this.f6520c, uri);
            if (assetFileDescriptorM138552a != null) {
                ExifInterface exifInterfaceM8544a = new Api24Utils().m8544a(assetFileDescriptorM138552a.getFileDescriptor());
                assetFileDescriptorM138552a.close();
                return exifInterfaceM8544a;
            }
            return null;
        } catch (IOException unused) {
        } catch (StackOverflowError unused2) {
            huf.m137176d(LocalExifThumbnailProducer.class, "StackOverflowError in ExifInterface constructor");
        }
    }

    /* JADX INFO: renamed from: h */
    public final int m8543h(ExifInterface exifInterface) {
        return uoq.m197016a(Integer.parseInt((String) wn80.m207182g(exifInterface.getAttribute(p7f.TAG_ORIENTATION))));
    }
}
