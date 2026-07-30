package p149l;

import android.text.TextUtils;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.live.base.data.BLiveSpecialFriendRelation;
import com.p046p1.mobile.putong.live.livingroom.virtual.userCard.p063cp.VirtualVoiceSpFriendHeadView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.ho2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m87232d2 = {"Ll/z3m0;", "Ll/ho2;", "D", "Ll/wjm0;", "Lcom/p1/mobile/putong/live/livingroom/virtual/userCard/cp/VirtualVoiceSpFriendHeadView;", "Ll/bsm;", BaseSei.INFO, "middleView", "<init>", "(Ll/bsm;Lcom/p1/mobile/putong/live/livingroom/virtual/userCard/cp/VirtualVoiceSpFriendHeadView;)V", "Ll/p1k0;", "data", "", "j4", "(Ll/p1k0;)V", "", "jumpScheme", "m4", "(Ljava/lang/String;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveSpecialFriendRelation;", Item.TYPE, "l4", "(Lcom/p1/mobile/putong/live/base/data/BLiveSpecialFriendRelation;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class z3m0<D extends ho2> extends wjm0<VirtualVoiceSpFriendHeadView, D> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3m0(@NotNull bsm<D> bsmVar, @NotNull VirtualVoiceSpFriendHeadView virtualVoiceSpFriendHeadView) {
        super(bsmVar);
        bsmVar.getClass();
        virtualVoiceSpFriendHeadView.getClass();
        mo51532C(virtualVoiceSpFriendHeadView);
    }

    @Override // p149l.wjm0
    /* JADX INFO: renamed from: j4 */
    public void mo123913j4(@Nullable p1k0 data) {
        super.mo123913j4(data);
        ((VirtualVoiceSpFriendHeadView) this.viewModel).m77554c(data != null ? data.m167098r() : null, this);
    }

    /* JADX INFO: renamed from: l4 */
    public final void m217052l4(@NotNull BLiveSpecialFriendRelation item) {
        item.getClass();
        String str = item.schema;
        str.getClass();
        m217053m4(str);
        zvf0.m220396r("e_audio_cpfriend_positon", "p_audio_profile");
    }

    /* JADX INFO: renamed from: m4 */
    public final void m217053m4(@NotNull String jumpScheme) {
        jumpScheme.getClass();
        if (TextUtils.isEmpty(jumpScheme)) {
            return;
        }
        m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(200).m206701e(jumpScheme).m206699c());
        m206028F2().OpenUserCardDialogEvent.dismiss().m172467p();
    }
}
