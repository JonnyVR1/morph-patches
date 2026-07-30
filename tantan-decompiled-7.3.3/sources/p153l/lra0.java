package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Question;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.ProfileInfoLoopEditAct;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopMyQuestionInputFrag;
import com.p051p1.mobile.putong.data.Answer;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class lra0 extends ar2<tra0> {

    /* JADX INFO: renamed from: a */
    public final int f133308a;

    /* JADX INFO: renamed from: b */
    public User f133309b;

    /* JADX INFO: renamed from: c */
    public LoopInputType f133310c;

    /* JADX INFO: renamed from: d */
    public final ProfileLoopMyQuestionInputFrag f133311d;

    public lra0(ProfileLoopMyQuestionInputFrag profileLoopMyQuestionInputFrag) {
        super(profileLoopMyQuestionInputFrag);
        this.f133308a = 100;
        this.f133311d = profileLoopMyQuestionInputFrag;
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ Question m155594f0(Question question) {
        question.nullCheck();
        question.editable.nullCheck();
        return question;
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ Boolean m155598j0(Question question) {
        Locale locale = Locale.getDefault();
        if (NullChecker.m82486a(locale) && TextUtils.equals(locale.getLanguage(), "ja")) {
            return Boolean.valueOf(question.editable.languages.contains("ja-JP"));
        }
        return Boolean.valueOf(question.editable.languages.size() == 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m155601o0(Bundle bundle) {
        Question questionM151465o3 = CoreModule.f18264c.f20378d0.m151465o3(this.f133311d.f34302H);
        if (NullChecker.m82486a(questionM151465o3)) {
            ((tra0) this.viewModel).m192457q(this.f133309b, this.f133310c, questionM151465o3);
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        this.f133310c = this.f133311d.f34303z;
        if ((act() instanceof ProfileInfoLoopEditAct) && NullChecker.m82486a(gta.m132210e().m132214d().mo34760Uc())) {
            this.f133309b = gta.m132210e().m132214d().mo34760Uc().mo225055clone();
        }
        if (this.f133309b == null) {
            this.f133309b = CoreModule.f18264c.f20381e0.m116593na().mo225055clone();
        }
        if (TextUtils.isEmpty(this.f133311d.f34302H)) {
            duringCreated(CoreModule.f18264c.f20378d0.f128826R.m159274k().first().flatMap(new qcj() { // from class: l.dra0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return C22421c.from((List) obj);
                }
            }).map(new qcj() { // from class: l.era0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return CoreModule.f18264c.f20378d0.m151465o3((String) obj);
                }
            }).filter(new qcj() { // from class: l.fra0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f100408a.m155602m0((Question) obj);
                }
            }).map(new qcj() { // from class: l.gra0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return lra0.m155594f0((Question) obj);
                }
            }).filter(new qcj() { // from class: l.hra0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return lra0.m155598j0((Question) obj);
                }
            }).toList()).subscribe(psd0.m173596G(new y20() { // from class: l.ira0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f116517a.m155603n0((List) obj);
                }
            }));
        } else {
            creates(new y20() { // from class: l.jra0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f122321a.m155601o0((Bundle) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ Boolean m155602m0(Question question) {
        return Boolean.valueOf((question == null || jyb.m147486Q(this.f133309b.profile.answers, new qcj() { // from class: l.kra0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((Answer) obj).question;
            }
        }).contains(question.f56859id)) ? false : true);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m155603n0(List list) {
        if (jyb.m147479J(list)) {
            return;
        }
        ArrayList arrayList = new ArrayList(list);
        Collections.shuffle(arrayList);
        ((tra0) this.viewModel).m192457q(this.f133309b, this.f133310c, (Question) arrayList.get(0));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
