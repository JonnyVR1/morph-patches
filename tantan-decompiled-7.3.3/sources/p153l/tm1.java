package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveFanBase;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.AvatarView;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Collections;
import p137rx.Notification;

/* JADX INFO: loaded from: classes4.dex */
public class tm1 extends in1<mu40> {

    /* JADX INFO: renamed from: k */
    public BLiveFanBase f174875k;

    /* JADX INFO: renamed from: l */
    public final String f174876l;

    public tm1(dum dumVar, AvatarView avatarView) {
        super(dumVar, avatarView);
        this.f174875k = null;
        this.f174876l = uqb0.f180396b0.f170324a.userId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x4 */
    public /* synthetic */ void m191708x4(Throwable th) {
        m141030m4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.in1
    /* JADX INFO: renamed from: b4 */
    public boolean mo141022b4() {
        if (zrv.f205799a.m207636G()) {
            return ((mu40) m213810E2()).f148256D && ((mu40) m213810E2()).f148254B.f192716b != null;
        }
        return ((mu40) m213810E2()).f148256D;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.in1
    /* JADX INFO: renamed from: l4 */
    public void mo141029l4(int i) {
        super.mo141029l4(i);
        if (i == 3 && ((mu40) m213810E2()).f148256D) {
            m213811F2().FansClubEvent.showFansClubDialog().mo199273j(Boolean.TRUE);
            m191714z4();
        }
    }

    @Override // p153l.in1, p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f174875k = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.in1, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        if (((mu40) m213810E2()).f148256D) {
            if (TextUtils.isEmpty(this.f174876l) || "null".equals(this.f174876l)) {
                CrashHelper.m82479c(new Exception("AvatarLivePresenter getAnchorFanbases"));
            }
            duringCreated(LivingNormalApiProvider.m72763t4(this.f174876l)).map(new qcj() { // from class: l.pm1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f153115a.m191711v4((BLiveEnvelope) obj);
                }
            }).subscribe(dhw.m115826e(new y20() { // from class: l.qm1
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f158290a.m191712w4((v5g) obj);
                }
            }, new y20() { // from class: l.rm1
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f163818a.m191708x4((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m191709t4(Integer num) {
        ((AvatarView) this.viewModel).m73276B(num.intValue() > 0);
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m191710u4(Notification notification) {
        ((AvatarView) this.viewModel).m73276B(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ v5g m191711v4(BLiveEnvelope bLiveEnvelope) {
        v5g v5gVar = new v5g(bLiveEnvelope.data.fanbases, Collections.EMPTY_LIST);
        ((mu40) m213810E2()).f148254B.f192716b = v5gVar.m199846b();
        return v5gVar;
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m191712w4(v5g v5gVar) {
        this.f174875k = v5gVar.m199846b();
        m141030m4();
        BLiveFanBase bLiveFanBase = this.f174875k;
        if (bLiveFanBase != null) {
            m191713y4(bLiveFanBase.f45211id);
        }
    }

    /* JADX INFO: renamed from: y4 */
    public final void m191713y4(String str) {
        duringCreated(LivingNormalApiProvider.m72484O4(str)).subscribe(dhw.m115829h(new y20() { // from class: l.sm1
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f169483a.m191709t4((Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z4 */
    public final void m191714z4() {
        BLiveFanBase bLiveFanBase = this.f174875k;
        if (bLiveFanBase != null) {
            duringCreated(LivingNormalApiProvider.m72549V6(bLiveFanBase.f45211id)).materialize().subscribe(dhw.m115825d(new y20() { // from class: l.om1
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f147890a.m191710u4((Notification) obj);
                }
            }));
        }
    }
}
