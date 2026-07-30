package p149l;

import com.p046p1.mobile.putong.core.p053ui.messages.model.messagebar.MessageBarActionItemType;
import com.p046p1.mobile.putong.core.p053ui.messages.model.messagebar.MessageBarActionItemView;

/* JADX INFO: loaded from: classes3.dex */
public class voy extends cpy {

    /* JADX INFO: renamed from: n */
    public int f182433n;

    public voy(MessageBarActionItemType messageBarActionItemType, int i, int i2) {
        super(messageBarActionItemType, i, -1);
        this.f182433n = i2;
    }

    @Override // p149l.cpy, p149l.bpy, p149l.uoy
    /* JADX INFO: renamed from: c */
    public void mo98197c(MessageBarActionItemView messageBarActionItemView, int i, int i2) {
        if (!m194574e(2)) {
            super.mo98197c(messageBarActionItemView, i, i2);
            return;
        }
        if (m194574e(1)) {
            messageBarActionItemView.f31928a.setImageResource(this.f182433n);
        } else {
            messageBarActionItemView.f31928a.setImageResource(this.f177551b);
        }
        messageBarActionItemView.f31928a.setColorFilter(-1);
        xdl0.m208344M(messageBarActionItemView, this.f177554e & this.f177553d);
    }

    @Override // p149l.bpy
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public voy mo103098l(int i) {
        this.f76687i = i;
        return this;
    }

    @Override // p149l.bpy
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public voy mo103100n(int i) {
        this.f76688j = i;
        return this;
    }
}
