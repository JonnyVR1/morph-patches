package p149l;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.p046p1.mobile.longlink.msg.liveroom.LiveChatAreaOperationMessage;
import com.p046p1.mobile.putong.data.AuthData;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
public abstract class re4 extends h4t<ho2, ue4> {

    /* JADX INFO: renamed from: i */
    public String f159029i;

    /* JADX INFO: renamed from: j */
    public final Runnable f159030j;

    public re4(bsm<? extends ho2> bsmVar, ue4 ue4Var) {
        super(bsmVar);
        this.f159030j = new Runnable() { // from class: l.je4
            @Override // java.lang.Runnable
            public final void run() {
                this.f117470a.m179034V3();
            }
        };
        mo51532C(ue4Var);
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ LiveChatAreaOperationMessage.ChatAreaOperationSiteContainer m179028L3(LiveChatAreaOperationMessage.ChatAreaOperationSiteContainer chatAreaOperationSiteContainer, AuthData authData) {
        return chatAreaOperationSiteContainer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V3 */
    public /* synthetic */ void m179034V3() {
        ((ue4) this.viewModel).m193215j();
    }

    /* JADX INFO: renamed from: S3 */
    public final boolean m179035S3(LiveChatAreaOperationMessage.ChatAreaOperationSiteContainer chatAreaOperationSiteContainer) {
        return (jkp0.m141904d(chatAreaOperationSiteContainer.getJumpLinkItem().getUrl()) && TextUtils.isEmpty(this.f159029i)) ? false : true;
    }

    /* JADX INFO: renamed from: T3 */
    public void m179036T3() {
        m129296E3(this.f159030j);
    }

    /* JADX INFO: renamed from: U3 */
    public abstract ViewGroup.LayoutParams mo143336U3();

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m179037W3(AuthData authData) {
        this.f159029i = authData.accessToken;
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m179038X3(AuthData authData) {
        this.f159029i = authData.accessToken;
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ C22306c m179039Y3(final LiveChatAreaOperationMessage.ChatAreaOperationSiteContainer chatAreaOperationSiteContainer) {
        return (jkp0.m141904d(chatAreaOperationSiteContainer.getJumpLinkItem().getUrl()) && TextUtils.isEmpty(this.f159029i)) ? ypv.f199493a.m199334a().doOnNext(new e30() { // from class: l.ne4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f138584a.m179038X3((AuthData) obj);
            }
        }).map(new w9j() { // from class: l.oe4
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return re4.m179028L3(chatAreaOperationSiteContainer, (AuthData) obj);
            }
        }) : C22306c.just(chatAreaOperationSiteContainer);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m179040Z3(LiveChatAreaOperationMessage.ChatAreaOperationSiteContainer chatAreaOperationSiteContainer) {
        ((ue4) this.viewModel).m193217m(this.f159029i, chatAreaOperationSiteContainer);
        m179041a4((int) chatAreaOperationSiteContainer.getJumpLinkItem().getShowTime());
    }

    /* JADX INFO: renamed from: a4 */
    public void m179041a4(int i) {
        m179036T3();
        m129293B3(i, TimeUnit.SECONDS, this.f159030j);
    }

    /* JADX INFO: renamed from: b4 */
    public final void m179042b4() {
        duringCreated(ypv.f199493a.m199334a()).subscribe(ffw.m121194e(new e30() { // from class: l.pe4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f148400a.m179037W3((AuthData) obj);
            }
        }, new e30() { // from class: l.qe4
            @Override // p149l.e30
            public final void call(Object obj) {
                hfw.m130790a("[live]campaign", "accessOutterToken " + ((Throwable) obj).getMessage());
            }
        }));
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        m129296E3(this.f159030j);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m179042b4();
        duringCreated(m206027E2().m132160q1().m189154x()).flatMap(new w9j() { // from class: l.ke4
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f122668a.m179039Y3((LiveChatAreaOperationMessage.ChatAreaOperationSiteContainer) obj);
            }
        }).filter(new w9j() { // from class: l.le4
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(this.f127646a.m179035S3((LiveChatAreaOperationMessage.ChatAreaOperationSiteContainer) obj));
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.me4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f133357a.m179040Z3((LiveChatAreaOperationMessage.ChatAreaOperationSiteContainer) obj);
            }
        }));
    }
}
