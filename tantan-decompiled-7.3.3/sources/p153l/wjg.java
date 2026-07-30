package p153l;

import android.opengl.GLSurfaceView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes3.dex */
public class wjg implements GLSurfaceView.Renderer {

    /* JADX INFO: renamed from: d */
    private int f189450d;

    /* JADX INFO: renamed from: e */
    private int f189451e;

    /* JADX INFO: renamed from: a */
    private boolean f189447a = false;

    /* JADX INFO: renamed from: c */
    private List<wej> f189449c = new ArrayList();

    /* JADX INFO: renamed from: b */
    private List<wej> f189448b = new ArrayList();

    /* JADX INFO: renamed from: f */
    private final Queue<Runnable> f189452f = new LinkedList();

    /* JADX INFO: renamed from: g */
    private final Queue<Runnable> f189453g = new LinkedList();

    /* JADX INFO: renamed from: b */
    private void m206640b(Queue<Runnable> queue) {
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
    public synchronized boolean m206641a() {
        return this.f189447a;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        wej wejVar;
        m206640b(this.f189452f);
        if (m206641a()) {
            for (int i = 0; i < this.f189448b.size(); i++) {
                synchronized (this) {
                    wejVar = this.f189448b.get(i);
                }
                wejVar.onDrawFrame();
            }
        }
        synchronized (this.f189449c) {
            try {
                Iterator<wej> it = this.f189449c.iterator();
                while (it.hasNext()) {
                    it.next().destroy();
                }
                this.f189449c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        m206640b(this.f189453g);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.f189450d = i;
        this.f189451e = i2;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
    }
}
