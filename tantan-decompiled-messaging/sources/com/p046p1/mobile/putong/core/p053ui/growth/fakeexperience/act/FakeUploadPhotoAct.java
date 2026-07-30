package com.p046p1.mobile.putong.core.p053ui.growth.fakeexperience.act;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.growth.fakeexperience.model.FakeUploadModel;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileMediaAct;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import java.util.ArrayList;
import java.util.List;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p149l.d3g;
import p149l.e30;
import p149l.k3g;
import p149l.pgm;
import p149l.rhi;
import p149l.rzb0;
import p149l.t100;
import p149l.tzb0;
import p149l.upa;
import p149l.vdc0;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes10.dex */
public class FakeUploadPhotoAct extends ProfileMediaAct {

    /* JADX INFO: renamed from: c */
    public d3g f29521c;

    /* JADX INFO: renamed from: d */
    public k3g f29522d;

    /* JADX INFO: renamed from: e */
    public int f29523e = -1;

    /* JADX INFO: renamed from: f */
    public boolean f29524f = false;

    /* JADX INFO: renamed from: g */
    public FakeUploadModel f29525g;

    /* JADX INFO: renamed from: Y1 */
    public static Intent m45971Y1(Context context, ArrayList<Media> arrayList) {
        FakeUploadModel fakeUploadModel = new FakeUploadModel();
        fakeUploadModel.mediaArrayList = arrayList;
        Intent intent = new Intent(context, (Class<?>) FakeUploadPhotoAct.class);
        intent.putExtra("fake_upload_img", fakeUploadModel);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        int size = userM169527p9.pictures.size();
        if (!vwb.m200296J(userM169527p9.pictures)) {
            this.f29522d.m144393A(userM169527p9.pictures);
        }
        FakeUploadModel fakeUploadModel = this.f29525g;
        if (fakeUploadModel == null || vwb.m200296J(fakeUploadModel.mediaArrayList)) {
            return;
        }
        this.f29522d.m144409y(this.f29525g.mediaArrayList.get(0), size);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.ProfileMediaAct, p149l.fwl
    /* JADX INFO: renamed from: f2 */
    public void mo43239f2(int i, String str) {
        this.f29523e = i;
        vdc0.m197988b(act(), str, true);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.ProfileMediaAct, p149l.fwl
    /* JADX INFO: renamed from: i0 */
    public void mo45972i0(int i, boolean z) {
        mo43246n0(i, z, false, false);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f29522d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f29521c = new d3g(this);
        k3g k3gVar = new k3g(this);
        this.f29522d = k3gVar;
        this.f29521c.mo51532C(k3gVar);
        this.f29521c.mo39469Z();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f29521c.mo39470a0();
        creates(new e30() { // from class: l.y2g
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f195610a.lambda$initSubscription$0((Bundle) obj);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.ProfileMediaAct, p149l.fwl
    /* JADX INFO: renamed from: n0 */
    public void mo43246n0(int i, boolean z, boolean z2, boolean z3) {
        this.f29524f = z;
        this.f29523e = i;
        if (z2) {
            Act act = this.act;
            act.startActivityForResult(MediaPickerAct.m78919X1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withFromType(1).build()), PutongAct.REQUEST_CODE_PICKER);
            this.act.overridePendingTransition(rzb0.f161653y, 0);
        } else {
            if (z3) {
                Act act2 = this.act;
                act2.startActivityForResult(MediaPickerAct.m78919X1(act2, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(xdl0.m208412y0() - t100.m186890d(40.0f)).build()).withFromType(1).setCroppingNewStyle(true).build()), PutongAct.REQUEST_CODE_PICKER);
                this.act.overridePendingTransition(rzb0.f161653y, 0);
                return;
            }
            boolean zM194609A2 = upa.m194609A2();
            Act act3 = this.act;
            if (!zM194609A2) {
                startActivityForResult(com.p046p1.mobile.putong.core.p053ui.mediapicker.MediaPickerAct.m47787i2(act3, 1, false, true, true, null, com.p046p1.mobile.putong.core.p053ui.mediapicker.MediaPickerAct.f30623D, false, true, CoreModule.f17545c.f19639e0.m169527p9().gender, "", true), PutongAct.REQUEST_CODE_PICKER);
            } else {
                act3.startActivityForResult(MediaPickerAct.m78919X1(act3, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(xdl0.m208412y0() - t100.m186890d(40.0f)).build()).withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().canClickSubmitInPreviewWhenNoSelectedMedia().withMaxPickCount(1).build()).needAllSelectedMediaPreview().withFromType(1).build()), PutongAct.REQUEST_CODE_PICKER);
                this.act.overridePendingTransition(tzb0.f172721h, 0);
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f29521c.m109914i0()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void onCropImageResult(String str) {
        Picture pictureNew_ = Picture.new_();
        pictureNew_.status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
        pictureNew_.url = rhi.m179355B(str);
        pictureNew_.size = new Dimension(new pgm(rhi.m179382z(pictureNew_.url)).f148730d);
        pictureNew_.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
        onPickImagesResult(vwb.m200324f0(pictureNew_));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list) {
        if (this.f29523e == -1 || list.size() <= 0) {
            return;
        }
        this.f29522d.m144409y(list.get(0), this.f29523e);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_confirm_upload";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setSwipeBackEnable(false);
        this.f29525g = (FakeUploadModel) getIntent().getSerializableExtra("fake_upload_img");
    }
}
