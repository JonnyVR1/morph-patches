package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.data.UserTagData;
import com.p046p1.mobile.putong.core.data.UserTagsData;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.ExpTagView;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8639c;
import com.p046p1.mobile.putong.core.p053ui.profile.views.FlowTagsView;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p147v.VListCell;

/* JADX INFO: loaded from: classes4.dex */
public class tff extends AbstractC8639c {

    /* JADX INFO: renamed from: u */
    public UserTagsData f169971u;

    /* JADX INFO: renamed from: v */
    public FlowTagsView f169972v;

    /* JADX INFO: renamed from: w */
    public View f169973w;

    /* JADX INFO: renamed from: x */
    public c40 f169974x;

    public tff(@NonNull @NotNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m188690T() {
    }

    /* JADX INFO: renamed from: Z */
    public static HashMap<String, String> m188696Z() {
        HashMap<String, String> map = new HashMap<>();
        if (juk.m143323e()) {
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
        map.put(Constants.VIA_SHARE_TYPE_MINI_PROGRAM, "https://auto.tancdn.com/v1/images/eyJpZCI6IlNPT1dENU9RWk1EUk1KN1FXRVhTUVJMNlJZNFhOSjE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png");
        map.put("50", "https://auto.tancdn.com/v1/images/eyJpZCI6Ilk2STVPWlVFNFdBTktVSldHTVJBV1JVV0dGQklCVTE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png");
        map.put("49", "https://auto.tancdn.com/v1/images/eyJpZCI6IlNPTVFHWTRJQUJOUURFTUlEM1EzWURKSFQ1NVk1WDE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png");
        map.put("7", "https://auto.tancdn.com/v1/images/eyJpZCI6IkFVNkJWSjNMWjRDSklOUTNJTlpGR0hOWENQVkVCTzE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png");
        map.put("51", "https://auto.tancdn.com/v1/images/eyJpZCI6IkpGS1ZJSlVHNVU3WUtGR05NNEdOVDNHNVAzMjNFSTE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png");
        map.put("2", "https://auto.tancdn.com/v1/images/eyJpZCI6IjQyRlZWMktMVUdMSjVXU0hJUlFVMk5RQlk3QlhCNDE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png");
        map.put(Constants.VIA_REPORT_TYPE_SHARE_TO_QQ, "https://auto.tancdn.com/v1/images/eyJpZCI6Ik40TU5aSEJMSElFM0VCU1BIRTVLU1g1N1hTN1dPMzE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png");
        map.put("3", "https://auto.tancdn.com/v1/images/eyJpZCI6IlhaR1o1QzRBSEU1VkRMUkpEQ09IT1hSS0U2RFlMQzE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png");
        map.put("52", "https://auto.tancdn.com/v1/images/eyJpZCI6IldQWkc1NEZFWllWUElIUDZCUFFUWUI2NDJaWVdSQzE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png");
        map.put("53", "https://auto.tancdn.com/v1/images/eyJpZCI6IlJPUEpJSTU2M1pIRTdBN1BRSTMzRlk1WFpURktYMjE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m188697g0(View view) {
        sa40.m182802o().m182810H(m51172x().mo51066J1(), 3001, m51172x().mo51069K2(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m188698h0(View view) {
        o6j0.m162859c("e_tag_add_photo_guidance", "p_edit_profile_view", new o6j0.C18854a[0]);
        sth0.m185950b().m185954e(m51172x().m94569i2().mo223809clone());
        gjf.m126489M((PutongAct) this.f169972v.getContext(), false, false);
    }

    /* JADX INFO: renamed from: a0 */
    public View m188699a0(final UserTagData userTagData, final HashMap<String, String> map) {
        ExpTagView expTagView = new ExpTagView(m51172x().act());
        int i = xdl0.f192404f;
        expTagView.setLayoutParams(new ViewGroup.LayoutParams(i, i));
        String str = (String) vwb.m200346r(userTagData.categories, new w9j() { // from class: l.pff
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(map.get((String) obj) != null);
            }
        });
        expTagView.m50962e(userTagData.title, str == null ? "https://auto.tancdn.com/v1/images/eyJpZCI6IktPV0g3U0hGRUhQQVpQUUs0STdXNkxSUzVDRzRaNDE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png" : map.get(str));
        xdl0.m208329E0(expTagView, new View.OnClickListener() { // from class: l.qff
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f154104a.m188704f0(userTagData, view);
            }
        });
        return expTagView;
    }

    /* JADX INFO: renamed from: b0 */
    public List<View> m188700b0(UserTagsData userTagsData) {
        if (!NullChecker.m81303a(userTagsData)) {
            return null;
        }
        List<UserTagData> list = userTagsData.tags;
        ArrayList arrayList = new ArrayList();
        HashMap<String, String> mapM188696Z = m188696Z();
        for (UserTagData userTagData : list) {
            if (NullChecker.m81303a(userTagData)) {
                arrayList.add(m188699a0(userTagData, mapM188696Z));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m188701c0() {
        UserTagsData userTagsData = this.f169971u;
        if (userTagsData == null || vwb.m200296J(userTagsData.tags)) {
            return;
        }
        this.f169972v.setMaxLines(3);
        this.f169972v.setCallBack(new FlowTagsView.InterfaceC8742a() { // from class: l.off
            @Override // com.p046p1.mobile.putong.core.p053ui.profile.views.FlowTagsView.InterfaceC8742a
            /* JADX INFO: renamed from: a */
            public final void mo52914a() {
                tff.m188690T();
            }
        });
        this.f169972v.setTags(m188700b0(this.f169971u));
        User userM94569i2 = m51172x().m94569i2();
        if (vwb.m200296J(sa40.m182802o().m182838v(userM94569i2)) || userM94569i2.pictures.size() >= 9) {
            xdl0.m208344M(this.f169973w, false);
        } else {
            xdl0.m208344M(this.f169973w, true);
            o6j0.m162864h("e_tag_add_photo_guidance", "p_edit_profile_view", new o6j0.C18854a[0]);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m188702d0(View view) {
        this.f169974x.m105113b();
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m188703e0(UserTagData userTagData, VListCell vListCell, VListCell.C22545a c22545a, int i) {
        List<String> listM182842z = sa40.m182802o().m182842z();
        if (!vwb.m200296J(listM182842z)) {
            listM182842z.remove(userTagData.f20527id);
            sa40.m182802o().m182822T(listM182842z);
            mo51174z();
            if (vwb.m200296J(this.f169971u.tags)) {
                m51172x().mo51067J3();
            }
        }
        this.f169974x.m105113b();
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m188704f0(final UserTagData userTagData, View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("删除标签");
        c40 c40VarM105153F = new c40.C16057b(m51172x().act()).m105156I("取消").m105168U(new View.OnClickListener() { // from class: l.rff
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f159146a.m188702d0(view2);
            }
        }).m105164Q(arrayList).m105163P(eqh0.m117752c(3)).m105169V(new c40.InterfaceC16059d() { // from class: l.sff
            @Override // p149l.c40.InterfaceC16059d
            /* JADX INFO: renamed from: a */
            public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i) {
                this.f164288a.m188703e0(userTagData, vListCell, c22545a, i);
            }
        }).m105153F();
        this.f169974x = c40VarM105153F;
        c40VarM105153F.m105117f();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: m */
    public String mo51161m() {
        return "我的标签";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: n */
    public String mo51162n() {
        return "tag";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: q */
    public void mo51165q(View view) {
        super.mo51165q(view);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: r */
    public boolean mo51166r() {
        User userM94569i2 = m51172x().m94569i2();
        if (userM94569i2 == null) {
            return false;
        }
        UserTagsData userTagsDataM182839w = sa40.m182802o().m182839w(userM94569i2);
        this.f169971u = userTagsDataM182839w;
        return (userTagsDataM182839w == null || vwb.m200296J(userTagsDataM182839w.tags)) ? false : true;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: y */
    public View mo51173y(ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(f6c0.f95269A2, (ViewGroup) null);
        this.f169972v = (FlowTagsView) viewInflate.findViewById(u4c0.f173866Id);
        this.f169973w = viewInflate.findViewById(u4c0.f174541x);
        return viewInflate;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: z */
    public void mo51174z() {
        m51146C(true);
        User userM94569i2 = m51172x().m94569i2();
        if (userM94569i2 != null) {
            this.f169971u = sa40.m182802o().m182839w(userM94569i2);
        }
        m188701c0();
        m51147D(new View.OnClickListener() { // from class: l.mff
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f133590a.m188697g0(view);
            }
        });
        xdl0.m208329E0(this.f169973w, new View.OnClickListener() { // from class: l.nff
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f138770a.m188698h0(view);
            }
        });
    }
}
