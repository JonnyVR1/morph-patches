package p149l;

import android.view.Surface;
import com.p046p1.mobile.putong.data.Video;

/* JADX INFO: loaded from: classes11.dex */
public interface c680 {

    /* JADX INFO: renamed from: l.c680$a */
    public interface InterfaceC16083a extends InterfaceC16084b {
        /* JADX INFO: renamed from: f */
        Video mo44055f();

        Surface getSurface();
    }

    /* JADX INFO: renamed from: l.c680$b */
    public interface InterfaceC16084b {
        /* JADX INFO: renamed from: a */
        void mo44050a(Exception exc);

        /* JADX INFO: renamed from: b */
        void mo44051b(int i);

        /* JADX INFO: renamed from: c */
        void mo44052c();

        /* JADX INFO: renamed from: d */
        void mo44053d();

        /* JADX INFO: renamed from: e */
        void mo44054e();

        /* JADX INFO: renamed from: g */
        void mo44056g();

        void onComplete();

        void onPause();

        void onResume();

        void onStart();
    }

    /* JADX INFO: renamed from: a */
    void mo105366a(String str);

    /* JADX INFO: renamed from: b */
    void mo105367b();

    /* JADX INFO: renamed from: c */
    void mo105368c();

    /* JADX INFO: renamed from: d */
    void mo105369d(InterfaceC16083a interfaceC16083a, boolean z);

    /* JADX INFO: renamed from: e */
    boolean mo105370e();

    /* JADX INFO: renamed from: f */
    void mo105371f(boolean z);

    void mute(boolean z);

    void pause();

    void release();

    void resume();

    void stop();

    /* JADX INFO: renamed from: l.c680$c */
    public static class C16085c implements InterfaceC16084b {
        @Override // p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: a */
        public void mo44050a(Exception exc) {
        }

        @Override // p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: b */
        public void mo44051b(int i) {
        }

        @Override // p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: c */
        public void mo44052c() {
        }

        @Override // p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: d */
        public void mo44053d() {
        }

        @Override // p149l.c680.InterfaceC16084b
        public void onComplete() {
        }

        @Override // p149l.c680.InterfaceC16084b
        public void onPause() {
        }

        @Override // p149l.c680.InterfaceC16084b
        public void onResume() {
        }

        @Override // p149l.c680.InterfaceC16084b
        public void onStart() {
        }
    }
}
