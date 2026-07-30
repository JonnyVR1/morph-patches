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
public class aqh extends pph {

    /* JADX INFO: renamed from: l.aqh$a */
    public class RunnableC0767a implements Runnable {

        /* JADX INFO: renamed from: a */
        public Dialog f9618a;

        /* JADX INFO: renamed from: b */
        public TextView f9619b;

        /* JADX INFO: renamed from: c */
        public c4g0 f9620c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ CounterLikeLimit f9621d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ qph.C1150a f9622e;

        public RunnableC0767a(CounterLikeLimit counterLikeLimit, qph.C1150a c1150a) {
            this.f9621d = counterLikeLimit;
            this.f9622e = c1150a;
            this.f9620c = c1150a.f19425a.duringCreated(c.interval(1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.a())).subscribe(mkd0.G(new e30() { // from class: l.zph
                public final void call(Object obj) {
                    this.f23824a.m11593d((Long) obj);
                }
            }));
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m11593d(Long l2) {
            m11596g();
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m11594e() {
            this.f9620c.unsubscribe();
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m11595f(DialogInterface dialogInterface) {
            this.f9620c.unsubscribe();
        }

        /* JADX INFO: renamed from: g */
        public void m11596g() {
            long jResetNowMillis = this.f9621d.resetNowMillis();
            if (jResetNowMillis <= 0 && NullChecker.a(this.f9618a)) {
                this.f9618a.cancel();
            }
            String strB = qqi0.b(jResetNowMillis);
            if (NullChecker.a(this.f9619b)) {
                this.f9619b.setText(strB);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Dialog dialogZ0 = this.f9622e.f19425a.dialog().G0(this.f9622e.f19425a.getString(R.string.J3, Integer.valueOf(this.f9621d.total))).F(this.f9622e.f19425a.getString(R.string.I3, Integer.valueOf(this.f9621d.total))).u().s().c0(x2c0.vt).v0("", new Runnable() { // from class: l.xph
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22691a.m11594e();
                }
            }).w0(this.f9622e.f19425a.getResources().getDrawable(x2c0.wt)).A(new DialogInterface.OnCancelListener() { // from class: l.yph
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.f23191a.m11595f(dialogInterface);
                }
            }).z0();
            this.f9618a = dialogZ0;
            TextView textViewJ0 = xdl0.J0(dialogZ0.Z());
            this.f9619b = textViewJ0;
            textViewJ0.setTextSize(0, textViewJ0.getTextSize() * 1.1f);
            m11596g();
        }
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(qph.C1150a c1150a) {
        CounterLikeLimit counterLikeLimit = m20542e() != null ? m20542e().likeLimit : null;
        if (mb90.b(PurchaseType.TYPE_LIKENOLIMIT_PKG) || !nkp.a()) {
            new RunnableC0767a(counterLikeLimit, c1150a).run();
        } else {
            com.p1.mobile.putong.core.ui.purchase.c.M1(c1150a.f19425a, "p_home,likelimit", Privilege.vip_unlimited_likes, (d30) null, (d30) null, false, c1150a.f19427c);
        }
        c1150a.f19431g.mo7345k2(c1150a.f19430f, "failExhaustSwipe");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(qph.C1150a c1150a) {
        Counter counterM20542e = m20542e();
        CounterLikeLimit counterLikeLimit = counterM20542e == null ? null : counterM20542e.likeLimit;
        return counterLikeLimit != null && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && m20544g(c1150a);
    }
}
