package p009l;

import android.net.Uri;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.newui.home.bubble.internalpush.LiveInternalPushView;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.LiveSchema;
import com.p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.j2e0;
import l.jo0;
import l.lsi0;
import l.mkd0;
import l.v930;
import l.vwb;
import l.w2e0;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public final class wym extends aym<LiveInternalPushView> {
    public wym(zxm zxmVar) {
        super(zxmVar);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m24584o(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (coreService.code == 41063) {
                lsi0.j(coreService.metaMessage);
                return;
            }
        }
        lsi0.h(R.string.s4);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ LiveSchema m24585p(Envelope envelope) {
        return (LiveSchema) envelope.getModuleData(CoreData.class).liveSchemas.get(0);
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: f */
    public void mo1857f() {
        zxm zxmVar = this.f9776a;
        final Act act = zxmVar.f24027m;
        if (act != null) {
            act.duringCreated(CoreModule.c.f0.wp(zxmVar.f24025k.messageCustom.extra, false).filter(new w9j() { // from class: l.sym
                public final Object call(Object obj) {
                    Envelope envelope = (Envelope) obj;
                    return Boolean.valueOf(NullChecker.a(envelope.getModuleData(CoreData.class).liveSchemas) && !vwb.J(envelope.getModuleData(CoreData.class).liveSchemas));
                }
            }).map(new w9j() { // from class: l.tym
                public final Object call(Object obj) {
                    return wym.m24585p((Envelope) obj);
                }
            })).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.uym
                public final void call(Object obj) {
                    this.f21370a.m24586q(act, (LiveSchema) obj);
                }
            }, new e30() { // from class: l.vym
                public final void call(Object obj) {
                    wym.m24584o((Throwable) obj);
                }
            }));
        }
        String strM26112K = this.f9776a.m26112K();
        if (v930.h().equals(TabName.Card)) {
            strM26112K = "p_suggest_users_home_view";
        }
        azm.m11791d(this.f9776a.f24025k, strM26112K);
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: i */
    public void mo1859i(uys uysVar) {
        if (uysVar.isShowing()) {
            uysVar.dismiss();
        }
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: k */
    public boolean mo1861k() {
        return TabName.Live != v930.h();
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: l */
    public void mo1862l() {
        String strM26112K = this.f9776a.m26112K();
        if (v930.h().equals(TabName.Card)) {
            strM26112K = "p_suggest_users_home_view";
        }
        azm.m11792e(this.f9776a.f24025k, strM26112K);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m24586q(Act act, LiveSchema liveSchema) {
        Uri uri = Uri.parse(liveSchema.schema);
        w2e0 w2e0VarD = new w2e0.a(act, uri.toString()).d();
        if (w2e0VarD.d().equals("officialChannel")) {
            String str = (String) w2e0VarD.f().get("liveId");
            if (!TextUtils.isEmpty(str)) {
                azm.m11793f(str, this.f9776a.f24025k.messageCustom.traceId);
            }
        }
        j2e0.m(act, uri);
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void mo1860j(LiveInternalPushView liveInternalPushView) {
        zxm zxmVar = this.f9776a;
        liveInternalPushView.m1843j(zxmVar.f24025k, zxmVar.f24023i.act());
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: e */
    public void mo1856e() {
    }
}
