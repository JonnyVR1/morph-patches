package p009l;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.view.View;
import android.widget.FrameLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import l.bt0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class s000 extends Act.w<Act, MessagesAct> {

    /* JADX INFO: renamed from: a */
    public View f20043a;

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Animator m21949c(Act act, final MessagesAct messagesAct) {
        ObjectAnimator duration = ObjectAnimator.ofObject(this.f20043a, "backgroundColor", new ArgbEvaluator(), Integer.valueOf(Color.parseColor("#ffFFFFFF")), Integer.valueOf(Color.parseColor("#00FFFFFF"))).setDuration(500L);
        duration.setInterpolator(bt0.b);
        bt0.f(duration, new Runnable() { // from class: l.r000
            @Override // java.lang.Runnable
            public final void run() {
                this.f19599a.m21954l(messagesAct);
            }
        });
        return duration;
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Animator m21950d(Act act, MessagesAct messagesAct) {
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m21954l(MessagesAct messagesAct) {
        messagesAct.w2().i.removeView(this.f20043a);
    }

    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void m21951h(Act act, MessagesAct messagesAct) {
        super.h(act, messagesAct);
        View view = new View(messagesAct);
        this.f20043a = view;
        view.setBackgroundColor(16777215);
        messagesAct.w2().i.addView(this.f20043a, new FrameLayout.LayoutParams(-1, -1));
    }
}
