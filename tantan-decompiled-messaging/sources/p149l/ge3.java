package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"Ll/ge3;", "", "<init>", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveBottomButton;", "button", "", "a", "(Lcom/p1/mobile/putong/live/base/data/BLiveBottomButton;)V", "", "Lcom/p1/mobile/putong/live/base/data/BLiveButtonType;", "buttonTypes", "", "b", "(Lcom/p1/mobile/putong/live/base/data/BLiveBottomButton;[Lcom/p1/mobile/putong/live/base/data/BLiveButtonType;)Z", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class ge3 {

    @NotNull
    public static final ge3 INSTANCE = new ge3();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0176, code lost:
    
        if (r1.equals("lianmai") == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c4, code lost:
    
        if (r1.equals("memberManage") == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c8, code lost:
    
        r18.localType = com.p046p1.mobile.putong.live.base.data.BLiveButtonType.get(com.p046p1.mobile.putong.live.base.data.BLiveButtonType.callButton);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @kotlin.jvm.JvmStatic
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m125662a(@org.jetbrains.annotations.NotNull com.p046p1.mobile.putong.live.base.data.BLiveBottomButton r18) {
        /*
            Method dump skipped, instruction units count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p149l.ge3.m125662a(com.p1.mobile.putong.live.base.data.BLiveBottomButton):void");
    }

    /* JADX INFO: renamed from: b */
    public final boolean m125663b(BLiveBottomButton button, BLiveButtonType... buttonTypes) {
        for (BLiveButtonType bLiveButtonType : buttonTypes) {
            if (TextUtils.equals(button.type, bLiveButtonType.name())) {
                button.localType = bLiveButtonType;
                return true;
            }
        }
        return false;
    }
}
