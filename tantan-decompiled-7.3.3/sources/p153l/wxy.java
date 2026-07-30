package p153l;

import com.p051p1.mobile.putong.core.p058ui.messages.model.messagebar.MessageBarActionItemType;
import com.p051p1.mobile.putong.core.p058ui.messages.model.messagebar.MessageBarActionItemView;

/* JADX INFO: loaded from: classes4.dex */
public class wxy extends rxy {

    /* JADX INFO: renamed from: i */
    public int f191543i;

    /* JADX INFO: renamed from: j */
    public int f191544j;

    public wxy(MessageBarActionItemType messageBarActionItemType, int i, int i2) {
        super(messageBarActionItemType, i, i2);
        this.f191543i = -1;
        this.f191544j = -1;
    }

    @Override // p153l.rxy
    /* JADX INFO: renamed from: c */
    public void mo100971c(MessageBarActionItemView messageBarActionItemView, int i, int i2) {
        if (m183574e(2)) {
            messageBarActionItemView.f32776a.setImageResource(this.f165386c);
            messageBarActionItemView.f32776a.setColorFilter(this.f191544j);
        } else {
            messageBarActionItemView.f32776a.setImageResource(this.f165385b);
            messageBarActionItemView.f32776a.setColorFilter(this.f191543i);
        }
        bnl0.m105524M(messageBarActionItemView, this.f165388e & this.f165387d);
    }

    /* JADX INFO: renamed from: l */
    public wxy m208460l(int i) {
        this.f191543i = i;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public wxy m208461m(int i) {
        this.f191544j = i;
        return this;
    }
}
