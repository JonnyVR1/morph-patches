package p149l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Question;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8639c;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputMyQuestion;
import com.p046p1.mobile.putong.data.Answer;
import com.p046p1.mobile.putong.data.User;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p147v.VLinear;

/* JADX INFO: loaded from: classes4.dex */
public class idf extends AbstractC8639c {

    /* JADX INFO: renamed from: u */
    public VLinear f112546u;

    /* JADX INFO: renamed from: v */
    public View f112547v;

    public idf(@NonNull @NotNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ boolean m135429T(View view) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m135432X(View view) {
        o6j0.m162859c("e_profile_add_my_question", "p_edit_profile_view", new o6j0.C18854a[0]);
        fif.m121508c(m51157i(), new ExpLoopInputMyQuestion());
    }

    /* JADX INFO: renamed from: W */
    public void m135433W(final Question question, String str) {
        Answer answer = (Answer) vwb.m200346r(m51154f().profile.answers, new w9j() { // from class: l.hdf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((Answer) obj).question, question.f56011id));
            }
        });
        if (answer != null) {
            if (!TextUtils.isEmpty(str)) {
                answer.value = str;
            } else if (!vwb.m200296J(m51154f().profile.answers)) {
                m51154f().profile.answers.remove(answer);
            }
            m51172x().mo51067J3();
        }
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m135434Y(Question question, Answer answer, View view) {
        new yif(m51172x().getContext(), question, answer.value, new f30() { // from class: l.gdf
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f102109a.m135433W((Question) obj, (String) obj2);
            }
        }).show();
    }

    /* JADX INFO: renamed from: Z */
    public final void m135435Z(final Answer answer, final Question question, boolean z) {
        View viewInflate = m51172x().mo94568H2().inflate(f6c0.f95285B2, (ViewGroup) null);
        if (z) {
            xdl0.m208344M(viewInflate.findViewById(u4c0.f174493u2), false);
        }
        TextView textView = (TextView) viewInflate.findViewById(u4c0.f174231eb);
        ((TextView) viewInflate.findViewById(u4c0.f173835H)).setText(answer.value);
        textView.setText(question == null ? "" : question.text);
        viewInflate.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.edf
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return idf.m135429T(view);
            }
        });
        xdl0.m208329E0(viewInflate, new View.OnClickListener() { // from class: l.fdf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f97032a.m135434Y(question, answer, view);
            }
        });
        this.f112546u.addView(viewInflate, xdl0.f192403e, xdl0.f192404f);
        xdl0.m208344M(this.f112546u, true);
    }

    /* JADX INFO: renamed from: a0 */
    public void m135436a0(User user) {
        this.f112546u.removeAllViews();
        xdl0.m208344M(this.f112546u, false);
        List<Answer> list = user.profile.answers;
        int i = 0;
        while (i < list.size()) {
            Answer answer = list.get(i);
            Question questionM215900o3 = CoreModule.f17545c.f19636d0.m215900o3(answer.question);
            if (questionM215900o3 != null) {
                m135435Z(answer, questionM215900o3, i == list.size() - 1);
            }
            i++;
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: m */
    public String mo51161m() {
        return "我的问答";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: n */
    public String mo51162n() {
        return "question";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: q */
    public void mo51165q(View view) {
        super.mo51165q(view);
        xdl0.m208329E0(this.f112547v, new View.OnClickListener() { // from class: l.ddf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f85591a.m135432X(view2);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: y */
    public View mo51173y(ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(f6c0.f95301C2, (ViewGroup) null);
        this.f112546u = (VLinear) viewInflate.findViewById(u4c0.f173956O1);
        this.f112547v = viewInflate.findViewById(u4c0.f174507v);
        return viewInflate;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: z */
    public void mo51174z() {
        m135436a0(m51172x().m94569i2());
    }
}
