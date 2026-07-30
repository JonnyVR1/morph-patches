package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.data.UserTagData;
import com.p051p1.mobile.putong.core.data.UserTagsData;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.ExpTagView;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8802c;
import com.p051p1.mobile.putong.core.p058ui.profile.views.FlowTagsView;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p151v.VListCell;

/* JADX INFO: loaded from: classes4.dex */
public class zgf extends AbstractC8802c {

    /* JADX INFO: renamed from: u */
    public UserTagsData f204294u;

    /* JADX INFO: renamed from: v */
    public FlowTagsView f204295v;

    /* JADX INFO: renamed from: w */
    public View f204296w;

    /* JADX INFO: renamed from: x */
    public w30 f204297x;

    public zgf(@NonNull @NotNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m219603T() {
    }

    /* JADX INFO: renamed from: Z */
    public static HashMap<String, String> m219609Z() {
        HashMap<String, String> map = new HashMap<>();
        if (zwk.m221905e()) {
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
    public /* synthetic */ void m219610g0(View view) {
        gj40.m130415o().m130423H(m52355x().mo52249J1(), 3001, m52355x().mo52252K2(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m219611h0(View view) {
        sfj0.m185596c("e_tag_add_photo_guidance", "p_edit_profile_view", new sfj0.C20032a[0]);
        a2i0.m95674b().m95678e(m52355x().m189086i2().mo225055clone());
        mkf.m158776M((PutongAct) this.f204295v.getContext(), false, false);
    }

    /* JADX INFO: renamed from: a0 */
    public View m219612a0(final UserTagData userTagData, final HashMap<String, String> map) {
        ExpTagView expTagView = new ExpTagView(m52355x().act());
        int i = bnl0.f77545f;
        expTagView.setLayoutParams(new ViewGroup.LayoutParams(i, i));
        String str = (String) jyb.m147529r(userTagData.categories, new qcj() { // from class: l.vgf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(map.get((String) obj) != null);
            }
        });
        expTagView.m52145e(userTagData.title, str == null ? "https://auto.tancdn.com/v1/images/eyJpZCI6IktPV0g3U0hGRUhQQVpQUUs0STdXNkxSUzVDRzRaNDE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.png" : map.get(str));
        bnl0.m105509E0(expTagView, new View.OnClickListener() { // from class: l.wgf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188970a.m219617f0(userTagData, view);
            }
        });
        return expTagView;
    }

    /* JADX INFO: renamed from: b0 */
    public List<View> m219613b0(UserTagsData userTagsData) {
        if (!NullChecker.m82486a(userTagsData)) {
            return null;
        }
        List<UserTagData> list = userTagsData.tags;
        ArrayList arrayList = new ArrayList();
        HashMap<String, String> mapM219609Z = m219609Z();
        for (UserTagData userTagData : list) {
            if (NullChecker.m82486a(userTagData)) {
                arrayList.add(m219612a0(userTagData, mapM219609Z));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m219614c0() {
        UserTagsData userTagsData = this.f204294u;
        if (userTagsData == null || jyb.m147479J(userTagsData.tags)) {
            return;
        }
        this.f204295v.setMaxLines(3);
        this.f204295v.setCallBack(new FlowTagsView.InterfaceC8905a() { // from class: l.ugf
            @Override // com.p051p1.mobile.putong.core.p058ui.profile.views.FlowTagsView.InterfaceC8905a
            /* JADX INFO: renamed from: a */
            public final void mo54097a() {
                zgf.m219603T();
            }
        });
        this.f204295v.setTags(m219613b0(this.f204294u));
        User userM189086i2 = m52355x().m189086i2();
        if (jyb.m147479J(gj40.m130415o().m130451v(userM189086i2)) || userM189086i2.pictures.size() >= 9) {
            bnl0.m105524M(this.f204296w, false);
        } else {
            bnl0.m105524M(this.f204296w, true);
            sfj0.m185601h("e_tag_add_photo_guidance", "p_edit_profile_view", new sfj0.C20032a[0]);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m219615d0(View view) {
        this.f204297x.m204614b();
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m219616e0(UserTagData userTagData, VListCell vListCell, VListCell.C22660a c22660a, int i) {
        List<String> listM130455z = gj40.m130415o().m130455z();
        if (!jyb.m147479J(listM130455z)) {
            listM130455z.remove(userTagData.f21269id);
            gj40.m130415o().m130435T(listM130455z);
            mo52357z();
            if (jyb.m147479J(this.f204294u.tags)) {
                m52355x().mo52250J3();
            }
        }
        this.f204297x.m204614b();
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m219617f0(final UserTagData userTagData, View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("删除标签");
        w30 w30VarM204654F = new w30.C21001b(m52355x().act()).m204657I("取消").m204669U(new View.OnClickListener() { // from class: l.xgf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f194185a.m219615d0(view2);
            }
        }).m204665Q(arrayList).m204664P(lyh0.m156283c(3)).m204670V(new w30.InterfaceC21003d() { // from class: l.ygf
            @Override // p153l.w30.InterfaceC21003d
            /* JADX INFO: renamed from: a */
            public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i) {
                this.f199825a.m219616e0(userTagData, vListCell, c22660a, i);
            }
        }).m204654F();
        this.f204297x = w30VarM204654F;
        w30VarM204654F.m204618f();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: m */
    public String mo52344m() {
        return "我的标签";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: n */
    public String mo52345n() {
        return "tag";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: q */
    public void mo52348q(View view) {
        super.mo52348q(view);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: r */
    public boolean mo52349r() {
        User userM189086i2 = m52355x().m189086i2();
        if (userM189086i2 == null) {
            return false;
        }
        UserTagsData userTagsDataM130452w = gj40.m130415o().m130452w(userM189086i2);
        this.f204294u = userTagsDataM130452w;
        return (userTagsDataM130452w == null || jyb.m147479J(userTagsDataM130452w.tags)) ? false : true;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: y */
    public View mo52356y(ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(kec0.f125318A2, (ViewGroup) null);
        this.f204295v = (FlowTagsView) viewInflate.findViewById(adc0.f69988Kd);
        this.f204296w = viewInflate.findViewById(adc0.f70632x);
        return viewInflate;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: z */
    public void mo52357z() {
        m52329C(true);
        User userM189086i2 = m52355x().m189086i2();
        if (userM189086i2 != null) {
            this.f204294u = gj40.m130415o().m130452w(userM189086i2);
        }
        m219614c0();
        m52330D(new View.OnClickListener() { // from class: l.sgf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f167847a.m219610g0(view);
            }
        });
        bnl0.m105509E0(this.f204296w, new View.OnClickListener() { // from class: l.tgf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f174076a.m219611h0(view);
            }
        });
    }
}
