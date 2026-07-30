package p149l;

import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.tantanapp.common.data.orm.Index;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class yt4 extends orh0<ChatGroup> {
    public yt4(b8c b8cVar, String str, mrf0<ChatGroup> mrf0Var, List<Index> list, int i) {
        super(b8cVar, str, mrf0Var, list, i);
    }

    /* JADX INFO: renamed from: F */
    public orh0.C19008a m215996F() {
        return new orh0.C19008a("joinGroups", ChatGroup.STATUS.m60176EQ("default"), ChatGroup.CREATEDTIME.ASC, 1, 100);
    }
}
