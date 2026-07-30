package com.p051p1.mobile.putong.newui.mediaoperation.mediapicker;

import android.content.Intent;
import android.os.Bundle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.common.R$string;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.decoration.MediaItemRenderDecoration;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.item.NewAlbumMediaItemView;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.util.C13230a;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import com.tantanapp.common.utils.NullChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import p153l.jh0;
import p153l.kh0;
import p153l.o1j0;
import p153l.ouf0;
import p153l.qa00;
import p153l.rn20;
import p153l.ryx;
import p153l.s0y;

/* JADX INFO: loaded from: classes10.dex */
public abstract class MediaPickerBaseFrag extends PutongFrag implements rn20 {

    /* JADX INFO: renamed from: B */
    public jh0 f54854B;

    /* JADX INFO: renamed from: C */
    public RecyclerView f54855C;

    /* JADX INFO: renamed from: D */
    public GridLayoutManager f54856D;

    /* JADX INFO: renamed from: E */
    public ouf0 f54857E;

    /* JADX INFO: renamed from: F */
    public s0y f54858F;

    /* JADX INFO: renamed from: G */
    public MediaPickerParamsObject f54859G;

    /* JADX INFO: renamed from: H */
    public MediaItemRenderDecoration f54860H;

    /* JADX INFO: renamed from: z */
    public MediaWrapper f54861z = new MediaWrapper();

    /* JADX INFO: renamed from: A */
    public Map<String, Integer> f54853A = new LinkedHashMap();

    /* JADX INFO: renamed from: G1 */
    public void mo63700G1(NewAlbumMediaItemView newAlbumMediaItemView, Media media, int i) {
        if (this.f54853A.containsKey(media.url)) {
            mo63723Z4(media, false);
        } else if (this.f54853A.containsKey(media.originUrl)) {
            mo63723Z4(media, true);
        } else {
            boolean z = media instanceof Video;
            if (z) {
                if (this.f54861z.selectedImageMedias.size() > 0) {
                    o1j0.m165649w(R$string.f18049H0);
                    return;
                } else if (this.f54853A.size() == this.f54859G.getMaxVideoSelectCount()) {
                    o1j0.m165649w(R$string.f18049H0);
                    return;
                }
            } else if (media instanceof Picture) {
                if (this.f54861z.selectedVideoMedias.size() > 0) {
                    o1j0.m165649w(R$string.f18049H0);
                    return;
                } else if (this.f54853A.size() == this.f54859G.getMaxImageSelectCount()) {
                    o1j0.m165651y(String.format(act().getString(R$string.f18096T), Integer.valueOf(this.f54859G.getMaxImageSelectCount())));
                    return;
                }
            }
            this.f54853A.put(media.url, Integer.valueOf(this.f54861z.allSelectedMedias.size()));
            this.f54861z.addSelectedMedia(media);
            if (this.f54861z.allSelectedMedias.size() == 1 || ((z && this.f54861z.allSelectedMedias.size() == this.f54859G.getMaxVideoSelectCount()) || ((media instanceof Picture) && this.f54861z.allSelectedMedias.size() == this.f54859G.getMaxImageSelectCount()))) {
                this.f54854B.m144822I();
            } else {
                this.f54854B.notifyItemChanged(i);
            }
        }
        mo80108Q4();
    }

    /* JADX INFO: renamed from: M4 */
    public void m80104M4() {
        MediaPickerParamsObject mediaPickerParamsObject = this.f54859G;
        if (mediaPickerParamsObject == null || !this.f54858F.m183992d(this, this.f54861z, mediaPickerParamsObject)) {
            m80106O4();
        }
    }

    /* JADX INFO: renamed from: N4 */
    public void m80105N4(Intent intent) {
        this.f54858F.mo172491b(intent);
    }

    /* JADX INFO: renamed from: O4 */
    public void m80106O4() {
        Intent intent = new Intent();
        intent.putExtra(MediaPickerParamsObject.MEDIA_PICKER_RESULT_KEY, this.f54861z.allSelectedMedias);
        act().setResult(-1, intent);
        act().m68056e2();
    }

    /* JADX INFO: renamed from: P4 */
    public void m80107P4(Media media) {
        this.f54861z.addSelectedMedia(media);
        m80104M4();
        this.f54861z.clearAllSelectedMedia();
    }

    /* JADX INFO: renamed from: Q4 */
    public void mo80108Q4() {
    }

    /* JADX INFO: renamed from: R4 */
    public jh0 m80109R4() {
        return new jh0(new kh0(this, this.f54861z, this.f54859G, this.f54860H));
    }

    /* JADX INFO: renamed from: S4 */
    public ryx m80110S4(MediaPickerParamsObject mediaPickerParamsObject) {
        return null;
    }

    /* JADX INFO: renamed from: T4 */
    public abstract MediaItemRenderDecoration mo63713T4(MediaPickerParamsObject mediaPickerParamsObject);

    /* JADX INFO: renamed from: U4 */
    public abstract MediaPickerParamsObject mo63715U4();

    /* JADX INFO: renamed from: V4 */
    public abstract s0y mo63717V4(MediaPickerParamsObject mediaPickerParamsObject);

    /* JADX INFO: renamed from: W4 */
    public final MediaPickerParamsObject m80111W4() {
        return MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).showPreviewEditBtn(false).build()).withFromType(16).build();
    }

    /* JADX INFO: renamed from: X4 */
    public abstract RecyclerView mo63720X4();

    /* JADX INFO: renamed from: Y4 */
    public void m80112Y4() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(act(), 3);
        this.f54856D = gridLayoutManager;
        gridLayoutManager.setSmoothScrollbarEnabled(true);
        this.f54855C.setLayoutManager(this.f54856D);
        if (this.f54857E == null) {
            ouf0 ouf0Var = new ouf0(qa00.m175859d(2.0f), 3);
            this.f54857E = ouf0Var;
            this.f54855C.addItemDecoration(ouf0Var);
        }
        this.f54855C.setAdapter(this.f54854B);
    }

    /* JADX INFO: renamed from: Z4 */
    public abstract void mo63723Z4(Media media, boolean z);

    /* JADX INFO: renamed from: a5 */
    public void m80113a5() {
        Act act = act();
        if (!NullChecker.m82486a(act) || act.isDestroyed() || act.isFinishing()) {
            return;
        }
        act.m68056e2();
    }

    /* JADX INFO: renamed from: b5 */
    public void m80114b5(NewAlbumMediaItemView newAlbumMediaItemView, Media media) {
        MediaPickerParamsObject mediaPickerParamsObject = this.f54859G;
        if (mediaPickerParamsObject != null) {
            this.f54858F.m183991c(this, newAlbumMediaItemView, media, mediaPickerParamsObject, this.f54861z);
        }
    }

    /* JADX INFO: renamed from: f */
    public void mo63730f(NewAlbumMediaItemView newAlbumMediaItemView, Media media, int i) {
        int i2;
        Video video;
        Dimension dimension;
        boolean z = media instanceof Video;
        if ((!z || !this.f54861z.selectedImageMedias.isEmpty()) && (!(media instanceof Picture) || !this.f54861z.selectedVideoMedias.isEmpty())) {
            o1j0.m165649w(R$string.f18092S);
            return;
        }
        if (z && ((dimension = (video = (Video) media).size) == null || dimension.width <= 0 || dimension.height <= 0)) {
            video.size = C13230a.m80202e(act(), video.url);
        }
        if (((z && this.f54859G.getMaxVideoSelectCount() == 1) || ((media instanceof Picture) && this.f54859G.getMaxImageSelectCount() == 1)) && (i2 = this.f54859G.fromType) != 13 && i2 != 10 && i2 != 11 && i2 != 14) {
            m80107P4(media);
        } else if (this.f54859G.needClickItemPreview) {
            m80114b5(newAlbumMediaItemView, media);
        } else {
            mo63700G1(newAlbumMediaItemView, media, i);
        }
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f54854B = m80109R4();
        this.f54855C = mo63720X4();
        m80112Y4();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo21593n4(Bundle bundle) {
        super.mo21593n4(bundle);
        try {
            this.f54859G = mo63715U4();
        } catch (Exception unused) {
            this.f54859G = m80111W4();
        }
        if (this.f54859G == null) {
            this.f54859G = m80111W4();
        }
        this.f54858F = mo63717V4(this.f54859G);
        this.f54860H = mo63713T4(this.f54859G);
        m80110S4(this.f54859G);
    }
}
