package p153l;

import android.net.Uri;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.LiveSchema;
import com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.LiveInternalPushView;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes11.dex */
public final class w0n extends a0n<LiveInternalPushView> {
    public w0n(zzm zzmVar) {
        super(zzmVar);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m204209o(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (coreService.code == 41063) {
                o1j0.m165636j(coreService.metaMessage);
                return;
            }
        }
        o1j0.m165634h(R$string.f19698u4);
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: f */
    public void mo38889f() {
        zzm zzmVar = this.f67729a;
        final Act act = zzmVar.f206721m;
        if (act != null) {
            act.duringCreated((C22421c) CoreModule.f18264c.f20384f0.m34181wp(zzmVar.f206719k.messageCustom.extra, false).filter(new qcj() { // from class: l.s0n
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    Envelope envelope = (Envelope) obj;
                    return Boolean.valueOf(NullChecker.m82486a(((CoreData) envelope.getModuleData(CoreData.class)).liveSchemas) && !jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).liveSchemas));
                }
            }).map(new qcj() { // from class: l.t0n
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).liveSchemas.get(0);
                }
            })).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.u0n
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f176916a.m204211q(act, (LiveSchema) obj);
                }
            }, new y20() { // from class: l.v0n
                @Override // p153l.y20
                public final void call(Object obj) {
                    w0n.m204209o((Throwable) obj);
                }
            }));
        }
        String strM222273K = this.f67729a.m222273K();
        if (ji30.m144964h().equals(TabName.Card)) {
            strM222273K = "p_suggest_users_home_view";
        }
        a1n.m95521d(this.f67729a.f206719k, strM222273K);
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: i */
    public void mo38891i(v0t v0tVar) {
        if (v0tVar.isShowing()) {
            v0tVar.dismiss();
        }
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: k */
    public boolean mo38893k() {
        return TabName.Live != ji30.m144964h();
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: l */
    public void mo38894l() {
        String strM222273K = this.f67729a.m222273K();
        if (ji30.m144964h().equals(TabName.Card)) {
            strM222273K = "p_suggest_users_home_view";
        }
        a1n.m95522e(this.f67729a.f206719k, strM222273K);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m204211q(Act act, LiveSchema liveSchema) {
        Uri uri = Uri.parse(liveSchema.schema);
        abe0 abe0VarM96748d = new abe0.C15681a(act, uri.toString()).m96748d();
        if (abe0VarM96748d.m96741d().equals(SchemeKey.officialChannel)) {
            String str = abe0VarM96748d.m96743f().get("liveId");
            if (!TextUtils.isEmpty(str)) {
                a1n.m95523f(str, this.f67729a.f206719k.messageCustom.traceId);
            }
        }
        nae0.m162083m(act, uri);
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void mo38892j(LiveInternalPushView liveInternalPushView) {
        zzm zzmVar = this.f67729a;
        liveInternalPushView.m38875j(zzmVar.f206719k, zzmVar.f206717i.getAct());
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: e */
    public void mo38888e() {
    }
}
