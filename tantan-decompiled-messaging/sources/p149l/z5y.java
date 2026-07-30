package p149l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreLikers;
import com.p046p1.mobile.putong.core.newui.meet.likers.MeetLikersFrag;
import com.p046p1.mobile.putong.core.newui.newmeet.frag.odiamond.ODiamondFrag;
import com.p046p1.mobile.putong.data.Visitor;
import com.p046p1.mobile.putong.data.VisitorCounter;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m87232d2 = {"Ll/z5y;", "Ll/jq2;", "Ll/k7y;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "destroy", "()V", "Z", "a0", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "", "k0", "(IILandroid/content/Intent;)Z", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class z5y extends jq2<k7y> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5y(@NotNull Act act) {
        super(act);
        act.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: e0 */
    public static void m217379e0(z5y z5yVar, VisitorCounter visitorCounter) {
        ((k7y) z5yVar.viewModel).m144805F(visitorCounter != null ? visitorCounter.totalCnt : 0, visitorCounter != null ? visitorCounter.newCnt : 0);
    }

    /* JADX INFO: renamed from: f0 */
    public static void m217380f0() {
        CoreModule.f17545c.f19664m1.m34727s5();
        Long l2 = CoreModule.f17545c.f19687u0.f19254k0.get();
        CoreLikers coreLikers = CoreModule.f17545c.f19687u0;
        l2.getClass();
        coreLikers.m30443h7(l2.longValue());
        CoreModule.f17545c.f19664m1.m34708T4(CoreModule.f17545c.f19664m1.m34729u4());
    }

    /* JADX INFO: renamed from: g0 */
    public static void m217381g0(z5y z5yVar, Integer num) {
        k7y k7yVar = (k7y) z5yVar.viewModel;
        num.getClass();
        k7yVar.m144803C(num.intValue());
    }

    /* JADX INFO: renamed from: h0 */
    public static Integer m217382h0(Function1 function1, Object obj) {
        return (Integer) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m217383i0(z5y z5yVar, Bundle bundle) {
        Intent intent;
        ((k7y) z5yVar.viewModel).m144802B();
        ((k7y) z5yVar.viewModel).m144804E();
        Act act = z5yVar.act();
        String stringExtra = (act == null || (intent = act.getIntent()) == null) ? null : intent.getStringExtra("select_tab");
        if (TextUtils.equals(stringExtra, "nearby")) {
            ((k7y) z5yVar.viewModel).m144810K(2);
            return;
        }
        boolean zEquals = TextUtils.equals(stringExtra, Visitor.TYPE);
        V v2 = z5yVar.viewModel;
        if (zEquals) {
            ((k7y) v2).m144810K(1);
        } else {
            ((k7y) v2).m144810K(0);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static Integer m217384j0(CoreLikers.C4719a c4719a) {
        return Integer.valueOf(c4719a.f19271c);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        Intent intent;
        super.mo39469Z();
        CoreModule.f17545c.f19664m1.m34727s5();
        Act act = act();
        ((k7y) this.viewModel).m144809J(TextUtils.equals((act == null || (intent = act.getIntent()) == null) ? null : intent.getStringExtra("from"), "from_odiamond_weekly_report"));
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.t5y
            @Override // p149l.e30
            public final void call(Object obj) {
                z5y.m217383i0(this.f167889a, (Bundle) obj);
            }
        }, new d30() { // from class: l.u5y
            @Override // p149l.d30
            public final void call() {
                z5y.m217380f0();
            }
        });
        C22306c<T> c22306cDuringCreated = duringCreated(CoreModule.f17545c.f19687u0.m30467p7());
        final Function1 function1 = new Function1() { // from class: l.v5y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z5y.m217384j0((CoreLikers.C4719a) obj);
            }
        };
        c22306cDuringCreated.map(new w9j() { // from class: l.w5y
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return z5y.m217382h0(function1, obj);
            }
        }).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.x5y
            @Override // p149l.e30
            public final void call(Object obj) {
                z5y.m217381g0(this.f191203a, (Integer) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19664m1.m34705Q4()).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.y5y
            @Override // p149l.e30
            public final void call(Object obj) {
                z5y.m217379e0(this.f196488a, (VisitorCounter) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m217385k0(int requestCode, int resultCode, @Nullable Intent data) {
        MeetLikersFrag meetLikersFragM144815q = ((k7y) this.viewModel).getMeetFrag();
        if (meetLikersFragM144815q != null && meetLikersFragM144815q.m40507R4(requestCode, resultCode, data)) {
            return true;
        }
        ODiamondFrag oDiamondFragM144817u = ((k7y) this.viewModel).getODiamondFrag();
        return oDiamondFragM144817u != null && oDiamondFragM144817u.m43029Q4(requestCode, resultCode, data);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
