package p153l;

import android.opengl.GLES20;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gfj extends wej {
    protected boolean dirty;
    public lej glFrameBuffer;
    public lej inputFrameBuffer;
    private boolean sizeChanged;
    public boolean useCache = true;
    public boolean enableDepthBuffer = false;
    protected Object listLock = new Object();
    protected boolean isFloatTexture = false;
    protected List<dfj> targets = new ArrayList();
    protected List<dfj> renderTargets = new ArrayList();
    private String filterKey = toString();

    private void drawIndeed() {
        super.drawFrame();
    }

    public synchronized void addTarget(dfj dfjVar) {
        synchronized (this.listLock) {
            List<dfj> list = this.targets;
            if (list == null || !list.contains(dfjVar)) {
                this.targets.add(dfjVar);
                this.sizeChanged = true;
                sej.m185545d().m185550f(this.useCache);
            }
        }
    }

    public void clearTarget() {
        synchronized (this.listLock) {
            try {
                this.targets.clear();
                this.renderTargets.clear();
                lej lejVar = this.glFrameBuffer;
                if (lejVar != null) {
                    lejVar.m153898e();
                    this.glFrameBuffer = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.wej
    public void destroy() {
        super.destroy();
        lej lejVar = this.glFrameBuffer;
        if (lejVar != null) {
            lejVar.m153898e();
            this.glFrameBuffer = null;
        }
    }

    @Override // p153l.wej
    public void drawFrame() {
        boolean z;
        lej lejVar;
        lej lejVar2 = this.glFrameBuffer;
        if (lejVar2 == null || (lejVar2 != null && lejVar2.m153901h() == null)) {
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
            GLES20.glBindFramebuffer(36160, this.glFrameBuffer.m153901h()[0]);
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
                for (dfj dfjVar : this.renderTargets) {
                    if (dfjVar != null && (lejVar = this.glFrameBuffer) != null) {
                        dfjVar.newTextureReady(lejVar.m153902i()[0], this, z);
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

    public List<dfj> getRenderTargets() {
        if (this.sizeChanged) {
            this.renderTargets.clear();
            this.renderTargets.addAll(this.targets);
            this.sizeChanged = false;
        }
        return this.renderTargets;
    }

    public List<dfj> getTargets() {
        return this.targets;
    }

    public int getTextOutID() {
        lej lejVar = this.glFrameBuffer;
        if (lejVar != null) {
            return lejVar.m153902i()[0];
        }
        return 0;
    }

    @Override // p153l.wej
    public void handleSizeChange() {
        initFBO();
    }

    public void initFBO() {
        lej lejVar;
        if (this.useCache) {
            if (!sej.m185545d().f167619c && (lejVar = this.glFrameBuffer) != null) {
                lejVar.m153898e();
            }
            this.glFrameBuffer = sej.m185545d().m185548c(getWidth(), getHeight());
        } else {
            lej lejVar2 = this.glFrameBuffer;
            if (lejVar2 != null) {
                lejVar2.m153898e();
            }
            this.glFrameBuffer = new lej(getWidth(), getHeight());
        }
        this.glFrameBuffer.m153904k(this.isFloatTexture);
        boolean z = this.enableDepthBuffer;
        lej lejVar3 = this.glFrameBuffer;
        if (z) {
            lejVar3.m153894a(getWidth(), getHeight());
        } else {
            lejVar3.m153895b(getWidth(), getHeight());
        }
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (iGlCheckFramebufferStatus != 36053) {
            if (!this.isFloatTexture) {
                StringBuilder sb = new StringBuilder();
                sb.append(this);
                muf.m160142a(sb, iGlCheckFramebufferStatus, GLES20.glGetError());
                return;
            }
            lej lejVar4 = this.glFrameBuffer;
            if (lejVar4 != null) {
                lejVar4.m153898e();
            }
            lej lejVar5 = new lej(getWidth(), getHeight());
            this.glFrameBuffer = lejVar5;
            this.isFloatTexture = false;
            lejVar5.m153904k(false);
            this.glFrameBuffer.m153895b(getWidth(), getHeight());
            int iGlCheckFramebufferStatus2 = GLES20.glCheckFramebufferStatus(36160);
            if (iGlCheckFramebufferStatus2 == 36053) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this);
            muf.m160142a(sb2, iGlCheckFramebufferStatus2, GLES20.glGetError());
        }
    }

    public void lockRenderBuffer() {
        lej lejVar = this.glFrameBuffer;
        if (lejVar.f131759h == 0) {
            lejVar.f131759h = this.renderTargets.size();
        }
        this.glFrameBuffer.m153903j();
    }

    public void markAsDirty() {
        this.dirty = true;
    }

    @Override // p153l.wej
    public void releaseFrameBuffer() {
        super.releaseFrameBuffer();
        lej lejVar = this.glFrameBuffer;
        if (lejVar != null) {
            lejVar.m153898e();
            this.glFrameBuffer = null;
        }
    }

    public void removeTarget(dfj dfjVar) {
        synchronized (this.listLock) {
            this.sizeChanged = true;
            this.targets.remove(dfjVar);
            sej.m185545d().m185550f(this.useCache);
        }
    }

    public void setFilterKey(String str) {
        this.filterKey = str;
    }

    public void setFloatTexture(boolean z) {
        this.isFloatTexture = z;
    }

    public void unlockInputRenderBuffer() {
        lej lejVar = this.inputFrameBuffer;
        if (lejVar != null) {
            int i = lejVar.f131759h - 1;
            lejVar.f131759h = i;
            if (this.glFrameBuffer == null || i > 0) {
                return;
            }
            lejVar.m153905l();
            this.inputFrameBuffer.f131759h = 0;
        }
    }

    public void unlockRenderBuffer() {
    }
}
