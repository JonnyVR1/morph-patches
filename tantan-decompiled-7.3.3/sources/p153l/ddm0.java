package p153l;

import android.text.TextUtils;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.live.base.data.BLiveSpecialFriendRelation;
import com.p051p1.mobile.putong.live.livingroom.virtual.userCard.p068cp.VirtualVoiceSpFriendHeadView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.oo2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m88121d2 = {"Ll/ddm0;", "Ll/oo2;", "D", "Ll/atm0;", "Lcom/p1/mobile/putong/live/livingroom/virtual/userCard/cp/VirtualVoiceSpFriendHeadView;", "Ll/dum;", BaseSei.INFO, "middleView", "<init>", "(Ll/dum;Lcom/p1/mobile/putong/live/livingroom/virtual/userCard/cp/VirtualVoiceSpFriendHeadView;)V", "Ll/vak0;", "data", "", "j4", "(Ll/vak0;)V", "", "jumpScheme", "m4", "(Ljava/lang/String;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveSpecialFriendRelation;", Item.TYPE, "l4", "(Lcom/p1/mobile/putong/live/base/data/BLiveSpecialFriendRelation;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ddm0<D extends oo2> extends atm0<VirtualVoiceSpFriendHeadView, D> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddm0(@NotNull dum<D> dumVar, @NotNull VirtualVoiceSpFriendHeadView virtualVoiceSpFriendHeadView) {
        super(dumVar);
        dumVar.getClass();
        virtualVoiceSpFriendHeadView.getClass();
        mo52715C(virtualVoiceSpFriendHeadView);
    }

    @Override // p153l.atm0
    /* JADX INFO: renamed from: j4 */
    public void mo100222j4(@Nullable vak0 data) {
        super.mo100222j4(data);
        ((VirtualVoiceSpFriendHeadView) this.viewModel).m78737c(data != null ? data.m200543r() : null, this);
    }

    /* JADX INFO: renamed from: l4 */
    public final void m115361l4(@NotNull BLiveSpecialFriendRelation item) {
        item.getClass();
        String str = item.schema;
        str.getClass();
        m115362m4(str);
        i4g0.m138520r("e_audio_cpfriend_positon", "p_audio_profile");
    }

    /* JADX INFO: renamed from: m4 */
    public final void m115362m4(@NotNull String jumpScheme) {
        jumpScheme.getClass();
        if (TextUtils.isEmpty(jumpScheme)) {
            return;
        }
        m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(200).m103154e(jumpScheme).m103152c());
        m213811F2().OpenUserCardDialogEvent.dismiss().m199277p();
    }
}
