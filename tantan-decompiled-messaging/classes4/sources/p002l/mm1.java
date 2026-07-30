package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.AvatarView;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveFanBase;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Collections;
import l.bwr;
import l.e30;
import l.ffw;
import l.h4g;
import l.qib0;
import l.w9j;
import l.ypv;
import rx.Notification;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class mm1 extends bn1<yl40> {

    /* JADX INFO: renamed from: k */
    public BLiveFanBase f15452k;

    /* JADX INFO: renamed from: l */
    public final String f15453l;

    public mm1(bsm bsmVar, AvatarView avatarView) {
        super(bsmVar, avatarView);
        this.f15452k = null;
        this.f15453l = qib0.b0.a.userId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x4 */
    public /* synthetic */ void m18017x4(Throwable th) {
        m10511m4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p002l.bn1
    /* JADX INFO: renamed from: b4 */
    public boolean mo10503b4() {
        if (ypv.a.G()) {
            return ((yl40) m25547E2()).f12143D && ((yl40) m25547E2()).f12141B.f13607b != null;
        }
        return ((yl40) m25547E2()).f12143D;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p002l.bn1
    /* JADX INFO: renamed from: l4 */
    public void mo10510l4(int i) {
        super.mo10510l4(i);
        if (i == 3 && ((yl40) m25547E2()).f12143D) {
            m25548F2().FansClubEvent.showFansClubDialog().j(Boolean.TRUE);
            m18023z4();
        }
    }

    @Override // p002l.bn1, p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        this.f15452k = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p002l.bn1
    /* JADX INFO: renamed from: t */
    public void mo10513t() {
        super.mo10513t();
        if (((yl40) m25547E2()).f12143D) {
            if (TextUtils.isEmpty(this.f15453l) || "null".equals(this.f15453l)) {
                CrashHelper.c(new Exception("AvatarLivePresenter getAnchorFanbases"));
            }
            duringCreated(LivingNormalApiProvider.m4946t4(this.f15453l)).map(new w9j() { // from class: l.im1
                public final Object call(Object obj) {
                    return this.f13301a.m18020v4((BLiveEnvelope) obj);
                }
            }).subscribe(ffw.e(new e30() { // from class: l.jm1
                public final void call(Object obj) {
                    this.f13868a.m18021w4((h4g) obj);
                }
            }, new e30() { // from class: l.km1
                public final void call(Object obj) {
                    this.f14378a.m18017x4((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m18018t4(Integer num) {
        ((AvatarView) ((bwr) this).viewModel).m5564B(num.intValue() > 0);
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m18019u4(Notification notification) {
        ((AvatarView) ((bwr) this).viewModel).m5564B(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ h4g m18020v4(BLiveEnvelope bLiveEnvelope) {
        h4g h4gVar = new h4g(bLiveEnvelope.data.fanbases, Collections.EMPTY_LIST);
        ((yl40) m25547E2()).f12141B.f13607b = h4gVar.b();
        return h4gVar;
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m18021w4(h4g h4gVar) {
        this.f15452k = h4gVar.b();
        m10511m4();
        BLiveFanBase bLiveFanBase = this.f15452k;
        if (bLiveFanBase != null) {
            m18022y4(bLiveFanBase.id);
        }
    }

    /* JADX INFO: renamed from: y4 */
    public final void m18022y4(String str) {
        duringCreated(LivingNormalApiProvider.m4667O4(str)).subscribe(ffw.h(new e30() { // from class: l.lm1
            public final void call(Object obj) {
                this.f14950a.m18018t4((Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z4 */
    public final void m18023z4() {
        BLiveFanBase bLiveFanBase = this.f15452k;
        if (bLiveFanBase != null) {
            duringCreated(LivingNormalApiProvider.m4732V6(bLiveFanBase.id)).materialize().subscribe(ffw.d(new e30() { // from class: l.hm1
                public final void call(Object obj) {
                    this.f12107a.m18019u4((Notification) obj);
                }
            }));
        }
    }
}
