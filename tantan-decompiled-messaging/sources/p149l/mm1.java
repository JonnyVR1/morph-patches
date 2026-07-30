package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveFanBase;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.AvatarView;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Collections;
import p133rx.Notification;

/* JADX INFO: loaded from: classes4.dex */
public class mm1 extends bn1<yl40> {

    /* JADX INFO: renamed from: k */
    public BLiveFanBase f134544k;

    /* JADX INFO: renamed from: l */
    public final String f134545l;

    public mm1(bsm bsmVar, AvatarView avatarView) {
        super(bsmVar, avatarView);
        this.f134544k = null;
        this.f134545l = qib0.f154713b0.f139230a.userId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x4 */
    public /* synthetic */ void m155289x4(Throwable th) {
        m102742m4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.bn1
    /* JADX INFO: renamed from: b4 */
    public boolean mo102734b4() {
        if (ypv.f199493a.m199314G()) {
            return ((yl40) m206027E2()).f108743D && ((yl40) m206027E2()).f108741B.f116469b != null;
        }
        return ((yl40) m206027E2()).f108743D;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.bn1
    /* JADX INFO: renamed from: l4 */
    public void mo102741l4(int i) {
        super.mo102741l4(i);
        if (i == 3 && ((yl40) m206027E2()).f108743D) {
            m206028F2().FansClubEvent.showFansClubDialog().mo172463j(Boolean.TRUE);
            m155295z4();
        }
    }

    @Override // p149l.bn1, p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f134544k = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.bn1, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        if (((yl40) m206027E2()).f108743D) {
            if (TextUtils.isEmpty(this.f134545l) || "null".equals(this.f134545l)) {
                CrashHelper.m81296c(new Exception("AvatarLivePresenter getAnchorFanbases"));
            }
            duringCreated(LivingNormalApiProvider.m71580t4(this.f134545l)).map(new w9j() { // from class: l.im1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f113889a.m155292v4((BLiveEnvelope) obj);
                }
            }).subscribe(ffw.m121194e(new e30() { // from class: l.jm1
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f118607a.m155293w4((h4g) obj);
                }
            }, new e30() { // from class: l.km1
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f123730a.m155289x4((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m155290t4(Integer num) {
        ((AvatarView) this.viewModel).m72093B(num.intValue() > 0);
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m155291u4(Notification notification) {
        ((AvatarView) this.viewModel).m72093B(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ h4g m155292v4(BLiveEnvelope bLiveEnvelope) {
        h4g h4gVar = new h4g(bLiveEnvelope.data.fanbases, Collections.EMPTY_LIST);
        ((yl40) m206027E2()).f108741B.f116469b = h4gVar.m129237b();
        return h4gVar;
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m155293w4(h4g h4gVar) {
        this.f134544k = h4gVar.m129237b();
        m102742m4();
        BLiveFanBase bLiveFanBase = this.f134544k;
        if (bLiveFanBase != null) {
            m155294y4(bLiveFanBase.f44363id);
        }
    }

    /* JADX INFO: renamed from: y4 */
    public final void m155294y4(String str) {
        duringCreated(LivingNormalApiProvider.m71301O4(str)).subscribe(ffw.m121197h(new e30() { // from class: l.lm1
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f128766a.m155290t4((Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z4 */
    public final void m155295z4() {
        BLiveFanBase bLiveFanBase = this.f134544k;
        if (bLiveFanBase != null) {
            duringCreated(LivingNormalApiProvider.m71366V6(bLiveFanBase.f44363id)).materialize().subscribe(ffw.m121193d(new e30() { // from class: l.hm1
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f108384a.m155291u4((Notification) obj);
                }
            }));
        }
    }
}
