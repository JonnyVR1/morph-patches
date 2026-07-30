package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.settings.notification.TeamAccountSelectView;
import com.p046p1.mobile.putong.data.MomentNotifyBlockType;
import com.p046p1.mobile.putong.data.NotificationSetting;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.notifications.NotificationCheckerCommon;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VProgressBar;
import p147v.VScroll;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class it40 implements s7m<wr40> {

    /* JADX INFO: renamed from: A */
    public VText f114820A;

    /* JADX INFO: renamed from: B */
    public VFrame f114821B;

    /* JADX INFO: renamed from: C */
    public VFrame f114822C;

    /* JADX INFO: renamed from: D */
    public VFrame f114823D;

    /* JADX INFO: renamed from: E */
    public VFrame f114824E;

    /* JADX INFO: renamed from: F */
    public VFrame f114825F;

    /* JADX INFO: renamed from: G */
    public wr40 f114826G;

    /* JADX INFO: renamed from: a */
    public VLinear f114827a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f114828b;

    /* JADX INFO: renamed from: c */
    public VProgressBar f114829c;

    /* JADX INFO: renamed from: d */
    public VScroll f114830d;

    /* JADX INFO: renamed from: e */
    public VText f114831e;

    /* JADX INFO: renamed from: f */
    public VFrame f114832f;

    /* JADX INFO: renamed from: g */
    public VText f114833g;

    /* JADX INFO: renamed from: h */
    public VText f114834h;

    /* JADX INFO: renamed from: i */
    public VFrame f114835i;

    /* JADX INFO: renamed from: j */
    public VFrame f114836j;

    /* JADX INFO: renamed from: k */
    public VFrame f114837k;

    /* JADX INFO: renamed from: l */
    public VText f114838l;

    /* JADX INFO: renamed from: m */
    public VFrame f114839m;

    /* JADX INFO: renamed from: n */
    public VFrame f114840n;

    /* JADX INFO: renamed from: o */
    public VFrame f114841o;

    /* JADX INFO: renamed from: p */
    public VFrame f114842p;

    /* JADX INFO: renamed from: q */
    public VText f114843q;

    /* JADX INFO: renamed from: r */
    public VText f114844r;

    /* JADX INFO: renamed from: s */
    public VFrame f114845s;

    /* JADX INFO: renamed from: t */
    public VText f114846t;

    /* JADX INFO: renamed from: u */
    public VFrame f114847u;

    /* JADX INFO: renamed from: v */
    public VText f114848v;

    /* JADX INFO: renamed from: w */
    public VFrame f114849w;

    /* JADX INFO: renamed from: x */
    public VText f114850x;

    /* JADX INFO: renamed from: y */
    public VFrame f114851y;

    /* JADX INFO: renamed from: z */
    public View f114852z;

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m138104F(View view) {
        zvf0.m220399u("e_beep_switch", "p_message_push_settings", vwb.m200311Y("push_switch", "on_off"));
        uq40.m194951A();
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m138106H(View view) {
        zvf0.m220399u("e_push_buzz_swicth", "p_message_push_settings", vwb.m200311Y("push_switch", "on_off"));
        uq40.m194951A();
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m138113O(View view) {
        NotificationCheckerCommon.State stateM79220a = NotificationCheckerCommon.m79220a();
        NotificationCheckerCommon.State state = NotificationCheckerCommon.State.closed;
        zvf0.m220399u("e_receive_push_switch", "p_message_push_settings", vwb.m200311Y("push_status", stateM79220a == state ? BLiveOperationTitleShowType.off : "on"));
        if (NotificationCheckerCommon.m79220a() == state) {
            uq40.m194951A();
        }
    }

    @NonNull
    /* JADX INFO: renamed from: S */
    public static Map<String, v9j<List<MomentNotifyBlockType>>> m138115S() {
        HashMap map = new HashMap();
        map.put("所有人", new rs40());
        map.put("我喜欢的人及配对好友", new v9j() { // from class: l.ss40
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return vwb.m200324f0(MomentNotifyBlockType.get("other"));
            }
        });
        map.put("我喜欢的人", new v9j() { // from class: l.us40
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return vwb.m200324f0(MomentNotifyBlockType.get("match"), MomentNotifyBlockType.get("other"));
            }
        });
        map.put("配对好友", new v9j() { // from class: l.vs40
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return vwb.m200324f0(MomentNotifyBlockType.get("other"), MomentNotifyBlockType.get("like"));
            }
        });
        map.put("陌生人", new v9j() { // from class: l.ws40
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return vwb.m200324f0(MomentNotifyBlockType.get("like"), MomentNotifyBlockType.get("match"));
            }
        });
        map.put("关闭", new v9j() { // from class: l.xs40
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return vwb.m200324f0(MomentNotifyBlockType.get("like"), MomentNotifyBlockType.get("match"), MomentNotifyBlockType.get("other"));
            }
        });
        return map;
    }

    @NonNull
    /* JADX INFO: renamed from: W */
    public static Map<String, v9j<List<MomentNotifyBlockType>>> m138116W() {
        HashMap map = new HashMap();
        map.put("我喜欢的人及配对好友", new rs40());
        map.put("我喜欢的人", new v9j() { // from class: l.ys40
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return vwb.m200324f0(MomentNotifyBlockType.get("match"));
            }
        });
        map.put("配对好友", new v9j() { // from class: l.zs40
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return vwb.m200324f0(MomentNotifyBlockType.get("like"));
            }
        });
        map.put("关闭", new v9j() { // from class: l.at40
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return vwb.m200324f0(MomentNotifyBlockType.get("like"), MomentNotifyBlockType.get("match"));
            }
        });
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m138117X(View view) {
        this.f114826G.f187761a.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m138118Y(View view) {
        boolean zM214942T = yij0.m214942T(this.f114825F);
        if (zM214942T) {
            MessagesAct.f31636s.put(Boolean.TRUE);
        }
        rs4.f160804e.put(Boolean.valueOf(zM214942T));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m138126i0(View view) {
        zvf0.m220399u("e_push_detail_switch", this.f114826G.f187761a.pageId(), vwb.m200311Y("push_switch", yij0.m214965u(this.f114835i) ? "on_off" : "off_on"));
        this.f114826G.m205109m0(yij0.m214942T(this.f114835i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m138128j0(View view) {
        zvf0.m220399u("e_push_new_match_swicth", this.f114826G.f187761a.pageId(), vwb.m200311Y("push_switch", yij0.m214965u(this.f114839m) ? "on_off" : "off_on"));
        this.f114826G.m205107G0(yij0.m214942T(this.f114839m));
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f114826G.f187761a;
    }

    /* JADX INFO: renamed from: Q */
    public View m138142Q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return jt40.m143080b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(wr40 wr40Var) {
        this.f114826G = wr40Var;
    }

    /* JADX INFO: renamed from: T */
    public final String m138144T(List<MomentNotifyBlockType> list) {
        if (vwb.m200296J(list)) {
            return "所有人";
        }
        if (list.size() == 2 && vwb.m200346r(list, new w9j() { // from class: l.ns40
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(MomentNotifyBlockType.get("like"), (MomentNotifyBlockType) obj));
            }
        }) == null) {
            return "我喜欢的人";
        }
        if (list.size() == 2 && vwb.m200346r(list, new w9j() { // from class: l.os40
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(MomentNotifyBlockType.get("match"), (MomentNotifyBlockType) obj));
            }
        }) == null) {
            return "配对好友";
        }
        if (list.size() == 2 && vwb.m200346r(list, new w9j() { // from class: l.ps40
            @Override // p149l.w9j
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
    public final String m138145U(List<MomentNotifyBlockType> list) {
        if (vwb.m200296J(list)) {
            return "我喜欢的人及配对好友";
        }
        if (vwb.m200346r(list, new w9j() { // from class: l.js40
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(MomentNotifyBlockType.get("match"), (MomentNotifyBlockType) obj));
            }
        }) == null) {
            return "配对好友";
        }
        return vwb.m200346r(list, new w9j() { // from class: l.ks40
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals(MomentNotifyBlockType.get("like"), (MomentNotifyBlockType) obj));
            }
        }) == null ? "我喜欢的人" : "关闭";
    }

    /* JADX INFO: renamed from: V */
    public final String m138146V(List<String> list) {
        if (vwb.m200296J(list)) {
            return "所有账号消息";
        }
        return list.contains("all") ? "关闭" : "部分账号消息";
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m138147Z(NotificationSetting notificationSetting, View view) {
        m138170x0(notificationSetting.teamAccount);
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m138148a0(NotificationSetting notificationSetting, View view) {
        m138169w0(m138145U(notificationSetting.momentUpdate));
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m138149b0(NotificationSetting notificationSetting, View view) {
        m138167u0(m138144T(notificationSetting.momentComment));
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m138150c0(NotificationSetting notificationSetting, View view) {
        m138168v0(m138144T(notificationSetting.momentLike));
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m138151d0(View view) {
        zvf0.m220399u("e_push_like_by_moment", this.f114826G.f187761a.pageId(), vwb.m200311Y("push_switch", yij0.m214965u(this.f114851y) ? "on_off" : "off_on"));
        this.f114826G.m205106F0(yij0.m214942T(this.f114851y));
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m138152e0(View view) {
        zvf0.m220399u("e_push_choose_four", this.f114826G.f187761a.pageId(), vwb.m200311Y("push_switch", yij0.m214965u(this.f114821B) ? "on_off" : "off_on"));
        this.f114826G.m205103C0(yij0.m214942T(this.f114821B));
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m138153f0(View view) {
        zvf0.m220399u("e_push_state", this.f114826G.f187761a.pageId(), vwb.m200311Y("push_switch", yij0.m214965u(this.f114822C) ? "on_off" : "off_on"));
        this.f114826G.m205108H0(yij0.m214942T(this.f114822C));
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m138154g0(View view) {
        zvf0.m220399u("e_push_chatting_partner_signal", this.f114826G.f187761a.pageId(), vwb.m200311Y("push_switch", yij0.m214965u(this.f114823D) ? "on_off" : "off_on"));
        this.f114826G.m205118z0(yij0.m214942T(this.f114823D));
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m138155h0(View view) {
        zvf0.m220399u("e_push_group", this.f114826G.f187761a.pageId(), vwb.m200311Y("push_switch", yij0.m214965u(this.f114824E) ? "on_off" : "off_on"));
        this.f114826G.m205105E0(yij0.m214942T(this.f114824E));
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM138142Q = m138142Q(layoutInflater, viewGroup);
        m138163r();
        return viewM138142Q;
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m138156k0(View view) {
        zvf0.m220399u("e_push_dialog_message_swicth", this.f114826G.f187761a.pageId(), vwb.m200311Y("push_switch", yij0.m214965u(this.f114840n) ? "on_off" : "off_on"));
        this.f114826G.m205102A0(yij0.m214942T(this.f114840n));
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m138157l0(View view) {
        zvf0.m220399u("e_push_greetings_swicth", this.f114826G.f187761a.pageId(), vwb.m200311Y("push_switch", yij0.m214965u(this.f114841o) ? "on_off" : "off_on"));
        this.f114826G.m205104D0(yij0.m214942T(this.f114841o));
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m138158m0(View.OnClickListener onClickListener, View view) {
        if (this.f114826G.m205110n0()) {
            return;
        }
        onClickListener.onClick(view);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m138159n0(Map map, ArrayList arrayList, Dialog dialog, View view, int i, CharSequence charSequence) {
        v9j v9jVar = (v9j) map.get(charSequence);
        zvf0.m220399u("e_push_moment_comment", this.f114826G.f187761a.pageId(), vwb.m200311Y("push_scope_choose", (String) arrayList.get(i)));
        if (v9jVar != null) {
            this.f114826G.m205114t0((List) v9jVar.call());
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m138160o0(ArrayList arrayList, Map map, Dialog dialog, View view, int i, CharSequence charSequence) {
        zvf0.m220399u("e_push_moment_like", this.f114826G.f187761a.pageId(), vwb.m200311Y("push_scope_choose", (String) arrayList.get(i)));
        v9j v9jVar = (v9j) map.get(charSequence);
        if (v9jVar != null) {
            this.f114826G.m205115u0((List) v9jVar.call());
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m138161p0(List list, Map map, Dialog dialog, View view, int i, CharSequence charSequence) {
        zvf0.m220399u("e_push_moment_renew", this.f114826G.f187761a.pageId(), vwb.m200311Y("push_scope_choose", (String) list.get(i)));
        v9j v9jVar = (v9j) map.get(charSequence);
        if (v9jVar != null) {
            this.f114826G.m205116x0((List) v9jVar.call());
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m138162q0(TeamAccountSelectView teamAccountSelectView) {
        List<String> selectBlockingIds = teamAccountSelectView.getSelectBlockingIds();
        String strPageId = this.f114826G.f187761a.pageId();
        String str = "all";
        if (!vwb.m200296J(selectBlockingIds)) {
            str = selectBlockingIds.contains("all") ? "none" : "designated";
        }
        zvf0.m220399u("e_push_official_accounts", strPageId, vwb.m200311Y("push_scope_choose", str));
        this.f114826G.m205117y0(selectBlockingIds);
    }

    /* JADX INFO: renamed from: r */
    public void m138163r() {
        this.f114828b.setTitle("消息提醒与通知");
        this.f114828b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.xr40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f194085a.m138117X(view);
            }
        });
        this.f114832f.setOnClickListener(new View.OnClickListener() { // from class: l.is40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                it40.m138113O(view);
            }
        });
        this.f114836j.setOnClickListener(new View.OnClickListener() { // from class: l.ts40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                it40.m138104F(view);
            }
        });
        this.f114837k.setOnClickListener(new View.OnClickListener() { // from class: l.bt40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                it40.m138106H(view);
            }
        });
        yij0.m214964t(this.f114825F, rs4.f160804e.get().booleanValue());
        this.f114825F.setOnClickListener(new View.OnClickListener() { // from class: l.ct40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f82453a.m138118Y(view);
            }
        });
    }

    /* JADX INFO: renamed from: r0 */
    public void m138164r0(@NonNull Settings settings) {
        final NotificationSetting notificationSettingNew_ = settings.getSettingGroup().noPush;
        if (notificationSettingNew_ == null) {
            notificationSettingNew_ = NotificationSetting.new_();
        }
        yij0.m214964t(this.f114835i, settings.previewPushMessage().booleanValue());
        m138166t0(this.f114835i, new View.OnClickListener() { // from class: l.dt40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f87817a.m138126i0(view);
            }
        });
        yij0.m214964t(this.f114839m, !notificationSettingNew_.match);
        m138166t0(this.f114839m, new View.OnClickListener() { // from class: l.ht40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f109365a.m138128j0(view);
            }
        });
        yij0.m214964t(this.f114840n, !notificationSettingNew_.conversation);
        m138166t0(this.f114840n, new View.OnClickListener() { // from class: l.yr40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f199631a.m138156k0(view);
            }
        });
        yij0.m214964t(this.f114841o, !notificationSettingNew_.greeting);
        m138166t0(this.f114841o, new View.OnClickListener() { // from class: l.zr40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f204455a.m138157l0(view);
            }
        });
        this.f114843q.setText(m138146V(notificationSettingNew_.teamAccount));
        m138166t0(this.f114842p, new View.OnClickListener() { // from class: l.as40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f71383a.m138147Z(notificationSettingNew_, view);
            }
        });
        this.f114846t.setText(m138145U(notificationSettingNew_.momentUpdate));
        m138166t0(this.f114845s, new View.OnClickListener() { // from class: l.bs40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f77003a.m138148a0(notificationSettingNew_, view);
            }
        });
        this.f114848v.setText(m138144T(notificationSettingNew_.momentComment));
        m138166t0(this.f114847u, new View.OnClickListener() { // from class: l.cs40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f82321a.m138149b0(notificationSettingNew_, view);
            }
        });
        this.f114850x.setText(m138144T(notificationSettingNew_.momentLike));
        m138166t0(this.f114849w, new View.OnClickListener() { // from class: l.ds40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f87718a.m138150c0(notificationSettingNew_, view);
            }
        });
        yij0.m214964t(this.f114851y, !notificationSettingNew_.momentLiked);
        m138166t0(this.f114851y, new View.OnClickListener() { // from class: l.es40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f92979a.m138151d0(view);
            }
        });
        yij0.m214964t(this.f114821B, !notificationSettingNew_.extremePick);
        m138166t0(this.f114821B, new View.OnClickListener() { // from class: l.fs40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99040a.m138152e0(view);
            }
        });
        boolean zIsFemale = CoreModule.f17545c.f19639e0.m169527p9().isFemale();
        VFrame vFrame = this.f114822C;
        if (zIsFemale) {
            xdl0.m208344M(vFrame, false);
        } else {
            yij0.m214964t(vFrame, !notificationSettingNew_.status);
            m138166t0(this.f114822C, new View.OnClickListener() { // from class: l.et40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f93073a.m138153f0(view);
                }
            });
        }
        yij0.m214964t(this.f114823D, !notificationSettingNew_.chatPartners);
        m138166t0(this.f114823D, new View.OnClickListener() { // from class: l.ft40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99142a.m138154g0(view);
            }
        });
        yij0.m214964t(this.f114824E, !notificationSettingNew_.group);
        m138166t0(this.f114824E, new View.OnClickListener() { // from class: l.gt40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f104244a.m138155h0(view);
            }
        });
    }

    /* JADX INFO: renamed from: s0 */
    public void m138165s0() {
        NotificationCheckerCommon.State stateM79220a = NotificationCheckerCommon.m79220a();
        NotificationCheckerCommon.State state = NotificationCheckerCommon.State.closed;
        VText vText = this.f114834h;
        if (stateM79220a == state) {
            vText.setText("关闭");
        } else {
            vText.setText("开启");
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final void m138166t0(View view, final View.OnClickListener onClickListener) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.qs40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f156100a.m138158m0(onClickListener, view2);
            }
        });
    }

    /* JADX INFO: renamed from: u0 */
    public final void m138167u0(String str) {
        ArrayList arrayListM200324f0 = vwb.m200324f0("所有人", "我喜欢的人及配对好友", "我喜欢的人", "配对好友", "陌生人", "关闭");
        final ArrayList arrayListM200324f1 = vwb.m200324f0("all", "like_friends", "like", "friends", "strangers", "none");
        final Map<String, v9j<List<MomentNotifyBlockType>>> mapM138115S = m138115S();
        getAct().dialog().m20507G0("评论通知").m20499C0("我将收到这些人评论我动态的通知").m20535e0(arrayListM200324f0).m20496B(false).m20538h0(arrayListM200324f0.indexOf(str), new Dialog.InterfaceC4311g() { // from class: l.hs40
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
            /* JADX INFO: renamed from: a */
            public final void mo20569a(Dialog dialog, View view, int i, CharSequence charSequence) {
                this.f109288a.m138159n0(mapM138115S, arrayListM200324f1, dialog, view, i, charSequence);
            }
        }).m20541k0(R$string.f18408c).m20568z0();
    }

    /* JADX INFO: renamed from: v0 */
    public final void m138168v0(String str) {
        ArrayList arrayListM200324f0 = vwb.m200324f0("所有人", "我喜欢的人及配对好友", "我喜欢的人", "配对好友", "陌生人", "关闭");
        final ArrayList arrayListM200324f1 = vwb.m200324f0("all", "like_friends", "like", "friends", "strangers", "none");
        final Map<String, v9j<List<MomentNotifyBlockType>>> mapM138115S = m138115S();
        getAct().dialog().m20507G0("点赞通知").m20499C0("我将收到这些人点赞我动态的通知").m20535e0(arrayListM200324f0).m20496B(false).m20538h0(arrayListM200324f0.indexOf(str), new Dialog.InterfaceC4311g() { // from class: l.ls40
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
            /* JADX INFO: renamed from: a */
            public final void mo20569a(Dialog dialog, View view, int i, CharSequence charSequence) {
                this.f129803a.m138160o0(arrayListM200324f1, mapM138115S, dialog, view, i, charSequence);
            }
        }).m20541k0(R$string.f18408c).m20568z0();
    }

    /* JADX INFO: renamed from: w0 */
    public final void m138169w0(String str) {
        ArrayList arrayListM200324f0 = vwb.m200324f0("我喜欢的人及配对好友", "我喜欢的人", "配对好友", "关闭");
        final ArrayList arrayListM200324f1 = vwb.m200324f0("all", "like", "friends", "none");
        final Map<String, v9j<List<MomentNotifyBlockType>>> mapM138116W = m138116W();
        getAct().dialog().m20507G0("动态更新通知").m20499C0("我将收到这些人的动态更新通知").m20535e0(arrayListM200324f0).m20496B(false).m20538h0(arrayListM200324f0.indexOf(str), new Dialog.InterfaceC4311g() { // from class: l.ms40
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
            /* JADX INFO: renamed from: a */
            public final void mo20569a(Dialog dialog, View view, int i, CharSequence charSequence) {
                this.f135440a.m138161p0(arrayListM200324f1, mapM138116W, dialog, view, i, charSequence);
            }
        }).m20541k0(R$string.f18408c).m20568z0();
    }

    /* JADX INFO: renamed from: x0 */
    public void m138170x0(List<String> list) {
        final TeamAccountSelectView teamAccountSelectView = (TeamAccountSelectView) getAct().inflater().inflate(f6c0.f95343Ec, (ViewGroup) null);
        teamAccountSelectView.m55621k(getAct(), list);
        VScroll vScroll = new VScroll(getContext());
        vScroll.addView(teamAccountSelectView);
        getAct().dialog().m20507G0("官方号通知").m20499C0("我将收到这些官方号的消息通知").m20520P(vScroll, true).m20496B(false).m20541k0(R$string.f18408c).m20556t0(R$string.f18653k, new Runnable() { // from class: l.gs40
            @Override // java.lang.Runnable
            public final void run() {
                this.f104141a.m138162q0(teamAccountSelectView);
            }
        }).m20568z0();
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
