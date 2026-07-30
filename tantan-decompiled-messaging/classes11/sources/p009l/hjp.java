package p009l;

import android.content.DialogInterface;
import android.widget.TextView;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.CoreModule;
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
public class hjp extends udp {

    /* JADX INFO: renamed from: l.hjp$a */
    public class RunnableC0940a implements Runnable {

        /* JADX INFO: renamed from: a */
        public Dialog f14156a;

        /* JADX INFO: renamed from: b */
        public TextView f14157b;

        /* JADX INFO: renamed from: c */
        public c4g0 f14158c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ CounterLikeLimit f14159d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ j7h0.C0970a f14160e;

        public RunnableC0940a(CounterLikeLimit counterLikeLimit, j7h0.C0970a c0970a) {
            this.f14159d = counterLikeLimit;
            this.f14160e = c0970a;
            this.f14158c = c0970a.f14967a.duringCreated(c.interval(1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.a())).subscribe(mkd0.G(new e30() { // from class: l.ejp
                public final void call(Object obj) {
                    this.f12589a.m15868d((Long) obj);
                }
            }));
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m15868d(Long l2) {
            m15871g();
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m15869e() {
            this.f14158c.unsubscribe();
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m15870f(DialogInterface dialogInterface) {
            this.f14158c.unsubscribe();
        }

        /* JADX INFO: renamed from: g */
        public void m15871g() {
            long jResetNowMillis = this.f14159d.resetNowMillis();
            if (jResetNowMillis <= 0 && NullChecker.a(this.f14156a)) {
                this.f14156a.cancel();
            }
            String strB = qqi0.b(jResetNowMillis);
            if (NullChecker.a(this.f14157b)) {
                this.f14157b.setText(strB);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Dialog dialogZ0 = this.f14160e.f14968b.act().dialog().G0(this.f14160e.f14968b.act().getString(R.string.J3, Integer.valueOf(this.f14159d.total))).F(this.f14160e.f14968b.act().getString(R.string.I3, Integer.valueOf(this.f14159d.total))).u().s().c0(x2c0.vt).v0("", new Runnable() { // from class: l.fjp
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13068a.m15869e();
                }
            }).w0(this.f14160e.f14968b.act().getResources().getDrawable(x2c0.wt)).A(new DialogInterface.OnCancelListener() { // from class: l.gjp
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.f13610a.m15870f(dialogInterface);
                }
            }).z0();
            this.f14156a = dialogZ0;
            TextView textViewJ0 = xdl0.J0(dialogZ0.Z());
            this.f14157b = textViewJ0;
            textViewJ0.setTextSize(0, textViewJ0.getTextSize() * 1.1f);
            m15871g();
        }
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(j7h0.C0970a c0970a) {
        CounterLikeLimit counterLikeLimit = m22806e() != null ? m22806e().likeLimit : null;
        if (mb90.b(PurchaseType.TYPE_LIKENOLIMIT_PKG) || !nkp.a()) {
            new RunnableC0940a(counterLikeLimit, c0970a).run();
        } else {
            com.p1.mobile.putong.core.ui.purchase.c.M1(c0970a.f14968b.act(), "p_intl_tribe_swipe_view,e_intl_tribe_card_like_click,click", Privilege.vip_unlimited_likes, (d30) null, (d30) null, false, c0970a.f14969c.m17130d());
        }
        c0970a.f14967a.m15835x2(c0970a.f14972f, "failExhaustSwipe");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(j7h0.C0970a c0970a) {
        Counter counterM22806e = m22806e();
        CounterLikeLimit counterLikeLimit = counterM22806e == null ? null : counterM22806e.likeLimit;
        if (counterLikeLimit == null || counterLikeLimit.tribeTotalCount == -1 || counterLikeLimit.total == -1) {
            return false;
        }
        return (counterLikeLimit.remaining == 0 || ((Long) CoreModule.c.e0.Q0.get()).longValue() >= ((long) counterLikeLimit.tribeTotalCount)) && counterLikeLimit.resetNowMillis() > 0 && m22808g(c0970a);
    }
}
