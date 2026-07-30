package p153l;

import android.content.Context;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.core.p058ui.messages.MessageBar;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;

/* JADX INFO: loaded from: classes4.dex */
public class i500 implements iam<g500>, i4m {

    /* JADX INFO: renamed from: a */
    public g500 f112970a;

    /* JADX INFO: renamed from: b */
    public MessagesAct f112971b;

    /* JADX INFO: renamed from: c */
    public boolean f112972c = false;

    /* JADX INFO: renamed from: d */
    public boolean f112973d = true;

    /* JADX INFO: renamed from: e */
    public boolean f112974e = false;

    /* JADX INFO: renamed from: f */
    public long f112975f = 0;

    /* JADX INFO: renamed from: g */
    public int f112976g = 1;

    /* JADX INFO: renamed from: h */
    public Runnable f112977h = new RunnableC17646b();

    /* JADX INFO: renamed from: i */
    public Runnable f112978i = new RunnableC17647c();

    /* JADX INFO: renamed from: j */
    public Runnable f112979j = new Runnable() { // from class: l.h500
        @Override // java.lang.Runnable
        public final void run() {
            this.f107881a.m138611s();
        }
    };

    /* JADX INFO: renamed from: l.i500$a */
    public class ViewOnTouchListenerC17645a implements View.OnTouchListener {
        public ViewOnTouchListenerC17645a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !i500.this.f112970a.m143372e0().mo50138B0().m143374g0().m113966J0()) {
                return false;
            }
            C4499d.m21895l().m21899k("audio_tips_key");
            return false;
        }
    }

    /* JADX INFO: renamed from: l.i500$b */
    public class RunnableC17646b implements Runnable {
        public RunnableC17646b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (i500.this.f112970a.m143372e0().mo50138B0().m194170E1()) {
                long jUptimeMillis = (SystemClock.uptimeMillis() - i500.this.f112975f) + 400;
                i500 i500Var = i500.this;
                if (jUptimeMillis <= Constants.ONE_MIN_IN_MILLIS) {
                    i500Var.f112974e = true;
                    i500.this.f112971b.postDelayed(this, 1000L);
                } else {
                    i500Var.f112972c = true;
                    i500.this.f112970a.m128954b1().m191980D();
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.i500$c */
    public class RunnableC17647c implements Runnable {
        public RunnableC17647c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (i500.this.f112970a.m143372e0().mo50138B0().m194170E1()) {
                i500.this.f112970a.m143372e0().mo50138B0().m143374g0().m114041t0().getRecordLayout().setSoundLevel(i500.this.f112970a.m128954b1().m191985n());
                i500.this.f112971b.postDelayed(this, 50L);
            }
        }
    }

    public i500(MessagesAct messagesAct) {
        this.f112971b = messagesAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m138611s() {
        this.f112970a.m128954b1().m191979C(this.f112976g);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f112971b;
    }

    @Override // p153l.i4m
    /* JADX INFO: renamed from: a */
    public void mo138569a() {
        if (this.f112975f <= 0) {
            this.f112970a.m128956d1();
            return;
        }
        if (SystemClock.uptimeMillis() - this.f112975f <= 250) {
            this.f112970a.m128956d1();
            return;
        }
        m138616p();
        boolean zM138617q = m138617q();
        g500 g500Var = this.f112970a;
        if (zM138617q) {
            g500Var.m128958f1();
        } else {
            g500Var.m128954b1().m191980D();
        }
        this.f112970a.m143372e0().mo50158l().m110949a3();
    }

    @Override // p153l.i4m
    /* JADX INFO: renamed from: b */
    public void mo138570b() {
        this.f112970a.m128956d1();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM138612k = m138612k(layoutInflater, viewGroup);
        viewM138612k.setOnTouchListener(new ViewOnTouchListenerC17645a());
        return viewM138612k;
    }

    /* JADX INFO: renamed from: k */
    public View m138612k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return j500.m143497b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public MessagesAct act() {
        return this.f112971b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(g500 g500Var) {
        this.f112970a = g500Var;
    }

    /* JADX INFO: renamed from: n */
    public int m138615n() {
        return this.f112976g;
    }

    /* JADX INFO: renamed from: p */
    public void m138616p() {
        u1z u1zVarMo50138B0 = this.f112970a.m143372e0().mo50138B0();
        this.f112971b.removeCallbacks(this.f112979j);
        this.f112971b.removeCallbacks(this.f112977h);
        this.f112971b.removeCallbacks(this.f112978i);
        MessageBar messageBarM114041t0 = u1zVarMo50138B0.m143374g0().m114041t0();
        messageBarM114041t0.getBar_center_text().setFocusableInTouchMode(true);
        messageBarM114041t0.getBar_center_text().setFocusable(true);
        if (this.f112970a.m143372e0().mo50155d0().m201095D0()) {
            bnl0.m105500A(messageBarM114041t0.getBar_center_text());
        }
        messageBarM114041t0.getRecordLayout().m50653m();
    }

    /* JADX INFO: renamed from: q */
    public boolean m138617q() {
        return this.f112972c;
    }

    /* JADX INFO: renamed from: u */
    public void m138618u() {
        this.f112971b.postDelayed(this.f112977h, 49700L);
        this.f112971b.post(this.f112978i);
        this.f112975f = SystemClock.uptimeMillis();
        this.f112970a.m143372e0().mo50138B0().m143374g0().m114041t0().getRecordLayout().setRecordStartTime(this.f112975f);
    }

    /* JADX INFO: renamed from: v */
    public void m138619v() {
        this.f112974e = false;
        this.f112972c = false;
        this.f112975f = -1L;
        this.f112970a.m128960h1();
        this.f112976g++;
        act().postDelayed(this.f112979j, 60L);
        this.f112970a.m128961i1();
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
