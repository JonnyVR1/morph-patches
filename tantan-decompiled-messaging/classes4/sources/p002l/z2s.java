package p002l;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class z2s extends ClickableSpan {

    /* JADX INFO: renamed from: a */
    public qol f23186a;

    /* JADX INFO: renamed from: b */
    public String f23187b;

    /* JADX INFO: renamed from: c */
    public nol f23188c;

    /* JADX INFO: renamed from: d */
    public LiveMessage f23189d;

    /* JADX INFO: renamed from: e */
    public String f23190e;

    /* JADX INFO: renamed from: f */
    public String f23191f;

    /* JADX INFO: renamed from: g */
    public boolean f23192g = true;

    public z2s(String str, qol qolVar) {
        this.f23187b = str;
        this.f23186a = qolVar;
    }

    /* JADX INFO: renamed from: a */
    public String m27044a() {
        return this.f23191f;
    }

    /* JADX INFO: renamed from: b */
    public String m27045b() {
        return this.f23190e;
    }

    /* JADX INFO: renamed from: c */
    public boolean m27046c() {
        return this.f23192g;
    }

    /* JADX INFO: renamed from: d */
    public void mo25699d(nol nolVar, LiveMessage liveMessage) {
        this.f23188c = nolVar;
        this.f23189d = liveMessage;
    }

    /* JADX INFO: renamed from: e */
    public void m27047e(String str) {
        this.f23191f = str;
    }

    /* JADX INFO: renamed from: f */
    public void m27048f(boolean z) {
        this.f23192g = z;
    }

    /* JADX INFO: renamed from: g */
    public void m27049g(String str) {
        this.f23190e = str;
    }

    /* JADX INFO: renamed from: h */
    public void mo25700h(boolean z) {
        qol qolVar = this.f23186a;
        if (qolVar != null) {
            qolVar.setVisible(z);
        }
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(@NonNull View view) {
        nol nolVar = this.f23188c;
        if (nolVar == null) {
            return;
        }
        nolVar.mo6205k(this, view, this.f23187b, this.f23189d);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NonNull TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
