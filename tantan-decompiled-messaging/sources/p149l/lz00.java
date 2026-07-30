package p149l;

import androidx.annotation.NonNull;
import com.google.protobuf.InterfaceC3419q;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class lz00 {

    /* JADX INFO: renamed from: a */
    public HashMap<String, List<sul>> f130619a;

    /* JADX INFO: renamed from: l.lz00$a */
    public static class C18357a {

        /* JADX INFO: renamed from: a */
        public static lz00 f130620a = new lz00();
    }

    public lz00() {
        this.f130619a = new HashMap<>();
    }

    /* JADX INFO: renamed from: d */
    public static lz00 m152304d() {
        return C18357a.f130620a;
    }

    /* JADX INFO: renamed from: b */
    public final void m152305b(List<sul> list, String str, InterfaceC3419q interfaceC3419q, String str2) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (sul sulVar : list) {
            if (sulVar instanceof vp2) {
                ((vp2) sulVar).mo102260y(str, interfaceC3419q, str2).mo102259v();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m152306c(String str, @NonNull String str2, InterfaceC3419q interfaceC3419q, String str3) {
        m152305b(this.f130619a.get(str2), str, interfaceC3419q, str3);
    }

    /* JADX INFO: renamed from: e */
    public List<sul> m152307e(String str) {
        return this.f130619a.get(str);
    }

    /* JADX INFO: renamed from: g */
    public LiveMessage m152309g(InterfaceC3419q interfaceC3419q) {
        List<sul> list = this.f130619a.get("live.chat.msg");
        if (list == null || list.size() <= 0) {
            return null;
        }
        for (sul sulVar : list) {
            if (sulVar instanceof vp2) {
                vp2 vp2Var = (vp2) sulVar;
                vp2Var.mo102260y("msg_from_request", interfaceC3419q, rzv.f161691j);
                return vp2Var.f182446d;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void m152308f(String str, vp2 vp2Var) {
        if (str == null || str.trim().equals("")) {
            return;
        }
        this.f130619a.put(str, m152311i(this.f130619a.get(str), vp2Var));
    }

    /* JADX INFO: renamed from: i */
    public final List<sul> m152311i(List<sul> list, vp2 vp2Var) {
        if (list == null) {
            list = new ArrayList<>();
        }
        if (!list.contains(vp2Var)) {
            list.add(vp2Var);
        }
        return list;
    }

    /* JADX INFO: renamed from: j */
    public void m152312j(@NonNull final vp2 vp2Var) {
        if (vp2Var == null) {
            return;
        }
        m152308f(vp2Var.mo94399e(), vp2Var);
        List<String> listMo115407h = vp2Var.mo115407h();
        if (vwb.m200296J(listMo115407h)) {
            return;
        }
        vwb.m200354z(listMo115407h, new e30() { // from class: l.kz00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f125348a.m152308f(vp2Var, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m152313k() {
        this.f130619a.clear();
    }
}
