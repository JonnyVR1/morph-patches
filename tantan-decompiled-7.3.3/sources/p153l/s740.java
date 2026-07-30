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
public class s740 extends AbstractC15610a<CoreSuggested.UserInfo> {

    /* JADX INFO: renamed from: e */
    public hjp f166638e;

    /* JADX INFO: renamed from: f */
    public pkp f166639f;

    /* JADX INFO: renamed from: c */
    public final List<CoreSuggested.UserInfo> f166636c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final Map<String, User> f166637d = new HashMap();

    /* JADX INFO: renamed from: g */
    public x20 f166640g = null;

    /* JADX INFO: renamed from: h */
    public NewNewProfileCard.InterfaceC8014d f166641h = new o740();

    /* JADX INFO: renamed from: i */
    public xm4 f166642i = new C20000a();

    /* JADX INFO: renamed from: l.s740$a */
    public class C20000a implements xm4 {
        public C20000a() {
        }
    }

    public s740(hjp hjpVar, pkp pkpVar) {
        this.f166638e = hjpVar;
        this.f166639f = pkpVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m184943A(CoreSuggested.UserInfo userInfo, NewNewProfileCard newNewProfileCard) {
        sfj0.m185601h("e_intl_tribe_card", "p_intl_tribe_swipe_view", sfj0.C20032a.m185615h("intl_tribe_source_name", this.f166639f.f152896U), sfj0.C20032a.m185615h("receiver_user_id", userInfo.f20214id));
        HomeStatisticsHelper.m37706i(userInfo, this.f166639f.getAct().pageId());
        ik4 cardData = newNewProfileCard.getCardData();
        String strPageId = this.f166639f.getAct().pageId();
        String str = userInfo.f20214id;
        HomeStatisticsHelper.m37715r(cardData, strPageId, str, this.f166638e.m135449B1(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m184944B(List list, List list2, CoreSuggested.UserInfo userInfo) {
        if (m184948I(userInfo)) {
            list.add(userInfo);
            return;
        }
        if (d09.m113370g() && uih0.m196232y0(userInfo.f20214id)) {
            Map<String, User> map = this.f166637d;
            String str = userInfo.f20214id;
            map.put(str, uih0.m196221r0(str));
            list.add(userInfo);
            return;
        }
        if (!NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116503Pa(userInfo.f20214id))) {
            list2.add(userInfo.f20214id);
            return;
        }
        Map<String, User> map2 = this.f166637d;
        String str2 = userInfo.f20214id;
        map2.put(str2, CoreModule.f18264c.f20381e0.m116503Pa(str2));
        list.add(userInfo);
    }

    /* JADX INFO: renamed from: C */
    private void m184945C() {
        if (this.f166637d.size() > 0 && this.f166636c.size() > 0) {
            m184947E(this.f166637d.get(this.f166636c.get(0).f20214id));
        }
        if (this.f166637d.size() <= 1 || this.f166636c.size() <= 0) {
            return;
        }
        m184947E(this.f166637d.get(this.f166636c.get(1).f20214id));
    }

    /* JADX INFO: renamed from: D */
    private void m184946D(Media media) {
        if (!NullChecker.m82486a(media) || TEnum.equals(media.status, "raw")) {
            return;
        }
        uqb0.f180374G.m127162z0(m184951z(media));
    }

    /* JADX INFO: renamed from: E */
    private void m184947E(User user) {
        if (user == null) {
            return;
        }
        m184946D(user.media(0));
    }

    /* JADX INFO: renamed from: I */
    private boolean m184948I(CoreSuggested.UserInfo userInfo) {
        String str = userInfo.f20214id;
        str.getClass();
        return str.equals(CoreSuggested.UserInfo.VIRTUAL_CARD);
    }

    /* JADX INFO: renamed from: z */
    private Picture.ImageUri m184951z(Media media) {
        return nwb.m164967e(media, "preload");
    }

    /* JADX INFO: renamed from: F */
    public boolean m184952F(CoreSuggested.UserInfo userInfo) {
        if (jyb.m147479J(this.f166636c)) {
            return false;
        }
        Iterator<CoreSuggested.UserInfo> it = this.f166636c.iterator();
        while (it.hasNext()) {
            CoreSuggested.UserInfo next = it.next();
            if (NullChecker.m82486a(next) && (next.equals(userInfo) || ((TextUtils.equals(userInfo.f20214id, next.f20214id) && !userInfo.isVirtualCard()) || (next.isVirtualCard() && userInfo.isVirtualCard() && next.virtualCardType == userInfo.virtualCardType)))) {
                it.remove();
                Objects.toString(next.virtualCardType);
                this.f166636c.size();
                tu2.m192703a("BifrostLayout", "删除Adapter数据：" + next.f20214id + " , " + next.virtualCardType + Constants.SEPARATOR_COMMA + this.f166636c.size());
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: G */
    public void m184953G(List<CoreSuggested.UserInfo> list) {
        this.f166636c.clear();
        this.f166636c.addAll(list);
        m184945C();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: H */
    public void m184954H(x20 x20Var) {
        this.f166640g = x20Var;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        return 0;
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: m */
    public View mo21402m(ViewGroup viewGroup, int i) {
        if (i != 0) {
            return new NewNewProfileCard(this.f166639f.getAct());
        }
        CacheCardType cacheCardType = CacheCardType.DEFAULT_CARD;
        View viewMo136049b = uj4.m196317b(cacheCardType).mo136050c() ? uj4.m196317b(cacheCardType).mo136049b() : null;
        if (viewMo136049b == null) {
            viewMo136049b = this.f166639f.getAct().inflater().inflate(uj4.m196317b(cacheCardType).mo136048a(false), viewGroup, false);
        }
        if (viewMo136049b instanceof NewNewProfileCard) {
            ((NewNewProfileCard) viewMo136049b).setOptStackCard(true);
        }
        return viewMo136049b;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        if (NullChecker.m82486a(this.f166640g)) {
            this.f166640g.call();
        }
    }

    @Override // p153l.AbstractC15610a
    /* JADX INFO: renamed from: p */
    public List<CoreSuggested.UserInfo> mo21403p() {
        return this.f166636c;
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void mo21401j(View view, final CoreSuggested.UserInfo userInfo, int i, int i2) {
        final NewNewProfileCard newNewProfileCard = (NewNewProfileCard) view;
        newNewProfileCard.setPageHelper(this.f166641h);
        newNewProfileCard.setDisableShowBlurCover(true);
        if (NullChecker.m82486a(newNewProfileCard.f22479T)) {
            newNewProfileCard.f22479T.m45186i0();
        }
        newNewProfileCard.mo37928r();
        User user = this.f166637d.get(userInfo.f20214id);
        if (NullChecker.m82486a(user) && !userInfo.isVirtualCard() && NullChecker.m82486a(userInfo.coreMomentInfo) && NullChecker.m82486a(userInfo.cardInfos) && !TextUtils.isEmpty(userInfo.cardInfos.momentId)) {
            newNewProfileCard.mo37911m(user, userInfo, i2, this.f166639f.m172707Z());
        } else if (!NullChecker.m82486a(user) || userInfo.isVirtualCard()) {
            CrashHelper.m82479c(new IllegalStateException("card unRender :" + userInfo.f20214id));
        } else {
            newNewProfileCard.mo37855T(user, userInfo, i2);
        }
        if (i2 == 0 && this.f166639f.getAct().lifecycle_() == C4470c.f16267i) {
            if ((TextUtils.equals(CoreSuggested.UserInfo.VIRTUAL_CARD, userInfo.f20214id) || TextUtils.equals(this.f166638e.m135484n1(), userInfo.f20214id)) && (!TextUtils.equals(CoreSuggested.UserInfo.VIRTUAL_CARD, userInfo.f20214id) || this.f166638e.m135482m1() == userInfo.hashCode())) {
                return;
            }
            if (TextUtils.equals(CoreSuggested.UserInfo.VIRTUAL_CARD, userInfo.f20214id)) {
                this.f166638e.m135497y2(userInfo.hashCode());
            }
            this.f166638e.m135498z2(userInfo.f20214id);
            if (this.f166639f.m172715e0().isHidden()) {
                this.f166638e.m135479k1();
            } else {
                l51.m152888H(this.f166639f.getAct(), new Runnable() { // from class: l.q740
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f155936a.m184943A(userInfo, newNewProfileCard);
                    }
                }, 100L);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public List<CoreSuggested.UserInfo> m184956y(List<CoreSuggested.UserInfo> list) {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayListM147507f0 = jyb.m147507f0(new String[0]);
        this.f166637d.clear();
        jyb.m147537z(list, new y20() { // from class: l.r740
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161579a.m184944B(arrayList, arrayListM147507f0, (CoreSuggested.UserInfo) obj);
            }
        });
        CoreModule.f18264c.f20411o0.m35325Y3(arrayListM147507f0);
        return arrayList;
    }
}
