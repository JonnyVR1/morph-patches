package p153l;

import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class ofh0 implements z6m {

    /* JADX INFO: renamed from: b */
    public static final z6m f147073b = new ofh0();

    /* JADX INFO: renamed from: d */
    public static z6m m167454d() {
        return f147073b;
    }

    @Override // p153l.z6m
    /* JADX INFO: renamed from: a */
    public boolean mo95724a(sj6 sj6Var, Message message) {
        return NullChecker.m82486a(message) && TEnum.equals(message.messageType, MessageType.icebreak_qa);
    }

    @Override // p153l.z6m
    /* JADX INFO: renamed from: b */
    public CharSequence mo95725b(sj6 sj6Var, Message message) {
        return m218804c("交换答案");
    }
}
