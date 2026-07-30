package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Question;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8802c;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputMyQuestion;
import com.p051p1.mobile.putong.data.Answer;
import com.p051p1.mobile.putong.data.User;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p151v.VLinear;

/* JADX INFO: loaded from: classes4.dex */
public class oef extends AbstractC8802c {

    /* JADX INFO: renamed from: u */
    public VLinear f146986u;

    /* JADX INFO: renamed from: v */
    public View f146987v;

    public oef(@NonNull @NotNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ boolean m167358T(View view) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m167361X(View view) {
        sfj0.m185596c("e_profile_add_my_question", "p_edit_profile_view", new sfj0.C20032a[0]);
        ljf.m154506c(m52340i(), new ExpLoopInputMyQuestion());
    }

    /* JADX INFO: renamed from: W */
    public void m167362W(final Question question, String str) {
        Answer answer = (Answer) jyb.m147529r(m52337f().profile.answers, new qcj() { // from class: l.nef
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((Answer) obj).question, question.f56859id));
            }
        });
        if (answer != null) {
            if (!TextUtils.isEmpty(str)) {
                answer.value = str;
            } else if (!jyb.m147479J(m52337f().profile.answers)) {
                m52337f().profile.answers.remove(answer);
            }
            m52355x().mo52250J3();
        }
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m167363Y(Question question, Answer answer, View view) {
        new ekf(m52355x().getContext(), question, answer.value, new z20() { // from class: l.mef
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f136495a.m167362W((Question) obj, (String) obj2);
            }
        }).show();
    }

    /* JADX INFO: renamed from: Z */
    public final void m167364Z(final Answer answer, final Question question, boolean z) {
        View viewInflate = m52355x().mo146493H2().inflate(kec0.f125335B2, (ViewGroup) null);
        if (z) {
            bnl0.m105524M(viewInflate.findViewById(adc0.f70618w2), false);
        }
        TextView textView = (TextView) viewInflate.findViewById(adc0.f70356gb);
        ((TextView) viewInflate.findViewById(adc0.f69923H)).setText(answer.value);
        textView.setText(question == null ? "" : question.text);
        viewInflate.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.kef
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return oef.m167358T(view);
            }
        });
        bnl0.m105509E0(viewInflate, new View.OnClickListener() { // from class: l.lef
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f131743a.m167363Y(question, answer, view);
            }
        });
        this.f146986u.addView(viewInflate, bnl0.f77544e, bnl0.f77545f);
        bnl0.m105524M(this.f146986u, true);
    }

    /* JADX INFO: renamed from: a0 */
    public void m167365a0(User user) {
        this.f146986u.removeAllViews();
        bnl0.m105524M(this.f146986u, false);
        List<Answer> list = user.profile.answers;
        int i = 0;
        while (i < list.size()) {
            Answer answer = list.get(i);
            Question questionM151465o3 = CoreModule.f18264c.f20378d0.m151465o3(answer.question);
            if (questionM151465o3 != null) {
                m167364Z(answer, questionM151465o3, i == list.size() - 1);
            }
            i++;
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: m */
    public String mo52344m() {
        return "我的问答";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: n */
    public String mo52345n() {
        return "question";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: q */
    public void mo52348q(View view) {
        super.mo52348q(view);
        bnl0.m105509E0(this.f146987v, new View.OnClickListener() { // from class: l.jef
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f120483a.m167361X(view2);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: y */
    public View mo52356y(ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(kec0.f125352C2, (ViewGroup) null);
        this.f146986u = (VLinear) viewInflate.findViewById(adc0.f70044O1);
        this.f146987v = viewInflate.findViewById(adc0.f70598v);
        return viewInflate;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: z */
    public void mo52357z() {
        m167365a0(m52355x().m189086i2());
    }
}
