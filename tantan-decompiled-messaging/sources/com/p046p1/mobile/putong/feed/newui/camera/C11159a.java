package com.p046p1.mobile.putong.feed.newui.camera;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.data.Music;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.MusicCategory;
import com.p046p1.mobile.putong.feed.newui.photoalbum.CommonEmptyView;
import com.p046p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p149l.dac0;
import p149l.e30;
import p149l.f3c0;
import p149l.o6c0;
import p149l.t100;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.a */
/* JADX INFO: loaded from: classes12.dex */
public class C11159a extends dac0<MusicContent> {

    /* JADX INFO: renamed from: c */
    public final Context f39458c;

    /* JADX INFO: renamed from: f */
    public e30<String> f39461f;

    /* JADX INFO: renamed from: g */
    public MusicItemView.InterfaceC11151a f39462g;

    /* JADX INFO: renamed from: i */
    public e30<MusicContent> f39464i;

    /* JADX INFO: renamed from: j */
    public String f39465j;

    /* JADX INFO: renamed from: k */
    public String f39466k;

    /* JADX INFO: renamed from: l */
    public String f39467l;

    /* JADX INFO: renamed from: d */
    public List<MusicCategory> f39459d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public List<Music> f39460e = new ArrayList();

    /* JADX INFO: renamed from: h */
    public int f39463h = -1;

    /* JADX INFO: renamed from: m */
    public boolean f39468m = true;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.a$a */
    public class a implements MusicItemView.InterfaceC11151a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ e30 f39469a;

        public a(e30 e30Var) {
            this.f39469a = e30Var;
        }

        @Override // com.p046p1.mobile.putong.feed.newui.camera.MusicItemView.InterfaceC11151a
        /* JADX INFO: renamed from: a */
        public void mo61182a(Music music, int i) {
            C11159a.this.m61294L().m61129I2();
            C11159a.this.f39467l = null;
            if (C11159a.this.m61311d0(i)) {
                return;
            }
            C11159a.this.f39463h = i;
        }

        @Override // com.p046p1.mobile.putong.feed.newui.camera.MusicItemView.InterfaceC11151a
        /* JADX INFO: renamed from: b */
        public boolean mo61183b(MusicContent musicContent, int i) {
            boolean z = C11159a.this.f39463h == i;
            if (z) {
                C11159a.this.f39467l = musicContent.f53979id;
                this.f39469a.call(musicContent);
            }
            return z;
        }
    }

    public C11159a(Context context) {
        this.f39458c = context;
    }

    /* JADX INFO: renamed from: U */
    private void m61293U(CommonEmptyView commonEmptyView) {
        String string;
        int i = f3c0.f94551j6;
        boolean z = true;
        int i2 = 60;
        int i3 = 0;
        if (m61300R() && vwb.m200296J(this.f39460e)) {
            string = m61294L().getString(R$string.f39155u1);
        } else {
            if (this.f39468m) {
                string = m61294L().getString(R$string.f39000X0);
            } else if (vwb.m200296J(this.f39460e) && m61299Q()) {
                string = m61294L().getString(R$string.f39154u0);
            } else {
                string = m61294L().getString(R$string.f39161v1);
            }
            z = false;
            i2 = 8;
            i3 = 120;
        }
        xdl0.m208344M(commonEmptyView.f40820a, z);
        if (z) {
            commonEmptyView.f40820a.setImageResource(i);
        }
        commonEmptyView.f40821b.setText(string);
        xdl0.m208374f0(commonEmptyView, t100.m186890d(i2));
        xdl0.m208368c0(commonEmptyView, t100.m186890d(i3));
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        if (this.f39459d.isEmpty()) {
            return 0;
        }
        return this.f39459d.size() + 3 + this.f39460e.size() + 1 + (m61309b0() ? 1 : 0);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return m61294L().inflater().inflate(o6c0.f142151Z4, viewGroup, false);
        }
        if (i == 2) {
            MusicMiddleBarView musicMiddleBarView = (MusicMiddleBarView) m61294L().inflater().inflate(o6c0.f142145Y4, viewGroup, false);
            musicMiddleBarView.m61207f(this.f39461f);
            return musicMiddleBarView;
        }
        if (i == 3) {
            MusicItemView musicItemView = (MusicItemView) m61294L().inflater().inflate(o6c0.f142139X4, viewGroup, false);
            musicItemView.f39380n = this;
            musicItemView.f39383q = viewGroup;
            return musicItemView;
        }
        if (i == 4) {
            return m61294L().inflater().inflate(o6c0.f142133W4, viewGroup, false);
        }
        if (i != 5) {
            return null;
        }
        return m61294L().inflater().inflate(o6c0.f142180e, viewGroup, false);
    }

    /* JADX INFO: renamed from: L */
    public final MusicCenterAct m61294L() {
        return (MusicCenterAct) this.f39458c;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, MusicContent musicContent, int i, int i2) {
        int iM61298P = m61298P(i2);
        if (i == 1) {
            ((MusicCategoryView) view).m61102d(this.f39459d.get(iM61298P));
            return;
        }
        if (i == 2) {
            ((MusicMiddleBarView) view).m61209h(iM61298P);
            return;
        }
        if (i != 3) {
            if (i != 5) {
                return;
            }
            m61293U((CommonEmptyView) view);
        } else {
            MusicItemView musicItemView = (MusicItemView) view;
            musicItemView.f39378l = this.f39462g;
            musicItemView.f39377k = new MusicItemView.InterfaceC11152b() { // from class: l.ep10
                @Override // com.p046p1.mobile.putong.feed.newui.camera.MusicItemView.InterfaceC11152b
                /* JADX INFO: renamed from: a */
                public final void mo61184a(MusicContent musicContent2, int i3) {
                    this.f92529a.m61301S(musicContent2, i3);
                }
            };
            musicItemView.m61163L(this.f39460e.get(iM61298P), i2);
        }
    }

    /* JADX INFO: renamed from: N */
    public void m61296N() {
        int i = this.f39463h;
        if (i < 0 || m61298P(i) >= this.f39460e.size()) {
            return;
        }
        this.f39460e.get(m61298P(this.f39463h)).playState = 1;
        notifyItemChanged(this.f39463h);
        this.f39463h = -1;
        this.f39467l = null;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public MusicContent getItem(int i) {
        return null;
    }

    /* JADX INFO: renamed from: P */
    public final int m61298P(int i) {
        if (i < this.f39459d.size()) {
            return i;
        }
        if (i == this.f39459d.size()) {
            return 0;
        }
        return i < m61310c0() ? (i - this.f39459d.size()) - 1 : i - m61310c0();
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m61299Q() {
        return TextUtils.equals(this.f39466k, "fav");
    }

    /* JADX INFO: renamed from: R */
    public final boolean m61300R() {
        return TextUtils.equals(this.f39466k, "local");
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m61301S(MusicContent musicContent, int i) {
        this.f39464i.call(musicContent);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ Boolean m61302T(Music music) {
        return Boolean.valueOf(TextUtils.equals(music.f38781id, this.f39467l));
    }

    /* JADX INFO: renamed from: V */
    public void m61303V(e30<String> e30Var) {
        this.f39461f = e30Var;
    }

    /* JADX INFO: renamed from: W */
    public void m61304W(List<MusicCategory> list) {
        this.f39459d.clear();
        this.f39459d.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: X */
    public void m61305X(e30<MusicContent> e30Var) {
        this.f39462g = new a(e30Var);
    }

    /* JADX INFO: renamed from: Y */
    public void m61306Y(e30<MusicContent> e30Var) {
        this.f39464i = e30Var;
    }

    /* JADX INFO: renamed from: Z */
    public void m61307Z(List<Music> list, String str, String str2) {
        if (!TextUtils.equals(this.f39466k, str2)) {
            this.f39463h = -1;
            this.f39468m = true;
        }
        if (NullChecker.m81303a(this.f39467l) && this.f39463h != -1) {
            Music music = (Music) vwb.m200346r(list, new w9j() { // from class: l.dp10
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f87223a.m61302T((Music) obj);
                }
            });
            if (NullChecker.m81303a(music)) {
                music.playState = 3;
            } else {
                this.f39467l = null;
                this.f39463h = -1;
            }
        }
        this.f39466k = str2;
        this.f39465j = str;
        this.f39460e.clear();
        if (!vwb.m200296J(list)) {
            this.f39460e.addAll(list);
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: a0 */
    public void m61308a0() {
        this.f39468m = false;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m61309b0() {
        return !m61300R() || vwb.m200296J(this.f39460e);
    }

    /* JADX INFO: renamed from: c0 */
    public final int m61310c0() {
        return this.f39459d.size() + 4;
    }

    /* JADX INFO: renamed from: d0 */
    public final boolean m61311d0(int i) {
        int i2 = this.f39463h;
        if (i2 == i) {
            this.f39463h = -1;
            return true;
        }
        if (i2 < 0) {
            return false;
        }
        this.f39460e.get(m61298P(i2)).playState = 1;
        notifyItemChanged(this.f39463h);
        return false;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: e */
    public void mo47327e(int i) {
        if (i > getItemCount() - (m61300R() ? 10 : 5)) {
            m61294L().m61131q2();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void m61312e0(List<Music> list, String str) {
        String str2 = this.f39465j;
        if (str2 == null) {
            return;
        }
        this.f39466k = str;
        m61307Z(list, str2, str);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (i < this.f39459d.size()) {
            return 1;
        }
        if (i == this.f39459d.size()) {
            return 4;
        }
        if (i < m61310c0()) {
            return 2;
        }
        return (m61309b0() && i == getItemCount() - 1) ? 5 : 3;
    }
}
