package p149l;

import android.view.View;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.QuickChatCardInfo;
import com.p046p1.mobile.putong.core.data.Recommended;
import com.p046p1.mobile.putong.core.newui.messages.ConversationHeadRecommendLayout;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.C8609a;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchManager;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.core.p053ui.seepage.match.FakeMatchAct;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import java.util.Date;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class hb30 {

    /* JADX INFO: renamed from: e */
    public static volatile hb30 f106899e;

    /* JADX INFO: renamed from: a */
    public int f106900a = 0;

    /* JADX INFO: renamed from: b */
    public boolean f106901b = false;

    /* JADX INFO: renamed from: c */
    @Nullable
    public Recommended f106902c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public QuickChatCardInfo f106903d;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m130295a(d30 d30Var, Act act, Recommended recommended, roj0 roj0Var) {
        d30Var.call();
        act.startActivity(MessagesAct.m48949p2(act, recommended.userId, false, false, false, false, null, 8, ""));
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Boolean m130297c(Envelope envelope) {
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        return Boolean.valueOf(NullChecker.m81303a(coreData) && NullChecker.m81303a(coreData.heartbeatMatch) && coreData.heartbeatMatch.matched);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m130298d(VDraweeView vDraweeView, VText vText, VImage vImage, VText vText2, final Recommended recommended, View view, final ConversationHeadRecommendLayout.C8115c c8115c, final Act act, User user) {
        qib0.f154691G.m102331L0(vDraweeView, user.m60124fp().profileSmall().formatted());
        vText.setText("心动信号");
        vImage.setImageResource(x2c0.f190579t8);
        vText2.setText(recommended.reason);
        vText2.setBackgroundResource(0);
        xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.eb30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                hb30.m130300f(c8115c, act, recommended, view2);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m130299e(Throwable th) {
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m130300f(ConversationHeadRecommendLayout.C8115c c8115c, Act act, Recommended recommended, View view) {
        zvf0.m220399u("e_nomatch_svip_guide", OMSDialogPositon.p_messages_view, vwb.m200311Y("position", c8115c.f24774a == 14 ? "1" : "2"), vwb.m200311Y("nomatch_guide_type", "funchat"));
        m130312r(act, recommended, new d30() { // from class: l.ra30
            @Override // p149l.d30
            public final void call() {
                hb30.m130313s().m130320z();
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m130302h(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m130303i(Act act, User user, QuickChatCardInfo quickChatCardInfo, ConversationHeadRecommendLayout.C8115c c8115c, View view) {
        if (swh0.m186263s0() <= 0) {
            C8764c.m53482p1(act, new e30() { // from class: l.fb30
                @Override // p149l.e30
                public final void call(Object obj) {
                    hb30.m130306l((PurchaseType) obj);
                }
            }, C8609a.m50274p0(), "p_message,nomatch_guide", user.f56011id);
        } else {
            xzc0.m211971r0(act, quickChatCardInfo, true, true, "", new d30() { // from class: l.gb30
                @Override // p149l.d30
                public final void call() {
                    hb30.m130313s().m130319y();
                }
            });
        }
        zvf0.m220399u("e_nomatch_svip_guide", OMSDialogPositon.p_messages_view, vwb.m200311Y("position", c8115c.f24774a == 14 ? "1" : "2"), vwb.m200311Y("nomatch_guide_type", "quickchat"));
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m130304j(VDraweeView vDraweeView, VText vText, VImage vImage, VText vText2, View view, final Act act, final QuickChatCardInfo quickChatCardInfo, final ConversationHeadRecommendLayout.C8115c c8115c, final User user) {
        C8609a.m50281w(vDraweeView, user.m60124fp().profileSmall());
        vText.setText("即刻闪聊");
        vImage.setImageResource(x2c0.f190259j8);
        vText2.setText("立即蒙面聊天");
        vText2.setBackgroundResource(0);
        xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.db30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                hb30.m130303i(act, user, quickChatCardInfo, c8115c, view2);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m130306l(PurchaseType purchaseType) {
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m130307m(d30 d30Var, Boolean bool) {
        if (bool.booleanValue()) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m130309o(ConversationHeadRecommendLayout.C8115c c8115c, Act act, User user, View view) {
        zvf0.m220399u("e_nomatch_svip_guide", OMSDialogPositon.p_messages_view, vwb.m200311Y("position", c8115c.f24774a == 14 ? "1" : "2"), vwb.m200311Y("nomatch_guide_type", "see"));
        FakeMatchAct.m54986a2(act, user.f56011id, "p_message,nomatch_guide");
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m130310p(ConversationHeadRecommendLayout.C8115c c8115c, Act act, View view) {
        zvf0.m220399u("e_nomatch_svip_guide", OMSDialogPositon.p_messages_view, vwb.m200311Y("position", c8115c.f24774a == 14 ? "1" : "2"), vwb.m200311Y("nomatch_guide_type", "quickchat"));
        if (OnlineMatchManager.m50143z().m50155L()) {
            osi0.m165783g("闪聊搜索中, 请稍后");
        } else {
            OnlineMatchManager.m50143z().m50187s0(act, OnlineMatchManager.QuickChatStartClickFrom.ChatTop, "p_message,nomatch_guide");
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m130311q(Throwable th) {
    }

    /* JADX INFO: renamed from: r */
    public static void m130312r(final Act act, final Recommended recommended, final d30 d30Var) {
        final d30 d30Var2 = new d30() { // from class: l.sa30
            @Override // p149l.d30
            public final void call() {
                Act act2 = act;
                Recommended recommended2 = recommended;
                act2.duringCreated((C22306c) CoreModule.f17545c.f19571H1.m201076v3(recommended2.tracker).take(1).filter(new w9j() { // from class: l.ua30
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return hb30.m130297c((Envelope) obj);
                    }
                }).flatMap(new w9j() { // from class: l.va30
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return CoreModule.f17545c.f19642f0.m32902ap(recommended2.userId);
                    }
                })).subscribe(mkd0.m154956H(new e30() { // from class: l.wa30
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        hb30.m130295a(d30Var, act2, recommended2, (roj0) obj);
                    }
                }, new e30() { // from class: l.xa30
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        hb30.m130299e((Throwable) obj);
                    }
                }));
            }
        };
        if (snm.m185075F(act, false, true, "p_message,nomatch_guide", new e30() { // from class: l.ta30
            @Override // p149l.e30
            public final void call(Object obj) {
                hb30.m130307m(d30Var2, (Boolean) obj);
            }
        })) {
            d30Var2.call();
        }
    }

    /* JADX INFO: renamed from: s */
    public static hb30 m130313s() {
        if (f106899e == null) {
            synchronized (hb30.class) {
                try {
                    if (f106899e == null) {
                        f106899e = new hb30();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f106899e;
    }

    /* JADX INFO: renamed from: t */
    public static void m130314t() {
        if (NullChecker.m81303a(f106899e)) {
            synchronized (hb30.class) {
                try {
                    if (NullChecker.m81303a(f106899e)) {
                        f106899e = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m130315u(final Act act, final ConversationHeadRecommendLayout.C8115c c8115c, VDraweeView vDraweeView, VText vText, VImage vImage, VText vText2, View view) {
        qib0.f154691G.m102354Y0(vDraweeView, x2c0.f190355m8);
        vText.setText("即刻闪聊");
        vImage.setImageResource(x2c0.f190259j8);
        vText2.setText("立即蒙面聊天");
        vText2.setBackgroundResource(0);
        vText2.setTextColor(act.getResources().getColor(w0c0.f183858j0));
        xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.za30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                hb30.m130310p(c8115c, act, view2);
            }
        });
        zvf0.m220368A("e_nomatch_svip_guide", OMSDialogPositon.p_messages_view, vwb.m200311Y("position", c8115c.f24774a == 14 ? "1" : "2"), vwb.m200311Y("nomatch_guide_type", "quickchat"));
    }

    /* JADX INFO: renamed from: v */
    public static void m130316v(final Act act, ConversationHeadRecommendLayout.C8114b c8114b, final ConversationHeadRecommendLayout.C8115c c8115c, final VDraweeView vDraweeView, final VText vText, final VImage vImage, final VText vText2, final View view) {
        final QuickChatCardInfo quickChatCardInfo = c8115c.f24798y;
        vText2.setTextColor(act.getResources().getColor(w0c0.f183858j0));
        c8114b.mo67374c(act, CoreModule.f17545c.f19639e0.m169410Ka(quickChatCardInfo.userID)).subscribe(mkd0.m154956H(new e30() { // from class: l.qa30
            @Override // p149l.e30
            public final void call(Object obj) {
                hb30.m130304j(vDraweeView, vText, vImage, vText2, view, act, quickChatCardInfo, c8115c, (User) obj);
            }
        }, new e30() { // from class: l.ya30
            @Override // p149l.e30
            public final void call(Object obj) {
                hb30.m130302h((Throwable) obj);
            }
        }));
        zvf0.m220368A("e_nomatch_svip_guide", OMSDialogPositon.p_messages_view, vwb.m200311Y("position", c8115c.f24774a == 14 ? "1" : "2"), vwb.m200311Y("nomatch_guide_type", "quickchat"));
    }

    /* JADX INFO: renamed from: w */
    public static void m130317w(final Act act, ConversationHeadRecommendLayout.C8114b c8114b, final ConversationHeadRecommendLayout.C8115c c8115c, final VDraweeView vDraweeView, final VText vText, final VImage vImage, final VText vText2, final View view) {
        final Recommended recommended = c8115c.f24797x;
        vText2.setTextColor(act.getResources().getColor(w0c0.f183858j0));
        c8114b.mo67374c(act, CoreModule.f17545c.f19639e0.m169410Ka(recommended.userId)).subscribe(mkd0.m154956H(new e30() { // from class: l.bb30
            @Override // p149l.e30
            public final void call(Object obj) {
                hb30.m130298d(vDraweeView, vText, vImage, vText2, recommended, view, c8115c, act, (User) obj);
            }
        }, new e30() { // from class: l.cb30
            @Override // p149l.e30
            public final void call(Object obj) {
                hb30.m130311q((Throwable) obj);
            }
        }));
        zvf0.m220368A("e_nomatch_svip_guide", OMSDialogPositon.p_messages_view, vwb.m200311Y("position", c8115c.f24774a == 14 ? "1" : "2"), vwb.m200311Y("nomatch_guide_type", "funchat"));
    }

    /* JADX INFO: renamed from: x */
    public static void m130318x(final Act act, final ConversationHeadRecommendLayout.C8115c c8115c, VDraweeView vDraweeView, VText vText, VImage vImage, VText vText2, View view) {
        final User user = c8115c.f24799z;
        C8609a.m50282x(vDraweeView, user.m60124fp().profileSmall(), 0);
        vText.setText(String.format("%s喜欢你", user.isFemale() ? "她" : "他"));
        vImage.setImageResource(x2c0.f190547s8);
        vText2.setBackgroundResource(0);
        vText2.setTextColor(act.getResources().getColor(w0c0.f183858j0));
        String str = "在等你回应";
        if (!CoreModule.f17545c.f19561E0.m203772B3(user) && CoreModule.m29932K().mo30830vn(user) <= 0) {
            int i = user.location.distance;
            if (i > 10000) {
                long time = new Date(mqi0.m155944o()).getTime() - new Date(user.getLastActiveTimeMillis()).getTime();
                long j = time / 3600000;
                if (j <= 24) {
                    str = j > 1 ? String.format("%s小时前活跃", Long.valueOf(j)) : String.format("%s分钟前活跃", Long.valueOf(time / Constants.ONE_MIN_IN_MILLIS));
                }
            } else if (i > 1000) {
                str = String.format("离你%skm", new DecimalFormat(IdManager.DEFAULT_VERSION_NAME).format(user.location.distance / 1000.0f));
            } else {
                str = i > 500 ? String.format("离你%sm", Integer.valueOf(i)) : "离你500m";
            }
        }
        vText2.setText(str);
        xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.ab30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                hb30.m130309o(c8115c, act, user, view2);
            }
        });
        zvf0.m220368A("e_nomatch_svip_guide", OMSDialogPositon.p_messages_view, vwb.m200311Y("position", c8115c.f24774a == 14 ? "1" : "2"), vwb.m200311Y("nomatch_guide_type", "see"));
    }

    /* JADX INFO: renamed from: y */
    public void m130319y() {
        this.f106903d = null;
        CoreModule.f17545c.f19642f0.f19903U1.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: z */
    public void m130320z() {
        this.f106902c = null;
        CoreModule.f17545c.f19642f0.f19903U1.m132487l(roj0.f160388a);
    }
}
