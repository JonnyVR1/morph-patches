package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatProfile;
import com.p046p1.mobile.putong.core.data.IceBreakingQuestion;
import com.p046p1.mobile.putong.core.p053ui.messages.question.IceBreakingQuestionEditAct;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class dam extends jq2<oam> {

    /* JADX INFO: renamed from: a */
    public final IceBreakingQuestionEditAct f85241a;

    public dam(mcr mcrVar, IceBreakingQuestionEditAct iceBreakingQuestionEditAct) {
        super(mcrVar);
        this.f85241a = iceBreakingQuestionEditAct;
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m110617g0(Throwable th) {
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m110622l0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public void m110623m0(Bundle bundle) {
        ((oam) this.viewModel).m163329r();
        duringCreated(CoreModule.f17545c.f19642f0.m32889Zn()).subscribe(mkd0.m154956H(new e30() { // from class: l.x9m
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f191631a.m110625o0((ChatProfile) obj);
            }
        }, new e30() { // from class: l.y9m
            @Override // p149l.e30
            public final void call(Object obj) {
                dam.m110622l0((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19642f0.m32879Yp()).subscribe(mkd0.m154956H(new e30() { // from class: l.z9m
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202303a.m110626p0((List) obj);
            }
        }, new e30() { // from class: l.aam
            @Override // p149l.e30
            public final void call(Object obj) {
                dam.m110617g0((Throwable) obj);
            }
        }));
        CoreModule.f17545c.f19642f0.m32961fp();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.v9m
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180660a.m110623m0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n0 */
    public void m110624n0() {
        boolean zM163334x = ((oam) this.viewModel).m163334x();
        IceBreakingQuestionEditAct iceBreakingQuestionEditAct = this.f85241a;
        if (zM163334x) {
            w3z.m201396B(iceBreakingQuestionEditAct, new Runnable() { // from class: l.w9m
                @Override // java.lang.Runnable
                public final void run() {
                    this.f185385a.m110627q0();
                }
            });
        } else {
            iceBreakingQuestionEditAct.m49593a2();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m110625o0(ChatProfile chatProfile) {
        ((oam) this.viewModel).m163323N(chatProfile.iceBreakingQuestions);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m110626p0(List list) {
        ((oam) this.viewModel).m163322M(list);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m110627q0() {
        this.f85241a.m49593a2();
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m110628r0(roj0 roj0Var) {
        lsi0.m151595y("保存成功");
        this.f85241a.m49593a2();
    }

    /* JADX INFO: renamed from: s0 */
    public boolean m110629s0() {
        List<IceBreakingQuestion> listM163333w = ((oam) this.viewModel).m163333w();
        CoreModule.f17545c.f19642f0.m33202yo(listM163333w).subscribe(mkd0.m154956H(new e30() { // from class: l.bam
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f74703a.m110628r0((roj0) obj);
            }
        }, new e30() { // from class: l.cam
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151595y("保存失败");
            }
        }));
        gu4.m128026c(this.f85241a.pageId(), listM163333w);
        return true;
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
