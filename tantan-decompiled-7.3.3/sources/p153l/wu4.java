package p153l;

import com.p051p1.mobile.putong.core.data.ChatGroupMember;
import com.p051p1.mobile.putong.core.data.ChatGroupMemberStatus;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.data.orm.Index;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class wu4 extends wzh0<ChatGroupMember> {
    public wu4(h9c h9cVar, String str, vzf0<ChatGroupMember> vzf0Var, List<Index> list, int i) {
        super(h9cVar, str, vzf0Var, list, i);
    }

    /* JADX INFO: renamed from: F */
    public wzh0.C21213a m207918F(String str) {
        return new wzh0.C21213a("group/member/" + str + "/user", Filter.AND(ChatGroupMember.USERID.mo61359EQ(str)), ChatGroupMember.CREATEDTIME.ASC, 0, 100);
    }

    /* JADX INFO: renamed from: G */
    public wzh0.C21213a m207919G(String str) {
        return new wzh0.C21213a("group/" + str + "/members", Filter.AND(ChatGroupMember.GROUPID.mo61359EQ(str), ChatGroupMember.STATUS.NEQ(ChatGroupMemberStatus.exited)), ChatGroupMember.JOINTIME.ASC, 0, 500);
    }
}
