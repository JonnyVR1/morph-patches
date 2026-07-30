package p149l;

import android.view.View;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class x6n0 extends z2s {

    /* JADX INFO: renamed from: h */
    public w6n0 f191253h;

    /* JADX INFO: renamed from: i */
    public String f191254i;

    /* JADX INFO: renamed from: j */
    public nol f191255j;

    /* JADX INFO: renamed from: k */
    public LiveMessage f191256k;

    /* JADX INFO: renamed from: l */
    public boolean f191257l;

    public x6n0(String str, w6n0 w6n0Var) {
        super(str, null);
        this.f191257l = true;
        this.f191253h = w6n0Var;
        this.f191254i = str;
    }

    @Override // p149l.z2s
    /* JADX INFO: renamed from: d */
    public void mo207185d(nol nolVar, LiveMessage liveMessage) {
        this.f191255j = nolVar;
        this.f191256k = liveMessage;
    }

    @Override // p149l.z2s
    /* JADX INFO: renamed from: h */
    public void mo207186h(boolean z) {
        this.f191253h.m201892h(z);
    }

    /* JADX INFO: renamed from: i */
    public String m207187i() {
        return this.f191254i;
    }

    /* JADX INFO: renamed from: j */
    public void m207188j(boolean z) {
        this.f191257l = z;
    }

    @Override // p149l.z2s, android.text.style.ClickableSpan
    public void onClick(@NonNull View view) {
        nol nolVar = this.f191255j;
        if (nolVar == null || !this.f191257l) {
            return;
        }
        nolVar.mo72701k(this, view, this.f191254i, this.f191256k);
    }
}
