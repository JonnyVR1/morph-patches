package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p149l.hb80;
import p149l.px50;
import p149l.qf80;
import p149l.rvc0;
import p149l.uwc0;
import p149l.wvc0;
import p149l.x4c;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.g */
/* JADX INFO: loaded from: classes.dex */
public class C1070g<DataType, ResourceType, Transcode> {

    /* JADX INFO: renamed from: a */
    private final Class<DataType> f4464a;

    /* JADX INFO: renamed from: b */
    private final List<? extends wvc0<DataType, ResourceType>> f4465b;

    /* JADX INFO: renamed from: c */
    private final uwc0<ResourceType, Transcode> f4466c;

    /* JADX INFO: renamed from: d */
    private final hb80<List<Throwable>> f4467d;

    /* JADX INFO: renamed from: e */
    private final String f4468e;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.g$a */
    public interface a<ResourceType> {
        @NonNull
        /* JADX INFO: renamed from: a */
        rvc0<ResourceType> mo5386a(@NonNull rvc0<ResourceType> rvc0Var);
    }

    public C1070g(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends wvc0<DataType, ResourceType>> list, uwc0<ResourceType, Transcode> uwc0Var, hb80<List<Throwable>> hb80Var) {
        this.f4464a = cls;
        this.f4465b = list;
        this.f4466c = uwc0Var;
        this.f4467d = hb80Var;
        this.f4468e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    private rvc0<ResourceType> m5434b(x4c<DataType> x4cVar, int i, int i2, @NonNull px50 px50Var) throws GlideException {
        List<Throwable> list = (List) qf80.m174276d(this.f4467d.acquire());
        try {
            return m5435c(x4cVar, i, i2, px50Var, list);
        } finally {
            this.f4467d.release(list);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    private rvc0<ResourceType> m5435c(x4c<DataType> x4cVar, int i, int i2, @NonNull px50 px50Var, List<Throwable> list) throws GlideException {
        int size = this.f4465b.size();
        rvc0<ResourceType> rvc0VarMo5553b = null;
        for (int i3 = 0; i3 < size; i3++) {
            wvc0<DataType, ResourceType> wvc0Var = this.f4465b.get(i3);
            try {
                if (wvc0Var.mo5552a(x4cVar.mo112975a(), px50Var)) {
                    rvc0VarMo5553b = wvc0Var.mo5553b(x4cVar.mo112975a(), i, i2, px50Var);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Objects.toString(wvc0Var);
                }
                list.add(e);
            }
            if (rvc0VarMo5553b != null) {
                break;
            }
        }
        if (rvc0VarMo5553b != null) {
            return rvc0VarMo5553b;
        }
        throw new GlideException(this.f4468e, new ArrayList(list));
    }

    /* JADX INFO: renamed from: a */
    public rvc0<Transcode> m5436a(x4c<DataType> x4cVar, int i, int i2, @NonNull px50 px50Var, a<ResourceType> aVar) throws GlideException {
        return this.f4466c.mo140781a(aVar.mo5386a(m5434b(x4cVar, i, i2, px50Var)), px50Var);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f4464a + ", decoders=" + this.f4465b + ", transcoder=" + this.f4466c + '}';
    }
}
