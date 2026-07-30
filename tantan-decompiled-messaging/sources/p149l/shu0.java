package p149l;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.cosmos.photon.push.thirdparty.ThirdPushManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class shu0 extends ucs0 {

    /* JADX INFO: renamed from: a */
    public final Context f164645a;

    /* JADX INFO: renamed from: b */
    public final ocu0 f164646b;

    /* JADX INFO: renamed from: c */
    public udu0 f164647c;

    /* JADX INFO: renamed from: d */
    public ccu0 f164648d;

    public shu0(Context context, ocu0 ocu0Var, udu0 udu0Var, ccu0 ccu0Var) {
        this.f164645a = context;
        this.f164646b = ocu0Var;
        this.f164647c = udu0Var;
        this.f164648d = ccu0Var;
    }

    @Override // p149l.vcs0
    /* JADX INFO: renamed from: B */
    public final ubs0 mo184269B(String str) {
        return (ubs0) this.f164646b.m163578U().get(str);
    }

    @Override // p149l.vcs0
    /* JADX INFO: renamed from: H */
    public final boolean mo184270H(uyl uylVar) {
        udu0 udu0Var;
        Object objM181847P2 = s050.m181847P2(uylVar);
        if (!(objM181847P2 instanceof ViewGroup) || (udu0Var = this.f164647c) == null || !udu0Var.m193162f((ViewGroup) objM181847P2)) {
            return false;
        }
        this.f164646b.m163591d0().mo13655F(m184275q8("_videoMediaView"));
        return true;
    }

    @Override // p149l.vcs0
    /* JADX INFO: renamed from: a */
    public final boolean mo184271a() {
        ccu0 ccu0Var = this.f164648d;
        return (ccu0Var == null || ccu0Var.m106159D()) && this.f164646b.m163593e0() != null && this.f164646b.m163595f0() == null;
    }

    @Override // p149l.vcs0
    /* JADX INFO: renamed from: c5 */
    public final void mo184272c5(uyl uylVar) {
        ccu0 ccu0Var;
        Object objM181847P2 = s050.m181847P2(uylVar);
        if (!(objM181847P2 instanceof View) || this.f164646b.m163598h0() == null || (ccu0Var = this.f164648d) == null) {
            return;
        }
        ccu0Var.m106191q((View) objM181847P2);
    }

    @Override // p149l.vcs0
    /* JADX INFO: renamed from: d4 */
    public final String mo184273d4(String str) {
        return (String) this.f164646b.m163579V().get(str);
    }

    @Override // p149l.vcs0
    /* JADX INFO: renamed from: o0 */
    public final boolean mo184274o0(uyl uylVar) {
        udu0 udu0Var;
        Object objM181847P2 = s050.m181847P2(uylVar);
        if (!(objM181847P2 instanceof ViewGroup) || (udu0Var = this.f164647c) == null || !udu0Var.m193163g((ViewGroup) objM181847P2)) {
            return false;
        }
        this.f164646b.m163595f0().mo13655F(m184275q8("_videoMediaView"));
        return true;
    }

    /* JADX INFO: renamed from: q8 */
    public final jbs0 m184275q8(String str) {
        return new rhu0(this, "_videoMediaView");
    }

    @Override // p149l.vcs0
    /* JADX INFO: renamed from: v */
    public final void mo184276v(String str) {
        ccu0 ccu0Var = this.f164648d;
        if (ccu0Var != null) {
            ccu0Var.m106187m(str);
        }
    }

    @Override // p149l.vcs0
    public final fgu0 zze() {
        return this.f164646b.m163580W();
    }

    @Override // p149l.vcs0
    public final rbs0 zzf() throws RemoteException {
        try {
            return this.f164648d.m106169O().m115753a();
        } catch (NullPointerException e) {
            vny0.m199079q().m212290w(e, "InternalNativeCustomTemplateAdShim.getMediaContent");
            return null;
        }
    }

    @Override // p149l.vcs0
    public final uyl zzh() {
        return s050.m181848Y2(this.f164645a);
    }

    @Override // p149l.vcs0
    public final String zzi() {
        return this.f164646b.m163584a();
    }

    @Override // p149l.vcs0
    public final List zzk() {
        try {
            hgf0 hgf0VarM163578U = this.f164646b.m163578U();
            hgf0 hgf0VarM163579V = this.f164646b.m163579V();
            String[] strArr = new String[hgf0VarM163578U.size() + hgf0VarM163579V.size()];
            int i = 0;
            for (int i2 = 0; i2 < hgf0VarM163578U.size(); i2++) {
                strArr[i] = (String) hgf0VarM163578U.m130823i(i2);
                i++;
            }
            for (int i3 = 0; i3 < hgf0VarM163579V.size(); i3++) {
                strArr[i] = (String) hgf0VarM163579V.m130823i(i3);
                i++;
            }
            return Arrays.asList(strArr);
        } catch (NullPointerException e) {
            vny0.m199079q().m212290w(e, "InternalNativeCustomTemplateAdShim.getAvailableAssetNames");
            return new ArrayList();
        }
    }

    @Override // p149l.vcs0
    public final void zzl() {
        ccu0 ccu0Var = this.f164648d;
        if (ccu0Var != null) {
            ccu0Var.mo106177b();
        }
        this.f164648d = null;
        this.f164647c = null;
    }

    @Override // p149l.vcs0
    public final void zzm() {
        try {
            String strM163588c = this.f164646b.m163588c();
            if (Objects.equals(strM163588c, ThirdPushManager.VENDOR_TYPE_FCM)) {
                x2t0.m206869g("Illegal argument specified for omid partner name.");
                return;
            }
            if (TextUtils.isEmpty(strM163588c)) {
                x2t0.m206869g("Not starting OMID session. OM partner name has not been configured.");
                return;
            }
            ccu0 ccu0Var = this.f164648d;
            if (ccu0Var != null) {
                ccu0Var.m106170R(strM163588c, false);
            }
        } catch (NullPointerException e) {
            vny0.m199079q().m212290w(e, "InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement");
        }
    }

    @Override // p149l.vcs0
    public final void zzo() {
        ccu0 ccu0Var = this.f164648d;
        if (ccu0Var != null) {
            ccu0Var.m106190p();
        }
    }

    @Override // p149l.vcs0
    public final boolean zzt() {
        b6w0 b6w0VarM163598h0 = this.f164646b.m163598h0();
        if (b6w0VarM163598h0 == null) {
            x2t0.m206869g("Trying to start OMID session before creation.");
            return false;
        }
        vny0.m199063a().mo109959h(b6w0VarM163598h0);
        if (this.f164646b.m163593e0() == null) {
            return true;
        }
        this.f164646b.m163593e0().mo13674Z("onSdkLoaded", new e01());
        return true;
    }
}
