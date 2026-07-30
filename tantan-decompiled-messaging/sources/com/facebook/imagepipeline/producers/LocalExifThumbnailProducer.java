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
import p149l.ab80;
import p149l.fa5;
import p149l.fvj0;
import p149l.h5e;
import p149l.j6f;
import p149l.jze;
import p149l.kod;
import p149l.nq2;
import p149l.nvc0;
import p149l.qvf0;
import p149l.rf80;
import p149l.t23;
import p149l.tsf;
import p149l.uc90;
import p149l.uz5;
import p149l.vmq;
import p149l.xpi0;
import p149l.yc90;
import p149l.za80;
import p149l.zpi0;

/* JADX INFO: loaded from: classes.dex */
public class LocalExifThumbnailProducer implements xpi0<jze> {

    /* JADX INFO: renamed from: a */
    public final Executor f6481a;

    /* JADX INFO: renamed from: b */
    public final za80 f6482b;

    /* JADX INFO: renamed from: c */
    public final ContentResolver f6483c;

    @h5e
    public class Api24Utils {
        public Api24Utils() {
        }

        /* JADX INFO: renamed from: a */
        public ExifInterface m8490a(FileDescriptor fileDescriptor) throws IOException {
            return new ExifInterface(fileDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.LocalExifThumbnailProducer$a */
    public class C1625a extends qvf0<jze> {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ImageRequest f6485f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1625a(uz5 uz5Var, yc90 yc90Var, uc90 uc90Var, String str, ImageRequest imageRequest) {
            super(uz5Var, yc90Var, uc90Var, str);
            this.f6485f = imageRequest;
        }

        @Override // p149l.rvf0
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo8491b(jze jzeVar) {
            jze.m143896n(jzeVar);
        }

        @Override // p149l.qvf0
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Map<String, String> mo8493i(jze jzeVar) {
            return ImmutableMap.m8148of("createdThumbnail", Boolean.toString(jzeVar != null));
        }

        @Override // p149l.rvf0
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public jze mo8492c() throws Exception {
            ExifInterface exifInterfaceM8488g = LocalExifThumbnailProducer.this.m8488g(this.f6485f.m8585w());
            if (exifInterfaceM8488g == null || !exifInterfaceM8488g.hasThumbnail()) {
                return null;
            }
            return LocalExifThumbnailProducer.this.m8486e(LocalExifThumbnailProducer.this.f6482b.mo111847c((byte[]) rf80.m179116g(exifInterfaceM8488g.getThumbnail())), exifInterfaceM8488g);
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.LocalExifThumbnailProducer$b */
    public class C1626b extends nq2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qvf0 f6487a;

        public C1626b(qvf0 qvf0Var) {
            this.f6487a = qvf0Var;
        }

        @Override // p149l.nq2, p149l.vc90
        /* JADX INFO: renamed from: b */
        public void mo8497b() {
            this.f6487a.m181279a();
        }
    }

    public LocalExifThumbnailProducer(Executor executor, za80 za80Var, ContentResolver contentResolver) {
        this.f6481a = executor;
        this.f6482b = za80Var;
        this.f6483c = contentResolver;
    }

    @Override // p149l.xpi0
    /* JADX INFO: renamed from: a */
    public boolean mo8484a(nvc0 nvc0Var) {
        return zpi0.m219674b(512, 512, nvc0Var);
    }

    @Override // p149l.sc90
    /* JADX INFO: renamed from: b */
    public void mo8485b(uz5<jze> uz5Var, uc90 uc90Var) {
        yc90 yc90VarMo155870n = uc90Var.mo155870n();
        ImageRequest imageRequestMo155873t = uc90Var.mo155873t();
        uc90Var.mo155874u("local", "exif");
        C1625a c1625a = new C1625a(uz5Var, yc90VarMo155870n, uc90Var, "LocalExifThumbnailProducer", imageRequestMo155873t);
        uc90Var.mo155872q(new C1626b(c1625a));
        this.f6481a.execute(c1625a);
    }

    /* JADX INFO: renamed from: e */
    public final jze m8486e(PooledByteBuffer pooledByteBuffer, ExifInterface exifInterface) {
        Pair<Integer, Integer> pairM186956c = t23.m186956c(new ab80(pooledByteBuffer));
        int iM8489h = m8489h(exifInterface);
        int iIntValue = pairM186956c != null ? ((Integer) pairM186956c.first).intValue() : -1;
        int iIntValue2 = pairM186956c != null ? ((Integer) pairM186956c.second).intValue() : -1;
        fa5 fa5VarM120145S = fa5.m120145S(pooledByteBuffer);
        try {
            jze jzeVar = new jze((fa5<PooledByteBuffer>) fa5VarM120145S);
            fa5.m120154v(fa5VarM120145S);
            jzeVar.m143917m0(kod.JPEG);
            jzeVar.m143918n0(iM8489h);
            jzeVar.m143922q0(iIntValue);
            jzeVar.m143916l0(iIntValue2);
            return jzeVar;
        } catch (Throwable th) {
            fa5.m120154v(fa5VarM120145S);
            throw th;
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: f */
    public boolean m8487f(String str) throws IOException {
        if (str == null) {
            return false;
        }
        File file = new File(str);
        return file.exists() && file.canRead();
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: g */
    public ExifInterface m8488g(Uri uri) {
        String strM123310e = fvj0.m123310e(this.f6483c, uri);
        if (strM123310e == null) {
            return null;
        }
        try {
            if (m8487f(strM123310e)) {
                return new ExifInterface(strM123310e);
            }
            AssetFileDescriptor assetFileDescriptorM123306a = fvj0.m123306a(this.f6483c, uri);
            if (assetFileDescriptorM123306a != null) {
                ExifInterface exifInterfaceM8490a = new Api24Utils().m8490a(assetFileDescriptorM123306a.getFileDescriptor());
                assetFileDescriptorM123306a.close();
                return exifInterfaceM8490a;
            }
            return null;
        } catch (IOException unused) {
        } catch (StackOverflowError unused2) {
            tsf.m190538d(LocalExifThumbnailProducer.class, "StackOverflowError in ExifInterface constructor");
        }
    }

    /* JADX INFO: renamed from: h */
    public final int m8489h(ExifInterface exifInterface) {
        return vmq.m198968a(Integer.parseInt((String) rf80.m179116g(exifInterface.getAttribute(j6f.TAG_ORIENTATION))));
    }
}
