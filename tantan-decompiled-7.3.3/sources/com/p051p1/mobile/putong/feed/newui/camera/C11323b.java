package com.p051p1.mobile.putong.feed.newui.camera;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.data.Music;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.newui.photoalbum.CommonEmptyView;
import com.p051p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p153l.bnl0;
import p153l.hz10;
import p153l.jic0;
import p153l.jyb;
import p153l.qa00;
import p153l.qcj;
import p153l.tec0;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.b */
/* JADX INFO: loaded from: classes13.dex */
public class C11323b extends jic0 {

    /* JADX INFO: renamed from: c */
    public final Context f40319c;

    /* JADX INFO: renamed from: e */
    public MusicItemView.InterfaceC11314a f40321e;

    /* JADX INFO: renamed from: g */
    public y20<MusicContent> f40323g;

    /* JADX INFO: renamed from: h */
    public String f40324h;

    /* JADX INFO: renamed from: j */
    public hz10 f40326j;

    /* JADX INFO: renamed from: d */
    public List<Music> f40320d = new ArrayList();

    /* JADX INFO: renamed from: f */
    public int f40322f = -1;

    /* JADX INFO: renamed from: i */
    public boolean f40325i = true;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.b$a */
    public class a implements MusicItemView.InterfaceC11314a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ y20 f40327a;

        public a(y20 y20Var) {
            this.f40327a = y20Var;
        }

        @Override // com.p051p1.mobile.putong.feed.newui.camera.MusicItemView.InterfaceC11314a
        /* JADX INFO: renamed from: a */
        public void mo62366a(Music music, int i) {
            C11323b.this.f40326j.m137801u0();
            C11323b.this.f40324h = null;
            if (C11323b.this.m62504U(i)) {
                return;
            }
            C11323b.this.f40322f = i;
        }

        @Override // com.p051p1.mobile.putong.feed.newui.camera.MusicItemView.InterfaceC11314a
        /* JADX INFO: renamed from: b */
        public boolean mo62367b(MusicContent musicContent, int i) {
            boolean z = C11323b.this.f40322f == i;
            if (z) {
                C11323b.this.f40324h = musicContent.f54827id;
                this.f40327a.call(musicContent);
            }
            return z;
        }
    }

    public C11323b(Context context, hz10 hz10Var) {
        this.f40319c = context;
        this.f40326j = hz10Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public boolean m62504U(int i) {
        int i2 = this.f40322f;
        if (i2 == i) {
            return true;
        }
        if (i2 < 0) {
            return false;
        }
        this.f40320d.get(i2).playState = 1;
        notifyItemChanged(this.f40322f);
        return false;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: A */
    public void mo29822A(View view, Object obj, int i, int i2) {
        if (getItemViewType(i2) == 1) {
            ((CommonEmptyView) view).f41669b.setText(m62507N());
            return;
        }
        MusicItemView musicItemView = (MusicItemView) view;
        musicItemView.f40226l = this.f40321e;
        musicItemView.f40225k = new MusicItemView.InterfaceC11315b() { // from class: l.yy10
            @Override // com.p051p1.mobile.putong.feed.newui.camera.MusicItemView.InterfaceC11315b
            /* JADX INFO: renamed from: a */
            public final void mo62368a(MusicContent musicContent, int i3) {
                this.f202072a.m62508O(musicContent, i3);
            }
        };
        musicItemView.m62347L(this.f40320d.get(i2), i2);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f40320d.size() + 1;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        if (i != 1) {
            MusicItemView musicItemView = (MusicItemView) m62505L().inflater().inflate(tec0.f173608X4, viewGroup, false);
            musicItemView.f40228n = this;
            musicItemView.f40231q = viewGroup;
            return musicItemView;
        }
        CommonEmptyView commonEmptyView = (CommonEmptyView) m62505L().inflater().inflate(tec0.f173649e, viewGroup, false);
        bnl0.m105554f0(commonEmptyView, qa00.m175859d(8.0f));
        bnl0.m105548c0(commonEmptyView, qa00.m175859d(120.0f));
        bnl0.m105524M(commonEmptyView.f41668a, false);
        return commonEmptyView;
    }

    /* JADX INFO: renamed from: L */
    public final MusicListAct m62505L() {
        return (MusicListAct) this.f40319c;
    }

    /* JADX INFO: renamed from: M */
    public void m62506M() {
        int i = this.f40322f;
        if (i < 0 || i >= this.f40320d.size()) {
            return;
        }
        this.f40320d.get(this.f40322f).playState = 1;
        notifyItemChanged(this.f40322f);
        this.f40322f = -1;
        this.f40324h = null;
    }

    /* JADX INFO: renamed from: N */
    public final String m62507N() {
        if (this.f40325i) {
            return m62505L().getString(R$string.f39848X0);
        }
        return jyb.m147479J(this.f40320d) ? m62505L().getString(R$string.f40033z1) : m62505L().getString(R$string.f40009v1);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m62508O(MusicContent musicContent, int i) {
        this.f40323g.call(musicContent);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ Boolean m62509P(Music music) {
        return Boolean.valueOf(TextUtils.equals(music.f39629id, this.f40324h));
    }

    /* JADX INFO: renamed from: Q */
    public void m62510Q(y20<MusicContent> y20Var) {
        this.f40321e = new a(y20Var);
    }

    /* JADX INFO: renamed from: R */
    public void m62511R(y20<MusicContent> y20Var) {
        this.f40323g = y20Var;
    }

    /* JADX INFO: renamed from: S */
    public void m62512S(List<Music> list) {
        if (NullChecker.m82486a(this.f40324h) && this.f40322f != -1) {
            Music music = (Music) jyb.m147529r(list, new qcj() { // from class: l.zy10
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f206546a.m62509P((Music) obj);
                }
            });
            if (NullChecker.m82486a(music)) {
                music.playState = 3;
            } else {
                this.f40324h = null;
                this.f40322f = -1;
            }
        }
        this.f40320d = list;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: T */
    public void m62513T() {
        this.f40325i = false;
        notifyDataSetChanged();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: e */
    public void mo48510e(int i) {
        if (jyb.m147479J(this.f40320d) || i <= getItemCount() - 5 || !this.f40325i) {
            return;
        }
        this.f40326j.m137795l0();
    }

    @Override // p153l.jic0
    public Object getItem(int i) {
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i >= this.f40320d.size() ? 1 : 2;
    }
}
