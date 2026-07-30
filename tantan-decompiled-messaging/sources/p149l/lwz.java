package p149l;

import android.content.Context;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.core.p053ui.messages.MessageBar;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;

/* JADX INFO: loaded from: classes3.dex */
public class lwz implements s7m<jwz>, p1m {

    /* JADX INFO: renamed from: a */
    public jwz f130315a;

    /* JADX INFO: renamed from: b */
    public MessagesAct f130316b;

    /* JADX INFO: renamed from: c */
    public boolean f130317c = false;

    /* JADX INFO: renamed from: d */
    public boolean f130318d = true;

    /* JADX INFO: renamed from: e */
    public boolean f130319e = false;

    /* JADX INFO: renamed from: f */
    public long f130320f = 0;

    /* JADX INFO: renamed from: g */
    public int f130321g = 1;

    /* JADX INFO: renamed from: h */
    public Runnable f130322h = new RunnableC18338b();

    /* JADX INFO: renamed from: i */
    public Runnable f130323i = new RunnableC18339c();

    /* JADX INFO: renamed from: j */
    public Runnable f130324j = new Runnable() { // from class: l.kwz
        @Override // java.lang.Runnable
        public final void run() {
            this.f125041a.m152027s();
        }
    };

    /* JADX INFO: renamed from: l.lwz$a */
    public class ViewOnTouchListenerC18337a implements View.OnTouchListener {
        public ViewOnTouchListenerC18337a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !lwz.this.f130315a.m156455e0().mo48954A0().m156457g0().m128138J0()) {
                return false;
            }
            C4348d.m20896l().m20900k("audio_tips_key");
            return false;
        }
    }

    /* JADX INFO: renamed from: l.lwz$b */
    public class RunnableC18338b implements Runnable {
        public RunnableC18338b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (lwz.this.f130315a.m156455e0().mo48954A0().m210892E1()) {
                long jUptimeMillis = (SystemClock.uptimeMillis() - lwz.this.f130320f) + 400;
                lwz lwzVar = lwz.this;
                if (jUptimeMillis <= Constants.ONE_MIN_IN_MILLIS) {
                    lwzVar.f130319e = true;
                    lwz.this.f130316b.postDelayed(this, 1000L);
                } else {
                    lwzVar.f130317c = true;
                    lwz.this.f130315a.m143739b1().m194192D();
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.lwz$c */
    public class RunnableC18339c implements Runnable {
        public RunnableC18339c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (lwz.this.f130315a.m156455e0().mo48954A0().m210892E1()) {
                lwz.this.f130315a.m156455e0().mo48954A0().m156457g0().m128210t0().getRecordLayout().setSoundLevel(lwz.this.f130315a.m143739b1().m194197n());
                lwz.this.f130316b.postDelayed(this, 50L);
            }
        }
    }

    public lwz(MessagesAct messagesAct) {
        this.f130316b = messagesAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m152027s() {
        this.f130315a.m143739b1().m194191C(this.f130321g);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f130316b;
    }

    @Override // p149l.p1m
    /* JADX INFO: renamed from: a */
    public void mo152028a() {
        if (this.f130320f <= 0) {
            this.f130315a.m143741d1();
            return;
        }
        if (SystemClock.uptimeMillis() - this.f130320f <= 250) {
            this.f130315a.m143741d1();
            return;
        }
        m152034p();
        boolean zM152035q = m152035q();
        jwz jwzVar = this.f130315a;
        if (zM152035q) {
            jwzVar.m143743f1();
        } else {
            jwzVar.m143739b1().m194192D();
        }
        this.f130315a.m156455e0().mo48974l().m120743a3();
    }

    @Override // p149l.p1m
    /* JADX INFO: renamed from: b */
    public void mo152029b() {
        this.f130315a.m143741d1();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM152030k = m152030k(layoutInflater, viewGroup);
        viewM152030k.setOnTouchListener(new ViewOnTouchListenerC18337a());
        return viewM152030k;
    }

    /* JADX INFO: renamed from: k */
    public View m152030k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mwz.m156781b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public MessagesAct act() {
        return this.f130316b;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(jwz jwzVar) {
        this.f130315a = jwzVar;
    }

    /* JADX INFO: renamed from: n */
    public int m152033n() {
        return this.f130321g;
    }

    /* JADX INFO: renamed from: p */
    public void m152034p() {
        xsy xsyVarMo48954A0 = this.f130315a.m156455e0().mo48954A0();
        this.f130316b.removeCallbacks(this.f130324j);
        this.f130316b.removeCallbacks(this.f130322h);
        this.f130316b.removeCallbacks(this.f130323i);
        MessageBar messageBarM128210t0 = xsyVarMo48954A0.m156457g0().m128210t0();
        messageBarM128210t0.getBar_center_text().setFocusableInTouchMode(true);
        messageBarM128210t0.getBar_center_text().setFocusable(true);
        if (this.f130315a.m156455e0().mo48971c0().m213050D0()) {
            xdl0.m208320A(messageBarM128210t0.getBar_center_text());
        }
        messageBarM128210t0.getRecordLayout().m49470m();
    }

    /* JADX INFO: renamed from: q */
    public boolean m152035q() {
        return this.f130317c;
    }

    /* JADX INFO: renamed from: u */
    public void m152036u() {
        this.f130316b.postDelayed(this.f130322h, 49700L);
        this.f130316b.post(this.f130323i);
        this.f130320f = SystemClock.uptimeMillis();
        this.f130315a.m156455e0().mo48954A0().m156457g0().m128210t0().getRecordLayout().setRecordStartTime(this.f130320f);
    }

    /* JADX INFO: renamed from: v */
    public void m152037v() {
        this.f130319e = false;
        this.f130317c = false;
        this.f130320f = -1L;
        this.f130315a.m143745h1();
        this.f130321g++;
        act().postDelayed(this.f130324j, 60L);
        this.f130315a.m143746i1();
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
