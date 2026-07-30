package p149l;

import android.opengl.GLSurfaceView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes3.dex */
public class iig implements GLSurfaceView.Renderer {

    /* JADX INFO: renamed from: d */
    private int f113403d;

    /* JADX INFO: renamed from: e */
    private int f113404e;

    /* JADX INFO: renamed from: a */
    private boolean f113400a = false;

    /* JADX INFO: renamed from: c */
    private List<ccj> f113402c = new ArrayList();

    /* JADX INFO: renamed from: b */
    private List<ccj> f113401b = new ArrayList();

    /* JADX INFO: renamed from: f */
    private final Queue<Runnable> f113405f = new LinkedList();

    /* JADX INFO: renamed from: g */
    private final Queue<Runnable> f113406g = new LinkedList();

    /* JADX INFO: renamed from: b */
    private void m136390b(Queue<Runnable> queue) {
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
    public synchronized boolean m136391a() {
        return this.f113400a;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        ccj ccjVar;
        m136390b(this.f113405f);
        if (m136391a()) {
            for (int i = 0; i < this.f113401b.size(); i++) {
                synchronized (this) {
                    ccjVar = this.f113401b.get(i);
                }
                ccjVar.onDrawFrame();
            }
        }
        synchronized (this.f113402c) {
            try {
                Iterator<ccj> it = this.f113402c.iterator();
                while (it.hasNext()) {
                    it.next().destroy();
                }
                this.f113402c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        m136390b(this.f113406g);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.f113403d = i;
        this.f113404e = i2;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
    }
}
