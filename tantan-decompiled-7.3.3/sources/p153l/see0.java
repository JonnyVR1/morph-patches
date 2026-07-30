package p153l;

/* JADX INFO: loaded from: classes13.dex */
public class see0 {

    /* JADX INFO: renamed from: a */
    public int f167608a;

    /* JADX INFO: renamed from: b */
    public kcg0 f167609b;

    /* JADX INFO: renamed from: c */
    public String f167610c;

    public see0(String str, int i, kcg0 kcg0Var) {
        this.f167610c = str;
        this.f167608a = i;
        this.f167609b = kcg0Var;
    }

    /* JADX INFO: renamed from: a */
    public void m185531a() {
        kcg0 kcg0Var = this.f167609b;
        if (kcg0Var == null || kcg0Var.isUnsubscribed()) {
            return;
        }
        this.f167609b.unsubscribe();
    }

    /* JADX INFO: renamed from: b */
    public void m185532b(int i) {
        this.f167608a = i;
    }
}
