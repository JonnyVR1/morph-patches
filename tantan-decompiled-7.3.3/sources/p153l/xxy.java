package p153l;

import com.p051p1.mobile.putong.core.data.OfficialAccountsMenu;
import com.p051p1.mobile.putong.core.p058ui.messages.model.messagebar.MessageBarActionItemView;

/* JADX INFO: loaded from: classes4.dex */
public class xxy extends rxy {

    /* JADX INFO: renamed from: i */
    public OfficialAccountsMenu f196704i;

    /* JADX INFO: renamed from: j */
    public int f196705j;

    @Override // p153l.rxy
    /* JADX INFO: renamed from: c */
    public void mo100971c(MessageBarActionItemView messageBarActionItemView, int i, int i2) {
        super.mo100971c(messageBarActionItemView, i, i2);
        bnl0.m105524M(messageBarActionItemView.f32776a, false);
        bnl0.m105524M(messageBarActionItemView.f32777b, false);
        bnl0.m105524M(messageBarActionItemView.f32778c, true);
        bnl0.m105524M(messageBarActionItemView.f32779d, i != i2 - 1);
        messageBarActionItemView.f32778c.setText(this.f196704i.text);
    }

    /* JADX INFO: renamed from: l */
    public OfficialAccountsMenu m213596l() {
        return this.f196704i;
    }

    /* JADX INFO: renamed from: m */
    public int m213597m() {
        return this.f196705j;
    }
}
