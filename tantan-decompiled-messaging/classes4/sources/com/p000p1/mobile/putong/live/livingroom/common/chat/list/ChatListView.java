package com.p000p1.mobile.putong.live.livingroom.common.chat.list;

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
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;
import com.p000p1.mobile.putong.live.livingroom.common.chat.IChatItemLongClickArea;
import com.p000p1.mobile.putong.live.livingroom.common.chat.layout.ChatLayoutManager;
import com.p000p1.mobile.putong.live.livingroom.common.chat.list.ChatListView;
import com.p000p1.mobile.putong.live.livingroom.common.chat.notification.UserNotificationView;
import com.p000p1.mobile.putong.live.livingroom.common.chat.topchat.TopChatView;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.live.base.data.BLiveTemplateMenu;
import com.p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p1.mobile.putong.live.base.view.LiveFadeRecyclerView;
import java.util.List;
import java.util.Map;
import l.d1q;
import l.d30;
import l.e30;
import l.j760;
import l.mqi0;
import l.s7m;
import l.vwb;
import l.w9j;
import l.x0n0;
import l.xdl0;
import l.y0n0;
import l.ypv;
import p002l.eet;
import p002l.hs4;
import p002l.iwm0;
import p002l.j25;
import p002l.jp50;
import p002l.nol;
import p002l.o7s;
import p002l.o7t;
import p002l.ox4;
import p002l.r9d0;
import p002l.rh2;
import p002l.uz00;
import p002l.wg2;
import p002l.x1e0;
import p002l.z2s;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ChatListView extends LinearLayout implements s7m<rh2>, nol {

    /* JADX INFO: renamed from: m */
    public static final j760<Integer, Integer> f4949m = new j760<>(0, 0);

    /* JADX INFO: renamed from: a */
    public TopChatView f4950a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f4951b;

    /* JADX INFO: renamed from: c */
    public LiveFadeRecyclerView f4952c;

    /* JADX INFO: renamed from: d */
    public VText f4953d;

    /* JADX INFO: renamed from: e */
    public UserNotificationView f4954e;

    /* JADX INFO: renamed from: f */
    public hs4 f4955f;

    /* JADX INFO: renamed from: g */
    public ChatLayoutManager f4956g;

    /* JADX INFO: renamed from: h */
    public rh2 f4957h;

    /* JADX INFO: renamed from: i */
    public boolean f4958i;

    /* JADX INFO: renamed from: j */
    public boolean f4959j;

    /* JADX INFO: renamed from: k */
    public boolean f4960k;

    /* JADX INFO: renamed from: l */
    public o7s f4961l;

    public ChatListView(Context context) {
        super(context);
        this.f4959j = false;
        this.f4960k = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m6173A(View view) {
        xdl0.M(this.f4953d, false);
        this.f4956g.m6149F();
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ Boolean m6179s(LiveMessage liveMessage, d1q d1qVar) {
        return d1qVar instanceof wg2 ? Boolean.valueOf(TextUtils.equals(((wg2) d1qVar).f21724a.f3793id, liveMessage.f3793id)) : Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m6182z() {
        this.f4957h.m21967M4();
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m6183B(List list, Dialog dialog, View view, int i, CharSequence charSequence) {
        mo6196a(((BLiveTemplateMenu) list.get(i)).h5);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m6184C(BLiveUserMask bLiveUserMask, d1q d1qVar) {
        if (d1qVar instanceof x0n0) {
            x0n0 x0n0Var = (x0n0) d1qVar;
            if (TextUtils.equals(x0n0Var.f21724a.liveUserInfo.userId, bLiveUserMask.userId)) {
                x0n0Var.f21724a.liveUserInfo.userMask = bLiveUserMask;
                this.f4955f.O(d1qVar);
                return;
            }
        }
        if (d1qVar instanceof y0n0) {
            y0n0 y0n0Var = (y0n0) d1qVar;
            if (TextUtils.equals(y0n0Var.f21724a.liveUserInfo.userId, bLiveUserMask.userId)) {
                y0n0Var.f21724a.liveUserInfo.userMask = bLiveUserMask;
                this.f4955f.O(d1qVar);
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m6185C0() {
        return this.f4957h.act();
    }

    /* JADX INFO: renamed from: E */
    public void m6186E() {
        this.f4955f.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: F */
    public void m6187F(LiveMessage liveMessage) {
        if (liveMessage.spanList.size() == 2) {
            SpannableStringBuilder spannableStringBuilder = liveMessage.spanList.get(1);
            String string = spannableStringBuilder.toString();
            if (string.contains(uz00.f20888c)) {
                int iIndexOf = string.indexOf(uz00.f20888c);
                spannableStringBuilder.delete(iIndexOf, uz00.f20888c.length() + iIndexOf);
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m6188G(boolean z) {
        xdl0.M(this.f4953d, z);
    }

    /* JADX INFO: renamed from: H */
    public void m6189H() {
        this.f4952c.requestLayout();
    }

    /* JADX INFO: renamed from: I */
    public void m6190I() {
        xdl0.M(this.f4953d, false);
    }

    /* JADX INFO: renamed from: J */
    public void m6191J() {
        ChatLayoutManager chatLayoutManager = this.f4956g;
        if (chatLayoutManager != null) {
            chatLayoutManager.m6149F();
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m6192K(List<LiveMessage> list, boolean z) {
        if (list.isEmpty()) {
            return;
        }
        ChatLayoutManager chatLayoutManager = this.f4956g;
        if (z) {
            chatLayoutManager.m6162p(list.size());
        } else if (chatLayoutManager.m6154h() && this.f4956g.m6169w()) {
            m6188G(true);
        }
        this.f4955f.m14805g0(list);
    }

    /* JADX INFO: renamed from: L */
    public void m6193L(boolean z) {
        VText vText = this.f4953d;
        if (vText != null) {
            xdl0.M(vText, z);
        }
    }

    /* JADX INFO: renamed from: M */
    public void m6194M(final LiveMessage liveMessage) {
        d1q d1qVar = (d1q) vwb.r(this.f4955f.J(), new w9j() { // from class: l.kx4
            public final Object call(Object obj) {
                return ChatListView.m6179s(liveMessage, (d1q) obj);
            }
        });
        if (d1qVar != null) {
            this.f4955f.O(d1qVar);
        }
    }

    /* JADX INFO: renamed from: N */
    public void m6195N(final BLiveUserMask bLiveUserMask) {
        vwb.z(this.f4955f.J(), new e30() { // from class: l.nx4
            public final void call(Object obj) {
                this.f16287a.m6184C(bLiveUserMask, (d1q) obj);
            }
        });
    }

    @Override // p002l.nol
    /* JADX INFO: renamed from: a */
    public void mo6196a(String str) {
        this.f4957h.m21970P4(jp50.m16064c(100).m16094B(str).m16096q());
    }

    @Override // p002l.nol
    /* JADX INFO: renamed from: b */
    public void mo6197b(IChatItemLongClickArea iChatItemLongClickArea, LiveMessage liveMessage) {
        this.f4957h.mo21963H4(iChatItemLongClickArea, liveMessage);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [l.ho2] */
    @Override // p002l.nol
    /* JADX INFO: renamed from: c */
    public void mo6198c() {
        if (this.f4960k) {
            return;
        }
        this.f4960k = true;
        j25.m15559d(this.f4957h.mo21430R2(), this.f4957h.m25547E2(), "liveMessage_notification");
    }

    @Override // p002l.nol
    /* JADX INFO: renamed from: d */
    public void mo6199d(LiveMessage liveMessage) {
        LiveMessage.ExtInfo extInfo;
        if (liveMessage == null || (extInfo = liveMessage.extInfo) == null) {
            return;
        }
        this.f4957h.m21985r4(extInfo.scheme);
    }

    public void destroy() {
    }

    @Override // p002l.nol
    /* JADX INFO: renamed from: e */
    public void mo6200e(LiveUserInfo liveUserInfo, long j) {
        this.f4957h.m21971Q4(liveUserInfo, j, this.f4959j);
    }

    @Override // p002l.nol
    /* JADX INFO: renamed from: f */
    public void mo6201f(final List<BLiveTemplateMenu> list) {
        act().dialog().e0(vwb.Q(list, new w9j() { // from class: l.lx4
            public final Object call(Object obj) {
                return ((BLiveTemplateMenu) obj).title;
            }
        })).m0(ypv.e.getString(R$string.f3704z)).g0(new Dialog.g() { // from class: l.mx4
            /* JADX INFO: renamed from: a */
            public final void m18306a(Dialog dialog, View view, int i, CharSequence charSequence) {
                this.f15731a.m6183B(list, dialog, view, i, charSequence);
            }
        }).z0();
    }

    @Override // p002l.nol
    public hs4 getAdapter() {
        return this.f4955f;
    }

    public j760<Integer, Integer> getChatRecyclerViewVisiblePosition() {
        ChatLayoutManager chatLayoutManager = this.f4956g;
        return chatLayoutManager != null ? chatLayoutManager.m6166t() : f4949m;
    }

    @Override // p002l.nol
    public String getChatScene() {
        return this.f4957h.mo10952p4();
    }

    @Override // p002l.nol
    public o7s getLiveDragonListViewHelper() {
        if (this.f4961l == null) {
            this.f4961l = new o7s(this.f4957h, getAdapter());
        }
        return this.f4961l;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2, l.lh20] */
    @Override // p002l.nol
    public String getLiveMode() {
        return this.f4957h.m25547E2().m17234j().liveMode;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [l.ho2] */
    @Override // p002l.nol
    /* JADX INFO: renamed from: i */
    public void mo6202i(o7t o7tVar) {
        boolean zEquals = o7tVar.m19283g().equals("follow");
        rh2 rh2Var = this.f4957h;
        if (zEquals) {
            rh2Var.mo21982m4();
        } else {
            j25.m15562g(rh2Var.mo21430R2(), this.f4957h.m25547E2(), o7tVar);
            this.f4957h.m25548F2().SchemeHandleEvent.handleScheme().j(new x1e0.C0891a(100).m25610e(o7tVar.m19280d().getSchema()).m25608c());
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p002l.nol
    /* JADX INFO: renamed from: j */
    public void mo6204j() {
        this.f4957h.m25548F2().VoiceVirtualLiveEvent.showVirtualMaskDialog().j(Boolean.TRUE);
    }

    @Override // p002l.nol
    /* JADX INFO: renamed from: k */
    public void mo6205k(z2s z2sVar, View view, String str, LiveMessage liveMessage) {
        this.f4957h.mo17682K4(z2sVar, view, str, liveMessage);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6207w(this);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: r */
    public void m6206r() {
        this.f4959j = true;
        this.f4960k = false;
        xdl0.M(this, true);
        this.f4958i = this.f4957h.m25547E2().mo9893p();
        if (this.f4957h.mo21986t4()) {
            this.f4955f = new iwm0(this, this.f4957h);
        } else {
            this.f4955f = new hs4(this, act());
        }
        ChatLayoutManager chatLayoutManager = new ChatLayoutManager(new e30() { // from class: l.hx4
            public final void call(Object obj) {
                this.f12333a.m6188G(((Boolean) obj).booleanValue());
            }
        }, this.f4955f);
        this.f4956g = chatLayoutManager;
        this.f4952c.setLayoutManager(chatLayoutManager);
        this.f4952c.setAdapter(this.f4955f);
        this.f4952c.setItemAnimator((RecyclerView.l) null);
        this.f4952c.G();
        this.f4952c.setOverScrollMode(2);
        this.f4952c.setHasFixedSize(true);
        this.f4957h.mo21969O4(this.f4952c);
        this.f4956g.m6144A(new d30() { // from class: l.ix4
            public final void call() {
                this.f13462a.m6182z();
            }
        });
        this.f4953d.setOnClickListener(new View.OnClickListener() { // from class: l.jx4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14118a.m6173A(view);
            }
        });
    }

    public final void setNewData(List<LiveMessage> list) {
        final long jO = mqi0.o() - r9d0.f18419l;
        eet.m12449c(this.f4957h, "audience_message_list_loaded", new e30() { // from class: l.gx4
            public final void call(Object obj) {
                ((Map) obj).put("watch_duration", Long.valueOf(jO));
            }
        });
        m6192K(list, false);
    }

    /* JADX INFO: renamed from: w */
    public final void m6207w(View view) {
        ox4.m19801a(this, view);
    }

    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void m6203i1(rh2 rh2Var) {
        this.f4957h = rh2Var;
    }

    /* JADX INFO: renamed from: y */
    public void m6209y() {
        this.f4959j = false;
        xdl0.M(this, false);
        ChatLayoutManager chatLayoutManager = this.f4956g;
        if (chatLayoutManager != null) {
            chatLayoutManager.m6145B();
        }
        this.f4952c.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f4952c.setAdapter(new hs4(this, this.f4957h.act()));
        m6193L(false);
    }

    public ChatListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4959j = false;
        this.f4960k = false;
    }

    public ChatListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4959j = false;
        this.f4960k = false;
    }
}
