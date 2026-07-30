package com.p046p1.mobile.putong.core.p053ui.profile.exploop;

import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileMediaAct;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.newui.mediaoperation.cropper.NewAlbumCropperAct;
import java.util.List;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p149l.bif;
import p149l.pgm;
import p149l.rhi;
import p149l.rzb0;
import p149l.t100;
import p149l.vwb;
import p149l.whf;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class ExpProfileInfoLoopEditAct extends ProfileMediaAct {

    /* JADX INFO: renamed from: c */
    public whf f33268c;

    /* JADX INFO: renamed from: d */
    public bif f33269d;

    /* JADX INFO: renamed from: e */
    public int f33270e = -1;

    /* JADX INFO: renamed from: X1 */
    public static Intent m51228X1(Context context, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType, ExpLoopInputType expLoopInputType, boolean z, String str) {
        Intent intent = new Intent(context, (Class<?>) ExpProfileInfoLoopEditAct.class);
        intent.putExtra("loop_edit_entry_type", loopCreateEntryType);
        intent.putExtra("loop_eidt_first_type", expLoopInputType);
        intent.putExtra("loop_edit_from", str);
        intent.putExtra("loop_edit_save_user", z);
        return intent;
    }

    /* JADX INFO: renamed from: Y1 */
    public ExpProfileEditLoopBaseFrag m51229Y1() {
        if (this.f33268c.m203209u0() != null) {
            return this.f33268c.m203209u0();
        }
        return null;
    }

    /* JADX INFO: renamed from: Z1 */
    public String m51230Z1() {
        return this.f33268c.m203211y0();
    }

    /* JADX INFO: renamed from: a2 */
    public whf m51231a2() {
        return this.f33268c;
    }

    /* JADX INFO: renamed from: b2 */
    public void m51232b2() {
        this.f33269d.m102021n();
    }

    /* JADX INFO: renamed from: c2 */
    public void m51233c2(ExpLoopInputType expLoopInputType, boolean z) {
        bif bifVar = this.f33269d;
        if (bifVar != null && bifVar.m102020i()) {
            this.f33269d.m102023q(z);
        }
        whf whfVar = this.f33268c;
        if (whfVar != null) {
            whfVar.m203198d1(expLoopInputType);
        }
    }

    /* JADX INFO: renamed from: d2 */
    public void m51234d2(String str) {
        bif bifVar = this.f33269d;
        if (bifVar == null || !bifVar.m102020i()) {
            return;
        }
        this.f33269d.m102025s(str);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, p149l.n3m
    public boolean disableAutoPV() {
        return true;
    }

    /* JADX INFO: renamed from: e2 */
    public void m51235e2(String str) {
        bif bifVar = this.f33269d;
        if (bifVar == null || !bifVar.m102020i()) {
            return;
        }
        this.f33269d.m102028w(str);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.ProfileMediaAct, p149l.fwl
    /* JADX INFO: renamed from: f2 */
    public void mo43239f2(int i, String str) {
        this.f33270e = i;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        Act act = this.act;
        act.startActivityForResult(NewAlbumCropperAct.m78903m2(act, str, 0.8f, xdl0.m208412y0() - t100.m186890d(60.0f), true), Act.CROP_IMAGE);
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        super.lambda$debugItems$19();
        overridePendingTransition(rzb0.f161643o, rzb0.f161652x);
    }

    /* JADX INFO: renamed from: g2 */
    public void m51236g2(String str) {
        bif bifVar = this.f33269d;
        if (bifVar == null || !bifVar.m102020i()) {
            return;
        }
        this.f33269d.m102030y(str);
    }

    /* JADX INFO: renamed from: h2 */
    public void m51237h2(String str) {
        bif bifVar = this.f33269d;
        if (bifVar == null || !bifVar.m102020i()) {
            return;
        }
        this.f33269d.m102029x(str);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f33269d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f33268c = new whf(this);
        bif bifVar = new bif(this);
        this.f33269d = bifVar;
        this.f33268c.mo51532C(bifVar);
        this.f33268c.mo39469Z();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f33268c.mo39470a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f33268c.m203203o0()) {
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
        onPickImagesResult(vwb.m200299M(pictureNew_), this.f33270e);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list, int i) {
        for (Media media : list) {
            if (media instanceof Picture) {
                ((Picture) media).status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
            }
        }
        if (m51229Y1() != null) {
            m51229Y1().mo51248Q4(list, i);
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setSwipeBackEnable(false);
    }
}
