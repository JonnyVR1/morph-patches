package p002l;

import androidx.annotation.NonNull;
import com.google.protobuf.q;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import l.e30;
import l.sul;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class lz00 {

    /* JADX INFO: renamed from: a */
    public HashMap<String, List<sul>> f15181a;

    /* JADX INFO: renamed from: l.lz00$a */
    public static class C0673a {

        /* JADX INFO: renamed from: a */
        public static lz00 f15182a = new lz00();
    }

    public lz00() {
        this.f15181a = new HashMap<>();
    }

    /* JADX INFO: renamed from: d */
    public static lz00 m17628d() {
        return C0673a.f15182a;
    }

    /* JADX INFO: renamed from: b */
    public final void m17629b(List<sul> list, String str, q qVar, String str2) {
        if (list == null || list.size() <= 0) {
            return;
        }
        Iterator<sul> it = list.iterator();
        while (it.hasNext()) {
            vp2 vp2Var = (sul) it.next();
            if (vp2Var instanceof vp2) {
                vp2Var.mo10390y(str, qVar, str2).mo10389v();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m17630c(String str, @NonNull String str2, q qVar, String str3) {
        m17629b(this.f15181a.get(str2), str, qVar, str3);
    }

    /* JADX INFO: renamed from: e */
    public List<sul> m17631e(String str) {
        return this.f15181a.get(str);
    }

    /* JADX INFO: renamed from: g */
    public LiveMessage m17633g(q qVar) {
        List<sul> list = this.f15181a.get("live.chat.msg");
        if (list == null || list.size() <= 0) {
            return null;
        }
        Iterator<sul> it = list.iterator();
        while (it.hasNext()) {
            vp2 vp2Var = (sul) it.next();
            if (vp2Var instanceof vp2) {
                vp2 vp2Var2 = vp2Var;
                vp2Var2.mo10390y("msg_from_request", qVar, rzv.f18731j);
                return vp2Var2.f21260d;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void m17632f(String str, vp2 vp2Var) {
        if (str == null || str.trim().equals("")) {
            return;
        }
        this.f15181a.put(str, m17635i(this.f15181a.get(str), vp2Var));
    }

    /* JADX INFO: renamed from: i */
    public final List<sul> m17635i(List<sul> list, vp2 vp2Var) {
        if (list == null) {
            list = new ArrayList<>();
        }
        if (!list.contains(vp2Var)) {
            list.add(vp2Var);
        }
        return list;
    }

    /* JADX INFO: renamed from: j */
    public void m17636j(@NonNull final vp2 vp2Var) {
        if (vp2Var == null) {
            return;
        }
        m17632f(vp2Var.mo9245e(), vp2Var);
        List<String> listMo12303h = vp2Var.mo12303h();
        if (vwb.J(listMo12303h)) {
            return;
        }
        vwb.z(listMo12303h, new e30() { // from class: l.kz00
            public final void call(Object obj) {
                this.f14592a.m17632f(vp2Var, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m17637k() {
        this.f15181a.clear();
    }
}
