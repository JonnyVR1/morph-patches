package p153l;

import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.CoreAssetsSettings;
import com.p051p1.mobile.putong.core.data.IceBreakingQuestion;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p137rx.C22421c;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class n4z extends ar2<q4z> {

    /* JADX INFO: renamed from: a */
    public final String f140265a;

    /* JADX INFO: renamed from: b */
    public final clz f140266b;

    /* JADX INFO: renamed from: c */
    public IceBreakingQuestion f140267c;

    /* JADX INFO: renamed from: d */
    public boolean f140268d;

    public n4z(clz clzVar) {
        super(clzVar);
        this.f140268d = false;
        this.f140266b = clzVar;
        this.f140265a = clzVar.mo111034r3();
        mo52715C(new q4z());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m161617t0(Throwable th) {
        ((q4z) this.viewModel).m175279d(this.f140266b.m111048t7().f160421t1.mo175738f(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public /* synthetic */ void m161618z0(List list) {
        ((q4z) this.viewModel).m175279d(this.f140266b.m111048t7().f160421t1.mo175738f(), list);
    }

    /* JADX INFO: renamed from: A0 */
    public void m161619A0(VDraweeView vDraweeView) {
        pf60<Integer, Integer> pf60VarMo178955k0 = this.f140266b.m111048t7().mo178955k0();
        if (NullChecker.m82486a(pf60VarMo178955k0)) {
            if (vDraweeView.getWidth() == pf60VarMo178955k0.f152156a.intValue() && vDraweeView.getHeight() == pf60VarMo178955k0.f152157b.intValue()) {
                return;
            }
            bnl0.m105507D0(pf60VarMo178955k0.f152156a.intValue(), vDraweeView);
            bnl0.m105505C0(vDraweeView, pf60VarMo178955k0.f152157b.intValue());
        }
    }

    /* JADX INFO: renamed from: C0 */
    public void m161620C0(String str) {
        act().startActivityForResult(CoreModule.m30933P().m143412i().mo180360M1(act(), this.f140265a, str, false), 16);
        if ("profile_bubble".equals(str) || "messages_title".equals(str) || "messages_thumbnail_left".equals(str) || "messages_thumbnail_right".equals(str)) {
            act().overridePendingTransition(y7c0.f197767e, 0);
        }
    }

    /* JADX INFO: renamed from: D0 */
    public void m161621D0(IceBreakingQuestion iceBreakingQuestion) {
        this.f140267c = iceBreakingQuestion;
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        if (User.isTeamAccount(this.f140265a)) {
            return;
        }
        duringCreated(CoreModule.f18265d.m144642d().take(1).filter(new qcj() { // from class: l.b4z
            @Override // p153l.qcj
            public final Object call(Object obj) {
                CoreAssetsSettings coreAssetsSettings = (CoreAssetsSettings) obj;
                return Boolean.valueOf(NullChecker.m82486a(coreAssetsSettings) && coreAssetsSettings.chatGuideExp);
            }
        }).flatMap(new qcj() { // from class: l.e4z
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f92167a.m161625s0((CoreAssetsSettings) obj);
            }
        }).take(1).filter(new qcj() { // from class: l.f4z
            @Override // p153l.qcj
            public final Object call(Object obj) {
                User user = (User) obj;
                return Boolean.valueOf((!user.isFemale() || user.unilateralBlock() || user.onlineMatchLocked()) ? false : true);
            }
        }).flatMap(new qcj() { // from class: l.g4z
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f102207a.m161626u0((User) obj);
            }
        }).take(1).map(new h4z()).flatMap(new qcj() { // from class: l.i4z
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f112954a.m161628y0((Boolean) obj);
            }
        }).filter(new qcj() { // from class: l.j4z
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!jyb.m147479J((List) obj));
            }
        }).take(1)).subscribe(psd0.m173597H(new y20() { // from class: l.k4z
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123951a.m161618z0((List) obj);
            }
        }, new y20() { // from class: l.l4z
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f130030a.m161617t0((Throwable) obj);
            }
        }));
    }

    @Override // p153l.ar2
    @Nullable
    public Act act() {
        return this.f140266b.act();
    }

    /* JADX INFO: renamed from: p0 */
    public String m161622p0() {
        return this.f140265a;
    }

    public String pageId() {
        return this.f140266b.pageId();
    }

    /* JADX INFO: renamed from: q0 */
    public mzl m161623q0() {
        return this.f140266b.m143372e0();
    }

    /* JADX INFO: renamed from: r0 */
    public IceBreakingQuestion m161624r0() {
        return this.f140267c;
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C22421c m161625s0(CoreAssetsSettings coreAssetsSettings) {
        return CoreModule.f18264c.f20381e0.m116483Ka(this.f140265a);
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ C22421c m161626u0(User user) {
        return CoreModule.f18264c.f20384f0.m33820Tn(this.f140265a).map(new qcj() { // from class: l.d4z
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((vg60) obj).f184001a;
            }
        });
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ C22421c m161627x0(Conversation conversation) {
        return CoreModule.f18264c.f20384f0.m33642Eq(this.f140265a);
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ C22421c m161628y0(Boolean bool) {
        return CoreModule.f18264c.f20384f0.m33740Ne(this.f140265a).take(1).filter(new qcj() { // from class: l.m4z
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Conversation conversation = (Conversation) obj;
                return Boolean.valueOf((TEnum.equals(conversation.status, "blocked") || TEnum.equals(conversation.status, "dismissed")) ? false : true);
            }
        }).flatMap(new qcj() { // from class: l.c4z
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f79745a.m161627x0((Conversation) obj);
            }
        });
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
