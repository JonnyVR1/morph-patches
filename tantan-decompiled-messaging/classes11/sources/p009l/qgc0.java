package p009l;

import android.text.TextUtils;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class qgc0 implements j4m {

    /* JADX INFO: renamed from: b */
    public static final j4m f19232b = new qgc0();

    /* JADX INFO: renamed from: d */
    public static j4m m20972d() {
        return f19232b;
    }

    @Override // p009l.j4m
    /* JADX INFO: renamed from: a */
    public boolean mo11180a(pi6 pi6Var, Message message) {
        return NullChecker.a(message) && TEnum.equals(message.messageType, "common_tip_box_v2") && NullChecker.a(message.additionalData) && NullChecker.a(message.additionalData.commonTipBox) && TextUtils.equals(message.additionalData.commonTipBox.type, "verify");
    }

    @Override // p009l.j4m
    /* JADX INFO: renamed from: b */
    public CharSequence mo11181b(pi6 pi6Var, Message message) {
        return "对方邀请你完成头像认证";
    }
}
