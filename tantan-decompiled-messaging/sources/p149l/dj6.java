package p149l;

import com.p046p1.mobile.putong.core.data.ConversationPatchRecord;
import com.p046p1.mobile.putong.core.data.ConversationPatchState;
import com.p046p1.mobile.putong.data.tenum.TEnumColumn;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.data.orm.Index;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class dj6 extends orh0<ConversationPatchRecord> {
    public dj6(b8c b8cVar, String str, mrf0<ConversationPatchRecord> mrf0Var, List<Index> list, int i) {
        super(b8cVar, str, mrf0Var, list, i);
    }

    /* JADX INFO: renamed from: F */
    public orh0<ConversationPatchRecord>.C19008a m112021F() {
        TEnumColumn<ConversationPatchRecord, ConversationPatchState> tEnumColumn = ConversationPatchRecord.STATE;
        return new orh0.C19008a("waitingRecords", Filter.m81261OR(tEnumColumn.m60176EQ("default"), tEnumColumn.m60176EQ("unknown_")), ConversationPatchRecord.f20375ID.DESC, 1, 100);
    }
}
