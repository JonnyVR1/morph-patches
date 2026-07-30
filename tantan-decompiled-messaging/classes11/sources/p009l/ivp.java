package p009l;

import com.p000p1.mobile.putong.live.livingroom.voice.intl.manager.invite.IntlVoiceLiveManagerInviteItemView;
import com.p1.mobile.putong.live.base.data.BLiveVoiceManagerInvite;
import kotlin.Metadata;
import l.d1q;
import l.e30;
import l.t6c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Ll/ivp;", "Ll/d1q;", "Lcom/p1/mobile/putong/live/livingroom/voice/intl/manager/invite/IntlVoiceLiveManagerInviteItemView;", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceManagerInvite;", "itemInfo", "Ll/e30;", "action", "<init>", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceManagerInvite;Ll/e30;)V", "", "o", "()I", "itemView", "", "H", "(Lcom/p1/mobile/putong/live/livingroom/voice/intl/manager/invite/IntlVoiceLiveManagerInviteItemView;)V", "a", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceManagerInvite;", "getItemInfo", "()Lcom/p1/mobile/putong/live/base/data/BLiveVoiceManagerInvite;", "b", "Ll/e30;", "getAction", "()Ll/e30;", "setAction", "(Ll/e30;)V", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ivp extends d1q<IntlVoiceLiveManagerInviteItemView> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final BLiveVoiceManagerInvite itemInfo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public e30<BLiveVoiceManagerInvite> action;

    public ivp(@NotNull BLiveVoiceManagerInvite bLiveVoiceManagerInvite, @NotNull e30<BLiveVoiceManagerInvite> e30Var) {
        bLiveVoiceManagerInvite.getClass();
        e30Var.getClass();
        this.itemInfo = bLiveVoiceManagerInvite;
        this.action = e30Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void m16770u(@Nullable IntlVoiceLiveManagerInviteItemView itemView) {
        super.u(itemView);
        if (itemView != 0) {
            itemView.m8454k0(this.itemInfo, this.action);
        }
    }

    /* JADX INFO: renamed from: o */
    public int m16769o() {
        return t6c0.Q2;
    }
}
