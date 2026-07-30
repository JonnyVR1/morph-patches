package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.StickerPackage;
import com.p046p1.mobile.putong.core.data.UserSticker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class k0a extends jq2<t0a> {

    /* JADX INFO: renamed from: a */
    public List<String> f120463a;

    public k0a(mcr mcrVar) {
        super(mcrVar);
        this.f120463a = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m144000s0(Bundle bundle) {
        ((t0a) this.viewModel).m186843r();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.e0a
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f88555a.m144000s0((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f17545c.f19624Z.f20143T.m121230k()).subscribe(mkd0.m154955G(new e30() { // from class: l.f0a
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93967a.m144009t0((CoreData) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public int m144001k0(String str) {
        this.f120463a.add(str);
        return this.f120463a.size();
    }

    /* JADX INFO: renamed from: l0 */
    public void m144002l0() {
        if (vwb.m200296J(this.f120463a)) {
            return;
        }
        UserSticker userStickerNew_ = UserSticker.new_();
        userStickerNew_.favoriteStickers = new ArrayList(this.f120463a);
        duringCreated(CoreModule.f17545c.f19624Z.f20143T.m34951P(userStickerNew_)).subscribe(mkd0.m154956H(new e30() { // from class: l.i0a
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f110268a.m144007q0((roj0) obj);
            }
        }, new e30() { // from class: l.j0a
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115650a.m144008r0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public int m144003m0() {
        return this.f120463a.size();
    }

    /* JADX INFO: renamed from: n0 */
    public int m144004n0(String str) {
        return this.f120463a.indexOf(str);
    }

    /* JADX INFO: renamed from: o0 */
    public Object[] m144005o0() {
        return this.f120463a.toArray();
    }

    /* JADX INFO: renamed from: p0 */
    public boolean m144006p0() {
        return this.f120463a.size() == 9;
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m144007q0(roj0 roj0Var) {
        ((t0a) this.viewModel).m186840m();
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m144008r0(Throwable th) {
        ((t0a) this.viewModel).m186840m();
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m144009t0(CoreData coreData) {
        UserSticker userStickerNew_ = (coreData == null || vwb.m200296J(coreData.userStickers)) ? UserSticker.new_() : coreData.userStickers.get(0);
        if (userStickerNew_.favoriteStickers == null) {
            userStickerNew_.favoriteStickers = new ArrayList();
        }
        StickerPackage stickerPackageNew_ = StickerPackage.new_();
        stickerPackageNew_.stickers = userStickerNew_.favoriteStickers;
        stickerPackageNew_.f20506id = "custom_stickers";
        ((t0a) this.viewModel).m186844x(stickerPackageNew_);
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m144010u0(roj0 roj0Var) {
        ((t0a) this.viewModel).m186840m();
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m144011x0(Throwable th) {
        ((t0a) this.viewModel).m186840m();
    }

    /* JADX INFO: renamed from: y0 */
    public void m144012y0() {
        if (vwb.m200296J(this.f120463a)) {
            return;
        }
        UserSticker userStickerNew_ = UserSticker.new_();
        userStickerNew_.favoriteStickers = new ArrayList(this.f120463a);
        duringCreated(CoreModule.f17545c.f19624Z.f20143T.m34958W(userStickerNew_)).subscribe(mkd0.m154956H(new e30() { // from class: l.g0a
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f100029a.m144010u0((roj0) obj);
            }
        }, new e30() { // from class: l.h0a
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105204a.m144011x0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z0 */
    public void m144013z0(String str) {
        this.f120463a.remove(str);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
