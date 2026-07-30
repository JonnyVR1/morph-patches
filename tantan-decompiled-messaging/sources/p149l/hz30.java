package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p046p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p046p1.mobile.putong.core.newui.home.cache.CacheCardType;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public class hz30 extends AbstractC15503a<CoreSuggested.UserInfo> {

    /* JADX INFO: renamed from: f */
    public dcl f110177f;

    /* JADX INFO: renamed from: g */
    public idl f110178g;

    /* JADX INFO: renamed from: c */
    public final List<CoreSuggested.UserInfo> f110174c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final Map<String, User> f110175d = new HashMap();

    /* JADX INFO: renamed from: e */
    public final boolean f110176e = false;

    /* JADX INFO: renamed from: h */
    public d30 f110179h = null;

    /* JADX INFO: renamed from: i */
    public NewNewProfileCard.InterfaceC7863d f110180i = new az30();

    /* JADX INFO: renamed from: j */
    public yl4 f110181j = new C17438a();

    /* JADX INFO: renamed from: l.hz30$a */
    public class C17438a implements yl4 {
        public C17438a() {
        }
    }

    public hz30(dcl dclVar, idl idlVar) {
        this.f110177f = dclVar;
        this.f110178g = idlVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m133650B(List list, List list2, CoreSuggested.UserInfo userInfo) {
        if (m133654I(userInfo)) {
            list.add(userInfo);
            return;
        }
        if (vy8.m200609g() && mah0.m153738y0(userInfo.f19472id)) {
            Map<String, User> map = this.f110175d;
            String str = userInfo.f19472id;
            map.put(str, mah0.m153727r0(str));
            list.add(userInfo);
            return;
        }
        if (!NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169430Pa(userInfo.f19472id))) {
            list2.add(userInfo.f19472id);
            return;
        }
        Map<String, User> map2 = this.f110175d;
        String str2 = userInfo.f19472id;
        map2.put(str2, CoreModule.f17545c.f19639e0.m169430Pa(str2));
        list.add(userInfo);
    }

    /* JADX INFO: renamed from: C */
    private void m133651C() {
        if (this.f110175d.size() > 0 && this.f110174c.size() > 0) {
            m133653E(this.f110175d.get(this.f110174c.get(0).f19472id));
        }
        if (this.f110175d.size() <= 1 || this.f110174c.size() <= 0) {
            return;
        }
        m133653E(this.f110175d.get(this.f110174c.get(1).f19472id));
    }

    /* JADX INFO: renamed from: D */
    private void m133652D(Media media) {
        if (!NullChecker.m81303a(media) || TEnum.equals(media.status, "raw")) {
            return;
        }
        qib0.f154691G.m102379z0(m133657z(media));
    }

    /* JADX INFO: renamed from: E */
    private void m133653E(User user) {
        if (user == null) {
            return;
        }
        m133652D(user.media(0));
    }

    /* JADX INFO: renamed from: I */
    private boolean m133654I(CoreSuggested.UserInfo userInfo) {
        String str = userInfo.f19472id;
        str.getClass();
        return str.equals(CoreSuggested.UserInfo.VIRTUAL_CARD);
    }

    /* JADX INFO: renamed from: z */
    private Picture.ImageUri m133657z(Media media) {
        return zub.m220206e(media, "preload");
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m133658A(CoreSuggested.UserInfo userInfo, NewNewProfileCard newNewProfileCard) {
        HomeStatisticsHelper.m36703i(userInfo, this.f110178g.m135564i0().pageId());
        jj4 cardData = newNewProfileCard.getCardData();
        String strPageId = this.f110178g.m135564i0().pageId();
        String str = userInfo.f19472id;
        HomeStatisticsHelper.m36712r(cardData, strPageId, str, this.f110177f.m110809N1(str));
    }

    /* JADX INFO: renamed from: F */
    public boolean m133659F(CoreSuggested.UserInfo userInfo) {
        if (vwb.m200296J(this.f110174c)) {
            return false;
        }
        Iterator<CoreSuggested.UserInfo> it = this.f110174c.iterator();
        while (it.hasNext()) {
            CoreSuggested.UserInfo next = it.next();
            if (NullChecker.m81303a(next) && (next.equals(userInfo) || ((TextUtils.equals(userInfo.f19472id, next.f19472id) && !userInfo.isVirtualCard()) || (next.isVirtualCard() && userInfo.isVirtualCard() && next.virtualCardType == userInfo.virtualCardType)))) {
                it.remove();
                Objects.toString(next.virtualCardType);
                this.f110174c.size();
                du2.m113670a("BifrostLayout", "删除Adapter数据：" + next.f19472id + " , " + next.virtualCardType + Constants.SEPARATOR_COMMA + this.f110174c.size());
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: G */
    public void m133660G(List<CoreSuggested.UserInfo> list) {
        this.f110174c.clear();
        this.f110174c.addAll(list);
        m133651C();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: H */
    public void m133661H(d30 d30Var) {
        this.f110179h = d30Var;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        return 0;
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: m */
    public View mo20403m(ViewGroup viewGroup, int i) {
        if (i != 0) {
            return new NewNewProfileCard(this.f110178g.act());
        }
        CacheCardType cacheCardType = CacheCardType.DEFAULT_CARD;
        View viewMo102629b = vi4.m198496b(cacheCardType).mo102630c() ? vi4.m198496b(cacheCardType).mo102629b() : null;
        if (viewMo102629b == null) {
            viewMo102629b = this.f110178g.act().inflater().inflate(vi4.m198496b(cacheCardType).mo102628a(false), viewGroup, false);
        }
        if (viewMo102629b instanceof NewNewProfileCard) {
            ((NewNewProfileCard) viewMo102629b).setOptStackCard(true);
        }
        return viewMo102629b;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        if (NullChecker.m81303a(this.f110179h)) {
            this.f110179h.call();
        }
    }

    @Override // p149l.AbstractC15503a
    /* JADX INFO: renamed from: p */
    public List<CoreSuggested.UserInfo> mo20404p() {
        return this.f110174c;
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void mo20402j(View view, final CoreSuggested.UserInfo userInfo, int i, int i2) {
        final NewNewProfileCard newNewProfileCard = (NewNewProfileCard) view;
        newNewProfileCard.setPageHelper(this.f110180i);
        if (NullChecker.m81303a(newNewProfileCard.f21737T)) {
            newNewProfileCard.f21737T.m44003i0();
        }
        newNewProfileCard.mo36925r();
        User user = this.f110175d.get(userInfo.f19472id);
        if (NullChecker.m81303a(user) && !userInfo.isVirtualCard() && NullChecker.m81303a(userInfo.coreMomentInfo) && NullChecker.m81303a(userInfo.cardInfos) && !TextUtils.isEmpty(userInfo.cardInfos.momentId)) {
            newNewProfileCard.mo36908m(user, userInfo, i2, this.f110178g.m135556e0());
        } else if (!NullChecker.m81303a(user) || userInfo.isVirtualCard()) {
            CrashHelper.m81296c(new IllegalStateException("card unRender :" + userInfo.f19472id));
        } else {
            newNewProfileCard.mo36852T(user, userInfo, i2);
        }
        if (i2 == 0 && this.f110178g.act().lifecycle_() == C4319c.f15548i) {
            if ((TextUtils.equals(CoreSuggested.UserInfo.VIRTUAL_CARD, userInfo.f19472id) || TextUtils.equals(this.f110177f.m110850u1(), userInfo.f19472id)) && (!TextUtils.equals(CoreSuggested.UserInfo.VIRTUAL_CARD, userInfo.f19472id) || this.f110177f.m110848t1() == userInfo.hashCode())) {
                return;
            }
            if (TextUtils.equals(CoreSuggested.UserInfo.VIRTUAL_CARD, userInfo.f19472id)) {
                this.f110177f.m110805J2(userInfo.hashCode());
            }
            this.f110177f.m110806K2(userInfo.f19472id);
            if (this.f110178g.m135564i0().isHidden()) {
                this.f110177f.m110843q1();
            } else {
                e51.m114743H(this.f110178g.act(), new Runnable() { // from class: l.fz30
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f99929a.m133658A(userInfo, newNewProfileCard);
                    }
                }, 100L);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public List<CoreSuggested.UserInfo> m133663y(List<CoreSuggested.UserInfo> list) {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayListM200324f0 = vwb.m200324f0(new String[0]);
        this.f110175d.clear();
        vwb.m200354z(list, new e30() { // from class: l.gz30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105075a.m133650B(arrayList, arrayListM200324f0, (CoreSuggested.UserInfo) obj);
            }
        });
        CoreModule.f17545c.f19666n0.m31452W3(arrayListM200324f0);
        return arrayList;
    }
}
