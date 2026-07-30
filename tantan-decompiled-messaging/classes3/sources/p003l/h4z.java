package p003l;

import android.view.View;
import android.widget.AbsListView;
import com.p000p1.mobile.putong.core.p001ui.messages.MessagesAct;
import com.p1.mobile.putong.core.data.ChatGroup;
import l.utl;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class h4z implements u4z<ChatGroup, o7z> {

    /* JADX INFO: renamed from: a */
    public View f4116a;

    /* JADX INFO: renamed from: b */
    public View f4117b;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p003l.u4z
    /* JADX INFO: renamed from: b */
    public void mo4918b(MessagesAct messagesAct, utl utlVar, fcz<ChatGroup, o7z> fczVar) {
        this.f4116a = new View(messagesAct);
        View view = new View(messagesAct);
        this.f4117b = view;
        view.setLayoutParams(new AbsListView.LayoutParams(-1, 0));
        this.f4116a.setLayoutParams(new AbsListView.LayoutParams(-1, 0));
    }

    @Override // p003l.u4z
    /* JADX INFO: renamed from: g */
    public View mo4919g() {
        return this.f4116a;
    }

    @Override // p003l.u4z
    /* JADX INFO: renamed from: k */
    public void mo4920k() {
    }
}
