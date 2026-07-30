package p153l;

import androidx.annotation.NonNull;
import com.google.protobuf.InterfaceC3442q;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class v710 {

    /* JADX INFO: renamed from: a */
    public HashMap<String, List<fxl>> f182715a;

    /* JADX INFO: renamed from: l.v710$a */
    public static class C20779a {

        /* JADX INFO: renamed from: a */
        public static v710 f182716a = new v710();
    }

    public v710() {
        this.f182715a = new HashMap<>();
    }

    /* JADX INFO: renamed from: d */
    public static v710 m200166d() {
        return C20779a.f182716a;
    }

    /* JADX INFO: renamed from: b */
    public final void m200167b(List<fxl> list, String str, InterfaceC3442q interfaceC3442q, String str2) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (fxl fxlVar : list) {
            if (fxlVar instanceof mq2) {
                ((mq2) fxlVar).mo145146y(str, interfaceC3442q, str2).mo145145v();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m200168c(String str, @NonNull String str2, InterfaceC3442q interfaceC3442q, String str3) {
        m200167b(this.f182715a.get(str2), str, interfaceC3442q, str3);
    }

    /* JADX INFO: renamed from: e */
    public List<fxl> m200169e(String str) {
        return this.f182715a.get(str);
    }

    /* JADX INFO: renamed from: g */
    public LiveMessage m200171g(InterfaceC3442q interfaceC3442q) {
        List<fxl> list = this.f182715a.get("live.chat.msg");
        if (list == null || list.size() <= 0) {
            return null;
        }
        for (fxl fxlVar : list) {
            if (fxlVar instanceof mq2) {
                mq2 mq2Var = (mq2) fxlVar;
                mq2Var.mo145146y("msg_from_request", interfaceC3442q, p1w.f150202j);
                return mq2Var.f137994d;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void m200170f(String str, mq2 mq2Var) {
        if (str == null || str.trim().equals("")) {
            return;
        }
        this.f182715a.put(str, m200173i(this.f182715a.get(str), mq2Var));
    }

    /* JADX INFO: renamed from: i */
    public final List<fxl> m200173i(List<fxl> list, mq2 mq2Var) {
        if (list == null) {
            list = new ArrayList<>();
        }
        if (!list.contains(mq2Var)) {
            list.add(mq2Var);
        }
        return list;
    }

    /* JADX INFO: renamed from: j */
    public void m200174j(@NonNull final mq2 mq2Var) {
        if (mq2Var == null) {
            return;
        }
        m200170f(mq2Var.mo95511e(), mq2Var);
        List<String> listMo116845h = mq2Var.mo116845h();
        if (jyb.m147479J(listMo116845h)) {
            return;
        }
        jyb.m147537z(listMo116845h, new y20() { // from class: l.u710
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f177873a.m200170f(mq2Var, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m200175k() {
        this.f182715a.clear();
    }
}
