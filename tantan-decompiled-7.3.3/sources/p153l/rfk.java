package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.data.GroupAttribute;
import com.p051p1.mobile.putong.core.data.GroupCreate;
import com.p051p1.mobile.putong.core.newui.group.GroupCreateCategoryAct;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class rfk extends ar2<vfk> {

    /* JADX INFO: renamed from: a */
    public List<GroupAttribute> f162807a;

    /* JADX INFO: renamed from: b */
    public GroupCreate f162808b;

    public rfk(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m181227f0(Bundle bundle) {
        ((vfk) this.viewModel).m201174r();
    }

    private String pageId() {
        return ((PutongAct) act()).pageId();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        this.f162807a = (ArrayList) act().getIntent().getSerializableExtra("group_attributes");
        this.f162808b = GroupCreate.new_();
        if (m181230i0()) {
            m181229h0();
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.qfk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f157309a.m181227f0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public void m181228g0(String str) {
        this.f162808b.type = str;
        act().startActivityForResult(GroupCreateCategoryAct.m37541a2(act(), this.f162807a, this.f162808b), 257);
        sfj0.m185598e("e_select_group_type_step_one", pageId(), new pf60("is_anonymou_group", Integer.valueOf("anonymous".equals(str) ? 1 : 0)));
    }

    /* JADX INFO: renamed from: h0 */
    public final void m181229h0() {
        if (jyb.m147479J(this.f162807a)) {
            return;
        }
        this.f162808b.type = this.f162807a.get(0).creationType.defaultType;
        act().startActivity(GroupCreateCategoryAct.m37541a2(act(), this.f162807a, this.f162808b));
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: i0 */
    public final boolean m181230i0() {
        if (jyb.m147479J(this.f162807a)) {
            return false;
        }
        return !this.f162807a.get(0).creationType.selectable;
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
