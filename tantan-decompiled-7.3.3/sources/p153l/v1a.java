package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.StickerPackage;
import com.p051p1.mobile.putong.core.data.UserSticker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class v1a extends ar2<e2a> {

    /* JADX INFO: renamed from: a */
    public List<String> f181940a;

    public v1a(ner nerVar) {
        super(nerVar);
        this.f181940a = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m198982s0(Bundle bundle) {
        ((e2a) this.viewModel).m119068r();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.p1a
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f150137a.m198982s0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f18264c.f20366Z.f20885T.m159274k()).subscribe(psd0.m173596G(new y20() { // from class: l.q1a
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f155162a.m198991t0((CoreData) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public int m198983k0(String str) {
        this.f181940a.add(str);
        return this.f181940a.size();
    }

    /* JADX INFO: renamed from: l0 */
    public void m198984l0() {
        if (jyb.m147479J(this.f181940a)) {
            return;
        }
        UserSticker userStickerNew_ = UserSticker.new_();
        userStickerNew_.favoriteStickers = new ArrayList(this.f181940a);
        duringCreated(CoreModule.f18264c.f20366Z.f20885T.m35954P(userStickerNew_)).subscribe(psd0.m173597H(new y20() { // from class: l.t1a
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f171641a.m198989q0((uxj0) obj);
            }
        }, new y20() { // from class: l.u1a
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f176981a.m198990r0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public int m198985m0() {
        return this.f181940a.size();
    }

    /* JADX INFO: renamed from: n0 */
    public int m198986n0(String str) {
        return this.f181940a.indexOf(str);
    }

    /* JADX INFO: renamed from: o0 */
    public Object[] m198987o0() {
        return this.f181940a.toArray();
    }

    /* JADX INFO: renamed from: p0 */
    public boolean m198988p0() {
        return this.f181940a.size() == 9;
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m198989q0(uxj0 uxj0Var) {
        ((e2a) this.viewModel).m119065m();
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m198990r0(Throwable th) {
        ((e2a) this.viewModel).m119065m();
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m198991t0(CoreData coreData) {
        UserSticker userStickerNew_ = (coreData == null || jyb.m147479J(coreData.userStickers)) ? UserSticker.new_() : coreData.userStickers.get(0);
        if (userStickerNew_.favoriteStickers == null) {
            userStickerNew_.favoriteStickers = new ArrayList();
        }
        StickerPackage stickerPackageNew_ = StickerPackage.new_();
        stickerPackageNew_.stickers = userStickerNew_.favoriteStickers;
        stickerPackageNew_.f21248id = "custom_stickers";
        ((e2a) this.viewModel).m119069x(stickerPackageNew_);
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m198992u0(uxj0 uxj0Var) {
        ((e2a) this.viewModel).m119065m();
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m198993x0(Throwable th) {
        ((e2a) this.viewModel).m119065m();
    }

    /* JADX INFO: renamed from: y0 */
    public void m198994y0() {
        if (jyb.m147479J(this.f181940a)) {
            return;
        }
        UserSticker userStickerNew_ = UserSticker.new_();
        userStickerNew_.favoriteStickers = new ArrayList(this.f181940a);
        duringCreated(CoreModule.f18264c.f20366Z.f20885T.m35961W(userStickerNew_)).subscribe(psd0.m173597H(new y20() { // from class: l.r1a
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f160784a.m198992u0((uxj0) obj);
            }
        }, new y20() { // from class: l.s1a
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f165764a.m198993x0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z0 */
    public void m198995z0(String str) {
        this.f181940a.remove(str);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
