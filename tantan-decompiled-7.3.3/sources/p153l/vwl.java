package p153l;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.p058ui.messages.manager.insert.InsertLocalMsgTriggerType;
import com.p051p1.mobile.putong.core.p058ui.messages.manager.insert.LocalMsgInsertType;
import com.p051p1.mobile.putong.data.User;
import java.util.List;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes3.dex */
public interface vwl {
    /* JADX INFO: renamed from: a */
    LocalMsgInsertType mo112939a();

    @WorkerThread
    /* JADX INFO: renamed from: b */
    void mo112940b(Conversation conversation, @Nullable Message message, @Nullable User user, User user2, InsertLocalMsgTriggerType insertLocalMsgTriggerType, List<LocalMsgInsertType> list, C22507a<Boolean> c22507a);

    /* JADX INFO: renamed from: c */
    boolean mo112941c(InsertLocalMsgTriggerType insertLocalMsgTriggerType, Conversation conversation, @Nullable Message message, User user);
}
