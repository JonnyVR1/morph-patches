package com.p051p1.mobile.putong.live.livingroom.common.chat.list;

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
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.live.base.data.BLiveTemplateMenu;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.base.view.LiveFadeRecyclerView;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;
import com.p051p1.mobile.putong.live.livingroom.common.chat.IChatItemLongClickArea;
import com.p051p1.mobile.putong.live.livingroom.common.chat.layout.ChatLayoutManager;
import com.p051p1.mobile.putong.live.livingroom.common.chat.list.ChatListView;
import com.p051p1.mobile.putong.live.livingroom.common.chat.notification.UserNotificationView;
import com.p051p1.mobile.putong.live.livingroom.common.chat.topchat.TopChatView;
import java.util.List;
import java.util.Map;
import p151v.VText;
import p153l.a5s;
import p153l.bae0;
import p153l.ban0;
import p153l.bnl0;
import p153l.can0;
import p153l.d3q;
import p153l.dh2;
import p153l.e810;
import p153l.fgt;
import p153l.gt4;
import p153l.i35;
import p153l.iam;
import p153l.jyb;
import p153l.m5n0;
import p153l.ny4;
import p153l.p9s;
import p153l.p9t;
import p153l.pf60;
import p153l.px50;
import p153l.pzi0;
import p153l.qcj;
import p153l.uhd0;
import p153l.x20;
import p153l.y20;
import p153l.yh2;
import p153l.yql;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
public class ChatListView extends LinearLayout implements iam<yh2>, yql {

    /* JADX INFO: renamed from: m */
    public static final pf60<Integer, Integer> f49755m = new pf60<>(0, 0);

    /* JADX INFO: renamed from: a */
    public TopChatView f49756a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f49757b;

    /* JADX INFO: renamed from: c */
    public LiveFadeRecyclerView f49758c;

    /* JADX INFO: renamed from: d */
    public VText f49759d;

    /* JADX INFO: renamed from: e */
    public UserNotificationView f49760e;

    /* JADX INFO: renamed from: f */
    public gt4 f49761f;

    /* JADX INFO: renamed from: g */
    public ChatLayoutManager f49762g;

    /* JADX INFO: renamed from: h */
    public yh2 f49763h;

    /* JADX INFO: renamed from: i */
    public boolean f49764i;

    /* JADX INFO: renamed from: j */
    public boolean f49765j;

    /* JADX INFO: renamed from: k */
    public boolean f49766k;

    /* JADX INFO: renamed from: l */
    public p9s f49767l;

    public ChatListView(Context context) {
        super(context);
        this.f49765j = false;
        this.f49766k = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m73854A(View view) {
        bnl0.m105524M(this.f49759d, false);
        this.f49762g.m73830F();
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ Boolean m73860s(LiveMessage liveMessage, d3q d3qVar) {
        return d3qVar instanceof dh2 ? Boolean.valueOf(TextUtils.equals(((dh2) d3qVar).f88411a.f48599id, liveMessage.f48599id)) : Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m73863z() {
        this.f49763h.mo215914M4();
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m73864B(List list, Dialog dialog, View view, int i, CharSequence charSequence) {
        mo73876a(((BLiveTemplateMenu) list.get(i)).f45307h5);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m73865C(BLiveUserMask bLiveUserMask, d3q d3qVar) {
        if (d3qVar instanceof ban0) {
            ban0 ban0Var = (ban0) d3qVar;
            if (TextUtils.equals(ban0Var.f88411a.liveUserInfo.userId, bLiveUserMask.userId)) {
                ban0Var.f88411a.liveUserInfo.userMask = bLiveUserMask;
                this.f49761f.m68543O(d3qVar);
                return;
            }
        }
        if (d3qVar instanceof can0) {
            can0 can0Var = (can0) d3qVar;
            if (TextUtils.equals(can0Var.f88411a.liveUserInfo.userId, bLiveUserMask.userId)) {
                can0Var.f88411a.liveUserInfo.userMask = bLiveUserMask;
                this.f49761f.m68543O(d3qVar);
            }
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f49763h.act();
    }

    /* JADX INFO: renamed from: E */
    public void m73866E() {
        this.f49761f.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: F */
    public void m73867F(LiveMessage liveMessage) {
        if (liveMessage.spanList.size() == 2) {
            SpannableStringBuilder spannableStringBuilder = liveMessage.spanList.get(1);
            String string = spannableStringBuilder.toString();
            if (string.contains(e810.f92502c)) {
                int iIndexOf = string.indexOf(e810.f92502c);
                spannableStringBuilder.delete(iIndexOf, e810.f92502c.length() + iIndexOf);
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m73868G(boolean z) {
        bnl0.m105524M(this.f49759d, z);
    }

    /* JADX INFO: renamed from: H */
    public void m73869H() {
        this.f49758c.requestLayout();
    }

    /* JADX INFO: renamed from: I */
    public void m73870I() {
        bnl0.m105524M(this.f49759d, false);
    }

    /* JADX INFO: renamed from: J */
    public void m73871J() {
        ChatLayoutManager chatLayoutManager = this.f49762g;
        if (chatLayoutManager != null) {
            chatLayoutManager.m73830F();
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m73872K(List<LiveMessage> list, boolean z) {
        if (list.isEmpty()) {
            return;
        }
        ChatLayoutManager chatLayoutManager = this.f49762g;
        if (z) {
            chatLayoutManager.m73843p(list.size());
        } else if (chatLayoutManager.m73835h() && this.f49762g.m73850w()) {
            m73868G(true);
        }
        this.f49761f.m132199g0(list);
    }

    /* JADX INFO: renamed from: L */
    public void m73873L(boolean z) {
        VText vText = this.f49759d;
        if (vText != null) {
            bnl0.m105524M(vText, z);
        }
    }

    /* JADX INFO: renamed from: M */
    public void m73874M(final LiveMessage liveMessage) {
        d3q<?> d3qVar = (d3q) jyb.m147529r(this.f49761f.m68538J(), new qcj() { // from class: l.jy4
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ChatListView.m73860s(liveMessage, (d3q) obj);
            }
        });
        if (d3qVar != null) {
            this.f49761f.m68543O(d3qVar);
        }
    }

    /* JADX INFO: renamed from: N */
    public void m73875N(final BLiveUserMask bLiveUserMask) {
        jyb.m147537z(this.f49761f.m68538J(), new y20() { // from class: l.my4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f139314a.m73865C(bLiveUserMask, (d3q) obj);
            }
        });
    }

    @Override // p153l.yql
    /* JADX INFO: renamed from: a */
    public void mo73876a(String str) {
        this.f49763h.m215916P4(px50.m174112c(100).m174141B(str).m174143q());
    }

    @Override // p153l.yql
    /* JADX INFO: renamed from: b */
    public void mo73877b(IChatItemLongClickArea iChatItemLongClickArea, LiveMessage liveMessage) {
        this.f49763h.mo112199H4(iChatItemLongClickArea, liveMessage);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [l.oo2] */
    @Override // p153l.yql
    /* JADX INFO: renamed from: c */
    public void mo73878c() {
        if (this.f49766k) {
            return;
        }
        this.f49766k = true;
        i35.m138268d(this.f49763h.mo78457R2(), this.f49763h.m213810E2(), "liveMessage_notification");
    }

    @Override // p153l.yql
    /* JADX INFO: renamed from: d */
    public void mo73879d(LiveMessage liveMessage) {
        LiveMessage.ExtInfo extInfo;
        if (liveMessage == null || (extInfo = liveMessage.extInfo) == null) {
            return;
        }
        this.f49763h.m215929r4(extInfo.scheme);
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.yql
    /* JADX INFO: renamed from: e */
    public void mo73880e(LiveUserInfo liveUserInfo, long j) {
        this.f49763h.m215917Q4(liveUserInfo, j, this.f49765j);
    }

    @Override // p153l.yql
    /* JADX INFO: renamed from: f */
    public void mo73881f(final List<BLiveTemplateMenu> list) {
        act().dialog().m21534e0(jyb.m147486Q(list, new qcj() { // from class: l.ky4
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveTemplateMenu) obj).title;
            }
        })).m21542m0(zrv.f205803e.getString(R$string.f48510z)).m21536g0(new Dialog.InterfaceC4462g() { // from class: l.ly4
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
            /* JADX INFO: renamed from: a */
            public final void mo21568a(Dialog dialog, View view, int i, CharSequence charSequence) {
                this.f134029a.m73864B(list, dialog, view, i, charSequence);
            }
        }).m21567z0();
    }

    @Override // p153l.yql
    public gt4 getAdapter() {
        return this.f49761f;
    }

    public pf60<Integer, Integer> getChatRecyclerViewVisiblePosition() {
        ChatLayoutManager chatLayoutManager = this.f49762g;
        return chatLayoutManager != null ? chatLayoutManager.m73847t() : f49755m;
    }

    @Override // p153l.yql
    public String getChatScene() {
        return this.f49763h.mo130933p4();
    }

    @Override // p153l.yql
    public p9s getLiveDragonListViewHelper() {
        if (this.f49767l == null) {
            this.f49767l = new p9s(this.f49763h, getAdapter());
        }
        return this.f49767l;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.oo2, l.vp20] */
    @Override // p153l.yql
    public String getLiveMode() {
        return this.f49763h.m213810E2().mo183435j().liveMode;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [l.oo2] */
    @Override // p153l.yql
    /* JADX INFO: renamed from: i */
    public void mo73882i(p9t p9tVar) {
        boolean zEquals = p9tVar.m171384g().equals("follow");
        yh2 yh2Var = this.f49763h;
        if (zEquals) {
            yh2Var.mo103885m4();
        } else {
            i35.m138271g(yh2Var.mo78457R2(), this.f49763h.m213810E2(), p9tVar);
            this.f49763h.m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(100).m103154e(p9tVar.m171381d().getSchema()).m103152c());
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.yql
    /* JADX INFO: renamed from: j */
    public void mo73883j() {
        this.f49763h.m213811F2().VoiceVirtualLiveEvent.showVirtualMaskDialog().mo199273j(Boolean.TRUE);
    }

    @Override // p153l.yql
    /* JADX INFO: renamed from: k */
    public void mo73884k(a5s a5sVar, View view, String str, LiveMessage liveMessage) {
        this.f49763h.mo103883K4(a5sVar, view, str, liveMessage);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73886w(this);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: r */
    public void m73885r() {
        this.f49765j = true;
        this.f49766k = false;
        bnl0.m105524M(this, true);
        this.f49764i = this.f49763h.m213810E2().mo118373p();
        if (this.f49763h.mo112221t4()) {
            this.f49761f = new m5n0(this, this.f49763h);
        } else {
            this.f49761f = new gt4(this, act());
        }
        ChatLayoutManager chatLayoutManager = new ChatLayoutManager(new y20() { // from class: l.gy4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107028a.m73868G(((Boolean) obj).booleanValue());
            }
        }, this.f49761f);
        this.f49762g = chatLayoutManager;
        this.f49758c.setLayoutManager(chatLayoutManager);
        this.f49758c.setAdapter(this.f49761f);
        this.f49758c.setItemAnimator(null);
        this.f49758c.m69908G();
        this.f49758c.setOverScrollMode(2);
        this.f49758c.setHasFixedSize(true);
        this.f49763h.mo103884O4(this.f49758c);
        this.f49762g.m73825A(new x20() { // from class: l.hy4
            @Override // p153l.x20
            public final void call() {
                this.f112097a.m73863z();
            }
        });
        this.f49759d.setOnClickListener(new View.OnClickListener() { // from class: l.iy4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f117511a.m73854A(view);
            }
        });
    }

    public final void setNewData(List<LiveMessage> list) {
        final long jM174454o = pzi0.m174454o() - uhd0.f179016l;
        fgt.m125531c(this.f49763h, "audience_message_list_loaded", new y20() { // from class: l.fy4
            @Override // p153l.y20
            public final void call(Object obj) {
                ((Map) obj).put("watch_duration", Long.valueOf(jM174454o));
            }
        });
        m73872K(list, false);
    }

    /* JADX INFO: renamed from: w */
    public final void m73886w(View view) {
        ny4.m165309a(this, view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(yh2 yh2Var) {
        this.f49763h = yh2Var;
    }

    /* JADX INFO: renamed from: y */
    public void m73888y() {
        this.f49765j = false;
        bnl0.m105524M(this, false);
        ChatLayoutManager chatLayoutManager = this.f49762g;
        if (chatLayoutManager != null) {
            chatLayoutManager.m73826B();
        }
        this.f49758c.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f49758c.setAdapter(new gt4(this, this.f49763h.act()));
        m73873L(false);
    }

    public ChatListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49765j = false;
        this.f49766k = false;
    }

    public ChatListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49765j = false;
        this.f49766k = false;
    }
}
