package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.IceBreakingQuestion;
import com.p046p1.mobile.putong.core.p053ui.messages.question.MaleChatGuideView;
import java.util.List;
import java.util.Objects;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes3.dex */
public class tvy implements s7m<qvy> {

    /* JADX INFO: renamed from: a */
    public qvy f172351a;

    /* JADX INFO: renamed from: b */
    public MaleChatGuideView f172352b;

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f172351a.act();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(qvy qvyVar) {
        this.f172351a = qvyVar;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m190823c(IceBreakingQuestion iceBreakingQuestion) {
        this.f172351a.m176726D0(iceBreakingQuestion);
        this.f172351a.m176728q0().mo48954A0().m156457g0().m128152Q1(iceBreakingQuestion.content);
    }

    /* JADX INFO: renamed from: d */
    public void m190824d(ViewStub viewStub, List<IceBreakingQuestion> list) {
        if (viewStub == null) {
            return;
        }
        if (this.f172352b == null) {
            this.f172352b = (MaleChatGuideView) viewStub.inflate();
        }
        boolean zM200296J = vwb.m200296J(list);
        MaleChatGuideView maleChatGuideView = this.f172352b;
        if (zM200296J) {
            xdl0.m208344M(maleChatGuideView, false);
            return;
        }
        xdl0.m208344M(maleChatGuideView, true);
        this.f172352b.m49602i(list, new MaleChatGuideView.InterfaceC8576b() { // from class: l.rvy
            @Override // com.p046p1.mobile.putong.core.p053ui.messages.question.MaleChatGuideView.InterfaceC8576b
            /* JADX INFO: renamed from: a */
            public final void mo49606a(IceBreakingQuestion iceBreakingQuestion) {
                this.f161287a.m190823c(iceBreakingQuestion);
            }
        });
        MaleChatGuideView maleChatGuideView2 = this.f172352b;
        final qvy qvyVar = this.f172351a;
        Objects.requireNonNull(qvyVar);
        maleChatGuideView2.m49604k(qvyVar, new e30() { // from class: l.svy
            @Override // p149l.e30
            public final void call(Object obj) {
                qvyVar.m176724A0((VDraweeView) obj);
            }
        }, this.f172351a.m176727p0());
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
