package p153l;

import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzcjw;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.jetty.http.MimeTypes;

/* JADX INFO: loaded from: classes6.dex */
public final class mnu0 {

    /* JADX INFO: renamed from: a */
    public final ltu0 f137734a;

    /* JADX INFO: renamed from: b */
    public final qru0 f137735b;

    /* JADX INFO: renamed from: c */
    public final rvt0 f137736c;

    /* JADX INFO: renamed from: d */
    public final cmu0 f137737d;

    public mnu0(ltu0 ltu0Var, qru0 qru0Var, rvt0 rvt0Var, cmu0 cmu0Var) {
        this.f137734a = ltu0Var;
        this.f137735b = qru0Var;
        this.f137736c = rvt0Var;
        this.f137737d = cmu0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final View m159199a() throws zzcjw {
        wit0 wit0VarM155812a = this.f137734a.m155812a(zzq.m12307H(), null, null);
        ((View) wit0VarM155812a).setVisibility(8);
        wit0VarM155812a.mo13747j0("/sendMessageToSdk", new bqs0() { // from class: l.hnu0
            @Override // p153l.bqs0
            /* JADX INFO: renamed from: a */
            public final void mo12917a(Object obj, Map map) {
                this.f110830a.m159200b((wit0) obj, map);
            }
        });
        wit0VarM155812a.mo13747j0("/adMuted", new bqs0() { // from class: l.inu0
            @Override // p153l.bqs0
            /* JADX INFO: renamed from: a */
            public final void mo12917a(Object obj, Map map) {
                this.f116002a.m159201c((wit0) obj, map);
            }
        });
        this.f137735b.m177708j(new WeakReference(wit0VarM155812a), "/loadHtml", new bqs0() { // from class: l.jnu0
            @Override // p153l.bqs0
            /* JADX INFO: renamed from: a */
            public final void mo12917a(Object obj, final Map map) {
                wit0 wit0Var = (wit0) obj;
                nkt0 nkt0VarZzN = wit0Var.zzN();
                final mnu0 mnu0Var = this.f121908a;
                nkt0VarZzN.zzB(new lkt0() { // from class: l.gnu0
                    @Override // p153l.lkt0
                    /* JADX INFO: renamed from: a */
                    public final void mo99557a(boolean z, int i, String str, String str2) {
                        mnu0Var.m159202d(map, z, i, str, str2);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    wit0Var.loadData(str, MimeTypes.TEXT_HTML, "UTF-8");
                } else {
                    wit0Var.loadDataWithBaseURL(str2, str, MimeTypes.TEXT_HTML, "UTF-8", null);
                }
            }
        });
        this.f137735b.m177708j(new WeakReference(wit0VarM155812a), "/showOverlay", new bqs0() { // from class: l.knu0
            @Override // p153l.bqs0
            /* JADX INFO: renamed from: a */
            public final void mo12917a(Object obj, Map map) {
                this.f127644a.m159203e((wit0) obj, map);
            }
        });
        this.f137735b.m177708j(new WeakReference(wit0VarM155812a), "/hideOverlay", new bqs0() { // from class: l.lnu0
            @Override // p153l.bqs0
            /* JADX INFO: renamed from: a */
            public final void mo12917a(Object obj, Map map) {
                this.f132842a.m159204f((wit0) obj, map);
            }
        });
        return (View) wit0VarM155812a;
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m159200b(wit0 wit0Var, Map map) {
        this.f137735b.m177705g("sendMessageToNativeJs", map);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m159201c(wit0 wit0Var, Map map) {
        this.f137737d.zzg();
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m159202d(Map map, boolean z, int i, String str, String str2) {
        HashMap map2 = new HashMap();
        map2.put("messageType", "htmlLoaded");
        map2.put("id", (String) map.get("id"));
        this.f137735b.m177705g("sendMessageToNativeJs", map2);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m159203e(wit0 wit0Var, Map map) {
        dct0.m115297f("Showing native ads overlay.");
        wit0Var.zzF().setVisibility(0);
        this.f137736c.m183316q(true);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m159204f(wit0 wit0Var, Map map) {
        dct0.m115297f("Hiding native ads overlay.");
        wit0Var.zzF().setVisibility(8);
        this.f137736c.m183316q(false);
    }
}
