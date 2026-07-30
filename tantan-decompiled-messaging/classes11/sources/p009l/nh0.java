package p009l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.decoration.MediaItemRenderDecoration;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.item.NewAlbumMediaItemView;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.util.C0469a;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.Media;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.e6c0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class nh0 extends dac0<Media> {

    /* JADX INFO: renamed from: d */
    public hf20 f17455d;

    /* JADX INFO: renamed from: e */
    public MediaWrapper f17456e;

    /* JADX INFO: renamed from: f */
    public int f17457f;

    /* JADX INFO: renamed from: g */
    public int f17458g;

    /* JADX INFO: renamed from: h */
    public MediaPickerParamsObject f17459h;

    /* JADX INFO: renamed from: i */
    public MediaItemRenderDecoration f17460i;

    /* JADX INFO: renamed from: k */
    public int f17462k;

    /* JADX INFO: renamed from: c */
    public q860<Media> f17454c = q860.m20832a();

    /* JADX INFO: renamed from: j */
    public final int f17461j = -1;

    public nh0(oh0 oh0Var) {
        this.f17455d = oh0Var.m19760a();
        this.f17456e = oh0Var.m19763d();
        this.f17457f = oh0Var.m19761b();
        this.f17458g = oh0Var.m19762c();
        this.f17459h = oh0Var.f18042e;
        this.f17460i = oh0Var.f18043f;
    }

    private Act act() {
        return this.f17455d.mo9270C().act();
    }

    /* JADX INFO: renamed from: C */
    public int m18867C() {
        boolean z = this.f17459h.isHasPostStatusHeader;
        q860<Media> q860Var = this.f17454c;
        return z ? q860Var.f19068a.size() + 1 : q860Var.f19068a.size();
    }

    /* JADX INFO: renamed from: D */
    public View m18868D(ViewGroup viewGroup, int i) {
        return i == -1 ? act().inflater().inflate(this.f17459h.headResource, viewGroup, false) : act().inflater().inflate(e6c0.g, viewGroup, false);
    }

    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void m18866A(View view, Media media, int i, int i2) {
        MediaPickerParamsObject mediaPickerParamsObject = this.f17459h;
        boolean z = mediaPickerParamsObject.isHasPostStatusHeader;
        if (z && i2 == 0) {
            return;
        }
        if (z) {
            i2--;
        }
        NewAlbumMediaItemView newAlbumMediaItemView = (NewAlbumMediaItemView) view;
        MediaItemRenderDecoration mediaItemRenderDecoration = this.f17460i;
        if (mediaItemRenderDecoration == null || !mediaItemRenderDecoration.beforeItemRender(newAlbumMediaItemView, media, this.f17456e, mediaPickerParamsObject)) {
            m18870F(media, i2, newAlbumMediaItemView);
            MediaItemRenderDecoration mediaItemRenderDecoration2 = this.f17460i;
            if (mediaItemRenderDecoration2 != null) {
                mediaItemRenderDecoration2.afterItemRender(newAlbumMediaItemView, media, this.f17455d, this.f17459h);
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public void m18870F(Media media, int i, NewAlbumMediaItemView newAlbumMediaItemView) {
        newAlbumMediaItemView.m9319e(media, i, C0469a.m9325c(this.f17456e.croppedMap, media.url), this.f17455d, Boolean.valueOf(!vwb.J(this.f17456e.selectedImageMedias) || this.f17456e.selectedVideoMedias.size() == this.f17458g), Boolean.valueOf(m18872H()), this.f17459h);
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public Media getItem(int i) {
        if (!this.f17459h.isHasPostStatusHeader) {
            return this.f17454c.f19068a.get(i);
        }
        if (i == 0) {
            return null;
        }
        return this.f17454c.f19068a.get(i - 1);
    }

    /* JADX INFO: renamed from: H */
    public boolean m18872H() {
        return !vwb.J(this.f17456e.selectedVideoMedias) || this.f17456e.selectedImageMedias.size() == this.f17457f;
    }

    /* JADX INFO: renamed from: I */
    public void m18873I() {
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: J */
    public void m18874J(q860<Media> q860Var) {
        this.f17462k = q860Var.f19068a.size();
        this.f17454c = q860Var;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: K */
    public void m18875K(ArrayList<Media> arrayList) {
        this.f17454c.f19068a.add(0, arrayList.get(0));
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: L */
    public void m18876L(List<Media> list) {
        notifyItemRangeChanged(this.f17462k, list.size());
        this.f17462k = this.f17454c.f19068a.size();
    }

    public long getItemId(int i) {
        if (!this.f17459h.isHasPostStatusHeader) {
            return i;
        }
        if (i == 0) {
            return -1L;
        }
        return i - 1;
    }

    public int getItemViewType(int i) {
        if (this.f17459h.isHasPostStatusHeader && i == 0) {
            return -1;
        }
        return super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.getItemViewType(i);
    }
}
