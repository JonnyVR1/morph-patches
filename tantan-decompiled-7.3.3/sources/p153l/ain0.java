package p153l;

import android.os.Handler;
import android.os.Looper;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.tantan.live.eventbus.LiveEventBus;

/* JADX INFO: loaded from: classes5.dex */
public class ain0 {

    /* JADX INFO: renamed from: c */
    public static volatile ain0 f71549c;

    /* JADX INFO: renamed from: a */
    public int f71550a = 0;

    /* JADX INFO: renamed from: b */
    public Handler f71551b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: l.ain0$a */
    public class RunnableC15714a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f71552a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LiveEventBus f71553b;

        public RunnableC15714a(int i, LiveEventBus liveEventBus) {
            this.f71552a = i;
            this.f71553b = liveEventBus;
        }

        @Override // java.lang.Runnable
        public void run() {
            ain0.this.m98002d(this.f71552a);
            this.f71553b.VoiceGameChangeEvent.startVoiceGame().mo199273j(Integer.valueOf(this.f71552a));
        }
    }

    /* JADX INFO: renamed from: f */
    public static ain0 m98000f() {
        if (f71549c == null) {
            synchronized (ain0.class) {
                try {
                    if (f71549c == null) {
                        f71549c = new ain0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f71549c;
    }

    /* JADX INFO: renamed from: c */
    public void m98001c() {
        this.f71550a = 0;
        this.f71551b.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: renamed from: d */
    public final void m98002d(int i) {
        if (i == 1 || i == 2) {
            return;
        }
        this.f71550a = i;
    }

    /* JADX INFO: renamed from: e */
    public String m98003e(Act act) {
        switch (this.f71550a) {
            case 1:
                return act.getString(R$string.f48023ch);
            case 2:
                return act.getString(R$string.f48001bh);
            case 3:
                return act.getString(R$string.f48463wi);
            case 4:
                return act.getString(R$string.f47806Sc);
            case 5:
                return act.getString(R$string.f48310pj);
            case 6:
                return act.getString(R$string.f47476D5);
            default:
                return "";
        }
    }

    /* JADX INFO: renamed from: g */
    public int m98004g() {
        return this.f71550a;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m98005h(LiveEventBus liveEventBus, int i) {
        liveEventBus.VoiceGameChangeEvent.stopVoiceGame().mo199273j(Integer.valueOf(this.f71550a));
        this.f71551b.removeCallbacksAndMessages(null);
        this.f71551b.postDelayed(new RunnableC15714a(i, liveEventBus), 1000L);
    }

    /* JADX INFO: renamed from: i */
    public void m98006i(int i) {
        this.f71550a = i;
    }

    /* JADX INFO: renamed from: j */
    public void m98007j(Act act, final LiveEventBus liveEventBus, final int i) {
        String string;
        int i2 = this.f71550a;
        if (i2 == 0 || i2 == i) {
            this.f71551b.removeCallbacksAndMessages(null);
            liveEventBus.VoiceGameChangeEvent.startVoiceGame().mo199273j(Integer.valueOf(i));
            m98002d(i);
            return;
        }
        switch (i2) {
            case 1:
                string = act.getString(R$string.f48023ch);
                break;
            case 2:
                string = act.getString(R$string.f48001bh);
                break;
            case 3:
                string = act.getString(R$string.f48463wi);
                break;
            case 4:
                string = act.getString(R$string.f47806Sc);
                break;
            case 5:
                string = act.getString(R$string.f48310pj);
                break;
            case 6:
                string = act.getString(R$string.f47476D5);
                break;
            default:
                string = "";
                break;
        }
        if (this.f71550a != i) {
            act.dialog().m21503F(String.format(act.getString(R$string.f47956Zf), string)).m21540k0(R$string.f47690N1).m21555t0(R$string.f48195ke, new Runnable() { // from class: l.zhn0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f204438a.m98005h(liveEventBus, i);
                }
            }).m21566z().show();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m98008k() {
        this.f71550a = 0;
    }
}
