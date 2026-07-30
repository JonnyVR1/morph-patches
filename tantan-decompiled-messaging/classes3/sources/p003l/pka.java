package p003l;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.a;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.Sticker;
import com.p1.mobile.putong.core.data.UserSticker;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.e51;
import l.j760;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.qib0;
import l.roj0;
import l.vwb;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class pka extends jq2<tka> {

    /* JADX INFO: renamed from: a */
    public String f6439a;

    /* JADX INFO: renamed from: b */
    public List<Sticker> f6440b;

    /* JADX INFO: renamed from: c */
    public boolean f6441c;

    /* JADX INFO: renamed from: d */
    public boolean f6442d;

    /* JADX INFO: renamed from: e */
    public boolean f6443e;

    public pka(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m6872u0(Bundle bundle) {
        ((tka) ((jq2) this).viewModel).m7779r();
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m6873A0(boolean z, Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f6440b = arrayList;
        ((tka) ((jq2) this).viewModel).m7777l(arrayList);
        this.f6439a = "limit=40&offset=0";
        if (z) {
            ((tka) ((jq2) this).viewModel).m7775f();
        }
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m6874C0(List list) {
        ((tka) ((jq2) this).viewModel).f7542j.m7801U(true);
        ((tka) ((jq2) this).viewModel).m7777l(list);
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m6875D0(Throwable th) {
        ((tka) ((jq2) this).viewModel).m7775f();
    }

    /* JADX INFO: renamed from: E0 */
    public void m6876E0() {
        String str;
        String str2 = this.f6439a;
        String strM6882q0 = m6882q0();
        if (TextUtils.isEmpty(strM6882q0)) {
            str = "";
        } else {
            str = "&channel=" + strM6882q0;
        }
        String str3 = str2 + str;
        duringCreated(CoreModule.c.Z.l3(a.J0("/stickers?search=trending&") + str3)).subscribe((m250) mkd0.H(new e30() { // from class: l.kka
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f4967a.m6886x0((Pair) obj);
            }
        }, new e30() { // from class: l.lka
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f5321a.m6887y0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F0 */
    public void m6877F0(final boolean z) {
        duringCreated(CoreModule.c.Z.m3(m6882q0())).subscribe((m250) mkd0.H(new e30() { // from class: l.ika
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f4426a.m6888z0((Pair) obj);
            }
        }, new e30() { // from class: l.jka
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f4681a.m6873A0(z, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: G0 */
    public void m6878G0(String str) {
        zvf0.u("e_gif_search", "p_stickers_from_suggest", new j760[]{vwb.Y("search_word", str)});
        duringCreated(CoreModule.c.Z.p3(str)).subscribe((m250) mkd0.H(new e30() { // from class: l.eka
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f3318a.m6874C0((List) obj);
            }
        }, new e30() { // from class: l.gka
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f3923a.m6875D0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H0 */
    public void m6879H0(boolean z, boolean z2, boolean z3) {
        this.f6441c = z;
        this.f6442d = z2;
        this.f6443e = z3;
    }

    /* JADX INFO: renamed from: a0 */
    public void m6880a0() {
        creates(new e30() { // from class: l.hka
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f4220a.m6872u0((Bundle) obj);
            }
        });
        m6877F0(false);
    }

    /* JADX INFO: renamed from: p0 */
    public void m6881p0(final Sticker sticker) {
        if (NullChecker.a(CoreModule.c.Z.T.n()) && !vwb.J(((CoreData) CoreModule.c.Z.T.n()).userStickers) && !vwb.J(((UserSticker) ((CoreData) CoreModule.c.Z.T.n()).userStickers.get(0)).favoriteStickers) && ((UserSticker) ((CoreData) CoreModule.c.Z.T.n()).userStickers.get(0)).favoriteStickers.size() >= 300) {
            lsi0.w(R.string.m6);
        } else {
            act().progress(R.string.I2, true);
            duringCreated(CoreModule.c.Z.T.O(sticker)).subscribe((m250) mkd0.H(new e30() { // from class: l.mka
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f5678a.m6885t0(sticker, (roj0) obj);
                }
            }, new e30() { // from class: l.nka
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f5918a.m6884s0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: q0 */
    public String m6882q0() {
        if (this.f6441c) {
            return "chat_gif";
        }
        if (this.f6442d) {
            return "chat_favorite";
        }
        return this.f6443e ? "chat_text_associate_second_page" : "";
    }

    /* JADX INFO: renamed from: r0 */
    public List<Sticker> m6883r0() {
        return this.f6440b;
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m6884s0(Throwable th) {
        act().progressDismiss();
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).code == 40327) {
            lsi0.w(R.string.m6);
        } else {
            lsi0.w(R.string.g6);
            e51.H(CoreModule.b, new Runnable() { // from class: l.oka
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.c.Z.T.z();
                }
            }, 50L);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m6885t0(Sticker sticker, roj0 roj0Var) {
        if (!vwb.J(sticker.pictures)) {
            qib0.G.x0(((Media) ((Picture) sticker.pictures.get(0))).url);
            if (!vwb.J(((Picture) sticker.pictures.get(0)).attachments)) {
                qib0.G.x0(((Media) ((Picture) ((Picture) sticker.pictures.get(0)).attachments.get(0))).url);
            }
        }
        act().progressDismiss();
        lsi0.w(R.string.h6);
        e51.H(CoreModule.b, new Runnable() { // from class: l.fka
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.c.Z.T.z();
            }
        }, 50L);
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m6886x0(Pair pair) {
        ((tka) ((jq2) this).viewModel).m7777l((List) pair.first);
        ((tka) ((jq2) this).viewModel).m7778m();
        this.f6439a = (String) pair.second;
        this.f6440b = (List) pair.first;
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m6887y0(Throwable th) {
        ((tka) ((jq2) this).viewModel).m7775f();
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m6888z0(Pair pair) {
        ((tka) ((jq2) this).viewModel).m7777l((List) pair.first);
        this.f6439a = (String) pair.second;
        this.f6440b = (List) pair.first;
    }

    public void destroy() {
    }
}
