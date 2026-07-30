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
public class tof extends kof {

    /* JADX INFO: renamed from: l.tof$a */
    public class RunnableC1202a implements Runnable {

        /* JADX INFO: renamed from: a */
        public Dialog f20797a;

        /* JADX INFO: renamed from: b */
        public TextView f20798b;

        /* JADX INFO: renamed from: c */
        public c4g0 f20799c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ CounterLikeLimit f20800d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ lof.C1021a f20801e;

        public RunnableC1202a(CounterLikeLimit counterLikeLimit, lof.C1021a c1021a) {
            this.f20800d = counterLikeLimit;
            this.f20801e = c1021a;
            this.f20799c = c1021a.f16274a.duringCreated(c.interval(1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.a())).subscribe(mkd0.G(new e30() { // from class: l.sof
                public final void call(Object obj) {
                    this.f20401a.m22600d((Long) obj);
                }
            }));
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m22600d(Long l2) {
            m22603g();
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m22601e() {
            this.f20799c.unsubscribe();
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m22602f(DialogInterface dialogInterface) {
            this.f20799c.unsubscribe();
        }

        /* JADX INFO: renamed from: g */
        public void m22603g() {
            long jResetNowMillis = this.f20800d.resetNowMillis();
            if (jResetNowMillis <= 0 && NullChecker.a(this.f20797a)) {
                this.f20797a.cancel();
            }
            String strB = qqi0.b(jResetNowMillis);
            if (NullChecker.a(this.f20798b)) {
                this.f20798b.setText(strB);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Dialog dialogZ0 = this.f20801e.f16274a.dialog().G0(this.f20801e.f16274a.getString(R.string.J3, Integer.valueOf(this.f20800d.total))).F(this.f20801e.f16274a.getString(R.string.I3, Integer.valueOf(this.f20800d.total))).u().s().c0(x2c0.vt).v0("", new Runnable() { // from class: l.qof
                @Override // java.lang.Runnable
                public final void run() {
                    this.f19408a.m22601e();
                }
            }).w0(this.f20801e.f16274a.getResources().getDrawable(x2c0.wt)).V(new DialogInterface.OnDismissListener() { // from class: l.rof
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f19929a.m22602f(dialogInterface);
                }
            }).z0();
            this.f20797a = dialogZ0;
            TextView textViewJ0 = xdl0.J0(dialogZ0.Z());
            this.f20798b = textViewJ0;
            textViewJ0.setTextSize(0, textViewJ0.getTextSize() * 1.1f);
            m22603g();
        }
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(lof.C1021a c1021a) {
        Counter counterM17567e = m17567e();
        CounterLikeLimit counterLikeLimit = counterM17567e == null ? null : counterM17567e.likeLimit;
        if (counterLikeLimit != null && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && m17569g(c1021a)) {
            c1021a.f16284k.mo279M3(c1021a.m17971a(), "other");
        }
        CounterLikeLimit counterLikeLimit2 = m17567e() != null ? m17567e().likeLimit : null;
        if (mb90.b(PurchaseType.TYPE_LIKENOLIMIT_PKG) || !nkp.a()) {
            new RunnableC1202a(counterLikeLimit2, c1021a).run();
        } else {
            com.p1.mobile.putong.core.ui.purchase.c.M1(c1021a.f16274a, "p_home,likelimit", Privilege.vip_unlimited_likes, (d30) null, (d30) null, false, c1021a.f16276c);
        }
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(lof.C1021a c1021a) {
        Counter counterM17567e = m17567e();
        CounterLikeLimit counterLikeLimit = counterM17567e == null ? null : counterM17567e.likeLimit;
        return counterLikeLimit != null && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && m17569g(c1021a);
    }
}
