package com.p000p1.mobile.putong.core.newui.home;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.newui.home.cache.CacheCardType;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCardRoot;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.p1.mobile.putong.core.data.CardModel;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.core.data.VirtualCardType;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import l.a;
import l.b1c;
import l.cp60;
import l.d30;
import l.du2;
import l.e30;
import l.e51;
import l.f6c0;
import l.mah0;
import l.qib0;
import l.sb90;
import l.upa;
import l.vwb;
import l.vy8;
import l.x2c0;
import l.zzc0;
import p009l.a5m;
import p009l.az30;
import p009l.d5m;
import p009l.jj4;
import p009l.nt30;
import p009l.oql;
import p009l.vi4;
import p009l.zub;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.c */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0107c extends a<CoreSuggested.UserInfo> {

    /* JADX INFO: renamed from: h */
    public nt30 f1033h;

    /* JADX INFO: renamed from: i */
    public ViewTreeObserverOnGlobalLayoutListenerC0030b f1034i;

    /* JADX INFO: renamed from: k */
    public oql f1036k;

    /* JADX INFO: renamed from: l */
    public String f1037l;

    /* JADX INFO: renamed from: c */
    public final List<CoreSuggested.UserInfo> f1028c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final List<CoreMomentInfo> f1029d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final List<CardModel> f1030e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final Map<String, User> f1031f = new HashMap();

    /* JADX INFO: renamed from: g */
    public final boolean f1032g = false;

    /* JADX INFO: renamed from: j */
    public d30 f1035j = null;

    /* JADX INFO: renamed from: m */
    public NewNewProfileCard.InterfaceC0027d f1038m = new az30();

    public C0107c(nt30 nt30Var, ViewTreeObserverOnGlobalLayoutListenerC0030b viewTreeObserverOnGlobalLayoutListenerC0030b) {
        this.f1033h = nt30Var;
        this.f1034i = viewTreeObserverOnGlobalLayoutListenerC0030b;
    }

    /* JADX INFO: renamed from: G */
    private void m1866G(Media media) {
        if (!NullChecker.a(media) || TEnum.equals(media.status, "raw")) {
            return;
        }
        qib0.G.z0(m1869A(media));
    }

    /* JADX INFO: renamed from: A */
    public final Picture.ImageUri m1869A(Media media) {
        return zub.m25965e(media, "preload");
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m1870B(CoreSuggested.UserInfo userInfo, a5m a5mVar) {
        HomeStatisticsHelper.m652i(userInfo, this.f1034i.m1310q2().pageId());
        a5mVar.getCardData();
        jj4 cardData = a5mVar.getCardData();
        String strPageId = this.f1034i.m1310q2().pageId();
        String str = userInfo.id;
        HomeStatisticsHelper.m661r(cardData, strPageId, str, this.f1033h.m19427g6(str));
        if (userInfo.selectionUser) {
            b1c.m(userInfo.id, "suggest");
        }
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m1871C(List list, List list2, CoreSuggested.UserInfo userInfo) {
        if (m1880M(userInfo)) {
            list.add(userInfo);
            return;
        }
        if (vy8.g() && mah0.y0(userInfo.id)) {
            Map<String, User> map = this.f1031f;
            String str = userInfo.id;
            map.put(str, mah0.r0(str));
            list.add(userInfo);
            return;
        }
        if (!NullChecker.a(CoreModule.c.e0.Pa(userInfo.id))) {
            list2.add(userInfo.id);
            return;
        }
        Map<String, User> map2 = this.f1031f;
        String str2 = userInfo.id;
        map2.put(str2, CoreModule.c.e0.Pa(str2));
        list.add(userInfo);
    }

    /* JADX INFO: renamed from: D */
    public void m1872D() {
        oql oqlVar = this.f1036k;
        if (oqlVar != null) {
            oqlVar.mo1365B(0, 10, 0, "VirtualCard", 0);
        }
    }

    /* JADX INFO: renamed from: E */
    public void m1873E() {
        if (!upa.N3() || getCount() < 4) {
            return;
        }
        CoreSuggested.UserInfo userInfo = (CoreSuggested.UserInfo) getItem(3);
        if (userInfo.isVirtualCard()) {
            return;
        }
        User user = this.f1031f.get(userInfo.id);
        if (NullChecker.a(user)) {
            m1875H(user);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m1874F() {
        if (this.f1031f.size() > 0 && this.f1028c.size() > 0) {
            m1875H(this.f1031f.get(this.f1028c.get(0).id));
        }
        if (this.f1031f.size() <= 1 || this.f1028c.size() <= 0) {
            return;
        }
        m1875H(this.f1031f.get(this.f1028c.get(1).id));
    }

    /* JADX INFO: renamed from: H */
    public final void m1875H(User user) {
        if (user == null) {
            return;
        }
        m1866G(user.media(0));
    }

    /* JADX INFO: renamed from: I */
    public void m1876I(oql oqlVar) {
        this.f1036k = oqlVar;
    }

    /* JADX INFO: renamed from: J */
    public boolean m1877J(CoreSuggested.UserInfo userInfo) {
        if (vwb.J(this.f1028c)) {
            return false;
        }
        Iterator<CoreSuggested.UserInfo> it = this.f1028c.iterator();
        while (it.hasNext()) {
            CoreSuggested.UserInfo next = it.next();
            if (NullChecker.a(next) && (next.equals(userInfo) || ((TextUtils.equals(userInfo.id, next.id) && !userInfo.isVirtualCard()) || (next.isVirtualCard() && userInfo.isVirtualCard() && next.virtualCardType == userInfo.virtualCardType)))) {
                it.remove();
                Objects.toString(next.virtualCardType);
                this.f1028c.size();
                du2.a("BifrostLayout", "删除Adapter数据：" + next.id + " , " + next.virtualCardType + "," + this.f1028c.size());
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: K */
    public void m1878K(List<CoreSuggested.UserInfo> list) {
        this.f1028c.clear();
        this.f1028c.addAll(list);
        m1874F();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: L */
    public void m1879L(d30 d30Var) {
        this.f1035j = d30Var;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m1880M(CoreSuggested.UserInfo userInfo) {
        return userInfo.id.equals("VirtualCard");
    }

    /* JADX INFO: renamed from: N */
    public final void m1881N(a5m a5mVar, ViewTreeObserverOnGlobalLayoutListenerC0030b viewTreeObserverOnGlobalLayoutListenerC0030b) {
        if (NullChecker.a(a5mVar) && NullChecker.a(viewTreeObserverOnGlobalLayoutListenerC0030b) && (a5mVar instanceof d5m)) {
            ((d5m) a5mVar).mo763C0();
            viewTreeObserverOnGlobalLayoutListenerC0030b.m1320r6();
        }
    }

    public int getItemViewType(int i) {
        return 0;
    }

    /* JADX INFO: renamed from: m */
    public View m1883m(ViewGroup viewGroup, int i) {
        View viewMo12115b;
        if (i != 0) {
            return new NewNewProfileCard(this.f1034i.act());
        }
        if (upa.N3()) {
            CacheCardType cacheCardType = CacheCardType.EXPANDED_CARD;
            viewMo12115b = vi4.m23379b(cacheCardType).mo12116c() ? vi4.m23379b(cacheCardType).mo12115b() : null;
            if (viewMo12115b == null) {
                viewMo12115b = this.f1034i.act().inflater().inflate(f6c0.X2, viewGroup, false);
            }
            if (viewMo12115b instanceof UserProfileExpandedCardRoot) {
                ((UserProfileExpandedCardRoot) viewMo12115b).setCardViewBackgroundResource(x2c0.g8);
            }
            return viewMo12115b;
        }
        CacheCardType cacheCardType2 = CacheCardType.DEFAULT_CARD;
        viewMo12115b = vi4.m23379b(cacheCardType2).mo12116c() ? vi4.m23379b(cacheCardType2).mo12115b() : null;
        if (viewMo12115b == null) {
            viewMo12115b = this.f1034i.act().inflater().inflate(vi4.m23379b(cacheCardType2).mo12114a(false), viewGroup, false);
        }
        if (viewMo12115b instanceof NewNewProfileCard) {
            ((NewNewProfileCard) viewMo12115b).setOptStackCard(true);
        }
        return viewMo12115b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void notifyDataSetChanged() {
        super/*android.widget.BaseAdapter*/.notifyDataSetChanged();
        if (NullChecker.a(this.f1035j)) {
            this.f1035j.call();
        }
    }

    /* JADX INFO: renamed from: p */
    public List<CoreSuggested.UserInfo> m1884p() {
        return this.f1028c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void m1882j(View view, final CoreSuggested.UserInfo userInfo, int i, int i2) {
        final a5m a5mVar = (a5m) view;
        if (userInfo != null) {
            userInfo.renderFrom = CardInfoRenderFrom.CARD;
        }
        a5mVar.setPageHelper(this.f1038m);
        a5mVar.mo812U();
        if (IntlCountryCodeController.v()) {
            a5mVar.setUsHomeCardAnimHelper(this.f1034i.m1092A2().getUsHomeCardAnimHelper());
            this.f1034i.m1092A2().mo2806e(1.0f);
        }
        a5mVar.mo891r();
        if (a5mVar.mo759B0(this.f1034i, a5mVar, userInfo, i2)) {
            return;
        }
        User user = this.f1031f.get(userInfo.id);
        if (NullChecker.a(user) && NullChecker.a(userInfo.liveLivingCardDataWrapper)) {
            userInfo.id = "VirtualCard";
            if (userInfo.liveLivingCardDataWrapper.getCurrentLive() != null) {
                userInfo.virtualCardType = VirtualCardType.LiveLivingCard;
            } else {
                userInfo.virtualCardType = VirtualCardType.LiveVoiceCard;
            }
            user = null;
        }
        if (NullChecker.a(user) && !userInfo.isVirtualCard()) {
            if (a5mVar instanceof UserProfileExpandedCardRoot) {
                ((UserProfileExpandedCardRoot) a5mVar).setTwoFingerHelper(this.f1034i.f691Y0);
            }
            if (i2 == 0 && !((Boolean) this.f1033h.f17717y.get()).booleanValue()) {
                this.f1033h.f17715w.onNext(Boolean.valueOf(user.popLevel >= 3));
            }
            cp60 cp60Var = cp60.INSTANCE;
            cp60Var.n(user);
            if (!NullChecker.a(userInfo.coreMomentInfo) || !NullChecker.a(userInfo.cardInfos) || TextUtils.isEmpty(userInfo.cardInfos.momentId) || sb90.c(user)) {
                a5mVar.mo810T(user, userInfo, i2);
                if (upa.N3()) {
                    CoreModule.c.m0.l2.onNext("renderCommonCard");
                }
            } else {
                a5mVar.mo872m(user, userInfo, i2, this.f1034i.m1285l2());
            }
            if (i2 == 0 && cp60Var.k() > 0 && cp60Var.q(user)) {
                m1881N(a5mVar, this.f1034i);
            }
        } else if ("VirtualCard".equals(userInfo.id)) {
            a5mVar.mo802Q(userInfo, this.f1034i.m1310q2(), userInfo.virtualCardType, i2);
        } else {
            CrashHelper.c(new IllegalStateException("card unRender :" + userInfo.id));
        }
        if (i2 == 0) {
            this.f1037l = userInfo.id;
        }
        if (i2 == 0 && this.f1034i.act().lifecycle_() == c.i && ((!TextUtils.equals("VirtualCard", userInfo.id) && !TextUtils.equals(this.f1033h.m19455m5(), userInfo.id)) || (TextUtils.equals("VirtualCard", userInfo.id) && this.f1033h.m19450l5() != userInfo.hashCode()))) {
            if (TextUtils.equals("VirtualCard", userInfo.id)) {
                this.f1033h.m19352Q8(userInfo.hashCode());
            }
            this.f1033h.m19356R8(userInfo.id);
            if (this.f1034i.m1310q2().isHidden()) {
                this.f1033h.m19426g5();
            } else {
                if (zzc0.f0()) {
                    this.f1034i.m1309p6();
                }
                e51.H(this.f1034i.act(), new Runnable() { // from class: l.zy30
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f24047a.m1870B(userInfo, a5mVar);
                    }
                }, 100L);
            }
        }
        if (i2 == 0) {
            a5mVar.setExpandedScrollListener(this.f1036k);
        }
    }

    /* JADX INFO: renamed from: y */
    public List<CoreSuggested.UserInfo> m1886y(List<CoreSuggested.UserInfo> list) {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayListF0 = vwb.f0(new String[0]);
        this.f1031f.clear();
        vwb.z(list, new e30() { // from class: l.bz30
            public final void call(Object obj) {
                this.f10364a.m1871C(arrayList, arrayListF0, (CoreSuggested.UserInfo) obj);
            }
        });
        CoreModule.c.m0.I8(arrayListF0);
        return arrayList;
    }

    /* JADX INFO: renamed from: z */
    public User m1887z(String str) {
        return this.f1031f.get(str);
    }
}
