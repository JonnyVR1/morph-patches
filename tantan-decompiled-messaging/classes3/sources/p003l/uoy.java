package p003l;

import com.p000p1.mobile.putong.core.p001ui.messages.model.messagebar.MessageBarActionItemType;
import com.p000p1.mobile.putong.core.p001ui.messages.model.messagebar.MessageBarActionItemView;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class uoy {

    /* JADX INFO: renamed from: a */
    public MessageBarActionItemType f8044a;

    /* JADX INFO: renamed from: b */
    public int f8045b;

    /* JADX INFO: renamed from: c */
    public int f8046c;

    /* JADX INFO: renamed from: d */
    public boolean f8047d;

    /* JADX INFO: renamed from: e */
    public boolean f8048e;

    /* JADX INFO: renamed from: f */
    public int f8049f;

    /* JADX INFO: renamed from: g */
    public int f8050g;

    /* JADX INFO: renamed from: h */
    public boolean f8051h;

    public uoy(MessageBarActionItemType messageBarActionItemType) {
        MessageBarActionItemType messageBarActionItemType2 = MessageBarActionItemType.UNKNOWN;
        this.f8045b = -1;
        this.f8046c = -1;
        this.f8047d = true;
        this.f8048e = true;
        this.f8049f = 0;
        this.f8050g = 0;
        this.f8051h = false;
        this.f8044a = messageBarActionItemType;
    }

    /* JADX INFO: renamed from: a */
    public void m8184a(int i) {
        this.f8049f = i | this.f8049f;
    }

    /* JADX INFO: renamed from: b */
    public void m8185b() {
        this.f8049f = 0;
    }

    /* JADX INFO: renamed from: c */
    public void mo2907c(MessageBarActionItemView messageBarActionItemView, int i, int i2) {
        if (!m8187e(2)) {
            if (m8187e(1)) {
                int i3 = this.f8046c;
                if (i3 > 0) {
                    messageBarActionItemView.f1819a.setImageResource(i3);
                }
            } else {
                int i4 = this.f8045b;
                if (i4 > 0) {
                    messageBarActionItemView.f1819a.setImageResource(i4);
                }
            }
        }
        xdl0.M(messageBarActionItemView, this.f8048e & this.f8047d);
    }

    /* JADX INFO: renamed from: d */
    public MessageBarActionItemType m8186d() {
        return this.f8044a;
    }

    /* JADX INFO: renamed from: e */
    public boolean m8187e(int i) {
        return (this.f8049f & i) > 0;
    }

    /* JADX INFO: renamed from: f */
    public boolean m8188f() {
        return this.f8051h;
    }

    /* JADX INFO: renamed from: g */
    public boolean m8189g() {
        return (this.f8049f & 1) > 0;
    }

    /* JADX INFO: renamed from: h */
    public uoy m8190h() {
        this.f8051h = true;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public void m8191i(boolean z) {
        int i = this.f8049f;
        if (z) {
            this.f8049f = i | 1;
        } else {
            this.f8049f = i & (-2);
        }
    }

    /* JADX INFO: renamed from: j */
    public uoy m8192j(boolean z) {
        this.f8047d = z;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public uoy m8193k(boolean z) {
        this.f8048e = z;
        return this;
    }

    public uoy(MessageBarActionItemType messageBarActionItemType, int i, int i2) {
        this(messageBarActionItemType);
        this.f8045b = i;
        this.f8046c = i2;
    }
}
