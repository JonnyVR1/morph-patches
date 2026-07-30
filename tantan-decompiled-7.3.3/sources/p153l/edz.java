package p153l;

import android.view.View;
import android.widget.AbsListView;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;

/* JADX INFO: loaded from: classes4.dex */
public class edz implements rdz<ChatGroup, lgz> {

    /* JADX INFO: renamed from: a */
    public View f93609a;

    /* JADX INFO: renamed from: b */
    public View f93610b;

    @Override // p153l.rdz
    /* JADX INFO: renamed from: b */
    public void mo120537b(MessagesAct messagesAct, iwl iwlVar, clz<ChatGroup, lgz> clzVar) {
        this.f93609a = new View(messagesAct);
        View view = new View(messagesAct);
        this.f93610b = view;
        view.setLayoutParams(new AbsListView.LayoutParams(-1, 0));
        this.f93609a.setLayoutParams(new AbsListView.LayoutParams(-1, 0));
    }

    @Override // p153l.rdz
    /* JADX INFO: renamed from: g */
    public View mo120538g() {
        return this.f93609a;
    }

    @Override // p153l.rdz
    /* JADX INFO: renamed from: k */
    public void mo120539k() {
    }
}
