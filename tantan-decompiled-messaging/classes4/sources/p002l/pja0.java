package p002l;

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
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.ProfileInfoLoopEditAct;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.input.ProfileLoopMyQuestionInputFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.input.ProfileLoopQuestionAct;
import com.p000p1.mobile.putong.core.p001ui.profile.views.ProfileLoopActionLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.a;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Question;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.data.Answer;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.io.Serializable;
import java.util.Objects;
import l.eqh0;
import l.osi0;
import l.pj90;
import l.qja0;
import l.s7m;
import l.t100;
import l.ura;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.xh0;
import l.zvf0;
import v.VEditText;
import v.VImage;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class pja0 implements s7m<hja0> {

    /* JADX INFO: renamed from: a */
    public VLinear f17415a;

    /* JADX INFO: renamed from: b */
    public TextView f17416b;

    /* JADX INFO: renamed from: c */
    public TextView f17417c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f17418d;

    /* JADX INFO: renamed from: e */
    public VLinear f17419e;

    /* JADX INFO: renamed from: f */
    public TextView f17420f;

    /* JADX INFO: renamed from: g */
    public VImage f17421g;

    /* JADX INFO: renamed from: h */
    public VImage f17422h;

    /* JADX INFO: renamed from: i */
    public RelativeLayout f17423i;

    /* JADX INFO: renamed from: j */
    public VEditText f17424j;

    /* JADX INFO: renamed from: k */
    public TextView f17425k;

    /* JADX INFO: renamed from: l */
    public TextView f17426l;

    /* JADX INFO: renamed from: m */
    public ProfileLoopActionLayout f17427m;

    /* JADX INFO: renamed from: n */
    public final Act f17428n;

    /* JADX INFO: renamed from: o */
    public hja0 f17429o;

    /* JADX INFO: renamed from: p */
    public final ProfileLoopMyQuestionInputFrag f17430p;

    /* JADX INFO: renamed from: q */
    public Question f17431q;

    /* JADX INFO: renamed from: r */
    public String f17432r = "";

    /* JADX INFO: renamed from: s */
    public User f17433s;

    /* JADX INFO: renamed from: t */
    public LoopInputType f17434t;

    public pja0(ProfileLoopMyQuestionInputFrag profileLoopMyQuestionInputFrag) {
        this.f17428n = profileLoopMyQuestionInputFrag.act();
        this.f17430p = profileLoopMyQuestionInputFrag;
    }

    /* JADX INFO: renamed from: A */
    public final void m20357A(LoopInputType loopInputType, User user) {
        zvf0.r("e_save_qa", this.f17430p.pageId());
        if (loopInputType != LoopInputType.MY_QUESTION_PATCH) {
            m20366n(ura.e().d().Uc());
            this.f17428n.finish();
            return;
        }
        this.f17428n.progress(R.string.R0, true);
        m20366n(user);
        boolean zA = NullChecker.a(user.subtract(CoreModule.c.e0.na()));
        Act act = this.f17428n;
        if (zA) {
            pj90.D(act, user, new Runnable() { // from class: l.lja0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14888a.m20372w();
                }
            }, (Runnable) null);
        } else {
            act.progressDismiss();
            this.f17428n.finish();
        }
    }

    /* JADX INFO: renamed from: B */
    public void m20358B() {
        new xh0.a(act()).s("修改未保存").g(false).j("是否保存后再退出？").r("不保存").o(new View.OnClickListener() { // from class: l.nja0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16072a.m20373x(view);
            }
        }).f("保存后退出").c(new View.OnClickListener() { // from class: l.oja0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16646a.m20374y(view);
            }
        }).a().g();
    }

    /* JADX INFO: renamed from: C */
    public void m20359C(String str) {
        TextView textView = this.f17425k;
        StringBuilder sb = new StringBuilder();
        Objects.requireNonNull(this.f17429o);
        sb.append(100 - str.length());
        sb.append("");
        textView.setText(sb.toString());
        if (xdl0.O0(this.f17427m)) {
            this.f17427m.m3526k();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m20360C0() {
        return this.f17428n;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m20362j(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public View m20362j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return qja0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public void m20363k() {
        if (m20367p()) {
            m20358B();
        } else {
            this.f17428n.finish();
        }
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void m20361i1(hja0 hja0Var) {
        this.f17429o = hja0Var;
    }

    /* JADX INFO: renamed from: m */
    public boolean m20365m() {
        return NullChecker.a(this.f17424j.getText()) && !TextUtils.isEmpty(this.f17424j.getText().toString().trim());
    }

    /* JADX INFO: renamed from: n */
    public void m20366n(User user) {
        if (m20365m()) {
            String string = this.f17424j.getText().toString();
            if (TextUtils.isEmpty(this.f17432r)) {
                Answer answerNew_ = Answer.new_();
                answerNew_.question = ((DbObject) this.f17431q).id;
                answerNew_.value = string;
                user.profile.answers.add(answerNew_);
                return;
            }
            Answer answer = (Answer) vwb.r(user.profile.answers, new w9j() { // from class: l.kja0
                public final Object call(Object obj) {
                    return this.f14356a.m20369s((Answer) obj);
                }
            });
            if (NullChecker.a(answer)) {
                answer.value = string;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public boolean m20367p() {
        String string = this.f17424j.getText() == null ? "" : this.f17424j.getText().toString();
        return (TextUtils.isEmpty(string) || TextUtils.equals(string, this.f17432r)) ? false : true;
    }

    /* JADX INFO: renamed from: q */
    public void m20368q(final User user, final LoopInputType loopInputType, final Question question) {
        this.f17433s = user;
        this.f17434t = loopInputType;
        this.f17431q = question;
        this.f17416b.setTypeface(Typeface.DEFAULT_BOLD);
        this.f17416b.setText("我的问答");
        this.f17420f.setText(question.text);
        this.f17420f.setTypeface(eqh0.c(3), 1);
        if (vwb.J(user.profile.answers)) {
            this.f17432r = "";
        } else {
            Answer answer = (Answer) vwb.r(user.profile.answers, new w9j() { // from class: l.ija0
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((Answer) obj).question, ((DbObject) question).id));
                }
            });
            if (!NullChecker.a(answer) || TextUtils.isEmpty(answer.value)) {
                this.f17432r = "";
            } else {
                this.f17432r = answer.value;
            }
        }
        this.f17424j.setText(this.f17432r);
        this.f17424j.setSelection(this.f17432r.length());
        VEditText vEditText = this.f17424j;
        Objects.requireNonNull(this.f17429o);
        vEditText.setMaxLength(100);
        xdl0.E0(this.f17418d, new View.OnClickListener() { // from class: l.jja0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13805a.m20371v(loopInputType, user, view);
            }
        });
        if (this.f17428n instanceof ProfileInfoLoopEditAct) {
            xdl0.M(this.f17417c, true);
            act().m1991a2().m2030W0(this.f17430p);
        } else {
            xdl0.X(this.f17418d, t100.y);
            xdl0.M(this.f17417c, false);
        }
        this.f17427m.m3527l(this.f17430p);
        m20359C(this.f17432r);
        this.f17424j.addTextChangedListener(new C0749a());
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Boolean m20369s(Answer answer) {
        return Boolean.valueOf(TextUtils.equals(answer.question, ((DbObject) this.f17431q).id));
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ boolean m20370u(LoopInputType loopInputType, User user, int i, int i2, Intent intent) {
        if (i != loopInputType.requestCode || !NullChecker.a(intent) || i2 != -1) {
            return false;
        }
        Question question = (Question) intent.getSerializableExtra("loop_result_question");
        if (!NullChecker.a(question) || TextUtils.isEmpty(question.text.trim())) {
            return false;
        }
        m20368q(user, loopInputType, question);
        return false;
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m20371v(final LoopInputType loopInputType, final User user, View view) {
        Intent intentM2169Z1 = ProfileLoopQuestionAct.m2169Z1(this.f17428n);
        intentM2169Z1.putExtra("loop_create_tag_info", loopInputType);
        intentM2169Z1.putExtra("loop_edit_user", (Serializable) this.f17429o.f12064b);
        intentM2169Z1.putExtra("loop_new_style", true);
        this.f17428n.startActivityForResult(loopInputType.requestCode, intentM2169Z1, new a.a() { // from class: l.mja0
            /* JADX INFO: renamed from: a */
            public final boolean m17970a(int i, int i2, Intent intent) {
                return this.f15407a.m20370u(loopInputType, user, i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m20372w() {
        osi0.g("已添加");
        this.f17428n.progressDismiss();
        this.f17428n.finish();
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m20373x(View view) {
        this.f17428n.finish();
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m20374y(View view) {
        m20357A(this.f17434t, this.f17433s);
    }

    /* JADX INFO: renamed from: z */
    public void m20375z() {
        if (act() instanceof ProfileInfoLoopEditAct) {
            zvf0.r("e_save_qa", this.f17430p.pageId());
        } else {
            m20357A(this.f17434t, this.f17433s);
        }
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: l.pja0$a */
    public class C0749a implements TextWatcher {
        public C0749a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (NullChecker.a(editable)) {
                pja0.this.m20359C(editable.toString());
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
