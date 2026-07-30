package p003l;

import android.opengl.GLSurfaceView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class iig implements GLSurfaceView.Renderer {

    /* JADX INFO: renamed from: d */
    private int f4412d;

    /* JADX INFO: renamed from: e */
    private int f4413e;

    /* JADX INFO: renamed from: a */
    private boolean f4409a = false;

    /* JADX INFO: renamed from: c */
    private List<ccj> f4411c = new ArrayList();

    /* JADX INFO: renamed from: b */
    private List<ccj> f4410b = new ArrayList();

    /* JADX INFO: renamed from: f */
    private final Queue<Runnable> f4414f = new LinkedList();

    /* JADX INFO: renamed from: g */
    private final Queue<Runnable> f4415g = new LinkedList();

    /* JADX INFO: renamed from: b */
    private void m5119b(Queue<Runnable> queue) {
        synchronized (queue) {
            while (!queue.isEmpty()) {
                try {
                    queue.poll().run();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized boolean m5120a() {
        return this.f4409a;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        ccj ccjVar;
        m5119b(this.f4414f);
        if (m5120a()) {
            for (int i = 0; i < this.f4410b.size(); i++) {
                synchronized (this) {
                    ccjVar = this.f4410b.get(i);
                }
                ccjVar.onDrawFrame();
            }
        }
        synchronized (this.f4411c) {
            try {
                Iterator<ccj> it = this.f4411c.iterator();
                while (it.hasNext()) {
                    it.next().destroy();
                }
                this.f4411c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        m5119b(this.f4415g);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.f4412d = i;
        this.f4413e = i2;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
    }
}
