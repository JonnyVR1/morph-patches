package p149l;

import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.putong.live.base.bean.UserRightType;
import com.p046p1.mobile.putong.live.base.data.BLiveRightItem;
import com.p046p1.mobile.putong.live.base.data.BLiveRightScrapInfo;

/* JADX INFO: loaded from: classes13.dex */
public abstract class a1d0<V extends View> extends b1d0<V> {

    /* JADX INFO: renamed from: e */
    public BLiveRightItem f67173e;

    /* JADX INFO: renamed from: f */
    public int f67174f;

    /* JADX INFO: renamed from: g */
    public String f67175g;

    /* JADX INFO: renamed from: h */
    public boolean f67176h;

    /* JADX INFO: renamed from: i */
    public g1d0 f67177i;

    /* JADX INFO: renamed from: j */
    public UserRightType f67178j;

    public a1d0(BLiveRightItem bLiveRightItem, int i, String str, boolean z, g1d0 g1d0Var) {
        this.f67173e = bLiveRightItem;
        this.f67174f = i;
        this.f67175g = str;
        this.f67176h = z;
        this.f67177i = g1d0Var;
    }

    /* JADX INFO: renamed from: H */
    public boolean m94548H() {
        return this.f67173e.canActionRight();
    }

    /* JADX INFO: renamed from: I */
    public boolean m94549I() {
        if (this.f67173e.canActive()) {
            return (this.f67176h && TextUtils.isEmpty(this.f67175g)) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: J */
    public boolean m94550J() {
        if (this.f67173e.isEquipped()) {
            return (this.f67176h && TextUtils.isEmpty(this.f67175g)) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: K */
    public boolean m94551K() {
        return !m94558S() && this.f67176h && TextUtils.isEmpty(this.f67175g);
    }

    /* JADX INFO: renamed from: L */
    public boolean m94552L() {
        BLiveRightScrapInfo bLiveRightScrapInfo = this.f67173e.scrapInfo;
        if (bLiveRightScrapInfo == null) {
            return false;
        }
        long j = bLiveRightScrapInfo.remainCount;
        return j >= bLiveRightScrapInfo.craftCost && j > 0 && bLiveRightScrapInfo.stockCount > 0;
    }

    /* JADX INFO: renamed from: N */
    public boolean m94553N() {
        if (this.f72585b) {
            return (this.f67176h && TextUtils.isEmpty(this.f67175g)) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: O */
    public abstract int mo94554O();

    /* JADX INFO: renamed from: P */
    public abstract int mo94555P();

    /* JADX INFO: renamed from: Q */
    public int m94556Q() {
        BLiveRightScrapInfo bLiveRightScrapInfo = this.f67173e.scrapInfo;
        if (bLiveRightScrapInfo == null) {
            return 0;
        }
        return (int) (bLiveRightScrapInfo.craftCost - bLiveRightScrapInfo.remainCount);
    }

    /* JADX INFO: renamed from: R */
    public abstract int mo94557R();

    /* JADX INFO: renamed from: S */
    public boolean m94558S() {
        return this.f67173e.isLocked();
    }

    /* JADX INFO: renamed from: T */
    public boolean m94559T() {
        BLiveRightScrapInfo bLiveRightScrapInfo = this.f67173e.scrapInfo;
        if (bLiveRightScrapInfo == null) {
            return false;
        }
        long j = bLiveRightScrapInfo.remainCount;
        return j >= 0 && j >= bLiveRightScrapInfo.craftCost && bLiveRightScrapInfo.stockCount <= 0;
    }

    /* JADX INFO: renamed from: U */
    public boolean m94560U() {
        BLiveRightScrapInfo bLiveRightScrapInfo = this.f67173e.scrapInfo;
        if (bLiveRightScrapInfo == null) {
            return false;
        }
        long j = bLiveRightScrapInfo.remainCount;
        return j >= 0 && j < bLiveRightScrapInfo.craftCost;
    }
}
