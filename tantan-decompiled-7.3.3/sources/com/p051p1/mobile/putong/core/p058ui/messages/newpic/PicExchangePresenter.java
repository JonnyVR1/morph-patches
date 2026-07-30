package com.p051p1.mobile.putong.core.p058ui.messages.newpic;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.loader.app.AbstractC0495a;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.notifications.SysnotifListener;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p153l.ar2;
import p153l.bbh0;
import p153l.bnl0;
import p153l.bvx;
import p153l.dnd0;
import p153l.end0;
import p153l.g96;
import p153l.jl70;
import p153l.jyb;
import p153l.l51;
import p153l.ner;
import p153l.oki;
import p153l.psd0;
import p153l.pzi0;
import p153l.tvb;
import p153l.wo50;
import p153l.x20;
import p153l.xvx;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class PicExchangePresenter extends ar2<jl70> {

    /* JADX INFO: renamed from: a */
    public xvx f33015a;

    /* JADX INFO: renamed from: b */
    public bbh0 f33016b;

    /* JADX INFO: renamed from: c */
    public Status f33017c;

    /* JADX INFO: renamed from: d */
    public Media f33018d;

    /* JADX INFO: renamed from: e */
    public String f33019e;

    /* JADX INFO: renamed from: f */
    public String f33020f;

    /* JADX INFO: renamed from: g */
    public boolean f33021g;

    /* JADX INFO: renamed from: h */
    public Map<String, Drawable> f33022h;

    /* JADX INFO: renamed from: i */
    public boolean f33023i;

    /* JADX INFO: renamed from: j */
    public List<Media> f33024j;

    /* JADX INFO: renamed from: k */
    public boolean f33025k;

    public enum Status {
        main_choose_photo,
        shooting_preview,
        random_preview,
        shooting_preview_del
    }

    public PicExchangePresenter(ner nerVar) {
        super(nerVar);
        this.f33017c = Status.main_choose_photo;
        this.f33018d = null;
        this.f33019e = "";
        this.f33020f = "";
        this.f33021g = true;
        this.f33022h = null;
        this.f33023i = false;
        this.f33025k = true;
    }

    /* JADX INFO: renamed from: n0 */
    private void m50756n0() {
        ((jl70) this.viewModel).f121481a.lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.fl70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f99627a.m50772t0((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m50757u0(Bundle bundle) {
        m50767o0();
        this.f33019e = ((jl70) this.viewModel).f121481a.getIntent().getStringExtra("ext_from");
        ((jl70) this.viewModel).m145952r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public /* synthetic */ void m50758x0() {
        this.f33016b = null;
    }

    /* JADX INFO: renamed from: z0 */
    public static Bitmap m50759z0(Bitmap bitmap, int i) {
        Bitmap bitmapCreateScaledBitmap;
        Bitmap bitmapCreateBitmap = null;
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int iMax = (Math.max(width, height) * i) / Math.min(width, height);
        int i2 = width > height ? iMax : i;
        if (width > height) {
            iMax = i;
        }
        try {
            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i2, iMax, true);
        } catch (Exception unused) {
            bitmapCreateScaledBitmap = null;
        }
        if (bitmapCreateScaledBitmap == null) {
            return null;
        }
        try {
            bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap, (i2 - i) / 2, (iMax - i) / 2, i, i);
            if (bitmapCreateScaledBitmap != bitmapCreateBitmap) {
                bitmapCreateScaledBitmap.recycle();
            }
        } catch (Exception unused2) {
        }
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: A0 */
    public void m50760A0() {
        int i;
        if (TextUtils.isEmpty(this.f33020f)) {
            return;
        }
        Picture pictureNew_ = Picture.new_();
        pictureNew_.url = this.f33020f;
        pictureNew_.mediaType = "image/*";
        pictureNew_.status = MediaLocalStatus.get("raw");
        ArrayList arrayListM147482M = jyb.m147482M(pictureNew_);
        Intent intent = new Intent();
        intent.putExtra(MediaPickerBaseAct.f55451h, arrayListM147482M);
        if (this.f33021g) {
            i = m50768p0() ? 11 : 10;
        } else {
            i = 13;
        }
        intent.putExtra("extra_from_type", i);
        ((jl70) this.viewModel).f121481a.setResult(-1, intent);
        ((jl70) this.viewModel).f121481a.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: C0 */
    public void m50761C0(String str) {
        String str2;
        int i;
        HashMap map = new HashMap();
        map.put("receiver_user_id", str);
        if (this.f33021g) {
            str2 = m50768p0() ? SysnotifListener.ACTION_REPLY : "switch";
        } else {
            str2 = "time";
        }
        map.put("new_photo_type", str2);
        V v2 = this.viewModel;
        PicExchangeEditAct picExchangeEditAct = ((jl70) v2).f121481a;
        PicExchangeEditAct picExchangeEditAct2 = ((jl70) v2).f121481a;
        MediaPickerParamsObject.MediaPickerParamsObjectBuilder mediaPickerParamsObjectBuilderAddReportMap = MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).showPreviewEditBtn(false).build()).needAllSelectedMediaPreview().withSubmitButtonTitle(((jl70) this.viewModel).f121481a.getString(R$string.f21721h)).addReportMap(map);
        if (this.f33021g) {
            i = m50768p0() ? 11 : 10;
        } else {
            i = 13;
        }
        picExchangeEditAct.startActivityForResult(MediaPickerAct.m80102Y1(picExchangeEditAct2, mediaPickerParamsObjectBuilderAddReportMap.withFromType(i).build()), PutongAct.REQUEST_CODE_PICKER);
    }

    /* JADX INFO: renamed from: D0 */
    public void m50762D0() {
        boolean z;
        boolean zM213272k;
        this.f33015a.m213273l();
        try {
            zM213272k = this.f33015a.m213272k(act());
        } catch (Throwable th) {
            boolean z2 = true;
            try {
                System.loadLibrary("c++_shared");
                z = true;
            } catch (Throwable unused) {
                z = false;
            }
            try {
                System.loadLibrary("xeengine");
            } catch (Throwable unused2) {
                z2 = false;
            }
            CrashHelper.m82479c(new RuntimeException("IMomoRecorder prepare error, cppSharedLoaded=" + z + ", xeengineLoaded=" + z2, th));
            zM213272k = false;
        }
        if (zM213272k) {
            this.f33015a.m213276o();
        }
        l51.m152888H(((jl70) this.viewModel).f121481a, new Runnable() { // from class: l.gl70
            @Override // java.lang.Runnable
            public final void run() {
                this.f104820a.m50773y0();
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: E0 */
    public void m50763E0() {
        this.f33015a.m213279r();
        this.f33023i = this.f33015a.m213269h();
    }

    /* JADX INFO: renamed from: F0 */
    public void m50764F0(wo50 wo50Var) {
        this.f33015a.m213280s(wo50Var);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.cl70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f82349a.m50757u0((Bundle) obj);
            }
        }, new x20() { // from class: l.dl70
            @Override // p153l.x20
            public final void call() {
                this.f89516a.m50758x0();
            }
        });
        m50756n0();
    }

    @Override // p153l.k3m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l0 */
    public final void m50765l0() {
        if (((jl70) this.viewModel).f121481a.isFinishing()) {
            return;
        }
        if (jyb.m147479J(this.f33024j)) {
            this.f33022h = new HashMap();
        } else {
            l51.m152919y(new Runnable() { // from class: l.hl70
                @Override // java.lang.Runnable
                public final void run() {
                    this.f110485a.m50770r0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m50766m0() {
        if (this.f33024j != null) {
            m50765l0();
            return;
        }
        final bvx bvxVar = new bvx(act(), true, false, true, 50);
        ((jl70) this.viewModel).f121481a.duringCreated(bvxVar.m106628t()).subscribe(psd0.m173596G(new y20() { // from class: l.el70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f94484a.m50771s0(bvxVar, (List) obj);
            }
        }));
        AbstractC0495a.m3108b(((jl70) this.viewModel).f121481a).mo3089e(0, null, bvxVar);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m50767o0() {
        xvx xvxVar = new xvx();
        this.f33015a = xvxVar;
        xvxVar.m213264c();
        this.f33015a.m213278q();
        bbh0 bbh0Var = new bbh0(act(), this.f33015a);
        this.f33016b = bbh0Var;
        bbh0Var.m103283l(bnl0.m105587w(24.0f));
        this.f33016b.m103280i();
    }

    /* JADX INFO: renamed from: p0 */
    public boolean m50768p0() {
        return TextUtils.equals(this.f33019e, "from_pic_exchange_reply_type");
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m50769q0(HashMap map) {
        if (this.f33022h == null) {
            this.f33022h = new HashMap();
        }
        this.f33022h.clear();
        this.f33022h.putAll(map);
        map.clear();
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m50770r0() {
        Bitmap bitmapM192797n;
        Bitmap bitmapM50759z0;
        List listM129515b = g96.m129515b(this.f33024j, 10);
        final HashMap map = new HashMap();
        int i = 0;
        while (true) {
            int size = listM129515b.size();
            V v2 = this.viewModel;
            if (i >= size) {
                ((jl70) v2).f121481a.runOnUiThread(new Runnable() { // from class: l.il70
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f115532a.m50769q0(map);
                    }
                });
                return;
            }
            if (((jl70) v2).f121481a.isFinishing()) {
                return;
            }
            pzi0.m174454o();
            String strM168033u = oki.m168033u(((Media) listM129515b.get(i)).url);
            if (!TextUtils.isEmpty(strM168033u)) {
                File file = new File(strM168033u);
                if (file.exists()) {
                    Uri uriFromFile = Uri.fromFile(file);
                    try {
                        tvb tvbVarM192787h = tvb.m192787h();
                        PicExchangeEditAct picExchangeEditAct = ((jl70) this.viewModel).f121481a;
                        int i2 = PicExchangeLayout.f32990v;
                        bitmapM192797n = tvbVarM192787h.m192797n(picExchangeEditAct, uriFromFile, i2, i2, 0);
                    } catch (IOException unused) {
                        bitmapM192797n = null;
                    }
                    if (bitmapM192797n != null && (bitmapM50759z0 = m50759z0(bitmapM192797n, PicExchangeLayout.f32990v)) != null) {
                        dnd0 dnd0VarM121524a = end0.m121524a(((jl70) this.viewModel).f121481a.getResources(), bitmapM50759z0);
                        dnd0VarM121524a.m117059e(bnl0.m105587w(24.0f));
                        pzi0.m174454o();
                        map.put(strM168033u, dnd0VarM121524a);
                    }
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m50771s0(bvx bvxVar, List list) {
        if (((jl70) this.viewModel).f121481a.isFinishing() || list == null) {
            return;
        }
        if (this.f33024j == null) {
            this.f33024j = new ArrayList();
        }
        this.f33024j.addAll(list);
        if (this.f33025k) {
            m50765l0();
        }
        this.f33025k = false;
        if (bvxVar.f78666g) {
            AbstractC0495a.m3108b((PicExchangeEditAct) new WeakReference(((jl70) this.viewModel).f121481a).get()).mo3089e(0, null, bvxVar);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m50772t0(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            this.f33015a.m213278q();
            m50762D0();
            return;
        }
        if (c4470c == C4470c.f16268j) {
            this.f33015a.m213278q();
            bbh0 bbh0Var = this.f33016b;
            if (bbh0Var != null) {
                bbh0Var.m103282k(true);
                return;
            }
            return;
        }
        if (c4470c == C4470c.f16271m) {
            this.f33015a.m213278q();
            this.f33015a.m213273l();
            this.f33015a = null;
            this.f33022h = null;
            this.f33024j = null;
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m50773y0() {
        if (!this.f33023i || this.f33015a.m213269h()) {
            return;
        }
        this.f33015a.m213279r();
    }
}
