package p153l;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jt2 extends gfj implements dfj {
    public jt2 parentFilter;

    public void newTextureReady(int i, gfj gfjVar, boolean z) {
        if (z) {
            markAsDirty();
        }
        this.texture_in = i;
        setWidth(gfjVar.getWidth());
        setHeight(gfjVar.getHeight());
        this.inputFrameBuffer = gfjVar.glFrameBuffer;
        onDrawFrame();
        gfjVar.unlockRenderBuffer();
    }
}
