package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Question;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.ProfileInfoLoopEditAct;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.input.ProfileLoopMyQuestionInputFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.input.ProfileLoopQuestionAct;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileLoopActionLayout;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.Answer;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import p147v.VEditText;
import p147v.VImage;
import p147v.VLinear;

/* JADX INFO: loaded from: classes4.dex */
public class pja0 implements s7m<hja0> {

    /* JADX INFO: renamed from: a */
    public VLinear f149741a;

    /* JADX INFO: renamed from: b */
    public TextView f149742b;

    /* JADX INFO: renamed from: c */
    public TextView f149743c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f149744d;

    /* JADX INFO: renamed from: e */
    public VLinear f149745e;

    /* JADX INFO: renamed from: f */
    public TextView f149746f;

    /* JADX INFO: renamed from: g */
    public VImage f149747g;

    /* JADX INFO: renamed from: h */
    public VImage f149748h;

    /* JADX INFO: renamed from: i */
    public RelativeLayout f149749i;

    /* JADX INFO: renamed from: j */
    public VEditText f149750j;

    /* JADX INFO: renamed from: k */
    public TextView f149751k;

    /* JADX INFO: renamed from: l */
    public TextView f149752l;

    /* JADX INFO: renamed from: m */
    public ProfileLoopActionLayout f149753m;

    /* JADX INFO: renamed from: n */
    public final Act f149754n;

    /* JADX INFO: renamed from: o */
    public hja0 f149755o;

    /* JADX INFO: renamed from: p */
    public final ProfileLoopMyQuestionInputFrag f149756p;

    /* JADX INFO: renamed from: q */
    public Question f149757q;

    /* JADX INFO: renamed from: r */
    public String f149758r = "";

    /* JADX INFO: renamed from: s */
    public User f149759s;

    /* JADX INFO: renamed from: t */
    public LoopInputType f149760t;

    public pja0(ProfileLoopMyQuestionInputFrag profileLoopMyQuestionInputFrag) {
        this.f149754n = profileLoopMyQuestionInputFrag.act();
        this.f149756p = profileLoopMyQuestionInputFrag;
    }

    /* JADX INFO: renamed from: A */
    public final void m169823A(LoopInputType loopInputType, User user) {
        zvf0.m220396r("e_save_qa", this.f149756p.pageId());
        if (loopInputType != LoopInputType.MY_QUESTION_PATCH) {
            m169830n(ura.m195053e().m195057d().mo33757Uc());
            this.f149754n.m50458m2();
            return;
        }
        this.f149754n.progress(R$string.f27771R0, true);
        m169830n(user);
        boolean zM81303a = NullChecker.m81303a(user.subtract(CoreModule.f17545c.f19639e0.m169520na()));
        Act act = this.f149754n;
        if (zM81303a) {
            pj90.m169787D(act, user, new Runnable() { // from class: l.lja0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f128300a.m169836w();
                }
            }, null);
        } else {
            act.progressDismiss();
            this.f149754n.m50458m2();
        }
    }

    /* JADX INFO: renamed from: B */
    public void m169824B() {
        new xh0.C21150a(act()).m208740s("修改未保存").m208728g(false).m208731j("是否保存后再退出？").m208739r("不保存").m208736o(new View.OnClickListener() { // from class: l.nja0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f139222a.m169837x(view);
            }
        }).m208727f("保存后退出").m208724c(new View.OnClickListener() { // from class: l.oja0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f144260a.m169838y(view);
            }
        }).m208722a().m208721g();
    }

    /* JADX INFO: renamed from: C */
    public void m169825C(String str) {
        TextView textView = this.f149751k;
        StringBuilder sb = new StringBuilder();
        Objects.requireNonNull(this.f149755o);
        sb.append(100 - str.length());
        sb.append("");
        textView.setText(sb.toString());
        if (xdl0.m208349O0(this.f149753m)) {
            this.f149753m.m52968k();
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f149754n;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m169826j(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public View m169826j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return qja0.m174981b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public void m169827k() {
        if (m169831p()) {
            m169824B();
        } else {
            this.f149754n.m50458m2();
        }
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(hja0 hja0Var) {
        this.f149755o = hja0Var;
    }

    /* JADX INFO: renamed from: m */
    public boolean m169829m() {
        return NullChecker.m81303a(this.f149750j.getText()) && !TextUtils.isEmpty(this.f149750j.getText().toString().trim());
    }

    /* JADX INFO: renamed from: n */
    public void m169830n(User user) {
        if (m169829m()) {
            String string = this.f149750j.getText().toString();
            if (TextUtils.isEmpty(this.f149758r)) {
                Answer answerNew_ = Answer.new_();
                answerNew_.question = this.f149757q.f56011id;
                answerNew_.value = string;
                user.profile.answers.add(answerNew_);
                return;
            }
            Answer answer = (Answer) vwb.m200346r(user.profile.answers, new w9j() { // from class: l.kja0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f123441a.m169833s((Answer) obj);
                }
            });
            if (NullChecker.m81303a(answer)) {
                answer.value = string;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public boolean m169831p() {
        String string = this.f149750j.getText() == null ? "" : this.f149750j.getText().toString();
        return (TextUtils.isEmpty(string) || TextUtils.equals(string, this.f149758r)) ? false : true;
    }

    /* JADX INFO: renamed from: q */
    public void m169832q(final User user, final LoopInputType loopInputType, final Question question) {
        this.f149759s = user;
        this.f149760t = loopInputType;
        this.f149757q = question;
        this.f149742b.setTypeface(Typeface.DEFAULT_BOLD);
        this.f149742b.setText("我的问答");
        this.f149746f.setText(question.text);
        this.f149746f.setTypeface(eqh0.m117752c(3), 1);
        if (vwb.m200296J(user.profile.answers)) {
            this.f149758r = "";
        } else {
            Answer answer = (Answer) vwb.m200346r(user.profile.answers, new w9j() { // from class: l.ija0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((Answer) obj).question, question.f56011id));
                }
            });
            if (!NullChecker.m81303a(answer) || TextUtils.isEmpty(answer.value)) {
                this.f149758r = "";
            } else {
                this.f149758r = answer.value;
            }
        }
        this.f149750j.setText(this.f149758r);
        this.f149750j.setSelection(this.f149758r.length());
        VEditText vEditText = this.f149750j;
        Objects.requireNonNull(this.f149755o);
        vEditText.setMaxLength(100);
        xdl0.m208329E0(this.f149744d, new View.OnClickListener() { // from class: l.jja0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f118253a.m169835v(loopInputType, user, view);
            }
        });
        if (this.f149754n instanceof ProfileInfoLoopEditAct) {
            xdl0.m208344M(this.f149743c, true);
            ((ProfileInfoLoopEditAct) act()).m51509a2().m51548W0(this.f149756p);
        } else {
            xdl0.m208360X(this.f149744d, t100.f167276y);
            xdl0.m208344M(this.f149743c, false);
        }
        this.f149753m.m52969l(this.f149756p);
        m169825C(this.f149758r);
        this.f149750j.addTextChangedListener(new C19243a());
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Boolean m169833s(Answer answer) {
        return Boolean.valueOf(TextUtils.equals(answer.question, this.f149757q.f56011id));
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ boolean m169834u(LoopInputType loopInputType, User user, int i, int i2, Intent intent) {
        if (i != loopInputType.requestCode || !NullChecker.m81303a(intent) || i2 != -1) {
            return false;
        }
        Question question = (Question) intent.getSerializableExtra("loop_result_question");
        if (!NullChecker.m81303a(question) || TextUtils.isEmpty(question.text.trim())) {
            return false;
        }
        m169832q(user, loopInputType, question);
        return false;
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m169835v(final LoopInputType loopInputType, final User user, View view) {
        Intent intentM51660Z1 = ProfileLoopQuestionAct.m51660Z1(this.f149754n);
        intentM51660Z1.putExtra("loop_create_tag_info", loopInputType);
        intentM51660Z1.putExtra("loop_edit_user", this.f149755o.f108052b);
        intentM51660Z1.putExtra("loop_new_style", true);
        this.f149754n.startActivityForResult(loopInputType.requestCode, intentM51660Z1, new C4317a.a() { // from class: l.mja0
            @Override // com.p046p1.mobile.android.app.C4317a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo20401a(int i, int i2, Intent intent) {
                return this.f134114a.m169834u(loopInputType, user, i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m169836w() {
        osi0.m165783g("已添加");
        this.f149754n.progressDismiss();
        this.f149754n.m50458m2();
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m169837x(View view) {
        this.f149754n.m50458m2();
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m169838y(View view) {
        m169823A(this.f149760t, this.f149759s);
    }

    /* JADX INFO: renamed from: z */
    public void m169839z() {
        if (act() instanceof ProfileInfoLoopEditAct) {
            zvf0.m220396r("e_save_qa", this.f149756p.pageId());
        } else {
            m169823A(this.f149760t, this.f149759s);
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.pja0$a */
    public class C19243a implements TextWatcher {
        public C19243a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (NullChecker.m81303a(editable)) {
                pja0.this.m169825C(editable.toString());
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
