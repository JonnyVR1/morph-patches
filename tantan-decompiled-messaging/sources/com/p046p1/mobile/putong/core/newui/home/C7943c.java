package com.p046p1.mobile.putong.core.newui.home;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.p046p1.mobile.putong.core.data.CardModel;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.newui.home.cache.CacheCardType;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCardRoot;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p149l.AbstractC15503a;
import p149l.a5m;
import p149l.az30;
import p149l.b1c;
import p149l.cp60;
import p149l.d30;
import p149l.d5m;
import p149l.du2;
import p149l.e30;
import p149l.e51;
import p149l.f6c0;
import p149l.jj4;
import p149l.mah0;
import p149l.nt30;
import p149l.oql;
import p149l.qib0;
import p149l.sb90;
import p149l.upa;
import p149l.vi4;
import p149l.vwb;
import p149l.vy8;
import p149l.x2c0;
import p149l.zub;
import p149l.zzc0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.c */
/* JADX INFO: loaded from: classes11.dex */
public class C7943c extends AbstractC15503a<CoreSuggested.UserInfo> {

    /* JADX INFO: renamed from: h */
    public nt30 f22255h;

    /* JADX INFO: renamed from: i */
    public ViewTreeObserverOnGlobalLayoutListenerC7866b f22256i;

    /* JADX INFO: renamed from: k */
    public oql f22258k;

    /* JADX INFO: renamed from: l */
    public String f22259l;

    /* JADX INFO: renamed from: c */
    public final List<CoreSuggested.UserInfo> f22250c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final List<CoreMomentInfo> f22251d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final List<CardModel> f22252e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final Map<String, User> f22253f = new HashMap();

    /* JADX INFO: renamed from: g */
    public final boolean f22254g = false;

    /* JADX INFO: renamed from: j */
    public d30 f22257j = null;

    /* JADX INFO: renamed from: m */
    public NewNewProfileCard.InterfaceC7863d f22260m = new az30();

    public C7943c(nt30 nt30Var, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        this.f22255h = nt30Var;
        this.f22256i = viewTreeObserverOnGlobalLayoutListenerC7866b;
    }

    /* JADX INFO: renamed from: G */
    private void m37895G(Media media) {
        if (!NullChecker.m81303a(media) || TEnum.equals(media.status, "raw")) {
            return;
        }
        qib0.f154691G.m102379z0(m37898A(media));
    }

    /* JADX INFO: renamed from: A */
    public final Picture.ImageUri m37898A(Media media) {
        return zub.m220206e(media, "preload");
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m37899B(CoreSuggested.UserInfo userInfo, a5m a5mVar) {
        HomeStatisticsHelper.m36703i(userInfo, this.f22256i.m37341q2().pageId());
        a5mVar.getCardData();
        jj4 cardData = a5mVar.getCardData();
        String strPageId = this.f22256i.m37341q2().pageId();
        String str = userInfo.f19472id;
        HomeStatisticsHelper.m36712r(cardData, strPageId, str, this.f22255h.m161221g6(str));
        if (userInfo.selectionUser) {
            b1c.m99824m(userInfo.f19472id, "suggest");
        }
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m37900C(List list, List list2, CoreSuggested.UserInfo userInfo) {
        if (m37909M(userInfo)) {
            list.add(userInfo);
            return;
        }
        if (vy8.m200609g() && mah0.m153738y0(userInfo.f19472id)) {
            Map<String, User> map = this.f22253f;
            String str = userInfo.f19472id;
            map.put(str, mah0.m153727r0(str));
            list.add(userInfo);
            return;
        }
        if (!NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169430Pa(userInfo.f19472id))) {
            list2.add(userInfo.f19472id);
            return;
        }
        Map<String, User> map2 = this.f22253f;
        String str2 = userInfo.f19472id;
        map2.put(str2, CoreModule.f17545c.f19639e0.m169430Pa(str2));
        list.add(userInfo);
    }

    /* JADX INFO: renamed from: D */
    public void m37901D() {
        oql oqlVar = this.f22258k;
        if (oqlVar != null) {
            oqlVar.mo37396B(0, 10, 0, CoreSuggested.UserInfo.VIRTUAL_CARD, 0);
        }
    }

    /* JADX INFO: renamed from: E */
    public void m37902E() {
        if (!upa.m194675N3() || getCount() < 4) {
            return;
        }
        CoreSuggested.UserInfo item = getItem(3);
        if (item.isVirtualCard()) {
            return;
        }
        User user = this.f22253f.get(item.f19472id);
        if (NullChecker.m81303a(user)) {
            m37904H(user);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m37903F() {
        if (this.f22253f.size() > 0 && this.f22250c.size() > 0) {
            m37904H(this.f22253f.get(this.f22250c.get(0).f19472id));
        }
        if (this.f22253f.size() <= 1 || this.f22250c.size() <= 0) {
            return;
        }
        m37904H(this.f22253f.get(this.f22250c.get(1).f19472id));
    }

    /* JADX INFO: renamed from: H */
    public final void m37904H(User user) {
        if (user == null) {
            return;
        }
        m37895G(user.media(0));
    }

    /* JADX INFO: renamed from: I */
    public void m37905I(oql oqlVar) {
        this.f22258k = oqlVar;
    }

    /* JADX INFO: renamed from: J */
    public boolean m37906J(CoreSuggested.UserInfo userInfo) {
        if (vwb.m200296J(this.f22250c)) {
            return false;
        }
        Iterator<CoreSuggested.UserInfo> it = this.f22250c.iterator();
        while (it.hasNext()) {
            CoreSuggested.UserInfo next = it.next();
            if (NullChecker.m81303a(next) && (next.equals(userInfo) || ((TextUtils.equals(userInfo.f19472id, next.f19472id) && !userInfo.isVirtualCard()) || (next.isVirtualCard() && userInfo.isVirtualCard() && next.virtualCardType == userInfo.virtualCardType)))) {
                it.remove();
                Objects.toString(next.virtualCardType);
                this.f22250c.size();
                du2.m113670a("BifrostLayout", "删除Adapter数据：" + next.f19472id + " , " + next.virtualCardType + Constants.SEPARATOR_COMMA + this.f22250c.size());
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: K */
    public void m37907K(List<CoreSuggested.UserInfo> list) {
        this.f22250c.clear();
        this.f22250c.addAll(list);
        m37903F();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: L */
    public void m37908L(d30 d30Var) {
        this.f22257j = d30Var;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m37909M(CoreSuggested.UserInfo userInfo) {
        return userInfo.f19472id.equals(CoreSuggested.UserInfo.VIRTUAL_CARD);
    }

    /* JADX INFO: renamed from: N */
    public final void m37910N(a5m a5mVar, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b) {
        if (NullChecker.m81303a(a5mVar) && NullChecker.m81303a(viewTreeObserverOnGlobalLayoutListenerC7866b) && (a5mVar instanceof d5m)) {
            ((d5m) a5mVar).mo36807C0();
            viewTreeObserverOnGlobalLayoutListenerC7866b.m37351r6();
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        return 0;
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: m */
    public View mo20403m(ViewGroup viewGroup, int i) {
        View viewMo102629b;
        if (i != 0) {
            return new NewNewProfileCard(this.f22256i.act());
        }
        if (upa.m194675N3()) {
            CacheCardType cacheCardType = CacheCardType.EXPANDED_CARD;
            viewMo102629b = vi4.m198496b(cacheCardType).mo102630c() ? vi4.m198496b(cacheCardType).mo102629b() : null;
            if (viewMo102629b == null) {
                viewMo102629b = this.f22256i.act().inflater().inflate(f6c0.f95637X2, viewGroup, false);
            }
            if (viewMo102629b instanceof UserProfileExpandedCardRoot) {
                ((UserProfileExpandedCardRoot) viewMo102629b).setCardViewBackgroundResource(x2c0.f190165g8);
            }
            return viewMo102629b;
        }
        CacheCardType cacheCardType2 = CacheCardType.DEFAULT_CARD;
        viewMo102629b = vi4.m198496b(cacheCardType2).mo102630c() ? vi4.m198496b(cacheCardType2).mo102629b() : null;
        if (viewMo102629b == null) {
            viewMo102629b = this.f22256i.act().inflater().inflate(vi4.m198496b(cacheCardType2).mo102628a(false), viewGroup, false);
        }
        if (viewMo102629b instanceof NewNewProfileCard) {
            ((NewNewProfileCard) viewMo102629b).setOptStackCard(true);
        }
        return viewMo102629b;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        if (NullChecker.m81303a(this.f22257j)) {
            this.f22257j.call();
        }
    }

    @Override // p149l.AbstractC15503a
    /* JADX INFO: renamed from: p */
    public List<CoreSuggested.UserInfo> mo20404p() {
        return this.f22250c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.wp1
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void mo20402j(View view, final CoreSuggested.UserInfo userInfo, int i, int i2) {
        final a5m a5mVar = (a5m) view;
        if (userInfo != null) {
            userInfo.renderFrom = CardInfoRenderFrom.CARD;
        }
        a5mVar.setPageHelper(this.f22260m);
        a5mVar.mo36854U();
        if (IntlCountryCodeController.m28126v()) {
            a5mVar.setUsHomeCardAnimHelper(this.f22256i.m37125A2().getUsHomeCardAnimHelper());
            this.f22256i.m37125A2().mo38810e(1.0f);
        }
        a5mVar.mo36925r();
        if (a5mVar.mo36803B0(this.f22256i, a5mVar, userInfo, i2)) {
            return;
        }
        User user = this.f22253f.get(userInfo.f19472id);
        if (NullChecker.m81303a(user) && NullChecker.m81303a(userInfo.liveLivingCardDataWrapper)) {
            userInfo.f19472id = CoreSuggested.UserInfo.VIRTUAL_CARD;
            if (userInfo.liveLivingCardDataWrapper.getCurrentLive() != null) {
                userInfo.virtualCardType = VirtualCardType.LiveLivingCard;
            } else {
                userInfo.virtualCardType = VirtualCardType.LiveVoiceCard;
            }
            user = null;
        }
        if (NullChecker.m81303a(user) && !userInfo.isVirtualCard()) {
            if (a5mVar instanceof UserProfileExpandedCardRoot) {
                ((UserProfileExpandedCardRoot) a5mVar).setTwoFingerHelper(this.f22256i.f21913Y0);
            }
            if (i2 == 0 && !this.f22255h.f140407y.get().booleanValue()) {
                this.f22255h.f140405w.m132487l(Boolean.valueOf(user.popLevel >= 3));
            }
            cp60 cp60Var = cp60.INSTANCE;
            cp60Var.m108100n(user);
            if (!NullChecker.m81303a(userInfo.coreMomentInfo) || !NullChecker.m81303a(userInfo.cardInfos) || TextUtils.isEmpty(userInfo.cardInfos.momentId) || sb90.m183207c(user)) {
                a5mVar.mo36852T(user, userInfo, i2);
                if (upa.m194675N3()) {
                    CoreModule.f17545c.f19663m0.f19429l2.m132487l("renderCommonCard");
                }
            } else {
                a5mVar.mo36908m(user, userInfo, i2, this.f22256i.m37316l2());
            }
            if (i2 == 0 && cp60Var.m108097k() > 0 && cp60Var.m108103q(user)) {
                m37910N(a5mVar, this.f22256i);
            }
        } else if (CoreSuggested.UserInfo.VIRTUAL_CARD.equals(userInfo.f19472id)) {
            a5mVar.mo36845Q(userInfo, this.f22256i.m37341q2(), userInfo.virtualCardType, i2);
        } else {
            CrashHelper.m81296c(new IllegalStateException("card unRender :" + userInfo.f19472id));
        }
        if (i2 == 0) {
            this.f22259l = userInfo.f19472id;
        }
        if (i2 == 0 && this.f22256i.act().lifecycle_() == C4319c.f15548i && ((!TextUtils.equals(CoreSuggested.UserInfo.VIRTUAL_CARD, userInfo.f19472id) && !TextUtils.equals(this.f22255h.m161249m5(), userInfo.f19472id)) || (TextUtils.equals(CoreSuggested.UserInfo.VIRTUAL_CARD, userInfo.f19472id) && this.f22255h.m161244l5() != userInfo.hashCode()))) {
            if (TextUtils.equals(CoreSuggested.UserInfo.VIRTUAL_CARD, userInfo.f19472id)) {
                this.f22255h.m161148Q8(userInfo.hashCode());
            }
            this.f22255h.m161152R8(userInfo.f19472id);
            if (this.f22256i.m37341q2().isHidden()) {
                this.f22255h.m161220g5();
            } else {
                if (zzc0.m221015f0()) {
                    this.f22256i.m37340p6();
                }
                e51.m114743H(this.f22256i.act(), new Runnable() { // from class: l.zy30
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f205602a.m37899B(userInfo, a5mVar);
                    }
                }, 100L);
            }
        }
        if (i2 == 0) {
            a5mVar.setExpandedScrollListener(this.f22258k);
        }
    }

    /* JADX INFO: renamed from: y */
    public List<CoreSuggested.UserInfo> m37912y(List<CoreSuggested.UserInfo> list) {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayListM200324f0 = vwb.m200324f0(new String[0]);
        this.f22253f.clear();
        vwb.m200354z(list, new e30() { // from class: l.bz30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f78000a.m37900C(arrayList, arrayListM200324f0, (CoreSuggested.UserInfo) obj);
            }
        });
        CoreModule.f17545c.f19663m0.m31010I8(arrayListM200324f0);
        return arrayList;
    }

    /* JADX INFO: renamed from: z */
    public User m37913z(String str) {
        return this.f22253f.get(str);
    }
}
