package p149l;

import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;

/* JADX INFO: loaded from: classes.dex */
public class voj0<Model> implements i600<Model, Model> {
    private static final voj0<?> INSTANCE = new voj0<>();

    /* JADX INFO: renamed from: l.voj0$a */
    public static class C20709a<Model> implements j600<Model, Model> {

        /* JADX INFO: renamed from: a */
        private static final C20709a<?> f182389a = new C20709a<>();

        @Deprecated
        public C20709a() {
        }

        /* JADX INFO: renamed from: a */
        public static <T> C20709a<T> m199167a() {
            return (C20709a<T>) f182389a;
        }

        @Override // p149l.j600
        @NonNull
        /* JADX INFO: renamed from: b */
        public i600<Model, Model> mo103357b(gk10 gk10Var) {
            return voj0.m199166c();
        }
    }

    @Deprecated
    public voj0() {
    }

    /* JADX INFO: renamed from: c */
    public static <T> voj0<T> m199166c() {
        return (voj0<T>) INSTANCE;
    }

    @Override // p149l.i600
    /* JADX INFO: renamed from: a */
    public i600.C17490a<Model> mo103352a(@NonNull Model model, int i, int i2, @NonNull px50 px50Var) {
        return new i600.C17490a<>(new o050(model), new C20710b(model));
    }

    @Override // p149l.i600
    /* JADX INFO: renamed from: b */
    public boolean mo103353b(@NonNull Model model) {
        return true;
    }

    /* JADX INFO: renamed from: l.voj0$b */
    public static class C20710b<Model> implements l4c<Model> {

        /* JADX INFO: renamed from: a */
        private final Model f182390a;

        public C20710b(Model model) {
            this.f182390a = model;
        }

        @Override // p149l.l4c
        @NonNull
        /* JADX INFO: renamed from: a */
        public Class<Model> mo103356a() {
            return (Class<Model>) this.f182390a.getClass();
        }

        @Override // p149l.l4c
        /* JADX INFO: renamed from: d */
        public void mo99210d(@NonNull Priority priority, @NonNull l4c.InterfaceC18148a<? super Model> interfaceC18148a) {
            interfaceC18148a.mo5407b(this.f182390a);
        }

        @Override // p149l.l4c
        @NonNull
        public DataSource getDataSource() {
            return DataSource.LOCAL;
        }

        @Override // p149l.l4c
        public void cancel() {
        }

        @Override // p149l.l4c
        public void cleanup() {
        }
    }
}
