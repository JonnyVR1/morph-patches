package p003l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.IceBreakingQuestion;
import com.p1.mobile.putong.core.ui.messages.question.MaleChatGuideView;
import java.util.List;
import java.util.Objects;
import l.s7m;
import l.vwb;
import l.xdl0;
import p028v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class tvy implements s7m<qvy> {

    /* JADX INFO: renamed from: a */
    public qvy f7807a;

    /* JADX INFO: renamed from: b */
    public MaleChatGuideView f7808b;

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m8046C0() {
        return null;
    }

    @Nullable
    public Act act() {
        return this.f7807a.act();
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void m8050i1(qvy qvyVar) {
        this.f7807a = qvyVar;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m8048c(IceBreakingQuestion iceBreakingQuestion) {
        this.f7807a.m7059D0(iceBreakingQuestion);
        this.f7807a.m7062q0().mo2046A0().m6499g0().m4785Q1(iceBreakingQuestion.content);
    }

    /* JADX INFO: renamed from: d */
    public void m8049d(ViewStub viewStub, List<IceBreakingQuestion> list) {
        if (viewStub == null) {
            return;
        }
        if (this.f7808b == null) {
            this.f7808b = viewStub.inflate();
        }
        boolean zJ = vwb.J(list);
        MaleChatGuideView maleChatGuideView = this.f7808b;
        if (zJ) {
            xdl0.M(maleChatGuideView, false);
            return;
        }
        xdl0.M(maleChatGuideView, true);
        this.f7808b.i(list, new MaleChatGuideView.b() { // from class: l.rvy
            /* JADX INFO: renamed from: a */
            public final void m7400a(IceBreakingQuestion iceBreakingQuestion) {
                this.f7096a.m8048c(iceBreakingQuestion);
            }
        });
        MaleChatGuideView maleChatGuideView2 = this.f7808b;
        final qvy qvyVar = this.f7807a;
        Objects.requireNonNull(qvyVar);
        maleChatGuideView2.k(qvyVar, new e30() { // from class: l.svy
            @Override // p003l.e30
            public final void call(Object obj) {
                qvyVar.m7057A0((VDraweeView) obj);
            }
        }, this.f7807a.m7061p0());
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void destroy() {
    }
}
