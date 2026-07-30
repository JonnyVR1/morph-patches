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
import l.qib0;
import l.vwb;
import l.vy8;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class hz30 extends a<CoreSuggested.UserInfo> {

    /* JADX INFO: renamed from: f */
    public dcl f14316f;

    /* JADX INFO: renamed from: g */
    public idl f14317g;

    /* JADX INFO: renamed from: c */
    public final List<CoreSuggested.UserInfo> f14313c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final Map<String, User> f14314d = new HashMap();

    /* JADX INFO: renamed from: e */
    public final boolean f14315e = false;

    /* JADX INFO: renamed from: h */
    public d30 f14318h = null;

    /* JADX INFO: renamed from: i */
    public NewNewProfileCard.InterfaceC0027d f14319i = new az30();

    /* JADX INFO: renamed from: j */
    public yl4 f14320j = new C0943a();

    /* JADX INFO: renamed from: l.hz30$a */
    public class C0943a implements yl4 {
        public C0943a() {
        }
    }

    public hz30(dcl dclVar, idl idlVar) {
        this.f14316f = dclVar;
        this.f14317g = idlVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m16032B(List list, List list2, CoreSuggested.UserInfo userInfo) {
        if (m16036I(userInfo)) {
            list.add(userInfo);
            return;
        }
        if (vy8.g() && mah0.y0(userInfo.id)) {
            Map<String, User> map = this.f14314d;
            String str = userInfo.id;
            map.put(str, mah0.r0(str));
            list.add(userInfo);
            return;
        }
        if (!NullChecker.a(CoreModule.c.e0.Pa(userInfo.id))) {
            list2.add(userInfo.id);
            return;
        }
        Map<String, User> map2 = this.f14314d;
        String str2 = userInfo.id;
        map2.put(str2, CoreModule.c.e0.Pa(str2));
        list.add(userInfo);
    }

    /* JADX INFO: renamed from: C */
    private void m16033C() {
        if (this.f14314d.size() > 0 && this.f14313c.size() > 0) {
            m16035E(this.f14314d.get(this.f14313c.get(0).id));
        }
        if (this.f14314d.size() <= 1 || this.f14313c.size() <= 0) {
            return;
        }
        m16035E(this.f14314d.get(this.f14313c.get(1).id));
    }

    /* JADX INFO: renamed from: D */
    private void m16034D(Media media) {
        if (!NullChecker.a(media) || TEnum.equals(media.status, "raw")) {
            return;
        }
        qib0.G.z0(m16039z(media));
    }

    /* JADX INFO: renamed from: E */
    private void m16035E(User user) {
        if (user == null) {
            return;
        }
        m16034D(user.media(0));
    }

    /* JADX INFO: renamed from: I */
    private boolean m16036I(CoreSuggested.UserInfo userInfo) {
        String str = userInfo.id;
        str.getClass();
        return str.equals("VirtualCard");
    }

    /* JADX INFO: renamed from: z */
    private Picture.ImageUri m16039z(Media media) {
        return zub.m25965e(media, "preload");
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m16040A(CoreSuggested.UserInfo userInfo, NewNewProfileCard newNewProfileCard) {
        HomeStatisticsHelper.m652i(userInfo, this.f14317g.m16456i0().pageId());
        jj4 cardData = newNewProfileCard.getCardData();
        String strPageId = this.f14317g.m16456i0().pageId();
        String str = userInfo.id;
        HomeStatisticsHelper.m661r(cardData, strPageId, str, this.f14316f.m13119N1(str));
    }

    /* JADX INFO: renamed from: F */
    public boolean m16041F(CoreSuggested.UserInfo userInfo) {
        if (vwb.J(this.f14313c)) {
            return false;
        }
        Iterator<CoreSuggested.UserInfo> it = this.f14313c.iterator();
        while (it.hasNext()) {
            CoreSuggested.UserInfo next = it.next();
            if (NullChecker.a(next) && (next.equals(userInfo) || ((TextUtils.equals(userInfo.id, next.id) && !userInfo.isVirtualCard()) || (next.isVirtualCard() && userInfo.isVirtualCard() && next.virtualCardType == userInfo.virtualCardType)))) {
                it.remove();
                Objects.toString(next.virtualCardType);
                this.f14313c.size();
                du2.a("BifrostLayout", "删除Adapter数据：" + next.id + " , " + next.virtualCardType + "," + this.f14313c.size());
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: G */
    public void m16042G(List<CoreSuggested.UserInfo> list) {
        this.f14313c.clear();
        this.f14313c.addAll(list);
        m16033C();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: H */
    public void m16043H(d30 d30Var) {
        this.f14318h = d30Var;
    }

    public int getItemViewType(int i) {
        return 0;
    }

    /* JADX INFO: renamed from: m */
    public View m16045m(ViewGroup viewGroup, int i) {
        if (i != 0) {
            return new NewNewProfileCard(this.f14317g.act());
        }
        CacheCardType cacheCardType = CacheCardType.DEFAULT_CARD;
        View viewMo12115b = vi4.m23379b(cacheCardType).mo12116c() ? vi4.m23379b(cacheCardType).mo12115b() : null;
        if (viewMo12115b == null) {
            viewMo12115b = this.f14317g.act().inflater().inflate(vi4.m23379b(cacheCardType).mo12114a(false), viewGroup, false);
        }
        if (viewMo12115b instanceof NewNewProfileCard) {
            ((NewNewProfileCard) viewMo12115b).setOptStackCard(true);
        }
        return viewMo12115b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void notifyDataSetChanged() {
        super/*android.widget.BaseAdapter*/.notifyDataSetChanged();
        if (NullChecker.a(this.f14318h)) {
            this.f14318h.call();
        }
    }

    /* JADX INFO: renamed from: p */
    public List<CoreSuggested.UserInfo> m16046p() {
        return this.f14313c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void m16044j(View view, final CoreSuggested.UserInfo userInfo, int i, int i2) {
        final NewNewProfileCard newNewProfileCard = (NewNewProfileCard) view;
        newNewProfileCard.setPageHelper(this.f14319i);
        if (NullChecker.a(newNewProfileCard.f515T)) {
            newNewProfileCard.f515T.i0();
        }
        newNewProfileCard.mo891r();
        User user = this.f14314d.get(userInfo.id);
        if (NullChecker.a(user) && !userInfo.isVirtualCard() && NullChecker.a(userInfo.coreMomentInfo) && NullChecker.a(userInfo.cardInfos) && !TextUtils.isEmpty(userInfo.cardInfos.momentId)) {
            newNewProfileCard.mo872m(user, userInfo, i2, this.f14317g.m16448e0());
        } else if (!NullChecker.a(user) || userInfo.isVirtualCard()) {
            CrashHelper.c(new IllegalStateException("card unRender :" + userInfo.id));
        } else {
            newNewProfileCard.mo810T(user, userInfo, i2);
        }
        if (i2 == 0 && this.f14317g.act().lifecycle_() == c.i) {
            if ((TextUtils.equals("VirtualCard", userInfo.id) || TextUtils.equals(this.f14316f.m13161u1(), userInfo.id)) && (!TextUtils.equals("VirtualCard", userInfo.id) || this.f14316f.m13159t1() == userInfo.hashCode())) {
                return;
            }
            if (TextUtils.equals("VirtualCard", userInfo.id)) {
                this.f14316f.m13115J2(userInfo.hashCode());
            }
            this.f14316f.m13116K2(userInfo.id);
            if (this.f14317g.m16456i0().isHidden()) {
                this.f14316f.m13154q1();
            } else {
                e51.H(this.f14317g.act(), new Runnable() { // from class: l.fz30
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f13241a.m16040A(userInfo, newNewProfileCard);
                    }
                }, 100L);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public List<CoreSuggested.UserInfo> m16048y(List<CoreSuggested.UserInfo> list) {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayListF0 = vwb.f0(new String[0]);
        this.f14314d.clear();
        vwb.z(list, new e30() { // from class: l.gz30
            public final void call(Object obj) {
                this.f13818a.m16032B(arrayList, arrayListF0, (CoreSuggested.UserInfo) obj);
            }
        });
        CoreModule.c.n0.W3(arrayListF0);
        return arrayList;
    }
}
