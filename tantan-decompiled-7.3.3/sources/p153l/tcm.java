package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatProfile;
import com.p051p1.mobile.putong.core.data.IceBreakingQuestion;
import com.p051p1.mobile.putong.core.p058ui.messages.question.IceBreakingQuestionEditAct;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class tcm extends ar2<edm> {

    /* JADX INFO: renamed from: a */
    public final IceBreakingQuestionEditAct f173258a;

    public tcm(ner nerVar, IceBreakingQuestionEditAct iceBreakingQuestionEditAct) {
        super(nerVar);
        this.f173258a = iceBreakingQuestionEditAct;
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m190471g0(Throwable th) {
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m190476l0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public void m190477m0(Bundle bundle) {
        ((edm) this.viewModel).m120495r();
        duringCreated(CoreModule.f18264c.f20384f0.m33892Zn()).subscribe(psd0.m173597H(new y20() { // from class: l.ncm
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f141381a.m190479o0((ChatProfile) obj);
            }
        }, new y20() { // from class: l.ocm
            @Override // p153l.y20
            public final void call(Object obj) {
                tcm.m190476l0((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20384f0.m33882Yp()).subscribe(psd0.m173597H(new y20() { // from class: l.pcm
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f151612a.m190480p0((List) obj);
            }
        }, new y20() { // from class: l.qcm
            @Override // p153l.y20
            public final void call(Object obj) {
                tcm.m190471g0((Throwable) obj);
            }
        }));
        CoreModule.f18264c.f20384f0.m33964fp();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.lcm
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f131367a.m190477m0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n0 */
    public void m190478n0() {
        boolean zM120500x = ((edm) this.viewModel).m120500x();
        IceBreakingQuestionEditAct iceBreakingQuestionEditAct = this.f173258a;
        if (zM120500x) {
            tcz.m190524B(iceBreakingQuestionEditAct, new Runnable() { // from class: l.mcm
                @Override // java.lang.Runnable
                public final void run() {
                    this.f135824a.m190481q0();
                }
            });
        } else {
            iceBreakingQuestionEditAct.m50776b2();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m190479o0(ChatProfile chatProfile) {
        ((edm) this.viewModel).m120489N(chatProfile.iceBreakingQuestions);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m190480p0(List list) {
        ((edm) this.viewModel).m120488M(list);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m190481q0() {
        this.f173258a.m50776b2();
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m190482r0(uxj0 uxj0Var) {
        o1j0.m165651y("保存成功");
        this.f173258a.m50776b2();
    }

    /* JADX INFO: renamed from: s0 */
    public boolean m190483s0() {
        List<IceBreakingQuestion> listM120499w = ((edm) this.viewModel).m120499w();
        CoreModule.f18264c.f20384f0.m34205yo(listM120499w).subscribe(psd0.m173597H(new y20() { // from class: l.rcm
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f162230a.m190482r0((uxj0) obj);
            }
        }, new y20() { // from class: l.scm
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165651y("保存失败");
            }
        }));
        fv4.m127589c(this.f173258a.pageId(), listM120499w);
        return true;
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
