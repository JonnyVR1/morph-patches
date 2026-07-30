package com.p046p1.mobile.putong.live.livingroom.common.chat.list;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.live.base.data.BLiveTemplateMenu;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.base.view.LiveFadeRecyclerView;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;
import com.p046p1.mobile.putong.live.livingroom.common.chat.IChatItemLongClickArea;
import com.p046p1.mobile.putong.live.livingroom.common.chat.layout.ChatLayoutManager;
import com.p046p1.mobile.putong.live.livingroom.common.chat.list.ChatListView;
import com.p046p1.mobile.putong.live.livingroom.common.chat.notification.UserNotificationView;
import com.p046p1.mobile.putong.live.livingroom.common.chat.topchat.TopChatView;
import java.util.List;
import java.util.Map;
import p147v.VText;
import p149l.d1q;
import p149l.d30;
import p149l.e30;
import p149l.eet;
import p149l.hs4;
import p149l.iwm0;
import p149l.j25;
import p149l.j760;
import p149l.jp50;
import p149l.mqi0;
import p149l.nol;
import p149l.o7s;
import p149l.o7t;
import p149l.ox4;
import p149l.r9d0;
import p149l.rh2;
import p149l.s7m;
import p149l.uz00;
import p149l.vwb;
import p149l.w9j;
import p149l.wg2;
import p149l.x0n0;
import p149l.x1e0;
import p149l.xdl0;
import p149l.y0n0;
import p149l.ypv;
import p149l.z2s;

/* JADX INFO: loaded from: classes4.dex */
public class ChatListView extends LinearLayout implements s7m<rh2>, nol {

    /* JADX INFO: renamed from: m */
    public static final j760<Integer, Integer> f48907m = new j760<>(0, 0);

    /* JADX INFO: renamed from: a */
    public TopChatView f48908a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f48909b;

    /* JADX INFO: renamed from: c */
    public LiveFadeRecyclerView f48910c;

    /* JADX INFO: renamed from: d */
    public VText f48911d;

    /* JADX INFO: renamed from: e */
    public UserNotificationView f48912e;

    /* JADX INFO: renamed from: f */
    public hs4 f48913f;

    /* JADX INFO: renamed from: g */
    public ChatLayoutManager f48914g;

    /* JADX INFO: renamed from: h */
    public rh2 f48915h;

    /* JADX INFO: renamed from: i */
    public boolean f48916i;

    /* JADX INFO: renamed from: j */
    public boolean f48917j;

    /* JADX INFO: renamed from: k */
    public boolean f48918k;

    /* JADX INFO: renamed from: l */
    public o7s f48919l;

    public ChatListView(Context context) {
        super(context);
        this.f48917j = false;
        this.f48918k = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m72671A(View view) {
        xdl0.m208344M(this.f48911d, false);
        this.f48914g.m72647F();
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ Boolean m72677s(LiveMessage liveMessage, d1q d1qVar) {
        return d1qVar instanceof wg2 ? Boolean.valueOf(TextUtils.equals(((wg2) d1qVar).f186132a.f47751id, liveMessage.f47751id)) : Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m72680z() {
        this.f48915h.mo179302M4();
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m72681B(List list, Dialog dialog, View view, int i, CharSequence charSequence) {
        mo72693a(((BLiveTemplateMenu) list.get(i)).f44459h5);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m72682C(BLiveUserMask bLiveUserMask, d1q d1qVar) {
        if (d1qVar instanceof x0n0) {
            x0n0 x0n0Var = (x0n0) d1qVar;
            if (TextUtils.equals(x0n0Var.f186132a.liveUserInfo.userId, bLiveUserMask.userId)) {
                x0n0Var.f186132a.liveUserInfo.userMask = bLiveUserMask;
                this.f48913f.m67360O(d1qVar);
                return;
            }
        }
        if (d1qVar instanceof y0n0) {
            y0n0 y0n0Var = (y0n0) d1qVar;
            if (TextUtils.equals(y0n0Var.f186132a.liveUserInfo.userId, bLiveUserMask.userId)) {
                y0n0Var.f186132a.liveUserInfo.userMask = bLiveUserMask;
                this.f48913f.m67360O(d1qVar);
            }
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f48915h.act();
    }

    /* JADX INFO: renamed from: E */
    public void m72683E() {
        this.f48913f.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: F */
    public void m72684F(LiveMessage liveMessage) {
        if (liveMessage.spanList.size() == 2) {
            SpannableStringBuilder spannableStringBuilder = liveMessage.spanList.get(1);
            String string = spannableStringBuilder.toString();
            if (string.contains(uz00.f178936c)) {
                int iIndexOf = string.indexOf(uz00.f178936c);
                spannableStringBuilder.delete(iIndexOf, uz00.f178936c.length() + iIndexOf);
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m72685G(boolean z) {
        xdl0.m208344M(this.f48911d, z);
    }

    /* JADX INFO: renamed from: H */
    public void m72686H() {
        this.f48910c.requestLayout();
    }

    /* JADX INFO: renamed from: I */
    public void m72687I() {
        xdl0.m208344M(this.f48911d, false);
    }

    /* JADX INFO: renamed from: J */
    public void m72688J() {
        ChatLayoutManager chatLayoutManager = this.f48914g;
        if (chatLayoutManager != null) {
            chatLayoutManager.m72647F();
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m72689K(List<LiveMessage> list, boolean z) {
        if (list.isEmpty()) {
            return;
        }
        ChatLayoutManager chatLayoutManager = this.f48914g;
        if (z) {
            chatLayoutManager.m72660p(list.size());
        } else if (chatLayoutManager.m72652h() && this.f48914g.m72667w()) {
            m72685G(true);
        }
        this.f48913f.m132770g0(list);
    }

    /* JADX INFO: renamed from: L */
    public void m72690L(boolean z) {
        VText vText = this.f48911d;
        if (vText != null) {
            xdl0.m208344M(vText, z);
        }
    }

    /* JADX INFO: renamed from: M */
    public void m72691M(final LiveMessage liveMessage) {
        d1q<?> d1qVar = (d1q) vwb.m200346r(this.f48913f.m67355J(), new w9j() { // from class: l.kx4
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ChatListView.m72677s(liveMessage, (d1q) obj);
            }
        });
        if (d1qVar != null) {
            this.f48913f.m67360O(d1qVar);
        }
    }

    /* JADX INFO: renamed from: N */
    public void m72692N(final BLiveUserMask bLiveUserMask) {
        vwb.m200354z(this.f48913f.m67355J(), new e30() { // from class: l.nx4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f140996a.m72682C(bLiveUserMask, (d1q) obj);
            }
        });
    }

    @Override // p149l.nol
    /* JADX INFO: renamed from: a */
    public void mo72693a(String str) {
        this.f48915h.m179305P4(jp50.m142568c(100).m142598B(str).m142600q());
    }

    @Override // p149l.nol
    /* JADX INFO: renamed from: b */
    public void mo72694b(IChatItemLongClickArea iChatItemLongClickArea, LiveMessage liveMessage) {
        this.f48915h.mo179298H4(iChatItemLongClickArea, liveMessage);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [l.ho2] */
    @Override // p149l.nol
    /* JADX INFO: renamed from: c */
    public void mo72695c() {
        if (this.f48918k) {
            return;
        }
        this.f48918k = true;
        j25.m139408d(this.f48915h.mo77274R2(), this.f48915h.m206027E2(), "liveMessage_notification");
    }

    @Override // p149l.nol
    /* JADX INFO: renamed from: d */
    public void mo72696d(LiveMessage liveMessage) {
        LiveMessage.ExtInfo extInfo;
        if (liveMessage == null || (extInfo = liveMessage.extInfo) == null) {
            return;
        }
        this.f48915h.m179320r4(extInfo.scheme);
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.nol
    /* JADX INFO: renamed from: e */
    public void mo72697e(LiveUserInfo liveUserInfo, long j) {
        this.f48915h.m179306Q4(liveUserInfo, j, this.f48917j);
    }

    @Override // p149l.nol
    /* JADX INFO: renamed from: f */
    public void mo72698f(final List<BLiveTemplateMenu> list) {
        act().dialog().m20535e0(vwb.m200303Q(list, new w9j() { // from class: l.lx4
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveTemplateMenu) obj).title;
            }
        })).m20543m0(ypv.f199497e.getString(R$string.f47662z)).m20537g0(new Dialog.InterfaceC4311g() { // from class: l.mx4
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
            /* JADX INFO: renamed from: a */
            public final void mo20569a(Dialog dialog, View view, int i, CharSequence charSequence) {
                this.f136126a.m72681B(list, dialog, view, i, charSequence);
            }
        }).m20568z0();
    }

    @Override // p149l.nol
    public hs4 getAdapter() {
        return this.f48913f;
    }

    public j760<Integer, Integer> getChatRecyclerViewVisiblePosition() {
        ChatLayoutManager chatLayoutManager = this.f48914g;
        return chatLayoutManager != null ? chatLayoutManager.m72664t() : f48907m;
    }

    @Override // p149l.nol
    public String getChatScene() {
        return this.f48915h.mo106339p4();
    }

    @Override // p149l.nol
    public o7s getLiveDragonListViewHelper() {
        if (this.f48919l == null) {
            this.f48919l = new o7s(this.f48915h, getAdapter());
        }
        return this.f48919l;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2, l.lh20] */
    @Override // p149l.nol
    public String getLiveMode() {
        return this.f48915h.m206027E2().mo149813j().liveMode;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [l.ho2] */
    @Override // p149l.nol
    /* JADX INFO: renamed from: i */
    public void mo72699i(o7t o7tVar) {
        boolean zEquals = o7tVar.m163055g().equals("follow");
        rh2 rh2Var = this.f48915h;
        if (zEquals) {
            rh2Var.mo179317m4();
        } else {
            j25.m139411g(rh2Var.mo77274R2(), this.f48915h.m206027E2(), o7tVar);
            this.f48915h.m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(100).m206701e(o7tVar.m163052d().getSchema()).m206699c());
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.nol
    /* JADX INFO: renamed from: j */
    public void mo72700j() {
        this.f48915h.m206028F2().VoiceVirtualLiveEvent.showVirtualMaskDialog().mo172463j(Boolean.TRUE);
    }

    @Override // p149l.nol
    /* JADX INFO: renamed from: k */
    public void mo72701k(z2s z2sVar, View view, String str, LiveMessage liveMessage) {
        this.f48915h.mo152703K4(z2sVar, view, str, liveMessage);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72703w(this);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: r */
    public void m72702r() {
        this.f48917j = true;
        this.f48918k = false;
        xdl0.m208344M(this, true);
        this.f48916i = this.f48915h.m206027E2().mo97490p();
        if (this.f48915h.mo179321t4()) {
            this.f48913f = new iwm0(this, this.f48915h);
        } else {
            this.f48913f = new hs4(this, act());
        }
        ChatLayoutManager chatLayoutManager = new ChatLayoutManager(new e30() { // from class: l.hx4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f109827a.m72685G(((Boolean) obj).booleanValue());
            }
        }, this.f48913f);
        this.f48914g = chatLayoutManager;
        this.f48910c.setLayoutManager(chatLayoutManager);
        this.f48910c.setAdapter(this.f48913f);
        this.f48910c.setItemAnimator(null);
        this.f48910c.m68725G();
        this.f48910c.setOverScrollMode(2);
        this.f48910c.setHasFixedSize(true);
        this.f48915h.mo179304O4(this.f48910c);
        this.f48914g.m72642A(new d30() { // from class: l.ix4
            @Override // p149l.d30
            public final void call() {
                this.f115328a.m72680z();
            }
        });
        this.f48911d.setOnClickListener(new View.OnClickListener() { // from class: l.jx4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120190a.m72671A(view);
            }
        });
    }

    public final void setNewData(List<LiveMessage> list) {
        final long jM155944o = mqi0.m155944o() - r9d0.f158355l;
        eet.m116004c(this.f48915h, "audience_message_list_loaded", new e30() { // from class: l.gx4
            @Override // p149l.e30
            public final void call(Object obj) {
                ((Map) obj).put("watch_duration", Long.valueOf(jM155944o));
            }
        });
        m72689K(list, false);
    }

    /* JADX INFO: renamed from: w */
    public final void m72703w(View view) {
        ox4.m166459a(this, view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(rh2 rh2Var) {
        this.f48915h = rh2Var;
    }

    /* JADX INFO: renamed from: y */
    public void m72705y() {
        this.f48917j = false;
        xdl0.m208344M(this, false);
        ChatLayoutManager chatLayoutManager = this.f48914g;
        if (chatLayoutManager != null) {
            chatLayoutManager.m72643B();
        }
        this.f48910c.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f48910c.setAdapter(new hs4(this, this.f48915h.act()));
        m72690L(false);
    }

    public ChatListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48917j = false;
        this.f48918k = false;
    }

    public ChatListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f48917j = false;
        this.f48918k = false;
    }
}
