package com.p051p1.mobile.putong.core.p058ui.profile.exploop;

import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileMediaAct;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.newui.mediaoperation.cropper.NewAlbumCropperAct;
import java.util.List;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p153l.bnl0;
import p153l.cjf;
import p153l.hjf;
import p153l.jyb;
import p153l.oki;
import p153l.qa00;
import p153l.sim;
import p153l.x7c0;

/* JADX INFO: loaded from: classes4.dex */
public class ExpProfileInfoLoopEditAct extends ProfileMediaAct {

    /* JADX INFO: renamed from: c */
    public cjf f34116c;

    /* JADX INFO: renamed from: d */
    public hjf f34117d;

    /* JADX INFO: renamed from: e */
    public int f34118e = -1;

    /* JADX INFO: renamed from: Y1 */
    public static Intent m52411Y1(Context context, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType, ExpLoopInputType expLoopInputType, boolean z, String str) {
        Intent intent = new Intent(context, (Class<?>) ExpProfileInfoLoopEditAct.class);
        intent.putExtra("loop_edit_entry_type", loopCreateEntryType);
        intent.putExtra("loop_eidt_first_type", expLoopInputType);
        intent.putExtra("loop_edit_from", str);
        intent.putExtra("loop_edit_save_user", z);
        return intent;
    }

    /* JADX INFO: renamed from: Z1 */
    public ExpProfileEditLoopBaseFrag m52412Z1() {
        if (this.f34116c.m110175u0() != null) {
            return this.f34116c.m110175u0();
        }
        return null;
    }

    /* JADX INFO: renamed from: a2 */
    public String m52413a2() {
        return this.f34116c.m110177y0();
    }

    /* JADX INFO: renamed from: b2 */
    public cjf m52414b2() {
        return this.f34116c;
    }

    /* JADX INFO: renamed from: c2 */
    public void m52415c2() {
        this.f34117d.m135346n();
    }

    /* JADX INFO: renamed from: d2 */
    public void m52416d2(ExpLoopInputType expLoopInputType, boolean z) {
        hjf hjfVar = this.f34117d;
        if (hjfVar != null && hjfVar.m135345i()) {
            this.f34117d.m135348q(z);
        }
        cjf cjfVar = this.f34116c;
        if (cjfVar != null) {
            cjfVar.m110164d1(expLoopInputType);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, p153l.e6m
    public boolean disableAutoPV() {
        return true;
    }

    /* JADX INFO: renamed from: e2 */
    public void m52417e2(String str) {
        hjf hjfVar = this.f34117d;
        if (hjfVar == null || !hjfVar.m135345i()) {
            return;
        }
        this.f34117d.m135350s(str);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.ProfileMediaAct, p153l.xyl
    /* JADX INFO: renamed from: f2 */
    public void mo44250f2(int i, String str) {
        this.f34118e = i;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        Act act = this.act;
        act.startActivityForResult(NewAlbumCropperAct.m80086n2(act, str, 0.8f, bnl0.m105592y0() - qa00.m175859d(60.0f), true), Act.CROP_IMAGE);
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        super.lambda$debugItems$19();
        overridePendingTransition(x7c0.f192700o, x7c0.f192709x);
    }

    /* JADX INFO: renamed from: g2 */
    public void m52418g2(String str) {
        hjf hjfVar = this.f34117d;
        if (hjfVar == null || !hjfVar.m135345i()) {
            return;
        }
        this.f34117d.m135353w(str);
    }

    /* JADX INFO: renamed from: h2 */
    public void m52419h2(String str) {
        hjf hjfVar = this.f34117d;
        if (hjfVar == null || !hjfVar.m135345i()) {
            return;
        }
        this.f34117d.m135355y(str);
    }

    /* JADX INFO: renamed from: i2 */
    public void m52420i2(String str) {
        hjf hjfVar = this.f34117d;
        if (hjfVar == null || !hjfVar.m135345i()) {
            return;
        }
        this.f34117d.m135354x(str);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f34117d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f34116c = new cjf(this);
        hjf hjfVar = new hjf(this);
        this.f34117d = hjfVar;
        this.f34116c.mo52715C(hjfVar);
        this.f34116c.mo40472Z();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f34116c.mo40473a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f34116c.m110169o0()) {
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
        onPickImagesResult(jyb.m147482M(pictureNew_), this.f34118e);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list, int i) {
        for (Media media : list) {
            if (media instanceof Picture) {
                ((Picture) media).status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
            }
        }
        if (m52412Z1() != null) {
            m52412Z1().mo52431Q4(list, i);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setSwipeBackEnable(false);
    }
}
