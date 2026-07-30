package com.p051p1.mobile.putong.core.p058ui.profile;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p153l.d2i0;
import p153l.jyb;
import p153l.l2i0;
import p153l.oki;
import p153l.sim;
import p153l.xyl;

/* JADX INFO: loaded from: classes4.dex */
public class TagGuidePicAct extends PutongMvpAct<d2i0, l2i0> implements xyl {

    /* JADX INFO: renamed from: e */
    public int f33891e = 0;

    /* JADX INFO: renamed from: Z1 */
    public static Intent m51955Z1(Context context, boolean z, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) TagGuidePicAct.class);
        intent.putExtra("tag_save_data", z);
        intent.putExtra("tag_from", str);
        intent.putExtra("tag_from_page", str2);
        return intent;
    }

    /* JADX INFO: renamed from: a2 */
    public boolean m51956a2() {
        return TextUtils.equals(getIntent().getStringExtra("tag_from"), "from_upload_pic");
    }

    /* JADX INFO: renamed from: b2 */
    public boolean m51957b2() {
        return TextUtils.equals(getIntent().getStringExtra("tag_from"), "from_pic_match_tag");
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public d2i0 mo29671X1() {
        return new d2i0(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: d2, reason: merged with bridge method [inline-methods] */
    public l2i0 mo29672Y1() {
        return new l2i0(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, p153l.e6m
    public boolean disableAutoPV() {
        return true;
    }

    /* JADX INFO: renamed from: e2 */
    public boolean m51960e2() {
        String stringExtra = getIntent().getStringExtra("tag_from_page");
        return TextUtils.equals(stringExtra, "from_complete_equity_guide") || TextUtils.equals(stringExtra, "from_complete_equity_guide_card");
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m68056e2() {
        ((l2i0) this.f17892d).m152618u();
        setResult(this.f33891e);
        super.m68056e2();
    }

    /* JADX INFO: renamed from: g2 */
    public void m51961g2() {
        if (NullChecker.m82486a(this.f17892d)) {
            ((l2i0) this.f17892d).m152620w();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ((l2i0) this.f17892d).f129774b.performClick();
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
        if (jyb.m147479J(list)) {
            return;
        }
        ((l2i0) this.f17892d).m152619v(list);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_edit_lifestyle";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list, int i) {
        onPickImagesResult(list);
    }
}
