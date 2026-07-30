package p149l;

import android.content.DialogInterface;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.CounterLikeLimit;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class hjp extends udp {

    /* JADX INFO: renamed from: l.hjp$a */
    public class RunnableC17331a implements Runnable {

        /* JADX INFO: renamed from: a */
        public Dialog f108100a;

        /* JADX INFO: renamed from: b */
        public TextView f108101b;

        /* JADX INFO: renamed from: c */
        public c4g0 f108102c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ CounterLikeLimit f108103d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ j7h0.C17710a f108104e;

        public RunnableC17331a(CounterLikeLimit counterLikeLimit, j7h0.C17710a c17710a) {
            this.f108103d = counterLikeLimit;
            this.f108104e = c17710a;
            this.f108102c = c17710a.f116599a.duringCreated(C22306c.interval(1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.m142408a())).subscribe(mkd0.m154955G(new e30() { // from class: l.ejp
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f91774a.m131397d((Long) obj);
                }
            }));
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m131397d(Long l2) {
            m131400g();
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m131398e() {
            this.f108102c.unsubscribe();
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m131399f(DialogInterface dialogInterface) {
            this.f108102c.unsubscribe();
        }

        /* JADX INFO: renamed from: g */
        public void m131400g() {
            long jResetNowMillis = this.f108103d.resetNowMillis();
            if (jResetNowMillis <= 0 && NullChecker.m81303a(this.f108100a)) {
                this.f108100a.cancel();
            }
            String strM175934b = qqi0.m175934b(jResetNowMillis);
            if (NullChecker.m81303a(this.f108101b)) {
                this.f108101b.setText(strM175934b);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Dialog dialogM20568z0 = this.f108104e.f116600b.getAct().dialog().m20507G0(this.f108104e.f116600b.getAct().getString(R$string.f17840J3, Integer.valueOf(this.f108103d.total))).m20504F(this.f108104e.f116600b.getAct().getString(R$string.f17810I3, Integer.valueOf(this.f108103d.total))).m20557u().m20553s().m20533c0(x2c0.f190664vt).m20560v0("", new Runnable() { // from class: l.fjp
                @Override // java.lang.Runnable
                public final void run() {
                    this.f97804a.m131398e();
                }
            }).m20562w0(this.f108104e.f116600b.getAct().getResources().getDrawable(x2c0.f190696wt)).m20494A(new DialogInterface.OnCancelListener() { // from class: l.gjp
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.f103092a.m131399f(dialogInterface);
                }
            }).m20568z0();
            this.f108100a = dialogM20568z0;
            TextView textViewM208339J0 = xdl0.m208339J0(dialogM20568z0.m20465Z());
            this.f108101b = textViewM208339J0;
            textViewM208339J0.setTextSize(0, textViewM208339J0.getTextSize() * 1.1f);
            m131400g();
        }
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(j7h0.C17710a c17710a) {
        CounterLikeLimit counterLikeLimit = m193147e() != null ? m193147e().likeLimit : null;
        if (mb90.m153866b(PurchaseType.TYPE_LIKENOLIMIT_PKG) || !nkp.m159982a()) {
            new RunnableC17331a(counterLikeLimit, c17710a).run();
        } else {
            C8764c.m53412M1(c17710a.f116600b.getAct(), "p_intl_tribe_swipe_view,e_intl_tribe_card_like_click,click", Privilege.vip_unlimited_likes, null, null, false, c17710a.f116601c.m141745d());
        }
        c17710a.f116599a.m131092x2(c17710a.f116604f, "failExhaustSwipe");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(j7h0.C17710a c17710a) {
        Counter counterM193147e = m193147e();
        CounterLikeLimit counterLikeLimit = counterM193147e == null ? null : counterM193147e.likeLimit;
        if (counterLikeLimit == null || counterLikeLimit.tribeTotalCount == -1 || counterLikeLimit.total == -1) {
            return false;
        }
        return (counterLikeLimit.remaining == 0 || CoreModule.f17545c.f19639e0.f149246Q0.get().longValue() >= ((long) counterLikeLimit.tribeTotalCount)) && counterLikeLimit.resetNowMillis() > 0 && m193149g(c17710a);
    }
}
