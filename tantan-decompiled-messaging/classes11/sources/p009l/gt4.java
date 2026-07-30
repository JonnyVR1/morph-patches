package p009l;

import com.p1.mobile.putong.core.data.Message;
import com.tantanapp.common.data.DbObject;
import l.o6j0;
import l.zz6;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class gt4 implements j4m {

    /* JADX INFO: renamed from: b */
    public static final j4m f13730b = new gt4();

    /* JADX INFO: renamed from: d */
    public static j4m m15260d() {
        return f13730b;
    }

    @Override // p009l.j4m
    /* JADX INFO: renamed from: a */
    public boolean mo11180a(pi6 pi6Var, Message message) {
        if (sau.m22015d().mo11180a(pi6Var, message) || !ft4.m14580b().m14585f(pi6Var.f18622a)) {
            return false;
        }
        if (pi6Var.f18632k.a("e_answer_question_tip" + ((DbObject) pi6Var.f18622a).id)) {
            return true;
        }
        pi6Var.f18632k.b("e_answer_question_tip" + ((DbObject) pi6Var.f18622a).id);
        o6j0.h("e_answer_question_tip", "p_messages_view", new o6j0.a[0]);
        return true;
    }

    @Override // p009l.j4m
    /* JADX INFO: renamed from: b */
    public CharSequence mo11181b(pi6 pi6Var, Message message) {
        return zz6.s0("回答了你的问题", j4m.f14933a);
    }
}
