package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import p149l.a4c0;
import p149l.qkq0;
import p149l.zbl0;

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
            qkq0.m175383a("This GhostViewHolder is detached!");
        }
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.f3181a.setTag(a4c0.f67493b, null);
            zbl0.m217910a(this.f3181a).mo202579d(this);
            this.f3182b = false;
        }
    }
}
