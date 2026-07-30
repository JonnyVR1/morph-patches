package p009l;

import android.content.Intent;
import android.view.View;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.messages.ConversationHeadRecommendLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.QuickChatCardInfo;
import com.p1.mobile.putong.core.data.Recommended;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchManager;
import com.p1.mobile.putong.core.ui.onlinematch.a;
import com.p1.mobile.putong.core.ui.purchase.c;
import com.p1.mobile.putong.core.ui.seepage.match.FakeMatchAct;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import java.util.Date;
import l.d30;
import l.e30;
import l.j760;
import l.mkd0;
import l.osi0;
import l.qib0;
import l.roj0;
import l.snm;
import l.swh0;
import l.vwb;
import l.w0c0;
import l.w9j;
import l.x2c0;
import l.xdl0;
import l.xzc0;
import l.zvf0;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class hb30 {

    /* JADX INFO: renamed from: e */
    public static volatile hb30 f13934e;

    /* JADX INFO: renamed from: a */
    public int f13935a = 0;

    /* JADX INFO: renamed from: b */
    public boolean f13936b = false;

    /* JADX INFO: renamed from: c */
    @Nullable
    public Recommended f13937c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public QuickChatCardInfo f13938d;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m15475a(d30 d30Var, Act act, Recommended recommended, roj0 roj0Var) {
        d30Var.call();
        act.startActivity(MessagesAct.p2(act, recommended.userId, false, false, false, false, (Intent) null, 8, ""));
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Boolean m15477c(Envelope envelope) {
        CoreData moduleData = envelope.getModuleData(CoreData.class);
        return Boolean.valueOf(NullChecker.a(moduleData) && NullChecker.a(moduleData.heartbeatMatch) && moduleData.heartbeatMatch.matched);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m15478d(VDraweeView vDraweeView, VText vText, VImage vImage, VText vText2, final Recommended recommended, View view, final ConversationHeadRecommendLayout.C0279c c0279c, final Act act, User user) {
        qib0.G.L0(vDraweeView, user.fp().profileSmall().formatted());
        vText.setText("心动信号");
        vImage.setImageResource(x2c0.t8);
        vText2.setText(recommended.reason);
        vText2.setBackgroundResource(0);
        xdl0.E0(view, new View.OnClickListener() { // from class: l.eb30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                hb30.m15480f(c0279c, act, recommended, view2);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m15479e(Throwable th) {
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m15480f(ConversationHeadRecommendLayout.C0279c c0279c, Act act, Recommended recommended, View view) {
        zvf0.u("e_nomatch_svip_guide", "p_messages_view", new j760[]{vwb.Y("position", c0279c.f3552a == 14 ? "1" : "2"), vwb.Y("nomatch_guide_type", "funchat")});
        m15492r(act, recommended, new d30() { // from class: l.ra30
            public final void call() {
                hb30.m15493s().m15500z();
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m15482h(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m15483i(Act act, User user, QuickChatCardInfo quickChatCardInfo, ConversationHeadRecommendLayout.C0279c c0279c, View view) {
        if (swh0.s0() <= 0) {
            c.p1(act, new e30() { // from class: l.fb30
                public final void call(Object obj) {
                    hb30.m15486l((PurchaseType) obj);
                }
            }, a.p0(), "p_message,nomatch_guide", ((DbObject) user).id);
        } else {
            xzc0.r0(act, quickChatCardInfo, true, true, "", new d30() { // from class: l.gb30
                public final void call() {
                    hb30.m15493s().m15499y();
                }
            });
        }
        zvf0.u("e_nomatch_svip_guide", "p_messages_view", new j760[]{vwb.Y("position", c0279c.f3552a == 14 ? "1" : "2"), vwb.Y("nomatch_guide_type", "quickchat")});
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m15484j(VDraweeView vDraweeView, VText vText, VImage vImage, VText vText2, View view, final Act act, final QuickChatCardInfo quickChatCardInfo, final ConversationHeadRecommendLayout.C0279c c0279c, final User user) {
        a.w(vDraweeView, user.fp().profileSmall());
        vText.setText("即刻闪聊");
        vImage.setImageResource(x2c0.j8);
        vText2.setText("立即蒙面聊天");
        vText2.setBackgroundResource(0);
        xdl0.E0(view, new View.OnClickListener() { // from class: l.db30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                hb30.m15483i(act, user, quickChatCardInfo, c0279c, view2);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m15486l(PurchaseType purchaseType) {
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m15487m(d30 d30Var, Boolean bool) {
        if (bool.booleanValue()) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m15489o(ConversationHeadRecommendLayout.C0279c c0279c, Act act, User user, View view) {
        zvf0.u("e_nomatch_svip_guide", "p_messages_view", new j760[]{vwb.Y("position", c0279c.f3552a == 14 ? "1" : "2"), vwb.Y("nomatch_guide_type", "see")});
        FakeMatchAct.a2(act, ((DbObject) user).id, "p_message,nomatch_guide");
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m15490p(ConversationHeadRecommendLayout.C0279c c0279c, Act act, View view) {
        zvf0.u("e_nomatch_svip_guide", "p_messages_view", new j760[]{vwb.Y("position", c0279c.f3552a == 14 ? "1" : "2"), vwb.Y("nomatch_guide_type", "quickchat")});
        if (OnlineMatchManager.z().L()) {
            osi0.g("闪聊搜索中, 请稍后");
        } else {
            OnlineMatchManager.z().s0(act, OnlineMatchManager.QuickChatStartClickFrom.ChatTop, "p_message,nomatch_guide");
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m15491q(Throwable th) {
    }

    /* JADX INFO: renamed from: r */
    public static void m15492r(final Act act, final Recommended recommended, final d30 d30Var) {
        final d30 d30Var2 = new d30() { // from class: l.sa30
            public final void call() {
                Act act2 = act;
                Recommended recommended2 = recommended;
                act2.duringCreated(CoreModule.c.H1.v3(recommended2.tracker).take(1).filter(new w9j() { // from class: l.ua30
                    public final Object call(Object obj) {
                        return hb30.m15477c((Envelope) obj);
                    }
                }).flatMap(new w9j() { // from class: l.va30
                    public final Object call(Object obj) {
                        return CoreModule.c.f0.ap(recommended2.userId);
                    }
                })).subscribe(mkd0.H(new e30() { // from class: l.wa30
                    public final void call(Object obj) {
                        hb30.m15475a(d30Var, act2, recommended2, (roj0) obj);
                    }
                }, new e30() { // from class: l.xa30
                    public final void call(Object obj) {
                        hb30.m15479e((Throwable) obj);
                    }
                }));
            }
        };
        if (snm.F(act, false, true, "p_message,nomatch_guide", new e30() { // from class: l.ta30
            public final void call(Object obj) {
                hb30.m15487m(d30Var2, (Boolean) obj);
            }
        })) {
            d30Var2.call();
        }
    }

    /* JADX INFO: renamed from: s */
    public static hb30 m15493s() {
        if (f13934e == null) {
            synchronized (hb30.class) {
                try {
                    if (f13934e == null) {
                        f13934e = new hb30();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f13934e;
    }

    /* JADX INFO: renamed from: t */
    public static void m15494t() {
        if (NullChecker.a(f13934e)) {
            synchronized (hb30.class) {
                try {
                    if (NullChecker.a(f13934e)) {
                        f13934e = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m15495u(final Act act, final ConversationHeadRecommendLayout.C0279c c0279c, VDraweeView vDraweeView, VText vText, VImage vImage, VText vText2, View view) {
        qib0.G.Y0(vDraweeView, x2c0.m8);
        vText.setText("即刻闪聊");
        vImage.setImageResource(x2c0.j8);
        vText2.setText("立即蒙面聊天");
        vText2.setBackgroundResource(0);
        vText2.setTextColor(act.getResources().getColor(w0c0.j0));
        xdl0.E0(view, new View.OnClickListener() { // from class: l.za30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                hb30.m15490p(c0279c, act, view2);
            }
        });
        zvf0.A("e_nomatch_svip_guide", "p_messages_view", new j760[]{vwb.Y("position", c0279c.f3552a == 14 ? "1" : "2"), vwb.Y("nomatch_guide_type", "quickchat")});
    }

    /* JADX INFO: renamed from: v */
    public static void m15496v(final Act act, ConversationHeadRecommendLayout.C0278b c0278b, final ConversationHeadRecommendLayout.C0279c c0279c, final VDraweeView vDraweeView, final VText vText, final VImage vImage, final VText vText2, final View view) {
        final QuickChatCardInfo quickChatCardInfo = c0279c.f3576y;
        vText2.setTextColor(act.getResources().getColor(w0c0.j0));
        c0278b.c(act, CoreModule.c.e0.Ka(quickChatCardInfo.userID)).subscribe(mkd0.H(new e30() { // from class: l.qa30
            public final void call(Object obj) {
                hb30.m15484j(vDraweeView, vText, vImage, vText2, view, act, quickChatCardInfo, c0279c, (User) obj);
            }
        }, new e30() { // from class: l.ya30
            public final void call(Object obj) {
                hb30.m15482h((Throwable) obj);
            }
        }));
        zvf0.A("e_nomatch_svip_guide", "p_messages_view", new j760[]{vwb.Y("position", c0279c.f3552a == 14 ? "1" : "2"), vwb.Y("nomatch_guide_type", "quickchat")});
    }

    /* JADX INFO: renamed from: w */
    public static void m15497w(final Act act, ConversationHeadRecommendLayout.C0278b c0278b, final ConversationHeadRecommendLayout.C0279c c0279c, final VDraweeView vDraweeView, final VText vText, final VImage vImage, final VText vText2, final View view) {
        final Recommended recommended = c0279c.f3575x;
        vText2.setTextColor(act.getResources().getColor(w0c0.j0));
        c0278b.c(act, CoreModule.c.e0.Ka(recommended.userId)).subscribe(mkd0.H(new e30() { // from class: l.bb30
            public final void call(Object obj) {
                hb30.m15478d(vDraweeView, vText, vImage, vText2, recommended, view, c0279c, act, (User) obj);
            }
        }, new e30() { // from class: l.cb30
            public final void call(Object obj) {
                hb30.m15491q((Throwable) obj);
            }
        }));
        zvf0.A("e_nomatch_svip_guide", "p_messages_view", new j760[]{vwb.Y("position", c0279c.f3552a == 14 ? "1" : "2"), vwb.Y("nomatch_guide_type", "funchat")});
    }

    /* JADX INFO: renamed from: x */
    public static void m15498x(final Act act, final ConversationHeadRecommendLayout.C0279c c0279c, VDraweeView vDraweeView, VText vText, VImage vImage, VText vText2, View view) {
        final User user = c0279c.f3577z;
        a.x(vDraweeView, user.fp().profileSmall(), 0);
        vText.setText(String.format("%s喜欢你", user.isFemale() ? "她" : "他"));
        vImage.setImageResource(x2c0.s8);
        vText2.setBackgroundResource(0);
        vText2.setTextColor(act.getResources().getColor(w0c0.j0));
        String str = "在等你回应";
        if (!CoreModule.c.E0.B3(user) && CoreModule.K().vn(user) <= 0) {
            int i = user.location.distance;
            if (i > 10000) {
                long time = new Date(mqi0.m18550o()).getTime() - new Date(user.getLastActiveTimeMillis()).getTime();
                long j = time / 3600000;
                if (j <= 24) {
                    str = j > 1 ? String.format("%s小时前活跃", Long.valueOf(j)) : String.format("%s分钟前活跃", Long.valueOf(time / 60000));
                }
            } else if (i > 1000) {
                str = String.format("离你%skm", new DecimalFormat("0.0").format(user.location.distance / 1000.0f));
            } else {
                str = i > 500 ? String.format("离你%sm", Integer.valueOf(i)) : "离你500m";
            }
        }
        vText2.setText(str);
        xdl0.E0(view, new View.OnClickListener() { // from class: l.ab30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                hb30.m15489o(c0279c, act, user, view2);
            }
        });
        zvf0.A("e_nomatch_svip_guide", "p_messages_view", new j760[]{vwb.Y("position", c0279c.f3552a == 14 ? "1" : "2"), vwb.Y("nomatch_guide_type", "see")});
    }

    /* JADX INFO: renamed from: y */
    public void m15499y() {
        this.f13938d = null;
        CoreModule.c.f0.U1.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: z */
    public void m15500z() {
        this.f13937c = null;
        CoreModule.c.f0.U1.onNext(roj0.a);
    }
}
