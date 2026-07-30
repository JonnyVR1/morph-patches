package p149l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CategoriesDetail;
import com.p046p1.mobile.putong.core.data.Question;
import com.p046p1.mobile.putong.core.p053ui.profile.AnswerView;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopEditInfo;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.input.ProfileLoopCreateTagAct;
import com.p046p1.mobile.putong.data.Answer;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VLinear_Dividers;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class wqa0 extends ah90 {

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f187673u;

    /* JADX INFO: renamed from: v */
    public VText f187674v;

    /* JADX INFO: renamed from: w */
    public VText f187675w;

    /* JADX INFO: renamed from: x */
    public List<j760<Question, Answer>> f187676x;

    /* JADX INFO: renamed from: y */
    public View f187677y;

    /* JADX INFO: renamed from: z */
    public List<CategoriesDetail> f187678z;

    public wqa0(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f187676x = new ArrayList();
        this.f187678z = new ArrayList();
    }

    @Override // p149l.ah90
    /* JADX INFO: renamed from: O */
    public a1m mo52800O() {
        return (a1m) this.f108534c;
    }

    /* JADX INFO: renamed from: S */
    public View m205053S(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return xqa0.m210563b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m205054T(Question question, Answer answer, View view) {
        LoopInputType loopInputType = LoopInputType.QUESTION_EDIT;
        LoopEditInfo createTagInfo = LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 500, "");
        createTagInfo.setSubTitle(question.text, true).setEditObjKey(answer.question).setDefaultContent(answer.value).setEmptyInput(true).setHarmonyTest(TextUtils.equals(question.source, "tacitTest"));
        mo52800O().startActivityForResult(ProfileLoopCreateTagAct.m51638b2(createTagInfo, mo52800O().act()), loopInputType.requestCode);
    }

    /* JADX INFO: renamed from: U */
    public final void m205055U(AnswerView answerView, boolean z, boolean z2) {
        answerView.m50500c(mo52800O().mo51119m0(), z, z2);
    }

    /* JADX INFO: renamed from: V */
    public final void m205056V(View view, int i) {
        VLinear_Dividers vLinear_Dividers = this.f187673u;
        if (vLinear_Dividers == null || view == null || i > vLinear_Dividers.getChildCount()) {
            return;
        }
        this.f187673u.addView(view, i);
    }

    /* JADX INFO: renamed from: W */
    public final void m205057W(int i, int i2) {
        int i3 = i + i2;
        VLinear_Dividers vLinear_Dividers = this.f187673u;
        if (vLinear_Dividers == null || i < 0 || i2 < 0 || i3 > vLinear_Dividers.getChildCount()) {
            return;
        }
        this.f187673u.removeViews(i, i2);
    }

    /* JADX INFO: renamed from: X */
    public void m205058X(User user) {
        boolean z = this instanceof ioe;
        if (!z) {
            m205057W(1, this.f187673u.getChildCount() - 2);
        } else if (upa.m194665L3()) {
            m205057W(2, this.f187673u.getChildCount() - 4);
        } else {
            boolean zM81303a = NullChecker.m81303a(this.f187677y);
            VLinear_Dividers vLinear_Dividers = this.f187673u;
            if (zM81303a) {
                m205057W(2, vLinear_Dividers.getChildCount() - 4);
            } else {
                m205057W(1, vLinear_Dividers.getChildCount() - 3);
            }
        }
        this.f187676x.clear();
        List<Answer> list = user.profile.answers;
        int i = 0;
        while (i < list.size()) {
            final Answer answer = list.get(i);
            final Question questionM215900o3 = CoreModule.f17545c.f19636d0.m215900o3(answer.question);
            if (NullChecker.m81303a(questionM215900o3)) {
                AnswerView answerView = (AnswerView) mo52800O().mo94568H2().inflate(f6c0.f95281Ae, this.f187673u, false);
                m205055U(answerView, i == list.size() - 1, i == 0);
                answerView.m50499b(answer);
                VLinear_Dividers vLinear_Dividers2 = this.f187673u;
                if (z) {
                    m205056V(answerView, vLinear_Dividers2.getChildCount() - 2);
                } else {
                    m205056V(answerView, vLinear_Dividers2.getChildCount() - 1);
                }
                this.f187676x.add(j760.m140076a(questionM215900o3, answer));
                if (mo52800O().mo51119m0()) {
                    xdl0.m208329E0(answerView, new View.OnClickListener() { // from class: l.vqa0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f182620a.m205054T(questionM215900o3, answer, view);
                        }
                    });
                } else {
                    answerView.setBackgroundDrawable(null);
                    answerView.setOnLongClickListener(answerView);
                }
            }
            i++;
        }
        xdl0.m208344M(this.f187675w, mo52800O().mo51119m0());
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
        this.f187674v.setTextColor(mo52800O().act().getResources().getColor(w0c0.f183796P1));
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        if (mo52800O().mo51119m0()) {
            return false;
        }
        return !mo52800O().mo51069K2().profile.answers.isEmpty();
    }

    @Override // p149l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        return m205053S(mo52800O().mo94568H2(), viewGroup);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        m205058X(mo52800O().mo51119m0() ? mo52800O().m94569i2() : mo52800O().mo51069K2());
    }
}
