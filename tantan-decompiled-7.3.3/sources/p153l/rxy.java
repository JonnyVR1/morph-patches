package p153l;

import com.p051p1.mobile.putong.core.p058ui.messages.model.messagebar.MessageBarActionItemType;
import com.p051p1.mobile.putong.core.p058ui.messages.model.messagebar.MessageBarActionItemView;

/* JADX INFO: loaded from: classes4.dex */
public class rxy {

    /* JADX INFO: renamed from: a */
    public MessageBarActionItemType f165384a;

    /* JADX INFO: renamed from: b */
    public int f165385b;

    /* JADX INFO: renamed from: c */
    public int f165386c;

    /* JADX INFO: renamed from: d */
    public boolean f165387d;

    /* JADX INFO: renamed from: e */
    public boolean f165388e;

    /* JADX INFO: renamed from: f */
    public int f165389f;

    /* JADX INFO: renamed from: g */
    public int f165390g;

    /* JADX INFO: renamed from: h */
    public boolean f165391h;

    public rxy(MessageBarActionItemType messageBarActionItemType) {
        MessageBarActionItemType messageBarActionItemType2 = MessageBarActionItemType.UNKNOWN;
        this.f165385b = -1;
        this.f165386c = -1;
        this.f165387d = true;
        this.f165388e = true;
        this.f165389f = 0;
        this.f165390g = 0;
        this.f165391h = false;
        this.f165384a = messageBarActionItemType;
    }

    /* JADX INFO: renamed from: a */
    public void m183571a(int i) {
        this.f165389f = i | this.f165389f;
    }

    /* JADX INFO: renamed from: b */
    public void m183572b() {
        this.f165389f = 0;
    }

    /* JADX INFO: renamed from: c */
    public void mo100971c(MessageBarActionItemView messageBarActionItemView, int i, int i2) {
        if (!m183574e(2)) {
            if (m183574e(1)) {
                int i3 = this.f165386c;
                if (i3 > 0) {
                    messageBarActionItemView.f32776a.setImageResource(i3);
                }
            } else {
                int i4 = this.f165385b;
                if (i4 > 0) {
                    messageBarActionItemView.f32776a.setImageResource(i4);
                }
            }
        }
        bnl0.m105524M(messageBarActionItemView, this.f165388e & this.f165387d);
    }

    /* JADX INFO: renamed from: d */
    public MessageBarActionItemType m183573d() {
        return this.f165384a;
    }

    /* JADX INFO: renamed from: e */
    public boolean m183574e(int i) {
        return (this.f165389f & i) > 0;
    }

    /* JADX INFO: renamed from: f */
    public boolean m183575f() {
        return this.f165391h;
    }

    /* JADX INFO: renamed from: g */
    public boolean m183576g() {
        return (this.f165389f & 1) > 0;
    }

    /* JADX INFO: renamed from: h */
    public rxy m183577h() {
        this.f165391h = true;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public void m183578i(boolean z) {
        int i = this.f165389f;
        if (z) {
            this.f165389f = i | 1;
        } else {
            this.f165389f = i & (-2);
        }
    }

    /* JADX INFO: renamed from: j */
    public rxy m183579j(boolean z) {
        this.f165387d = z;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public rxy m183580k(boolean z) {
        this.f165388e = z;
        return this;
    }

    public rxy(MessageBarActionItemType messageBarActionItemType, int i, int i2) {
        this(messageBarActionItemType);
        this.f165385b = i;
        this.f165386c = i2;
    }
}
