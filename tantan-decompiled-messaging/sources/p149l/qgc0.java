package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class qgc0 implements j4m {

    /* JADX INFO: renamed from: b */
    public static final j4m f154322b = new qgc0();

    /* JADX INFO: renamed from: d */
    public static j4m m174396d() {
        return f154322b;
    }

    @Override // p149l.j4m
    /* JADX INFO: renamed from: a */
    public boolean mo94463a(pi6 pi6Var, Message message) {
        return NullChecker.m81303a(message) && TEnum.equals(message.messageType, MessageType.common_tip_box_v2) && NullChecker.m81303a(message.additionalData) && NullChecker.m81303a(message.additionalData.commonTipBox) && TextUtils.equals(message.additionalData.commonTipBox.type, "verify");
    }

    @Override // p149l.j4m
    /* JADX INFO: renamed from: b */
    public CharSequence mo94464b(pi6 pi6Var, Message message) {
        return "对方邀请你完成头像认证";
    }
}
