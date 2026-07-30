package com.p000p1.mobile.putong.newui.mediaoperation.mediapicker;

import android.content.Context;
import android.content.Intent;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.k;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p000p1.mobile.putong.p004ui.mediapicker.MediaPickerBaseAct;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MediaLocalStatus;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Triple;
import l.e30;
import l.e6c0;
import l.j760;
import l.lsi0;
import l.qib0;
import l.qzb0;
import l.rhi;
import l.s4c0;
import l.vwb;
import l.yck0;
import p009l.mgh0;
import p009l.rd70;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class MediaPickerAct extends PutongAct {

    /* JADX INFO: renamed from: e */
    public static b<String> f7607e = b.b();

    /* JADX INFO: renamed from: f */
    public static b<Triple<String, String, String>> f7608f = b.b();

    /* JADX INFO: renamed from: c */
    public MediaPickerFrag f7609c;

    /* JADX INFO: renamed from: d */
    public MediaPickerParamsObject f7610d;

    /* JADX INFO: renamed from: X1 */
    public static Intent m9216X1(Context context, MediaPickerParamsObject mediaPickerParamsObject) {
        Intent intent = new Intent(context, (Class<?>) MediaPickerAct.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("params_object", mediaPickerParamsObject);
        intent.putExtra("extra_bundle", bundle);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y1 */
    public void m9217Y1(Bundle bundle) {
        if (NullChecker.a(fragmentManager().h0(s4c0.o0)) || getIntent() == null || getIntent().getBundleExtra("extra_bundle") == null) {
            return;
        }
        Intent intent = getIntent();
        MediaPickerFrag mediaPickerFrag = new MediaPickerFrag();
        this.f7609c = mediaPickerFrag;
        mediaPickerFrag.setArguments(intent.getBundleExtra("extra_bundle"));
        this.f7610d = (MediaPickerParamsObject) intent.getBundleExtra("extra_bundle").getSerializable("params_object");
        k kVarM = getSupportFragmentManager().m();
        kVarM.c(s4c0.o0, this.f7609c, "MediaPickerFrag");
        kVarM.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean checkRunningCondition() {
        if (ensurePlugin()) {
            return false;
        }
        startActivity(mgh0.m18466t(getIntent()));
        return true;
    }

    public boolean ensurePlugin() {
        return !qib0.c0.signedIn_() ? qib0.j0.z("account") : qib0.J0();
    }

    public void finish() {
        MediaPickerParamsObject mediaPickerParamsObject;
        super/*com.p1.mobile.android.app.Act*/.finish();
        MediaPickerFrag mediaPickerFrag = this.f7609c;
        if (mediaPickerFrag == null || (mediaPickerParamsObject = mediaPickerFrag.f7617G) == null || mediaPickerParamsObject.finishInAnim == 0) {
            return;
        }
        overridePendingTransition(qzb0.a, mediaPickerParamsObject.finishOutAnim);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(e6c0.f, (ViewGroup) null);
    }

    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.mpx
            public final void call(Object obj) {
                this.f17020a.m9217Y1((Bundle) obj);
            }
        });
        if (qib0.c0.f() && NullChecker.a(((PutongAct) this).pageHelper)) {
            ((PutongAct) this).pageHelper.p(new j760[]{new j760("page_gender", qib0.c0.e() ? "male" : "female")});
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (NullChecker.a(this.f7610d) && this.f7610d.fromType == 9 && NullChecker.a(intent)) {
            List list = (List) intent.getSerializableExtra("extra_images");
            if (NullChecker.a(list) && list.size() > 0) {
                Media media = (Media) list.get(0);
                if (media instanceof Video) {
                    String strReplaceFirst = media.url.replaceFirst("file://", "");
                    File file = new File(strReplaceFirst);
                    if (file.length() < 1048576) {
                        lsi0.j("你的视频长度太短了");
                        finish();
                        return;
                    }
                    if (file.length() > 31457280) {
                        lsi0.j("你的视频长度太长了");
                        finish();
                        return;
                    }
                    String str = "data:video/mp4;base64," + Base64.encodeToString(yck0.a(file), 2);
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(strReplaceFirst);
                    f7608f.onNext(new Triple(str, mediaMetadataRetriever.extractMetadata(18), mediaMetadataRetriever.extractMetadata(19)));
                    f7608f.onCompleted();
                    finish();
                    return;
                }
            }
        }
        if (NullChecker.a(this.f7609c)) {
            this.f7609c.onActivityResult(i, i2, intent);
        }
    }

    public void onBackPressed() {
        MediaPickerParamsObject mediaPickerParamsObject = this.f7610d;
        if (mediaPickerParamsObject != null && mediaPickerParamsObject.fromType == 8) {
            rd70.m21593j(mediaPickerParamsObject.jsBridgeTimestamp, new ArrayList());
        }
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCropImageResult(String str) {
        if (NullChecker.a(this.f7610d) && this.f7610d.fromType == 9) {
            f7607e.onNext("data:image/png;base64," + Base64.encodeToString(yck0.a(new File(str)), 2));
            f7607e.onCompleted();
            finish();
            return;
        }
        if (NullChecker.a(this.f7610d)) {
            int i = this.f7610d.fromType;
            if (i == 1 || i == 7) {
                Picture picture = new Picture();
                ((Media) picture).status = MediaLocalStatus.get("preprocessed");
                ((Media) picture).url = rhi.B(str);
                ((Media) picture).mediaType = "image/jpeg";
                Intent intent = new Intent();
                intent.putExtra(MediaPickerBaseAct.f8209h, vwb.f0(new Picture[]{picture}));
                if (NullChecker.a(this.f7609c)) {
                    this.f7609c.m9220N4(intent);
                }
                setResult(-1, intent);
                finish();
            }
        }
    }

    public String pageId() {
        return "p_camera_local_album";
    }

    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }
}
