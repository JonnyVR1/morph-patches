package p007l;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.g;
import com.p000p1.mobile.putong.data.Music;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.camera.MusicAggregateAct;
import com.p000p1.mobile.putong.feed.newui.camera.MusicAggregateHeader;
import com.p000p1.mobile.putong.feed.newui.camera.MusicAggregateItemView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.CommonEmptyView;
import com.p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.dnr;
import l.e30;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class jn10 extends dac0<MusicContent> {

    /* JADX INFO: renamed from: c */
    public final Context f9444c;

    /* JADX INFO: renamed from: f */
    public Music f9447f;

    /* JADX INFO: renamed from: g */
    public e30<MusicContent> f9448g;

    /* JADX INFO: renamed from: i */
    public io10 f9450i;

    /* JADX INFO: renamed from: j */
    public dnr f9451j;

    /* JADX INFO: renamed from: d */
    public List<Moment> f9445d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public List<Moment> f9446e = new ArrayList();

    /* JADX INFO: renamed from: h */
    public boolean f9449h = true;

    /* JADX INFO: renamed from: l.jn10$a */
    public class C2405a extends g.b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f9452a;

        public C2405a(List list) {
            this.f9452a = list;
        }

        /* JADX INFO: renamed from: a */
        public boolean m11254a(int i, int i2) {
            return ((DbObject) ((Moment) jn10.this.f9446e.get(i))).id.equals(((DbObject) ((Moment) this.f9452a.get(i2))).id);
        }

        /* JADX INFO: renamed from: b */
        public boolean m11255b(int i, int i2) {
            return ((DbObject) ((Moment) jn10.this.f9446e.get(i))).id.equals(((DbObject) ((Moment) this.f9452a.get(i2))).id);
        }

        /* JADX INFO: renamed from: d */
        public int m11256d() {
            return this.f9452a.size();
        }

        /* JADX INFO: renamed from: e */
        public int m11257e() {
            return jn10.this.f9446e.size();
        }
    }

    /* JADX INFO: renamed from: l.jn10$b */
    public class C2406b implements dnr {
        public C2406b() {
        }

        /* JADX INFO: renamed from: a */
        public void m11258a(int i, int i2, Object obj) {
            jn10.this.notifyItemRangeChanged(i + 1, i2, obj);
        }

        /* JADX INFO: renamed from: b */
        public void m11259b(int i, int i2) {
            jn10.this.notifyItemRangeInserted(i + 1, i2);
        }

        /* JADX INFO: renamed from: c */
        public void m11260c(int i, int i2) {
            jn10.this.notifyItemRangeRemoved(i + 1, i2);
        }

        /* JADX INFO: renamed from: d */
        public void m11261d(int i, int i2) {
            jn10.this.notifyItemMoved(i + 1, i2 + 1);
        }
    }

    public jn10(Context context, io10 io10Var) {
        this.f9444c = context;
        this.f9450i = io10Var;
    }

    /* JADX INFO: renamed from: C */
    public int m11239C() {
        return this.f9445d.size() + 2;
    }

    /* JADX INFO: renamed from: D */
    public View m11240D(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return m11241H().inflater().inflate(o6c0.f11140U4, viewGroup, false);
        }
        return i == 3 ? m11241H().inflater().inflate(o6c0.f11199e, viewGroup, false) : m11241H().inflater().inflate(o6c0.f11146V4, viewGroup, false);
    }

    /* JADX INFO: renamed from: H */
    public final MusicAggregateAct m11241H() {
        return (MusicAggregateAct) this.f9444c;
    }

    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void m11238A(View view, MusicContent musicContent, int i, int i2) {
        if (i == 1) {
            MusicAggregateHeader musicAggregateHeader = (MusicAggregateHeader) view;
            musicAggregateHeader.f812i = this.f9448g;
            musicAggregateHeader.f811h = this;
            musicAggregateHeader.m2024r(this.f9447f);
            return;
        }
        if (getItemViewType(i2) == 3 && (view instanceof CommonEmptyView)) {
            m11248O((CommonEmptyView) view);
        } else {
            if (i2 <= 0 || !(view instanceof MusicAggregateItemView)) {
                return;
            }
            ((MusicAggregateItemView) view).m2031e(this.f9445d.get(i2 - 1));
        }
    }

    /* JADX INFO: renamed from: J */
    public void m11243J(final Moment moment) {
        if (vwb.e0(this.f9445d, new w9j() { // from class: l.in10
            public final Object call(Object obj) {
                Moment moment2 = (Moment) obj;
                return Boolean.valueOf(NullChecker.b(moment2) && TextUtils.equals(((DbObject) moment2).id, ((DbObject) moment).id));
            }
        })) {
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: K */
    public void m11244K(final Music music, e30<MusicContent> e30Var) {
        c(m11241H(), FeedModule.f314b.m1442b2(music)).filter(new w9j() { // from class: l.hn10
            public final Object call(Object obj) {
                return this.f8776a.m11246M(music, (MusicContent) obj);
            }
        }).subscribe(e30Var);
    }

    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public MusicContent getItem(int i) {
        return null;
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ Boolean m11246M(Music music, MusicContent musicContent) {
        boolean z = false;
        if (musicContent == null) {
            m11241H().m2005z2(false);
        }
        if (musicContent != null && TextUtils.equals(music.f242id, musicContent.id)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: N */
    public void m11247N() {
        this.f9449h = false;
        notifyItemChanged(getItemCount() - 1);
    }

    /* JADX INFO: renamed from: O */
    public final void m11248O(CommonEmptyView commonEmptyView) {
        String string;
        int i = f3c0.f7818h6;
        int i2 = 8;
        int i3 = 120;
        boolean z = false;
        if (this.f9449h) {
            string = m11241H().getString(R$string.f461X0);
        } else if (vwb.J(this.f9445d)) {
            string = m11241H().getString(R$string.f560l4);
            i = f3c0.f7850l6;
            i2 = 60;
            i3 = 0;
            z = true;
        } else {
            string = m11241H().getString(R$string.f628w1);
        }
        xdl0.M(commonEmptyView.f2281a, z);
        if (z) {
            commonEmptyView.f2281a.setImageResource(i);
        }
        commonEmptyView.f2282b.setText(string);
        xdl0.f0(commonEmptyView, t100.d(i2));
        xdl0.c0(commonEmptyView, t100.d(i3));
    }

    /* JADX INFO: renamed from: P */
    public void m11249P(List<Moment> list) {
        List<Moment> list2 = this.f9445d;
        if (list2 == null || list2.size() <= 0) {
            this.f9445d.addAll(list);
            notifyDataSetChanged();
            return;
        }
        this.f9446e = this.f9445d;
        g.e eVarC = g.c(new C2405a(list), true);
        if (this.f9451j == null) {
            this.f9451j = new C2406b();
        }
        eVarC.c(this.f9451j);
        this.f9445d.clear();
        this.f9445d.addAll(list);
    }

    /* JADX INFO: renamed from: Q */
    public void m11250Q(Music music) {
        if (NullChecker.a(this.f9447f)) {
            return;
        }
        this.f9447f = music;
        notifyItemChanged(0);
    }

    /* JADX INFO: renamed from: R */
    public void m11251R(e30<MusicContent> e30Var) {
        this.f9448g = e30Var;
    }

    /* JADX INFO: renamed from: S */
    public void m11252S() {
        this.f9447f.playState = 1;
        notifyItemChanged(0);
    }

    /* JADX INFO: renamed from: e */
    public void m11253e(int i) {
        if (this.f9445d.size() <= 0 || i <= getItemCount() - 5 || !this.f9449h) {
            return;
        }
        this.f9450i.m11019u0();
    }

    public int getItemViewType(int i) {
        if (i == 0) {
            return 1;
        }
        return i >= this.f9445d.size() + 1 ? 3 : 2;
    }
}
