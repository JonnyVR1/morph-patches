package p149l;

import Suddo.Sudvoid;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public final class b6g0 {

    /* JADX INFO: renamed from: a */
    public final Context f73806a;

    /* JADX INFO: renamed from: b */
    public final seg0 f73807b;

    /* JADX INFO: renamed from: c */
    public final fpg0 f73808c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f73809d;

    /* JADX INFO: renamed from: e */
    public final WeakHashMap f73810e;

    /* JADX INFO: renamed from: f */
    public final WeakHashMap f73811f;

    /* JADX INFO: renamed from: g */
    public final LinkedHashSet f73812g;

    /* JADX INFO: renamed from: h */
    public final fng0 f73813h;

    /* JADX INFO: renamed from: i */
    public final Handler f73814i;

    /* JADX INFO: renamed from: j */
    public final ueg0 f73815j;

    /* JADX INFO: renamed from: k */
    public final rqg0 f73816k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f73817l;

    /* JADX INFO: renamed from: m */
    public final boolean f73818m;

    public b6g0(Context context, seg0 seg0Var, Handler handler, fpg0 fpg0Var, ueg0 ueg0Var, rqg0 rqg0Var) {
        iqg0 iqg0Var = new iqg0();
        iqg0Var.start();
        Looper looper = iqg0Var.getLooper();
        StringBuilder sb = slq0.f165256a;
        xkg0 xkg0Var = new xkg0(looper);
        xkg0Var.sendMessageDelayed(xkg0Var.obtainMessage(), 1000L);
        this.f73806a = context;
        this.f73807b = seg0Var;
        this.f73809d = new LinkedHashMap();
        this.f73810e = new WeakHashMap();
        this.f73811f = new WeakHashMap();
        this.f73812g = new LinkedHashSet();
        this.f73813h = new fng0(iqg0Var.getLooper(), this);
        this.f73808c = fpg0Var;
        this.f73814i = handler;
        this.f73815j = ueg0Var;
        this.f73816k = rqg0Var;
        this.f73817l = new ArrayList(4);
        slq0.m184848e(context);
        this.f73818m = context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0;
        Sudvoid sudvoid = new Sudvoid(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
        if (sudvoid.f210107Suddo.f73818m) {
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
        ii5.m136342l(sudvoid.f210107Suddo.f73806a, sudvoid, intentFilter);
    }

    /* JADX INFO: renamed from: a */
    public final void m100403a(l6g0 l6g0Var) {
        Future future = l6g0Var.f126634n;
        if (future == null || !future.isCancelled()) {
            Bitmap bitmap = l6g0Var.f126633m;
            if (bitmap != null) {
                bitmap.prepareToDraw();
            }
            this.f73817l.add(l6g0Var);
            if (this.f73813h.hasMessages(7)) {
                return;
            }
            this.f73813h.sendEmptyMessageDelayed(7, 200L);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m100404b(oig0 oig0Var, boolean z) {
        l6g0 l6g0Var;
        b6g0 b6g0Var;
        oig0 oig0Var2;
        if (this.f73812g.contains(oig0Var.f144119f)) {
            this.f73811f.put(oig0Var.m164511b(), oig0Var);
            return;
        }
        l6g0 l6g0Var2 = (l6g0) this.f73809d.get(oig0Var.f144118e);
        if (l6g0Var2 != null) {
            l6g0Var2.f126622b.getClass();
            if (l6g0Var2.f126631k == null) {
                l6g0Var2.f126631k = oig0Var;
                return;
            }
            if (l6g0Var2.f126632l == null) {
                l6g0Var2.f126632l = new ArrayList(3);
            }
            l6g0Var2.f126632l.add(oig0Var);
            int i = oig0Var.f144115b.f87273c;
            if (hpg0.m132337a(i) > hpg0.m132337a(l6g0Var2.f126639s)) {
                l6g0Var2.f126639s = i;
                return;
            }
            return;
        }
        if (this.f73807b.isShutdown()) {
            return;
        }
        x5g0 x5g0Var = oig0Var.f144114a;
        ueg0 ueg0Var = this.f73815j;
        rqg0 rqg0Var = this.f73816k;
        Object obj = l6g0.f126617t;
        dpg0 dpg0Var = oig0Var.f144115b;
        List list = x5g0Var.f191138a;
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                b6g0Var = this;
                oig0Var2 = oig0Var;
                l6g0Var = new l6g0(x5g0Var, b6g0Var, ueg0Var, rqg0Var, oig0Var2, l6g0.f126620w);
                break;
            } else {
                mpg0 mpg0Var = (mpg0) list.get(i2);
                if (mpg0Var.mo113472d(dpg0Var)) {
                    b6g0Var = this;
                    oig0Var2 = oig0Var;
                    l6g0Var = new l6g0(x5g0Var, b6g0Var, ueg0Var, rqg0Var, oig0Var2, mpg0Var);
                    break;
                }
                i2++;
            }
        }
        seg0 seg0Var = b6g0Var.f73807b;
        seg0Var.getClass();
        leg0 leg0Var = new leg0(l6g0Var);
        seg0Var.execute(leg0Var);
        l6g0Var.f126634n = leg0Var;
        b6g0Var.f73809d.put(oig0Var2.f144118e, l6g0Var);
        if (z) {
            b6g0Var.f73810e.remove(oig0Var2.m164511b());
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m100405c(l6g0 l6g0Var) {
        fng0 fng0Var = this.f73813h;
        fng0Var.sendMessage(fng0Var.obtainMessage(6, l6g0Var));
    }

    /* JADX INFO: renamed from: d */
    public final void m100406d(l6g0 l6g0Var) {
        fng0 fng0Var = this.f73813h;
        fng0Var.sendMessage(fng0Var.obtainMessage(4, l6g0Var));
    }
}
