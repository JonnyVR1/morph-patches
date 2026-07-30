package p149l;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: renamed from: l.jb */
/* JADX INFO: loaded from: classes.dex */
public final class C17736jb extends ClickableSpan {

    /* JADX INFO: renamed from: a */
    public final int f117145a;

    /* JADX INFO: renamed from: b */
    public final C17055gc f117146b;

    /* JADX INFO: renamed from: c */
    public final int f117147c;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public C17736jb(int i, @NonNull C17055gc c17055gc, int i2) {
        this.f117145a = i;
        this.f117146b = c17055gc;
        this.f117147c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(@NonNull View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f117145a);
        this.f117146b.m125406d0(this.f117147c, bundle);
    }
}
