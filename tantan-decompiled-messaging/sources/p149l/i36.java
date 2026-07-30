package p149l;

import android.text.TextUtils;
import android.util.Pair;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ReSwipeConfig;
import com.p046p1.mobile.putong.core.data.ReSwipeConvLabelItem;
import com.p046p1.mobile.putong.core.data.ReSwipeConvLabels;
import com.p046p1.mobile.putong.live.base.data.BLiveUnreadTypeEnum;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.util.Iterator;
import java.util.List;
import p133rx.C22306c;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes3.dex */
public class i36 {

    /* JADX INFO: renamed from: e */
    public static volatile i36 f110610e;

    /* JADX INFO: renamed from: f */
    public static final String[] f110611f = {"[微笑]", "[偷笑]", "[星星眼]", "[得意]", "[嘿哈]", "[暗中观察]", "[拥抱]", "[捏脸]", "[偷看]", "[摸锦鲤]", "[在吗]", "[doge]"};

    /* JADX INFO: renamed from: b */
    public ReSwipeConvLabels f110613b;

    /* JADX INFO: renamed from: c */
    public ReSwipeConfig f110614c;

    /* JADX INFO: renamed from: d */
    public C22393b<Pair<String, Boolean>> f110615d = C22393b.m221521b();

    /* JADX INFO: renamed from: a */
    public uqd0 f110612a = new uqd0("conv_label_last_show_" + CoreModule.m29931H().userId(), WeJson.EMPTY_MAP);

    public i36() {
        if (this.f110613b == null) {
            ReSwipeConvLabels reSwipeConvLabelsNew_ = ReSwipeConvLabels.new_();
            this.f110613b = reSwipeConvLabelsNew_;
            this.f110612a.put(reSwipeConvLabelsNew_.toJson());
        }
        try {
            this.f110614c = (ReSwipeConfig) RemoteConfig.m79298x().m79333v("reswipe_config", ReSwipeConfig.JSON_ADAPTER);
        } catch (Exception unused) {
        }
        if (this.f110614c == null) {
            ReSwipeConfig reSwipeConfigNew_ = ReSwipeConfig.new_();
            this.f110614c = reSwipeConfigNew_;
            reSwipeConfigNew_.enable = false;
            reSwipeConfigNew_.expType = "emoji";
            reSwipeConfigNew_.maxLabelCount = 2;
            reSwipeConfigNew_.showHours = 24;
        }
    }

    /* JADX INFO: renamed from: g */
    public static i36 m134149g() {
        if (f110610e == null) {
            synchronized (i36.class) {
                try {
                    if (f110610e == null) {
                        f110610e = new i36();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f110610e;
    }

    /* JADX INFO: renamed from: d */
    public final void m134150d(String str, long j) {
        ReSwipeConvLabelItem reSwipeConvLabelItemNew_ = ReSwipeConvLabelItem.new_();
        reSwipeConvLabelItemNew_.uid = str;
        reSwipeConvLabelItemNew_.expired = j + (((long) this.f110614c.showHours) * 3600000);
        this.f110613b.labelList.add(reSwipeConvLabelItemNew_);
        this.f110612a.put(this.f110613b.toJson());
        this.f110615d.m132487l(Pair.create(str, Boolean.TRUE));
    }

    /* JADX INFO: renamed from: e */
    public void m134151e() {
        List<ReSwipeConvLabelItem> list = this.f110613b.labelList;
        if (vwb.m200296J(list)) {
            return;
        }
        for (ReSwipeConvLabelItem reSwipeConvLabelItem : list) {
            if (reSwipeConvLabelItem.expired < mqi0.m155944o()) {
                m134152f(reSwipeConvLabelItem.uid);
                m134151e();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m134152f(String str) {
        ReSwipeConvLabelItem next;
        List<ReSwipeConvLabelItem> list = this.f110613b.labelList;
        if (!vwb.m200296J(list)) {
            Iterator<ReSwipeConvLabelItem> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (TextUtils.equals(next.uid, str)) {
                    list.remove(next);
                    break;
                }
            }
        } else {
            next = null;
            break;
        }
        if (next != null) {
            this.f110612a.put(this.f110613b.toJson());
            this.f110615d.m132487l(Pair.create(next.uid, Boolean.FALSE));
        }
    }

    /* JADX INFO: renamed from: h */
    public C22306c<roj0> m134153h() {
        return this.f110615d.map(new w9j() { // from class: l.f36
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public C22306c<roj0> m134154i(final String str) {
        return this.f110615d.filter(new w9j() { // from class: l.g36
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Pair pair = (Pair) obj;
                return Boolean.valueOf(TextUtils.equals(str, (CharSequence) pair.first) && !((Boolean) pair.second).booleanValue());
            }
        }).map(new w9j() { // from class: l.h36
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public String m134155j(String str, boolean z) {
        List<ReSwipeConvLabelItem> list = this.f110613b.labelList;
        if (!vwb.m200296J(list)) {
            for (ReSwipeConvLabelItem reSwipeConvLabelItem : list) {
                if (TextUtils.equals(reSwipeConvLabelItem.uid, str)) {
                    long j = reSwipeConvLabelItem.expired / 1000;
                    String[] strArr = f110611f;
                    int length = (int) (j % ((long) strArr.length));
                    if (length < 0 || length >= strArr.length) {
                        length = 0;
                    }
                    return strArr[length];
                }
            }
        }
        return z ? "" : "[微笑]";
    }

    /* JADX INFO: renamed from: k */
    public int m134156k() {
        List<ReSwipeConvLabelItem> list = this.f110613b.labelList;
        int i = 0;
        if (!vwb.m200296J(list)) {
            Iterator<ReSwipeConvLabelItem> it = list.iterator();
            while (it.hasNext()) {
                if (mqi0.m155944o() < it.next().expired) {
                    i++;
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: l */
    public boolean m134157l() {
        ReSwipeConfig reSwipeConfig = this.f110614c;
        return reSwipeConfig.enable && TextUtils.equals(reSwipeConfig.expType, "emoji");
    }

    /* JADX INFO: renamed from: m */
    public boolean m134158m() {
        return this.f110614c.enable;
    }

    /* JADX INFO: renamed from: n */
    public boolean m134159n() {
        ReSwipeConfig reSwipeConfig = this.f110614c;
        return reSwipeConfig.enable && TextUtils.equals(reSwipeConfig.expType, BLiveUnreadTypeEnum.redDot);
    }

    /* JADX INFO: renamed from: o */
    public boolean m134160o(String str) {
        List<ReSwipeConvLabelItem> list = this.f110613b.labelList;
        if (vwb.m200296J(list)) {
            return false;
        }
        for (ReSwipeConvLabelItem reSwipeConvLabelItem : list) {
            if (TextUtils.equals(reSwipeConvLabelItem.uid, str) && mqi0.m155944o() < reSwipeConvLabelItem.expired) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public void m134161p(String str, long j) {
        List<ReSwipeConvLabelItem> list = this.f110613b.labelList;
        if (list.size() < this.f110614c.maxLabelCount) {
            m134150d(str, j);
            return;
        }
        if (vwb.m200296J(list)) {
            return;
        }
        int i = 0;
        long j2 = list.get(0).expired;
        for (int i2 = 1; i2 < list.size(); i2++) {
            if (list.get(i2).expired < j2) {
                i = i2;
            }
        }
        if (i < list.size()) {
            ReSwipeConvLabelItem reSwipeConvLabelItem = list.get(i);
            list.remove(i);
            this.f110615d.m132487l(Pair.create(reSwipeConvLabelItem.uid, Boolean.FALSE));
        }
        m134150d(str, j);
    }
}
