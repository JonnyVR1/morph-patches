package p006l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.account.p002ui.camera.adapter.AccountMakeupPageAdapter;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.settings.notification.TeamAccountSelectView;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.data.MomentNotifyBlockType;
import com.p1.mobile.putong.data.NotificationSetting;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.notifications.NotificationCheckerCommon;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.j760;
import l.jt40;
import l.s7m;
import l.uq40;
import l.v9j;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.yij0;
import l.zvf0;
import v.VFrame;
import v.VLinear;
import v.VProgressBar;
import v.VScroll;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class it40 implements s7m<wr40> {

    /* JADX INFO: renamed from: A */
    public VText f14745A;

    /* JADX INFO: renamed from: B */
    public VFrame f14746B;

    /* JADX INFO: renamed from: C */
    public VFrame f14747C;

    /* JADX INFO: renamed from: D */
    public VFrame f14748D;

    /* JADX INFO: renamed from: E */
    public VFrame f14749E;

    /* JADX INFO: renamed from: F */
    public VFrame f14750F;

    /* JADX INFO: renamed from: G */
    public wr40 f14751G;

    /* JADX INFO: renamed from: a */
    public VLinear f14752a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f14753b;

    /* JADX INFO: renamed from: c */
    public VProgressBar f14754c;

    /* JADX INFO: renamed from: d */
    public VScroll f14755d;

    /* JADX INFO: renamed from: e */
    public VText f14756e;

    /* JADX INFO: renamed from: f */
    public VFrame f14757f;

    /* JADX INFO: renamed from: g */
    public VText f14758g;

    /* JADX INFO: renamed from: h */
    public VText f14759h;

    /* JADX INFO: renamed from: i */
    public VFrame f14760i;

    /* JADX INFO: renamed from: j */
    public VFrame f14761j;

    /* JADX INFO: renamed from: k */
    public VFrame f14762k;

    /* JADX INFO: renamed from: l */
    public VText f14763l;

    /* JADX INFO: renamed from: m */
    public VFrame f14764m;

    /* JADX INFO: renamed from: n */
    public VFrame f14765n;

    /* JADX INFO: renamed from: o */
    public VFrame f14766o;

    /* JADX INFO: renamed from: p */
    public VFrame f14767p;

    /* JADX INFO: renamed from: q */
    public VText f14768q;

    /* JADX INFO: renamed from: r */
    public VText f14769r;

    /* JADX INFO: renamed from: s */
    public VFrame f14770s;

    /* JADX INFO: renamed from: t */
    public VText f14771t;

    /* JADX INFO: renamed from: u */
    public VFrame f14772u;

    /* JADX INFO: renamed from: v */
    public VText f14773v;

    /* JADX INFO: renamed from: w */
    public VFrame f14774w;

    /* JADX INFO: renamed from: x */
    public VText f14775x;

    /* JADX INFO: renamed from: y */
    public VFrame f14776y;

    /* JADX INFO: renamed from: z */
    public View f14777z;

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m16958F(View view) {
        zvf0.u("e_beep_switch", "p_message_push_settings", new j760[]{vwb.Y("push_switch", "on_off")});
        uq40.A();
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m16960H(View view) {
        zvf0.u("e_push_buzz_swicth", "p_message_push_settings", new j760[]{vwb.Y("push_switch", "on_off")});
        uq40.A();
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m16967O(View view) {
        NotificationCheckerCommon.State stateA = NotificationCheckerCommon.a();
        NotificationCheckerCommon.State state = NotificationCheckerCommon.State.closed;
        zvf0.u("e_receive_push_switch", "p_message_push_settings", new j760[]{vwb.Y("push_status", stateA == state ? "off" : "on")});
        if (NotificationCheckerCommon.a() == state) {
            uq40.A();
        }
    }

    @NonNull
    /* JADX INFO: renamed from: S */
    public static Map<String, v9j<List<MomentNotifyBlockType>>> m16969S() {
        HashMap map = new HashMap();
        map.put("所有人", new rs40());
        map.put("我喜欢的人及配对好友", new v9j() { // from class: l.ss40
            public final Object call() {
                return vwb.f0(new MomentNotifyBlockType[]{MomentNotifyBlockType.get("other")});
            }
        });
        map.put("我喜欢的人", new v9j() { // from class: l.us40
            public final Object call() {
                return vwb.f0(new MomentNotifyBlockType[]{MomentNotifyBlockType.get("match"), MomentNotifyBlockType.get("other")});
            }
        });
        map.put("配对好友", new v9j() { // from class: l.vs40
            public final Object call() {
                return vwb.f0(new MomentNotifyBlockType[]{MomentNotifyBlockType.get("other"), MomentNotifyBlockType.get("like")});
            }
        });
        map.put("陌生人", new v9j() { // from class: l.ws40
            public final Object call() {
                return vwb.f0(new MomentNotifyBlockType[]{MomentNotifyBlockType.get("like"), MomentNotifyBlockType.get("match")});
            }
        });
        map.put("关闭", new v9j() { // from class: l.xs40
            public final Object call() {
                return vwb.f0(new MomentNotifyBlockType[]{MomentNotifyBlockType.get("like"), MomentNotifyBlockType.get("match"), MomentNotifyBlockType.get("other")});
            }
        });
        return map;
    }

    @NonNull
    /* JADX INFO: renamed from: W */
    public static Map<String, v9j<List<MomentNotifyBlockType>>> m16970W() {
        HashMap map = new HashMap();
        map.put("我喜欢的人及配对好友", new rs40());
        map.put("我喜欢的人", new v9j() { // from class: l.ys40
            public final Object call() {
                return vwb.f0(new MomentNotifyBlockType[]{MomentNotifyBlockType.get("match")});
            }
        });
        map.put("配对好友", new v9j() { // from class: l.zs40
            public final Object call() {
                return vwb.f0(new MomentNotifyBlockType[]{MomentNotifyBlockType.get("like")});
            }
        });
        map.put("关闭", new v9j() { // from class: l.at40
            public final Object call() {
                return vwb.f0(new MomentNotifyBlockType[]{MomentNotifyBlockType.get("like"), MomentNotifyBlockType.get("match")});
            }
        });
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m16971X(View view) {
        this.f14751G.f25321a.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m16972Y(View view) {
        boolean zT = yij0.T(this.f14750F);
        if (zT) {
            MessagesAct.s.put(Boolean.TRUE);
        }
        rs4.f20696e.put(Boolean.valueOf(zT));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m16980i0(View view) {
        zvf0.u("e_push_detail_switch", this.f14751G.f25321a.pageId(), new j760[]{vwb.Y("push_switch", yij0.u(this.f14760i) ? "on_off" : "off_on")});
        this.f14751G.m26651m0(yij0.T(this.f14760i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m16982j0(View view) {
        zvf0.u("e_push_new_match_swicth", this.f14751G.f25321a.pageId(), new j760[]{vwb.Y("push_switch", yij0.u(this.f14764m) ? "on_off" : "off_on")});
        this.f14751G.m26647G0(yij0.T(this.f14764m));
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m16996C0() {
        return this.f14751G.f25321a;
    }

    /* JADX INFO: renamed from: Q */
    public View m16997Q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return jt40.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public void m17011i1(wr40 wr40Var) {
        this.f14751G = wr40Var;
    }

    /* JADX INFO: renamed from: T */
    public final String m16999T(List<MomentNotifyBlockType> list) {
        if (vwb.J(list)) {
            return "所有人";
        }
        if (list.size() == 2 && vwb.r(list, new w9j() { // from class: l.ns40
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(MomentNotifyBlockType.get("like"), (MomentNotifyBlockType) obj));
            }
        }) == null) {
            return "我喜欢的人";
        }
        if (list.size() == 2 && vwb.r(list, new w9j() { // from class: l.os40
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(MomentNotifyBlockType.get("match"), (MomentNotifyBlockType) obj));
            }
        }) == null) {
            return "配对好友";
        }
        if (list.size() == 2 && vwb.r(list, new w9j() { // from class: l.ps40
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(MomentNotifyBlockType.get("other"), (MomentNotifyBlockType) obj));
            }
        }) == null) {
            return "陌生人";
        }
        if (list.size() == 1 && TEnum.equals(MomentNotifyBlockType.get("other"), list.get(0))) {
            return "我喜欢的人及配对好友";
        }
        return list.size() == 3 ? "关闭" : "";
    }

    /* JADX INFO: renamed from: U */
    public final String m17000U(List<MomentNotifyBlockType> list) {
        if (vwb.J(list)) {
            return "我喜欢的人及配对好友";
        }
        if (vwb.r(list, new w9j() { // from class: l.js40
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(MomentNotifyBlockType.get("match"), (MomentNotifyBlockType) obj));
            }
        }) == null) {
            return "配对好友";
        }
        return vwb.r(list, new w9j() { // from class: l.ks40
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(MomentNotifyBlockType.get("like"), (MomentNotifyBlockType) obj));
            }
        }) == null ? "我喜欢的人" : "关闭";
    }

    /* JADX INFO: renamed from: V */
    public final String m17001V(List<String> list) {
        if (vwb.J(list)) {
            return "所有账号消息";
        }
        return list.contains("all") ? "关闭" : "部分账号消息";
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m17002Z(NotificationSetting notificationSetting, View view) {
        m17026x0(notificationSetting.teamAccount);
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m17003a0(NotificationSetting notificationSetting, View view) {
        m17025w0(m17000U(notificationSetting.momentUpdate));
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m17004b0(NotificationSetting notificationSetting, View view) {
        m17023u0(m16999T(notificationSetting.momentComment));
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m17005c0(NotificationSetting notificationSetting, View view) {
        m17024v0(m16999T(notificationSetting.momentLike));
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m17006d0(View view) {
        zvf0.u("e_push_like_by_moment", this.f14751G.f25321a.pageId(), new j760[]{vwb.Y("push_switch", yij0.u(this.f14776y) ? "on_off" : "off_on")});
        this.f14751G.m26646F0(yij0.T(this.f14776y));
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m17007e0(View view) {
        zvf0.u("e_push_choose_four", this.f14751G.f25321a.pageId(), new j760[]{vwb.Y("push_switch", yij0.u(this.f14746B) ? "on_off" : "off_on")});
        this.f14751G.m26643C0(yij0.T(this.f14746B));
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m17008f0(View view) {
        zvf0.u("e_push_state", this.f14751G.f25321a.pageId(), new j760[]{vwb.Y("push_switch", yij0.u(this.f14747C) ? "on_off" : "off_on")});
        this.f14751G.m26648H0(yij0.T(this.f14747C));
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m17009g0(View view) {
        zvf0.u("e_push_chatting_partner_signal", this.f14751G.f25321a.pageId(), new j760[]{vwb.Y("push_switch", yij0.u(this.f14748D) ? "on_off" : "off_on")});
        this.f14751G.m26660z0(yij0.T(this.f14748D));
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m17010h0(View view) {
        zvf0.u("e_push_group", this.f14751G.f25321a.pageId(), new j760[]{vwb.Y("push_switch", yij0.u(this.f14749E) ? "on_off" : "off_on")});
        this.f14751G.m26645E0(yij0.T(this.f14749E));
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM16997Q = m16997Q(layoutInflater, viewGroup);
        m17019r();
        return viewM16997Q;
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m17012k0(View view) {
        zvf0.u("e_push_dialog_message_swicth", this.f14751G.f25321a.pageId(), new j760[]{vwb.Y("push_switch", yij0.u(this.f14765n) ? "on_off" : "off_on")});
        this.f14751G.m26642A0(yij0.T(this.f14765n));
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m17013l0(View view) {
        zvf0.u("e_push_greetings_swicth", this.f14751G.f25321a.pageId(), new j760[]{vwb.Y("push_switch", yij0.u(this.f14766o) ? "on_off" : "off_on")});
        this.f14751G.m26644D0(yij0.T(this.f14766o));
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m17014m0(View.OnClickListener onClickListener, View view) {
        if (this.f14751G.m26652n0()) {
            return;
        }
        onClickListener.onClick(view);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m17015n0(Map map, ArrayList arrayList, Dialog dialog, View view, int i, CharSequence charSequence) {
        v9j v9jVar = (v9j) map.get(charSequence);
        zvf0.u("e_push_moment_comment", this.f14751G.f25321a.pageId(), new j760[]{vwb.Y("push_scope_choose", (String) arrayList.get(i))});
        if (v9jVar != null) {
            this.f14751G.m26656t0((List) v9jVar.call());
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m17016o0(ArrayList arrayList, Map map, Dialog dialog, View view, int i, CharSequence charSequence) {
        zvf0.u("e_push_moment_like", this.f14751G.f25321a.pageId(), new j760[]{vwb.Y("push_scope_choose", (String) arrayList.get(i))});
        v9j v9jVar = (v9j) map.get(charSequence);
        if (v9jVar != null) {
            this.f14751G.m26657u0((List) v9jVar.call());
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m17017p0(List list, Map map, Dialog dialog, View view, int i, CharSequence charSequence) {
        zvf0.u("e_push_moment_renew", this.f14751G.f25321a.pageId(), new j760[]{vwb.Y("push_scope_choose", (String) list.get(i))});
        v9j v9jVar = (v9j) map.get(charSequence);
        if (v9jVar != null) {
            this.f14751G.m26658x0((List) v9jVar.call());
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m17018q0(TeamAccountSelectView teamAccountSelectView) {
        List<String> selectBlockingIds = teamAccountSelectView.getSelectBlockingIds();
        String strPageId = this.f14751G.f25321a.pageId();
        String str = "all";
        if (!vwb.J(selectBlockingIds)) {
            str = selectBlockingIds.contains("all") ? AccountMakeupPageAdapter.MakeupItem.NONE : "designated";
        }
        zvf0.u("e_push_official_accounts", strPageId, new j760[]{vwb.Y("push_scope_choose", str)});
        this.f14751G.m26659y0(selectBlockingIds);
    }

    /* JADX INFO: renamed from: r */
    public void m17019r() {
        this.f14753b.setTitle("消息提醒与通知");
        this.f14753b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.xr40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f27685a.m16971X(view);
            }
        });
        this.f14757f.setOnClickListener(new View.OnClickListener() { // from class: l.is40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                it40.m16967O(view);
            }
        });
        this.f14761j.setOnClickListener(new View.OnClickListener() { // from class: l.ts40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                it40.m16958F(view);
            }
        });
        this.f14762k.setOnClickListener(new View.OnClickListener() { // from class: l.bt40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                it40.m16960H(view);
            }
        });
        yij0.t(this.f14750F, ((Boolean) rs4.f20696e.get()).booleanValue());
        this.f14750F.setOnClickListener(new View.OnClickListener() { // from class: l.ct40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9832a.m16972Y(view);
            }
        });
    }

    /* JADX INFO: renamed from: r0 */
    public void m17020r0(@NonNull Settings settings) {
        final NotificationSetting notificationSettingNew_ = settings.getSettingGroup().noPush;
        if (notificationSettingNew_ == null) {
            notificationSettingNew_ = NotificationSetting.new_();
        }
        yij0.t(this.f14760i, settings.previewPushMessage().booleanValue());
        m17022t0(this.f14760i, new View.OnClickListener() { // from class: l.dt40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10558a.m16980i0(view);
            }
        });
        yij0.t(this.f14764m, !notificationSettingNew_.match);
        m17022t0(this.f14764m, new View.OnClickListener() { // from class: l.ht40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14042a.m16982j0(view);
            }
        });
        yij0.t(this.f14765n, !notificationSettingNew_.conversation);
        m17022t0(this.f14765n, new View.OnClickListener() { // from class: l.yr40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f28348a.m17012k0(view);
            }
        });
        yij0.t(this.f14766o, !notificationSettingNew_.greeting);
        m17022t0(this.f14766o, new View.OnClickListener() { // from class: l.zr40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f28916a.m17013l0(view);
            }
        });
        this.f14768q.setText(m17001V(notificationSettingNew_.teamAccount));
        m17022t0(this.f14767p, new View.OnClickListener() { // from class: l.as40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8463a.m17002Z(notificationSettingNew_, view);
            }
        });
        this.f14771t.setText(m17000U(notificationSettingNew_.momentUpdate));
        m17022t0(this.f14770s, new View.OnClickListener() { // from class: l.bs40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9060a.m17003a0(notificationSettingNew_, view);
            }
        });
        this.f14773v.setText(m16999T(notificationSettingNew_.momentComment));
        m17022t0(this.f14772u, new View.OnClickListener() { // from class: l.cs40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9804a.m17004b0(notificationSettingNew_, view);
            }
        });
        this.f14775x.setText(m16999T(notificationSettingNew_.momentLike));
        m17022t0(this.f14774w, new View.OnClickListener() { // from class: l.ds40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10544a.m17005c0(notificationSettingNew_, view);
            }
        });
        yij0.t(this.f14776y, !notificationSettingNew_.momentLiked);
        m17022t0(this.f14776y, new View.OnClickListener() { // from class: l.es40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11417a.m17006d0(view);
            }
        });
        yij0.t(this.f14746B, !notificationSettingNew_.extremePick);
        m17022t0(this.f14746B, new View.OnClickListener() { // from class: l.fs40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12877a.m17007e0(view);
            }
        });
        boolean zIsFemale = CoreModule.f1534c.f3628e0.m21490p9().isFemale();
        VFrame vFrame = this.f14747C;
        if (zIsFemale) {
            xdl0.M(vFrame, false);
        } else {
            yij0.t(vFrame, !notificationSettingNew_.status);
            m17022t0(this.f14747C, new View.OnClickListener() { // from class: l.et40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f11426a.m17008f0(view);
                }
            });
        }
        yij0.t(this.f14748D, !notificationSettingNew_.chatPartners);
        m17022t0(this.f14748D, new View.OnClickListener() { // from class: l.ft40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12890a.m17009g0(view);
            }
        });
        yij0.t(this.f14749E, !notificationSettingNew_.group);
        m17022t0(this.f14749E, new View.OnClickListener() { // from class: l.gt40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13481a.m17010h0(view);
            }
        });
    }

    /* JADX INFO: renamed from: s0 */
    public void m17021s0() {
        NotificationCheckerCommon.State stateA = NotificationCheckerCommon.a();
        NotificationCheckerCommon.State state = NotificationCheckerCommon.State.closed;
        VText vText = this.f14759h;
        if (stateA == state) {
            vText.setText("关闭");
        } else {
            vText.setText("开启");
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final void m17022t0(View view, final View.OnClickListener onClickListener) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.qs40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f20002a.m17014m0(onClickListener, view2);
            }
        });
    }

    /* JADX INFO: renamed from: u0 */
    public final void m17023u0(String str) {
        ArrayList arrayListF0 = vwb.f0(new String[]{"所有人", "我喜欢的人及配对好友", "我喜欢的人", "配对好友", "陌生人", "关闭"});
        final ArrayList arrayListF1 = vwb.f0(new String[]{"all", "like_friends", "like", "friends", "strangers", AccountMakeupPageAdapter.MakeupItem.NONE});
        final Map<String, v9j<List<MomentNotifyBlockType>>> mapM16969S = m16969S();
        act().dialog().G0("评论通知").C0("我将收到这些人评论我动态的通知").e0(arrayListF0).B(false).h0(arrayListF0.indexOf(str), new Dialog.g() { // from class: l.hs40
            /* JADX INFO: renamed from: a */
            public final void m16313a(Dialog dialog, View view, int i, CharSequence charSequence) {
                this.f14029a.m17015n0(mapM16969S, arrayListF1, dialog, view, i, charSequence);
            }
        }).k0(R$string.f2397c).z0();
    }

    /* JADX INFO: renamed from: v0 */
    public final void m17024v0(String str) {
        ArrayList arrayListF0 = vwb.f0(new String[]{"所有人", "我喜欢的人及配对好友", "我喜欢的人", "配对好友", "陌生人", "关闭"});
        final ArrayList arrayListF1 = vwb.f0(new String[]{"all", "like_friends", "like", "friends", "strangers", AccountMakeupPageAdapter.MakeupItem.NONE});
        final Map<String, v9j<List<MomentNotifyBlockType>>> mapM16969S = m16969S();
        act().dialog().G0("点赞通知").C0("我将收到这些人点赞我动态的通知").e0(arrayListF0).B(false).h0(arrayListF0.indexOf(str), new Dialog.g() { // from class: l.ls40
            /* JADX INFO: renamed from: a */
            public final void m19010a(Dialog dialog, View view, int i, CharSequence charSequence) {
                this.f16610a.m17016o0(arrayListF1, mapM16969S, dialog, view, i, charSequence);
            }
        }).k0(R$string.f2397c).z0();
    }

    /* JADX INFO: renamed from: w0 */
    public final void m17025w0(String str) {
        ArrayList arrayListF0 = vwb.f0(new String[]{"我喜欢的人及配对好友", "我喜欢的人", "配对好友", "关闭"});
        final ArrayList arrayListF1 = vwb.f0(new String[]{"all", "like", "friends", AccountMakeupPageAdapter.MakeupItem.NONE});
        final Map<String, v9j<List<MomentNotifyBlockType>>> mapM16970W = m16970W();
        act().dialog().G0("动态更新通知").C0("我将收到这些人的动态更新通知").e0(arrayListF0).B(false).h0(arrayListF0.indexOf(str), new Dialog.g() { // from class: l.ms40
            /* JADX INFO: renamed from: a */
            public final void m19505a(Dialog dialog, View view, int i, CharSequence charSequence) {
                this.f17216a.m17017p0(arrayListF1, mapM16970W, dialog, view, i, charSequence);
            }
        }).k0(R$string.f2397c).z0();
    }

    /* JADX INFO: renamed from: x0 */
    public void m17026x0(List<String> list) {
        final TeamAccountSelectView teamAccountSelectView = (TeamAccountSelectView) act().inflater().inflate(f6c0.f11757Ec, (ViewGroup) null);
        teamAccountSelectView.m9016k(act(), list);
        VScroll vScroll = new VScroll(m16996C0());
        vScroll.addView(teamAccountSelectView);
        act().dialog().G0("官方号通知").C0("我将收到这些官方号的消息通知").P(vScroll, true).B(false).k0(R$string.f2397c).t0(R$string.f2642k, new Runnable() { // from class: l.gs40
            @Override // java.lang.Runnable
            public final void run() {
                this.f13466a.m17018q0(teamAccountSelectView);
            }
        }).z0();
    }

    public void destroy() {
    }
}
