package p149l;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes13.dex */
public abstract class fx00 {

    /* JADX INFO: renamed from: a */
    public gx00.C17185a f99718a;

    /* JADX INFO: renamed from: a */
    public abstract void mo123612a();

    /* JADX INFO: renamed from: b */
    public abstract void mo123613b();

    /* JADX INFO: renamed from: c */
    public void m123614c() {
        gx00.C17185a c17185a = this.f99718a;
        if (c17185a != null) {
            c17185a.f104814b = null;
            c17185a.f104816d = null;
            ViewGroup viewGroup = c17185a.f104815c;
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                xdl0.m208344M(this.f99718a.f104815c, false);
            }
            this.f99718a.f104815c = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m123615d(gx00.C17185a c17185a) {
        this.f99718a = c17185a;
    }
}
