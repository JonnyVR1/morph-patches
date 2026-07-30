package p153l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ProfileSelectedQue;
import com.p051p1.mobile.putong.core.data.Question;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopEditInfo;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.base.LoopSelectFillData;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopCreateTagAct;
import com.p051p1.mobile.putong.data.Answer;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class fsa0 extends ar2<gsa0> {

    /* JADX INFO: renamed from: a */
    public ArrayList<LoopSelectFillData> f100574a;

    /* JADX INFO: renamed from: b */
    public ArrayList<Question> f100575b;

    /* JADX INFO: renamed from: c */
    public LoopSelectFillData f100576c;

    /* JADX INFO: renamed from: d */
    public Question f100577d;

    /* JADX INFO: renamed from: e */
    public User f100578e;

    public fsa0(ner nerVar) {
        super(nerVar);
        this.f100574a = new ArrayList<>();
        this.f100575b = new ArrayList<>();
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ Boolean m127061k0(Question question) {
        Locale locale = Locale.getDefault();
        if (locale == null || !TextUtils.equals(locale.getLanguage(), "ja")) {
            return Boolean.valueOf(question.editable.languages.size() == 0);
        }
        return Boolean.valueOf(question.editable.languages.contains("ja-JP"));
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ Question m127063m0(Question question) {
        question.nullCheck();
        question.editable.nullCheck();
        return question;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m127065q0(Bundle bundle) {
        ((gsa0) this.viewModel).m132009r();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        creates(new y20() { // from class: l.vra0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185442a.m127065q0((Bundle) obj);
            }
        });
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        this.f100578e = (User) act().getIntent().getSerializableExtra("loop_edit_user");
        if (!NullChecker.m82486a(gta.m132210e().m132214d().mo34760Uc()) && !NullChecker.m82486a(this.f100578e)) {
            act().lambda$debugItems$19();
            return;
        }
        ((gsa0) this.viewModel).m132007f(((LoopInputType) act().getIntent().getSerializableExtra("loop_create_tag_info")).title);
        act().setTitle("");
        m127067p0();
    }

    @Override // p153l.ar2, p153l.k3m
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public void mo52715C(gsa0 gsa0Var) {
        super.mo52715C(gsa0Var);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m127067p0() {
        duringCreated(CoreModule.f18264c.f20378d0.f128826R.m159274k().filter(new qcj() { // from class: l.wra0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!jyb.m147479J((List) obj));
            }
        }).take(1)).flatMap(new qcj() { // from class: l.xra0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C22421c.from((List) obj);
            }
        }).map(new qcj() { // from class: l.yra0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20378d0.m151465o3((String) obj);
            }
        }).filter(new qcj() { // from class: l.zra0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f205748a.m127068r0((Question) obj);
            }
        }).map(new qcj() { // from class: l.asa0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return fsa0.m127063m0((Question) obj);
            }
        }).filter(new qcj() { // from class: l.bsa0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return fsa0.m127061k0((Question) obj);
            }
        }).toList().subscribe(psd0.m173596G(new y20() { // from class: l.csa0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f83449a.m127069s0((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Boolean m127068r0(Question question) {
        boolean z = false;
        if (NullChecker.m82486a(this.f100578e)) {
            if (question != null && !jyb.m147486Q(this.f100578e.profile.answers, new qcj() { // from class: l.dsa0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((Answer) obj).question;
                }
            }).contains(question.f56859id)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        if (question != null && !jyb.m147486Q(gta.m132210e().m132214d().mo34760Uc().profile.answers, new qcj() { // from class: l.esa0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((Answer) obj).question;
            }
        }).contains(question.f56859id)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m127069s0(List list) {
        this.f100575b = new ArrayList<>(list);
        if (list.size() == 0) {
            ((gsa0) this.viewModel).m132008i();
            return;
        }
        this.f100574a = new ArrayList<>();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LoopSelectFillData loopSelectFillData = new LoopSelectFillData(((Question) it.next()).text);
            loopSelectFillData.m52766i(true);
            this.f100574a.add(loopSelectFillData);
        }
        ((gsa0) this.viewModel).m132006e(this.f100574a);
    }

    /* JADX INFO: renamed from: t0 */
    public void m127070t0(int i, int i2, Intent intent) {
        if (i == LoopInputType.QUESTION_EDIT.requestCode && NullChecker.m82486a(intent) && i2 == -1) {
            if (this.f100577d == null) {
                act().lambda$debugItems$19();
                return;
            }
            String stringExtra = intent.getStringExtra("loop_result_key");
            if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra.trim())) {
                return;
            }
            Answer answerNew_ = Answer.new_();
            answerNew_.question = this.f100577d.f56859id;
            answerNew_.value = stringExtra;
            Intent intent2 = new Intent();
            if (NullChecker.m82486a(this.f100578e)) {
                this.f100578e.profile.answers.add(answerNew_);
                intent2.putExtra("loop_edit_user", this.f100578e);
            } else {
                gta.m132210e().m132214d().mo34760Uc().profile.answers.add(answerNew_);
            }
            act().setResult(-1, intent2);
            act().lambda$debugItems$19();
        }
    }

    /* JADX INFO: renamed from: u0 */
    public void m127071u0(int i) {
        this.f100576c = this.f100574a.get(i);
        this.f100577d = this.f100575b.get(i);
        if (act().getIntent().getBooleanExtra("loop_new_style", false)) {
            Intent intent = new Intent();
            intent.putExtra("loop_result_question", this.f100577d);
            act().setResult(-1, intent);
            act().lambda$debugItems$19();
            return;
        }
        LoopInputType loopInputType = LoopInputType.QUESTION_EDIT;
        LoopEditInfo emptyInput = LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 100, "").setEmptyInput(true);
        emptyInput.setSubTitle(this.f100576c.m52758a(), true);
        if (TextUtils.equals(this.f100577d.source, "tacitTest")) {
            emptyInput.setHarmonyTest(true);
            ProfileSelectedQue profileSelectedQue = CoreModule.f18264c.f20378d0.f128827S;
            if (NullChecker.m82486a(profileSelectedQue) && !TextUtils.isEmpty(profileSelectedQue.answer)) {
                emptyInput.setDefaultContent(profileSelectedQue.answer);
            }
            i4g0.m138520r("e_profile_test_question_click", act().pageId());
        }
        act().startActivityForResult(ProfileLoopCreateTagAct.m52821c2(emptyInput, act()), loopInputType.requestCode);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
