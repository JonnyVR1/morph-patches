package p006l;

import com.p1.mobile.putong.core.data.ChatGroupMember;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.data.orm.Index;
import com.tantanapp.common.data.orm.OrderedColumn;
import java.util.List;
import l.b8c;
import l.mrf0;
import l.orh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class xt4 extends orh0<ChatGroupMember> {
    public xt4(b8c b8cVar, String str, mrf0<ChatGroupMember> mrf0Var, List<Index> list, int i) {
        super(b8cVar, str, mrf0Var, list, i);
    }

    /* JADX INFO: renamed from: F */
    public orh0.a m27604F(String str) {
        return new orh0.a(this, "group/member/" + str + "/user", Filter.AND(new Filter[]{ChatGroupMember.USERID.EQ(str)}), ((OrderedColumn) ChatGroupMember.CREATEDTIME).ASC, 0, 100);
    }

    /* JADX INFO: renamed from: G */
    public orh0.a m27605G(String str) {
        return new orh0.a(this, "group/" + str + "/members", Filter.AND(new Filter[]{ChatGroupMember.GROUPID.EQ(str), ChatGroupMember.STATUS.NEQ("exited")}), ((OrderedColumn) ChatGroupMember.JOINTIME).ASC, 0, 500);
    }
}
