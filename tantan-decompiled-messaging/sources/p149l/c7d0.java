package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p046p1.mobile.longlink.msg.template.Template;
import com.p046p1.mobile.putong.live.base.data.BLiveChatTip;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.livingroom.common.chat.ChatView;
import com.p046p1.mobile.putong.live.livingroom.common.chat.inputEntry.ChatInputEntryView;
import java.util.List;
import p133rx.C22306c;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class c7d0<T extends ho2> extends gz4<T> {

    /* JADX INFO: renamed from: o */
    public BLiveChatTip f79607o;

    /* JADX INFO: renamed from: p */
    public int f79608p;

    /* JADX INFO: renamed from: q */
    public final zpd0 f79609q;

    public c7d0(bsm<T> bsmVar, ChatView chatView, ChatInputEntryView chatInputEntryView) {
        super(bsmVar, chatView, chatInputEntryView);
        this.f79609q = new zpd0("latest_show_send_gift_hint_time", 0L);
        m144512z2(new y6d0(bsmVar, chatView.f48737a));
    }

    /* JADX INFO: renamed from: q4 */
    public static /* synthetic */ void m105554q4(Throwable th) {
    }

    /* JADX INFO: renamed from: t4 */
    private String m105556t4() {
        String str;
        if (w220.m201015b()) {
            BLiveUserMask bLiveUserMask = (BLiveUserMask) m129297F3(new v220(100));
            str = (bLiveUserMask == null || TextUtils.isEmpty(bLiveUserMask.name)) ? "" : bLiveUserMask.name;
        } else {
            str = ypv.f199493a.m199329V().name;
        }
        return str.length() > 6 ? String.format("%s...", str.substring(0, 6)) : str;
    }

    /* JADX INFO: renamed from: w4 */
    private void m105557w4(BLiveChatTip bLiveChatTip) {
        BLiveChatTip bLiveChatTip2 = this.f79607o;
        if (bLiveChatTip2 == null || !bLiveChatTip2.title.equals(bLiveChatTip.title)) {
            this.f79607o = bLiveChatTip;
            if (this.f105079j.m161557p4()) {
                return;
            }
            this.f105079j.m161549F4(bLiveChatTip);
            this.f105078i.m206683e4(bLiveChatTip);
        }
    }

    @Override // p149l.gz4
    /* JADX INFO: renamed from: W3 */
    public AbstractC16991g4.a mo105558W3(String str) {
        return TextUtils.equals(str, "vipServiceBubble") ? this.f105079j.m161556o4(str) : super.mo105558W3(str);
    }

    @Override // p149l.gz4
    /* JADX INFO: renamed from: j4 */
    public void mo105559j4(String str) {
        super.mo105559j4(str);
        m105560s4();
        m206028F2().FollowGuideEvent.onChatSendMessage().m172467p();
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f79607o = null;
        this.f79608p = 0;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r4v1, types: [l.ho2] */
    /* JADX INFO: renamed from: s4 */
    public final void m105560s4() {
        if (mqi0.m155929D(this.f79609q.get().longValue())) {
            return;
        }
        int i = this.f79608p + 1;
        this.f79608p = i;
        if (i < 5 || mqi0.m155929D(((bgv) ypv.m215673l(fld0.f98151f)).m101731k()) || mqi0.m155929D(this.f79609q.get().longValue())) {
            return;
        }
        this.f79609q.put(Long.valueOf(mqi0.m155944o()));
        m206027E2().f108769z.m181792u(LongLinkChatMessage.LiveChatMessage.newBuilder().setUserId("").setRoomId(m206027E2().m149818o()).setTemplate(Template.TemplateData.newBuilder().setId(30).addFields(m105556t4()).build()).build());
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        if (ypv.m215672k().m195905o6()) {
            if (m206027E2().m132168u1()) {
                m206027E2().m132076L1();
            }
            duringCreated((C22306c<T>) m206027E2().m132111Z()).subscribe(ffw.m121194e(new e30() { // from class: l.z6d0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f201907a.m105561u4((List) obj);
                }
            }, new e30() { // from class: l.a7d0
                @Override // p149l.e30
                public final void call(Object obj) {
                    c7d0.m105554q4((Throwable) obj);
                }
            }));
            duringCreated((C22306c<T>) m206027E2().mo149823u()).subscribe(ffw.m121193d(new e30() { // from class: l.b7d0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f73962a.m105562v4((iqv) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m105561u4(List list) {
        BLiveChatTip bLiveChatTip;
        if (vwb.m200296J(list) || (bLiveChatTip = (BLiveChatTip) list.get(0)) == null) {
            return;
        }
        m105557w4(bLiveChatTip);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2] */
    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m105562v4(iqv iqvVar) {
        if (m206027E2().m132168u1()) {
            m206027E2().m132076L1();
        }
    }
}
