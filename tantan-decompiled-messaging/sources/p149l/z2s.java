package p149l;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class z2s extends ClickableSpan {

    /* JADX INFO: renamed from: a */
    public qol f201268a;

    /* JADX INFO: renamed from: b */
    public String f201269b;

    /* JADX INFO: renamed from: c */
    public nol f201270c;

    /* JADX INFO: renamed from: d */
    public LiveMessage f201271d;

    /* JADX INFO: renamed from: e */
    public String f201272e;

    /* JADX INFO: renamed from: f */
    public String f201273f;

    /* JADX INFO: renamed from: g */
    public boolean f201274g = true;

    public z2s(String str, qol qolVar) {
        this.f201269b = str;
        this.f201268a = qolVar;
    }

    /* JADX INFO: renamed from: a */
    public String m216986a() {
        return this.f201273f;
    }

    /* JADX INFO: renamed from: b */
    public String m216987b() {
        return this.f201272e;
    }

    /* JADX INFO: renamed from: c */
    public boolean m216988c() {
        return this.f201274g;
    }

    /* JADX INFO: renamed from: d */
    public void mo207185d(nol nolVar, LiveMessage liveMessage) {
        this.f201270c = nolVar;
        this.f201271d = liveMessage;
    }

    /* JADX INFO: renamed from: e */
    public void m216989e(String str) {
        this.f201273f = str;
    }

    /* JADX INFO: renamed from: f */
    public void m216990f(boolean z) {
        this.f201274g = z;
    }

    /* JADX INFO: renamed from: g */
    public void m216991g(String str) {
        this.f201272e = str;
    }

    /* JADX INFO: renamed from: h */
    public void mo207186h(boolean z) {
        qol qolVar = this.f201268a;
        if (qolVar != null) {
            qolVar.setVisible(z);
        }
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(@NonNull View view) {
        nol nolVar = this.f201270c;
        if (nolVar == null) {
            return;
        }
        nolVar.mo72701k(this, view, this.f201269b, this.f201271d);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NonNull TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
