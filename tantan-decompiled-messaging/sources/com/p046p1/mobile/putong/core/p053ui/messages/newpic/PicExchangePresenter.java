package com.p046p1.mobile.putong.core.p053ui.messages.newpic;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.loader.app.AbstractC0494a;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.notifications.SysnotifListener;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p149l.anx;
import p149l.b86;
import p149l.bfd0;
import p149l.cfd0;
import p149l.d30;
import p149l.dd70;
import p149l.e30;
import p149l.e51;
import p149l.emx;
import p149l.fub;
import p149l.jq2;
import p149l.mcr;
import p149l.mkd0;
import p149l.mqi0;
import p149l.qg50;
import p149l.rhi;
import p149l.t2h0;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes3.dex */
public class PicExchangePresenter extends jq2<dd70> {

    /* JADX INFO: renamed from: a */
    public anx f32167a;

    /* JADX INFO: renamed from: b */
    public t2h0 f32168b;

    /* JADX INFO: renamed from: c */
    public Status f32169c;

    /* JADX INFO: renamed from: d */
    public Media f32170d;

    /* JADX INFO: renamed from: e */
    public String f32171e;

    /* JADX INFO: renamed from: f */
    public String f32172f;

    /* JADX INFO: renamed from: g */
    public boolean f32173g;

    /* JADX INFO: renamed from: h */
    public Map<String, Drawable> f32174h;

    /* JADX INFO: renamed from: i */
    public boolean f32175i;

    /* JADX INFO: renamed from: j */
    public List<Media> f32176j;

    /* JADX INFO: renamed from: k */
    public boolean f32177k;

    public enum Status {
        main_choose_photo,
        shooting_preview,
        random_preview,
        shooting_preview_del
    }

    public PicExchangePresenter(mcr mcrVar) {
        super(mcrVar);
        this.f32169c = Status.main_choose_photo;
        this.f32170d = null;
        this.f32171e = "";
        this.f32172f = "";
        this.f32173g = true;
        this.f32174h = null;
        this.f32175i = false;
        this.f32177k = true;
    }

    /* JADX INFO: renamed from: n0 */
    private void m49573n0() {
        ((dd70) this.viewModel).f85533a.lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.zc70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202519a.m49589t0((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m49574u0(Bundle bundle) {
        m49584o0();
        this.f32171e = ((dd70) this.viewModel).f85533a.getIntent().getStringExtra("ext_from");
        ((dd70) this.viewModel).m110896r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public /* synthetic */ void m49575x0() {
        this.f32168b = null;
    }

    /* JADX INFO: renamed from: z0 */
    public static Bitmap m49576z0(Bitmap bitmap, int i) {
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
    public void m49577A0() {
        int i;
        if (TextUtils.isEmpty(this.f32172f)) {
            return;
        }
        Picture pictureNew_ = Picture.new_();
        pictureNew_.url = this.f32172f;
        pictureNew_.mediaType = "image/*";
        pictureNew_.status = MediaLocalStatus.get("raw");
        ArrayList arrayListM200299M = vwb.m200299M(pictureNew_);
        Intent intent = new Intent();
        intent.putExtra(MediaPickerBaseAct.f54603h, arrayListM200299M);
        if (this.f32173g) {
            i = m49585p0() ? 11 : 10;
        } else {
            i = 13;
        }
        intent.putExtra("extra_from_type", i);
        ((dd70) this.viewModel).f85533a.setResult(-1, intent);
        ((dd70) this.viewModel).f85533a.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: C0 */
    public void m49578C0(String str) {
        String str2;
        int i;
        HashMap map = new HashMap();
        map.put("receiver_user_id", str);
        if (this.f32173g) {
            str2 = m49585p0() ? SysnotifListener.ACTION_REPLY : "switch";
        } else {
            str2 = "time";
        }
        map.put("new_photo_type", str2);
        V v2 = this.viewModel;
        PicExchangeEditAct picExchangeEditAct = ((dd70) v2).f85533a;
        PicExchangeEditAct picExchangeEditAct2 = ((dd70) v2).f85533a;
        MediaPickerParamsObject.MediaPickerParamsObjectBuilder mediaPickerParamsObjectBuilderAddReportMap = MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).showPreviewEditBtn(false).build()).needAllSelectedMediaPreview().withSubmitButtonTitle(((dd70) this.viewModel).f85533a.getString(R$string.f20979h)).addReportMap(map);
        if (this.f32173g) {
            i = m49585p0() ? 11 : 10;
        } else {
            i = 13;
        }
        picExchangeEditAct.startActivityForResult(MediaPickerAct.m78919X1(picExchangeEditAct2, mediaPickerParamsObjectBuilderAddReportMap.withFromType(i).build()), PutongAct.REQUEST_CODE_PICKER);
    }

    /* JADX INFO: renamed from: D0 */
    public void m49579D0() {
        boolean z;
        boolean zM97827k;
        this.f32167a.m97828l();
        try {
            zM97827k = this.f32167a.m97827k(act());
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
            CrashHelper.m81296c(new RuntimeException("IMomoRecorder prepare error, cppSharedLoaded=" + z + ", xeengineLoaded=" + z2, th));
            zM97827k = false;
        }
        if (zM97827k) {
            this.f32167a.m97831o();
        }
        e51.m114743H(((dd70) this.viewModel).f85533a, new Runnable() { // from class: l.ad70
            @Override // java.lang.Runnable
            public final void run() {
                this.f68914a.m49590y0();
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: E0 */
    public void m49580E0() {
        this.f32167a.m97834r();
        this.f32175i = this.f32167a.m97824h();
    }

    /* JADX INFO: renamed from: F0 */
    public void m49581F0(qg50 qg50Var) {
        this.f32167a.m97835s(qg50Var);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.wc70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f185656a.m49574u0((Bundle) obj);
            }
        }, new d30() { // from class: l.xc70
            @Override // p149l.d30
            public final void call() {
                this.f192183a.m49575x0();
            }
        });
        m49573n0();
    }

    @Override // p149l.q0m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l0 */
    public final void m49582l0() {
        if (((dd70) this.viewModel).f85533a.isFinishing()) {
            return;
        }
        if (vwb.m200296J(this.f32176j)) {
            this.f32174h = new HashMap();
        } else {
            e51.m114774y(new Runnable() { // from class: l.bd70
                @Override // java.lang.Runnable
                public final void run() {
                    this.f75009a.m49587r0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m49583m0() {
        if (this.f32176j != null) {
            m49582l0();
            return;
        }
        final emx emxVar = new emx(act(), true, false, true, 50);
        ((dd70) this.viewModel).f85533a.duringCreated(emxVar.m117242t()).subscribe(mkd0.m154955G(new e30() { // from class: l.yc70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f197417a.m49588s0(emxVar, (List) obj);
            }
        }));
        AbstractC0494a.m3107b(((dd70) this.viewModel).f85533a).mo3088e(0, null, emxVar);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m49584o0() {
        anx anxVar = new anx();
        this.f32167a = anxVar;
        anxVar.m97819c();
        this.f32167a.m97833q();
        t2h0 t2h0Var = new t2h0(act(), this.f32167a);
        this.f32168b = t2h0Var;
        t2h0Var.m186993l(xdl0.m208407w(24.0f));
        this.f32168b.m186990i();
    }

    /* JADX INFO: renamed from: p0 */
    public boolean m49585p0() {
        return TextUtils.equals(this.f32171e, "from_pic_exchange_reply_type");
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m49586q0(HashMap map) {
        if (this.f32174h == null) {
            this.f32174h = new HashMap();
        }
        this.f32174h.clear();
        this.f32174h.putAll(map);
        map.clear();
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m49587r0() {
        Bitmap bitmapM123178n;
        Bitmap bitmapM49576z0;
        List listM100757b = b86.m100757b(this.f32176j, 10);
        final HashMap map = new HashMap();
        int i = 0;
        while (true) {
            int size = listM100757b.size();
            V v2 = this.viewModel;
            if (i >= size) {
                ((dd70) v2).f85533a.runOnUiThread(new Runnable() { // from class: l.cd70
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f80351a.m49586q0(map);
                    }
                });
                return;
            }
            if (((dd70) v2).f85533a.isFinishing()) {
                return;
            }
            mqi0.m155944o();
            String strM179377u = rhi.m179377u(((Media) listM100757b.get(i)).url);
            if (!TextUtils.isEmpty(strM179377u)) {
                File file = new File(strM179377u);
                if (file.exists()) {
                    Uri uriFromFile = Uri.fromFile(file);
                    try {
                        fub fubVarM123168h = fub.m123168h();
                        PicExchangeEditAct picExchangeEditAct = ((dd70) this.viewModel).f85533a;
                        int i2 = PicExchangeLayout.f32142v;
                        bitmapM123178n = fubVarM123168h.m123178n(picExchangeEditAct, uriFromFile, i2, i2, 0);
                    } catch (IOException unused) {
                        bitmapM123178n = null;
                    }
                    if (bitmapM123178n != null && (bitmapM49576z0 = m49576z0(bitmapM123178n, PicExchangeLayout.f32142v)) != null) {
                        bfd0 bfd0VarM106505a = cfd0.m106505a(((dd70) this.viewModel).f85533a.getResources(), bitmapM49576z0);
                        bfd0VarM106505a.m101528e(xdl0.m208407w(24.0f));
                        mqi0.m155944o();
                        map.put(strM179377u, bfd0VarM106505a);
                    }
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m49588s0(emx emxVar, List list) {
        if (((dd70) this.viewModel).f85533a.isFinishing() || list == null) {
            return;
        }
        if (this.f32176j == null) {
            this.f32176j = new ArrayList();
        }
        this.f32176j.addAll(list);
        if (this.f32177k) {
            m49582l0();
        }
        this.f32177k = false;
        if (emxVar.f92263g) {
            AbstractC0494a.m3107b((PicExchangeEditAct) new WeakReference(((dd70) this.viewModel).f85533a).get()).mo3088e(0, null, emxVar);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m49589t0(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            this.f32167a.m97833q();
            m49579D0();
            return;
        }
        if (c4319c == C4319c.f15549j) {
            this.f32167a.m97833q();
            t2h0 t2h0Var = this.f32168b;
            if (t2h0Var != null) {
                t2h0Var.m186992k(true);
                return;
            }
            return;
        }
        if (c4319c == C4319c.f15552m) {
            this.f32167a.m97833q();
            this.f32167a.m97828l();
            this.f32167a = null;
            this.f32174h = null;
            this.f32176j = null;
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m49590y0() {
        if (!this.f32175i || this.f32167a.m97824h()) {
            return;
        }
        this.f32167a.m97834r();
    }
}
