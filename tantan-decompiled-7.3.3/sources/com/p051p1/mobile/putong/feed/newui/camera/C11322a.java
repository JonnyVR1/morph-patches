package com.p051p1.mobile.putong.feed.newui.camera;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.data.Music;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.MusicCategory;
import com.p051p1.mobile.putong.feed.newui.photoalbum.CommonEmptyView;
import com.p051p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p153l.bnl0;
import p153l.jic0;
import p153l.jyb;
import p153l.lbc0;
import p153l.qa00;
import p153l.qcj;
import p153l.tec0;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.a */
/* JADX INFO: loaded from: classes13.dex */
public class C11322a extends jic0<MusicContent> {

    /* JADX INFO: renamed from: c */
    public final Context f40306c;

    /* JADX INFO: renamed from: f */
    public y20<String> f40309f;

    /* JADX INFO: renamed from: g */
    public MusicItemView.InterfaceC11314a f40310g;

    /* JADX INFO: renamed from: i */
    public y20<MusicContent> f40312i;

    /* JADX INFO: renamed from: j */
    public String f40313j;

    /* JADX INFO: renamed from: k */
    public String f40314k;

    /* JADX INFO: renamed from: l */
    public String f40315l;

    /* JADX INFO: renamed from: d */
    public List<MusicCategory> f40307d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public List<Music> f40308e = new ArrayList();

    /* JADX INFO: renamed from: h */
    public int f40311h = -1;

    /* JADX INFO: renamed from: m */
    public boolean f40316m = true;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.a$a */
    public class a implements MusicItemView.InterfaceC11314a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ y20 f40317a;

        public a(y20 y20Var) {
            this.f40317a = y20Var;
        }

        @Override // com.p051p1.mobile.putong.feed.newui.camera.MusicItemView.InterfaceC11314a
        /* JADX INFO: renamed from: a */
        public void mo62366a(Music music, int i) {
            C11322a.this.m62478L().m62313K2();
            C11322a.this.f40315l = null;
            if (C11322a.this.m62495d0(i)) {
                return;
            }
            C11322a.this.f40311h = i;
        }

        @Override // com.p051p1.mobile.putong.feed.newui.camera.MusicItemView.InterfaceC11314a
        /* JADX INFO: renamed from: b */
        public boolean mo62367b(MusicContent musicContent, int i) {
            boolean z = C11322a.this.f40311h == i;
            if (z) {
                C11322a.this.f40315l = musicContent.f54827id;
                this.f40317a.call(musicContent);
            }
            return z;
        }
    }

    public C11322a(Context context) {
        this.f40306c = context;
    }

    /* JADX INFO: renamed from: U */
    private void m62477U(CommonEmptyView commonEmptyView) {
        String string;
        int i = lbc0.f131069j6;
        boolean z = true;
        int i2 = 60;
        int i3 = 0;
        if (m62484R() && jyb.m147479J(this.f40308e)) {
            string = m62478L().getString(R$string.f40003u1);
        } else {
            if (this.f40316m) {
                string = m62478L().getString(R$string.f39848X0);
            } else if (jyb.m147479J(this.f40308e) && m62483Q()) {
                string = m62478L().getString(R$string.f40002u0);
            } else {
                string = m62478L().getString(R$string.f40009v1);
            }
            z = false;
            i2 = 8;
            i3 = 120;
        }
        bnl0.m105524M(commonEmptyView.f41668a, z);
        if (z) {
            commonEmptyView.f41668a.setImageResource(i);
        }
        commonEmptyView.f41669b.setText(string);
        bnl0.m105554f0(commonEmptyView, qa00.m175859d(i2));
        bnl0.m105548c0(commonEmptyView, qa00.m175859d(i3));
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        if (this.f40307d.isEmpty()) {
            return 0;
        }
        return this.f40307d.size() + 3 + this.f40308e.size() + 1 + (m62493b0() ? 1 : 0);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return m62478L().inflater().inflate(tec0.f173620Z4, viewGroup, false);
        }
        if (i == 2) {
            MusicMiddleBarView musicMiddleBarView = (MusicMiddleBarView) m62478L().inflater().inflate(tec0.f173614Y4, viewGroup, false);
            musicMiddleBarView.m62391f(this.f40309f);
            return musicMiddleBarView;
        }
        if (i == 3) {
            MusicItemView musicItemView = (MusicItemView) m62478L().inflater().inflate(tec0.f173608X4, viewGroup, false);
            musicItemView.f40228n = this;
            musicItemView.f40231q = viewGroup;
            return musicItemView;
        }
        if (i == 4) {
            return m62478L().inflater().inflate(tec0.f173602W4, viewGroup, false);
        }
        if (i != 5) {
            return null;
        }
        return m62478L().inflater().inflate(tec0.f173649e, viewGroup, false);
    }

    /* JADX INFO: renamed from: L */
    public final MusicCenterAct m62478L() {
        return (MusicCenterAct) this.f40306c;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, MusicContent musicContent, int i, int i2) {
        int iM62482P = m62482P(i2);
        if (i == 1) {
            ((MusicCategoryView) view).m62286d(this.f40307d.get(iM62482P));
            return;
        }
        if (i == 2) {
            ((MusicMiddleBarView) view).m62393h(iM62482P);
            return;
        }
        if (i != 3) {
            if (i != 5) {
                return;
            }
            m62477U((CommonEmptyView) view);
        } else {
            MusicItemView musicItemView = (MusicItemView) view;
            musicItemView.f40226l = this.f40310g;
            musicItemView.f40225k = new MusicItemView.InterfaceC11315b() { // from class: l.mx10
                @Override // com.p051p1.mobile.putong.feed.newui.camera.MusicItemView.InterfaceC11315b
                /* JADX INFO: renamed from: a */
                public final void mo62368a(MusicContent musicContent2, int i3) {
                    this.f139174a.m62485S(musicContent2, i3);
                }
            };
            musicItemView.m62347L(this.f40308e.get(iM62482P), i2);
        }
    }

    /* JADX INFO: renamed from: N */
    public void m62480N() {
        int i = this.f40311h;
        if (i < 0 || m62482P(i) >= this.f40308e.size()) {
            return;
        }
        this.f40308e.get(m62482P(this.f40311h)).playState = 1;
        notifyItemChanged(this.f40311h);
        this.f40311h = -1;
        this.f40315l = null;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public MusicContent getItem(int i) {
        return null;
    }

    /* JADX INFO: renamed from: P */
    public final int m62482P(int i) {
        if (i < this.f40307d.size()) {
            return i;
        }
        if (i == this.f40307d.size()) {
            return 0;
        }
        return i < m62494c0() ? (i - this.f40307d.size()) - 1 : i - m62494c0();
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m62483Q() {
        return TextUtils.equals(this.f40314k, "fav");
    }

    /* JADX INFO: renamed from: R */
    public final boolean m62484R() {
        return TextUtils.equals(this.f40314k, "local");
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m62485S(MusicContent musicContent, int i) {
        this.f40312i.call(musicContent);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ Boolean m62486T(Music music) {
        return Boolean.valueOf(TextUtils.equals(music.f39629id, this.f40315l));
    }

    /* JADX INFO: renamed from: V */
    public void m62487V(y20<String> y20Var) {
        this.f40309f = y20Var;
    }

    /* JADX INFO: renamed from: W */
    public void m62488W(List<MusicCategory> list) {
        this.f40307d.clear();
        this.f40307d.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: X */
    public void m62489X(y20<MusicContent> y20Var) {
        this.f40310g = new a(y20Var);
    }

    /* JADX INFO: renamed from: Y */
    public void m62490Y(y20<MusicContent> y20Var) {
        this.f40312i = y20Var;
    }

    /* JADX INFO: renamed from: Z */
    public void m62491Z(List<Music> list, String str, String str2) {
        if (!TextUtils.equals(this.f40314k, str2)) {
            this.f40311h = -1;
            this.f40316m = true;
        }
        if (NullChecker.m82486a(this.f40315l) && this.f40311h != -1) {
            Music music = (Music) jyb.m147529r(list, new qcj() { // from class: l.lx10
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f133878a.m62486T((Music) obj);
                }
            });
            if (NullChecker.m82486a(music)) {
                music.playState = 3;
            } else {
                this.f40315l = null;
                this.f40311h = -1;
            }
        }
        this.f40314k = str2;
        this.f40313j = str;
        this.f40308e.clear();
        if (!jyb.m147479J(list)) {
            this.f40308e.addAll(list);
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: a0 */
    public void m62492a0() {
        this.f40316m = false;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m62493b0() {
        return !m62484R() || jyb.m147479J(this.f40308e);
    }

    /* JADX INFO: renamed from: c0 */
    public final int m62494c0() {
        return this.f40307d.size() + 4;
    }

    /* JADX INFO: renamed from: d0 */
    public final boolean m62495d0(int i) {
        int i2 = this.f40311h;
        if (i2 == i) {
            this.f40311h = -1;
            return true;
        }
        if (i2 < 0) {
            return false;
        }
        this.f40308e.get(m62482P(i2)).playState = 1;
        notifyItemChanged(this.f40311h);
        return false;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: e */
    public void mo48510e(int i) {
        if (i > getItemCount() - (m62484R() ? 10 : 5)) {
            m62478L().m62315r2();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void m62496e0(List<Music> list, String str) {
        String str2 = this.f40313j;
        if (str2 == null) {
            return;
        }
        this.f40314k = str;
        m62491Z(list, str2, str);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (i < this.f40307d.size()) {
            return 1;
        }
        if (i == this.f40307d.size()) {
            return 4;
        }
        if (i < m62494c0()) {
            return 2;
        }
        return (m62493b0() && i == getItemCount() - 1) ? 5 : 3;
    }
}
