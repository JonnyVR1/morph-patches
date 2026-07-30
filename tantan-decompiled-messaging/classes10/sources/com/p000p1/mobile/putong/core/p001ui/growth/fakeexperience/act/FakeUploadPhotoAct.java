package com.p000p1.mobile.putong.core.p001ui.growth.fakeexperience.act;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.growth.fakeexperience.model.FakeUploadModel;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.profile.ProfileMediaAct;
import com.p1.mobile.putong.data.Dimension;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MediaLocalStatus;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.pgm;
import l.rhi;
import l.rzb0;
import l.t100;
import l.tzb0;
import l.upa;
import l.vdc0;
import l.vwb;
import l.xdl0;
import p003l.d3g;
import p003l.k3g;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class FakeUploadPhotoAct extends ProfileMediaAct {

    /* JADX INFO: renamed from: c */
    public d3g f1915c;

    /* JADX INFO: renamed from: d */
    public k3g f1916d;

    /* JADX INFO: renamed from: e */
    public int f1917e = -1;

    /* JADX INFO: renamed from: f */
    public boolean f1918f = false;

    /* JADX INFO: renamed from: g */
    public FakeUploadModel f1919g;

    /* JADX INFO: renamed from: Y1 */
    public static Intent m3324Y1(Context context, ArrayList<Media> arrayList) {
        FakeUploadModel fakeUploadModel = new FakeUploadModel();
        fakeUploadModel.mediaArrayList = arrayList;
        Intent intent = new Intent(context, (Class<?>) FakeUploadPhotoAct.class);
        intent.putExtra("fake_upload_img", fakeUploadModel);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        User userP9 = CoreModule.c.e0.p9();
        int size = userP9.pictures.size();
        if (!vwb.J(userP9.pictures)) {
            this.f1916d.m7504A(userP9.pictures);
        }
        FakeUploadModel fakeUploadModel = this.f1919g;
        if (fakeUploadModel == null || vwb.J(fakeUploadModel.mediaArrayList)) {
            return;
        }
        this.f1916d.m7522y(this.f1919g.mediaArrayList.get(0), size);
    }

    /* JADX INFO: renamed from: f2 */
    public void m3325f2(int i, String str) {
        this.f1917e = i;
        vdc0.b(act(), str, true);
    }

    /* JADX INFO: renamed from: i0 */
    public void m3326i0(int i, boolean z) {
        m3327n0(i, z, false, false);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f1916d.inflateView(layoutInflater, viewGroup);
    }

    public void initDataOnCreate() {
        super/*com.p1.mobile.putong.app.PutongAct*/.initDataOnCreate();
        this.f1915c = new d3g(this);
        k3g k3gVar = new k3g(this);
        this.f1916d = k3gVar;
        this.f1915c.C(k3gVar);
        this.f1915c.Z();
    }

    public void initSubscription() {
        super/*com.p1.mobile.putong.app.PutongAct*/.initSubscription();
        this.f1915c.m6050a0();
        creates(new e30() { // from class: l.y2g
            public final void call(Object obj) {
                this.f8625a.lambda$initSubscription$0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n0 */
    public void m3327n0(int i, boolean z, boolean z2, boolean z3) {
        this.f1918f = z;
        this.f1917e = i;
        if (z2) {
            Act act = ((Act) this).act;
            act.startActivityForResult(MediaPickerAct.X1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withFromType(1).build()), 786);
            ((Act) this).act.overridePendingTransition(rzb0.y, 0);
        } else {
            if (z3) {
                Act act2 = ((Act) this).act;
                act2.startActivityForResult(MediaPickerAct.X1(act2, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(xdl0.y0() - t100.d(40.0f)).build()).withFromType(1).setCroppingNewStyle(true).build()), 786);
                ((Act) this).act.overridePendingTransition(rzb0.y, 0);
                return;
            }
            boolean zA2 = upa.A2();
            Act act3 = ((Act) this).act;
            if (!zA2) {
                startActivityForResult(com.p1.mobile.putong.core.ui.mediapicker.MediaPickerAct.i2(act3, 1, false, true, true, (String) null, com.p1.mobile.putong.core.ui.mediapicker.MediaPickerAct.D, false, true, CoreModule.c.e0.p9().gender, "", true), 786);
            } else {
                act3.startActivityForResult(MediaPickerAct.X1(act3, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(xdl0.y0() - t100.d(40.0f)).build()).withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().canClickSubmitInPreviewWhenNoSelectedMedia().withMaxPickCount(1).build()).needAllSelectedMediaPreview().withFromType(1).build()), 786);
                ((Act) this).act.overridePendingTransition(tzb0.h, 0);
            }
        }
    }

    public void onBackPressed() {
        if (this.f1915c.m6051i0()) {
            return;
        }
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }

    public void onCropImageResult(String str) {
        Media mediaNew_ = Picture.new_();
        mediaNew_.status = MediaLocalStatus.get("preprocessed");
        mediaNew_.url = rhi.B(str);
        ((Picture) mediaNew_).size = new Dimension(new pgm(rhi.z(mediaNew_.url)).d);
        mediaNew_.mediaType = "image/jpeg";
        onPickImagesResult(vwb.f0(new Media[]{mediaNew_}));
    }

    public void onPickImagesResult(List<Media> list) {
        if (this.f1917e == -1 || list.size() <= 0) {
            return;
        }
        this.f1916d.m7522y(list.get(0), this.f1917e);
    }

    public String pageId() {
        return "p_confirm_upload";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        super/*com.p1.mobile.putong.app.PutongAct*/.preCreateView(bundle);
        setSwipeBackEnable(false);
        this.f1919g = (FakeUploadModel) getIntent().getSerializableExtra("fake_upload_img");
    }
}
