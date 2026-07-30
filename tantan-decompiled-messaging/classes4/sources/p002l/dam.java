package p002l;

import android.os.Bundle;
import com.p000p1.mobile.putong.core.p001ui.messages.question.IceBreakingQuestionEditAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChatProfile;
import com.p1.mobile.putong.core.data.IceBreakingQuestion;
import java.util.List;
import l.e30;
import l.gu4;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.roj0;
import l.w3z;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class dam extends jq2<oam> {

    /* JADX INFO: renamed from: a */
    public final IceBreakingQuestionEditAct f9148a;

    public dam(mcr mcrVar, IceBreakingQuestionEditAct iceBreakingQuestionEditAct) {
        super(mcrVar);
        this.f9148a = iceBreakingQuestionEditAct;
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m11717g0(Throwable th) {
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m11722l0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public void m11723m0(Bundle bundle) {
        ((oam) ((jq2) this).viewModel).m19369r();
        duringCreated(CoreModule.c.f0.Zn()).subscribe(mkd0.H(new e30() { // from class: l.x9m
            public final void call(Object obj) {
                this.f22182a.m11726o0((ChatProfile) obj);
            }
        }, new e30() { // from class: l.y9m
            public final void call(Object obj) {
                dam.m11722l0((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.c.f0.Yp()).subscribe(mkd0.H(new e30() { // from class: l.z9m
            public final void call(Object obj) {
                this.f23317a.m11727p0((List) obj);
            }
        }, new e30() { // from class: l.aam
            public final void call(Object obj) {
                dam.m11717g0((Throwable) obj);
            }
        }));
        CoreModule.c.f0.fp();
    }

    /* JADX INFO: renamed from: a0 */
    public void m11724a0() {
        super.a0();
        creates(new e30() { // from class: l.v9m
            public final void call(Object obj) {
                this.f21044a.m11723m0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n0 */
    public void m11725n0() {
        boolean zM19374x = ((oam) ((jq2) this).viewModel).m19374x();
        IceBreakingQuestionEditAct iceBreakingQuestionEditAct = this.f9148a;
        if (zM19374x) {
            w3z.B(iceBreakingQuestionEditAct, new Runnable() { // from class: l.w9m
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21577a.m11728q0();
                }
            });
        } else {
            iceBreakingQuestionEditAct.m4a2();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m11726o0(ChatProfile chatProfile) {
        ((oam) ((jq2) this).viewModel).m19362N(chatProfile.iceBreakingQuestions);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m11727p0(List list) {
        ((oam) ((jq2) this).viewModel).m19361M(list);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m11728q0() {
        this.f9148a.m4a2();
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m11729r0(roj0 roj0Var) {
        lsi0.y("保存成功");
        this.f9148a.m4a2();
    }

    /* JADX INFO: renamed from: s0 */
    public boolean m11730s0() {
        List<IceBreakingQuestion> listM19373w = ((oam) ((jq2) this).viewModel).m19373w();
        CoreModule.c.f0.yo(listM19373w).subscribe(mkd0.H(new e30() { // from class: l.bam
            public final void call(Object obj) {
                this.f8049a.m11729r0((roj0) obj);
            }
        }, new e30() { // from class: l.cam
            public final void call(Object obj) {
                lsi0.y("保存失败");
            }
        }));
        gu4.c(this.f9148a.pageId(), listM19373w);
        return true;
    }

    public void destroy() {
    }
}
