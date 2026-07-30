package com.p051p1.mobile.putong.camera.upload;

import androidx.annotation.NonNull;
import p137rx.C22421c;
import p137rx.subjects.C22508b;
import p153l.du2;

/* JADX INFO: renamed from: com.p1.mobile.putong.camera.upload.b */
/* JADX INFO: loaded from: classes9.dex */
public class C4860b {

    /* JADX INFO: renamed from: a */
    public C22508b<b> f17974a = C22508b.m222767b();

    /* JADX INFO: renamed from: com.p1.mobile.putong.camera.upload.b$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final C4860b f17975a = new C4860b();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.camera.upload.b$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final int f17976a;

        /* JADX INFO: renamed from: b */
        public final int f17977b;

        /* JADX INFO: renamed from: c */
        public final String f17978c;

        public b(int i, int i2, String str) {
            this.f17976a = i;
            this.f17977b = i2;
            this.f17978c = str;
        }

        @NonNull
        public String toString() {
            return "TTCameraUploadResult: resultCode = " + this.f17976a + ", type = " + this.f17977b + ",url = " + this.f17978c;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C4860b m30824a() {
        return a.f17975a;
    }

    /* JADX INFO: renamed from: b */
    public C22421c<b> m30825b() {
        return this.f17974a.asObservable();
    }

    /* JADX INFO: renamed from: c */
    public void m30826c(b bVar) {
        du2.m118062v("[TTCamera]", bVar.toString());
        this.f17974a.onNext(bVar);
    }
}
