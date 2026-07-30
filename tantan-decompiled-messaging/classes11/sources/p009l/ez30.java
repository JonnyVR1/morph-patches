package p009l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p000p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p000p1.mobile.putong.core.newui.home.cache.CacheCardType;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
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
import l.d30;
import l.du2;
import l.e30;
import l.e51;
import l.mah0;
import l.o6j0;
import l.qib0;
import l.vwb;
import l.vy8;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ez30 extends a<CoreSuggested.UserInfo> {

    /* JADX INFO: renamed from: e */
    public hhp f12734e;

    /* JADX INFO: renamed from: f */
    public pip f12735f;

    /* JADX INFO: renamed from: c */
    public final List<CoreSuggested.UserInfo> f12732c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final Map<String, User> f12733d = new HashMap();

    /* JADX INFO: renamed from: g */
    public d30 f12736g = null;

    /* JADX INFO: renamed from: h */
    public NewNewProfileCard.InterfaceC0027d f12737h = new az30();

    /* JADX INFO: renamed from: i */
    public yl4 f12738i = new C0878a();

    /* JADX INFO: renamed from: l.ez30$a */
    public class C0878a implements yl4 {
        public C0878a() {
        }
    }

    public ez30(hhp hhpVar, pip pipVar) {
        this.f12734e = hhpVar;
        this.f12735f = pipVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m14180A(CoreSuggested.UserInfo userInfo, NewNewProfileCard newNewProfileCard) {
        o6j0.h("e_intl_tribe_card", "p_intl_tribe_swipe_view", new o6j0.a[]{o6j0.a.h("intl_tribe_source_name", this.f12735f.f18675U), o6j0.a.h("receiver_user_id", userInfo.id)});
        HomeStatisticsHelper.m652i(userInfo, this.f12735f.act().pageId());
        jj4 cardData = newNewProfileCard.getCardData();
        String strPageId = this.f12735f.act().pageId();
        String str = userInfo.id;
        HomeStatisticsHelper.m661r(cardData, strPageId, str, this.f12734e.m15787B1(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m14181B(List list, List list2, CoreSuggested.UserInfo userInfo) {
        if (m14185I(userInfo)) {
            list.add(userInfo);
            return;
        }
        if (vy8.g() && mah0.y0(userInfo.id)) {
            Map<String, User> map = this.f12733d;
            String str = userInfo.id;
            map.put(str, mah0.r0(str));
            list.add(userInfo);
            return;
        }
        if (!NullChecker.a(CoreModule.c.e0.Pa(userInfo.id))) {
            list2.add(userInfo.id);
            return;
        }
        Map<String, User> map2 = this.f12733d;
        String str2 = userInfo.id;
        map2.put(str2, CoreModule.c.e0.Pa(str2));
        list.add(userInfo);
    }

    /* JADX INFO: renamed from: C */
    private void m14182C() {
        if (this.f12733d.size() > 0 && this.f12732c.size() > 0) {
            m14184E(this.f12733d.get(this.f12732c.get(0).id));
        }
        if (this.f12733d.size() <= 1 || this.f12732c.size() <= 0) {
            return;
        }
        m14184E(this.f12733d.get(this.f12732c.get(1).id));
    }

    /* JADX INFO: renamed from: D */
    private void m14183D(Media media) {
        if (!NullChecker.a(media) || TEnum.equals(media.status, "raw")) {
            return;
        }
        qib0.G.z0(m14188z(media));
    }

    /* JADX INFO: renamed from: E */
    private void m14184E(User user) {
        if (user == null) {
            return;
        }
        m14183D(user.media(0));
    }

    /* JADX INFO: renamed from: I */
    private boolean m14185I(CoreSuggested.UserInfo userInfo) {
        String str = userInfo.id;
        str.getClass();
        return str.equals("VirtualCard");
    }

    /* JADX INFO: renamed from: z */
    private Picture.ImageUri m14188z(Media media) {
        return zub.m25965e(media, "preload");
    }

    /* JADX INFO: renamed from: F */
    public boolean m14189F(CoreSuggested.UserInfo userInfo) {
        if (vwb.J(this.f12732c)) {
            return false;
        }
        Iterator<CoreSuggested.UserInfo> it = this.f12732c.iterator();
        while (it.hasNext()) {
            CoreSuggested.UserInfo next = it.next();
            if (NullChecker.a(next) && (next.equals(userInfo) || ((TextUtils.equals(userInfo.id, next.id) && !userInfo.isVirtualCard()) || (next.isVirtualCard() && userInfo.isVirtualCard() && next.virtualCardType == userInfo.virtualCardType)))) {
                it.remove();
                Objects.toString(next.virtualCardType);
                this.f12732c.size();
                du2.a("BifrostLayout", "删除Adapter数据：" + next.id + " , " + next.virtualCardType + "," + this.f12732c.size());
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: G */
    public void m14190G(List<CoreSuggested.UserInfo> list) {
        this.f12732c.clear();
        this.f12732c.addAll(list);
        m14182C();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: H */
    public void m14191H(d30 d30Var) {
        this.f12736g = d30Var;
    }

    public int getItemViewType(int i) {
        return 0;
    }

    /* JADX INFO: renamed from: m */
    public View m14193m(ViewGroup viewGroup, int i) {
        if (i != 0) {
            return new NewNewProfileCard(this.f12735f.act());
        }
        CacheCardType cacheCardType = CacheCardType.DEFAULT_CARD;
        View viewMo12115b = vi4.m23379b(cacheCardType).mo12116c() ? vi4.m23379b(cacheCardType).mo12115b() : null;
        if (viewMo12115b == null) {
            viewMo12115b = this.f12735f.act().inflater().inflate(vi4.m23379b(cacheCardType).mo12114a(false), viewGroup, false);
        }
        if (viewMo12115b instanceof NewNewProfileCard) {
            ((NewNewProfileCard) viewMo12115b).setOptStackCard(true);
        }
        return viewMo12115b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void notifyDataSetChanged() {
        super/*android.widget.BaseAdapter*/.notifyDataSetChanged();
        if (NullChecker.a(this.f12736g)) {
            this.f12736g.call();
        }
    }

    /* JADX INFO: renamed from: p */
    public List<CoreSuggested.UserInfo> m14194p() {
        return this.f12732c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void m14192j(View view, final CoreSuggested.UserInfo userInfo, int i, int i2) {
        final NewNewProfileCard newNewProfileCard = (NewNewProfileCard) view;
        newNewProfileCard.setPageHelper(this.f12737h);
        newNewProfileCard.setDisableShowBlurCover(true);
        if (NullChecker.a(newNewProfileCard.f515T)) {
            newNewProfileCard.f515T.i0();
        }
        newNewProfileCard.mo891r();
        User user = this.f12733d.get(userInfo.id);
        if (NullChecker.a(user) && !userInfo.isVirtualCard() && NullChecker.a(userInfo.coreMomentInfo) && NullChecker.a(userInfo.cardInfos) && !TextUtils.isEmpty(userInfo.cardInfos.momentId)) {
            newNewProfileCard.mo872m(user, userInfo, i2, this.f12735f.m20395Z());
        } else if (!NullChecker.a(user) || userInfo.isVirtualCard()) {
            CrashHelper.c(new IllegalStateException("card unRender :" + userInfo.id));
        } else {
            newNewProfileCard.mo810T(user, userInfo, i2);
        }
        if (i2 == 0 && this.f12735f.act().lifecycle_() == c.i) {
            if ((TextUtils.equals("VirtualCard", userInfo.id) || TextUtils.equals(this.f12734e.m15823n1(), userInfo.id)) && (!TextUtils.equals("VirtualCard", userInfo.id) || this.f12734e.m15821m1() == userInfo.hashCode())) {
                return;
            }
            if (TextUtils.equals("VirtualCard", userInfo.id)) {
                this.f12734e.m15836y2(userInfo.hashCode());
            }
            this.f12734e.m15837z2(userInfo.id);
            if (this.f12735f.m20403e0().isHidden()) {
                this.f12734e.m15818k1();
            } else {
                e51.H(this.f12735f.act(), new Runnable() { // from class: l.cz30
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10827a.m14180A(userInfo, newNewProfileCard);
                    }
                }, 100L);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public List<CoreSuggested.UserInfo> m14196y(List<CoreSuggested.UserInfo> list) {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayListF0 = vwb.f0(new String[0]);
        this.f12733d.clear();
        vwb.z(list, new e30() { // from class: l.dz30
            public final void call(Object obj) {
                this.f12069a.m14181B(arrayList, arrayListF0, (CoreSuggested.UserInfo) obj);
            }
        });
        CoreModule.c.o0.Y3(arrayListF0);
        return arrayList;
    }
}
