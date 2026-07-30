package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import p153l.dll0;
import p153l.gcc0;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
class GhostViewHolder extends FrameLayout {

    /* JADX INFO: renamed from: a */
    @NonNull
    public ViewGroup f3181a;

    /* JADX INFO: renamed from: b */
    public boolean f3182b;

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        if (this.f3182b) {
            super.onViewAdded(view);
        } else {
            wtq0.m207906a("This GhostViewHolder is detached!");
        }
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.f3181a.setTag(gcc0.f103557b, null);
            dll0.m116770a(this.f3181a).mo98692d(this);
            this.f3182b = false;
        }
    }
}
