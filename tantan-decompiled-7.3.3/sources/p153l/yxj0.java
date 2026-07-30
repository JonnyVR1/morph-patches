package p153l;

import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;

/* JADX INFO: loaded from: classes.dex */
public class yxj0<Model> implements re00<Model, Model> {
    private static final yxj0<?> INSTANCE = new yxj0<>();

    /* JADX INFO: renamed from: l.yxj0$a */
    public static class C21704a<Model> implements se00<Model, Model> {

        /* JADX INFO: renamed from: a */
        private static final C21704a<?> f201979a = new C21704a<>();

        @Deprecated
        public C21704a() {
        }

        /* JADX INFO: renamed from: a */
        public static <T> C21704a<T> m217720a() {
            return (C21704a<T>) f201979a;
        }

        @Override // p153l.se00
        @NonNull
        /* JADX INFO: renamed from: b */
        public re00<Model, Model> mo101570b(qs10 qs10Var) {
            return yxj0.m217719c();
        }
    }

    @Deprecated
    public yxj0() {
    }

    /* JADX INFO: renamed from: c */
    public static <T> yxj0<T> m217719c() {
        return (yxj0<T>) INSTANCE;
    }

    @Override // p153l.re00
    /* JADX INFO: renamed from: a */
    public re00.C19812a<Model> mo101565a(@NonNull Model model, int i, int i2, @NonNull u560 u560Var) {
        return new re00.C19812a<>(new d950(model), new C21705b(model));
    }

    @Override // p153l.re00
    /* JADX INFO: renamed from: b */
    public boolean mo101566b(@NonNull Model model) {
        return true;
    }

    /* JADX INFO: renamed from: l.yxj0$b */
    public static class C21705b<Model> implements t5c<Model> {

        /* JADX INFO: renamed from: a */
        private final Model f201980a;

        public C21705b(Model model) {
            this.f201980a = model;
        }

        @Override // p153l.t5c
        @NonNull
        /* JADX INFO: renamed from: a */
        public Class<Model> mo106029a() {
            return (Class<Model>) this.f201980a.getClass();
        }

        @Override // p153l.t5c
        /* JADX INFO: renamed from: d */
        public void mo95590d(@NonNull Priority priority, @NonNull t5c.InterfaceC20239a<? super Model> interfaceC20239a) {
            interfaceC20239a.mo5432b(this.f201980a);
        }

        @Override // p153l.t5c
        @NonNull
        public DataSource getDataSource() {
            return DataSource.LOCAL;
        }

        @Override // p153l.t5c
        public void cancel() {
        }

        @Override // p153l.t5c
        public void cleanup() {
        }
    }
}
