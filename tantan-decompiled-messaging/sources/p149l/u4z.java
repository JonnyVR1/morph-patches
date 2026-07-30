package p149l;

import android.view.View;
import android.view.ViewStub;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.messages.view.MessageUserHeaderLayout;
import p147v.VText;
import p149l.tqz;

/* JADX INFO: loaded from: classes3.dex */
public interface u4z<H, V extends tqz> {
    /* JADX INFO: renamed from: b */
    void mo129344b(MessagesAct messagesAct, utl utlVar, fcz<H, V> fczVar);

    /* JADX INFO: renamed from: c */
    default MessageUserHeaderLayout mo191240c() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    default VText mo191241d() {
        return null;
    }

    /* JADX INFO: renamed from: f */
    default ViewStub mo191242f() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    View mo129345g();

    /* JADX INFO: renamed from: k */
    void mo129346k();

    /* JADX INFO: renamed from: a */
    default void mo191239a() {
    }

    /* JADX INFO: renamed from: e */
    default void mo180267e() {
    }

    /* JADX INFO: renamed from: i */
    default void mo191243i() {
    }

    /* JADX INFO: renamed from: j */
    default void mo180269j() {
    }

    /* JADX INFO: renamed from: h */
    default void mo180268h(q860<Message> q860Var) {
    }
}
