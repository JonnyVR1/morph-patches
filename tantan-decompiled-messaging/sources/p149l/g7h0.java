package p149l;

import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class g7h0 implements j4m {

    /* JADX INFO: renamed from: b */
    public static final j4m f101382b = new g7h0();

    /* JADX INFO: renamed from: d */
    public static j4m m124693d() {
        return f101382b;
    }

    @Override // p149l.j4m
    /* JADX INFO: renamed from: a */
    public boolean mo94463a(pi6 pi6Var, Message message) {
        return NullChecker.m81303a(message) && TEnum.equals(message.messageType, MessageType.icebreak_qa);
    }

    @Override // p149l.j4m
    /* JADX INFO: renamed from: b */
    public CharSequence mo94464b(pi6 pi6Var, Message message) {
        return m139684c("交换答案");
    }
}
