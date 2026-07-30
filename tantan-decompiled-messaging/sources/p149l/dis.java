package p149l;

import android.text.TextUtils;
import android.util.LruCache;
import com.p046p1.mobile.longlink.msg.intlluckygift.LongLinkIntlLuckyGiftMessage;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTraysPresenter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class dis {

    /* JADX INFO: renamed from: a */
    public kis f86418a = new kis();

    /* JADX INFO: renamed from: b */
    public ArrayList<GiftTrayData> f86419b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public ArrayList<GiftTrayData> f86420c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public ArrayList<GiftTrayData> f86421d = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    public ArrayList<GiftTrayData> f86422e = new ArrayList<>();

    /* JADX INFO: renamed from: f */
    public LruCache<String, LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTray> f86423f = new LruCache<>(10);

    /* JADX INFO: renamed from: l.dis$a */
    public static /* synthetic */ class C16381a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f86424a;

        static {
            int[] iArr = new int[LiveGiftTraysPresenter.TrayType.values().length];
            f86424a = iArr;
            try {
                iArr[LiveGiftTraysPresenter.TrayType.top.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f86424a[LiveGiftTraysPresenter.TrayType.bottom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m111914h(String str, List<GiftTrayData> list, GiftTrayData giftTrayData, int i, kis kisVar) {
        if (i < 0) {
            list.add(giftTrayData);
        } else {
            list.add(i, giftTrayData);
        }
        kisVar.m146130a(giftTrayData);
    }

    /* JADX INFO: renamed from: p */
    public static GiftTrayData m111915p(String str, List<GiftTrayData> list, kis kisVar) {
        GiftTrayData giftTrayDataRemove = list.remove(0);
        kisVar.m146131b(giftTrayDataRemove);
        return giftTrayDataRemove;
    }

    /* JADX INFO: renamed from: d */
    public void m111916d(GiftTrayData giftTrayData) {
        LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTray intlLuckyGiftTrayRemove = this.f86423f.remove(giftTrayData.f50108n);
        if (intlLuckyGiftTrayRemove != null) {
            giftTrayData.m74158F(intlLuckyGiftTrayRemove);
        }
        if (giftTrayData.m74173z() || giftTrayData.m74168u() || (giftTrayData.m74172y() && giftTrayData.f50084N)) {
            m111921j("own", giftTrayData, this.f86419b, this.f86420c);
        } else {
            m111921j("other", giftTrayData, this.f86421d, this.f86422e);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m111917e(final GiftTrayData giftTrayData, ArrayList<GiftTrayData> arrayList) {
        GiftTrayData giftTrayData2 = (GiftTrayData) vwb.m200346r(arrayList, new w9j() { // from class: l.cis
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((GiftTrayData) obj).f50108n.equals(giftTrayData.f50108n));
            }
        });
        if (giftTrayData2 == null) {
            arrayList.add(0, giftTrayData);
        } else {
            giftTrayData2.m74155A(giftTrayData.f50109o);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m111918f(String str, final GiftTrayData giftTrayData, ArrayList<GiftTrayData> arrayList) {
        GiftTrayData giftTrayData2 = (GiftTrayData) vwb.m200346r(arrayList, new w9j() { // from class: l.bis
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((GiftTrayData) obj).f50108n, giftTrayData.f50108n));
            }
        });
        if (giftTrayData2 == null) {
            m111914h(str + "normal", arrayList, giftTrayData, -1, this.f86418a);
            giftTrayData2 = giftTrayData;
        }
        giftTrayData2.m74159c(Integer.valueOf(giftTrayData.f50105k));
    }

    /* JADX INFO: renamed from: g */
    public void m111919g(GiftTrayData giftTrayData) {
        if (giftTrayData.m74167t()) {
            return;
        }
        if (giftTrayData.m74173z()) {
            if (giftTrayData.m74171x()) {
                this.f86419b.add(0, giftTrayData);
                return;
            } else {
                m111917e(giftTrayData, this.f86420c);
                return;
            }
        }
        if (giftTrayData.m74171x()) {
            this.f86421d.add(0, giftTrayData);
        } else {
            m111917e(giftTrayData, this.f86422e);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m111920i() {
        this.f86420c.clear();
        this.f86419b.clear();
        this.f86422e.clear();
        this.f86421d.clear();
        this.f86418a.m146132c();
    }

    /* JADX INFO: renamed from: j */
    public final void m111921j(String str, GiftTrayData giftTrayData, ArrayList<GiftTrayData> arrayList, ArrayList<GiftTrayData> arrayList2) {
        if (!TextUtils.isEmpty(giftTrayData.f50112r) && !TextUtils.isEmpty(giftTrayData.f50113s)) {
            giftTrayData.m74159c(Integer.valueOf(giftTrayData.f50105k));
            m111914h("ownluxury", this.f86419b, giftTrayData, 0, this.f86418a);
            return;
        }
        if (!giftTrayData.m74171x()) {
            if (!vwb.m200296J(arrayList2)) {
                m111918f(str, giftTrayData, arrayList2);
                return;
            }
            giftTrayData.m74159c(Integer.valueOf(giftTrayData.f50105k));
            m111914h(str + "normal", arrayList2, giftTrayData, -1, this.f86418a);
            return;
        }
        giftTrayData.m74159c(Integer.valueOf(giftTrayData.f50105k));
        if (giftTrayData.m74168u()) {
            m111914h(str + "luxury", arrayList, giftTrayData, 0, this.f86418a);
            return;
        }
        if (!giftTrayData.m74172y()) {
            m111914h(str + "luxury", arrayList, giftTrayData, -1, this.f86418a);
            return;
        }
        Long l2 = (Long) giftTrayData.m74164q();
        if (l2 == null || l2.longValue() <= 0) {
            m111914h(str + "luxury", arrayList, giftTrayData, -1, this.f86418a);
            return;
        }
        m111914h(str + "luxury", arrayList, giftTrayData, 0, this.f86418a);
    }

    /* JADX INFO: renamed from: k */
    public aet m111922k() {
        return this.f86418a.m146133d();
    }

    /* JADX INFO: renamed from: l */
    public boolean m111923l() {
        return this.f86420c.isEmpty() && this.f86419b.isEmpty() && this.f86422e.isEmpty() && this.f86421d.isEmpty();
    }

    /* JADX INFO: renamed from: m */
    public boolean m111924m(final LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTray intlLuckyGiftTray, ArrayList<GiftTrayData> arrayList) {
        GiftTrayData giftTrayData;
        if (vwb.m200296J(arrayList) || (giftTrayData = (GiftTrayData) vwb.m200346r(arrayList, new w9j() { // from class: l.ais
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(intlLuckyGiftTray.getComboId(), ((GiftTrayData) obj).f50108n));
            }
        })) == null) {
            return false;
        }
        giftTrayData.m74158F(intlLuckyGiftTray);
        return true;
    }

    /* JADX INFO: renamed from: n */
    public void m111925n(LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTray intlLuckyGiftTray) {
        if (TextUtils.isEmpty(intlLuckyGiftTray.getReward()) || m111924m(intlLuckyGiftTray, this.f86420c) || m111924m(intlLuckyGiftTray, this.f86419b) || m111924m(intlLuckyGiftTray, this.f86422e) || m111924m(intlLuckyGiftTray, this.f86421d)) {
            return;
        }
        this.f86423f.put(intlLuckyGiftTray.getComboId(), intlLuckyGiftTray);
    }

    /* JADX INFO: renamed from: o */
    public GiftTrayData m111926o(LiveGiftTraysPresenter.TrayType trayType) {
        int i = C16381a.f86424a[trayType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            if (!this.f86420c.isEmpty()) {
                return m111915p("ownnormal", this.f86420c, this.f86418a);
            }
            if (!this.f86422e.isEmpty()) {
                return m111915p("othernormal", this.f86422e, this.f86418a);
            }
        } else {
            if (!this.f86419b.isEmpty()) {
                return m111915p("ownluxury", this.f86419b, this.f86418a);
            }
            if (!this.f86421d.isEmpty()) {
                return m111915p("othernormal", this.f86421d, this.f86418a);
            }
            if (!this.f86420c.isEmpty()) {
                return m111915p("ownnormal", this.f86420c, this.f86418a);
            }
            if (!this.f86422e.isEmpty()) {
                return m111915p("othernormal", this.f86422e, this.f86418a);
            }
        }
        return null;
    }
}
