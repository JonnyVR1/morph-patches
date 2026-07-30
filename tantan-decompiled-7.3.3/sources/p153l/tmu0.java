package p153l;

import android.view.MotionEvent;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.zzgaa;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class tmu0 implements pks0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ wnu0 f175192a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewGroup f175193b;

    public tmu0(wnu0 wnu0Var, ViewGroup viewGroup) {
        this.f175192a = wnu0Var;
        this.f175193b = viewGroup;
    }

    @Override // p153l.pks0
    /* JADX INFO: renamed from: a */
    public final void mo172764a(MotionEvent motionEvent) {
        this.f175192a.onTouch(null, motionEvent);
    }

    @Override // p153l.pks0
    public final JSONObject zza() {
        return this.f175192a.zzo();
    }

    @Override // p153l.pks0
    public final JSONObject zzb() {
        return this.f175192a.zzp();
    }

    @Override // p153l.pks0
    public final void zzc() {
        zzgaa zzgaaVar = qmu0.f158420o;
        Map mapZzm = this.f175192a.zzm();
        if (mapZzm == null) {
            return;
        }
        int size = zzgaaVar.size();
        int i = 0;
        while (i < size) {
            Object obj = mapZzm.get((String) zzgaaVar.get(i));
            i++;
            if (obj != null) {
                this.f175192a.onClick(this.f175193b);
                return;
            }
        }
    }
}
