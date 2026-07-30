package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.base.data.BLiveSendActivityGiftTrace;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m87232d2 = {"Ll/oee0;", "Ll/kud0;", "Ll/ygt;", "<init>", "()V", "liveRoomScheme", "Ll/c2e0;", "plug", "Ll/x1e0$b;", "extraInfo", "", "b", "(Ll/ygt;Ll/c2e0;Ll/x1e0$b;)V", "Companion", "a", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class oee0 extends kud0<ygt> {

    /* JADX INFO: renamed from: l.oee0$b */
    @Metadata(m87231d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m87232d2 = {"l/oee0$b", "Ll/zfv$a$a;", "", "b", "()V", "c", "Lcom/p1/mobile/putong/live/base/data/BLiveGivenGiftBrief;", "brief", "a", "(Lcom/p1/mobile/putong/live/base/data/BLiveGivenGiftBrief;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C18906b implements zfv.C21687a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f143310a;

        public C18906b(String str) {
            this.f143310a = str;
        }

        @Override // p149l.zfv.C21687a.a
        /* JADX INFO: renamed from: a */
        public void mo67166a(BLiveGivenGiftBrief brief) {
            brief.getClass();
            gkh0.m126627j("[live][schema]", "schema: sendGift. SendGiftAction: contentJson is " + this.f143310a + " onSendSuccess()");
        }

        @Override // p149l.zfv.C21687a.a
        /* JADX INFO: renamed from: b */
        public void mo67167b() {
            gkh0.m126627j("[live][schema]", "schema: sendGift. SendGiftAction: contentJson is " + this.f143310a + " onSendCancel()");
        }

        @Override // p149l.zfv.C21687a.a
        /* JADX INFO: renamed from: c */
        public void mo67168c() {
            gkh0.m126627j("[live][schema]", "schema: sendGift. SendGiftAction: contentJson is " + this.f143310a + " onSendFail()");
        }
    }

    @Override // p149l.kud0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo95830a(@NotNull ygt liveRoomScheme, @NotNull c2e0 plug, @Nullable x1e0.C21019b extraInfo) {
        liveRoomScheme.getClass();
        plug.getClass();
        String strM214763g = liveRoomScheme.m214763g("giftId");
        String strM214763g2 = liveRoomScheme.m214763g("giftCount");
        String strM214763g3 = liveRoomScheme.m214763g("ignoreFirstSendAlert");
        String strM214763g4 = liveRoomScheme.m214763g("sendConfirm");
        String strM214763g5 = liveRoomScheme.m214763g("toUserId");
        String strM214763g6 = liveRoomScheme.m214763g("fromTag");
        String strM214763g7 = liveRoomScheme.m214763g("biz");
        if (TextUtils.isEmpty(strM214763g3)) {
            strM214763g3 = "0";
        }
        BLiveSendActivityGiftTrace bLiveSendActivityGiftTraceNew_ = BLiveSendActivityGiftTrace.new_();
        bLiveSendActivityGiftTraceNew_.giftId = strM214763g;
        bLiveSendActivityGiftTraceNew_.toUserId = strM214763g5;
        strM214763g2.getClass();
        bLiveSendActivityGiftTraceNew_.giftCount = Integer.parseInt(strM214763g2);
        bLiveSendActivityGiftTraceNew_.showSendGiftFirstConfirmDialogFlag = strM214763g3.toString();
        bLiveSendActivityGiftTraceNew_.showSendGiftConfirmDialogFlag = TextUtils.equals("true", strM214763g4);
        bLiveSendActivityGiftTraceNew_.fromTag = strM214763g6;
        bLiveSendActivityGiftTraceNew_.traceModule = strM214763g7;
        String json = bLiveSendActivityGiftTraceNew_.toJson();
        gkh0.m126627j("[live][schema]", "schema: sendGift. SendGiftAction: contentJson is " + json);
        ((ggv) ypv.m215673l(fld0.f98148c)).m126014H("sendGift", json, new C18906b(json));
    }
}
