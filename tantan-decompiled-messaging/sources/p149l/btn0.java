package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveVoiceManagerInvite;
import com.p046p1.mobile.putong.live.livingroom.voice.manager.VoiceLiveManagerInviteItemView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m87232d2 = {"Ll/btn0;", "Ll/d1q;", "Lcom/p1/mobile/putong/live/livingroom/voice/manager/VoiceLiveManagerInviteItemView;", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceManagerInvite;", "itemInfo", "Ll/e30;", "action", "<init>", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceManagerInvite;Ll/e30;)V", "", "o", "()I", "itemView", "", "H", "(Lcom/p1/mobile/putong/live/livingroom/voice/manager/VoiceLiveManagerInviteItemView;)V", "a", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceManagerInvite;", "getItemInfo", "()Lcom/p1/mobile/putong/live/base/data/BLiveVoiceManagerInvite;", "b", "Ll/e30;", "getAction", "()Ll/e30;", "setAction", "(Ll/e30;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class btn0 extends d1q<VoiceLiveManagerInviteItemView> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final BLiveVoiceManagerInvite itemInfo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public e30<BLiveVoiceManagerInvite> action;

    public btn0(@NotNull BLiveVoiceManagerInvite bLiveVoiceManagerInvite, @NotNull e30<BLiveVoiceManagerInvite> e30Var) {
        bLiveVoiceManagerInvite.getClass();
        e30Var.getClass();
        this.itemInfo = bLiveVoiceManagerInvite;
        this.action = e30Var;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo70566u(@Nullable VoiceLiveManagerInviteItemView itemView) {
        super.mo70566u(itemView);
        itemView.getClass();
        itemView.m78595k0(this.itemInfo, true, this.action);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168567w9;
    }
}
