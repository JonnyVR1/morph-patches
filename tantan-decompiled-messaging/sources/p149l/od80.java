package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.feed.newui.mediapicker.NewCaptionIndicatorView;
import com.p046p1.mobile.putong.feed.newui.mediapicker.NewCaptionMediaView;
import com.p046p1.mobile.putong.feed.newui.mediapicker.NewCaptionVideoView;
import com.p046p1.mobile.putong.feed.newui.mediapicker.post.C11246b;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public class od80 extends dac0<Object> {

    /* JADX INFO: renamed from: c */
    public fyl f143185c;

    /* JADX INFO: renamed from: d */
    public PutongAct f143186d;

    /* JADX INFO: renamed from: e */
    public boolean f143187e;

    /* JADX INFO: renamed from: f */
    public ArrayList<Media> f143188f = new ArrayList<>();

    /* JADX INFO: renamed from: g */
    public C11246b f143189g;

    public od80(PutongAct putongAct, fyl fylVar, boolean z, C11246b c11246b) {
        this.f143186d = putongAct;
        this.f143185c = fylVar;
        this.f143187e = z;
        this.f143189g = c11246b;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: A */
    public void mo28823A(View view, Object obj, int i, int i2) {
        if (i == 1) {
            ((NewCaptionIndicatorView) view).m62457b(this.f143186d, this.f143188f, this.f143189g);
            p6j0.m167670d("e_add_new_photo", "p_moment_post", new p6j0.C19147a[0]);
        } else if (i == 2) {
            ((NewCaptionVideoView) view).m62484P(this.f143186d, this.f143185c, this.f143188f, (Video) obj, this, i2);
        } else {
            ((NewCaptionMediaView) view).m62467F(this.f143186d, this.f143185c, this.f143188f, obj, this, i2, this.f143187e);
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return (this.f143188f.size() >= 9 || !this.f143187e || vwb.m200337m(this.f143188f, new w9j() { // from class: l.md80
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Media) obj) instanceof Video);
            }
        }) || vwb.m200337m(this.f143188f, new w9j() { // from class: l.nd80
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Media media = (Media) obj;
                return Boolean.valueOf((media instanceof Picture) && media.isFromShoot());
            }
        })) ? this.f143188f.size() : this.f143188f.size() + 1;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return this.f143186d.inflater().inflate(o6c0.f142179d5, viewGroup, false);
        }
        PutongAct putongAct = this.f143186d;
        return i == 2 ? putongAct.inflater().inflate(o6c0.f142193f5, viewGroup, false) : putongAct.inflater().inflate(o6c0.f142186e5, viewGroup, false);
    }

    /* JADX INFO: renamed from: G */
    public ArrayList<Media> m163653G() {
        return this.f143188f;
    }

    /* JADX INFO: renamed from: H */
    public void m163654H(ArrayList<Media> arrayList) {
        this.f143188f = arrayList;
        notifyDataSetChanged();
    }

    @Override // p149l.dac0
    public Object getItem(int i) {
        return i == this.f143188f.size() ? "add image" : this.f143188f.get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (getItem(i).equals("add image")) {
            return 1;
        }
        return getItem(i) instanceof Video ? 2 : 0;
    }
}
