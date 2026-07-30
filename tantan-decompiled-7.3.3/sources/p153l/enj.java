package p153l;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class enj extends wce<bnj> implements fum {
    public enj(bnj bnjVar) {
        super(bnjVar);
    }

    @Override // p153l.u3d0
    @NonNull
    public Class<bnj> getResourceClass() {
        return bnj.class;
    }

    @Override // p153l.u3d0
    public int getSize() {
        return ((bnj) this.f188469a).m105410i();
    }

    @Override // p153l.wce, p153l.fum
    public void initialize() {
        ((bnj) this.f188469a).m105407e().prepareToDraw();
    }

    @Override // p153l.u3d0
    public void recycle() {
        ((bnj) this.f188469a).stop();
        ((bnj) this.f188469a).m105411k();
    }
}
