package p149l;

import android.os.Bundle;
import android.view.View;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.data.GroupAttribute;
import com.p046p1.mobile.putong.core.data.GroupCategory;
import com.p046p1.mobile.putong.core.data.GroupCreate;
import com.p046p1.mobile.putong.core.newui.group.GroupCreateNameAct;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class wbk extends jq2<zbk> {

    /* JADX INFO: renamed from: a */
    public List<GroupAttribute> f185600a;

    /* JADX INFO: renamed from: b */
    public GroupCreate f185601b;

    public wbk(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m202573h0(Bundle bundle) {
        ((zbk) this.viewModel).m217906r();
    }

    private String pageId() {
        return ((PutongAct) act()).pageId();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        this.f185600a = (ArrayList) act().getIntent().getSerializableExtra("group_attributes");
        if (act().getIntent().hasExtra("group_create")) {
            this.f185601b = (GroupCreate) act().getIntent().getSerializableExtra("group_create");
        } else {
            this.f185601b = GroupCreate.new_();
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.vbk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180857a.m202573h0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public void m202574f0(View view) {
        if (view.getTag() instanceof GroupCategory) {
            GroupCategory groupCategory = (GroupCategory) view.getTag();
            this.f185601b.category = groupCategory;
            act().startActivityForResult(GroupCreateNameAct.m36545Z1(act(), this.f185601b), 257);
            o6j0.m162861e("e_select_group_type", pageId(), new j760("group_type_id", groupCategory.f20405id));
        }
    }

    /* JADX INFO: renamed from: g0 */
    public List<GroupAttribute> m202575g0() {
        return this.f185600a;
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
