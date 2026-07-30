package p153l;

import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.data.OMSDialogPositon;

/* JADX INFO: loaded from: classes11.dex */
public class fu4 implements z6m {

    /* JADX INFO: renamed from: b */
    public static final z6m f100879b = new fu4();

    /* JADX INFO: renamed from: d */
    public static z6m m127433d() {
        return f100879b;
    }

    @Override // p153l.z6m
    /* JADX INFO: renamed from: a */
    public boolean mo95724a(sj6 sj6Var, Message message) {
        if (tcu.m190496d().mo95724a(sj6Var, message) || !eu4.m122523b().m122528f(sj6Var.f168926a)) {
            return false;
        }
        if (sj6Var.f168936k.m161054a("e_answer_question_tip" + sj6Var.f168926a.f56859id)) {
            return true;
        }
        sj6Var.f168936k.m161055b("e_answer_question_tip" + sj6Var.f168926a.f56859id);
        sfj0.m185601h("e_answer_question_tip", OMSDialogPositon.p_messages_view, new sfj0.C20032a[0]);
        return true;
    }

    @Override // p153l.z6m
    /* JADX INFO: renamed from: b */
    public CharSequence mo95725b(sj6 sj6Var, Message message) {
        return c17.m107526s0("回答了你的问题", z6m.f203167a);
    }
}
