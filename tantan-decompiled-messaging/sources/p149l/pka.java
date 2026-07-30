package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.data.Sticker;
import com.p046p1.mobile.putong.core.message.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class pka extends jq2<tka> {

    /* JADX INFO: renamed from: a */
    public String f149954a;

    /* JADX INFO: renamed from: b */
    public List<Sticker> f149955b;

    /* JADX INFO: renamed from: c */
    public boolean f149956c;

    /* JADX INFO: renamed from: d */
    public boolean f149957d;

    /* JADX INFO: renamed from: e */
    public boolean f149958e;

    public pka(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m170003u0(Bundle bundle) {
        ((tka) this.viewModel).m189447r();
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m170004A0(boolean z, Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f149955b = arrayList;
        ((tka) this.viewModel).m189445l(arrayList);
        this.f149954a = "limit=40&offset=0";
        if (z) {
            ((tka) this.viewModel).m189444f();
        }
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m170005C0(List list) {
        ((tka) this.viewModel).f170836j.m189466U(true);
        ((tka) this.viewModel).m189445l(list);
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m170006D0(Throwable th) {
        ((tka) this.viewModel).m189444f();
    }

    /* JADX INFO: renamed from: E0 */
    public void m170007E0() {
        String str;
        String str2 = this.f149954a;
        String strM170012q0 = m170012q0();
        if (TextUtils.isEmpty(strM170012q0)) {
            str = "";
        } else {
            str = "&channel=" + strM170012q0;
        }
        String str3 = str2 + str;
        duringCreated(CoreModule.f17545c.f19624Z.m34920l3(C4728a.m31213J0("/stickers?search=trending&") + str3)).subscribe(mkd0.m154956H(new e30() { // from class: l.kka
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123537a.m170016x0((Pair) obj);
            }
        }, new e30() { // from class: l.lka
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f128458a.m170017y0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F0 */
    public void m170008F0(final boolean z) {
        duringCreated(CoreModule.f17545c.f19624Z.m34921m3(m170012q0())).subscribe(mkd0.m154956H(new e30() { // from class: l.ika
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f113648a.m170018z0((Pair) obj);
            }
        }, new e30() { // from class: l.jka
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f118345a.m170004A0(z, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: G0 */
    public void m170009G0(String str) {
        zvf0.m220399u("e_gif_search", "p_stickers_from_suggest", vwb.m200311Y("search_word", str));
        duringCreated(CoreModule.f17545c.f19624Z.m34924p3(str)).subscribe(mkd0.m154956H(new e30() { // from class: l.eka
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f91961a.m170005C0((List) obj);
            }
        }, new e30() { // from class: l.gka
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f103179a.m170006D0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H0 */
    public void m170010H0(boolean z, boolean z2, boolean z3) {
        this.f149956c = z;
        this.f149957d = z2;
        this.f149958e = z3;
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.hka
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f108168a.m170003u0((Bundle) obj);
            }
        });
        m170008F0(false);
    }

    /* JADX INFO: renamed from: p0 */
    public void m170011p0(final Sticker sticker) {
        if (NullChecker.m81303a(CoreModule.f17545c.f19624Z.f20143T.m121233n()) && !vwb.m200296J(CoreModule.f17545c.f19624Z.f20143T.m121233n().userStickers) && !vwb.m200296J(CoreModule.f17545c.f19624Z.f20143T.m121233n().userStickers.get(0).favoriteStickers) && CoreModule.f17545c.f19624Z.f20143T.m121233n().userStickers.get(0).favoriteStickers.size() >= 300) {
            lsi0.m151593w(R$string.f21031m6);
        } else {
            act().progress(R$string.f20775I2, true);
            duringCreated(CoreModule.f17545c.f19624Z.f20143T.m34950O(sticker)).subscribe(mkd0.m154956H(new e30() { // from class: l.mka
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f134290a.m170015t0(sticker, (roj0) obj);
                }
            }, new e30() { // from class: l.nka
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f139385a.m170014s0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: q0 */
    public String m170012q0() {
        if (this.f149956c) {
            return "chat_gif";
        }
        if (this.f149957d) {
            return "chat_favorite";
        }
        return this.f149958e ? "chat_text_associate_second_page" : "";
    }

    /* JADX INFO: renamed from: r0 */
    public List<Sticker> m170013r0() {
        return this.f149955b;
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m170014s0(Throwable th) {
        act().progressDismiss();
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).code == 40327) {
            lsi0.m151593w(R$string.f21031m6);
        } else {
            lsi0.m151593w(R$string.f20977g6);
            e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.oka
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f17545c.f19624Z.f20143T.m121236q();
                }
            }, 50L);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m170015t0(Sticker sticker, roj0 roj0Var) {
        if (!vwb.m200296J(sticker.pictures)) {
            qib0.f154691G.m102377x0(sticker.pictures.get(0).url);
            if (!vwb.m200296J(sticker.pictures.get(0).attachments)) {
                qib0.f154691G.m102377x0(sticker.pictures.get(0).attachments.get(0).url);
            }
        }
        act().progressDismiss();
        lsi0.m151593w(R$string.f20986h6);
        e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.fka
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.f17545c.f19624Z.f20143T.m121236q();
            }
        }, 50L);
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m170016x0(Pair pair) {
        ((tka) this.viewModel).m189445l((List) pair.first);
        ((tka) this.viewModel).m189446m();
        this.f149954a = (String) pair.second;
        this.f149955b = (List) pair.first;
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m170017y0(Throwable th) {
        ((tka) this.viewModel).m189444f();
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m170018z0(Pair pair) {
        ((tka) this.viewModel).m189445l((List) pair.first);
        this.f149954a = (String) pair.second;
        this.f149955b = (List) pair.first;
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
