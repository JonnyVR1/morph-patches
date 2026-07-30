package p153l;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.p051p1.mobile.longlink.msg.liveroom.LiveChatAreaOperationMessage;
import com.p051p1.mobile.putong.data.AuthData;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public abstract class qf4 extends i6t<oo2, tf4> {

    /* JADX INFO: renamed from: i */
    public String f157239i;

    /* JADX INFO: renamed from: j */
    public final Runnable f157240j;

    public qf4(dum<? extends oo2> dumVar, tf4 tf4Var) {
        super(dumVar);
        this.f157240j = new Runnable() { // from class: l.if4
            @Override // java.lang.Runnable
            public final void run() {
                this.f114644a.m176294V3();
            }
        };
        mo52715C(tf4Var);
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ LiveChatAreaOperationMessage.ChatAreaOperationSiteContainer m176288L3(LiveChatAreaOperationMessage.ChatAreaOperationSiteContainer chatAreaOperationSiteContainer, AuthData authData) {
        return chatAreaOperationSiteContainer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V3 */
    public /* synthetic */ void m176294V3() {
        ((tf4) this.viewModel).m190923j();
    }

    /* JADX INFO: renamed from: S3 */
    public final boolean m176295S3(LiveChatAreaOperationMessage.ChatAreaOperationSiteContainer chatAreaOperationSiteContainer) {
        return (ntp0.m164746d(chatAreaOperationSiteContainer.getJumpLinkItem().getUrl()) && TextUtils.isEmpty(this.f157239i)) ? false : true;
    }

    /* JADX INFO: renamed from: T3 */
    public void m176296T3() {
        m138855E3(this.f157240j);
    }

    /* JADX INFO: renamed from: U3 */
    public abstract ViewGroup.LayoutParams mo161349U3();

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m176297W3(AuthData authData) {
        this.f157239i = authData.accessToken;
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m176298X3(AuthData authData) {
        this.f157239i = authData.accessToken;
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ C22421c m176299Y3(final LiveChatAreaOperationMessage.ChatAreaOperationSiteContainer chatAreaOperationSiteContainer) {
        return (ntp0.m164746d(chatAreaOperationSiteContainer.getJumpLinkItem().getUrl()) && TextUtils.isEmpty(this.f157239i)) ? zrv.f205799a.m207656a().doOnNext(new y20() { // from class: l.mf4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f136591a.m176298X3((AuthData) obj);
            }
        }).map(new qcj() { // from class: l.nf4
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return qf4.m176288L3(chatAreaOperationSiteContainer, (AuthData) obj);
            }
        }) : C22421c.just(chatAreaOperationSiteContainer);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m176300Z3(LiveChatAreaOperationMessage.ChatAreaOperationSiteContainer chatAreaOperationSiteContainer) {
        ((tf4) this.viewModel).m190925m(this.f157239i, chatAreaOperationSiteContainer);
        m176301a4((int) chatAreaOperationSiteContainer.getJumpLinkItem().getShowTime());
    }

    /* JADX INFO: renamed from: a4 */
    public void m176301a4(int i) {
        m176296T3();
        m138852B3(i, TimeUnit.SECONDS, this.f157240j);
    }

    /* JADX INFO: renamed from: b4 */
    public final void m176302b4() {
        duringCreated(zrv.f205799a.m207656a()).subscribe(dhw.m115826e(new y20() { // from class: l.of4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f147037a.m176297W3((AuthData) obj);
            }
        }, new y20() { // from class: l.pf4
            @Override // p153l.y20
            public final void call(Object obj) {
                fhw.m125605a("[live]campaign", "accessOutterToken " + ((Throwable) obj).getMessage());
            }
        }));
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        m138855E3(this.f157240j);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m176302b4();
        duringCreated(m213810E2().m168545q1().m98336x()).flatMap(new qcj() { // from class: l.jf4
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f120560a.m176299Y3((LiveChatAreaOperationMessage.ChatAreaOperationSiteContainer) obj);
            }
        }).filter(new qcj() { // from class: l.kf4
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(this.f126246a.m176295S3((LiveChatAreaOperationMessage.ChatAreaOperationSiteContainer) obj));
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.lf4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f131803a.m176300Z3((LiveChatAreaOperationMessage.ChatAreaOperationSiteContainer) obj);
            }
        }));
    }
}
