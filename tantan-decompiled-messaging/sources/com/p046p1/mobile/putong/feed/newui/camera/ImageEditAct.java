package com.p046p1.mobile.putong.feed.newui.camera;

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
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.data.ReminderAction;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.MediaMeta;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.newui.camera.ImageEditAct;
import com.p046p1.mobile.putong.feed.newui.camera.momosdk.Photo;
import com.p046p1.mobile.putong.feed.newui.status.post.FeedPostStatusAct;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import p149l.b5c0;
import p149l.d30;
import p149l.e30;
import p149l.e51;
import p149l.k9j;
import p149l.lsi0;
import p149l.o6c0;
import p149l.oe40;
import p149l.rhi;
import p149l.t7l0;
import p149l.vwb;
import p149l.xdl0;
import p149l.xh0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes12.dex */
public class ImageEditAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public Photo f39317c;

    /* JADX INFO: renamed from: d */
    public MediaMeta f39318d;

    /* JADX INFO: renamed from: e */
    public String f39319e;

    /* JADX INFO: renamed from: f */
    public boolean f39320f;

    /* JADX INFO: renamed from: g */
    public String f39321g;

    /* JADX INFO: renamed from: h */
    public xh0 f39322h;

    /* JADX INFO: renamed from: V1 */
    public static /* synthetic */ void m61021V1(View view) {
    }

    /* JADX INFO: renamed from: g2 */
    public static Intent m61030g2(FragmentActivity fragmentActivity, Photo photo, MediaMeta mediaMeta, String str, boolean z, String str2) {
        Intent intent = new Intent(fragmentActivity, (Class<?>) ImageEditAct.class);
        intent.putExtra("key_edit_media", photo);
        intent.putExtra("EXTRA_KEY_CAMERA_META_DATA", mediaMeta);
        intent.putExtra("extra_from", str);
        intent.putExtra("extra_show_only_photo", z);
        intent.putExtra("extra_selected_folder_path", str2);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h2, reason: merged with bridge method [inline-methods] */
    public void m61036m2(File file) {
        if (act().isFinishing()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Picture picture = new Picture();
        picture.url = rhi.m179355B(file.getPath());
        picture.mediaType = "image/*";
        picture.status = MediaLocalStatus.get("raw");
        MediaMeta mediaMeta = this.f39318d;
        picture.meta = mediaMeta;
        mediaMeta.type = ReminderAction.photo;
        mediaMeta.source = "shoot";
        arrayList.add(picture);
        if (TextUtils.equals(this.f39319e, "my_states")) {
            act().startActivity(FeedPostStatusAct.m65808u2(act(), arrayList));
            act().overridePendingTransition(0, 0);
        } else {
            oe40.m163862s0(this, arrayList, this.f39321g, this.f39320f, this.f39319e);
        }
        m66873d2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l2 */
    public /* synthetic */ void m61032l2(Bundle bundle) {
        setTransparentStatusBar();
        setSwipeBackEnable(false);
    }

    /* JADX INFO: renamed from: s2 */
    private void m61033s2(String str, final d30 d30Var) {
        xh0 xh0VarM208722a = new xh0.C21150a(act()).m208728g(false).m208731j(str).m208726e(R$string.f39145s3).m208738q(R$string.f39017a).m208724c(new View.OnClickListener() { // from class: l.agm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        }).m208736o(new View.OnClickListener() { // from class: l.bgm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f75466a.m61039p2(view);
            }
        }).m208722a();
        this.f39322h = xh0VarM208722a;
        xh0VarM208722a.m208721g();
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0035: MOVE (r1 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:54), block:B:12:0x0035 */
    /* JADX INFO: renamed from: i2 */
    public final File m61034i2() throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        Bitmap bitmap = BitmapPrivateProtocolUtil.getBitmap(this.f39317c.path);
        FileOutputStream fileOutputStream3 = null;
        try {
            if (bitmap == null) {
                return null;
            }
            try {
                File fileM145083O = k9j.m145083O("jpg");
                fileOutputStream2 = new FileOutputStream(fileM145083O);
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream2);
                    fileOutputStream2.flush();
                    if (Build.VERSION.SDK_INT >= 29 || PermissionHelper.m79881b("android.permission.WRITE_EXTERNAL_STORAGE")) {
                        MediaStore.Images.Media.insertImage(getContentResolver(), fileM145083O.getAbsolutePath(), fileM145083O.getName(), fileM145083O.getName());
                    }
                    bitmap.recycle();
                    if (NullChecker.m81303a(fileOutputStream2)) {
                        try {
                            fileOutputStream2.close();
                            return fileM145083O;
                        } catch (IOException e) {
                            CrashHelper.m81296c(e);
                        }
                    }
                    return fileM145083O;
                } catch (IOException e2) {
                    e = e2;
                    CrashHelper.m81296c(e);
                    bitmap.recycle();
                    if (NullChecker.m81303a(fileOutputStream2)) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e3) {
                            CrashHelper.m81296c(e3);
                        }
                    }
                    return null;
                } catch (OutOfMemoryError e4) {
                    e = e4;
                    CrashHelper.m81296c(e);
                    bitmap.recycle();
                    if (NullChecker.m81303a(fileOutputStream2)) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e5) {
                            CrashHelper.m81296c(e5);
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
                if (NullChecker.m81303a(fileOutputStream3)) {
                    try {
                        fileOutputStream3.close();
                    } catch (IOException e8) {
                        CrashHelper.m81296c(e8);
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream3 = fileOutputStream;
        }
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142152a, viewGroup);
        if (NullChecker.m81304b(this.f39317c) && NullChecker.m81304b(this.f39317c.path)) {
            ((ImageView) viewInflate.findViewById(b5c0.f73593n1)).setImageBitmap(BitmapPrivateProtocolUtil.getBitmap(this.f39317c.path));
            viewInflate.findViewById(b5c0.f73590m1).setOnClickListener(new View.OnClickListener() { // from class: l.xfm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ImageEditAct.m61021V1(view);
                }
            });
            viewInflate.findViewById(b5c0.f73587l1).setOnClickListener(new View.OnClickListener() { // from class: l.yfm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f198077a.m61041r2(view);
                }
            });
            viewInflate.findViewById(b5c0.f73590m1).setOnClickListener(new View.OnClickListener() { // from class: l.zfm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f202961a.m61040q2(view);
                }
            });
        }
        m61035k2(viewInflate);
        return viewInflate;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.mIfInNewUi1ShouldUseThemNewUI2 = true;
        creates(new e30() { // from class: l.wfm
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f186093a.m61032l2((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k2 */
    public final void m61035k2(View view) {
        if ((e51.m114773x() || e51.m114772w()) && view != null) {
            xdl0.m208376g0(view);
        }
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m61037n2() throws Throwable {
        final File fileM61034i2 = m61034i2();
        if (fileM61034i2 == null) {
            lsi0.m151578h(R$string.f38976T0);
        } else {
            FeedModule.f38852a.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(fileM61034i2)));
            e51.m114742G(new Runnable() { // from class: l.dgm
                @Override // java.lang.Runnable
                public final void run() {
                    this.f86115a.m61036m2(fileM61034i2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ void m61038o2() {
        m66873d2();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        m61041r2(null);
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ void m61039p2(View view) {
        this.f39322h.m208717c();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_camera_preview";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        Intent intent = getIntent();
        this.f39317c = (Photo) intent.getParcelableExtra("key_edit_media");
        this.f39318d = (MediaMeta) intent.getSerializableExtra("EXTRA_KEY_CAMERA_META_DATA");
        this.f39319e = intent.getStringExtra("extra_from");
        this.f39320f = intent.getBooleanExtra("extra_show_only_photo", false);
        this.f39321g = intent.getStringExtra("extra_selected_folder_path");
    }

    /* JADX INFO: renamed from: q2 */
    public final void m61040q2(View view) {
        zvf0.m220399u("e_camera_preview_done_button", "p_camera_preview", vwb.m200311Y("beauty_used", (t7l0.f168750d || t7l0.f168751e || t7l0.f168752f) ? "yes" : "no"), vwb.m200311Y("magic_used", t7l0.f168749c ? "yes" : "no"));
        e51.m114774y(new Runnable() { // from class: l.cgm
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f80782a.m61037n2();
            }
        });
    }

    /* JADX INFO: renamed from: r2 */
    public final void m61041r2(View view) {
        m61033s2(this.act.getString(R$string.f39178y0), new d30() { // from class: l.vfm
            @Override // p149l.d30
            public final void call() {
                this.f181285a.m61038o2();
            }
        });
    }
}
