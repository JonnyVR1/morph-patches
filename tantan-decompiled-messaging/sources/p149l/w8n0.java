package p149l;

import android.os.Handler;
import android.os.Looper;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.tantan.live.eventbus.LiveEventBus;

/* JADX INFO: loaded from: classes5.dex */
public class w8n0 {

    /* JADX INFO: renamed from: c */
    public static volatile w8n0 f185236c;

    /* JADX INFO: renamed from: a */
    public int f185237a = 0;

    /* JADX INFO: renamed from: b */
    public Handler f185238b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: l.w8n0$a */
    public class RunnableC20834a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f185239a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LiveEventBus f185240b;

        public RunnableC20834a(int i, LiveEventBus liveEventBus) {
            this.f185239a = i;
            this.f185240b = liveEventBus;
        }

        @Override // java.lang.Runnable
        public void run() {
            w8n0.this.m202194d(this.f185239a);
            this.f185240b.VoiceGameChangeEvent.startVoiceGame().mo172463j(Integer.valueOf(this.f185239a));
        }
    }

    /* JADX INFO: renamed from: f */
    public static w8n0 m202192f() {
        if (f185236c == null) {
            synchronized (w8n0.class) {
                try {
                    if (f185236c == null) {
                        f185236c = new w8n0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f185236c;
    }

    /* JADX INFO: renamed from: c */
    public void m202193c() {
        this.f185237a = 0;
        this.f185238b.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: renamed from: d */
    public final void m202194d(int i) {
        if (i == 1 || i == 2) {
            return;
        }
        this.f185237a = i;
    }

    /* JADX INFO: renamed from: e */
    public String m202195e(Act act) {
        switch (this.f185237a) {
            case 1:
                return act.getString(R$string.f47175ch);
            case 2:
                return act.getString(R$string.f47153bh);
            case 3:
                return act.getString(R$string.f47615wi);
            case 4:
                return act.getString(R$string.f46958Sc);
            case 5:
                return act.getString(R$string.f47462pj);
            case 6:
                return act.getString(R$string.f46628D5);
            default:
                return "";
        }
    }

    /* JADX INFO: renamed from: g */
    public int m202196g() {
        return this.f185237a;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m202197h(LiveEventBus liveEventBus, int i) {
        liveEventBus.VoiceGameChangeEvent.stopVoiceGame().mo172463j(Integer.valueOf(this.f185237a));
        this.f185238b.removeCallbacksAndMessages(null);
        this.f185238b.postDelayed(new RunnableC20834a(i, liveEventBus), 1000L);
    }

    /* JADX INFO: renamed from: i */
    public void m202198i(int i) {
        this.f185237a = i;
    }

    /* JADX INFO: renamed from: j */
    public void m202199j(Act act, final LiveEventBus liveEventBus, final int i) {
        String string;
        int i2 = this.f185237a;
        if (i2 == 0 || i2 == i) {
            this.f185238b.removeCallbacksAndMessages(null);
            liveEventBus.VoiceGameChangeEvent.startVoiceGame().mo172463j(Integer.valueOf(i));
            m202194d(i);
            return;
        }
        switch (i2) {
            case 1:
                string = act.getString(R$string.f47175ch);
                break;
            case 2:
                string = act.getString(R$string.f47153bh);
                break;
            case 3:
                string = act.getString(R$string.f47615wi);
                break;
            case 4:
                string = act.getString(R$string.f46958Sc);
                break;
            case 5:
                string = act.getString(R$string.f47462pj);
                break;
            case 6:
                string = act.getString(R$string.f46628D5);
                break;
            default:
                string = "";
                break;
        }
        if (this.f185237a != i) {
            act.dialog().m20504F(String.format(act.getString(R$string.f47108Zf), string)).m20541k0(R$string.f46842N1).m20556t0(R$string.f47347ke, new Runnable() { // from class: l.v8n0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f180559a.m202197h(liveEventBus, i);
                }
            }).m20567z().show();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m202200k() {
        this.f185237a = 0;
    }
}
