package com.p000p1.mobile.putong.feed.newui.camera;

import android.content.Context;
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
import com.p000p1.mobile.putong.data.MediaLocalStatus;
import com.p000p1.mobile.putong.data.MediaMeta;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.newui.camera.ImageEditAct;
import com.p000p1.mobile.putong.feed.newui.camera.momosdk.Photo;
import com.p000p1.mobile.putong.feed.newui.status.post.FeedPostStatusAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.ui.permission.PermissionHelper;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import l.d30;
import l.e30;
import l.e51;
import l.j760;
import l.k9j;
import l.lsi0;
import l.rhi;
import l.vwb;
import l.xdl0;
import l.xh0;
import l.zvf0;
import p007l.b5c0;
import p007l.o6c0;
import p007l.oe40;
import p007l.t7l0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ImageEditAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public Photo f778c;

    /* JADX INFO: renamed from: d */
    public MediaMeta f779d;

    /* JADX INFO: renamed from: e */
    public String f780e;

    /* JADX INFO: renamed from: f */
    public boolean f781f;

    /* JADX INFO: renamed from: g */
    public String f782g;

    /* JADX INFO: renamed from: h */
    public xh0 f783h;

    /* JADX INFO: renamed from: V1 */
    public static /* synthetic */ void m1951V1(View view) {
    }

    /* JADX INFO: renamed from: g2 */
    public static Intent m1960g2(FragmentActivity fragmentActivity, Photo photo, MediaMeta mediaMeta, String str, boolean z, String str2) {
        Intent intent = new Intent((Context) fragmentActivity, (Class<?>) ImageEditAct.class);
        intent.putExtra("key_edit_media", photo);
        intent.putExtra("EXTRA_KEY_CAMERA_META_DATA", mediaMeta);
        intent.putExtra("extra_from", str);
        intent.putExtra("extra_show_only_photo", z);
        intent.putExtra("extra_selected_folder_path", str2);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h2, reason: merged with bridge method [inline-methods] */
    public void m1966m2(File file) {
        if (act().isFinishing()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Picture picture = new Picture();
        picture.url = rhi.B(file.getPath());
        picture.mediaType = "image/*";
        picture.status = MediaLocalStatus.get(MediaLocalStatus.raw);
        MediaMeta mediaMeta = this.f779d;
        picture.meta = mediaMeta;
        mediaMeta.type = "photo";
        mediaMeta.source = "shoot";
        arrayList.add(picture);
        if (TextUtils.equals(this.f780e, "my_states")) {
            act().startActivity(FeedPostStatusAct.m6954u2(act(), arrayList));
            act().overridePendingTransition(0, 0);
        } else {
            oe40.m12599s0(this, arrayList, this.f782g, this.f781f, this.f780e);
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l2 */
    public /* synthetic */ void m1962l2(Bundle bundle) {
        setTransparentStatusBar();
        setSwipeBackEnable(false);
    }

    /* JADX INFO: renamed from: s2 */
    private void m1963s2(String str, final d30 d30Var) {
        xh0 xh0VarA = new xh0.a(act()).g(false).j(str).e(R$string.f606s3).q(R$string.f478a).c(new View.OnClickListener() { // from class: l.agm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        }).o(new View.OnClickListener() { // from class: l.bgm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6318a.m1969p2(view);
            }
        }).a();
        this.f783h = xh0VarA;
        xh0VarA.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0035: MOVE (r1 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:54), block:B:12:0x0035 */
    /* JADX INFO: renamed from: i2 */
    public final File m1964i2() throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        Bitmap bitmap = BitmapPrivateProtocolUtil.getBitmap(this.f778c.path);
        FileOutputStream fileOutputStream3 = null;
        try {
            if (bitmap == null) {
                return null;
            }
            try {
                File fileO = k9j.O("jpg");
                fileOutputStream2 = new FileOutputStream(fileO);
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream2);
                    fileOutputStream2.flush();
                    if (Build.VERSION.SDK_INT >= 29 || PermissionHelper.b(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"})) {
                        MediaStore.Images.Media.insertImage(getContentResolver(), fileO.getAbsolutePath(), fileO.getName(), fileO.getName());
                    }
                    bitmap.recycle();
                    if (NullChecker.a(fileOutputStream2)) {
                        try {
                            fileOutputStream2.close();
                            return fileO;
                        } catch (IOException e) {
                            CrashHelper.c(e);
                        }
                    }
                    return fileO;
                } catch (IOException e2) {
                    e = e2;
                    CrashHelper.c(e);
                    bitmap.recycle();
                    if (NullChecker.a(fileOutputStream2)) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e3) {
                            CrashHelper.c(e3);
                        }
                    }
                    return null;
                } catch (OutOfMemoryError e4) {
                    e = e4;
                    CrashHelper.c(e);
                    bitmap.recycle();
                    if (NullChecker.a(fileOutputStream2)) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e5) {
                            CrashHelper.c(e5);
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
                if (NullChecker.a(fileOutputStream3)) {
                    try {
                        fileOutputStream3.close();
                    } catch (IOException e8) {
                        CrashHelper.c(e8);
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream3 = fileOutputStream;
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11171a, viewGroup);
        if (NullChecker.b(this.f778c) && NullChecker.b(this.f778c.path)) {
            ((ImageView) viewInflate.findViewById(b5c0.f6074n1)).setImageBitmap(BitmapPrivateProtocolUtil.getBitmap(this.f778c.path));
            viewInflate.findViewById(b5c0.f6071m1).setOnClickListener(new View.OnClickListener() { // from class: l.xfm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ImageEditAct.m1951V1(view);
                }
            });
            viewInflate.findViewById(b5c0.f6068l1).setOnClickListener(new View.OnClickListener() { // from class: l.yfm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f15422a.m1971r2(view);
                }
            });
            viewInflate.findViewById(b5c0.f6071m1).setOnClickListener(new View.OnClickListener() { // from class: l.zfm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f15729a.m1970q2(view);
                }
            });
        }
        m1965k2(viewInflate);
        return viewInflate;
    }

    public void initDataOnCreate() {
        super.initDataOnCreate();
        ((PutongAct) this).mIfInNewUi1ShouldUseThemNewUI2 = true;
        creates(new e30() { // from class: l.wfm
            public final void call(Object obj) {
                this.f14535a.m1962l2((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k2 */
    public final void m1965k2(View view) {
        if ((e51.x() || e51.w()) && view != null) {
            xdl0.g0(new View[]{view});
        }
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m1967n2() throws Throwable {
        final File fileM1964i2 = m1964i2();
        if (fileM1964i2 == null) {
            lsi0.h(R$string.f437T0);
        } else {
            FeedModule.f313a.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(fileM1964i2)));
            e51.G(new Runnable() { // from class: l.dgm
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6927a.m1966m2(fileM1964i2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ void m1968o2() {
        finish();
    }

    public void onBackPressed() {
        m1971r2(null);
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ void m1969p2(View view) {
        this.f783h.c();
    }

    public String pageId() {
        return "p_camera_preview";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        Intent intent = getIntent();
        this.f778c = (Photo) intent.getParcelableExtra("key_edit_media");
        this.f779d = (MediaMeta) intent.getSerializableExtra("EXTRA_KEY_CAMERA_META_DATA");
        this.f780e = intent.getStringExtra("extra_from");
        this.f781f = intent.getBooleanExtra("extra_show_only_photo", false);
        this.f782g = intent.getStringExtra("extra_selected_folder_path");
    }

    /* JADX INFO: renamed from: q2 */
    public final void m1970q2(View view) {
        zvf0.u("e_camera_preview_done_button", "p_camera_preview", new j760[]{vwb.Y("beauty_used", (t7l0.f13218d || t7l0.f13219e || t7l0.f13220f) ? "yes" : "no"), vwb.Y("magic_used", t7l0.f13217c ? "yes" : "no")});
        e51.y(new Runnable() { // from class: l.cgm
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f6644a.m1967n2();
            }
        });
    }

    /* JADX INFO: renamed from: r2 */
    public final void m1971r2(View view) {
        m1963s2(((Act) this).act.getString(R$string.f639y0), new d30() { // from class: l.vfm
            public final void call() {
                this.f14163a.m1968o2();
            }
        });
    }
}
