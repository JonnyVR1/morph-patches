package p153l;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class a5s extends ClickableSpan {

    /* JADX INFO: renamed from: a */
    public brl f68634a;

    /* JADX INFO: renamed from: b */
    public String f68635b;

    /* JADX INFO: renamed from: c */
    public yql f68636c;

    /* JADX INFO: renamed from: d */
    public LiveMessage f68637d;

    /* JADX INFO: renamed from: e */
    public String f68638e;

    /* JADX INFO: renamed from: f */
    public String f68639f;

    /* JADX INFO: renamed from: g */
    public boolean f68640g = true;

    public a5s(String str, brl brlVar) {
        this.f68635b = str;
        this.f68634a = brlVar;
    }

    /* JADX INFO: renamed from: a */
    public String m96243a() {
        return this.f68639f;
    }

    /* JADX INFO: renamed from: b */
    public String m96244b() {
        return this.f68638e;
    }

    /* JADX INFO: renamed from: c */
    public boolean m96245c() {
        return this.f68640g;
    }

    /* JADX INFO: renamed from: d */
    public void mo96246d(yql yqlVar, LiveMessage liveMessage) {
        this.f68636c = yqlVar;
        this.f68637d = liveMessage;
    }

    /* JADX INFO: renamed from: e */
    public void m96247e(String str) {
        this.f68639f = str;
    }

    /* JADX INFO: renamed from: f */
    public void m96248f(boolean z) {
        this.f68640g = z;
    }

    /* JADX INFO: renamed from: g */
    public void m96249g(String str) {
        this.f68638e = str;
    }

    /* JADX INFO: renamed from: h */
    public void mo96250h(boolean z) {
        brl brlVar = this.f68634a;
        if (brlVar != null) {
            brlVar.setVisible(z);
        }
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(@NonNull View view) {
        yql yqlVar = this.f68636c;
        if (yqlVar == null) {
            return;
        }
        yqlVar.mo73884k(this, view, this.f68635b, this.f68637d);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NonNull TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
