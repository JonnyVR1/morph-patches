package com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.bean;

import android.text.TextUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.live.base.data.BLivePk;
import com.p046p1.mobile.putong.live.base.data.BLivePkBountyResource;
import com.p046p1.mobile.putong.live.base.data.BLivePkBountyWinIndicator;
import com.p046p1.mobile.putong.live.base.data.BLivePkOwner;
import p149l.hfw;
import p149l.vwb;
import p149l.w9j;

/* JADX INFO: loaded from: classes5.dex */
public class PkBountyData {
    private BLivePkOwner anchor;
    private BLivePkBountyResource anchorResource;
    private BLivePkBountyWinIndicator anchorWinIndicator;
    private BLivePkOwner other;

    public PkBountyData(BLivePk bLivePk, final String str) {
        this.anchor = (BLivePkOwner) vwb.m200346r(bLivePk.players, new w9j() { // from class: l.nk70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLivePkOwner) obj).userId, str));
            }
        });
        this.other = (BLivePkOwner) vwb.m200346r(bLivePk.players, new w9j() { // from class: l.ok70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.equals(((BLivePkOwner) obj).userId, str));
            }
        });
        BLivePkOwner bLivePkOwner = this.anchor;
        if (bLivePkOwner != null) {
            this.anchorWinIndicator = bLivePkOwner.winIndicator;
            hfw.m130790a("LivePkConstant", "anchorWinIndicator:" + this.anchorWinIndicator.toString());
            this.anchorResource = this.anchor.liveAnimation;
        }
    }

    public double getAnchorBounty() {
        if (this.anchor == null) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        hfw.m130790a("LivePkConstant", "anchor bountyAmount:" + this.anchor.bountyAmount);
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
        hfw.m130790a("LivePkConstant", "other bountyAmount:" + this.other.bountyAmount);
        return this.other.bountyAmount;
    }
}
