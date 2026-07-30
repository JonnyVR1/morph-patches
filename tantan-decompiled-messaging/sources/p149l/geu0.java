package p149l;

import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzcjw;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.jetty.http.MimeTypes;

/* JADX INFO: loaded from: classes6.dex */
public final class geu0 {

    /* JADX INFO: renamed from: a */
    public final fku0 f102303a;

    /* JADX INFO: renamed from: b */
    public final kiu0 f102304b;

    /* JADX INFO: renamed from: c */
    public final lmt0 f102305c;

    /* JADX INFO: renamed from: d */
    public final wcu0 f102306d;

    public geu0(fku0 fku0Var, kiu0 kiu0Var, lmt0 lmt0Var, wcu0 wcu0Var) {
        this.f102303a = fku0Var;
        this.f102304b = kiu0Var;
        this.f102305c = lmt0Var;
        this.f102306d = wcu0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final View m125851a() throws zzcjw {
        q9t0 q9t0VarM121894a = this.f102303a.m121894a(zzq.m12253H(), null, null);
        ((View) q9t0VarM121894a).setVisibility(8);
        q9t0VarM121894a.mo13693j0("/sendMessageToSdk", new vgs0() { // from class: l.beu0
            @Override // p149l.vgs0
            /* JADX INFO: renamed from: a */
            public final void mo12863a(Object obj, Map map) {
                this.f75247a.m125852b((q9t0) obj, map);
            }
        });
        q9t0VarM121894a.mo13693j0("/adMuted", new vgs0() { // from class: l.ceu0
            @Override // p149l.vgs0
            /* JADX INFO: renamed from: a */
            public final void mo12863a(Object obj, Map map) {
                this.f80501a.m125853c((q9t0) obj, map);
            }
        });
        this.f102304b.m146145j(new WeakReference(q9t0VarM121894a), "/loadHtml", new vgs0() { // from class: l.deu0
            @Override // p149l.vgs0
            /* JADX INFO: renamed from: a */
            public final void mo12863a(Object obj, final Map map) {
                q9t0 q9t0Var = (q9t0) obj;
                hbt0 hbt0VarZzN = q9t0Var.zzN();
                final geu0 geu0Var = this.f85860a;
                hbt0VarZzN.zzB(new fbt0() { // from class: l.aeu0
                    @Override // p149l.fbt0
                    /* JADX INFO: renamed from: a */
                    public final void mo96131a(boolean z, int i, String str, String str2) {
                        geu0Var.m125854d(map, z, i, str, str2);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    q9t0Var.loadData(str, MimeTypes.TEXT_HTML, "UTF-8");
                } else {
                    q9t0Var.loadDataWithBaseURL(str2, str, MimeTypes.TEXT_HTML, "UTF-8", null);
                }
            }
        });
        this.f102304b.m146145j(new WeakReference(q9t0VarM121894a), "/showOverlay", new vgs0() { // from class: l.eeu0
            @Override // p149l.vgs0
            /* JADX INFO: renamed from: a */
            public final void mo12863a(Object obj, Map map) {
                this.f90782a.m125855e((q9t0) obj, map);
            }
        });
        this.f102304b.m146145j(new WeakReference(q9t0VarM121894a), "/hideOverlay", new vgs0() { // from class: l.feu0
            @Override // p149l.vgs0
            /* JADX INFO: renamed from: a */
            public final void mo12863a(Object obj, Map map) {
                this.f97160a.m125856f((q9t0) obj, map);
            }
        });
        return (View) q9t0VarM121894a;
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m125852b(q9t0 q9t0Var, Map map) {
        this.f102304b.m146142g("sendMessageToNativeJs", map);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m125853c(q9t0 q9t0Var, Map map) {
        this.f102306d.zzg();
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m125854d(Map map, boolean z, int i, String str, String str2) {
        HashMap map2 = new HashMap();
        map2.put("messageType", "htmlLoaded");
        map2.put("id", (String) map.get("id"));
        this.f102304b.m146142g("sendMessageToNativeJs", map2);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m125855e(q9t0 q9t0Var, Map map) {
        x2t0.m206868f("Showing native ads overlay.");
        q9t0Var.zzF().setVisibility(0);
        this.f102305c.m150616q(true);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m125856f(q9t0 q9t0Var, Map map) {
        x2t0.m206868f("Hiding native ads overlay.");
        q9t0Var.zzF().setVisibility(8);
        this.f102305c.m150616q(false);
    }
}
