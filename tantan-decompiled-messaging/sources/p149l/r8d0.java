package p149l;

import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveAddStickerResult;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;

/* JADX INFO: loaded from: classes13.dex */
public class r8d0 extends wq2 {

    /* JADX INFO: renamed from: e */
    public BLiveAddStickerResult f158205e;

    /* JADX INFO: renamed from: f */
    public h4g f158206f;

    /* JADX INFO: renamed from: g */
    public String f158207g;

    public r8d0(User user, BLiveAbsRoom bLiveAbsRoom, BLiveAbsData bLiveAbsData, Followship followship, BLiveAddStickerResult bLiveAddStickerResult) {
        super(user, bLiveAbsRoom, bLiveAbsData, followship);
        this.f158206f = h4g.m129236a();
        this.f158205e = bLiveAddStickerResult;
    }

    /* JADX INFO: renamed from: a */
    public h4g m178243a() {
        return this.f158206f;
    }

    /* JADX INFO: renamed from: b */
    public String m178244b() {
        return this.f158207g;
    }

    /* JADX INFO: renamed from: c */
    public r8d0 m178245c(String str) {
        this.f158207g = str;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public r8d0 m178246d(BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData = bLiveEnvelope.data;
        if (bLiveData != null) {
            this.f158206f = new h4g(bLiveData.fanbases, bLiveData.fanbaseRelations);
        }
        return this;
    }

    /* JADX INFO: renamed from: e */
    public r8d0 m178247e(BLiveEnvelope bLiveEnvelope) {
        if (!vwb.m200296J(bLiveEnvelope.data.relationships)) {
            Relationship relationship = bLiveEnvelope.data.relationships.get(0);
            User user = this.f187608a;
            if (user != null) {
                user.localRelationship = relationship;
            }
        }
        return this;
    }
}
