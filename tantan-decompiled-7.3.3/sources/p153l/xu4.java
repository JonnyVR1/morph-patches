package p153l;

import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.tantanapp.common.data.orm.Index;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class xu4 extends wzh0<ChatGroup> {
    public xu4(h9c h9cVar, String str, vzf0<ChatGroup> vzf0Var, List<Index> list, int i) {
        super(h9cVar, str, vzf0Var, list, i);
    }

    /* JADX INFO: renamed from: F */
    public wzh0.C21213a m213119F() {
        return new wzh0.C21213a("joinGroups", ChatGroup.STATUS.m61360EQ("default"), ChatGroup.CREATEDTIME.ASC, 1, 100);
    }
}
