package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.QuickChatPartyCampaignPage;
import com.p051p1.mobile.putong.core.data.QuickChatPartyInvitation;
import com.p051p1.mobile.putong.core.data.QuickChatPartyType;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.party.AudioQuickChatPartyJoinInDialogView;
import com.p051p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class i5c0 {

    /* JADX INFO: renamed from: c */
    public static volatile i5c0 f113027c;

    /* JADX INFO: renamed from: a */
    public QuickChatPartyInvitation f113028a;

    /* JADX INFO: renamed from: b */
    public boolean f113029b;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m138644a(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m138648e(Throwable th) {
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m138649f(Act act, Envelope envelope) {
        if (NullChecker.m82486a(envelope)) {
            CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
            if (NullChecker.m82486a(coreData) && NullChecker.m82486a(coreData.campaignPage)) {
                QuickChatPartyCampaignPage quickChatPartyCampaignPage = coreData.campaignPage;
                if (quickChatPartyCampaignPage.show) {
                    lc1.m153613U(act, quickChatPartyCampaignPage);
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static i5c0 m138650i() {
        if (f113027c == null) {
            synchronized (i5c0.class) {
                try {
                    if (f113027c == null) {
                        f113027c = new i5c0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f113027c;
    }

    /* JADX INFO: renamed from: g */
    public void m138651g(@NonNull final Act act, @NonNull QuickChatPartyType quickChatPartyType) {
        act.duringCreated(CoreModule.f18264c.f20395i2.m188006h3(quickChatPartyType)).subscribe(psd0.m173597H(new y20() { // from class: l.c5c0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f79842a.m138654k(act, (uxj0) obj);
            }
        }, new y20() { // from class: l.d5c0
            @Override // p153l.y20
            public final void call(Object obj) {
                r1j0.m179420g("网路异常，报名失败，请稍后再试");
            }
        }));
    }

    /* JADX INFO: renamed from: h */
    public void m138652h(final Act act) {
        act.duringCreated(CoreModule.f18264c.f20395i2.m188008j3()).subscribe(psd0.m173597H(new y20() { // from class: l.e5c0
            @Override // p153l.y20
            public final void call(Object obj) {
                i5c0.m138649f(act, (Envelope) obj);
            }
        }, new y20() { // from class: l.f5c0
            @Override // p153l.y20
            public final void call(Object obj) {
                i5c0.m138648e((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j */
    public void m138653j() {
        CoreModule.f18264c.f20395i2.m188009k3().subscribe(psd0.m173597H(new y20() { // from class: l.g5c0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f102306a.m138655l((Envelope) obj);
            }
        }, new y20() { // from class: l.h5c0
            @Override // p153l.y20
            public final void call(Object obj) {
                i5c0.m138644a((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m138654k(Act act, uxj0 uxj0Var) {
        m138657n(act, this.f113028a);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m138655l(Envelope envelope) {
        if (NullChecker.m82486a(envelope)) {
            CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
            if (NullChecker.m82486a(coreData)) {
                this.f113028a = coreData.invitation;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m138657n(Act act, QuickChatPartyInvitation quickChatPartyInvitation) {
        View viewInflate = LayoutInflater.from(act).inflate(kec0.f125496L, (ViewGroup) null);
        if (viewInflate instanceof AudioQuickChatPartyJoinInDialogView) {
            ((AudioQuickChatPartyJoinInDialogView) viewInflate).m55734h(act, quickChatPartyInvitation);
        }
        jl80 jl80VarM146020O = act.newDialog().m146023R(viewInflate).m146033b0("知道了").m146020O();
        jl80VarM146020O.setCanceledOnTouchOutside(false);
        jl80VarM146020O.show();
    }

    /* JADX INFO: renamed from: m */
    public void m138656m(@NonNull Act act, @NonNull QuickChatPartyType quickChatPartyType) {
    }
}
