package p003l;

import com.p000p1.mobile.putong.core.p001ui.messages.model.messagebar.MessageBarActionItemType;
import com.p000p1.mobile.putong.core.p001ui.messages.model.messagebar.MessageBarActionItemView;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class voy extends cpy {

    /* JADX INFO: renamed from: n */
    public int f8362n;

    public voy(MessageBarActionItemType messageBarActionItemType, int i, int i2) {
        super(messageBarActionItemType, i, -1);
        this.f8362n = i2;
    }

    @Override // p003l.cpy, p003l.bpy, p003l.uoy
    /* JADX INFO: renamed from: c */
    public void mo2907c(MessageBarActionItemView messageBarActionItemView, int i, int i2) {
        if (!m8187e(2)) {
            super.mo2907c(messageBarActionItemView, i, i2);
            return;
        }
        if (m8187e(1)) {
            messageBarActionItemView.f1819a.setImageResource(this.f8362n);
        } else {
            messageBarActionItemView.f1819a.setImageResource(this.f8045b);
        }
        messageBarActionItemView.f1819a.setColorFilter(-1);
        xdl0.M(messageBarActionItemView, this.f8048e & this.f8047d);
    }

    @Override // p003l.bpy
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public voy mo2978l(int i) {
        this.f2423i = i;
        return this;
    }

    @Override // p003l.bpy
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public voy mo2980n(int i) {
        this.f2424j = i;
        return this;
    }
}
