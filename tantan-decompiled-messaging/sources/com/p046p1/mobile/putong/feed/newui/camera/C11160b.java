package com.p046p1.mobile.putong.feed.newui.camera;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.data.Music;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.newui.photoalbum.CommonEmptyView;
import com.p046p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p149l.dac0;
import p149l.e30;
import p149l.o6c0;
import p149l.t100;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;
import p149l.zq10;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.b */
/* JADX INFO: loaded from: classes12.dex */
public class C11160b extends dac0 {

    /* JADX INFO: renamed from: c */
    public final Context f39471c;

    /* JADX INFO: renamed from: e */
    public MusicItemView.InterfaceC11151a f39473e;

    /* JADX INFO: renamed from: g */
    public e30<MusicContent> f39475g;

    /* JADX INFO: renamed from: h */
    public String f39476h;

    /* JADX INFO: renamed from: j */
    public zq10 f39478j;

    /* JADX INFO: renamed from: d */
    public List<Music> f39472d = new ArrayList();

    /* JADX INFO: renamed from: f */
    public int f39474f = -1;

    /* JADX INFO: renamed from: i */
    public boolean f39477i = true;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.b$a */
    public class a implements MusicItemView.InterfaceC11151a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ e30 f39479a;

        public a(e30 e30Var) {
            this.f39479a = e30Var;
        }

        @Override // com.p046p1.mobile.putong.feed.newui.camera.MusicItemView.InterfaceC11151a
        /* JADX INFO: renamed from: a */
        public void mo61182a(Music music, int i) {
            C11160b.this.f39478j.m219834u0();
            C11160b.this.f39476h = null;
            if (C11160b.this.m61320U(i)) {
                return;
            }
            C11160b.this.f39474f = i;
        }

        @Override // com.p046p1.mobile.putong.feed.newui.camera.MusicItemView.InterfaceC11151a
        /* JADX INFO: renamed from: b */
        public boolean mo61183b(MusicContent musicContent, int i) {
            boolean z = C11160b.this.f39474f == i;
            if (z) {
                C11160b.this.f39476h = musicContent.f53979id;
                this.f39479a.call(musicContent);
            }
            return z;
        }
    }

    public C11160b(Context context, zq10 zq10Var) {
        this.f39471c = context;
        this.f39478j = zq10Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public boolean m61320U(int i) {
        int i2 = this.f39474f;
        if (i2 == i) {
            return true;
        }
        if (i2 < 0) {
            return false;
        }
        this.f39472d.get(i2).playState = 1;
        notifyItemChanged(this.f39474f);
        return false;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: A */
    public void mo28823A(View view, Object obj, int i, int i2) {
        if (getItemViewType(i2) == 1) {
            ((CommonEmptyView) view).f40821b.setText(m61323N());
            return;
        }
        MusicItemView musicItemView = (MusicItemView) view;
        musicItemView.f39378l = this.f39473e;
        musicItemView.f39377k = new MusicItemView.InterfaceC11152b() { // from class: l.qq10
            @Override // com.p046p1.mobile.putong.feed.newui.camera.MusicItemView.InterfaceC11152b
            /* JADX INFO: renamed from: a */
            public final void mo61184a(MusicContent musicContent, int i3) {
                this.f155858a.m61324O(musicContent, i3);
            }
        };
        musicItemView.m61163L(this.f39472d.get(i2), i2);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f39472d.size() + 1;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        if (i != 1) {
            MusicItemView musicItemView = (MusicItemView) m61321L().inflater().inflate(o6c0.f142139X4, viewGroup, false);
            musicItemView.f39380n = this;
            musicItemView.f39383q = viewGroup;
            return musicItemView;
        }
        CommonEmptyView commonEmptyView = (CommonEmptyView) m61321L().inflater().inflate(o6c0.f142180e, viewGroup, false);
        xdl0.m208374f0(commonEmptyView, t100.m186890d(8.0f));
        xdl0.m208368c0(commonEmptyView, t100.m186890d(120.0f));
        xdl0.m208344M(commonEmptyView.f40820a, false);
        return commonEmptyView;
    }

    /* JADX INFO: renamed from: L */
    public final MusicListAct m61321L() {
        return (MusicListAct) this.f39471c;
    }

    /* JADX INFO: renamed from: M */
    public void m61322M() {
        int i = this.f39474f;
        if (i < 0 || i >= this.f39472d.size()) {
            return;
        }
        this.f39472d.get(this.f39474f).playState = 1;
        notifyItemChanged(this.f39474f);
        this.f39474f = -1;
        this.f39476h = null;
    }

    /* JADX INFO: renamed from: N */
    public final String m61323N() {
        if (this.f39477i) {
            return m61321L().getString(R$string.f39000X0);
        }
        return vwb.m200296J(this.f39472d) ? m61321L().getString(R$string.f39185z1) : m61321L().getString(R$string.f39161v1);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m61324O(MusicContent musicContent, int i) {
        this.f39475g.call(musicContent);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ Boolean m61325P(Music music) {
        return Boolean.valueOf(TextUtils.equals(music.f38781id, this.f39476h));
    }

    /* JADX INFO: renamed from: Q */
    public void m61326Q(e30<MusicContent> e30Var) {
        this.f39473e = new a(e30Var);
    }

    /* JADX INFO: renamed from: R */
    public void m61327R(e30<MusicContent> e30Var) {
        this.f39475g = e30Var;
    }

    /* JADX INFO: renamed from: S */
    public void m61328S(List<Music> list) {
        if (NullChecker.m81303a(this.f39476h) && this.f39474f != -1) {
            Music music = (Music) vwb.m200346r(list, new w9j() { // from class: l.rq10
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f160586a.m61325P((Music) obj);
                }
            });
            if (NullChecker.m81303a(music)) {
                music.playState = 3;
            } else {
                this.f39476h = null;
                this.f39474f = -1;
            }
        }
        this.f39472d = list;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: T */
    public void m61329T() {
        this.f39477i = false;
        notifyDataSetChanged();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: e */
    public void mo47327e(int i) {
        if (vwb.m200296J(this.f39472d) || i <= getItemCount() - 5 || !this.f39477i) {
            return;
        }
        this.f39478j.m219828l0();
    }

    @Override // p149l.dac0
    public Object getItem(int i) {
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i >= this.f39472d.size() ? 1 : 2;
    }
}
