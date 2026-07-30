package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Question;
import com.p051p1.mobile.putong.data.Answer;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class l220 extends jic0<Answer> {

    /* JADX INFO: renamed from: c */
    public List<Answer> f129737c;

    /* JADX INFO: renamed from: d */
    public InterfaceC18335a f129738d;

    /* JADX INFO: renamed from: l.l220$a */
    public interface InterfaceC18335a {
        /* JADX INFO: renamed from: a */
        void mo152556a(Question question, Answer answer);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        if (jyb.m147479J(this.f129737c)) {
            return 0;
        }
        return this.f129737c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return p9r.m171370a(viewGroup.getContext()).inflate(kec0.f125377Da, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, final Answer answer, int i, int i2) {
        VText vText = (VText) view.findViewById(adc0.f70409je);
        VText vText2 = (VText) view.findViewById(adc0.f70061P1);
        final Question questionM151465o3 = CoreModule.f18264c.f20378d0.m151465o3(answer.question);
        vText2.setText(answer.value);
        vText.setText(questionM151465o3.text);
        bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.k220
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f123568a.m152553H(questionM151465o3, answer, view2);
            }
        });
        vText.setTypeface(null, 1);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public Answer getItem(int i) {
        if (jyb.m147479J(this.f129737c)) {
            return null;
        }
        return this.f129737c.get(i);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m152553H(Question question, Answer answer, View view) {
        if (NullChecker.m82486a(this.f129738d)) {
            this.f129738d.mo152556a(question, answer);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m152554I(InterfaceC18335a interfaceC18335a) {
        this.f129738d = interfaceC18335a;
    }

    /* JADX INFO: renamed from: J */
    public void m152555J(List<Answer> list) {
        this.f129737c = list;
    }
}
