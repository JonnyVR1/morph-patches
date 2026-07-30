package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.IceBreakingQuestion;
import com.p051p1.mobile.putong.core.p058ui.messages.question.MaleChatGuideView;
import java.util.List;
import java.util.Objects;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class q4z implements iam<n4z> {

    /* JADX INFO: renamed from: a */
    public n4z f155636a;

    /* JADX INFO: renamed from: b */
    public MaleChatGuideView f155637b;

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f155636a.act();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(n4z n4zVar) {
        this.f155636a = n4zVar;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m175278c(IceBreakingQuestion iceBreakingQuestion) {
        this.f155636a.m161621D0(iceBreakingQuestion);
        this.f155636a.m161623q0().mo50138B0().m143374g0().m113980Q1(iceBreakingQuestion.content);
    }

    /* JADX INFO: renamed from: d */
    public void m175279d(ViewStub viewStub, List<IceBreakingQuestion> list) {
        if (viewStub == null) {
            return;
        }
        if (this.f155637b == null) {
            this.f155637b = (MaleChatGuideView) viewStub.inflate();
        }
        boolean zM147479J = jyb.m147479J(list);
        MaleChatGuideView maleChatGuideView = this.f155637b;
        if (zM147479J) {
            bnl0.m105524M(maleChatGuideView, false);
            return;
        }
        bnl0.m105524M(maleChatGuideView, true);
        this.f155637b.m50785i(list, new MaleChatGuideView.InterfaceC8739b() { // from class: l.o4z
            @Override // com.p051p1.mobile.putong.core.p058ui.messages.question.MaleChatGuideView.InterfaceC8739b
            /* JADX INFO: renamed from: a */
            public final void mo50789a(IceBreakingQuestion iceBreakingQuestion) {
                this.f145021a.m175278c(iceBreakingQuestion);
            }
        });
        MaleChatGuideView maleChatGuideView2 = this.f155637b;
        final n4z n4zVar = this.f155636a;
        Objects.requireNonNull(n4zVar);
        maleChatGuideView2.m50787k(n4zVar, new y20() { // from class: l.p4z
            @Override // p153l.y20
            public final void call(Object obj) {
                n4zVar.m161619A0((VDraweeView) obj);
            }
        }, this.f155636a.m161622p0());
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
