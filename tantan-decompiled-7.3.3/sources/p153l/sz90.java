package p153l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class sz90 implements j7q {

    /* JADX INFO: renamed from: a */
    public final u3m f171366a;

    /* JADX INFO: renamed from: b */
    public ner f171367b;

    /* JADX INFO: renamed from: c */
    public List<on2<t3m>> f171368c = new ArrayList();

    public sz90(u3m u3mVar, ner nerVar) {
        this.f171366a = u3mVar;
        this.f171367b = nerVar;
    }

    /* JADX INFO: renamed from: c */
    public List<on2<t3m>> m188629c() {
        if (jyb.m147479J(this.f171368c)) {
            mo142369a(this.f171368c);
        }
        return this.f171368c;
    }

    /* JADX INFO: renamed from: d */
    public on2 m188630d(final Class<? extends on2<t3m>> cls) {
        return (on2) jyb.m147529r(this.f171368c, new qcj() { // from class: l.rz90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((on2) obj).getClass().isAssignableFrom(cls));
            }
        });
    }
}
