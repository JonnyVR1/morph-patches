package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.QuickChatPartyCampaignPage;
import com.p046p1.mobile.putong.core.data.QuickChatPartyInvitation;
import com.p046p1.mobile.putong.core.data.QuickChatPartyType;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.party.AudioQuickChatPartyJoinInDialogView;
import com.p046p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class exb0 {

    /* JADX INFO: renamed from: c */
    public static volatile exb0 f93590c;

    /* JADX INFO: renamed from: a */
    public QuickChatPartyInvitation f93591a;

    /* JADX INFO: renamed from: b */
    public boolean f93592b;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m118580a(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m118584e(Throwable th) {
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m118585f(Act act, Envelope envelope) {
        if (NullChecker.m81303a(envelope)) {
            CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
            if (NullChecker.m81303a(coreData) && NullChecker.m81303a(coreData.campaignPage)) {
                QuickChatPartyCampaignPage quickChatPartyCampaignPage = coreData.campaignPage;
                if (quickChatPartyCampaignPage.show) {
                    ec1.m115652U(act, quickChatPartyCampaignPage);
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static exb0 m118586i() {
        if (f93590c == null) {
            synchronized (exb0.class) {
                try {
                    if (f93590c == null) {
                        f93590c = new exb0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f93590c;
    }

    /* JADX INFO: renamed from: g */
    public void m118587g(@NonNull final Act act, @NonNull QuickChatPartyType quickChatPartyType) {
        act.duringCreated(CoreModule.f17545c.f19653i2.m127916h3(quickChatPartyType)).subscribe(mkd0.m154956H(new e30() { // from class: l.ywb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f200465a.m118590k(act, (roj0) obj);
            }
        }, new e30() { // from class: l.zwb0
            @Override // p149l.e30
            public final void call(Object obj) {
                osi0.m165783g("网路异常，报名失败，请稍后再试");
            }
        }));
    }

    /* JADX INFO: renamed from: h */
    public void m118588h(final Act act) {
        act.duringCreated(CoreModule.f17545c.f19653i2.m127918j3()).subscribe(mkd0.m154956H(new e30() { // from class: l.axb0
            @Override // p149l.e30
            public final void call(Object obj) {
                exb0.m118585f(act, (Envelope) obj);
            }
        }, new e30() { // from class: l.bxb0
            @Override // p149l.e30
            public final void call(Object obj) {
                exb0.m118584e((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j */
    public void m118589j() {
        CoreModule.f17545c.f19653i2.m127919k3().subscribe(mkd0.m154956H(new e30() { // from class: l.cxb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f82868a.m118591l((Envelope) obj);
            }
        }, new e30() { // from class: l.dxb0
            @Override // p149l.e30
            public final void call(Object obj) {
                exb0.m118580a((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m118590k(Act act, roj0 roj0Var) {
        m118593n(act, this.f93591a);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m118591l(Envelope envelope) {
        if (NullChecker.m81303a(envelope)) {
            CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
            if (NullChecker.m81303a(coreData)) {
                this.f93591a = coreData.invitation;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m118593n(Act act, QuickChatPartyInvitation quickChatPartyInvitation) {
        View viewInflate = LayoutInflater.from(act).inflate(f6c0.f95442L, (ViewGroup) null);
        if (viewInflate instanceof AudioQuickChatPartyJoinInDialogView) {
            ((AudioQuickChatPartyJoinInDialogView) viewInflate).m54551h(act, quickChatPartyInvitation);
        }
        dd80 dd80VarM110960O = act.newDialog().m110963R(viewInflate).m110973b0("知道了").m110960O();
        dd80VarM110960O.setCanceledOnTouchOutside(false);
        dd80VarM110960O.show();
    }

    /* JADX INFO: renamed from: m */
    public void m118592m(@NonNull Act act, @NonNull QuickChatPartyType quickChatPartyType) {
    }
}
