package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.InterfaceC1064a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p153l.nj80;
import p153l.u3d0;
import p153l.u560;
import p153l.vn80;
import p153l.y4d0;
import p153l.z3d0;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.g */
/* JADX INFO: loaded from: classes.dex */
public class C1080g<DataType, ResourceType, Transcode> {

    /* JADX INFO: renamed from: a */
    private final Class<DataType> f4475a;

    /* JADX INFO: renamed from: b */
    private final List<? extends z3d0<DataType, ResourceType>> f4476b;

    /* JADX INFO: renamed from: c */
    private final y4d0<ResourceType, Transcode> f4477c;

    /* JADX INFO: renamed from: d */
    private final nj80<List<Throwable>> f4478d;

    /* JADX INFO: renamed from: e */
    private final String f4479e;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.g$a */
    public interface a<ResourceType> {
        @NonNull
        /* JADX INFO: renamed from: a */
        u3d0<ResourceType> mo5411a(@NonNull u3d0<ResourceType> u3d0Var);
    }

    public C1080g(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends z3d0<DataType, ResourceType>> list, y4d0<ResourceType, Transcode> y4d0Var, nj80<List<Throwable>> nj80Var) {
        this.f4475a = cls;
        this.f4476b = list;
        this.f4477c = y4d0Var;
        this.f4478d = nj80Var;
        this.f4479e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    private u3d0<ResourceType> m5460b(InterfaceC1064a<DataType> interfaceC1064a, int i, int i2, @NonNull u560 u560Var) throws GlideException {
        List<Throwable> list = (List) vn80.m201944d(this.f4478d.acquire());
        try {
            return m5461c(interfaceC1064a, i, i2, u560Var, list);
        } finally {
            this.f4478d.release(list);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    private u3d0<ResourceType> m5461c(InterfaceC1064a<DataType> interfaceC1064a, int i, int i2, @NonNull u560 u560Var, List<Throwable> list) throws GlideException {
        int size = this.f4476b.size();
        u3d0<ResourceType> u3d0VarMo5554b = null;
        for (int i3 = 0; i3 < size; i3++) {
            z3d0<DataType, ResourceType> z3d0Var = this.f4476b.get(i3);
            try {
                if (z3d0Var.mo5553a(interfaceC1064a.mo5369a(), u560Var)) {
                    u3d0VarMo5554b = z3d0Var.mo5554b(interfaceC1064a.mo5369a(), i, i2, u560Var);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Objects.toString(z3d0Var);
                }
                list.add(e);
            }
            if (u3d0VarMo5554b != null) {
                break;
            }
        }
        if (u3d0VarMo5554b != null) {
            return u3d0VarMo5554b;
        }
        throw new GlideException(this.f4479e, new ArrayList(list));
    }

    /* JADX INFO: renamed from: a */
    public u3d0<Transcode> m5462a(InterfaceC1064a<DataType> interfaceC1064a, int i, int i2, @NonNull u560 u560Var, a<ResourceType> aVar) throws GlideException {
        return this.f4477c.mo95615a(aVar.mo5411a(m5460b(interfaceC1064a, i, i2, u560Var)), u560Var);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f4475a + ", decoders=" + this.f4476b + ", transcoder=" + this.f4477c + '}';
    }
}
