package p009l;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.p000p1.mobile.putong.core.newui.group.GroupCreateDescriptionAct;
import com.p000p1.mobile.putong.util.AntiSpamHelper;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.GroupCreate;
import com.p1.mobile.putong.data.DetectCategoryType;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.d30;
import l.e30;
import l.jq2;
import l.mcr;
import l.o6j0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class pck extends jq2<zck> {

    /* JADX INFO: renamed from: a */
    public GroupCreate f18466a;

    /* JADX INFO: renamed from: b */
    public Picture f18467b;

    public pck(mcr mcrVar) {
        super(mcrVar);
        this.f18466a = new GroupCreate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m20128j0(Bundle bundle) {
        ((zck) ((jq2) this).viewModel).m25691r();
    }

    private String pageId() {
        return act().pageId();
    }

    /* JADX INFO: renamed from: Z */
    public void m20129Z() {
        super.Z();
        this.f18466a = act().getIntent().getSerializableExtra("group_create");
    }

    /* JADX INFO: renamed from: a0 */
    public void m20130a0() {
        super.a0();
        creates(new e30() { // from class: l.mck
            public final void call(Object obj) {
                this.f16800a.m20128j0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public void m20131h0(View view) {
        CoreModule.P().i().T2(act());
        o6j0.c("e_add_group_photo", pageId(), new o6j0.a[0]);
    }

    /* JADX INFO: renamed from: i0 */
    public boolean m20132i0() {
        return (this.f18467b == null || TextUtils.isEmpty(this.f18466a.name)) ? false : true;
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m20133k0() {
        act().progressDismiss();
        act().startActivityForResult(GroupCreateDescriptionAct.m473Z1(act(), this.f18466a, this.f18467b), 257);
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m20134l0() {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: m0 */
    public void m20135m0(View view) {
        o6j0.c("e_add_group_name", pageId(), new o6j0.a[0]);
    }

    /* JADX INFO: renamed from: n0 */
    public void m20136n0(View view) {
        o6j0.c("e_group_next_step_button", pageId(), new o6j0.a[0]);
        act().progress("");
        AntiSpamHelper.m10619c(act(), this.f18466a.name, DetectCategoryType.get("group_profile"), "group_name", pageId(), new d30() { // from class: l.nck
            public final void call() {
                this.f17405a.m20133k0();
            }
        }, new d30() { // from class: l.ock
            public final void call() {
                this.f17898a.m20134l0();
            }
        });
    }

    /* JADX INFO: renamed from: o0 */
    public void m20137o0(List<Media> list) {
        if (NullChecker.a(list) && list.size() > 0 && (list.get(0) instanceof Picture)) {
            this.f18467b = list.get(0);
        }
        ((zck) ((jq2) this).viewModel).m25689F(this.f18467b);
    }

    /* JADX INFO: renamed from: p0 */
    public void m20138p0(String str) {
        this.f18466a.name = str.trim();
    }

    public void destroy() {
    }
}
