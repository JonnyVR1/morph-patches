package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.base.data.BLiveSendActivityGiftTrace;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m88121d2 = {"Ll/tme0;", "Ll/o2e0;", "Ll/zit;", "<init>", "()V", "liveRoomScheme", "Ll/gae0;", "plug", "Ll/bae0$b;", "extraInfo", "", "b", "(Ll/zit;Ll/gae0;Ll/bae0$b;)V", "Companion", "a", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class tme0 extends o2e0<zit> {

    /* JADX INFO: renamed from: l.tme0$b */
    @Metadata(m88120d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m88121d2 = {"l/tme0$b", "Ll/aiv$a$a;", "", "b", "()V", "c", "Lcom/p1/mobile/putong/live/base/data/BLiveGivenGiftBrief;", "brief", "a", "(Lcom/p1/mobile/putong/live/base/data/BLiveGivenGiftBrief;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C20346b implements aiv.C15716a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f174926a;

        public C20346b(String str) {
            this.f174926a = str;
        }

        @Override // p153l.aiv.C15716a.a
        /* JADX INFO: renamed from: a */
        public void mo68349a(BLiveGivenGiftBrief brief) {
            brief.getClass();
            nsh0.m164608j("[live][schema]", "schema: sendGift. SendGiftAction: contentJson is " + this.f174926a + " onSendSuccess()");
        }

        @Override // p153l.aiv.C15716a.a
        /* JADX INFO: renamed from: b */
        public void mo68350b() {
            nsh0.m164608j("[live][schema]", "schema: sendGift. SendGiftAction: contentJson is " + this.f174926a + " onSendCancel()");
        }

        @Override // p153l.aiv.C15716a.a
        /* JADX INFO: renamed from: c */
        public void mo68351c() {
            nsh0.m164608j("[live][schema]", "schema: sendGift. SendGiftAction: contentJson is " + this.f174926a + " onSendFail()");
        }
    }

    @Override // p153l.o2e0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo97254a(@NotNull zit liveRoomScheme, @NotNull gae0 plug, @Nullable bae0.C15954b extraInfo) {
        liveRoomScheme.getClass();
        plug.getClass();
        String strM219937g = liveRoomScheme.m219937g("giftId");
        String strM219937g2 = liveRoomScheme.m219937g("giftCount");
        String strM219937g3 = liveRoomScheme.m219937g("ignoreFirstSendAlert");
        String strM219937g4 = liveRoomScheme.m219937g("sendConfirm");
        String strM219937g5 = liveRoomScheme.m219937g("toUserId");
        String strM219937g6 = liveRoomScheme.m219937g("fromTag");
        String strM219937g7 = liveRoomScheme.m219937g("biz");
        if (TextUtils.isEmpty(strM219937g3)) {
            strM219937g3 = "0";
        }
        BLiveSendActivityGiftTrace bLiveSendActivityGiftTraceNew_ = BLiveSendActivityGiftTrace.new_();
        bLiveSendActivityGiftTraceNew_.giftId = strM219937g;
        bLiveSendActivityGiftTraceNew_.toUserId = strM219937g5;
        strM219937g2.getClass();
        bLiveSendActivityGiftTraceNew_.giftCount = Integer.parseInt(strM219937g2);
        bLiveSendActivityGiftTraceNew_.showSendGiftFirstConfirmDialogFlag = strM219937g3.toString();
        bLiveSendActivityGiftTraceNew_.showSendGiftConfirmDialogFlag = TextUtils.equals("true", strM219937g4);
        bLiveSendActivityGiftTraceNew_.fromTag = strM219937g6;
        bLiveSendActivityGiftTraceNew_.traceModule = strM219937g7;
        String json = bLiveSendActivityGiftTraceNew_.toJson();
        nsh0.m164608j("[live][schema]", "schema: sendGift. SendGiftAction: contentJson is " + json);
        ((hiv) zrv.m221194l(htd0.f111521c)).m135148H("sendGift", json, new C20346b(json));
    }
}
