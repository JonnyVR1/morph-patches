package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Audio;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentActivity;
import com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumActivitiesView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class b370 extends jic0<MomentActivity> {

    /* JADX INFO: renamed from: c */
    public List<MomentActivity> f74712c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Act f74713d;

    /* JADX INFO: renamed from: e */
    public View f74714e;

    /* JADX INFO: renamed from: f */
    public omg f74715f;

    /* JADX INFO: renamed from: g */
    public h80 f74716g;

    public b370(Act act, View view, omg omgVar, h80 h80Var) {
        this.f74713d = act;
        this.f74714e = view;
        this.f74715f = omgVar;
        this.f74716g = h80Var;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f74712c.size() + 1;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        if (i == 5) {
            return this.f74714e;
        }
        PhotoAlbumActivitiesView photoAlbumActivitiesView = (PhotoAlbumActivitiesView) this.f74713d.inflater().inflate(tec0.f173725o5, viewGroup, false);
        this.f74715f.mo65943T0(photoAlbumActivitiesView);
        photoAlbumActivitiesView.m64496P(i);
        return photoAlbumActivitiesView;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, MomentActivity momentActivity, int i, int i2) {
        if (i <= 4 || i == 6 || i == 7) {
            PhotoAlbumActivitiesView photoAlbumActivitiesView = (PhotoAlbumActivitiesView) view;
            if (i == 6) {
                i = 1;
            }
            photoAlbumActivitiesView.m64478F0(this, momentActivity, i, this.f74715f, i2);
            if (NullChecker.m82486a(this.f74716g)) {
                this.f74716g.m133881h(view, momentActivity, i2);
            }
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public MomentActivity getItem(int i) {
        if (i + 1 == getPageCount()) {
            return null;
        }
        return this.f74712c.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m102275G(List<MomentActivity> list) {
        this.f74712c = list;
        this.f74715f.mo65954d0();
        notifyDataSetChanged();
        this.f74715f.mo65941L3();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: e */
    public void mo48510e(int i) {
        this.f74715f.mo65956e(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        List<Media> list;
        if (getPageCount() == i + 1) {
            return 5;
        }
        Moment moment = FeedModule.f39703d.f121357i0.get(getItem(i).reference.f40080id);
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

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
        super.onViewAttachedToWindow(abstractC0569e0);
        if (NullChecker.m82486a(this.f74716g)) {
            this.f74716g.m133880g(abstractC0569e0.itemView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
        super.onViewDetachedFromWindow(abstractC0569e0);
        if (NullChecker.m82486a(this.f74716g)) {
            this.f74716g.m133882i(abstractC0569e0.itemView);
        }
    }
}
