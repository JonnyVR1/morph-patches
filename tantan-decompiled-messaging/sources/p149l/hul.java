package p149l;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.p053ui.messages.manager.insert.InsertLocalMsgTriggerType;
import com.p046p1.mobile.putong.core.p053ui.messages.manager.insert.LocalMsgInsertType;
import com.p046p1.mobile.putong.data.User;
import java.util.List;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes3.dex */
public interface hul {
    /* JADX INFO: renamed from: a */
    LocalMsgInsertType mo103994a();

    @WorkerThread
    /* JADX INFO: renamed from: b */
    void mo103995b(Conversation conversation, @Nullable Message message, @Nullable User user, User user2, InsertLocalMsgTriggerType insertLocalMsgTriggerType, List<LocalMsgInsertType> list, C22392a<Boolean> c22392a);

    /* JADX INFO: renamed from: c */
    boolean mo103996c(InsertLocalMsgTriggerType insertLocalMsgTriggerType, Conversation conversation, @Nullable Message message, User user);
}
