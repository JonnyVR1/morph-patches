package com.p046p1.mobile.putong.live.livingroom.voice.intl.chatgroup.bean;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceChatGroup;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceChatGroupApply;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/voice/intl/chatgroup/bean/VoiceChatGroupInfo;", "", "voiceChatGroup", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatGroup;", "voicechatGroupApplies", "", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatGroupApply;", "<init>", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatGroup;Ljava/util/List;)V", "getVoiceChatGroup", "()Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatGroup;", "setVoiceChatGroup", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatGroup;)V", "getVoicechatGroupApplies", "()Ljava/util/List;", "setVoicechatGroupApplies", "(Ljava/util/List;)V", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final /* data */ class VoiceChatGroupInfo {

    @NotNull
    private BLiveVoiceChatGroup voiceChatGroup;

    @NotNull
    private List<? extends BLiveVoiceChatGroupApply> voicechatGroupApplies;

    public VoiceChatGroupInfo(@NotNull BLiveVoiceChatGroup bLiveVoiceChatGroup, @NotNull List<? extends BLiveVoiceChatGroupApply> list) {
        bLiveVoiceChatGroup.getClass();
        list.getClass();
        this.voiceChatGroup = bLiveVoiceChatGroup;
        this.voicechatGroupApplies = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VoiceChatGroupInfo copy$default(VoiceChatGroupInfo voiceChatGroupInfo, BLiveVoiceChatGroup bLiveVoiceChatGroup, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            bLiveVoiceChatGroup = voiceChatGroupInfo.voiceChatGroup;
        }
        if ((i & 2) != 0) {
            list = voiceChatGroupInfo.voicechatGroupApplies;
        }
        return voiceChatGroupInfo.copy(bLiveVoiceChatGroup, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BLiveVoiceChatGroup getVoiceChatGroup() {
        return this.voiceChatGroup;
    }

    @NotNull
    public final List<BLiveVoiceChatGroupApply> component2() {
        return this.voicechatGroupApplies;
    }

    @NotNull
    public final VoiceChatGroupInfo copy(@NotNull BLiveVoiceChatGroup voiceChatGroup, @NotNull List<? extends BLiveVoiceChatGroupApply> voicechatGroupApplies) {
        voiceChatGroup.getClass();
        voicechatGroupApplies.getClass();
        return new VoiceChatGroupInfo(voiceChatGroup, voicechatGroupApplies);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoiceChatGroupInfo)) {
            return false;
        }
        VoiceChatGroupInfo voiceChatGroupInfo = (VoiceChatGroupInfo) other;
        return Intrinsics.m87488d(this.voiceChatGroup, voiceChatGroupInfo.voiceChatGroup) && Intrinsics.m87488d(this.voicechatGroupApplies, voiceChatGroupInfo.voicechatGroupApplies);
    }

    @NotNull
    public final BLiveVoiceChatGroup getVoiceChatGroup() {
        return this.voiceChatGroup;
    }

    @NotNull
    public final List<BLiveVoiceChatGroupApply> getVoicechatGroupApplies() {
        return this.voicechatGroupApplies;
    }

    public int hashCode() {
        return (this.voiceChatGroup.hashCode() * 31) + this.voicechatGroupApplies.hashCode();
    }

    public final void setVoiceChatGroup(@NotNull BLiveVoiceChatGroup bLiveVoiceChatGroup) {
        bLiveVoiceChatGroup.getClass();
        this.voiceChatGroup = bLiveVoiceChatGroup;
    }

    public final void setVoicechatGroupApplies(@NotNull List<? extends BLiveVoiceChatGroupApply> list) {
        list.getClass();
        this.voicechatGroupApplies = list;
    }

    @NotNull
    public String toString() {
        return "VoiceChatGroupInfo(voiceChatGroup=" + this.voiceChatGroup + ", voicechatGroupApplies=" + this.voicechatGroupApplies + ")";
    }
}
