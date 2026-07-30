package p153l;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Question;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.ProfileInfoLoopEditAct;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopMyQuestionInputFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopQuestionAct;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileLoopActionLayout;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.Answer;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import p151v.VEditText;
import p151v.VImage;
import p151v.VLinear;

/* JADX INFO: loaded from: classes4.dex */
public class tra0 implements iam<lra0> {

    /* JADX INFO: renamed from: a */
    public VLinear f175836a;

    /* JADX INFO: renamed from: b */
    public TextView f175837b;

    /* JADX INFO: renamed from: c */
    public TextView f175838c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f175839d;

    /* JADX INFO: renamed from: e */
    public VLinear f175840e;

    /* JADX INFO: renamed from: f */
    public TextView f175841f;

    /* JADX INFO: renamed from: g */
    public VImage f175842g;

    /* JADX INFO: renamed from: h */
    public VImage f175843h;

    /* JADX INFO: renamed from: i */
    public RelativeLayout f175844i;

    /* JADX INFO: renamed from: j */
    public VEditText f175845j;

    /* JADX INFO: renamed from: k */
    public TextView f175846k;

    /* JADX INFO: renamed from: l */
    public TextView f175847l;

    /* JADX INFO: renamed from: m */
    public ProfileLoopActionLayout f175848m;

    /* JADX INFO: renamed from: n */
    public final Act f175849n;

    /* JADX INFO: renamed from: o */
    public lra0 f175850o;

    /* JADX INFO: renamed from: p */
    public final ProfileLoopMyQuestionInputFrag f175851p;

    /* JADX INFO: renamed from: q */
    public Question f175852q;

    /* JADX INFO: renamed from: r */
    public String f175853r = "";

    /* JADX INFO: renamed from: s */
    public User f175854s;

    /* JADX INFO: renamed from: t */
    public LoopInputType f175855t;

    public tra0(ProfileLoopMyQuestionInputFrag profileLoopMyQuestionInputFrag) {
        this.f175849n = profileLoopMyQuestionInputFrag.act();
        this.f175851p = profileLoopMyQuestionInputFrag;
    }

    /* JADX INFO: renamed from: A */
    public final void m192448A(LoopInputType loopInputType, User user) {
        i4g0.m138520r("e_save_qa", this.f175851p.pageId());
        if (loopInputType != LoopInputType.MY_QUESTION_PATCH) {
            m192455n(gta.m132210e().m132214d().mo34760Uc());
            this.f175849n.m51642n2();
            return;
        }
        this.f175849n.progress(R$string.f28619R0, true);
        m192455n(user);
        boolean zM82486a = NullChecker.m82486a(user.subtract(CoreModule.f18264c.f20381e0.m116593na()));
        Act act = this.f175849n;
        if (zM82486a) {
            tr90.m192412D(act, user, new Runnable() { // from class: l.pra0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f153741a.m192461w();
                }
            }, null);
        } else {
            act.progressDismiss();
            this.f175849n.m51642n2();
        }
    }

    /* JADX INFO: renamed from: B */
    public void m192449B() {
        new th0.C20312a(act()).m191160s("修改未保存").m191148g(false).m191151j("是否保存后再退出？").m191159r("不保存").m191156o(new View.OnClickListener() { // from class: l.rra0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f164564a.m192462x(view);
            }
        }).m191147f("保存后退出").m191144c(new View.OnClickListener() { // from class: l.sra0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f170316a.m192463y(view);
            }
        }).m191142a().m191141g();
    }

    /* JADX INFO: renamed from: C */
    public void m192450C(String str) {
        TextView textView = this.f175846k;
        StringBuilder sb = new StringBuilder();
        Objects.requireNonNull(this.f175850o);
        sb.append(100 - str.length());
        sb.append("");
        textView.setText(sb.toString());
        if (bnl0.m105529O0(this.f175848m)) {
            this.f175848m.m54151k();
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f175849n;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m192451j(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public View m192451j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ura0.m197501b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public void m192452k() {
        if (m192456p()) {
            m192449B();
        } else {
            this.f175849n.m51642n2();
        }
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(lra0 lra0Var) {
        this.f175850o = lra0Var;
    }

    /* JADX INFO: renamed from: m */
    public boolean m192454m() {
        return NullChecker.m82486a(this.f175845j.getText()) && !TextUtils.isEmpty(this.f175845j.getText().toString().trim());
    }

    /* JADX INFO: renamed from: n */
    public void m192455n(User user) {
        if (m192454m()) {
            String string = this.f175845j.getText().toString();
            if (TextUtils.isEmpty(this.f175853r)) {
                Answer answerNew_ = Answer.new_();
                answerNew_.question = this.f175852q.f56859id;
                answerNew_.value = string;
                user.profile.answers.add(answerNew_);
                return;
            }
            Answer answer = (Answer) jyb.m147529r(user.profile.answers, new qcj() { // from class: l.ora0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f148683a.m192458s((Answer) obj);
                }
            });
            if (NullChecker.m82486a(answer)) {
                answer.value = string;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public boolean m192456p() {
        String string = this.f175845j.getText() == null ? "" : this.f175845j.getText().toString();
        return (TextUtils.isEmpty(string) || TextUtils.equals(string, this.f175853r)) ? false : true;
    }

    /* JADX INFO: renamed from: q */
    public void m192457q(final User user, final LoopInputType loopInputType, final Question question) {
        this.f175854s = user;
        this.f175855t = loopInputType;
        this.f175852q = question;
        this.f175837b.setTypeface(Typeface.DEFAULT_BOLD);
        this.f175837b.setText("我的问答");
        this.f175841f.setText(question.text);
        this.f175841f.setTypeface(lyh0.m156283c(3), 1);
        if (jyb.m147479J(user.profile.answers)) {
            this.f175853r = "";
        } else {
            Answer answer = (Answer) jyb.m147529r(user.profile.answers, new qcj() { // from class: l.mra0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((Answer) obj).question, question.f56859id));
                }
            });
            if (!NullChecker.m82486a(answer) || TextUtils.isEmpty(answer.value)) {
                this.f175853r = "";
            } else {
                this.f175853r = answer.value;
            }
        }
        this.f175845j.setText(this.f175853r);
        this.f175845j.setSelection(this.f175853r.length());
        VEditText vEditText = this.f175845j;
        Objects.requireNonNull(this.f175850o);
        vEditText.setMaxLength(100);
        bnl0.m105509E0(this.f175839d, new View.OnClickListener() { // from class: l.nra0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f143394a.m192460v(loopInputType, user, view);
            }
        });
        if (this.f175849n instanceof ProfileInfoLoopEditAct) {
            bnl0.m105524M(this.f175838c, true);
            ((ProfileInfoLoopEditAct) act()).m52692b2().m52731W0(this.f175851p);
        } else {
            bnl0.m105540X(this.f175839d, qa00.f156338y);
            bnl0.m105524M(this.f175838c, false);
        }
        this.f175848m.m54152l(this.f175851p);
        m192450C(this.f175853r);
        this.f175845j.addTextChangedListener(new C20382a());
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Boolean m192458s(Answer answer) {
        return Boolean.valueOf(TextUtils.equals(answer.question, this.f175852q.f56859id));
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ boolean m192459u(LoopInputType loopInputType, User user, int i, int i2, Intent intent) {
        if (i != loopInputType.requestCode || !NullChecker.m82486a(intent) || i2 != -1) {
            return false;
        }
        Question question = (Question) intent.getSerializableExtra("loop_result_question");
        if (!NullChecker.m82486a(question) || TextUtils.isEmpty(question.text.trim())) {
            return false;
        }
        m192457q(user, loopInputType, question);
        return false;
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m192460v(final LoopInputType loopInputType, final User user, View view) {
        Intent intentM52843a2 = ProfileLoopQuestionAct.m52843a2(this.f175849n);
        intentM52843a2.putExtra("loop_create_tag_info", loopInputType);
        intentM52843a2.putExtra("loop_edit_user", this.f175850o.f133309b);
        intentM52843a2.putExtra("loop_new_style", true);
        this.f175849n.startActivityForResult(loopInputType.requestCode, intentM52843a2, new C4468a.a() { // from class: l.qra0
            @Override // com.p051p1.mobile.android.app.C4468a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo21400a(int i, int i2, Intent intent) {
                return this.f159079a.m192459u(loopInputType, user, i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m192461w() {
        r1j0.m179420g("已添加");
        this.f175849n.progressDismiss();
        this.f175849n.m51642n2();
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m192462x(View view) {
        this.f175849n.m51642n2();
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m192463y(View view) {
        m192448A(this.f175855t, this.f175854s);
    }

    /* JADX INFO: renamed from: z */
    public void m192464z() {
        if (act() instanceof ProfileInfoLoopEditAct) {
            i4g0.m138520r("e_save_qa", this.f175851p.pageId());
        } else {
            m192448A(this.f175855t, this.f175854s);
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.tra0$a */
    public class C20382a implements TextWatcher {
        public C20382a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (NullChecker.m82486a(editable)) {
                tra0.this.m192450C(editable.toString());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
