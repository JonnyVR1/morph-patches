package p003l;

import android.view.View;
import android.view.ViewStub;
import com.p000p1.mobile.putong.core.p001ui.messages.MessagesAct;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.ui.messages.view.MessageUserHeaderLayout;
import l.q860;
import l.utl;
import p003l.tqz;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface u4z<H, V extends tqz> {
    /* JADX INFO: renamed from: b */
    void mo4918b(MessagesAct messagesAct, utl utlVar, fcz<H, V> fczVar);

    /* JADX INFO: renamed from: c */
    default MessageUserHeaderLayout mo8073c() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    default VText mo8074d() {
        return null;
    }

    /* JADX INFO: renamed from: f */
    default ViewStub mo8075f() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    View mo4919g();

    /* JADX INFO: renamed from: k */
    void mo4920k();

    /* JADX INFO: renamed from: a */
    default void mo8072a() {
    }

    /* JADX INFO: renamed from: e */
    default void mo7352e() {
    }

    /* JADX INFO: renamed from: i */
    default void mo8076i() {
    }

    /* JADX INFO: renamed from: j */
    default void mo7354j() {
    }

    /* JADX INFO: renamed from: h */
    default void mo7353h(q860<Message> q860Var) {
    }
}
