package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveVoiceVirtualRoomLevelRight;
import com.p046p1.mobile.putong.live.livingroom.virtual.roomInfo.view.VirtualLevelRightItem;

/* JADX INFO: loaded from: classes5.dex */
public class yrl0 extends d1q<VirtualLevelRightItem> {

    /* JADX INFO: renamed from: a */
    public BLiveVoiceVirtualRoomLevelRight f199687a;

    public yrl0(BLiveVoiceVirtualRoomLevelRight bLiveVoiceVirtualRoomLevelRight) {
        this.f199687a = bLiveVoiceVirtualRoomLevelRight;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo70566u(VirtualLevelRightItem virtualLevelRightItem) {
        super.mo70566u(virtualLevelRightItem);
        virtualLevelRightItem.m77480i0(this.f199687a);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168258Ya;
    }
}
