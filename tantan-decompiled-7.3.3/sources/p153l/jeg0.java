package p153l;

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
public final class jeg0 {

    /* JADX INFO: renamed from: a */
    public final Context f120486a;

    /* JADX INFO: renamed from: b */
    public final ang0 f120487b;

    /* JADX INFO: renamed from: c */
    public final nxg0 f120488c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f120489d;

    /* JADX INFO: renamed from: e */
    public final WeakHashMap f120490e;

    /* JADX INFO: renamed from: f */
    public final WeakHashMap f120491f;

    /* JADX INFO: renamed from: g */
    public final LinkedHashSet f120492g;

    /* JADX INFO: renamed from: h */
    public final nvg0 f120493h;

    /* JADX INFO: renamed from: i */
    public final Handler f120494i;

    /* JADX INFO: renamed from: j */
    public final cng0 f120495j;

    /* JADX INFO: renamed from: k */
    public final zyg0 f120496k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f120497l;

    /* JADX INFO: renamed from: m */
    public final boolean f120498m;

    public jeg0(Context context, ang0 ang0Var, Handler handler, nxg0 nxg0Var, cng0 cng0Var, zyg0 zyg0Var) {
        qyg0 qyg0Var = new qyg0();
        qyg0Var.start();
        Looper looper = qyg0Var.getLooper();
        StringBuilder sb = yuq0.f201657a;
        ftg0 ftg0Var = new ftg0(looper);
        ftg0Var.sendMessageDelayed(ftg0Var.obtainMessage(), 1000L);
        this.f120486a = context;
        this.f120487b = ang0Var;
        this.f120489d = new LinkedHashMap();
        this.f120490e = new WeakHashMap();
        this.f120491f = new WeakHashMap();
        this.f120492g = new LinkedHashSet();
        this.f120493h = new nvg0(qyg0Var.getLooper(), this);
        this.f120488c = nxg0Var;
        this.f120494i = handler;
        this.f120495j = cng0Var;
        this.f120496k = zyg0Var;
        this.f120497l = new ArrayList(4);
        yuq0.m217469e(context);
        this.f120498m = context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0;
        Sudvoid sudvoid = new Sudvoid(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
        if (sudvoid.f211029Suddo.f120498m) {
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
        jj5.m145018l(sudvoid.f211029Suddo.f120486a, sudvoid, intentFilter);
    }

    /* JADX INFO: renamed from: a */
    public final void m144563a(teg0 teg0Var) {
        Future future = teg0Var.f173832n;
        if (future == null || !future.isCancelled()) {
            Bitmap bitmap = teg0Var.f173831m;
            if (bitmap != null) {
                bitmap.prepareToDraw();
            }
            this.f120497l.add(teg0Var);
            if (this.f120493h.hasMessages(7)) {
                return;
            }
            this.f120493h.sendEmptyMessageDelayed(7, 200L);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m144564b(wqg0 wqg0Var, boolean z) {
        teg0 teg0Var;
        jeg0 jeg0Var;
        wqg0 wqg0Var2;
        if (this.f120492g.contains(wqg0Var.f190405f)) {
            this.f120491f.put(wqg0Var.m207517b(), wqg0Var);
            return;
        }
        teg0 teg0Var2 = (teg0) this.f120489d.get(wqg0Var.f190404e);
        if (teg0Var2 != null) {
            teg0Var2.f173820b.getClass();
            if (teg0Var2.f173829k == null) {
                teg0Var2.f173829k = wqg0Var;
                return;
            }
            if (teg0Var2.f173830l == null) {
                teg0Var2.f173830l = new ArrayList(3);
            }
            teg0Var2.f173830l.add(wqg0Var);
            int i = wqg0Var.f190401b.f133957c;
            if (pxg0.m174221a(i) > pxg0.m174221a(teg0Var2.f173837s)) {
                teg0Var2.f173837s = i;
                return;
            }
            return;
        }
        if (this.f120487b.isShutdown()) {
            return;
        }
        feg0 feg0Var = wqg0Var.f190400a;
        cng0 cng0Var = this.f120495j;
        zyg0 zyg0Var = this.f120496k;
        Object obj = teg0.f173815t;
        lxg0 lxg0Var = wqg0Var.f190401b;
        List list = feg0Var.f98667a;
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                jeg0Var = this;
                wqg0Var2 = wqg0Var;
                teg0Var = new teg0(feg0Var, jeg0Var, cng0Var, zyg0Var, wqg0Var2, teg0.f173818w);
                break;
            } else {
                uxg0 uxg0Var = (uxg0) list.get(i2);
                if (uxg0Var.mo118415d(lxg0Var)) {
                    jeg0Var = this;
                    wqg0Var2 = wqg0Var;
                    teg0Var = new teg0(feg0Var, jeg0Var, cng0Var, zyg0Var, wqg0Var2, uxg0Var);
                    break;
                }
                i2++;
            }
        }
        ang0 ang0Var = jeg0Var.f120487b;
        ang0Var.getClass();
        tmg0 tmg0Var = new tmg0(teg0Var);
        ang0Var.execute(tmg0Var);
        teg0Var.f173832n = tmg0Var;
        jeg0Var.f120489d.put(wqg0Var2.f190404e, teg0Var);
        if (z) {
            jeg0Var.f120490e.remove(wqg0Var2.m207517b());
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m144565c(teg0 teg0Var) {
        nvg0 nvg0Var = this.f120493h;
        nvg0Var.sendMessage(nvg0Var.obtainMessage(6, teg0Var));
    }

    /* JADX INFO: renamed from: d */
    public final void m144566d(teg0 teg0Var) {
        nvg0 nvg0Var = this.f120493h;
        nvg0Var.sendMessage(nvg0Var.obtainMessage(4, teg0Var));
    }
}
