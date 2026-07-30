package p153l;

import com.google.android.gms.common.api.Api;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class kpf0 implements t4b0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC18237b f127886a;

    /* JADX INFO: renamed from: l.kpf0$a */
    public static class C18236a implements InterfaceC18237b {
        @Override // p153l.kpf0.InterfaceC18237b
        /* JADX INFO: renamed from: a */
        public List<Integer> mo150726a() {
            return Collections.EMPTY_LIST;
        }

        @Override // p153l.kpf0.InterfaceC18237b
        /* JADX INFO: renamed from: b */
        public int mo150727b() {
            return 0;
        }

        public C18236a() {
        }
    }

    /* JADX INFO: renamed from: l.kpf0$b */
    public interface InterfaceC18237b {
        /* JADX INFO: renamed from: a */
        List<Integer> mo150726a();

        /* JADX INFO: renamed from: b */
        int mo150727b();
    }

    public kpf0(InterfaceC18237b interfaceC18237b) {
        this.f127886a = (InterfaceC18237b) wn80.m207182g(interfaceC18237b);
    }

    @Override // p153l.t4b0
    /* JADX INFO: renamed from: a */
    public int mo150723a(int i) {
        List<Integer> listMo150726a = this.f127886a.mo150726a();
        if (listMo150726a == null || listMo150726a.isEmpty()) {
            return i + 1;
        }
        for (int i2 = 0; i2 < listMo150726a.size(); i2++) {
            if (listMo150726a.get(i2).intValue() > i) {
                return listMo150726a.get(i2).intValue();
            }
        }
        return Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    @Override // p153l.t4b0
    /* JADX INFO: renamed from: b */
    public qvb0 mo150724b(int i) {
        return anm.m99001d(i, i >= this.f127886a.mo150727b(), false);
    }

    @Override // p153l.t4b0
    /* JADX INFO: renamed from: c */
    public boolean mo150725c() {
        return true;
    }

    public kpf0() {
        this(new C18236a());
    }
}
