package p153l;

import android.text.TextUtils;
import android.util.Pair;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ReSwipeConfig;
import com.p051p1.mobile.putong.core.data.ReSwipeConvLabelItem;
import com.p051p1.mobile.putong.core.data.ReSwipeConvLabels;
import com.p051p1.mobile.putong.live.base.data.BLiveUnreadTypeEnum;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.util.Iterator;
import java.util.List;
import p137rx.C22421c;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes3.dex */
public class n46 {

    /* JADX INFO: renamed from: e */
    public static volatile n46 f140189e;

    /* JADX INFO: renamed from: f */
    public static final String[] f140190f = {"[微笑]", "[偷笑]", "[星星眼]", "[得意]", "[嘿哈]", "[暗中观察]", "[拥抱]", "[捏脸]", "[偷看]", "[摸锦鲤]", "[在吗]", "[doge]"};

    /* JADX INFO: renamed from: b */
    public ReSwipeConvLabels f140192b;

    /* JADX INFO: renamed from: c */
    public ReSwipeConfig f140193c;

    /* JADX INFO: renamed from: d */
    public C22508b<Pair<String, Boolean>> f140194d = C22508b.m222767b();

    /* JADX INFO: renamed from: a */
    public wyd0 f140191a = new wyd0("conv_label_last_show_" + CoreModule.m30929H().userId(), WeJson.EMPTY_MAP);

    public n46() {
        if (this.f140192b == null) {
            ReSwipeConvLabels reSwipeConvLabelsNew_ = ReSwipeConvLabels.new_();
            this.f140192b = reSwipeConvLabelsNew_;
            this.f140191a.put(reSwipeConvLabelsNew_.toJson());
        }
        try {
            this.f140193c = (ReSwipeConfig) RemoteConfig.m80481x().m80516v("reswipe_config", ReSwipeConfig.JSON_ADAPTER);
        } catch (Exception unused) {
        }
        if (this.f140193c == null) {
            ReSwipeConfig reSwipeConfigNew_ = ReSwipeConfig.new_();
            this.f140193c = reSwipeConfigNew_;
            reSwipeConfigNew_.enable = false;
            reSwipeConfigNew_.expType = "emoji";
            reSwipeConfigNew_.maxLabelCount = 2;
            reSwipeConfigNew_.showHours = 24;
        }
    }

    /* JADX INFO: renamed from: g */
    public static n46 m161541g() {
        if (f140189e == null) {
            synchronized (n46.class) {
                try {
                    if (f140189e == null) {
                        f140189e = new n46();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f140189e;
    }

    /* JADX INFO: renamed from: d */
    public final void m161542d(String str, long j) {
        ReSwipeConvLabelItem reSwipeConvLabelItemNew_ = ReSwipeConvLabelItem.new_();
        reSwipeConvLabelItemNew_.uid = str;
        reSwipeConvLabelItemNew_.expired = j + (((long) this.f140193c.showHours) * 3600000);
        this.f140192b.labelList.add(reSwipeConvLabelItemNew_);
        this.f140191a.put(this.f140192b.toJson());
        this.f140194d.onNext(Pair.create(str, Boolean.TRUE));
    }

    /* JADX INFO: renamed from: e */
    public void m161543e() {
        List<ReSwipeConvLabelItem> list = this.f140192b.labelList;
        if (jyb.m147479J(list)) {
            return;
        }
        for (ReSwipeConvLabelItem reSwipeConvLabelItem : list) {
            if (reSwipeConvLabelItem.expired < pzi0.m174454o()) {
                m161544f(reSwipeConvLabelItem.uid);
                m161543e();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m161544f(String str) {
        ReSwipeConvLabelItem next;
        List<ReSwipeConvLabelItem> list = this.f140192b.labelList;
        if (!jyb.m147479J(list)) {
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
            this.f140191a.put(this.f140192b.toJson());
            this.f140194d.onNext(Pair.create(next.uid, Boolean.FALSE));
        }
    }

    /* JADX INFO: renamed from: h */
    public C22421c<uxj0> m161545h() {
        return this.f140194d.map(new qcj() { // from class: l.k46
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public C22421c<uxj0> m161546i(final String str) {
        return this.f140194d.filter(new qcj() { // from class: l.l46
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Pair pair = (Pair) obj;
                return Boolean.valueOf(TextUtils.equals(str, (CharSequence) pair.first) && !((Boolean) pair.second).booleanValue());
            }
        }).map(new qcj() { // from class: l.m46
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public String m161547j(String str, boolean z) {
        List<ReSwipeConvLabelItem> list = this.f140192b.labelList;
        if (!jyb.m147479J(list)) {
            for (ReSwipeConvLabelItem reSwipeConvLabelItem : list) {
                if (TextUtils.equals(reSwipeConvLabelItem.uid, str)) {
                    long j = reSwipeConvLabelItem.expired / 1000;
                    String[] strArr = f140190f;
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
    public int m161548k() {
        List<ReSwipeConvLabelItem> list = this.f140192b.labelList;
        int i = 0;
        if (!jyb.m147479J(list)) {
            Iterator<ReSwipeConvLabelItem> it = list.iterator();
            while (it.hasNext()) {
                if (pzi0.m174454o() < it.next().expired) {
                    i++;
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: l */
    public boolean m161549l() {
        ReSwipeConfig reSwipeConfig = this.f140193c;
        return reSwipeConfig.enable && TextUtils.equals(reSwipeConfig.expType, "emoji");
    }

    /* JADX INFO: renamed from: m */
    public boolean m161550m() {
        return this.f140193c.enable;
    }

    /* JADX INFO: renamed from: n */
    public boolean m161551n() {
        ReSwipeConfig reSwipeConfig = this.f140193c;
        return reSwipeConfig.enable && TextUtils.equals(reSwipeConfig.expType, BLiveUnreadTypeEnum.redDot);
    }

    /* JADX INFO: renamed from: o */
    public boolean m161552o(String str) {
        List<ReSwipeConvLabelItem> list = this.f140192b.labelList;
        if (jyb.m147479J(list)) {
            return false;
        }
        for (ReSwipeConvLabelItem reSwipeConvLabelItem : list) {
            if (TextUtils.equals(reSwipeConvLabelItem.uid, str) && pzi0.m174454o() < reSwipeConvLabelItem.expired) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public void m161553p(String str, long j) {
        List<ReSwipeConvLabelItem> list = this.f140192b.labelList;
        if (list.size() < this.f140193c.maxLabelCount) {
            m161542d(str, j);
            return;
        }
        if (jyb.m147479J(list)) {
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
            this.f140194d.onNext(Pair.create(reSwipeConvLabelItem.uid, Boolean.FALSE));
        }
        m161542d(str, j);
    }
}
