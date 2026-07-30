package p002l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.profile.AnswerView;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopEditInfo;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.input.ProfileLoopCreateTagAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.CategoriesDetail;
import com.p1.mobile.putong.core.data.Question;
import com.p1.mobile.putong.data.Answer;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.f6c0;
import l.j760;
import l.mcr;
import l.upa;
import l.w0c0;
import l.xdl0;
import l.xqa0;
import v.VLinear_Dividers;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class wqa0 extends ah90 {

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f21929u;

    /* JADX INFO: renamed from: v */
    public VText f21930v;

    /* JADX INFO: renamed from: w */
    public VText f21931w;

    /* JADX INFO: renamed from: x */
    public List<j760<Question, Answer>> f21932x;

    /* JADX INFO: renamed from: y */
    public View f21933y;

    /* JADX INFO: renamed from: z */
    public List<CategoriesDetail> f21934z;

    public wqa0(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f21932x = new ArrayList();
        this.f21934z = new ArrayList();
    }

    @Override // p002l.ah90
    /* JADX INFO: renamed from: O */
    public a1m mo3351O() {
        return (a1m) this.f12125c;
    }

    /* JADX INFO: renamed from: S */
    public View m25320S(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return xqa0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m25321T(Question question, Answer answer, View view) {
        LoopInputType loopInputType = LoopInputType.QUESTION_EDIT;
        LoopEditInfo createTagInfo = LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 500, "");
        createTagInfo.setSubTitle(question.text, true).setEditObjKey(answer.question).setDefaultContent(answer.value).setEmptyInput(true).setHarmonyTest(TextUtils.equals(question.source, "tacitTest"));
        mo3351O().startActivityForResult(ProfileLoopCreateTagAct.m2131b2(createTagInfo, mo3351O().act()), loopInputType.requestCode);
    }

    /* JADX INFO: renamed from: U */
    public final void m25322U(AnswerView answerView, boolean z, boolean z2) {
        answerView.m935c(mo3351O().mo1570m0(), z, z2);
    }

    /* JADX INFO: renamed from: V */
    public final void m25323V(View view, int i) {
        VLinear_Dividers vLinear_Dividers = this.f21929u;
        if (vLinear_Dividers == null || view == null || i > vLinear_Dividers.getChildCount()) {
            return;
        }
        this.f21929u.addView(view, i);
    }

    /* JADX INFO: renamed from: W */
    public final void m25324W(int i, int i2) {
        int i3 = i + i2;
        VLinear_Dividers vLinear_Dividers = this.f21929u;
        if (vLinear_Dividers == null || i < 0 || i2 < 0 || i3 > vLinear_Dividers.getChildCount()) {
            return;
        }
        this.f21929u.removeViews(i, i2);
    }

    /* JADX INFO: renamed from: X */
    public void m25325X(User user) {
        boolean z = this instanceof ioe;
        if (!z) {
            m25324W(1, this.f21929u.getChildCount() - 2);
        } else if (upa.L3()) {
            m25324W(2, this.f21929u.getChildCount() - 4);
        } else {
            boolean zA = NullChecker.a(this.f21933y);
            VLinear_Dividers vLinear_Dividers = this.f21929u;
            if (zA) {
                m25324W(2, vLinear_Dividers.getChildCount() - 4);
            } else {
                m25324W(1, vLinear_Dividers.getChildCount() - 3);
            }
        }
        this.f21932x.clear();
        List list = user.profile.answers;
        int i = 0;
        while (i < list.size()) {
            final Answer answer = (Answer) list.get(i);
            final Question questionO3 = CoreModule.c.d0.o3(answer.question);
            if (NullChecker.a(questionO3)) {
                AnswerView answerView = (AnswerView) mo3351O().mo9267H2().inflate(f6c0.Ae, this.f21929u, false);
                m25322U(answerView, i == list.size() - 1, i == 0);
                answerView.m934b(answer);
                VLinear_Dividers vLinear_Dividers2 = this.f21929u;
                if (z) {
                    m25323V(answerView, vLinear_Dividers2.getChildCount() - 2);
                } else {
                    m25323V(answerView, vLinear_Dividers2.getChildCount() - 1);
                }
                this.f21932x.add(j760.a(questionO3, answer));
                if (mo3351O().mo1570m0()) {
                    xdl0.E0(answerView, new View.OnClickListener() { // from class: l.vqa0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f21266a.m25321T(questionO3, answer, view);
                        }
                    });
                } else {
                    answerView.setBackgroundDrawable(null);
                    answerView.setOnLongClickListener(answerView);
                }
            }
            i++;
        }
        xdl0.M(this.f21931w, mo3351O().mo1570m0());
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
        this.f21930v.setTextColor(mo3351O().act().getResources().getColor(w0c0.P1));
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        if (mo3351O().mo1570m0()) {
            return false;
        }
        return !mo3351O().mo1517K2().profile.answers.isEmpty();
    }

    @Override // p002l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        return m25320S(mo3351O().mo9267H2(), viewGroup);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        m25325X(mo3351O().mo1570m0() ? mo3351O().m9268i2() : mo3351O().mo1517K2());
    }
}
