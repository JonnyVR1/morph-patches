package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Question;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.ProfileInfoLoopEditAct;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.input.ProfileLoopMyQuestionInputFrag;
import com.p046p1.mobile.putong.data.Answer;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class hja0 extends jq2<pja0> {

    /* JADX INFO: renamed from: a */
    public final int f108051a;

    /* JADX INFO: renamed from: b */
    public User f108052b;

    /* JADX INFO: renamed from: c */
    public LoopInputType f108053c;

    /* JADX INFO: renamed from: d */
    public final ProfileLoopMyQuestionInputFrag f108054d;

    public hja0(ProfileLoopMyQuestionInputFrag profileLoopMyQuestionInputFrag) {
        super(profileLoopMyQuestionInputFrag);
        this.f108051a = 100;
        this.f108054d = profileLoopMyQuestionInputFrag;
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ Question m131356f0(Question question) {
        question.nullCheck();
        question.editable.nullCheck();
        return question;
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ Boolean m131360j0(Question question) {
        Locale locale = Locale.getDefault();
        if (NullChecker.m81303a(locale) && TextUtils.equals(locale.getLanguage(), "ja")) {
            return Boolean.valueOf(question.editable.languages.contains("ja-JP"));
        }
        return Boolean.valueOf(question.editable.languages.size() == 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m131363o0(Bundle bundle) {
        Question questionM215900o3 = CoreModule.f17545c.f19636d0.m215900o3(this.f108054d.f33454H);
        if (NullChecker.m81303a(questionM215900o3)) {
            ((pja0) this.viewModel).m169832q(this.f108052b, this.f108053c, questionM215900o3);
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        this.f108053c = this.f108054d.f33455z;
        if ((act() instanceof ProfileInfoLoopEditAct) && NullChecker.m81303a(ura.m195053e().m195057d().mo33757Uc())) {
            this.f108052b = ura.m195053e().m195057d().mo33757Uc().mo223809clone();
        }
        if (this.f108052b == null) {
            this.f108052b = CoreModule.f17545c.f19639e0.m169520na().mo223809clone();
        }
        if (TextUtils.isEmpty(this.f108054d.f33454H)) {
            duringCreated(CoreModule.f17545c.f19636d0.f199753R.m121230k().first().flatMap(new w9j() { // from class: l.zia0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return C22306c.from((List) obj);
                }
            }).map(new w9j() { // from class: l.aja0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return CoreModule.f17545c.f19636d0.m215900o3((String) obj);
                }
            }).filter(new w9j() { // from class: l.bja0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f75891a.m131364m0((Question) obj);
                }
            }).map(new w9j() { // from class: l.cja0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return hja0.m131356f0((Question) obj);
                }
            }).filter(new w9j() { // from class: l.dja0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return hja0.m131360j0((Question) obj);
                }
            }).toList()).subscribe(mkd0.m154955G(new e30() { // from class: l.eja0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f91680a.m131365n0((List) obj);
                }
            }));
        } else {
            creates(new e30() { // from class: l.fja0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f97765a.m131363o0((Bundle) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ Boolean m131364m0(Question question) {
        return Boolean.valueOf((question == null || vwb.m200303Q(this.f108052b.profile.answers, new w9j() { // from class: l.gja0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((Answer) obj).question;
            }
        }).contains(question.f56011id)) ? false : true);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m131365n0(List list) {
        if (vwb.m200296J(list)) {
            return;
        }
        ArrayList arrayList = new ArrayList(list);
        Collections.shuffle(arrayList);
        ((pja0) this.viewModel).m169832q(this.f108052b, this.f108053c, (Question) arrayList.get(0));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
