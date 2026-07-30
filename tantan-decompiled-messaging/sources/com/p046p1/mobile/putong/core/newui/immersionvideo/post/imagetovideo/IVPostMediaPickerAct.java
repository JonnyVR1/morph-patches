package com.p046p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0427k;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.NullChecker;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p149l.e30;
import p149l.f6c0;
import p149l.mgh0;
import p149l.qib0;
import p149l.qzb0;
import p149l.rhi;
import p149l.u4c0;
import p149l.vwb;
import p149l.w0c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class IVPostMediaPickerAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public IVPostMediaPickerFrag f24151c;

    /* JADX INFO: renamed from: d */
    public MediaPickerParamsObject f24152d;

    /* JADX INFO: renamed from: Y1 */
    public static Intent m39307Y1(Context context, MediaPickerParamsObject mediaPickerParamsObject) {
        Intent intent = new Intent(context, (Class<?>) IVPostMediaPickerAct.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("params_object", mediaPickerParamsObject);
        intent.putExtra("extra_bundle", bundle);
        return intent;
    }

    /* JADX INFO: renamed from: Z1 */
    private void m39308Z1(View view) {
        xdl0.m208329E0(view.findViewById(u4c0.f173718A1), new View.OnClickListener() { // from class: l.f6m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f96151a.m39309a2(view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a2 */
    public /* synthetic */ void m39309a2(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b2 */
    public void m39310b2(Bundle bundle) {
        if (NullChecker.m81303a(fragmentManager().m2554h0(u4c0.f173915Lb)) || getIntent() == null || getIntent().getBundleExtra("extra_bundle") == null) {
            return;
        }
        Intent intent = getIntent();
        IVPostMediaPickerFrag iVPostMediaPickerFrag = new IVPostMediaPickerFrag();
        this.f24151c = iVPostMediaPickerFrag;
        iVPostMediaPickerFrag.setArguments(intent.getBundleExtra("extra_bundle"));
        this.f24152d = (MediaPickerParamsObject) intent.getBundleExtra("extra_bundle").getSerializable("params_object");
        AbstractC0427k abstractC0427kM2567m = getSupportFragmentManager().m2567m();
        abstractC0427kM2567m.m2804c(u4c0.f173915Lb, this.f24151c, "MediaPickerFrag");
        abstractC0427kM2567m.mo2708j();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean checkRunningCondition() {
        if (ensurePlugin()) {
            return false;
        }
        startActivity(mgh0.m154564t(getIntent()));
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean ensurePlugin() {
        return !qib0.f154714c0.signedIn_() ? qib0.f154721j0.m192072z(SchemeKey.account) : qib0.m174779J0();
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m66873d2() {
        MediaPickerParamsObject mediaPickerParamsObject;
        super.m66873d2();
        IVPostMediaPickerFrag iVPostMediaPickerFrag = this.f24151c;
        if (iVPostMediaPickerFrag == null || (mediaPickerParamsObject = iVPostMediaPickerFrag.f54011G) == null || mediaPickerParamsObject.finishInAnim == 0) {
            return;
        }
        overridePendingTransition(qzb0.f157020a, mediaPickerParamsObject.finishOutAnim);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95890m4, (ViewGroup) null);
        m39308Z1(viewInflate);
        return viewInflate;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.e6m
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f89625a.m39310b2((Bundle) obj);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (NullChecker.m81303a(this.f24151c)) {
            this.f24151c.onActivityResult(i, i2, intent);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        m66873d2();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void onCropImageResult(String str) {
        if (NullChecker.m81303a(this.f24152d)) {
            int i = this.f24152d.fromType;
            if (i == 1 || i == 7) {
                Picture picture = new Picture();
                picture.status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
                picture.url = rhi.m179355B(str);
                picture.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
                Intent intent = new Intent();
                intent.putExtra(MediaPickerBaseAct.f54603h, vwb.m200324f0(picture));
                if (NullChecker.m81303a(this.f24151c)) {
                    this.f24151c.m78922N4(intent);
                }
                setResult(-1, intent);
                m66873d2();
            }
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_camera_local_album";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setTransparentStatusBar();
        Act act = this.act;
        act.setNavigationBarColor(act.color(w0c0.f183809U));
        if (Build.VERSION.SDK_INT >= 26) {
            act().getWindow().getDecorView().setSystemUiVisibility(act().getWindow().getDecorView().getSystemUiVisibility() & (-17));
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }
}
