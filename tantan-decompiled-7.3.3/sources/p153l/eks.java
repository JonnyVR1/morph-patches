package p153l;

import android.text.TextUtils;
import android.util.LruCache;
import com.p051p1.mobile.longlink.msg.intlluckygift.LongLinkIntlLuckyGiftMessage;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTraysPresenter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class eks {

    /* JADX INFO: renamed from: a */
    public lks f94426a = new lks();

    /* JADX INFO: renamed from: b */
    public ArrayList<GiftTrayData> f94427b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public ArrayList<GiftTrayData> f94428c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public ArrayList<GiftTrayData> f94429d = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    public ArrayList<GiftTrayData> f94430e = new ArrayList<>();

    /* JADX INFO: renamed from: f */
    public LruCache<String, LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTray> f94431f = new LruCache<>(10);

    /* JADX INFO: renamed from: l.eks$a */
    public static /* synthetic */ class C16790a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f94432a;

        static {
            int[] iArr = new int[LiveGiftTraysPresenter.TrayType.values().length];
            f94432a = iArr;
            try {
                iArr[LiveGiftTraysPresenter.TrayType.top.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f94432a[LiveGiftTraysPresenter.TrayType.bottom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m121071h(String str, List<GiftTrayData> list, GiftTrayData giftTrayData, int i, lks lksVar) {
        if (i < 0) {
            list.add(giftTrayData);
        } else {
            list.add(i, giftTrayData);
        }
        lksVar.m154651a(giftTrayData);
    }

    /* JADX INFO: renamed from: p */
    public static GiftTrayData m121072p(String str, List<GiftTrayData> list, lks lksVar) {
        GiftTrayData giftTrayDataRemove = list.remove(0);
        lksVar.m154652b(giftTrayDataRemove);
        return giftTrayDataRemove;
    }

    /* JADX INFO: renamed from: d */
    public void m121073d(GiftTrayData giftTrayData) {
        LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTray intlLuckyGiftTrayRemove = this.f94431f.remove(giftTrayData.f50956n);
        if (intlLuckyGiftTrayRemove != null) {
            giftTrayData.m75341F(intlLuckyGiftTrayRemove);
        }
        if (giftTrayData.m75356z() || giftTrayData.m75351u() || (giftTrayData.m75355y() && giftTrayData.f50932N)) {
            m121078j("own", giftTrayData, this.f94427b, this.f94428c);
        } else {
            m121078j("other", giftTrayData, this.f94429d, this.f94430e);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m121074e(final GiftTrayData giftTrayData, ArrayList<GiftTrayData> arrayList) {
        GiftTrayData giftTrayData2 = (GiftTrayData) jyb.m147529r(arrayList, new qcj() { // from class: l.dks
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((GiftTrayData) obj).f50956n.equals(giftTrayData.f50956n));
            }
        });
        if (giftTrayData2 == null) {
            arrayList.add(0, giftTrayData);
        } else {
            giftTrayData2.m75338A(giftTrayData.f50957o);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m121075f(String str, final GiftTrayData giftTrayData, ArrayList<GiftTrayData> arrayList) {
        GiftTrayData giftTrayData2 = (GiftTrayData) jyb.m147529r(arrayList, new qcj() { // from class: l.cks
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((GiftTrayData) obj).f50956n, giftTrayData.f50956n));
            }
        });
        if (giftTrayData2 == null) {
            m121071h(str + "normal", arrayList, giftTrayData, -1, this.f94426a);
            giftTrayData2 = giftTrayData;
        }
        giftTrayData2.m75342c(Integer.valueOf(giftTrayData.f50953k));
    }

    /* JADX INFO: renamed from: g */
    public void m121076g(GiftTrayData giftTrayData) {
        if (giftTrayData.m75350t()) {
            return;
        }
        if (giftTrayData.m75356z()) {
            if (giftTrayData.m75354x()) {
                this.f94427b.add(0, giftTrayData);
                return;
            } else {
                m121074e(giftTrayData, this.f94428c);
                return;
            }
        }
        if (giftTrayData.m75354x()) {
            this.f94429d.add(0, giftTrayData);
        } else {
            m121074e(giftTrayData, this.f94430e);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m121077i() {
        this.f94428c.clear();
        this.f94427b.clear();
        this.f94430e.clear();
        this.f94429d.clear();
        this.f94426a.m154653c();
    }

    /* JADX INFO: renamed from: j */
    public final void m121078j(String str, GiftTrayData giftTrayData, ArrayList<GiftTrayData> arrayList, ArrayList<GiftTrayData> arrayList2) {
        if (!TextUtils.isEmpty(giftTrayData.f50960r) && !TextUtils.isEmpty(giftTrayData.f50961s)) {
            giftTrayData.m75342c(Integer.valueOf(giftTrayData.f50953k));
            m121071h("ownluxury", this.f94427b, giftTrayData, 0, this.f94426a);
            return;
        }
        if (!giftTrayData.m75354x()) {
            if (!jyb.m147479J(arrayList2)) {
                m121075f(str, giftTrayData, arrayList2);
                return;
            }
            giftTrayData.m75342c(Integer.valueOf(giftTrayData.f50953k));
            m121071h(str + "normal", arrayList2, giftTrayData, -1, this.f94426a);
            return;
        }
        giftTrayData.m75342c(Integer.valueOf(giftTrayData.f50953k));
        if (giftTrayData.m75351u()) {
            m121071h(str + "luxury", arrayList, giftTrayData, 0, this.f94426a);
            return;
        }
        if (!giftTrayData.m75355y()) {
            m121071h(str + "luxury", arrayList, giftTrayData, -1, this.f94426a);
            return;
        }
        Long l2 = (Long) giftTrayData.m75347q();
        if (l2 == null || l2.longValue() <= 0) {
            m121071h(str + "luxury", arrayList, giftTrayData, -1, this.f94426a);
            return;
        }
        m121071h(str + "luxury", arrayList, giftTrayData, 0, this.f94426a);
    }

    /* JADX INFO: renamed from: k */
    public bgt m121079k() {
        return this.f94426a.m154654d();
    }

    /* JADX INFO: renamed from: l */
    public boolean m121080l() {
        return this.f94428c.isEmpty() && this.f94427b.isEmpty() && this.f94430e.isEmpty() && this.f94429d.isEmpty();
    }

    /* JADX INFO: renamed from: m */
    public boolean m121081m(final LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTray intlLuckyGiftTray, ArrayList<GiftTrayData> arrayList) {
        GiftTrayData giftTrayData;
        if (jyb.m147479J(arrayList) || (giftTrayData = (GiftTrayData) jyb.m147529r(arrayList, new qcj() { // from class: l.bks
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(intlLuckyGiftTray.getComboId(), ((GiftTrayData) obj).f50956n));
            }
        })) == null) {
            return false;
        }
        giftTrayData.m75341F(intlLuckyGiftTray);
        return true;
    }

    /* JADX INFO: renamed from: n */
    public void m121082n(LongLinkIntlLuckyGiftMessage.IntlLuckyGiftTray intlLuckyGiftTray) {
        if (TextUtils.isEmpty(intlLuckyGiftTray.getReward()) || m121081m(intlLuckyGiftTray, this.f94428c) || m121081m(intlLuckyGiftTray, this.f94427b) || m121081m(intlLuckyGiftTray, this.f94430e) || m121081m(intlLuckyGiftTray, this.f94429d)) {
            return;
        }
        this.f94431f.put(intlLuckyGiftTray.getComboId(), intlLuckyGiftTray);
    }

    /* JADX INFO: renamed from: o */
    public GiftTrayData m121083o(LiveGiftTraysPresenter.TrayType trayType) {
        int i = C16790a.f94432a[trayType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            if (!this.f94428c.isEmpty()) {
                return m121072p("ownnormal", this.f94428c, this.f94426a);
            }
            if (!this.f94430e.isEmpty()) {
                return m121072p("othernormal", this.f94430e, this.f94426a);
            }
        } else {
            if (!this.f94427b.isEmpty()) {
                return m121072p("ownluxury", this.f94427b, this.f94426a);
            }
            if (!this.f94429d.isEmpty()) {
                return m121072p("othernormal", this.f94429d, this.f94426a);
            }
            if (!this.f94428c.isEmpty()) {
                return m121072p("ownnormal", this.f94428c, this.f94426a);
            }
            if (!this.f94430e.isEmpty()) {
                return m121072p("othernormal", this.f94430e, this.f94426a);
            }
        }
        return null;
    }
}
