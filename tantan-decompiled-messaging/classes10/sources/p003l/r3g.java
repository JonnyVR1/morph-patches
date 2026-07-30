package p003l;

import android.content.Intent;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.data.QuestionCategory;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.android.app.a;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p1.mobile.putong.ui.mediapicker.MediaPickerBaseAct;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.mkd0;
import l.roj0;
import l.t100;
import l.w9j;
import l.xdl0;
import l.ya5;
import l.yij0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class r3g {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m9072a(Act act, int i, int i2, Intent intent) {
        if (i2 != -1) {
            return false;
        }
        m9078g(act, (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.h), intent.getStringExtra("from"));
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m9073b(Act act, ArrayList arrayList, String str, roj0 roj0Var) {
        act.progressDismiss();
        CoreModule.c.e0.va(((Integer) App.i.get()).intValue());
        ark.m5560V0(act, false, (Media) arrayList.get(0), act.string(R.string.el), new Runnable() { // from class: l.q3g
            @Override // java.lang.Runnable
            public final void run() {
                r3g.m9076e();
            }
        });
        if (TextUtils.equals(str, "fake_to_good_dlg")) {
            ygh0.m11183G();
        } else if (TextUtils.equals(str, "fakeView")) {
            ygh0.m11238v();
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m9074c(Act act, Throwable th) {
        act.progressDismiss();
        yij0.D(th);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ c m9075d(List list) {
        User user = new User();
        ArrayList arrayList = new ArrayList(CoreModule.c.e0.p9().pictures);
        arrayList.remove(0);
        arrayList.add(0, (Media) list.get(0));
        user.pictures = arrayList;
        return CoreModule.c.e0.u9(user);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m9076e() {
    }

    /* JADX INFO: renamed from: f */
    public static boolean m9077f() {
        int iW0 = xdl0.w0();
        return iW0 >= 960 && ((int) (((float) iW0) / t100.c().density)) < 720;
    }

    /* JADX INFO: renamed from: g */
    public static void m9078g(final Act act, final ArrayList<Media> arrayList, final String str) {
        act.progress(R.string.J5);
        ya5.I(arrayList, QuestionCategory.profile).compose(mkd0.C()).flatMap(new w9j() { // from class: l.n3g
            public final Object call(Object obj) {
                return r3g.m9075d((List) obj);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.o3g
            public final void call(Object obj) {
                r3g.m9073b(act, arrayList, str, (roj0) obj);
            }
        }, new e30() { // from class: l.p3g
            public final void call(Object obj) {
                r3g.m9074c(act, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h */
    public static void m9079h(final Act act) {
        act.startActivityForResult(MediaPickerAct.X1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(xdl0.y0() - t100.d(40.0f)).build()).withFromType(1).build()), new a.a() { // from class: l.m3g
            /* JADX INFO: renamed from: a */
            public final boolean m7951a(int i, int i2, Intent intent) {
                return r3g.m9072a(act, i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static void m9080i(Act act, Frag frag, int i) {
        frag.startActivityForResult(MediaPickerAct.X1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(xdl0.y0() - t100.d(40.0f)).build()).withFromType(1).build()), i);
    }
}
