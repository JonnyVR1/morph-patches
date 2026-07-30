package p003l;

import android.opengl.GLES20;
import java.util.ArrayList;
import java.util.List;
import l.ysf;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class mcj extends ccj {
    protected boolean dirty;
    public rbj glFrameBuffer;
    public rbj inputFrameBuffer;
    private boolean sizeChanged;
    public boolean useCache = true;
    public boolean enableDepthBuffer = false;
    protected Object listLock = new Object();
    protected boolean isFloatTexture = false;
    protected List<jcj> targets = new ArrayList();
    protected List<jcj> renderTargets = new ArrayList();
    private String filterKey = toString();

    private void drawIndeed() {
        super.drawFrame();
    }

    public synchronized void addTarget(jcj jcjVar) {
        synchronized (this.listLock) {
            List<jcj> list = this.targets;
            if (list == null || !list.contains(jcjVar)) {
                this.targets.add(jcjVar);
                this.sizeChanged = true;
                ybj.m9172d().m9177f(this.useCache);
            }
        }
    }

    public void clearTarget() {
        synchronized (this.listLock) {
            try {
                this.targets.clear();
                this.renderTargets.clear();
                rbj rbjVar = this.glFrameBuffer;
                if (rbjVar != null) {
                    rbjVar.m7169e();
                    this.glFrameBuffer = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p003l.ccj
    public void destroy() {
        super.destroy();
        rbj rbjVar = this.glFrameBuffer;
        if (rbjVar != null) {
            rbjVar.m7169e();
            this.glFrameBuffer = null;
        }
    }

    @Override // p003l.ccj
    public void drawFrame() {
        boolean z;
        rbj rbjVar;
        rbj rbjVar2 = this.glFrameBuffer;
        if (rbjVar2 == null || (rbjVar2 != null && rbjVar2.m7172h() == null)) {
            if (getWidth() == 0 || getHeight() == 0) {
                unlockInputRenderBuffer();
                return;
            }
            initFBO();
        }
        if (this.dirty) {
            synchronized (this.listLock) {
                try {
                    if (this.sizeChanged) {
                        this.renderTargets.clear();
                        this.renderTargets.addAll(this.targets);
                        this.sizeChanged = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            lockRenderBuffer();
            GLES20.glBindFramebuffer(36160, this.glFrameBuffer.m7172h()[0]);
            GLES20.glClearColor(getBackgroundRed(), getBackgroundGreen(), getBackgroundBlue(), getBackgroundAlpha());
            GLES20.glClear(16640);
            drawSub();
            GLES20.glBindFramebuffer(36160, 0);
            unlockInputRenderBuffer();
            z = true;
        } else {
            z = false;
        }
        synchronized (this.listLock) {
            try {
                for (jcj jcjVar : this.renderTargets) {
                    if (jcjVar != null && (rbjVar = this.glFrameBuffer) != null) {
                        jcjVar.newTextureReady(rbjVar.m7173i()[0], this, z);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void drawSub() {
        drawIndeed();
    }

    public String getFilterKey() {
        return this.filterKey;
    }

    public Object getLockObject() {
        return this.listLock;
    }

    public List<jcj> getRenderTargets() {
        if (this.sizeChanged) {
            this.renderTargets.clear();
            this.renderTargets.addAll(this.targets);
            this.sizeChanged = false;
        }
        return this.renderTargets;
    }

    public List<jcj> getTargets() {
        return this.targets;
    }

    public int getTextOutID() {
        rbj rbjVar = this.glFrameBuffer;
        if (rbjVar != null) {
            return rbjVar.m7173i()[0];
        }
        return 0;
    }

    @Override // p003l.ccj
    public void handleSizeChange() {
        initFBO();
    }

    public void initFBO() {
        rbj rbjVar;
        if (this.useCache) {
            if (!ybj.m9172d().f9051c && (rbjVar = this.glFrameBuffer) != null) {
                rbjVar.m7169e();
            }
            this.glFrameBuffer = ybj.m9172d().m9175c(getWidth(), getHeight());
        } else {
            rbj rbjVar2 = this.glFrameBuffer;
            if (rbjVar2 != null) {
                rbjVar2.m7169e();
            }
            this.glFrameBuffer = new rbj(getWidth(), getHeight());
        }
        this.glFrameBuffer.m7175k(this.isFloatTexture);
        boolean z = this.enableDepthBuffer;
        rbj rbjVar3 = this.glFrameBuffer;
        if (z) {
            rbjVar3.m7165a(getWidth(), getHeight());
        } else {
            rbjVar3.m7166b(getWidth(), getHeight());
        }
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (iGlCheckFramebufferStatus != 36053) {
            if (!this.isFloatTexture) {
                StringBuilder sb = new StringBuilder();
                sb.append(this);
                ysf.a(sb, iGlCheckFramebufferStatus, GLES20.glGetError());
                return;
            }
            rbj rbjVar4 = this.glFrameBuffer;
            if (rbjVar4 != null) {
                rbjVar4.m7169e();
            }
            rbj rbjVar5 = new rbj(getWidth(), getHeight());
            this.glFrameBuffer = rbjVar5;
            this.isFloatTexture = false;
            rbjVar5.m7175k(false);
            this.glFrameBuffer.m7166b(getWidth(), getHeight());
            int iGlCheckFramebufferStatus2 = GLES20.glCheckFramebufferStatus(36160);
            if (iGlCheckFramebufferStatus2 == 36053) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this);
            ysf.a(sb2, iGlCheckFramebufferStatus2, GLES20.glGetError());
        }
    }

    public void lockRenderBuffer() {
        rbj rbjVar = this.glFrameBuffer;
        if (rbjVar.f6836h == 0) {
            rbjVar.f6836h = this.renderTargets.size();
        }
        this.glFrameBuffer.m7174j();
    }

    public void markAsDirty() {
        this.dirty = true;
    }

    @Override // p003l.ccj
    public void releaseFrameBuffer() {
        super.releaseFrameBuffer();
        rbj rbjVar = this.glFrameBuffer;
        if (rbjVar != null) {
            rbjVar.m7169e();
            this.glFrameBuffer = null;
        }
    }

    public void removeTarget(jcj jcjVar) {
        synchronized (this.listLock) {
            this.sizeChanged = true;
            this.targets.remove(jcjVar);
            ybj.m9172d().m9177f(this.useCache);
        }
    }

    public void setFilterKey(String str) {
        this.filterKey = str;
    }

    public void setFloatTexture(boolean z) {
        this.isFloatTexture = z;
    }

    public void unlockInputRenderBuffer() {
        rbj rbjVar = this.inputFrameBuffer;
        if (rbjVar != null) {
            int i = rbjVar.f6836h - 1;
            rbjVar.f6836h = i;
            if (this.glFrameBuffer == null || i > 0) {
                return;
            }
            rbjVar.m7176l();
            this.inputFrameBuffer.f6836h = 0;
        }
    }

    public void unlockRenderBuffer() {
    }
}
