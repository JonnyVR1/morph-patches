package p153l;

import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveAddStickerResult;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;

/* JADX INFO: loaded from: classes13.dex */
public class ugd0 extends mr2 {

    /* JADX INFO: renamed from: e */
    public BLiveAddStickerResult f178885e;

    /* JADX INFO: renamed from: f */
    public v5g f178886f;

    /* JADX INFO: renamed from: g */
    public String f178887g;

    public ugd0(User user, BLiveAbsRoom bLiveAbsRoom, BLiveAbsData bLiveAbsData, Followship followship, BLiveAddStickerResult bLiveAddStickerResult) {
        super(user, bLiveAbsRoom, bLiveAbsData, followship);
        this.f178886f = v5g.m199845a();
        this.f178885e = bLiveAddStickerResult;
    }

    /* JADX INFO: renamed from: a */
    public v5g m195898a() {
        return this.f178886f;
    }

    /* JADX INFO: renamed from: b */
    public String m195899b() {
        return this.f178887g;
    }

    /* JADX INFO: renamed from: c */
    public ugd0 m195900c(String str) {
        this.f178887g = str;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public ugd0 m195901d(BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData = bLiveEnvelope.data;
        if (bLiveData != null) {
            this.f178886f = new v5g(bLiveData.fanbases, bLiveData.fanbaseRelations);
        }
        return this;
    }

    /* JADX INFO: renamed from: e */
    public ugd0 m195902e(BLiveEnvelope bLiveEnvelope) {
        if (!jyb.m147479J(bLiveEnvelope.data.relationships)) {
            Relationship relationship = bLiveEnvelope.data.relationships.get(0);
            User user = this.f138291a;
            if (user != null) {
                user.localRelationship = relationship;
            }
        }
        return this;
    }
}
