package com.p046p1.mobile.putong.camera.upload;

import androidx.annotation.NonNull;
import p133rx.C22306c;
import p133rx.subjects.C22393b;
import p149l.nt2;

/* JADX INFO: renamed from: com.p1.mobile.putong.camera.upload.b */
/* JADX INFO: loaded from: classes9.dex */
public class C4709b {

    /* JADX INFO: renamed from: a */
    public C22393b<b> f17255a = C22393b.m221521b();

    /* JADX INFO: renamed from: com.p1.mobile.putong.camera.upload.b$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final C4709b f17256a = new C4709b();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.camera.upload.b$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final int f17257a;

        /* JADX INFO: renamed from: b */
        public final int f17258b;

        /* JADX INFO: renamed from: c */
        public final String f17259c;

        public b(int i, int i2, String str) {
            this.f17257a = i;
            this.f17258b = i2;
            this.f17259c = str;
        }

        @NonNull
        public String toString() {
            return "TTCameraUploadResult: resultCode = " + this.f17257a + ", type = " + this.f17258b + ",url = " + this.f17259c;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C4709b m29826a() {
        return a.f17256a;
    }

    /* JADX INFO: renamed from: b */
    public C22306c<b> m29827b() {
        return this.f17255a.asObservable();
    }

    /* JADX INFO: renamed from: c */
    public void m29828c(b bVar) {
        nt2.m160831v("[TTCamera]", bVar.toString());
        this.f17255a.onNext(bVar);
    }
}
