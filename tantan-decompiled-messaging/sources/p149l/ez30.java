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
public class ez30 extends AbstractC15503a<CoreSuggested.UserInfo> {

    /* JADX INFO: renamed from: e */
    public hhp f93843e;

    /* JADX INFO: renamed from: f */
    public pip f93844f;

    /* JADX INFO: renamed from: c */
    public final List<CoreSuggested.UserInfo> f93841c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final Map<String, User> f93842d = new HashMap();

    /* JADX INFO: renamed from: g */
    public d30 f93845g = null;

    /* JADX INFO: renamed from: h */
    public NewNewProfileCard.InterfaceC7863d f93846h = new az30();

    /* JADX INFO: renamed from: i */
    public yl4 f93847i = new C16728a();

    /* JADX INFO: renamed from: l.ez30$a */
    public class C16728a implements yl4 {
        public C16728a() {
        }
    }

    public ez30(hhp hhpVar, pip pipVar) {
        this.f93843e = hhpVar;
        this.f93844f = pipVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m118826A(CoreSuggested.UserInfo userInfo, NewNewProfileCard newNewProfileCard) {
        o6j0.m162864h("e_intl_tribe_card", "p_intl_tribe_swipe_view", o6j0.C18854a.m162878h("intl_tribe_source_name", this.f93844f.f149629U), o6j0.C18854a.m162878h("receiver_user_id", userInfo.f19472id));
        HomeStatisticsHelper.m36703i(userInfo, this.f93844f.getAct().pageId());
        jj4 cardData = newNewProfileCard.getCardData();
        String strPageId = this.f93844f.getAct().pageId();
        String str = userInfo.f19472id;
        HomeStatisticsHelper.m36712r(cardData, strPageId, str, this.f93843e.m131045B1(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m118827B(List list, List list2, CoreSuggested.UserInfo userInfo) {
        if (m118831I(userInfo)) {
            list.add(userInfo);
            return;
        }
        if (vy8.m200609g() && mah0.m153738y0(userInfo.f19472id)) {
            Map<String, User> map = this.f93842d;
            String str = userInfo.f19472id;
            map.put(str, mah0.m153727r0(str));
            list.add(userInfo);
            return;
        }
        if (!NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169430Pa(userInfo.f19472id))) {
            list2.add(userInfo.f19472id);
            return;
        }
        Map<String, User> map2 = this.f93842d;
        String str2 = userInfo.f19472id;
        map2.put(str2, CoreModule.f17545c.f19639e0.m169430Pa(str2));
        list.add(userInfo);
    }

    /* JADX INFO: renamed from: C */
    private void m118828C() {
        if (this.f93842d.size() > 0 && this.f93841c.size() > 0) {
            m118830E(this.f93842d.get(this.f93841c.get(0).f19472id));
        }
        if (this.f93842d.size() <= 1 || this.f93841c.size() <= 0) {
            return;
        }
        m118830E(this.f93842d.get(this.f93841c.get(1).f19472id));
    }

    /* JADX INFO: renamed from: D */
    private void m118829D(Media media) {
        if (!NullChecker.m81303a(media) || TEnum.equals(media.status, "raw")) {
            return;
        }
        qib0.f154691G.m102379z0(m118834z(media));
    }

    /* JADX INFO: renamed from: E */
    private void m118830E(User user) {
        if (user == null) {
            return;
        }
        m118829D(user.media(0));
    }

    /* JADX INFO: renamed from: I */
    private boolean m118831I(CoreSuggested.UserInfo userInfo) {
        String str = userInfo.f19472id;
        str.getClass();
        return str.equals(CoreSuggested.UserInfo.VIRTUAL_CARD);
    }

    /* JADX INFO: renamed from: z */
    private Picture.ImageUri m118834z(Media media) {
        return zub.m220206e(media, "preload");
    }

    /* JADX INFO: renamed from: F */
    public boolean m118835F(CoreSuggested.UserInfo userInfo) {
        if (vwb.m200296J(this.f93841c)) {
            return false;
        }
        Iterator<CoreSuggested.UserInfo> it = this.f93841c.iterator();
        while (it.hasNext()) {
            CoreSuggested.UserInfo next = it.next();
            if (NullChecker.m81303a(next) && (next.equals(userInfo) || ((TextUtils.equals(userInfo.f19472id, next.f19472id) && !userInfo.isVirtualCard()) || (next.isVirtualCard() && userInfo.isVirtualCard() && next.virtualCardType == userInfo.virtualCardType)))) {
                it.remove();
                Objects.toString(next.virtualCardType);
                this.f93841c.size();
                du2.m113670a("BifrostLayout", "删除Adapter数据：" + next.f19472id + " , " + next.virtualCardType + Constants.SEPARATOR_COMMA + this.f93841c.size());
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: G */
    public void m118836G(List<CoreSuggested.UserInfo> list) {
        this.f93841c.clear();
        this.f93841c.addAll(list);
        m118828C();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: H */
    public void m118837H(d30 d30Var) {
        this.f93845g = d30Var;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        return 0;
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: m */
    public View mo20403m(ViewGroup viewGroup, int i) {
        if (i != 0) {
            return new NewNewProfileCard(this.f93844f.getAct());
        }
        CacheCardType cacheCardType = CacheCardType.DEFAULT_CARD;
        View viewMo102629b = vi4.m198496b(cacheCardType).mo102630c() ? vi4.m198496b(cacheCardType).mo102629b() : null;
        if (viewMo102629b == null) {
            viewMo102629b = this.f93844f.getAct().inflater().inflate(vi4.m198496b(cacheCardType).mo102628a(false), viewGroup, false);
        }
        if (viewMo102629b instanceof NewNewProfileCard) {
            ((NewNewProfileCard) viewMo102629b).setOptStackCard(true);
        }
        return viewMo102629b;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        if (NullChecker.m81303a(this.f93845g)) {
            this.f93845g.call();
        }
    }

    @Override // p149l.AbstractC15503a
    /* JADX INFO: renamed from: p */
    public List<CoreSuggested.UserInfo> mo20404p() {
        return this.f93841c;
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void mo20402j(View view, final CoreSuggested.UserInfo userInfo, int i, int i2) {
        final NewNewProfileCard newNewProfileCard = (NewNewProfileCard) view;
        newNewProfileCard.setPageHelper(this.f93846h);
        newNewProfileCard.setDisableShowBlurCover(true);
        if (NullChecker.m81303a(newNewProfileCard.f21737T)) {
            newNewProfileCard.f21737T.m44003i0();
        }
        newNewProfileCard.mo36925r();
        User user = this.f93842d.get(userInfo.f19472id);
        if (NullChecker.m81303a(user) && !userInfo.isVirtualCard() && NullChecker.m81303a(userInfo.coreMomentInfo) && NullChecker.m81303a(userInfo.cardInfos) && !TextUtils.isEmpty(userInfo.cardInfos.momentId)) {
            newNewProfileCard.mo36908m(user, userInfo, i2, this.f93844f.m169711Z());
        } else if (!NullChecker.m81303a(user) || userInfo.isVirtualCard()) {
            CrashHelper.m81296c(new IllegalStateException("card unRender :" + userInfo.f19472id));
        } else {
            newNewProfileCard.mo36852T(user, userInfo, i2);
        }
        if (i2 == 0 && this.f93844f.getAct().lifecycle_() == C4319c.f15548i) {
            if ((TextUtils.equals(CoreSuggested.UserInfo.VIRTUAL_CARD, userInfo.f19472id) || TextUtils.equals(this.f93843e.m131080n1(), userInfo.f19472id)) && (!TextUtils.equals(CoreSuggested.UserInfo.VIRTUAL_CARD, userInfo.f19472id) || this.f93843e.m131078m1() == userInfo.hashCode())) {
                return;
            }
            if (TextUtils.equals(CoreSuggested.UserInfo.VIRTUAL_CARD, userInfo.f19472id)) {
                this.f93843e.m131093y2(userInfo.hashCode());
            }
            this.f93843e.m131094z2(userInfo.f19472id);
            if (this.f93844f.m169719e0().isHidden()) {
                this.f93843e.m131075k1();
            } else {
                e51.m114743H(this.f93844f.getAct(), new Runnable() { // from class: l.cz30
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f83056a.m118826A(userInfo, newNewProfileCard);
                    }
                }, 100L);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public List<CoreSuggested.UserInfo> m118839y(List<CoreSuggested.UserInfo> list) {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayListM200324f0 = vwb.m200324f0(new String[0]);
        this.f93842d.clear();
        vwb.m200354z(list, new e30() { // from class: l.dz30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f88448a.m118827B(arrayList, arrayListM200324f0, (CoreSuggested.UserInfo) obj);
            }
        });
        CoreModule.f17545c.f19669o0.m34322Y3(arrayListM200324f0);
        return arrayList;
    }
}
