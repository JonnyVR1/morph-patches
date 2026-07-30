package p153l;

import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.putong.live.base.bean.UserRightType;
import com.p051p1.mobile.putong.live.base.data.BLiveRightItem;
import com.p051p1.mobile.putong.live.base.data.BLiveRightScrapInfo;

/* JADX INFO: loaded from: classes9.dex */
public abstract class d9d0<V extends View> extends e9d0<V> {

    /* JADX INFO: renamed from: e */
    public BLiveRightItem f85760e;

    /* JADX INFO: renamed from: f */
    public int f85761f;

    /* JADX INFO: renamed from: g */
    public String f85762g;

    /* JADX INFO: renamed from: h */
    public boolean f85763h;

    /* JADX INFO: renamed from: i */
    public j9d0 f85764i;

    /* JADX INFO: renamed from: j */
    public UserRightType f85765j;

    public d9d0(BLiveRightItem bLiveRightItem, int i, String str, boolean z, j9d0 j9d0Var) {
        this.f85760e = bLiveRightItem;
        this.f85761f = i;
        this.f85762g = str;
        this.f85763h = z;
        this.f85764i = j9d0Var;
    }

    /* JADX INFO: renamed from: H */
    public boolean m115011H() {
        return this.f85760e.canActionRight();
    }

    /* JADX INFO: renamed from: I */
    public boolean m115012I() {
        if (this.f85760e.canActive()) {
            return (this.f85763h && TextUtils.isEmpty(this.f85762g)) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: J */
    public boolean m115013J() {
        if (this.f85760e.isEquipped()) {
            return (this.f85763h && TextUtils.isEmpty(this.f85762g)) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: K */
    public boolean m115014K() {
        return !m115018S() && this.f85763h && TextUtils.isEmpty(this.f85762g);
    }

    /* JADX INFO: renamed from: L */
    public boolean m115015L() {
        BLiveRightScrapInfo bLiveRightScrapInfo = this.f85760e.scrapInfo;
        if (bLiveRightScrapInfo == null) {
            return false;
        }
        long j = bLiveRightScrapInfo.remainCount;
        return j >= bLiveRightScrapInfo.craftCost && j > 0 && bLiveRightScrapInfo.stockCount > 0;
    }

    /* JADX INFO: renamed from: N */
    public boolean m115016N() {
        if (this.f92627b) {
            return (this.f85763h && TextUtils.isEmpty(this.f85762g)) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: O */
    public abstract int mo103092O();

    /* JADX INFO: renamed from: P */
    public abstract int mo103093P();

    /* JADX INFO: renamed from: Q */
    public int m115017Q() {
        BLiveRightScrapInfo bLiveRightScrapInfo = this.f85760e.scrapInfo;
        if (bLiveRightScrapInfo == null) {
            return 0;
        }
        return (int) (bLiveRightScrapInfo.craftCost - bLiveRightScrapInfo.remainCount);
    }

    /* JADX INFO: renamed from: R */
    public abstract int mo103094R();

    /* JADX INFO: renamed from: S */
    public boolean m115018S() {
        return this.f85760e.isLocked();
    }

    /* JADX INFO: renamed from: T */
    public boolean m115019T() {
        BLiveRightScrapInfo bLiveRightScrapInfo = this.f85760e.scrapInfo;
        if (bLiveRightScrapInfo == null) {
            return false;
        }
        long j = bLiveRightScrapInfo.remainCount;
        return j >= 0 && j >= bLiveRightScrapInfo.craftCost && bLiveRightScrapInfo.stockCount <= 0;
    }

    /* JADX INFO: renamed from: U */
    public boolean m115020U() {
        BLiveRightScrapInfo bLiveRightScrapInfo = this.f85760e.scrapInfo;
        if (bLiveRightScrapInfo == null) {
            return false;
        }
        long j = bLiveRightScrapInfo.remainCount;
        return j >= 0 && j < bLiveRightScrapInfo.craftCost;
    }
}
