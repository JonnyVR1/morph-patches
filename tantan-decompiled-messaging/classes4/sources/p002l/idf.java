package p002l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0064c;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputMyQuestion;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Question;
import com.p1.mobile.putong.data.Answer;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import java.util.List;
import l.f30;
import l.f6c0;
import l.mcr;
import l.o6j0;
import l.u4c0;
import l.vwb;
import l.w9j;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class idf extends AbstractC0064c {

    /* JADX INFO: renamed from: u */
    public VLinear f13157u;

    /* JADX INFO: renamed from: v */
    public View f13158v;

    public idf(@NonNull @NotNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ boolean m15089T(View view) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m15092X(View view) {
        o6j0.c("e_profile_add_my_question", "p_edit_profile_view", new o6j0.a[0]);
        fif.m13250c(m1609i(), new ExpLoopInputMyQuestion());
    }

    /* JADX INFO: renamed from: W */
    public void m15093W(final Question question, String str) {
        Answer answer = (Answer) vwb.r(m1606f().profile.answers, new w9j() { // from class: l.hdf
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((Answer) obj).question, ((DbObject) question).id));
            }
        });
        if (answer != null) {
            if (!TextUtils.isEmpty(str)) {
                answer.value = str;
            } else if (!vwb.J(m1606f().profile.answers)) {
                m1606f().profile.answers.remove(answer);
            }
            m1624x().mo1515J3();
        }
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m15094Y(Question question, Answer answer, View view) {
        new yif(m1624x().getContext(), question, answer.value, new f30() { // from class: l.gdf
            public final void call(Object obj, Object obj2) {
                this.f11381a.m15093W((Question) obj, (String) obj2);
            }
        }).show();
    }

    /* JADX INFO: renamed from: Z */
    public final void m15095Z(final Answer answer, final Question question, boolean z) {
        View viewInflate = m1624x().mo9267H2().inflate(f6c0.B2, (ViewGroup) null);
        if (z) {
            xdl0.M(viewInflate.findViewById(u4c0.u2), false);
        }
        TextView textView = (TextView) viewInflate.findViewById(u4c0.eb);
        ((TextView) viewInflate.findViewById(u4c0.H)).setText(answer.value);
        textView.setText(question == null ? "" : question.text);
        viewInflate.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.edf
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return idf.m15089T(view);
            }
        });
        xdl0.E0(viewInflate, new View.OnClickListener() { // from class: l.fdf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10295a.m15094Y(question, answer, view);
            }
        });
        this.f13157u.addView(viewInflate, xdl0.e, xdl0.f);
        xdl0.M(this.f13157u, true);
    }

    /* JADX INFO: renamed from: a0 */
    public void m15096a0(User user) {
        this.f13157u.removeAllViews();
        xdl0.M(this.f13157u, false);
        List list = user.profile.answers;
        int i = 0;
        while (i < list.size()) {
            Answer answer = (Answer) list.get(i);
            Question questionO3 = CoreModule.c.d0.o3(answer.question);
            if (questionO3 != null) {
                m15095Z(answer, questionO3, i == list.size() - 1);
            }
            i++;
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: m */
    public String mo1613m() {
        return "我的问答";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: n */
    public String mo1614n() {
        return "question";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: q */
    public void mo1617q(View view) {
        super.mo1617q(view);
        xdl0.E0(this.f13158v, new View.OnClickListener() { // from class: l.ddf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f9175a.m15092X(view2);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: y */
    public View mo1625y(ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(f6c0.C2, (ViewGroup) null);
        this.f13157u = viewInflate.findViewById(u4c0.O1);
        this.f13158v = viewInflate.findViewById(u4c0.v);
        return viewInflate;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: z */
    public void mo1626z() {
        m15096a0(m1624x().m9268i2());
    }
}
