package com.p000p1.mobile.putong.newui.mediaoperation.mediapicker;

import android.content.Intent;
import android.os.Bundle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.decoration.MediaItemRenderDecoration;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.item.NewAlbumMediaItemView;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.util.C0469a;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.common.R;
import com.p1.mobile.putong.data.Dimension;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.NullChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import l.lsi0;
import l.t100;
import p009l.fmf0;
import p009l.hf20;
import p009l.nh0;
import p009l.oh0;
import p009l.upx;
import p009l.vrx;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class MediaPickerBaseFrag extends PutongFrag implements hf20 {

    /* JADX INFO: renamed from: B */
    public nh0 f7612B;

    /* JADX INFO: renamed from: C */
    public RecyclerView f7613C;

    /* JADX INFO: renamed from: D */
    public GridLayoutManager f7614D;

    /* JADX INFO: renamed from: E */
    public fmf0 f7615E;

    /* JADX INFO: renamed from: F */
    public vrx f7616F;

    /* JADX INFO: renamed from: G */
    public MediaPickerParamsObject f7617G;

    /* JADX INFO: renamed from: H */
    public MediaItemRenderDecoration f7618H;

    /* JADX INFO: renamed from: z */
    public MediaWrapper f7619z = new MediaWrapper();

    /* JADX INFO: renamed from: A */
    public Map<String, Integer> f7611A = new LinkedHashMap();

    @Override // p009l.hf20
    /* JADX INFO: renamed from: G1 */
    public void mo9218G1(NewAlbumMediaItemView newAlbumMediaItemView, Media media, int i) {
        if (this.f7611A.containsKey(media.url)) {
            mo9232Z4(media, false);
        } else if (this.f7611A.containsKey(media.originUrl)) {
            mo9232Z4(media, true);
        } else {
            boolean z = media instanceof Video;
            if (z) {
                if (this.f7619z.selectedImageMedias.size() > 0) {
                    lsi0.w(R.string.H0);
                    return;
                } else if (this.f7611A.size() == this.f7617G.getMaxVideoSelectCount()) {
                    lsi0.w(R.string.H0);
                    return;
                }
            } else if (media instanceof Picture) {
                if (this.f7619z.selectedVideoMedias.size() > 0) {
                    lsi0.w(R.string.H0);
                    return;
                } else if (this.f7611A.size() == this.f7617G.getMaxImageSelectCount()) {
                    lsi0.y(String.format(act().getString(R.string.T), Integer.valueOf(this.f7617G.getMaxImageSelectCount())));
                    return;
                }
            }
            this.f7611A.put(media.url, Integer.valueOf(this.f7619z.allSelectedMedias.size()));
            this.f7619z.addSelectedMedia(media);
            if (this.f7619z.allSelectedMedias.size() == 1 || ((z && this.f7619z.allSelectedMedias.size() == this.f7617G.getMaxVideoSelectCount()) || ((media instanceof Picture) && this.f7619z.allSelectedMedias.size() == this.f7617G.getMaxImageSelectCount()))) {
                this.f7612B.m18873I();
            } else {
                this.f7612B.notifyItemChanged(i);
            }
        }
        mo9223Q4();
    }

    /* JADX INFO: renamed from: M4 */
    public void m9219M4() {
        MediaPickerParamsObject mediaPickerParamsObject = this.f7617G;
        if (mediaPickerParamsObject == null || !this.f7616F.m23706d(this, this.f7619z, mediaPickerParamsObject)) {
            m9221O4();
        }
    }

    /* JADX INFO: renamed from: N4 */
    public void m9220N4(Intent intent) {
        this.f7616F.m23704b(intent);
    }

    /* JADX INFO: renamed from: O4 */
    public void m9221O4() {
        Intent intent = new Intent();
        intent.putExtra(MediaPickerParamsObject.MEDIA_PICKER_RESULT_KEY, this.f7619z.allSelectedMedias);
        act().setResult(-1, intent);
        act().finish();
    }

    /* JADX INFO: renamed from: P4 */
    public void m9222P4(Media media) {
        this.f7619z.addSelectedMedia(media);
        m9219M4();
        this.f7619z.clearAllSelectedMedia();
    }

    /* JADX INFO: renamed from: Q4 */
    public void mo9223Q4() {
    }

    /* JADX INFO: renamed from: R4 */
    public nh0 m9224R4() {
        return new nh0(new oh0(this, this.f7619z, this.f7617G, this.f7618H));
    }

    /* JADX INFO: renamed from: S4 */
    public upx m9225S4(MediaPickerParamsObject mediaPickerParamsObject) {
        return null;
    }

    /* JADX INFO: renamed from: T4 */
    public abstract MediaItemRenderDecoration mo9226T4(MediaPickerParamsObject mediaPickerParamsObject);

    /* JADX INFO: renamed from: U4 */
    public abstract MediaPickerParamsObject mo9227U4();

    /* JADX INFO: renamed from: V4 */
    public abstract vrx mo9228V4(MediaPickerParamsObject mediaPickerParamsObject);

    /* JADX INFO: renamed from: W4 */
    public final MediaPickerParamsObject m9229W4() {
        return MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).showPreviewEditBtn(false).build()).withFromType(16).build();
    }

    /* JADX INFO: renamed from: X4 */
    public abstract RecyclerView mo9230X4();

    /* JADX INFO: renamed from: Y4 */
    public void m9231Y4() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(act(), 3);
        this.f7614D = gridLayoutManager;
        gridLayoutManager.setSmoothScrollbarEnabled(true);
        this.f7613C.setLayoutManager(this.f7614D);
        if (this.f7615E == null) {
            fmf0 fmf0Var = new fmf0(t100.d(2.0f), 3);
            this.f7615E = fmf0Var;
            this.f7613C.addItemDecoration(fmf0Var);
        }
        this.f7613C.setAdapter(this.f7612B);
    }

    /* JADX INFO: renamed from: Z4 */
    public abstract void mo9232Z4(Media media, boolean z);

    /* JADX INFO: renamed from: a5 */
    public void m9233a5() {
        Act act = act();
        if (!NullChecker.a(act) || act.isDestroyed() || act.isFinishing()) {
            return;
        }
        act.finish();
    }

    /* JADX INFO: renamed from: b5 */
    public void m9234b5(NewAlbumMediaItemView newAlbumMediaItemView, Media media) {
        MediaPickerParamsObject mediaPickerParamsObject = this.f7617G;
        if (mediaPickerParamsObject != null) {
            this.f7616F.m23705c(this, newAlbumMediaItemView, media, mediaPickerParamsObject, this.f7619z);
        }
    }

    @Override // p009l.hf20
    /* JADX INFO: renamed from: f */
    public void mo9235f(NewAlbumMediaItemView newAlbumMediaItemView, Media media, int i) {
        int i2;
        Video video;
        Dimension dimension;
        boolean z = media instanceof Video;
        if ((!z || !this.f7619z.selectedImageMedias.isEmpty()) && (!(media instanceof Picture) || !this.f7619z.selectedVideoMedias.isEmpty())) {
            lsi0.w(R.string.S);
            return;
        }
        if (z && ((dimension = (video = (Video) media).size) == null || dimension.width <= 0 || dimension.height <= 0)) {
            video.size = C0469a.m9327e(act(), ((Media) video).url);
        }
        if (((z && this.f7617G.getMaxVideoSelectCount() == 1) || ((media instanceof Picture) && this.f7617G.getMaxImageSelectCount() == 1)) && (i2 = this.f7617G.fromType) != 13 && i2 != 10 && i2 != 11 && i2 != 14) {
            m9222P4(media);
        } else if (this.f7617G.needClickItemPreview) {
            m9234b5(newAlbumMediaItemView, media);
        } else {
            mo9218G1(newAlbumMediaItemView, media, i);
        }
    }

    /* JADX INFO: renamed from: g4 */
    public void mo3338g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        this.f7612B = m9224R4();
        this.f7613C = mo9230X4();
        m9231Y4();
    }

    /* JADX INFO: renamed from: n4 */
    public void mo3339n4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.n4(bundle);
        try {
            this.f7617G = mo9227U4();
        } catch (Exception unused) {
            this.f7617G = m9229W4();
        }
        if (this.f7617G == null) {
            this.f7617G = m9229W4();
        }
        this.f7616F = mo9228V4(this.f7617G);
        this.f7618H = mo9226T4(this.f7617G);
        m9225S4(this.f7617G);
    }
}
