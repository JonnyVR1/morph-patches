package p007l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.feed.newui.mediapicker.NewCaptionIndicatorView;
import com.p000p1.mobile.putong.feed.newui.mediapicker.NewCaptionMediaView;
import com.p000p1.mobile.putong.feed.newui.mediapicker.NewCaptionVideoView;
import com.p000p1.mobile.putong.feed.newui.mediapicker.post.C2090b;
import com.p1.mobile.putong.app.PutongAct;
import java.util.ArrayList;
import l.dac0;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class od80 extends dac0<Object> {

    /* JADX INFO: renamed from: c */
    public fyl f11430c;

    /* JADX INFO: renamed from: d */
    public PutongAct f11431d;

    /* JADX INFO: renamed from: e */
    public boolean f11432e;

    /* JADX INFO: renamed from: f */
    public ArrayList<Media> f11433f = new ArrayList<>();

    /* JADX INFO: renamed from: g */
    public C2090b f11434g;

    public od80(PutongAct putongAct, fyl fylVar, boolean z, C2090b c2090b) {
        this.f11431d = putongAct;
        this.f11430c = fylVar;
        this.f11432e = z;
        this.f11434g = c2090b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A */
    public void m12530A(View view, Object obj, int i, int i2) {
        if (i == 1) {
            ((NewCaptionIndicatorView) view).m3459b(this.f11431d, this.f11433f, this.f11434g);
            p6j0.m12914d("e_add_new_photo", "p_moment_post", new p6j0.C2456a[0]);
        } else if (i == 2) {
            ((NewCaptionVideoView) view).m3486P(this.f11431d, this.f11430c, this.f11433f, (Video) obj, this, i2);
        } else {
            ((NewCaptionMediaView) view).m3469F(this.f11431d, this.f11430c, this.f11433f, obj, this, i2, this.f11432e);
        }
    }

    /* JADX INFO: renamed from: C */
    public int m12531C() {
        return (this.f11433f.size() >= 9 || !this.f11432e || vwb.m(this.f11433f, new w9j() { // from class: l.md80
            public final Object call(Object obj) {
                return Boolean.valueOf(((Media) obj) instanceof Video);
            }
        }) || vwb.m(this.f11433f, new w9j() { // from class: l.nd80
            public final Object call(Object obj) {
                Media media = (Media) obj;
                return Boolean.valueOf((media instanceof Picture) && media.isFromShoot());
            }
        })) ? this.f11433f.size() : this.f11433f.size() + 1;
    }

    /* JADX INFO: renamed from: D */
    public View m12532D(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return this.f11431d.inflater().inflate(o6c0.f11198d5, viewGroup, false);
        }
        PutongAct putongAct = this.f11431d;
        return i == 2 ? putongAct.inflater().inflate(o6c0.f11212f5, viewGroup, false) : putongAct.inflater().inflate(o6c0.f11205e5, viewGroup, false);
    }

    /* JADX INFO: renamed from: G */
    public ArrayList<Media> m12533G() {
        return this.f11433f;
    }

    /* JADX INFO: renamed from: H */
    public void m12534H(ArrayList<Media> arrayList) {
        this.f11433f = arrayList;
        notifyDataSetChanged();
    }

    public Object getItem(int i) {
        return i == this.f11433f.size() ? "add image" : this.f11433f.get(i);
    }

    public int getItemViewType(int i) {
        if (getItem(i).equals("add image")) {
            return 1;
        }
        return getItem(i) instanceof Video ? 2 : 0;
    }
}
