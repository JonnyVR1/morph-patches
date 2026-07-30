package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.decoration.MediaItemRenderDecoration;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.item.NewAlbumMediaItemView;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.util.C13230a;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class jh0 extends jic0<Media> {

    /* JADX INFO: renamed from: d */
    public rn20 f120790d;

    /* JADX INFO: renamed from: e */
    public MediaWrapper f120791e;

    /* JADX INFO: renamed from: f */
    public int f120792f;

    /* JADX INFO: renamed from: g */
    public int f120793g;

    /* JADX INFO: renamed from: h */
    public MediaPickerParamsObject f120794h;

    /* JADX INFO: renamed from: i */
    public MediaItemRenderDecoration f120795i;

    /* JADX INFO: renamed from: k */
    public int f120797k;

    /* JADX INFO: renamed from: c */
    public vg60<Media> f120789c = vg60.m201219a();

    /* JADX INFO: renamed from: j */
    public final int f120796j = -1;

    public jh0(kh0 kh0Var) {
        this.f120790d = kh0Var.m149779a();
        this.f120791e = kh0Var.m149782d();
        this.f120792f = kh0Var.m149780b();
        this.f120793g = kh0Var.m149781c();
        this.f120794h = kh0Var.f126680e;
        this.f120795i = kh0Var.f126681f;
    }

    private Act act() {
        return this.f120790d.mo63697C().act();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        boolean z = this.f120794h.isHasPostStatusHeader;
        vg60<Media> vg60Var = this.f120789c;
        return z ? vg60Var.f184001a.size() + 1 : vg60Var.f184001a.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return i == -1 ? act().inflater().inflate(this.f120794h.headResource, viewGroup, false) : act().inflater().inflate(jec0.f120461g, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, Media media, int i, int i2) {
        MediaPickerParamsObject mediaPickerParamsObject = this.f120794h;
        boolean z = mediaPickerParamsObject.isHasPostStatusHeader;
        if (z && i2 == 0) {
            return;
        }
        if (z) {
            i2--;
        }
        NewAlbumMediaItemView newAlbumMediaItemView = (NewAlbumMediaItemView) view;
        MediaItemRenderDecoration mediaItemRenderDecoration = this.f120795i;
        if (mediaItemRenderDecoration == null || !mediaItemRenderDecoration.beforeItemRender(newAlbumMediaItemView, media, this.f120791e, mediaPickerParamsObject)) {
            m144819F(media, i2, newAlbumMediaItemView);
            MediaItemRenderDecoration mediaItemRenderDecoration2 = this.f120795i;
            if (mediaItemRenderDecoration2 != null) {
                mediaItemRenderDecoration2.afterItemRender(newAlbumMediaItemView, media, this.f120790d, this.f120794h);
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public void m144819F(Media media, int i, NewAlbumMediaItemView newAlbumMediaItemView) {
        newAlbumMediaItemView.m80194e(media, i, C13230a.m80200c(this.f120791e.croppedMap, media.url), this.f120790d, Boolean.valueOf(!jyb.m147479J(this.f120791e.selectedImageMedias) || this.f120791e.selectedVideoMedias.size() == this.f120793g), Boolean.valueOf(m144821H()), this.f120794h);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public Media getItem(int i) {
        if (!this.f120794h.isHasPostStatusHeader) {
            return this.f120789c.f184001a.get(i);
        }
        if (i == 0) {
            return null;
        }
        return this.f120789c.f184001a.get(i - 1);
    }

    /* JADX INFO: renamed from: H */
    public boolean m144821H() {
        return !jyb.m147479J(this.f120791e.selectedVideoMedias) || this.f120791e.selectedImageMedias.size() == this.f120792f;
    }

    /* JADX INFO: renamed from: I */
    public void m144822I() {
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: J */
    public void m144823J(vg60<Media> vg60Var) {
        this.f120797k = vg60Var.f184001a.size();
        this.f120789c = vg60Var;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: K */
    public void m144824K(ArrayList<Media> arrayList) {
        this.f120789c.f184001a.add(0, arrayList.get(0));
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: L */
    public void m144825L(List<Media> list) {
        notifyItemRangeChanged(this.f120797k, list.size());
        this.f120797k = this.f120789c.f184001a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        if (!this.f120794h.isHasPostStatusHeader) {
            return i;
        }
        if (i == 0) {
            return -1L;
        }
        return i - 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (this.f120794h.isHasPostStatusHeader && i == 0) {
            return -1;
        }
        return super.getItemViewType(i);
    }
}
