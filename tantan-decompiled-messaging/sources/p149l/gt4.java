package p149l;

import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.data.OMSDialogPositon;

/* JADX INFO: loaded from: classes11.dex */
public class gt4 implements j4m {

    /* JADX INFO: renamed from: b */
    public static final j4m f104243b = new gt4();

    /* JADX INFO: renamed from: d */
    public static j4m m127875d() {
        return f104243b;
    }

    @Override // p149l.j4m
    /* JADX INFO: renamed from: a */
    public boolean mo94463a(pi6 pi6Var, Message message) {
        if (sau.m183099d().mo94463a(pi6Var, message) || !ft4.m123008b().m123013f(pi6Var.f149101a)) {
            return false;
        }
        if (pi6Var.f149111k.m176377a("e_answer_question_tip" + pi6Var.f149101a.f56011id)) {
            return true;
        }
        pi6Var.f149111k.m176378b("e_answer_question_tip" + pi6Var.f149101a.f56011id);
        o6j0.m162864h("e_answer_question_tip", OMSDialogPositon.p_messages_view, new o6j0.C18854a[0]);
        return true;
    }

    @Override // p149l.j4m
    /* JADX INFO: renamed from: b */
    public CharSequence mo94464b(pi6 pi6Var, Message message) {
        return zz6.m221002s0("回答了你的问题", j4m.f116204a);
    }
}
