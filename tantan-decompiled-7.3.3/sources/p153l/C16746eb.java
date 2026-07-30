package p153l;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: renamed from: l.eb */
/* JADX INFO: loaded from: classes.dex */
public final class C16746eb extends ClickableSpan {

    /* JADX INFO: renamed from: a */
    public final int f92821a;

    /* JADX INFO: renamed from: b */
    public final C15967bc f92822b;

    /* JADX INFO: renamed from: c */
    public final int f92823c;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public C16746eb(int i, @NonNull C15967bc c15967bc, int i2) {
        this.f92821a = i;
        this.f92822b = c15967bc;
        this.f92823c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(@NonNull View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f92821a);
        this.f92822b.m103410d0(this.f92823c, bundle);
    }
}
