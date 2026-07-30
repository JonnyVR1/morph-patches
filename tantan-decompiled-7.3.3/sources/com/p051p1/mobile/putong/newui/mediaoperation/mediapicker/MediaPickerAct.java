package com.p051p1.mobile.putong.newui.mediaoperation.mediapicker;

import android.content.Context;
import android.content.Intent;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0428k;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Triple;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p137rx.subjects.C22508b;
import p153l.emk0;
import p153l.jec0;
import p153l.jyb;
import p153l.o1j0;
import p153l.oki;
import p153l.pf60;
import p153l.toh0;
import p153l.uqb0;
import p153l.w7c0;
import p153l.xl70;
import p153l.y20;
import p153l.ycc0;

/* JADX INFO: loaded from: classes10.dex */
public class MediaPickerAct extends PutongAct {

    /* JADX INFO: renamed from: e */
    public static C22508b<String> f54849e = C22508b.m222767b();

    /* JADX INFO: renamed from: f */
    public static C22508b<Triple<String, String, String>> f54850f = C22508b.m222767b();

    /* JADX INFO: renamed from: c */
    public MediaPickerFrag f54851c;

    /* JADX INFO: renamed from: d */
    public MediaPickerParamsObject f54852d;

    /* JADX INFO: renamed from: Y1 */
    public static Intent m80102Y1(Context context, MediaPickerParamsObject mediaPickerParamsObject) {
        Intent intent = new Intent(context, (Class<?>) MediaPickerAct.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("params_object", mediaPickerParamsObject);
        intent.putExtra("extra_bundle", bundle);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z1 */
    public void m80103Z1(Bundle bundle) {
        if (NullChecker.m82486a(fragmentManager().m2555h0(ycc0.f198473o0)) || getIntent() == null || getIntent().getBundleExtra("extra_bundle") == null) {
            return;
        }
        Intent intent = getIntent();
        MediaPickerFrag mediaPickerFrag = new MediaPickerFrag();
        this.f54851c = mediaPickerFrag;
        mediaPickerFrag.setArguments(intent.getBundleExtra("extra_bundle"));
        this.f54852d = (MediaPickerParamsObject) intent.getBundleExtra("extra_bundle").getSerializable("params_object");
        AbstractC0428k abstractC0428kM2568m = getSupportFragmentManager().m2568m();
        abstractC0428kM2568m.m2805c(ycc0.f198473o0, this.f54851c, "MediaPickerFrag");
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
        MediaPickerFrag mediaPickerFrag = this.f54851c;
        if (mediaPickerFrag == null || (mediaPickerParamsObject = mediaPickerFrag.f54859G) == null || mediaPickerParamsObject.finishInAnim == 0) {
            return;
        }
        overridePendingTransition(w7c0.f187731a, mediaPickerParamsObject.finishOutAnim);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(jec0.f120460f, (ViewGroup) null);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new y20() { // from class: l.jyx
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123207a.m80103Z1((Bundle) obj);
            }
        });
        if (uqb0.f180397c0.mo105306f() && NullChecker.m82486a(this.pageHelper)) {
            this.pageHelper.m152781p(new pf60("page_gender", uqb0.f180397c0.mo105305e() ? "male" : "female"));
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (NullChecker.m82486a(this.f54852d) && this.f54852d.fromType == 9 && NullChecker.m82486a(intent)) {
            List list = (List) intent.getSerializableExtra("extra_images");
            if (NullChecker.m82486a(list) && list.size() > 0) {
                Media media = (Media) list.get(0);
                if (media instanceof Video) {
                    String strReplaceFirst = media.url.replaceFirst("file://", "");
                    File file = new File(strReplaceFirst);
                    if (file.length() < PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
                        o1j0.m165636j("你的视频长度太短了");
                        m68056e2();
                        return;
                    }
                    if (file.length() > 31457280) {
                        o1j0.m165636j("你的视频长度太长了");
                        m68056e2();
                        return;
                    }
                    String str = "data:video/mp4;base64," + Base64.encodeToString(emk0.m121368a(file), 2);
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(strReplaceFirst);
                    f54850f.m137019l(new Triple<>(str, mediaMetadataRetriever.extractMetadata(18), mediaMetadataRetriever.extractMetadata(19)));
                    f54850f.onCompleted();
                    m68056e2();
                    return;
                }
            }
        }
        if (NullChecker.m82486a(this.f54851c)) {
            this.f54851c.onActivityResult(i, i2, intent);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        MediaPickerParamsObject mediaPickerParamsObject = this.f54852d;
        if (mediaPickerParamsObject != null && mediaPickerParamsObject.fromType == 8) {
            xl70.m211537j(mediaPickerParamsObject.jsBridgeTimestamp, new ArrayList());
        }
        m68056e2();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void onCropImageResult(String str) {
        if (NullChecker.m82486a(this.f54852d) && this.f54852d.fromType == 9) {
            f54849e.m137019l("data:image/png;base64," + Base64.encodeToString(emk0.m121368a(new File(str)), 2));
            f54849e.onCompleted();
            m68056e2();
            return;
        }
        if (NullChecker.m82486a(this.f54852d)) {
            int i = this.f54852d.fromType;
            if (i == 1 || i == 7) {
                Picture picture = new Picture();
                picture.status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
                picture.url = oki.m168011B(str);
                picture.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
                Intent intent = new Intent();
                intent.putExtra(MediaPickerBaseAct.f55451h, jyb.m147507f0(picture));
                if (NullChecker.m82486a(this.f54851c)) {
                    this.f54851c.m80105N4(intent);
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

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }
}
