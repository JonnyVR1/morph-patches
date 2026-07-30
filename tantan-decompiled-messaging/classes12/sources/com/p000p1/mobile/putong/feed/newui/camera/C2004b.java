package com.p000p1.mobile.putong.feed.newui.camera;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.data.Music;
import com.p000p1.mobile.putong.feed.R$string;
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
import p007l.o6c0;
import p007l.zq10;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class C2004b extends dac0 {

    /* JADX INFO: renamed from: c */
    public final Context f932c;

    /* JADX INFO: renamed from: e */
    public MusicItemView.InterfaceC1995a f934e;

    /* JADX INFO: renamed from: g */
    public e30<MusicContent> f936g;

    /* JADX INFO: renamed from: h */
    public String f937h;

    /* JADX INFO: renamed from: j */
    public zq10 f939j;

    /* JADX INFO: renamed from: d */
    public List<Music> f933d = new ArrayList();

    /* JADX INFO: renamed from: f */
    public int f935f = -1;

    /* JADX INFO: renamed from: i */
    public boolean f938i = true;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.b$a */
    public class a implements MusicItemView.InterfaceC1995a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ e30 f940a;

        public a(e30 e30Var) {
            this.f940a = e30Var;
        }

        @Override // com.p000p1.mobile.putong.feed.newui.camera.MusicItemView.InterfaceC1995a
        /* JADX INFO: renamed from: a */
        public void mo2116a(Music music, int i) {
            C2004b.this.f939j.m17531u0();
            C2004b.this.f937h = null;
            if (C2004b.this.m2265U(i)) {
                return;
            }
            C2004b.this.f935f = i;
        }

        @Override // com.p000p1.mobile.putong.feed.newui.camera.MusicItemView.InterfaceC1995a
        /* JADX INFO: renamed from: b */
        public boolean mo2117b(MusicContent musicContent, int i) {
            boolean z = C2004b.this.f935f == i;
            if (z) {
                C2004b.this.f937h = musicContent.id;
                this.f940a.call(musicContent);
            }
            return z;
        }
    }

    public C2004b(Context context, zq10 zq10Var) {
        this.f932c = context;
        this.f939j = zq10Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public boolean m2265U(int i) {
        int i2 = this.f935f;
        if (i2 == i) {
            return true;
        }
        if (i2 < 0) {
            return false;
        }
        this.f933d.get(i2).playState = 1;
        notifyItemChanged(this.f935f);
        return false;
    }

    /* JADX INFO: renamed from: A */
    public void m2266A(View view, Object obj, int i, int i2) {
        if (getItemViewType(i2) == 1) {
            ((CommonEmptyView) view).f2282b.setText(m2271N());
            return;
        }
        MusicItemView musicItemView = (MusicItemView) view;
        musicItemView.f839l = this.f934e;
        musicItemView.f838k = new MusicItemView.InterfaceC1996b() { // from class: l.qq10
            @Override // com.p000p1.mobile.putong.feed.newui.camera.MusicItemView.InterfaceC1996b
            /* JADX INFO: renamed from: a */
            public final void mo2118a(MusicContent musicContent, int i3) {
                this.f12350a.m2272O(musicContent, i3);
            }
        };
        musicItemView.m2097L(this.f933d.get(i2), i2);
    }

    /* JADX INFO: renamed from: C */
    public int m2267C() {
        return this.f933d.size() + 1;
    }

    /* JADX INFO: renamed from: D */
    public View m2268D(ViewGroup viewGroup, int i) {
        if (i != 1) {
            MusicItemView musicItemView = (MusicItemView) m2269L().inflater().inflate(o6c0.f11158X4, viewGroup, false);
            musicItemView.f841n = this;
            musicItemView.f844q = viewGroup;
            return musicItemView;
        }
        CommonEmptyView commonEmptyView = (CommonEmptyView) m2269L().inflater().inflate(o6c0.f11199e, viewGroup, false);
        xdl0.f0(commonEmptyView, t100.d(8.0f));
        xdl0.c0(commonEmptyView, t100.d(120.0f));
        xdl0.M(commonEmptyView.f2281a, false);
        return commonEmptyView;
    }

    /* JADX INFO: renamed from: L */
    public final MusicListAct m2269L() {
        return (MusicListAct) this.f932c;
    }

    /* JADX INFO: renamed from: M */
    public void m2270M() {
        int i = this.f935f;
        if (i < 0 || i >= this.f933d.size()) {
            return;
        }
        this.f933d.get(this.f935f).playState = 1;
        notifyItemChanged(this.f935f);
        this.f935f = -1;
        this.f937h = null;
    }

    /* JADX INFO: renamed from: N */
    public final String m2271N() {
        if (this.f938i) {
            return m2269L().getString(R$string.f461X0);
        }
        return vwb.J(this.f933d) ? m2269L().getString(R$string.f646z1) : m2269L().getString(R$string.f622v1);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m2272O(MusicContent musicContent, int i) {
        this.f936g.call(musicContent);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ Boolean m2273P(Music music) {
        return Boolean.valueOf(TextUtils.equals(music.f242id, this.f937h));
    }

    /* JADX INFO: renamed from: Q */
    public void m2274Q(e30<MusicContent> e30Var) {
        this.f934e = new a(e30Var);
    }

    /* JADX INFO: renamed from: R */
    public void m2275R(e30<MusicContent> e30Var) {
        this.f936g = e30Var;
    }

    /* JADX INFO: renamed from: S */
    public void m2276S(List<Music> list) {
        if (NullChecker.a(this.f937h) && this.f935f != -1) {
            Music music = (Music) vwb.r(list, new w9j() { // from class: l.rq10
                public final Object call(Object obj) {
                    return this.f12715a.m2273P((Music) obj);
                }
            });
            if (NullChecker.a(music)) {
                music.playState = 3;
            } else {
                this.f937h = null;
                this.f935f = -1;
            }
        }
        this.f933d = list;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: T */
    public void m2277T() {
        this.f938i = false;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: e */
    public void m2278e(int i) {
        if (vwb.J(this.f933d) || i <= getItemCount() - 5 || !this.f938i) {
            return;
        }
        this.f939j.m17525l0();
    }

    public Object getItem(int i) {
        return null;
    }

    public int getItemViewType(int i) {
        return i >= this.f933d.size() ? 1 : 2;
    }
}
