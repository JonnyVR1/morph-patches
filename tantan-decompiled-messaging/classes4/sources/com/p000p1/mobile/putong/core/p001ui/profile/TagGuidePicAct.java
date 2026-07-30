package com.p000p1.mobile.putong.core.p001ui.profile;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.p1.mobile.putong.app.PutongMvpAct;
import com.p1.mobile.putong.data.Dimension;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MediaLocalStatus;
import com.p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.fwl;
import l.pgm;
import l.rhi;
import l.vwb;
import p002l.duh0;
import p002l.vth0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class TagGuidePicAct extends PutongMvpAct<vth0, duh0> implements fwl {

    /* JADX INFO: renamed from: e */
    public int f865e = 0;

    /* JADX INFO: renamed from: Y1 */
    public static Intent m1216Y1(Context context, boolean z, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) TagGuidePicAct.class);
        intent.putExtra("tag_save_data", z);
        intent.putExtra("tag_from", str);
        intent.putExtra("tag_from_page", str2);
        return intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z1 */
    public boolean m1219Z1() {
        return TextUtils.equals(getIntent().getStringExtra("tag_from"), "from_upload_pic");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a2 */
    public boolean m1220a2() {
        return TextUtils.equals(getIntent().getStringExtra("tag_from"), "from_pic_match_tag");
    }

    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public vth0 m1217V1() {
        return new vth0(this);
    }

    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public duh0 m1218X1() {
        return new duh0(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d2 */
    public boolean m1223d2() {
        String stringExtra = getIntent().getStringExtra("tag_from_page");
        return TextUtils.equals(stringExtra, "from_complete_equity_guide") || TextUtils.equals(stringExtra, "from_complete_equity_guide_card");
    }

    public boolean disableAutoPV() {
        return true;
    }

    /* JADX INFO: renamed from: e2 */
    public void m1224e2() {
        if (NullChecker.a(((PutongMvpAct) this).d)) {
            ((duh0) ((PutongMvpAct) this).d).m12047w();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void finish() {
        ((duh0) ((PutongMvpAct) this).d).m12045u();
        setResult(this.f865e);
        super/*com.p1.mobile.android.app.Act*/.finish();
    }

    public void onBackPressed() {
        ((duh0) ((PutongMvpAct) this).d).f9428b.performClick();
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
        if (vwb.J(list)) {
            return;
        }
        ((duh0) ((PutongMvpAct) this).d).m12046v(list);
    }

    public String pageId() {
        return "p_edit_lifestyle";
    }

    public void onPickImagesResult(List<Media> list, int i) {
        onPickImagesResult(list);
    }
}
