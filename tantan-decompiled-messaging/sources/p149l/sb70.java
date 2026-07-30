package p149l;

import android.content.Intent;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.putong.common.R$string;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.oms.OmsDialog;
import com.p046p1.mobile.putong.core.p053ui.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.OMSAction;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.oms.OmsBaseRender;
import com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class sb70 extends zuj0 {
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ C22306c m183199g(List list) {
        User user = new User();
        ArrayList arrayList = new ArrayList(qib0.f154713b0.f139231b.me_().pictures);
        arrayList.remove(0);
        arrayList.add(0, (Media) list.get(0));
        user.pictures = arrayList;
        return qib0.f154713b0.f139231b.patch(user);
    }

    @Override // p149l.zuj0
    /* JADX INFO: renamed from: c */
    public boolean mo99645c(OMSAction oMSAction) {
        boolean zEquals = OmsDialog.good_to_fake.getIdentifier().equals(this.f204856a.f54222b.identifier);
        OmsBaseRender omsBaseRender = this.f204856a;
        if (!zEquals) {
            Act act = omsBaseRender.f54221a;
            act.startActivityForResult(MediaPickerAct.m47785g2(act, 1, false, false, true, null, MediaPickerAct.f30623D, false, true, CoreModule.f17545c.f19639e0.m169527p9().gender), new C4317a.a() { // from class: l.ob70
                @Override // com.p046p1.mobile.android.app.C4317a.a
                /* JADX INFO: renamed from: a */
                public final boolean mo20401a(int i, int i2, Intent intent) {
                    return this.f142888a.m183204l(i, i2, intent);
                }
            });
            return true;
        }
        Act act2 = omsBaseRender.f54221a;
        act2.startActivityForResult(MediaPickerAct.m47785g2(act2, 1, false, false, true, "fake_to_good_dlg", MediaPickerAct.f30623D, false, true, CoreModule.f17545c.f19639e0.m169527p9().gender), 19);
        m220231b();
        return true;
    }

    @Override // p149l.zuj0
    /* JADX INFO: renamed from: d */
    public String mo99646d() {
        return "photochange";
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m183202j(roj0 roj0Var) {
        this.f204856a.f54221a.progressDismiss();
        m220231b();
        CoreModule.f17545c.f19639e0.m169552va(App.f15373i.get().intValue());
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m183203k(Throwable th) {
        this.f204856a.f54221a.progressDismiss();
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ boolean m183204l(int i, int i2, Intent intent) {
        if (i2 != -1) {
            return true;
        }
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f54603h);
        this.f204856a.f54221a.progress(R$string.f17389W);
        ya5.m213793I(arrayList, "profile").compose(mkd0.m154951C()).flatMap(new w9j() { // from class: l.pb70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return sb70.m183199g((List) obj);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.qb70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f153630a.m183202j((roj0) obj);
            }
        }, new e30() { // from class: l.rb70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f158589a.m183203k((Throwable) obj);
            }
        }));
        return true;
    }
}
