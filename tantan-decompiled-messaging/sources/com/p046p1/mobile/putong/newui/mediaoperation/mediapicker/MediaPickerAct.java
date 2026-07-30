package com.p046p1.mobile.putong.newui.mediaoperation.mediapicker;

import android.content.Context;
import android.content.Intent;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0427k;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Triple;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p133rx.subjects.C22393b;
import p149l.e30;
import p149l.e6c0;
import p149l.j760;
import p149l.lsi0;
import p149l.mgh0;
import p149l.qib0;
import p149l.qzb0;
import p149l.rd70;
import p149l.rhi;
import p149l.s4c0;
import p149l.vwb;
import p149l.yck0;

/* JADX INFO: loaded from: classes11.dex */
public class MediaPickerAct extends PutongAct {

    /* JADX INFO: renamed from: e */
    public static C22393b<String> f54001e = C22393b.m221521b();

    /* JADX INFO: renamed from: f */
    public static C22393b<Triple<String, String, String>> f54002f = C22393b.m221521b();

    /* JADX INFO: renamed from: c */
    public MediaPickerFrag f54003c;

    /* JADX INFO: renamed from: d */
    public MediaPickerParamsObject f54004d;

    /* JADX INFO: renamed from: X1 */
    public static Intent m78919X1(Context context, MediaPickerParamsObject mediaPickerParamsObject) {
        Intent intent = new Intent(context, (Class<?>) MediaPickerAct.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("params_object", mediaPickerParamsObject);
        intent.putExtra("extra_bundle", bundle);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y1 */
    public void m78920Y1(Bundle bundle) {
        if (NullChecker.m81303a(fragmentManager().m2554h0(s4c0.f162352o0)) || getIntent() == null || getIntent().getBundleExtra("extra_bundle") == null) {
            return;
        }
        Intent intent = getIntent();
        MediaPickerFrag mediaPickerFrag = new MediaPickerFrag();
        this.f54003c = mediaPickerFrag;
        mediaPickerFrag.setArguments(intent.getBundleExtra("extra_bundle"));
        this.f54004d = (MediaPickerParamsObject) intent.getBundleExtra("extra_bundle").getSerializable("params_object");
        AbstractC0427k abstractC0427kM2567m = getSupportFragmentManager().m2567m();
        abstractC0427kM2567m.m2804c(s4c0.f162352o0, this.f54003c, "MediaPickerFrag");
        abstractC0427kM2567m.mo2708j();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean checkRunningCondition() {
        if (ensurePlugin()) {
            return false;
        }
        startActivity(mgh0.m154564t(getIntent()));
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean ensurePlugin() {
        return !qib0.f154714c0.signedIn_() ? qib0.f154721j0.m192072z(SchemeKey.account) : qib0.m174779J0();
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m66873d2() {
        MediaPickerParamsObject mediaPickerParamsObject;
        super.m66873d2();
        MediaPickerFrag mediaPickerFrag = this.f54003c;
        if (mediaPickerFrag == null || (mediaPickerParamsObject = mediaPickerFrag.f54011G) == null || mediaPickerParamsObject.finishInAnim == 0) {
            return;
        }
        overridePendingTransition(qzb0.f157020a, mediaPickerParamsObject.finishOutAnim);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(e6c0.f89547f, (ViewGroup) null);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.mpx
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f135131a.m78920Y1((Bundle) obj);
            }
        });
        if (qib0.f154714c0.mo97517f() && NullChecker.m81303a(this.pageHelper)) {
            this.pageHelper.m109040p(new j760("page_gender", qib0.f154714c0.mo97516e() ? "male" : "female"));
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (NullChecker.m81303a(this.f54004d) && this.f54004d.fromType == 9 && NullChecker.m81303a(intent)) {
            List list = (List) intent.getSerializableExtra("extra_images");
            if (NullChecker.m81303a(list) && list.size() > 0) {
                Media media = (Media) list.get(0);
                if (media instanceof Video) {
                    String strReplaceFirst = media.url.replaceFirst("file://", "");
                    File file = new File(strReplaceFirst);
                    if (file.length() < PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
                        lsi0.m151580j("你的视频长度太短了");
                        m66873d2();
                        return;
                    }
                    if (file.length() > 31457280) {
                        lsi0.m151580j("你的视频长度太长了");
                        m66873d2();
                        return;
                    }
                    String str = "data:video/mp4;base64," + Base64.encodeToString(yck0.m214159a(file), 2);
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(strReplaceFirst);
                    f54002f.m132487l(new Triple<>(str, mediaMetadataRetriever.extractMetadata(18), mediaMetadataRetriever.extractMetadata(19)));
                    f54002f.onCompleted();
                    m66873d2();
                    return;
                }
            }
        }
        if (NullChecker.m81303a(this.f54003c)) {
            this.f54003c.onActivityResult(i, i2, intent);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        MediaPickerParamsObject mediaPickerParamsObject = this.f54004d;
        if (mediaPickerParamsObject != null && mediaPickerParamsObject.fromType == 8) {
            rd70.m178952j(mediaPickerParamsObject.jsBridgeTimestamp, new ArrayList());
        }
        m66873d2();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void onCropImageResult(String str) {
        if (NullChecker.m81303a(this.f54004d) && this.f54004d.fromType == 9) {
            f54001e.m132487l("data:image/png;base64," + Base64.encodeToString(yck0.m214159a(new File(str)), 2));
            f54001e.onCompleted();
            m66873d2();
            return;
        }
        if (NullChecker.m81303a(this.f54004d)) {
            int i = this.f54004d.fromType;
            if (i == 1 || i == 7) {
                Picture picture = new Picture();
                picture.status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
                picture.url = rhi.m179355B(str);
                picture.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
                Intent intent = new Intent();
                intent.putExtra(MediaPickerBaseAct.f54603h, vwb.m200324f0(picture));
                if (NullChecker.m81303a(this.f54003c)) {
                    this.f54003c.m78922N4(intent);
                }
                setResult(-1, intent);
                m66873d2();
            }
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_camera_local_album";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }
}
