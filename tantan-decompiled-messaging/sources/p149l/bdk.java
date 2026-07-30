package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.data.GroupAttribute;
import com.p046p1.mobile.putong.core.data.GroupCreate;
import com.p046p1.mobile.putong.core.newui.group.GroupCreateCategoryAct;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class bdk extends jq2<fdk> {

    /* JADX INFO: renamed from: a */
    public List<GroupAttribute> f75040a;

    /* JADX INFO: renamed from: b */
    public GroupCreate f75041b;

    public bdk(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m101180f0(Bundle bundle) {
        ((fdk) this.viewModel).m120994r();
    }

    private String pageId() {
        return ((PutongAct) act()).pageId();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        this.f75040a = (ArrayList) act().getIntent().getSerializableExtra("group_attributes");
        this.f75041b = GroupCreate.new_();
        if (m101183i0()) {
            m101182h0();
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.adk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f68945a.m101180f0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public void m101181g0(String str) {
        this.f75041b.type = str;
        act().startActivityForResult(GroupCreateCategoryAct.m36538Z1(act(), this.f75040a, this.f75041b), 257);
        o6j0.m162861e("e_select_group_type_step_one", pageId(), new j760("is_anonymou_group", Integer.valueOf("anonymous".equals(str) ? 1 : 0)));
    }

    /* JADX INFO: renamed from: h0 */
    public final void m101182h0() {
        if (vwb.m200296J(this.f75040a)) {
            return;
        }
        this.f75041b.type = this.f75040a.get(0).creationType.defaultType;
        act().startActivity(GroupCreateCategoryAct.m36538Z1(act(), this.f75040a, this.f75041b));
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: i0 */
    public final boolean m101183i0() {
        if (vwb.m200296J(this.f75040a)) {
            return false;
        }
        return !this.f75040a.get(0).creationType.selectable;
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
