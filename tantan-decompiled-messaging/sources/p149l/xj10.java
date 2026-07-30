package p149l;

import android.opengl.GLES20;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xj10 extends ts2 {
    protected List<mcj> filterLocations;
    protected List<rbj> glFrameBufferList = new ArrayList();
    private int numOfInputs;
    protected int[] texture;
    private int[] textureHandle;
    protected List<mcj> texturesReceived;

    public xj10(int i) {
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

    @Override // p149l.mcj, p149l.ccj
    public void destroy() {
        super.destroy();
        List<rbj> list = this.glFrameBufferList;
        if (list != null) {
            list.clear();
        }
        List<mcj> list2 = this.texturesReceived;
        if (list2 != null) {
            list2.clear();
        }
    }

    @Override // p149l.ccj
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

    @Override // p149l.mcj
    public void lockRenderBuffer() {
        super.lockRenderBuffer();
    }

    @Override // p149l.ts2, p149l.jcj
    public synchronized void newTextureReady(int i, mcj mcjVar, boolean z) {
        if (mcjVar != null) {
            try {
                if (!this.texturesReceived.contains(mcjVar)) {
                    this.texturesReceived.add(mcjVar);
                    if (z) {
                        markAsDirty();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int iLastIndexOf = this.filterLocations.lastIndexOf(mcjVar);
        if (iLastIndexOf == 0) {
            this.texture_in = i;
        } else {
            this.texture[iLastIndexOf - 1] = i;
        }
        if (this.texturesReceived.size() == this.numOfInputs) {
            setWidth(mcjVar.getWidth());
            setHeight(mcjVar.getHeight());
            onDrawFrame();
            this.texturesReceived.clear();
        }
    }

    @Override // p149l.ccj
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

    public void registerFilterLocation(mcj mcjVar, int i) {
        if (this.filterLocations.contains(mcjVar)) {
            this.filterLocations.remove(mcjVar);
        }
        this.filterLocations.add(i, mcjVar);
    }

    @Override // p149l.mcj
    public void unlockInputRenderBuffer() {
        rbj rbjVar;
        for (mcj mcjVar : this.texturesReceived) {
            if (mcjVar != this && mcjVar != null && (rbjVar = mcjVar.glFrameBuffer) != null) {
                int i = rbjVar.f158622h - 1;
                rbjVar.f158622h = i;
                if (i <= 0) {
                    rbjVar.m178613l();
                    mcjVar.glFrameBuffer.f158622h = 0;
                }
            }
        }
    }

    public void registerFilterLocation(mcj mcjVar) {
        if (this.filterLocations.contains(mcjVar)) {
            return;
        }
        this.filterLocations.add(mcjVar);
    }
}
