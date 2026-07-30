package p149l;

import android.view.MotionEvent;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.zzgaa;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class ndu0 implements jbs0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qeu0 f138551a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewGroup f138552b;

    public ndu0(qeu0 qeu0Var, ViewGroup viewGroup) {
        this.f138551a = qeu0Var;
        this.f138552b = viewGroup;
    }

    @Override // p149l.jbs0
    /* JADX INFO: renamed from: a */
    public final void mo140806a(MotionEvent motionEvent) {
        this.f138551a.onTouch(null, motionEvent);
    }

    @Override // p149l.jbs0
    public final JSONObject zza() {
        return this.f138551a.zzo();
    }

    @Override // p149l.jbs0
    public final JSONObject zzb() {
        return this.f138551a.zzp();
    }

    @Override // p149l.jbs0
    public final void zzc() {
        zzgaa zzgaaVar = kdu0.f122622o;
        Map mapZzm = this.f138551a.zzm();
        if (mapZzm == null) {
            return;
        }
        int size = zzgaaVar.size();
        int i = 0;
        while (i < size) {
            Object obj = mapZzm.get((String) zzgaaVar.get(i));
            i++;
            if (obj != null) {
                this.f138551a.onClick(this.f138552b);
                return;
            }
        }
    }
}
