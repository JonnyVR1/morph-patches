package com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.bean;

import android.text.TextUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.live.base.data.BLivePk;
import com.p051p1.mobile.putong.live.base.data.BLivePkBountyResource;
import com.p051p1.mobile.putong.live.base.data.BLivePkBountyWinIndicator;
import com.p051p1.mobile.putong.live.base.data.BLivePkOwner;
import p153l.fhw;
import p153l.jyb;
import p153l.qcj;

/* JADX INFO: loaded from: classes5.dex */
public class PkBountyData {
    private BLivePkOwner anchor;
    private BLivePkBountyResource anchorResource;
    private BLivePkBountyWinIndicator anchorWinIndicator;
    private BLivePkOwner other;

    public PkBountyData(BLivePk bLivePk, final String str) {
        this.anchor = (BLivePkOwner) jyb.m147529r(bLivePk.players, new qcj() { // from class: l.ts70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLivePkOwner) obj).userId, str));
            }
        });
        this.other = (BLivePkOwner) jyb.m147529r(bLivePk.players, new qcj() { // from class: l.us70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.equals(((BLivePkOwner) obj).userId, str));
            }
        });
        BLivePkOwner bLivePkOwner = this.anchor;
        if (bLivePkOwner != null) {
            this.anchorWinIndicator = bLivePkOwner.winIndicator;
            fhw.m125605a("LivePkConstant", "anchorWinIndicator:" + this.anchorWinIndicator.toString());
            this.anchorResource = this.anchor.liveAnimation;
        }
    }

    public double getAnchorBounty() {
        if (this.anchor == null) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        fhw.m125605a("LivePkConstant", "anchor bountyAmount:" + this.anchor.bountyAmount);
        return this.anchor.bountyAmount;
    }

    public BLivePkBountyResource getAnchorResource() {
        return this.anchorResource;
    }

    public BLivePkBountyWinIndicator getAnchorWinIndicator() {
        return this.anchorWinIndicator;
    }

    public double getOtherBounty() {
        if (this.other == null) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        fhw.m125605a("LivePkConstant", "other bountyAmount:" + this.other.bountyAmount);
        return this.other.bountyAmount;
    }
}
