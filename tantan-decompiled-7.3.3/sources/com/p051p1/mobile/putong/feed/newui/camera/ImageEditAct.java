package com.p051p1.mobile.putong.feed.newui.camera;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.core.glcore.util.BitmapPrivateProtocolUtil;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.data.ReminderAction;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.MediaMeta;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.newui.camera.ImageEditAct;
import com.p051p1.mobile.putong.feed.newui.camera.momosdk.Photo;
import com.p051p1.mobile.putong.feed.newui.status.post.FeedPostStatusAct;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import p153l.bnl0;
import p153l.cn40;
import p153l.ecj;
import p153l.hdc0;
import p153l.i4g0;
import p153l.jyb;
import p153l.l51;
import p153l.o1j0;
import p153l.oki;
import p153l.tec0;
import p153l.th0;
import p153l.x20;
import p153l.xgl0;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class ImageEditAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public Photo f40165c;

    /* JADX INFO: renamed from: d */
    public MediaMeta f40166d;

    /* JADX INFO: renamed from: e */
    public String f40167e;

    /* JADX INFO: renamed from: f */
    public boolean f40168f;

    /* JADX INFO: renamed from: g */
    public String f40169g;

    /* JADX INFO: renamed from: h */
    public th0 f40170h;

    /* JADX INFO: renamed from: X1 */
    public static /* synthetic */ void m62205X1(View view) {
    }

    /* JADX INFO: renamed from: h2 */
    public static Intent m62214h2(FragmentActivity fragmentActivity, Photo photo, MediaMeta mediaMeta, String str, boolean z, String str2) {
        Intent intent = new Intent(fragmentActivity, (Class<?>) ImageEditAct.class);
        intent.putExtra("key_edit_media", photo);
        intent.putExtra("EXTRA_KEY_CAMERA_META_DATA", mediaMeta);
        intent.putExtra("extra_from", str);
        intent.putExtra("extra_show_only_photo", z);
        intent.putExtra("extra_selected_folder_path", str2);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i2, reason: merged with bridge method [inline-methods] */
    public void m62220n2(File file) {
        if (act().isFinishing()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Picture picture = new Picture();
        picture.url = oki.m168011B(file.getPath());
        picture.mediaType = "image/*";
        picture.status = MediaLocalStatus.get("raw");
        MediaMeta mediaMeta = this.f40166d;
        picture.meta = mediaMeta;
        mediaMeta.type = ReminderAction.photo;
        mediaMeta.source = "shoot";
        arrayList.add(picture);
        if (TextUtils.equals(this.f40167e, "my_states")) {
            act().startActivity(FeedPostStatusAct.m66991v2(act(), arrayList));
            act().overridePendingTransition(0, 0);
        } else {
            cn40.m111412s0(this, arrayList, this.f40169g, this.f40168f, this.f40167e);
        }
        m68056e2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m2 */
    public /* synthetic */ void m62216m2(Bundle bundle) {
        setTransparentStatusBar();
        setSwipeBackEnable(false);
    }

    /* JADX INFO: renamed from: u2 */
    private void m62217u2(String str, final x20 x20Var) {
        th0 th0VarM191142a = new th0.C20312a(act()).m191148g(false).m191151j(str).m191146e(R$string.f39993s3).m191158q(R$string.f39865a).m191144c(new View.OnClickListener() { // from class: l.dim
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x20Var.call();
            }
        }).m191156o(new View.OnClickListener() { // from class: l.eim
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f94182a.m62223q2(view);
            }
        }).m191142a();
        this.f40170h = th0VarM191142a;
        th0VarM191142a.m191141g();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173621a, viewGroup);
        if (NullChecker.m82487b(this.f40165c) && NullChecker.m82487b(this.f40165c.path)) {
            ((ImageView) viewInflate.findViewById(hdc0.f108946n1)).setImageBitmap(BitmapPrivateProtocolUtil.getBitmap(this.f40165c.path));
            viewInflate.findViewById(hdc0.f108943m1).setOnClickListener(new View.OnClickListener() { // from class: l.aim
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ImageEditAct.m62205X1(view);
                }
            });
            viewInflate.findViewById(hdc0.f108940l1).setOnClickListener(new View.OnClickListener() { // from class: l.bim
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f76896a.m62225s2(view);
                }
            });
            viewInflate.findViewById(hdc0.f108943m1).setOnClickListener(new View.OnClickListener() { // from class: l.cim
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f81967a.m62224r2(view);
                }
            });
        }
        m62219l2(viewInflate);
        return viewInflate;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.mIfInNewUi1ShouldUseThemNewUI2 = true;
        creates(new y20() { // from class: l.zhm
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f204434a.m62216m2((Bundle) obj);
            }
        });
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0035: MOVE (r1 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:54), block:B:12:0x0035 */
    /* JADX INFO: renamed from: k2 */
    public final File m62218k2() throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        Bitmap bitmap = BitmapPrivateProtocolUtil.getBitmap(this.f40165c.path);
        FileOutputStream fileOutputStream3 = null;
        try {
            if (bitmap == null) {
                return null;
            }
            try {
                File fileM120381O = ecj.m120381O("jpg");
                fileOutputStream2 = new FileOutputStream(fileM120381O);
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream2);
                    fileOutputStream2.flush();
                    if (Build.VERSION.SDK_INT >= 29 || PermissionHelper.m81064b("android.permission.WRITE_EXTERNAL_STORAGE")) {
                        MediaStore.Images.Media.insertImage(getContentResolver(), fileM120381O.getAbsolutePath(), fileM120381O.getName(), fileM120381O.getName());
                    }
                    bitmap.recycle();
                    if (NullChecker.m82486a(fileOutputStream2)) {
                        try {
                            fileOutputStream2.close();
                            return fileM120381O;
                        } catch (IOException e) {
                            CrashHelper.m82479c(e);
                        }
                    }
                    return fileM120381O;
                } catch (IOException e2) {
                    e = e2;
                    CrashHelper.m82479c(e);
                    bitmap.recycle();
                    if (NullChecker.m82486a(fileOutputStream2)) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e3) {
                            CrashHelper.m82479c(e3);
                        }
                    }
                    return null;
                } catch (OutOfMemoryError e4) {
                    e = e4;
                    CrashHelper.m82479c(e);
                    bitmap.recycle();
                    if (NullChecker.m82486a(fileOutputStream2)) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e5) {
                            CrashHelper.m82479c(e5);
                        }
                    }
                    return null;
                }
            } catch (IOException e6) {
                e = e6;
                fileOutputStream2 = null;
            } catch (OutOfMemoryError e7) {
                e = e7;
                fileOutputStream2 = null;
            } catch (Throwable th) {
                th = th;
                bitmap.recycle();
                if (NullChecker.m82486a(fileOutputStream3)) {
                    try {
                        fileOutputStream3.close();
                    } catch (IOException e8) {
                        CrashHelper.m82479c(e8);
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream3 = fileOutputStream;
        }
    }

    /* JADX INFO: renamed from: l2 */
    public final void m62219l2(View view) {
        if ((l51.m152918x() || l51.m152917w()) && view != null) {
            bnl0.m105556g0(view);
        }
    }

    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ void m62221o2() throws Throwable {
        final File fileM62218k2 = m62218k2();
        if (fileM62218k2 == null) {
            o1j0.m165634h(R$string.f39824T0);
        } else {
            FeedModule.f39700a.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(fileM62218k2)));
            l51.m152887G(new Runnable() { // from class: l.gim
                @Override // java.lang.Runnable
                public final void run() {
                    this.f104506a.m62220n2(fileM62218k2);
                }
            });
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        m62225s2(null);
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ void m62222p2() {
        m68056e2();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_camera_preview";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        Intent intent = getIntent();
        this.f40165c = (Photo) intent.getParcelableExtra("key_edit_media");
        this.f40166d = (MediaMeta) intent.getSerializableExtra("EXTRA_KEY_CAMERA_META_DATA");
        this.f40167e = intent.getStringExtra("extra_from");
        this.f40168f = intent.getBooleanExtra("extra_show_only_photo", false);
        this.f40169g = intent.getStringExtra("extra_selected_folder_path");
    }

    /* JADX INFO: renamed from: q2 */
    public final /* synthetic */ void m62223q2(View view) {
        this.f40170h.m191137c();
    }

    /* JADX INFO: renamed from: r2 */
    public final void m62224r2(View view) {
        i4g0.m138523u("e_camera_preview_done_button", "p_camera_preview", jyb.m147494Y("beauty_used", (xgl0.f194205d || xgl0.f194206e || xgl0.f194207f) ? "yes" : "no"), jyb.m147494Y("magic_used", xgl0.f194204c ? "yes" : "no"));
        l51.m152919y(new Runnable() { // from class: l.fim
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f99208a.m62221o2();
            }
        });
    }

    /* JADX INFO: renamed from: s2 */
    public final void m62225s2(View view) {
        m62217u2(this.act.getString(R$string.f40026y0), new x20() { // from class: l.yhm
            @Override // p153l.x20
            public final void call() {
                this.f199976a.m62222p2();
            }
        });
    }
}
