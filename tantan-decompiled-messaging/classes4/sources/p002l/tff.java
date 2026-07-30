package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.profile.exp.ExpTagView;
import com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0064c;
import com.p000p1.mobile.putong.core.p001ui.profile.views.FlowTagsView;
import com.p1.mobile.putong.core.data.UserTagData;
import com.p1.mobile.putong.core.data.UserTagsData;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import l.c40;
import l.eqh0;
import l.f6c0;
import l.juk;
import l.mcr;
import l.o6j0;
import l.sth0;
import l.u4c0;
import l.vwb;
import l.w9j;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import v.VListCell;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class tff extends AbstractC0064c {

    /* JADX INFO: renamed from: u */
    public UserTagsData f20215u;

    /* JADX INFO: renamed from: v */
    public FlowTagsView f20216v;

    /* JADX INFO: renamed from: w */
    public View f20217w;

    /* JADX INFO: renamed from: x */
    public c40 f20218x;

    public tff(@NonNull @NotNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m22926T() {
    }

    /* JADX INFO: renamed from: Z */
    public static HashMap<String, String> m22932Z() {
        HashMap<String, String> map = new HashMap<>();
        if (juk.e()) {
            map.put("277", "https://auto.tancdn.com/v1/images/eyJpZCI6IjRaT1BMUTNGTVlBWUFLTlcyVk9JUUQyWjYzNDI0TzE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png");
            map.put("278", "https://auto.tancdn.com/v1/images/eyJpZCI6IkQ1M1lVQ0hDNTcyWEhYNEtTS0pSTEhaM05ZWkFFRDE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png");
            map.put("207", "https://auto.tancdn.com/v1/images/eyJpZCI6IlJSTEJGQ1hVUEdEMzNSUTNFQlBRN05OVFlRQUJKQTE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png");
            map.put("212", "https://auto.tancdn.com/v1/images/eyJpZCI6IlNPT1dENU9RWk1EUk1KN1FXRVhTUVJMNlJZNFhOSjE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png");
            map.put("280", "https://auto.tancdn.com/v1/images/eyJpZCI6Ilk2STVPWlVFNFdBTktVSldHTVJBV1JVV0dGQklCVTE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png");
            map.put("279", "https://auto.tancdn.com/v1/images/eyJpZCI6IlNPTVFHWTRJQUJOUURFTUlEM1EzWURKSFQ1NVk1WDE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png");
            map.put("210", "https://auto.tancdn.com/v1/images/eyJpZCI6IkFVNkJWSjNMWjRDSklOUTNJTlpGR0hOWENQVkVCTzE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png");
            map.put("281", "https://auto.tancdn.com/v1/images/eyJpZCI6IkpGS1ZJSlVHNVU3WUtGR05NNEdOVDNHNVAzMjNFSTE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png");
            map.put("205", "https://auto.tancdn.com/v1/images/eyJpZCI6IjQyRlZWMktMVUdMSjVXU0hJUlFVMk5RQlk3QlhCNDE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png");
            map.put("283", "https://auto.tancdn.com/v1/images/eyJpZCI6Ik40TU5aSEJMSElFM0VCU1BIRTVLU1g1N1hTN1dPMzE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png");
            map.put("206", "https://auto.tancdn.com/v1/images/eyJpZCI6IlhaR1o1QzRBSEU1VkRMUkpEQ09IT1hSS0U2RFlMQzE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png");
            map.put("282", "https://auto.tancdn.com/v1/images/eyJpZCI6IldQWkc1NEZFWllWUElIUDZCUFFUWUI2NDJaWVdSQzE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png");
            map.put("284", "https://auto.tancdn.com/v1/images/eyJpZCI6IlJPUEpJSTU2M1pIRTdBN1BRSTMzRlk1WFpURktYMjE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png");
            return map;
        }
        map.put("47", "https://auto.tancdn.com/v1/images/eyJpZCI6IjRaT1BMUTNGTVlBWUFLTlcyVk9JUUQyWjYzNDI0TzE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png");
        map.put("48", "https://auto.tancdn.com/v1/images/eyJpZCI6IkQ1M1lVQ0hDNTcyWEhYNEtTS0pSTEhaM05ZWkFFRDE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png");
        map.put("4", "https://auto.tancdn.com/v1/images/eyJpZCI6IlJSTEJGQ1hVUEdEMzNSUTNFQlBRN05OVFlRQUJKQTE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png");
        map.put("9", "https://auto.tancdn.com/v1/images/eyJpZCI6IlNPT1dENU9RWk1EUk1KN1FXRVhTUVJMNlJZNFhOSjE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png");
        map.put("50", "https://auto.tancdn.com/v1/images/eyJpZCI6Ilk2STVPWlVFNFdBTktVSldHTVJBV1JVV0dGQklCVTE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png");
        map.put("49", "https://auto.tancdn.com/v1/images/eyJpZCI6IlNPTVFHWTRJQUJOUURFTUlEM1EzWURKSFQ1NVk1WDE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png");
        map.put("7", "https://auto.tancdn.com/v1/images/eyJpZCI6IkFVNkJWSjNMWjRDSklOUTNJTlpGR0hOWENQVkVCTzE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png");
        map.put("51", "https://auto.tancdn.com/v1/images/eyJpZCI6IkpGS1ZJSlVHNVU3WUtGR05NNEdOVDNHNVAzMjNFSTE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png");
        map.put("2", "https://auto.tancdn.com/v1/images/eyJpZCI6IjQyRlZWMktMVUdMSjVXU0hJUlFVMk5RQlk3QlhCNDE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png");
        map.put("10", "https://auto.tancdn.com/v1/images/eyJpZCI6Ik40TU5aSEJMSElFM0VCU1BIRTVLU1g1N1hTN1dPMzE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png");
        map.put("3", "https://auto.tancdn.com/v1/images/eyJpZCI6IlhaR1o1QzRBSEU1VkRMUkpEQ09IT1hSS0U2RFlMQzE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png");
        map.put("52", "https://auto.tancdn.com/v1/images/eyJpZCI6IldQWkc1NEZFWllWUElIUDZCUFFUWUI2NDJaWVdSQzE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png");
        map.put("53", "https://auto.tancdn.com/v1/images/eyJpZCI6IlJPUEpJSTU2M1pIRTdBN1BRSTMzRlk1WFpURktYMjE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m22933g0(View view) {
        sa40.m22270o().m22278H(m1624x().mo1514J1(), 3001, m1624x().mo1517K2(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m22934h0(View view) {
        o6j0.c("e_tag_add_photo_guidance", "p_edit_profile_view", new o6j0.a[0]);
        sth0.b().e(m1624x().m9268i2().clone());
        gjf.m13857M(this.f20216v.getContext(), false, false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View, com.p1.mobile.putong.core.ui.profile.exp.ExpTagView] */
    /* JADX INFO: renamed from: a0 */
    public View m22935a0(final UserTagData userTagData, final HashMap<String, String> map) {
        ?? expTagView = new ExpTagView(m1624x().act());
        int i = xdl0.f;
        expTagView.setLayoutParams(new ViewGroup.LayoutParams(i, i));
        String str = (String) vwb.r(userTagData.categories, new w9j() { // from class: l.pff
            public final Object call(Object obj) {
                return Boolean.valueOf(map.get((String) obj) != null);
            }
        });
        expTagView.m1410e(userTagData.title, str == null ? "https://auto.tancdn.com/v1/images/eyJpZCI6IktPV0g3U0hGRUhQQVpQUUs0STdXNkxSUzVDRzRaNDE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png" : map.get(str));
        xdl0.E0((View) expTagView, new View.OnClickListener() { // from class: l.qff
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17967a.m22940f0(userTagData, view);
            }
        });
        return expTagView;
    }

    /* JADX INFO: renamed from: b0 */
    public List<View> m22936b0(UserTagsData userTagsData) {
        if (!NullChecker.a(userTagsData)) {
            return null;
        }
        List<UserTagData> list = userTagsData.tags;
        ArrayList arrayList = new ArrayList();
        HashMap<String, String> mapM22932Z = m22932Z();
        for (UserTagData userTagData : list) {
            if (NullChecker.a(userTagData)) {
                arrayList.add(m22935a0(userTagData, mapM22932Z));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m22937c0() {
        UserTagsData userTagsData = this.f20215u;
        if (userTagsData == null || vwb.J(userTagsData.tags)) {
            return;
        }
        this.f20216v.setMaxLines(3);
        this.f20216v.setCallBack(new FlowTagsView.InterfaceC0167a() { // from class: l.off
            @Override // com.p000p1.mobile.putong.core.p001ui.profile.views.FlowTagsView.InterfaceC0167a
            /* JADX INFO: renamed from: a */
            public final void mo3469a() {
                tff.m22926T();
            }
        });
        this.f20216v.setTags(m22936b0(this.f20215u));
        User userM9268i2 = m1624x().m9268i2();
        if (vwb.J(sa40.m22270o().m22306v(userM9268i2)) || userM9268i2.pictures.size() >= 9) {
            xdl0.M(this.f20217w, false);
        } else {
            xdl0.M(this.f20217w, true);
            o6j0.h("e_tag_add_photo_guidance", "p_edit_profile_view", new o6j0.a[0]);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m22938d0(View view) {
        this.f20218x.b();
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m22939e0(UserTagData userTagData, VListCell vListCell, VListCell.a aVar, int i) {
        List<String> listM22310z = sa40.m22270o().m22310z();
        if (!vwb.J(listM22310z)) {
            listM22310z.remove(userTagData.id);
            sa40.m22270o().m22290T(listM22310z);
            mo1626z();
            if (vwb.J(this.f20215u.tags)) {
                m1624x().mo1515J3();
            }
        }
        this.f20218x.b();
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m22940f0(final UserTagData userTagData, View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("删除标签");
        c40 c40VarF = new c40.b(m1624x().act()).I("取消").U(new View.OnClickListener() { // from class: l.rff
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f18497a.m22938d0(view2);
            }
        }).Q(arrayList).P(eqh0.c(3)).V(new c40.d() { // from class: l.sff
            /* JADX INFO: renamed from: a */
            public final void m22417a(VListCell vListCell, VListCell.a aVar, int i) {
                this.f18989a.m22939e0(userTagData, vListCell, aVar, i);
            }
        }).F();
        this.f20218x = c40VarF;
        c40VarF.f();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: m */
    public String mo1613m() {
        return "我的标签";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: n */
    public String mo1614n() {
        return "tag";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: q */
    public void mo1617q(View view) {
        super.mo1617q(view);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: r */
    public boolean mo1618r() {
        User userM9268i2 = m1624x().m9268i2();
        if (userM9268i2 == null) {
            return false;
        }
        UserTagsData userTagsDataM22307w = sa40.m22270o().m22307w(userM9268i2);
        this.f20215u = userTagsDataM22307w;
        return (userTagsDataM22307w == null || vwb.J(userTagsDataM22307w.tags)) ? false : true;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: y */
    public View mo1625y(ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(f6c0.A2, (ViewGroup) null);
        this.f20216v = (FlowTagsView) viewInflate.findViewById(u4c0.Id);
        this.f20217w = viewInflate.findViewById(u4c0.x);
        return viewInflate;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: z */
    public void mo1626z() {
        m1598C(true);
        User userM9268i2 = m1624x().m9268i2();
        if (userM9268i2 != null) {
            this.f20215u = sa40.m22270o().m22307w(userM9268i2);
        }
        m22937c0();
        m1599D(new View.OnClickListener() { // from class: l.mff
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15366a.m22933g0(view);
            }
        });
        xdl0.E0(this.f20217w, new View.OnClickListener() { // from class: l.nff
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16009a.m22934h0(view);
            }
        });
    }
}
