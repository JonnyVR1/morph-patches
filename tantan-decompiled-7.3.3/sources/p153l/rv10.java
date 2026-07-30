package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C0603g;
import com.p051p1.mobile.putong.data.Music;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.camera.MusicAggregateAct;
import com.p051p1.mobile.putong.feed.newui.camera.MusicAggregateHeader;
import com.p051p1.mobile.putong.feed.newui.camera.MusicAggregateItemView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.CommonEmptyView;
import com.p051p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class rv10 extends jic0<MusicContent> {

    /* JADX INFO: renamed from: c */
    public final Context f164955c;

    /* JADX INFO: renamed from: f */
    public Music f164958f;

    /* JADX INFO: renamed from: g */
    public y20<MusicContent> f164959g;

    /* JADX INFO: renamed from: i */
    public qw10 f164961i;

    /* JADX INFO: renamed from: j */
    public epr f164962j;

    /* JADX INFO: renamed from: d */
    public List<Moment> f164956d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public List<Moment> f164957e = new ArrayList();

    /* JADX INFO: renamed from: h */
    public boolean f164960h = true;

    /* JADX INFO: renamed from: l.rv10$a */
    public class C19915a extends C0603g.b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f164963a;

        public C19915a(List list) {
            this.f164963a = list;
        }

        @Override // androidx.recyclerview.widget.C0603g.b
        /* JADX INFO: renamed from: a */
        public boolean mo3646a(int i, int i2) {
            return ((Moment) rv10.this.f164957e.get(i)).f56859id.equals(((Moment) this.f164963a.get(i2)).f56859id);
        }

        @Override // androidx.recyclerview.widget.C0603g.b
        /* JADX INFO: renamed from: b */
        public boolean mo3647b(int i, int i2) {
            return ((Moment) rv10.this.f164957e.get(i)).f56859id.equals(((Moment) this.f164963a.get(i2)).f56859id);
        }

        @Override // androidx.recyclerview.widget.C0603g.b
        /* JADX INFO: renamed from: d */
        public int mo3649d() {
            return this.f164963a.size();
        }

        @Override // androidx.recyclerview.widget.C0603g.b
        /* JADX INFO: renamed from: e */
        public int mo3650e() {
            return rv10.this.f164957e.size();
        }
    }

    /* JADX INFO: renamed from: l.rv10$b */
    public class C19916b implements epr {
        public C19916b() {
        }

        @Override // p153l.epr
        /* JADX INFO: renamed from: a */
        public void mo3632a(int i, int i2, Object obj) {
            rv10.this.notifyItemRangeChanged(i + 1, i2, obj);
        }

        @Override // p153l.epr
        /* JADX INFO: renamed from: b */
        public void mo3633b(int i, int i2) {
            rv10.this.notifyItemRangeInserted(i + 1, i2);
        }

        @Override // p153l.epr
        /* JADX INFO: renamed from: c */
        public void mo3634c(int i, int i2) {
            rv10.this.notifyItemRangeRemoved(i + 1, i2);
        }

        @Override // p153l.epr
        /* JADX INFO: renamed from: d */
        public void mo3635d(int i, int i2) {
            rv10.this.notifyItemMoved(i + 1, i2 + 1);
        }
    }

    public rv10(Context context, qw10 qw10Var) {
        this.f164955c = context;
        this.f164961i = qw10Var;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f164956d.size() + 2;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return m183238H().inflater().inflate(tec0.f173590U4, viewGroup, false);
        }
        return i == 3 ? m183238H().inflater().inflate(tec0.f173649e, viewGroup, false) : m183238H().inflater().inflate(tec0.f173596V4, viewGroup, false);
    }

    /* JADX INFO: renamed from: H */
    public final MusicAggregateAct m183238H() {
        return (MusicAggregateAct) this.f164955c;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, MusicContent musicContent, int i, int i2) {
        if (i == 1) {
            MusicAggregateHeader musicAggregateHeader = (MusicAggregateHeader) view;
            musicAggregateHeader.f40199i = this.f164959g;
            musicAggregateHeader.f40198h = this;
            musicAggregateHeader.m62275r(this.f164958f);
            return;
        }
        if (getItemViewType(i2) == 3 && (view instanceof CommonEmptyView)) {
            m183245O((CommonEmptyView) view);
        } else {
            if (i2 <= 0 || !(view instanceof MusicAggregateItemView)) {
                return;
            }
            ((MusicAggregateItemView) view).m62282e(this.f164956d.get(i2 - 1));
        }
    }

    /* JADX INFO: renamed from: J */
    public void m183240J(final Moment moment) {
        if (jyb.m147505e0(this.f164956d, new qcj() { // from class: l.qv10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Moment moment2 = (Moment) obj;
                return Boolean.valueOf(NullChecker.m82487b(moment2) && TextUtils.equals(moment2.f56859id, moment.f56859id));
            }
        })) {
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: K */
    public void m183241K(final Music music, y20<MusicContent> y20Var) {
        mo68557c(m183238H(), FeedModule.f39701b.m61700b2(music)).filter(new qcj() { // from class: l.pv10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f154259a.m183243M(music, (MusicContent) obj);
            }
        }).subscribe(y20Var);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public MusicContent getItem(int i) {
        return null;
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ Boolean m183243M(Music music, MusicContent musicContent) {
        boolean z = false;
        if (musicContent == null) {
            m183238H().m62242A2(false);
        }
        if (musicContent != null && TextUtils.equals(music.f39629id, musicContent.f54827id)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: N */
    public void m183244N() {
        this.f164960h = false;
        notifyItemChanged(getItemCount() - 1);
    }

    /* JADX INFO: renamed from: O */
    public final void m183245O(CommonEmptyView commonEmptyView) {
        String string;
        int i = lbc0.f131053h6;
        int i2 = 8;
        int i3 = 120;
        boolean z = false;
        if (this.f164960h) {
            string = m183238H().getString(R$string.f39848X0);
        } else if (jyb.m147479J(this.f164956d)) {
            string = m183238H().getString(R$string.f39947l4);
            i = lbc0.f131085l6;
            i2 = 60;
            i3 = 0;
            z = true;
        } else {
            string = m183238H().getString(R$string.f40015w1);
        }
        bnl0.m105524M(commonEmptyView.f41668a, z);
        if (z) {
            commonEmptyView.f41668a.setImageResource(i);
        }
        commonEmptyView.f41669b.setText(string);
        bnl0.m105554f0(commonEmptyView, qa00.m175859d(i2));
        bnl0.m105548c0(commonEmptyView, qa00.m175859d(i3));
    }

    /* JADX INFO: renamed from: P */
    public void m183246P(List<Moment> list) {
        List<Moment> list2 = this.f164956d;
        if (list2 == null || list2.size() <= 0) {
            this.f164956d.addAll(list);
            notifyDataSetChanged();
            return;
        }
        this.f164957e = this.f164956d;
        C0603g.e eVarM3682c = C0603g.m3682c(new C19915a(list), true);
        if (this.f164962j == null) {
            this.f164962j = new C19916b();
        }
        eVarM3682c.m3694c(this.f164962j);
        this.f164956d.clear();
        this.f164956d.addAll(list);
    }

    /* JADX INFO: renamed from: Q */
    public void m183247Q(Music music) {
        if (NullChecker.m82486a(this.f164958f)) {
            return;
        }
        this.f164958f = music;
        notifyItemChanged(0);
    }

    /* JADX INFO: renamed from: R */
    public void m183248R(y20<MusicContent> y20Var) {
        this.f164959g = y20Var;
    }

    /* JADX INFO: renamed from: S */
    public void m183249S() {
        this.f164958f.playState = 1;
        notifyItemChanged(0);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: e */
    public void mo48510e(int i) {
        if (this.f164956d.size() <= 0 || i <= getItemCount() - 5 || !this.f164960h) {
            return;
        }
        this.f164961i.m178446u0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (i == 0) {
            return 1;
        }
        return i >= this.f164956d.size() + 1 ? 3 : 2;
    }
}
