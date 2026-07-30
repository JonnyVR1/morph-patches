package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p149l.hb80;
import p149l.px50;
import p149l.qf80;
import p149l.rvc0;
import p149l.x4c;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.o */
/* JADX INFO: loaded from: classes.dex */
public class C1078o<Data, ResourceType, Transcode> {

    /* JADX INFO: renamed from: a */
    private final Class<Data> f4545a;

    /* JADX INFO: renamed from: b */
    private final hb80<List<Throwable>> f4546b;

    /* JADX INFO: renamed from: c */
    private final List<? extends C1070g<Data, ResourceType, Transcode>> f4547c;

    /* JADX INFO: renamed from: d */
    private final String f4548d;

    public C1078o(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<C1070g<Data, ResourceType, Transcode>> list, hb80<List<Throwable>> hb80Var) {
        this.f4545a = cls;
        this.f4546b = hb80Var;
        this.f4547c = (List) qf80.m174275c(list);
        this.f4548d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* JADX INFO: renamed from: b */
    private rvc0<Transcode> m5484b(x4c<Data> x4cVar, @NonNull px50 px50Var, int i, int i2, C1070g.a<ResourceType> aVar, List<Throwable> list) throws GlideException {
        int size = this.f4547c.size();
        rvc0<Transcode> rvc0VarM5436a = null;
        for (int i3 = 0; i3 < size; i3++) {
            try {
                rvc0VarM5436a = this.f4547c.get(i3).m5436a(x4cVar, i, i2, px50Var, aVar);
            } catch (GlideException e) {
                list.add(e);
            }
            if (rvc0VarM5436a != null) {
                break;
            }
        }
        if (rvc0VarM5436a != null) {
            return rvc0VarM5436a;
        }
        throw new GlideException(this.f4548d, new ArrayList(list));
    }

    /* JADX INFO: renamed from: a */
    public rvc0<Transcode> m5485a(x4c<Data> x4cVar, @NonNull px50 px50Var, int i, int i2, C1070g.a<ResourceType> aVar) throws GlideException {
        List<Throwable> list = (List) qf80.m174276d(this.f4546b.acquire());
        try {
            return m5484b(x4cVar, px50Var, i, i2, aVar, list);
        } finally {
            this.f4546b.release(list);
        }
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f4547c.toArray()) + '}';
    }
}
