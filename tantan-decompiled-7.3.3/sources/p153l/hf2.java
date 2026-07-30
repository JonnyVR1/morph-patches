package p153l;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public abstract class hf2 extends aj2<fb5<db5>> {
    @Override // p153l.aj2
    /* JADX INFO: renamed from: f */
    public void mo98347f(i6c<fb5<db5>> i6cVar) {
        if (i6cVar.mo8236e()) {
            fb5<db5> result = i6cVar.getResult();
            try {
                mo127167g((result == null || !(result.m124875B() instanceof ab5)) ? null : ((ab5) result.m124875B()).mo96697b0());
            } finally {
                fb5.m124874v(result);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo127167g(Bitmap bitmap);
}
