package p153l;

import android.view.View;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class bgn0 extends a5s {

    /* JADX INFO: renamed from: h */
    public agn0 f76668h;

    /* JADX INFO: renamed from: i */
    public String f76669i;

    /* JADX INFO: renamed from: j */
    public yql f76670j;

    /* JADX INFO: renamed from: k */
    public LiveMessage f76671k;

    /* JADX INFO: renamed from: l */
    public boolean f76672l;

    public bgn0(String str, agn0 agn0Var) {
        super(str, null);
        this.f76672l = true;
        this.f76668h = agn0Var;
        this.f76669i = str;
    }

    @Override // p153l.a5s
    /* JADX INFO: renamed from: d */
    public void mo96246d(yql yqlVar, LiveMessage liveMessage) {
        this.f76670j = yqlVar;
        this.f76671k = liveMessage;
    }

    @Override // p153l.a5s
    /* JADX INFO: renamed from: h */
    public void mo96250h(boolean z) {
        this.f76668h.m97710h(z);
    }

    /* JADX INFO: renamed from: i */
    public String m104233i() {
        return this.f76669i;
    }

    /* JADX INFO: renamed from: j */
    public void m104234j(boolean z) {
        this.f76672l = z;
    }

    @Override // p153l.a5s, android.text.style.ClickableSpan
    public void onClick(@NonNull View view) {
        yql yqlVar = this.f76670j;
        if (yqlVar == null || !this.f76672l) {
            return;
        }
        yqlVar.mo73884k(this, view, this.f76669i, this.f76671k);
    }
}
