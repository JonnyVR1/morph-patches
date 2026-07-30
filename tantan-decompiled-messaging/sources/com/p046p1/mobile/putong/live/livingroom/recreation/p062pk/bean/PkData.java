package com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.bean;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLivePk;
import com.p046p1.mobile.putong.live.base.data.BLivePkCategory;
import com.p046p1.mobile.putong.live.base.data.BLivePkContributor;
import com.p046p1.mobile.putong.live.base.data.BLivePkOwner;
import com.p046p1.mobile.putong.live.base.data.BLivePkStage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p149l.e30;
import p149l.vwb;
import p149l.w9j;

/* JADX INFO: loaded from: classes5.dex */
public class PkData {
    private final String anchorId;
    private boolean isOnceMore;
    public BLivePkStage lastState;
    private List<BLivePkContributor> mHostContributors;
    private List<BLivePkContributor> mOtherContributors;
    private final BLivePkOwner otherUser;

    /* JADX INFO: renamed from: pk */
    public BLivePk f51567pk;
    private PkBountyData pkBountyData;
    public PkWinTimesData pkWinTimesData;
    public boolean showWinTimesTag = false;
    public BLivePkStage state;
    private List<User> users;

    public PkData(BLivePk bLivePk, List<User> list, User user) {
        this.f51567pk = bLivePk;
        this.lastState = this.state;
        this.state = bLivePk.situation.currentStageInfo.stage;
        this.users = list;
        if (user == null) {
            this.anchorId = "";
            this.otherUser = BLivePkOwner.new_();
        } else {
            this.anchorId = user.f56011id;
            this.otherUser = (BLivePkOwner) vwb.m200346r(bLivePk.players, new w9j() { // from class: l.hm70
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f108396a.lambda$new$0((BLivePkOwner) obj);
                }
            });
        }
        updateContributors();
        updatePkWinTimes();
        this.pkBountyData = new PkBountyData(this.f51567pk, this.anchorId);
    }

    private String contributions(List<BLivePkContributor> list) {
        if (list == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator<BLivePkContributor> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toJson());
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$new$0(BLivePkOwner bLivePkOwner) {
        return Boolean.valueOf(!TextUtils.equals(bLivePkOwner.userId, this.anchorId));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$otherUser$3(User user) {
        return Boolean.valueOf(TextUtils.equals(user.f56011id, this.otherUser.userId));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateContributors$1(BLivePkContributor bLivePkContributor) {
        User user = getUser(bLivePkContributor.userId);
        bLivePkContributor.image = user.m60124fp().profileSmall().base;
        bLivePkContributor.name = user.name;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateContributors$2(BLivePkContributor bLivePkContributor) {
        User user = getUser(bLivePkContributor.userId);
        bLivePkContributor.image = user.m60124fp().profileSmall().base;
        bLivePkContributor.name = user.name;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updatePkWinTimes$5(BLivePkOwner bLivePkOwner) {
        boolean zEquals = TextUtils.equals(bLivePkOwner.userId, this.anchorId);
        PkWinTimesData pkWinTimesData = this.pkWinTimesData;
        if (zEquals) {
            pkWinTimesData.setAnchorWinTimes(bLivePkOwner.winTimes);
        } else {
            pkWinTimesData.setOtherWinTimes(bLivePkOwner.winTimes);
        }
    }

    private void updateContributors() {
        if (vwb.m200296J(this.f51567pk.players) || this.f51567pk.players.size() < 2) {
            this.mHostContributors = new ArrayList();
            this.mOtherContributors = new ArrayList();
            return;
        }
        BLivePkOwner bLivePkOwner = this.f51567pk.players.get(0);
        if (TextUtils.equals(bLivePkOwner.userId, this.anchorId)) {
            this.mHostContributors = bLivePkOwner.contributors;
            this.mOtherContributors = this.f51567pk.players.get(1).contributors;
        } else {
            this.mHostContributors = this.f51567pk.players.get(1).contributors;
            this.mOtherContributors = bLivePkOwner.contributors;
        }
        vwb.m200354z(this.mHostContributors, new e30() { // from class: l.im70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f113901a.lambda$updateContributors$1((BLivePkContributor) obj);
            }
        });
        vwb.m200354z(this.mOtherContributors, new e30() { // from class: l.jm70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f118618a.lambda$updateContributors$2((BLivePkContributor) obj);
            }
        });
    }

    public String getAnchorId() {
        return this.anchorId;
    }

    public long getAnchorWinTimes() {
        PkWinTimesData pkWinTimesData = this.pkWinTimesData;
        if (pkWinTimesData != null) {
            return pkWinTimesData.getAnchorWinTimes();
        }
        return 0L;
    }

    public List<BLivePkContributor> getHostContributors() {
        return this.mHostContributors;
    }

    public List<BLivePkContributor> getOtherContributors() {
        return this.mOtherContributors;
    }

    public long getOtherWinTimes() {
        PkWinTimesData pkWinTimesData = this.pkWinTimesData;
        if (pkWinTimesData != null) {
            return pkWinTimesData.getOtherWinTimes();
        }
        return 0L;
    }

    public PkBountyData getPkBountyData() {
        return this.pkBountyData;
    }

    public User getUser(final String str) {
        return (User) vwb.m200346r(this.users, new w9j() { // from class: l.fm70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((User) obj).f56011id, str));
            }
        });
    }

    public boolean isBountyPk() {
        return TEnum.equals(this.f51567pk.categoryV2, BLivePkCategory.bounty);
    }

    public boolean isEnded() {
        return TEnum.equals(this.state, "ended");
    }

    public boolean isOnceMore() {
        return this.isOnceMore;
    }

    public boolean isPking() {
        return (TEnum.equals(this.state, "ended") || TEnum.equals(this.state, "unknown_")) ? false : true;
    }

    public boolean isPlaying() {
        return TEnum.equals(this.state, "playing");
    }

    public boolean isPreparing() {
        return TEnum.equals(this.state, "preparing");
    }

    public boolean isPunishing() {
        return TEnum.equals(this.state, BLivePkStage.punishing);
    }

    public boolean isRandom() {
        return TEnum.equals(this.f51567pk.categoryV2, BLivePkCategory.random);
    }

    public boolean isRankPk() {
        return TEnum.equals(this.f51567pk.categoryV2, BLivePkCategory.rank);
    }

    public boolean isSameStatus(PkData pkData) {
        return pkData != null && TEnum.equals(this.state, pkData.state) && TextUtils.equals(this.f51567pk.f44421id, pkData.f51567pk.f44421id);
    }

    public Boolean isTargetState(BLivePkStage bLivePkStage) {
        BLivePkStage bLivePkStage2 = this.state;
        return Boolean.valueOf((bLivePkStage2 == null || TEnum.equals(bLivePkStage2, "unknown_") || this.state.ordinal() <= bLivePkStage.ordinal()) ? false : true);
    }

    public boolean isUnknown() {
        return TEnum.equals(this.state, "unknown_");
    }

    public boolean lastStateIsPlaying() {
        return TEnum.equals(this.lastState, "playing");
    }

    public User otherUser() {
        return (User) vwb.m200346r(this.users, new w9j() { // from class: l.km70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f123739a.lambda$otherUser$3((User) obj);
            }
        });
    }

    public String otherUserId() {
        return this.otherUser.userId;
    }

    public PkData setOnceMore(boolean z) {
        this.isOnceMore = z;
        return this;
    }

    public String toString() {
        return hashCode() + "PkData{users=" + this.users.size() + ", pk=" + this.f51567pk + ", otherUser='" + this.otherUser + "', anchorId='" + this.anchorId + "', state=" + this.state + ", lastState=" + this.lastState + ", isOnceMore=" + this.isOnceMore + ", mHostContributors=" + contributions(this.mHostContributors) + ", mOtherContributors=" + contributions(this.mOtherContributors) + '}';
    }

    public PkData updatePk(BLivePk bLivePk) {
        if (bLivePk != null) {
            this.f51567pk = bLivePk;
        }
        return this;
    }

    public void updatePkWinTimes() {
        if (this.pkWinTimesData == null) {
            this.pkWinTimesData = new PkWinTimesData();
        }
        BLivePk bLivePk = this.f51567pk;
        this.showWinTimesTag = bLivePk.showWinTimesTag;
        vwb.m200354z(bLivePk.players, new e30() { // from class: l.gm70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f103427a.lambda$updatePkWinTimes$5((BLivePkOwner) obj);
            }
        });
    }

    public PkData(BLivePkStage bLivePkStage) {
        this.state = bLivePkStage;
        this.lastState = bLivePkStage;
        BLivePk bLivePkNew_ = BLivePk.new_();
        this.f51567pk = bLivePkNew_;
        bLivePkNew_.f44421id = "-991";
        this.anchorId = "";
        this.otherUser = BLivePkOwner.new_();
        this.users = new ArrayList();
        this.pkBountyData = new PkBountyData(this.f51567pk, "");
    }
}
