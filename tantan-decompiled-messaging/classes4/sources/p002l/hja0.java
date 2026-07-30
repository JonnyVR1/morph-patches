package p002l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.ProfileInfoLoopEditAct;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.input.ProfileLoopMyQuestionInputFrag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Question;
import com.p1.mobile.putong.data.Answer;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import l.e30;
import l.jq2;
import l.mkd0;
import l.ura;
import l.vwb;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class hja0 extends jq2<pja0> {

    /* JADX INFO: renamed from: a */
    public final int f12063a;

    /* JADX INFO: renamed from: b */
    public User f12064b;

    /* JADX INFO: renamed from: c */
    public LoopInputType f12065c;

    /* JADX INFO: renamed from: d */
    public final ProfileLoopMyQuestionInputFrag f12066d;

    public hja0(ProfileLoopMyQuestionInputFrag profileLoopMyQuestionInputFrag) {
        super(profileLoopMyQuestionInputFrag);
        this.f12063a = 100;
        this.f12066d = profileLoopMyQuestionInputFrag;
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ Question m14403f0(Question question) {
        question.nullCheck();
        question.editable.nullCheck();
        return question;
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ Boolean m14407j0(Question question) {
        Locale locale = Locale.getDefault();
        if (NullChecker.a(locale) && TextUtils.equals(locale.getLanguage(), "ja")) {
            return Boolean.valueOf(question.editable.languages.contains("ja-JP"));
        }
        return Boolean.valueOf(question.editable.languages.size() == 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m14410o0(Bundle bundle) {
        Question questionO3 = CoreModule.c.d0.o3(this.f12066d.f1276H);
        if (NullChecker.a(questionO3)) {
            ((pja0) ((jq2) this).viewModel).m20368q(this.f12064b, this.f12065c, questionO3);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m14411a0() {
        super.a0();
        this.f12065c = this.f12066d.f1277z;
        if ((act() instanceof ProfileInfoLoopEditAct) && NullChecker.a(ura.e().d().Uc())) {
            this.f12064b = ura.e().d().Uc().clone();
        }
        if (this.f12064b == null) {
            this.f12064b = CoreModule.c.e0.na().clone();
        }
        if (TextUtils.isEmpty(this.f12066d.f1276H)) {
            duringCreated(CoreModule.c.d0.R.k().first().flatMap(new w9j() { // from class: l.zia0
                public final Object call(Object obj) {
                    return c.from((List) obj);
                }
            }).map(new w9j() { // from class: l.aja0
                public final Object call(Object obj) {
                    return CoreModule.c.d0.o3((String) obj);
                }
            }).filter(new w9j() { // from class: l.bja0
                public final Object call(Object obj) {
                    return this.f8183a.m14412m0((Question) obj);
                }
            }).map(new w9j() { // from class: l.cja0
                public final Object call(Object obj) {
                    return hja0.m14403f0((Question) obj);
                }
            }).filter(new w9j() { // from class: l.dja0
                public final Object call(Object obj) {
                    return hja0.m14407j0((Question) obj);
                }
            }).toList()).subscribe(mkd0.G(new e30() { // from class: l.eja0
                public final void call(Object obj) {
                    this.f9823a.m14413n0((List) obj);
                }
            }));
        } else {
            creates(new e30() { // from class: l.fja0
                public final void call(Object obj) {
                    this.f10424a.m14410o0((Bundle) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ Boolean m14412m0(Question question) {
        return Boolean.valueOf((question == null || vwb.Q(this.f12064b.profile.answers, new w9j() { // from class: l.gja0
            public final Object call(Object obj) {
                return ((Answer) obj).question;
            }
        }).contains(((DbObject) question).id)) ? false : true);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m14413n0(List list) {
        if (vwb.J(list)) {
            return;
        }
        ArrayList arrayList = new ArrayList(list);
        Collections.shuffle(arrayList);
        ((pja0) ((jq2) this).viewModel).m20368q(this.f12064b, this.f12065c, (Question) arrayList.get(0));
    }

    public void destroy() {
    }
}
