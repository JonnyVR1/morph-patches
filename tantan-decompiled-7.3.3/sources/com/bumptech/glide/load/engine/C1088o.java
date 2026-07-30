package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.InterfaceC1064a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p153l.nj80;
import p153l.u3d0;
import p153l.u560;
import p153l.vn80;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.o */
/* JADX INFO: loaded from: classes.dex */
public class C1088o<Data, ResourceType, Transcode> {

    /* JADX INFO: renamed from: a */
    private final Class<Data> f4557a;

    /* JADX INFO: renamed from: b */
    private final nj80<List<Throwable>> f4558b;

    /* JADX INFO: renamed from: c */
    private final List<? extends C1080g<Data, ResourceType, Transcode>> f4559c;

    /* JADX INFO: renamed from: d */
    private final String f4560d;

    public C1088o(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<C1080g<Data, ResourceType, Transcode>> list, nj80<List<Throwable>> nj80Var) {
        this.f4557a = cls;
        this.f4558b = nj80Var;
        this.f4559c = (List) vn80.m201943c(list);
        this.f4560d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* JADX INFO: renamed from: b */
    private u3d0<Transcode> m5510b(InterfaceC1064a<Data> interfaceC1064a, @NonNull u560 u560Var, int i, int i2, C1080g.a<ResourceType> aVar, List<Throwable> list) throws GlideException {
        int size = this.f4559c.size();
        u3d0<Transcode> u3d0VarM5462a = null;
        for (int i3 = 0; i3 < size; i3++) {
            try {
                u3d0VarM5462a = this.f4559c.get(i3).m5462a(interfaceC1064a, i, i2, u560Var, aVar);
            } catch (GlideException e) {
                list.add(e);
            }
            if (u3d0VarM5462a != null) {
                break;
            }
        }
        if (u3d0VarM5462a != null) {
            return u3d0VarM5462a;
        }
        throw new GlideException(this.f4560d, new ArrayList(list));
    }

    /* JADX INFO: renamed from: a */
    public u3d0<Transcode> m5511a(InterfaceC1064a<Data> interfaceC1064a, @NonNull u560 u560Var, int i, int i2, C1080g.a<ResourceType> aVar) throws GlideException {
        List<Throwable> list = (List) vn80.m201944d(this.f4558b.acquire());
        try {
            return m5510b(interfaceC1064a, u560Var, i, i2, aVar, list);
        } finally {
            this.f4558b.release(list);
        }
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f4559c.toArray()) + '}';
    }
}
