package p153l;

import android.os.Bundle;
import android.view.View;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.data.GroupAttribute;
import com.p051p1.mobile.putong.core.data.GroupCategory;
import com.p051p1.mobile.putong.core.data.GroupCreate;
import com.p051p1.mobile.putong.core.newui.group.GroupCreateNameAct;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mek extends ar2<pek> {

    /* JADX INFO: renamed from: a */
    public List<GroupAttribute> f136515a;

    /* JADX INFO: renamed from: b */
    public GroupCreate f136516b;

    public mek(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m158031h0(Bundle bundle) {
        ((pek) this.viewModel).m172045r();
    }

    private String pageId() {
        return ((PutongAct) act()).pageId();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        this.f136515a = (ArrayList) act().getIntent().getSerializableExtra("group_attributes");
        if (act().getIntent().hasExtra("group_create")) {
            this.f136516b = (GroupCreate) act().getIntent().getSerializableExtra("group_create");
        } else {
            this.f136516b = GroupCreate.new_();
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.lek
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f131765a.m158031h0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public void m158032f0(View view) {
        if (view.getTag() instanceof GroupCategory) {
            GroupCategory groupCategory = (GroupCategory) view.getTag();
            this.f136516b.category = groupCategory;
            act().startActivityForResult(GroupCreateNameAct.m37548a2(act(), this.f136516b), 257);
            sfj0.m185598e("e_select_group_type", pageId(), new pf60("group_type_id", groupCategory.f21147id));
        }
    }

    /* JADX INFO: renamed from: g0 */
    public List<GroupAttribute> m158033g0() {
        return this.f136515a;
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
