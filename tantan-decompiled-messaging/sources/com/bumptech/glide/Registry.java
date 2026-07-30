package com.bumptech.glide;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.C1070g;
import com.bumptech.glide.load.engine.C1078o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p149l.awc0;
import p149l.hb80;
import p149l.i600;
import p149l.i7j0;
import p149l.j600;
import p149l.k600;
import p149l.kgm;
import p149l.orv;
import p149l.rvc0;
import p149l.rze;
import p149l.s600;
import p149l.uwc0;
import p149l.vze;
import p149l.wvc0;
import p149l.x4c;
import p149l.xvc0;
import p149l.y4c;
import p149l.yvf;
import p149l.zvc0;

/* JADX INFO: loaded from: classes.dex */
public class Registry {

    /* JADX INFO: renamed from: a */
    private final k600 f4314a;

    /* JADX INFO: renamed from: b */
    private final vze f4315b;

    /* JADX INFO: renamed from: c */
    private final xvc0 f4316c;

    /* JADX INFO: renamed from: d */
    private final awc0 f4317d;

    /* JADX INFO: renamed from: e */
    private final y4c f4318e;

    /* JADX INFO: renamed from: f */
    private final i7j0 f4319f;

    /* JADX INFO: renamed from: g */
    private final kgm f4320g;

    /* JADX INFO: renamed from: h */
    private final s600 f4321h = new s600();

    /* JADX INFO: renamed from: i */
    private final orv f4322i = new orv();

    /* JADX INFO: renamed from: j */
    private final hb80<List<Throwable>> f4323j;

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
        hb80<List<Throwable>> hb80VarM216210e = yvf.m216210e();
        this.f4323j = hb80VarM216210e;
        this.f4314a = new k600(hb80VarM216210e);
        this.f4315b = new vze();
        this.f4316c = new xvc0();
        this.f4317d = new awc0();
        this.f4318e = new y4c();
        this.f4319f = new i7j0();
        this.f4320g = new kgm();
        m5307r(Arrays.asList("Gif", "Bitmap", "BitmapDrawable"));
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    private <Data, TResource, Transcode> List<C1070g<Data, TResource, Transcode>> m5290f(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f4316c.m211253d(cls, cls2)) {
            for (Class cls5 : this.f4319f.m134912b(cls4, cls3)) {
                arrayList.add(new C1070g(cls, cls4, cls5, this.f4316c.m211252b(cls, cls4), this.f4319f.m134911a(cls4, cls5), this.f4323j));
            }
        }
        return arrayList;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public <Model, Data> Registry m5291a(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull j600<Model, Data> j600Var) {
        this.f4314a.m144565a(cls, cls2, j600Var);
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public <Data, TResource> Registry m5292b(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull wvc0<Data, TResource> wvc0Var) {
        m5295e("legacy_append", cls, cls2, wvc0Var);
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public <Data> Registry m5293c(@NonNull Class<Data> cls, @NonNull rze<Data> rzeVar) {
        this.f4315b.m200752a(cls, rzeVar);
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public <TResource> Registry m5294d(@NonNull Class<TResource> cls, @NonNull zvc0<TResource> zvc0Var) {
        this.f4317d.m99262a(cls, zvc0Var);
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public <Data, TResource> Registry m5295e(@NonNull String str, @NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull wvc0<Data, TResource> wvc0Var) {
        this.f4316c.m211251a(str, wvc0Var, cls, cls2);
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public List<ImageHeaderParser> m5296g() {
        List<ImageHeaderParser> listM145895b = this.f4320g.m145895b();
        if (listM145895b.isEmpty()) {
            throw new NoImageHeaderParserException();
        }
        return listM145895b;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public <Data, TResource, Transcode> C1078o<Data, TResource, Transcode> m5297h(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull Class<Transcode> cls3) {
        Class<Data> cls4;
        Class<TResource> cls5;
        Class<Transcode> cls6;
        C1078o<Data, TResource, Transcode> c1078oM165680a = this.f4322i.m165680a(cls, cls2, cls3);
        C1078o<Data, TResource, Transcode> c1078o = null;
        if (this.f4322i.m165681c(c1078oM165680a)) {
            return null;
        }
        if (c1078oM165680a != null) {
            return c1078oM165680a;
        }
        List<C1070g<Data, TResource, Transcode>> listM5290f = m5290f(cls, cls2, cls3);
        if (listM5290f.isEmpty()) {
            cls4 = cls;
            cls5 = cls2;
            cls6 = cls3;
        } else {
            cls4 = cls;
            cls5 = cls2;
            cls6 = cls3;
            c1078o = new C1078o<>(cls4, cls5, cls6, listM5290f, this.f4323j);
        }
        this.f4322i.m165682d(cls4, cls5, cls6, c1078o);
        return c1078o;
    }

    @NonNull
    /* JADX INFO: renamed from: i */
    public <Model> List<i600<Model, ?>> m5298i(@NonNull Model model) {
        return this.f4314a.m144567d(model);
    }

    @NonNull
    /* JADX INFO: renamed from: j */
    public <Model, TResource, Transcode> List<Class<?>> m5299j(@NonNull Class<Model> cls, @NonNull Class<TResource> cls2, @NonNull Class<Transcode> cls3) {
        List<Class<?>> listM182404a = this.f4321h.m182404a(cls, cls2, cls3);
        if (listM182404a == null) {
            listM182404a = new ArrayList<>();
            Iterator<Class<?>> it = this.f4314a.m144566c(cls).iterator();
            while (it.hasNext()) {
                for (Class<?> cls4 : this.f4316c.m211253d(it.next(), cls2)) {
                    if (!this.f4319f.m134912b(cls4, cls3).isEmpty() && !listM182404a.contains(cls4)) {
                        listM182404a.add(cls4);
                    }
                }
            }
            this.f4321h.m182405b(cls, cls2, cls3, Collections.unmodifiableList(listM182404a));
        }
        return listM182404a;
    }

    @NonNull
    /* JADX INFO: renamed from: k */
    public <X> zvc0<X> m5300k(@NonNull rvc0<X> rvc0Var) throws NoResultEncoderAvailableException {
        zvc0<X> zvc0VarM99263b = this.f4317d.m99263b(rvc0Var.getResourceClass());
        if (zvc0VarM99263b != null) {
            return zvc0VarM99263b;
        }
        throw new NoResultEncoderAvailableException(rvc0Var.getResourceClass());
    }

    @NonNull
    /* JADX INFO: renamed from: l */
    public <X> x4c<X> m5301l(@NonNull X x) {
        return this.f4318e.m212890a(x);
    }

    @NonNull
    /* JADX INFO: renamed from: m */
    public <X> rze<X> m5302m(@NonNull X x) throws NoSourceEncoderAvailableException {
        rze<X> rzeVarM200753b = this.f4315b.m200753b(x.getClass());
        if (rzeVarM200753b != null) {
            return rzeVarM200753b;
        }
        throw new NoSourceEncoderAvailableException(x.getClass());
    }

    /* JADX INFO: renamed from: n */
    public boolean m5303n(@NonNull rvc0<?> rvc0Var) {
        return this.f4317d.m99263b(rvc0Var.getResourceClass()) != null;
    }

    @NonNull
    /* JADX INFO: renamed from: o */
    public Registry m5304o(@NonNull ImageHeaderParser imageHeaderParser) {
        this.f4320g.m145894a(imageHeaderParser);
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: p */
    public <TResource, Transcode> Registry m5305p(@NonNull Class<TResource> cls, @NonNull Class<Transcode> cls2, @NonNull uwc0<TResource, Transcode> uwc0Var) {
        this.f4319f.m134913c(cls, cls2, uwc0Var);
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: q */
    public Registry m5306q(@NonNull x4c.InterfaceC21025a<?> interfaceC21025a) {
        this.f4318e.m212891b(interfaceC21025a);
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: r */
    public final Registry m5307r(@NonNull List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        this.f4316c.m211254e(arrayList);
        return this;
    }

    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public <M> NoModelLoaderAvailableException(@NonNull M m, @NonNull List<i600<M, ?>> list) {
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
