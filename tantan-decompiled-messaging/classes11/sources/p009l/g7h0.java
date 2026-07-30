package p009l;

import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class g7h0 implements j4m {

    /* JADX INFO: renamed from: b */
    public static final j4m f13341b = new g7h0();

    /* JADX INFO: renamed from: d */
    public static j4m m14797d() {
        return f13341b;
    }

    @Override // p009l.j4m
    /* JADX INFO: renamed from: a */
    public boolean mo11180a(pi6 pi6Var, Message message) {
        return NullChecker.a(message) && TEnum.equals(message.messageType, "icebreak_qa");
    }

    @Override // p009l.j4m
    /* JADX INFO: renamed from: b */
    public CharSequence mo11181b(pi6 pi6Var, Message message) {
        return m16869c("交换答案");
    }
}
