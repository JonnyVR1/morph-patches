package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.GroupCreate;
import com.p046p1.mobile.putong.core.newui.group.GroupCreateDescriptionAct;
import com.p046p1.mobile.putong.data.DetectCategoryType;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.util.AntiSpamHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class pck extends jq2<zck> {

    /* JADX INFO: renamed from: a */
    public GroupCreate f148182a;

    /* JADX INFO: renamed from: b */
    public Picture f148183b;

    public pck(mcr mcrVar) {
        super(mcrVar);
        this.f148182a = new GroupCreate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m168345j0(Bundle bundle) {
        ((zck) this.viewModel).m218059r();
    }

    private String pageId() {
        return ((PutongAct) act()).pageId();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        this.f148182a = (GroupCreate) act().getIntent().getSerializableExtra("group_create");
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.mck
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f133146a.m168345j0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public void m168346h0(View view) {
        CoreModule.m29935P().m94658i().mo158308T2(act());
        o6j0.m162859c("e_add_group_photo", pageId(), new o6j0.C18854a[0]);
    }

    /* JADX INFO: renamed from: i0 */
    public boolean m168347i0() {
        return (this.f148183b == null || TextUtils.isEmpty(this.f148182a.name)) ? false : true;
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m168348k0() {
        act().progressDismiss();
        act().startActivityForResult(GroupCreateDescriptionAct.m36542Z1(act(), this.f148182a, this.f148183b), 257);
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m168349l0() {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: m0 */
    public void m168350m0(View view) {
        o6j0.m162859c("e_add_group_name", pageId(), new o6j0.C18854a[0]);
    }

    /* JADX INFO: renamed from: n0 */
    public void m168351n0(View view) {
        o6j0.m162859c("e_group_next_step_button", pageId(), new o6j0.C18854a[0]);
        act().progress("");
        AntiSpamHelper.m80268c(act(), this.f148182a.name, DetectCategoryType.get(DetectCategoryType.group_profile), "group_name", pageId(), new d30() { // from class: l.nck
            @Override // p149l.d30
            public final void call() {
                this.f138178a.m168348k0();
            }
        }, new d30() { // from class: l.ock
            @Override // p149l.d30
            public final void call() {
                this.f143050a.m168349l0();
            }
        });
    }

    /* JADX INFO: renamed from: o0 */
    public void m168352o0(List<Media> list) {
        if (NullChecker.m81303a(list) && list.size() > 0 && (list.get(0) instanceof Picture)) {
            this.f148183b = (Picture) list.get(0);
        }
        ((zck) this.viewModel).m218058F(this.f148183b);
    }

    /* JADX INFO: renamed from: p0 */
    public void m168353p0(String str) {
        this.f148182a.name = str.trim();
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
