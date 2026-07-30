package p002l;

import android.text.TextUtils;
import android.util.LruCache;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTraysPresenter;
import com.p1.mobile.longlink.msg.intlluckygift.LongLinkIntlLuckyGiftMessage;
import java.util.ArrayList;
import java.util.List;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class dis {

    /* JADX INFO: renamed from: a */
    public kis f9296a = new kis();

    /* JADX INFO: renamed from: b */
    public ArrayList<GiftTrayData> f9297b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public ArrayList<GiftTrayData> f9298c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public ArrayList<GiftTrayData> f9299d = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    public ArrayList<GiftTrayData> f9300e = new ArrayList<>();

    /* JADX INFO: renamed from: f */
    public LruCache<String, LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTray> f9301f = new LruCache<>(10);

    /* JADX INFO: renamed from: l.dis$a */
    public static /* synthetic */ class C0532a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f9302a;

        static {
            int[] iArr = new int[LiveGiftTraysPresenter.TrayType.values().length];
            f9302a = iArr;
            try {
                iArr[LiveGiftTraysPresenter.TrayType.top.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9302a[LiveGiftTraysPresenter.TrayType.bottom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m11909h(String str, List<GiftTrayData> list, GiftTrayData giftTrayData, int i, kis kisVar) {
        if (i < 0) {
            list.add(giftTrayData);
        } else {
            list.add(i, giftTrayData);
        }
        kisVar.m16635a(giftTrayData);
    }

    /* JADX INFO: renamed from: p */
    public static GiftTrayData m11910p(String str, List<GiftTrayData> list, kis kisVar) {
        GiftTrayData giftTrayDataRemove = list.remove(0);
        kisVar.m16636b(giftTrayDataRemove);
        return giftTrayDataRemove;
    }

    /* JADX INFO: renamed from: d */
    public void m11911d(GiftTrayData giftTrayData) {
        LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTray intlLuckyGiftTrayRemove = this.f9301f.remove(giftTrayData.f6150n);
        if (intlLuckyGiftTrayRemove != null) {
            giftTrayData.m7723F(intlLuckyGiftTrayRemove);
        }
        if (giftTrayData.m7738z() || giftTrayData.m7733u() || (giftTrayData.m7737y() && giftTrayData.f6126N)) {
            m11916j("own", giftTrayData, this.f9297b, this.f9298c);
        } else {
            m11916j(LiveMessage.LiveMessageType.OTHER, giftTrayData, this.f9299d, this.f9300e);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m11912e(final GiftTrayData giftTrayData, ArrayList<GiftTrayData> arrayList) {
        GiftTrayData giftTrayData2 = (GiftTrayData) vwb.r(arrayList, new w9j() { // from class: l.cis
            public final Object call(Object obj) {
                return Boolean.valueOf(((GiftTrayData) obj).f6150n.equals(giftTrayData.f6150n));
            }
        });
        if (giftTrayData2 == null) {
            arrayList.add(0, giftTrayData);
        } else {
            giftTrayData2.m7720A(giftTrayData.f6151o);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m11913f(String str, final GiftTrayData giftTrayData, ArrayList<GiftTrayData> arrayList) {
        GiftTrayData giftTrayData2 = (GiftTrayData) vwb.r(arrayList, new w9j() { // from class: l.bis
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((GiftTrayData) obj).f6150n, giftTrayData.f6150n));
            }
        });
        if (giftTrayData2 == null) {
            m11909h(str + "normal", arrayList, giftTrayData, -1, this.f9296a);
            giftTrayData2 = giftTrayData;
        }
        giftTrayData2.m7724c(Integer.valueOf(giftTrayData.f6147k));
    }

    /* JADX INFO: renamed from: g */
    public void m11914g(GiftTrayData giftTrayData) {
        if (giftTrayData.m7732t()) {
            return;
        }
        if (giftTrayData.m7738z()) {
            if (giftTrayData.m7736x()) {
                this.f9297b.add(0, giftTrayData);
                return;
            } else {
                m11912e(giftTrayData, this.f9298c);
                return;
            }
        }
        if (giftTrayData.m7736x()) {
            this.f9299d.add(0, giftTrayData);
        } else {
            m11912e(giftTrayData, this.f9300e);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m11915i() {
        this.f9298c.clear();
        this.f9297b.clear();
        this.f9300e.clear();
        this.f9299d.clear();
        this.f9296a.m16637c();
    }

    /* JADX INFO: renamed from: j */
    public final void m11916j(String str, GiftTrayData giftTrayData, ArrayList<GiftTrayData> arrayList, ArrayList<GiftTrayData> arrayList2) {
        if (!TextUtils.isEmpty(giftTrayData.f6154r) && !TextUtils.isEmpty(giftTrayData.f6155s)) {
            giftTrayData.m7724c(Integer.valueOf(giftTrayData.f6147k));
            m11909h("ownluxury", this.f9297b, giftTrayData, 0, this.f9296a);
            return;
        }
        if (!giftTrayData.m7736x()) {
            if (!vwb.J(arrayList2)) {
                m11913f(str, giftTrayData, arrayList2);
                return;
            }
            giftTrayData.m7724c(Integer.valueOf(giftTrayData.f6147k));
            m11909h(str + "normal", arrayList2, giftTrayData, -1, this.f9296a);
            return;
        }
        giftTrayData.m7724c(Integer.valueOf(giftTrayData.f6147k));
        if (giftTrayData.m7733u()) {
            m11909h(str + "luxury", arrayList, giftTrayData, 0, this.f9296a);
            return;
        }
        if (!giftTrayData.m7737y()) {
            m11909h(str + "luxury", arrayList, giftTrayData, -1, this.f9296a);
            return;
        }
        Long l2 = (Long) giftTrayData.m7729q();
        if (l2 == null || l2.longValue() <= 0) {
            m11909h(str + "luxury", arrayList, giftTrayData, -1, this.f9296a);
            return;
        }
        m11909h(str + "luxury", arrayList, giftTrayData, 0, this.f9296a);
    }

    /* JADX INFO: renamed from: k */
    public aet m11917k() {
        return this.f9296a.m16638d();
    }

    /* JADX INFO: renamed from: l */
    public boolean m11918l() {
        return this.f9298c.isEmpty() && this.f9297b.isEmpty() && this.f9300e.isEmpty() && this.f9299d.isEmpty();
    }

    /* JADX INFO: renamed from: m */
    public boolean m11919m(final LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTray intlLuckyGiftTray, ArrayList<GiftTrayData> arrayList) {
        GiftTrayData giftTrayData;
        if (vwb.J(arrayList) || (giftTrayData = (GiftTrayData) vwb.r(arrayList, new w9j() { // from class: l.ais
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(intlLuckyGiftTray.getComboId(), ((GiftTrayData) obj).f6150n));
            }
        })) == null) {
            return false;
        }
        giftTrayData.m7723F(intlLuckyGiftTray);
        return true;
    }

    /* JADX INFO: renamed from: n */
    public void m11920n(LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTray intlLuckyGiftTray) {
        if (TextUtils.isEmpty(intlLuckyGiftTray.getReward()) || m11919m(intlLuckyGiftTray, this.f9298c) || m11919m(intlLuckyGiftTray, this.f9297b) || m11919m(intlLuckyGiftTray, this.f9300e) || m11919m(intlLuckyGiftTray, this.f9299d)) {
            return;
        }
        this.f9301f.put(intlLuckyGiftTray.getComboId(), intlLuckyGiftTray);
    }

    /* JADX INFO: renamed from: o */
    public GiftTrayData m11921o(LiveGiftTraysPresenter.TrayType trayType) {
        int i = C0532a.f9302a[trayType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            if (!this.f9298c.isEmpty()) {
                return m11910p("ownnormal", this.f9298c, this.f9296a);
            }
            if (!this.f9300e.isEmpty()) {
                return m11910p("othernormal", this.f9300e, this.f9296a);
            }
        } else {
            if (!this.f9297b.isEmpty()) {
                return m11910p("ownluxury", this.f9297b, this.f9296a);
            }
            if (!this.f9299d.isEmpty()) {
                return m11910p("othernormal", this.f9299d, this.f9296a);
            }
            if (!this.f9298c.isEmpty()) {
                return m11910p("ownnormal", this.f9298c, this.f9296a);
            }
            if (!this.f9300e.isEmpty()) {
                return m11910p("othernormal", this.f9300e, this.f9296a);
            }
        }
        return null;
    }
}
