package p153l;

import android.opengl.GLES20;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class hs10 extends jt2 {
    protected List<gfj> filterLocations;
    protected List<lej> glFrameBufferList = new ArrayList();
    private int numOfInputs;
    protected int[] texture;
    private int[] textureHandle;
    protected List<gfj> texturesReceived;

    public hs10(int i) {
        this.numOfInputs = i;
        int i2 = i - 1;
        this.textureHandle = new int[i2];
        this.texture = new int[i2];
        this.texturesReceived = new ArrayList(i);
        this.filterLocations = new ArrayList(i);
    }

    public void clearRegisteredFilterLocations() {
        this.filterLocations.clear();
    }

    @Override // p153l.gfj, p153l.wej
    public void destroy() {
        super.destroy();
        List<lej> list = this.glFrameBufferList;
        if (list != null) {
            list.clear();
        }
        List<gfj> list2 = this.texturesReceived;
        if (list2 != null) {
            list2.clear();
        }
    }

    @Override // p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        int i = 0;
        while (i < this.numOfInputs - 1) {
            int[] iArr = this.textureHandle;
            int i2 = this.programHandle;
            StringBuilder sb = new StringBuilder("inputImageTexture");
            int i3 = i + 1;
            sb.append(i3);
            iArr[i] = GLES20.glGetUniformLocation(i2, sb.toString());
            i = i3;
        }
    }

    @Override // p153l.gfj
    public void lockRenderBuffer() {
        super.lockRenderBuffer();
    }

    @Override // p153l.jt2, p153l.dfj
    public synchronized void newTextureReady(int i, gfj gfjVar, boolean z) {
        if (gfjVar != null) {
            try {
                if (!this.texturesReceived.contains(gfjVar)) {
                    this.texturesReceived.add(gfjVar);
                    if (z) {
                        markAsDirty();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int iLastIndexOf = this.filterLocations.lastIndexOf(gfjVar);
        if (iLastIndexOf == 0) {
            this.texture_in = i;
        } else {
            this.texture[iLastIndexOf - 1] = i;
        }
        if (this.texturesReceived.size() == this.numOfInputs) {
            setWidth(gfjVar.getWidth());
            setHeight(gfjVar.getHeight());
            onDrawFrame();
            this.texturesReceived.clear();
        }
    }

    @Override // p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        passTextureValues();
    }

    public void passTextureValues() {
        int i = 0;
        int i2 = 0;
        while (i < this.numOfInputs - 1) {
            switch (i) {
                case 0:
                    i2 = 33985;
                    break;
                case 1:
                    i2 = 33986;
                    break;
                case 2:
                    i2 = 33987;
                    break;
                case 3:
                    i2 = 33988;
                    break;
                case 4:
                    i2 = 33989;
                    break;
                case 5:
                    i2 = 33990;
                    break;
                case 6:
                    i2 = 33991;
                    break;
                case 7:
                    i2 = 33992;
                    break;
                case 8:
                    i2 = 33993;
                    break;
            }
            GLES20.glActiveTexture(i2);
            GLES20.glBindTexture(3553, this.texture[i]);
            int i3 = this.textureHandle[i];
            i++;
            GLES20.glUniform1i(i3, i);
        }
    }

    public void registerFilterLocation(gfj gfjVar, int i) {
        if (this.filterLocations.contains(gfjVar)) {
            this.filterLocations.remove(gfjVar);
        }
        this.filterLocations.add(i, gfjVar);
    }

    @Override // p153l.gfj
    public void unlockInputRenderBuffer() {
        lej lejVar;
        for (gfj gfjVar : this.texturesReceived) {
            if (gfjVar != this && gfjVar != null && (lejVar = gfjVar.glFrameBuffer) != null) {
                int i = lejVar.f131759h - 1;
                lejVar.f131759h = i;
                if (i <= 0) {
                    lejVar.m153905l();
                    gfjVar.glFrameBuffer.f131759h = 0;
                }
            }
        }
    }

    public void registerFilterLocation(gfj gfjVar) {
        if (this.filterLocations.contains(gfjVar)) {
            return;
        }
        this.filterLocations.add(gfjVar);
    }
}
