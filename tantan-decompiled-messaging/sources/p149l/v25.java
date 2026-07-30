package p149l;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceVirtualRoomSettleUser;
import com.p046p1.mobile.putong.live.livingroom.virtual.roomInfo.settleList.view.CheckInUserItemView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0012\u0010\u001a¨\u0006\u001b"}, m87232d2 = {"Ll/v25;", "Ll/d1q;", "Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/settleList/view/CheckInUserItemView;", "", FirebaseAnalytics.Param.INDEX, "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceVirtualRoomSettleUser;", "user", "Ll/s7p0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(ILcom/p1/mobile/putong/live/base/data/BLiveVoiceVirtualRoomSettleUser;Ll/s7p0;)V", "o", "()I", "itemView", "", "K", "(Lcom/p1/mobile/putong/live/livingroom/virtual/roomInfo/settleList/view/CheckInUserItemView;)V", "a", "I", "H", "b", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceVirtualRoomSettleUser;", "J", "()Lcom/p1/mobile/putong/live/base/data/BLiveVoiceVirtualRoomSettleUser;", "c", "Ll/s7p0;", "()Ll/s7p0;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class v25 extends d1q<CheckInUserItemView> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int index;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final BLiveVoiceVirtualRoomSettleUser user;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final s7p0 listener;

    public v25(int i, @NotNull BLiveVoiceVirtualRoomSettleUser bLiveVoiceVirtualRoomSettleUser, @NotNull s7p0 s7p0Var) {
        bLiveVoiceVirtualRoomSettleUser.getClass();
        s7p0Var.getClass();
        this.index = i;
        this.user = bLiveVoiceVirtualRoomSettleUser;
        this.listener = s7p0Var;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @NotNull
    /* JADX INFO: renamed from: I, reason: from getter */
    public final s7p0 getListener() {
        return this.listener;
    }

    @NotNull
    /* JADX INFO: renamed from: J, reason: from getter */
    public final BLiveVoiceVirtualRoomSettleUser getUser() {
        return this.user;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo70566u(@NotNull CheckInUserItemView itemView) {
        itemView.getClass();
        super.mo70566u(itemView);
        itemView.m77446v(this);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168322db;
    }
}
