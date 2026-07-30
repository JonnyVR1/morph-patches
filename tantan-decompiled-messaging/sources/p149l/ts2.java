package p149l;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ts2 extends mcj implements jcj {
    public ts2 parentFilter;

    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        if (z) {
            markAsDirty();
        }
        this.texture_in = i;
        setWidth(mcjVar.getWidth());
        setHeight(mcjVar.getHeight());
        this.inputFrameBuffer = mcjVar.glFrameBuffer;
        onDrawFrame();
        mcjVar.unlockRenderBuffer();
    }
}
