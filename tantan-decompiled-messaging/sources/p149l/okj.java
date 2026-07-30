package p149l;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class okj extends sbe<lkj> implements dsm {
    public okj(lkj lkjVar) {
        super(lkjVar);
    }

    @Override // p149l.rvc0
    @NonNull
    public Class<lkj> getResourceClass() {
        return lkj.class;
    }

    @Override // p149l.rvc0
    public int getSize() {
        return ((lkj) this.f163519a).m150283i();
    }

    @Override // p149l.sbe, p149l.dsm
    public void initialize() {
        ((lkj) this.f163519a).m150280e().prepareToDraw();
    }

    @Override // p149l.rvc0
    public void recycle() {
        ((lkj) this.f163519a).stop();
        ((lkj) this.f163519a).m150284l();
    }
}
