package p002l;

import android.text.TextUtils;
import com.p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p1.mobile.putong.live.base.data.BLiveSendActivityGiftTrace;
import kotlin.Metadata;
import l.fld0;
import l.ggv;
import l.gkh0;
import l.ygt;
import l.ypv;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Ll/oee0;", "Ll/kud0;", "Ll/ygt;", "<init>", "()V", "liveRoomScheme", "Ll/c2e0;", "plug", "Ll/x1e0$b;", "extraInfo", "", "b", "(Ll/ygt;Ll/c2e0;Ll/x1e0$b;)V", "Companion", "a", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class oee0 extends kud0<ygt> {

    /* JADX INFO: renamed from: l.oee0$b */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"l/oee0$b", "Ll/zfv$a$a;", "", "b", "()V", "c", "Lcom/p1/mobile/putong/live/base/data/BLiveGivenGiftBrief;", "brief", "a", "(Lcom/p1/mobile/putong/live/base/data/BLiveGivenGiftBrief;)V", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0721b implements zfv.C0940a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f16549a;

        public C0721b(String str) {
            this.f16549a = str;
        }

        @Override // p002l.zfv.C0940a.a
        /* JADX INFO: renamed from: a */
        public void mo5855a(BLiveGivenGiftBrief brief) {
            brief.getClass();
            gkh0.j("[live][schema]", "schema: sendGift. SendGiftAction: contentJson is " + this.f16549a + " onSendSuccess()");
        }

        @Override // p002l.zfv.C0940a.a
        /* JADX INFO: renamed from: b */
        public void mo5856b() {
            gkh0.j("[live][schema]", "schema: sendGift. SendGiftAction: contentJson is " + this.f16549a + " onSendCancel()");
        }

        @Override // p002l.zfv.C0940a.a
        /* JADX INFO: renamed from: c */
        public void mo5857c() {
            gkh0.j("[live][schema]", "schema: sendGift. SendGiftAction: contentJson is " + this.f16549a + " onSendFail()");
        }
    }

    @Override // p002l.kud0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo9496a(@NotNull ygt liveRoomScheme, @NotNull c2e0 plug, @Nullable x1e0.C0892b extraInfo) {
        liveRoomScheme.getClass();
        plug.getClass();
        String strG = liveRoomScheme.g("giftId");
        String strG2 = liveRoomScheme.g("giftCount");
        String strG3 = liveRoomScheme.g("ignoreFirstSendAlert");
        String strG4 = liveRoomScheme.g("sendConfirm");
        String strG5 = liveRoomScheme.g("toUserId");
        String strG6 = liveRoomScheme.g("fromTag");
        String strG7 = liveRoomScheme.g("biz");
        if (TextUtils.isEmpty(strG3)) {
            strG3 = "0";
        }
        BLiveSendActivityGiftTrace bLiveSendActivityGiftTraceNew_ = BLiveSendActivityGiftTrace.new_();
        bLiveSendActivityGiftTraceNew_.giftId = strG;
        bLiveSendActivityGiftTraceNew_.toUserId = strG5;
        strG2.getClass();
        bLiveSendActivityGiftTraceNew_.giftCount = Integer.parseInt(strG2);
        bLiveSendActivityGiftTraceNew_.showSendGiftFirstConfirmDialogFlag = strG3.toString();
        bLiveSendActivityGiftTraceNew_.showSendGiftConfirmDialogFlag = TextUtils.equals("true", strG4);
        bLiveSendActivityGiftTraceNew_.fromTag = strG6;
        bLiveSendActivityGiftTraceNew_.traceModule = strG7;
        String json = bLiveSendActivityGiftTraceNew_.toJson();
        gkh0.j("[live][schema]", "schema: sendGift. SendGiftAction: contentJson is " + json);
        ((ggv) ypv.l(fld0.c)).H("sendGift", json, new C0721b(json));
    }
}
