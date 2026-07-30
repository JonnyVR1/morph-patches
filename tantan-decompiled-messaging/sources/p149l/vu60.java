package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Audio;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentActivity;
import com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumActivitiesView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class vu60 extends dac0<MomentActivity> {

    /* JADX INFO: renamed from: c */
    public List<MomentActivity> f183032c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Act f183033d;

    /* JADX INFO: renamed from: e */
    public View f183034e;

    /* JADX INFO: renamed from: f */
    public zkg f183035f;

    /* JADX INFO: renamed from: g */
    public l80 f183036g;

    public vu60(Act act, View view, zkg zkgVar, l80 l80Var) {
        this.f183033d = act;
        this.f183034e = view;
        this.f183035f = zkgVar;
        this.f183036g = l80Var;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f183032c.size() + 1;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        if (i == 5) {
            return this.f183034e;
        }
        PhotoAlbumActivitiesView photoAlbumActivitiesView = (PhotoAlbumActivitiesView) this.f183033d.inflater().inflate(o6c0.f142256o5, viewGroup, false);
        this.f183035f.mo64760T0(photoAlbumActivitiesView);
        photoAlbumActivitiesView.m63313P(i);
        return photoAlbumActivitiesView;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, MomentActivity momentActivity, int i, int i2) {
        if (i <= 4 || i == 6 || i == 7) {
            PhotoAlbumActivitiesView photoAlbumActivitiesView = (PhotoAlbumActivitiesView) view;
            if (i == 6) {
                i = 1;
            }
            photoAlbumActivitiesView.m63295F0(this, momentActivity, i, this.f183035f, i2);
            if (NullChecker.m81303a(this.f183036g)) {
                this.f183036g.m148839h(view, momentActivity, i2);
            }
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public MomentActivity getItem(int i) {
        if (i + 1 == getPageCount()) {
            return null;
        }
        return this.f183032c.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m200064G(List<MomentActivity> list) {
        this.f183032c = list;
        this.f183035f.mo64771d0();
        notifyDataSetChanged();
        this.f183035f.mo64758L3();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: e */
    public void mo47327e(int i) {
        this.f183035f.mo64773e(i);
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
        Moment moment = FeedModule.f38855d.f193047i0.get(getItem(i).reference.f39232id);
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
    public void onViewAttachedToWindow(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
        super.onViewAttachedToWindow(abstractC0566d0);
        if (NullChecker.m81303a(this.f183036g)) {
            this.f183036g.m148838g(abstractC0566d0.itemView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
        super.onViewDetachedFromWindow(abstractC0566d0);
        if (NullChecker.m81303a(this.f183036g)) {
            this.f183036g.m148840i(abstractC0566d0.itemView);
        }
    }
}
