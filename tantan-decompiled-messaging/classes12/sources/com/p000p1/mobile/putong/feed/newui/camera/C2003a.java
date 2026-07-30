package com.p000p1.mobile.putong.feed.newui.camera;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.data.Music;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.MusicCategory;
import com.p000p1.mobile.putong.feed.newui.photoalbum.CommonEmptyView;
import com.p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.e30;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import p007l.f3c0;
import p007l.o6c0;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class C2003a extends dac0<MusicContent> {

    /* JADX INFO: renamed from: c */
    public final Context f919c;

    /* JADX INFO: renamed from: f */
    public e30<String> f922f;

    /* JADX INFO: renamed from: g */
    public MusicItemView.InterfaceC1995a f923g;

    /* JADX INFO: renamed from: i */
    public e30<MusicContent> f925i;

    /* JADX INFO: renamed from: j */
    public String f926j;

    /* JADX INFO: renamed from: k */
    public String f927k;

    /* JADX INFO: renamed from: l */
    public String f928l;

    /* JADX INFO: renamed from: d */
    public List<MusicCategory> f920d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public List<Music> f921e = new ArrayList();

    /* JADX INFO: renamed from: h */
    public int f924h = -1;

    /* JADX INFO: renamed from: m */
    public boolean f929m = true;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.a$a */
    public class a implements MusicItemView.InterfaceC1995a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ e30 f930a;

        public a(e30 e30Var) {
            this.f930a = e30Var;
        }

        @Override // com.p000p1.mobile.putong.feed.newui.camera.MusicItemView.InterfaceC1995a
        /* JADX INFO: renamed from: a */
        public void mo2116a(Music music, int i) {
            C2003a.this.m2238L().m2062I2();
            C2003a.this.f928l = null;
            if (C2003a.this.m2255d0(i)) {
                return;
            }
            C2003a.this.f924h = i;
        }

        @Override // com.p000p1.mobile.putong.feed.newui.camera.MusicItemView.InterfaceC1995a
        /* JADX INFO: renamed from: b */
        public boolean mo2117b(MusicContent musicContent, int i) {
            boolean z = C2003a.this.f924h == i;
            if (z) {
                C2003a.this.f928l = musicContent.id;
                this.f930a.call(musicContent);
            }
            return z;
        }
    }

    public C2003a(Context context) {
        this.f919c = context;
    }

    /* JADX INFO: renamed from: U */
    private void m2234U(CommonEmptyView commonEmptyView) {
        String string;
        int i = f3c0.f7834j6;
        boolean z = true;
        int i2 = 60;
        int i3 = 0;
        if (m2244R() && vwb.J(this.f921e)) {
            string = m2238L().getString(R$string.f616u1);
        } else {
            if (this.f929m) {
                string = m2238L().getString(R$string.f461X0);
            } else if (vwb.J(this.f921e) && m2243Q()) {
                string = m2238L().getString(R$string.f615u0);
            } else {
                string = m2238L().getString(R$string.f622v1);
            }
            z = false;
            i2 = 8;
            i3 = 120;
        }
        xdl0.M(commonEmptyView.f2281a, z);
        if (z) {
            commonEmptyView.f2281a.setImageResource(i);
        }
        commonEmptyView.f2282b.setText(string);
        xdl0.f0(commonEmptyView, t100.d(i2));
        xdl0.c0(commonEmptyView, t100.d(i3));
    }

    /* JADX INFO: renamed from: C */
    public int m2236C() {
        if (this.f920d.isEmpty()) {
            return 0;
        }
        return this.f920d.size() + 3 + this.f921e.size() + 1 + (m2253b0() ? 1 : 0);
    }

    /* JADX INFO: renamed from: D */
    public View m2237D(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return m2238L().inflater().inflate(o6c0.f11170Z4, viewGroup, false);
        }
        if (i == 2) {
            MusicMiddleBarView musicMiddleBarView = (MusicMiddleBarView) m2238L().inflater().inflate(o6c0.f11164Y4, viewGroup, false);
            musicMiddleBarView.m2143f(this.f922f);
            return musicMiddleBarView;
        }
        if (i == 3) {
            MusicItemView musicItemView = (MusicItemView) m2238L().inflater().inflate(o6c0.f11158X4, viewGroup, false);
            musicItemView.f841n = this;
            musicItemView.f844q = viewGroup;
            return musicItemView;
        }
        if (i == 4) {
            return m2238L().inflater().inflate(o6c0.f11152W4, viewGroup, false);
        }
        if (i != 5) {
            return null;
        }
        return m2238L().inflater().inflate(o6c0.f11199e, viewGroup, false);
    }

    /* JADX INFO: renamed from: L */
    public final MusicCenterAct m2238L() {
        return (MusicCenterAct) this.f919c;
    }

    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public void m2235A(View view, MusicContent musicContent, int i, int i2) {
        int iM2242P = m2242P(i2);
        if (i == 1) {
            ((MusicCategoryView) view).m2035d(this.f920d.get(iM2242P));
            return;
        }
        if (i == 2) {
            ((MusicMiddleBarView) view).m2145h(iM2242P);
            return;
        }
        if (i != 3) {
            if (i != 5) {
                return;
            }
            m2234U((CommonEmptyView) view);
        } else {
            MusicItemView musicItemView = (MusicItemView) view;
            musicItemView.f839l = this.f923g;
            musicItemView.f838k = new MusicItemView.InterfaceC1996b() { // from class: l.ep10
                @Override // com.p000p1.mobile.putong.feed.newui.camera.MusicItemView.InterfaceC1996b
                /* JADX INFO: renamed from: a */
                public final void mo2118a(MusicContent musicContent2, int i3) {
                    this.f7450a.m2245S(musicContent2, i3);
                }
            };
            musicItemView.m2097L(this.f921e.get(iM2242P), i2);
        }
    }

    /* JADX INFO: renamed from: N */
    public void m2240N() {
        int i = this.f924h;
        if (i < 0 || m2242P(i) >= this.f921e.size()) {
            return;
        }
        this.f921e.get(m2242P(this.f924h)).playState = 1;
        notifyItemChanged(this.f924h);
        this.f924h = -1;
        this.f928l = null;
    }

    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public MusicContent getItem(int i) {
        return null;
    }

    /* JADX INFO: renamed from: P */
    public final int m2242P(int i) {
        if (i < this.f920d.size()) {
            return i;
        }
        if (i == this.f920d.size()) {
            return 0;
        }
        return i < m2254c0() ? (i - this.f920d.size()) - 1 : i - m2254c0();
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m2243Q() {
        return TextUtils.equals(this.f927k, "fav");
    }

    /* JADX INFO: renamed from: R */
    public final boolean m2244R() {
        return TextUtils.equals(this.f927k, "local");
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m2245S(MusicContent musicContent, int i) {
        this.f925i.call(musicContent);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ Boolean m2246T(Music music) {
        return Boolean.valueOf(TextUtils.equals(music.f242id, this.f928l));
    }

    /* JADX INFO: renamed from: V */
    public void m2247V(e30<String> e30Var) {
        this.f922f = e30Var;
    }

    /* JADX INFO: renamed from: W */
    public void m2248W(List<MusicCategory> list) {
        this.f920d.clear();
        this.f920d.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: X */
    public void m2249X(e30<MusicContent> e30Var) {
        this.f923g = new a(e30Var);
    }

    /* JADX INFO: renamed from: Y */
    public void m2250Y(e30<MusicContent> e30Var) {
        this.f925i = e30Var;
    }

    /* JADX INFO: renamed from: Z */
    public void m2251Z(List<Music> list, String str, String str2) {
        if (!TextUtils.equals(this.f927k, str2)) {
            this.f924h = -1;
            this.f929m = true;
        }
        if (NullChecker.a(this.f928l) && this.f924h != -1) {
            Music music = (Music) vwb.r(list, new w9j() { // from class: l.dp10
                public final Object call(Object obj) {
                    return this.f7020a.m2246T((Music) obj);
                }
            });
            if (NullChecker.a(music)) {
                music.playState = 3;
            } else {
                this.f928l = null;
                this.f924h = -1;
            }
        }
        this.f927k = str2;
        this.f926j = str;
        this.f921e.clear();
        if (!vwb.J(list)) {
            this.f921e.addAll(list);
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: a0 */
    public void m2252a0() {
        this.f929m = false;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m2253b0() {
        return !m2244R() || vwb.J(this.f921e);
    }

    /* JADX INFO: renamed from: c0 */
    public final int m2254c0() {
        return this.f920d.size() + 4;
    }

    /* JADX INFO: renamed from: d0 */
    public final boolean m2255d0(int i) {
        int i2 = this.f924h;
        if (i2 == i) {
            this.f924h = -1;
            return true;
        }
        if (i2 < 0) {
            return false;
        }
        this.f921e.get(m2242P(i2)).playState = 1;
        notifyItemChanged(this.f924h);
        return false;
    }

    /* JADX INFO: renamed from: e */
    public void m2256e(int i) {
        if (i > getItemCount() - (m2244R() ? 10 : 5)) {
            m2238L().m2064q2();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void m2257e0(List<Music> list, String str) {
        String str2 = this.f926j;
        if (str2 == null) {
            return;
        }
        this.f927k = str;
        m2251Z(list, str2, str);
    }

    public int getItemViewType(int i) {
        if (i < this.f920d.size()) {
            return 1;
        }
        if (i == this.f920d.size()) {
            return 4;
        }
        if (i < m2254c0()) {
            return 2;
        }
        return (m2253b0() && i == getItemCount() - 1) ? 5 : 3;
    }
}
