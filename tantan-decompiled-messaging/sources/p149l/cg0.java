package p149l;

import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLabel;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p046p1.mobile.putong.p065ui.download.C13111a;
import com.p046p1.mobile.putong.p065ui.download.DownloadTask;
import com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class cg0 {
    /* JADX INFO: renamed from: A */
    public static void m106616A(Act act, int i, final e30<List<Media>> e30Var) {
        act.startActivityForResult(MediaPickerAct.m78919X1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(i).withMinPickCount(i).showPreviewEditBtn(false).build()).withSubmitButtonTitle(act.getString(R$string.f18356a9)).needClickPreview(false).withFromType(4).build()), new C4317a.a() { // from class: l.wf0
            @Override // com.p046p1.mobile.android.app.C4317a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo20401a(int i2, int i3, Intent intent) {
                return cg0.m106622f(e30Var, i2, i3, intent);
            }
        });
        act.overridePendingTransition(szb0.f167030e, szb0.f167026a);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m106618b(final Act act, final e30 e30Var, final String str) {
        if (m106635s(act)) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            act.progressDismiss();
            e30Var.call(Boolean.FALSE);
            return;
        }
        Picture pictureNew_ = Picture.new_();
        pictureNew_.url = rhi.m179355B(str);
        pgm pgmVar = new pgm(rhi.m179382z(pictureNew_.url));
        pictureNew_.size = new Dimension(pgmVar.f148730d);
        pictureNew_.mediaType = pgmVar.f148729c;
        pictureNew_.status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
        final User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (userM169527p9 != null) {
            act.duringCreated((C22306c) ya5.m213793I(vwb.m200324f0(pictureNew_), "ai_profile_avatar").compose(mkd0.m154951C())).filter(new w9j() { // from class: l.yf0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!vwb.m200296J((List) obj));
                }
            }).map(new w9j() { // from class: l.zf0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return cg0.m106619c((List) obj);
                }
            }).map(new w9j() { // from class: l.ag0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return cg0.m106629m(str, userM169527p9, (Picture) obj);
                }
            }).flatMap(new w9j() { // from class: l.bg0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return CoreModule.f17545c.f19639e0.m169547u9((User) obj);
                }
            }).subscribe(mkd0.m154956H(new e30() { // from class: l.lf0
                @Override // p149l.e30
                public final void call(Object obj) {
                    cg0.m106624h(act, e30Var, (roj0) obj);
                }
            }, new e30() { // from class: l.mf0
                @Override // p149l.e30
                public final void call(Object obj) {
                    cg0.m106627k(act, e30Var, (Throwable) obj);
                }
            }));
        } else {
            act.progressDismiss();
            e30Var.call(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Picture m106619c(List list) {
        return (Picture) list.get(0);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m106621e(e30 e30Var, DownloadTask downloadTask) {
        if (e30Var != null) {
            e30Var.call(downloadTask.m79621v());
            return;
        }
        CoreModule.f17544b.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.parse("file://" + downloadTask.m79621v())));
        lsi0.m151580j(CoreModule.f17544b.getString(R$string.f18449d9));
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ boolean m106622f(e30 e30Var, int i, int i2, Intent intent) {
        if (i2 == -1 && NullChecker.m81303a(intent)) {
            e30Var.call((ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f54603h));
        }
        return i2 == -1 && NullChecker.m81303a(intent);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m106623g(d30 d30Var) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m106624h(Act act, e30 e30Var, roj0 roj0Var) {
        act.progressDismiss();
        e30Var.call(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ C22306c m106625i(List list) {
        if (list == null) {
            list = new ArrayList();
        }
        return ya5.m213793I(list, "ai_album");
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m106627k(Act act, e30 e30Var, Throwable th) {
        act.progressDismiss();
        e30Var.call(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m106628l(e30 e30Var, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        if (e30Var != null) {
            e30Var.call("");
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ User m106629m(String str, User user, Picture picture) {
        rhi.m179369m(str);
        qib0.f154691G.m102321G0(picture.urlKey, picture.url);
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
    public static /* synthetic */ void m106630n(e30 e30Var, DownloadTask downloadTask, Throwable th) {
        if (e30Var != null) {
            e30Var.call(null);
        } else {
            lsi0.m151580j(CoreModule.f17544b.getString(R$string.f18479e9));
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m106634r(e30 e30Var, Throwable th) {
        e30Var.call(null);
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: s */
    public static boolean m106635s(Act act) {
        return act == null || act.isFinishing() || act.isDestroyed();
    }

    /* JADX INFO: renamed from: t */
    public static void m106636t(Act act, final Picture picture, final e30<String> e30Var) {
        if (act == null) {
            return;
        }
        if (zqx.m219898k()) {
            m106637u(picture, e30Var);
        } else {
            PermissionHelper.m79882c().m79900r("android.permission.WRITE_EXTERNAL_STORAGE").m79905w(false).m79903u(true).m79895m(new d30() { // from class: l.uf0
                @Override // p149l.d30
                public final void call() {
                    cg0.m106637u(picture, e30Var);
                }
            }, new e30() { // from class: l.vf0
                @Override // p149l.e30
                public final void call(Object obj) {
                    cg0.m106628l(e30Var, (PermissionHelper.PermissionDeniedReason) obj);
                }
            }).m79891i(act);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x009e  */
    /* JADX INFO: renamed from: u */
    public static void m106637u(Picture picture, final e30<String> e30Var) {
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
            CrashHelper.m81296c(e);
            str = null;
            str2 = null;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            if (e30Var != null) {
                e30Var.call(null);
                return;
            } else {
                lsi0.m151580j(CoreModule.f17544b.getString(R$string.f18479e9));
                return;
            }
        }
        DownloadTask downloadTaskM79626a = new DownloadTask.C13110b(qib0.f154693H.getDownloadHttp()).m79642q(str).m79640o(str2).m79635j(new f30() { // from class: l.qf0
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                e51.m114742G(new Runnable() { // from class: l.sf0
                    @Override // java.lang.Runnable
                    public final void run() {
                        cg0.m106621e(e30Var, downloadTask);
                    }
                });
            }
        }).m79631f(new f30() { // from class: l.rf0
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                cg0.m106630n(e30Var, (DownloadTask) obj, (Throwable) obj2);
            }
        }).m79626a();
        if (!C13111a.m79654u().m79674y(downloadTaskM79626a.m79623x())) {
            C13111a.m79654u().m79665o(downloadTaskM79626a);
        } else if (e30Var != null) {
            e30Var.call(null);
        } else {
            lsi0.m151580j(CoreModule.f17544b.getString(R$string.f18479e9));
        }
    }

    /* JADX INFO: renamed from: v */
    public static boolean m106638v() {
        return PermissionHelper.m79881b("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE");
    }

    /* JADX INFO: renamed from: w */
    public static void m106639w(final Act act, final int i, final e30<List<Media>> e30Var) {
        if (act == null) {
            return;
        }
        if (zqx.m219898k()) {
            m106616A(act, i, e30Var);
        } else if (m106638v()) {
            m106616A(act, i, e30Var);
        } else {
            m106642z(act, new d30() { // from class: l.kf0
                @Override // p149l.d30
                public final void call() {
                    cg0.m106639w(act, i, e30Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: x */
    public static c4g0 m106640x(List<Media> list, final e30<List<Media>> e30Var) {
        if (list != null) {
            return new lsx(list, false, false).flatMap(new w9j() { // from class: l.nf0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return cg0.m106625i((List) obj);
                }
            }).compose(mkd0.m154951C()).subscribe(mkd0.m154956H(new e30() { // from class: l.of0
                @Override // p149l.e30
                public final void call(Object obj) {
                    e30Var.call((List) obj);
                }
            }, new e30() { // from class: l.pf0
                @Override // p149l.e30
                public final void call(Object obj) {
                    cg0.m106634r(e30Var, (Throwable) obj);
                }
            }));
        }
        e30Var.call(null);
        return null;
    }

    /* JADX INFO: renamed from: y */
    public static void m106641y(final Act act, Picture picture, final e30<Boolean> e30Var) {
        if (m106635s(act)) {
            return;
        }
        act.progress(R$string.f17842J5);
        m106636t(act, picture, new e30() { // from class: l.tf0
            @Override // p149l.e30
            public final void call(Object obj) {
                cg0.m106618b(act, e30Var, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public static void m106642z(Act act, final d30 d30Var) {
        PermissionHelper.m79882c().m79900r("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE").m79905w(false).m79897o(new d30() { // from class: l.xf0
            @Override // p149l.d30
            public final void call() {
                cg0.m106623g(d30Var);
            }
        }).m79891i(act);
    }
}
