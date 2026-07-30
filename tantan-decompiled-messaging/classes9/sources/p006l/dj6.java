package p006l;

import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p1.mobile.putong.core.data.ConversationPatchRecord;
import com.p1.mobile.putong.data.tenum.TEnumColumn;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.data.orm.Index;
import com.tantanapp.common.data.orm.OrderedColumn;
import java.util.List;
import l.b8c;
import l.mrf0;
import l.orh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class dj6 extends orh0<ConversationPatchRecord> {
    public dj6(b8c b8cVar, String str, mrf0<ConversationPatchRecord> mrf0Var, List<Index> list, int i) {
        super(b8cVar, str, mrf0Var, list, i);
    }

    /* JADX INFO: renamed from: F */
    public orh0<ConversationPatchRecord>.a m14042F() {
        TEnumColumn tEnumColumn = ConversationPatchRecord.STATE;
        return new orh0.a(this, "waitingRecords", Filter.OR(new Filter[]{tEnumColumn.EQ(CameraSticker.CATEGORY_DEFAULT_FILTER), tEnumColumn.EQ("unknown_")}), ((OrderedColumn) ConversationPatchRecord.ID).DESC, 1, 100);
    }
}
