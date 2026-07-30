package p006l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.quickaudio.party.AudioQuickChatPartyJoinInDialogView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.QuickChatPartyCampaignPage;
import com.p1.mobile.putong.core.data.QuickChatPartyInvitation;
import com.p1.mobile.putong.core.data.QuickChatPartyType;
import com.p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.NullChecker;
import l.dd80;
import l.e30;
import l.mkd0;
import l.osi0;
import l.roj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class exb0 {

    /* JADX INFO: renamed from: c */
    public static volatile exb0 f11490c;

    /* JADX INFO: renamed from: a */
    public QuickChatPartyInvitation f11491a;

    /* JADX INFO: renamed from: b */
    public boolean f11492b;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m14905a(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m14909e(Throwable th) {
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m14910f(Act act, Envelope envelope) {
        if (NullChecker.a(envelope)) {
            CoreData moduleData = envelope.getModuleData(CoreData.class);
            if (NullChecker.a(moduleData) && NullChecker.a(moduleData.campaignPage)) {
                QuickChatPartyCampaignPage quickChatPartyCampaignPage = moduleData.campaignPage;
                if (quickChatPartyCampaignPage.show) {
                    ec1.m14447U(act, quickChatPartyCampaignPage);
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static exb0 m14911i() {
        if (f11490c == null) {
            synchronized (exb0.class) {
                try {
                    if (f11490c == null) {
                        f11490c = new exb0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f11490c;
    }

    /* JADX INFO: renamed from: g */
    public void m14912g(@NonNull final Act act, @NonNull QuickChatPartyType quickChatPartyType) {
        act.duringCreated(CoreModule.f1534c.f3642i2.m15978h3(quickChatPartyType)).subscribe(mkd0.H(new e30() { // from class: l.ywb0
            public final void call(Object obj) {
                this.f28434a.m14915k(act, (roj0) obj);
            }
        }, new e30() { // from class: l.zwb0
            public final void call(Object obj) {
                osi0.g("网路异常，报名失败，请稍后再试");
            }
        }));
    }

    /* JADX INFO: renamed from: h */
    public void m14913h(final Act act) {
        act.duringCreated(CoreModule.f1534c.f3642i2.m15980j3()).subscribe(mkd0.H(new e30() { // from class: l.axb0
            public final void call(Object obj) {
                exb0.m14910f(act, (Envelope) obj);
            }
        }, new e30() { // from class: l.bxb0
            public final void call(Object obj) {
                exb0.m14909e((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j */
    public void m14914j() {
        CoreModule.f1534c.f3642i2.m15981k3().subscribe(mkd0.H(new e30() { // from class: l.cxb0
            public final void call(Object obj) {
                this.f9902a.m14916l((Envelope) obj);
            }
        }, new e30() { // from class: l.dxb0
            public final void call(Object obj) {
                exb0.m14905a((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m14915k(Act act, roj0 roj0Var) {
        m14918n(act, this.f11491a);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m14916l(Envelope envelope) {
        if (NullChecker.a(envelope)) {
            CoreData moduleData = envelope.getModuleData(CoreData.class);
            if (NullChecker.a(moduleData)) {
                this.f11491a = moduleData.invitation;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m14918n(Act act, QuickChatPartyInvitation quickChatPartyInvitation) {
        View viewInflate = LayoutInflater.from(act).inflate(f6c0.f11856L, (ViewGroup) null);
        if (viewInflate instanceof AudioQuickChatPartyJoinInDialogView) {
            ((AudioQuickChatPartyJoinInDialogView) viewInflate).m7894h(act, quickChatPartyInvitation);
        }
        dd80 dd80VarO = act.newDialog().R(viewInflate).b0("知道了").O();
        dd80VarO.setCanceledOnTouchOutside(false);
        dd80VarO.show();
    }

    /* JADX INFO: renamed from: m */
    public void m14917m(@NonNull Act act, @NonNull QuickChatPartyType quickChatPartyType) {
    }
}
