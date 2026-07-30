package p153l;

import com.p051p1.mobile.putong.core.p058ui.messages.model.messagebar.MessageBarActionItemType;
import com.p051p1.mobile.putong.core.p058ui.messages.model.messagebar.MessageBarActionItemView;

/* JADX INFO: loaded from: classes4.dex */
public class sxy extends zxy {

    /* JADX INFO: renamed from: n */
    public int f171202n;

    public sxy(MessageBarActionItemType messageBarActionItemType, int i, int i2) {
        super(messageBarActionItemType, i, -1);
        this.f171202n = i2;
    }

    @Override // p153l.zxy, p153l.yxy, p153l.rxy
    /* JADX INFO: renamed from: c */
    public void mo100971c(MessageBarActionItemView messageBarActionItemView, int i, int i2) {
        if (!m183574e(2)) {
            super.mo100971c(messageBarActionItemView, i, i2);
            return;
        }
        if (m183574e(1)) {
            messageBarActionItemView.f32776a.setImageResource(this.f171202n);
        } else {
            messageBarActionItemView.f32776a.setImageResource(this.f165385b);
        }
        messageBarActionItemView.f32776a.setColorFilter(-1);
        bnl0.m105524M(messageBarActionItemView, this.f165388e & this.f165387d);
    }

    @Override // p153l.yxy
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public sxy mo188528l(int i) {
        this.f202017i = i;
        return this;
    }

    @Override // p153l.yxy
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public sxy mo188529n(int i) {
        this.f202018j = i;
        return this;
    }
}
