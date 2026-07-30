package p003l;

import android.view.View;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.CoreAssetsSettings;
import com.p1.mobile.putong.core.data.IceBreakingQuestion;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.j760;
import l.jq2;
import l.mkd0;
import l.q860;
import l.szb0;
import l.vwb;
import l.xdl0;
import p014rx.C1099c;
import p028v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class qvy extends jq2<tvy> {

    /* JADX INFO: renamed from: a */
    public final String f6710a;

    /* JADX INFO: renamed from: b */
    public final fcz f6711b;

    /* JADX INFO: renamed from: c */
    public IceBreakingQuestion f6712c;

    /* JADX INFO: renamed from: d */
    public boolean f6713d;

    public qvy(fcz fczVar) {
        super(fczVar);
        this.f6713d = false;
        this.f6711b = fczVar;
        this.f6710a = fczVar.m4295r3();
        C(new tvy());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m7055t0(Throwable th) {
        ((tvy) ((jq2) this).viewModel).m8049d(this.f6711b.m4309t7().f7690t1.mo8075f(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public /* synthetic */ void m7056z0(List list) {
        ((tvy) ((jq2) this).viewModel).m8049d(this.f6711b.m4309t7().f7690t1.mo8075f(), list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A0 */
    public void m7057A0(VDraweeView vDraweeView) {
        j760<Integer, Integer> j760VarMo3122k0 = this.f6711b.m4309t7().mo3122k0();
        if (NullChecker.a(j760VarMo3122k0)) {
            if (vDraweeView.getWidth() == ((Integer) j760VarMo3122k0.a).intValue() && vDraweeView.getHeight() == ((Integer) j760VarMo3122k0.b).intValue()) {
                return;
            }
            xdl0.D0(((Integer) j760VarMo3122k0.a).intValue(), new View[]{vDraweeView});
            xdl0.C0(vDraweeView, ((Integer) j760VarMo3122k0.b).intValue());
        }
    }

    /* JADX INFO: renamed from: C0 */
    public void m7058C0(String str) {
        act().startActivityForResult(CoreModule.P().i().M1(act(), this.f6710a, str, false), 16);
        if ("profile_bubble".equals(str) || "messages_title".equals(str) || "messages_thumbnail_left".equals(str) || "messages_thumbnail_right".equals(str)) {
            act().overridePendingTransition(szb0.e, 0);
        }
    }

    /* JADX INFO: renamed from: D0 */
    public void m7059D0(IceBreakingQuestion iceBreakingQuestion) {
        this.f6712c = iceBreakingQuestion;
    }

    /* JADX INFO: renamed from: a0 */
    public void m7060a0() {
        if (User.isTeamAccount(this.f6710a)) {
            return;
        }
        duringCreated(CoreModule.d.d().take(1).filter(new w9j() { // from class: l.evy
            @Override // p003l.w9j
            public final Object call(Object obj) {
                CoreAssetsSettings coreAssetsSettings = (CoreAssetsSettings) obj;
                return Boolean.valueOf(NullChecker.a(coreAssetsSettings) && coreAssetsSettings.chatGuideExp);
            }
        }).flatMap(new w9j() { // from class: l.hvy
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return this.f4291a.m7064s0((CoreAssetsSettings) obj);
            }
        }).take(1).filter(new w9j() { // from class: l.ivy
            @Override // p003l.w9j
            public final Object call(Object obj) {
                User user = (User) obj;
                return Boolean.valueOf((!user.isFemale() || user.unilateralBlock() || user.onlineMatchLocked()) ? false : true);
            }
        }).flatMap(new w9j() { // from class: l.jvy
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return this.f4743a.m7065u0((User) obj);
            }
        }).take(1).map(new w9j() { // from class: l.kvy
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(vwb.J((List) obj));
            }
        }).flatMap(new w9j() { // from class: l.lvy
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return this.f5433a.m7067y0((Boolean) obj);
            }
        }).filter(new w9j() { // from class: l.mvy
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.J((List) obj));
            }
        }).take(1)).subscribe((m250) mkd0.H(new e30() { // from class: l.nvy
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f5984a.m7056z0((List) obj);
            }
        }, new e30() { // from class: l.ovy
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f6250a.m7055t0((Throwable) obj);
            }
        }));
    }

    @Nullable
    public Act act() {
        return this.f6711b.act();
    }

    /* JADX INFO: renamed from: p0 */
    public String m7061p0() {
        return this.f6710a;
    }

    public String pageId() {
        return this.f6711b.pageId();
    }

    /* JADX INFO: renamed from: q0 */
    public uwl m7062q0() {
        return this.f6711b.m6497e0();
    }

    /* JADX INFO: renamed from: r0 */
    public IceBreakingQuestion m7063r0() {
        return this.f6712c;
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C1099c m7064s0(CoreAssetsSettings coreAssetsSettings) {
        return CoreModule.c.e0.Ka(this.f6710a);
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ C1099c m7065u0(User user) {
        return CoreModule.c.f0.Tn(this.f6710a).map(new w9j() { // from class: l.gvy
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return ((q860) obj).a;
            }
        });
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ C1099c m7066x0(Conversation conversation) {
        return CoreModule.c.f0.Eq(this.f6710a);
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ C1099c m7067y0(Boolean bool) {
        return CoreModule.c.f0.Ne(this.f6710a).take(1).filter(new w9j() { // from class: l.pvy
            @Override // p003l.w9j
            public final Object call(Object obj) {
                Conversation conversation = (Conversation) obj;
                return Boolean.valueOf((TEnum.equals(conversation.status, "blocked") || TEnum.equals(conversation.status, "dismissed")) ? false : true);
            }
        }).flatMap(new w9j() { // from class: l.fvy
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return this.f3737a.m7066x0((Conversation) obj);
            }
        });
    }

    public void destroy() {
    }
}
