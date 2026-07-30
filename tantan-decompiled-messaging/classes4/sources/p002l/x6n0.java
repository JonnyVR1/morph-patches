package p002l;

import android.view.View;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class x6n0 extends z2s {

    /* JADX INFO: renamed from: h */
    public w6n0 f22143h;

    /* JADX INFO: renamed from: i */
    public String f22144i;

    /* JADX INFO: renamed from: j */
    public nol f22145j;

    /* JADX INFO: renamed from: k */
    public LiveMessage f22146k;

    /* JADX INFO: renamed from: l */
    public boolean f22147l;

    public x6n0(String str, w6n0 w6n0Var) {
        super(str, null);
        this.f22147l = true;
        this.f22143h = w6n0Var;
        this.f22144i = str;
    }

    @Override // p002l.z2s
    /* JADX INFO: renamed from: d */
    public void mo25699d(nol nolVar, LiveMessage liveMessage) {
        this.f22145j = nolVar;
        this.f22146k = liveMessage;
    }

    @Override // p002l.z2s
    /* JADX INFO: renamed from: h */
    public void mo25700h(boolean z) {
        this.f22143h.m24361h(z);
    }

    /* JADX INFO: renamed from: i */
    public String m25701i() {
        return this.f22144i;
    }

    /* JADX INFO: renamed from: j */
    public void m25702j(boolean z) {
        this.f22147l = z;
    }

    @Override // p002l.z2s, android.text.style.ClickableSpan
    public void onClick(@NonNull View view) {
        nol nolVar = this.f22145j;
        if (nolVar == null || !this.f22147l) {
            return;
        }
        nolVar.mo6205k(this, view, this.f22144i, this.f22146k);
    }
}
