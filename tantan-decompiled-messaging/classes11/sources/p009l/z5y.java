package p009l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.newui.meet.likers.MeetLikersFrag;
import com.p000p1.mobile.putong.core.newui.newmeet.frag.odiamond.ODiamondFrag;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreLikers;
import com.p1.mobile.putong.data.VisitorCounter;
import com.sina.weibo.sdk.web.WebPicUploadResult;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import l.d30;
import l.e30;
import l.jq2;
import l.mkd0;
import l.s7m;
import l.w9j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Ll/z5y;", "Ll/jq2;", "Ll/k7y;", "Lcom/p1/mobile/android/app/Act;", "act", "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "destroy", "()V", "Z", "a0", "", "requestCode", "resultCode", "Landroid/content/Intent;", WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_DATA, "", "k0", "(IILandroid/content/Intent;)Z", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    public static void m25615e0(z5y z5yVar, VisitorCounter visitorCounter) {
        ((k7y) ((jq2) z5yVar).viewModel).m17322F(visitorCounter != null ? visitorCounter.totalCnt : 0, visitorCounter != null ? visitorCounter.newCnt : 0);
    }

    /* JADX INFO: renamed from: f0 */
    public static void m25616f0() {
        CoreModule.c.m1.s5();
        Long l2 = (Long) CoreModule.c.u0.k0.get();
        CoreLikers coreLikers = CoreModule.c.u0;
        l2.getClass();
        coreLikers.h7(l2.longValue());
        CoreModule.c.m1.T4(CoreModule.c.m1.u4());
    }

    /* JADX INFO: renamed from: g0 */
    public static void m25617g0(z5y z5yVar, Integer num) {
        k7y k7yVar = (k7y) ((jq2) z5yVar).viewModel;
        num.getClass();
        k7yVar.m17319C(num.intValue());
    }

    /* JADX INFO: renamed from: h0 */
    public static Integer m25618h0(Function1 function1, Object obj) {
        return (Integer) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m25619i0(z5y z5yVar, Bundle bundle) {
        Intent intent;
        ((k7y) ((jq2) z5yVar).viewModel).m17318B();
        ((k7y) ((jq2) z5yVar).viewModel).m17321E();
        Act act = z5yVar.act();
        String stringExtra = (act == null || (intent = act.getIntent()) == null) ? null : intent.getStringExtra("select_tab");
        if (TextUtils.equals(stringExtra, "nearby")) {
            ((k7y) ((jq2) z5yVar).viewModel).m17327K(2);
            return;
        }
        boolean zEquals = TextUtils.equals(stringExtra, "visitor");
        s7m s7mVar = ((jq2) z5yVar).viewModel;
        if (zEquals) {
            ((k7y) s7mVar).m17327K(1);
        } else {
            ((k7y) s7mVar).m17327K(0);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static Integer m25620j0(CoreLikers.a aVar) {
        return Integer.valueOf(aVar.c);
    }

    /* JADX INFO: renamed from: Z */
    public void m25621Z() {
        Intent intent;
        super.Z();
        CoreModule.c.m1.s5();
        Act act = act();
        ((k7y) ((jq2) this).viewModel).m17326J(TextUtils.equals((act == null || (intent = act.getIntent()) == null) ? null : intent.getStringExtra("from"), "from_odiamond_weekly_report"));
    }

    /* JADX INFO: renamed from: a0 */
    public void m25622a0() {
        super.a0();
        creates(new e30() { // from class: l.t5y
            public final void call(Object obj) {
                z5y.m25619i0(this.f20566a, (Bundle) obj);
            }
        }, new d30() { // from class: l.u5y
            public final void call() {
                z5y.m25616f0();
            }
        });
        c cVarDuringCreated = duringCreated(CoreModule.c.u0.p7());
        final Function1 function1 = new Function1() { // from class: l.v5y
            public final Object invoke(Object obj) {
                return z5y.m25620j0((CoreLikers.a) obj);
            }
        };
        cVarDuringCreated.map(new w9j() { // from class: l.w5y
            public final Object call(Object obj) {
                return z5y.m25618h0(function1, obj);
            }
        }).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.x5y
            public final void call(Object obj) {
                z5y.m25617g0(this.f22445a, (Integer) obj);
            }
        }));
        duringCreated(CoreModule.c.m1.Q4()).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.y5y
            public final void call(Object obj) {
                z5y.m25615e0(this.f22905a, (VisitorCounter) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m25623k0(int requestCode, int resultCode, @Nullable Intent data) {
        MeetLikersFrag meetLikersFragM17333q = ((k7y) ((jq2) this).viewModel).getMeetFrag();
        if (meetLikersFragM17333q != null && meetLikersFragM17333q.m4597R4(requestCode, resultCode, data)) {
            return true;
        }
        ODiamondFrag oDiamondFragM17335u = ((k7y) ((jq2) this).viewModel).getODiamondFrag();
        return oDiamondFragM17335u != null && oDiamondFragM17335u.m7231Q4(requestCode, resultCode, data);
    }

    public void destroy() {
    }
}
