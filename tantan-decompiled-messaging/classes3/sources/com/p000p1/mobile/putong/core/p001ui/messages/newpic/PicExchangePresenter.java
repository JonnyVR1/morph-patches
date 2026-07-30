package com.p000p1.mobile.putong.core.p001ui.messages.newpic;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.loader.app.a;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.PutongCoreMvpAct;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MediaLocalStatus;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p1.mobile.putong.ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.b86;
import l.bfd0;
import l.cfd0;
import l.e51;
import l.emx;
import l.fub;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.mqi0;
import l.rhi;
import l.s7m;
import l.vwb;
import l.xdl0;
import p003l.anx;
import p003l.d30;
import p003l.dd70;
import p003l.e30;
import p003l.m250;
import p003l.qg50;
import p003l.t2h0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class PicExchangePresenter extends jq2<dd70> {

    /* JADX INFO: renamed from: a */
    public anx f2058a;

    /* JADX INFO: renamed from: b */
    public t2h0 f2059b;

    /* JADX INFO: renamed from: c */
    public Status f2060c;

    /* JADX INFO: renamed from: d */
    public Media f2061d;

    /* JADX INFO: renamed from: e */
    public String f2062e;

    /* JADX INFO: renamed from: f */
    public String f2063f;

    /* JADX INFO: renamed from: g */
    public boolean f2064g;

    /* JADX INFO: renamed from: h */
    public Map<String, Drawable> f2065h;

    /* JADX INFO: renamed from: i */
    public boolean f2066i;

    /* JADX INFO: renamed from: j */
    public List<Media> f2067j;

    /* JADX INFO: renamed from: k */
    public boolean f2068k;

    public enum Status {
        main_choose_photo,
        shooting_preview,
        random_preview,
        shooting_preview_del
    }

    public PicExchangePresenter(mcr mcrVar) {
        super(mcrVar);
        this.f2060c = Status.main_choose_photo;
        this.f2061d = null;
        this.f2062e = "";
        this.f2063f = "";
        this.f2064g = true;
        this.f2065h = null;
        this.f2066i = false;
        this.f2068k = true;
    }

    /* JADX INFO: renamed from: n0 */
    private void m2722n0() {
        ((dd70) ((jq2) this).viewModel).f2942a.lifecycle().subscribe((m250) mkd0.G(new e30() { // from class: l.zc70
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f9305a.m2739t0((c) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m2723u0(Bundle bundle) {
        m2734o0();
        this.f2062e = ((dd70) ((jq2) this).viewModel).f2942a.getIntent().getStringExtra("ext_from");
        ((dd70) ((jq2) this).viewModel).m3530r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public /* synthetic */ void m2724x0() {
        this.f2059b = null;
    }

    /* JADX INFO: renamed from: z0 */
    public static Bitmap m2725z0(Bitmap bitmap, int i) {
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
    public void m2726A0() {
        int i;
        if (TextUtils.isEmpty(this.f2063f)) {
            return;
        }
        Picture pictureNew_ = Picture.new_();
        ((Media) pictureNew_).url = this.f2063f;
        ((Media) pictureNew_).mediaType = "image/*";
        ((Media) pictureNew_).status = MediaLocalStatus.get("raw");
        ArrayList arrayListM = vwb.M(pictureNew_);
        Intent intent = new Intent();
        intent.putExtra(MediaPickerBaseAct.h, arrayListM);
        if (this.f2064g) {
            i = m2735p0() ? 11 : 10;
        } else {
            i = 13;
        }
        intent.putExtra("extra_from_type", i);
        ((dd70) ((jq2) this).viewModel).f2942a.setResult(-1, intent);
        ((dd70) ((jq2) this).viewModel).f2942a.finish();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: C0 */
    public void m2727C0(String str) {
        String str2;
        int i;
        HashMap map = new HashMap();
        map.put("receiver_user_id", str);
        if (this.f2064g) {
            str2 = m2735p0() ? "reply" : "switch";
        } else {
            str2 = "time";
        }
        map.put("new_photo_type", str2);
        s7m s7mVar = ((jq2) this).viewModel;
        PicExchangeEditAct picExchangeEditAct = ((dd70) s7mVar).f2942a;
        PutongCoreMvpAct putongCoreMvpAct = ((dd70) s7mVar).f2942a;
        MediaPickerParamsObject.MediaPickerParamsObjectBuilder mediaPickerParamsObjectBuilderAddReportMap = MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).showPreviewEditBtn(false).build()).needAllSelectedMediaPreview().withSubmitButtonTitle(((dd70) ((jq2) this).viewModel).f2942a.getString(R.string.h)).addReportMap(map);
        if (this.f2064g) {
            i = m2735p0() ? 11 : 10;
        } else {
            i = 13;
        }
        picExchangeEditAct.startActivityForResult(MediaPickerAct.X1(putongCoreMvpAct, mediaPickerParamsObjectBuilderAddReportMap.withFromType(i).build()), 786);
    }

    /* JADX INFO: renamed from: D0 */
    public void m2728D0() {
        boolean z;
        boolean zM2896k;
        this.f2058a.m2897l();
        try {
            zM2896k = this.f2058a.m2896k(act());
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
            CrashHelper.c(new RuntimeException("IMomoRecorder prepare error, cppSharedLoaded=" + z + ", xeengineLoaded=" + z2, th));
            zM2896k = false;
        }
        if (zM2896k) {
            this.f2058a.m2900o();
        }
        e51.H(((dd70) ((jq2) this).viewModel).f2942a, new Runnable() { // from class: l.ad70
            @Override // java.lang.Runnable
            public final void run() {
                this.f2141a.m2740y0();
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: E0 */
    public void m2729E0() {
        this.f2058a.m2903r();
        this.f2066i = this.f2058a.m2893h();
    }

    /* JADX INFO: renamed from: F0 */
    public void m2730F0(qg50 qg50Var) {
        this.f2058a.m2904s(qg50Var);
    }

    /* JADX INFO: renamed from: a0 */
    public void m2731a0() {
        super.a0();
        creates(new e30() { // from class: l.wc70
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f8532a.m2723u0((Bundle) obj);
            }
        }, new d30() { // from class: l.xc70
            @Override // p003l.d30
            public final void call() {
                this.f8765a.m2724x0();
            }
        });
        m2722n0();
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: l0 */
    public final void m2732l0() {
        if (((dd70) ((jq2) this).viewModel).f2942a.isFinishing()) {
            return;
        }
        if (vwb.J(this.f2067j)) {
            this.f2065h = new HashMap();
        } else {
            e51.y(new Runnable() { // from class: l.bd70
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2374a.m2737r0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m2733m0() {
        if (this.f2067j != null) {
            m2732l0();
            return;
        }
        final emx emxVar = new emx(act(), true, false, true, 50);
        ((dd70) ((jq2) this).viewModel).f2942a.duringCreated(emxVar.t()).subscribe((m250) mkd0.G(new e30() { // from class: l.yc70
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f9056a.m2738s0(emxVar, (List) obj);
            }
        }));
        a.b(((dd70) ((jq2) this).viewModel).f2942a).e(0, (Bundle) null, emxVar);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m2734o0() {
        anx anxVar = new anx();
        this.f2058a = anxVar;
        anxVar.m2888c();
        this.f2058a.m2902q();
        t2h0 t2h0Var = new t2h0(act(), this.f2058a);
        this.f2059b = t2h0Var;
        t2h0Var.m7702l(xdl0.w(24.0f));
        this.f2059b.m7699i();
    }

    /* JADX INFO: renamed from: p0 */
    public boolean m2735p0() {
        return TextUtils.equals(this.f2062e, "from_pic_exchange_reply_type");
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m2736q0(HashMap map) {
        if (this.f2065h == null) {
            this.f2065h = new HashMap();
        }
        this.f2065h.clear();
        this.f2065h.putAll(map);
        map.clear();
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m2737r0() {
        Bitmap bitmapN;
        Bitmap bitmapM2725z0;
        List listB = b86.b(this.f2067j, 10);
        final HashMap map = new HashMap();
        int i = 0;
        while (true) {
            int size = listB.size();
            s7m s7mVar = ((jq2) this).viewModel;
            if (i >= size) {
                ((dd70) s7mVar).f2942a.runOnUiThread(new Runnable() { // from class: l.cd70
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f2621a.m2736q0(map);
                    }
                });
                return;
            }
            if (((dd70) s7mVar).f2942a.isFinishing()) {
                return;
            }
            mqi0.o();
            String strU = rhi.u(((Media) listB.get(i)).url);
            if (!TextUtils.isEmpty(strU)) {
                File file = new File(strU);
                if (file.exists()) {
                    Uri uriFromFile = Uri.fromFile(file);
                    try {
                        fub fubVarH = fub.h();
                        PutongCoreMvpAct putongCoreMvpAct = ((dd70) ((jq2) this).viewModel).f2942a;
                        int i2 = PicExchangeLayout.f2033v;
                        bitmapN = fubVarH.n(putongCoreMvpAct, uriFromFile, i2, i2, 0);
                    } catch (IOException unused) {
                        bitmapN = null;
                    }
                    if (bitmapN != null && (bitmapM2725z0 = m2725z0(bitmapN, PicExchangeLayout.f2033v)) != null) {
                        bfd0 bfd0VarA = cfd0.a(((dd70) ((jq2) this).viewModel).f2942a.getResources(), bitmapM2725z0);
                        bfd0VarA.e(xdl0.w(24.0f));
                        mqi0.o();
                        map.put(strU, bfd0VarA);
                    }
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m2738s0(emx emxVar, List list) {
        if (((dd70) ((jq2) this).viewModel).f2942a.isFinishing() || list == null) {
            return;
        }
        if (this.f2067j == null) {
            this.f2067j = new ArrayList();
        }
        this.f2067j.addAll(list);
        if (this.f2068k) {
            m2732l0();
        }
        this.f2068k = false;
        if (emxVar.g) {
            a.b((PicExchangeEditAct) new WeakReference(((dd70) ((jq2) this).viewModel).f2942a).get()).e(0, (Bundle) null, emxVar);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m2739t0(c cVar) {
        if (cVar == c.i) {
            this.f2058a.m2902q();
            m2728D0();
            return;
        }
        if (cVar == c.j) {
            this.f2058a.m2902q();
            t2h0 t2h0Var = this.f2059b;
            if (t2h0Var != null) {
                t2h0Var.m7701k(true);
                return;
            }
            return;
        }
        if (cVar == c.m) {
            this.f2058a.m2902q();
            this.f2058a.m2897l();
            this.f2058a = null;
            this.f2065h = null;
            this.f2067j = null;
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m2740y0() {
        if (!this.f2066i || this.f2058a.m2893h()) {
            return;
        }
        this.f2058a.m2903r();
    }
}
