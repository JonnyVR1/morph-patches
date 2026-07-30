package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C0601g;
import com.p046p1.mobile.putong.data.Music;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.camera.MusicAggregateAct;
import com.p046p1.mobile.putong.feed.newui.camera.MusicAggregateHeader;
import com.p046p1.mobile.putong.feed.newui.camera.MusicAggregateItemView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.CommonEmptyView;
import com.p046p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class jn10 extends dac0<MusicContent> {

    /* JADX INFO: renamed from: c */
    public final Context f118744c;

    /* JADX INFO: renamed from: f */
    public Music f118747f;

    /* JADX INFO: renamed from: g */
    public e30<MusicContent> f118748g;

    /* JADX INFO: renamed from: i */
    public io10 f118750i;

    /* JADX INFO: renamed from: j */
    public dnr f118751j;

    /* JADX INFO: renamed from: d */
    public List<Moment> f118745d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public List<Moment> f118746e = new ArrayList();

    /* JADX INFO: renamed from: h */
    public boolean f118749h = true;

    /* JADX INFO: renamed from: l.jn10$a */
    public class C17818a extends C0601g.b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f118752a;

        public C17818a(List list) {
            this.f118752a = list;
        }

        @Override // androidx.recyclerview.widget.C0601g.b
        /* JADX INFO: renamed from: a */
        public boolean mo3645a(int i, int i2) {
            return ((Moment) jn10.this.f118746e.get(i)).f56011id.equals(((Moment) this.f118752a.get(i2)).f56011id);
        }

        @Override // androidx.recyclerview.widget.C0601g.b
        /* JADX INFO: renamed from: b */
        public boolean mo3646b(int i, int i2) {
            return ((Moment) jn10.this.f118746e.get(i)).f56011id.equals(((Moment) this.f118752a.get(i2)).f56011id);
        }

        @Override // androidx.recyclerview.widget.C0601g.b
        /* JADX INFO: renamed from: d */
        public int mo3648d() {
            return this.f118752a.size();
        }

        @Override // androidx.recyclerview.widget.C0601g.b
        /* JADX INFO: renamed from: e */
        public int mo3649e() {
            return jn10.this.f118746e.size();
        }
    }

    /* JADX INFO: renamed from: l.jn10$b */
    public class C17819b implements dnr {
        public C17819b() {
        }

        @Override // p149l.dnr
        /* JADX INFO: renamed from: a */
        public void mo3631a(int i, int i2, Object obj) {
            jn10.this.notifyItemRangeChanged(i + 1, i2, obj);
        }

        @Override // p149l.dnr
        /* JADX INFO: renamed from: b */
        public void mo3632b(int i, int i2) {
            jn10.this.notifyItemRangeInserted(i + 1, i2);
        }

        @Override // p149l.dnr
        /* JADX INFO: renamed from: c */
        public void mo3633c(int i, int i2) {
            jn10.this.notifyItemRangeRemoved(i + 1, i2);
        }

        @Override // p149l.dnr
        /* JADX INFO: renamed from: d */
        public void mo3634d(int i, int i2) {
            jn10.this.notifyItemMoved(i + 1, i2 + 1);
        }
    }

    public jn10(Context context, io10 io10Var) {
        this.f118744c = context;
        this.f118750i = io10Var;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f118745d.size() + 2;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return m142249H().inflater().inflate(o6c0.f142121U4, viewGroup, false);
        }
        return i == 3 ? m142249H().inflater().inflate(o6c0.f142180e, viewGroup, false) : m142249H().inflater().inflate(o6c0.f142127V4, viewGroup, false);
    }

    /* JADX INFO: renamed from: H */
    public final MusicAggregateAct m142249H() {
        return (MusicAggregateAct) this.f118744c;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, MusicContent musicContent, int i, int i2) {
        if (i == 1) {
            MusicAggregateHeader musicAggregateHeader = (MusicAggregateHeader) view;
            musicAggregateHeader.f39351i = this.f118748g;
            musicAggregateHeader.f39350h = this;
            musicAggregateHeader.m61091r(this.f118747f);
            return;
        }
        if (getItemViewType(i2) == 3 && (view instanceof CommonEmptyView)) {
            m142256O((CommonEmptyView) view);
        } else {
            if (i2 <= 0 || !(view instanceof MusicAggregateItemView)) {
                return;
            }
            ((MusicAggregateItemView) view).m61098e(this.f118745d.get(i2 - 1));
        }
    }

    /* JADX INFO: renamed from: J */
    public void m142251J(final Moment moment) {
        if (vwb.m200322e0(this.f118745d, new w9j() { // from class: l.in10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Moment moment2 = (Moment) obj;
                return Boolean.valueOf(NullChecker.m81304b(moment2) && TextUtils.equals(moment2.f56011id, moment.f56011id));
            }
        })) {
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: K */
    public void m142252K(final Music music, e30<MusicContent> e30Var) {
        mo67374c(m142249H(), FeedModule.f38853b.m60516b2(music)).filter(new w9j() { // from class: l.hn10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f108523a.m142254M(music, (MusicContent) obj);
            }
        }).subscribe(e30Var);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public MusicContent getItem(int i) {
        return null;
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ Boolean m142254M(Music music, MusicContent musicContent) {
        boolean z = false;
        if (musicContent == null) {
            m142249H().m61073z2(false);
        }
        if (musicContent != null && TextUtils.equals(music.f38781id, musicContent.f53979id)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: N */
    public void m142255N() {
        this.f118749h = false;
        notifyItemChanged(getItemCount() - 1);
    }

    /* JADX INFO: renamed from: O */
    public final void m142256O(CommonEmptyView commonEmptyView) {
        String string;
        int i = f3c0.f94535h6;
        int i2 = 8;
        int i3 = 120;
        boolean z = false;
        if (this.f118749h) {
            string = m142249H().getString(R$string.f39000X0);
        } else if (vwb.m200296J(this.f118745d)) {
            string = m142249H().getString(R$string.f39099l4);
            i = f3c0.f94567l6;
            i2 = 60;
            i3 = 0;
            z = true;
        } else {
            string = m142249H().getString(R$string.f39167w1);
        }
        xdl0.m208344M(commonEmptyView.f40820a, z);
        if (z) {
            commonEmptyView.f40820a.setImageResource(i);
        }
        commonEmptyView.f40821b.setText(string);
        xdl0.m208374f0(commonEmptyView, t100.m186890d(i2));
        xdl0.m208368c0(commonEmptyView, t100.m186890d(i3));
    }

    /* JADX INFO: renamed from: P */
    public void m142257P(List<Moment> list) {
        List<Moment> list2 = this.f118745d;
        if (list2 == null || list2.size() <= 0) {
            this.f118745d.addAll(list);
            notifyDataSetChanged();
            return;
        }
        this.f118746e = this.f118745d;
        C0601g.e eVarM3681c = C0601g.m3681c(new C17818a(list), true);
        if (this.f118751j == null) {
            this.f118751j = new C17819b();
        }
        eVarM3681c.m3693c(this.f118751j);
        this.f118745d.clear();
        this.f118745d.addAll(list);
    }

    /* JADX INFO: renamed from: Q */
    public void m142258Q(Music music) {
        if (NullChecker.m81303a(this.f118747f)) {
            return;
        }
        this.f118747f = music;
        notifyItemChanged(0);
    }

    /* JADX INFO: renamed from: R */
    public void m142259R(e30<MusicContent> e30Var) {
        this.f118748g = e30Var;
    }

    /* JADX INFO: renamed from: S */
    public void m142260S() {
        this.f118747f.playState = 1;
        notifyItemChanged(0);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: e */
    public void mo47327e(int i) {
        if (this.f118745d.size() <= 0 || i <= getItemCount() - 5 || !this.f118749h) {
            return;
        }
        this.f118750i.m137281u0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (i == 0) {
            return 1;
        }
        return i >= this.f118745d.size() + 1 ? 3 : 2;
    }
}
