package com.p051p1.mobile.putong.core.newui.home;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.p051p1.mobile.putong.core.data.CardModel;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.newui.home.cache.CacheCardType;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCardRoot;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p153l.AbstractC15610a;
import p153l.atl;
import p153l.b240;
import p153l.c8d0;
import p153l.d09;
import p153l.dbc0;
import p153l.gra;
import p153l.ik4;
import p153l.ix60;
import p153l.jyb;
import p153l.kec0;
import p153l.l51;
import p153l.nwb;
import p153l.o2c;
import p153l.o740;
import p153l.q7m;
import p153l.t7m;
import p153l.tu2;
import p153l.uih0;
import p153l.uj4;
import p153l.uqb0;
import p153l.wj90;
import p153l.x20;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.c */
/* JADX INFO: loaded from: classes11.dex */
public class C8094c extends AbstractC15610a<CoreSuggested.UserInfo> {

    /* JADX INFO: renamed from: h */
    public b240 f22997h;

    /* JADX INFO: renamed from: i */
    public ViewTreeObserverOnGlobalLayoutListenerC8017b f22998i;

    /* JADX INFO: renamed from: k */
    public atl f23000k;

    /* JADX INFO: renamed from: l */
    public String f23001l;

    /* JADX INFO: renamed from: c */
    public final List<CoreSuggested.UserInfo> f22992c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final List<CoreMomentInfo> f22993d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final List<CardModel> f22994e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final Map<String, User> f22995f = new HashMap();

    /* JADX INFO: renamed from: g */
    public final boolean f22996g = false;

    /* JADX INFO: renamed from: j */
    public x20 f22999j = null;

    /* JADX INFO: renamed from: m */
    public NewNewProfileCard.InterfaceC8014d f23002m = new o740();

    public C8094c(b240 b240Var, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        this.f22997h = b240Var;
        this.f22998i = viewTreeObserverOnGlobalLayoutListenerC8017b;
    }

    /* JADX INFO: renamed from: G */
    private void m38898G(Media media) {
        if (!NullChecker.m82486a(media) || TEnum.equals(media.status, "raw")) {
            return;
        }
        uqb0.f180374G.m127162z0(m38901A(media));
    }

    /* JADX INFO: renamed from: A */
    public final Picture.ImageUri m38901A(Media media) {
        return nwb.m164967e(media, "preload");
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m38902B(CoreSuggested.UserInfo userInfo, q7m q7mVar) {
        HomeStatisticsHelper.m37706i(userInfo, this.f22998i.m38344q2().pageId());
        q7mVar.getCardData();
        ik4 cardData = q7mVar.getCardData();
        String strPageId = this.f22998i.m38344q2().pageId();
        String str = userInfo.f20214id;
        HomeStatisticsHelper.m37715r(cardData, strPageId, str, this.f22997h.m102015g6(str));
        if (userInfo.selectionUser) {
            o2c.m165715m(userInfo.f20214id, "suggest");
        }
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m38903C(List list, List list2, CoreSuggested.UserInfo userInfo) {
        if (m38912M(userInfo)) {
            list.add(userInfo);
            return;
        }
        if (d09.m113370g() && uih0.m196232y0(userInfo.f20214id)) {
            Map<String, User> map = this.f22995f;
            String str = userInfo.f20214id;
            map.put(str, uih0.m196221r0(str));
            list.add(userInfo);
            return;
        }
        if (!NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116503Pa(userInfo.f20214id))) {
            list2.add(userInfo.f20214id);
            return;
        }
        Map<String, User> map2 = this.f22995f;
        String str2 = userInfo.f20214id;
        map2.put(str2, CoreModule.f18264c.f20381e0.m116503Pa(str2));
        list.add(userInfo);
    }

    /* JADX INFO: renamed from: D */
    public void m38904D() {
        atl atlVar = this.f23000k;
        if (atlVar != null) {
            atlVar.mo38399B(0, 10, 0, CoreSuggested.UserInfo.VIRTUAL_CARD, 0);
        }
    }

    /* JADX INFO: renamed from: E */
    public void m38905E() {
        if (!gra.m131606N3() || getCount() < 4) {
            return;
        }
        CoreSuggested.UserInfo item = getItem(3);
        if (item.isVirtualCard()) {
            return;
        }
        User user = this.f22995f.get(item.f20214id);
        if (NullChecker.m82486a(user)) {
            m38907H(user);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m38906F() {
        if (this.f22995f.size() > 0 && this.f22992c.size() > 0) {
            m38907H(this.f22995f.get(this.f22992c.get(0).f20214id));
        }
        if (this.f22995f.size() <= 1 || this.f22992c.size() <= 0) {
            return;
        }
        m38907H(this.f22995f.get(this.f22992c.get(1).f20214id));
    }

    /* JADX INFO: renamed from: H */
    public final void m38907H(User user) {
        if (user == null) {
            return;
        }
        m38898G(user.media(0));
    }

    /* JADX INFO: renamed from: I */
    public void m38908I(atl atlVar) {
        this.f23000k = atlVar;
    }

    /* JADX INFO: renamed from: J */
    public boolean m38909J(CoreSuggested.UserInfo userInfo) {
        if (jyb.m147479J(this.f22992c)) {
            return false;
        }
        Iterator<CoreSuggested.UserInfo> it = this.f22992c.iterator();
        while (it.hasNext()) {
            CoreSuggested.UserInfo next = it.next();
            if (NullChecker.m82486a(next) && (next.equals(userInfo) || ((TextUtils.equals(userInfo.f20214id, next.f20214id) && !userInfo.isVirtualCard()) || (next.isVirtualCard() && userInfo.isVirtualCard() && next.virtualCardType == userInfo.virtualCardType)))) {
                it.remove();
                Objects.toString(next.virtualCardType);
                this.f22992c.size();
                tu2.m192703a("BifrostLayout", "删除Adapter数据：" + next.f20214id + " , " + next.virtualCardType + Constants.SEPARATOR_COMMA + this.f22992c.size());
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: K */
    public void m38910K(List<CoreSuggested.UserInfo> list) {
        this.f22992c.clear();
        this.f22992c.addAll(list);
        m38906F();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: L */
    public void m38911L(x20 x20Var) {
        this.f22999j = x20Var;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m38912M(CoreSuggested.UserInfo userInfo) {
        return userInfo.f20214id.equals(CoreSuggested.UserInfo.VIRTUAL_CARD);
    }

    /* JADX INFO: renamed from: N */
    public final void m38913N(q7m q7mVar, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b) {
        if (NullChecker.m82486a(q7mVar) && NullChecker.m82486a(viewTreeObserverOnGlobalLayoutListenerC8017b) && (q7mVar instanceof t7m)) {
            ((t7m) q7mVar).mo37810C0();
            viewTreeObserverOnGlobalLayoutListenerC8017b.m38354r6();
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        return 0;
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: m */
    public View mo21402m(ViewGroup viewGroup, int i) {
        View viewMo136049b;
        if (i != 0) {
            return new NewNewProfileCard(this.f22998i.act());
        }
        if (gra.m131606N3()) {
            CacheCardType cacheCardType = CacheCardType.EXPANDED_CARD;
            viewMo136049b = uj4.m196317b(cacheCardType).mo136050c() ? uj4.m196317b(cacheCardType).mo136049b() : null;
            if (viewMo136049b == null) {
                viewMo136049b = this.f22998i.act().inflater().inflate(kec0.f125691X2, viewGroup, false);
            }
            if (viewMo136049b instanceof UserProfileExpandedCardRoot) {
                ((UserProfileExpandedCardRoot) viewMo136049b).setCardViewBackgroundResource(dbc0.f87047h8);
            }
            return viewMo136049b;
        }
        CacheCardType cacheCardType2 = CacheCardType.DEFAULT_CARD;
        viewMo136049b = uj4.m196317b(cacheCardType2).mo136050c() ? uj4.m196317b(cacheCardType2).mo136049b() : null;
        if (viewMo136049b == null) {
            viewMo136049b = this.f22998i.act().inflater().inflate(uj4.m196317b(cacheCardType2).mo136048a(false), viewGroup, false);
        }
        if (viewMo136049b instanceof NewNewProfileCard) {
            ((NewNewProfileCard) viewMo136049b).setOptStackCard(true);
        }
        return viewMo136049b;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        if (NullChecker.m82486a(this.f22999j)) {
            this.f22999j.call();
        }
    }

    @Override // p153l.AbstractC15610a
    /* JADX INFO: renamed from: p */
    public List<CoreSuggested.UserInfo> mo21403p() {
        return this.f22992c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.dq1
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void mo21401j(View view, final CoreSuggested.UserInfo userInfo, int i, int i2) {
        final q7m q7mVar = (q7m) view;
        if (userInfo != null) {
            userInfo.renderFrom = CardInfoRenderFrom.CARD;
        }
        q7mVar.setPageHelper(this.f23002m);
        q7mVar.mo37857U();
        if (IntlCountryCodeController.m29125v()) {
            q7mVar.setUsHomeCardAnimHelper(this.f22998i.m38128A2().getUsHomeCardAnimHelper());
            this.f22998i.m38128A2().mo39813e(1.0f);
        }
        q7mVar.mo37928r();
        if (q7mVar.mo37806B0(this.f22998i, q7mVar, userInfo, i2)) {
            return;
        }
        User user = this.f22995f.get(userInfo.f20214id);
        if (NullChecker.m82486a(user) && NullChecker.m82486a(userInfo.liveLivingCardDataWrapper)) {
            userInfo.f20214id = CoreSuggested.UserInfo.VIRTUAL_CARD;
            if (userInfo.liveLivingCardDataWrapper.getCurrentLive() != null) {
                userInfo.virtualCardType = VirtualCardType.LiveLivingCard;
            } else {
                userInfo.virtualCardType = VirtualCardType.LiveVoiceCard;
            }
            user = null;
        }
        if (NullChecker.m82486a(user) && !userInfo.isVirtualCard()) {
            if (q7mVar instanceof UserProfileExpandedCardRoot) {
                ((UserProfileExpandedCardRoot) q7mVar).setTwoFingerHelper(this.f22998i.f22655Y0);
            }
            if (i2 == 0 && !this.f22997h.f74559y.get().booleanValue()) {
                this.f22997h.f74557w.m137019l(Boolean.valueOf(user.popLevel >= 3));
            }
            ix60 ix60Var = ix60.INSTANCE;
            ix60Var.m142483n(user);
            if (!NullChecker.m82486a(userInfo.coreMomentInfo) || !NullChecker.m82486a(userInfo.cardInfos) || TextUtils.isEmpty(userInfo.cardInfos.momentId) || wj90.m206620c(user)) {
                q7mVar.mo37855T(user, userInfo, i2);
                if (gra.m131606N3()) {
                    CoreModule.f18264c.f20405m0.f20171l2.m137019l("renderCommonCard");
                }
            } else {
                q7mVar.mo37911m(user, userInfo, i2, this.f22998i.m38319l2());
            }
            if (i2 == 0 && ix60Var.m142480k() > 0 && ix60Var.m142486q(user)) {
                m38913N(q7mVar, this.f22998i);
            }
        } else if (CoreSuggested.UserInfo.VIRTUAL_CARD.equals(userInfo.f20214id)) {
            q7mVar.mo37848Q(userInfo, this.f22998i.m38344q2(), userInfo.virtualCardType, i2);
        } else {
            CrashHelper.m82479c(new IllegalStateException("card unRender :" + userInfo.f20214id));
        }
        if (i2 == 0) {
            this.f23001l = userInfo.f20214id;
        }
        if (i2 == 0 && this.f22998i.act().lifecycle_() == C4470c.f16267i && ((!TextUtils.equals(CoreSuggested.UserInfo.VIRTUAL_CARD, userInfo.f20214id) && !TextUtils.equals(this.f22997h.m102043m5(), userInfo.f20214id)) || (TextUtils.equals(CoreSuggested.UserInfo.VIRTUAL_CARD, userInfo.f20214id) && this.f22997h.m102038l5() != userInfo.hashCode()))) {
            if (TextUtils.equals(CoreSuggested.UserInfo.VIRTUAL_CARD, userInfo.f20214id)) {
                this.f22997h.m101942Q8(userInfo.hashCode());
            }
            this.f22997h.m101946R8(userInfo.f20214id);
            if (this.f22998i.m38344q2().isHidden()) {
                this.f22997h.m102014g5();
            } else {
                if (c8d0.m108356f0()) {
                    this.f22998i.m38343p6();
                }
                l51.m152888H(this.f22998i.act(), new Runnable() { // from class: l.n740
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f140575a.m38902B(userInfo, q7mVar);
                    }
                }, 100L);
            }
        }
        if (i2 == 0) {
            q7mVar.setExpandedScrollListener(this.f23000k);
        }
    }

    /* JADX INFO: renamed from: y */
    public List<CoreSuggested.UserInfo> m38915y(List<CoreSuggested.UserInfo> list) {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayListM147507f0 = jyb.m147507f0(new String[0]);
        this.f22995f.clear();
        jyb.m147537z(list, new y20() { // from class: l.p740
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f150897a.m38903C(arrayList, arrayListM147507f0, (CoreSuggested.UserInfo) obj);
            }
        });
        CoreModule.f18264c.f20405m0.m32013I8(arrayListM147507f0);
        return arrayList;
    }

    /* JADX INFO: renamed from: z */
    public User m38916z(String str) {
        return this.f22995f.get(str);
    }
}
