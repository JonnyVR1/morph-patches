package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.GroupCreate;
import com.p051p1.mobile.putong.core.newui.group.GroupCreateDescriptionAct;
import com.p051p1.mobile.putong.data.DetectCategoryType;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.util.AntiSpamHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class ffk extends ar2<pfk> {

    /* JADX INFO: renamed from: a */
    public GroupCreate f98788a;

    /* JADX INFO: renamed from: b */
    public Picture f98789b;

    public ffk(ner nerVar) {
        super(nerVar);
        this.f98788a = new GroupCreate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m125392j0(Bundle bundle) {
        ((pfk) this.viewModel).m172127r();
    }

    private String pageId() {
        return ((PutongAct) act()).pageId();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        this.f98788a = (GroupCreate) act().getIntent().getSerializableExtra("group_create");
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.cfk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f81511a.m125392j0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public void m125393h0(View view) {
        CoreModule.m30933P().m143412i().mo180400T2(act());
        sfj0.m185596c("e_add_group_photo", pageId(), new sfj0.C20032a[0]);
    }

    /* JADX INFO: renamed from: i0 */
    public boolean m125394i0() {
        return (this.f98789b == null || TextUtils.isEmpty(this.f98788a.name)) ? false : true;
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m125395k0() {
        act().progressDismiss();
        act().startActivityForResult(GroupCreateDescriptionAct.m37545a2(act(), this.f98788a, this.f98789b), 257);
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m125396l0() {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: m0 */
    public void m125397m0(View view) {
        sfj0.m185596c("e_add_group_name", pageId(), new sfj0.C20032a[0]);
    }

    /* JADX INFO: renamed from: n0 */
    public void m125398n0(View view) {
        sfj0.m185596c("e_group_next_step_button", pageId(), new sfj0.C20032a[0]);
        act().progress("");
        AntiSpamHelper.m81451c(act(), this.f98788a.name, DetectCategoryType.get(DetectCategoryType.group_profile), "group_name", pageId(), new x20() { // from class: l.dfk
            @Override // p153l.x20
            public final void call() {
                this.f88164a.m125395k0();
            }
        }, new x20() { // from class: l.efk
            @Override // p153l.x20
            public final void call() {
                this.f93791a.m125396l0();
            }
        });
    }

    /* JADX INFO: renamed from: o0 */
    public void m125399o0(List<Media> list) {
        if (NullChecker.m82486a(list) && list.size() > 0 && (list.get(0) instanceof Picture)) {
            this.f98789b = (Picture) list.get(0);
        }
        ((pfk) this.viewModel).m172126F(this.f98789b);
    }

    /* JADX INFO: renamed from: p0 */
    public void m125400p0(String str) {
        this.f98788a.name = str.trim();
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
