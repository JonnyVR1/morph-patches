package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class xoc0 implements z6m {

    /* JADX INFO: renamed from: b */
    public static final z6m f195568b = new xoc0();

    /* JADX INFO: renamed from: d */
    public static z6m m212464d() {
        return f195568b;
    }

    @Override // p153l.z6m
    /* JADX INFO: renamed from: a */
    public boolean mo95724a(sj6 sj6Var, Message message) {
        return NullChecker.m82486a(message) && TEnum.equals(message.messageType, MessageType.common_tip_box_v2) && NullChecker.m82486a(message.additionalData) && NullChecker.m82486a(message.additionalData.commonTipBox) && TextUtils.equals(message.additionalData.commonTipBox.type, "verify");
    }

    @Override // p153l.z6m
    /* JADX INFO: renamed from: b */
    public CharSequence mo95725b(sj6 sj6Var, Message message) {
        return "对方邀请你完成头像认证";
    }
}
