package p009l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.newui.newmeet.frag.meet.NewMeetFrag;
import com.p000p1.mobile.putong.core.newui.newmeet.frag.odiamond.ODiamondFrag;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.VisitorCounter;
import com.sina.weibo.sdk.web.WebPicUploadResult;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import l.d30;
import l.e30;
import l.jq2;
import l.mkd0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Ll/kj30;", "Ll/jq2;", "Ll/oj30;", "Lcom/p1/mobile/android/app/Act;", "act", "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "destroy", "()V", "Z", "a0", "", "requestCode", "resultCode", "Landroid/content/Intent;", WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_DATA, "", "h0", "(IILandroid/content/Intent;)Z", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class kj30 extends jq2<oj30> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj30(@NotNull Act act) {
        super(act);
        act.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: e0 */
    public static void m17536e0() {
        CoreModule.c.m1.s5();
    }

    /* JADX INFO: renamed from: f0 */
    public static void m17537f0(kj30 kj30Var, VisitorCounter visitorCounter) {
        boolean z = visitorCounter != null && visitorCounter.newCnt > 0;
        if (!((oj30) ((jq2) kj30Var).viewModel).m19845w(1) && z) {
            zvf0.x("e_diamond_tab_red_dot", "p_meet");
        }
        ((oj30) ((jq2) kj30Var).viewModel).m19846x(visitorCounter != null ? visitorCounter.totalCnt : 0, visitorCounter != null ? visitorCounter.newCnt : 0);
    }

    /* JADX INFO: renamed from: g0 */
    public static void m17538g0(kj30 kj30Var, Bundle bundle) {
        Intent intent;
        Intent intent2;
        ((oj30) ((jq2) kj30Var).viewModel).m19844v();
        Act act = kj30Var.act();
        String stringExtra = null;
        String stringExtra2 = (act == null || (intent2 = act.getIntent()) == null) ? null : intent2.getStringExtra("from");
        if (TextUtils.equals(stringExtra2, "from_meet_visitor") || TextUtils.equals(stringExtra2, "from_odiamond_weekly_report")) {
            ((oj30) ((jq2) kj30Var).viewModel).m19829F(1);
            return;
        }
        if (TextUtils.equals(stringExtra2, "from_meet_deep_link")) {
            Act act2 = kj30Var.act();
            if (act2 != null && (intent = act2.getIntent()) != null) {
                stringExtra = intent.getStringExtra("jump_table");
            }
            if (TextUtils.equals("see", stringExtra)) {
                oj30 oj30Var = (oj30) ((jq2) kj30Var).viewModel;
                oj30Var.m19829F(Math.min(oj30Var.m19834f().getItemCount() - 1, 1));
            }
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m17539Z() {
        Intent intent;
        super.Z();
        CoreModule.c.m1.s5();
        Act act = act();
        ((oj30) ((jq2) this).viewModel).m19824A(TextUtils.equals((act == null || (intent = act.getIntent()) == null) ? null : intent.getStringExtra("from"), "from_odiamond_weekly_report"));
    }

    /* JADX INFO: renamed from: a0 */
    public void m17540a0() {
        super.a0();
        creates(new e30() { // from class: l.hj30
            public final void call(Object obj) {
                kj30.m17538g0(this.f14148a, (Bundle) obj);
            }
        }, new d30() { // from class: l.ij30
            public final void call() {
                kj30.m17536e0();
            }
        });
        duringCreated(CoreModule.c.m1.Q4()).subscribe(mkd0.G(new e30() { // from class: l.jj30
            public final void call(Object obj) {
                kj30.m17537f0(this.f15194a, (VisitorCounter) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h0 */
    public final boolean m17541h0(int requestCode, int resultCode, @Nullable Intent data) {
        NewMeetFrag newMeetFragM19835i = ((oj30) ((jq2) this).viewModel).getMeetFrag();
        if (newMeetFragM19835i != null && newMeetFragM19835i.m7164Q4(requestCode, resultCode, data)) {
            return true;
        }
        ODiamondFrag oDiamondFragM19837j = ((oj30) ((jq2) this).viewModel).getODiamondFrag();
        return oDiamondFragM19837j != null && oDiamondFragM19837j.m7231Q4(requestCode, resultCode, data);
    }

    public void destroy() {
    }
}
