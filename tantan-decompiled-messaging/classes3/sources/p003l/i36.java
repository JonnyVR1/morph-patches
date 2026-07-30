package p003l;

import android.text.TextUtils;
import android.util.Pair;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ReSwipeConfig;
import com.p1.mobile.putong.core.data.ReSwipeConvLabelItem;
import com.p1.mobile.putong.core.data.ReSwipeConvLabels;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import java.util.Iterator;
import java.util.List;
import l.mqi0;
import l.roj0;
import l.uqd0;
import l.vwb;
import p014rx.C1099c;
import p014rx.subjects.C1186b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class i36 {

    /* JADX INFO: renamed from: e */
    public static volatile i36 f4331e;

    /* JADX INFO: renamed from: f */
    public static final String[] f4332f = {"[微笑]", "[偷笑]", "[星星眼]", "[得意]", "[嘿哈]", "[暗中观察]", "[拥抱]", "[捏脸]", "[偷看]", "[摸锦鲤]", "[在吗]", "[doge]"};

    /* JADX INFO: renamed from: b */
    public ReSwipeConvLabels f4334b;

    /* JADX INFO: renamed from: c */
    public ReSwipeConfig f4335c;

    /* JADX INFO: renamed from: d */
    public C1186b<Pair<String, Boolean>> f4336d = C1186b.m9978b();

    /* JADX INFO: renamed from: a */
    public uqd0 f4333a = new uqd0("conv_label_last_show_" + CoreModule.H().userId(), "{}");

    public i36() {
        if (this.f4334b == null) {
            ReSwipeConvLabels reSwipeConvLabelsNew_ = ReSwipeConvLabels.new_();
            this.f4334b = reSwipeConvLabelsNew_;
            this.f4333a.put(reSwipeConvLabelsNew_.toJson());
        }
        try {
            this.f4335c = (ReSwipeConfig) RemoteConfig.x().v("reswipe_config", ReSwipeConfig.JSON_ADAPTER);
        } catch (Exception unused) {
        }
        if (this.f4335c == null) {
            ReSwipeConfig reSwipeConfigNew_ = ReSwipeConfig.new_();
            this.f4335c = reSwipeConfigNew_;
            reSwipeConfigNew_.enable = false;
            reSwipeConfigNew_.expType = "emoji";
            reSwipeConfigNew_.maxLabelCount = 2;
            reSwipeConfigNew_.showHours = 24;
        }
    }

    /* JADX INFO: renamed from: g */
    public static i36 m5016g() {
        if (f4331e == null) {
            synchronized (i36.class) {
                try {
                    if (f4331e == null) {
                        f4331e = new i36();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f4331e;
    }

    /* JADX INFO: renamed from: d */
    public final void m5017d(String str, long j) {
        ReSwipeConvLabelItem reSwipeConvLabelItemNew_ = ReSwipeConvLabelItem.new_();
        reSwipeConvLabelItemNew_.uid = str;
        reSwipeConvLabelItemNew_.expired = j + (((long) this.f4335c.showHours) * 3600000);
        this.f4334b.labelList.add(reSwipeConvLabelItemNew_);
        this.f4333a.put(this.f4334b.toJson());
        this.f4336d.onNext(Pair.create(str, Boolean.TRUE));
    }

    /* JADX INFO: renamed from: e */
    public void m5018e() {
        List<ReSwipeConvLabelItem> list = this.f4334b.labelList;
        if (vwb.J(list)) {
            return;
        }
        for (ReSwipeConvLabelItem reSwipeConvLabelItem : list) {
            if (reSwipeConvLabelItem.expired < mqi0.o()) {
                m5019f(reSwipeConvLabelItem.uid);
                m5018e();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m5019f(String str) {
        ReSwipeConvLabelItem reSwipeConvLabelItem;
        List list = this.f4334b.labelList;
        if (!vwb.J(list)) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    reSwipeConvLabelItem = null;
                    break;
                }
                reSwipeConvLabelItem = (ReSwipeConvLabelItem) it.next();
                if (TextUtils.equals(reSwipeConvLabelItem.uid, str)) {
                    list.remove(reSwipeConvLabelItem);
                    break;
                }
            }
        } else {
            reSwipeConvLabelItem = null;
            break;
        }
        if (reSwipeConvLabelItem != null) {
            this.f4333a.put(this.f4334b.toJson());
            this.f4336d.onNext(Pair.create(reSwipeConvLabelItem.uid, Boolean.FALSE));
        }
    }

    /* JADX INFO: renamed from: h */
    public C1099c<roj0> m5020h() {
        return this.f4336d.map(new w9j() { // from class: l.f36
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public C1099c<roj0> m5021i(final String str) {
        return this.f4336d.filter(new w9j() { // from class: l.g36
            @Override // p003l.w9j
            public final Object call(Object obj) {
                Pair pair = (Pair) obj;
                return Boolean.valueOf(TextUtils.equals(str, (CharSequence) pair.first) && !((Boolean) pair.second).booleanValue());
            }
        }).map(new w9j() { // from class: l.h36
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public String m5022j(String str, boolean z) {
        List<ReSwipeConvLabelItem> list = this.f4334b.labelList;
        if (!vwb.J(list)) {
            for (ReSwipeConvLabelItem reSwipeConvLabelItem : list) {
                if (TextUtils.equals(reSwipeConvLabelItem.uid, str)) {
                    long j = reSwipeConvLabelItem.expired / 1000;
                    String[] strArr = f4332f;
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
    public int m5023k() {
        List list = this.f4334b.labelList;
        int i = 0;
        if (!vwb.J(list)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (mqi0.o() < ((ReSwipeConvLabelItem) it.next()).expired) {
                    i++;
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: l */
    public boolean m5024l() {
        ReSwipeConfig reSwipeConfig = this.f4335c;
        return reSwipeConfig.enable && TextUtils.equals(reSwipeConfig.expType, "emoji");
    }

    /* JADX INFO: renamed from: m */
    public boolean m5025m() {
        return this.f4335c.enable;
    }

    /* JADX INFO: renamed from: n */
    public boolean m5026n() {
        ReSwipeConfig reSwipeConfig = this.f4335c;
        return reSwipeConfig.enable && TextUtils.equals(reSwipeConfig.expType, "redDot");
    }

    /* JADX INFO: renamed from: o */
    public boolean m5027o(String str) {
        List<ReSwipeConvLabelItem> list = this.f4334b.labelList;
        if (vwb.J(list)) {
            return false;
        }
        for (ReSwipeConvLabelItem reSwipeConvLabelItem : list) {
            if (TextUtils.equals(reSwipeConvLabelItem.uid, str) && mqi0.o() < reSwipeConvLabelItem.expired) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public void m5028p(String str, long j) {
        List list = this.f4334b.labelList;
        if (list.size() < this.f4335c.maxLabelCount) {
            m5017d(str, j);
            return;
        }
        if (vwb.J(list)) {
            return;
        }
        int i = 0;
        long j2 = ((ReSwipeConvLabelItem) list.get(0)).expired;
        for (int i2 = 1; i2 < list.size(); i2++) {
            if (((ReSwipeConvLabelItem) list.get(i2)).expired < j2) {
                i = i2;
            }
        }
        if (i < list.size()) {
            ReSwipeConvLabelItem reSwipeConvLabelItem = (ReSwipeConvLabelItem) list.get(i);
            list.remove(i);
            this.f4336d.onNext(Pair.create(reSwipeConvLabelItem.uid, Boolean.FALSE));
        }
        m5017d(str, j);
    }
}
