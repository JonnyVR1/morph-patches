package p153l;

import android.view.Surface;
import com.p051p1.mobile.putong.data.Video;

/* JADX INFO: loaded from: classes10.dex */
public interface ie80 {

    /* JADX INFO: renamed from: l.ie80$a */
    public interface InterfaceC17709a extends InterfaceC17710b {
        /* JADX INFO: renamed from: f */
        Video mo45238f();

        Surface getSurface();
    }

    /* JADX INFO: renamed from: l.ie80$b */
    public interface InterfaceC17710b {
        /* JADX INFO: renamed from: a */
        void mo45233a(Exception exc);

        /* JADX INFO: renamed from: b */
        void mo45234b(int i);

        /* JADX INFO: renamed from: c */
        void mo45235c();

        /* JADX INFO: renamed from: d */
        void mo45236d();

        /* JADX INFO: renamed from: e */
        void mo45237e();

        /* JADX INFO: renamed from: g */
        void mo45239g();

        void onComplete();

        void onPause();

        void onResume();

        void onStart();
    }

    /* JADX INFO: renamed from: a */
    void mo139591a(String str);

    /* JADX INFO: renamed from: b */
    void mo139592b();

    /* JADX INFO: renamed from: c */
    void mo139593c();

    /* JADX INFO: renamed from: d */
    void mo139594d(InterfaceC17709a interfaceC17709a, boolean z);

    /* JADX INFO: renamed from: e */
    boolean mo139595e();

    /* JADX INFO: renamed from: f */
    void mo139596f(boolean z);

    void mute(boolean z);

    void pause();

    void release();

    void resume();

    void stop();

    /* JADX INFO: renamed from: l.ie80$c */
    public static class C17711c implements InterfaceC17710b {
        @Override // p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: c */
        public void mo45235c() {
        }

        @Override // p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: d */
        public void mo45236d() {
        }

        @Override // p153l.ie80.InterfaceC17710b
        public void onComplete() {
        }

        @Override // p153l.ie80.InterfaceC17710b
        public void onPause() {
        }

        @Override // p153l.ie80.InterfaceC17710b
        public void onResume() {
        }

        @Override // p153l.ie80.InterfaceC17710b
        public void onStart() {
        }

        @Override // p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: a */
        public void mo45233a(Exception exc) {
        }

        @Override // p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: b */
        public void mo45234b(int i) {
        }
    }
}
