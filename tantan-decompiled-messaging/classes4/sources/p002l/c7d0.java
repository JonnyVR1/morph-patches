package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.common.chat.ChatView;
import com.p000p1.mobile.putong.live.livingroom.common.chat.inputEntry.ChatInputEntryView;
import com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p1.mobile.longlink.msg.template.Template;
import com.p1.mobile.putong.live.base.data.BLiveChatTip;
import com.p1.mobile.putong.live.base.data.BLiveUserMask;
import java.util.List;
import l.bgv;
import l.e30;
import l.ffw;
import l.fld0;
import l.mqi0;
import l.vwb;
import l.ypv;
import l.zpd0;
import p002l.ho2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class c7d0<T extends ho2> extends gz4<T> {

    /* JADX INFO: renamed from: o */
    public BLiveChatTip f8520o;

    /* JADX INFO: renamed from: p */
    public int f8521p;

    /* JADX INFO: renamed from: q */
    public final zpd0 f8522q;

    public c7d0(bsm<T> bsmVar, ChatView chatView, ChatInputEntryView chatInputEntryView) {
        super(bsmVar, chatView, chatInputEntryView);
        this.f8522q = new zpd0("latest_show_send_gift_hint_time", 0L);
        z2(new y6d0(bsmVar, chatView.f4779a));
    }

    /* JADX INFO: renamed from: q4 */
    public static /* synthetic */ void m10771q4(Throwable th) {
    }

    /* JADX INFO: renamed from: t4 */
    private String m10773t4() {
        String str;
        if (w220.m24291b()) {
            BLiveUserMask bLiveUserMaskM14184F3 = m14184F3(new v220(100));
            str = (bLiveUserMaskM14184F3 == null || TextUtils.isEmpty(bLiveUserMaskM14184F3.name)) ? "" : bLiveUserMaskM14184F3.name;
        } else {
            str = ypv.a.V().name;
        }
        return str.length() > 6 ? String.format("%s...", str.substring(0, 6)) : str;
    }

    /* JADX INFO: renamed from: w4 */
    private void m10774w4(BLiveChatTip bLiveChatTip) {
        BLiveChatTip bLiveChatTip2 = this.f8520o;
        if (bLiveChatTip2 == null || !bLiveChatTip2.title.equals(bLiveChatTip.title)) {
            this.f8520o = bLiveChatTip;
            if (this.f11698j.m19045p4()) {
                return;
            }
            this.f11698j.m19036F4(bLiveChatTip);
            this.f11697i.m25601e4(bLiveChatTip);
        }
    }

    @Override // p002l.gz4
    /* JADX INFO: renamed from: W3 */
    public AbstractC0583g4.a mo10775W3(String str) {
        return TextUtils.equals(str, "vipServiceBubble") ? this.f11698j.m19044o4(str) : super.mo10775W3(str);
    }

    @Override // p002l.gz4
    /* JADX INFO: renamed from: j4 */
    public void mo10776j4(String str) {
        super.mo10776j4(str);
        m10777s4();
        m25548F2().FollowGuideEvent.onChatSendMessage().p();
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        this.f8520o = null;
        this.f8521p = 0;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r4v1, types: [l.ho2] */
    /* JADX INFO: renamed from: s4 */
    public final void m10777s4() {
        if (mqi0.D(((Long) this.f8522q.get()).longValue())) {
            return;
        }
        int i = this.f8521p + 1;
        this.f8521p = i;
        if (i < 5 || mqi0.D(((bgv) ypv.l(fld0.f)).k()) || mqi0.D(((Long) this.f8522q.get()).longValue())) {
            return;
        }
        this.f8522q.put(Long.valueOf(mqi0.o()));
        m25547E2().f12169z.m22175u((LongLinkChatMessage.LiveChatMessage) LongLinkChatMessage.LiveChatMessage.newBuilder().setUserId("").setRoomId(m25547E2().m17239o()).setTemplate(Template.TemplateData.newBuilder().setId(30).addFields(m10773t4()).build()).build());
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v7, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: t */
    public void m10778t() {
        super.t();
        if (ypv.k().o6()) {
            if (m25547E2().m14604u1()) {
                m25547E2().m14512L1();
            }
            duringCreated(m25547E2().m14547Z()).subscribe(ffw.e(new e30() { // from class: l.z6d0
                public final void call(Object obj) {
                    this.f23279a.m10779u4((List) obj);
                }
            }, new e30() { // from class: l.a7d0
                public final void call(Object obj) {
                    c7d0.m10771q4((Throwable) obj);
                }
            }));
            duringCreated(m25547E2().m17244u()).subscribe(ffw.d(new e30() { // from class: l.b7d0
                public final void call(Object obj) {
                    this.f8016a.m10780v4((iqv) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m10779u4(List list) {
        BLiveChatTip bLiveChatTip;
        if (vwb.J(list) || (bLiveChatTip = (BLiveChatTip) list.get(0)) == null) {
            return;
        }
        m10774w4(bLiveChatTip);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2] */
    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m10780v4(iqv iqvVar) {
        if (m25547E2().m14604u1()) {
            m25547E2().m14512L1();
        }
    }
}
