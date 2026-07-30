package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p051p1.mobile.longlink.msg.template.Template;
import com.p051p1.mobile.putong.live.base.data.BLiveChatTip;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.livingroom.common.chat.ChatView;
import com.p051p1.mobile.putong.live.livingroom.common.chat.inputEntry.ChatInputEntryView;
import java.util.List;
import p137rx.C22421c;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class ffd0<T extends oo2> extends f05<T> {

    /* JADX INFO: renamed from: o */
    public BLiveChatTip f98759o;

    /* JADX INFO: renamed from: p */
    public int f98760p;

    /* JADX INFO: renamed from: q */
    public final byd0 f98761q;

    public ffd0(dum<T> dumVar, ChatView chatView, ChatInputEntryView chatInputEntryView) {
        super(dumVar, chatView, chatInputEntryView);
        this.f98761q = new byd0("latest_show_send_gift_hint_time", 0L);
        m153103z2(new bfd0(dumVar, chatView.f49585a));
    }

    /* JADX INFO: renamed from: q4 */
    public static /* synthetic */ void m125363q4(Throwable th) {
    }

    /* JADX INFO: renamed from: t4 */
    private String m125365t4() {
        String str;
        if (eb20.m120149b()) {
            BLiveUserMask bLiveUserMask = (BLiveUserMask) m138856F3(new db20(100));
            str = (bLiveUserMask == null || TextUtils.isEmpty(bLiveUserMask.name)) ? "" : bLiveUserMask.name;
        } else {
            str = zrv.f205799a.m207651V().name;
        }
        return str.length() > 6 ? String.format("%s...", str.substring(0, 6)) : str;
    }

    /* JADX INFO: renamed from: w4 */
    private void m125366w4(BLiveChatTip bLiveChatTip) {
        BLiveChatTip bLiveChatTip2 = this.f98759o;
        if (bLiveChatTip2 == null || !bLiveChatTip2.title.equals(bLiveChatTip.title)) {
            this.f98759o = bLiveChatTip;
            if (this.f96655j.m160443p4()) {
                return;
            }
            this.f96655j.m160435F4(bLiveChatTip);
            this.f96654i.m204528e4(bLiveChatTip);
        }
    }

    @Override // p153l.f05
    /* JADX INFO: renamed from: W3 */
    public AbstractC17128g4.a mo123458W3(String str) {
        return TextUtils.equals(str, "vipServiceBubble") ? this.f96655j.m160442o4(str) : super.mo123458W3(str);
    }

    @Override // p153l.f05
    /* JADX INFO: renamed from: j4 */
    public void mo123470j4(String str) {
        super.mo123470j4(str);
        m125367s4();
        m213811F2().FollowGuideEvent.onChatSendMessage().m199277p();
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f98759o = null;
        this.f98760p = 0;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r4v1, types: [l.oo2] */
    /* JADX INFO: renamed from: s4 */
    public final void m125367s4() {
        if (pzi0.m174439D(this.f98761q.get().longValue())) {
            return;
        }
        int i = this.f98760p + 1;
        this.f98760p = i;
        if (i < 5 || pzi0.m174439D(((civ) zrv.m221194l(htd0.f111524f)).m109967k()) || pzi0.m174439D(this.f98761q.get().longValue())) {
            return;
        }
        this.f98761q.put(Long.valueOf(pzi0.m174454o()));
        m213810E2().f148282z.m170287u(LongLinkChatMessage.LiveChatMessage.newBuilder().setUserId("").setRoomId(m213810E2().m202194o()).setTemplate(Template.TemplateData.newBuilder().setId(30).addFields(m125365t4()).build()).build());
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        if (zrv.m221193k().m203692o6()) {
            if (m213810E2().m168552u1()) {
                m213810E2().m168464L1();
            }
            duringCreated((C22421c<T>) m213810E2().m168497Z()).subscribe(dhw.m115826e(new y20() { // from class: l.cfd0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f81506a.m125368u4((List) obj);
                }
            }, new y20() { // from class: l.dfd0
                @Override // p153l.y20
                public final void call(Object obj) {
                    ffd0.m125363q4((Throwable) obj);
                }
            }));
            duringCreated((C22421c<T>) m213810E2().mo183449u()).subscribe(dhw.m115825d(new y20() { // from class: l.efd0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f93768a.m125369v4((jsv) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m125368u4(List list) {
        BLiveChatTip bLiveChatTip;
        if (jyb.m147479J(list) || (bLiveChatTip = (BLiveChatTip) list.get(0)) == null) {
            return;
        }
        m125366w4(bLiveChatTip);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.oo2] */
    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m125369v4(jsv jsvVar) {
        if (m213810E2().m168552u1()) {
            m213810E2().m168464L1();
        }
    }
}
