package com.p000p1.mobile.putong.camera.upload;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.gson.Gson;
import com.p000p1.mobile.putong.camera.upload.C0134a.a;
import l.uqd0;

/* JADX INFO: renamed from: com.p1.mobile.putong.camera.upload.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public final class C0134a<T extends a<? extends T>> {

    /* JADX INFO: renamed from: a */
    public final Gson f1238a;

    /* JADX INFO: renamed from: b */
    public final Class<T> f1239b;

    /* JADX INFO: renamed from: c */
    public final uqd0 f1240c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final T f1241d;

    /* JADX INFO: renamed from: e */
    public T f1242e;

    /* JADX INFO: renamed from: f */
    public String f1243f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.camera.upload.a$a */
    public interface a<T> {
        void nullCheck();

        T trimAndCopy();
    }

    public C0134a(Class<T> cls, String str, @NonNull T t, boolean z, String str2) {
        Gson gson = new Gson();
        this.f1238a = gson;
        this.f1240c = new uqd0(str, gson.toJson(t), z, str2);
        this.f1241d = t;
        this.f1243f = str;
        this.f1239b = cls;
    }

    /* JADX INFO: renamed from: a */
    public final T m1735a() {
        T t = this.f1242e;
        if (t != null) {
            return t;
        }
        String str = (String) this.f1240c.get();
        if (TextUtils.isEmpty(str)) {
            this.f1241d.nullCheck();
            return this.f1241d;
        }
        T t2 = (T) this.f1238a.fromJson(str, this.f1239b);
        t2.nullCheck();
        this.f1242e = t2;
        return t2;
    }

    /* JADX INFO: renamed from: b */
    public final void m1736b(T t) {
        T t2 = (T) t.trimAndCopy();
        String json = this.f1238a.toJson(t2);
        this.f1242e = t2;
        this.f1240c.put(json);
    }
}
