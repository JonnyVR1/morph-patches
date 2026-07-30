package p153l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.likedusers.tablayout.NewMyLikedUsersAct;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m88121d2 = {"Ll/qs30;", "Ll/ar2;", "Ll/ms30;", "Lcom/p1/mobile/putong/core/ui/likedusers/tablayout/NewMyLikedUsersAct;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/putong/core/ui/likedusers/tablayout/NewMyLikedUsersAct;)V", "", "destroy", "()V", "a0", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "", "g0", "(IILandroid/content/Intent;)Z", "a", "Lcom/p1/mobile/putong/core/ui/likedusers/tablayout/NewMyLikedUsersAct;", "getAct", "()Lcom/p1/mobile/putong/core/ui/likedusers/tablayout/NewMyLikedUsersAct;", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class qs30 extends ar2<ms30> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final NewMyLikedUsersAct act;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qs30(@NotNull NewMyLikedUsersAct newMyLikedUsersAct) {
        super(newMyLikedUsersAct);
        newMyLikedUsersAct.getClass();
        this.act = newMyLikedUsersAct;
    }

    /* JADX INFO: renamed from: e0 */
    public static void m177721e0() {
    }

    /* JADX INFO: renamed from: f0 */
    public static void m177722f0(qs30 qs30Var, Bundle bundle) {
        Intent intent;
        ((ms30) qs30Var.viewModel).m159751r();
        Act act = qs30Var.act();
        boolean zEquals = TextUtils.equals((act == null || (intent = act.getIntent()) == null) ? null : intent.getStringExtra("select_tab"), "undoUser");
        V v2 = qs30Var.viewModel;
        if (zEquals) {
            ((ms30) v2).m159750q(1);
        } else {
            ((ms30) v2).m159750q(0);
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.os30
            @Override // p153l.y20
            public final void call(Object obj) {
                qs30.m177722f0(this.f148782a, (Bundle) obj);
            }
        }, new x20() { // from class: l.ps30
            @Override // p153l.x20
            public final void call() {
                qs30.m177721e0();
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public final boolean m177723g0(int requestCode, int resultCode, @Nullable Intent data) {
        return ((ms30) this.viewModel).m159744f().mo47970i(requestCode, resultCode, data);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
