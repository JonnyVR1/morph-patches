package com.p046p1.mobile.putong.core.p053ui.profile;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p149l.duh0;
import p149l.fwl;
import p149l.pgm;
import p149l.rhi;
import p149l.vth0;
import p149l.vwb;

/* JADX INFO: loaded from: classes4.dex */
public class TagGuidePicAct extends PutongMvpAct<vth0, duh0> implements fwl {

    /* JADX INFO: renamed from: e */
    public int f33043e = 0;

    /* JADX INFO: renamed from: Y1 */
    public static Intent m50772Y1(Context context, boolean z, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) TagGuidePicAct.class);
        intent.putExtra("tag_save_data", z);
        intent.putExtra("tag_from", str);
        intent.putExtra("tag_from_page", str2);
        return intent;
    }

    /* JADX INFO: renamed from: Z1 */
    public boolean m50773Z1() {
        return TextUtils.equals(getIntent().getStringExtra("tag_from"), "from_upload_pic");
    }

    /* JADX INFO: renamed from: a2 */
    public boolean m50774a2() {
        return TextUtils.equals(getIntent().getStringExtra("tag_from"), "from_pic_match_tag");
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public vth0 mo28672V1() {
        return new vth0(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public duh0 mo28673X1() {
        return new duh0(this);
    }

    /* JADX INFO: renamed from: d2 */
    public boolean m50777d2() {
        String stringExtra = getIntent().getStringExtra("tag_from_page");
        return TextUtils.equals(stringExtra, "from_complete_equity_guide") || TextUtils.equals(stringExtra, "from_complete_equity_guide_card");
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, p149l.n3m
    public boolean disableAutoPV() {
        return true;
    }

    /* JADX INFO: renamed from: e2 */
    public void m50778e2() {
        if (NullChecker.m81303a(this.f17173d)) {
            ((duh0) this.f17173d).m113710w();
        }
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m66873d2() {
        ((duh0) this.f17173d).m113708u();
        setResult(this.f33043e);
        super.m66873d2();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ((duh0) this.f17173d).f87978b.performClick();
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
        if (vwb.m200296J(list)) {
            return;
        }
        ((duh0) this.f17173d).m113709v(list);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_edit_lifestyle";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list, int i) {
        onPickImagesResult(list);
    }
}
