package p149l;

import android.content.Intent;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes10.dex */
public class r3g {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m177662a(Act act, int i, int i2, Intent intent) {
        if (i2 != -1) {
            return false;
        }
        m177668g(act, (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f54603h), intent.getStringExtra("from"));
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m177663b(Act act, ArrayList arrayList, String str, roj0 roj0Var) {
        act.progressDismiss();
        CoreModule.f17545c.f19639e0.m169552va(App.f15373i.get().intValue());
        ark.m98453V0(act, false, (Media) arrayList.get(0), act.string(R$string.f18491el), new Runnable() { // from class: l.q3g
            @Override // java.lang.Runnable
            public final void run() {
                r3g.m177666e();
            }
        });
        if (TextUtils.equals(str, "fake_to_good_dlg")) {
            ygh0.m214648G();
        } else if (TextUtils.equals(str, "fakeView")) {
            ygh0.m214703v();
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m177664c(Act act, Throwable th) {
        act.progressDismiss();
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C22306c m177665d(List list) {
        User user = new User();
        ArrayList arrayList = new ArrayList(CoreModule.f17545c.f19639e0.m169527p9().pictures);
        arrayList.remove(0);
        arrayList.add(0, (Media) list.get(0));
        user.pictures = arrayList;
        return CoreModule.f17545c.f19639e0.m169547u9(user);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m177666e() {
    }

    /* JADX INFO: renamed from: f */
    public static boolean m177667f() {
        int iM208408w0 = xdl0.m208408w0();
        return iM208408w0 >= 960 && ((int) (((float) iM208408w0) / t100.m186889c().density)) < 720;
    }

    /* JADX INFO: renamed from: g */
    public static void m177668g(final Act act, final ArrayList<Media> arrayList, final String str) {
        act.progress(R$string.f17842J5);
        ya5.m213793I(arrayList, "profile").compose(mkd0.m154951C()).flatMap(new w9j() { // from class: l.n3g
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return r3g.m177665d((List) obj);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.o3g
            @Override // p149l.e30
            public final void call(Object obj) {
                r3g.m177663b(act, arrayList, str, (roj0) obj);
            }
        }, new e30() { // from class: l.p3g
            @Override // p149l.e30
            public final void call(Object obj) {
                r3g.m177664c(act, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h */
    public static void m177669h(final Act act) {
        act.startActivityForResult(MediaPickerAct.m78919X1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(xdl0.m208412y0() - t100.m186890d(40.0f)).build()).withFromType(1).build()), new C4317a.a() { // from class: l.m3g
            @Override // com.p046p1.mobile.android.app.C4317a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo20401a(int i, int i2, Intent intent) {
                return r3g.m177662a(act, i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static void m177670i(Act act, Frag frag, int i) {
        frag.startActivityForResult(MediaPickerAct.m78919X1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(xdl0.m208412y0() - t100.m186890d(40.0f)).build()).withFromType(1).build()), i);
    }
}
