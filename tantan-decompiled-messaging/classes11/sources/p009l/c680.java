package p009l;

import android.view.Surface;
import com.p1.mobile.putong.data.Video;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public interface c680 {

    /* JADX INFO: renamed from: l.c680$a */
    public interface InterfaceC0799a extends InterfaceC0800b {
        /* JADX INFO: renamed from: f */
        Video mo9459f();

        Surface getSurface();
    }

    /* JADX INFO: renamed from: l.c680$b */
    public interface InterfaceC0800b {
        /* JADX INFO: renamed from: a */
        void mo9454a(Exception exc);

        /* JADX INFO: renamed from: b */
        void mo9455b(int i);

        /* JADX INFO: renamed from: c */
        void mo9456c();

        /* JADX INFO: renamed from: d */
        void mo9457d();

        /* JADX INFO: renamed from: e */
        void mo9458e();

        /* JADX INFO: renamed from: g */
        void mo9460g();

        void onComplete();

        void onPause();

        void onResume();

        void onStart();
    }

    /* JADX INFO: renamed from: a */
    void mo12358a(String str);

    /* JADX INFO: renamed from: b */
    void mo12359b();

    /* JADX INFO: renamed from: c */
    void mo12360c();

    /* JADX INFO: renamed from: d */
    void mo12361d(InterfaceC0799a interfaceC0799a, boolean z);

    /* JADX INFO: renamed from: e */
    boolean mo12362e();

    /* JADX INFO: renamed from: f */
    void mo12363f(boolean z);

    void mute(boolean z);

    void pause();

    void release();

    void resume();

    void stop();

    /* JADX INFO: renamed from: l.c680$c */
    public static class C0801c implements InterfaceC0800b {
        @Override // p009l.c680.InterfaceC0800b
        /* JADX INFO: renamed from: a */
        public void mo9454a(Exception exc) {
        }

        @Override // p009l.c680.InterfaceC0800b
        /* JADX INFO: renamed from: b */
        public void mo9455b(int i) {
        }

        @Override // p009l.c680.InterfaceC0800b
        /* JADX INFO: renamed from: c */
        public void mo9456c() {
        }

        @Override // p009l.c680.InterfaceC0800b
        /* JADX INFO: renamed from: d */
        public void mo9457d() {
        }

        @Override // p009l.c680.InterfaceC0800b
        public void onComplete() {
        }

        @Override // p009l.c680.InterfaceC0800b
        public void onPause() {
        }

        @Override // p009l.c680.InterfaceC0800b
        public void onResume() {
        }

        @Override // p009l.c680.InterfaceC0800b
        public void onStart() {
        }
    }
}
