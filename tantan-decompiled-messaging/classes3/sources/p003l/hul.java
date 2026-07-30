package p003l;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.p000p1.mobile.putong.core.p001ui.messages.manager.insert.InsertLocalMsgTriggerType;
import com.p000p1.mobile.putong.core.p001ui.messages.manager.insert.LocalMsgInsertType;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.data.User;
import java.util.List;
import p014rx.subjects.C1185a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface hul {
    /* JADX INFO: renamed from: a */
    LocalMsgInsertType mo3175a();

    @WorkerThread
    /* JADX INFO: renamed from: b */
    void mo3176b(Conversation conversation, @Nullable Message message, @Nullable User user, User user2, InsertLocalMsgTriggerType insertLocalMsgTriggerType, List<LocalMsgInsertType> list, C1185a<Boolean> c1185a);

    /* JADX INFO: renamed from: c */
    boolean mo3177c(InsertLocalMsgTriggerType insertLocalMsgTriggerType, Conversation conversation, @Nullable Message message, User user);
}
