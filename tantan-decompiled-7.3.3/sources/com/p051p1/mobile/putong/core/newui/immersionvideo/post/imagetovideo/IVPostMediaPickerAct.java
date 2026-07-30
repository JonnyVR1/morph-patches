package com.p051p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0428k;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.NullChecker;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p153l.adc0;
import p153l.bnl0;
import p153l.c9c0;
import p153l.jyb;
import p153l.kec0;
import p153l.oki;
import p153l.toh0;
import p153l.uqb0;
import p153l.w7c0;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class IVPostMediaPickerAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public IVPostMediaPickerFrag f24893c;

    /* JADX INFO: renamed from: d */
    public MediaPickerParamsObject f24894d;

    /* JADX INFO: renamed from: Z1 */
    public static Intent m40310Z1(Context context, MediaPickerParamsObject mediaPickerParamsObject) {
        Intent intent = new Intent(context, (Class<?>) IVPostMediaPickerAct.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("params_object", mediaPickerParamsObject);
        intent.putExtra("extra_bundle", bundle);
        return intent;
    }

    /* JADX INFO: renamed from: a2 */
    private void m40311a2(View view) {
        bnl0.m105509E0(view.findViewById(adc0.f69806A1), new View.OnClickListener() { // from class: l.v8m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f182882a.m40312b2(view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b2 */
    public /* synthetic */ void m40312b2(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c2 */
    public void m40313c2(Bundle bundle) {
        if (NullChecker.m82486a(fragmentManager().m2555h0(adc0.f70037Nb)) || getIntent() == null || getIntent().getBundleExtra("extra_bundle") == null) {
            return;
        }
        Intent intent = getIntent();
        IVPostMediaPickerFrag iVPostMediaPickerFrag = new IVPostMediaPickerFrag();
        this.f24893c = iVPostMediaPickerFrag;
        iVPostMediaPickerFrag.setArguments(intent.getBundleExtra("extra_bundle"));
        this.f24894d = (MediaPickerParamsObject) intent.getBundleExtra("extra_bundle").getSerializable("params_object");
        AbstractC0428k abstractC0428kM2568m = getSupportFragmentManager().m2568m();
        abstractC0428kM2568m.m2805c(adc0.f70037Nb, this.f24893c, "MediaPickerFrag");
        abstractC0428kM2568m.mo2709j();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean checkRunningCondition() {
        if (ensurePlugin()) {
            return false;
        }
        startActivity(toh0.m192060t(getIntent()));
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean ensurePlugin() {
        return !uqb0.f180397c0.signedIn_() ? uqb0.f180404j0.m115602z(SchemeKey.account) : uqb0.m197233J0();
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m68056e2() {
        MediaPickerParamsObject mediaPickerParamsObject;
        super.m68056e2();
        IVPostMediaPickerFrag iVPostMediaPickerFrag = this.f24893c;
        if (iVPostMediaPickerFrag == null || (mediaPickerParamsObject = iVPostMediaPickerFrag.f54859G) == null || mediaPickerParamsObject.finishInAnim == 0) {
            return;
        }
        overridePendingTransition(w7c0.f187731a, mediaPickerParamsObject.finishOutAnim);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125944m4, (ViewGroup) null);
        m40311a2(viewInflate);
        return viewInflate;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new y20() { // from class: l.u8m
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178058a.m40313c2((Bundle) obj);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (NullChecker.m82486a(this.f24893c)) {
            this.f24893c.onActivityResult(i, i2, intent);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        m68056e2();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void onCropImageResult(String str) {
        if (NullChecker.m82486a(this.f24894d)) {
            int i = this.f24894d.fromType;
            if (i == 1 || i == 7) {
                Picture picture = new Picture();
                picture.status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
                picture.url = oki.m168011B(str);
                picture.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
                Intent intent = new Intent();
                intent.putExtra(MediaPickerBaseAct.f55451h, jyb.m147507f0(picture));
                if (NullChecker.m82486a(this.f24893c)) {
                    this.f24893c.m80105N4(intent);
                }
                setResult(-1, intent);
                m68056e2();
            }
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_camera_local_album";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setTransparentStatusBar();
        Act act = this.act;
        act.setNavigationBarColor(act.color(c9c0.f80381V));
        if (Build.VERSION.SDK_INT >= 26) {
            act().getWindow().getDecorView().setSystemUiVisibility(act().getWindow().getDecorView().getSystemUiVisibility() & (-17));
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }
}
