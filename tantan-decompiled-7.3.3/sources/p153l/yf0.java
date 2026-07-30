package p153l;

import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLabel;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p051p1.mobile.putong.p070ui.download.C13274a;
import com.p051p1.mobile.putong.p070ui.download.DownloadTask;
import com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class yf0 {
    /* JADX INFO: renamed from: A */
    public static void m215490A(Act act, int i, final y20<List<Media>> y20Var) {
        act.startActivityForResult(MediaPickerAct.m80102Y1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(i).withMinPickCount(i).showPreviewEditBtn(false).build()).withSubmitButtonTitle(act.getString(R$string.f19148c9)).needClickPreview(false).withFromType(4).build()), new C4468a.a() { // from class: l.sf0
            @Override // com.p051p1.mobile.android.app.C4468a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo21400a(int i2, int i3, Intent intent) {
                return yf0.m215496f(y20Var, i2, i3, intent);
            }
        });
        act.overridePendingTransition(y7c0.f197767e, y7c0.f197763a);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m215492b(final Act act, final y20 y20Var, final String str) {
        if (m215509s(act)) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            act.progressDismiss();
            y20Var.call(Boolean.FALSE);
            return;
        }
        Picture pictureNew_ = Picture.new_();
        pictureNew_.url = oki.m168011B(str);
        sim simVar = new sim(oki.m168038z(pictureNew_.url));
        pictureNew_.size = new Dimension(simVar.f168843d);
        pictureNew_.mediaType = simVar.f168842c;
        pictureNew_.status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
        final User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (userM116600p9 != null) {
            act.duringCreated((C22421c) yb5.m214980I(jyb.m147507f0(pictureNew_), "ai_profile_avatar").compose(psd0.m173592C())).filter(new qcj() { // from class: l.uf0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(!jyb.m147479J((List) obj));
                }
            }).map(new qcj() { // from class: l.vf0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return yf0.m215493c((List) obj);
                }
            }).map(new qcj() { // from class: l.wf0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return yf0.m215503m(str, userM116600p9, (Picture) obj);
                }
            }).flatMap(new qcj() { // from class: l.xf0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return CoreModule.f18264c.f20381e0.m116620u9((User) obj);
                }
            }).subscribe(psd0.m173597H(new y20() { // from class: l.hf0
                @Override // p153l.y20
                public final void call(Object obj) {
                    yf0.m215498h(act, y20Var, (uxj0) obj);
                }
            }, new y20() { // from class: l.if0
                @Override // p153l.y20
                public final void call(Object obj) {
                    yf0.m215501k(act, y20Var, (Throwable) obj);
                }
            }));
        } else {
            act.progressDismiss();
            y20Var.call(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Picture m215493c(List list) {
        return (Picture) list.get(0);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m215495e(y20 y20Var, DownloadTask downloadTask) {
        if (y20Var != null) {
            y20Var.call(downloadTask.m80804v());
            return;
        }
        CoreModule.f18263b.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.parse("file://" + downloadTask.m80804v())));
        o1j0.m165636j(CoreModule.f18263b.getString(R$string.f19240f9));
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ boolean m215496f(y20 y20Var, int i, int i2, Intent intent) {
        if (i2 == -1 && NullChecker.m82486a(intent)) {
            y20Var.call((ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f55451h));
        }
        return i2 == -1 && NullChecker.m82486a(intent);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m215497g(x20 x20Var) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m215498h(Act act, y20 y20Var, uxj0 uxj0Var) {
        act.progressDismiss();
        y20Var.call(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ C22421c m215499i(List list) {
        if (list == null) {
            list = new ArrayList();
        }
        return yb5.m214980I(list, "ai_album");
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m215501k(Act act, y20 y20Var, Throwable th) {
        act.progressDismiss();
        y20Var.call(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m215502l(y20 y20Var, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        if (y20Var != null) {
            y20Var.call("");
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ User m215503m(String str, User user, Picture picture) {
        oki.m168025m(str);
        uqb0.f180374G.m127105G0(picture.urlKey, picture.url);
        ArrayList arrayList = new ArrayList();
        picture.labels = arrayList;
        arrayList.add(MediaLabel.get(MediaLabel.WITH_AI_ALBUM));
        User user2 = new User();
        List<Media> list = user.pictures;
        user2.pictures = list;
        list.remove(0);
        user2.pictures.add(0, picture);
        return user2;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m215504n(y20 y20Var, DownloadTask downloadTask, Throwable th) {
        if (y20Var != null) {
            y20Var.call(null);
        } else {
            o1j0.m165636j(CoreModule.f18263b.getString(R$string.f19271g9));
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m215508r(y20 y20Var, Throwable th) {
        y20Var.call(null);
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: s */
    public static boolean m215509s(Act act) {
        return act == null || act.isFinishing() || act.isDestroyed();
    }

    /* JADX INFO: renamed from: t */
    public static void m215510t(Act act, final Picture picture, final y20<String> y20Var) {
        if (act == null) {
            return;
        }
        if (wzx.m208784k()) {
            m215511u(picture, y20Var);
        } else {
            PermissionHelper.m81065c().m81083r("android.permission.WRITE_EXTERNAL_STORAGE").m81088w(false).m81086u(true).m81078m(new x20() { // from class: l.qf0
                @Override // p153l.x20
                public final void call() {
                    yf0.m215511u(picture, y20Var);
                }
            }, new y20() { // from class: l.rf0
                @Override // p153l.y20
                public final void call(Object obj) {
                    yf0.m215502l(y20Var, (PermissionHelper.PermissionDeniedReason) obj);
                }
            }).m81074i(act);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x009e  */
    /* JADX INFO: renamed from: u */
    public static void m215511u(Picture picture, final y20<String> y20Var) {
        String str;
        String str2;
        String str3;
        try {
            str = picture.jpgMaxWidth1080().formatted();
            String str4 = Environment.DIRECTORY_PICTURES;
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str4)) {
                str2 = null;
            } else {
                String strSubstring = str.substring(str.lastIndexOf("."), str.length());
                int iIndexOf = strSubstring.indexOf(63);
                if (iIndexOf == -1) {
                    str3 = System.currentTimeMillis() + strSubstring;
                } else {
                    str3 = System.currentTimeMillis() + strSubstring.substring(0, iIndexOf);
                }
                StringBuilder sb = new StringBuilder(Environment.getExternalStoragePublicDirectory(str4).getAbsolutePath());
                String str5 = File.separator;
                sb.append(str5);
                sb.append("Tantan");
                String string = sb.toString();
                File file = new File(string);
                if (file.exists() || (!file.exists() && file.mkdirs())) {
                    str2 = string + str5 + str3;
                } else {
                    str2 = null;
                }
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            str = null;
            str2 = null;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            if (y20Var != null) {
                y20Var.call(null);
                return;
            } else {
                o1j0.m165636j(CoreModule.f18263b.getString(R$string.f19271g9));
                return;
            }
        }
        DownloadTask downloadTaskM80809a = new DownloadTask.C13273b(uqb0.f180376H.getDownloadHttp()).m80825q(str).m80823o(str2).m80818j(new z20() { // from class: l.mf0
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                l51.m152887G(new Runnable() { // from class: l.of0
                    @Override // java.lang.Runnable
                    public final void run() {
                        yf0.m215495e(y20Var, downloadTask);
                    }
                });
            }
        }).m80814f(new z20() { // from class: l.nf0
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                yf0.m215504n(y20Var, (DownloadTask) obj, (Throwable) obj2);
            }
        }).m80809a();
        if (!C13274a.m80837u().m80857y(downloadTaskM80809a.m80806x())) {
            C13274a.m80837u().m80848o(downloadTaskM80809a);
        } else if (y20Var != null) {
            y20Var.call(null);
        } else {
            o1j0.m165636j(CoreModule.f18263b.getString(R$string.f19271g9));
        }
    }

    /* JADX INFO: renamed from: v */
    public static boolean m215512v() {
        return PermissionHelper.m81064b("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE");
    }

    /* JADX INFO: renamed from: w */
    public static void m215513w(final Act act, final int i, final y20<List<Media>> y20Var) {
        if (act == null) {
            return;
        }
        if (wzx.m208784k()) {
            m215490A(act, i, y20Var);
        } else if (m215512v()) {
            m215490A(act, i, y20Var);
        } else {
            m215516z(act, new x20() { // from class: l.gf0
                @Override // p153l.x20
                public final void call() {
                    yf0.m215513w(act, i, y20Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: x */
    public static kcg0 m215514x(List<Media> list, final y20<List<Media>> y20Var) {
        if (list != null) {
            return new i1y(list, false, false).flatMap(new qcj() { // from class: l.jf0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return yf0.m215499i((List) obj);
                }
            }).compose(psd0.m173592C()).subscribe(psd0.m173597H(new y20() { // from class: l.kf0
                @Override // p153l.y20
                public final void call(Object obj) {
                    y20Var.call((List) obj);
                }
            }, new y20() { // from class: l.lf0
                @Override // p153l.y20
                public final void call(Object obj) {
                    yf0.m215508r(y20Var, (Throwable) obj);
                }
            }));
        }
        y20Var.call(null);
        return null;
    }

    /* JADX INFO: renamed from: y */
    public static void m215515y(final Act act, Picture picture, final y20<Boolean> y20Var) {
        if (m215509s(act)) {
            return;
        }
        act.progress(R$string.f18632L5);
        m215510t(act, picture, new y20() { // from class: l.pf0
            @Override // p153l.y20
            public final void call(Object obj) {
                yf0.m215492b(act, y20Var, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public static void m215516z(Act act, final x20 x20Var) {
        PermissionHelper.m81065c().m81083r("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE").m81088w(false).m81080o(new x20() { // from class: l.tf0
            @Override // p153l.x20
            public final void call() {
                yf0.m215497g(x20Var);
            }
        }).m81074i(act);
    }
}
