package p149l;

import com.p046p1.mobile.android.app.Act;

/* JADX INFO: loaded from: classes13.dex */
public class enk0 extends g2l0 {

    /* JADX INFO: renamed from: a */
    public final boolean f92324a;

    /* JADX INFO: renamed from: b */
    public boolean f92325b;

    public enk0(boolean z) {
        this.f92324a = z;
    }

    @Override // p149l.g2l0
    /* JADX INFO: renamed from: a */
    public void mo94566a(Act act) {
        super.mo94566a(act);
        if (this.f92324a) {
            if (!fnk0.m122316b().m122318c()) {
                m124169e(act);
                return;
            } else {
                fnk0.m122316b().m122319d();
                dt0.m113504D(act);
                return;
            }
        }
        if (!fnk0.m122316b().m122318c()) {
            m124169e(act);
            return;
        }
        if (!this.f92325b) {
            lsi0.m151595y("你当前正在视频闪聊中，无法使用此功能");
        }
        dt0.m113504D(act);
    }

    @Override // p149l.g2l0
    /* JADX INFO: renamed from: f */
    public String mo94567f() {
        return "VChatWindowChecker";
    }

    /* JADX INFO: renamed from: k */
    public g2l0 m117283k(boolean z) {
        this.f92325b = z;
        return this;
    }
}
