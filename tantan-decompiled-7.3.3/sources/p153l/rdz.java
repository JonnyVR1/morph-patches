package p153l;

import android.view.View;
import android.view.ViewStub;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.messages.view.MessageUserHeaderLayout;
import p151v.VText;
import p153l.qzz;

/* JADX INFO: loaded from: classes4.dex */
public interface rdz<H, V extends qzz> {
    /* JADX INFO: renamed from: b */
    void mo120537b(MessagesAct messagesAct, iwl iwlVar, clz<H, V> clzVar);

    /* JADX INFO: renamed from: c */
    default MessageUserHeaderLayout mo175736c() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    default VText mo175737d() {
        return null;
    }

    /* JADX INFO: renamed from: f */
    default ViewStub mo175738f() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    View mo120538g();

    /* JADX INFO: renamed from: k */
    void mo120539k();

    /* JADX INFO: renamed from: a */
    default void mo175735a() {
    }

    /* JADX INFO: renamed from: e */
    default void mo169750e() {
    }

    /* JADX INFO: renamed from: i */
    default void mo175739i() {
    }

    /* JADX INFO: renamed from: j */
    default void mo169752j() {
    }

    /* JADX INFO: renamed from: h */
    default void mo169751h(vg60<Message> vg60Var) {
    }
}
