package p153l;

import android.view.View;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.QuickChatCardInfo;
import com.p051p1.mobile.putong.core.data.Recommended;
import com.p051p1.mobile.putong.core.newui.messages.ConversationHeadRecommendLayout;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.C8772a;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchManager;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.core.p058ui.seepage.match.FakeMatchAct;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import java.util.Date;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class vj30 {

    /* JADX INFO: renamed from: e */
    public static volatile vj30 f184347e;

    /* JADX INFO: renamed from: a */
    public int f184348a = 0;

    /* JADX INFO: renamed from: b */
    public boolean f184349b = false;

    /* JADX INFO: renamed from: c */
    @Nullable
    public Recommended f184350c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public QuickChatCardInfo f184351d;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m201463a(x20 x20Var, Act act, Recommended recommended, uxj0 uxj0Var) {
        x20Var.call();
        act.startActivity(MessagesAct.m50132q2(act, recommended.userId, false, false, false, false, null, 8, ""));
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Boolean m201465c(Envelope envelope) {
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        return Boolean.valueOf(NullChecker.m82486a(coreData) && NullChecker.m82486a(coreData.heartbeatMatch) && coreData.heartbeatMatch.matched);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m201466d(VDraweeView vDraweeView, VText vText, VImage vImage, VText vText2, final Recommended recommended, View view, final ConversationHeadRecommendLayout.C8266c c8266c, final Act act, User user) {
        uqb0.f180374G.m127115L0(vDraweeView, user.m61308fp().profileSmall().formatted());
        vText.setText("心动信号");
        vImage.setImageResource(dbc0.f87474u8);
        vText2.setText(recommended.reason);
        vText2.setBackgroundResource(0);
        bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.sj30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                vj30.m201468f(c8266c, act, recommended, view2);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m201467e(Throwable th) {
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m201468f(ConversationHeadRecommendLayout.C8266c c8266c, Act act, Recommended recommended, View view) {
        i4g0.m138523u("e_nomatch_svip_guide", OMSDialogPositon.p_messages_view, jyb.m147494Y("position", c8266c.f25516a == 14 ? "1" : "2"), jyb.m147494Y("nomatch_guide_type", "funchat"));
        m201480r(act, recommended, new x20() { // from class: l.fj30
            @Override // p153l.x20
            public final void call() {
                vj30.m201481s().m201488z();
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m201470h(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m201471i(Act act, User user, QuickChatCardInfo quickChatCardInfo, ConversationHeadRecommendLayout.C8266c c8266c, View view) {
        if (a5i0.m96168s0() <= 0) {
            C8927c.m54665p1(act, new y20() { // from class: l.tj30
                @Override // p153l.y20
                public final void call(Object obj) {
                    vj30.m201474l((PurchaseType) obj);
                }
            }, C8772a.m51457p0(), "p_message,nomatch_guide", user.f56859id);
        } else {
            a8d0.m96434r0(act, quickChatCardInfo, true, true, "", new x20() { // from class: l.uj30
                @Override // p153l.x20
                public final void call() {
                    vj30.m201481s().m201487y();
                }
            });
        }
        i4g0.m138523u("e_nomatch_svip_guide", OMSDialogPositon.p_messages_view, jyb.m147494Y("position", c8266c.f25516a == 14 ? "1" : "2"), jyb.m147494Y("nomatch_guide_type", "quickchat"));
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m201472j(VDraweeView vDraweeView, VText vText, VImage vImage, VText vText2, View view, final Act act, final QuickChatCardInfo quickChatCardInfo, final ConversationHeadRecommendLayout.C8266c c8266c, final User user) {
        C8772a.m51464w(vDraweeView, user.m61308fp().profileSmall());
        vText.setText("即刻闪聊");
        vImage.setImageResource(dbc0.f87144k8);
        vText2.setText("立即蒙面聊天");
        vText2.setBackgroundResource(0);
        bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.rj30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                vj30.m201471i(act, user, quickChatCardInfo, c8266c, view2);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m201474l(PurchaseType purchaseType) {
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m201475m(x20 x20Var, Boolean bool) {
        if (bool.booleanValue()) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m201477o(ConversationHeadRecommendLayout.C8266c c8266c, Act act, User user, View view) {
        i4g0.m138523u("e_nomatch_svip_guide", OMSDialogPositon.p_messages_view, jyb.m147494Y("position", c8266c.f25516a == 14 ? "1" : "2"), jyb.m147494Y("nomatch_guide_type", "see"));
        FakeMatchAct.m56169b2(act, user.f56859id, "p_message,nomatch_guide");
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m201478p(ConversationHeadRecommendLayout.C8266c c8266c, Act act, View view) {
        i4g0.m138523u("e_nomatch_svip_guide", OMSDialogPositon.p_messages_view, jyb.m147494Y("position", c8266c.f25516a == 14 ? "1" : "2"), jyb.m147494Y("nomatch_guide_type", "quickchat"));
        if (OnlineMatchManager.m51326z().m51338L()) {
            r1j0.m179420g("闪聊搜索中, 请稍后");
        } else {
            OnlineMatchManager.m51326z().m51370s0(act, OnlineMatchManager.QuickChatStartClickFrom.ChatTop, "p_message,nomatch_guide");
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m201479q(Throwable th) {
    }

    /* JADX INFO: renamed from: r */
    public static void m201480r(final Act act, final Recommended recommended, final x20 x20Var) {
        final x20 x20Var2 = new x20() { // from class: l.gj30
            @Override // p153l.x20
            public final void call() {
                Act act2 = act;
                Recommended recommended2 = recommended;
                act2.duringCreated((C22421c) CoreModule.f18264c.f20313H1.m123929v3(recommended2.tracker).take(1).filter(new qcj() { // from class: l.ij30
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return vj30.m201465c((Envelope) obj);
                    }
                }).flatMap(new qcj() { // from class: l.jj30
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return CoreModule.f18264c.f20384f0.m33905ap(recommended2.userId);
                    }
                })).subscribe(psd0.m173597H(new y20() { // from class: l.kj30
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        vj30.m201463a(x20Var, act2, recommended2, (uxj0) obj);
                    }
                }, new y20() { // from class: l.lj30
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        vj30.m201467e((Throwable) obj);
                    }
                }));
            }
        };
        if (upm.m197109F(act, false, true, "p_message,nomatch_guide", new y20() { // from class: l.hj30
            @Override // p153l.y20
            public final void call(Object obj) {
                vj30.m201475m(x20Var2, (Boolean) obj);
            }
        })) {
            x20Var2.call();
        }
    }

    /* JADX INFO: renamed from: s */
    public static vj30 m201481s() {
        if (f184347e == null) {
            synchronized (vj30.class) {
                try {
                    if (f184347e == null) {
                        f184347e = new vj30();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f184347e;
    }

    /* JADX INFO: renamed from: t */
    public static void m201482t() {
        if (NullChecker.m82486a(f184347e)) {
            synchronized (vj30.class) {
                try {
                    if (NullChecker.m82486a(f184347e)) {
                        f184347e = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m201483u(final Act act, final ConversationHeadRecommendLayout.C8266c c8266c, VDraweeView vDraweeView, VText vText, VImage vImage, VText vText2, View view) {
        uqb0.f180374G.m127138Y0(vDraweeView, dbc0.f87243n8);
        vText.setText("即刻闪聊");
        vImage.setImageResource(dbc0.f87144k8);
        vText2.setText("立即蒙面聊天");
        vText2.setBackgroundResource(0);
        vText2.setTextColor(act.getResources().getColor(c9c0.f80431k0));
        bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.nj30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                vj30.m201478p(c8266c, act, view2);
            }
        });
        i4g0.m138492A("e_nomatch_svip_guide", OMSDialogPositon.p_messages_view, jyb.m147494Y("position", c8266c.f25516a == 14 ? "1" : "2"), jyb.m147494Y("nomatch_guide_type", "quickchat"));
    }

    /* JADX INFO: renamed from: v */
    public static void m201484v(final Act act, ConversationHeadRecommendLayout.C8265b c8265b, final ConversationHeadRecommendLayout.C8266c c8266c, final VDraweeView vDraweeView, final VText vText, final VImage vImage, final VText vText2, final View view) {
        final QuickChatCardInfo quickChatCardInfo = c8266c.f25540y;
        vText2.setTextColor(act.getResources().getColor(c9c0.f80431k0));
        c8265b.mo68557c(act, CoreModule.f18264c.f20381e0.m116483Ka(quickChatCardInfo.userID)).subscribe(psd0.m173597H(new y20() { // from class: l.ej30
            @Override // p153l.y20
            public final void call(Object obj) {
                vj30.m201472j(vDraweeView, vText, vImage, vText2, view, act, quickChatCardInfo, c8266c, (User) obj);
            }
        }, new y20() { // from class: l.mj30
            @Override // p153l.y20
            public final void call(Object obj) {
                vj30.m201470h((Throwable) obj);
            }
        }));
        i4g0.m138492A("e_nomatch_svip_guide", OMSDialogPositon.p_messages_view, jyb.m147494Y("position", c8266c.f25516a == 14 ? "1" : "2"), jyb.m147494Y("nomatch_guide_type", "quickchat"));
    }

    /* JADX INFO: renamed from: w */
    public static void m201485w(final Act act, ConversationHeadRecommendLayout.C8265b c8265b, final ConversationHeadRecommendLayout.C8266c c8266c, final VDraweeView vDraweeView, final VText vText, final VImage vImage, final VText vText2, final View view) {
        final Recommended recommended = c8266c.f25539x;
        vText2.setTextColor(act.getResources().getColor(c9c0.f80431k0));
        c8265b.mo68557c(act, CoreModule.f18264c.f20381e0.m116483Ka(recommended.userId)).subscribe(psd0.m173597H(new y20() { // from class: l.pj30
            @Override // p153l.y20
            public final void call(Object obj) {
                vj30.m201466d(vDraweeView, vText, vImage, vText2, recommended, view, c8266c, act, (User) obj);
            }
        }, new y20() { // from class: l.qj30
            @Override // p153l.y20
            public final void call(Object obj) {
                vj30.m201479q((Throwable) obj);
            }
        }));
        i4g0.m138492A("e_nomatch_svip_guide", OMSDialogPositon.p_messages_view, jyb.m147494Y("position", c8266c.f25516a == 14 ? "1" : "2"), jyb.m147494Y("nomatch_guide_type", "funchat"));
    }

    /* JADX INFO: renamed from: x */
    public static void m201486x(final Act act, final ConversationHeadRecommendLayout.C8266c c8266c, VDraweeView vDraweeView, VText vText, VImage vImage, VText vText2, View view) {
        final User user = c8266c.f25541z;
        C8772a.m51465x(vDraweeView, user.m61308fp().profileSmall(), 0);
        vText.setText(String.format("%s喜欢你", user.isFemale() ? "她" : "他"));
        vImage.setImageResource(dbc0.f87441t8);
        vText2.setBackgroundResource(0);
        vText2.setTextColor(act.getResources().getColor(c9c0.f80431k0));
        String str = "在等你回应";
        if (!CoreModule.f18264c.f20303E0.m141060B3(user) && CoreModule.m30930K().mo31833vn(user) <= 0) {
            int i = user.location.distance;
            if (i > 10000) {
                long time = new Date(pzi0.m174454o()).getTime() - new Date(user.getLastActiveTimeMillis()).getTime();
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
        bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.oj30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                vj30.m201477o(c8266c, act, user, view2);
            }
        });
        i4g0.m138492A("e_nomatch_svip_guide", OMSDialogPositon.p_messages_view, jyb.m147494Y("position", c8266c.f25516a == 14 ? "1" : "2"), jyb.m147494Y("nomatch_guide_type", "see"));
    }

    /* JADX INFO: renamed from: y */
    public void m201487y() {
        this.f184351d = null;
        CoreModule.f18264c.f20384f0.f20645U1.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: z */
    public void m201488z() {
        this.f184350c = null;
        CoreModule.f18264c.f20384f0.f20645U1.m137019l(uxj0.f181467a);
    }
}
