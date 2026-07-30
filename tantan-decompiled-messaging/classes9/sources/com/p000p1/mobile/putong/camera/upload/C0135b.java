package com.p000p1.mobile.putong.camera.upload;

import androidx.annotation.NonNull;
import l.nt2;
import rx.c;

/* JADX INFO: renamed from: com.p1.mobile.putong.camera.upload.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0135b {

    /* JADX INFO: renamed from: a */
    public rx.subjects.b<b> f1244a = rx.subjects.b.b();

    /* JADX INFO: renamed from: com.p1.mobile.putong.camera.upload.b$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final C0135b f1245a = new C0135b();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.camera.upload.b$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final int f1246a;

        /* JADX INFO: renamed from: b */
        public final int f1247b;

        /* JADX INFO: renamed from: c */
        public final String f1248c;

        public b(int i, int i2, String str) {
            this.f1246a = i;
            this.f1247b = i2;
            this.f1248c = str;
        }

        @NonNull
        public String toString() {
            return "TTCameraUploadResult: resultCode = " + this.f1246a + ", type = " + this.f1247b + ",url = " + this.f1248c;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0135b m1737a() {
        return a.f1245a;
    }

    /* JADX INFO: renamed from: b */
    public c<b> m1738b() {
        return this.f1244a.asObservable();
    }

    /* JADX INFO: renamed from: c */
    public void m1739c(b bVar) {
        nt2.v("[TTCamera]", bVar.toString());
        this.f1244a.onNext(bVar);
    }
}
