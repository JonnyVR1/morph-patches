package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.data.Sticker;
import com.p051p1.mobile.putong.core.message.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class bma extends ar2<fma> {

    /* JADX INFO: renamed from: a */
    public String f77279a;

    /* JADX INFO: renamed from: b */
    public List<Sticker> f77280b;

    /* JADX INFO: renamed from: c */
    public boolean f77281c;

    /* JADX INFO: renamed from: d */
    public boolean f77282d;

    /* JADX INFO: renamed from: e */
    public boolean f77283e;

    public bma(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m105012u0(Bundle bundle) {
        ((fma) this.viewModel).m126194r();
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m105013A0(boolean z, Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f77280b = arrayList;
        ((fma) this.viewModel).m126192l(arrayList);
        this.f77279a = "limit=40&offset=0";
        if (z) {
            ((fma) this.viewModel).m126191f();
        }
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m105014C0(List list) {
        ((fma) this.viewModel).f99745j.m126213U(true);
        ((fma) this.viewModel).m126192l(list);
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m105015D0(Throwable th) {
        ((fma) this.viewModel).m126191f();
    }

    /* JADX INFO: renamed from: E0 */
    public void m105016E0() {
        String str;
        String str2 = this.f77279a;
        String strM105021q0 = m105021q0();
        if (TextUtils.isEmpty(strM105021q0)) {
            str = "";
        } else {
            str = "&channel=" + strM105021q0;
        }
        String str3 = str2 + str;
        duringCreated(CoreModule.f18264c.f20366Z.m35923l3(C4879a.m32216J0("/stickers?search=trending&") + str3)).subscribe(psd0.m173597H(new y20() { // from class: l.wla
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f189665a.m105025x0((Pair) obj);
            }
        }, new y20() { // from class: l.xla
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f194937a.m105026y0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F0 */
    public void m105017F0(final boolean z) {
        duringCreated(CoreModule.f18264c.f20366Z.m35924m3(m105021q0())).subscribe(psd0.m173597H(new y20() { // from class: l.ula
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f179496a.m105027z0((Pair) obj);
            }
        }, new y20() { // from class: l.vla
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f184552a.m105013A0(z, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: G0 */
    public void m105018G0(String str) {
        i4g0.m138523u("e_gif_search", "p_stickers_from_suggest", jyb.m147494Y("search_word", str));
        duringCreated(CoreModule.f18264c.f20366Z.m35927p3(str)).subscribe(psd0.m173597H(new y20() { // from class: l.qla
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f158216a.m105014C0((List) obj);
            }
        }, new y20() { // from class: l.sla
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f169357a.m105015D0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H0 */
    public void m105019H0(boolean z, boolean z2, boolean z3) {
        this.f77281c = z;
        this.f77282d = z2;
        this.f77283e = z3;
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.tla
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f174805a.m105012u0((Bundle) obj);
            }
        });
        m105017F0(false);
    }

    /* JADX INFO: renamed from: p0 */
    public void m105020p0(final Sticker sticker) {
        if (NullChecker.m82486a(CoreModule.f18264c.f20366Z.f20885T.m159277n()) && !jyb.m147479J(CoreModule.f18264c.f20366Z.f20885T.m159277n().userStickers) && !jyb.m147479J(CoreModule.f18264c.f20366Z.f20885T.m159277n().userStickers.get(0).favoriteStickers) && CoreModule.f18264c.f20366Z.f20885T.m159277n().userStickers.get(0).favoriteStickers.size() >= 300) {
            o1j0.m165649w(R$string.f21773m6);
        } else {
            act().progress(R$string.f21517I2, true);
            duringCreated(CoreModule.f18264c.f20366Z.f20885T.m35953O(sticker)).subscribe(psd0.m173597H(new y20() { // from class: l.yla
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f200539a.m105024t0(sticker, (uxj0) obj);
                }
            }, new y20() { // from class: l.zla
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f204893a.m105023s0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: q0 */
    public String m105021q0() {
        if (this.f77281c) {
            return "chat_gif";
        }
        if (this.f77282d) {
            return "chat_favorite";
        }
        return this.f77283e ? "chat_text_associate_second_page" : "";
    }

    /* JADX INFO: renamed from: r0 */
    public List<Sticker> m105022r0() {
        return this.f77280b;
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m105023s0(Throwable th) {
        act().progressDismiss();
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).code == 40327) {
            o1j0.m165649w(R$string.f21773m6);
        } else {
            o1j0.m165649w(R$string.f21719g6);
            l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.ama
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f18264c.f20366Z.f20885T.m159280q();
                }
            }, 50L);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m105024t0(Sticker sticker, uxj0 uxj0Var) {
        if (!jyb.m147479J(sticker.pictures)) {
            uqb0.f180374G.m127160x0(sticker.pictures.get(0).url);
            if (!jyb.m147479J(sticker.pictures.get(0).attachments)) {
                uqb0.f180374G.m127160x0(sticker.pictures.get(0).attachments.get(0).url);
            }
        }
        act().progressDismiss();
        o1j0.m165649w(R$string.f21728h6);
        l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.rla
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.f18264c.f20366Z.f20885T.m159280q();
            }
        }, 50L);
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m105025x0(Pair pair) {
        ((fma) this.viewModel).m126192l((List) pair.first);
        ((fma) this.viewModel).m126193m();
        this.f77279a = (String) pair.second;
        this.f77280b = (List) pair.first;
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m105026y0(Throwable th) {
        ((fma) this.viewModel).m126191f();
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m105027z0(Pair pair) {
        ((fma) this.viewModel).m126192l((List) pair.first);
        this.f77279a = (String) pair.second;
        this.f77280b = (List) pair.first;
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
