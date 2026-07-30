package p003l;

import com.p000p1.mobile.putong.core.p001ui.messages.model.messagebar.MessageBarActionItemView;
import com.p1.mobile.putong.core.data.OfficialAccountsMenu;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class apy extends uoy {

    /* JADX INFO: renamed from: i */
    public OfficialAccountsMenu f2252i;

    /* JADX INFO: renamed from: j */
    public int f2253j;

    @Override // p003l.uoy
    /* JADX INFO: renamed from: c */
    public void mo2907c(MessageBarActionItemView messageBarActionItemView, int i, int i2) {
        super.mo2907c(messageBarActionItemView, i, i2);
        xdl0.M(messageBarActionItemView.f1819a, false);
        xdl0.M(messageBarActionItemView.f1820b, false);
        xdl0.M(messageBarActionItemView.f1821c, true);
        xdl0.M(messageBarActionItemView.f1822d, i != i2 - 1);
        messageBarActionItemView.f1821c.setText(this.f2252i.text);
    }

    /* JADX INFO: renamed from: l */
    public OfficialAccountsMenu m2908l() {
        return this.f2252i;
    }

    /* JADX INFO: renamed from: m */
    public int m2909m() {
        return this.f2253j;
    }
}
