package p149l;

import com.google.android.gms.common.api.Api;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class chf0 implements pwa0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC16146b f80867a;

    /* JADX INFO: renamed from: l.chf0$a */
    public static class C16145a implements InterfaceC16146b {
        @Override // p149l.chf0.InterfaceC16146b
        /* JADX INFO: renamed from: a */
        public List<Integer> mo106865a() {
            return Collections.EMPTY_LIST;
        }

        @Override // p149l.chf0.InterfaceC16146b
        /* JADX INFO: renamed from: b */
        public int mo106866b() {
            return 0;
        }

        public C16145a() {
        }
    }

    /* JADX INFO: renamed from: l.chf0$b */
    public interface InterfaceC16146b {
        /* JADX INFO: renamed from: a */
        List<Integer> mo106865a();

        /* JADX INFO: renamed from: b */
        int mo106866b();
    }

    public chf0(InterfaceC16146b interfaceC16146b) {
        this.f80867a = (InterfaceC16146b) rf80.m179116g(interfaceC16146b);
    }

    @Override // p149l.pwa0
    /* JADX INFO: renamed from: a */
    public int mo106862a(int i) {
        List<Integer> listMo106865a = this.f80867a.mo106865a();
        if (listMo106865a == null || listMo106865a.isEmpty()) {
            return i + 1;
        }
        for (int i2 = 0; i2 < listMo106865a.size(); i2++) {
            if (listMo106865a.get(i2).intValue() > i) {
                return listMo106865a.get(i2).intValue();
            }
        }
        return Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    @Override // p149l.pwa0
    /* JADX INFO: renamed from: b */
    public mnb0 mo106863b(int i) {
        return ykm.m215143d(i, i >= this.f80867a.mo106866b(), false);
    }

    @Override // p149l.pwa0
    /* JADX INFO: renamed from: c */
    public boolean mo106864c() {
        return true;
    }

    public chf0() {
        this(new C16145a());
    }
}
