package com.bumptech.glide;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.C1065b;
import com.bumptech.glide.load.data.InterfaceC1064a;
import com.bumptech.glide.load.engine.C1080g;
import com.bumptech.glide.load.engine.C1088o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p153l.a4d0;
import p153l.bf00;
import p153l.c4d0;
import p153l.d4d0;
import p153l.mgj0;
import p153l.mxf;
import p153l.nim;
import p153l.nj80;
import p153l.ptv;
import p153l.re00;
import p153l.se00;
import p153l.te00;
import p153l.u3d0;
import p153l.v0f;
import p153l.y4d0;
import p153l.z0f;
import p153l.z3d0;

/* JADX INFO: loaded from: classes.dex */
public class Registry {

    /* JADX INFO: renamed from: a */
    private final te00 f4314a;

    /* JADX INFO: renamed from: b */
    private final z0f f4315b;

    /* JADX INFO: renamed from: c */
    private final a4d0 f4316c;

    /* JADX INFO: renamed from: d */
    private final d4d0 f4317d;

    /* JADX INFO: renamed from: e */
    private final C1065b f4318e;

    /* JADX INFO: renamed from: f */
    private final mgj0 f4319f;

    /* JADX INFO: renamed from: g */
    private final nim f4320g;

    /* JADX INFO: renamed from: h */
    private final bf00 f4321h = new bf00();

    /* JADX INFO: renamed from: i */
    private final ptv f4322i = new ptv();

    /* JADX INFO: renamed from: j */
    private final nj80<List<Throwable>> f4323j;

    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(@NonNull String str) {
            super(str);
        }
    }

    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(@NonNull Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(@NonNull Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public Registry() {
        nj80<List<Throwable>> nj80VarM160654e = mxf.m160654e();
        this.f4323j = nj80VarM160654e;
        this.f4314a = new te00(nj80VarM160654e);
        this.f4315b = new z0f();
        this.f4316c = new a4d0();
        this.f4317d = new d4d0();
        this.f4318e = new C1065b();
        this.f4319f = new mgj0();
        this.f4320g = new nim();
        m5317r(Arrays.asList("Animation", "Bitmap", "BitmapDrawable"));
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    private <Data, TResource, Transcode> List<C1080g<Data, TResource, Transcode>> m5300f(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f4316c.m95911d(cls, cls2)) {
            for (Class cls5 : this.f4319f.m158347b(cls4, cls3)) {
                arrayList.add(new C1080g(cls, cls4, cls5, this.f4316c.m95910b(cls, cls4), this.f4319f.m158346a(cls4, cls5), this.f4323j));
            }
        }
        return arrayList;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public <Model, Data> Registry m5301a(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull se00<Model, Data> se00Var) {
        this.f4314a.m190669a(cls, cls2, se00Var);
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public <Data, TResource> Registry m5302b(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull z3d0<Data, TResource> z3d0Var) {
        m5305e("legacy_append", cls, cls2, z3d0Var);
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public <Data> Registry m5303c(@NonNull Class<Data> cls, @NonNull v0f<Data> v0fVar) {
        this.f4315b.m218108a(cls, v0fVar);
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public <TResource> Registry m5304d(@NonNull Class<TResource> cls, @NonNull c4d0<TResource> c4d0Var) {
        this.f4317d.m114177a(cls, c4d0Var);
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public <Data, TResource> Registry m5305e(@NonNull String str, @NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull z3d0<Data, TResource> z3d0Var) {
        this.f4316c.m95909a(str, z3d0Var, cls, cls2);
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public List<ImageHeaderParser> m5306g() {
        List<ImageHeaderParser> listM163291b = this.f4320g.m163291b();
        if (listM163291b.isEmpty()) {
            throw new NoImageHeaderParserException();
        }
        return listM163291b;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public <Data, TResource, Transcode> C1088o<Data, TResource, Transcode> m5307h(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull Class<Transcode> cls3) {
        Class<Data> cls4;
        Class<TResource> cls5;
        Class<Transcode> cls6;
        C1088o<Data, TResource, Transcode> c1088oM173784a = this.f4322i.m173784a(cls, cls2, cls3);
        C1088o<Data, TResource, Transcode> c1088o = null;
        if (this.f4322i.m173785c(c1088oM173784a)) {
            return null;
        }
        if (c1088oM173784a != null) {
            return c1088oM173784a;
        }
        List<C1080g<Data, TResource, Transcode>> listM5300f = m5300f(cls, cls2, cls3);
        if (listM5300f.isEmpty()) {
            cls4 = cls;
            cls5 = cls2;
            cls6 = cls3;
        } else {
            cls4 = cls;
            cls5 = cls2;
            cls6 = cls3;
            c1088o = new C1088o<>(cls4, cls5, cls6, listM5300f, this.f4323j);
        }
        this.f4322i.m173786d(cls4, cls5, cls6, c1088o);
        return c1088o;
    }

    @NonNull
    /* JADX INFO: renamed from: i */
    public <Model> List<re00<Model, ?>> m5308i(@NonNull Model model) {
        return this.f4314a.m190671d(model);
    }

    @NonNull
    /* JADX INFO: renamed from: j */
    public <Model, TResource, Transcode> List<Class<?>> m5309j(@NonNull Class<Model> cls, @NonNull Class<TResource> cls2, @NonNull Class<Transcode> cls3) {
        List<Class<?>> listM103793a = this.f4321h.m103793a(cls, cls2, cls3);
        if (listM103793a == null) {
            listM103793a = new ArrayList<>();
            Iterator<Class<?>> it = this.f4314a.m190670c(cls).iterator();
            while (it.hasNext()) {
                for (Class<?> cls4 : this.f4316c.m95911d(it.next(), cls2)) {
                    if (!this.f4319f.m158347b(cls4, cls3).isEmpty() && !listM103793a.contains(cls4)) {
                        listM103793a.add(cls4);
                    }
                }
            }
            this.f4321h.m103794b(cls, cls2, cls3, Collections.unmodifiableList(listM103793a));
        }
        return listM103793a;
    }

    @NonNull
    /* JADX INFO: renamed from: k */
    public <X> c4d0<X> m5310k(@NonNull u3d0<X> u3d0Var) throws NoResultEncoderAvailableException {
        c4d0<X> c4d0VarM114178b = this.f4317d.m114178b(u3d0Var.getResourceClass());
        if (c4d0VarM114178b != null) {
            return c4d0VarM114178b;
        }
        throw new NoResultEncoderAvailableException(u3d0Var.getResourceClass());
    }

    @NonNull
    /* JADX INFO: renamed from: l */
    public <X> InterfaceC1064a<X> m5311l(@NonNull X x) {
        return this.f4318e.m5374a(x);
    }

    @NonNull
    /* JADX INFO: renamed from: m */
    public <X> v0f<X> m5312m(@NonNull X x) throws NoSourceEncoderAvailableException {
        v0f<X> v0fVarM218109b = this.f4315b.m218109b(x.getClass());
        if (v0fVarM218109b != null) {
            return v0fVarM218109b;
        }
        throw new NoSourceEncoderAvailableException(x.getClass());
    }

    /* JADX INFO: renamed from: n */
    public boolean m5313n(@NonNull u3d0<?> u3d0Var) {
        return this.f4317d.m114178b(u3d0Var.getResourceClass()) != null;
    }

    @NonNull
    /* JADX INFO: renamed from: o */
    public Registry m5314o(@NonNull ImageHeaderParser imageHeaderParser) {
        this.f4320g.m163290a(imageHeaderParser);
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: p */
    public Registry m5315p(@NonNull InterfaceC1064a.a<?> aVar) {
        this.f4318e.m5375b(aVar);
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: q */
    public <TResource, Transcode> Registry m5316q(@NonNull Class<TResource> cls, @NonNull Class<Transcode> cls2, @NonNull y4d0<TResource, Transcode> y4d0Var) {
        this.f4319f.m158348c(cls, cls2, y4d0Var);
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: r */
    public final Registry m5317r(@NonNull List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add("legacy_prepend_all");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        arrayList.add("legacy_append");
        this.f4316c.m95912e(arrayList);
        return this;
    }

    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public <M> NoModelLoaderAvailableException(@NonNull M m, @NonNull List<re00<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m);
        }

        public NoModelLoaderAvailableException(@NonNull Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public NoModelLoaderAvailableException(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }
}
