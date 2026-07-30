package p149l;

import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.CoreAssetsSettings;
import com.p046p1.mobile.putong.core.data.IceBreakingQuestion;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p133rx.C22306c;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes3.dex */
public class qvy extends jq2<tvy> {

    /* JADX INFO: renamed from: a */
    public final String f156641a;

    /* JADX INFO: renamed from: b */
    public final fcz f156642b;

    /* JADX INFO: renamed from: c */
    public IceBreakingQuestion f156643c;

    /* JADX INFO: renamed from: d */
    public boolean f156644d;

    public qvy(fcz fczVar) {
        super(fczVar);
        this.f156644d = false;
        this.f156642b = fczVar;
        this.f156641a = fczVar.mo120828r3();
        mo51532C(new tvy());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m176722t0(Throwable th) {
        ((tvy) this.viewModel).m190824d(this.f156642b.m120842t7().f171758t1.mo191242f(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public /* synthetic */ void m176723z0(List list) {
        ((tvy) this.viewModel).m190824d(this.f156642b.m120842t7().f171758t1.mo191242f(), list);
    }

    /* JADX INFO: renamed from: A0 */
    public void m176724A0(VDraweeView vDraweeView) {
        j760<Integer, Integer> j760VarMo103242k0 = this.f156642b.m120842t7().mo103242k0();
        if (NullChecker.m81303a(j760VarMo103242k0)) {
            if (vDraweeView.getWidth() == j760VarMo103242k0.f116564a.intValue() && vDraweeView.getHeight() == j760VarMo103242k0.f116565b.intValue()) {
                return;
            }
            xdl0.m208327D0(j760VarMo103242k0.f116564a.intValue(), vDraweeView);
            xdl0.m208325C0(vDraweeView, j760VarMo103242k0.f116565b.intValue());
        }
    }

    /* JADX INFO: renamed from: C0 */
    public void m176725C0(String str) {
        act().startActivityForResult(CoreModule.m29935P().m94658i().mo158268M1(act(), this.f156641a, str, false), 16);
        if ("profile_bubble".equals(str) || "messages_title".equals(str) || "messages_thumbnail_left".equals(str) || "messages_thumbnail_right".equals(str)) {
            act().overridePendingTransition(szb0.f167030e, 0);
        }
    }

    /* JADX INFO: renamed from: D0 */
    public void m176726D0(IceBreakingQuestion iceBreakingQuestion) {
        this.f156643c = iceBreakingQuestion;
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        if (User.isTeamAccount(this.f156641a)) {
            return;
        }
        duringCreated(CoreModule.f17546d.m95174d().take(1).filter(new w9j() { // from class: l.evy
            @Override // p149l.w9j
            public final Object call(Object obj) {
                CoreAssetsSettings coreAssetsSettings = (CoreAssetsSettings) obj;
                return Boolean.valueOf(NullChecker.m81303a(coreAssetsSettings) && coreAssetsSettings.chatGuideExp);
            }
        }).flatMap(new w9j() { // from class: l.hvy
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f109708a.m176730s0((CoreAssetsSettings) obj);
            }
        }).take(1).filter(new w9j() { // from class: l.ivy
            @Override // p149l.w9j
            public final Object call(Object obj) {
                User user = (User) obj;
                return Boolean.valueOf((!user.isFemale() || user.unilateralBlock() || user.onlineMatchLocked()) ? false : true);
            }
        }).flatMap(new w9j() { // from class: l.jvy
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f120003a.m176731u0((User) obj);
            }
        }).take(1).map(new kvy()).flatMap(new w9j() { // from class: l.lvy
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f130216a.m176733y0((Boolean) obj);
            }
        }).filter(new w9j() { // from class: l.mvy
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m200296J((List) obj));
            }
        }).take(1)).subscribe(mkd0.m154956H(new e30() { // from class: l.nvy
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f140857a.m176723z0((List) obj);
            }
        }, new e30() { // from class: l.ovy
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f145893a.m176722t0((Throwable) obj);
            }
        }));
    }

    @Override // p149l.jq2
    @Nullable
    public Act act() {
        return this.f156642b.act();
    }

    /* JADX INFO: renamed from: p0 */
    public String m176727p0() {
        return this.f156641a;
    }

    public String pageId() {
        return this.f156642b.pageId();
    }

    /* JADX INFO: renamed from: q0 */
    public uwl m176728q0() {
        return this.f156642b.m156455e0();
    }

    /* JADX INFO: renamed from: r0 */
    public IceBreakingQuestion m176729r0() {
        return this.f156643c;
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C22306c m176730s0(CoreAssetsSettings coreAssetsSettings) {
        return CoreModule.f17545c.f19639e0.m169410Ka(this.f156641a);
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ C22306c m176731u0(User user) {
        return CoreModule.f17545c.f19642f0.m32817Tn(this.f156641a).map(new w9j() { // from class: l.gvy
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((q860) obj).f153135a;
            }
        });
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ C22306c m176732x0(Conversation conversation) {
        return CoreModule.f17545c.f19642f0.m32639Eq(this.f156641a);
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ C22306c m176733y0(Boolean bool) {
        return CoreModule.f17545c.f19642f0.m32737Ne(this.f156641a).take(1).filter(new w9j() { // from class: l.pvy
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Conversation conversation = (Conversation) obj;
                return Boolean.valueOf((TEnum.equals(conversation.status, "blocked") || TEnum.equals(conversation.status, "dismissed")) ? false : true);
            }
        }).flatMap(new w9j() { // from class: l.fvy
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f99485a.m176732x0((Conversation) obj);
            }
        });
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
