package p149l;

import com.p046p1.mobile.putong.core.p053ui.messages.model.messagebar.MessageBarActionItemType;
import com.p046p1.mobile.putong.core.p053ui.messages.model.messagebar.MessageBarActionItemView;

/* JADX INFO: loaded from: classes3.dex */
public class zoy extends uoy {

    /* JADX INFO: renamed from: i */
    public int f204159i;

    /* JADX INFO: renamed from: j */
    public int f204160j;

    public zoy(MessageBarActionItemType messageBarActionItemType, int i, int i2) {
        super(messageBarActionItemType, i, i2);
        this.f204159i = -1;
        this.f204160j = -1;
    }

    @Override // p149l.uoy
    /* JADX INFO: renamed from: c */
    public void mo98197c(MessageBarActionItemView messageBarActionItemView, int i, int i2) {
        if (m194574e(2)) {
            messageBarActionItemView.f31928a.setImageResource(this.f177552c);
            messageBarActionItemView.f31928a.setColorFilter(this.f204160j);
        } else {
            messageBarActionItemView.f31928a.setImageResource(this.f177551b);
            messageBarActionItemView.f31928a.setColorFilter(this.f204159i);
        }
        xdl0.m208344M(messageBarActionItemView, this.f177554e & this.f177553d);
    }

    /* JADX INFO: renamed from: l */
    public zoy m219603l(int i) {
        this.f204159i = i;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public zoy m219604m(int i) {
        this.f204160j = i;
        return this;
    }
}
