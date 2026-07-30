package p009l;

import android.os.Bundle;
import com.p000p1.mobile.putong.core.newui.group.GroupCreateCategoryAct;
import com.p1.mobile.putong.core.data.GroupAttribute;
import com.p1.mobile.putong.core.data.GroupCreate;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.j760;
import l.jq2;
import l.mcr;
import l.o6j0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class bdk extends jq2<fdk> {

    /* JADX INFO: renamed from: a */
    public List<GroupAttribute> f10022a;

    /* JADX INFO: renamed from: b */
    public GroupCreate f10023b;

    public bdk(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m11963f0(Bundle bundle) {
        ((fdk) ((jq2) this).viewModel).m14404r();
    }

    private String pageId() {
        return act().pageId();
    }

    /* JADX INFO: renamed from: Z */
    public void m11964Z() {
        super.Z();
        this.f10022a = (ArrayList) act().getIntent().getSerializableExtra("group_attributes");
        this.f10023b = GroupCreate.new_();
        if (m11968i0()) {
            m11967h0();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m11965a0() {
        super.a0();
        creates(new e30() { // from class: l.adk
            public final void call(Object obj) {
                this.f9423a.m11963f0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public void m11966g0(String str) {
        this.f10023b.type = str;
        act().startActivityForResult(GroupCreateCategoryAct.m467Z1(act(), this.f10022a, this.f10023b), 257);
        o6j0.e("e_select_group_type_step_one", pageId(), new j760[]{new j760("is_anonymou_group", Integer.valueOf("anonymous".equals(str) ? 1 : 0))});
    }

    /* JADX INFO: renamed from: h0 */
    public final void m11967h0() {
        if (vwb.J(this.f10022a)) {
            return;
        }
        this.f10023b.type = this.f10022a.get(0).creationType.defaultType;
        act().startActivity(GroupCreateCategoryAct.m467Z1(act(), this.f10022a, this.f10023b));
        act().finish();
    }

    /* JADX INFO: renamed from: i0 */
    public final boolean m11968i0() {
        if (vwb.J(this.f10022a)) {
            return false;
        }
        return !this.f10022a.get(0).creationType.selectable;
    }

    public void destroy() {
    }
}
