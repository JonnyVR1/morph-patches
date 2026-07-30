package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.decoration.MediaItemRenderDecoration;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.item.NewAlbumMediaItemView;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.util.C13067a;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class nh0 extends dac0<Media> {

    /* JADX INFO: renamed from: d */
    public hf20 f138933d;

    /* JADX INFO: renamed from: e */
    public MediaWrapper f138934e;

    /* JADX INFO: renamed from: f */
    public int f138935f;

    /* JADX INFO: renamed from: g */
    public int f138936g;

    /* JADX INFO: renamed from: h */
    public MediaPickerParamsObject f138937h;

    /* JADX INFO: renamed from: i */
    public MediaItemRenderDecoration f138938i;

    /* JADX INFO: renamed from: k */
    public int f138940k;

    /* JADX INFO: renamed from: c */
    public q860<Media> f138932c = q860.m173341a();

    /* JADX INFO: renamed from: j */
    public final int f138939j = -1;

    public nh0(oh0 oh0Var) {
        this.f138933d = oh0Var.m164305a();
        this.f138934e = oh0Var.m164308d();
        this.f138935f = oh0Var.m164306b();
        this.f138936g = oh0Var.m164307c();
        this.f138937h = oh0Var.f143936e;
        this.f138938i = oh0Var.f143937f;
    }

    private Act act() {
        return this.f138933d.mo62514C().act();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        boolean z = this.f138937h.isHasPostStatusHeader;
        q860<Media> q860Var = this.f138932c;
        return z ? q860Var.f153135a.size() + 1 : q860Var.f153135a.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return i == -1 ? act().inflater().inflate(this.f138937h.headResource, viewGroup, false) : act().inflater().inflate(e6c0.f89548g, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, Media media, int i, int i2) {
        MediaPickerParamsObject mediaPickerParamsObject = this.f138937h;
        boolean z = mediaPickerParamsObject.isHasPostStatusHeader;
        if (z && i2 == 0) {
            return;
        }
        if (z) {
            i2--;
        }
        NewAlbumMediaItemView newAlbumMediaItemView = (NewAlbumMediaItemView) view;
        MediaItemRenderDecoration mediaItemRenderDecoration = this.f138938i;
        if (mediaItemRenderDecoration == null || !mediaItemRenderDecoration.beforeItemRender(newAlbumMediaItemView, media, this.f138934e, mediaPickerParamsObject)) {
            m159374F(media, i2, newAlbumMediaItemView);
            MediaItemRenderDecoration mediaItemRenderDecoration2 = this.f138938i;
            if (mediaItemRenderDecoration2 != null) {
                mediaItemRenderDecoration2.afterItemRender(newAlbumMediaItemView, media, this.f138933d, this.f138937h);
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public void m159374F(Media media, int i, NewAlbumMediaItemView newAlbumMediaItemView) {
        newAlbumMediaItemView.m79011e(media, i, C13067a.m79017c(this.f138934e.croppedMap, media.url), this.f138933d, Boolean.valueOf(!vwb.m200296J(this.f138934e.selectedImageMedias) || this.f138934e.selectedVideoMedias.size() == this.f138936g), Boolean.valueOf(m159376H()), this.f138937h);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public Media getItem(int i) {
        if (!this.f138937h.isHasPostStatusHeader) {
            return this.f138932c.f153135a.get(i);
        }
        if (i == 0) {
            return null;
        }
        return this.f138932c.f153135a.get(i - 1);
    }

    /* JADX INFO: renamed from: H */
    public boolean m159376H() {
        return !vwb.m200296J(this.f138934e.selectedVideoMedias) || this.f138934e.selectedImageMedias.size() == this.f138935f;
    }

    /* JADX INFO: renamed from: I */
    public void m159377I() {
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: J */
    public void m159378J(q860<Media> q860Var) {
        this.f138940k = q860Var.f153135a.size();
        this.f138932c = q860Var;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: K */
    public void m159379K(ArrayList<Media> arrayList) {
        this.f138932c.f153135a.add(0, arrayList.get(0));
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: L */
    public void m159380L(List<Media> list) {
        notifyItemRangeChanged(this.f138940k, list.size());
        this.f138940k = this.f138932c.f153135a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        if (!this.f138937h.isHasPostStatusHeader) {
            return i;
        }
        if (i == 0) {
            return -1L;
        }
        return i - 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (this.f138937h.isHasPostStatusHeader && i == 0) {
            return -1;
        }
        return super.getItemViewType(i);
    }
}
