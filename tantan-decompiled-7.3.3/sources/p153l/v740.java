package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p051p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p051p1.mobile.putong.core.newui.home.cache.CacheCardType;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public class v740 extends AbstractC15610a<CoreSuggested.UserInfo> {

    /* JADX INFO: renamed from: f */
    public tel f182722f;

    /* JADX INFO: renamed from: g */
    public yfl f182723g;

    /* JADX INFO: renamed from: c */
    public final List<CoreSuggested.UserInfo> f182719c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final Map<String, User> f182720d = new HashMap();

    /* JADX INFO: renamed from: e */
    public final boolean f182721e = false;

    /* JADX INFO: renamed from: h */
    public x20 f182724h = null;

    /* JADX INFO: renamed from: i */
    public NewNewProfileCard.InterfaceC8014d f182725i = new o740();

    /* JADX INFO: renamed from: j */
    public xm4 f182726j = new C20780a();

    /* JADX INFO: renamed from: l.v740$a */
    public class C20780a implements xm4 {
        public C20780a() {
        }
    }

    public v740(tel telVar, yfl yflVar) {
        this.f182722f = telVar;
        this.f182723g = yflVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m200177B(List list, List list2, CoreSuggested.UserInfo userInfo) {
        if (m200181I(userInfo)) {
            list.add(userInfo);
            return;
        }
        if (d09.m113370g() && uih0.m196232y0(userInfo.f20214id)) {
            Map<String, User> map = this.f182720d;
            String str = userInfo.f20214id;
            map.put(str, uih0.m196221r0(str));
            list.add(userInfo);
            return;
        }
        if (!NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116503Pa(userInfo.f20214id))) {
            list2.add(userInfo.f20214id);
            return;
        }
        Map<String, User> map2 = this.f182720d;
        String str2 = userInfo.f20214id;
        map2.put(str2, CoreModule.f18264c.f20381e0.m116503Pa(str2));
        list.add(userInfo);
    }

    /* JADX INFO: renamed from: C */
    private void m200178C() {
        if (this.f182720d.size() > 0 && this.f182719c.size() > 0) {
            m200180E(this.f182720d.get(this.f182719c.get(0).f20214id));
        }
        if (this.f182720d.size() <= 1 || this.f182719c.size() <= 0) {
            return;
        }
        m200180E(this.f182720d.get(this.f182719c.get(1).f20214id));
    }

    /* JADX INFO: renamed from: D */
    private void m200179D(Media media) {
        if (!NullChecker.m82486a(media) || TEnum.equals(media.status, "raw")) {
            return;
        }
        uqb0.f180374G.m127162z0(m200184z(media));
    }

    /* JADX INFO: renamed from: E */
    private void m200180E(User user) {
        if (user == null) {
            return;
        }
        m200179D(user.media(0));
    }

    /* JADX INFO: renamed from: I */
    private boolean m200181I(CoreSuggested.UserInfo userInfo) {
        String str = userInfo.f20214id;
        str.getClass();
        return str.equals(CoreSuggested.UserInfo.VIRTUAL_CARD);
    }

    /* JADX INFO: renamed from: z */
    private Picture.ImageUri m200184z(Media media) {
        return nwb.m164967e(media, "preload");
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m200185A(CoreSuggested.UserInfo userInfo, NewNewProfileCard newNewProfileCard) {
        HomeStatisticsHelper.m37706i(userInfo, this.f182723g.m215717i0().pageId());
        ik4 cardData = newNewProfileCard.getCardData();
        String strPageId = this.f182723g.m215717i0().pageId();
        String str = userInfo.f20214id;
        HomeStatisticsHelper.m37715r(cardData, strPageId, str, this.f182722f.m190791N1(str));
    }

    /* JADX INFO: renamed from: F */
    public boolean m200186F(CoreSuggested.UserInfo userInfo) {
        if (jyb.m147479J(this.f182719c)) {
            return false;
        }
        Iterator<CoreSuggested.UserInfo> it = this.f182719c.iterator();
        while (it.hasNext()) {
            CoreSuggested.UserInfo next = it.next();
            if (NullChecker.m82486a(next) && (next.equals(userInfo) || ((TextUtils.equals(userInfo.f20214id, next.f20214id) && !userInfo.isVirtualCard()) || (next.isVirtualCard() && userInfo.isVirtualCard() && next.virtualCardType == userInfo.virtualCardType)))) {
                it.remove();
                Objects.toString(next.virtualCardType);
                this.f182719c.size();
                tu2.m192703a("BifrostLayout", "删除Adapter数据：" + next.f20214id + " , " + next.virtualCardType + Constants.SEPARATOR_COMMA + this.f182719c.size());
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: G */
    public void m200187G(List<CoreSuggested.UserInfo> list) {
        this.f182719c.clear();
        this.f182719c.addAll(list);
        m200178C();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: H */
    public void m200188H(x20 x20Var) {
        this.f182724h = x20Var;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        return 0;
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: m */
    public View mo21402m(ViewGroup viewGroup, int i) {
        if (i != 0) {
            return new NewNewProfileCard(this.f182723g.act());
        }
        CacheCardType cacheCardType = CacheCardType.DEFAULT_CARD;
        View viewMo136049b = uj4.m196317b(cacheCardType).mo136050c() ? uj4.m196317b(cacheCardType).mo136049b() : null;
        if (viewMo136049b == null) {
            viewMo136049b = this.f182723g.act().inflater().inflate(uj4.m196317b(cacheCardType).mo136048a(false), viewGroup, false);
        }
        if (viewMo136049b instanceof NewNewProfileCard) {
            ((NewNewProfileCard) viewMo136049b).setOptStackCard(true);
        }
        return viewMo136049b;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        if (NullChecker.m82486a(this.f182724h)) {
            this.f182724h.call();
        }
    }

    @Override // p153l.AbstractC15610a
    /* JADX INFO: renamed from: p */
    public List<CoreSuggested.UserInfo> mo21403p() {
        return this.f182719c;
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void mo21401j(View view, final CoreSuggested.UserInfo userInfo, int i, int i2) {
        final NewNewProfileCard newNewProfileCard = (NewNewProfileCard) view;
        newNewProfileCard.setPageHelper(this.f182725i);
        if (NullChecker.m82486a(newNewProfileCard.f22479T)) {
            newNewProfileCard.f22479T.m45186i0();
        }
        newNewProfileCard.mo37928r();
        User user = this.f182720d.get(userInfo.f20214id);
        if (NullChecker.m82486a(user) && !userInfo.isVirtualCard() && NullChecker.m82486a(userInfo.coreMomentInfo) && NullChecker.m82486a(userInfo.cardInfos) && !TextUtils.isEmpty(userInfo.cardInfos.momentId)) {
            newNewProfileCard.mo37911m(user, userInfo, i2, this.f182723g.m215709e0());
        } else if (!NullChecker.m82486a(user) || userInfo.isVirtualCard()) {
            CrashHelper.m82479c(new IllegalStateException("card unRender :" + userInfo.f20214id));
        } else {
            newNewProfileCard.mo37855T(user, userInfo, i2);
        }
        if (i2 == 0 && this.f182723g.act().lifecycle_() == C4470c.f16267i) {
            if ((TextUtils.equals(CoreSuggested.UserInfo.VIRTUAL_CARD, userInfo.f20214id) || TextUtils.equals(this.f182722f.m190832u1(), userInfo.f20214id)) && (!TextUtils.equals(CoreSuggested.UserInfo.VIRTUAL_CARD, userInfo.f20214id) || this.f182722f.m190830t1() == userInfo.hashCode())) {
                return;
            }
            if (TextUtils.equals(CoreSuggested.UserInfo.VIRTUAL_CARD, userInfo.f20214id)) {
                this.f182722f.m190787J2(userInfo.hashCode());
            }
            this.f182722f.m190788K2(userInfo.f20214id);
            if (this.f182723g.m215717i0().isHidden()) {
                this.f182722f.m190825q1();
            } else {
                l51.m152888H(this.f182723g.act(), new Runnable() { // from class: l.t740
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f172394a.m200185A(userInfo, newNewProfileCard);
                    }
                }, 100L);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public List<CoreSuggested.UserInfo> m200190y(List<CoreSuggested.UserInfo> list) {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayListM147507f0 = jyb.m147507f0(new String[0]);
        this.f182720d.clear();
        jyb.m147537z(list, new y20() { // from class: l.u740
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f177879a.m200177B(arrayList, arrayListM147507f0, (CoreSuggested.UserInfo) obj);
            }
        });
        CoreModule.f18264c.f20408n0.m32455W3(arrayListM147507f0);
        return arrayList;
    }
}
