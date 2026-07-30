package p153l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.newmeet.frag.meet.NewMeetFrag;
import com.p051p1.mobile.putong.core.newui.newmeet.frag.odiamond.ODiamondFrag;
import com.p051p1.mobile.putong.data.VisitorCounter;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m88121d2 = {"Ll/yr30;", "Ll/ar2;", "Ll/cs30;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "destroy", "()V", "Z", "a0", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "", "h0", "(IILandroid/content/Intent;)Z", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class yr30 extends ar2<cs30> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yr30(@NotNull Act act) {
        super(act);
        act.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: e0 */
    public static void m217151e0() {
        CoreModule.f18264c.f20406m1.m35730s5();
    }

    /* JADX INFO: renamed from: f0 */
    public static void m217152f0(yr30 yr30Var, VisitorCounter visitorCounter) {
        boolean z = visitorCounter != null && visitorCounter.newCnt > 0;
        if (!((cs30) yr30Var.viewModel).m112145w(1) && z) {
            i4g0.m138526x("e_diamond_tab_red_dot", "p_meet");
        }
        ((cs30) yr30Var.viewModel).m112146x(visitorCounter != null ? visitorCounter.totalCnt : 0, visitorCounter != null ? visitorCounter.newCnt : 0);
    }

    /* JADX INFO: renamed from: g0 */
    public static void m217153g0(yr30 yr30Var, Bundle bundle) {
        Intent intent;
        Intent intent2;
        ((cs30) yr30Var.viewModel).m112144v();
        Act act = yr30Var.act();
        String stringExtra = null;
        String stringExtra2 = (act == null || (intent2 = act.getIntent()) == null) ? null : intent2.getStringExtra("from");
        if (TextUtils.equals(stringExtra2, "from_meet_visitor") || TextUtils.equals(stringExtra2, "from_odiamond_weekly_report")) {
            ((cs30) yr30Var.viewModel).m112130F(1);
            return;
        }
        if (TextUtils.equals(stringExtra2, "from_meet_deep_link")) {
            Act act2 = yr30Var.act();
            if (act2 != null && (intent = act2.getIntent()) != null) {
                stringExtra = intent.getStringExtra("jump_table");
            }
            if (TextUtils.equals("see", stringExtra)) {
                cs30 cs30Var = (cs30) yr30Var.viewModel;
                cs30Var.m112130F(Math.min(cs30Var.m112135f().getItemCount() - 1, 1));
            }
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        Intent intent;
        super.mo40472Z();
        CoreModule.f18264c.f20406m1.m35730s5();
        Act act = act();
        ((cs30) this.viewModel).m112126A(TextUtils.equals((act == null || (intent = act.getIntent()) == null) ? null : intent.getStringExtra("from"), "from_odiamond_weekly_report"));
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.vr30
            @Override // p153l.y20
            public final void call(Object obj) {
                yr30.m217153g0(this.f185430a, (Bundle) obj);
            }
        }, new x20() { // from class: l.wr30
            @Override // p153l.x20
            public final void call() {
                yr30.m217151e0();
            }
        });
        duringCreated(CoreModule.f18264c.f20406m1.m35708Q4()).subscribe(psd0.m173596G(new y20() { // from class: l.xr30
            @Override // p153l.y20
            public final void call(Object obj) {
                yr30.m217152f0(this.f195882a, (VisitorCounter) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h0 */
    public final boolean m217154h0(int requestCode, int resultCode, @Nullable Intent data) {
        NewMeetFrag newMeetFragM112136i = ((cs30) this.viewModel).getMeetFrag();
        if (newMeetFragM112136i != null && newMeetFragM112136i.m43978Q4(requestCode, resultCode, data)) {
            return true;
        }
        ODiamondFrag oDiamondFragM112137j = ((cs30) this.viewModel).getODiamondFrag();
        return oDiamondFragM112137j != null && oDiamondFragM112137j.m44040Q4(requestCode, resultCode, data);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
