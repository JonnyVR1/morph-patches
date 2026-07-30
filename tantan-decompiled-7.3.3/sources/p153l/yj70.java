package p153l;

import android.content.Intent;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.putong.common.R$string;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.oms.OmsDialog;
import com.p051p1.mobile.putong.core.p058ui.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.OMSAction;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.oms.OmsBaseRender;
import com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes11.dex */
public class yj70 extends c4k0 {
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ C22421c m216392g(List list) {
        User user = new User();
        ArrayList arrayList = new ArrayList(uqb0.f180396b0.f170325b.me_().pictures);
        arrayList.remove(0);
        arrayList.add(0, (Media) list.get(0));
        user.pictures = arrayList;
        return uqb0.f180396b0.f170325b.patch(user);
    }

    @Override // p153l.c4k0
    /* JADX INFO: renamed from: c */
    public boolean mo106291c(OMSAction oMSAction) {
        boolean zEquals = OmsDialog.good_to_fake.getIdentifier().equals(this.f79710a.f55070b.identifier);
        OmsBaseRender omsBaseRender = this.f79710a;
        if (!zEquals) {
            Act act = omsBaseRender.f55069a;
            act.startActivityForResult(MediaPickerAct.m48968h2(act, 1, false, false, true, null, MediaPickerAct.f31471D, false, true, CoreModule.f18264c.f20381e0.m116600p9().gender), new C4468a.a() { // from class: l.uj70
                @Override // com.p051p1.mobile.android.app.C4468a.a
                /* JADX INFO: renamed from: a */
                public final boolean mo21400a(int i, int i2, Intent intent) {
                    return this.f179184a.m216397l(i, i2, intent);
                }
            });
            return true;
        }
        Act act2 = omsBaseRender.f55069a;
        act2.startActivityForResult(MediaPickerAct.m48968h2(act2, 1, false, false, true, "fake_to_good_dlg", MediaPickerAct.f31471D, false, true, CoreModule.f18264c.f20381e0.m116600p9().gender), 19);
        m107886b();
        return true;
    }

    @Override // p153l.c4k0
    /* JADX INFO: renamed from: d */
    public String mo106292d() {
        return "photochange";
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m216395j(uxj0 uxj0Var) {
        this.f79710a.f55069a.progressDismiss();
        m107886b();
        CoreModule.f18264c.f20381e0.m116625va(App.f16092i.get().intValue());
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m216396k(Throwable th) {
        this.f79710a.f55069a.progressDismiss();
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ boolean m216397l(int i, int i2, Intent intent) {
        if (i2 != -1) {
            return true;
        }
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f55451h);
        this.f79710a.f55069a.progress(R$string.f18108W);
        yb5.m214980I(arrayList, "profile").compose(psd0.m173592C()).flatMap(new qcj() { // from class: l.vj70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return yj70.m216392g((List) obj);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.wj70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f189421a.m216395j((uxj0) obj);
            }
        }, new y20() { // from class: l.xj70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f194541a.m216396k((Throwable) obj);
            }
        }));
        return true;
    }
}
