package p149l;

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
class fk10<Model, Data> implements i600<Model, Data> {

    /* JADX INFO: renamed from: a */
    private final List<i600<Model, Data>> f98023a;

    /* JADX INFO: renamed from: b */
    private final hb80<List<Throwable>> f98024b;

    /* JADX INFO: renamed from: l.fk10$a */
    public static class C16867a<Data> implements l4c<Data>, l4c.InterfaceC18148a<Data> {

        /* JADX INFO: renamed from: a */
        private final List<l4c<Data>> f98025a;

        /* JADX INFO: renamed from: b */
        private final hb80<List<Throwable>> f98026b;

        /* JADX INFO: renamed from: c */
        private int f98027c;

        /* JADX INFO: renamed from: d */
        private Priority f98028d;

        /* JADX INFO: renamed from: e */
        private l4c.InterfaceC18148a<? super Data> f98029e;

        /* JADX INFO: renamed from: f */
        @Nullable
        private List<Throwable> f98030f;

        /* JADX INFO: renamed from: g */
        private boolean f98031g;

        public C16867a(@NonNull List<l4c<Data>> list, @NonNull hb80<List<Throwable>> hb80Var) {
            this.f98026b = hb80Var;
            qf80.m174275c(list);
            this.f98025a = list;
            this.f98027c = 0;
        }

        /* JADX INFO: renamed from: e */
        private void m121842e() {
            if (this.f98031g) {
                return;
            }
            if (this.f98027c < this.f98025a.size() - 1) {
                this.f98027c++;
                mo99210d(this.f98028d, this.f98029e);
            } else {
                qf80.m174276d(this.f98030f);
                this.f98029e.mo5408c(new GlideException("Fetch failed", new ArrayList(this.f98030f)));
            }
        }

        @Override // p149l.l4c
        @NonNull
        /* JADX INFO: renamed from: a */
        public Class<Data> mo103356a() {
            return this.f98025a.get(0).mo103356a();
        }

        @Override // p149l.l4c.InterfaceC18148a
        /* JADX INFO: renamed from: b */
        public void mo5407b(@Nullable Data data) {
            if (data != null) {
                this.f98029e.mo5407b(data);
            } else {
                m121842e();
            }
        }

        @Override // p149l.l4c.InterfaceC18148a
        /* JADX INFO: renamed from: c */
        public void mo5408c(@NonNull Exception exc) {
            ((List) qf80.m174276d(this.f98030f)).add(exc);
            m121842e();
        }

        @Override // p149l.l4c
        public void cancel() {
            this.f98031g = true;
            Iterator<l4c<Data>> it = this.f98025a.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
        }

        @Override // p149l.l4c
        public void cleanup() {
            List<Throwable> list = this.f98030f;
            if (list != null) {
                this.f98026b.release(list);
            }
            this.f98030f = null;
            Iterator<l4c<Data>> it = this.f98025a.iterator();
            while (it.hasNext()) {
                it.next().cleanup();
            }
        }

        @Override // p149l.l4c
        /* JADX INFO: renamed from: d */
        public void mo99210d(@NonNull Priority priority, @NonNull l4c.InterfaceC18148a<? super Data> interfaceC18148a) {
            this.f98028d = priority;
            this.f98029e = interfaceC18148a;
            this.f98030f = this.f98026b.acquire();
            this.f98025a.get(this.f98027c).mo99210d(priority, this);
            if (this.f98031g) {
                cancel();
            }
        }

        @Override // p149l.l4c
        @NonNull
        public DataSource getDataSource() {
            return this.f98025a.get(0).getDataSource();
        }
    }

    public fk10(@NonNull List<i600<Model, Data>> list, @NonNull hb80<List<Throwable>> hb80Var) {
        this.f98023a = list;
        this.f98024b = hb80Var;
    }

    @Override // p149l.i600
    /* JADX INFO: renamed from: a */
    public i600.C17490a<Data> mo103352a(@NonNull Model model, int i, int i2, @NonNull px50 px50Var) {
        i600.C17490a<Data> c17490aMo103352a;
        int size = this.f98023a.size();
        ArrayList arrayList = new ArrayList(size);
        kxq kxqVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            i600<Model, Data> i600Var = this.f98023a.get(i3);
            if (i600Var.mo103353b(model) && (c17490aMo103352a = i600Var.mo103352a(model, i, i2, px50Var)) != null) {
                kxqVar = c17490aMo103352a.f111665a;
                arrayList.add(c17490aMo103352a.f111667c);
            }
        }
        if (arrayList.isEmpty() || kxqVar == null) {
            return null;
        }
        return new i600.C17490a<>(kxqVar, new C16867a(arrayList, this.f98024b));
    }

    @Override // p149l.i600
    /* JADX INFO: renamed from: b */
    public boolean mo103353b(@NonNull Model model) {
        Iterator<i600<Model, Data>> it = this.f98023a.iterator();
        while (it.hasNext()) {
            if (it.next().mo103353b(model)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f98023a.toArray()) + '}';
    }
}
