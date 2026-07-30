package p003l;

import android.os.Bundle;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.StickerPackage;
import com.p1.mobile.putong.core.data.UserSticker;
import java.util.ArrayList;
import java.util.List;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.roj0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class k0a extends jq2<t0a> {

    /* JADX INFO: renamed from: a */
    public List<String> f4773a;

    public k0a(mcr mcrVar) {
        super(mcrVar);
        this.f4773a = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m5478s0(Bundle bundle) {
        ((t0a) ((jq2) this).viewModel).m7679r();
    }

    /* JADX INFO: renamed from: a0 */
    public void m5479a0() {
        creates(new e30() { // from class: l.e0a
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f3178a.m5478s0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.c.Z.T.k()).subscribe((m250) mkd0.G(new e30() { // from class: l.f0a
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f3431a.m5488t0((CoreData) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public int m5480k0(String str) {
        this.f4773a.add(str);
        return this.f4773a.size();
    }

    /* JADX INFO: renamed from: l0 */
    public void m5481l0() {
        if (vwb.J(this.f4773a)) {
            return;
        }
        UserSticker userStickerNew_ = UserSticker.new_();
        userStickerNew_.favoriteStickers = new ArrayList(this.f4773a);
        duringCreated(CoreModule.c.Z.T.P(userStickerNew_)).subscribe((m250) mkd0.H(new e30() { // from class: l.i0a
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f4314a.m5486q0((roj0) obj);
            }
        }, new e30() { // from class: l.j0a
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f4543a.m5487r0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public int m5482m0() {
        return this.f4773a.size();
    }

    /* JADX INFO: renamed from: n0 */
    public int m5483n0(String str) {
        return this.f4773a.indexOf(str);
    }

    /* JADX INFO: renamed from: o0 */
    public Object[] m5484o0() {
        return this.f4773a.toArray();
    }

    /* JADX INFO: renamed from: p0 */
    public boolean m5485p0() {
        return this.f4773a.size() == 9;
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m5486q0(roj0 roj0Var) {
        ((t0a) ((jq2) this).viewModel).m7676m();
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m5487r0(Throwable th) {
        ((t0a) ((jq2) this).viewModel).m7676m();
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m5488t0(CoreData coreData) {
        UserSticker userStickerNew_ = (coreData == null || vwb.J(coreData.userStickers)) ? UserSticker.new_() : (UserSticker) coreData.userStickers.get(0);
        if (userStickerNew_.favoriteStickers == null) {
            userStickerNew_.favoriteStickers = new ArrayList();
        }
        StickerPackage stickerPackageNew_ = StickerPackage.new_();
        stickerPackageNew_.stickers = userStickerNew_.favoriteStickers;
        stickerPackageNew_.id = "custom_stickers";
        ((t0a) ((jq2) this).viewModel).m7680x(stickerPackageNew_);
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m5489u0(roj0 roj0Var) {
        ((t0a) ((jq2) this).viewModel).m7676m();
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m5490x0(Throwable th) {
        ((t0a) ((jq2) this).viewModel).m7676m();
    }

    /* JADX INFO: renamed from: y0 */
    public void m5491y0() {
        if (vwb.J(this.f4773a)) {
            return;
        }
        UserSticker userStickerNew_ = UserSticker.new_();
        userStickerNew_.favoriteStickers = new ArrayList(this.f4773a);
        duringCreated(CoreModule.c.Z.T.W(userStickerNew_)).subscribe((m250) mkd0.H(new e30() { // from class: l.g0a
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f3784a.m5489u0((roj0) obj);
            }
        }, new e30() { // from class: l.h0a
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f4094a.m5490x0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z0 */
    public void m5492z0(String str) {
        this.f4773a.remove(str);
    }

    public void destroy() {
    }
}
