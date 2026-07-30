package p002l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopEditInfo;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.base.LoopSelectFillData;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.input.ProfileLoopCreateTagAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ProfileSelectedQue;
import com.p1.mobile.putong.core.data.Question;
import com.p1.mobile.putong.data.Answer;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l.e30;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.ura;
import l.vwb;
import l.w9j;
import l.zvf0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class bka0 extends jq2<cka0> {

    /* JADX INFO: renamed from: a */
    public ArrayList<LoopSelectFillData> f8203a;

    /* JADX INFO: renamed from: b */
    public ArrayList<Question> f8204b;

    /* JADX INFO: renamed from: c */
    public LoopSelectFillData f8205c;

    /* JADX INFO: renamed from: d */
    public Question f8206d;

    /* JADX INFO: renamed from: e */
    public User f8207e;

    public bka0(mcr mcrVar) {
        super(mcrVar);
        this.f8203a = new ArrayList<>();
        this.f8204b = new ArrayList<>();
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ Boolean m10401k0(Question question) {
        Locale locale = Locale.getDefault();
        if (locale == null || !TextUtils.equals(locale.getLanguage(), "ja")) {
            return Boolean.valueOf(question.editable.languages.size() == 0);
        }
        return Boolean.valueOf(question.editable.languages.contains("ja-JP"));
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ Question m10403m0(Question question) {
        question.nullCheck();
        question.editable.nullCheck();
        return question;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m10405q0(Bundle bundle) {
        ((cka0) ((jq2) this).viewModel).m11089r();
    }

    /* JADX INFO: renamed from: Z */
    public void m10407Z() {
        super.Z();
        creates(new e30() { // from class: l.rja0
            public final void call(Object obj) {
                this.f18566a.m10405q0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    public void m10408a0() {
        super.a0();
        this.f8207e = act().getIntent().getSerializableExtra("loop_edit_user");
        if (!NullChecker.a(ura.e().d().Uc()) && !NullChecker.a(this.f8207e)) {
            act().finish();
            return;
        }
        ((cka0) ((jq2) this).viewModel).m11086f(((LoopInputType) act().getIntent().getSerializableExtra("loop_create_tag_info")).title);
        act().setTitle("");
        m10410p0();
    }

    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public void m10406C(cka0 cka0Var) {
        super.C(cka0Var);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m10410p0() {
        duringCreated(CoreModule.c.d0.R.k().filter(new w9j() { // from class: l.sja0
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.J((List) obj));
            }
        }).take(1)).flatMap(new w9j() { // from class: l.tja0
            public final Object call(Object obj) {
                return c.from((List) obj);
            }
        }).map(new w9j() { // from class: l.uja0
            public final Object call(Object obj) {
                return CoreModule.c.d0.o3((String) obj);
            }
        }).filter(new w9j() { // from class: l.vja0
            public final Object call(Object obj) {
                return this.f21188a.m10411r0((Question) obj);
            }
        }).map(new w9j() { // from class: l.wja0
            public final Object call(Object obj) {
                return bka0.m10403m0((Question) obj);
            }
        }).filter(new w9j() { // from class: l.xja0
            public final Object call(Object obj) {
                return bka0.m10401k0((Question) obj);
            }
        }).toList().subscribe(mkd0.G(new e30() { // from class: l.yja0
            public final void call(Object obj) {
                this.f22936a.m10412s0((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Boolean m10411r0(Question question) {
        boolean z = false;
        if (NullChecker.a(this.f8207e)) {
            if (question != null && !vwb.Q(this.f8207e.profile.answers, new w9j() { // from class: l.zja0
                public final Object call(Object obj) {
                    return ((Answer) obj).question;
                }
            }).contains(((DbObject) question).id)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        if (question != null && !vwb.Q(ura.e().d().Uc().profile.answers, new w9j() { // from class: l.aka0
            public final Object call(Object obj) {
                return ((Answer) obj).question;
            }
        }).contains(((DbObject) question).id)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m10412s0(List list) {
        this.f8204b = new ArrayList<>(list);
        if (list.size() == 0) {
            ((cka0) ((jq2) this).viewModel).m11087i();
            return;
        }
        this.f8203a = new ArrayList<>();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LoopSelectFillData loopSelectFillData = new LoopSelectFillData(((Question) it.next()).text);
            loopSelectFillData.m2069i(true);
            this.f8203a.add(loopSelectFillData);
        }
        ((cka0) ((jq2) this).viewModel).m11085e(this.f8203a);
    }

    /* JADX INFO: renamed from: t0 */
    public void m10413t0(int i, int i2, Intent intent) {
        if (i == LoopInputType.QUESTION_EDIT.requestCode && NullChecker.a(intent) && i2 == -1) {
            if (this.f8206d == null) {
                act().finish();
                return;
            }
            String stringExtra = intent.getStringExtra("loop_result_key");
            if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra.trim())) {
                return;
            }
            Answer answerNew_ = Answer.new_();
            answerNew_.question = ((DbObject) this.f8206d).id;
            answerNew_.value = stringExtra;
            Intent intent2 = new Intent();
            if (NullChecker.a(this.f8207e)) {
                this.f8207e.profile.answers.add(answerNew_);
                intent2.putExtra("loop_edit_user", (Serializable) this.f8207e);
            } else {
                ura.e().d().Uc().profile.answers.add(answerNew_);
            }
            act().setResult(-1, intent2);
            act().finish();
        }
    }

    /* JADX INFO: renamed from: u0 */
    public void m10414u0(int i) {
        this.f8205c = this.f8203a.get(i);
        this.f8206d = this.f8204b.get(i);
        if (act().getIntent().getBooleanExtra("loop_new_style", false)) {
            Intent intent = new Intent();
            intent.putExtra("loop_result_question", (Serializable) this.f8206d);
            act().setResult(-1, intent);
            act().finish();
            return;
        }
        LoopInputType loopInputType = LoopInputType.QUESTION_EDIT;
        LoopEditInfo emptyInput = LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 100, "").setEmptyInput(true);
        emptyInput.setSubTitle(this.f8205c.m2061a(), true);
        if (TextUtils.equals(this.f8206d.source, "tacitTest")) {
            emptyInput.setHarmonyTest(true);
            ProfileSelectedQue profileSelectedQue = CoreModule.c.d0.S;
            if (NullChecker.a(profileSelectedQue) && !TextUtils.isEmpty(profileSelectedQue.answer)) {
                emptyInput.setDefaultContent(profileSelectedQue.answer);
            }
            zvf0.r("e_profile_test_question_click", act().pageId());
        }
        act().startActivityForResult(ProfileLoopCreateTagAct.m2131b2(emptyInput, act()), loopInputType.requestCode);
    }

    public void destroy() {
    }
}
