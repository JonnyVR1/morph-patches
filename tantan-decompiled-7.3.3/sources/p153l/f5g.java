package p153l;

import android.content.Intent;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public class f5g {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m124123a(Act act, int i, int i2, Intent intent) {
        if (i2 != -1) {
            return false;
        }
        m124129g(act, (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f55451h), intent.getStringExtra("from"));
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m124124b(Act act, ArrayList arrayList, String str, uxj0 uxj0Var) {
        act.progressDismiss();
        CoreModule.f18264c.f20381e0.m116625va(App.f16092i.get().intValue());
        qtk.m178003V0(act, false, (Media) arrayList.get(0), act.string(R$string.f18307Al), new Runnable() { // from class: l.e5g
            @Override // java.lang.Runnable
            public final void run() {
                f5g.m124127e();
            }
        });
        if (TextUtils.equals(str, "fake_to_good_dlg")) {
            fph0.m126636G();
        } else if (TextUtils.equals(str, "fakeView")) {
            fph0.m126691v();
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m124125c(Act act, Throwable th) {
        act.progressDismiss();
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C22421c m124126d(List list) {
        User user = new User();
        ArrayList arrayList = new ArrayList(CoreModule.f18264c.f20381e0.m116600p9().pictures);
        arrayList.remove(0);
        arrayList.add(0, (Media) list.get(0));
        user.pictures = arrayList;
        return CoreModule.f18264c.f20381e0.m116620u9(user);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m124127e() {
    }

    /* JADX INFO: renamed from: f */
    public static boolean m124128f() {
        int iM105588w0 = bnl0.m105588w0();
        return iM105588w0 >= 960 && ((int) (((float) iM105588w0) / qa00.m175858c().density)) < 720;
    }

    /* JADX INFO: renamed from: g */
    public static void m124129g(final Act act, final ArrayList<Media> arrayList, final String str) {
        act.progress(R$string.f18632L5);
        yb5.m214980I(arrayList, "profile").compose(psd0.m173592C()).flatMap(new qcj() { // from class: l.b5g
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return f5g.m124126d((List) obj);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.c5g
            @Override // p153l.y20
            public final void call(Object obj) {
                f5g.m124124b(act, arrayList, str, (uxj0) obj);
            }
        }, new y20() { // from class: l.d5g
            @Override // p153l.y20
            public final void call(Object obj) {
                f5g.m124125c(act, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h */
    public static void m124130h(final Act act) {
        act.startActivityForResult(MediaPickerAct.m80102Y1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(bnl0.m105592y0() - qa00.m175859d(40.0f)).build()).withFromType(1).build()), new C4468a.a() { // from class: l.a5g
            @Override // com.p051p1.mobile.android.app.C4468a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo21400a(int i, int i2, Intent intent) {
                return f5g.m124123a(act, i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static void m124131i(Act act, Frag frag, int i) {
        frag.startActivityForResult(MediaPickerAct.m80102Y1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(bnl0.m105592y0() - qa00.m175859d(40.0f)).build()).withFromType(1).build()), i);
    }
}
