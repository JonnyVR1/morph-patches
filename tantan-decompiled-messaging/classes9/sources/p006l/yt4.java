package p006l;

import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.tantanapp.common.data.orm.Index;
import com.tantanapp.common.data.orm.OrderedColumn;
import java.util.List;
import l.b8c;
import l.mrf0;
import l.orh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class yt4 extends orh0<ChatGroup> {
    public yt4(b8c b8cVar, String str, mrf0<ChatGroup> mrf0Var, List<Index> list, int i) {
        super(b8cVar, str, mrf0Var, list, i);
    }

    /* JADX INFO: renamed from: F */
    public orh0.a m28390F() {
        return new orh0.a(this, "joinGroups", ChatGroup.STATUS.EQ(CameraSticker.CATEGORY_DEFAULT_FILTER), ((OrderedColumn) ChatGroup.CREATEDTIME).ASC, 1, 100);
    }
}
