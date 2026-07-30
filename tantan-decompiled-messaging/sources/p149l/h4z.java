package p149l;

import android.view.View;
import android.widget.AbsListView;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;

/* JADX INFO: loaded from: classes3.dex */
public class h4z implements u4z<ChatGroup, o7z> {

    /* JADX INFO: renamed from: a */
    public View f105902a;

    /* JADX INFO: renamed from: b */
    public View f105903b;

    @Override // p149l.u4z
    /* JADX INFO: renamed from: b */
    public void mo129344b(MessagesAct messagesAct, utl utlVar, fcz<ChatGroup, o7z> fczVar) {
        this.f105902a = new View(messagesAct);
        View view = new View(messagesAct);
        this.f105903b = view;
        view.setLayoutParams(new AbsListView.LayoutParams(-1, 0));
        this.f105902a.setLayoutParams(new AbsListView.LayoutParams(-1, 0));
    }

    @Override // p149l.u4z
    /* JADX INFO: renamed from: g */
    public View mo129345g() {
        return this.f105902a;
    }

    @Override // p149l.u4z
    /* JADX INFO: renamed from: k */
    public void mo129346k() {
    }
}
