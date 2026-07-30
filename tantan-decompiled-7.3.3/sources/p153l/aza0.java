package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CategoriesDetail;
import com.p051p1.mobile.putong.core.data.Question;
import com.p051p1.mobile.putong.core.p058ui.profile.AnswerView;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopEditInfo;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopCreateTagAct;
import com.p051p1.mobile.putong.data.Answer;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VLinear_Dividers;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class aza0 extends ep90 {

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f74120u;

    /* JADX INFO: renamed from: v */
    public VText f74121v;

    /* JADX INFO: renamed from: w */
    public VText f74122w;

    /* JADX INFO: renamed from: x */
    public List<pf60<Question, Answer>> f74123x;

    /* JADX INFO: renamed from: y */
    public View f74124y;

    /* JADX INFO: renamed from: z */
    public List<CategoriesDetail> f74125z;

    public aza0(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
        this.f74123x = new ArrayList();
        this.f74125z = new ArrayList();
    }

    @Override // p153l.ep90
    /* JADX INFO: renamed from: O */
    public t3m mo53983O() {
        return (t3m) this.f148056c;
    }

    /* JADX INFO: renamed from: S */
    public View m101035S(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return bza0.m107139b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m101036T(Question question, Answer answer, View view) {
        LoopInputType loopInputType = LoopInputType.QUESTION_EDIT;
        LoopEditInfo createTagInfo = LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 500, "");
        createTagInfo.setSubTitle(question.text, true).setEditObjKey(answer.question).setDefaultContent(answer.value).setEmptyInput(true).setHarmonyTest(TextUtils.equals(question.source, "tacitTest"));
        mo53983O().startActivityForResult(ProfileLoopCreateTagAct.m52821c2(createTagInfo, mo53983O().act()), loopInputType.requestCode);
    }

    /* JADX INFO: renamed from: U */
    public final void m101037U(AnswerView answerView, boolean z, boolean z2) {
        answerView.m51683c(mo53983O().mo52302m0(), z, z2);
    }

    /* JADX INFO: renamed from: V */
    public final void m101038V(View view, int i) {
        VLinear_Dividers vLinear_Dividers = this.f74120u;
        if (vLinear_Dividers == null || view == null || i > vLinear_Dividers.getChildCount()) {
            return;
        }
        this.f74120u.addView(view, i);
    }

    /* JADX INFO: renamed from: W */
    public final void m101039W(int i, int i2) {
        int i3 = i + i2;
        VLinear_Dividers vLinear_Dividers = this.f74120u;
        if (vLinear_Dividers == null || i < 0 || i2 < 0 || i3 > vLinear_Dividers.getChildCount()) {
            return;
        }
        this.f74120u.removeViews(i, i2);
    }

    /* JADX INFO: renamed from: X */
    public void m101040X(User user) {
        boolean z = this instanceof mpe;
        if (!z) {
            m101039W(1, this.f74120u.getChildCount() - 2);
        } else if (gra.m131596L3()) {
            m101039W(2, this.f74120u.getChildCount() - 4);
        } else {
            boolean zM82486a = NullChecker.m82486a(this.f74124y);
            VLinear_Dividers vLinear_Dividers = this.f74120u;
            if (zM82486a) {
                m101039W(2, vLinear_Dividers.getChildCount() - 4);
            } else {
                m101039W(1, vLinear_Dividers.getChildCount() - 3);
            }
        }
        this.f74123x.clear();
        List<Answer> list = user.profile.answers;
        int i = 0;
        while (i < list.size()) {
            final Answer answer = list.get(i);
            final Question questionM151465o3 = CoreModule.f18264c.f20378d0.m151465o3(answer.question);
            if (NullChecker.m82486a(questionM151465o3)) {
                AnswerView answerView = (AnswerView) mo53983O().mo146493H2().inflate(kec0.f125447He, this.f74120u, false);
                m101037U(answerView, i == list.size() - 1, i == 0);
                answerView.m51682b(answer);
                VLinear_Dividers vLinear_Dividers2 = this.f74120u;
                if (z) {
                    m101038V(answerView, vLinear_Dividers2.getChildCount() - 2);
                } else {
                    m101038V(answerView, vLinear_Dividers2.getChildCount() - 1);
                }
                this.f74123x.add(pf60.m172085a(questionM151465o3, answer));
                if (mo53983O().mo52302m0()) {
                    bnl0.m105509E0(answerView, new View.OnClickListener() { // from class: l.zya0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f206567a.m101036T(questionM151465o3, answer, view);
                        }
                    });
                } else {
                    answerView.setBackgroundDrawable(null);
                    answerView.setOnLongClickListener(answerView);
                }
            }
            i++;
        }
        bnl0.m105524M(this.f74122w, mo53983O().mo52302m0());
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        super.mo53911j(view);
        this.f74121v.setTextColor(mo53983O().act().getResources().getColor(c9c0.f80368Q1));
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        if (mo53983O().mo52302m0()) {
            return false;
        }
        return !mo53983O().mo52252K2().profile.answers.isEmpty();
    }

    @Override // p153l.on2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        return m101035S(mo53983O().mo146493H2(), viewGroup);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        m101040X(mo53983O().mo52302m0() ? mo53983O().m189086i2() : mo53983O().mo52252K2());
    }
}
