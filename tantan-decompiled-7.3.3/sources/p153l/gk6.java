package p153l;

import com.p051p1.mobile.putong.core.data.ConversationPatchRecord;
import com.p051p1.mobile.putong.core.data.ConversationPatchState;
import com.p051p1.mobile.putong.data.tenum.TEnumColumn;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.data.orm.Index;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class gk6 extends wzh0<ConversationPatchRecord> {
    public gk6(h9c h9cVar, String str, vzf0<ConversationPatchRecord> vzf0Var, List<Index> list, int i) {
        super(h9cVar, str, vzf0Var, list, i);
    }

    /* JADX INFO: renamed from: F */
    public wzh0<ConversationPatchRecord>.C21213a m130567F() {
        TEnumColumn<ConversationPatchRecord, ConversationPatchState> tEnumColumn = ConversationPatchRecord.STATE;
        return new wzh0.C21213a("waitingRecords", Filter.m82444OR(tEnumColumn.m61360EQ("default"), tEnumColumn.m61360EQ("unknown_")), ConversationPatchRecord.f21117ID.DESC, 1, 100);
    }
}
