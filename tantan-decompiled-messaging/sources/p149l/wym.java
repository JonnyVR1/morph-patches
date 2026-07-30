package p149l;

import android.net.Uri;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.LiveSchema;
import com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.LiveInternalPushView;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public final class wym extends aym<LiveInternalPushView> {
    public wym(zxm zxmVar) {
        super(zxmVar);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m206113o(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (coreService.code == 41063) {
                lsi0.m151580j(coreService.metaMessage);
                return;
            }
        }
        lsi0.m151578h(R$string.f18903s4);
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: f */
    public void mo37886f() {
        zxm zxmVar = this.f72298a;
        final Act act = zxmVar.f205469m;
        if (act != null) {
            act.duringCreated((C22306c) CoreModule.f17545c.f19642f0.m33178wp(zxmVar.f205467k.messageCustom.extra, false).filter(new w9j() { // from class: l.sym
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    Envelope envelope = (Envelope) obj;
                    return Boolean.valueOf(NullChecker.m81303a(((CoreData) envelope.getModuleData(CoreData.class)).liveSchemas) && !vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).liveSchemas));
                }
            }).map(new w9j() { // from class: l.tym
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).liveSchemas.get(0);
                }
            })).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.uym
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f178876a.m206115q(act, (LiveSchema) obj);
                }
            }, new e30() { // from class: l.vym
                @Override // p149l.e30
                public final void call(Object obj) {
                    wym.m206113o((Throwable) obj);
                }
            }));
        }
        String strM220845K = this.f72298a.m220845K();
        if (v930.m197534h().equals(TabName.Card)) {
            strM220845K = "p_suggest_users_home_view";
        }
        azm.m99718d(this.f72298a.f205467k, strM220845K);
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: i */
    public void mo37888i(uys uysVar) {
        if (uysVar.isShowing()) {
            uysVar.dismiss();
        }
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: k */
    public boolean mo37890k() {
        return TabName.Live != v930.m197534h();
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: l */
    public void mo37891l() {
        String strM220845K = this.f72298a.m220845K();
        if (v930.m197534h().equals(TabName.Card)) {
            strM220845K = "p_suggest_users_home_view";
        }
        azm.m99719e(this.f72298a.f205467k, strM220845K);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m206115q(Act act, LiveSchema liveSchema) {
        Uri uri = Uri.parse(liveSchema.schema);
        w2e0 w2e0VarM201103d = new w2e0.C20787a(act, uri.toString()).m201103d();
        if (w2e0VarM201103d.m201096d().equals(SchemeKey.officialChannel)) {
            String str = w2e0VarM201103d.m201098f().get("liveId");
            if (!TextUtils.isEmpty(str)) {
                azm.m99720f(str, this.f72298a.f205467k.messageCustom.traceId);
            }
        }
        j2e0.m139446m(act, uri);
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void mo37889j(LiveInternalPushView liveInternalPushView) {
        zxm zxmVar = this.f72298a;
        liveInternalPushView.m37872j(zxmVar.f205467k, zxmVar.f205465i.getAct());
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: e */
    public void mo37885e() {
    }
}
