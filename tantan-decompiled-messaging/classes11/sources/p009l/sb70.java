package p009l;

import android.content.Intent;
import com.p000p1.mobile.putong.core.oms.OmsDialog;
import com.p000p1.mobile.putong.oms.OmsBaseRender;
import com.p000p1.mobile.putong.p004ui.mediapicker.MediaPickerBaseAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.app.a;
import com.p1.mobile.putong.common.R;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.mediapicker.MediaPickerAct;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.OMSAction;
import com.p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.mkd0;
import l.qib0;
import l.roj0;
import l.w9j;
import l.ya5;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class sb70 extends zuj0 {
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ c m22038g(List list) {
        User user = new User();
        ArrayList arrayList = new ArrayList(qib0.b0.b.me_().pictures);
        arrayList.remove(0);
        arrayList.add(0, (Media) list.get(0));
        user.pictures = arrayList;
        return qib0.b0.b.patch(user);
    }

    @Override // p009l.zuj0
    /* JADX INFO: renamed from: c */
    public boolean mo11784c(OMSAction oMSAction) {
        boolean zEquals = OmsDialog.good_to_fake.getIdentifier().equals(this.f23916a.f7828b.identifier);
        OmsBaseRender omsBaseRender = this.f23916a;
        if (!zEquals) {
            Act act = omsBaseRender.f7827a;
            act.startActivityForResult(MediaPickerAct.g2(act, 1, false, false, true, (String) null, MediaPickerAct.D, false, true, CoreModule.c.e0.p9().gender), new a.a() { // from class: l.ob70
                /* JADX INFO: renamed from: a */
                public final boolean m19657a(int i, int i2, Intent intent) {
                    return this.f17890a.m22043l(i, i2, intent);
                }
            });
            return true;
        }
        Act act2 = omsBaseRender.f7827a;
        act2.startActivityForResult(MediaPickerAct.g2(act2, 1, false, false, true, "fake_to_good_dlg", MediaPickerAct.D, false, true, CoreModule.c.e0.p9().gender), 19);
        m25982b();
        return true;
    }

    @Override // p009l.zuj0
    /* JADX INFO: renamed from: d */
    public String mo11785d() {
        return "photochange";
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m22041j(roj0 roj0Var) {
        this.f23916a.f7827a.progressDismiss();
        m25982b();
        CoreModule.c.e0.va(((Integer) App.i.get()).intValue());
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m22042k(Throwable th) {
        this.f23916a.f7827a.progressDismiss();
        yij0.m25382D(th);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ boolean m22043l(int i, int i2, Intent intent) {
        if (i2 != -1) {
            return true;
        }
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f8209h);
        this.f23916a.f7827a.progress(R.string.W);
        ya5.I(arrayList, "profile").compose(mkd0.C()).flatMap(new w9j() { // from class: l.pb70
            public final Object call(Object obj) {
                return sb70.m22038g((List) obj);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.qb70
            public final void call(Object obj) {
                this.f19126a.m22041j((roj0) obj);
            }
        }, new e30() { // from class: l.rb70
            public final void call(Object obj) {
                this.f19719a.m22042k((Throwable) obj);
            }
        }));
        return true;
    }
}
