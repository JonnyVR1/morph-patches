package p007l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.p001ui.likedusers.tablayout.NewMyLikedUsersAct;
import com.p000p1.mobile.putong.data.Data;
import com.p1.mobile.android.app.Act;
import kotlin.Metadata;
import l.d30;
import l.e30;
import l.jq2;
import l.s7m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Ll/ck30;", "Ll/jq2;", "Ll/yj30;", "Lcom/p1/mobile/putong/core/ui/likedusers/tablayout/NewMyLikedUsersAct;", "act", "<init>", "(Lcom/p1/mobile/putong/core/ui/likedusers/tablayout/NewMyLikedUsersAct;)V", "", "destroy", "()V", "a0", "", "requestCode", "resultCode", "Landroid/content/Intent;", Data.TYPE, "", "g0", "(IILandroid/content/Intent;)Z", "a", "Lcom/p1/mobile/putong/core/ui/likedusers/tablayout/NewMyLikedUsersAct;", "getAct", "()Lcom/p1/mobile/putong/core/ui/likedusers/tablayout/NewMyLikedUsersAct;", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ck30 extends jq2<yj30> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final NewMyLikedUsersAct act;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck30(@NotNull NewMyLikedUsersAct newMyLikedUsersAct) {
        super(newMyLikedUsersAct);
        newMyLikedUsersAct.getClass();
        this.act = newMyLikedUsersAct;
    }

    /* JADX INFO: renamed from: e0 */
    public static void m9195e0() {
    }

    /* JADX INFO: renamed from: f0 */
    public static void m9196f0(ck30 ck30Var, Bundle bundle) {
        Intent intent;
        ((yj30) ((jq2) ck30Var).viewModel).m17164r();
        Act act = ck30Var.act();
        boolean zEquals = TextUtils.equals((act == null || (intent = act.getIntent()) == null) ? null : intent.getStringExtra("select_tab"), "undoUser");
        s7m s7mVar = ((jq2) ck30Var).viewModel;
        if (zEquals) {
            ((yj30) s7mVar).m17163q(1);
        } else {
            ((yj30) s7mVar).m17163q(0);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m9197a0() {
        super.a0();
        creates(new e30() { // from class: l.ak30
            public final void call(Object obj) {
                ck30.m9196f0(this.f5764a, (Bundle) obj);
            }
        }, new d30() { // from class: l.bk30
            public final void call() {
                ck30.m9195e0();
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public final boolean m9198g0(int requestCode, int resultCode, @Nullable Intent data) {
        return ((yj30) ((jq2) this).viewModel).m17156f().mo462i(requestCode, resultCode, data);
    }

    public void destroy() {
    }
}
