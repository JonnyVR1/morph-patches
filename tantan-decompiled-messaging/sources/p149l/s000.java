package p149l;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.view.View;
import android.widget.FrameLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;

/* JADX INFO: loaded from: classes11.dex */
public class s000 extends Act.AbstractC4304w<Act, MessagesAct> {

    /* JADX INFO: renamed from: a */
    public View f161713a;

    @Override // com.p046p1.mobile.android.app.Act.AbstractC4304w
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Animator mo20409c(Act act, final MessagesAct messagesAct) {
        ObjectAnimator duration = ObjectAnimator.ofObject(this.f161713a, "backgroundColor", new ArgbEvaluator(), Integer.valueOf(Color.parseColor("#ffFFFFFF")), Integer.valueOf(Color.parseColor("#00FFFFFF"))).setDuration(500L);
        duration.setInterpolator(bt0.f77155b);
        bt0.m103733f(duration, new Runnable() { // from class: l.r000
            @Override // java.lang.Runnable
            public final void run() {
                this.f157124a.m181809l(messagesAct);
            }
        });
        return duration;
    }

    @Override // com.p046p1.mobile.android.app.Act.AbstractC4304w
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Animator mo20410d(Act act, MessagesAct messagesAct) {
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m181809l(MessagesAct messagesAct) {
        messagesAct.m48980w2().f171733i.removeView(this.f161713a);
    }

    @Override // com.p046p1.mobile.android.app.Act.AbstractC4304w
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo20414h(Act act, MessagesAct messagesAct) {
        super.mo20414h(act, messagesAct);
        View view = new View(messagesAct);
        this.f161713a = view;
        view.setBackgroundColor(16777215);
        messagesAct.m48980w2().f171733i.addView(this.f161713a, new FrameLayout.LayoutParams(-1, -1));
    }
}
