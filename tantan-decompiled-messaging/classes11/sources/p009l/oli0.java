package p009l;

import android.content.DialogInterface;
import android.widget.TextView;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.CounterLikeLimit;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import l.c4g0;
import l.d30;
import l.e30;
import l.jo0;
import l.mb90;
import l.mkd0;
import l.nkp;
import l.qqi0;
import l.x2c0;
import l.xdl0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class oli0 extends cli0 {

    /* JADX INFO: renamed from: l.oli0$a */
    public class RunnableC1084a implements Runnable {

        /* JADX INFO: renamed from: a */
        public Dialog f18130a;

        /* JADX INFO: renamed from: b */
        public TextView f18131b;

        /* JADX INFO: renamed from: c */
        public c4g0 f18132c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ CounterLikeLimit f18133d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ k7h0.C0984a f18134e;

        public RunnableC1084a(CounterLikeLimit counterLikeLimit, k7h0.C0984a c0984a) {
            this.f18133d = counterLikeLimit;
            this.f18134e = c0984a;
            this.f18132c = c0984a.f15441a.duringCreated(c.interval(1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.a())).subscribe(mkd0.G(new e30() { // from class: l.lli0
                public final void call(Object obj) {
                    this.f16250a.m19937d((Long) obj);
                }
            }));
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m19937d(Long l2) {
            m19940g();
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m19938e() {
            this.f18132c.unsubscribe();
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m19939f(DialogInterface dialogInterface) {
            this.f18132c.unsubscribe();
        }

        /* JADX INFO: renamed from: g */
        public void m19940g() {
            long jResetNowMillis = this.f18133d.resetNowMillis();
            if (jResetNowMillis <= 0 && NullChecker.a(this.f18130a)) {
                this.f18130a.cancel();
            }
            String strB = qqi0.b(jResetNowMillis);
            if (NullChecker.a(this.f18131b)) {
                this.f18131b.setText(strB);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Dialog dialogZ0 = this.f18134e.f15442b.act().dialog().G0(this.f18134e.f15442b.act().getString(R.string.J3, Integer.valueOf(this.f18133d.total))).F(this.f18134e.f15442b.act().getString(R.string.I3, Integer.valueOf(this.f18133d.total))).u().s().c0(x2c0.vt).v0("", new Runnable() { // from class: l.mli0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f16991a.m19938e();
                }
            }).w0(this.f18134e.f15442b.act().getResources().getDrawable(x2c0.wt)).A(new DialogInterface.OnCancelListener() { // from class: l.nli0
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.f17571a.m19939f(dialogInterface);
                }
            }).z0();
            this.f18130a = dialogZ0;
            TextView textViewJ0 = xdl0.J0(dialogZ0.Z());
            this.f18131b = textViewJ0;
            textViewJ0.setTextSize(0, textViewJ0.getTextSize() * 1.1f);
            m19940g();
        }
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(k7h0.C0984a c0984a) {
        CounterLikeLimit counterLikeLimit = m12703e() != null ? m12703e().likeLimit : null;
        if (mb90.b(PurchaseType.TYPE_LIKENOLIMIT_PKG) || !nkp.a()) {
            new RunnableC1084a(counterLikeLimit, c0984a).run();
        } else {
            com.p1.mobile.putong.core.ui.purchase.c.M1(c0984a.f15442b.act(), "p_home,likelimit", Privilege.vip_unlimited_likes, (d30) null, (d30) null, false, c0984a.f15443c.m17130d());
        }
        c0984a.f15441a.m13114I2(c0984a.f15446f, "failExhaustSwipe");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(k7h0.C0984a c0984a) {
        Counter counterM12703e = m12703e();
        CounterLikeLimit counterLikeLimit = counterM12703e == null ? null : counterM12703e.likeLimit;
        return counterLikeLimit != null && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && m12705g(c0984a);
    }
}
