package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.settings.notification.TeamAccountSelectView;
import com.p051p1.mobile.putong.data.MomentNotifyBlockType;
import com.p051p1.mobile.putong.data.NotificationSetting;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.notifications.NotificationCheckerCommon;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VProgressBar;
import p151v.VScroll;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class x150 implements iam<l050> {

    /* JADX INFO: renamed from: A */
    public VText f191984A;

    /* JADX INFO: renamed from: B */
    public VFrame f191985B;

    /* JADX INFO: renamed from: C */
    public VFrame f191986C;

    /* JADX INFO: renamed from: D */
    public VFrame f191987D;

    /* JADX INFO: renamed from: E */
    public VFrame f191988E;

    /* JADX INFO: renamed from: F */
    public VFrame f191989F;

    /* JADX INFO: renamed from: G */
    public l050 f191990G;

    /* JADX INFO: renamed from: a */
    public VLinear f191991a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f191992b;

    /* JADX INFO: renamed from: c */
    public VProgressBar f191993c;

    /* JADX INFO: renamed from: d */
    public VScroll f191994d;

    /* JADX INFO: renamed from: e */
    public VText f191995e;

    /* JADX INFO: renamed from: f */
    public VFrame f191996f;

    /* JADX INFO: renamed from: g */
    public VText f191997g;

    /* JADX INFO: renamed from: h */
    public VText f191998h;

    /* JADX INFO: renamed from: i */
    public VFrame f191999i;

    /* JADX INFO: renamed from: j */
    public VFrame f192000j;

    /* JADX INFO: renamed from: k */
    public VFrame f192001k;

    /* JADX INFO: renamed from: l */
    public VText f192002l;

    /* JADX INFO: renamed from: m */
    public VFrame f192003m;

    /* JADX INFO: renamed from: n */
    public VFrame f192004n;

    /* JADX INFO: renamed from: o */
    public VFrame f192005o;

    /* JADX INFO: renamed from: p */
    public VFrame f192006p;

    /* JADX INFO: renamed from: q */
    public VText f192007q;

    /* JADX INFO: renamed from: r */
    public VText f192008r;

    /* JADX INFO: renamed from: s */
    public VFrame f192009s;

    /* JADX INFO: renamed from: t */
    public VText f192010t;

    /* JADX INFO: renamed from: u */
    public VFrame f192011u;

    /* JADX INFO: renamed from: v */
    public VText f192012v;

    /* JADX INFO: renamed from: w */
    public VFrame f192013w;

    /* JADX INFO: renamed from: x */
    public VText f192014x;

    /* JADX INFO: renamed from: y */
    public VFrame f192015y;

    /* JADX INFO: renamed from: z */
    public View f192016z;

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m208909F(View view) {
        i4g0.m138523u("e_beep_switch", "p_message_push_settings", jyb.m147494Y("push_switch", "on_off"));
        iz40.m142756A();
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m208911H(View view) {
        i4g0.m138523u("e_push_buzz_swicth", "p_message_push_settings", jyb.m147494Y("push_switch", "on_off"));
        iz40.m142756A();
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m208918O(View view) {
        NotificationCheckerCommon.State stateM80403a = NotificationCheckerCommon.m80403a();
        NotificationCheckerCommon.State state = NotificationCheckerCommon.State.closed;
        i4g0.m138523u("e_receive_push_switch", "p_message_push_settings", jyb.m147494Y("push_status", stateM80403a == state ? BLiveOperationTitleShowType.off : "on"));
        if (NotificationCheckerCommon.m80403a() == state) {
            iz40.m142756A();
        }
    }

    @NonNull
    /* JADX INFO: renamed from: S */
    public static Map<String, pcj<List<MomentNotifyBlockType>>> m208920S() {
        HashMap map = new HashMap();
        map.put("所有人", new g150());
        map.put("我喜欢的人及配对好友", new pcj() { // from class: l.h150
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return jyb.m147507f0(MomentNotifyBlockType.get("other"));
            }
        });
        map.put("我喜欢的人", new pcj() { // from class: l.j150
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return jyb.m147507f0(MomentNotifyBlockType.get("match"), MomentNotifyBlockType.get("other"));
            }
        });
        map.put("配对好友", new pcj() { // from class: l.k150
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return jyb.m147507f0(MomentNotifyBlockType.get("other"), MomentNotifyBlockType.get("like"));
            }
        });
        map.put("陌生人", new pcj() { // from class: l.l150
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return jyb.m147507f0(MomentNotifyBlockType.get("like"), MomentNotifyBlockType.get("match"));
            }
        });
        map.put("关闭", new pcj() { // from class: l.m150
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return jyb.m147507f0(MomentNotifyBlockType.get("like"), MomentNotifyBlockType.get("match"), MomentNotifyBlockType.get("other"));
            }
        });
        return map;
    }

    @NonNull
    /* JADX INFO: renamed from: W */
    public static Map<String, pcj<List<MomentNotifyBlockType>>> m208921W() {
        HashMap map = new HashMap();
        map.put("我喜欢的人及配对好友", new g150());
        map.put("我喜欢的人", new pcj() { // from class: l.n150
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return jyb.m147507f0(MomentNotifyBlockType.get("match"));
            }
        });
        map.put("配对好友", new pcj() { // from class: l.o150
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return jyb.m147507f0(MomentNotifyBlockType.get("like"));
            }
        });
        map.put("关闭", new pcj() { // from class: l.p150
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return jyb.m147507f0(MomentNotifyBlockType.get("like"), MomentNotifyBlockType.get("match"));
            }
        });
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m208922X(View view) {
        this.f191990G.f129519a.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m208923Y(View view) {
        boolean zM106262T = bsj0.m106262T(this.f191989F);
        if (zM106262T) {
            MessagesAct.f32484s.put(Boolean.TRUE);
        }
        qt4.f159383e.put(Boolean.valueOf(zM106262T));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m208931i0(View view) {
        i4g0.m138523u("e_push_detail_switch", this.f191990G.f129519a.pageId(), jyb.m147494Y("push_switch", bsj0.m106285u(this.f191999i) ? "on_off" : "off_on"));
        this.f191990G.m152297m0(bsj0.m106262T(this.f191999i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m208933j0(View view) {
        i4g0.m138523u("e_push_new_match_swicth", this.f191990G.f129519a.pageId(), jyb.m147494Y("push_switch", bsj0.m106285u(this.f192003m) ? "on_off" : "off_on"));
        this.f191990G.m152295G0(bsj0.m106262T(this.f192003m));
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f191990G.f129519a;
    }

    /* JADX INFO: renamed from: Q */
    public View m208947Q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return y150.m213931b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(l050 l050Var) {
        this.f191990G = l050Var;
    }

    /* JADX INFO: renamed from: T */
    public final String m208949T(List<MomentNotifyBlockType> list) {
        if (jyb.m147479J(list)) {
            return "所有人";
        }
        if (list.size() == 2 && jyb.m147529r(list, new qcj() { // from class: l.c150
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(MomentNotifyBlockType.get("like"), (MomentNotifyBlockType) obj));
            }
        }) == null) {
            return "我喜欢的人";
        }
        if (list.size() == 2 && jyb.m147529r(list, new qcj() { // from class: l.d150
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(MomentNotifyBlockType.get("match"), (MomentNotifyBlockType) obj));
            }
        }) == null) {
            return "配对好友";
        }
        if (list.size() == 2 && jyb.m147529r(list, new qcj() { // from class: l.e150
            @Override // p153l.qcj
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
    public final String m208950U(List<MomentNotifyBlockType> list) {
        if (jyb.m147479J(list)) {
            return "我喜欢的人及配对好友";
        }
        if (jyb.m147529r(list, new qcj() { // from class: l.y050
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(MomentNotifyBlockType.get("match"), (MomentNotifyBlockType) obj));
            }
        }) == null) {
            return "配对好友";
        }
        return jyb.m147529r(list, new qcj() { // from class: l.z050
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(MomentNotifyBlockType.get("like"), (MomentNotifyBlockType) obj));
            }
        }) == null ? "我喜欢的人" : "关闭";
    }

    /* JADX INFO: renamed from: V */
    public final String m208951V(List<String> list) {
        if (jyb.m147479J(list)) {
            return "所有账号消息";
        }
        return list.contains("all") ? "关闭" : "部分账号消息";
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m208952Z(NotificationSetting notificationSetting, View view) {
        m208975x0(notificationSetting.teamAccount);
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m208953a0(NotificationSetting notificationSetting, View view) {
        m208974w0(m208950U(notificationSetting.momentUpdate));
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m208954b0(NotificationSetting notificationSetting, View view) {
        m208972u0(m208949T(notificationSetting.momentComment));
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m208955c0(NotificationSetting notificationSetting, View view) {
        m208973v0(m208949T(notificationSetting.momentLike));
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m208956d0(View view) {
        i4g0.m138523u("e_push_like_by_moment", this.f191990G.f129519a.pageId(), jyb.m147494Y("push_switch", bsj0.m106285u(this.f192015y) ? "on_off" : "off_on"));
        this.f191990G.m152294F0(bsj0.m106262T(this.f192015y));
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m208957e0(View view) {
        i4g0.m138523u("e_push_choose_four", this.f191990G.f129519a.pageId(), jyb.m147494Y("push_switch", bsj0.m106285u(this.f191985B) ? "on_off" : "off_on"));
        this.f191990G.m152291C0(bsj0.m106262T(this.f191985B));
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m208958f0(View view) {
        i4g0.m138523u("e_push_state", this.f191990G.f129519a.pageId(), jyb.m147494Y("push_switch", bsj0.m106285u(this.f191986C) ? "on_off" : "off_on"));
        this.f191990G.m152296H0(bsj0.m106262T(this.f191986C));
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m208959g0(View view) {
        i4g0.m138523u("e_push_chatting_partner_signal", this.f191990G.f129519a.pageId(), jyb.m147494Y("push_switch", bsj0.m106285u(this.f191987D) ? "on_off" : "off_on"));
        this.f191990G.m152306z0(bsj0.m106262T(this.f191987D));
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m208960h0(View view) {
        i4g0.m138523u("e_push_group", this.f191990G.f129519a.pageId(), jyb.m147494Y("push_switch", bsj0.m106285u(this.f191988E) ? "on_off" : "off_on"));
        this.f191990G.m152293E0(bsj0.m106262T(this.f191988E));
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM208947Q = m208947Q(layoutInflater, viewGroup);
        m208968r();
        return viewM208947Q;
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m208961k0(View view) {
        i4g0.m138523u("e_push_dialog_message_swicth", this.f191990G.f129519a.pageId(), jyb.m147494Y("push_switch", bsj0.m106285u(this.f192004n) ? "on_off" : "off_on"));
        this.f191990G.m152290A0(bsj0.m106262T(this.f192004n));
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m208962l0(View view) {
        i4g0.m138523u("e_push_greetings_swicth", this.f191990G.f129519a.pageId(), jyb.m147494Y("push_switch", bsj0.m106285u(this.f192005o) ? "on_off" : "off_on"));
        this.f191990G.m152292D0(bsj0.m106262T(this.f192005o));
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m208963m0(View.OnClickListener onClickListener, View view) {
        if (this.f191990G.m152298n0()) {
            return;
        }
        onClickListener.onClick(view);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m208964n0(Map map, ArrayList arrayList, Dialog dialog, View view, int i, CharSequence charSequence) {
        pcj pcjVar = (pcj) map.get(charSequence);
        i4g0.m138523u("e_push_moment_comment", this.f191990G.f129519a.pageId(), jyb.m147494Y("push_scope_choose", (String) arrayList.get(i)));
        if (pcjVar != null) {
            this.f191990G.m152302t0((List) pcjVar.call());
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m208965o0(ArrayList arrayList, Map map, Dialog dialog, View view, int i, CharSequence charSequence) {
        i4g0.m138523u("e_push_moment_like", this.f191990G.f129519a.pageId(), jyb.m147494Y("push_scope_choose", (String) arrayList.get(i)));
        pcj pcjVar = (pcj) map.get(charSequence);
        if (pcjVar != null) {
            this.f191990G.m152303u0((List) pcjVar.call());
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m208966p0(List list, Map map, Dialog dialog, View view, int i, CharSequence charSequence) {
        i4g0.m138523u("e_push_moment_renew", this.f191990G.f129519a.pageId(), jyb.m147494Y("push_scope_choose", (String) list.get(i)));
        pcj pcjVar = (pcj) map.get(charSequence);
        if (pcjVar != null) {
            this.f191990G.m152304x0((List) pcjVar.call());
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m208967q0(TeamAccountSelectView teamAccountSelectView) {
        List<String> selectBlockingIds = teamAccountSelectView.getSelectBlockingIds();
        String strPageId = this.f191990G.f129519a.pageId();
        String str = "all";
        if (!jyb.m147479J(selectBlockingIds)) {
            str = selectBlockingIds.contains("all") ? "none" : "designated";
        }
        i4g0.m138523u("e_push_official_accounts", strPageId, jyb.m147494Y("push_scope_choose", str));
        this.f191990G.m152305y0(selectBlockingIds);
    }

    /* JADX INFO: renamed from: r */
    public void m208968r() {
        this.f191992b.setTitle("消息提醒与通知");
        this.f191992b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.m050
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f134294a.m208922X(view);
            }
        });
        this.f191996f.setOnClickListener(new View.OnClickListener() { // from class: l.x050
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x150.m208918O(view);
            }
        });
        this.f192000j.setOnClickListener(new View.OnClickListener() { // from class: l.i150
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x150.m208909F(view);
            }
        });
        this.f192001k.setOnClickListener(new View.OnClickListener() { // from class: l.q150
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x150.m208911H(view);
            }
        });
        bsj0.m106284t(this.f191989F, qt4.f159383e.get().booleanValue());
        this.f191989F.setOnClickListener(new View.OnClickListener() { // from class: l.r150
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f160777a.m208923Y(view);
            }
        });
    }

    /* JADX INFO: renamed from: r0 */
    public void m208969r0(@NonNull Settings settings) {
        final NotificationSetting notificationSettingNew_ = settings.getSettingGroup().noPush;
        if (notificationSettingNew_ == null) {
            notificationSettingNew_ = NotificationSetting.new_();
        }
        bsj0.m106284t(this.f191999i, settings.previewPushMessage().booleanValue());
        m208971t0(this.f191999i, new View.OnClickListener() { // from class: l.s150
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f165759a.m208931i0(view);
            }
        });
        bsj0.m106284t(this.f192003m, !notificationSettingNew_.match);
        m208971t0(this.f192003m, new View.OnClickListener() { // from class: l.w150
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186766a.m208933j0(view);
            }
        });
        bsj0.m106284t(this.f192004n, !notificationSettingNew_.conversation);
        m208971t0(this.f192004n, new View.OnClickListener() { // from class: l.n050
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f139589a.m208961k0(view);
            }
        });
        bsj0.m106284t(this.f192005o, !notificationSettingNew_.greeting);
        m208971t0(this.f192005o, new View.OnClickListener() { // from class: l.o050
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f144498a.m208962l0(view);
            }
        });
        this.f192007q.setText(m208951V(notificationSettingNew_.teamAccount));
        m208971t0(this.f192006p, new View.OnClickListener() { // from class: l.p050
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f150008a.m208952Z(notificationSettingNew_, view);
            }
        });
        this.f192010t.setText(m208950U(notificationSettingNew_.momentUpdate));
        m208971t0(this.f192009s, new View.OnClickListener() { // from class: l.q050
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f155026a.m208953a0(notificationSettingNew_, view);
            }
        });
        this.f192012v.setText(m208949T(notificationSettingNew_.momentComment));
        m208971t0(this.f192011u, new View.OnClickListener() { // from class: l.r050
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f160584a.m208954b0(notificationSettingNew_, view);
            }
        });
        this.f192014x.setText(m208949T(notificationSettingNew_.momentLike));
        m208971t0(this.f192013w, new View.OnClickListener() { // from class: l.s050
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f165660a.m208955c0(notificationSettingNew_, view);
            }
        });
        bsj0.m106284t(this.f192015y, !notificationSettingNew_.momentLiked);
        m208971t0(this.f192015y, new View.OnClickListener() { // from class: l.t050
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f171467a.m208956d0(view);
            }
        });
        bsj0.m106284t(this.f191985B, !notificationSettingNew_.extremePick);
        m208971t0(this.f191985B, new View.OnClickListener() { // from class: l.u050
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f176848a.m208957e0(view);
            }
        });
        boolean zIsFemale = CoreModule.f18264c.f20381e0.m116600p9().isFemale();
        VFrame vFrame = this.f191986C;
        if (zIsFemale) {
            bnl0.m105524M(vFrame, false);
        } else {
            bsj0.m106284t(vFrame, !notificationSettingNew_.status);
            m208971t0(this.f191986C, new View.OnClickListener() { // from class: l.t150
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f171599a.m208958f0(view);
                }
            });
        }
        bsj0.m106284t(this.f191987D, !notificationSettingNew_.chatPartners);
        m208971t0(this.f191987D, new View.OnClickListener() { // from class: l.u150
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f176969a.m208959g0(view);
            }
        });
        bsj0.m106284t(this.f191988E, !notificationSettingNew_.group);
        m208971t0(this.f191988E, new View.OnClickListener() { // from class: l.v150
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f181926a.m208960h0(view);
            }
        });
    }

    /* JADX INFO: renamed from: s0 */
    public void m208970s0() {
        NotificationCheckerCommon.State stateM80403a = NotificationCheckerCommon.m80403a();
        NotificationCheckerCommon.State state = NotificationCheckerCommon.State.closed;
        VText vText = this.f191998h;
        if (stateM80403a == state) {
            vText.setText("关闭");
        } else {
            vText.setText("开启");
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final void m208971t0(View view, final View.OnClickListener onClickListener) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.f150
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f96768a.m208963m0(onClickListener, view2);
            }
        });
    }

    /* JADX INFO: renamed from: u0 */
    public final void m208972u0(String str) {
        ArrayList arrayListM147507f0 = jyb.m147507f0("所有人", "我喜欢的人及配对好友", "我喜欢的人", "配对好友", "陌生人", "关闭");
        final ArrayList arrayListM147507f1 = jyb.m147507f0("all", "like_friends", "like", "friends", "strangers", "none");
        final Map<String, pcj<List<MomentNotifyBlockType>>> mapM208920S = m208920S();
        getAct().dialog().m21506G0("评论通知").m21498C0("我将收到这些人评论我动态的通知").m21534e0(arrayListM147507f0).m21495B(false).m21537h0(arrayListM147507f0.indexOf(str), new Dialog.InterfaceC4462g() { // from class: l.w050
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
            /* JADX INFO: renamed from: a */
            public final void mo21568a(Dialog dialog, View view, int i, CharSequence charSequence) {
                this.f186540a.m208964n0(mapM208920S, arrayListM147507f1, dialog, view, i, charSequence);
            }
        }).m21540k0(R$string.f19138c).m21567z0();
    }

    /* JADX INFO: renamed from: v0 */
    public final void m208973v0(String str) {
        ArrayList arrayListM147507f0 = jyb.m147507f0("所有人", "我喜欢的人及配对好友", "我喜欢的人", "配对好友", "陌生人", "关闭");
        final ArrayList arrayListM147507f1 = jyb.m147507f0("all", "like_friends", "like", "friends", "strangers", "none");
        final Map<String, pcj<List<MomentNotifyBlockType>>> mapM208920S = m208920S();
        getAct().dialog().m21506G0("点赞通知").m21498C0("我将收到这些人点赞我动态的通知").m21534e0(arrayListM147507f0).m21495B(false).m21537h0(arrayListM147507f0.indexOf(str), new Dialog.InterfaceC4462g() { // from class: l.a150
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
            /* JADX INFO: renamed from: a */
            public final void mo21568a(Dialog dialog, View view, int i, CharSequence charSequence) {
                this.f67782a.m208965o0(arrayListM147507f1, mapM208920S, dialog, view, i, charSequence);
            }
        }).m21540k0(R$string.f19138c).m21567z0();
    }

    /* JADX INFO: renamed from: w0 */
    public final void m208974w0(String str) {
        ArrayList arrayListM147507f0 = jyb.m147507f0("我喜欢的人及配对好友", "我喜欢的人", "配对好友", "关闭");
        final ArrayList arrayListM147507f1 = jyb.m147507f0("all", "like", "friends", "none");
        final Map<String, pcj<List<MomentNotifyBlockType>>> mapM208921W = m208921W();
        getAct().dialog().m21506G0("动态更新通知").m21498C0("我将收到这些人的动态更新通知").m21534e0(arrayListM147507f0).m21495B(false).m21537h0(arrayListM147507f0.indexOf(str), new Dialog.InterfaceC4462g() { // from class: l.b150
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
            /* JADX INFO: renamed from: a */
            public final void mo21568a(Dialog dialog, View view, int i, CharSequence charSequence) {
                this.f74321a.m208966p0(arrayListM147507f1, mapM208921W, dialog, view, i, charSequence);
            }
        }).m21540k0(R$string.f19138c).m21567z0();
    }

    /* JADX INFO: renamed from: x0 */
    public void m208975x0(List<String> list) {
        final TeamAccountSelectView teamAccountSelectView = (TeamAccountSelectView) getAct().inflater().inflate(kec0.f125509Lc, (ViewGroup) null);
        teamAccountSelectView.m56804k(getAct(), list);
        VScroll vScroll = new VScroll(getContext());
        vScroll.addView(teamAccountSelectView);
        getAct().dialog().m21506G0("官方号通知").m21498C0("我将收到这些官方号的消息通知").m21519P(vScroll, true).m21495B(false).m21540k0(R$string.f19138c).m21555t0(R$string.f19383k, new Runnable() { // from class: l.v050
            @Override // java.lang.Runnable
            public final void run() {
                this.f181835a.m208967q0(teamAccountSelectView);
            }
        }).m21567z0();
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
