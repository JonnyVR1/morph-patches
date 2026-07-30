package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.feed.newui.mediapicker.NewCaptionIndicatorView;
import com.p051p1.mobile.putong.feed.newui.mediapicker.NewCaptionMediaView;
import com.p051p1.mobile.putong.feed.newui.mediapicker.NewCaptionVideoView;
import com.p051p1.mobile.putong.feed.newui.mediapicker.post.C11409b;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class xl80 extends jic0<Object> {

    /* JADX INFO: renamed from: c */
    public y0m f194895c;

    /* JADX INFO: renamed from: d */
    public PutongAct f194896d;

    /* JADX INFO: renamed from: e */
    public boolean f194897e;

    /* JADX INFO: renamed from: f */
    public ArrayList<Media> f194898f = new ArrayList<>();

    /* JADX INFO: renamed from: g */
    public C11409b f194899g;

    public xl80(PutongAct putongAct, y0m y0mVar, boolean z, C11409b c11409b) {
        this.f194896d = putongAct;
        this.f194895c = y0mVar;
        this.f194897e = z;
        this.f194899g = c11409b;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: A */
    public void mo29822A(View view, Object obj, int i, int i2) {
        if (i == 1) {
            ((NewCaptionIndicatorView) view).m63640b(this.f194896d, this.f194898f, this.f194899g);
            tfj0.m190941d("e_add_new_photo", "p_moment_post", new tfj0.C20302a[0]);
        } else if (i == 2) {
            ((NewCaptionVideoView) view).m63667P(this.f194896d, this.f194895c, this.f194898f, (Video) obj, this, i2);
        } else {
            ((NewCaptionMediaView) view).m63650F(this.f194896d, this.f194895c, this.f194898f, obj, this, i2, this.f194897e);
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return (this.f194898f.size() >= 9 || !this.f194897e || jyb.m147520m(this.f194898f, new qcj() { // from class: l.vl80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Media) obj) instanceof Video);
            }
        }) || jyb.m147520m(this.f194898f, new qcj() { // from class: l.wl80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Media media = (Media) obj;
                return Boolean.valueOf((media instanceof Picture) && media.isFromShoot());
            }
        })) ? this.f194898f.size() : this.f194898f.size() + 1;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return this.f194896d.inflater().inflate(tec0.f173648d5, viewGroup, false);
        }
        PutongAct putongAct = this.f194896d;
        return i == 2 ? putongAct.inflater().inflate(tec0.f173662f5, viewGroup, false) : putongAct.inflater().inflate(tec0.f173655e5, viewGroup, false);
    }

    /* JADX INFO: renamed from: G */
    public ArrayList<Media> m211546G() {
        return this.f194898f;
    }

    /* JADX INFO: renamed from: H */
    public void m211547H(ArrayList<Media> arrayList) {
        this.f194898f = arrayList;
        notifyDataSetChanged();
    }

    @Override // p153l.jic0
    public Object getItem(int i) {
        return i == this.f194898f.size() ? "add image" : this.f194898f.get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (getItem(i).equals("add image")) {
            return 1;
        }
        return getItem(i) instanceof Video ? 2 : 0;
    }
}
