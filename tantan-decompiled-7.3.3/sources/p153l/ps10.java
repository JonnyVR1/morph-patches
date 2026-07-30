package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class ps10<Model, Data> implements re00<Model, Data> {

    /* JADX INFO: renamed from: a */
    private final List<re00<Model, Data>> f153862a;

    /* JADX INFO: renamed from: b */
    private final nj80<List<Throwable>> f153863b;

    /* JADX INFO: renamed from: l.ps10$a */
    public static class C19431a<Data> implements t5c<Data>, t5c.InterfaceC20239a<Data> {

        /* JADX INFO: renamed from: a */
        private final List<t5c<Data>> f153864a;

        /* JADX INFO: renamed from: b */
        private final nj80<List<Throwable>> f153865b;

        /* JADX INFO: renamed from: c */
        private int f153866c;

        /* JADX INFO: renamed from: d */
        private Priority f153867d;

        /* JADX INFO: renamed from: e */
        private t5c.InterfaceC20239a<? super Data> f153868e;

        /* JADX INFO: renamed from: f */
        @Nullable
        private List<Throwable> f153869f;

        /* JADX INFO: renamed from: g */
        private boolean f153870g;

        public C19431a(@NonNull List<t5c<Data>> list, @NonNull nj80<List<Throwable>> nj80Var) {
            this.f153865b = nj80Var;
            vn80.m201943c(list);
            this.f153864a = list;
            this.f153866c = 0;
        }

        /* JADX INFO: renamed from: e */
        private void m173579e() {
            if (this.f153870g) {
                return;
            }
            if (this.f153866c < this.f153864a.size() - 1) {
                this.f153866c++;
                mo95590d(this.f153867d, this.f153868e);
            } else {
                vn80.m201944d(this.f153869f);
                this.f153868e.mo5433c(new GlideException("Fetch failed", new ArrayList(this.f153869f)));
            }
        }

        @Override // p153l.t5c
        @NonNull
        /* JADX INFO: renamed from: a */
        public Class<Data> mo106029a() {
            return this.f153864a.get(0).mo106029a();
        }

        @Override // p153l.t5c.InterfaceC20239a
        /* JADX INFO: renamed from: b */
        public void mo5432b(@Nullable Data data) {
            if (data != null) {
                this.f153868e.mo5432b(data);
            } else {
                m173579e();
            }
        }

        @Override // p153l.t5c.InterfaceC20239a
        /* JADX INFO: renamed from: c */
        public void mo5433c(@NonNull Exception exc) {
            ((List) vn80.m201944d(this.f153869f)).add(exc);
            m173579e();
        }

        @Override // p153l.t5c
        public void cancel() {
            this.f153870g = true;
            Iterator<t5c<Data>> it = this.f153864a.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
        }

        @Override // p153l.t5c
        public void cleanup() {
            List<Throwable> list = this.f153869f;
            if (list != null) {
                this.f153865b.release(list);
            }
            this.f153869f = null;
            Iterator<t5c<Data>> it = this.f153864a.iterator();
            while (it.hasNext()) {
                it.next().cleanup();
            }
        }

        @Override // p153l.t5c
        /* JADX INFO: renamed from: d */
        public void mo95590d(@NonNull Priority priority, @NonNull t5c.InterfaceC20239a<? super Data> interfaceC20239a) {
            this.f153867d = priority;
            this.f153868e = interfaceC20239a;
            this.f153869f = this.f153865b.acquire();
            this.f153864a.get(this.f153866c).mo95590d(priority, this);
            if (this.f153870g) {
                cancel();
            }
        }

        @Override // p153l.t5c
        @NonNull
        public DataSource getDataSource() {
            return this.f153864a.get(0).getDataSource();
        }
    }

    public ps10(@NonNull List<re00<Model, Data>> list, @NonNull nj80<List<Throwable>> nj80Var) {
        this.f153862a = list;
        this.f153863b = nj80Var;
    }

    @Override // p153l.re00
    /* JADX INFO: renamed from: a */
    public re00.C19812a<Data> mo101565a(@NonNull Model model, int i, int i2, @NonNull u560 u560Var) {
        re00.C19812a<Data> c19812aMo101565a;
        int size = this.f153862a.size();
        ArrayList arrayList = new ArrayList(size);
        kzq kzqVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            re00<Model, Data> re00Var = this.f153862a.get(i3);
            if (re00Var.mo101566b(model) && (c19812aMo101565a = re00Var.mo101565a(model, i, i2, u560Var)) != null) {
                kzqVar = c19812aMo101565a.f162369a;
                arrayList.add(c19812aMo101565a.f162371c);
            }
        }
        if (arrayList.isEmpty() || kzqVar == null) {
            return null;
        }
        return new re00.C19812a<>(kzqVar, new C19431a(arrayList, this.f153863b));
    }

    @Override // p153l.re00
    /* JADX INFO: renamed from: b */
    public boolean mo101566b(@NonNull Model model) {
        Iterator<re00<Model, Data>> it = this.f153862a.iterator();
        while (it.hasNext()) {
            if (it.next().mo101566b(model)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f153862a.toArray()) + '}';
    }
}
