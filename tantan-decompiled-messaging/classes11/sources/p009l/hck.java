package p009l;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.p000p1.mobile.putong.util.AntiSpamHelper;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.GroupCreate;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.DetectCategoryType;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.o6j0;
import l.osi0;
import l.roj0;
import l.vwb;
import l.w9j;
import l.ya5;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class hck extends jq2<lck> {

    /* JADX INFO: renamed from: a */
    public GroupCreate f13961a;

    /* JADX INFO: renamed from: b */
    public Picture f13962b;

    public hck(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m15535e0(List list, Media media) {
        if (media instanceof Picture) {
            list.add((Picture) media);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ List m15540j0(List list) {
        final ArrayList arrayList = new ArrayList(1);
        vwb.z(list, new e30() { // from class: l.gck
            public final void call(Object obj) {
                hck.m15535e0(arrayList, (Media) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m15542n0(Bundle bundle) {
        ((lck) ((jq2) this).viewModel).m17825r();
    }

    private String pageId() {
        return act().pageId();
    }

    /* JADX INFO: renamed from: Z */
    public void m15543Z() {
        super.Z();
        this.f13961a = act().getIntent().getSerializableExtra("group_create");
        this.f13962b = act().getIntent().getSerializableExtra("picture");
    }

    /* JADX INFO: renamed from: a0 */
    public void m15544a0() {
        super.a0();
        creates(new e30() { // from class: l.ack
            public final void call(Object obj) {
                this.f9399a.m15542n0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public boolean m15545l0() {
        return !TextUtils.isEmpty(this.f13961a.description);
    }

    /* JADX INFO: renamed from: m0 */
    public void m15546m0(View view) {
        o6j0.c("e_add_group_state", pageId(), new o6j0.a[0]);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ c m15547o0(roj0 roj0Var) {
        return ya5.I(vwb.f0(new Media[]{this.f13962b}), "group-create").map(new w9j() { // from class: l.fck
            public final Object call(Object obj) {
                return hck.m15540j0((List) obj);
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ c m15548p0(List list) {
        return CoreModule.c.g0.P6(this.f13961a, list);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m15549q0(roj0 roj0Var) {
        act().progressDismiss();
        lsi0.w(R.string.E0);
        act().setResult(-1);
        act().finish();
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m15550r0(Throwable th) {
        act().progressDismiss();
        if (th instanceof AntiSpamHelper.AntispamException) {
            osi0.g(th.getMessage());
        } else {
            CoreModule.P().i().d(th);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m15551s0(View view) {
        o6j0.c("e_group_complete_button", pageId(), new o6j0.a[0]);
        act().progress("");
        duringCreated(AntiSpamHelper.m10618b(act(), this.f13961a.description, DetectCategoryType.get("group_profile"), "group_description", pageId()).switchMap(new w9j() { // from class: l.bck
            public final Object call(Object obj) {
                return this.f10011a.m15547o0((roj0) obj);
            }
        }).flatMap(new w9j() { // from class: l.cck
            public final Object call(Object obj) {
                return this.f10526a.m15548p0((List) obj);
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.dck
            public final void call(Object obj) {
                this.f11727a.m15549q0((roj0) obj);
            }
        }, new e30() { // from class: l.eck
            public final void call(Object obj) {
                this.f12504a.m15550r0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t0 */
    public void m15552t0(String str) {
        this.f13961a.description = str;
    }

    public void destroy() {
    }
}
