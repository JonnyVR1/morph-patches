package p003l;

import android.content.Context;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.messages.MessageBar;
import com.p000p1.mobile.putong.core.p001ui.messages.MessagesAct;
import com.p1.mobile.android.ui.bubble.d;
import l.jwz;
import l.mwz;
import l.s7m;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class lwz implements s7m<jwz>, p1m {

    /* JADX INFO: renamed from: a */
    public jwz f5442a;

    /* JADX INFO: renamed from: b */
    public MessagesAct f5443b;

    /* JADX INFO: renamed from: c */
    public boolean f5444c = false;

    /* JADX INFO: renamed from: d */
    public boolean f5445d = true;

    /* JADX INFO: renamed from: e */
    public boolean f5446e = false;

    /* JADX INFO: renamed from: f */
    public long f5447f = 0;

    /* JADX INFO: renamed from: g */
    public int f5448g = 1;

    /* JADX INFO: renamed from: h */
    public Runnable f5449h = new RunnableC0413b();

    /* JADX INFO: renamed from: i */
    public Runnable f5450i = new RunnableC0414c();

    /* JADX INFO: renamed from: j */
    public Runnable f5451j = new Runnable() { // from class: l.kwz
        @Override // java.lang.Runnable
        public final void run() {
            this.f5114a.m6171s();
        }
    };

    /* JADX INFO: renamed from: l.lwz$a */
    public class ViewOnTouchListenerC0412a implements View.OnTouchListener {
        public ViewOnTouchListenerC0412a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !lwz.this.f5442a.m6497e0().mo2046A0().m6499g0().m4771J0()) {
                return false;
            }
            d.l().k("audio_tips_key");
            return false;
        }
    }

    /* JADX INFO: renamed from: l.lwz$b */
    public class RunnableC0413b implements Runnable {
        public RunnableC0413b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (lwz.this.f5442a.m6497e0().mo2046A0().m8790E1()) {
                long jUptimeMillis = (SystemClock.uptimeMillis() - lwz.this.f5447f) + 400;
                lwz lwzVar = lwz.this;
                if (jUptimeMillis <= 60000) {
                    lwzVar.f5446e = true;
                    lwz.this.f5443b.postDelayed(this, 1000L);
                } else {
                    lwzVar.f5444c = true;
                    lwz.this.f5442a.b1().D();
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.lwz$c */
    public class RunnableC0414c implements Runnable {
        public RunnableC0414c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (lwz.this.f5442a.m6497e0().mo2046A0().m8790E1()) {
                lwz.this.f5442a.m6497e0().mo2046A0().m6499g0().m4844t0().getRecordLayout().setSoundLevel(lwz.this.f5442a.b1().n());
                lwz.this.f5443b.postDelayed(this, 50L);
            }
        }
    }

    public lwz(MessagesAct messagesAct) {
        this.f5443b = messagesAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m6171s() {
        this.f5442a.b1().C(this.f5448g);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m6172C0() {
        return this.f5443b;
    }

    @Override // p003l.p1m
    /* JADX INFO: renamed from: a */
    public void mo6173a() {
        if (this.f5447f <= 0) {
            this.f5442a.d1();
            return;
        }
        if (SystemClock.uptimeMillis() - this.f5447f <= 250) {
            this.f5442a.d1();
            return;
        }
        m6180p();
        boolean zM6181q = m6181q();
        jwz jwzVar = this.f5442a;
        if (zM6181q) {
            jwzVar.f1();
        } else {
            jwzVar.b1().D();
        }
        this.f5442a.m6497e0().mo2066l().m4210a3();
    }

    @Override // p003l.p1m
    /* JADX INFO: renamed from: b */
    public void mo6174b() {
        this.f5442a.d1();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM6176k = m6176k(layoutInflater, viewGroup);
        viewM6176k.setOnTouchListener(new ViewOnTouchListenerC0412a());
        return viewM6176k;
    }

    /* JADX INFO: renamed from: k */
    public View m6176k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mwz.b(this, layoutInflater, viewGroup);
    }

    @Nullable
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public MessagesAct act() {
        return this.f5443b;
    }

    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void m6175i1(jwz jwzVar) {
        this.f5442a = jwzVar;
    }

    /* JADX INFO: renamed from: n */
    public int m6179n() {
        return this.f5448g;
    }

    /* JADX INFO: renamed from: p */
    public void m6180p() {
        xsy xsyVarMo2046A0 = this.f5442a.m6497e0().mo2046A0();
        this.f5443b.removeCallbacks(this.f5451j);
        this.f5443b.removeCallbacks(this.f5449h);
        this.f5443b.removeCallbacks(this.f5450i);
        MessageBar messageBarM4844t0 = xsyVarMo2046A0.m6499g0().m4844t0();
        messageBarM4844t0.getBar_center_text().setFocusableInTouchMode(true);
        messageBarM4844t0.getBar_center_text().setFocusable(true);
        if (this.f5442a.m6497e0().mo2063c0().m8904D0()) {
            xdl0.A(messageBarM4844t0.getBar_center_text());
        }
        messageBarM4844t0.getRecordLayout().m2617m();
    }

    /* JADX INFO: renamed from: q */
    public boolean m6181q() {
        return this.f5444c;
    }

    /* JADX INFO: renamed from: u */
    public void m6182u() {
        this.f5443b.postDelayed(this.f5449h, 49700L);
        this.f5443b.post(this.f5450i);
        this.f5447f = SystemClock.uptimeMillis();
        this.f5442a.m6497e0().mo2046A0().m6499g0().m4844t0().getRecordLayout().setRecordStartTime(this.f5447f);
    }

    /* JADX INFO: renamed from: v */
    public void m6183v() {
        this.f5446e = false;
        this.f5444c = false;
        this.f5447f = -1L;
        this.f5442a.h1();
        this.f5448g++;
        act().postDelayed(this.f5451j, 60L);
        this.f5442a.i1();
    }

    public void destroy() {
    }
}
