package p149l;

import android.content.DialogInterface;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Dialog;
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
public class oli0 extends cli0 {

    /* JADX INFO: renamed from: l.oli0$a */
    public class RunnableC18970a implements Runnable {

        /* JADX INFO: renamed from: a */
        public Dialog f144505a;

        /* JADX INFO: renamed from: b */
        public TextView f144506b;

        /* JADX INFO: renamed from: c */
        public c4g0 f144507c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ CounterLikeLimit f144508d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ k7h0.C17941a f144509e;

        public RunnableC18970a(CounterLikeLimit counterLikeLimit, k7h0.C17941a c17941a) {
            this.f144508d = counterLikeLimit;
            this.f144509e = c17941a;
            this.f144507c = c17941a.f121580a.duringCreated(C22306c.interval(1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.m142408a())).subscribe(mkd0.m154955G(new e30() { // from class: l.lli0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f128711a.m164939d((Long) obj);
                }
            }));
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m164939d(Long l2) {
            m164942g();
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m164940e() {
            this.f144507c.unsubscribe();
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m164941f(DialogInterface dialogInterface) {
            this.f144507c.unsubscribe();
        }

        /* JADX INFO: renamed from: g */
        public void m164942g() {
            long jResetNowMillis = this.f144508d.resetNowMillis();
            if (jResetNowMillis <= 0 && NullChecker.m81303a(this.f144505a)) {
                this.f144505a.cancel();
            }
            String strM175934b = qqi0.m175934b(jResetNowMillis);
            if (NullChecker.m81303a(this.f144506b)) {
                this.f144506b.setText(strM175934b);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Dialog dialogM20568z0 = this.f144509e.f121581b.act().dialog().m20507G0(this.f144509e.f121581b.act().getString(R$string.f17840J3, Integer.valueOf(this.f144508d.total))).m20504F(this.f144509e.f121581b.act().getString(R$string.f17810I3, Integer.valueOf(this.f144508d.total))).m20557u().m20553s().m20533c0(x2c0.f190664vt).m20560v0("", new Runnable() { // from class: l.mli0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f134439a.m164940e();
                }
            }).m20562w0(this.f144509e.f121581b.act().getResources().getDrawable(x2c0.f190696wt)).m20494A(new DialogInterface.OnCancelListener() { // from class: l.nli0
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.f139557a.m164941f(dialogInterface);
                }
            }).m20568z0();
            this.f144505a = dialogM20568z0;
            TextView textViewM208339J0 = xdl0.m208339J0(dialogM20568z0.m20465Z());
            this.f144506b = textViewM208339J0;
            textViewM208339J0.setTextSize(0, textViewM208339J0.getTextSize() * 1.1f);
            m164942g();
        }
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(k7h0.C17941a c17941a) {
        CounterLikeLimit counterLikeLimit = m107473e() != null ? m107473e().likeLimit : null;
        if (mb90.m153866b(PurchaseType.TYPE_LIKENOLIMIT_PKG) || !nkp.m159982a()) {
            new RunnableC18970a(counterLikeLimit, c17941a).run();
        } else {
            C8764c.m53412M1(c17941a.f121581b.act(), "p_home,likelimit", Privilege.vip_unlimited_likes, null, null, false, c17941a.f121582c.m141745d());
        }
        c17941a.f121580a.m110804I2(c17941a.f121585f, "failExhaustSwipe");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(k7h0.C17941a c17941a) {
        Counter counterM107473e = m107473e();
        CounterLikeLimit counterLikeLimit = counterM107473e == null ? null : counterM107473e.likeLimit;
        return counterLikeLimit != null && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && m107475g(c17941a);
    }
}
