package com.p000p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.k;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p000p1.mobile.putong.p004ui.mediapicker.MediaPickerBaseAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MediaLocalStatus;
import com.p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.f6c0;
import l.qib0;
import l.qzb0;
import l.rhi;
import l.u4c0;
import l.vwb;
import l.w0c0;
import l.xdl0;
import p009l.mgh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class IVPostMediaPickerAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public IVPostMediaPickerFrag f2929c;

    /* JADX INFO: renamed from: d */
    public MediaPickerParamsObject f2930d;

    /* JADX INFO: renamed from: Y1 */
    public static Intent m3332Y1(Context context, MediaPickerParamsObject mediaPickerParamsObject) {
        Intent intent = new Intent(context, (Class<?>) IVPostMediaPickerAct.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("params_object", mediaPickerParamsObject);
        intent.putExtra("extra_bundle", bundle);
        return intent;
    }

    /* JADX INFO: renamed from: Z1 */
    private void m3333Z1(View view) {
        xdl0.E0(view.findViewById(u4c0.A1), new View.OnClickListener() { // from class: l.f6m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f12840a.m3334a2(view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a2 */
    public /* synthetic */ void m3334a2(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b2 */
    public void m3335b2(Bundle bundle) {
        if (NullChecker.a(fragmentManager().h0(u4c0.Lb)) || getIntent() == null || getIntent().getBundleExtra("extra_bundle") == null) {
            return;
        }
        Intent intent = getIntent();
        IVPostMediaPickerFrag iVPostMediaPickerFrag = new IVPostMediaPickerFrag();
        this.f2929c = iVPostMediaPickerFrag;
        iVPostMediaPickerFrag.setArguments(intent.getBundleExtra("extra_bundle"));
        this.f2930d = (MediaPickerParamsObject) intent.getBundleExtra("extra_bundle").getSerializable("params_object");
        k kVarM = getSupportFragmentManager().m();
        kVarM.c(u4c0.Lb, this.f2929c, "MediaPickerFrag");
        kVarM.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean checkRunningCondition() {
        if (ensurePlugin()) {
            return false;
        }
        startActivity(mgh0.m18466t(getIntent()));
        return true;
    }

    public boolean ensurePlugin() {
        return !qib0.c0.signedIn_() ? qib0.j0.z("account") : qib0.J0();
    }

    public void finish() {
        MediaPickerParamsObject mediaPickerParamsObject;
        super/*com.p1.mobile.android.app.Act*/.finish();
        IVPostMediaPickerFrag iVPostMediaPickerFrag = this.f2929c;
        if (iVPostMediaPickerFrag == null || (mediaPickerParamsObject = iVPostMediaPickerFrag.f7617G) == null || mediaPickerParamsObject.finishInAnim == 0) {
            return;
        }
        overridePendingTransition(qzb0.a, mediaPickerParamsObject.finishOutAnim);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.m4, (ViewGroup) null);
        m3333Z1(viewInflate);
        return viewInflate;
    }

    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.e6m
            public final void call(Object obj) {
                this.f12429a.m3335b2((Bundle) obj);
            }
        });
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (NullChecker.a(this.f2929c)) {
            this.f2929c.onActivityResult(i, i2, intent);
        }
    }

    public void onBackPressed() {
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCropImageResult(String str) {
        if (NullChecker.a(this.f2930d)) {
            int i = this.f2930d.fromType;
            if (i == 1 || i == 7) {
                Picture picture = new Picture();
                ((Media) picture).status = MediaLocalStatus.get("preprocessed");
                ((Media) picture).url = rhi.B(str);
                ((Media) picture).mediaType = "image/jpeg";
                Intent intent = new Intent();
                intent.putExtra(MediaPickerBaseAct.f8209h, vwb.f0(new Picture[]{picture}));
                if (NullChecker.a(this.f2929c)) {
                    this.f2929c.m9220N4(intent);
                }
                setResult(-1, intent);
                finish();
            }
        }
    }

    public String pageId() {
        return "p_camera_local_album";
    }

    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setTransparentStatusBar();
        Act act = ((Act) this).act;
        act.setNavigationBarColor(act.color(w0c0.U));
        if (Build.VERSION.SDK_INT >= 26) {
            act().getWindow().getDecorView().setSystemUiVisibility(act().getWindow().getDecorView().getSystemUiVisibility() & (-17));
        }
    }

    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }
}
