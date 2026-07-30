package p149l;

import com.p046p1.mobile.putong.core.data.OfficialAccountsMenu;
import com.p046p1.mobile.putong.core.p053ui.messages.model.messagebar.MessageBarActionItemView;

/* JADX INFO: loaded from: classes3.dex */
public class apy extends uoy {

    /* JADX INFO: renamed from: i */
    public OfficialAccountsMenu f71091i;

    /* JADX INFO: renamed from: j */
    public int f71092j;

    @Override // p149l.uoy
    /* JADX INFO: renamed from: c */
    public void mo98197c(MessageBarActionItemView messageBarActionItemView, int i, int i2) {
        super.mo98197c(messageBarActionItemView, i, i2);
        xdl0.m208344M(messageBarActionItemView.f31928a, false);
        xdl0.m208344M(messageBarActionItemView.f31929b, false);
        xdl0.m208344M(messageBarActionItemView.f31930c, true);
        xdl0.m208344M(messageBarActionItemView.f31931d, i != i2 - 1);
        messageBarActionItemView.f31930c.setText(this.f71091i.text);
    }

    /* JADX INFO: renamed from: l */
    public OfficialAccountsMenu m98198l() {
        return this.f71091i;
    }

    /* JADX INFO: renamed from: m */
    public int m98199m() {
        return this.f71092j;
    }
}
