package com.p051p1.mobile.putong.core.p058ui.growth.fakeexperience.act;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.growth.fakeexperience.model.FakeUploadModel;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileMediaAct;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import java.util.ArrayList;
import java.util.List;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p153l.bnl0;
import p153l.cmc0;
import p153l.gra;
import p153l.jyb;
import p153l.oki;
import p153l.qa00;
import p153l.r4g;
import p153l.sim;
import p153l.x7c0;
import p153l.y20;
import p153l.y4g;
import p153l.z7c0;

/* JADX INFO: loaded from: classes3.dex */
public class FakeUploadPhotoAct extends ProfileMediaAct {

    /* JADX INFO: renamed from: c */
    public r4g f30369c;

    /* JADX INFO: renamed from: d */
    public y4g f30370d;

    /* JADX INFO: renamed from: e */
    public int f30371e = -1;

    /* JADX INFO: renamed from: f */
    public boolean f30372f = false;

    /* JADX INFO: renamed from: g */
    public FakeUploadModel f30373g;

    /* JADX INFO: renamed from: Z1 */
    public static Intent m47154Z1(Context context, ArrayList<Media> arrayList) {
        FakeUploadModel fakeUploadModel = new FakeUploadModel();
        fakeUploadModel.mediaArrayList = arrayList;
        Intent intent = new Intent(context, (Class<?>) FakeUploadPhotoAct.class);
        intent.putExtra("fake_upload_img", fakeUploadModel);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        int size = userM116600p9.pictures.size();
        if (!jyb.m147479J(userM116600p9.pictures)) {
            this.f30370d.m214217A(userM116600p9.pictures);
        }
        FakeUploadModel fakeUploadModel = this.f30373g;
        if (fakeUploadModel == null || jyb.m147479J(fakeUploadModel.mediaArrayList)) {
            return;
        }
        this.f30370d.m214233y(this.f30373g.mediaArrayList.get(0), size);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.ProfileMediaAct, p153l.xyl
    /* JADX INFO: renamed from: f2 */
    public void mo44250f2(int i, String str) {
        this.f30371e = i;
        cmc0.m111162b(act(), str, true);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.ProfileMediaAct, p153l.xyl
    /* JADX INFO: renamed from: i0 */
    public void mo47155i0(int i, boolean z) {
        mo44257n0(i, z, false, false);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f30370d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f30369c = new r4g(this);
        y4g y4gVar = new y4g(this);
        this.f30370d = y4gVar;
        this.f30369c.mo52715C(y4gVar);
        this.f30369c.mo40472Z();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f30369c.mo40473a0();
        creates(new y20() { // from class: l.m4g
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134791a.lambda$initSubscription$0((Bundle) obj);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.ProfileMediaAct, p153l.xyl
    /* JADX INFO: renamed from: n0 */
    public void mo44257n0(int i, boolean z, boolean z2, boolean z3) {
        this.f30372f = z;
        this.f30371e = i;
        if (z2) {
            Act act = this.act;
            act.startActivityForResult(MediaPickerAct.m80102Y1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withFromType(1).build()), PutongAct.REQUEST_CODE_PICKER);
            this.act.overridePendingTransition(x7c0.f192710y, 0);
        } else {
            if (z3) {
                Act act2 = this.act;
                act2.startActivityForResult(MediaPickerAct.m80102Y1(act2, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(bnl0.m105592y0() - qa00.m175859d(40.0f)).build()).withFromType(1).setCroppingNewStyle(true).build()), PutongAct.REQUEST_CODE_PICKER);
                this.act.overridePendingTransition(x7c0.f192710y, 0);
                return;
            }
            boolean zM131540A2 = gra.m131540A2();
            Act act3 = this.act;
            if (!zM131540A2) {
                startActivityForResult(com.p051p1.mobile.putong.core.p058ui.mediapicker.MediaPickerAct.m48970k2(act3, 1, false, true, true, null, com.p051p1.mobile.putong.core.p058ui.mediapicker.MediaPickerAct.f31471D, false, true, CoreModule.f18264c.f20381e0.m116600p9().gender, "", true), PutongAct.REQUEST_CODE_PICKER);
            } else {
                act3.startActivityForResult(MediaPickerAct.m80102Y1(act3, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(bnl0.m105592y0() - qa00.m175859d(40.0f)).build()).withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().canClickSubmitInPreviewWhenNoSelectedMedia().withMaxPickCount(1).build()).needAllSelectedMediaPreview().withFromType(1).build()), PutongAct.REQUEST_CODE_PICKER);
                this.act.overridePendingTransition(z7c0.f203239h, 0);
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f30369c.m179755i0()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void onCropImageResult(String str) {
        Picture pictureNew_ = Picture.new_();
        pictureNew_.status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
        pictureNew_.url = oki.m168011B(str);
        pictureNew_.size = new Dimension(new sim(oki.m168038z(pictureNew_.url)).f168843d);
        pictureNew_.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
        onPickImagesResult(jyb.m147507f0(pictureNew_));
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list) {
        if (this.f30371e == -1 || list.size() <= 0) {
            return;
        }
        this.f30370d.m214233y(list.get(0), this.f30371e);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_confirm_upload";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setSwipeBackEnable(false);
        this.f30373g = (FakeUploadModel) getIntent().getSerializableExtra("fake_upload_img");
    }
}
