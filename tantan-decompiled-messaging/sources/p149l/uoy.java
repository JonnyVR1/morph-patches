package p149l;

import com.p046p1.mobile.putong.core.p053ui.messages.model.messagebar.MessageBarActionItemType;
import com.p046p1.mobile.putong.core.p053ui.messages.model.messagebar.MessageBarActionItemView;

/* JADX INFO: loaded from: classes3.dex */
public class uoy {

    /* JADX INFO: renamed from: a */
    public MessageBarActionItemType f177550a;

    /* JADX INFO: renamed from: b */
    public int f177551b;

    /* JADX INFO: renamed from: c */
    public int f177552c;

    /* JADX INFO: renamed from: d */
    public boolean f177553d;

    /* JADX INFO: renamed from: e */
    public boolean f177554e;

    /* JADX INFO: renamed from: f */
    public int f177555f;

    /* JADX INFO: renamed from: g */
    public int f177556g;

    /* JADX INFO: renamed from: h */
    public boolean f177557h;

    public uoy(MessageBarActionItemType messageBarActionItemType) {
        MessageBarActionItemType messageBarActionItemType2 = MessageBarActionItemType.UNKNOWN;
        this.f177551b = -1;
        this.f177552c = -1;
        this.f177553d = true;
        this.f177554e = true;
        this.f177555f = 0;
        this.f177556g = 0;
        this.f177557h = false;
        this.f177550a = messageBarActionItemType;
    }

    /* JADX INFO: renamed from: a */
    public void m194571a(int i) {
        this.f177555f = i | this.f177555f;
    }

    /* JADX INFO: renamed from: b */
    public void m194572b() {
        this.f177555f = 0;
    }

    /* JADX INFO: renamed from: c */
    public void mo98197c(MessageBarActionItemView messageBarActionItemView, int i, int i2) {
        if (!m194574e(2)) {
            if (m194574e(1)) {
                int i3 = this.f177552c;
                if (i3 > 0) {
                    messageBarActionItemView.f31928a.setImageResource(i3);
                }
            } else {
                int i4 = this.f177551b;
                if (i4 > 0) {
                    messageBarActionItemView.f31928a.setImageResource(i4);
                }
            }
        }
        xdl0.m208344M(messageBarActionItemView, this.f177554e & this.f177553d);
    }

    /* JADX INFO: renamed from: d */
    public MessageBarActionItemType m194573d() {
        return this.f177550a;
    }

    /* JADX INFO: renamed from: e */
    public boolean m194574e(int i) {
        return (this.f177555f & i) > 0;
    }

    /* JADX INFO: renamed from: f */
    public boolean m194575f() {
        return this.f177557h;
    }

    /* JADX INFO: renamed from: g */
    public boolean m194576g() {
        return (this.f177555f & 1) > 0;
    }

    /* JADX INFO: renamed from: h */
    public uoy m194577h() {
        this.f177557h = true;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public void m194578i(boolean z) {
        int i = this.f177555f;
        if (z) {
            this.f177555f = i | 1;
        } else {
            this.f177555f = i & (-2);
        }
    }

    /* JADX INFO: renamed from: j */
    public uoy m194579j(boolean z) {
        this.f177553d = z;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public uoy m194580k(boolean z) {
        this.f177554e = z;
        return this;
    }

    public uoy(MessageBarActionItemType messageBarActionItemType, int i, int i2) {
        this(messageBarActionItemType);
        this.f177551b = i;
        this.f177552c = i2;
    }
}
