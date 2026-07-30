package p153l;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.view.View;
import android.widget.FrameLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;

/* JADX INFO: loaded from: classes11.dex */
public class p900 extends Act.AbstractC4455w<Act, MessagesAct> {

    /* JADX INFO: renamed from: a */
    public View f151076a;

    @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Animator mo21408c(Act act, final MessagesAct messagesAct) {
        ObjectAnimator duration = ObjectAnimator.ofObject(this.f151076a, "backgroundColor", new ArgbEvaluator(), Integer.valueOf(Color.parseColor("#ffFFFFFF")), Integer.valueOf(Color.parseColor("#00FFFFFF"))).setDuration(500L);
        duration.setInterpolator(gt0.f106347b);
        gt0.m132160f(duration, new Runnable() { // from class: l.o900
            @Override // java.lang.Runnable
            public final void run() {
                this.f145483a.m171292l(messagesAct);
            }
        });
        return duration;
    }

    @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Animator mo21409d(Act act, MessagesAct messagesAct) {
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m171292l(MessagesAct messagesAct) {
        messagesAct.m50164y2().f160396i.removeView(this.f151076a);
    }

    @Override // com.p051p1.mobile.android.app.Act.AbstractC4455w
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo21413h(Act act, MessagesAct messagesAct) {
        super.mo21413h(act, messagesAct);
        View view = new View(messagesAct);
        this.f151076a = view;
        view.setBackgroundColor(16777215);
        messagesAct.m50164y2().f160396i.addView(this.f151076a, new FrameLayout.LayoutParams(-1, -1));
    }
}
