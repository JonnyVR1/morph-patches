package p149l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.likedusers.tablayout.NewMyLikedUsersAct;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m87232d2 = {"Ll/ck30;", "Ll/jq2;", "Ll/yj30;", "Lcom/p1/mobile/putong/core/ui/likedusers/tablayout/NewMyLikedUsersAct;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/putong/core/ui/likedusers/tablayout/NewMyLikedUsersAct;)V", "", "destroy", "()V", "a0", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "", "g0", "(IILandroid/content/Intent;)Z", "a", "Lcom/p1/mobile/putong/core/ui/likedusers/tablayout/NewMyLikedUsersAct;", "getAct", "()Lcom/p1/mobile/putong/core/ui/likedusers/tablayout/NewMyLikedUsersAct;", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    public static void m107354e0() {
    }

    /* JADX INFO: renamed from: f0 */
    public static void m107355f0(ck30 ck30Var, Bundle bundle) {
        Intent intent;
        ((yj30) ck30Var.viewModel).m215044r();
        Act act = ck30Var.act();
        boolean zEquals = TextUtils.equals((act == null || (intent = act.getIntent()) == null) ? null : intent.getStringExtra("select_tab"), "undoUser");
        V v2 = ck30Var.viewModel;
        if (zEquals) {
            ((yj30) v2).m215043q(1);
        } else {
            ((yj30) v2).m215043q(0);
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.ak30
            @Override // p149l.e30
            public final void call(Object obj) {
                ck30.m107355f0(this.f70234a, (Bundle) obj);
            }
        }, new d30() { // from class: l.bk30
            @Override // p149l.d30
            public final void call() {
                ck30.m107354e0();
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public final boolean m107356g0(int requestCode, int resultCode, @Nullable Intent data) {
        return ((yj30) this.viewModel).m215037f().mo46787i(requestCode, resultCode, data);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
