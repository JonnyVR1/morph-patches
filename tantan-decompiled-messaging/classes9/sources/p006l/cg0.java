package p006l;

import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.a;
import com.p1.mobile.putong.data.Dimension;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MediaLabel;
import com.p1.mobile.putong.data.MediaLocalStatus;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p1.mobile.putong.ui.download.DownloadTask;
import com.p1.mobile.putong.ui.mediapicker.MediaPickerBaseAct;
import com.p1.mobile.putong.ui.permission.PermissionHelper;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import l.c4g0;
import l.d30;
import l.e30;
import l.e51;
import l.f30;
import l.lsi0;
import l.mkd0;
import l.pgm;
import l.rhi;
import l.roj0;
import l.szb0;
import l.vwb;
import l.w9j;
import l.yij0;
import l.zqx;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class cg0 {
    /* JADX INFO: renamed from: A */
    public static void m13428A(Act act, int i, final e30<List<Media>> e30Var) {
        act.startActivityForResult(MediaPickerAct.X1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(i).withMinPickCount(i).showPreviewEditBtn(false).build()).withSubmitButtonTitle(act.getString(R$string.f2345a9)).needClickPreview(false).withFromType(4).build()), new a.a() { // from class: l.wf0
            /* JADX INFO: renamed from: a */
            public final boolean m26358a(int i2, int i3, Intent intent) {
                return cg0.m13434f(e30Var, i2, i3, intent);
            }
        });
        act.overridePendingTransition(szb0.e, szb0.a);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m13430b(final Act act, final e30 e30Var, final String str) {
        if (m13447s(act)) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            act.progressDismiss();
            e30Var.call(Boolean.FALSE);
            return;
        }
        Media mediaNew_ = Picture.new_();
        mediaNew_.url = rhi.B(str);
        pgm pgmVar = new pgm(rhi.z(mediaNew_.url));
        ((Picture) mediaNew_).size = new Dimension(pgmVar.d);
        mediaNew_.mediaType = pgmVar.c;
        mediaNew_.status = MediaLocalStatus.get("preprocessed");
        final User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
        if (userM21490p9 != null) {
            act.duringCreated(ya5.m28127I(vwb.f0(new Media[]{mediaNew_}), "ai_profile_avatar").compose(mkd0.C())).filter(new w9j() { // from class: l.yf0
                public final Object call(Object obj) {
                    return Boolean.valueOf(!vwb.J((List) obj));
                }
            }).map(new w9j() { // from class: l.zf0
                public final Object call(Object obj) {
                    return cg0.m13431c((List) obj);
                }
            }).map(new w9j() { // from class: l.ag0
                public final Object call(Object obj) {
                    return cg0.m13441m(str, userM21490p9, (Picture) obj);
                }
            }).flatMap(new w9j() { // from class: l.bg0
                public final Object call(Object obj) {
                    return CoreModule.f1534c.f3628e0.m21510u9((User) obj);
                }
            }).subscribe(mkd0.H(new e30() { // from class: l.lf0
                public final void call(Object obj) {
                    cg0.m13436h(act, e30Var, (roj0) obj);
                }
            }, new e30() { // from class: l.mf0
                public final void call(Object obj) {
                    cg0.m13439k(act, e30Var, (Throwable) obj);
                }
            }));
        } else {
            act.progressDismiss();
            e30Var.call(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Picture m13431c(List list) {
        return (Picture) list.get(0);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m13433e(e30 e30Var, DownloadTask downloadTask) {
        if (e30Var != null) {
            e30Var.call(downloadTask.v());
            return;
        }
        CoreModule.f1533b.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.parse("file://" + downloadTask.v())));
        lsi0.j(CoreModule.f1533b.getString(R$string.f2438d9));
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ boolean m13434f(e30 e30Var, int i, int i2, Intent intent) {
        if (i2 == -1 && NullChecker.a(intent)) {
            e30Var.call((ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.h));
        }
        return i2 == -1 && NullChecker.a(intent);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m13435g(d30 d30Var) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m13436h(Act act, e30 e30Var, roj0 roj0Var) {
        act.progressDismiss();
        e30Var.call(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ c m13437i(List list) {
        if (list == null) {
            list = new ArrayList();
        }
        return ya5.m28127I(list, "ai_album");
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m13439k(Act act, e30 e30Var, Throwable th) {
        act.progressDismiss();
        e30Var.call(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m13440l(e30 e30Var, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        if (e30Var != null) {
            e30Var.call("");
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ User m13441m(String str, User user, Picture picture) {
        rhi.m(str);
        qib0.f19782G.m12734G0(((Media) picture).urlKey, ((Media) picture).url);
        ArrayList arrayList = new ArrayList();
        ((Media) picture).labels = arrayList;
        arrayList.add(MediaLabel.get("WITH_AI_ALBUM"));
        User user2 = new User();
        List list = user.pictures;
        user2.pictures = list;
        list.remove(0);
        user2.pictures.add(0, picture);
        return user2;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m13442n(e30 e30Var, DownloadTask downloadTask, Throwable th) {
        if (e30Var != null) {
            e30Var.call((Object) null);
        } else {
            lsi0.j(CoreModule.f1533b.getString(R$string.f2468e9));
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m13446r(e30 e30Var, Throwable th) {
        e30Var.call((Object) null);
        yij0.D(th);
    }

    /* JADX INFO: renamed from: s */
    public static boolean m13447s(Act act) {
        return act == null || act.isFinishing() || act.isDestroyed();
    }

    /* JADX INFO: renamed from: t */
    public static void m13448t(Act act, final Picture picture, final e30<String> e30Var) {
        if (act == null) {
            return;
        }
        if (zqx.k()) {
            m13449u(picture, e30Var);
        } else {
            PermissionHelper.c().r(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}).w(false).u(true).m(new d30() { // from class: l.uf0
                public final void call() {
                    cg0.m13449u(picture, e30Var);
                }
            }, new e30() { // from class: l.vf0
                public final void call(Object obj) {
                    cg0.m13440l(e30Var, (PermissionHelper.PermissionDeniedReason) obj);
                }
            }).i(act);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x009e  */
    /* JADX INFO: renamed from: u */
    public static void m13449u(Picture picture, final e30<String> e30Var) {
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
            CrashHelper.c(e);
            str = null;
            str2 = null;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            if (e30Var != null) {
                e30Var.call((Object) null);
                return;
            } else {
                lsi0.j(CoreModule.f1533b.getString(R$string.f2468e9));
                return;
            }
        }
        DownloadTask downloadTaskA = new DownloadTask.b(qib0.f19784H.getDownloadHttp()).q(str).o(str2).j(new f30() { // from class: l.qf0
            public final void call(Object obj, Object obj2) {
                e51.G(new Runnable() { // from class: l.sf0
                    @Override // java.lang.Runnable
                    public final void run() {
                        cg0.m13433e(e30Var, downloadTask);
                    }
                });
            }
        }).f(new f30() { // from class: l.rf0
            public final void call(Object obj, Object obj2) {
                cg0.m13442n(e30Var, (DownloadTask) obj, (Throwable) obj2);
            }
        }).a();
        if (!com.p1.mobile.putong.ui.download.a.u().y(downloadTaskA.x())) {
            com.p1.mobile.putong.ui.download.a.u().o(downloadTaskA);
        } else if (e30Var != null) {
            e30Var.call((Object) null);
        } else {
            lsi0.j(CoreModule.f1533b.getString(R$string.f2468e9));
        }
    }

    /* JADX INFO: renamed from: v */
    public static boolean m13450v() {
        return PermissionHelper.b(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"});
    }

    /* JADX INFO: renamed from: w */
    public static void m13451w(final Act act, final int i, final e30<List<Media>> e30Var) {
        if (act == null) {
            return;
        }
        if (zqx.k()) {
            m13428A(act, i, e30Var);
        } else if (m13450v()) {
            m13428A(act, i, e30Var);
        } else {
            m13454z(act, new d30() { // from class: l.kf0
                public final void call() {
                    cg0.m13451w(act, i, e30Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: x */
    public static c4g0 m13452x(List<Media> list, final e30<List<Media>> e30Var) {
        if (list != null) {
            return new lsx(list, false, false).flatMap(new w9j() { // from class: l.nf0
                public final Object call(Object obj) {
                    return cg0.m13437i((List) obj);
                }
            }).compose(mkd0.C()).subscribe(mkd0.H(new e30() { // from class: l.of0
                public final void call(Object obj) {
                    e30Var.call((List) obj);
                }
            }, new e30() { // from class: l.pf0
                public final void call(Object obj) {
                    cg0.m13446r(e30Var, (Throwable) obj);
                }
            }));
        }
        e30Var.call((Object) null);
        return null;
    }

    /* JADX INFO: renamed from: y */
    public static void m13453y(final Act act, Picture picture, final e30<Boolean> e30Var) {
        if (m13447s(act)) {
            return;
        }
        act.progress(R$string.f1831J5);
        m13448t(act, picture, new e30() { // from class: l.tf0
            public final void call(Object obj) {
                cg0.m13430b(act, e30Var, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public static void m13454z(Act act, final d30 d30Var) {
        PermissionHelper.c().r(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}).w(false).o(new d30() { // from class: l.xf0
            public final void call() {
                cg0.m13435g(d30Var);
            }
        }).i(act);
    }
}
