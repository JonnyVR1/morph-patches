package p153l;

import com.p051p1.mobile.android.app.Act;

/* JADX INFO: loaded from: classes9.dex */
public class kwk0 extends lbl0 {

    /* JADX INFO: renamed from: a */
    public final boolean f129073a;

    /* JADX INFO: renamed from: b */
    public boolean f129074b;

    public kwk0(boolean z) {
        this.f129073a = z;
    }

    @Override // p153l.lbl0
    /* JADX INFO: renamed from: a */
    public void mo96996a(Act act) {
        super.mo96996a(act);
        if (this.f129073a) {
            if (!lwk0.m156066b().m156068c()) {
                m153583e(act);
                return;
            } else {
                lwk0.m156066b().m156069d();
                it0.m142010D(act);
                return;
            }
        }
        if (!lwk0.m156066b().m156068c()) {
            m153583e(act);
            return;
        }
        if (!this.f129074b) {
            o1j0.m165651y("你当前正在视频闪聊中，无法使用此功能");
        }
        it0.m142010D(act);
    }

    @Override // p153l.lbl0
    /* JADX INFO: renamed from: f */
    public String mo96997f() {
        return "VChatWindowChecker";
    }

    /* JADX INFO: renamed from: k */
    public lbl0 m151701k(boolean z) {
        this.f129074b = z;
        return this;
    }
}
