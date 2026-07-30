package p009l;

import android.os.Bundle;
import android.view.View;
import com.p000p1.mobile.putong.core.newui.group.GroupCreateNameAct;
import com.p1.mobile.putong.core.data.GroupAttribute;
import com.p1.mobile.putong.core.data.GroupCategory;
import com.p1.mobile.putong.core.data.GroupCreate;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.j760;
import l.jq2;
import l.mcr;
import l.o6j0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class wbk extends jq2<zbk> {

    /* JADX INFO: renamed from: a */
    public List<GroupAttribute> f21993a;

    /* JADX INFO: renamed from: b */
    public GroupCreate f21994b;

    public wbk(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m24046h0(Bundle bundle) {
        ((zbk) ((jq2) this).viewModel).m25644r();
    }

    private String pageId() {
        return act().pageId();
    }

    /* JADX INFO: renamed from: Z */
    public void m24047Z() {
        super.Z();
        this.f21993a = (ArrayList) act().getIntent().getSerializableExtra("group_attributes");
        if (act().getIntent().hasExtra("group_create")) {
            this.f21994b = act().getIntent().getSerializableExtra("group_create");
        } else {
            this.f21994b = GroupCreate.new_();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m24048a0() {
        super.a0();
        creates(new e30() { // from class: l.vbk
            public final void call(Object obj) {
                this.f21520a.m24046h0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public void m24049f0(View view) {
        if (view.getTag() instanceof GroupCategory) {
            GroupCategory groupCategory = (GroupCategory) view.getTag();
            this.f21994b.category = groupCategory;
            act().startActivityForResult(GroupCreateNameAct.m478Z1(act(), this.f21994b), 257);
            o6j0.e("e_select_group_type", pageId(), new j760[]{new j760("group_type_id", groupCategory.id)});
        }
    }

    /* JADX INFO: renamed from: g0 */
    public List<GroupAttribute> m24050g0() {
        return this.f21993a;
    }

    public void destroy() {
    }
}
