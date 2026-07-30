package com.p046p1.mobile.putong.newui.mediaoperation.mediapicker;

import android.content.Intent;
import android.os.Bundle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.common.R$string;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.decoration.MediaItemRenderDecoration;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.item.NewAlbumMediaItemView;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.util.C13067a;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import com.tantanapp.common.utils.NullChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import p149l.fmf0;
import p149l.hf20;
import p149l.lsi0;
import p149l.nh0;
import p149l.oh0;
import p149l.t100;
import p149l.upx;
import p149l.vrx;

/* JADX INFO: loaded from: classes11.dex */
public abstract class MediaPickerBaseFrag extends PutongFrag implements hf20 {

    /* JADX INFO: renamed from: B */
    public nh0 f54006B;

    /* JADX INFO: renamed from: C */
    public RecyclerView f54007C;

    /* JADX INFO: renamed from: D */
    public GridLayoutManager f54008D;

    /* JADX INFO: renamed from: E */
    public fmf0 f54009E;

    /* JADX INFO: renamed from: F */
    public vrx f54010F;

    /* JADX INFO: renamed from: G */
    public MediaPickerParamsObject f54011G;

    /* JADX INFO: renamed from: H */
    public MediaItemRenderDecoration f54012H;

    /* JADX INFO: renamed from: z */
    public MediaWrapper f54013z = new MediaWrapper();

    /* JADX INFO: renamed from: A */
    public Map<String, Integer> f54005A = new LinkedHashMap();

    /* JADX INFO: renamed from: G1 */
    public void mo62517G1(NewAlbumMediaItemView newAlbumMediaItemView, Media media, int i) {
        if (this.f54005A.containsKey(media.url)) {
            mo62540Z4(media, false);
        } else if (this.f54005A.containsKey(media.originUrl)) {
            mo62540Z4(media, true);
        } else {
            boolean z = media instanceof Video;
            if (z) {
                if (this.f54013z.selectedImageMedias.size() > 0) {
                    lsi0.m151593w(R$string.f17330H0);
                    return;
                } else if (this.f54005A.size() == this.f54011G.getMaxVideoSelectCount()) {
                    lsi0.m151593w(R$string.f17330H0);
                    return;
                }
            } else if (media instanceof Picture) {
                if (this.f54013z.selectedVideoMedias.size() > 0) {
                    lsi0.m151593w(R$string.f17330H0);
                    return;
                } else if (this.f54005A.size() == this.f54011G.getMaxImageSelectCount()) {
                    lsi0.m151595y(String.format(act().getString(R$string.f17377T), Integer.valueOf(this.f54011G.getMaxImageSelectCount())));
                    return;
                }
            }
            this.f54005A.put(media.url, Integer.valueOf(this.f54013z.allSelectedMedias.size()));
            this.f54013z.addSelectedMedia(media);
            if (this.f54013z.allSelectedMedias.size() == 1 || ((z && this.f54013z.allSelectedMedias.size() == this.f54011G.getMaxVideoSelectCount()) || ((media instanceof Picture) && this.f54013z.allSelectedMedias.size() == this.f54011G.getMaxImageSelectCount()))) {
                this.f54006B.m159377I();
            } else {
                this.f54006B.notifyItemChanged(i);
            }
        }
        mo78925Q4();
    }

    /* JADX INFO: renamed from: M4 */
    public void m78921M4() {
        MediaPickerParamsObject mediaPickerParamsObject = this.f54011G;
        if (mediaPickerParamsObject == null || !this.f54010F.m199757d(this, this.f54013z, mediaPickerParamsObject)) {
            m78923O4();
        }
    }

    /* JADX INFO: renamed from: N4 */
    public void m78922N4(Intent intent) {
        this.f54010F.mo96814b(intent);
    }

    /* JADX INFO: renamed from: O4 */
    public void m78923O4() {
        Intent intent = new Intent();
        intent.putExtra(MediaPickerParamsObject.MEDIA_PICKER_RESULT_KEY, this.f54013z.allSelectedMedias);
        act().setResult(-1, intent);
        act().m66873d2();
    }

    /* JADX INFO: renamed from: P4 */
    public void m78924P4(Media media) {
        this.f54013z.addSelectedMedia(media);
        m78921M4();
        this.f54013z.clearAllSelectedMedia();
    }

    /* JADX INFO: renamed from: Q4 */
    public void mo78925Q4() {
    }

    /* JADX INFO: renamed from: R4 */
    public nh0 m78926R4() {
        return new nh0(new oh0(this, this.f54013z, this.f54011G, this.f54012H));
    }

    /* JADX INFO: renamed from: S4 */
    public upx m78927S4(MediaPickerParamsObject mediaPickerParamsObject) {
        return null;
    }

    /* JADX INFO: renamed from: T4 */
    public abstract MediaItemRenderDecoration mo62530T4(MediaPickerParamsObject mediaPickerParamsObject);

    /* JADX INFO: renamed from: U4 */
    public abstract MediaPickerParamsObject mo62532U4();

    /* JADX INFO: renamed from: V4 */
    public abstract vrx mo62534V4(MediaPickerParamsObject mediaPickerParamsObject);

    /* JADX INFO: renamed from: W4 */
    public final MediaPickerParamsObject m78928W4() {
        return MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).showPreviewEditBtn(false).build()).withFromType(16).build();
    }

    /* JADX INFO: renamed from: X4 */
    public abstract RecyclerView mo62537X4();

    /* JADX INFO: renamed from: Y4 */
    public void m78929Y4() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(act(), 3);
        this.f54008D = gridLayoutManager;
        gridLayoutManager.setSmoothScrollbarEnabled(true);
        this.f54007C.setLayoutManager(this.f54008D);
        if (this.f54009E == null) {
            fmf0 fmf0Var = new fmf0(t100.m186890d(2.0f), 3);
            this.f54009E = fmf0Var;
            this.f54007C.addItemDecoration(fmf0Var);
        }
        this.f54007C.setAdapter(this.f54006B);
    }

    /* JADX INFO: renamed from: Z4 */
    public abstract void mo62540Z4(Media media, boolean z);

    /* JADX INFO: renamed from: a5 */
    public void m78930a5() {
        Act act = act();
        if (!NullChecker.m81303a(act) || act.isDestroyed() || act.isFinishing()) {
            return;
        }
        act.m66873d2();
    }

    /* JADX INFO: renamed from: b5 */
    public void m78931b5(NewAlbumMediaItemView newAlbumMediaItemView, Media media) {
        MediaPickerParamsObject mediaPickerParamsObject = this.f54011G;
        if (mediaPickerParamsObject != null) {
            this.f54010F.m199756c(this, newAlbumMediaItemView, media, mediaPickerParamsObject, this.f54013z);
        }
    }

    /* JADX INFO: renamed from: f */
    public void mo62547f(NewAlbumMediaItemView newAlbumMediaItemView, Media media, int i) {
        int i2;
        Video video;
        Dimension dimension;
        boolean z = media instanceof Video;
        if ((!z || !this.f54013z.selectedImageMedias.isEmpty()) && (!(media instanceof Picture) || !this.f54013z.selectedVideoMedias.isEmpty())) {
            lsi0.m151593w(R$string.f17373S);
            return;
        }
        if (z && ((dimension = (video = (Video) media).size) == null || dimension.width <= 0 || dimension.height <= 0)) {
            video.size = C13067a.m79019e(act(), video.url);
        }
        if (((z && this.f54011G.getMaxVideoSelectCount() == 1) || ((media instanceof Picture) && this.f54011G.getMaxImageSelectCount() == 1)) && (i2 = this.f54011G.fromType) != 13 && i2 != 10 && i2 != 11 && i2 != 14) {
            m78924P4(media);
        } else if (this.f54011G.needClickItemPreview) {
            m78931b5(newAlbumMediaItemView, media);
        } else {
            mo62517G1(newAlbumMediaItemView, media, i);
        }
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f54006B = m78926R4();
        this.f54007C = mo62537X4();
        m78929Y4();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo20594n4(Bundle bundle) {
        super.mo20594n4(bundle);
        try {
            this.f54011G = mo62532U4();
        } catch (Exception unused) {
            this.f54011G = m78928W4();
        }
        if (this.f54011G == null) {
            this.f54011G = m78928W4();
        }
        this.f54010F = mo62534V4(this.f54011G);
        this.f54012H = mo62530T4(this.f54011G);
        m78927S4(this.f54011G);
    }
}
