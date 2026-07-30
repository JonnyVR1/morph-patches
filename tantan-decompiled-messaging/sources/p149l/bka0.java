package p149l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ProfileSelectedQue;
import com.p046p1.mobile.putong.core.data.Question;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopEditInfo;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.base.LoopSelectFillData;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.input.ProfileLoopCreateTagAct;
import com.p046p1.mobile.putong.data.Answer;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class bka0 extends jq2<cka0> {

    /* JADX INFO: renamed from: a */
    public ArrayList<LoopSelectFillData> f75982a;

    /* JADX INFO: renamed from: b */
    public ArrayList<Question> f75983b;

    /* JADX INFO: renamed from: c */
    public LoopSelectFillData f75984c;

    /* JADX INFO: renamed from: d */
    public Question f75985d;

    /* JADX INFO: renamed from: e */
    public User f75986e;

    public bka0(mcr mcrVar) {
        super(mcrVar);
        this.f75982a = new ArrayList<>();
        this.f75983b = new ArrayList<>();
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ Boolean m102280k0(Question question) {
        Locale locale = Locale.getDefault();
        if (locale == null || !TextUtils.equals(locale.getLanguage(), "ja")) {
            return Boolean.valueOf(question.editable.languages.size() == 0);
        }
        return Boolean.valueOf(question.editable.languages.contains("ja-JP"));
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ Question m102282m0(Question question) {
        question.nullCheck();
        question.editable.nullCheck();
        return question;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m102284q0(Bundle bundle) {
        ((cka0) this.viewModel).m107393r();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        creates(new e30() { // from class: l.rja0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159661a.m102284q0((Bundle) obj);
            }
        });
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        this.f75986e = (User) act().getIntent().getSerializableExtra("loop_edit_user");
        if (!NullChecker.m81303a(ura.m195053e().m195057d().mo33757Uc()) && !NullChecker.m81303a(this.f75986e)) {
            act().lambda$debugItems$19();
            return;
        }
        ((cka0) this.viewModel).m107391f(((LoopInputType) act().getIntent().getSerializableExtra("loop_create_tag_info")).title);
        act().setTitle("");
        m102286p0();
    }

    @Override // p149l.jq2, p149l.q0m
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public void mo51532C(cka0 cka0Var) {
        super.mo51532C(cka0Var);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m102286p0() {
        duringCreated(CoreModule.f17545c.f19636d0.f199753R.m121230k().filter(new w9j() { // from class: l.sja0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m200296J((List) obj));
            }
        }).take(1)).flatMap(new w9j() { // from class: l.tja0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C22306c.from((List) obj);
            }
        }).map(new w9j() { // from class: l.uja0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19636d0.m215900o3((String) obj);
            }
        }).filter(new w9j() { // from class: l.vja0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f181670a.m102287r0((Question) obj);
            }
        }).map(new w9j() { // from class: l.wja0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return bka0.m102282m0((Question) obj);
            }
        }).filter(new w9j() { // from class: l.xja0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return bka0.m102280k0((Question) obj);
            }
        }).toList().subscribe(mkd0.m154955G(new e30() { // from class: l.yja0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198619a.m102288s0((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Boolean m102287r0(Question question) {
        boolean z = false;
        if (NullChecker.m81303a(this.f75986e)) {
            if (question != null && !vwb.m200303Q(this.f75986e.profile.answers, new w9j() { // from class: l.zja0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Answer) obj).question;
                }
            }).contains(question.f56011id)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        if (question != null && !vwb.m200303Q(ura.m195053e().m195057d().mo33757Uc().profile.answers, new w9j() { // from class: l.aka0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((Answer) obj).question;
            }
        }).contains(question.f56011id)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m102288s0(List list) {
        this.f75983b = new ArrayList<>(list);
        if (list.size() == 0) {
            ((cka0) this.viewModel).m107392i();
            return;
        }
        this.f75982a = new ArrayList<>();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LoopSelectFillData loopSelectFillData = new LoopSelectFillData(((Question) it.next()).text);
            loopSelectFillData.m51583i(true);
            this.f75982a.add(loopSelectFillData);
        }
        ((cka0) this.viewModel).m107390e(this.f75982a);
    }

    /* JADX INFO: renamed from: t0 */
    public void m102289t0(int i, int i2, Intent intent) {
        if (i == LoopInputType.QUESTION_EDIT.requestCode && NullChecker.m81303a(intent) && i2 == -1) {
            if (this.f75985d == null) {
                act().lambda$debugItems$19();
                return;
            }
            String stringExtra = intent.getStringExtra("loop_result_key");
            if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra.trim())) {
                return;
            }
            Answer answerNew_ = Answer.new_();
            answerNew_.question = this.f75985d.f56011id;
            answerNew_.value = stringExtra;
            Intent intent2 = new Intent();
            if (NullChecker.m81303a(this.f75986e)) {
                this.f75986e.profile.answers.add(answerNew_);
                intent2.putExtra("loop_edit_user", this.f75986e);
            } else {
                ura.m195053e().m195057d().mo33757Uc().profile.answers.add(answerNew_);
            }
            act().setResult(-1, intent2);
            act().lambda$debugItems$19();
        }
    }

    /* JADX INFO: renamed from: u0 */
    public void m102290u0(int i) {
        this.f75984c = this.f75982a.get(i);
        this.f75985d = this.f75983b.get(i);
        if (act().getIntent().getBooleanExtra("loop_new_style", false)) {
            Intent intent = new Intent();
            intent.putExtra("loop_result_question", this.f75985d);
            act().setResult(-1, intent);
            act().lambda$debugItems$19();
            return;
        }
        LoopInputType loopInputType = LoopInputType.QUESTION_EDIT;
        LoopEditInfo emptyInput = LoopEditInfo.getCreateTagInfo(loopInputType, loopInputType.title, 100, "").setEmptyInput(true);
        emptyInput.setSubTitle(this.f75984c.m51575a(), true);
        if (TextUtils.equals(this.f75985d.source, "tacitTest")) {
            emptyInput.setHarmonyTest(true);
            ProfileSelectedQue profileSelectedQue = CoreModule.f17545c.f19636d0.f199754S;
            if (NullChecker.m81303a(profileSelectedQue) && !TextUtils.isEmpty(profileSelectedQue.answer)) {
                emptyInput.setDefaultContent(profileSelectedQue.answer);
            }
            zvf0.m220396r("e_profile_test_question_click", act().pageId());
        }
        act().startActivityForResult(ProfileLoopCreateTagAct.m51638b2(emptyInput, act()), loopInputType.requestCode);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
