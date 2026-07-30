package p149l;

import com.p046p1.mobile.putong.core.data.ChatGroupMember;
import com.p046p1.mobile.putong.core.data.ChatGroupMemberStatus;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.data.orm.Index;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class xt4 extends orh0<ChatGroupMember> {
    public xt4(b8c b8cVar, String str, mrf0<ChatGroupMember> mrf0Var, List<Index> list, int i) {
        super(b8cVar, str, mrf0Var, list, i);
    }

    /* JADX INFO: renamed from: F */
    public orh0.C19008a m210956F(String str) {
        return new orh0.C19008a("group/member/" + str + "/user", Filter.AND(ChatGroupMember.USERID.mo60175EQ(str)), ChatGroupMember.CREATEDTIME.ASC, 0, 100);
    }

    /* JADX INFO: renamed from: G */
    public orh0.C19008a m210957G(String str) {
        return new orh0.C19008a("group/" + str + "/members", Filter.AND(ChatGroupMember.GROUPID.mo60175EQ(str), ChatGroupMember.STATUS.NEQ(ChatGroupMemberStatus.exited)), ChatGroupMember.JOINTIME.ASC, 0, 500);
    }
}
