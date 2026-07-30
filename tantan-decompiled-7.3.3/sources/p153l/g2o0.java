package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveVoiceManagerInvite;
import com.p051p1.mobile.putong.live.livingroom.voice.manager.VoiceLiveManagerInviteItemView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m88121d2 = {"Ll/g2o0;", "Ll/d3q;", "Lcom/p1/mobile/putong/live/livingroom/voice/manager/VoiceLiveManagerInviteItemView;", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceManagerInvite;", "itemInfo", "Ll/y20;", "action", "<init>", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceManagerInvite;Ll/y20;)V", "", "o", "()I", "itemView", "", "H", "(Lcom/p1/mobile/putong/live/livingroom/voice/manager/VoiceLiveManagerInviteItemView;)V", "a", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceManagerInvite;", "getItemInfo", "()Lcom/p1/mobile/putong/live/base/data/BLiveVoiceManagerInvite;", "b", "Ll/y20;", "getAction", "()Ll/y20;", "setAction", "(Ll/y20;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class g2o0 extends d3q<VoiceLiveManagerInviteItemView> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final BLiveVoiceManagerInvite itemInfo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public y20<BLiveVoiceManagerInvite> action;

    public g2o0(@NotNull BLiveVoiceManagerInvite bLiveVoiceManagerInvite, @NotNull y20<BLiveVoiceManagerInvite> y20Var) {
        bLiveVoiceManagerInvite.getClass();
        y20Var.getClass();
        this.itemInfo = bLiveVoiceManagerInvite;
        this.action = y20Var;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo71749u(@Nullable VoiceLiveManagerInviteItemView itemView) {
        super.mo71749u(itemView);
        itemView.getClass();
        itemView.m79778k0(this.itemInfo, false, this.action);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f199299w9;
    }
}
