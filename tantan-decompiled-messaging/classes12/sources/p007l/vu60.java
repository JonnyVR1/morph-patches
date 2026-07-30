package p007l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.data.Audio;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentActivity;
import com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumActivitiesView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.dac0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class vu60 extends dac0<MomentActivity> {

    /* JADX INFO: renamed from: c */
    public List<MomentActivity> f14299c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Act f14300d;

    /* JADX INFO: renamed from: e */
    public View f14301e;

    /* JADX INFO: renamed from: f */
    public zkg f14302f;

    /* JADX INFO: renamed from: g */
    public l80 f14303g;

    public vu60(Act act, View view, zkg zkgVar, l80 l80Var) {
        this.f14300d = act;
        this.f14301e = view;
        this.f14302f = zkgVar;
        this.f14303g = l80Var;
    }

    /* JADX INFO: renamed from: C */
    public int m15579C() {
        return this.f14299c.size() + 1;
    }

    /* JADX INFO: renamed from: D */
    public View m15580D(ViewGroup viewGroup, int i) {
        if (i == 5) {
            return this.f14301e;
        }
        PhotoAlbumActivitiesView photoAlbumActivitiesView = (PhotoAlbumActivitiesView) this.f14300d.inflater().inflate(o6c0.f11275o5, viewGroup, false);
        this.f14302f.mo5856T0(photoAlbumActivitiesView);
        photoAlbumActivitiesView.m4330P(i);
        return photoAlbumActivitiesView;
    }

    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void m15578A(View view, MomentActivity momentActivity, int i, int i2) {
        if (i <= 4 || i == 6 || i == 7) {
            PhotoAlbumActivitiesView photoAlbumActivitiesView = (PhotoAlbumActivitiesView) view;
            if (i == 6) {
                i = 1;
            }
            photoAlbumActivitiesView.m4312F0(this, momentActivity, i, this.f14302f, i2);
            if (NullChecker.a(this.f14303g)) {
                this.f14303g.m11594h(view, momentActivity, i2);
            }
        }
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public MomentActivity getItem(int i) {
        if (i + 1 == m15579C()) {
            return null;
        }
        return this.f14299c.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m15583G(List<MomentActivity> list) {
        this.f14299c = list;
        this.f14302f.mo5867d0();
        notifyDataSetChanged();
        this.f14302f.mo5854L3();
    }

    /* JADX INFO: renamed from: e */
    public void m15584e(int i) {
        this.f14302f.mo5869e(i);
    }

    public long getItemId(int i) {
        return i;
    }

    public int getItemViewType(int i) {
        List<Media> list;
        if (m15579C() == i + 1) {
            return 5;
        }
        Moment moment = FeedModule.f316d.f14982i0.get(getItem(i).reference.f693id);
        if (moment == null || (list = moment.media) == null) {
            return 0;
        }
        if (list.size() > 0 && (moment.media.get(0) instanceof Video)) {
            return 6;
        }
        if (moment.media.size() <= 0 || !(moment.media.get(0) instanceof Audio)) {
            return Math.min(moment.media.size(), 4);
        }
        return 7;
    }

    public void onViewAttachedToWindow(@NonNull RecyclerView.d0 d0Var) {
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onViewAttachedToWindow(d0Var);
        if (NullChecker.a(this.f14303g)) {
            this.f14303g.m11593g(d0Var.itemView);
        }
    }

    public void onViewDetachedFromWindow(@NonNull RecyclerView.d0 d0Var) {
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onViewDetachedFromWindow(d0Var);
        if (NullChecker.a(this.f14303g)) {
            this.f14303g.m11595i(d0Var.itemView);
        }
    }
}
